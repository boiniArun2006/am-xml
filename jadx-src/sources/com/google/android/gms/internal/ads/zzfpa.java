package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzfpa extends zzibr implements zzidd {
    private static final zzfpa zzb;
    private static volatile zzidk zzc;
    private String zza = "";

    static {
        zzfpa zzfpaVar = new zzfpa();
        zzb = zzfpaVar;
        zzibr.zzbu(zzfpa.class, zzfpaVar);
    }

    private zzfpa() {
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
                                zzidk zzidkVar = zzc;
                                if (zzidkVar == null) {
                                    synchronized (zzfpa.class) {
                                        try {
                                            zzibmVar = zzc;
                                            if (zzibmVar == null) {
                                                zzibmVar = new zzibm(zzb);
                                                zzc = zzibmVar;
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
                        return zzb;
                    }
                    return new zzfoz(bArr);
                }
                return new zzfpa();
            }
            return zzibr.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{HrvQKfmFZJudBc.ISLXBxUU});
        }
        return (byte) 1;
    }
}
