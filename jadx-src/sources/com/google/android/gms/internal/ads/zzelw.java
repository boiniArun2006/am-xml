package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzelw extends zzcaq implements zzdcp {
    private zzcar zza;
    private zzdco zzb;
    private zzdjx zzc;

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final synchronized void zza(zzdco zzdcoVar) {
        this.zzb = zzdcoVar;
    }

    public final synchronized void zzc(zzcar zzcarVar) {
        this.zza = zzcarVar;
    }

    public final synchronized void zzd(zzdjx zzdjxVar) {
        this.zzc = zzdjxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdjx zzdjxVar = this.zzc;
        if (zzdjxVar != null) {
            final zzekj zzekjVar = ((zzeow) zzdjxVar).zzc;
            final zzfir zzfirVar = ((zzeow) zzdjxVar).zzb;
            final zzfjc zzfjcVar = ((zzeow) zzdjxVar).zza;
            final zzeow zzeowVar = (zzeow) zzdjxVar;
            ((zzeow) zzdjxVar).zzd.zzc().execute(new Runnable(zzeowVar, zzfjcVar, zzfirVar, zzekjVar) { // from class: com.google.android.gms.internal.ads.zzeov
                private final /* synthetic */ zzfjc zza;
                private final /* synthetic */ zzfir zzb;
                private final /* synthetic */ zzekj zzc;

                {
                    this.zza = zzfjcVar;
                    this.zzb = zzfirVar;
                    this.zzc = zzekjVar;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeoz.zze(this.zza, this.zzb, this.zzc);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final synchronized void zzf(IObjectWrapper iObjectWrapper, int i2) throws RemoteException {
        zzdjx zzdjxVar = this.zzc;
        if (zzdjxVar != null) {
            String str = ((zzeow) zzdjxVar).zzc.zza;
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Fail to initialize adapter ".concat(String.valueOf(str)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final synchronized void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdco zzdcoVar = this.zzb;
        if (zzdcoVar != null) {
            zzdcoVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcar zzcarVar = this.zza;
        if (zzcarVar != null) {
            ((zzeoy) zzcarVar).zza.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcar zzcarVar = this.zza;
        if (zzcarVar != null) {
            ((zzeoy) zzcarVar).zzd.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcar zzcarVar = this.zza;
        if (zzcarVar != null) {
            zzcarVar.zzj(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, zzcas zzcasVar) throws RemoteException {
        zzcar zzcarVar = this.zza;
        if (zzcarVar != null) {
            ((zzeoy) zzcarVar).zzd.zzb(zzcasVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcar zzcarVar = this.zza;
        if (zzcarVar != null) {
            ((zzeoy) zzcarVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, int i2) throws RemoteException {
        zzdco zzdcoVar = this.zzb;
        if (zzdcoVar != null) {
            zzdcoVar.zzb(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcar zzcarVar = this.zza;
        if (zzcarVar != null) {
            ((zzeoy) zzcarVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcar zzcarVar = this.zza;
        if (zzcarVar != null) {
            ((zzeoy) zzcarVar).zzc.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final synchronized void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcar zzcarVar = this.zza;
        if (zzcarVar != null) {
            ((zzeoy) zzcarVar).zzd.zzb(null);
        }
    }
}
