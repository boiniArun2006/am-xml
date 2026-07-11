package com.google.android.gms.internal.ads;

import YgZ.uQga.IYJfqUyym;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzawx extends zzibr implements zzidd {
    private static final zzawx zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private long zzc = -1;

    static {
        zzawx zzawxVar = new zzawx();
        zzd = zzawxVar;
        zzibr.zzbu(zzawx.class, zzawxVar);
    }

    private zzawx() {
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
                                zzidk zzidkVar = zze;
                                if (zzidkVar == null) {
                                    synchronized (zzawx.class) {
                                        try {
                                            zzibmVar = zze;
                                            if (zzibmVar == null) {
                                                zzibmVar = new zzibm(zzd);
                                                zze = zzibmVar;
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
                        return zzd;
                    }
                    return new zzaww(bArr);
                }
                return new zzawx();
            }
            return zzibr.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zza", IYJfqUyym.ETZpi, zzawk.zza, "zzc"});
        }
        return (byte) 1;
    }
}
