package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzlz implements zzlr {
    public final zzwf zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    @Override // com.google.android.gms.internal.ads.zzlr
    public final Object zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final zzbf zzb() {
        return this.zza.zzz();
    }

    public final void zzc(int i2) {
        this.zzd = i2;
        this.zze = false;
        this.zzc.clear();
    }

    public zzlz(zzwm zzwmVar, boolean z2) {
        this.zza = new zzwf(zzwmVar, z2);
    }
}
