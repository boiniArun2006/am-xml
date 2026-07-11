package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzelp implements zzekm {
    private final Context zza;
    private final zzcvc zzb;
    private View zzc;
    private zzbuc zzd;

    public zzelp(Context context, zzcvc zzcvcVar) {
        this.zza = context;
        this.zzb = zzcvcVar;
    }

    final /* synthetic */ void zzd(View view) {
        this.zzc = view;
    }

    final /* synthetic */ void zze(zzbuc zzbucVar) {
        this.zzd = zzbucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr {
        try {
            zzbvs zzbvsVar = (zzbvs) zzekjVar.zzb;
            zzbvsVar.zzo(zzfirVar.zzZ);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjd)).booleanValue() && zzfirVar.zzag) {
                String str = zzfirVar.zzU;
                String string = zzfirVar.zzv.toString();
                zzfjk zzfjkVar = zzfjcVar.zza.zza;
                zzbvsVar.zzq(str, string, zzfjkVar.zzd, ObjectWrapper.wrap(this.zza), new zzelo(this, zzekjVar, null), (zzbtz) zzekjVar.zzc, zzfjkVar.zzf);
                return;
            }
            String str2 = zzfirVar.zzU;
            String string2 = zzfirVar.zzv.toString();
            zzfjk zzfjkVar2 = zzfjcVar.zza.zza;
            zzbvsVar.zzi(str2, string2, zzfjkVar2.zzd, ObjectWrapper.wrap(this.zza), new zzelo(this, zzekjVar, null), (zzbtz) zzekjVar.zzc, zzfjkVar2.zzf);
        } catch (RemoteException e2) {
            throw new zzfjr(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, final zzfir zzfirVar, final zzekj zzekjVar) throws zzfjr, zzenv {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjd)).booleanValue() && zzfirVar.zzag) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zZzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfjr(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) zzgzo.zzj(zzgzo.zza(null), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzelm
                            @Override // com.google.android.gms.internal.ads.zzgyw
                            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                                return this.zza.zzc(view, zzfirVar, obj);
                            }
                        }, zzcei.zzf).get();
                    } catch (InterruptedException | ExecutionException e2) {
                        throw new zzfjr(e2);
                    }
                }
            } catch (RemoteException e3) {
                throw new zzfjr(e3);
            }
        } else {
            view = this.zzc;
        }
        zzcty zzctyVarZzf = this.zzb.zzf(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzcue(view, null, new zzcwd() { // from class: com.google.android.gms.internal.ads.zzeln
            @Override // com.google.android.gms.internal.ads.zzcwd
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzed zza() throws zzfjr {
                try {
                    return ((zzbvs) zzekjVar.zzb).zzh();
                } catch (RemoteException e4) {
                    throw new zzfjr(e4);
                }
            }
        }, (zzfis) zzfirVar.zzu.get(0)));
        zzctyVarZzf.zzk().zza(view);
        ((zzelv) zzekjVar.zzc).zzc(zzctyVarZzf.zzg());
        return zzctyVarZzf.zzi();
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzc(View view, zzfir zzfirVar, Object obj) {
        return zzgzo.zza(zzcvr.zza(this.zza, view, zzfirVar));
    }
}
