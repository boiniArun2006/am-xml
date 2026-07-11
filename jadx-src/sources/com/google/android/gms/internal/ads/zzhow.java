package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhow extends zzibr implements zzidd {
    private static final zzhow zzc;
    private static volatile zzidk zzd;
    private int zza;
    private zzian zzb = zzian.zza;

    public final int zza() {
        return this.zza;
    }

    public final zzian zzb() {
        return this.zzb;
    }

    final /* synthetic */ void zzg(zzian zzianVar) {
        this.zzb = zzianVar;
    }

    static {
        zzhow zzhowVar = new zzhow();
        zzc = zzhowVar;
        zzibr.zzbu(zzhow.class, zzhowVar);
    }

    public static zzhow zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhow) zzibr.zzbT(zzc, zzianVar, zzibbVar);
    }

    public static zzhov zzd() {
        return (zzhov) zzc.zzbn();
    }

    public static zzidk zze() {
        return zzc.zzbd();
    }

    private zzhow() {
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
                                    synchronized (zzhow.class) {
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
                    return new zzhov(bArr);
                }
                return new zzhow();
            }
            return zzibr.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zza", "zzb"});
        }
        return (byte) 1;
    }
}
