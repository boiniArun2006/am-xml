package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface rv6 extends vd {

    public interface j extends vd, Cloneable {
        rv6 buildPartial();
    }

    int getSerializedSize();

    void n(CodedOutputStream codedOutputStream);

    j newBuilderForType();

    byte[] toByteArray();

    fuX toByteString();
}
