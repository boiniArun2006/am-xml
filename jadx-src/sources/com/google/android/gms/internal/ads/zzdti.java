package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdti implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final Context zzb;
    private final zzdxz zzc;
    private final zzeiu zzd;
    private final Executor zze;
    private final zzazh zzf;
    private final VersionInfoParcel zzg;
    private final zzfqk zzh;
    private final zzejf zzi;
    private final zzfjo zzj;

    public zzdti(Context context, Executor executor, zzazh zzazhVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzckb zzckbVar, zzeiu zzeiuVar, zzfqk zzfqkVar, zzdxz zzdxzVar, zzejf zzejfVar, zzfjo zzfjoVar) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzazhVar;
        this.zzg = versionInfoParcel;
        this.zza = zzaVar;
        this.zzd = zzeiuVar;
        this.zzh = zzfqkVar;
        this.zzc = zzdxzVar;
        this.zzi = zzejfVar;
        this.zzj = zzfjoVar;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.zza zza() {
        return this.zza;
    }

    final /* synthetic */ Context zzb() {
        return this.zzb;
    }

    final /* synthetic */ zzdxz zzc() {
        return this.zzc;
    }

    final /* synthetic */ zzeiu zzd() {
        return this.zzd;
    }

    final /* synthetic */ Executor zze() {
        return this.zze;
    }

    final /* synthetic */ zzazh zzf() {
        return this.zzf;
    }

    final /* synthetic */ VersionInfoParcel zzg() {
        return this.zzg;
    }

    final /* synthetic */ zzfqk zzh() {
        return this.zzh;
    }

    final /* synthetic */ zzejf zzi() {
        return this.zzi;
    }

    final /* synthetic */ zzfjo zzj() {
        return this.zzj;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdtk zzdtkVar = new zzdtk(this);
        zzdtkVar.zza();
        return zzdtkVar;
    }
}
