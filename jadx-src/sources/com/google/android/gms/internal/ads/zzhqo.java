package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhqo extends zzibr implements zzidd {
    private static final zzhqo zze;
    private static volatile zzidk zzf;
    private String zza = "";
    private int zzb;
    private int zzc;
    private int zzd;

    final /* synthetic */ void zzc(int i2) {
        this.zzc = i2;
    }

    static {
        zzhqo zzhqoVar = new zzhqo();
        zze = zzhqoVar;
        zzibr.zzbu(zzhqo.class, zzhqoVar);
    }

    public static zzhqn zza() {
        return (zzhqn) zze.zzbn();
    }

    private zzhqo() {
    }

    final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void zzd(zzhqy zzhqyVar) {
        this.zzd = zzhqyVar.zza();
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
                                    synchronized (zzhqo.class) {
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
                    return new zzhqn(bArr);
                }
                return new zzhqo();
            }
            return zzibr.zzbv(zze, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zzg(int i2) {
        this.zzb = zzhqd.zza(i2);
    }
}
