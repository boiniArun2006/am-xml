package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzijv extends zzijy {
    final Logger zza;

    @Override // com.google.android.gms.internal.ads.zzijy
    public final void zza(String str) {
        this.zza.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }

    public zzijv(String str) {
        this.zza = Logger.getLogger(str);
    }
}
