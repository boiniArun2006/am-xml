package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class zzcv extends zzcj implements Set {
    private transient zzco zza;

    static int zzh(int i2) {
        int iMax = Math.max(i2, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzcv) && zzk() && ((zzcv) obj).zzk() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public abstract zzdw iterator();

    boolean zzk() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzcv zzl(int i2, Object... objArr) {
        if (i2 == 0) {
            return zzdq.zza;
        }
        if (i2 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzdt(obj);
        }
        int iZzh = zzh(i2);
        Object[] objArr2 = new Object[iZzh];
        int i3 = iZzh - 1;
        int i5 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i2; i8++) {
            Object obj2 = objArr[i8];
            zzdd.zza(obj2, i8);
            int iHashCode = obj2.hashCode();
            int iZza = zzcg.zza(iHashCode);
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
            return new zzdt(obj4);
        }
        if (zzh(i7) < iZzh / 2) {
            return zzl(i7, objArr);
        }
        int length = objArr.length;
        if (i7 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i7);
        }
        return new zzdq(objArr, i5, objArr2, i3, i7);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public zzco zzd() {
        zzco zzcoVar = this.zza;
        if (zzcoVar != null) {
            return zzcoVar;
        }
        zzco zzcoVarZzi = zzi();
        this.zza = zzcoVarZzi;
        return zzcoVarZzi;
    }

    zzcv() {
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzds.zza(this);
    }

    zzco zzi() {
        Object[] array = toArray();
        int i2 = zzco.zzd;
        return zzco.zzj(array, array.length);
    }
}
