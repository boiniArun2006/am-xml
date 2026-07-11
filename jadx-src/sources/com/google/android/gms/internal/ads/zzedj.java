package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzedj implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzedj(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzedj zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzedj(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        zzfnu zzfnuVar = (zzfnu) this.zza.zzb();
        final CookieManager cookieManagerZza = com.google.android.gms.ads.internal.zzt.zzf().zza((Context) this.zzb.zzb());
        zzfno zzfnoVar = zzfno.WEBVIEW_COOKIE;
        Objects.requireNonNull(zzfnuVar);
        return zzfnf.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzede
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                CookieManager cookieManager = cookieManagerZza;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbu));
            }
        }, zzfnoVar, zzfnuVar).zzh(1L, TimeUnit.SECONDS).zzf(Exception.class, zzedb.zza).zzi();
    }
}
