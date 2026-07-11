package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzeoy extends zzcaq {
    final /* synthetic */ zzddq zza;
    final /* synthetic */ zzdbd zzb;
    final /* synthetic */ zzdcm zzc;
    final /* synthetic */ zzdjv zzd;

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zze(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzf(IObjectWrapper iObjectWrapper, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzg(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzm(IObjectWrapper iObjectWrapper, int i2) {
    }

    zzeoy(zzeoz zzeozVar, zzddq zzddqVar, zzdbd zzdbdVar, zzdcm zzdcmVar, zzdjv zzdjvVar) {
        this.zza = zzddqVar;
        this.zzb = zzdbdVar;
        this.zzc = zzdcmVar;
        this.zzd = zzdjvVar;
        Objects.requireNonNull(zzeozVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzi(IObjectWrapper iObjectWrapper) {
        this.zzd.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzdT(4);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzk(IObjectWrapper iObjectWrapper, zzcas zzcasVar) {
        this.zzd.zzb(zzcasVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzl(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzp(IObjectWrapper iObjectWrapper) {
        this.zzd.zzb(null);
    }
}
