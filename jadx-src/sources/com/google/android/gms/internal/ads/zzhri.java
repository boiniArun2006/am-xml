package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhri extends zzibr implements zzidd {
    private static final zzhri zzf;
    private static volatile zzidk zzg;
    private int zza;
    private int zzb;
    private zzhre zzc;
    private zzian zzd;
    private zzian zze;

    public static zzhri zzh() {
        return zzf;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzian zzc() {
        return this.zzd;
    }

    public final zzian zzd() {
        return this.zze;
    }

    final /* synthetic */ void zzk(zzian zzianVar) {
        this.zzd = zzianVar;
    }

    final /* synthetic */ void zzl(zzian zzianVar) {
        this.zze = zzianVar;
    }

    static {
        zzhri zzhriVar = new zzhri();
        zzf = zzhriVar;
        zzibr.zzbu(zzhri.class, zzhriVar);
    }

    public static zzhri zze(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhri) zzibr.zzbT(zzf, zzianVar, zzibbVar);
    }

    public static zzhrh zzg() {
        return (zzhrh) zzf.zzbn();
    }

    public static zzidk zzi() {
        return zzf.zzbd();
    }

    public final zzhre zzb() {
        zzhre zzhreVar = this.zzc;
        return zzhreVar == null ? zzhre.zzc() : zzhreVar;
    }

    private zzhri() {
        zzian zzianVar = zzian.zza;
        this.zzd = zzianVar;
        this.zze = zzianVar;
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
                                zzidk zzidkVar = zzg;
                                if (zzidkVar == null) {
                                    synchronized (zzhri.class) {
                                        try {
                                            zzibmVar = zzg;
                                            if (zzibmVar == null) {
                                                zzibmVar = new zzibm(zzf);
                                                zzg = zzibmVar;
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
                        return zzf;
                    }
                    return new zzhrh(bArr);
                }
                return new zzhri();
            }
            return zzibr.zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zzj(zzhre zzhreVar) {
        zzhreVar.getClass();
        this.zzc = zzhreVar;
        this.zza |= 1;
    }
}
