package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzedy implements zzefe {
    private static final Pattern zzh = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzecz zza;
    private final zzgzy zzb;
    private final zzfjk zzc;
    private final ScheduledExecutorService zzd;
    private final zzehr zze;
    private final zzfoo zzf;
    private final Context zzg;

    zzedy(Context context, zzfjk zzfjkVar, zzecz zzeczVar, zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, zzehr zzehrVar, zzfoo zzfooVar) {
        this.zzg = context;
        this.zzc = zzfjkVar;
        this.zza = zzeczVar;
        this.zzb = zzgzyVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzehrVar;
        this.zzf = zzfooVar;
    }

    final /* synthetic */ zzehr zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzefe
    public final com.google.common.util.concurrent.Xo zza(zzbzu zzbzuVar) {
        Context context = this.zzg;
        com.google.common.util.concurrent.Xo xoZza = this.zza.zza(zzbzuVar);
        zzfoe zzfoeVarZzn = zzfoe.zzn(context, 11);
        zzfon.zzb(xoZza, zzfoeVarZzn);
        com.google.common.util.concurrent.Xo xoZzj = zzgzo.zzj(xoZza, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzedx
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                return this.zza.zzb((zzefg) obj);
            }
        }, this.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgB)).booleanValue()) {
            xoZzj = zzgzo.zzh(zzgzo.zzi(xoZzj, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgC)).intValue(), TimeUnit.SECONDS, this.zzd), TimeoutException.class, zzedw.zza, zzcei.zzg);
        }
        zzfon.zzd(xoZzj, this.zzf, zzfoeVarZzn);
        zzgzo.zzr(xoZzj, new zzedv(this), zzcei.zzg);
        return xoZzj;
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzb(zzefg zzefgVar) {
        return zzgzo.zza(new zzfjc(new zzfiz(this.zzc), zzfjb.zza(new InputStreamReader(zzefgVar.zza()), zzefgVar.zzb().zzm)));
    }
}
