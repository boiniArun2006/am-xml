package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfbr implements zzfax {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzgzy zzc;
    private final ScheduledExecutorService zzd;
    private final zzeke zze;
    private final zzfjk zzf;
    private final VersionInfoParcel zzg;

    zzfbr(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, zzeke zzekeVar, zzfjk zzfjkVar, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzgzyVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzekeVar;
        this.zzf = zzfjkVar;
        this.zzg = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.zzb.getPackageName()) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    @Override // com.google.android.gms.internal.ads.zzfax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.common.util.concurrent.Xo zza() {
        com.google.common.util.concurrent.Xo xoZzc;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlR)).booleanValue() && this.zza.zzz()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlV)).booleanValue()) {
                if (this.zzf.zzd.zzy != RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.getValue()) {
                    if (this.zzg.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlP)).intValue()) {
                        if (Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlQ)).intValue()) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlN)).booleanValue()) {
                                String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlO);
                                if (!TextUtils.isEmpty(str)) {
                                }
                            }
                            try {
                                xoZzc = zzgzo.zzi(this.zze.zza(false), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlT)).intValue(), TimeUnit.MILLISECONDS, this.zzd);
                            } catch (Exception e2) {
                                xoZzc = zzgzo.zzc(e2);
                            }
                            zzgzy zzgzyVar = this.zzc;
                            return zzgzo.zzi((zzgzg) zzgzo.zzh((zzgzg) zzgzo.zzj(zzgzg.zzw(xoZzc), zzfbq.zza, zzgzyVar), Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzfbo
                                @Override // com.google.android.gms.internal.ads.zzgyw
                                public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                                    return this.zza.zzc((Throwable) obj);
                                }
                            }, zzgzyVar), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlT)).intValue(), TimeUnit.MILLISECONDS, this.zzd);
                        }
                    }
                }
            }
        }
        return zzgzo.zza(new zzfbs("", -1, null));
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzc(final Throwable th) {
        this.zzc.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlS)).booleanValue();
                Throwable th2 = th;
                if (zBooleanValue) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzi(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        return zzgzo.zza(th instanceof SecurityException ? new zzfbs("", 2, null) : th instanceof IllegalStateException ? new zzfbs("", 3, null) : th instanceof IllegalArgumentException ? new zzfbs("", 4, null) : th instanceof TimeoutException ? new zzfbs("", 5, null) : new zzfbs("", 0, null));
    }
}
