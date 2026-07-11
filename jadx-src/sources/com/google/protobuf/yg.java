package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public interface yg extends pO {

    public interface j extends pO, Cloneable {
        yg build();

        yg buildPartial();

        j clear();

        /* JADX INFO: renamed from: clone */
        j mo187clone();

        @Override // com.google.protobuf.pO
        /* synthetic */ yg getDefaultInstanceForType();

        @Override // com.google.protobuf.pO
        /* synthetic */ boolean isInitialized();

        boolean mergeDelimitedFrom(InputStream inputStream) throws IOException;

        boolean mergeDelimitedFrom(InputStream inputStream, QJ qj) throws IOException;

        j mergeFrom(C c2) throws InvalidProtocolBufferException;

        j mergeFrom(C c2, QJ qj) throws InvalidProtocolBufferException;

        j mergeFrom(AbstractC1923o abstractC1923o) throws IOException;

        j mergeFrom(AbstractC1923o abstractC1923o, QJ qj) throws IOException;

        j mergeFrom(yg ygVar);

        j mergeFrom(InputStream inputStream) throws IOException;

        j mergeFrom(InputStream inputStream, QJ qj) throws IOException;

        j mergeFrom(byte[] bArr) throws InvalidProtocolBufferException;

        j mergeFrom(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException;

        j mergeFrom(byte[] bArr, int i2, int i3, QJ qj) throws InvalidProtocolBufferException;

        j mergeFrom(byte[] bArr, QJ qj) throws InvalidProtocolBufferException;
    }

    @Override // com.google.protobuf.pO
    /* synthetic */ yg getDefaultInstanceForType();

    KH getParserForType();

    int getSerializedSize();

    @Override // com.google.protobuf.pO
    /* synthetic */ boolean isInitialized();

    j newBuilderForType();

    j toBuilder();

    byte[] toByteArray();

    C toByteString();

    void writeDelimitedTo(OutputStream outputStream) throws IOException;

    void writeTo(CodedOutputStream codedOutputStream) throws IOException;

    void writeTo(OutputStream outputStream) throws IOException;
}
