package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zziee extends RuntimeException {
    public zziee(zzidc zzidcVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzicg zza() {
        return new zzicg(getMessage());
    }
}
