package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzfbe implements zzfav {
    private final int zza;
    private final int zzb;

    zzfbe(int i2, int i3) {
        this.zza = i2;
        this.zzb = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i2;
        Bundle bundle = ((zzdah) obj).zza;
        int i3 = this.zza;
        if (i3 == -1 || (i2 = this.zzb) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i3);
        bundle.putInt("crashes_without_flags", i2);
        int i5 = com.google.android.gms.ads.internal.client.zzbb.zza;
        if (com.google.android.gms.ads.internal.client.zzbd.zzc().zzc()) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
