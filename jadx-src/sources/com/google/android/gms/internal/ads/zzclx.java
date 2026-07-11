package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzclx {

    @Nullable
    private String zza;

    @Nullable
    private zziff zzb;

    @Nullable
    private zzijc zzc;
    private final ScheduledExecutorService zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);

    @Nullable
    public final String zzc() {
        return this.zza;
    }

    @Nullable
    public final zziff zzd() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        try {
            String strXMQ = WebViewFeature.n("GET_VARIATIONS_HEADER") ? WebViewCompat.xMQ() : null;
            if (strXMQ != null && !strXMQ.isEmpty()) {
                this.zza = strXMQ;
                byte[] bArrDecode = Base64.decode(strXMQ, 10);
                this.zzb = zziff.zzc(bArrDecode, zzibb.zzb());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkk)).booleanValue()) {
                    this.zzc = zzijc.zzc(bArrDecode, zzibb.zzb());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzki)).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkh)).booleanValue()) {
                        this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclw
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zze();
                            }
                        }, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkj)).intValue(), TimeUnit.MINUTES);
                    }
                }
            }
        } catch (zzicg e2) {
            e = e2;
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "ChromeVariations");
        } catch (IllegalArgumentException e3) {
            e = e3;
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "ChromeVariations");
        }
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkh)).booleanValue() && !this.zze.getAndSet(true)) {
            zze();
        }
    }

    @Nullable
    public final String zzb() {
        zzijc zzijcVar = this.zzc;
        if (zzijcVar != null) {
            return Base64.encodeToString(zzijcVar.zzaN(), 10);
        }
        return null;
    }

    zzclx(zzclk zzclkVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzd = scheduledExecutorService;
    }
}
