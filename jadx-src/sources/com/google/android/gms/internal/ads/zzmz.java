package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzmz {
    private final zzs zza;
    private final SparseArray zzb;

    public final zzmy zza(int i2) {
        zzmy zzmyVar = (zzmy) this.zzb.get(i2);
        zzmyVar.getClass();
        return zzmyVar;
    }

    public final boolean zzb(int i2) {
        return this.zza.zza(i2);
    }

    public final int zzc() {
        return this.zza.zzb();
    }

    public final int zzd(int i2) {
        return this.zza.zzc(i2);
    }

    public zzmz(zzs zzsVar, SparseArray sparseArray) {
        this.zza = zzsVar;
        SparseArray sparseArray2 = new SparseArray(zzsVar.zzb());
        for (int i2 = 0; i2 < zzsVar.zzb(); i2++) {
            int iZzc = zzsVar.zzc(i2);
            zzmy zzmyVar = (zzmy) sparseArray.get(iZzc);
            zzmyVar.getClass();
            sparseArray2.append(iZzc, zzmyVar);
        }
        this.zzb = sparseArray2;
    }
}
