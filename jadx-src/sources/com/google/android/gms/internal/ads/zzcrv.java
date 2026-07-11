package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcrv {

    @VisibleForTesting
    zzbyr zza;

    @VisibleForTesting
    zzbyr zzb;
    private final Context zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzekc zze;
    private final zzdva zzf;
    private final zzgzy zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    zzcrv(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzekc zzekcVar, zzdva zzdvaVar, zzgzy zzgzyVar, zzgzy zzgzyVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = zzgVar;
        this.zze = zzekcVar;
        this.zzf = zzdvaVar;
        this.zzg = zzgzyVar;
        this.zzh = zzgzyVar2;
        this.zzi = scheduledExecutorService;
    }

    final /* synthetic */ Context zzi() {
        return this.zzc;
    }

    final /* synthetic */ zzgzy zzj() {
        return this.zzg;
    }

    private final com.google.common.util.concurrent.Xo zzk(final String str, @Nullable final InputEvent inputEvent, Random random) {
        try {
            if (!str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlF)) || this.zzd.zzx()) {
                return zzgzo.zza(str);
            }
            final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlG), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (inputEvent != null) {
                return (zzgzg) zzgzo.zzh((zzgzg) zzgzo.zzj(zzgzg.zzw(this.zze.zza()), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcrp
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                        return this.zza.zze(builderBuildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.zzh), Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcrq
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                        return this.zza.zzf(builderBuildUpon, (Throwable) obj);
                    }
                }, this.zzg);
            }
            builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlH), "11");
            return zzgzo.zza(builderBuildUpon.toString());
        } catch (Exception e2) {
            return zzgzo.zzc(e2);
        }
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzd(String str, final Throwable th) {
        this.zzg.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzh(th);
            }
        });
        return zzgzo.zza(str);
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzf(Uri.Builder builder, final Throwable th) {
        this.zzg.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(th);
            }
        });
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlH), "9");
        return zzgzo.zza(builder.toString());
    }

    final /* synthetic */ void zzg(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlM)).booleanValue()) {
            zzbyr zzbyrVarZzc = zzbyp.zzc(this.zzc);
            this.zzb = zzbyrVarZzc;
            zzbyrVarZzc.zzh(th, "AttributionReporting");
        } else {
            zzbyr zzbyrVarZza = zzbyp.zza(this.zzc);
            this.zza = zzbyrVarZza;
            zzbyrVarZza.zzh(th, "AttributionReportingSampled");
        }
    }

    final /* synthetic */ void zzh(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlM)).booleanValue()) {
            zzbyr zzbyrVarZzc = zzbyp.zzc(this.zzc);
            this.zzb = zzbyrVarZzc;
            zzbyrVarZzc.zzh(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            zzbyr zzbyrVarZza = zzbyp.zza(this.zzc);
            this.zza = zzbyrVarZza;
            zzbyrVarZza.zzh(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    public static boolean zzc(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlF));
    }

    public final void zza(String str, zzfqk zzfqkVar, Random random, @Nullable com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzgzo.zzr(zzgzo.zzi(zzk(str, this.zzf.zzb(), random), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlL)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzcro(this, zzfqkVar, str, zzvVar), this.zzg);
    }

    public final com.google.common.util.concurrent.Xo zzb(final String str, Random random) {
        if (TextUtils.isEmpty(str)) {
            return zzgzo.zza(str);
        }
        return zzgzo.zzh(zzk(str, this.zzf.zzb(), random), Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcru
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                return this.zza.zzd(str, (Throwable) obj);
            }
        }, this.zzg);
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zze(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() == 1) {
            Uri.Builder builderBuildUpon = builder.build().buildUpon();
            builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlI), "1");
            builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlH), "12");
            if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlJ))) {
                builderBuildUpon.authority((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlK));
            }
            return (zzgzg) zzgzo.zzj(zzgzg.zzw(this.zze.zzb(builderBuildUpon.build(), inputEvent)), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcrr
                @Override // com.google.android.gms.internal.ads.zzgyw
                public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                    String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlH);
                    Uri.Builder builder2 = builder;
                    builder2.appendQueryParameter(str2, "12");
                    return zzgzo.zza(builder2.toString());
                }
            }, this.zzh);
        }
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlH), "10");
        return zzgzo.zza(builder.toString());
    }
}
