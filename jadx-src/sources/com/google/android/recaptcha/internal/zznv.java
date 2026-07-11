package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zznv {
    zznv() {
    }

    public static final List zza(Object obj, long j2) {
        int i2;
        zznk zznkVar = (zznk) zzps.zzf(obj, j2);
        if (!zznkVar.zzc()) {
            int size = zznkVar.size();
            if (size == 0) {
                i2 = 10;
            } else {
                i2 = size + size;
            }
            zznk zznkVarZzd = zznkVar.zzd(i2);
            zzps.zzs(obj, j2, zznkVarZzd);
            return zznkVarZzd;
        }
        return zznkVar;
    }
}
