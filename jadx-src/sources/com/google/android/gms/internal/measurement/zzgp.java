package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzgp extends zzme implements zznm {
    private static final zzgp zzg;
    private int zzb;
    private int zzd = 14;
    private int zze = 11;
    private int zzf = 60;

    static {
        zzgp zzgpVar = new zzgp();
        zzg = zzgpVar;
        zzme.zzcp(zzgp.class, zzgpVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzme.zzcq(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzgp();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new zzgo(bArr);
        }
        if (i3 == 5) {
            return zzg;
        }
        throw null;
    }

    private zzgp() {
    }
}
