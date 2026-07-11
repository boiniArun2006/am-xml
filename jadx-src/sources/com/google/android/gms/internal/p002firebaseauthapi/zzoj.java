package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzoj {
    public static final zzoj zza = new zzom().zza();
    private final Map<String, String> zzb;

    private zzoj(Map<String, String> map) {
        this.zzb = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzoj) {
            return this.zzb.equals(((zzoj) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final boolean zza() {
        return this.zzb.isEmpty();
    }
}
