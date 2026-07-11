package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzelv extends zzbty implements zzdcp {
    private zzbtz zza;
    private zzdco zzb;

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final synchronized void zza(zzdco zzdcoVar) {
        this.zzb = zzdcoVar;
    }

    public final synchronized void zzc(zzbtz zzbtzVar) {
        this.zza = zzbtzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zze() throws RemoteException {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzf() throws RemoteException {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzg(int i2) throws RemoteException {
        zzdco zzdcoVar = this.zzb;
        if (zzdcoVar != null) {
            zzdcoVar.zzb(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzh() throws RemoteException {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzi() throws RemoteException {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzj() throws RemoteException {
        try {
            zzbtz zzbtzVar = this.zza;
            if (zzbtzVar != null) {
                zzbtzVar.zzj();
            }
            zzdco zzdcoVar = this.zzb;
            if (zzdcoVar != null) {
                zzdcoVar.zza();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzk() throws RemoteException {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzl(String str, String str2) throws RemoteException {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzl(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzm(zzblm zzblmVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzn() throws RemoteException {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzo() throws RemoteException {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzo();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzp(zzcas zzcasVar) throws RemoteException {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzp(zzcasVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzq() throws RemoteException {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzr(zzcaw zzcawVar) throws RemoteException {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzr(zzcawVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzs(int i2) throws RemoteException {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzs(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzt() throws RemoteException {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzu() throws RemoteException {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzv(String str) throws RemoteException {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzv(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzw(int i2, String str) throws RemoteException {
        zzdco zzdcoVar = this.zzb;
        if (zzdcoVar != null) {
            zzdcoVar.zzc(i2, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdco zzdcoVar = this.zzb;
        if (zzdcoVar != null) {
            zzdcoVar.zzd(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzy(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzz() throws RemoteException {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzz();
        }
    }
}
