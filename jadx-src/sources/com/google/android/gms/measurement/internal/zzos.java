package com.google.android.gms.measurement.internal;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzos {
    private final String zza;
    private final Map zzb;
    private final zzlr zzc;
    private final com.google.android.gms.internal.measurement.zzis zzd;

    zzos(String str, Map map, zzlr zzlrVar, com.google.android.gms.internal.measurement.zzis zzisVar) {
        this.zza = str;
        this.zzb = map;
        this.zzc = zzlrVar;
        this.zzd = zzisVar;
    }

    public final String zza() {
        return this.zza;
    }

    public final zzlr zzc() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.measurement.zzis zzd() {
        return this.zzd;
    }

    public final Map zzb() {
        Map map = this.zzb;
        return map == null ? Collections.EMPTY_MAP : map;
    }
}
