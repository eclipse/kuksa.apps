// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/base.proto

package org.sensoris.types.base;

public interface Int64StatisticMeasureAndAccuracyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.types.base.Int64StatisticMeasureAndAccuracy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Timestamp interval.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
   */
  boolean hasTimestampInterval();
  /**
   * <pre>
   * Timestamp interval.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
   */
  org.sensoris.types.base.TimestampInterval getTimestampInterval();
  /**
   * <pre>
   * Timestamp interval.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
   */
  org.sensoris.types.base.TimestampIntervalOrBuilder getTimestampIntervalOrBuilder();

  /**
   * <pre>
   * Type.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.StatisticMeasureType type = 2;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * Type.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.StatisticMeasureType type = 2;</code>
   */
  org.sensoris.types.base.StatisticMeasureType getType();

  /**
   * <pre>
   * Value.
   * </pre>
   *
   * <code>int64 value = 3;</code>
   */
  long getValue();

  /**
   * <pre>
   * Accuracy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value accuracy = 4;</code>
   */
  boolean hasAccuracy();
  /**
   * <pre>
   * Accuracy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value accuracy = 4;</code>
   */
  com.google.protobuf.Int64Value getAccuracy();
  /**
   * <pre>
   * Accuracy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value accuracy = 4;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getAccuracyOrBuilder();
}