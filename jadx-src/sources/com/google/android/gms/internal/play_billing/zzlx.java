package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzlx extends zzhk implements zzin {
    private static final zzlx zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static /* synthetic */ void zzC(zzlx zzlxVar, boolean z2) {
        zzlxVar.zzd |= 2;
        zzlxVar.zzf = true;
    }

    static {
        zzlx zzlxVar = new zzlx();
        zzb = zzlxVar;
        zzhk.zzx(zzlx.class, zzlxVar);
    }

    public static zzlv zzc() {
        return (zzlv) zzb.zzm();
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    protected final Object zzd(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzlx();
        }
        zzlw zzlwVar = null;
        if (i3 == 4) {
            return new zzlv(zzlwVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    private zzlx() {
    }
}
