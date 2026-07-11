package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zztz extends zznd implements zzoj {
    private static final zztz zzb;
    private static volatile zzoq zzd;
    private zznk zze = zznd.zzB();

    public final List zzi() {
        return this.zze;
    }

    static {
        zztz zztzVar = new zztz();
        zzb = zztzVar;
        zznd.zzI(zztz.class, zztzVar);
    }

    public static zztz zzg(byte[] bArr) throws zznn {
        return (zztz) zznd.zzx(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i2, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzuf.class});
        }
        if (i3 == 3) {
            return new zztz();
        }
        zzug zzugVar = null;
        if (i3 == 4) {
            return new zzty(zzugVar);
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
        synchronized (zztz.class) {
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

    private zztz() {
    }
}
