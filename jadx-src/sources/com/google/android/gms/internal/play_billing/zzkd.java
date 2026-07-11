package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzkd extends zzhk implements zzin {
    private static final zzkd zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static /* synthetic */ void zzE(zzkd zzkdVar, int i2) {
        zzkdVar.zzg = i2 - 1;
        zzkdVar.zzd |= 1;
    }

    static {
        zzkd zzkdVar = new zzkd();
        zzb = zzkdVar;
        zzhk.zzx(zzkd.class, zzkdVar);
    }

    public static zzkb zzc() {
        return (zzkb) zzb.zzm();
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    protected final Object zzd(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzka.zza, zzlb.class, zzlx.class, zzlh.class});
        }
        if (i3 == 3) {
            return new zzkd();
        }
        zzkc zzkcVar = null;
        if (i3 == 4) {
            return new zzkb(zzkcVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    private zzkd() {
    }

    static /* synthetic */ void zzC(zzkd zzkdVar, zzlb zzlbVar) {
        zzlbVar.getClass();
        zzkdVar.zzf = zzlbVar;
        zzkdVar.zze = 2;
    }

    static /* synthetic */ void zzD(zzkd zzkdVar, zzlx zzlxVar) {
        zzlxVar.getClass();
        zzkdVar.zzf = zzlxVar;
        zzkdVar.zze = 3;
    }
}
