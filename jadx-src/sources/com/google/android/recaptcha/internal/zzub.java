package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzub extends zznd implements zzoj {
    private static final zzub zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";
    private zzni zzg = zznd.zzy();
    private zznj zzh = zznd.zzA();
    private zztl zzi;

    public final String zzj() {
        return this.zzf;
    }

    public final List zzk() {
        return this.zzh;
    }

    static {
        zzub zzubVar = new zzub();
        zzb = zzubVar;
        zznd.zzI(zzub.class, zzubVar);
    }

    public static zzub zzi(byte[] bArr) throws zznn {
        return (zzub) zznd.zzx(zzb, bArr);
    }

    public final zztl zzf() {
        zztl zztlVar = this.zzi;
        return zztlVar == null ? zztl.zzg() : zztlVar;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i2, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zznd.zzF(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002'\u0003%\u0004ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new zzub();
        }
        zzug zzugVar = null;
        if (i3 == 4) {
            return new zzua(zzugVar);
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
        synchronized (zzub.class) {
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

    private zzub() {
    }
}
