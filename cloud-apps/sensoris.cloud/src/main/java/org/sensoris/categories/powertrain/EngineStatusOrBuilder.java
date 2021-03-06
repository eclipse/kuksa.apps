// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/powertrain.proto

package org.sensoris.categories.powertrain;

public interface EngineStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.powertrain.EngineStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Event envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
   */
  boolean hasEnvelope();
  /**
   * <pre>
   * Event envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
   */
  org.sensoris.types.base.EventEnvelope getEnvelope();
  /**
   * <pre>
   * Event envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
   */
  org.sensoris.types.base.EventEnvelopeOrBuilder getEnvelopeOrBuilder();

  /**
   * <pre>
   * Ingnition status.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.powertrain.EngineStatus.IgnitionStatus ignition_status = 2;</code>
   */
  int getIgnitionStatusValue();
  /**
   * <pre>
   * Ingnition status.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.powertrain.EngineStatus.IgnitionStatus ignition_status = 2;</code>
   */
  org.sensoris.categories.powertrain.EngineStatus.IgnitionStatus getIgnitionStatus();

  /**
   * <pre>
   * Powertrain status.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.powertrain.EngineStatus.PowertrainStatus powertrain_status = 3;</code>
   */
  int getPowertrainStatusValue();
  /**
   * <pre>
   * Powertrain status.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.powertrain.EngineStatus.PowertrainStatus powertrain_status = 3;</code>
   */
  org.sensoris.categories.powertrain.EngineStatus.PowertrainStatus getPowertrainStatus();
}
