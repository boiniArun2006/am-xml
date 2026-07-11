package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzavk extends zzibr implements zzidd {
    private static final zzavk zzn;
    private static volatile zzidk zzo;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private zzicd zzb = zzibr.zzbM();
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";

    final /* synthetic */ void zzd(long j2) {
        this.zza |= 1;
        this.zzc = j2;
    }

    final /* synthetic */ void zzj(long j2) {
        this.zza |= 64;
        this.zzi = j2;
    }

    final /* synthetic */ void zzm(long j2) {
        this.zza |= 512;
        this.zzl = j2;
    }

    final /* synthetic */ void zzn(long j2) {
        this.zza |= 1024;
        this.zzm = j2;
    }

    final /* synthetic */ void zzp(int i2) {
        this.zzg = i2 - 1;
        this.zza |= 16;
    }

    static {
        zzavk zzavkVar = new zzavk();
        zzn = zzavkVar;
        zzibr.zzbu(zzavk.class, zzavkVar);
    }

    public static zzavj zza() {
        return (zzavj) zzn.zzbn();
    }

    private zzavk() {
    }

    final /* synthetic */ void zzb(zzawc zzawcVar) {
        zzawcVar.getClass();
        zzicd zzicdVar = this.zzb;
        if (!zzicdVar.zza()) {
            this.zzb = zzibr.zzbN(zzicdVar);
        }
        this.zzb.add(zzawcVar);
    }

    final /* synthetic */ void zzc() {
        this.zzb = zzibr.zzbM();
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
                                zzidk zzidkVar = zzo;
                                if (zzidkVar == null) {
                                    synchronized (zzavk.class) {
                                        try {
                                            zzibmVar = zzo;
                                            if (zzibmVar == null) {
                                                zzibmVar = new zzibm(zzn);
                                                zzo = zzibmVar;
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
                        return zzn;
                    }
                    return new zzavj(bArr);
                }
                return new zzavk();
            }
            return zzibr.zzbv(zzn, "\u0004\f\u0000\u0001\b?\f\u0000\u0001\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n", new Object[]{"zza", "zzb", zzawc.class, "zzc", "zzd", "zze", "zzf", "zzg", zzawa.zza, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzd = str;
    }

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza |= 4;
        this.zze = str;
    }

    final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 8;
        this.zzf = str;
    }

    final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzh = str;
    }

    final /* synthetic */ void zzk(String str) {
        str.getClass();
        this.zza |= 128;
        this.zzj = str;
    }

    final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zza |= 256;
        this.zzk = str;
    }
}
