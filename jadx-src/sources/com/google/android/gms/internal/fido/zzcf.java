package com.google.android.gms.internal.fido;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class zzcf extends zzby implements Set {
    private transient zzcc zza;

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

    public static zzcf zzm(Object obj, Object obj2) {
        return zzf(2, obj, obj2);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzcf) && zzg() && ((zzcf) obj).zzg() && hashCode() != obj.hashCode()) {
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

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzdc iterator();

    boolean zzg() {
        return false;
    }

    private static zzcf zzf(int i2, Object... objArr) {
        if (i2 == 0) {
            return zzcu.zza;
        }
        if (i2 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzcz(obj);
        }
        int iZzh = zzh(i2);
        Object[] objArr2 = new Object[iZzh];
        int i3 = iZzh - 1;
        int i5 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i2; i8++) {
            Object obj2 = objArr[i8];
            zzcr.zza(obj2, i8);
            int iHashCode = obj2.hashCode();
            int iZza = zzbx.zza(iHashCode);
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
            return new zzcz(obj4);
        }
        if (zzh(i7) < iZzh / 2) {
            return zzf(i7, objArr);
        }
        if (i7 <= 0) {
            objArr = Arrays.copyOf(objArr, i7);
        }
        return new zzcu(objArr, i5, objArr2, i3, i7);
    }

    public static zzcf zzk() {
        return zzcu.zza;
    }

    public static zzcf zzl(Object obj) {
        return new zzcz("FIDO");
    }

    public zzcc zzi() {
        zzcc zzccVar = this.zza;
        if (zzccVar != null) {
            return zzccVar;
        }
        zzcc zzccVarZzj = zzj();
        this.zza = zzccVarZzj;
        return zzccVarZzj;
    }

    zzcf() {
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzcy.zza(this);
    }

    zzcc zzj() {
        Object[] array = toArray();
        int i2 = zzcc.zzd;
        return zzcc.zzh(array, array.length);
    }
}
