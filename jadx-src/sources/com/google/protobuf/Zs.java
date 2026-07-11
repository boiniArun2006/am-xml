package com.google.protobuf;

import com.google.protobuf.K;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class Zs implements Md {
    @Override // com.google.protobuf.Md
    public Object toImmutable(Object obj) {
        ((psW) obj).makeImmutable();
        return obj;
    }

    private static <K, V> int getSerializedSizeLite(int i2, Object obj, Object obj2) {
        psW psw = (psW) obj;
        K k2 = (K) obj2;
        int iComputeMessageSize = 0;
        if (psw.isEmpty()) {
            return 0;
        }
        for (Map.Entry<Object, Object> entry : psw.entrySet()) {
            iComputeMessageSize += k2.computeMessageSize(i2, entry.getKey(), entry.getValue());
        }
        return iComputeMessageSize;
    }

    private static <K, V> psW mergeFromLite(Object obj, Object obj2) {
        psW pswMutableCopy = (psW) obj;
        psW psw = (psW) obj2;
        if (!psw.isEmpty()) {
            if (!pswMutableCopy.isMutable()) {
                pswMutableCopy = pswMutableCopy.mutableCopy();
            }
            pswMutableCopy.mergeFrom(psw);
        }
        return pswMutableCopy;
    }

    @Override // com.google.protobuf.Md
    public Map<?, ?> forMapData(Object obj) {
        return (psW) obj;
    }

    @Override // com.google.protobuf.Md
    public K.n forMapMetadata(Object obj) {
        return ((K) obj).getMetadata();
    }

    @Override // com.google.protobuf.Md
    public Map<?, ?> forMutableMapData(Object obj) {
        return (psW) obj;
    }

    @Override // com.google.protobuf.Md
    public boolean isImmutable(Object obj) {
        return !((psW) obj).isMutable();
    }

    Zs() {
    }

    @Override // com.google.protobuf.Md
    public int getSerializedSize(int i2, Object obj, Object obj2) {
        return getSerializedSizeLite(i2, obj, obj2);
    }

    @Override // com.google.protobuf.Md
    public Object mergeFrom(Object obj, Object obj2) {
        return mergeFromLite(obj, obj2);
    }

    @Override // com.google.protobuf.Md
    public Object newMapField(Object obj) {
        return psW.emptyMapField().mutableCopy();
    }
}
