// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SensorReading.proto

package examples;

public final class SensorReading {
  private SensorReading() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SensorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SensorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SensorData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SensorData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023SensorReading.proto\"!\n\rSensorRequest\022\020" +
      "\n\010sensorId\030\001 \001(\003\"k\n\nSensorData\022\023\n\013temper" +
      "ature\030\001 \001(\t\022\020\n\010humidity\030\002 \001(\t\022\020\n\010pressur" +
      "e\030\003 \001(\t\022\n\n\002co\030\004 \001(\t\022\013\n\003no2\030\005 \001(\t\022\013\n\003so2\030" +
      "\006 \001(\t2A\n\rSensorService\0220\n\021requestSensorD" +
      "ata\022\016.SensorRequest\032\013.SensorDataB\014\n\010exam" +
      "plesP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SensorRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SensorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SensorRequest_descriptor,
        new java.lang.String[] { "SensorId", });
    internal_static_SensorData_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SensorData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SensorData_descriptor,
        new java.lang.String[] { "Temperature", "Humidity", "Pressure", "Co", "No2", "So2", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
