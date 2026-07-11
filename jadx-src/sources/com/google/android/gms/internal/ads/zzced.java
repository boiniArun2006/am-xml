package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzced {

    @Nullable
    private zzgzy zza;

    @Nullable
    private zzdxz zzb;
    private Context zzc;
    private final AtomicBoolean zzd = new AtomicBoolean(false);
    private final AtomicBoolean zze = new AtomicBoolean(false);
    private long zzf = -1;
    private long zzg = -1;

    public final void zza(zzgzy zzgzyVar, zzdxz zzdxzVar, Context context) {
        if (this.zzd.getAndSet(true)) {
            return;
        }
        this.zza = zzgzyVar;
        this.zzb = zzdxzVar;
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpl)).longValue();
        this.zzg = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpm)).longValue();
        this.zzc = context;
    }

    public final void zzb() {
        zzgzy zzgzyVar;
        if (!this.zzd.get() || this.zzf < 0 || this.zzg < 0 || !this.zze.compareAndSet(false, true) || (zzgzyVar = this.zza) == null) {
            return;
        }
        zzgzyVar.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc();
            }
        });
    }

    final /* synthetic */ void zzc() {
        zzdxz zzdxzVar;
        ActivityManager.MemoryInfo memoryInfoZze;
        while (this.zze.get()) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcea
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    atomicBoolean.getAndSet(true);
                }
            });
            try {
                Thread.sleep(this.zzf);
                if (!atomicBoolean.get()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpn)).booleanValue() && (zzdxzVar = this.zzb) != null) {
                        zzdxy zzdxyVarZza = zzdxzVar.zza();
                        zzdxyVarZza.zzc(FileUploadManager.f61572j, "panr");
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpP)).booleanValue() && (memoryInfoZze = com.google.android.gms.ads.internal.util.client.zzf.zze(this.zzc)) != null) {
                            zzdxyVarZza.zzc("mem_avl", String.valueOf(memoryInfoZze.availMem));
                            zzdxyVarZza.zzc("mem_tt", String.valueOf(memoryInfoZze.totalMem));
                            zzdxyVarZza.zzc("low_m", true != memoryInfoZze.lowMemory ? "0" : "1");
                        }
                        zzdxyVarZza.zzf();
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpo)).booleanValue()) {
                        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                        zzcec zzcecVar = new zzcec("Potential ANR detected");
                        zzcecVar.setStackTrace(stackTrace);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpp)).booleanValue()) {
                            zzbyp.zzc(this.zzc).zzi(zzcecVar, "AnrWatchdog", ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpq)).intValue() / 100.0f);
                        } else {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(zzcecVar, "AnrWatchdog");
                        }
                    }
                }
                do {
                    try {
                        Thread.sleep(this.zzg);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                } while (!atomicBoolean.get());
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
