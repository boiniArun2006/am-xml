package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzihf extends zzibr implements zzidd {
    private static final zzihf zzf;
    private static volatile zzidk zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private zzian zzd;
    private zzian zze;

    final /* synthetic */ void zzd(String str) {
        this.zza |= 2;
        this.zzc = MimeTypes.IMAGE_PNG;
    }

    final /* synthetic */ void zzh(int i2) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }

    static {
        zzihf zzihfVar = new zzihf();
        zzf = zzihfVar;
        zzibr.zzbu(zzihf.class, zzihfVar);
    }

    public static zzihd zzc() {
        return (zzihd) zzf.zzbn();
    }

    private zzihf() {
        zzian zzianVar = zzian.zza;
        this.zzd = zzianVar;
        this.zze = zzianVar;
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
                                    synchronized (zzihf.class) {
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
                    return new zzihd(bArr);
                }
                return new zzihf();
            }
            return zzibr.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", zzihe.zza, "zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zze(zzian zzianVar) {
        zzianVar.getClass();
        this.zza |= 4;
        this.zzd = zzianVar;
    }
}
