package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzyi {
    private int zza;
    private final SparseArray zzb;
    private final zzdr zzc;

    public zzyi() {
        this(zzyh.zza);
    }

    public final void zzd(int i2) {
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i3 >= sparseArray.size() - 1) {
                return;
            }
            int i5 = i3 + 1;
            if (i2 < sparseArray.keyAt(i5)) {
                return;
            }
            this.zzc.zza(sparseArray.valueAt(i3));
            sparseArray.removeAt(i3);
            int i7 = this.zza;
            if (i7 > 0) {
                this.zza = i7 - 1;
            }
            i3 = i5;
        }
    }

    public final void zze() {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i2 >= sparseArray.size()) {
                this.zza = -1;
                sparseArray.clear();
                return;
            } else {
                this.zzc.zza(sparseArray.valueAt(i2));
                i2++;
            }
        }
    }

    public zzyi(zzdr zzdrVar) {
        this.zzb = new SparseArray();
        this.zzc = zzdrVar;
        this.zza = -1;
    }

    public final Object zza(int i2) {
        SparseArray sparseArray;
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i3 = this.zza;
            if (i3 <= 0 || i2 >= this.zzb.keyAt(i3)) {
                break;
            }
            this.zza--;
        }
        while (true) {
            int i5 = this.zza;
            sparseArray = this.zzb;
            if (i5 >= sparseArray.size() - 1 || i2 < sparseArray.keyAt(this.zza + 1)) {
                break;
            }
            this.zza++;
        }
        return sparseArray.valueAt(this.zza);
    }

    public final void zzb(int i2, Object obj) {
        if (this.zza == -1) {
            zzgrc.zzi(this.zzb.size() == 0);
            this.zza = 0;
        }
        SparseArray sparseArray = this.zzb;
        if (sparseArray.size() > 0) {
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            zzgrc.zza(i2 >= iKeyAt);
            if (iKeyAt == i2) {
                this.zzc.zza(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        sparseArray.append(i2, obj);
    }

    public final Object zzc() {
        return this.zzb.valueAt(r0.size() - 1);
    }

    public final boolean zzf() {
        return this.zzb.size() == 0;
    }
}
