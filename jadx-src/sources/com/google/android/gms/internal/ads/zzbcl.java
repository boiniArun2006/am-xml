package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbcl extends zzibr implements zzidd {
    private static final zzbcl zzd;
    private static volatile zzidk zze;
    private int zza;
    private zzbcn zzb;
    private zzian zzc = zzian.zza;

    public static zzbcl zze() {
        return zzd;
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final boolean zzc() {
        return (this.zza & 2) != 0;
    }

    public final zzian zzd() {
        return this.zzc;
    }

    static {
        zzbcl zzbclVar = new zzbcl();
        zzd = zzbclVar;
        zzibr.zzbu(zzbcl.class, zzbclVar);
    }

    public final zzbcn zzb() {
        zzbcn zzbcnVar = this.zzb;
        return zzbcnVar == null ? zzbcn.zzd() : zzbcnVar;
    }

    private zzbcl() {
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
                                    synchronized (zzbcl.class) {
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
                    return new zzbck(bArr);
                }
                return new zzbcl();
            }
            return zzibr.zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }
}
