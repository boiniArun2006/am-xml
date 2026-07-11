package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class xuv {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    abstract void addFixed32(Object obj, int i2, int i3);

    abstract void addFixed64(Object obj, int i2, long j2);

    abstract void addGroup(Object obj, int i2, Object obj2);

    abstract void addLengthDelimited(Object obj, int i2, C c2);

    abstract void addVarint(Object obj, int i2, long j2);

    abstract Object getBuilderFromMessage(Object obj);

    abstract Object getFromMessage(Object obj);

    abstract int getSerializedSize(Object obj);

    abstract int getSerializedSizeAsMessageSet(Object obj);

    abstract void makeImmutable(Object obj);

    abstract Object merge(Object obj, Object obj2);

    abstract Object newBuilder();

    abstract void setBuilderToMessage(Object obj, Object obj2);

    abstract void setToMessage(Object obj, Object obj2);

    abstract boolean shouldDiscardUnknownFields(FKk fKk);

    abstract Object toImmutable(Object obj);

    abstract void writeAsMessageSetTo(Object obj, crp crpVar) throws IOException;

    abstract void writeTo(Object obj, crp crpVar) throws IOException;

    public void setRecursionLimit(int i2) {
        recursionLimit = i2;
    }

    xuv() {
    }

    private final void mergeFrom(Object obj, FKk fKk, int i2) throws IOException {
        while (fKk.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(obj, fKk, i2)) {
        }
    }

    final boolean mergeOneFieldFrom(Object obj, FKk fKk, int i2) throws IOException {
        int tag = fKk.getTag();
        int tagFieldNumber = CM.getTagFieldNumber(tag);
        int tagWireType = CM.getTagWireType(tag);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType != 4) {
                            if (tagWireType == 5) {
                                addFixed32(obj, tagFieldNumber, fKk.readFixed32());
                                return true;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        return false;
                    }
                    Object objNewBuilder = newBuilder();
                    int iMakeTag = CM.makeTag(tagFieldNumber, 4);
                    int i3 = i2 + 1;
                    if (i3 < recursionLimit) {
                        mergeFrom(objNewBuilder, fKk, i3);
                        if (iMakeTag == fKk.getTag()) {
                            addGroup(obj, tagFieldNumber, toImmutable(objNewBuilder));
                            return true;
                        }
                        throw InvalidProtocolBufferException.invalidEndTag();
                    }
                    throw InvalidProtocolBufferException.recursionLimitExceeded();
                }
                addLengthDelimited(obj, tagFieldNumber, fKk.readBytes());
                return true;
            }
            addFixed64(obj, tagFieldNumber, fKk.readFixed64());
            return true;
        }
        addVarint(obj, tagFieldNumber, fKk.readInt64());
        return true;
    }
}
