package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzgbf extends zzibr implements zzidd {
    private static volatile zzidk zzA;
    private static final zzgbf zzz;
    private int zza;
    private int zzb;
    private zzgbx zzf;
    private boolean zzg;
    private zzgbz zzj;
    private boolean zzy;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zze = true;
    private long zzh = 100;
    private long zzi = 2000;
    private long zzk = 10;
    private long zzl = 100;
    private long zzm = 20000;
    private String zzn = "";
    private String zzo = "";
    private long zzp = 500;
    private long zzu = 3000;
    private boolean zzv = true;
    private boolean zzw = true;
    private boolean zzx = true;

    final /* synthetic */ void zzB(long j2) {
        this.zza |= 32768;
        this.zzu = j2;
    }

    final /* synthetic */ void zzC(boolean z2) {
        this.zza |= 65536;
        this.zzv = z2;
    }

    public final int zzE() {
        int iZza = zzgbh.zza(this.zzb);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    final /* synthetic */ void zzF(int i2) {
        this.zzb = i2 - 1;
        this.zza |= 1;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return this.zze;
    }

    public final boolean zze() {
        return this.zzg;
    }

    public final long zzg() {
        return this.zzh;
    }

    public final long zzh() {
        return this.zzi;
    }

    public final long zzj() {
        return this.zzk;
    }

    public final long zzk() {
        return this.zzl;
    }

    public final long zzl() {
        return this.zzm;
    }

    public final String zzm() {
        return this.zzn;
    }

    public final String zzn() {
        return this.zzo;
    }

    public final long zzo() {
        return this.zzp;
    }

    public final long zzp() {
        return this.zzu;
    }

    public final boolean zzq() {
        return this.zzv;
    }

    public final boolean zzr() {
        return this.zzw;
    }

    public final boolean zzs() {
        return this.zzx;
    }

    public final boolean zzt() {
        return this.zzy;
    }

    final /* synthetic */ void zzv(boolean z2) {
        this.zza |= 2;
        this.zzc = z2;
    }

    final /* synthetic */ void zzy(long j2) {
        this.zza |= 64;
        this.zzh = j2;
    }

    final /* synthetic */ void zzz(long j2) {
        this.zza |= 128;
        this.zzi = j2;
    }

    static {
        zzgbf zzgbfVar = new zzgbf();
        zzz = zzgbfVar;
        zzibr.zzbu(zzgbf.class, zzgbfVar);
    }

    public static zzgbe zzu() {
        return (zzgbe) zzz.zzbn();
    }

    public final zzgbx zzd() {
        zzgbx zzgbxVar = this.zzf;
        return zzgbxVar == null ? zzgbx.zzg() : zzgbxVar;
    }

    public final zzgbz zzi() {
        zzgbz zzgbzVar = this.zzj;
        return zzgbzVar == null ? zzgbz.zzj() : zzgbzVar;
    }

    private zzgbf() {
    }

    final /* synthetic */ void zzA(zzgbz zzgbzVar) {
        zzgbzVar.getClass();
        this.zzj = zzgbzVar;
        this.zza |= 256;
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
                                zzidk zzidkVar = zzA;
                                if (zzidkVar == null) {
                                    synchronized (zzgbf.class) {
                                        try {
                                            zzibmVar = zzA;
                                            if (zzibmVar == null) {
                                                zzibmVar = new zzibm(zzz);
                                                zzA = zzibmVar;
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
                        return zzz;
                    }
                    return new zzgbe(bArr);
                }
                return new zzgbf();
            }
            return zzibr.zzbv(zzz, "\u0004\u0014\u0000\u0001\u0001\u0015\u0014\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဂ\u0007\bဉ\b\tဇ\u0001\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဈ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဇ\u0010\u0012ဂ\u0006\u0013ဇ\u0011\u0014ဇ\u0012\u0015ဇ\u0013", new Object[]{"zza", "zzb", zzgbg.zza, "zzd", "zze", "zzf", "zzg", "zzi", "zzj", "zzc", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzh", "zzw", "zzx", "zzy"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zzw(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    final /* synthetic */ void zzx(zzgbx zzgbxVar) {
        zzgbxVar.getClass();
        this.zzf = zzgbxVar;
        this.zza |= 16;
    }
}
