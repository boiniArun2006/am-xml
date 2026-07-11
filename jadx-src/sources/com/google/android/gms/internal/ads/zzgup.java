package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class zzgup<E> extends zzgub<E> implements Set<E> {
    private transient zzguf zza;

    public static zzgup zzj(Object obj, Object obj2) {
        return zzv(2, obj, obj2);
    }

    public static zzgup zzk(Object obj, Object obj2, Object obj3) {
        return zzv(3, obj, obj2, obj3);
    }

    public static zzgup zzl(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzv(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzgup zzm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i2 = length + 6;
        Object[] objArr2 = new Object[i2];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return zzv(i2, objArr2);
    }

    static int zzn(int i2) {
        int iMax = Math.max(i2, 2);
        if (iMax >= 751619276) {
            zzgrc.zzb(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzgup zzp(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? zzv(length, (Object[]) objArr.clone()) : new zzgwq(objArr[0]) : zzgwg.zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzw(int i2, int i3) {
        return i2 < (i3 >> 1) + (i3 >> 2);
    }

    @Override // com.google.android.gms.internal.ads.zzgub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract zzgwt iterator();

    boolean zzq() {
        return false;
    }

    public static zzgup zzh() {
        return zzgwg.zza;
    }

    public static zzgup zzi(Object obj) {
        return new zzgwq(obj);
    }

    public static zzgup zzo(Collection collection) {
        if ((collection instanceof zzgup) && !(collection instanceof SortedSet)) {
            zzgup zzgupVar = (zzgup) collection;
            if (!zzgupVar.zzf()) {
                return zzgupVar;
            }
        }
        Object[] array = collection.toArray();
        return zzv(array.length, array);
    }

    public static zzguo zzs(int i2) {
        zzgtb.zzb(i2, "expectedSize");
        return new zzguo(i2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgup zzv(int i2, Object... objArr) {
        if (i2 == 0) {
            return zzgwg.zza;
        }
        if (i2 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzgwq(obj);
        }
        int iZzn = zzn(i2);
        Object[] objArr2 = new Object[iZzn];
        int i3 = iZzn - 1;
        int i5 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i2; i8++) {
            Object obj2 = objArr[i8];
            zzgvy.zzb(obj2, i8);
            int iHashCode = obj2.hashCode();
            int iZza = zzgty.zza(iHashCode);
            while (true) {
                int i9 = iZza & i3;
                Object obj3 = objArr2[i9];
                if (obj3 == null) {
                    objArr[i7] = obj2;
                    objArr2[i9] = obj2;
                    i5 += iHashCode;
                    i7++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iZza++;
                }
            }
        }
        Arrays.fill(objArr, i7, i2, (Object) null);
        if (i7 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzgwq(obj4);
        }
        if (zzn(i7) < iZzn / 2) {
            return zzv(i7, objArr);
        }
        if (zzw(i7, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i7);
        }
        return new zzgwg(objArr, i5, objArr2, i3, i7);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgup) && zzq() && ((zzgup) obj).zzq() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzgwp.zzd(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public zzguf zze() {
        zzguf zzgufVar = this.zza;
        if (zzgufVar != null) {
            return zzgufVar;
        }
        zzguf zzgufVarZzr = zzr();
        this.zza = zzgufVarZzr;
        return zzgufVarZzr;
    }

    zzgup() {
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzgwp.zzc(this);
    }

    zzguf zzr() {
        Object[] array = toArray();
        int i2 = zzguf.zzd;
        return zzguf.zzt(array, array.length);
    }
}
