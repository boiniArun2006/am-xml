package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhqx extends zzibr implements zzidd {
    private static final zzhqx zzd;
    private static volatile zzidk zze;
    private int zza;
    private String zzb = "";
    private zzhqf zzc;

    public static zzhqx zze() {
        return zzd;
    }

    public final String zza() {
        return this.zzb;
    }

    static {
        zzhqx zzhqxVar = new zzhqx();
        zzd = zzhqxVar;
        zzibr.zzbu(zzhqx.class, zzhqxVar);
    }

    public static zzhqx zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhqx) zzibr.zzbT(zzd, zzianVar, zzibbVar);
    }

    public static zzhqw zzd() {
        return (zzhqw) zzd.zzbn();
    }

    public final zzhqf zzb() {
        zzhqf zzhqfVar = this.zzc;
        return zzhqfVar == null ? zzhqf.zzh() : zzhqfVar;
    }

    private zzhqx() {
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
                                    synchronized (zzhqx.class) {
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
                    return new zzhqw(bArr);
                }
                return new zzhqx();
            }
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zzb = str;
    }

    final /* synthetic */ void zzh(zzhqf zzhqfVar) {
        zzhqfVar.getClass();
        this.zzc = zzhqfVar;
        this.zza |= 1;
    }
}
