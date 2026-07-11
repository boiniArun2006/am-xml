package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzecm {

    @VisibleForTesting
    zzbyr zza;

    @VisibleForTesting
    zzbyr zzb;
    private final Context zzc;
    private final zzecj zzd;
    private final zzdxz zze;
    private final com.google.android.gms.ads.internal.util.zzg zzf;

    zzecm(zzecj zzecjVar, zzdxz zzdxzVar, Context context, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzecjVar;
        this.zze = zzdxzVar;
        this.zzc = context;
        this.zzf = zzgVar;
    }

    final /* synthetic */ Context zzb() {
        return this.zzc;
    }

    final /* synthetic */ zzecj zzc() {
        return this.zzd;
    }

    final /* synthetic */ zzdxz zzd() {
        return this.zze;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.zzg zze() {
        return this.zzf;
    }

    public final void zza() {
        try {
            if (this.zzf.zzP()) {
                return;
            }
            zzecj zzecjVar = this.zzd;
            zzecjVar.zza();
            zzecjVar.zzb(new zzecl(this));
        } catch (Exception e2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfP)).booleanValue()) {
                if (this.zzb == null) {
                    this.zzb = zzbyp.zzc(this.zzc);
                }
                this.zzb.zzh(e2, "InstallReferrerUnsampled.initializeAndReport");
            } else {
                if (this.zza == null) {
                    this.zza = zzbyp.zza(this.zzc);
                }
                this.zza.zzh(e2, "InstallReferrer.initializeAndReport");
            }
        }
    }
}
