package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzemi extends zzbvi {
    private final zzekj zza;

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zze() throws RemoteException {
        ((zzelv) this.zza.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzf(String str) throws RemoteException {
        ((zzelv) this.zza.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzelv) this.zza.zzc).zzx(zzeVar);
    }

    /* synthetic */ zzemi(zzemj zzemjVar, zzekj zzekjVar, byte[] bArr) {
        Objects.requireNonNull(zzemjVar);
        this.zza = zzekjVar;
    }
}
