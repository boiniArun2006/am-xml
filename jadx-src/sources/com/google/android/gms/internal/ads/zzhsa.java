package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhsa extends zzibr implements zzidd {
    private static final zzhsa zzb;
    private static volatile zzidk zzc;
    private int zza;

    public static zzhsa zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    static {
        zzhsa zzhsaVar = new zzhsa();
        zzb = zzhsaVar;
        zzibr.zzbu(zzhsa.class, zzhsaVar);
    }

    public static zzhsa zzb(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhsa) zzibr.zzbT(zzb, zzianVar, zzibbVar);
    }

    private zzhsa() {
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
                                    synchronized (zzhsa.class) {
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
                    return new zzhrz(bArr);
                }
                return new zzhsa();
            }
            return zzibr.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        return (byte) 1;
    }
}
