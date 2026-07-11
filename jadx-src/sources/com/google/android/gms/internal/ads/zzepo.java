package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzepo implements com.google.android.gms.ads.internal.zzg {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzdbd zzb;
    private final zzdbx zzc;
    private final zzdjo zzd;
    private final zzdjg zze;
    private final zzcss zzf;

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzdr();
            this.zze.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }

    zzepo(zzdbd zzdbdVar, zzdbx zzdbxVar, zzdjo zzdjoVar, zzdjg zzdjgVar, zzcss zzcssVar) {
        this.zzb = zzdbdVar;
        this.zzc = zzdbxVar;
        this.zzd = zzdjoVar;
        this.zze = zzdjgVar;
        this.zzf = zzcssVar;
    }
}
