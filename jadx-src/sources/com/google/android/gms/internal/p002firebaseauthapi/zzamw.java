package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class zzamw<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private Object[] zza;
    private int zzb;
    private Map<K, V> zzc;
    private boolean zzd;
    private volatile zzanc zze;
    private Map<K, V> zzf;

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzamw)) {
            return super.equals(obj);
        }
        zzamw zzamwVar = (zzamw) obj;
        int size = size();
        if (size != zzamwVar.size()) {
            return false;
        }
        int i2 = this.zzb;
        if (i2 != zzamwVar.zzb) {
            return entrySet().equals(zzamwVar.entrySet());
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!zza(i3).equals(zzamwVar.zza(i3))) {
                return false;
            }
        }
        if (i2 != size) {
            return this.zzc.equals(zzamwVar.zzc);
        }
        return true;
    }

    private zzamw() {
        Map<K, V> map = Collections.EMPTY_MAP;
        this.zzc = map;
        this.zzf = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new zzanc(this);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iZza = zza(comparable);
        return iZza >= 0 ? (V) ((zzana) this.zza[iZza]).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i2 = this.zzb;
        int iHashCode = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iHashCode += this.zza[i3].hashCode();
        }
        return this.zzc.size() > 0 ? iHashCode + this.zzc.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzb + this.zzc.size();
    }

    public final Iterable<Map.Entry<K, V>> zzb() {
        return this.zzc.isEmpty() ? Collections.EMPTY_SET : this.zzc.entrySet();
    }

    final Set<Map.Entry<K, V>> zzc() {
        return new zzanb(this);
    }

    public void zzd() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final boolean zze() {
        return this.zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zza(K k2) {
        int i2;
        int i3;
        int i5 = this.zzb;
        int i7 = i5 - 1;
        if (i7 < 0) {
            i2 = 0;
            while (i2 <= i7) {
                int i8 = (i2 + i7) / 2;
                int iCompareTo = k2.compareTo((Comparable) ((zzana) this.zza[i8]).getKey());
                if (iCompareTo < 0) {
                    i7 = i8 - 1;
                } else {
                    if (iCompareTo <= 0) {
                        return i8;
                    }
                    i2 = i8 + 1;
                }
            }
            i3 = i2 + 1;
        } else {
            int iCompareTo2 = k2.compareTo((Comparable) ((zzana) this.zza[i7]).getKey());
            if (iCompareTo2 > 0) {
                i3 = i5 + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i7;
                }
                i2 = 0;
                while (i2 <= i7) {
                }
                i3 = i2 + 1;
            }
        }
        return -i3;
    }

    private final SortedMap<K, V> zzf() {
        zzg();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzg();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (!this.zzc.isEmpty()) {
            this.zzc.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzg();
        Comparable comparable = (Comparable) obj;
        int iZza = zza(comparable);
        if (iZza >= 0) {
            return zzb(iZza);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzb(int i2) {
        zzg();
        V v2 = (V) ((zzana) this.zza[i2]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i2 + 1, objArr, i2, (this.zzb - i2) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzf().entrySet().iterator();
            this.zza[this.zzb] = new zzana(this, it.next());
            this.zzb++;
            it.remove();
        }
        return v2;
    }

    public final int zza() {
        return this.zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final V put(K k2, V v2) {
        zzg();
        int iZza = zza(k2);
        if (iZza >= 0) {
            return (V) ((zzana) this.zza[iZza]).setValue(v2);
        }
        zzg();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i2 = -(iZza + 1);
        if (i2 >= 16) {
            return zzf().put(k2, v2);
        }
        int i3 = this.zzb;
        if (i3 == 16) {
            zzana zzanaVar = (zzana) this.zza[15];
            this.zzb = i3 - 1;
            zzf().put((Comparable) zzanaVar.getKey(), zzanaVar.getValue());
        }
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i2, objArr, i2 + 1, (objArr.length - i2) - 1);
        this.zza[i2] = new zzana(this, k2, v2);
        this.zzb++;
        return null;
    }

    public final Map.Entry<K, V> zza(int i2) {
        if (i2 < this.zzb) {
            return (zzana) this.zza[i2];
        }
        throw new ArrayIndexOutOfBoundsException(i2);
    }
}
