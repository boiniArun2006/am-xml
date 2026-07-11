package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzchx extends zzchr implements zzhz {
    private static final AtomicInteger zzo = new AtomicInteger(0);
    private String zzd;
    private final zzcgd zze;
    private boolean zzf;
    private final zzchw zzg;
    private final zzcha zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zza(zzhb zzhbVar, zzhf zzhfVar, boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzc(zzhb zzhbVar, zzhf zzhfVar, boolean z2, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzd(zzhb zzhbVar, zzhf zzhfVar, boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzl() {
        this.zzf = true;
    }

    public final String zzs() {
        return this.zzd;
    }

    public final boolean zzt() {
        return this.zzn;
    }

    public static int zzr() {
        return zzo.get();
    }

    private final void zzx() {
        int iZza = (int) this.zzg.zza();
        int iZza2 = (int) this.zzh.zza(this.zzi);
        int iPosition = this.zzi.position();
        int iRound = Math.round(iZza2 * (iPosition / iZza));
        int iZzP = zzcfv.zzP();
        int iZzQ = zzcfv.zzQ();
        String str = this.zzd;
        zzn(str, zzv(str), iPosition, iZza, iRound, iZza2, iRound > 0, iZzP, iZzQ);
    }

    @Override // com.google.android.gms.internal.ads.zzchr, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzo.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzb(zzhb zzhbVar, zzhf zzhfVar, boolean z2) {
        if (zzhbVar instanceof zzhm) {
            this.zzg.zzb((zzhm) zzhbVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fa, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // com.google.android.gms.internal.ads.zzchr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zze(String str) {
        String str2;
        String str3;
        Clock clock;
        long j2;
        this.zzd = str;
        String str4 = MRAIDPresenter.ERROR;
        String strZzv = zzv(str);
        try {
            zzhi zzhiVar = new zzhi();
            zzhiVar.zzb(this.zzb);
            zzcgd zzcgdVar = this.zze;
            zzhiVar.zzc(zzcgdVar.zzd);
            zzhiVar.zzd(zzcgdVar.zze);
            zzhiVar.zze(true);
            zzhiVar.zzf(this);
            zzhb zzhbVarZza = zzhiVar.zza();
            if (zzcgdVar.zzi) {
                zzhbVarZza = new zzcgy(this.zza, zzhbVarZza, this.zzl, this.zzm, null, null);
            }
            zzhbVarZza.zzb(new zzhf(Uri.parse(str), 0L, -1L, null));
            zzcge zzcgeVar = (zzcge) this.zzc.get();
            if (zzcgeVar != null) {
                zzcgeVar.zzt(strZzv, this);
            }
            Clock clockZzk = com.google.android.gms.ads.internal.zzt.zzk();
            long jCurrentTimeMillis = clockZzk.currentTimeMillis();
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzai)).longValue();
            long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzah)).longValue();
            this.zzi = ByteBuffer.allocate(zzcgdVar.zzc);
            byte[] bArr = new byte[8192];
            long j3 = jCurrentTimeMillis;
            while (true) {
                str2 = str4;
                try {
                    int iZza = zzhbVarZza.zza(bArr, 0, Math.min(this.zzi.remaining(), 8192));
                    if (iZza == -1) {
                        this.zzn = true;
                        zzp(str, strZzv, (int) this.zzh.zza(this.zzi));
                        break;
                    }
                    synchronized (this.zzk) {
                        clock = clockZzk;
                        try {
                            if (this.zzf) {
                                j2 = jCurrentTimeMillis;
                            } else {
                                j2 = jCurrentTimeMillis;
                                this.zzi.put(bArr, 0, iZza);
                            }
                        } finally {
                        }
                    }
                    if (this.zzi.remaining() <= 0) {
                        zzx();
                        break;
                    }
                    str3 = this.zzf;
                    try {
                        if (str3 != 0) {
                            int iLimit = this.zzi.limit();
                            StringBuilder sb = new StringBuilder(String.valueOf(iLimit).length() + 24);
                            sb.append("Precache abort at ");
                            sb.append(iLimit);
                            sb.append(" bytes");
                            throw new IOException(sb.toString());
                        }
                        long jCurrentTimeMillis2 = clock.currentTimeMillis();
                        if (jCurrentTimeMillis2 - j3 >= jLongValue) {
                            zzx();
                            j3 = jCurrentTimeMillis2;
                        }
                        if (jCurrentTimeMillis2 - j2 > 1000 * jLongValue2) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(jLongValue2).length() + 29);
                            sb2.append("Timeout exceeded. Limit: ");
                            sb2.append(jLongValue2);
                            sb2.append(" sec");
                            throw new IOException(sb2.toString());
                        }
                        str4 = str2;
                        clockZzk = clock;
                        jCurrentTimeMillis = j2;
                    } catch (Exception e2) {
                        e = e2;
                        String canonicalName = e.getClass().getCanonicalName();
                        String message = e.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length());
                        sb3.append(canonicalName);
                        sb3.append(":");
                        sb3.append(message);
                        String string = sb3.toString();
                        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 34 + string.length());
                        sb4.append("Failed to preload url ");
                        sb4.append(str);
                        sb4.append(" Exception: ");
                        sb4.append(string);
                        String string2 = sb4.toString();
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(string2);
                        zzq(str, strZzv, str3, string);
                        return false;
                    }
                } catch (Exception e3) {
                    e = e3;
                    str3 = str2;
                    String canonicalName2 = e.getClass().getCanonicalName();
                    String message2 = e.getMessage();
                    StringBuilder sb32 = new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length());
                    sb32.append(canonicalName2);
                    sb32.append(":");
                    sb32.append(message2);
                    String string3 = sb32.toString();
                    StringBuilder sb42 = new StringBuilder(String.valueOf(str).length() + 34 + string3.length());
                    sb42.append("Failed to preload url ");
                    sb42.append(str);
                    sb42.append(" Exception: ");
                    sb42.append(string3);
                    String string22 = sb42.toString();
                    int i22 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(string22);
                    zzq(str, strZzv, str3, string3);
                    return false;
                }
            }
        } catch (Exception e4) {
            e = e4;
            str2 = str4;
        }
    }

    public final ByteBuffer zzu() {
        synchronized (this.zzk) {
            try {
                ByteBuffer byteBuffer = this.zzi;
                if (byteBuffer != null && !this.zzj) {
                    byteBuffer.flip();
                    this.zzj = true;
                }
                this.zzf = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.zzi;
    }

    public zzchx(zzcge zzcgeVar, zzcgd zzcgdVar) {
        String strZzn;
        int iZzp;
        super(zzcgeVar);
        this.zze = zzcgdVar;
        this.zzg = new zzchw();
        this.zzh = new zzcha();
        this.zzk = new Object();
        if (zzcgeVar != null) {
            strZzn = zzcgeVar.zzn();
        } else {
            strZzn = null;
        }
        this.zzl = (String) zzgra.zzd(strZzn).zza("");
        if (zzcgeVar != null) {
            iZzp = zzcgeVar.zzp();
        } else {
            iZzp = 0;
        }
        this.zzm = iZzp;
        zzo.incrementAndGet();
    }

    protected static final String zzv(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }
}
