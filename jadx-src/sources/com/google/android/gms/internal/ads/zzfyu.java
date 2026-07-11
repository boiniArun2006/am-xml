package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfyu extends zzibr implements zzidd {
    private static final zzfyu zzn;
    private static volatile zzidk zzo;
    private int zza;
    private long zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private String zzb = "";
    private zzicc zzk = zzibr.zzbE();
    private zzicc zzl = zzibr.zzbE();
    private zzicc zzm = zzibr.zzbE();

    public static zzfyu zzp() {
        return zzn;
    }

    public final String zza() {
        return this.zzb;
    }

    public final long zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        return this.zze;
    }

    public final boolean zze() {
        return this.zzf;
    }

    public final long zzg() {
        return this.zzg;
    }

    public final long zzh() {
        return this.zzh;
    }

    public final long zzi() {
        return this.zzi;
    }

    public final boolean zzj() {
        return (this.zza & 64) != 0;
    }

    public final List zzk() {
        return this.zzk;
    }

    public final List zzn() {
        return this.zzm;
    }

    final /* synthetic */ void zzr(long j2) {
        this.zza |= 1;
        this.zzc = j2;
    }

    final /* synthetic */ void zzs(int i2) {
        this.zza |= 2;
        this.zzd = i2;
    }

    final /* synthetic */ void zzt(boolean z2) {
        this.zza |= 4;
        this.zze = true;
    }

    final /* synthetic */ void zzu(boolean z2) {
        this.zza |= 8;
        this.zzf = true;
    }

    final /* synthetic */ void zzv(long j2) {
        this.zza |= 16;
        this.zzg = j2;
    }

    final /* synthetic */ void zzw(long j2) {
        this.zzh = j2;
    }

    final /* synthetic */ void zzx(long j2) {
        this.zza |= 32;
        this.zzi = j2;
    }

    final /* synthetic */ void zzy(long j2) {
        this.zza |= 64;
        this.zzj = j2;
    }

    static {
        zzfyu zzfyuVar = new zzfyu();
        zzn = zzfyuVar;
        zzibr.zzbu(zzfyu.class, zzfyuVar);
    }

    final /* synthetic */ void zzA(long j2) {
        zzicc zziccVar = this.zzl;
        if (!zziccVar.zza()) {
            this.zzl = zzibr.zzbF(zziccVar);
        }
        this.zzl.zzd(j2);
    }

    final /* synthetic */ void zzB(long j2) {
        zzicc zziccVar = this.zzm;
        if (!zziccVar.zza()) {
            this.zzm = zzibr.zzbF(zziccVar);
        }
        this.zzm.zzd(j2);
    }

    public final int zzl() {
        return this.zzk.size();
    }

    public final int zzm() {
        return this.zzl.size();
    }

    public final int zzo() {
        return this.zzm.size();
    }

    final /* synthetic */ void zzz(long j2) {
        zzicc zziccVar = this.zzk;
        if (!zziccVar.zza()) {
            this.zzk = zzibr.zzbF(zziccVar);
        }
        this.zzk.zzd(j2);
    }

    private zzfyu() {
    }

    final /* synthetic */ void zzC() {
        this.zzm = zzibr.zzbE();
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    byte[] bArr = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                zzidk zzidkVar = zzo;
                                if (zzidkVar == null) {
                                    synchronized (zzfyu.class) {
                                        try {
                                            zzibmVar = zzo;
                                            if (zzibmVar == null) {
                                                zzibmVar = new zzibm(zzn);
                                                zzo = zzibmVar;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    return zzibmVar;
                                }
                                return zzidkVar;
                            }
                            throw null;
                        }
                        return zzn;
                    }
                    return new zzfyt(bArr);
                }
                return new zzfyu();
            }
            return zzibr.zzbv(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zzq(String str) {
        str.getClass();
        this.zzb = str;
    }
}
