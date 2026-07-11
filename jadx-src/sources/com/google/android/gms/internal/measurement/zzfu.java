package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfu extends zzme implements zznm {
    private static final zzfu zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    public final int zzb() {
        int iZza = zzga.zza(this.zzd);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzc() {
        int iZza = zzfy.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzd() {
        int iZza = zzge.zza(this.zzf);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    static {
        zzfu zzfuVar = new zzfu();
        zzg = zzfuVar;
        zzme.zzcp(zzfu.class, zzfuVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzme.zzcq(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", zzfz.zza, "zze", zzfx.zza, "zzf", zzgd.zza});
        }
        if (i3 == 3) {
            return new zzfu();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new zzft(bArr);
        }
        if (i3 == 5) {
            return zzg;
        }
        throw null;
    }

    private zzfu() {
    }
}
