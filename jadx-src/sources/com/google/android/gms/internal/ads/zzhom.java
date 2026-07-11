package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhom extends zzibr implements zzidd {
    private static final zzhom zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private zzhoq zzc;
    private zzian zzd = zzian.zza;

    public final int zza() {
        return this.zzb;
    }

    public final zzian zzc() {
        return this.zzd;
    }

    final /* synthetic */ void zzi(zzian zzianVar) {
        this.zzd = zzianVar;
    }

    static {
        zzhom zzhomVar = new zzhom();
        zze = zzhomVar;
        zzibr.zzbu(zzhom.class, zzhomVar);
    }

    public static zzhom zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhom) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzhol zze() {
        return (zzhol) zze.zzbn();
    }

    public static zzidk zzg() {
        return zze.zzbd();
    }

    public final zzhoq zzb() {
        zzhoq zzhoqVar = this.zzc;
        return zzhoqVar == null ? zzhoq.zzc() : zzhoqVar;
    }

    private zzhom() {
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
                                    synchronized (zzhom.class) {
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
                    return new zzhol(bArr);
                }
                return new zzhom();
            }
            return zzibr.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zzh(zzhoq zzhoqVar) {
        zzhoqVar.getClass();
        this.zzc = zzhoqVar;
        this.zza |= 1;
    }
}
