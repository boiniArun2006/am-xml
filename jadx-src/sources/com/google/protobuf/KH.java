package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface KH {
    Object parseDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    Object parseDelimitedFrom(InputStream inputStream, QJ qj) throws InvalidProtocolBufferException;

    Object parseFrom(C c2) throws InvalidProtocolBufferException;

    Object parseFrom(C c2, QJ qj) throws InvalidProtocolBufferException;

    Object parseFrom(AbstractC1923o abstractC1923o) throws InvalidProtocolBufferException;

    Object parseFrom(AbstractC1923o abstractC1923o, QJ qj) throws InvalidProtocolBufferException;

    Object parseFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    Object parseFrom(InputStream inputStream, QJ qj) throws InvalidProtocolBufferException;

    Object parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException;

    Object parseFrom(ByteBuffer byteBuffer, QJ qj) throws InvalidProtocolBufferException;

    Object parseFrom(byte[] bArr) throws InvalidProtocolBufferException;

    Object parseFrom(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException;

    Object parseFrom(byte[] bArr, int i2, int i3, QJ qj) throws InvalidProtocolBufferException;

    Object parseFrom(byte[] bArr, QJ qj) throws InvalidProtocolBufferException;

    Object parsePartialDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    Object parsePartialDelimitedFrom(InputStream inputStream, QJ qj) throws InvalidProtocolBufferException;

    Object parsePartialFrom(C c2) throws InvalidProtocolBufferException;

    Object parsePartialFrom(C c2, QJ qj) throws InvalidProtocolBufferException;

    Object parsePartialFrom(AbstractC1923o abstractC1923o) throws InvalidProtocolBufferException;

    Object parsePartialFrom(AbstractC1923o abstractC1923o, QJ qj) throws InvalidProtocolBufferException;

    Object parsePartialFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    Object parsePartialFrom(InputStream inputStream, QJ qj) throws InvalidProtocolBufferException;

    Object parsePartialFrom(byte[] bArr) throws InvalidProtocolBufferException;

    Object parsePartialFrom(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException;

    Object parsePartialFrom(byte[] bArr, int i2, int i3, QJ qj) throws InvalidProtocolBufferException;

    Object parsePartialFrom(byte[] bArr, QJ qj) throws InvalidProtocolBufferException;
}
