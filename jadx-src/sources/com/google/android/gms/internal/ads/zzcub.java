package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcub implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;
    private final zzikp zze;
    private final zzikp zzf;
    private final zzikp zzg;
    private final zzikp zzh;
    private final zzikp zzi;
    private final zzikp zzj;

    private zzcub(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8, zzikp zzikpVar9, zzikp zzikpVar10) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
        this.zze = zzikpVar5;
        this.zzf = zzikpVar6;
        this.zzg = zzikpVar7;
        this.zzh = zzikpVar8;
        this.zzi = zzikpVar9;
        this.zzj = zzikpVar10;
    }

    public static zzcub zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8, zzikp zzikpVar9, zzikp zzikpVar10) {
        return new zzcub(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5, zzikpVar6, zzikpVar7, zzikpVar8, zzikpVar9, zzikpVar10);
    }

    public static zzcua zzd(zzcwe zzcweVar, Context context, zzfis zzfisVar, View view, @Nullable zzcjl zzcjlVar, zzcwd zzcwdVar, zzdor zzdorVar, zzdjo zzdjoVar, zzika zzikaVar, Executor executor) {
        return new zzcua(zzcweVar, context, zzfisVar, view, zzcjlVar, zzcwdVar, zzdorVar, zzdjoVar, zzikaVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcua zzb() {
        return new zzcua(((zzcym) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcuh) this.zzc).zza(), ((zzcug) this.zzd).zza(), ((zzcuv) this.zze).zza(), ((zzcui) this.zzf).zza(), ((zzdmo) this.zzg).zza(), (zzdjo) this.zzh.zzb(), zzikf.zzc(this.zzi), (Executor) this.zzj.zzb());
    }
}
