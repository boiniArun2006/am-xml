package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcua extends zzctx {
    private final Context zzc;
    private final View zzd;

    @Nullable
    private final zzcjl zze;
    private final zzfis zzf;
    private final zzcwd zzg;
    private final zzdor zzh;
    private final zzdjo zzi;
    private final zzika zzj;
    private final Executor zzk;
    private com.google.android.gms.ads.internal.client.zzr zzl;

    @Override // com.google.android.gms.internal.ads.zzctx
    public final View zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzctx
    public final zzfis zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzctx
    public final void zzb(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzcjl zzcjlVar;
        if (viewGroup == null || (zzcjlVar = this.zze) == null) {
            return;
        }
        zzcjlVar.zzaf(zzclv.zza(zzrVar));
        viewGroup.setMinimumHeight(zzrVar.zzc);
        viewGroup.setMinimumWidth(zzrVar.zzf);
        this.zzl = zzrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctx
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzed zzc() {
        try {
            return this.zzg.zza();
        } catch (zzfjr unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzctx
    public final zzfis zze() {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zzl;
        if (zzrVar != null) {
            return zzfjq.zzb(zzrVar);
        }
        zzfir zzfirVar = this.zzb;
        if (zzfirVar.zzac) {
            for (String str : zzfirVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzfis(view.getWidth(), view.getHeight(), false);
        }
        return (zzfis) zzfirVar.zzr.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzctx
    public final int zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjd)).booleanValue() && this.zzb.zzag) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzje)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzctx
    public final int zzh() {
        return this.zza.zzb.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzctx
    public final void zzi() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcwf
    public final void zzj() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzk();
            }
        });
        super.zzj();
    }

    final /* synthetic */ void zzk() {
        zzbmd zzbmdVarZzd = this.zzh.zzd();
        if (zzbmdVarZzd == null) {
            return;
        }
        try {
            zzbmdVarZzd.zze((com.google.android.gms.ads.internal.client.zzbx) this.zzj.zzb(), ObjectWrapper.wrap(this.zzc));
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException when notifyAdLoad is called", e2);
        }
    }

    zzcua(zzcwe zzcweVar, Context context, zzfis zzfisVar, View view, @Nullable zzcjl zzcjlVar, zzcwd zzcwdVar, zzdor zzdorVar, zzdjo zzdjoVar, zzika zzikaVar, Executor executor) {
        super(zzcweVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcjlVar;
        this.zzf = zzfisVar;
        this.zzg = zzcwdVar;
        this.zzh = zzdorVar;
        this.zzi = zzdjoVar;
        this.zzj = zzikaVar;
        this.zzk = executor;
    }
}
