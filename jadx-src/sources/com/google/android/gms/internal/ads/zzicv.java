package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzicv {
    private final zzicu zza;

    private zzicv(zzies zziesVar, Object obj, zzies zziesVar2, Object obj2) {
        this.zza = new zzicu(zziesVar, "", zziesVar2, obj2);
    }

    public static zzicv zza(zzies zziesVar, Object obj, zzies zziesVar2, Object obj2) {
        return new zzicv(zziesVar, "", zziesVar2, obj2);
    }

    final zzicu zze() {
        return this.zza;
    }

    static void zzb(zziaw zziawVar, zzicu zzicuVar, Object obj, Object obj2) throws IOException {
        zzibg.zzf(zziawVar, zzicuVar.zza, 1, obj);
        zzibg.zzf(zziawVar, zzicuVar.zzc, 2, obj2);
    }

    static int zzc(zzicu zzicuVar, Object obj, Object obj2) {
        return zzibg.zzh(zzicuVar.zza, 1, obj) + zzibg.zzh(zzicuVar.zzc, 2, obj2);
    }

    public final int zzd(int i2, Object obj, Object obj2) {
        zzicu zzicuVar = this.zza;
        int iZzA = zziaw.zzA(i2 << 3);
        int iZzc = zzc(zzicuVar, obj, obj2);
        return iZzA + zziaw.zzA(iZzc) + iZzc;
    }
}
