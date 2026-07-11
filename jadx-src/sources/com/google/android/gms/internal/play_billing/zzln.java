package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzln extends zzhk implements zzin {
    private static final zzln zzb;
    private int zzd;
    private int zzf;
    private zzho zze = zzhk.zzs();
    private String zzg = "";

    static {
        zzln zzlnVar = new zzln();
        zzb = zzlnVar;
        zzhk.zzx(zzln.class, zzlnVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    protected final Object zzd(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzln();
        }
        zzlm zzlmVar = null;
        if (i3 == 4) {
            return new zzll(zzlmVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    private zzln() {
    }
}
