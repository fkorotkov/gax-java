/*
 * Copyright 2015, Google Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *     * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following disclaimer
 * in the documentation and/or other materials provided with the
 * distribution.
 *     * Neither the name of Google Inc. nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/usage.proto

package com.google.api;

public final class UsageProto {
  private UsageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Usage_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_Usage_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_UsageRule_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_UsageRule_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026google/api/usage.proto\022\ngoogle.api\"\240\002\n" +
      "\005Usage\0227\n\016service_access\030\004 \001(\0162\037.google." +
      "api.Usage.ServiceAccess\022\024\n\014requirements\030" +
      "\001 \003(\t\022\033\n\023depends_on_services\030\002 \003(\t\022\030\n\020ac" +
      "tivation_hooks\030\003 \003(\t\022\032\n\022deactivation_hoo" +
      "ks\030\005 \003(\t\022$\n\005rules\030\006 \003(\0132\025.google.api.Usa" +
      "geRule\"O\n\rServiceAccess\022\016\n\nRESTRICTED\020\000\022" +
      "\n\n\006PUBLIC\020\001\022\022\n\016ORG_RESTRICTED\020\002\022\016\n\nORG_P" +
      "UBLIC\020\003\"?\n\tUsageRule\022\020\n\010selector\030\001 \001(\t\022 " +
      "\n\030allow_unregistered_calls\030\002 \001(\010B\036\n\016com.",
      "google.apiB\nUsageProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_google_api_Usage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Usage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_Usage_descriptor,
        new java.lang.String[] { "ServiceAccess", "Requirements", "DependsOnServices", "ActivationHooks", "DeactivationHooks", "Rules", });
    internal_static_google_api_UsageRule_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_UsageRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_UsageRule_descriptor,
        new java.lang.String[] { "Selector", "AllowUnregisteredCalls", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
