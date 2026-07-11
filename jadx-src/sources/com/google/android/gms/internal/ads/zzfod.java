package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfod extends zzibr implements zzidd {
    private static final zzfod zzc;
    private static volatile zzidk zzd;
    private int zza;
    private long zzb;

    final /* synthetic */ void zzb(long j2) {
        this.zzb = j2;
    }

    final /* synthetic */ void zzd(int i2) {
        this.zza = i2 - 2;
    }

    static {
        zzfod zzfodVar = new zzfod();
        zzc = zzfodVar;
        zzibr.zzbu(zzfod.class, zzfodVar);
    }

    public static zzfoc zza() {
        return (zzfoc) zzc.zzbn();
    }

    private zzfod() {
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
                                zzidk zzidkVar = zzd;
                                if (zzidkVar == null) {
                                    synchronized (zzfod.class) {
                                        try {
                                            zzibmVar = zzd;
                                            if (zzibmVar == null) {
                                                zzibmVar = new zzibm(zzc);
                                                zzd = zzibmVar;
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
                        return zzc;
                    }
                    return new zzfoc(bArr);
                }
                return new zzfod();
            }
            return zzibr.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"zza", "zzb"});
        }
        return (byte) 1;
    }
}
