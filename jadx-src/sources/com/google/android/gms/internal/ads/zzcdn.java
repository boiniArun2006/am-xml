package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcdn {
    final /* synthetic */ zzcdo zza;
    private long zzb;
    private long zzc;

    public final long zza() {
        return this.zzc;
    }

    public final void zzb() {
        this.zzc = this.zza.zzk().elapsedRealtime();
    }

    public final void zzc() {
        this.zzb = this.zza.zzk().elapsedRealtime();
    }

    public final Bundle zzd() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzb);
        bundle.putLong("tclose", this.zzc);
        return bundle;
    }

    public zzcdn(zzcdo zzcdoVar) {
        Objects.requireNonNull(zzcdoVar);
        this.zza = zzcdoVar;
        this.zzb = -1L;
        this.zzc = -1L;
    }
}
