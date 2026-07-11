package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class zzfeb implements zzesf {
    protected final zzcma zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzfer zzd;
    private final zzfgj zze;
    private final VersionInfoParcel zzf;
    private final ViewGroup zzg;
    private final zzfor zzh;
    private final zzfjj zzi;
    private com.google.common.util.concurrent.Xo zzj;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized zzdal zzg(zzfgh zzfghVar) {
        zzfdy zzfdyVar = (zzfdy) zzfghVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjx)).booleanValue()) {
            zzctu zzctuVar = new zzctu(this.zzg);
            zzdan zzdanVar = new zzdan();
            zzdanVar.zza(this.zzb);
            zzdanVar.zzb(zzfdyVar.zza);
            zzdao zzdaoVarZze = zzdanVar.zze();
            zzdhe zzdheVar = new zzdhe();
            zzfer zzferVar = this.zzd;
            Executor executor = this.zzc;
            zzdheVar.zzd(zzferVar, executor);
            zzdheVar.zzg(zzferVar, executor);
            return zzc(zzctuVar, zzdaoVarZze, zzdheVar.zzn());
        }
        zzfer zzferVarZzn = zzfer.zzn(this.zzd);
        zzdhe zzdheVar2 = new zzdhe();
        Executor executor2 = this.zzc;
        zzdheVar2.zzc(zzferVarZzn, executor2);
        zzdheVar2.zzi(zzferVarZzn, executor2);
        zzdheVar2.zzj(zzferVarZzn, executor2);
        zzdheVar2.zzk(zzferVarZzn, executor2);
        zzdheVar2.zzd(zzferVarZzn, executor2);
        zzdheVar2.zzg(zzferVarZzn, executor2);
        zzdheVar2.zzl(zzferVarZzn);
        zzctu zzctuVar2 = new zzctu(this.zzg);
        zzdan zzdanVar2 = new zzdan();
        zzdanVar2.zza(this.zzb);
        zzdanVar2.zzb(zzfdyVar.zza);
        return zzc(zzctuVar2, zzdanVar2.zze(), zzdheVar2.zzn());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    @Override // com.google.android.gms.internal.ads.zzesf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzesd zzesdVar, zzese zzeseVar) throws Throwable {
        Throwable th;
        zzfoo zzfooVar;
        zzcth zzcthVar;
        try {
            try {
                if (!zzmVar.zzb()) {
                    if (((Boolean) zzbjc.zzd.zze()).booleanValue()) {
                        try {
                            boolean z2 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmF)).booleanValue();
                            if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmG)).intValue() || !z2) {
                                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                if (str == null) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for app open ad.");
                    this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfea
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze();
                        }
                    });
                    return false;
                }
                if (this.zzj != null) {
                    return false;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcZ)).booleanValue()) {
                    com.google.android.gms.ads.internal.client.zzbb.zzc();
                }
                if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzcthVar = (zzcth) this.zze.zzd()) == null) {
                    zzfooVar = null;
                } else {
                    zzfoo zzfooVarZzd = zzcthVar.zzd();
                    zzfooVarZzd.zzi(7);
                    zzfooVarZzd.zzc(zzmVar.zzp);
                    zzfooVarZzd.zzd(zzmVar.zzm);
                    zzfooVar = zzfooVarZzd;
                }
                Context context = this.zzb;
                boolean z3 = zzmVar.zzf;
                zzfkh.zzb(context, z3);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkq)).booleanValue() && z3) {
                    this.zza.zzw().zzc(true);
                }
                Bundle bundleZza = zzdxj.zza(new Pair(zzdxh.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdxh.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
                zzfjj zzfjjVar = this.zzi;
                zzfjjVar.zzg(str);
                zzfjjVar.zzc(com.google.android.gms.ads.internal.client.zzr.zzd());
                zzfjjVar.zza(zzmVar);
                zzfjjVar.zzv(bundleZza);
                zzfjk zzfjkVarZzA = zzfjjVar.zzA();
                zzfoe zzfoeVarZzo = zzfoe.zzo(context, zzfon.zzg(zzfjkVarZzA), 7, zzmVar);
                zzfdy zzfdyVar = new zzfdy(null);
                zzfdyVar.zza = zzfjkVarZzA;
                com.google.common.util.concurrent.Xo xoZzc = this.zze.zzc(new zzfgk(zzfdyVar, null), new zzfgi() { // from class: com.google.android.gms.internal.ads.zzfdz
                    @Override // com.google.android.gms.internal.ads.zzfgi
                    public final /* synthetic */ zzdal zza(zzfgh zzfghVar) {
                        return this.zza.zzf(zzfghVar);
                    }
                }, null);
                this.zzj = xoZzc;
                zzgzo.zzr(xoZzc, new zzfdx(this, zzeseVar, zzfooVar, zzfoeVarZzo, zzfdyVar), this.zzc);
                return true;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        throw th;
    }

    protected abstract zzdal zzc(zzctu zzctuVar, zzdao zzdaoVar, zzdhf zzdhfVar);

    final /* synthetic */ Executor zzh() {
        return this.zzc;
    }

    final /* synthetic */ zzfer zzi() {
        return this.zzd;
    }

    final /* synthetic */ zzfgj zzj() {
        return this.zze;
    }

    final /* synthetic */ zzfor zzk() {
        return this.zzh;
    }

    final /* synthetic */ void zzl(com.google.common.util.concurrent.Xo xo) {
        this.zzj = null;
    }

    @Override // com.google.android.gms.internal.ads.zzesf
    public final boolean zzb() {
        com.google.common.util.concurrent.Xo xo = this.zzj;
        return (xo == null || xo.isDone()) ? false : true;
    }

    public final void zzd(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzi.zzp(zzxVar);
    }

    final /* synthetic */ void zze() {
        this.zzd.zzdI(zzfkm.zzd(6, null, null));
    }

    protected zzfeb(Context context, Executor executor, zzcma zzcmaVar, zzfgj zzfgjVar, zzfer zzferVar, zzfjj zzfjjVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcmaVar;
        this.zze = zzfgjVar;
        this.zzd = zzferVar;
        this.zzi = zzfjjVar;
        this.zzf = versionInfoParcel;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcmaVar.zzx();
    }
}
