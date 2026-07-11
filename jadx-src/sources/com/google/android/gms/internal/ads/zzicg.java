package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class zzicg extends IOException {
    private boolean zza;

    public zzicg(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void zza() {
        this.zza = true;
    }

    final boolean zzb() {
        return this.zza;
    }

    public zzicg(String str) {
        super(str);
    }

    public zzicg(String str, IOException iOException) {
        super("Unable to parse map entry.", iOException);
    }
}
