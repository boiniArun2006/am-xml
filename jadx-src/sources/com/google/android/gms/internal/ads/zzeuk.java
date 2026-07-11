package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzeuk implements zzfax {

    @VisibleForTesting
    final zzcdu zza;

    @VisibleForTesting
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzgzy zzd;
    private final Context zze;

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.Xo zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdK)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdP)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdL)).booleanValue()) {
                    return zzgzo.zzk(zzgat.zza(this.zzb.getAppSetIdInfo(), null), zzeuj.zza, zzcei.zzg);
                }
                Task<AppSetIdInfo> taskZzb = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdO)).booleanValue() ? zzfkp.zzb(this.zze) : this.zzb.getAppSetIdInfo();
                if (taskZzb == null) {
                    return zzgzo.zza(new zzeul(null, -1));
                }
                com.google.common.util.concurrent.Xo xoZzj = zzgzo.zzj(zzgat.zza(taskZzb, null), zzeuh.zza, zzcei.zzg);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdM)).booleanValue()) {
                    xoZzj = zzgzo.zzi(xoZzj, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdN)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgzo.zzg(xoZzj, Exception.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzeui
                    @Override // com.google.android.gms.internal.ads.zzgqt
                    public final /* synthetic */ Object apply(Object obj) {
                        this.zza.zza.zzg((Exception) obj, "AppSetIdInfoSignal");
                        return new zzeul(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzgzo.zza(new zzeul(null, -1));
    }

    zzeuk(Context context, zzcdu zzcduVar, ScheduledExecutorService scheduledExecutorService, zzgzy zzgzyVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdO)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzcduVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgzyVar;
    }
}
