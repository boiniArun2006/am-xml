package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzaxq extends zzibr implements zzidd {
    private static final zzaxq zzh;
    private static volatile zzidk zzi;
    private int zza;
    private long zzd;
    private long zzf;
    private long zzg;
    private String zzb = "";
    private String zzc = "";
    private String zze = "D";

    final /* synthetic */ void zzb(String str) {
        this.zza |= 1;
        this.zzb = "0.825731049";
    }

    final /* synthetic */ void zzd(long j2) {
        this.zza |= 4;
        this.zzd = j2;
    }

    final /* synthetic */ void zzg(long j2) {
        this.zza |= 16;
        this.zzf = j2;
    }

    final /* synthetic */ void zzh(long j2) {
        this.zza |= 32;
        this.zzg = j2;
    }

    static {
        zzaxq zzaxqVar = new zzaxq();
        zzh = zzaxqVar;
        zzibr.zzbu(zzaxq.class, zzaxqVar);
    }

    public static zzaxp zza() {
        return (zzaxp) zzh.zzbn();
    }

    private zzaxq() {
    }

    final /* synthetic */ void zzc(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
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
                                    synchronized (zzaxq.class) {
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
                    return new zzaxp(bArr);
                }
                return new zzaxq();
            }
            return zzibr.zzbv(zzh, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }
}
