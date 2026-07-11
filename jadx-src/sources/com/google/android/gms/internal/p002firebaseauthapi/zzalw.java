package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzalw<K, V> extends LinkedHashMap<K, V> {
    private static final zzalw<?, ?> zza;
    private boolean zzb;

    private zzalw() {
        this.zzb = true;
    }

    private static int zza(Object obj) {
        if (obj instanceof byte[]) {
            return zzalb.zza((byte[]) obj);
        }
        if (obj instanceof zzala) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public final void zzc() {
        this.zzb = false;
    }

    static {
        zzalw<?, ?> zzalwVar = new zzalw<>();
        zza = zzalwVar;
        ((zzalw) zzalwVar).zzb = false;
    }

    private final void zze() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z2;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this == map) {
                z2 = true;
                if (z2) {
                    return true;
                }
            } else {
                if (size() == map.size()) {
                    for (Map.Entry<K, V> entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            V value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                            }
                        }
                    }
                    z2 = true;
                    if (z2) {
                    }
                }
                z2 = false;
                if (z2) {
                }
            }
        }
        return false;
    }

    public final boolean zzd() {
        return this.zzb;
    }

    private zzalw(Map<K, V> map) {
        super(map);
        this.zzb = true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zze();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iZza = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iZza += zza(entry.getValue()) ^ zza(entry.getKey());
        }
        return iZza;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k2, V v2) {
        zze();
        zzalb.zza(k2);
        zzalb.zza(v2);
        return (V) super.put(k2, v2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        zze();
        for (K k2 : map.keySet()) {
            zzalb.zza(k2);
            zzalb.zza(map.get(k2));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        zze();
        return (V) super.remove(obj);
    }

    public final zzalw<K, V> zzb() {
        if (isEmpty()) {
            return new zzalw<>();
        }
        return new zzalw<>(this);
    }

    public static <K, V> zzalw<K, V> zza() {
        return (zzalw<K, V>) zza;
    }

    public final void zza(zzalw<K, V> zzalwVar) {
        zze();
        if (zzalwVar.isEmpty()) {
            return;
        }
        putAll(zzalwVar);
    }
}
