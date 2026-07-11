package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzlf extends zzhk implements zzin {
    private static final zzlf zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        zzlf zzlfVar = new zzlf();
        zzb = zzlfVar;
        zzhk.zzx(zzlf.class, zzlfVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    protected final Object zzd(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", zzle.zza, "zzf"});
        }
        if (i3 == 3) {
            return new zzlf();
        }
        zzlg zzlgVar = null;
        if (i3 == 4) {
            return new zzld(zzlgVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    private zzlf() {
    }
}
