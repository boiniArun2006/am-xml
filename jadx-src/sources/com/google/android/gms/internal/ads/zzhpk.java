package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhpk extends zzibr implements zzidd {
    private static final zzhpk zzf;
    private static volatile zzidk zzg;
    private int zza;
    private int zzb;
    private zzhpg zzc;
    private zzian zzd;
    private zzian zze;

    public static zzhpk zzh() {
        return zzf;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzian zzc() {
        return this.zzd;
    }

    public final zzian zzd() {
        return this.zze;
    }

    final /* synthetic */ void zzk(zzian zzianVar) {
        this.zzd = zzianVar;
    }

    final /* synthetic */ void zzl(zzian zzianVar) {
        this.zze = zzianVar;
    }

    static {
        zzhpk zzhpkVar = new zzhpk();
        zzf = zzhpkVar;
        zzibr.zzbu(zzhpk.class, zzhpkVar);
    }

    public static zzhpk zze(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhpk) zzibr.zzbT(zzf, zzianVar, zzibbVar);
    }

    public static zzhpj zzg() {
        return (zzhpj) zzf.zzbn();
    }

    public static zzidk zzi() {
        return zzf.zzbd();
    }

    public final zzhpg zzb() {
        zzhpg zzhpgVar = this.zzc;
        return zzhpgVar == null ? zzhpg.zzc() : zzhpgVar;
    }

    private zzhpk() {
        zzian zzianVar = zzian.zza;
        this.zzd = zzianVar;
        this.zze = zzianVar;
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
                                zzidk zzidkVar = zzg;
                                if (zzidkVar == null) {
                                    synchronized (zzhpk.class) {
                                        try {
                                            zzibmVar = zzg;
                                            if (zzibmVar == null) {
                                                zzibmVar = new zzibm(zzf);
                                                zzg = zzibmVar;
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
                        return zzf;
                    }
                    return new zzhpj(bArr);
                }
                return new zzhpk();
            }
            return zzibr.zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zzj(zzhpg zzhpgVar) {
        zzhpgVar.getClass();
        this.zzc = zzhpgVar;
        this.zza |= 1;
    }
}
