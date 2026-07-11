package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzlu extends zzhk implements zzin {
    private static final zzlu zzb;
    private int zzd;
    private int zze;

    public static zzlu zzB() {
        return zzb;
    }

    static {
        zzlu zzluVar = new zzlu();
        zzb = zzluVar;
        zzhk.zzx(zzlu.class, zzluVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    protected final Object zzd(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzls.zza});
        }
        if (i3 == 3) {
            return new zzlu();
        }
        zzlt zzltVar = null;
        if (i3 == 4) {
            return new zzlr(zzltVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    private zzlu() {
    }
}
