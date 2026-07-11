package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhqf extends zzibr implements zzidd {
    private static final zzhqf zzd;
    private static volatile zzidk zze;
    private String zza = "";
    private zzian zzb = zzian.zza;
    private int zzc;

    public static zzhqf zzh() {
        return zzd;
    }

    public final String zza() {
        return this.zza;
    }

    public final zzian zzb() {
        return this.zzb;
    }

    public final zzhqy zzc() {
        zzhqy zzhqyVarZzb = zzhqy.zzb(this.zzc);
        return zzhqyVarZzb == null ? zzhqy.UNRECOGNIZED : zzhqyVarZzb;
    }

    static {
        zzhqf zzhqfVar = new zzhqf();
        zzd = zzhqfVar;
        zzibr.zzbu(zzhqf.class, zzhqfVar);
    }

    public static zzhqf zzd(byte[] bArr, zzibb zzibbVar) throws zzicg {
        return (zzhqf) zzibr.zzbV(zzd, bArr, zzibbVar);
    }

    public static zzhqe zze() {
        return (zzhqe) zzd.zzbn();
    }

    public static zzhqe zzg(zzhqf zzhqfVar) {
        return (zzhqe) zzd.zzbo(zzhqfVar);
    }

    private zzhqf() {
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
                                    synchronized (zzhqf.class) {
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
                    return new zzhqe(bArr);
                }
                return new zzhqf();
            }
            return zzibr.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void zzj(zzian zzianVar) {
        zzianVar.getClass();
        this.zzb = zzianVar;
    }

    final /* synthetic */ void zzk(zzhqy zzhqyVar) {
        this.zzc = zzhqyVar.zza();
    }
}
