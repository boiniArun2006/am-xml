package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzeoa {

    @Nullable
    private zzenr zza;

    zzeoa() {
    }

    public static zzeoa zza(zzenr zzenrVar) {
        return new zzeoa(zzenrVar);
    }

    private zzeoa(zzenr zzenrVar) {
        this.zza = zzenrVar;
    }

    public final zzenr zzb(Clock clock, zzent zzentVar, zzekl zzeklVar, zzfqk zzfqkVar) {
        zzenr zzenrVar = this.zza;
        return zzenrVar != null ? zzenrVar : new zzenr(clock, zzentVar, zzeklVar, zzfqkVar);
    }
}
