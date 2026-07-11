package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhok extends zzibr implements zzidd {
    private static final zzhok zzb;
    private static volatile zzidk zzc;
    private int zza;

    public static zzhok zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    final /* synthetic */ void zzd(int i2) {
        this.zza = i2;
    }

    static {
        zzhok zzhokVar = new zzhok();
        zzb = zzhokVar;
        zzibr.zzbu(zzhok.class, zzhokVar);
    }

    public static zzhoj zzb() {
        return (zzhoj) zzb.zzbn();
    }

    private zzhok() {
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
                                zzidk zzidkVar = zzc;
                                if (zzidkVar == null) {
                                    synchronized (zzhok.class) {
                                        try {
                                            zzibmVar = zzc;
                                            if (zzibmVar == null) {
                                                zzibmVar = new zzibm(zzb);
                                                zzc = zzibmVar;
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
                        return zzb;
                    }
                    return new zzhoj(bArr);
                }
                return new zzhok();
            }
            return zzibr.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        return (byte) 1;
    }
}
