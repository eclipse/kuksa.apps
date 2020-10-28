// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/base.proto

package org.sensoris.types.base;

/**
 * <pre>
 * Count and confidence.
 * </pre>
 *
 * Protobuf type {@code sensoris.protobuf.types.base.CountAndConfidence}
 */
public  final class CountAndConfidence extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensoris.protobuf.types.base.CountAndConfidence)
    CountAndConfidenceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CountAndConfidence.newBuilder() to construct.
  private CountAndConfidence(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CountAndConfidence() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CountAndConfidence(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (count_ != null) {
              subBuilder = count_.toBuilder();
            }
            count_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(count_);
              count_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            org.sensoris.types.base.Confidence.Builder subBuilder = null;
            if (confidence_ != null) {
              subBuilder = confidence_.toBuilder();
            }
            confidence_ = input.readMessage(org.sensoris.types.base.Confidence.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(confidence_);
              confidence_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_CountAndConfidence_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_CountAndConfidence_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.sensoris.types.base.CountAndConfidence.class, org.sensoris.types.base.CountAndConfidence.Builder.class);
  }

  public static final int COUNT_FIELD_NUMBER = 1;
  private com.google.protobuf.Int64Value count_;
  /**
   * <pre>
   * Count.
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value count = 1;</code>
   */
  public boolean hasCount() {
    return count_ != null;
  }
  /**
   * <pre>
   * Count.
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value count = 1;</code>
   */
  public com.google.protobuf.Int64Value getCount() {
    return count_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : count_;
  }
  /**
   * <pre>
   * Count.
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value count = 1;</code>
   */
  public com.google.protobuf.Int64ValueOrBuilder getCountOrBuilder() {
    return getCount();
  }

  public static final int CONFIDENCE_FIELD_NUMBER = 2;
  private org.sensoris.types.base.Confidence confidence_;
  /**
   * <pre>
   * Confidence of count.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
   */
  public boolean hasConfidence() {
    return confidence_ != null;
  }
  /**
   * <pre>
   * Confidence of count.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
   */
  public org.sensoris.types.base.Confidence getConfidence() {
    return confidence_ == null ? org.sensoris.types.base.Confidence.getDefaultInstance() : confidence_;
  }
  /**
   * <pre>
   * Confidence of count.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
   */
  public org.sensoris.types.base.ConfidenceOrBuilder getConfidenceOrBuilder() {
    return getConfidence();
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
    if (count_ != null) {
      output.writeMessage(1, getCount());
    }
    if (confidence_ != null) {
      output.writeMessage(2, getConfidence());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (count_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCount());
    }
    if (confidence_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getConfidence());
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
    if (!(obj instanceof org.sensoris.types.base.CountAndConfidence)) {
      return super.equals(obj);
    }
    org.sensoris.types.base.CountAndConfidence other = (org.sensoris.types.base.CountAndConfidence) obj;

    boolean result = true;
    result = result && (hasCount() == other.hasCount());
    if (hasCount()) {
      result = result && getCount()
          .equals(other.getCount());
    }
    result = result && (hasConfidence() == other.hasConfidence());
    if (hasConfidence()) {
      result = result && getConfidence()
          .equals(other.getConfidence());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCount()) {
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCount().hashCode();
    }
    if (hasConfidence()) {
      hash = (37 * hash) + CONFIDENCE_FIELD_NUMBER;
      hash = (53 * hash) + getConfidence().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.sensoris.types.base.CountAndConfidence parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.CountAndConfidence parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.CountAndConfidence parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.CountAndConfidence parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.CountAndConfidence parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.CountAndConfidence parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.CountAndConfidence parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.types.base.CountAndConfidence parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.types.base.CountAndConfidence parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.sensoris.types.base.CountAndConfidence parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.types.base.CountAndConfidence parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.types.base.CountAndConfidence parseFrom(
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
  public static Builder newBuilder(org.sensoris.types.base.CountAndConfidence prototype) {
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
   * <pre>
   * Count and confidence.
   * </pre>
   *
   * Protobuf type {@code sensoris.protobuf.types.base.CountAndConfidence}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensoris.protobuf.types.base.CountAndConfidence)
      org.sensoris.types.base.CountAndConfidenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_CountAndConfidence_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_CountAndConfidence_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sensoris.types.base.CountAndConfidence.class, org.sensoris.types.base.CountAndConfidence.Builder.class);
    }

    // Construct using org.sensoris.types.base.CountAndConfidence.newBuilder()
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
      if (countBuilder_ == null) {
        count_ = null;
      } else {
        count_ = null;
        countBuilder_ = null;
      }
      if (confidenceBuilder_ == null) {
        confidence_ = null;
      } else {
        confidence_ = null;
        confidenceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_CountAndConfidence_descriptor;
    }

    @java.lang.Override
    public org.sensoris.types.base.CountAndConfidence getDefaultInstanceForType() {
      return org.sensoris.types.base.CountAndConfidence.getDefaultInstance();
    }

    @java.lang.Override
    public org.sensoris.types.base.CountAndConfidence build() {
      org.sensoris.types.base.CountAndConfidence result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.sensoris.types.base.CountAndConfidence buildPartial() {
      org.sensoris.types.base.CountAndConfidence result = new org.sensoris.types.base.CountAndConfidence(this);
      if (countBuilder_ == null) {
        result.count_ = count_;
      } else {
        result.count_ = countBuilder_.build();
      }
      if (confidenceBuilder_ == null) {
        result.confidence_ = confidence_;
      } else {
        result.confidence_ = confidenceBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.sensoris.types.base.CountAndConfidence) {
        return mergeFrom((org.sensoris.types.base.CountAndConfidence)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.sensoris.types.base.CountAndConfidence other) {
      if (other == org.sensoris.types.base.CountAndConfidence.getDefaultInstance()) return this;
      if (other.hasCount()) {
        mergeCount(other.getCount());
      }
      if (other.hasConfidence()) {
        mergeConfidence(other.getConfidence());
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
      org.sensoris.types.base.CountAndConfidence parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.sensoris.types.base.CountAndConfidence) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Int64Value count_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> countBuilder_;
    /**
     * <pre>
     * Count.
     * &#64;unit 1
     * &#64;resolution 1
     * &#64;range [1, )
     * </pre>
     *
     * <code>.google.protobuf.Int64Value count = 1;</code>
     */
    public boolean hasCount() {
      return countBuilder_ != null || count_ != null;
    }
    /**
     * <pre>
     * Count.
     * &#64;unit 1
     * &#64;resolution 1
     * &#64;range [1, )
     * </pre>
     *
     * <code>.google.protobuf.Int64Value count = 1;</code>
     */
    public com.google.protobuf.Int64Value getCount() {
      if (countBuilder_ == null) {
        return count_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : count_;
      } else {
        return countBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Count.
     * &#64;unit 1
     * &#64;resolution 1
     * &#64;range [1, )
     * </pre>
     *
     * <code>.google.protobuf.Int64Value count = 1;</code>
     */
    public Builder setCount(com.google.protobuf.Int64Value value) {
      if (countBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        count_ = value;
        onChanged();
      } else {
        countBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Count.
     * &#64;unit 1
     * &#64;resolution 1
     * &#64;range [1, )
     * </pre>
     *
     * <code>.google.protobuf.Int64Value count = 1;</code>
     */
    public Builder setCount(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (countBuilder_ == null) {
        count_ = builderForValue.build();
        onChanged();
      } else {
        countBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Count.
     * &#64;unit 1
     * &#64;resolution 1
     * &#64;range [1, )
     * </pre>
     *
     * <code>.google.protobuf.Int64Value count = 1;</code>
     */
    public Builder mergeCount(com.google.protobuf.Int64Value value) {
      if (countBuilder_ == null) {
        if (count_ != null) {
          count_ =
            com.google.protobuf.Int64Value.newBuilder(count_).mergeFrom(value).buildPartial();
        } else {
          count_ = value;
        }
        onChanged();
      } else {
        countBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Count.
     * &#64;unit 1
     * &#64;resolution 1
     * &#64;range [1, )
     * </pre>
     *
     * <code>.google.protobuf.Int64Value count = 1;</code>
     */
    public Builder clearCount() {
      if (countBuilder_ == null) {
        count_ = null;
        onChanged();
      } else {
        count_ = null;
        countBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Count.
     * &#64;unit 1
     * &#64;resolution 1
     * &#64;range [1, )
     * </pre>
     *
     * <code>.google.protobuf.Int64Value count = 1;</code>
     */
    public com.google.protobuf.Int64Value.Builder getCountBuilder() {
      
      onChanged();
      return getCountFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Count.
     * &#64;unit 1
     * &#64;resolution 1
     * &#64;range [1, )
     * </pre>
     *
     * <code>.google.protobuf.Int64Value count = 1;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getCountOrBuilder() {
      if (countBuilder_ != null) {
        return countBuilder_.getMessageOrBuilder();
      } else {
        return count_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : count_;
      }
    }
    /**
     * <pre>
     * Count.
     * &#64;unit 1
     * &#64;resolution 1
     * &#64;range [1, )
     * </pre>
     *
     * <code>.google.protobuf.Int64Value count = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getCountFieldBuilder() {
      if (countBuilder_ == null) {
        countBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getCount(),
                getParentForChildren(),
                isClean());
        count_ = null;
      }
      return countBuilder_;
    }

    private org.sensoris.types.base.Confidence confidence_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.Confidence, org.sensoris.types.base.Confidence.Builder, org.sensoris.types.base.ConfidenceOrBuilder> confidenceBuilder_;
    /**
     * <pre>
     * Confidence of count.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
     */
    public boolean hasConfidence() {
      return confidenceBuilder_ != null || confidence_ != null;
    }
    /**
     * <pre>
     * Confidence of count.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
     */
    public org.sensoris.types.base.Confidence getConfidence() {
      if (confidenceBuilder_ == null) {
        return confidence_ == null ? org.sensoris.types.base.Confidence.getDefaultInstance() : confidence_;
      } else {
        return confidenceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Confidence of count.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
     */
    public Builder setConfidence(org.sensoris.types.base.Confidence value) {
      if (confidenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        confidence_ = value;
        onChanged();
      } else {
        confidenceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Confidence of count.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
     */
    public Builder setConfidence(
        org.sensoris.types.base.Confidence.Builder builderForValue) {
      if (confidenceBuilder_ == null) {
        confidence_ = builderForValue.build();
        onChanged();
      } else {
        confidenceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Confidence of count.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
     */
    public Builder mergeConfidence(org.sensoris.types.base.Confidence value) {
      if (confidenceBuilder_ == null) {
        if (confidence_ != null) {
          confidence_ =
            org.sensoris.types.base.Confidence.newBuilder(confidence_).mergeFrom(value).buildPartial();
        } else {
          confidence_ = value;
        }
        onChanged();
      } else {
        confidenceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Confidence of count.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
     */
    public Builder clearConfidence() {
      if (confidenceBuilder_ == null) {
        confidence_ = null;
        onChanged();
      } else {
        confidence_ = null;
        confidenceBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Confidence of count.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
     */
    public org.sensoris.types.base.Confidence.Builder getConfidenceBuilder() {
      
      onChanged();
      return getConfidenceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Confidence of count.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
     */
    public org.sensoris.types.base.ConfidenceOrBuilder getConfidenceOrBuilder() {
      if (confidenceBuilder_ != null) {
        return confidenceBuilder_.getMessageOrBuilder();
      } else {
        return confidence_ == null ?
            org.sensoris.types.base.Confidence.getDefaultInstance() : confidence_;
      }
    }
    /**
     * <pre>
     * Confidence of count.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.Confidence, org.sensoris.types.base.Confidence.Builder, org.sensoris.types.base.ConfidenceOrBuilder> 
        getConfidenceFieldBuilder() {
      if (confidenceBuilder_ == null) {
        confidenceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.sensoris.types.base.Confidence, org.sensoris.types.base.Confidence.Builder, org.sensoris.types.base.ConfidenceOrBuilder>(
                getConfidence(),
                getParentForChildren(),
                isClean());
        confidence_ = null;
      }
      return confidenceBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:sensoris.protobuf.types.base.CountAndConfidence)
  }

  // @@protoc_insertion_point(class_scope:sensoris.protobuf.types.base.CountAndConfidence)
  private static final org.sensoris.types.base.CountAndConfidence DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.sensoris.types.base.CountAndConfidence();
  }

  public static org.sensoris.types.base.CountAndConfidence getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CountAndConfidence>
      PARSER = new com.google.protobuf.AbstractParser<CountAndConfidence>() {
    @java.lang.Override
    public CountAndConfidence parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CountAndConfidence(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CountAndConfidence> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CountAndConfidence> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.sensoris.types.base.CountAndConfidence getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
