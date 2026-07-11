package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfoa implements zzdir, zzdbv, zzdiv {
    private final zzfoo zza;
    private final zzfoe zzb;

    @Override // com.google.android.gms.internal.ads.zzdiv
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdiv
    public final void zza() {
        if (((Boolean) zzbix.zzd.zze()).booleanValue()) {
            zzfoo zzfooVar = this.zza;
            zzfoe zzfoeVar = this.zzb;
            zzfoeVar.zzd(true);
            zzfooVar.zza(zzfoeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzh() {
        if (((Boolean) zzbix.zzd.zze()).booleanValue()) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbix.zzd.zze()).booleanValue()) {
            zzfoo zzfooVar = this.zza;
            zzfoe zzfoeVar = this.zzb;
            zzfoeVar.zzk(zzeVar.zza().toString());
            zzfoeVar.zzd(false);
            zzfooVar.zza(zzfoeVar);
        }
    }

    zzfoa(Context context, zzfoo zzfooVar) {
        this.zza = zzfooVar;
        this.zzb = zzfoe.zzn(context, 13);
    }
}
