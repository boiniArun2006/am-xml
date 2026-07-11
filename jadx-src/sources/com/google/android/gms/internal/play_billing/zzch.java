package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class zzch extends zzci {
    Object[] zza;
    int zzb;
    boolean zzc;

    private final void zzd(int i2) {
        int length = this.zza.length;
        int iZzc = zzci.zzc(length, this.zzb + i2);
        if (iZzc > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, iZzc);
            this.zzc = false;
        }
    }

    zzch(int i2) {
        zzbw.zza(i2, "initialCapacity");
        this.zza = new Object[i2];
        this.zzb = 0;
    }

    public final zzch zza(Object obj) {
        obj.getClass();
        zzd(1);
        Object[] objArr = this.zza;
        int i2 = this.zzb;
        this.zzb = i2 + 1;
        objArr[i2] = obj;
        return this;
    }

    final void zzb(Object[] objArr, int i2) {
        zzdd.zzb(objArr, i2);
        zzd(i2);
        System.arraycopy(objArr, 0, this.zza, this.zzb, i2);
        this.zzb += i2;
    }
}
