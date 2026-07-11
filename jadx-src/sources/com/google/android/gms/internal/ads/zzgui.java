package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class zzgui<K, V> implements Map<K, V>, Serializable {
    private transient zzgup zza;
    private transient zzgup zzb;
    private transient zzgub zzc;

    zzgui() {
    }

    public static zzgui zza() {
        return zzgwf.zza;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    abstract zzgup zze();

    abstract zzgup zzg();

    abstract zzgub zzi();

    abstract boolean zzj();

    public static zzgui zzb(Object obj, Object obj2) {
        zzgtb.zza("dialog_not_shown_reason", obj2);
        return zzgwf.zzk(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    public static zzgui zzc(Map map) {
        if ((map instanceof zzgui) && !(map instanceof SortedMap)) {
            zzgui zzguiVar = (zzgui) map;
            zzguiVar.zzj();
            return zzguiVar;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        zzguh zzguhVar = new zzguh(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        zzguhVar.zzb(setEntrySet);
        return zzguhVar.zzc();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzgup entrySet() {
        zzgup zzgupVar = this.zza;
        if (zzgupVar != null) {
            return zzgupVar;
        }
        zzgup zzgupVarZze = zze();
        this.zza = zzgupVarZze;
        return zzgupVarZze;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzgup keySet() {
        zzgup zzgupVar = this.zzb;
        if (zzgupVar != null) {
            return zzgupVar;
        }
        zzgup zzgupVarZzg = zzg();
        this.zzb = zzgupVarZzg;
        return zzgupVarZzg;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzgub values() {
        zzgub zzgubVar = this.zzc;
        if (zzgubVar != null) {
            return zzgubVar;
        }
        zzgub zzgubVarZzi = zzi();
        this.zzc = zzgubVarZzi;
        return zzgubVarZzi;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return zzgvm.zzb(this, obj);
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzgwp.zzc(entrySet());
    }

    public final String toString() {
        int size = size();
        zzgtb.zzb(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
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
