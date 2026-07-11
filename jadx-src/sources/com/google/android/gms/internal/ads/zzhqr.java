package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhqr extends zzibr implements zzidd {
    private static final zzhqr zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private zzhqt zzc;

    public final int zza() {
        return this.zzb;
    }

    static {
        zzhqr zzhqrVar = new zzhqr();
        zzd = zzhqrVar;
        zzibr.zzbu(zzhqr.class, zzhqrVar);
    }

    public static zzhqr zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhqr) zzibr.zzbT(zzd, zzianVar, zzibbVar);
    }

    public static zzhqq zzd() {
        return (zzhqq) zzd.zzbn();
    }

    public static zzidk zze() {
        return zzd.zzbd();
    }

    public final zzhqt zzb() {
        zzhqt zzhqtVar = this.zzc;
        return zzhqtVar == null ? zzhqt.zzd() : zzhqtVar;
    }

    private zzhqr() {
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
                                    synchronized (zzhqr.class) {
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
                    return new zzhqq(bArr);
                }
                return new zzhqr();
            }
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zzg(zzhqt zzhqtVar) {
        zzhqtVar.getClass();
        this.zzc = zzhqtVar;
        this.zza |= 1;
    }
}
