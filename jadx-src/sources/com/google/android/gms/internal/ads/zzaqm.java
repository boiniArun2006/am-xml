package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzaqm {
    public final int zza;
    public final long zzb;

    private zzaqm(int i2, long j2) {
        this.zza = i2;
        this.zzb = j2;
    }

    public static zzaqm zza(zzaev zzaevVar, zzer zzerVar) throws IOException {
        zzaevVar.zzi(zzerVar.zzi(), 0, 8);
        zzerVar.zzh(0);
        return new zzaqm(zzerVar.zzB(), zzerVar.zzA());
    }
}
