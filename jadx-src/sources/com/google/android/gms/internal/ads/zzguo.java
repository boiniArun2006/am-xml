package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzguo extends zzgtz {
    Object[] zzd;
    private int zze;

    public zzguo() {
        super(4);
    }

    zzguo(int i2, boolean z2) {
        super(i2);
        this.zzd = new Object[zzgup.zzn(i2)];
    }

    public final zzguo zzg(Object... objArr) {
        if (this.zzd == null) {
            zzb(objArr, 2);
            return this;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            zzf(objArr[i2]);
        }
        return this;
    }

    public final zzgup zzi() {
        zzgup zzgupVarZzv;
        int i2 = this.zzb;
        if (i2 == 0) {
            return zzgwg.zza;
        }
        if (i2 == 1) {
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzgwq(obj);
        }
        if (this.zzd == null || zzgup.zzn(i2) != this.zzd.length) {
            zzgupVarZzv = zzgup.zzv(this.zzb, this.zza);
            this.zzb = zzgupVarZzv.size();
        } else {
            int i3 = this.zzb;
            Object[] objArrCopyOf = this.zza;
            if (zzgup.zzw(i3, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            }
            zzgupVarZzv = new zzgwg(objArrCopyOf, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzgupVarZzv;
    }

    @Override // com.google.android.gms.internal.ads.zzgtz, com.google.android.gms.internal.ads.zzgua
    public final /* bridge */ /* synthetic */ zzgua zzd(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzguo zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int iZzn = zzgup.zzn(this.zzb);
            Object[] objArr = this.zzd;
            if (iZzn <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iZza = zzgty.zza(iHashCode);
                while (true) {
                    int i2 = iZza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i2];
                    if (obj2 == null) {
                        objArr2[i2] = obj;
                        this.zze += iHashCode;
                        super.zza(obj);
                        return this;
                    }
                    if (!obj2.equals(obj)) {
                        iZza = i2 + 1;
                    } else {
                        return this;
                    }
                }
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }

    public final zzguo zzh(Iterable iterable) {
        iterable.getClass();
        if (this.zzd != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zzf(it.next());
            }
            return this;
        }
        super.zzc(iterable);
        return this;
    }
}
