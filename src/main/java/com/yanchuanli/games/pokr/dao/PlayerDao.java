package com.yanchuanli.games.pokr.dao;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.yanchuanli.games.pokr.model.Player;
import com.yanchuanli.games.pokr.util.Config;
import com.yanchuanli.games.pokr.util.MongoDB;
import com.yanchuanli.games.pokr.util.MongoDBFactory;
import com.yanchuanli.games.pokr.util.URLFetchUtil;

/**
 * Copyright Candou.com
 * Author: Yanchuan Li
 * Email: mail@yanchuanli.com
 * Date: 12-6-22
 */
public class PlayerDao {

    private static Map<String, Player> players;
    private static int globalid = 0;

    static {
        players = new HashMap<>();
    }

   /* public static Player getPlayer(String username, int src) {
        switch (src) {
            case Config.SRC_IPHONE_GUEST:
                break;
            case Config.SRC_IPAD_GUEST:
                break;
        }
        if (!players.containsKey(username)) {
            Player player = new Player(username, username);
            player.setMoney(10000);
            players.put(username, player);
        }
        return players.get(username);

    }*/

    /**
     * 从WebServer获取用户信息 
     * 
     * @param udid
     * @param source 来源[0|1|...]
     * @return
     */
	public static Player getPlayer(String udid, String password,
			int source) {
		try {
			String htmlContent = URLFetchUtil.fetch(Config.webServerBase
					+ "login?udid=" + udid + "&password=" + password + "&source="
					+ source);
			if (htmlContent != null && !htmlContent.trim().isEmpty()) {
				String[] msgs = htmlContent.split(",");
				
				Player player = new Player(msgs[0], msgs[1]);
				player.setMoney(Integer.parseInt(msgs[2]));
				player.setExp(Integer.parseInt(msgs[3]));
				player.setWinCount(Integer.parseInt(msgs[4]));
				player.setLoseCount(Integer.parseInt(msgs[5]));
				player.setHistoricalBestHandRank(Integer.parseInt(msgs[6]));
				player.setHistoricalBestHand(msgs[7]);
				player.setMaxWin(Integer.parseInt(msgs[8]));
				player.setCustomAvatar(Integer.parseInt(msgs[9]));
				player.setAvatar(msgs[10]);
				players.put(udid, player);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return players.get(udid);
	}
	
	/**
	 * 更新bestHand以及bestHandRank
	 * 
	 * @param udid 
	 * @param bestHand
	 * @param bestHandRank
	 */
	public static void updateBest(String udid, String bestHand, int bestHandRank) {
		Player player = queryByUdid(udid);
		if (player != null) {
			if (player.getHistoricalBestHandRank() < bestHandRank) {
				DBCollection coll = MongoDBFactory.getCollection(MongoDB.DBNAME,
						MongoDB.COLL_USER);

				DBObject query = new BasicDBObject();
				query.put("udid", udid);

				DBObject doc = new BasicDBObject().append("$set", new BasicDBObject()
						.append("best", bestHand).append("br", bestHandRank));
				coll.update(query, doc);
			}
		}
	}
	
	/**
	 * 更新最大赢取MaxWin
	 * 
	 * @param udid
	 * @param maxWin
	 */
	public static void updateMaxWin(String udid, int maxWin) {
		Player player = queryByUdid(udid);
		if (player != null && (player.getMaxWin() < maxWin)) {
			DBCollection coll = MongoDBFactory.getCollection(MongoDB.DBNAME,
					MongoDB.COLL_USER);

			DBObject query = new BasicDBObject();
			query.put("udid", udid);

			DBObject doc = new BasicDBObject().append("$set",
					new BasicDBObject().append("max", maxWin));
			coll.update(query, doc);
		}
	}
	
	public static Player queryByUdid(String udid) {
		DBCollection coll = MongoDBFactory.getCollection(MongoDB.DBNAME,
                MongoDB.COLL_USER);

		BasicDBObject query = new BasicDBObject();
		query.put("udid", udid);
		DBCursor cur = coll.find(query);

		Player player = null;
		while (cur.hasNext()) {
			DBObject obj = cur.next();
			player = new Player((String) obj.get("udid"), (String) obj.get("name"));
			player.setMoney((Integer) obj.get("money"));
			player.setExp((Integer) obj.get("exp"));
			player.setWinCount((Integer) obj.get("win"));
			player.setLoseCount((Integer) obj.get("lose"));
			player.setHistoricalBestHandRank((Integer) obj.get("br"));
			player.setHistoricalBestHand((String) obj.get("best"));
			player.setMaxWin((Integer) obj.get("max"));
			player.setAvatar((String) obj.get("face"));
			player.setCustomAvatar((Integer) obj.get("customAvatar"));
		}

		return player;
	}

}
