package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhjq {
    private HashMap zza = new HashMap();

    public final zzhjr zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzhjr zzhjrVar = new zzhjr(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzhjrVar;
    }
}
