package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbgh {
    final /* synthetic */ zzbgi zza;
    private final byte[] zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzc() {
        try {
            zzbgi zzbgiVar = this.zza;
            if (zzbgiVar.zzb) {
                zzbgiVar.zza.zzh(this.zzb);
                zzbgiVar.zza.zzi(0);
                zzbgiVar.zza.zzj(this.zzc);
                zzbgiVar.zza.zzg(null);
                zzbgiVar.zza.zzf();
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Clearcut log failed", e2);
        }
    }

    public final synchronized void zza() {
        this.zza.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbgg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc();
            }
        });
    }

    public final zzbgh zzb(int i2) {
        this.zzc = i2;
        return this;
    }

    /* synthetic */ zzbgh(zzbgi zzbgiVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzbgiVar);
        this.zza = zzbgiVar;
        this.zzb = bArr;
    }
}
