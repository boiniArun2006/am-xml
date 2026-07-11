package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class zzan<K, V> implements Serializable, Map<K, V> {
    private transient zzas<Map.Entry<K, V>> zza;
    private transient zzas<K> zzb;
    private transient zzai<V> zzc;

    zzan() {
    }

    public static <K, V> zzan<K, V> zza(Map<? extends K, ? extends V> map) {
        if ((map instanceof zzan) && !(map instanceof SortedMap)) {
            zzan<K, V> zzanVar = (zzan) map;
            zzanVar.zzd();
            return zzanVar;
        }
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        zzaq zzaqVar = new zzaq(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        zzaqVar.zza(setEntrySet);
        return zzaqVar.zza();
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    abstract zzai<V> zza();

    abstract zzas<Map.Entry<K, V>> zzb();

    abstract zzas<K> zzc();

    abstract boolean zzd();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        zzas<Map.Entry<K, V>> zzasVar = this.zza;
        if (zzasVar != null) {
            return zzasVar;
        }
        zzas<Map.Entry<K, V>> zzasVarZzb = zzb();
        this.zza = zzasVarZzb;
        return zzasVarZzb;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        zzas<K> zzasVar = this.zzb;
        if (zzasVar != null) {
            return zzasVar;
        }
        zzas<K> zzasVarZzc = zzc();
        this.zzb = zzasVarZzc;
        return zzasVarZzc;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k2, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        zzai<V> zzaiVar = this.zzc;
        if (zzaiVar != null) {
            return zzaiVar;
        }
        zzai<V> zzaiVarZza = zza();
        this.zzc = zzaiVarZza;
        return zzaiVarZza;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return ((zzai) values()).contains(obj);
    }

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v2) {
        V v3 = get(obj);
        if (v3 != null) {
            return v3;
        }
        return v2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return zzax.zza((zzas) entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        int size = size();
        zzag.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824L));
        sb.append('{');
        boolean z2 = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z2 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
