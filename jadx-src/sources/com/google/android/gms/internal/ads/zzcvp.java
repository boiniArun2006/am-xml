package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcvp implements zzbde {

    @Nullable
    private final zzcjl zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    @Override // com.google.android.gms.internal.ads.zzbde
    public final synchronized void zzdj(zzbdd zzbddVar) {
        final zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzob)).booleanValue()) {
                if (zzbddVar.zzj) {
                    AtomicReference atomicReference = this.zzc;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvo
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzcjlVar.onResume();
                            }
                        });
                    }
                } else {
                    AtomicReference atomicReference2 = this.zzc;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvn
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzcjlVar.onPause();
                            }
                        });
                    }
                }
            }
        }
    }

    zzcvp(@Nullable zzcjl zzcjlVar, Executor executor) {
        this.zza = zzcjlVar;
        this.zzb = executor;
    }
}
