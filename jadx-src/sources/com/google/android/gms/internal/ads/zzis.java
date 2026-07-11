package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzis implements zzlj {
    public static final zzguf zza = zzguf.zzn(FileUploadManager.f61570h, AppLovinEventTypes.USER_VIEWED_CONTENT, "data", "android.resource", "rawresource", "asset");
    private final zzbe zzb;
    private final zzbd zzc;
    private final zzaat zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private final long zzh;
    private final long zzi;
    private final long zzj;
    private final long zzk;
    private final long zzl;
    private final long zzm;
    private final zzgui zzn;
    private final ConcurrentHashMap zzo;
    private long zzp;

    private static final boolean zzt(boolean z2) {
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final long zzf(zzpq zzpqVar) {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzg(zzpq zzpqVar) {
        return false;
    }

    final /* synthetic */ zzaat zzk() {
        return this.zzd;
    }

    final /* synthetic */ ConcurrentHashMap zzl() {
        return this.zzo;
    }

    public zzis() {
        zzaat zzaatVar = new zzaat(true, 65536);
        zzgui zzguiVarZza = zzgui.zza();
        zzq(1000, 0, "bufferForPlaybackMs", "0");
        zzq(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        zzq(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzq(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        zzq(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        zzq(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        zzq(50000, 50000, "maxBufferMs", "minBufferMs");
        zzq(50000, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        zzq(0, 0, "backBufferDurationMs", "0");
        this.zzb = new zzbe();
        this.zzc = new zzbd();
        this.zzd = zzaatVar;
        this.zze = zzfj.zzq(50000L);
        this.zzf = zzfj.zzq(1000L);
        this.zzg = zzfj.zzq(50000L);
        this.zzh = zzfj.zzq(50000L);
        this.zzi = zzfj.zzq(1000L);
        this.zzj = zzfj.zzq(1000L);
        this.zzk = zzfj.zzq(2000L);
        this.zzl = zzfj.zzq(1000L);
        this.zzm = zzfj.zzq(0L);
        this.zzo = new ConcurrentHashMap();
        this.zzn = zzgui.zzc(zzguiVarZza);
        this.zzp = -1L;
    }

    private final int zzm(zzpq zzpqVar) {
        Integer num = (Integer) this.zzn.get(zzpqVar.zzb);
        if (num == null || num.intValue() == -1) {
            return -1;
        }
        return num.intValue();
    }

    private final void zzn(zzpq zzpqVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzir zzirVar = (zzir) concurrentHashMap.get(zzpqVar);
        if (zzirVar != null) {
            int i2 = zzirVar.zza - 1;
            zzirVar.zza = i2;
            if (i2 == 0) {
                concurrentHashMap.remove(zzpqVar);
                zzo();
            }
        }
    }

    private final void zzo() {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        if (concurrentHashMap.isEmpty()) {
            this.zzd.zze();
            return;
        }
        zzaat zzaatVar = this.zzd;
        Iterator it = concurrentHashMap.values().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((zzir) it.next()).zzc;
        }
        zzaatVar.zzf(i2);
    }

    private final boolean zzp(zzli zzliVar) {
        zzbf zzbfVar = zzliVar.zzb;
        zzag zzagVar = zzbfVar.zzb(zzbfVar.zzo(zzliVar.zzc.zza, this.zzc).zzc, this.zzb, 0L).zzd.zzb;
        if (zzagVar == null) {
            return false;
        }
        String scheme = zzagVar.zza.getScheme();
        return TextUtils.isEmpty(scheme) || zza.contains(scheme);
    }

    private static void zzq(int i2, int i3, String str, String str2) {
        zzgrc.zzh(i2 >= i3, "%s cannot be less than %s", str, str2);
    }

    private final int zzr(zzpq zzpqVar) {
        zzir zzirVar = (zzir) this.zzo.get(zzpqVar);
        zzirVar.getClass();
        return zzirVar.zzc() * 65536;
    }

    private final int zzs(zzpq zzpqVar) {
        zzir zzirVar = (zzir) this.zzo.get(zzpqVar);
        zzirVar.getClass();
        return zzirVar.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzb(zzli zzliVar, zzyn zzynVar, zzaac[] zzaacVarArr) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzpq zzpqVar = zzliVar.zza;
        int iZzm = zzm(zzpqVar);
        zzir zzirVar = (zzir) concurrentHashMap.get(zzpqVar);
        zzirVar.getClass();
        if (iZzm == -1) {
            boolean zZzp = zzp(zzliVar);
            int length = zzaacVarArr.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i5 = 13107200;
                if (i2 < length) {
                    zzaac zzaacVar = zzaacVarArr[i2];
                    if (zzaacVar != null) {
                        switch (zzaacVar.zza().zzc) {
                            case -1:
                            case 1:
                                break;
                            case 0:
                                i5 = 144310272;
                                break;
                            case 2:
                                i5 = !zZzp ? 131072000 : 19660800;
                                break;
                            case 3:
                            case 5:
                            default:
                                i5 = 131072;
                                break;
                            case 4:
                                i5 = 26214400;
                                break;
                        }
                        i3 += i5;
                    }
                    i2++;
                } else {
                    iZzm = Math.max(13107200, i3);
                }
            }
        }
        zzirVar.zzc = iZzm;
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final zzaan zze(zzpq zzpqVar) {
        return new zziq(this, zzpqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzh(zzli zzliVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzpq zzpqVar = zzliVar.zza;
        zzir zzirVar = (zzir) concurrentHashMap.get(zzpqVar);
        zzirVar.getClass();
        int iZzr = zzr(zzpqVar);
        int iZzs = zzs(zzpqVar);
        if (zzpqVar.equals(zzpq.zza)) {
            return iZzr < iZzs;
        }
        boolean zZzp = zzp(zzliVar);
        long jMin = zZzp ? this.zzf : this.zze;
        long j2 = zZzp ? this.zzh : this.zzg;
        float f3 = zzliVar.zzf;
        if (f3 > 1.0f) {
            jMin = Math.min(zzfj.zzv(jMin, f3), j2);
        }
        long j3 = zzliVar.zze;
        if (j3 < Math.max(jMin, 500000L)) {
            boolean z2 = zzt(zZzp) || iZzr < iZzs;
            zzirVar.zzb = z2;
            if (!z2 && j3 < 500000) {
                zzee.zzc("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j3 >= j2 || iZzr >= iZzs) {
            zzirVar.zzb = false;
        }
        return zzirVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzi(zzli zzliVar) {
        long jMin;
        boolean z2;
        boolean z3 = zzliVar.zzg;
        long j2 = zzliVar.zze;
        float f3 = zzliVar.zzf;
        boolean zZzp = zzp(zzliVar);
        long jZzw = zzfj.zzw(j2, f3);
        if (z3) {
            if (zZzp) {
                jMin = this.zzl;
                z2 = true;
            } else {
                jMin = this.zzk;
                z2 = false;
            }
        } else if (zZzp) {
            jMin = this.zzj;
            z2 = true;
        } else {
            jMin = this.zzi;
            z2 = false;
        }
        long j3 = zzliVar.zzh;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(j3 / 2, jMin);
        }
        if (jMin <= 0 || jZzw >= jMin) {
            return true;
        }
        if (!zzt(z2)) {
            zzpq zzpqVar = zzliVar.zza;
            if (zzr(zzpqVar) >= zzs(zzpqVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzj(zzpq zzpqVar, zzbf zzbfVar, zzwk zzwkVar, long j2) {
        Iterator it = this.zzo.values().iterator();
        while (it.hasNext()) {
            if (((zzir) it.next()).zzb) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zza(zzpq zzpqVar) {
        boolean z2;
        long id = Thread.currentThread().getId();
        long j2 = this.zzp;
        if (j2 == -1 || j2 == id) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzgrc.zzj(z2, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzp = id;
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzir zzirVar = (zzir) concurrentHashMap.get(zzpqVar);
        if (zzirVar == null) {
            concurrentHashMap.put(zzpqVar, new zzir());
        } else {
            zzirVar.zza++;
        }
        zzir zzirVar2 = (zzir) concurrentHashMap.get(zzpqVar);
        zzirVar2.getClass();
        int iZzm = zzm(zzpqVar);
        if (iZzm == -1) {
            iZzm = 13107200;
        }
        zzirVar2.zzc = iZzm;
        zzirVar2.zzb = false;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzc(zzpq zzpqVar) {
        zzn(zzpqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzd(zzpq zzpqVar) {
        zzn(zzpqVar);
        if (this.zzo.isEmpty()) {
            this.zzp = -1L;
        }
    }
}
