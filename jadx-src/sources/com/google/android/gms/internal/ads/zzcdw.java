package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.applovin.impl.zpl;
import com.google.android.gms.ads.AdActivity;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.l;
import d8q.jqQ.QTafcm;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzcdw {

    @VisibleForTesting
    final String zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzl;

    @VisibleForTesting
    long zza = -1;

    @VisibleForTesting
    long zzb = -1;

    @VisibleForTesting
    int zzc = -1;

    @VisibleForTesting
    int zzd = -1;

    @VisibleForTesting
    long zze = 0;
    private final Object zzj = new Object();
    private final Object zzk = new Object();

    @VisibleForTesting
    int zzg = 0;

    @VisibleForTesting
    int zzh = 0;

    @VisibleForTesting
    int zzi = 0;
    private int zzm = 0;
    private final Map zzn = new HashMap();
    private final Map zzo = new HashMap();

    private final void zzj() {
        if (((Boolean) zzbjl.zza.zze()).booleanValue()) {
            synchronized (this.zzj) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final void zza() {
        synchronized (this.zzj) {
            this.zzg++;
        }
    }

    public final void zzb() {
        synchronized (this.zzj) {
            this.zzh++;
        }
    }

    public final void zzc() {
        synchronized (this.zzj) {
            this.zzi++;
        }
    }

    public final int zzd() {
        int i2;
        synchronized (this.zzj) {
            i2 = this.zzi;
        }
        return i2;
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzm zzmVar, long j2) {
        Bundle bundle;
        synchronized (this.zzj) {
            try {
                com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzl;
                long jZzm = zzgVar.zzm();
                long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                if (this.zzb == -1) {
                    if (jCurrentTimeMillis - jZzm > ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbB)).longValue()) {
                        this.zzd = -1;
                    } else {
                        this.zzd = zzgVar.zzo();
                    }
                    this.zzb = j2;
                    this.zza = j2;
                } else {
                    this.zza = j2;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzew)).booleanValue() || (bundle = zzmVar.zzc) == null || bundle.getInt("gw", 2) != 1) {
                    this.zzc++;
                    int i2 = this.zzd + 1;
                    this.zzd = i2;
                    if (i2 == 0) {
                        this.zze = 0L;
                        zzgVar.zzp(jCurrentTimeMillis);
                    } else {
                        this.zze = jCurrentTimeMillis - zzgVar.zzq();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bundle zzh(Context context, String str) {
        Bundle bundle;
        synchronized (this.zzj) {
            try {
                bundle = new Bundle();
                if (!this.zzl.zzx()) {
                    bundle.putString("session_id", this.zzf);
                }
                bundle.putLong("basets", this.zzb);
                bundle.putLong("currts", this.zza);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.zzc);
                bundle.putInt("preqs_in_session", this.zzd);
                bundle.putLong("time_in_session", this.zze);
                bundle.putInt("pclick", this.zzg);
                bundle.putInt("pimp", this.zzh);
                Context contextZza = zzcae.zza(context);
                int identifier = contextZza.getResources().getIdentifier("Theme.Translucent", "style", AppLovinBridge.f61290h);
                boolean z2 = false;
                if (identifier == 0) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == contextZza.getPackageManager().getActivityInfo(new ComponentName(contextZza.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                            z2 = true;
                        } else {
                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Fail to fetch AdActivity theme");
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z2);
                bundle.putInt(QTafcm.yWtONGuNQJaEif, zzd());
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final zzcdv zzi(Set set, @Nullable String str) {
        synchronized (this.zzk) {
            try {
                int i2 = this.zzm;
                this.zzm = i2 + 1;
                if (set.isEmpty()) {
                    return new zzcdv(i2, -1, -1);
                }
                String strN = zpl.n(",", new TreeSet(set));
                Map map = this.zzn;
                Integer num = (Integer) map.get(strN);
                int iIntValue = 0;
                int iIntValue2 = num == null ? 0 : num.intValue();
                map.put(strN, Integer.valueOf(iIntValue2 + 1));
                if (str == null) {
                    return new zzcdv(i2, iIntValue2, -1);
                }
                StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(strN).length());
                sb.append(str);
                sb.append(l.ad);
                sb.append(strN);
                String string = sb.toString();
                Map map2 = this.zzo;
                Integer num2 = (Integer) map2.get(string);
                if (num2 != null) {
                    iIntValue = num2.intValue();
                }
                map2.put(string, Integer.valueOf(iIntValue + 1));
                return new zzcdv(i2, iIntValue2, iIntValue);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzcdw(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzf = str;
        this.zzl = zzgVar;
    }

    public final void zzf() {
        zzj();
    }

    public final void zzg() {
        zzj();
    }
}
