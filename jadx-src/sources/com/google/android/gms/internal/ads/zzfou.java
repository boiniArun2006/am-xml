package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfou extends zzibr implements zzidd {
    private static final zzfou zzay;
    private static volatile zzidk zzaz;
    private int zzA;
    private int zzE;
    private int zzF;
    private int zzG;
    private long zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private int zzL;
    private int zzS;
    private int zzT;
    private int zzV;
    private int zza;
    private long zzaf;
    private int zzah;
    private int zzai;
    private int zzaj;
    private zzfpv zzak;
    private int zzal;
    private zzfpr zzam;
    private zzfpa zzan;
    private zzfpg zzao;
    private zzfpe zzap;
    private zzfpt zzaq;
    private zzfpn zzar;
    private zzfpj zzas;
    private zziff zzat;
    private zzfpx zzav;
    private zzfpl zzaw;
    private zzfpc zzax;
    private int zzb;
    private int zzc;
    private long zze;
    private long zzf;
    private long zzg;
    private boolean zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private String zzd = "";
    private zzibz zzh = zzibr.zzbC();
    private String zzo = "";
    private String zzp = "";
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzx = "";
    private String zzy = "";
    private String zzz = "";
    private String zzB = "";
    private String zzC = "";
    private zzicc zzD = zzibr.zzbE();
    private String zzM = "";
    private String zzN = "";
    private String zzO = "";
    private String zzP = "";
    private String zzQ = "";
    private String zzR = "";
    private String zzU = "";
    private String zzW = "";
    private String zzX = "";
    private String zzY = "";
    private String zzZ = "";
    private String zzaa = "";
    private String zzab = "";
    private String zzac = "";
    private String zzad = "";
    private String zzae = "";
    private String zzag = "";
    private String zzau = "";

    final /* synthetic */ void zzA(int i2) {
        if (i2 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzE = i2 - 2;
    }

    final /* synthetic */ void zzB(int i2) {
        if (i2 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzL = i2 - 2;
    }

    final /* synthetic */ void zzb(boolean z2) {
        this.zzi = z2;
    }

    final /* synthetic */ void zzc(long j2) {
        this.zzj = j2;
    }

    final /* synthetic */ void zzd(long j2) {
        this.zzk = j2;
    }

    final /* synthetic */ void zzi(int i2) {
        this.zzA = i2;
    }

    final /* synthetic */ void zzk(int i2) {
        this.zzG = i2;
    }

    final /* synthetic */ void zzl(long j2) {
        this.zzH = j2;
    }

    final /* synthetic */ void zzp(String str) {
        this.zzaa = str;
    }

    final /* synthetic */ void zzv(zziff zziffVar) {
        this.zzat = zziffVar;
        this.zza |= 256;
    }

    final /* synthetic */ void zzw(String str) {
        this.zzau = str;
    }

    final /* synthetic */ void zzy(int i2) {
        this.zzb = i2 - 2;
    }

    final /* synthetic */ void zzz(int i2) {
        this.zzn = 1;
    }

    static {
        zzfou zzfouVar = new zzfou();
        zzay = zzfouVar;
        zzibr.zzbu(zzfou.class, zzfouVar);
    }

    public static zzfos zza() {
        return (zzfos) zzay.zzbn();
    }

    final /* synthetic */ void zzj(Iterable iterable) {
        zzicc zziccVar = this.zzD;
        if (!zziccVar.zza()) {
            this.zzD = zzibr.zzbF(zziccVar);
        }
        zzhzw.zzaW(iterable, this.zzD);
    }

    private zzfou() {
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
                                zzidk zzidkVar = zzaz;
                                if (zzidkVar == null) {
                                    synchronized (zzfou.class) {
                                        try {
                                            zzibmVar = zzaz;
                                            if (zzibmVar == null) {
                                                zzibmVar = new zzibm(zzay);
                                                zzaz = zzibmVar;
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
                        return zzay;
                    }
                    return new zzfos(bArr);
                }
                return new zzfou();
            }
            return zzibr.zzbv(zzay, "\u0004G\u0000\u0001\u0001GG\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0001*ဉ\u0002+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00035\f6ဉ\u00047Ȉ8\u00049ဉ\u0000:ဉ\u0005;ဉ\u0006<Ȉ=ဉ\u0007>ဉ\b?Ȉ@ȈAဉ\tB\u0007C\u0007D\u0007Eဉ\nFȈGဉ\u000b", new Object[]{"zza", "zzb", "zzi", "zzj", "zzn", "zzo", "zzx", "zzz", "zzA", "zzE", "zzG", "zzH", "zzL", "zzM", "zzN", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzp", "zzv", "zzB", "zzC", "zzD", "zzO", "zzP", "zzX", "zzaf", "zzd", "zze", "zzf", "zzg", "zzk", "zzl", "zzm", "zzh", "zzai", "zzaj", "zzc", "zzam", "zzan", "zzS", "zzU", "zzR", "zzQ", "zzal", "zzT", "zzV", "zzW", "zzy", "zzao", "zzF", "zzap", "zzag", "zzah", "zzak", "zzaq", "zzar", "zzY", "zzas", "zzat", "zzau", "zzw", "zzav", "zzI", "zzJ", "zzK", "zzaw", "zzu", "zzax"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zzo = str;
    }

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zzx = str;
    }

    final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zzz = str;
    }

    final /* synthetic */ void zzm(String str) {
        str.getClass();
        this.zzM = str;
    }

    final /* synthetic */ void zzn(String str) {
        str.getClass();
        this.zzN = str;
    }

    final /* synthetic */ void zzo(String str) {
        str.getClass();
        this.zzZ = str;
    }

    final /* synthetic */ void zzq(String str) {
        str.getClass();
        this.zzab = str;
    }

    final /* synthetic */ void zzr(String str) {
        str.getClass();
        this.zzac = str;
    }

    final /* synthetic */ void zzs(String str) {
        str.getClass();
        this.zzad = str;
    }

    final /* synthetic */ void zzt(String str) {
        str.getClass();
        this.zzae = str;
    }

    final /* synthetic */ void zzu(zzfot zzfotVar) {
        this.zzal = zzfotVar.zza();
    }
}
