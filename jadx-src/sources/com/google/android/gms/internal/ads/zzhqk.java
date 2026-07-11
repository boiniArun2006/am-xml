package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhqk extends zzibr implements zzidd {
    private static final zzhqk zzf;
    private static volatile zzidk zzg;
    private int zza;
    private zzhqc zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzhqy zzd() {
        zzhqy zzhqyVarZzb = zzhqy.zzb(this.zze);
        return zzhqyVarZzb == null ? zzhqy.UNRECOGNIZED : zzhqyVarZzb;
    }

    final /* synthetic */ void zzh(int i2) {
        this.zzd = i2;
    }

    public final int zzk() {
        int i2 = this.zzc;
        int i3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    static {
        zzhqk zzhqkVar = new zzhqk();
        zzf = zzhqkVar;
        zzibr.zzbu(zzhqk.class, zzhqkVar);
    }

    public static zzhqj zze() {
        return (zzhqj) zzf.zzbn();
    }

    public final zzhqc zzb() {
        zzhqc zzhqcVar = this.zzb;
        return zzhqcVar == null ? zzhqc.zze() : zzhqcVar;
    }

    private zzhqk() {
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
                                    synchronized (zzhqk.class) {
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
                    return new zzhqj(bArr);
                }
                return new zzhqk();
            }
            return zzibr.zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zzg(zzhqc zzhqcVar) {
        zzhqcVar.getClass();
        this.zzb = zzhqcVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzi(zzhqy zzhqyVar) {
        this.zze = zzhqyVar.zza();
    }

    final /* synthetic */ void zzl(int i2) {
        this.zzc = zzhqd.zza(i2);
    }
}
