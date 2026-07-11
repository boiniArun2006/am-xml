package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zziin extends zzibr implements zzidd {
    private static final zziin zzb;
    private static volatile zzidk zzc;
    private zzicd zza = zzibr.zzbM();

    static {
        zziin zziinVar = new zziin();
        zzb = zziinVar;
        zzibr.zzbu(zziin.class, zziinVar);
    }

    private zziin() {
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
                                    synchronized (zziin.class) {
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
                    return new zziim(bArr);
                }
                return new zziin();
            }
            return zzibr.zzbv(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zziil.class});
        }
        return (byte) 1;
    }
}
