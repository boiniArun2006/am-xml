package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.Clock;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdae implements com.google.android.gms.ads.internal.overlay.zzr {
    private final zzfjc zzc;
    private final zzfir zzd;
    private final Clock zze;
    private final zzdxz zzf;
    private final ScheduledExecutorService zzg;
    private final Object zzb = new Object();

    @VisibleForTesting
    final zzfpk zza = zzfpl.zza();
    private boolean zzh = false;
    private boolean zzi = false;

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdS() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT(int i2) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        zzo(3);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        zzo(5);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
        zzo(4);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzo(7);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
        zzo(6);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    private final void zzn() {
        synchronized (this.zzb) {
            try {
                zzdxz zzdxzVar = this.zzf;
                String str = this.zzc.zzb.zzb.zzb;
                String strEncodeToString = Base64.encodeToString(((zzfpl) this.zza.zzbu()).zzaN(), 1);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzop)).booleanValue()) {
                    zzdxy zzdxyVarZza = zzdxzVar.zza();
                    zzdxyVarZza.zzc(FileUploadManager.f61572j, "pclma");
                    zzdxyVarZza.zzc("pclmd", strEncodeToString);
                    zzdxyVarZza.zzc("gqi", str);
                    zzdxyVarZza.zzf();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzo(int i2) {
        synchronized (this.zzb) {
            try {
                if (!this.zzi && this.zzh) {
                    zzfpk zzfpkVar = this.zza;
                    zzfoc zzfocVarZza = zzfod.zza();
                    zzfocVarZza.zzb(i2);
                    zzfocVarZza.zza(this.zze.currentTimeMillis());
                    zzfpkVar.zza((zzfod) zzfocVarZza.zzbu());
                    if (i2 == 10) {
                        zzn();
                        this.zzi = true;
                    }
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
        zzo(8);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
        zzo(9);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
        zzo(10);
    }

    public final void zzl() {
        synchronized (this.zzb) {
            if (this.zzd.zzaE > 0 && !this.zzh) {
                this.zza.zzb(this.zze.currentTimeMillis());
                this.zzh = true;
                this.zzg.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdad
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzm();
                    }
                }, this.zzd.zzaE, TimeUnit.MILLISECONDS);
            }
        }
    }

    final /* synthetic */ void zzm() {
        synchronized (this.zzb) {
            try {
                if (this.zzi) {
                    return;
                }
                this.zzi = true;
                zzn();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    zzdae(zzfjc zzfjcVar, zzfir zzfirVar, Clock clock, zzdxz zzdxzVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = zzfjcVar;
        this.zzd = zzfirVar;
        this.zze = clock;
        this.zzf = zzdxzVar;
        this.zzg = scheduledExecutorService;
    }
}
