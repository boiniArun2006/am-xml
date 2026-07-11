package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhpe extends zzibr implements zzidd {
    private static final zzhpe zzd;
    private static volatile zzidk zze;
    private int zza;
    private zzhpg zzb;
    private int zzc;

    static {
        zzhpe zzhpeVar = new zzhpe();
        zzd = zzhpeVar;
        zzibr.zzbu(zzhpe.class, zzhpeVar);
    }

    public static zzhpe zzb(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhpe) zzibr.zzbT(zzd, zzianVar, zzibbVar);
    }

    public static zzhpd zzc() {
        return (zzhpd) zzd.zzbn();
    }

    public final zzhpg zza() {
        zzhpg zzhpgVar = this.zzb;
        return zzhpgVar == null ? zzhpg.zzc() : zzhpgVar;
    }

    private zzhpe() {
    }

    final /* synthetic */ void zzd(zzhpg zzhpgVar) {
        zzhpgVar.getClass();
        this.zzb = zzhpgVar;
        this.zza |= 1;
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
                                    synchronized (zzhpe.class) {
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
                    return new zzhpd(bArr);
                }
                return new zzhpe();
            }
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }
}
