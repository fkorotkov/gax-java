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
// source: google/api/visibility.proto

package com.google.api;

public interface VisibilityRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.VisibilityRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string selector = 1;</code>
   *
   * <pre>
   * Selects methods, messages, fields, enums, etc. to which this rule applies.
   * Refer to [selector][DocumentationRule.selector] for syntax details.
   * </pre>
   */
  java.lang.String getSelector();
  /**
   * <code>optional string selector = 1;</code>
   *
   * <pre>
   * Selects methods, messages, fields, enums, etc. to which this rule applies.
   * Refer to [selector][DocumentationRule.selector] for syntax details.
   * </pre>
   */
  com.google.protobuf.ByteString
      getSelectorBytes();

  /**
   * <code>optional string restriction = 2;</code>
   *
   * <pre>
   * Lists the visibility labels for this rule. Any of the listed labels grants
   * visibility to the element.
   * If a rule has multiple labels, removing one of the labels but not all of
   * them can break clients.
   * Example:
   *     visibility:
   *       rules:
   *       - selector: google.calendar.Calendar.EnhancedSearch
   *         restriction: GOOGLE_INTERNAL, TRUSTED_TESTER
   * Removing GOOGLE_INTERNAL from this restriction will break clients that
   * rely on this method and only had access to it through GOOGLE_INTERNAL.
   * </pre>
   */
  java.lang.String getRestriction();
  /**
   * <code>optional string restriction = 2;</code>
   *
   * <pre>
   * Lists the visibility labels for this rule. Any of the listed labels grants
   * visibility to the element.
   * If a rule has multiple labels, removing one of the labels but not all of
   * them can break clients.
   * Example:
   *     visibility:
   *       rules:
   *       - selector: google.calendar.Calendar.EnhancedSearch
   *         restriction: GOOGLE_INTERNAL, TRUSTED_TESTER
   * Removing GOOGLE_INTERNAL from this restriction will break clients that
   * rely on this method and only had access to it through GOOGLE_INTERNAL.
   * </pre>
   */
  com.google.protobuf.ByteString
      getRestrictionBytes();

  /**
   * <code>optional .google.protobuf.BoolValue enforce_runtime_visibility = 3;</code>
   *
   * <pre>
   * Controls whether visibility is enforced at runtime for requests to an API
   * method. This setting has meaning only when the selector applies to a method
   * or an API.
   * If true, requests without method visibility will receive a
   * NOT_FOUND error, and any non-visible fields will be scrubbed from
   * the response messages. The default is determined by the value of
   * [google.api.Visibility.enforce_runtime_visibility][].
   * </pre>
   */
  boolean hasEnforceRuntimeVisibility();
  /**
   * <code>optional .google.protobuf.BoolValue enforce_runtime_visibility = 3;</code>
   *
   * <pre>
   * Controls whether visibility is enforced at runtime for requests to an API
   * method. This setting has meaning only when the selector applies to a method
   * or an API.
   * If true, requests without method visibility will receive a
   * NOT_FOUND error, and any non-visible fields will be scrubbed from
   * the response messages. The default is determined by the value of
   * [google.api.Visibility.enforce_runtime_visibility][].
   * </pre>
   */
  com.google.protobuf.BoolValue getEnforceRuntimeVisibility();
  /**
   * <code>optional .google.protobuf.BoolValue enforce_runtime_visibility = 3;</code>
   *
   * <pre>
   * Controls whether visibility is enforced at runtime for requests to an API
   * method. This setting has meaning only when the selector applies to a method
   * or an API.
   * If true, requests without method visibility will receive a
   * NOT_FOUND error, and any non-visible fields will be scrubbed from
   * the response messages. The default is determined by the value of
   * [google.api.Visibility.enforce_runtime_visibility][].
   * </pre>
   */
  com.google.protobuf.BoolValueOrBuilder getEnforceRuntimeVisibilityOrBuilder();
}
