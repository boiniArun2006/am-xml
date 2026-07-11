package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcia extends zzchr implements zzcfu {
    public static final /* synthetic */ int zzd = 0;
    private zzcfv zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzchj zzi;
    private long zzj;
    private long zzk;

    public final zzcfv zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzs(null);
        zzcfv zzcfvVar = this.zze;
        this.zze = null;
        return zzcfvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final boolean zzg(String str, String[] strArr, zzchj zzchjVar) {
        this.zzf = str;
        this.zzi = zzchjVar;
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                uriArr[i2] = Uri.parse(strArr[i2]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzcge zzcgeVar = (zzcge) this.zzc.get();
            if (zzcgeVar != null) {
                zzcgeVar.zzt(strZzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            this.zzk = -1L;
            zzd(0L);
            return true;
        } catch (Exception e2) {
            String message = e2.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb.append("Failed to preload url ");
            sb.append(str);
            sb.append(" Exception: ");
            sb.append(message);
            String string = sb.toString();
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e2, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, strZzc, MRAIDPresenter.ERROR, zzx(MRAIDPresenter.ERROR, e2));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzl() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzq(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzs(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzt(int i2, int i3) {
    }

    private final void zzd(long j2) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb();
            }
        }, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzchr, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcfv zzcfvVar = this.zze;
        if (zzcfvVar != null) {
            zzcfvVar.zzs(null);
            this.zze.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzD() {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache onRenderedFirstFrame");
    }

    final /* synthetic */ void zzb() {
        long jLongValue;
        long jIntValue;
        boolean zBooleanValue;
        long j2;
        long j3;
        long j4;
        String strZzc = zzc(this.zzf);
        try {
            jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzah)).longValue() * 1000;
            jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzw)).intValue();
            zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue();
        } catch (Exception e2) {
            String str = this.zzf;
            String message = e2.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb.append("Failed to preload url ");
            sb.append(str);
            sb.append(" Exception: ");
            sb.append(message);
            String string = sb.toString();
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e2, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(this.zzf, strZzc, MRAIDPresenter.ERROR, zzx(MRAIDPresenter.ERROR, e2));
        }
        synchronized (this) {
            try {
                if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj > jLongValue) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(jLongValue).length() + 27);
                    sb2.append("Timeout reached. Limit: ");
                    sb2.append(jLongValue);
                    sb2.append(" ms");
                    throw new IOException(sb2.toString());
                }
                if (this.zzg) {
                    throw new IOException("Abort requested before buffering finished. ");
                }
                if (!this.zzh) {
                    if (!this.zze.zzB()) {
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long jZzH = this.zze.zzH();
                    if (jZzH > 0) {
                        long jZzN = this.zze.zzN();
                        if (jZzN != this.zzk) {
                            boolean z2 = jZzN > 0;
                            j3 = jZzH;
                            j4 = jZzN;
                            j2 = jIntValue;
                            zzm(this.zzf, strZzc, j4, j3, z2, zBooleanValue ? this.zze.zzI() : -1L, zBooleanValue ? this.zze.zzJ() : -1L, zBooleanValue ? this.zze.zzK() : -1L, zzcfv.zzP(), zzcfv.zzQ());
                            this.zzk = j4;
                        } else {
                            j2 = jIntValue;
                            j3 = jZzH;
                            j4 = jZzN;
                        }
                        if (j4 >= j3) {
                            zzp(this.zzf, strZzc, j3);
                        } else if (this.zze.zzO() >= j2 && j4 > 0) {
                        }
                    }
                    zzd(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzai)).longValue());
                    return;
                }
                com.google.android.gms.ads.internal.zzt.zzB().zzd(this.zzi);
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final boolean zzf(String str, String[] strArr) {
        Clock clock;
        String str2;
        String str3;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j9;
        boolean z2;
        this.zzf = str;
        String strZzc = zzc(str);
        String str4 = " ms";
        String str5 = "Timeout reached. Limit: ";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                uriArr[i2] = Uri.parse(strArr[i2]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzcge zzcgeVar = (zzcge) this.zzc.get();
            if (zzcgeVar != null) {
                zzcgeVar.zzt(strZzc, this);
            }
            Clock clockZzk = com.google.android.gms.ads.internal.zzt.zzk();
            long jCurrentTimeMillis = clockZzk.currentTimeMillis();
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzai)).longValue();
            long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzah)).longValue() * 1000;
            long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzw)).intValue();
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue();
            long j10 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (clockZzk.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                            long j11 = jLongValue2;
                            StringBuilder sb = new StringBuilder(String.valueOf(j11).length() + 27);
                            sb.append(str5);
                            sb.append(j11);
                            sb.append(str4);
                            throw new IOException(sb.toString());
                        }
                        if (this.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.zzh) {
                            if (!this.zze.zzB()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long jZzH = this.zze.zzH();
                            if (jZzH > 0) {
                                clock = clockZzk;
                                long jZzN = this.zze.zzN();
                                if (jZzN != j10) {
                                    if (jZzN > 0) {
                                        j9 = jLongValue2;
                                        z2 = true;
                                    } else {
                                        j9 = jLongValue2;
                                        z2 = false;
                                    }
                                    long j12 = jLongValue;
                                    j6 = jZzH;
                                    str3 = str5;
                                    j5 = j12;
                                    str2 = str4;
                                    j7 = jZzN;
                                    j3 = jIntValue;
                                    j2 = j9;
                                    zzm(str, strZzc, j7, j6, z2, zBooleanValue ? this.zze.zzI() : -1L, zBooleanValue ? this.zze.zzJ() : -1L, zBooleanValue ? this.zze.zzK() : -1L, zzcfv.zzP(), zzcfv.zzQ());
                                    j10 = j7;
                                } else {
                                    str3 = str5;
                                    j5 = jLongValue;
                                    j3 = jIntValue;
                                    j6 = jZzH;
                                    str2 = str4;
                                    j2 = jLongValue2;
                                    j7 = jZzN;
                                }
                                if (j7 >= j6) {
                                    zzp(str, strZzc, j6);
                                } else if (this.zze.zzO() < j3 || j7 <= 0) {
                                    j4 = j5;
                                }
                            } else {
                                clock = clockZzk;
                                str2 = str4;
                                str3 = str5;
                                j2 = jLongValue2;
                                j3 = jIntValue;
                                j4 = jLongValue;
                            }
                            try {
                                wait(j4);
                            } catch (InterruptedException unused) {
                                throw new IOException("Wait interrupted.");
                            }
                        }
                    } finally {
                    }
                }
                jLongValue = j4;
                str4 = str2;
                jLongValue2 = j2;
                jIntValue = j3;
                str5 = str3;
                clockZzk = clock;
            }
            return true;
        } catch (Exception e2) {
            String message = e2.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb2.append("Failed to preload url ");
            sb2.append(str);
            sb2.append(" Exception: ");
            sb2.append(message);
            String string = sb2.toString();
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e2, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, strZzc, MRAIDPresenter.ERROR, zzx(MRAIDPresenter.ERROR, e2));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzh(int i2) {
        this.zze.zzG(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzi(int i2) {
        this.zze.zzF(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzj(int i2) {
        this.zze.zzy(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzk(int i2) {
        this.zze.zzz(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzr(final boolean z2, final long j2) {
        final zzcge zzcgeVar = (zzcge) this.zzc.get();
        if (zzcgeVar != null) {
            zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcgeVar.zzu(z2, j2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzu(String str, Exception exc) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzv(String str, Exception exc) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "VideoStreamExoPlayerCache.onException");
    }

    public zzcia(zzcge zzcgeVar, zzcgd zzcgdVar) {
        super(zzcgeVar);
        zzcit zzcitVar = new zzcit(zzcgeVar.getContext(), zzcgdVar, (zzcge) this.zzc.get(), null);
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        this.zze = zzcitVar;
        zzcitVar.zzs(this);
    }

    protected static final String zzc(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private static String zzx(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final boolean zze(String str) {
        return zzf(str, new String[]{str});
    }
}
