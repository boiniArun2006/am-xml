package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzagz implements zzagq {
    public final String zza;

    private zzagz(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzagq
    public final int zza() {
        return 1852994675;
    }

    public static zzagz zzb(zzer zzerVar) {
        return new zzagz(zzerVar.zzK(zzerVar.zzd(), StandardCharsets.UTF_8));
    }
}
