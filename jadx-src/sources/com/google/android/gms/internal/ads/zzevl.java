package com.google.android.gms.internal.ads;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.google.android.gms.common.util.Clock;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzevl implements zzfax {
    private final AtomicReference zza = new AtomicReference();
    private final AtomicReference zzb = new AtomicReference(Boolean.FALSE);
    private final Clock zzc;
    private final Executor zzd;
    private final zzfax zze;
    private final long zzf;
    private final zzdxz zzg;

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.Xo zza() {
        zzevi zzeviVar;
        zzevi zzeviVar2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznk)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznj)).booleanValue() && !((Boolean) this.zzb.getAndSet(Boolean.TRUE)).booleanValue()) {
                ScheduledExecutorService scheduledExecutorService = zzcei.zzd;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzevk
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzc();
                    }
                };
                long j2 = this.zzf;
                scheduledExecutorService.scheduleWithFixedDelay(runnable, j2, j2, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    AtomicReference atomicReference = this.zza;
                    zzeviVar = (zzevi) atomicReference.get();
                    if (zzeviVar == null) {
                        zzevi zzeviVar3 = new zzevi(this.zze.zza(), this.zzf, this.zzc);
                        atomicReference.set(zzeviVar3);
                        return zzeviVar3.zza;
                    }
                    if (!((Boolean) this.zzb.get()).booleanValue() && zzeviVar.zza()) {
                        com.google.common.util.concurrent.Xo xo = zzeviVar.zza;
                        zzfax zzfaxVar = this.zze;
                        zzeviVar2 = new zzevi(zzfaxVar.zza(), this.zzf, this.zzc);
                        this.zza.set(zzeviVar2);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznl)).booleanValue()) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznm)).booleanValue()) {
                                zzdxy zzdxyVarZza = this.zzg.zza();
                                zzdxyVarZza.zzc(FileUploadManager.f61572j, "scs");
                                zzdxyVarZza.zzc(CmcdConfiguration.KEY_SESSION_ID, String.valueOf(zzfaxVar.zzb()));
                                zzdxyVarZza.zzd();
                            }
                            return xo;
                        }
                        zzeviVar = zzeviVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            AtomicReference atomicReference2 = this.zza;
            zzeviVar = (zzevi) atomicReference2.get();
            if (zzeviVar == null || zzeviVar.zza()) {
                zzfax zzfaxVar2 = this.zze;
                zzeviVar2 = new zzevi(zzfaxVar2.zza(), this.zzf, this.zzc);
                atomicReference2.set(zzeviVar2);
                zzeviVar = zzeviVar2;
            }
        }
        return zzeviVar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return this.zze.zzb();
    }

    final /* synthetic */ void zzc() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd();
            }
        });
    }

    final /* synthetic */ void zzd() {
        this.zza.set(new zzevi(this.zze.zza(), this.zzf, this.zzc));
    }

    public zzevl(zzfax zzfaxVar, long j2, Clock clock, Executor executor, zzdxz zzdxzVar) {
        this.zzc = clock;
        this.zze = zzfaxVar;
        this.zzf = j2;
        this.zzd = executor;
        this.zzg = zzdxzVar;
    }
}
