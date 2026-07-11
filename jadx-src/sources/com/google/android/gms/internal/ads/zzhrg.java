package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhrg extends zzibr implements zzidd {
    private static final zzhrg zzj;
    private static volatile zzidk zzk;
    private int zza;
    private int zzb;
    private zzhri zzc;
    private zzian zzd;
    private zzian zze;
    private zzian zzf;
    private zzian zzg;
    private zzian zzh;
    private zzian zzi;

    public final int zza() {
        return this.zzb;
    }

    public final zzian zzc() {
        return this.zzd;
    }

    public final zzian zzd() {
        return this.zze;
    }

    public final zzian zze() {
        return this.zzf;
    }

    public final zzian zzg() {
        return this.zzg;
    }

    public final zzian zzh() {
        return this.zzh;
    }

    public final zzian zzi() {
        return this.zzi;
    }

    final /* synthetic */ void zzm(int i2) {
        this.zzb = 0;
    }

    final /* synthetic */ void zzo(zzian zzianVar) {
        this.zzd = zzianVar;
    }

    final /* synthetic */ void zzp(zzian zzianVar) {
        this.zze = zzianVar;
    }

    final /* synthetic */ void zzq(zzian zzianVar) {
        this.zzf = zzianVar;
    }

    final /* synthetic */ void zzr(zzian zzianVar) {
        this.zzg = zzianVar;
    }

    final /* synthetic */ void zzs(zzian zzianVar) {
        this.zzh = zzianVar;
    }

    final /* synthetic */ void zzt(zzian zzianVar) {
        this.zzi = zzianVar;
    }

    static {
        zzhrg zzhrgVar = new zzhrg();
        zzj = zzhrgVar;
        zzibr.zzbu(zzhrg.class, zzhrgVar);
    }

    public static zzhrg zzj(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhrg) zzibr.zzbT(zzj, zzianVar, zzibbVar);
    }

    public static zzhrf zzk() {
        return (zzhrf) zzj.zzbn();
    }

    public static zzidk zzl() {
        return zzj.zzbd();
    }

    public final zzhri zzb() {
        zzhri zzhriVar = this.zzc;
        return zzhriVar == null ? zzhri.zzh() : zzhriVar;
    }

    private zzhrg() {
        zzian zzianVar = zzian.zza;
        this.zzd = zzianVar;
        this.zze = zzianVar;
        this.zzf = zzianVar;
        this.zzg = zzianVar;
        this.zzh = zzianVar;
        this.zzi = zzianVar;
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
                                zzidk zzidkVar = zzk;
                                if (zzidkVar == null) {
                                    synchronized (zzhrg.class) {
                                        try {
                                            zzibmVar = zzk;
                                            if (zzibmVar == null) {
                                                zzibmVar = new zzibm(zzj);
                                                zzk = zzibmVar;
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
                        return zzj;
                    }
                    return new zzhrf(bArr);
                }
                return new zzhrg();
            }
            return zzibr.zzbv(zzj, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zzn(zzhri zzhriVar) {
        zzhriVar.getClass();
        this.zzc = zzhriVar;
        this.zza |= 1;
    }
}
