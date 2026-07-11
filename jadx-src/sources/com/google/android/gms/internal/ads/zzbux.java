package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbux extends zzbty {
    private final Adapter zza;
    private final zzcar zzb;

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzh() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzk() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzl(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzm(zzblm zzblmVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzn() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzp(@Nullable zzcas zzcasVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzq() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzs(int i2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzu() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzv(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzw(int i2, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zze() throws RemoteException {
        zzcar zzcarVar = this.zzb;
        if (zzcarVar != null) {
            zzcarVar.zzl(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzf() throws RemoteException {
        zzcar zzcarVar = this.zzb;
        if (zzcarVar != null) {
            zzcarVar.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzg(int i2) throws RemoteException {
        zzcar zzcarVar = this.zzb;
        if (zzcarVar != null) {
            zzcarVar.zzm(ObjectWrapper.wrap(this.zza), i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzi() throws RemoteException {
        zzcar zzcarVar = this.zzb;
        if (zzcarVar != null) {
            zzcarVar.zzh(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzj() throws RemoteException {
        zzcar zzcarVar = this.zzb;
        if (zzcarVar != null) {
            zzcarVar.zzg(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzo() throws RemoteException {
        zzcar zzcarVar = this.zzb;
        if (zzcarVar != null) {
            zzcarVar.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzr(zzcaw zzcawVar) throws RemoteException {
        zzcar zzcarVar = this.zzb;
        if (zzcarVar != null) {
            zzcarVar.zzk(ObjectWrapper.wrap(this.zza), new zzcas(zzcawVar.zze(), zzcawVar.zzf()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzt() throws RemoteException {
        zzcar zzcarVar = this.zzb;
        if (zzcarVar != null) {
            zzcarVar.zzo(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzz() throws RemoteException {
        zzcar zzcarVar = this.zzb;
        if (zzcarVar != null) {
            zzcarVar.zzp(ObjectWrapper.wrap(this.zza));
        }
    }

    zzbux(Adapter adapter, zzcar zzcarVar) {
        this.zza = adapter;
        this.zzb = zzcarVar;
    }
}
