package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfw extends zzme implements zznm {
    private static final zzfw zzf;
    private int zzb;
    private int zzd;
    private int zze;

    public final int zzb() {
        int iZza = zzga.zza(this.zzd);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzc() {
        int iZza = zzga.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    static {
        zzfw zzfwVar = new zzfw();
        zzf = zzfwVar;
        zzme.zzcp(zzfw.class, zzfwVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            zzmj zzmjVar = zzfz.zza;
            return zzme.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", zzmjVar, "zze", zzmjVar});
        }
        if (i3 == 3) {
            return new zzfw();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new zzfv(bArr);
        }
        if (i3 == 5) {
            return zzf;
        }
        throw null;
    }

    private zzfw() {
    }
}
