package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzeqr extends com.google.android.gms.ads.internal.client.zzbs {

    @VisibleForTesting
    final zzfjj zza;

    @VisibleForTesting
    final zzdoq zzb;
    private final Context zzc;
    private final zzcma zzd;
    private com.google.android.gms.ads.internal.client.zzbk zze;

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzf(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zze = zzbkVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final com.google.android.gms.ads.internal.client.zzbq zze() {
        zzdor zzdorVarZzg = this.zzb.zzg();
        ArrayList arrayListZzh = zzdorVarZzg.zzh();
        zzfjj zzfjjVar = this.zza;
        zzfjjVar.zzm(arrayListZzh);
        zzfjjVar.zzn(zzdorVarZzg.zzi());
        if (zzfjjVar.zzf() == null) {
            zzfjjVar.zzc(com.google.android.gms.ads.internal.client.zzr.zzb());
        }
        return new zzeqs(this.zzc, this.zzd, zzfjjVar, zzdorVarZzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzg(zzblq zzblqVar) {
        this.zzb.zzb(zzblqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzh(zzblt zzbltVar) {
        this.zzb.zza(zzbltVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzi(String str, zzblz zzblzVar, @Nullable zzblw zzblwVar) {
        this.zzb.zzf(str, zzblzVar, zzblwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzj(zzbkh zzbkhVar) {
        this.zza.zzo(zzbkhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzk(zzbmd zzbmdVar, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzb.zzd(zzbmdVar);
        this.zza.zzc(zzrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzl(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzr(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzm(zzbmg zzbmgVar) {
        this.zzb.zzc(zzbmgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzn(zzbqs zzbqsVar) {
        this.zza.zzq(zzbqsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzo(zzbrb zzbrbVar) {
        this.zzb.zze(zzbrbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzp(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzs(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzq(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zza.zzZ(zzcsVar);
    }

    public zzeqr(zzcma zzcmaVar, Context context, String str) {
        zzfjj zzfjjVar = new zzfjj();
        this.zza = zzfjjVar;
        this.zzb = new zzdoq();
        this.zzd = zzcmaVar;
        zzfjjVar.zzg(str);
        this.zzc = context;
    }
}
