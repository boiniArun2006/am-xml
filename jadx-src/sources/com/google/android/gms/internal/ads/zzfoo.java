package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.vungle.ads.internal.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfoo implements Runnable {
    private final zzfor zzb;
    private String zzc;
    private String zze;
    private zzfjb zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private Future zzh;
    private final List zza = new ArrayList();
    private int zzi = 2;
    private zzfot zzd = zzfot.SCAR_REQUEST_TYPE_UNSPECIFIED;

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzh();
    }

    public final synchronized zzfoo zza(zzfoe zzfoeVar) {
        try {
            if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
                List list = this.zza;
                zzfoeVar.zzc();
                list.add(zzfoeVar);
                Future future = this.zzh;
                if (future != null) {
                    future.cancel(false);
                }
                this.zzh = zzcei.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkd)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfoo zzb(ArrayList arrayList) {
        try {
            if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains(AdFormat.BANNER.name())) {
                    this.zzi = 3;
                } else if (arrayList.contains(Constants.PLACEMENT_TYPE_INTERSTITIAL) || arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    this.zzi = 4;
                } else if (arrayList.contains("native") || arrayList.contains(AdFormat.NATIVE.name())) {
                    this.zzi = 8;
                } else if (arrayList.contains(Constants.PLACEMENT_TYPE_REWARDED) || arrayList.contains(AdFormat.REWARDED.name())) {
                    this.zzi = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.zzi = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                    this.zzi = 6;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfoo zzc(String str) {
        if (((Boolean) zzbix.zzc.zze()).booleanValue() && zzfon.zza(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfoo zzd(Bundle bundle) {
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            this.zzd = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(bundle);
        }
        return this;
    }

    public final synchronized zzfoo zze(zzfjb zzfjbVar) {
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            this.zzf = zzfjbVar;
        }
        return this;
    }

    public final synchronized zzfoo zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            this.zzg = zzeVar;
        }
        return this;
    }

    public final synchronized zzfoo zzg(String str) {
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            this.zze = str;
        }
        return this;
    }

    public final synchronized void zzh() {
        try {
            if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
                Future future = this.zzh;
                if (future != null) {
                    future.cancel(false);
                }
                List<zzfoe> list = this.zza;
                for (zzfoe zzfoeVar : list) {
                    int i2 = this.zzi;
                    if (i2 != 2) {
                        zzfoeVar.zzp(i2);
                    }
                    if (!TextUtils.isEmpty(this.zzc)) {
                        zzfoeVar.zze(this.zzc);
                    }
                    if (!TextUtils.isEmpty(this.zze) && !zzfoeVar.zzl()) {
                        zzfoeVar.zzi(this.zze);
                    }
                    zzfjb zzfjbVar = this.zzf;
                    if (zzfjbVar != null) {
                        zzfoeVar.zzg(zzfjbVar);
                    } else {
                        com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
                        if (zzeVar != null) {
                            zzfoeVar.zzh(zzeVar);
                        }
                    }
                    zzfoeVar.zzf(this.zzd);
                    this.zzb.zzb(zzfoeVar.zzm());
                }
                list.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzfoo zzi(int i2) {
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            this.zzi = i2;
        }
        return this;
    }

    zzfoo(zzfor zzforVar) {
        this.zzb = zzforVar;
    }
}
