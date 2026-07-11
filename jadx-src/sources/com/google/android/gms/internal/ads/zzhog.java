package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhog extends zzibr implements zzidd {
    private static final zzhog zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private zzhok zzc;
    private zzian zzd = zzian.zza;

    public static zzhog zze() {
        return zze;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzian zzc() {
        return this.zzd;
    }

    final /* synthetic */ void zzh(zzian zzianVar) {
        this.zzd = zzianVar;
    }

    static {
        zzhog zzhogVar = new zzhog();
        zze = zzhogVar;
        zzibr.zzbu(zzhog.class, zzhogVar);
    }

    public static zzhof zzd() {
        return (zzhof) zze.zzbn();
    }

    public final zzhok zzb() {
        zzhok zzhokVar = this.zzc;
        return zzhokVar == null ? zzhok.zzc() : zzhokVar;
    }

    private zzhog() {
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
                                    synchronized (zzhog.class) {
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
                    return new zzhof(bArr);
                }
                return new zzhog();
            }
            return zzibr.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zzg(zzhok zzhokVar) {
        zzhokVar.getClass();
        this.zzc = zzhokVar;
        this.zza |= 1;
    }
}
