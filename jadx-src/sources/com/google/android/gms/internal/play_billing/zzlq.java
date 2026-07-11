package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzlq extends zzhk implements zzin {
    private static final zzlq zzb;
    private int zzd;
    private zzki zze;

    static {
        zzlq zzlqVar = new zzlq();
        zzb = zzlqVar;
        zzhk.zzx(zzlq.class, zzlqVar);
    }

    public static zzlo zzc() {
        return (zzlo) zzb.zzm();
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    protected final Object zzd(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzlq();
        }
        zzlp zzlpVar = null;
        if (i3 == 4) {
            return new zzlo(zzlpVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    private zzlq() {
    }

    static /* synthetic */ void zzC(zzlq zzlqVar, zzki zzkiVar) {
        zzkiVar.getClass();
        zzlqVar.zze = zzkiVar;
        zzlqVar.zzd |= 1;
    }
}
