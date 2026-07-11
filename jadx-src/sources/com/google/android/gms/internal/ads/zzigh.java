package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzigh extends zzibr implements zzidd {
    private static final zzigh zze;
    private static volatile zzidk zzf;
    private int zza;
    private zzian zzb;
    private zzian zzc;
    private byte zzd = 2;

    final /* synthetic */ void zzd(zzian zzianVar) {
        this.zza |= 1;
        this.zzb = zzianVar;
    }

    final /* synthetic */ void zze(zzian zzianVar) {
        this.zza |= 2;
        this.zzc = zzianVar;
    }

    static {
        zzigh zzighVar = new zzigh();
        zze = zzighVar;
        zzibr.zzbu(zzigh.class, zzighVar);
    }

    public static zzigg zzc() {
        return (zzigg) zze.zzbn();
    }

    private zzigh() {
        zzian zzianVar = zzian.zza;
        this.zzb = zzianVar;
        this.zzc = zzianVar;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        byte b2;
        zzidk zzibmVar;
        byte[] bArr = null;
        switch (zzibqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzd);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b2 = 0;
                } else {
                    b2 = 1;
                }
                this.zzd = b2;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzibr.zzbv(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzigh();
            case NEW_BUILDER:
                return new zzigg(bArr);
            case GET_DEFAULT_INSTANCE:
                return zze;
            case GET_PARSER:
                zzidk zzidkVar = zzf;
                if (zzidkVar == null) {
                    synchronized (zzigh.class) {
                        try {
                            zzibmVar = zzf;
                            if (zzibmVar == null) {
                                zzibmVar = new zzibm(zze);
                                zzf = zzibmVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return zzibmVar;
                }
                return zzidkVar;
            default:
                throw null;
        }
    }
}
