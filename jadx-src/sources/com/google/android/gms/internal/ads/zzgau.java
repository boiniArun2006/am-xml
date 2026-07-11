package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzgau implements zzikg {
    private final zzikp zza;

    private zzgau(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzgau zza(zzikp zzikpVar) {
        return new zzgau(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        File dir = ((Context) this.zza.zzb()).getDir("yqzdkcache", 0);
        zziko.zzb(dir);
        return dir;
    }
}
