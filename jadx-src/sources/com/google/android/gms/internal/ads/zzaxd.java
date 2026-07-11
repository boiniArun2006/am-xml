package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzaxd extends zzibr implements zzidd {
    private static final zzaxd zzA;
    private static volatile zzidk zzB;
    private int zza;
    private long zzu;
    private long zzv;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private int zzh = 1000;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private long zzp = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    final /* synthetic */ void zzb(long j2) {
        this.zza |= 1;
        this.zzb = j2;
    }

    final /* synthetic */ void zzc(long j2) {
        this.zza |= 2;
        this.zzc = j2;
    }

    final /* synthetic */ void zzd(long j2) {
        this.zza |= 4;
        this.zzd = j2;
    }

    final /* synthetic */ void zze(long j2) {
        this.zza |= 8;
        this.zze = j2;
    }

    final /* synthetic */ void zzg() {
        this.zza &= -9;
        this.zze = -1L;
    }

    final /* synthetic */ void zzh(long j2) {
        this.zza |= 16;
        this.zzf = j2;
    }

    final /* synthetic */ void zzi(long j2) {
        this.zza |= 32;
        this.zzg = j2;
    }

    final /* synthetic */ void zzj(long j2) {
        this.zza |= 128;
        this.zzi = j2;
    }

    final /* synthetic */ void zzk(long j2) {
        this.zza |= 256;
        this.zzj = j2;
    }

    final /* synthetic */ void zzl(long j2) {
        this.zza |= 512;
        this.zzk = j2;
    }

    final /* synthetic */ void zzm(long j2) {
        this.zza |= 2048;
        this.zzm = j2;
    }

    final /* synthetic */ void zzn(long j2) {
        this.zza |= 4096;
        this.zzn = j2;
    }

    final /* synthetic */ void zzo(long j2) {
        this.zza |= 8192;
        this.zzo = j2;
    }

    final /* synthetic */ void zzp(long j2) {
        this.zza |= 16384;
        this.zzp = j2;
    }

    final /* synthetic */ void zzq(long j2) {
        this.zza |= 32768;
        this.zzu = j2;
    }

    final /* synthetic */ void zzr(long j2) {
        this.zza |= 65536;
        this.zzv = j2;
    }

    final /* synthetic */ void zzs(long j2) {
        this.zza |= 131072;
        this.zzw = j2;
    }

    final /* synthetic */ void zzt(long j2) {
        this.zza |= 262144;
        this.zzx = j2;
    }

    final /* synthetic */ void zzv(int i2) {
        this.zzh = i2 - 1;
        this.zza |= 64;
    }

    final /* synthetic */ void zzw(int i2) {
        this.zzl = i2 - 1;
        this.zza |= 1024;
    }

    static {
        zzaxd zzaxdVar = new zzaxd();
        zzA = zzaxdVar;
        zzibr.zzbu(zzaxd.class, zzaxdVar);
    }

    public static zzaxc zza() {
        return (zzaxc) zzA.zzbn();
    }

    private zzaxd() {
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
                                zzidk zzidkVar = zzB;
                                if (zzidkVar == null) {
                                    synchronized (zzaxd.class) {
                                        try {
                                            zzibmVar = zzB;
                                            if (zzibmVar == null) {
                                                zzibmVar = new zzibm(zzA);
                                                zzB = zzibmVar;
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
                        return zzA;
                    }
                    return new zzaxc(bArr);
                }
                return new zzaxd();
            }
            zzibx zzibxVar = zzaxo.zza;
            return zzibr.zzbv(zzA, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzibxVar, "zzi", "zzj", "zzk", "zzl", zzibxVar, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        return (byte) 1;
    }
}
