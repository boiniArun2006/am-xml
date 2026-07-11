package com.google.android.gms.internal.ads;

import android.graphics.Trmy.yioUaKMByL;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzije extends zzibr implements zzidd {
    private static final zzije zzj;
    private static volatile zzidk zzk;
    private int zza;
    private zziin zzh;
    private String zzb = "";
    private String zzc = "";
    private zzicd zzd = zzibr.zzbM();
    private zzicd zze = zzibr.zzbM();
    private zzicd zzf = zzibr.zzbM();
    private int zzg = -1;
    private String zzi = "";

    static {
        zzije zzijeVar = new zzije();
        zzj = zzijeVar;
        zzibr.zzbu(zzije.class, zzijeVar);
    }

    private zzije() {
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
                                    synchronized (zzije.class) {
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
                    return new zzijd(bArr);
                }
                return new zzije();
            }
            return zzibr.zzbv(zzj, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0004င\u0002\u0005ဈ\u0000\b\u001b\tဈ\u0004\nဉ\u0003", new Object[]{yioUaKMByL.HwQWBeYtJU, "zzc", "zzd", zziir.class, "zze", zziiy.class, "zzg", "zzb", "zzf", zzijl.class, "zzi", "zzh"});
        }
        return (byte) 1;
    }
}
