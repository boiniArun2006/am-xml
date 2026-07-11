package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzjz extends zzhk implements zzin {
    private static final zzjz zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private zzki zzh;

    static /* synthetic */ void zzF(zzjz zzjzVar, int i2) {
        zzjzVar.zzg = i2 - 1;
        zzjzVar.zzd |= 1;
    }

    static {
        zzjz zzjzVar = new zzjz();
        zzb = zzjzVar;
        zzhk.zzx(zzjz.class, zzjzVar);
    }

    public static zzjz zzC(byte[] bArr, zzgw zzgwVar) throws zzhr {
        return (zzjz) zzhk.zzq(zzb, bArr, zzgwVar);
    }

    public static zzjx zzc() {
        return (zzjx) zzb.zzm();
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    protected final Object zzd(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzka.zza, "zzh", zzlb.class});
        }
        if (i3 == 3) {
            return new zzjz();
        }
        zzjy zzjyVar = null;
        if (i3 == 4) {
            return new zzjx(zzjyVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    private zzjz() {
    }

    static /* synthetic */ void zzD(zzjz zzjzVar, zzki zzkiVar) {
        zzkiVar.getClass();
        zzjzVar.zzh = zzkiVar;
        zzjzVar.zzd |= 2;
    }

    static /* synthetic */ void zzE(zzjz zzjzVar, zzlb zzlbVar) {
        zzlbVar.getClass();
        zzjzVar.zzf = zzlbVar;
        zzjzVar.zze = 4;
    }
}
