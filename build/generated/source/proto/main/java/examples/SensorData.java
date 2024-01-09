// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SensorReading.proto

package examples;

/**
 * Protobuf type {@code SensorData}
 */
public final class SensorData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SensorData)
    SensorDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SensorData.newBuilder() to construct.
  private SensorData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SensorData() {
    temperature_ = "";
    humidity_ = "";
    pressure_ = "";
    co_ = "";
    no2_ = "";
    so2_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SensorData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SensorData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            temperature_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            humidity_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            pressure_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            co_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            no2_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            so2_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return examples.SensorReading.internal_static_SensorData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return examples.SensorReading.internal_static_SensorData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            examples.SensorData.class, examples.SensorData.Builder.class);
  }

  public static final int TEMPERATURE_FIELD_NUMBER = 1;
  private volatile java.lang.Object temperature_;
  /**
   * <code>string temperature = 1;</code>
   * @return The temperature.
   */
  @java.lang.Override
  public java.lang.String getTemperature() {
    java.lang.Object ref = temperature_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      temperature_ = s;
      return s;
    }
  }
  /**
   * <code>string temperature = 1;</code>
   * @return The bytes for temperature.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTemperatureBytes() {
    java.lang.Object ref = temperature_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      temperature_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HUMIDITY_FIELD_NUMBER = 2;
  private volatile java.lang.Object humidity_;
  /**
   * <code>string humidity = 2;</code>
   * @return The humidity.
   */
  @java.lang.Override
  public java.lang.String getHumidity() {
    java.lang.Object ref = humidity_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      humidity_ = s;
      return s;
    }
  }
  /**
   * <code>string humidity = 2;</code>
   * @return The bytes for humidity.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHumidityBytes() {
    java.lang.Object ref = humidity_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      humidity_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRESSURE_FIELD_NUMBER = 3;
  private volatile java.lang.Object pressure_;
  /**
   * <code>string pressure = 3;</code>
   * @return The pressure.
   */
  @java.lang.Override
  public java.lang.String getPressure() {
    java.lang.Object ref = pressure_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pressure_ = s;
      return s;
    }
  }
  /**
   * <code>string pressure = 3;</code>
   * @return The bytes for pressure.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPressureBytes() {
    java.lang.Object ref = pressure_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pressure_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CO_FIELD_NUMBER = 4;
  private volatile java.lang.Object co_;
  /**
   * <code>string co = 4;</code>
   * @return The co.
   */
  @java.lang.Override
  public java.lang.String getCo() {
    java.lang.Object ref = co_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      co_ = s;
      return s;
    }
  }
  /**
   * <code>string co = 4;</code>
   * @return The bytes for co.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCoBytes() {
    java.lang.Object ref = co_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      co_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NO2_FIELD_NUMBER = 5;
  private volatile java.lang.Object no2_;
  /**
   * <code>string no2 = 5;</code>
   * @return The no2.
   */
  @java.lang.Override
  public java.lang.String getNo2() {
    java.lang.Object ref = no2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      no2_ = s;
      return s;
    }
  }
  /**
   * <code>string no2 = 5;</code>
   * @return The bytes for no2.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNo2Bytes() {
    java.lang.Object ref = no2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      no2_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SO2_FIELD_NUMBER = 6;
  private volatile java.lang.Object so2_;
  /**
   * <code>string so2 = 6;</code>
   * @return The so2.
   */
  @java.lang.Override
  public java.lang.String getSo2() {
    java.lang.Object ref = so2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      so2_ = s;
      return s;
    }
  }
  /**
   * <code>string so2 = 6;</code>
   * @return The bytes for so2.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSo2Bytes() {
    java.lang.Object ref = so2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      so2_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getTemperatureBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, temperature_);
    }
    if (!getHumidityBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, humidity_);
    }
    if (!getPressureBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, pressure_);
    }
    if (!getCoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, co_);
    }
    if (!getNo2Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, no2_);
    }
    if (!getSo2Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, so2_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTemperatureBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, temperature_);
    }
    if (!getHumidityBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, humidity_);
    }
    if (!getPressureBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, pressure_);
    }
    if (!getCoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, co_);
    }
    if (!getNo2Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, no2_);
    }
    if (!getSo2Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, so2_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof examples.SensorData)) {
      return super.equals(obj);
    }
    examples.SensorData other = (examples.SensorData) obj;

    if (!getTemperature()
        .equals(other.getTemperature())) return false;
    if (!getHumidity()
        .equals(other.getHumidity())) return false;
    if (!getPressure()
        .equals(other.getPressure())) return false;
    if (!getCo()
        .equals(other.getCo())) return false;
    if (!getNo2()
        .equals(other.getNo2())) return false;
    if (!getSo2()
        .equals(other.getSo2())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TEMPERATURE_FIELD_NUMBER;
    hash = (53 * hash) + getTemperature().hashCode();
    hash = (37 * hash) + HUMIDITY_FIELD_NUMBER;
    hash = (53 * hash) + getHumidity().hashCode();
    hash = (37 * hash) + PRESSURE_FIELD_NUMBER;
    hash = (53 * hash) + getPressure().hashCode();
    hash = (37 * hash) + CO_FIELD_NUMBER;
    hash = (53 * hash) + getCo().hashCode();
    hash = (37 * hash) + NO2_FIELD_NUMBER;
    hash = (53 * hash) + getNo2().hashCode();
    hash = (37 * hash) + SO2_FIELD_NUMBER;
    hash = (53 * hash) + getSo2().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static examples.SensorData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static examples.SensorData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static examples.SensorData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static examples.SensorData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static examples.SensorData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static examples.SensorData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static examples.SensorData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static examples.SensorData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static examples.SensorData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static examples.SensorData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static examples.SensorData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static examples.SensorData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(examples.SensorData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code SensorData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SensorData)
      examples.SensorDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return examples.SensorReading.internal_static_SensorData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return examples.SensorReading.internal_static_SensorData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              examples.SensorData.class, examples.SensorData.Builder.class);
    }

    // Construct using examples.SensorData.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      temperature_ = "";

      humidity_ = "";

      pressure_ = "";

      co_ = "";

      no2_ = "";

      so2_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return examples.SensorReading.internal_static_SensorData_descriptor;
    }

    @java.lang.Override
    public examples.SensorData getDefaultInstanceForType() {
      return examples.SensorData.getDefaultInstance();
    }

    @java.lang.Override
    public examples.SensorData build() {
      examples.SensorData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public examples.SensorData buildPartial() {
      examples.SensorData result = new examples.SensorData(this);
      result.temperature_ = temperature_;
      result.humidity_ = humidity_;
      result.pressure_ = pressure_;
      result.co_ = co_;
      result.no2_ = no2_;
      result.so2_ = so2_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof examples.SensorData) {
        return mergeFrom((examples.SensorData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(examples.SensorData other) {
      if (other == examples.SensorData.getDefaultInstance()) return this;
      if (!other.getTemperature().isEmpty()) {
        temperature_ = other.temperature_;
        onChanged();
      }
      if (!other.getHumidity().isEmpty()) {
        humidity_ = other.humidity_;
        onChanged();
      }
      if (!other.getPressure().isEmpty()) {
        pressure_ = other.pressure_;
        onChanged();
      }
      if (!other.getCo().isEmpty()) {
        co_ = other.co_;
        onChanged();
      }
      if (!other.getNo2().isEmpty()) {
        no2_ = other.no2_;
        onChanged();
      }
      if (!other.getSo2().isEmpty()) {
        so2_ = other.so2_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      examples.SensorData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (examples.SensorData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object temperature_ = "";
    /**
     * <code>string temperature = 1;</code>
     * @return The temperature.
     */
    public java.lang.String getTemperature() {
      java.lang.Object ref = temperature_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        temperature_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string temperature = 1;</code>
     * @return The bytes for temperature.
     */
    public com.google.protobuf.ByteString
        getTemperatureBytes() {
      java.lang.Object ref = temperature_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        temperature_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string temperature = 1;</code>
     * @param value The temperature to set.
     * @return This builder for chaining.
     */
    public Builder setTemperature(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      temperature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string temperature = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTemperature() {
      
      temperature_ = getDefaultInstance().getTemperature();
      onChanged();
      return this;
    }
    /**
     * <code>string temperature = 1;</code>
     * @param value The bytes for temperature to set.
     * @return This builder for chaining.
     */
    public Builder setTemperatureBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      temperature_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object humidity_ = "";
    /**
     * <code>string humidity = 2;</code>
     * @return The humidity.
     */
    public java.lang.String getHumidity() {
      java.lang.Object ref = humidity_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        humidity_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string humidity = 2;</code>
     * @return The bytes for humidity.
     */
    public com.google.protobuf.ByteString
        getHumidityBytes() {
      java.lang.Object ref = humidity_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        humidity_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string humidity = 2;</code>
     * @param value The humidity to set.
     * @return This builder for chaining.
     */
    public Builder setHumidity(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      humidity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string humidity = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHumidity() {
      
      humidity_ = getDefaultInstance().getHumidity();
      onChanged();
      return this;
    }
    /**
     * <code>string humidity = 2;</code>
     * @param value The bytes for humidity to set.
     * @return This builder for chaining.
     */
    public Builder setHumidityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      humidity_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object pressure_ = "";
    /**
     * <code>string pressure = 3;</code>
     * @return The pressure.
     */
    public java.lang.String getPressure() {
      java.lang.Object ref = pressure_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pressure_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pressure = 3;</code>
     * @return The bytes for pressure.
     */
    public com.google.protobuf.ByteString
        getPressureBytes() {
      java.lang.Object ref = pressure_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pressure_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pressure = 3;</code>
     * @param value The pressure to set.
     * @return This builder for chaining.
     */
    public Builder setPressure(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pressure_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string pressure = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPressure() {
      
      pressure_ = getDefaultInstance().getPressure();
      onChanged();
      return this;
    }
    /**
     * <code>string pressure = 3;</code>
     * @param value The bytes for pressure to set.
     * @return This builder for chaining.
     */
    public Builder setPressureBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pressure_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object co_ = "";
    /**
     * <code>string co = 4;</code>
     * @return The co.
     */
    public java.lang.String getCo() {
      java.lang.Object ref = co_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        co_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string co = 4;</code>
     * @return The bytes for co.
     */
    public com.google.protobuf.ByteString
        getCoBytes() {
      java.lang.Object ref = co_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        co_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string co = 4;</code>
     * @param value The co to set.
     * @return This builder for chaining.
     */
    public Builder setCo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      co_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string co = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCo() {
      
      co_ = getDefaultInstance().getCo();
      onChanged();
      return this;
    }
    /**
     * <code>string co = 4;</code>
     * @param value The bytes for co to set.
     * @return This builder for chaining.
     */
    public Builder setCoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      co_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object no2_ = "";
    /**
     * <code>string no2 = 5;</code>
     * @return The no2.
     */
    public java.lang.String getNo2() {
      java.lang.Object ref = no2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        no2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string no2 = 5;</code>
     * @return The bytes for no2.
     */
    public com.google.protobuf.ByteString
        getNo2Bytes() {
      java.lang.Object ref = no2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        no2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string no2 = 5;</code>
     * @param value The no2 to set.
     * @return This builder for chaining.
     */
    public Builder setNo2(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      no2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string no2 = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearNo2() {
      
      no2_ = getDefaultInstance().getNo2();
      onChanged();
      return this;
    }
    /**
     * <code>string no2 = 5;</code>
     * @param value The bytes for no2 to set.
     * @return This builder for chaining.
     */
    public Builder setNo2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      no2_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object so2_ = "";
    /**
     * <code>string so2 = 6;</code>
     * @return The so2.
     */
    public java.lang.String getSo2() {
      java.lang.Object ref = so2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        so2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string so2 = 6;</code>
     * @return The bytes for so2.
     */
    public com.google.protobuf.ByteString
        getSo2Bytes() {
      java.lang.Object ref = so2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        so2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string so2 = 6;</code>
     * @param value The so2 to set.
     * @return This builder for chaining.
     */
    public Builder setSo2(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      so2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string so2 = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearSo2() {
      
      so2_ = getDefaultInstance().getSo2();
      onChanged();
      return this;
    }
    /**
     * <code>string so2 = 6;</code>
     * @param value The bytes for so2 to set.
     * @return This builder for chaining.
     */
    public Builder setSo2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      so2_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:SensorData)
  }

  // @@protoc_insertion_point(class_scope:SensorData)
  private static final examples.SensorData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new examples.SensorData();
  }

  public static examples.SensorData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SensorData>
      PARSER = new com.google.protobuf.AbstractParser<SensorData>() {
    @java.lang.Override
    public SensorData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SensorData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SensorData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SensorData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public examples.SensorData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
