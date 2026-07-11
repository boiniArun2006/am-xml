package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhpv extends zzibr implements zzidd {
    private static final zzhpv zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private zzhpz zzc;
    private zzian zzd = zzian.zza;

    public static zzhpv zzg() {
        return zze;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzian zzc() {
        return this.zzd;
    }

    final /* synthetic */ void zzj(zzian zzianVar) {
        this.zzd = zzianVar;
    }

    static {
        zzhpv zzhpvVar = new zzhpv();
        zze = zzhpvVar;
        zzibr.zzbu(zzhpv.class, zzhpvVar);
    }

    public static zzhpv zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhpv) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzhpu zze() {
        return (zzhpu) zze.zzbn();
    }

    public static zzidk zzh() {
        return zze.zzbd();
    }

    public final zzhpz zzb() {
        zzhpz zzhpzVar = this.zzc;
        return zzhpzVar == null ? zzhpz.zzd() : zzhpzVar;
    }

    private zzhpv() {
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
                                zzidk zzidkVar = zzf;
                                if (zzidkVar == null) {
                                    synchronized (zzhpv.class) {
                                        try {
                                            zzibmVar = zzf;
                                            if (zzibmVar == null) {
                                                zzibmVar = new zzibm(zze);
                                                zzf = zzibmVar;
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
                        return zze;
                    }
                    return new zzhpu(bArr);
                }
                return new zzhpv();
            }
            return zzibr.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zzi(zzhpz zzhpzVar) {
        zzhpzVar.getClass();
        this.zzc = zzhpzVar;
        this.zza |= 1;
    }
}
