package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.DAz;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class Ln implements qf {
    @Override // com.google.crypto.tink.shaded.protobuf.qf
    public Object toImmutable(Object obj) {
        ((u) obj).az();
        return obj;
    }

    private static int n(int i2, Object obj, Object obj2) {
        u uVar = (u) obj;
        android.support.v4.media.j.n(obj2);
        if (uVar.isEmpty()) {
            return 0;
        }
        Iterator it = uVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    private static u rl(Object obj, Object obj2) {
        u uVarHI = (u) obj;
        u uVar = (u) obj2;
        if (!uVar.isEmpty()) {
            if (!uVarHI.qie()) {
                uVarHI = uVarHI.HI();
            }
            uVarHI.ty(uVar);
        }
        return uVarHI;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.qf
    public Map forMapData(Object obj) {
        return (u) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.qf
    public Map forMutableMapData(Object obj) {
        return (u) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.qf
    public boolean isImmutable(Object obj) {
        return !((u) obj).qie();
    }

    Ln() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.qf
    public DAz.j forMapMetadata(Object obj) {
        android.support.v4.media.j.n(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.qf
    public int getSerializedSize(int i2, Object obj, Object obj2) {
        return n(i2, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.qf
    public Object mergeFrom(Object obj, Object obj2) {
        return rl(obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.qf
    public Object newMapField(Object obj) {
        return u.KN().HI();
    }
}
