package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzdf {
    private static final String zzb;
    public final String zza;

    public zzdf(String str) {
        this.zza = str;
    }

    static {
        String str = zzfj.zza;
        zzb = Integer.toString(0, 36);
    }

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        bundle.putString(zzb, this.zza);
        return bundle;
    }
}
