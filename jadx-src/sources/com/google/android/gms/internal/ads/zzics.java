package com.google.android.gms.internal.ads;

import cS.Zv.SzFNXybiSxdx;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzics implements zzida {
    private final zzida[] zza;

    zzics(zzida... zzidaVarArr) {
        this.zza = zzidaVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final boolean zzb(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            if (this.zza[i2].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final zzicz zzc(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            zzida zzidaVar = this.zza[i2];
            if (zzidaVar.zzb(cls)) {
                return zzidaVar.zzc(cls);
            }
        }
        throw new UnsupportedOperationException(SzFNXybiSxdx.GQXHmCTeRoREvyi.concat(cls.getName()));
    }
}
