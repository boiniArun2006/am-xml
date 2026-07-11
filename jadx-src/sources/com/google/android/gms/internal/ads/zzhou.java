package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhou extends zzibr implements zzidd {
    private static final zzhou zzc;
    private static volatile zzidk zzd;
    private int zza;
    private int zzb;

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    final /* synthetic */ void zze(int i2) {
        this.zza = i2;
    }

    static {
        zzhou zzhouVar = new zzhou();
        zzc = zzhouVar;
        zzibr.zzbu(zzhou.class, zzhouVar);
    }

    public static zzhou zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhou) zzibr.zzbT(zzc, zzianVar, zzibbVar);
    }

    public static zzhot zzd() {
        return (zzhot) zzc.zzbn();
    }

    private zzhou() {
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
                                    synchronized (zzhou.class) {
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
                    return new zzhot(bArr);
                }
                return new zzhou();
            }
            return zzibr.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb"});
        }
        return (byte) 1;
    }
}
