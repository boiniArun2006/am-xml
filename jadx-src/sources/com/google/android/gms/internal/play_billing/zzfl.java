package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzfl extends zzhk implements zzin {
    private static final zzfl zzb;
    private int zzd;
    private zzfq zze;
    private zzfq zzf;
    private int zzg;

    static {
        zzfl zzflVar = new zzfl();
        zzb = zzflVar;
        zzhk.zzx(zzfl.class, zzflVar);
    }

    public static zzfk zza() {
        return (zzfk) zzb.zzm();
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    protected final Object zzd(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzft.zza()});
        }
        if (i3 == 3) {
            return new zzfl();
        }
        zzfo zzfoVar = null;
        if (i3 == 4) {
            return new zzfk(zzfoVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    private zzfl() {
    }

    static /* synthetic */ void zzc(zzfl zzflVar, zzfq zzfqVar) {
        zzfqVar.getClass();
        zzflVar.zze = zzfqVar;
        zzflVar.zzd |= 1;
    }
}
