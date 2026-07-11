package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzkl extends zzhk implements zzin {
    private static final zzkl zzb;

    public static zzkl zzB() {
        return zzb;
    }

    static {
        zzkl zzklVar = new zzkl();
        zzb = zzklVar;
        zzhk.zzx(zzkl.class, zzklVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    protected final Object zzd(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        zzkk zzkkVar = null;
        if (i3 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0000", null);
        }
        if (i3 == 3) {
            return new zzkl();
        }
        if (i3 == 4) {
            return new zzkj(zzkkVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    private zzkl() {
    }
}
