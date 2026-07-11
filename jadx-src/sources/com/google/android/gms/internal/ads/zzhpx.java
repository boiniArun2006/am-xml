package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhpx extends zzibr implements zzidd {
    private static final zzhpx zze;
    private static volatile zzidk zzf;
    private int zza;
    private zzhpz zzb;
    private int zzc;
    private int zzd;

    public static zzhpx zzg() {
        return zze;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    final /* synthetic */ void zzi(int i2) {
        this.zzc = i2;
    }

    static {
        zzhpx zzhpxVar = new zzhpx();
        zze = zzhpxVar;
        zzibr.zzbu(zzhpx.class, zzhpxVar);
    }

    public static zzhpx zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhpx) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzhpw zze() {
        return (zzhpw) zze.zzbn();
    }

    public final zzhpz zza() {
        zzhpz zzhpzVar = this.zzb;
        return zzhpzVar == null ? zzhpz.zzd() : zzhpzVar;
    }

    private zzhpx() {
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
                                    synchronized (zzhpx.class) {
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
                    return new zzhpw(bArr);
                }
                return new zzhpx();
            }
            return zzibr.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zzh(zzhpz zzhpzVar) {
        zzhpzVar.getClass();
        this.zzb = zzhpzVar;
        this.zza |= 1;
    }
}
