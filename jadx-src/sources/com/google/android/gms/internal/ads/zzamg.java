package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzamg implements zzaex {
    private final zzaex zzb;
    private final zzamd zzc;
    private final SparseArray zzd = new SparseArray();
    private boolean zze;

    @Override // com.google.android.gms.internal.ads.zzaex
    public final zzagh zzu(int i2, int i3) {
        if (i3 != 3) {
            this.zze = true;
            return this.zzb.zzu(i2, i3);
        }
        SparseArray sparseArray = this.zzd;
        zzami zzamiVar = (zzami) sparseArray.get(i2);
        if (zzamiVar != null) {
            return zzamiVar;
        }
        zzami zzamiVar2 = new zzami(this.zzb.zzu(i2, 3), this.zzc);
        sparseArray.put(i2, zzamiVar2);
        return zzamiVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final void zzv() {
        this.zzb.zzv();
        if (!this.zze) {
            return;
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.zzd;
            if (i2 >= sparseArray.size()) {
                return;
            }
            ((zzami) sparseArray.valueAt(i2)).zzf(true);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final void zzw(zzafy zzafyVar) {
        this.zzb.zzw(zzafyVar);
    }

    public zzamg(zzaex zzaexVar, zzamd zzamdVar) {
        this.zzb = zzaexVar;
        this.zzc = zzamdVar;
    }
}
