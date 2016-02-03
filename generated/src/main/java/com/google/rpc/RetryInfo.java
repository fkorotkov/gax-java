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
// source: google/rpc/error_details.proto

package com.google.rpc;

/**
 * Protobuf type {@code google.rpc.RetryInfo}
 *
 * <pre>
 * Describes when the clients can retry a failed request. Clients could ignore
 * the recommendation here or retry when this information is missing from error
 * responses.
 * It's always recommended that clients should use exponential backoff when
 * retrying.
 * Clients should wait until `retry_delay` amount of time has passed since
 * receiving the error response before retrying.  If retrying requests also
 * fail, clients should use an exponential backoff scheme to gradually increase
 * the delay between retries based on `retry_delay`, until either a maximum
 * number of retires have been reached or a maximum retry delay cap has been
 * reached.
 * </pre>
 */
public  final class RetryInfo extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.rpc.RetryInfo)
    RetryInfoOrBuilder {
  // Use RetryInfo.newBuilder() to construct.
  private RetryInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private RetryInfo() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RetryInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.Duration.Builder subBuilder = null;
            if (retryDelay_ != null) {
              subBuilder = retryDelay_.toBuilder();
            }
            retryDelay_ = input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(retryDelay_);
              retryDelay_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_RetryInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_RetryInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.rpc.RetryInfo.class, com.google.rpc.RetryInfo.Builder.class);
  }

  public static final int RETRY_DELAY_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration retryDelay_;
  /**
   * <code>optional .google.protobuf.Duration retry_delay = 1;</code>
   *
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   */
  public boolean hasRetryDelay() {
    return retryDelay_ != null;
  }
  /**
   * <code>optional .google.protobuf.Duration retry_delay = 1;</code>
   *
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   */
  public com.google.protobuf.Duration getRetryDelay() {
    return retryDelay_ == null ? com.google.protobuf.Duration.getDefaultInstance() : retryDelay_;
  }
  /**
   * <code>optional .google.protobuf.Duration retry_delay = 1;</code>
   *
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   */
  public com.google.protobuf.DurationOrBuilder getRetryDelayOrBuilder() {
    return getRetryDelay();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (retryDelay_ != null) {
      output.writeMessage(1, getRetryDelay());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (retryDelay_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRetryDelay());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.rpc.RetryInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.rpc.RetryInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.rpc.RetryInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.rpc.RetryInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.rpc.RetryInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.rpc.RetryInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.rpc.RetryInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.rpc.RetryInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.rpc.RetryInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.rpc.RetryInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.rpc.RetryInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.rpc.RetryInfo}
   *
   * <pre>
   * Describes when the clients can retry a failed request. Clients could ignore
   * the recommendation here or retry when this information is missing from error
   * responses.
   * It's always recommended that clients should use exponential backoff when
   * retrying.
   * Clients should wait until `retry_delay` amount of time has passed since
   * receiving the error response before retrying.  If retrying requests also
   * fail, clients should use an exponential backoff scheme to gradually increase
   * the delay between retries based on `retry_delay`, until either a maximum
   * number of retires have been reached or a maximum retry delay cap has been
   * reached.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.rpc.RetryInfo)
      com.google.rpc.RetryInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_RetryInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_RetryInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.rpc.RetryInfo.class, com.google.rpc.RetryInfo.Builder.class);
    }

    // Construct using com.google.rpc.RetryInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (retryDelayBuilder_ == null) {
        retryDelay_ = null;
      } else {
        retryDelay_ = null;
        retryDelayBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_RetryInfo_descriptor;
    }

    public com.google.rpc.RetryInfo getDefaultInstanceForType() {
      return com.google.rpc.RetryInfo.getDefaultInstance();
    }

    public com.google.rpc.RetryInfo build() {
      com.google.rpc.RetryInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.rpc.RetryInfo buildPartial() {
      com.google.rpc.RetryInfo result = new com.google.rpc.RetryInfo(this);
      if (retryDelayBuilder_ == null) {
        result.retryDelay_ = retryDelay_;
      } else {
        result.retryDelay_ = retryDelayBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.rpc.RetryInfo) {
        return mergeFrom((com.google.rpc.RetryInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.rpc.RetryInfo other) {
      if (other == com.google.rpc.RetryInfo.getDefaultInstance()) return this;
      if (other.hasRetryDelay()) {
        mergeRetryDelay(other.getRetryDelay());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.rpc.RetryInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.rpc.RetryInfo) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Duration retryDelay_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> retryDelayBuilder_;
    /**
     * <code>optional .google.protobuf.Duration retry_delay = 1;</code>
     *
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     */
    public boolean hasRetryDelay() {
      return retryDelayBuilder_ != null || retryDelay_ != null;
    }
    /**
     * <code>optional .google.protobuf.Duration retry_delay = 1;</code>
     *
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     */
    public com.google.protobuf.Duration getRetryDelay() {
      if (retryDelayBuilder_ == null) {
        return retryDelay_ == null ? com.google.protobuf.Duration.getDefaultInstance() : retryDelay_;
      } else {
        return retryDelayBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.protobuf.Duration retry_delay = 1;</code>
     *
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     */
    public Builder setRetryDelay(com.google.protobuf.Duration value) {
      if (retryDelayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        retryDelay_ = value;
        onChanged();
      } else {
        retryDelayBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.Duration retry_delay = 1;</code>
     *
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     */
    public Builder setRetryDelay(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (retryDelayBuilder_ == null) {
        retryDelay_ = builderForValue.build();
        onChanged();
      } else {
        retryDelayBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.Duration retry_delay = 1;</code>
     *
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     */
    public Builder mergeRetryDelay(com.google.protobuf.Duration value) {
      if (retryDelayBuilder_ == null) {
        if (retryDelay_ != null) {
          retryDelay_ =
            com.google.protobuf.Duration.newBuilder(retryDelay_).mergeFrom(value).buildPartial();
        } else {
          retryDelay_ = value;
        }
        onChanged();
      } else {
        retryDelayBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.Duration retry_delay = 1;</code>
     *
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     */
    public Builder clearRetryDelay() {
      if (retryDelayBuilder_ == null) {
        retryDelay_ = null;
        onChanged();
      } else {
        retryDelay_ = null;
        retryDelayBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.Duration retry_delay = 1;</code>
     *
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     */
    public com.google.protobuf.Duration.Builder getRetryDelayBuilder() {
      
      onChanged();
      return getRetryDelayFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.protobuf.Duration retry_delay = 1;</code>
     *
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     */
    public com.google.protobuf.DurationOrBuilder getRetryDelayOrBuilder() {
      if (retryDelayBuilder_ != null) {
        return retryDelayBuilder_.getMessageOrBuilder();
      } else {
        return retryDelay_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : retryDelay_;
      }
    }
    /**
     * <code>optional .google.protobuf.Duration retry_delay = 1;</code>
     *
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getRetryDelayFieldBuilder() {
      if (retryDelayBuilder_ == null) {
        retryDelayBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getRetryDelay(),
                getParentForChildren(),
                isClean());
        retryDelay_ = null;
      }
      return retryDelayBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.rpc.RetryInfo)
  }

  // @@protoc_insertion_point(class_scope:google.rpc.RetryInfo)
  private static final com.google.rpc.RetryInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.rpc.RetryInfo();
  }

  public static com.google.rpc.RetryInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RetryInfo>
      PARSER = new com.google.protobuf.AbstractParser<RetryInfo>() {
    public RetryInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new RetryInfo(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<RetryInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RetryInfo> getParserForType() {
    return PARSER;
  }

  public com.google.rpc.RetryInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

