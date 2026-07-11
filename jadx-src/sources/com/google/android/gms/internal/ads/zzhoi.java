package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhoi extends zzibr implements zzidd {
    private static final zzhoi zzd;
    private static volatile zzidk zze;
    private int zza;
    private zzhok zzb;
    private int zzc;

    public static zzhoi zzd() {
        return zzd;
    }

    public final int zzb() {
        return this.zzc;
    }

    final /* synthetic */ void zzg(int i2) {
        this.zzc = i2;
    }

    static {
        zzhoi zzhoiVar = new zzhoi();
        zzd = zzhoiVar;
        zzibr.zzbu(zzhoi.class, zzhoiVar);
    }

    public static zzhoh zzc() {
        return (zzhoh) zzd.zzbn();
    }

    public final zzhok zza() {
        zzhok zzhokVar = this.zzb;
        return zzhokVar == null ? zzhok.zzc() : zzhokVar;
    }

    private zzhoi() {
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
                                    synchronized (zzhoi.class) {
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
                    return new zzhoh(bArr);
                }
                return new zzhoi();
            }
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zze(zzhok zzhokVar) {
        zzhokVar.getClass();
        this.zzb = zzhokVar;
        this.zza |= 1;
    }
}
