package com.google.protobuf;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface rv6 extends YzO {
    void add(C c2);

    void add(byte[] bArr);

    boolean addAllByteArray(Collection<byte[]> collection);

    boolean addAllByteString(Collection<? extends C> collection);

    List<byte[]> asByteArrayList();

    @Override // com.google.protobuf.YzO
    /* synthetic */ List asByteStringList();

    byte[] getByteArray(int i2);

    C getByteString(int i2);

    Object getRaw(int i2);

    List<?> getUnderlyingElements();

    rv6 getUnmodifiableView();

    void mergeFrom(rv6 rv6Var);

    void set(int i2, C c2);

    void set(int i2, byte[] bArr);
}
