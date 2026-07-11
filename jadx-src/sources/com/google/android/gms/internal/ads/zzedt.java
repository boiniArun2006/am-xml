package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzedt {
    private final ScheduledExecutorService zza;
    private final zzgzy zzb;
    private final zzgzy zzc;
    private final zzees zzd;
    private final zzika zze;

    public zzedt(ScheduledExecutorService scheduledExecutorService, zzgzy zzgzyVar, zzgzy zzgzyVar2, zzees zzeesVar, zzika zzikaVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgzyVar;
        this.zzc = zzgzyVar2;
        this.zzd = zzeesVar;
        this.zze = zzikaVar;
    }

    public final com.google.common.util.concurrent.Xo zza(final zzbzu zzbzuVar) {
        com.google.common.util.concurrent.Xo xoSubmit;
        String str = zzbzuVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzH(str)) {
            xoSubmit = zzgzo.zzc(new zzeff(1));
        } else {
            xoSubmit = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziv)).booleanValue() || ((Boolean) zzbjp.zza.zze()).booleanValue()) ? this.zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzedq
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzc(zzbzuVar);
                }
            }) : this.zzd.zza(zzbzuVar);
        }
        final int callingUid = Binder.getCallingUid();
        return (zzgzg) zzgzo.zzh((zzgzg) zzgzo.zzi(zzgzg.zzw(xoSubmit), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgC)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzeds
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                return this.zza.zzb(zzbzuVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzb(final zzbzu zzbzuVar, int i2, Throwable th) {
        Bundle bundle;
        if (zzbzuVar != null && (bundle = zzbzuVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgzo.zzj(((zzegw) this.zze.zzb()).zzk(zzbzuVar, i2), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzedr
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                return zzgzo.zza(new zzefg((InputStream) obj, zzbzuVar));
            }
        }, this.zzb);
    }

    final /* synthetic */ zzefg zzc(zzbzu zzbzuVar) {
        return (zzefg) this.zzd.zza(zzbzuVar).get(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgC)).intValue(), TimeUnit.SECONDS);
    }
}
