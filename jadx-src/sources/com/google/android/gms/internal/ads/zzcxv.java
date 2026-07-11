package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbgj;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcxv implements zzdct, com.google.android.gms.ads.internal.client.zza, zzdel, zzdbz, zzdbf, zzdgw {
    private final Clock zza;
    private final zzcdo zzb;

    public zzcxv(Clock clock, zzcdo zzcdoVar) {
        this.zza = clock;
        this.zzb = zzcdoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzd(zzcag zzcagVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdJ() {
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdO(zzbzu zzbzuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdt() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgw
    public final void zzk(zzbgj.zzb zzbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgw
    public final void zzm(boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgw
    public final void zzn(boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgw
    public final void zzo() {
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdP(zzfjc zzfjcVar) {
        this.zzb.zzd(this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zzdr() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzds() {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final void zzg() {
        this.zzb.zzh(true);
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zza(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdgw
    public final void zzj(zzbgj.zzb zzbVar) {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdgw
    public final void zzl(zzbgj.zzb zzbVar) {
        this.zzb.zzc();
    }

    public final String zzp() {
        return this.zzb.zzj();
    }
}
