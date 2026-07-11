package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhoy extends zzibr implements zzidd {
    private static final zzhoy zzc;
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
        zzhoy zzhoyVar = new zzhoy();
        zzc = zzhoyVar;
        zzibr.zzbu(zzhoy.class, zzhoyVar);
    }

    public static zzhoy zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhoy) zzibr.zzbT(zzc, zzianVar, zzibbVar);
    }

    public static zzhox zzd() {
        return (zzhox) zzc.zzbn();
    }

    private zzhoy() {
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
                                    synchronized (zzhoy.class) {
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
                    return new zzhox(bArr);
                }
                return new zzhoy();
            }
            return zzibr.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zza"});
        }
        return (byte) 1;
    }
}
