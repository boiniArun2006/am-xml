package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfqw {
    private final Map zza;
    private final zzfsb zzb;
    private final zzfrf zzc;
    private final Context zzd;

    @Nullable
    private volatile ConnectivityManager zze;
    private final AtomicBoolean zzf = new AtomicBoolean(false);
    private final Clock zzg;
    private AtomicInteger zzh;

    @Nullable
    private final zzfqr zzi;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzk(boolean z2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzy)).booleanValue()) {
            zzl(z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzl(boolean z2) {
        try {
            Iterator it = this.zza.values().iterator();
            while (it.hasNext()) {
                for (zzfsa zzfsaVar : ((Map) it.next()).values()) {
                    if (z2) {
                        zzfsaVar.zzj();
                    } else {
                        zzfsaVar.zzi();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Nullable
    private final synchronized Object zzo(Class cls, AdFormat adFormat, String str) {
        zzfrf zzfrfVar = this.zzc;
        Clock clock = this.zzg;
        zzfrfVar.zze(clock.currentTimeMillis(), "2");
        Map map = this.zza;
        if (!map.containsKey(adFormat)) {
            return null;
        }
        zzfsa zzfsaVar = (zzfsa) ((Map) map.get(adFormat)).get(str);
        if (zzfsaVar != null && adFormat.equals(zzfsaVar.zzo())) {
            zzfrl zzfrlVar = new zzfrl(zzfsaVar.zze.zza, zzfsaVar.zzo());
            zzfrlVar.zza(str);
            zzfrm zzfrmVar = new zzfrm(zzfrlVar, null);
            zzfrfVar.zzf(clock.currentTimeMillis(), zzfrmVar, zzfsaVar.zze.zzd, zzfsaVar.zzp(), "2");
            try {
                String strZzk = zzfsaVar.zzk();
                Object objZzg = zzfsaVar.zzg();
                Object objCast = objZzg == null ? null : cls.cast(objZzg);
                if (objCast != null) {
                    zzfrfVar.zzh(clock.currentTimeMillis(), zzfsaVar.zze.zzd, zzfsaVar.zzp(), strZzk, zzfrmVar, "2");
                }
                return objCast;
            } catch (ClassCastException e2) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "PreloadAdManager.pollAd");
                com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e2);
                return null;
            }
        }
        return null;
    }

    private final synchronized boolean zzp(AdFormat adFormat) {
        int size;
        int iOrdinal;
        try {
            Map map = this.zza;
            size = map.containsKey(adFormat) ? ((Map) map.get(adFormat)).size() : 0;
            iOrdinal = adFormat.ordinal();
        } finally {
        }
        return size < (iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 5 ? 0 : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfu)).intValue(), 1) : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzft)).intValue(), 1) : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfs)).intValue(), 1));
    }

    public final synchronized boolean zza(String str, com.google.android.gms.ads.internal.client.zzft zzftVar, @Nullable com.google.android.gms.ads.internal.client.zzch zzchVar) {
        zzfsa zzfsaVarZzb;
        try {
            if (!this.zzf.getAndSet(true)) {
                if (this.zze == null) {
                    synchronized (this) {
                        if (this.zze == null) {
                            try {
                                this.zze = (ConnectivityManager) this.zzd.getSystemService("connectivity");
                            } catch (ClassCastException e2) {
                                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get connectivity manager", e2);
                            }
                        }
                    }
                }
                if (!PlatformVersion.isAtLeastO() || this.zze == null) {
                    this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzI)).intValue());
                } else {
                    try {
                        this.zze.registerDefaultNetworkCallback(new zzfqu(this));
                    } catch (RuntimeException e3) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e3);
                        this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzI)).intValue());
                    }
                }
                com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzfqv(this));
            }
            AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
            if (adFormat != null) {
                Map map = this.zza;
                if (map.containsKey(adFormat) && !((Map) map.get(adFormat)).containsKey(str) && zzp(adFormat) && (zzfsaVarZzb = this.zzb.zzb(str, zzftVar, zzchVar)) != null) {
                    AtomicInteger atomicInteger = this.zzh;
                    if (atomicInteger != null) {
                        zzfsaVarZzb.zzm(atomicInteger.get());
                    }
                    zzfrf zzfrfVar = this.zzc;
                    zzfsaVarZzb.zzl(zzfrfVar);
                    zzfqr zzfqrVar = this.zzi;
                    if (zzfqrVar != null) {
                        zzfqrVar.zzd(str, adFormat, zzfsaVarZzb);
                    } else {
                        zzfsaVarZzb.zzd();
                    }
                    ((Map) map.get(adFormat)).put(str, zzfsaVarZzb);
                    zzfrl zzfrlVar = new zzfrl(zzftVar.zza, adFormat);
                    zzfrlVar.zza(str);
                    zzfrfVar.zza(zzftVar.zzd, this.zzg.currentTimeMillis(), new zzfrm(zzfrlVar, null), "2");
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzb(AdFormat adFormat, String str) {
        zzfrm zzfrmVar;
        try {
            Clock clock = this.zzg;
            long jCurrentTimeMillis = clock.currentTimeMillis();
            Map map = this.zza;
            int iZzp = 0;
            if (!map.containsKey(adFormat)) {
                return false;
            }
            zzfsa zzfsaVar = (zzfsa) ((Map) map.get(adFormat)).get(str);
            String strZzk = zzfsaVar == null ? null : zzfsaVar.zzk();
            boolean z2 = strZzk != null && adFormat.equals(zzfsaVar.zzo());
            Long lValueOf = z2 ? Long.valueOf(clock.currentTimeMillis()) : null;
            if (zzfsaVar == null) {
                zzfrmVar = null;
            } else {
                zzfrl zzfrlVar = new zzfrl(zzfsaVar.zze.zza, adFormat);
                zzfrlVar.zza(str);
                zzfrmVar = new zzfrm(zzfrlVar, null);
            }
            zzfrf zzfrfVar = this.zzc;
            int i2 = zzfsaVar == null ? 0 : zzfsaVar.zze.zzd;
            if (zzfsaVar != null) {
                iZzp = zzfsaVar.zzp();
            }
            zzfrfVar.zzd(i2, iZzp, jCurrentTimeMillis, lValueOf, strZzk, zzfrmVar, "2");
            return z2;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Nullable
    public final synchronized zzcaz zzc(String str) {
        return (zzcaz) zzo(zzcaz.class, AdFormat.REWARDED, str);
    }

    @Nullable
    public final synchronized zzbex zzd(String str) {
        return (zzbex) zzo(zzbex.class, AdFormat.APP_OPEN_AD, str);
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzbx zze(String str) {
        return (com.google.android.gms.ads.internal.client.zzbx) zzo(com.google.android.gms.ads.internal.client.zzbx.class, AdFormat.INTERSTITIAL, str);
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzft zzf(AdFormat adFormat, String str) {
        Map map = this.zza;
        if (map.containsKey(adFormat)) {
            zzfsa zzfsaVar = (zzfsa) ((Map) map.get(adFormat)).get(str);
            this.zzc.zzo(this.zzg.currentTimeMillis(), str, zzfsaVar == null ? null : zzfsaVar.zze.zza, adFormat, zzfsaVar == null ? -1 : zzfsaVar.zze.zzd, zzfsaVar != null ? zzfsaVar.zzp() : -1);
            if (zzfsaVar != null) {
                return zzfsaVar.zze;
            }
        }
        return null;
    }

    public final synchronized int zzg(AdFormat adFormat, String str) {
        Map map = this.zza;
        if (!map.containsKey(adFormat)) {
            return 0;
        }
        zzfsa zzfsaVar = (zzfsa) ((Map) map.get(adFormat)).get(str);
        int iZzp = zzfsaVar != null ? zzfsaVar.zzp() : 0;
        this.zzc.zzp(iZzp, this.zzg.currentTimeMillis(), str, zzfsaVar == null ? null : zzfsaVar.zze.zza, adFormat, zzfsaVar == null ? -1 : zzfsaVar.zze.zzd);
        return iZzp;
    }

    public final synchronized Map zzh(int i2) {
        try {
            HashMap map = new HashMap();
            AdFormat adFormat = AdFormat.getAdFormat(i2);
            if (adFormat != null) {
                Map map2 = this.zza;
                if (map2.containsKey(adFormat)) {
                    for (zzfsa zzfsaVar : ((Map) map2.get(adFormat)).values()) {
                        map.put(zzfsaVar.zzn(), zzfsaVar.zze);
                    }
                    this.zzc.zzn(adFormat, this.zzg.currentTimeMillis(), map.size());
                    return map;
                }
            }
            return map;
        } finally {
        }
    }

    public final synchronized boolean zzi(AdFormat adFormat, String str) {
        zzfsa zzfsaVar;
        try {
            Map map = this.zza;
            if (map.containsKey(adFormat) && (zzfsaVar = (zzfsa) ((Map) map.get(adFormat)).get(str)) != null) {
                ((Map) map.get(adFormat)).remove(str);
                zzfsaVar.zzh();
                zzfqr zzfqrVar = this.zzi;
                if (zzfqrVar != null) {
                    zzfqrVar.zze(str, adFormat);
                }
                zzfsaVar.zzr();
                zzfrf zzfrfVar = this.zzc;
                long jCurrentTimeMillis = this.zzg.currentTimeMillis();
                com.google.android.gms.ads.internal.client.zzft zzftVar = zzfsaVar.zze;
                zzfrfVar.zzm(jCurrentTimeMillis, str, zzftVar.zza, adFormat, zzftVar.zzd, zzfsaVar.zzp());
                return true;
            }
            return false;
        } finally {
        }
    }

    public final synchronized void zzj(int i2) {
        try {
            AdFormat adFormat = AdFormat.getAdFormat(i2);
            if (adFormat != null) {
                Map map = this.zza;
                if (map.containsKey(adFormat)) {
                    Map map2 = (Map) map.get(adFormat);
                    int size = map2.size();
                    for (String str : map2.keySet()) {
                        zzfsa zzfsaVar = (zzfsa) map2.get(str);
                        if (zzfsaVar != null) {
                            zzfsaVar.zzh();
                            zzfqr zzfqrVar = this.zzi;
                            if (zzfqrVar != null) {
                                zzfqrVar.zze(str, adFormat);
                            }
                            zzfsaVar.zzr();
                            String strValueOf = String.valueOf(str);
                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzh("Destroyed ad preloader for preloadId: ".concat(strValueOf));
                        }
                    }
                    map2.clear();
                    String strConcat = "Destroyed all ad preloaders for ad format: ".concat(adFormat.toString());
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh(strConcat);
                    this.zzc.zzl(this.zzg.currentTimeMillis(), adFormat, size);
                }
            }
        } finally {
        }
    }

    zzfqw(zzfsb zzfsbVar, zzfrf zzfrfVar, Context context, Clock clock, @Nullable zzfqr zzfqrVar) {
        HashMap map = new HashMap();
        this.zza = map;
        map.put(AdFormat.APP_OPEN_AD, new HashMap());
        map.put(AdFormat.INTERSTITIAL, new HashMap());
        map.put(AdFormat.REWARDED, new HashMap());
        this.zzb = zzfsbVar;
        this.zzc = zzfrfVar;
        this.zzd = context;
        this.zzg = clock;
        this.zzi = zzfqrVar;
    }
}
