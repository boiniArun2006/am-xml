package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzelo extends zzbvf {
    final /* synthetic */ zzelp zza;
    private final zzekj zzb;

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzf(String str) throws RemoteException {
        ((zzelv) this.zzb.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzelv) this.zzb.zzc).zzx(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzh(zzbuc zzbucVar) throws RemoteException {
        this.zza.zze(zzbucVar);
        ((zzelv) this.zzb.zzc).zzj();
    }

    /* synthetic */ zzelo(zzelp zzelpVar, zzekj zzekjVar, byte[] bArr) {
        Objects.requireNonNull(zzelpVar);
        this.zza = zzelpVar;
        this.zzb = zzekjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zza.zzd((View) ObjectWrapper.unwrap(iObjectWrapper));
        ((zzelv) this.zzb.zzc).zzj();
    }
}
