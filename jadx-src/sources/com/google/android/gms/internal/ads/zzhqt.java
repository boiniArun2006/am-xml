package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhqt extends zzibr implements zzidd {
    private static final zzhqt zzb;
    private static volatile zzidk zzc;
    private String zza = "";

    public static zzhqt zzd() {
        return zzb;
    }

    public final String zza() {
        return this.zza;
    }

    static {
        zzhqt zzhqtVar = new zzhqt();
        zzb = zzhqtVar;
        zzibr.zzbu(zzhqt.class, zzhqtVar);
    }

    public static zzhqt zzb(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhqt) zzibr.zzbT(zzb, zzianVar, zzibbVar);
    }

    public static zzhqs zzc() {
        return (zzhqs) zzb.zzbn();
    }

    private zzhqt() {
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
                                    synchronized (zzhqt.class) {
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
                    return new zzhqs(bArr);
                }
                return new zzhqt();
            }
            return zzibr.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza = str;
    }
}
