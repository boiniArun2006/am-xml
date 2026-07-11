package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbcd extends zzibr implements zzidd {
    private static final zzbcd zzh;
    private static volatile zzidk zzi;
    private int zza;
    private long zzc;
    private long zzf;
    private zzian zzb = zzian.zza;
    private String zzd = "";
    private String zze = "";
    private String zzg = "";

    final /* synthetic */ void zzb(zzian zzianVar) {
        this.zza |= 1;
        this.zzb = zzianVar;
    }

    final /* synthetic */ void zzc(long j2) {
        this.zza |= 2;
        this.zzc = j2;
    }

    final /* synthetic */ void zzg(long j2) {
        this.zza |= 16;
        this.zzf = j2;
    }

    static {
        zzbcd zzbcdVar = new zzbcd();
        zzh = zzbcdVar;
        zzibr.zzbu(zzbcd.class, zzbcdVar);
    }

    public static zzbcc zza() {
        return (zzbcc) zzh.zzbn();
    }

    private zzbcd() {
    }

    final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
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
                                zzidk zzidkVar = zzi;
                                if (zzidkVar == null) {
                                    synchronized (zzbcd.class) {
                                        try {
                                            zzibmVar = zzi;
                                            if (zzibmVar == null) {
                                                zzibmVar = new zzibm(zzh);
                                                zzi = zzibmVar;
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
                        return zzh;
                    }
                    return new zzbcc(bArr);
                }
                return new zzbcd();
            }
            return zzibr.zzbv(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }
}
