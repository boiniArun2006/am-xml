package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzrt extends zznd implements zzoj {
    private static final zzrt zzb;
    private static volatile zzoq zzd;
    private zznk zze = zznd.zzB();

    public static zzrt zzg() {
        return zzb;
    }

    public final List zzi() {
        return this.zze;
    }

    static {
        zzrt zzrtVar = new zzrt();
        zzb = zzrtVar;
        zznd.zzI(zzrt.class, zzrtVar);
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i2, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"zze"});
        }
        if (i3 == 3) {
            return new zzrt();
        }
        zzrw zzrwVar = null;
        if (i3 == 4) {
            return new zzrs(zzrwVar);
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
        synchronized (zzrt.class) {
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

    private zzrt() {
    }
}
