package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzatc implements zzast {
    final /* synthetic */ Context zza;
    private File zzb = null;

    zzatc(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzast
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
