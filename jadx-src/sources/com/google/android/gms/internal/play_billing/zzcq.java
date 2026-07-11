package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcq {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzcp zzc;

    public final zzcq zza(Object obj, Object obj2) {
        int i2 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i3 = i2 + i2;
        if (i3 > length) {
            this.zza = Arrays.copyOf(objArr, zzci.zzc(length, i3));
        }
        zzbw.zzb(obj, obj2);
        Object[] objArr2 = this.zza;
        int i5 = this.zzb;
        int i7 = i5 + i5;
        objArr2[i7] = obj;
        objArr2[i7 + 1] = obj2;
        this.zzb = i5 + 1;
        return this;
    }

    public final zzcr zzb() {
        zzcp zzcpVar = this.zzc;
        if (zzcpVar != null) {
            throw zzcpVar.zza();
        }
        zzdp zzdpVarZzg = zzdp.zzg(this.zzb, this.zza, this);
        zzcp zzcpVar2 = this.zzc;
        if (zzcpVar2 == null) {
            return zzdpVarZzg;
        }
        throw zzcpVar2.zza();
    }
}
