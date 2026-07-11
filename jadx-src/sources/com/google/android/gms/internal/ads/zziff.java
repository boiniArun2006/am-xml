package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zziff extends zzibr implements zzidd {
    private static final zziff zzc;
    private static volatile zzidk zzd;
    private zzibz zza = zzibr.zzbC();
    private zzibz zzb = zzibr.zzbC();

    static {
        zziff zziffVar = new zziff();
        zzc = zziffVar;
        zzibr.zzbu(zziff.class, zziffVar);
    }

    public static zziff zzc(byte[] bArr, zzibb zzibbVar) throws zzicg {
        return (zziff) zzibr.zzbV(zzc, bArr, zzibbVar);
    }

    private zziff() {
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
                                    synchronized (zziff.class) {
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
                    return new zzife(bArr);
                }
                return new zziff();
            }
            return zzibr.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zza", "zzb"});
        }
        return (byte) 1;
    }
}
