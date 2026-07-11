package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfxc {
    final /* synthetic */ zzfxd zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    public final synchronized void zza() {
        try {
            zzfxd zzfxdVar = this.zza;
            if (zzfxdVar.zzb) {
                zzfxg zzfxgVar = zzfxdVar.zza;
                zzfxgVar.zzg(this.zzb);
                zzfxgVar.zzh(this.zzc);
                zzfxgVar.zzi(this.zzd);
                zzfxgVar.zzf(null);
                zzfxgVar.zze();
            }
        } catch (RemoteException e2) {
            Log.d("GASS", "Clearcut log failed", e2);
        }
    }

    public final zzfxc zzb(int i2) {
        this.zzc = i2;
        return this;
    }

    public final zzfxc zzc(int i2) {
        this.zzd = i2;
        return this;
    }

    /* synthetic */ zzfxc(zzfxd zzfxdVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzfxdVar);
        this.zza = zzfxdVar;
        this.zzb = bArr;
    }
}
