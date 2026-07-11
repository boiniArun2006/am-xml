package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfh extends zzme implements zznm {
    private static final zzfh zzh;
    private int zzb;
    private zzfr zzd;
    private zzfl zze;
    private boolean zzf;
    private String zzg = "";

    public static zzfh zzi() {
        return zzh;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final boolean zzc() {
        return (this.zzb & 2) != 0;
    }

    public final boolean zze() {
        return (this.zzb & 4) != 0;
    }

    public final boolean zzf() {
        return this.zzf;
    }

    public final boolean zzg() {
        return (this.zzb & 8) != 0;
    }

    public final String zzh() {
        return this.zzg;
    }

    final /* synthetic */ void zzj(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }

    static {
        zzfh zzfhVar = new zzfh();
        zzh = zzfhVar;
        zzme.zzcp(zzfh.class, zzfhVar);
    }

    public final zzfr zzb() {
        zzfr zzfrVar = this.zzd;
        return zzfrVar == null ? zzfr.zzh() : zzfrVar;
    }

    public final zzfl zzd() {
        zzfl zzflVar = this.zze;
        return zzflVar == null ? zzfl.zzj() : zzflVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzme.zzcq(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzfh();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new zzfg(bArr);
        }
        if (i3 == 5) {
            return zzh;
        }
        throw null;
    }

    private zzfh() {
    }
}
