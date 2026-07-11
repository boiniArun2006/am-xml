package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzdc {
    private static final String zzc;
    private static final String zzd;
    public final String zza;
    public final int zzb;

    public zzdc(String str, int i2) {
        this.zza = str;
        this.zzb = i2;
    }

    static {
        String str = zzfj.zza;
        zzc = Integer.toString(0, 36);
        zzd = Integer.toString(1, 36);
    }

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        bundle.putString(zzc, this.zza);
        bundle.putInt(zzd, this.zzb);
        return bundle;
    }
}
