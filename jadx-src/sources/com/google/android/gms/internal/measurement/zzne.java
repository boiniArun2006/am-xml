package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzne {
    private final zznd zza;

    private zzne(zzos zzosVar, Object obj, zzos zzosVar2, Object obj2) {
        this.zza = new zznd(zzosVar, "", zzosVar2, "");
    }

    public static zzne zza(zzos zzosVar, Object obj, zzos zzosVar2, Object obj2) {
        return new zzne(zzosVar, "", zzosVar2, "");
    }

    final zznd zze() {
        return this.zza;
    }

    static void zzb(zzll zzllVar, zznd zzndVar, Object obj, Object obj2) throws IOException {
        zzlv.zzf(zzllVar, zzndVar.zza, 1, obj);
        zzlv.zzf(zzllVar, zzndVar.zzc, 2, obj2);
    }

    static int zzc(zznd zzndVar, Object obj, Object obj2) {
        return zzlv.zzh(zzndVar.zza, 1, obj) + zzlv.zzh(zzndVar.zzc, 2, obj2);
    }

    public final int zzd(int i2, Object obj, Object obj2) {
        zznd zzndVar = this.zza;
        int iZzz = zzll.zzz(i2 << 3);
        int iZzc = zzc(zzndVar, obj, obj2);
        return iZzz + zzll.zzz(iZzc) + iZzc;
    }
}
