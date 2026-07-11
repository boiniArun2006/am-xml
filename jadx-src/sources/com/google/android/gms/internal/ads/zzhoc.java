package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhoc extends zzibr implements zzidd {
    private static final zzhoc zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private zzhog zzc;
    private zzhpv zzd;

    public final int zza() {
        return this.zzb;
    }

    static {
        zzhoc zzhocVar = new zzhoc();
        zze = zzhocVar;
        zzibr.zzbu(zzhoc.class, zzhocVar);
    }

    public static zzhoc zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhoc) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzhob zze() {
        return (zzhob) zze.zzbn();
    }

    public static zzidk zzg() {
        return zze.zzbd();
    }

    public final zzhog zzb() {
        zzhog zzhogVar = this.zzc;
        return zzhogVar == null ? zzhog.zze() : zzhogVar;
    }

    public final zzhpv zzc() {
        zzhpv zzhpvVar = this.zzd;
        return zzhpvVar == null ? zzhpv.zzg() : zzhpvVar;
    }

    private zzhoc() {
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
                                    synchronized (zzhoc.class) {
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
                    return new zzhob(bArr);
                }
                return new zzhoc();
            }
            return zzibr.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zzh(zzhog zzhogVar) {
        zzhogVar.getClass();
        this.zzc = zzhogVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzi(zzhpv zzhpvVar) {
        zzhpvVar.getClass();
        this.zzd = zzhpvVar;
        this.zza |= 2;
    }
}
