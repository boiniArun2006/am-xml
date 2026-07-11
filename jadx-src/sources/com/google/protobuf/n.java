package com.google.protobuf;

import com.google.protobuf.j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class n implements KH {
    private static final QJ EMPTY_REGISTRY = QJ.getEmptyRegistry();

    @Override // com.google.protobuf.KH
    public abstract /* synthetic */ Object parsePartialFrom(AbstractC1923o abstractC1923o, QJ qj) throws InvalidProtocolBufferException;

    private yg checkMessageInitialized(yg ygVar) throws InvalidProtocolBufferException {
        if (ygVar == null || ygVar.isInitialized()) {
            return ygVar;
        }
        throw newUninitializedMessageException(ygVar).asInvalidProtocolBufferException().setUnfinishedMessage(ygVar);
    }

    private UninitializedMessageException newUninitializedMessageException(yg ygVar) {
        return ygVar instanceof j ? ((j) ygVar).newUninitializedMessageException() : new UninitializedMessageException(ygVar);
    }

    @Override // com.google.protobuf.KH
    public yg parseDelimitedFrom(InputStream inputStream, QJ qj) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialDelimitedFrom(inputStream, qj));
    }

    @Override // com.google.protobuf.KH
    public yg parsePartialDelimitedFrom(InputStream inputStream, QJ qj) throws InvalidProtocolBufferException {
        try {
            int i2 = inputStream.read();
            if (i2 == -1) {
                return null;
            }
            return parsePartialFrom((InputStream) new j.AbstractC0822j.C0823j(inputStream, AbstractC1923o.readRawVarint32(i2, inputStream)), qj);
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2);
        }
    }

    @Override // com.google.protobuf.KH
    public yg parseDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.KH
    public yg parsePartialDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.KH
    public yg parsePartialFrom(AbstractC1923o abstractC1923o) throws InvalidProtocolBufferException {
        return (yg) parsePartialFrom(abstractC1923o, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.KH
    public yg parsePartialFrom(C c2, QJ qj) throws InvalidProtocolBufferException {
        AbstractC1923o abstractC1923oNewCodedInput = c2.newCodedInput();
        yg ygVar = (yg) parsePartialFrom(abstractC1923oNewCodedInput, qj);
        try {
            abstractC1923oNewCodedInput.checkLastTagWas(0);
            return ygVar;
        } catch (InvalidProtocolBufferException e2) {
            throw e2.setUnfinishedMessage(ygVar);
        }
    }

    @Override // com.google.protobuf.KH
    public yg parseFrom(AbstractC1923o abstractC1923o, QJ qj) throws InvalidProtocolBufferException {
        return checkMessageInitialized((yg) parsePartialFrom(abstractC1923o, qj));
    }

    @Override // com.google.protobuf.KH
    public yg parseFrom(AbstractC1923o abstractC1923o) throws InvalidProtocolBufferException {
        return parseFrom(abstractC1923o, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.KH
    public yg parseFrom(C c2, QJ qj) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(c2, qj));
    }

    @Override // com.google.protobuf.KH
    public yg parsePartialFrom(C c2) throws InvalidProtocolBufferException {
        return parsePartialFrom(c2, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.KH
    public yg parseFrom(C c2) throws InvalidProtocolBufferException {
        return parseFrom(c2, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.KH
    public yg parsePartialFrom(byte[] bArr, int i2, int i3, QJ qj) throws InvalidProtocolBufferException {
        AbstractC1923o abstractC1923oNewInstance = AbstractC1923o.newInstance(bArr, i2, i3);
        yg ygVar = (yg) parsePartialFrom(abstractC1923oNewInstance, qj);
        try {
            abstractC1923oNewInstance.checkLastTagWas(0);
            return ygVar;
        } catch (InvalidProtocolBufferException e2) {
            throw e2.setUnfinishedMessage(ygVar);
        }
    }

    @Override // com.google.protobuf.KH
    public yg parseFrom(ByteBuffer byteBuffer, QJ qj) throws InvalidProtocolBufferException {
        AbstractC1923o abstractC1923oNewInstance = AbstractC1923o.newInstance(byteBuffer);
        yg ygVar = (yg) parsePartialFrom(abstractC1923oNewInstance, qj);
        try {
            abstractC1923oNewInstance.checkLastTagWas(0);
            return checkMessageInitialized(ygVar);
        } catch (InvalidProtocolBufferException e2) {
            throw e2.setUnfinishedMessage(ygVar);
        }
    }

    @Override // com.google.protobuf.KH
    public yg parsePartialFrom(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
        return parsePartialFrom(bArr, i2, i3, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.KH
    public yg parsePartialFrom(byte[] bArr, QJ qj) throws InvalidProtocolBufferException {
        return parsePartialFrom(bArr, 0, bArr.length, qj);
    }

    @Override // com.google.protobuf.KH
    public yg parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.KH
    public yg parsePartialFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.KH
    public yg parseFrom(byte[] bArr, int i2, int i3, QJ qj) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(bArr, i2, i3, qj));
    }

    @Override // com.google.protobuf.KH
    public yg parsePartialFrom(InputStream inputStream, QJ qj) throws InvalidProtocolBufferException {
        AbstractC1923o abstractC1923oNewInstance = AbstractC1923o.newInstance(inputStream);
        yg ygVar = (yg) parsePartialFrom(abstractC1923oNewInstance, qj);
        try {
            abstractC1923oNewInstance.checkLastTagWas(0);
            return ygVar;
        } catch (InvalidProtocolBufferException e2) {
            throw e2.setUnfinishedMessage(ygVar);
        }
    }

    @Override // com.google.protobuf.KH
    public yg parseFrom(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
        return parseFrom(bArr, i2, i3, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.KH
    public yg parseFrom(byte[] bArr, QJ qj) throws InvalidProtocolBufferException {
        return parseFrom(bArr, 0, bArr.length, qj);
    }

    @Override // com.google.protobuf.KH
    public yg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return parseFrom(bArr, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.KH
    public yg parseFrom(InputStream inputStream, QJ qj) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(inputStream, qj));
    }

    @Override // com.google.protobuf.KH
    public yg parsePartialFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.KH
    public yg parseFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return parseFrom(inputStream, EMPTY_REGISTRY);
    }
}
