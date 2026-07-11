package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzigp extends zzibr implements zzidd {
    private static final zzigp zzi;
    private static volatile zzidk zzj;
    private int zza;
    private zzigo zzb;
    private zzian zzd;
    private zzian zze;
    private int zzf;
    private zzian zzg;
    private byte zzh = 2;
    private zzicd zzc = zzibr.zzbM();

    static {
        zzigp zzigpVar = new zzigp();
        zzi = zzigpVar;
        zzibr.zzbu(zzigp.class, zzigpVar);
    }

    private zzigp() {
        zzian zzianVar = zzian.zza;
        this.zzd = zzianVar;
        this.zze = zzianVar;
        this.zzg = zzianVar;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        byte b2;
        zzidk zzibmVar;
        byte[] bArr = null;
        switch (zzibqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzh);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b2 = 0;
                } else {
                    b2 = 1;
                }
                this.zzh = b2;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzibr.zzbv(zzi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zza", "zzb", "zzc", zzigh.class, "zzd", "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzigp();
            case NEW_BUILDER:
                return new zzigm(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzi;
            case GET_PARSER:
                zzidk zzidkVar = zzj;
                if (zzidkVar == null) {
                    synchronized (zzigp.class) {
                        try {
                            zzibmVar = zzj;
                            if (zzibmVar == null) {
                                zzibmVar = new zzibm(zzi);
                                zzj = zzibmVar;
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
