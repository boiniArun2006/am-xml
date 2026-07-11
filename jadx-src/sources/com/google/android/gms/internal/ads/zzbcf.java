package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbcf extends zzibr implements zzidd {
    private static final zzbcf zzc;
    private static volatile zzidk zzd;
    private int zza;
    private zzbcl zzb;

    static {
        zzbcf zzbcfVar = new zzbcf();
        zzc = zzbcfVar;
        zzibr.zzbu(zzbcf.class, zzbcfVar);
    }

    public static zzbcf zzb(byte[] bArr, zzibb zzibbVar) throws zzicg {
        return (zzbcf) zzibr.zzbV(zzc, bArr, zzibbVar);
    }

    public final zzbcl zza() {
        zzbcl zzbclVar = this.zzb;
        return zzbclVar == null ? zzbcl.zze() : zzbclVar;
    }

    private zzbcf() {
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
                                    synchronized (zzbcf.class) {
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
                    return new zzbce(bArr);
                }
                return new zzbcf();
            }
            return zzibr.zzbv(zzc, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        return (byte) 1;
    }
}
