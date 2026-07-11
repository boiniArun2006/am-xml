package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzbfx implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbfp zza;
    final /* synthetic */ zzcen zzb;
    final /* synthetic */ zzbfz zzc;

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
    }

    zzbfx(zzbfz zzbfzVar, zzbfp zzbfpVar, zzcen zzcenVar) {
        this.zza = zzbfpVar;
        this.zzb = zzcenVar;
        Objects.requireNonNull(zzbfzVar);
        this.zzc = zzbfzVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        zzbfz zzbfzVar = this.zzc;
        synchronized (zzbfzVar.zzf()) {
            try {
                if (zzbfzVar.zzd()) {
                    return;
                }
                zzbfzVar.zze(true);
                final zzbfo zzbfoVarZzc = zzbfzVar.zzc();
                if (zzbfoVarZzc == null) {
                    return;
                }
                zzgzy zzgzyVar = zzcei.zza;
                final zzbfp zzbfpVar = this.zza;
                final zzcen zzcenVar = this.zzb;
                final com.google.common.util.concurrent.Xo xoSubmit = zzgzyVar.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbfw
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzcen zzcenVar2 = zzcenVar;
                        zzbfo zzbfoVar = zzbfoVarZzc;
                        zzbfx zzbfxVar = this.zza;
                        try {
                            zzbfr zzbfrVarZzq = zzbfoVar.zzq();
                            boolean zZzp = zzbfoVar.zzp();
                            zzbfp zzbfpVar2 = zzbfpVar;
                            zzbfm zzbfmVarZzf = zZzp ? zzbfrVarZzq.zzf(zzbfpVar2) : zzbfrVarZzq.zze(zzbfpVar2);
                            if (!zzbfmVarZzf.zza()) {
                                zzcenVar2.zzd(new RuntimeException("No entry contents."));
                                zzbfxVar.zzc.zzb();
                                return;
                            }
                            zzbfu zzbfuVar = new zzbfu(zzbfxVar, zzbfmVarZzf.zzb(), 1);
                            int i2 = zzbfuVar.read();
                            if (i2 == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            zzbfuVar.unread(i2);
                            zzcenVar2.zzc(zzbgb.zza(zzbfuVar, zzbfmVarZzf.zzd(), zzbfmVarZzf.zzg(), zzbfmVarZzf.zzf(), zzbfmVarZzf.zze()));
                        } catch (RemoteException e2) {
                            e = e2;
                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                            zzcenVar2.zzd(e);
                            zzbfxVar.zzc.zzb();
                        } catch (IOException e3) {
                            e = e3;
                            int i32 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                            zzcenVar2.zzd(e);
                            zzbfxVar.zzc.zzb();
                        }
                    }
                });
                zzcenVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbfv
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        if (zzcenVar.isCancelled()) {
                            xoSubmit.cancel(true);
                        }
                    }
                }, zzcei.zzg);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
