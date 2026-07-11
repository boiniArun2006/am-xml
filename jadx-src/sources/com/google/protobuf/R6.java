package com.google.protobuf;

import com.google.protobuf.CN3;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
interface R6 {
    boolean equals(Object obj, Object obj2);

    int getSerializedSize(Object obj);

    int hashCode(Object obj);

    boolean isInitialized(Object obj);

    void makeImmutable(Object obj);

    void mergeFrom(Object obj, FKk fKk, QJ qj) throws IOException;

    void mergeFrom(Object obj, Object obj2);

    void mergeFrom(Object obj, byte[] bArr, int i2, int i3, CN3.n nVar) throws IOException;

    Object newInstance();

    void writeTo(Object obj, crp crpVar) throws IOException;
}
