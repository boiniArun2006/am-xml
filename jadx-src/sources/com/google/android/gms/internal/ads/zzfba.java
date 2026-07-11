package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzfba {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfoo zzd;
    private final zzdxz zze;
    private long zzf = 0;

    @GuardedBy
    private int zzg = 0;

    public zzfba(Context context, Executor executor, Set set, zzfoo zzfooVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfooVar;
        this.zze = zzdxzVar;
    }

    public final com.google.common.util.concurrent.Xo zza(final Object obj, @Nullable final Bundle bundle, final boolean z2) {
        zzfoe zzfoeVarZzn = zzfoe.zzn(this.zza, 8);
        zzfoeVarZzn.zza();
        Set<zzfax> set = this.zzb;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        zzbgv zzbgvVar = zzbhe.zznh;
        if (!((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).split(","));
        }
        this.zzf = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && bundle != null) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (obj instanceof zzdah) {
                bundle.putLong(zzdxh.CLIENT_SIGNALS_START.zza(), jCurrentTimeMillis);
            } else {
                bundle.putLong(zzdxh.GMS_SIGNALS_START.zza(), jCurrentTimeMillis);
            }
        }
        for (final zzfax zzfaxVar : set) {
            if (!arrayList2.contains(String.valueOf(zzfaxVar.zzb()))) {
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                com.google.common.util.concurrent.Xo xoZza = zzfaxVar.zza();
                final Bundle bundle3 = bundle2;
                xoZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfay
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb(jElapsedRealtime, zzfaxVar, bundle3);
                    }
                }, zzcei.zzg);
                arrayList.add(xoZza);
                bundle2 = bundle3;
            }
        }
        com.google.common.util.concurrent.Xo xoZza2 = zzgzo.zzp(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfaz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Object obj2;
                Bundle bundle4;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzfav zzfavVar = (zzfav) ((com.google.common.util.concurrent.Xo) it.next()).get();
                    if (zzfavVar != null) {
                        boolean z3 = z2;
                        zzfavVar.zza(obj2);
                        if (z3) {
                            zzfavVar.zzb(obj2);
                        }
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle4 = bundle) != null) {
                    Bundle bundle5 = bundle2;
                    long jCurrentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                    if (obj2 instanceof zzdah) {
                        bundle4.putLong(zzdxh.CLIENT_SIGNALS_END.zza(), jCurrentTimeMillis2);
                        bundle4.putBundle("client_sig_latency_key", bundle5);
                        return obj2;
                    }
                    bundle4.putLong(zzdxh.GMS_SIGNALS_END.zza(), jCurrentTimeMillis2);
                    bundle4.putBundle("gms_sig_latency_key", bundle5);
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfor.zza()) {
            zzfon.zzd(xoZza2, this.zzd, zzfoeVarZzn);
        }
        return xoZza2;
    }

    final /* synthetic */ void zzb(long j2, zzfax zzfaxVar, Bundle bundle) {
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j2;
        if (((Boolean) zzbjg.zza.zze()).booleanValue()) {
            String strZza = zzgrt.zza(zzfaxVar.getClass().getCanonicalName());
            StringBuilder sb = new StringBuilder(strZza.length() + 25 + String.valueOf(jElapsedRealtime).length());
            sb.append("Signal runtime (ms) : ");
            sb.append(strZza);
            sb.append(" = ");
            sb.append(jElapsedRealtime);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcQ)).booleanValue()) {
                synchronized (this) {
                    int iZzb = zzfaxVar.zzb();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb).length() + 3);
                    sb2.append("sig");
                    sb2.append(iZzb);
                    bundle.putLong(sb2.toString(), jElapsedRealtime);
                }
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcI)).booleanValue()) {
            return;
        }
        zzdxy zzdxyVarZza = this.zze.zza();
        zzdxyVarZza.zzc(FileUploadManager.f61572j, "lat_ms");
        zzdxyVarZza.zzc(gUxOLwRQBPPLC.rKtGAGcpWZg, "sig_lat_grp");
        zzdxyVarZza.zzc("lat_id", String.valueOf(zzfaxVar.zzb()));
        zzdxyVarZza.zzc("clat_ms", String.valueOf(jElapsedRealtime));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcJ)).booleanValue()) {
            synchronized (this) {
                this.zzg++;
            }
            zzdxyVarZza.zzc("seq_num", com.google.android.gms.ads.internal.zzt.zzh().zzr().zzm());
            synchronized (this) {
                try {
                    if (this.zzg == this.zzb.size() && this.zzf != 0) {
                        this.zzg = 0;
                        String strValueOf = String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzf);
                        if (zzfaxVar.zzb() > 39 && zzfaxVar.zzb() < 52) {
                            zzdxyVarZza.zzc("lat_gmssg", strValueOf);
                        } else {
                            zzdxyVarZza.zzc("lat_clsg", strValueOf);
                        }
                    }
                } finally {
                }
            }
        }
        zzdxyVarZza.zzh();
    }
}
