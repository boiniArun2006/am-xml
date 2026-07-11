package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class t extends xuv {
    @Override // com.google.protobuf.xuv
    boolean shouldDiscardUnknownFields(FKk fKk) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.xuv
    public void addFixed32(c7r c7rVar, int i2, int i3) {
        c7rVar.storeField(CM.makeTag(i2, 5), Integer.valueOf(i3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.xuv
    public void addFixed64(c7r c7rVar, int i2, long j2) {
        c7rVar.storeField(CM.makeTag(i2, 1), Long.valueOf(j2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.xuv
    public void addGroup(c7r c7rVar, int i2, c7r c7rVar2) {
        c7rVar.storeField(CM.makeTag(i2, 3), c7rVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.xuv
    public void addLengthDelimited(c7r c7rVar, int i2, C c2) {
        c7rVar.storeField(CM.makeTag(i2, 2), c2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.xuv
    public void addVarint(c7r c7rVar, int i2, long j2) {
        c7rVar.storeField(CM.makeTag(i2, 0), Long.valueOf(j2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.xuv
    public c7r getBuilderFromMessage(Object obj) {
        c7r fromMessage = getFromMessage(obj);
        if (fromMessage != c7r.getDefaultInstance()) {
            return fromMessage;
        }
        c7r c7rVarNewInstance = c7r.newInstance();
        setToMessage(obj, c7rVarNewInstance);
        return c7rVarNewInstance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.xuv
    public c7r getFromMessage(Object obj) {
        return ((g9s) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.xuv
    public int getSerializedSize(c7r c7rVar) {
        return c7rVar.getSerializedSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.xuv
    public int getSerializedSizeAsMessageSet(c7r c7rVar) {
        return c7rVar.getSerializedSizeAsMessageSet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.xuv
    public c7r merge(c7r c7rVar, c7r c7rVar2) {
        return c7r.getDefaultInstance().equals(c7rVar2) ? c7rVar : c7r.getDefaultInstance().equals(c7rVar) ? c7r.mutableCopyOf(c7rVar, c7rVar2) : c7rVar.mergeFrom(c7rVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.xuv
    public c7r newBuilder() {
        return c7r.newInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.xuv
    public void setBuilderToMessage(Object obj, c7r c7rVar) {
        setToMessage(obj, c7rVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.xuv
    public void setToMessage(Object obj, c7r c7rVar) {
        ((g9s) obj).unknownFields = c7rVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.xuv
    public c7r toImmutable(c7r c7rVar) {
        c7rVar.makeImmutable();
        return c7rVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.xuv
    public void writeAsMessageSetTo(c7r c7rVar, crp crpVar) throws IOException {
        c7rVar.writeAsMessageSetTo(crpVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.xuv
    public void writeTo(c7r c7rVar, crp crpVar) throws IOException {
        c7rVar.writeTo(crpVar);
    }

    t() {
    }

    @Override // com.google.protobuf.xuv
    void makeImmutable(Object obj) {
        getFromMessage(obj).makeImmutable();
    }
}
