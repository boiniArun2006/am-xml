package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzico {
    zzico() {
    }

    public static final List zza(Object obj, long j2) {
        int i2;
        zzicd zzicdVar = (zzicd) zziem.zzn(obj, j2);
        if (!zzicdVar.zza()) {
            int size = zzicdVar.size();
            if (size == 0) {
                i2 = 10;
            } else {
                i2 = size + size;
            }
            zzicd zzicdVarZzh = zzicdVar.zzh(i2);
            zziem.zzo(obj, j2, zzicdVarZzh);
            return zzicdVarZzh;
        }
        return zzicdVar;
    }
}
