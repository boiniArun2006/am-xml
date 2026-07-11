package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzaxf extends zzibr implements zzidd {
    private static final zzaxf zzj;
    private static volatile zzidk zzk;
    private int zza;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;

    final /* synthetic */ void zzb(long j2) {
        this.zza |= 1;
        this.zzb = j2;
    }

    final /* synthetic */ void zzc(long j2) {
        this.zza |= 4;
        this.zzd = j2;
    }

    final /* synthetic */ void zzd(long j2) {
        this.zza |= 8;
        this.zze = j2;
    }

    final /* synthetic */ void zze(long j2) {
        this.zza |= 16;
        this.zzf = j2;
    }

    final /* synthetic */ void zzg(long j2) {
        this.zza |= 32;
        this.zzg = j2;
    }

    static {
        zzaxf zzaxfVar = new zzaxf();
        zzj = zzaxfVar;
        zzibr.zzbu(zzaxf.class, zzaxfVar);
    }

    public static zzaxe zza() {
        return (zzaxe) zzj.zzbn();
    }

    private zzaxf() {
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
                                zzidk zzidkVar = zzk;
                                if (zzidkVar == null) {
                                    synchronized (zzaxf.class) {
                                        try {
                                            zzibmVar = zzk;
                                            if (zzibmVar == null) {
                                                zzibmVar = new zzibm(zzj);
                                                zzk = zzibmVar;
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
                        return zzj;
                    }
                    return new zzaxe(bArr);
                }
                return new zzaxf();
            }
            return zzibr.zzbv(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
