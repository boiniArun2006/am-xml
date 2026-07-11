package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhny extends zzibr implements zzidd {
    private static final zzhny zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private zzhoa zzc;

    public final int zza() {
        return this.zzb;
    }

    final /* synthetic */ void zze(int i2) {
        this.zzb = i2;
    }

    static {
        zzhny zzhnyVar = new zzhny();
        zzd = zzhnyVar;
        zzibr.zzbu(zzhny.class, zzhnyVar);
    }

    public static zzhny zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhny) zzibr.zzbT(zzd, zzianVar, zzibbVar);
    }

    public static zzhnx zzd() {
        return (zzhnx) zzd.zzbn();
    }

    public final zzhoa zzb() {
        zzhoa zzhoaVar = this.zzc;
        return zzhoaVar == null ? zzhoa.zzc() : zzhoaVar;
    }

    private zzhny() {
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
                                    synchronized (zzhny.class) {
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
                    return new zzhnx(bArr);
                }
                return new zzhny();
            }
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zzg(zzhoa zzhoaVar) {
        zzhoaVar.getClass();
        this.zzc = zzhoaVar;
        this.zza |= 1;
    }
}
