package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zze {
    private final zzjh zza;

    zze(zzjh zzjhVar) {
        this.zza = zzjhVar;
    }

    final zzjh zza() {
        return this.zza;
    }

    final String zzb() {
        return String.valueOf(zzjk.zzm(this.zza));
    }

    static zze zzc(String str) {
        zzjh zzjhVarZzj;
        if (!TextUtils.isEmpty(str) && str.length() <= 1) {
            zzjhVarZzj = zzjk.zzj(str.charAt(0));
        } else {
            zzjhVarZzj = zzjh.UNINITIALIZED;
        }
        return new zze(zzjhVarZzj);
    }
}
