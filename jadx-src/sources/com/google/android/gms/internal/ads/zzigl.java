package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzigl extends zzibr implements zzidd {
    private static final zzigl zzh;
    private static volatile zzidk zzi;
    private int zza;
    private zzigk zzb;
    private zzian zzd;
    private zzian zze;
    private int zzf;
    private byte zzg = 2;
    private zzicd zzc = zzibr.zzbM();

    static {
        zzigl zziglVar = new zzigl();
        zzh = zziglVar;
        zzibr.zzbu(zzigl.class, zziglVar);
    }

    public static zzigi zzc() {
        return (zzigi) zzh.zzbn();
    }

    private zzigl() {
        zzian zzianVar = zzian.zza;
        this.zzd = zzianVar;
        this.zze = zzianVar;
    }

    final /* synthetic */ void zzd(zzigh zzighVar) {
        zzighVar.getClass();
        zzicd zzicdVar = this.zzc;
        if (!zzicdVar.zza()) {
            this.zzc = zzibr.zzbN(zzicdVar);
        }
        this.zzc.add(zzighVar);
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        byte b2;
        zzidk zzibmVar;
        byte[] bArr = null;
        switch (zzibqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzg);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b2 = 0;
                } else {
                    b2 = 1;
                }
                this.zzg = b2;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzibr.zzbv(zzh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zza", "zzb", "zzc", zzigh.class, "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzigl();
            case NEW_BUILDER:
                return new zzigi(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzh;
            case GET_PARSER:
                zzidk zzidkVar = zzi;
                if (zzidkVar == null) {
                    synchronized (zzigl.class) {
                        try {
                            zzibmVar = zzi;
                            if (zzibmVar == null) {
                                zzibmVar = new zzibm(zzh);
                                zzi = zzibmVar;
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
