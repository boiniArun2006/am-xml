package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzsm extends zznd implements zzoj {
    private static final zzsm zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";

    static {
        zzsm zzsmVar = new zzsm();
        zzb = zzsmVar;
        zznd.zzI(zzsm.class, zzsmVar);
    }

    public static zzsl zzf() {
        return (zzsl) zzb.zzq();
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i2, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzsm();
        }
        zzsn zzsnVar = null;
        if (i3 == 4) {
            return new zzsl(zzsnVar);
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
        synchronized (zzsm.class) {
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

    private zzsm() {
    }

    static /* synthetic */ void zzi(zzsm zzsmVar, String str) {
        str.getClass();
        zzsmVar.zze |= 1;
        zzsmVar.zzf = str;
    }
}
