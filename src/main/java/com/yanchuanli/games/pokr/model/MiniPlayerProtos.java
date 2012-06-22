// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mini_player.proto

package com.yanchuanli.games.pokr.model;

public final class MiniPlayerProtos {
  private MiniPlayerProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MiniPlayerOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string id = 1;
    boolean hasId();
    String getId();
    
    // required string name = 2;
    boolean hasName();
    String getName();
    
    // required int32 money = 3;
    boolean hasMoney();
    int getMoney();
    
    // required int32 bet = 4;
    boolean hasBet();
    int getBet();
    
    // optional string input = 5;
    boolean hasInput();
    String getInput();
  }
  public static final class MiniPlayer extends
      com.google.protobuf.GeneratedMessage
      implements MiniPlayerOrBuilder {
    // Use MiniPlayer.newBuilder() to construct.
    private MiniPlayer(Builder builder) {
      super(builder);
    }
    private MiniPlayer(boolean noInit) {}
    
    private static final MiniPlayer defaultInstance;
    public static MiniPlayer getDefaultInstance() {
      return defaultInstance;
    }
    
    public MiniPlayer getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.yanchuanli.games.pokr.model.MiniPlayerProtos.internal_static_com_yanchuanli_games_pokr_model_MiniPlayer_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.yanchuanli.games.pokr.model.MiniPlayerProtos.internal_static_com_yanchuanli_games_pokr_model_MiniPlayer_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private java.lang.Object id_;
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          id_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required string name = 2;
    public static final int NAME_FIELD_NUMBER = 2;
    private java.lang.Object name_;
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          name_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required int32 money = 3;
    public static final int MONEY_FIELD_NUMBER = 3;
    private int money_;
    public boolean hasMoney() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getMoney() {
      return money_;
    }
    
    // required int32 bet = 4;
    public static final int BET_FIELD_NUMBER = 4;
    private int bet_;
    public boolean hasBet() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getBet() {
      return bet_;
    }
    
    // optional string input = 5;
    public static final int INPUT_FIELD_NUMBER = 5;
    private java.lang.Object input_;
    public boolean hasInput() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public String getInput() {
      java.lang.Object ref = input_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          input_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getInputBytes() {
      java.lang.Object ref = input_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        input_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      id_ = "";
      name_ = "";
      money_ = 0;
      bet_ = 0;
      input_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMoney()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasBet()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, money_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, bet_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getInputBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, money_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, bet_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getInputBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.yanchuanli.games.pokr.model.MiniPlayerProtos.internal_static_com_yanchuanli_games_pokr_model_MiniPlayer_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.yanchuanli.games.pokr.model.MiniPlayerProtos.internal_static_com_yanchuanli_games_pokr_model_MiniPlayer_fieldAccessorTable;
      }
      
      // Construct using com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        id_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        money_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        bet_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        input_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer.getDescriptor();
      }
      
      public com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer getDefaultInstanceForType() {
        return com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer.getDefaultInstance();
      }
      
      public com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer build() {
        com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer buildPartial() {
        com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer result = new com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.money_ = money_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.bet_ = bet_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.input_ = input_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer) {
          return mergeFrom((com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer other) {
        if (other == com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasName()) {
          setName(other.getName());
        }
        if (other.hasMoney()) {
          setMoney(other.getMoney());
        }
        if (other.hasBet()) {
          setBet(other.getBet());
        }
        if (other.hasInput()) {
          setInput(other.getInput());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasId()) {
          
          return false;
        }
        if (!hasName()) {
          
          return false;
        }
        if (!hasMoney()) {
          
          return false;
        }
        if (!hasBet()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              id_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              name_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              money_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              bet_ = input.readInt32();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              input_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string id = 1;
      private java.lang.Object id_ = "";
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          id_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }
      void setId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
      }
      
      // required string name = 2;
      private java.lang.Object name_ = "";
      public boolean hasName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      void setName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
      }
      
      // required int32 money = 3;
      private int money_ ;
      public boolean hasMoney() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getMoney() {
        return money_;
      }
      public Builder setMoney(int value) {
        bitField0_ |= 0x00000004;
        money_ = value;
        onChanged();
        return this;
      }
      public Builder clearMoney() {
        bitField0_ = (bitField0_ & ~0x00000004);
        money_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 bet = 4;
      private int bet_ ;
      public boolean hasBet() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getBet() {
        return bet_;
      }
      public Builder setBet(int value) {
        bitField0_ |= 0x00000008;
        bet_ = value;
        onChanged();
        return this;
      }
      public Builder clearBet() {
        bitField0_ = (bitField0_ & ~0x00000008);
        bet_ = 0;
        onChanged();
        return this;
      }
      
      // optional string input = 5;
      private java.lang.Object input_ = "";
      public boolean hasInput() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public String getInput() {
        java.lang.Object ref = input_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          input_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setInput(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        input_ = value;
        onChanged();
        return this;
      }
      public Builder clearInput() {
        bitField0_ = (bitField0_ & ~0x00000010);
        input_ = getDefaultInstance().getInput();
        onChanged();
        return this;
      }
      void setInput(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000010;
        input_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.yanchuanli.games.pokr.model.MiniPlayer)
    }
    
    static {
      defaultInstance = new MiniPlayer(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.yanchuanli.games.pokr.model.MiniPlayer)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_yanchuanli_games_pokr_model_MiniPlayer_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_yanchuanli_games_pokr_model_MiniPlayer_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021mini_player.proto\022\037com.yanchuanli.game" +
      "s.pokr.model\"Q\n\nMiniPlayer\022\n\n\002id\030\001 \002(\t\022\014" +
      "\n\004name\030\002 \002(\t\022\r\n\005money\030\003 \002(\005\022\013\n\003bet\030\004 \002(\005" +
      "\022\r\n\005input\030\005 \001(\tB3\n\037com.yanchuanli.games." +
      "pokr.modelB\020MiniPlayerProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_yanchuanli_games_pokr_model_MiniPlayer_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_yanchuanli_games_pokr_model_MiniPlayer_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_yanchuanli_games_pokr_model_MiniPlayer_descriptor,
              new java.lang.String[] { "Id", "Name", "Money", "Bet", "Input", },
              com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer.class,
              com.yanchuanli.games.pokr.model.MiniPlayerProtos.MiniPlayer.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}