package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgoa implements zzgnb, zzgdd {
    static final String[] zza = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    private final Context zzb;
    private final ExecutorService zzc;
    private final String[] zzd;
    private long zze = 0;
    private long zzf = 0;
    private long zzg = -1;
    private boolean zzh = false;

    zzgoa(Context context, zzgao zzgaoVar, ExecutorService executorService, String[] strArr) {
        this.zzb = context;
        this.zzc = executorService;
        this.zzd = strArr;
    }

    final void zze() {
        synchronized (this) {
            try {
                if (this.zzh) {
                    this.zzf = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void zzg(long j2) {
        this.zze = j2;
    }

    final /* synthetic */ long zzh() {
        return this.zzf;
    }

    final /* synthetic */ void zzi(long j2) {
        this.zzg = j2;
    }

    final /* synthetic */ void zzj(boolean z2) {
        this.zzh = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final com.google.common.util.concurrent.Xo zza() {
        return Build.VERSION.SDK_INT < 30 ? zzgzo.zzb() : zzgzo.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgnz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf();
            }
        }, this.zzc);
    }

    final /* synthetic */ void zzf() {
        zzgny zzgnyVar = new zzgny(this);
        try {
            Object systemService = this.zzb.getSystemService("appops");
            if (systemService == null) {
                throw null;
            }
            ((AppOpsManager) systemService).startWatchingActive(this.zzd, this.zzc, zzgnyVar);
        } catch (Throwable unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzb(Map map) {
        long j2;
        long j3;
        zze();
        synchronized (this) {
            try {
                if (this.zzh) {
                    j2 = this.zzf - this.zze;
                } else {
                    j2 = -1;
                }
            } finally {
            }
        }
        map.put("vs", Long.valueOf(j2));
        synchronized (this) {
            j3 = this.zzg;
            this.zzg = -1L;
        }
        map.put("vf", Long.valueOf(j3));
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzc(Map map, Context context, View view) {
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzd(Map map) {
        zze();
    }
}
