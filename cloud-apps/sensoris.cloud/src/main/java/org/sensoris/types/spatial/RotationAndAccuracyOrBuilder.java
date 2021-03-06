// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/spatial.proto

package org.sensoris.types.spatial;

public interface RotationAndAccuracyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.types.spatial.RotationAndAccuracy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Euler angles yaw, pitch and roll in SENSORIS vehicle coordinate system.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RotationAndAccuracy.Euler euler_vehicle = 1;</code>
   */
  boolean hasEulerVehicle();
  /**
   * <pre>
   * Euler angles yaw, pitch and roll in SENSORIS vehicle coordinate system.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RotationAndAccuracy.Euler euler_vehicle = 1;</code>
   */
  org.sensoris.types.spatial.RotationAndAccuracy.Euler getEulerVehicle();
  /**
   * <pre>
   * Euler angles yaw, pitch and roll in SENSORIS vehicle coordinate system.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RotationAndAccuracy.Euler euler_vehicle = 1;</code>
   */
  org.sensoris.types.spatial.RotationAndAccuracy.EulerOrBuilder getEulerVehicleOrBuilder();

  /**
   * <pre>
   * Euler angles yaw, pitch and roll in relative coordinate system, the reference coordinate system is the origin of the event group.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RotationAndAccuracy.Euler euler_event_group = 2;</code>
   */
  boolean hasEulerEventGroup();
  /**
   * <pre>
   * Euler angles yaw, pitch and roll in relative coordinate system, the reference coordinate system is the origin of the event group.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RotationAndAccuracy.Euler euler_event_group = 2;</code>
   */
  org.sensoris.types.spatial.RotationAndAccuracy.Euler getEulerEventGroup();
  /**
   * <pre>
   * Euler angles yaw, pitch and roll in relative coordinate system, the reference coordinate system is the origin of the event group.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RotationAndAccuracy.Euler euler_event_group = 2;</code>
   */
  org.sensoris.types.spatial.RotationAndAccuracy.EulerOrBuilder getEulerEventGroupOrBuilder();

  /**
   * <pre>
   * Quaternion in SENSORIS vehicle coordinate system.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RotationAndAccuracy.Quaternion quaternion_vehicle = 3;</code>
   */
  boolean hasQuaternionVehicle();
  /**
   * <pre>
   * Quaternion in SENSORIS vehicle coordinate system.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RotationAndAccuracy.Quaternion quaternion_vehicle = 3;</code>
   */
  org.sensoris.types.spatial.RotationAndAccuracy.Quaternion getQuaternionVehicle();
  /**
   * <pre>
   * Quaternion in SENSORIS vehicle coordinate system.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RotationAndAccuracy.Quaternion quaternion_vehicle = 3;</code>
   */
  org.sensoris.types.spatial.RotationAndAccuracy.QuaternionOrBuilder getQuaternionVehicleOrBuilder();

  /**
   * <pre>
   * Quaternion in relative coordinate system, the reference coordinate system is the origin of the event group.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RotationAndAccuracy.Quaternion quaternion_event_group = 4;</code>
   */
  boolean hasQuaternionEventGroup();
  /**
   * <pre>
   * Quaternion in relative coordinate system, the reference coordinate system is the origin of the event group.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RotationAndAccuracy.Quaternion quaternion_event_group = 4;</code>
   */
  org.sensoris.types.spatial.RotationAndAccuracy.Quaternion getQuaternionEventGroup();
  /**
   * <pre>
   * Quaternion in relative coordinate system, the reference coordinate system is the origin of the event group.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RotationAndAccuracy.Quaternion quaternion_event_group = 4;</code>
   */
  org.sensoris.types.spatial.RotationAndAccuracy.QuaternionOrBuilder getQuaternionEventGroupOrBuilder();

  /**
   * <pre>
   * Accuracy as combined standard deviation of yaw, pitch and roll angles.
   * &#64;unit Degree
   * &#64;resolution 0.01
   * &#64;range [0, 360)
   * </pre>
   *
   * <code>.google.protobuf.Int64Value combined_std_dev = 5 [(.sensoris.protobuf.types.base.exponent) = 2];</code>
   */
  boolean hasCombinedStdDev();
  /**
   * <pre>
   * Accuracy as combined standard deviation of yaw, pitch and roll angles.
   * &#64;unit Degree
   * &#64;resolution 0.01
   * &#64;range [0, 360)
   * </pre>
   *
   * <code>.google.protobuf.Int64Value combined_std_dev = 5 [(.sensoris.protobuf.types.base.exponent) = 2];</code>
   */
  com.google.protobuf.Int64Value getCombinedStdDev();
  /**
   * <pre>
   * Accuracy as combined standard deviation of yaw, pitch and roll angles.
   * &#64;unit Degree
   * &#64;resolution 0.01
   * &#64;range [0, 360)
   * </pre>
   *
   * <code>.google.protobuf.Int64Value combined_std_dev = 5 [(.sensoris.protobuf.types.base.exponent) = 2];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCombinedStdDevOrBuilder();

  /**
   * <pre>
   * Accuracy as standard deviation of yaw angle, pitch angle and roll angle.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RotationAndAccuracy.StdDev std_dev = 6;</code>
   */
  boolean hasStdDev();
  /**
   * <pre>
   * Accuracy as standard deviation of yaw angle, pitch angle and roll angle.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RotationAndAccuracy.StdDev std_dev = 6;</code>
   */
  org.sensoris.types.spatial.RotationAndAccuracy.StdDev getStdDev();
  /**
   * <pre>
   * Accuracy as standard deviation of yaw angle, pitch angle and roll angle.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RotationAndAccuracy.StdDev std_dev = 6;</code>
   */
  org.sensoris.types.spatial.RotationAndAccuracy.StdDevOrBuilder getStdDevOrBuilder();

  /**
   * <pre>
   * Accuracy as 3 x 3 covariance matrix of (yaw, yaw), (yaw, pitch), (yaw, roll), (pitch, yaw), (pitch, pitch), (pitch, roll), (roll, yaw), (roll, pitch), (roll, roll) angles.
   * &#64;unit Degree squared
   * &#64;resolution 0.01
   * &#64;range ( , )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64Matrix3x3 covariance = 7 [(.sensoris.protobuf.types.base.exponent) = 2];</code>
   */
  boolean hasCovariance();
  /**
   * <pre>
   * Accuracy as 3 x 3 covariance matrix of (yaw, yaw), (yaw, pitch), (yaw, roll), (pitch, yaw), (pitch, pitch), (pitch, roll), (roll, yaw), (roll, pitch), (roll, roll) angles.
   * &#64;unit Degree squared
   * &#64;resolution 0.01
   * &#64;range ( , )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64Matrix3x3 covariance = 7 [(.sensoris.protobuf.types.base.exponent) = 2];</code>
   */
  org.sensoris.types.base.Int64Matrix3x3 getCovariance();
  /**
   * <pre>
   * Accuracy as 3 x 3 covariance matrix of (yaw, yaw), (yaw, pitch), (yaw, roll), (pitch, yaw), (pitch, pitch), (pitch, roll), (roll, yaw), (roll, pitch), (roll, roll) angles.
   * &#64;unit Degree squared
   * &#64;resolution 0.01
   * &#64;range ( , )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64Matrix3x3 covariance = 7 [(.sensoris.protobuf.types.base.exponent) = 2];</code>
   */
  org.sensoris.types.base.Int64Matrix3x3OrBuilder getCovarianceOrBuilder();

  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getExtensionList();
  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  com.google.protobuf.Any getExtension(int index);
  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  com.google.protobuf.AnyOrBuilder getExtensionOrBuilder(
      int index);

  public org.sensoris.types.spatial.RotationAndAccuracy.EulerQuaternionCase getEulerQuaternionCase();

  public org.sensoris.types.spatial.RotationAndAccuracy.AccuracyCase getAccuracyCase();
}
