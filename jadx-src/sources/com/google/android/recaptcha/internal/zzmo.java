package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzmo {
    static final zzmo zza = new zzmo(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc;
    private final Map zzd;

    zzmo() {
        this.zzd = new HashMap();
    }

    zzmo(boolean z2) {
        this.zzd = Collections.EMPTY_MAP;
    }

    public final zznc zza(zzoi zzoiVar, int i2) {
        return (zznc) this.zzd.get(new zzmn(zzoiVar, i2));
    }
}
