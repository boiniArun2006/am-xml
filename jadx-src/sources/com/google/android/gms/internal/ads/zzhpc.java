package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhpc extends zzibr implements zzidd {
    private static final zzhpc zza;
    private static volatile zzidk zzb;

    public static zzhpc zzb() {
        return zza;
    }

    static {
        zzhpc zzhpcVar = new zzhpc();
        zza = zzhpcVar;
        zzibr.zzbu(zzhpc.class, zzhpcVar);
    }

    public static zzhpc zza(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhpc) zzibr.zzbT(zza, zzianVar, zzibbVar);
    }

    private zzhpc() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal != 0) {
            byte[] bArr = null;
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                zzidk zzidkVar = zzb;
                                if (zzidkVar == null) {
                                    synchronized (zzhpc.class) {
                                        try {
                                            zzibmVar = zzb;
                                            if (zzibmVar == null) {
                                                zzibmVar = new zzibm(zza);
                                                zzb = zzibmVar;
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
                        return zza;
                    }
                    return new zzhpb(bArr);
                }
                return new zzhpc();
            }
            return zzibr.zzbv(zza, "\u0000\u0000", null);
        }
        return (byte) 1;
    }
}
