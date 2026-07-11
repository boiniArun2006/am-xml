package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzkx extends zzhk implements zzin {
    private static final zzkx zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzkx zzkxVar = new zzkx();
        zzb = zzkxVar;
        zzhk.zzx(zzkx.class, zzkxVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    protected final Object zzd(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzkx();
        }
        zzkw zzkwVar = null;
        if (i3 == 4) {
            return new zzkv(zzkwVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    private zzkx() {
    }
}
