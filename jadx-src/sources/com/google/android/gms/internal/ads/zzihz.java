package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzihz extends zzibr implements zzidd {
    private static final zzihz zzR;
    private static volatile zzidk zzS;
    private zzihv zzA;
    private zzigb zzC;
    private zzift zzE;
    private zzigu zzG;
    private int zzH;
    private long zzK;
    private zzihy zzL;
    private zzigz zzM;
    private zzihs zzO;
    private int zza;
    private int zzb;
    private int zzc;
    private zzifx zzg;
    private zzihf zzk;
    private boolean zzl;
    private boolean zzo;
    private boolean zzp;
    private zzihm zzv;
    private boolean zzw;
    private byte zzQ = 2;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private zzicd zzh = zzibr.zzbM();
    private zzicd zzi = zzibr.zzbM();
    private String zzj = "";
    private zzicd zzm = zzibr.zzbM();
    private String zzn = "";
    private zzian zzu = zzian.zza;
    private String zzx = "";
    private zzicd zzy = zzibr.zzbM();
    private zzicd zzz = zzibr.zzbM();
    private zzicd zzB = zzibr.zzbM();
    private String zzD = "";
    private zzicd zzF = zzibr.zzbM();
    private zzicd zzI = zzibr.zzbM();
    private zzicd zzJ = zzibr.zzbM();
    private String zzN = "";
    private zzicd zzP = zzibr.zzbM();

    static {
        zzihz zzihzVar = new zzihz();
        zzR = zzihzVar;
        zzibr.zzbu(zzihz.class, zzihzVar);
    }

    public final String zzc() {
        return this.zzd;
    }

    public final List zzd() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        byte[] bArr = null;
        switch (zzibqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzQ);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzQ = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzibr.zzbv(zzR, "\u0001%\u0000\u0001\u0001%%\u0000\n\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019$ဉ\u001a%\u001b", new Object[]{"zza", "zzd", "zze", "zzf", "zzh", zzihk.class, "zzl", "zzm", "zzn", "zzo", "zzp", "zzb", zzihg.zza, "zzc", zzifu.zza, "zzg", "zzj", "zzk", "zzu", "zzi", zziid.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", zziij.class, "zzC", "zzD", "zzE", "zzF", zzigf.class, "zzG", "zzH", zziht.zza, "zzI", zzigx.class, "zzJ", zzihc.class, "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", zzihp.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzihz();
            case NEW_BUILDER:
                return new zzifv(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzR;
            case GET_PARSER:
                zzidk zzidkVar = zzS;
                if (zzidkVar != null) {
                    return zzidkVar;
                }
                synchronized (zzihz.class) {
                    try {
                        zzibmVar = zzS;
                        if (zzibmVar == null) {
                            zzibmVar = new zzibm(zzR);
                            zzS = zzibmVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return zzibmVar;
            default:
                throw null;
        }
    }

    public final String zze() {
        return this.zzj;
    }

    final /* synthetic */ void zzh(String str) {
        this.zza |= 4;
        this.zzd = str;
    }

    final /* synthetic */ void zzi(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    final /* synthetic */ void zzl(String str) {
        this.zza |= 64;
        this.zzj = str;
    }

    final /* synthetic */ void zzm() {
        this.zza &= -65;
        this.zzj = zzR.zzj;
    }

    final /* synthetic */ void zzs(int i2) {
        this.zzb = i2 - 1;
        this.zza |= 1;
    }

    public static zzifv zzg() {
        return (zzifv) zzR.zzbn();
    }

    final /* synthetic */ void zzp(Iterable iterable) {
        zzicd zzicdVar = this.zzy;
        if (!zzicdVar.zza()) {
            this.zzy = zzibr.zzbN(zzicdVar);
        }
        zzhzw.zzaW(iterable, this.zzy);
    }

    final /* synthetic */ void zzq(Iterable iterable) {
        zzicd zzicdVar = this.zzz;
        if (!zzicdVar.zza()) {
            this.zzz = zzibr.zzbN(zzicdVar);
        }
        zzhzw.zzaW(iterable, this.zzz);
    }

    private zzihz() {
    }

    final /* synthetic */ void zzj(zzifx zzifxVar) {
        zzifxVar.getClass();
        this.zzg = zzifxVar;
        this.zza |= 32;
    }

    final /* synthetic */ void zzk(zzihk zzihkVar) {
        zzihkVar.getClass();
        zzicd zzicdVar = this.zzh;
        if (!zzicdVar.zza()) {
            this.zzh = zzibr.zzbN(zzicdVar);
        }
        this.zzh.add(zzihkVar);
    }

    final /* synthetic */ void zzn(zzihf zzihfVar) {
        zzihfVar.getClass();
        this.zzk = zzihfVar;
        this.zza |= 128;
    }

    final /* synthetic */ void zzo(zzihm zzihmVar) {
        zzihmVar.getClass();
        this.zzv = zzihmVar;
        this.zza |= 8192;
    }
}
