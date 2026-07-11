package com.google.android.gms.internal.ads;

import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class zziid extends zzibr implements zzidd {
    private static final zziid zzh;
    private static volatile zzidk zzi;
    private int zza;
    private int zzb;
    private int zze;
    private String zzc = dpcnwfoVOnrtRA.PDEIhQmpAxhewwu;
    private zzibz zzd = zzibr.zzbC();
    private zzicd zzf = zzibr.zzbM();
    private zzian zzg = zzian.zza;

    static {
        zziid zziidVar = new zziid();
        zzh = zziidVar;
        zzibr.zzbu(zziid.class, zziidVar);
    }

    private zziid() {
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
                                zzidk zzidkVar = zzi;
                                if (zzidkVar == null) {
                                    synchronized (zziid.class) {
                                        try {
                                            zzibmVar = zzi;
                                            if (zzibmVar == null) {
                                                zzibmVar = new zzibm(zzh);
                                                zzi = zzibmVar;
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
                        return zzh;
                    }
                    return new zziic(bArr);
                }
                return new zziid();
            }
            return zzibr.zzbv(zzh, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", zziib.class, "zzg"});
        }
        return (byte) 1;
    }
}
