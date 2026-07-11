package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfpl extends zzibr implements zzidd {
    private static final zzfpl zzc;
    private static volatile zzidk zzd;
    private zzicd zza = zzibr.zzbM();
    private long zzb;

    final /* synthetic */ void zzc(long j2) {
        this.zzb = j2;
    }

    static {
        zzfpl zzfplVar = new zzfpl();
        zzc = zzfplVar;
        zzibr.zzbu(zzfpl.class, zzfplVar);
    }

    public static zzfpk zza() {
        return (zzfpk) zzc.zzbn();
    }

    private zzfpl() {
    }

    final /* synthetic */ void zzb(zzfod zzfodVar) {
        zzfodVar.getClass();
        zzicd zzicdVar = this.zza;
        if (!zzicdVar.zza()) {
            this.zza = zzibr.zzbN(zzicdVar);
        }
        this.zza.add(zzfodVar);
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
                                    synchronized (zzfpl.class) {
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
                    return new zzfpk(bArr);
                }
                return new zzfpl();
            }
            return zzibr.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", zzfod.class, "zzb"});
        }
        return (byte) 1;
    }
}
