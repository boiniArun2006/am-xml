package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzsi extends zznd implements zzoj {
    private static final zzsi zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private zzsm zzk;
    private zzsg zzl;
    private zzsk zzm;
    private zzry zzn;

    @Deprecated
    public final String zzM() {
        return this.zzh;
    }

    @Deprecated
    public final String zzj() {
        return this.zzi;
    }

    public final String zzk() {
        return this.zzf;
    }

    @Deprecated
    public final String zzl() {
        return this.zzg;
    }

    static {
        zzsi zzsiVar = new zzsi();
        zzb = zzsiVar;
        zznd.zzI(zzsi.class, zzsiVar);
    }

    public static zzsh zzf() {
        return (zzsh) zzb.zzq();
    }

    public static zzsi zzi(byte[] bArr) throws zznn {
        return (zzsi) zznd.zzx(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i2, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zznd.zzF(zzb, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i3 == 3) {
            return new zzsi();
        }
        zzsn zzsnVar = null;
        if (i3 == 4) {
            return new zzsh(zzsnVar);
        }
        if (i3 == 5) {
            return zzb;
        }
        if (i3 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar != null) {
            return zzoqVar;
        }
        synchronized (zzsi.class) {
            try {
                zzmyVar = zzd;
                if (zzmyVar == null) {
                    zzmyVar = new zzmy(zzb);
                    zzd = zzmyVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzmyVar;
    }

    private zzsi() {
    }

    static /* synthetic */ void zzN(zzsi zzsiVar, String str) {
        str.getClass();
        zzsiVar.zze |= 1;
        zzsiVar.zzf = str;
    }

    static /* synthetic */ void zzO(zzsi zzsiVar, zzsg zzsgVar) {
        zzsgVar.getClass();
        zzsiVar.zzl = zzsgVar;
        zzsiVar.zze |= 64;
    }

    static /* synthetic */ void zzP(zzsi zzsiVar, zzsm zzsmVar) {
        zzsmVar.getClass();
        zzsiVar.zzk = zzsmVar;
        zzsiVar.zze |= 32;
    }

    static /* synthetic */ void zzQ(zzsi zzsiVar, zzsk zzskVar) {
        zzskVar.getClass();
        zzsiVar.zzm = zzskVar;
        zzsiVar.zze |= 128;
    }
}
