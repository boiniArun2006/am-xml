package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zztx extends zznd implements zzoj {
    private static final zztx zzb;
    private static volatile zzoq zzd;
    private int zze = 0;
    private Object zzf;

    public final int zzN() {
        int i2 = this.zze;
        if (i2 == 0) {
            return 3;
        }
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                return 0;
            }
        }
        return i3;
    }

    static {
        zztx zztxVar = new zztx();
        zzb = zztxVar;
        zznd.zzI(zztx.class, zztxVar);
    }

    public static zztw zzi() {
        return (zztw) zzb.zzq();
    }

    public static zztx zzk(byte[] bArr) throws zznn {
        return (zztx) zznd.zzx(zzb, bArr);
    }

    public final zzrc zzf() {
        return this.zze == 1 ? (zzrc) this.zzf : zzrc.zzk();
    }

    public final zzrr zzg() {
        return this.zze == 2 ? (zzrr) this.zzf : zzrr.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i2, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zznd.zzF(zzb, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zzf", "zze", zzrc.class, zzrr.class});
        }
        if (i3 == 3) {
            return new zztx();
        }
        zzug zzugVar = null;
        if (i3 == 4) {
            return new zztw(zzugVar);
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
        synchronized (zztx.class) {
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

    private zztx() {
    }

    static /* synthetic */ void zzM(zztx zztxVar, zzrr zzrrVar) {
        zzrrVar.getClass();
        zztxVar.zzf = zzrrVar;
        zztxVar.zze = 2;
    }

    static /* synthetic */ void zzl(zztx zztxVar, zzrc zzrcVar) {
        zzrcVar.getClass();
        zztxVar.zzf = zzrcVar;
        zztxVar.zze = 1;
    }
}
