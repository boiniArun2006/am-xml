package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhrk extends zzibr implements zzidd {
    private static final zzhrk zze;
    private static volatile zzidk zzf;
    private int zza;
    private zzhrm zzb;
    private int zzc;
    private zzian zzd = zzian.zza;

    public final int zzb() {
        return this.zzc;
    }

    public final zzian zzc() {
        return this.zzd;
    }

    final /* synthetic */ void zzh(int i2) {
        this.zzc = i2;
    }

    final /* synthetic */ void zzi(zzian zzianVar) {
        this.zzd = zzianVar;
    }

    static {
        zzhrk zzhrkVar = new zzhrk();
        zze = zzhrkVar;
        zzibr.zzbu(zzhrk.class, zzhrkVar);
    }

    public static zzhrk zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhrk) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzhrj zze() {
        return (zzhrj) zze.zzbn();
    }

    public final zzhrm zza() {
        zzhrm zzhrmVar = this.zzb;
        return zzhrmVar == null ? zzhrm.zze() : zzhrmVar;
    }

    private zzhrk() {
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
                                zzidk zzidkVar = zzf;
                                if (zzidkVar == null) {
                                    synchronized (zzhrk.class) {
                                        try {
                                            zzibmVar = zzf;
                                            if (zzibmVar == null) {
                                                zzibmVar = new zzibm(zze);
                                                zzf = zzibmVar;
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
                        return zze;
                    }
                    return new zzhrj(bArr);
                }
                return new zzhrk();
            }
            return zzibr.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zzg(zzhrm zzhrmVar) {
        zzhrmVar.getClass();
        this.zzb = zzhrmVar;
        this.zza |= 1;
    }
}
