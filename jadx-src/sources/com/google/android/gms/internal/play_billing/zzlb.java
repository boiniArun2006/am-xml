package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzlb extends zzhk implements zzin {
    private static final zzlb zzb;
    private int zzd;
    private int zze;

    static /* synthetic */ void zzC(zzlb zzlbVar, int i2) {
        zzlbVar.zze = i2 - 1;
        zzlbVar.zzd |= 1;
    }

    static {
        zzlb zzlbVar = new zzlb();
        zzb = zzlbVar;
        zzhk.zzx(zzlb.class, zzlbVar);
    }

    public static zzky zzc() {
        return (zzky) zzb.zzm();
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    protected final Object zzd(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzkz.zza});
        }
        if (i3 == 3) {
            return new zzlb();
        }
        zzla zzlaVar = null;
        if (i3 == 4) {
            return new zzky(zzlaVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    private zzlb() {
    }
}
