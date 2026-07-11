package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
abstract class zzikc implements zzikg {
    private final Map zza;

    final Map zza() {
        return this.zza;
    }

    zzikc(Map map) {
        this.zza = Collections.unmodifiableMap(map);
    }
}
