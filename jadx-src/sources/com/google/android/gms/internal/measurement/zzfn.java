package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfn extends zzme implements zznm {
    private static final zzfn zzj;
    private int zzb;
    private int zzd;
    private String zze = "";
    private zzfh zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zze;
    }

    public final boolean zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return (this.zzb & 32) != 0;
    }

    public final boolean zzh() {
        return this.zzi;
    }

    final /* synthetic */ void zzj(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    static {
        zzfn zzfnVar = new zzfn();
        zzj = zzfnVar;
        zzme.zzcp(zzfn.class, zzfnVar);
    }

    public static zzfm zzi() {
        return (zzfm) zzj.zzck();
    }

    public final zzfh zzd() {
        zzfh zzfhVar = this.zzf;
        return zzfhVar == null ? zzfh.zzi() : zzfhVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzme.zzcq(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new zzfn();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new zzfm(bArr);
        }
        if (i3 == 5) {
            return zzj;
        }
        throw null;
    }

    private zzfn() {
    }
}
