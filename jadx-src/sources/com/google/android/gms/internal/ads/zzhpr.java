package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhpr extends zzibr implements zzidd {
    private static final zzhpr zzc;
    private static volatile zzidk zzd;
    private int zza;
    private zzian zzb = zzian.zza;

    public static zzhpr zze() {
        return zzc;
    }

    public final int zza() {
        return this.zza;
    }

    public final zzian zzb() {
        return this.zzb;
    }

    final /* synthetic */ void zzh(zzian zzianVar) {
        this.zzb = zzianVar;
    }

    static {
        zzhpr zzhprVar = new zzhpr();
        zzc = zzhprVar;
        zzibr.zzbu(zzhpr.class, zzhprVar);
    }

    public static zzhpr zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhpr) zzibr.zzbT(zzc, zzianVar, zzibbVar);
    }

    public static zzhpq zzd() {
        return (zzhpq) zzc.zzbn();
    }

    public static zzidk zzg() {
        return zzc.zzbd();
    }

    private zzhpr() {
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
                                zzidk zzidkVar = zzd;
                                if (zzidkVar == null) {
                                    synchronized (zzhpr.class) {
                                        try {
                                            zzibmVar = zzd;
                                            if (zzibmVar == null) {
                                                zzibmVar = new zzibm(zzc);
                                                zzd = zzibmVar;
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
                        return zzc;
                    }
                    return new zzhpq(bArr);
                }
                return new zzhpr();
            }
            return zzibr.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zza", "zzb"});
        }
        return (byte) 1;
    }
}
