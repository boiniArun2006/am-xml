package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzom {
    private HashMap<String, String> zza = new HashMap<>();

    public final zzoj zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzoj zzojVar = new zzoj(Collections.unmodifiableMap(this.zza));
        this.zza = null;
        return zzojVar;
    }
}
