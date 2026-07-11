package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzeab extends zzbqj {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfoe zzd;
    final /* synthetic */ zzcen zze;
    final /* synthetic */ zzeak zzf;

    zzeab(zzeak zzeakVar, Object obj, String str, long j2, zzfoe zzfoeVar, zzcen zzcenVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j2;
        this.zzd = zzfoeVar;
        this.zze = zzcenVar;
        Objects.requireNonNull(zzeakVar);
        this.zzf = zzeakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zze() {
        synchronized (this.zza) {
            zzeak zzeakVar = this.zzf;
            String str = this.zzb;
            zzeakVar.zzm(str, true, "", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzc));
            zzeakVar.zzr().zzb(str);
            zzeakVar.zzs().zzb(str);
            zzfor zzforVarZzt = zzeakVar.zzt();
            zzfoe zzfoeVar = this.zzd;
            zzfoeVar.zzd(true);
            zzforVarZzt.zzb(zzfoeVar.zzm());
            this.zze.zzc(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zzf(String str) {
        synchronized (this.zza) {
            zzeak zzeakVar = this.zzf;
            String str2 = this.zzb;
            zzeakVar.zzm(str2, false, str, (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzc));
            zzeakVar.zzr().zzc(str2, MRAIDPresenter.ERROR);
            zzeakVar.zzs().zzc(str2, MRAIDPresenter.ERROR);
            zzfor zzforVarZzt = zzeakVar.zzt();
            zzfoe zzfoeVar = this.zzd;
            zzfoeVar.zzk(str);
            zzfoeVar.zzd(false);
            zzforVarZzt.zzb(zzfoeVar.zzm());
            this.zze.zzc(Boolean.FALSE);
        }
    }
}
