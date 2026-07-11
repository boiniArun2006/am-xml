package com.google.common.collect;

import com.safedk.android.analytics.brandsafety.l;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
abstract class I28 implements Map.Entry {
    @Override // java.util.Map.Entry
    public abstract Object getKey();

    @Override // java.util.Map.Entry
    public abstract Object getValue();

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (t1.C.n(getKey(), entry.getKey()) && t1.C.n(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return getKey() + l.ae + getValue();
    }

    I28() {
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int iHashCode;
        Object key = getKey();
        Object value = getValue();
        int iHashCode2 = 0;
        if (key == null) {
            iHashCode = 0;
        } else {
            iHashCode = key.hashCode();
        }
        if (value != null) {
            iHashCode2 = value.hashCode();
        }
        return iHashCode ^ iHashCode2;
    }
}
