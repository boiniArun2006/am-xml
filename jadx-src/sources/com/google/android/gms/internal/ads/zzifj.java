package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzifj extends zzibr implements zzidd {
    private static final zzifj zzd;
    private static volatile zzidk zze;
    private int zza;
    private long zzb;
    private long zzc;

    final /* synthetic */ void zzd(int i2) {
        this.zza = i2;
    }

    final /* synthetic */ void zze(long j2) {
        this.zzb = j2;
    }

    final /* synthetic */ void zzg(long j2) {
        this.zzc = j2;
    }

    static {
        zzifj zzifjVar = new zzifj();
        zzd = zzifjVar;
        zzibr.zzbu(zzifj.class, zzifjVar);
    }

    public static zzifi zzc() {
        return (zzifi) zzd.zzbn();
    }

    private zzifj() {
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
                                    synchronized (zzifj.class) {
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
                    return new zzifi(bArr);
                }
                return new zzifj();
            }
            return zzibr.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }
}
