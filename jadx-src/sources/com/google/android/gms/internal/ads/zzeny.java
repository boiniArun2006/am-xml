package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzeny implements zzgyw {
    private final zzfnu zza;
    private final zzdbh zzb;
    private final zzfqg zzc;
    private final zzfqk zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcwi zzg;
    private final zzenr zzh;
    private final zzekl zzi;
    private final Context zzj;
    private final zzfoo zzk;
    private final zzenb zzl;
    private final zzdxt zzm;

    zzeny(Context context, zzfnu zzfnuVar, zzenr zzenrVar, zzdbh zzdbhVar, zzfqg zzfqgVar, zzfqk zzfqkVar, zzcwi zzcwiVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzekl zzeklVar, zzfoo zzfooVar, zzenb zzenbVar, zzdxt zzdxtVar) {
        this.zzj = context;
        this.zza = zzfnuVar;
        this.zzh = zzenrVar;
        this.zzb = zzdbhVar;
        this.zzc = zzfqgVar;
        this.zzd = zzfqkVar;
        this.zzg = zzcwiVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzeklVar;
        this.zzk = zzfooVar;
        this.zzl = zzenbVar;
        this.zzm = zzdxtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static String zzb(zzfjc zzfjcVar) {
        String string = "No fill.";
        String str = true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgA)).booleanValue() ? "No ad config." : "No fill.";
        zzfiu zzfiuVar = zzfjcVar.zzb.zzb;
        int i2 = zzfiuVar.zzf;
        if (i2 == 0) {
            string = str;
        } else if (i2 >= 200 && i2 < 300) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgz)).booleanValue()) {
            }
        } else if (i2 < 300 || i2 >= 400) {
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 35);
            sb.append("Received error HTTP response code: ");
            sb.append(i2);
            string = sb.toString();
        } else {
            string = "No location header to follow redirect or too many redirects.";
        }
        zzfit zzfitVar = zzfiuVar.zzj;
        return zzfitVar != null ? zzfitVar.zza() : string;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) throws Exception {
        int i2;
        Bundle bundle;
        final zzfjc zzfjcVar = (zzfjc) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle = zzfjcVar.zzb.zzd) != null) {
            this.zzm.zze().putAll(bundle);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcL)).booleanValue()) {
            this.zzm.zze().putLong(zzdxh.RENDERING_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        String strZzb = zzb(zzfjcVar);
        zzekl zzeklVar = this.zzi;
        zzfjb zzfjbVar = zzfjcVar.zzb;
        zzfiu zzfiuVar = zzfjbVar.zzb;
        zzeklVar.zza(zzfiuVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjE)).booleanValue() && (i2 = zzfiuVar.zzf) != 0 && (i2 < 200 || i2 >= 300)) {
            return zzgzo.zzc(new zzenv(3, strZzb));
        }
        String str = zzfiuVar.zzq;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzev)).booleanValue() || TextUtils.isEmpty(str)) {
            for (zzfir zzfirVar : zzfjbVar.zza) {
                zzeklVar.zzb(zzfirVar);
                Iterator it = zzfirVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzeklVar.zze(zzfirVar, 0L, zzfkm.zzd(1, null, null));
                        break;
                    }
                    zzekg zzekgVarZza = this.zzg.zza(zzfirVar.zzb, (String) it.next());
                    if (zzekgVarZza == null || !zzekgVarZza.zza(zzfjcVar, zzfirVar)) {
                    }
                }
            }
        } else {
            zzeklVar.zzc(str, zzfjbVar.zza);
        }
        zzdbh zzdbhVar = this.zzb;
        zzcrz zzcrzVar = new zzcrz(zzfjcVar, this.zzd, this.zzc);
        Executor executor = this.zze;
        zzdbhVar.zzq(zzcrzVar, executor);
        if (zzfiuVar.zzr > 1) {
            return this.zzl.zza(zzfjcVar);
        }
        String strZzb2 = zzb(zzfjcVar);
        zzfnu zzfnuVar = this.zza;
        zzfno zzfnoVar = zzfno.RENDER_CONFIG_INIT;
        Objects.requireNonNull(zzfnuVar);
        zzfnb zzfnbVarZzi = zzfnf.zza(zzgzo.zzc(new zzenv(3, strZzb2)), zzfnoVar, zzfnuVar).zzi();
        final zzenr zzenrVar = this.zzh;
        zzenrVar.zza();
        int i3 = 0;
        for (final zzfir zzfirVar2 : zzfjbVar.zza) {
            Iterator it2 = zzfirVar2.zza.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                final zzekg zzekgVarZza2 = this.zzg.zza(zzfirVar2.zzb, str2);
                if (zzekgVarZza2 != null && zzekgVarZza2.zza(zzfjcVar, zzfirVar2)) {
                    zzfnl zzfnlVarZza = zzfnuVar.zza(zzfno.RENDER_CONFIG_WATERFALL, zzfnbVarZzi);
                    StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 15 + String.valueOf(str2).length());
                    sb.append("render-config-");
                    sb.append(i3);
                    sb.append("-");
                    sb.append(str2);
                    zzfnbVarZzi = zzfnlVarZza.zza(sb.toString()).zzg(Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzenx
                        @Override // com.google.android.gms.internal.ads.zzgyw
                        public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj2) {
                            return this.zza.zzc(zzfirVar2, zzfjcVar, zzekgVarZza2, (Throwable) obj2);
                        }
                    }).zzi();
                    break;
                }
            }
            i3++;
        }
        zzfnbVarZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzenrVar.zzb();
            }
        }, executor);
        return zzfnbVarZzi;
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzc(zzfir zzfirVar, zzfjc zzfjcVar, zzekg zzekgVar, Throwable th) {
        zzfoe zzfoeVarZzn = zzfoe.zzn(this.zzj, 12);
        zzfoeVarZzn.zzi(zzfirVar.zzE);
        zzfoeVarZzn.zza();
        com.google.common.util.concurrent.Xo xoZzi = zzgzo.zzi(zzekgVar.zzb(zzfjcVar, zzfirVar), zzfirVar.zzR, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zze(zzfjcVar, zzfirVar, xoZzi, this.zzc);
        zzfon.zzd(xoZzi, this.zzk, zzfoeVarZzn);
        return xoZzi;
    }
}
