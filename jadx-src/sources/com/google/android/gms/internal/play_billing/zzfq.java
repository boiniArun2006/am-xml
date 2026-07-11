package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzfq extends zzhk implements zzin {
    private static final zzfq zzb;
    private int zzd;
    private String zze = "";

    static /* synthetic */ void zzc(zzfq zzfqVar, String str) {
        zzfqVar.zzd |= 1;
        zzfqVar.zze = str;
    }

    static {
        zzfq zzfqVar = new zzfq();
        zzb = zzfqVar;
        zzhk.zzx(zzfq.class, zzfqVar);
    }

    public static zzfp zza() {
        return (zzfp) zzb.zzm();
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    protected final Object zzd(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzfq();
        }
        zzfr zzfrVar = null;
        if (i3 == 4) {
            return new zzfp(zzfrVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    private zzfq() {
    }
}
