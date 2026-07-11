package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzje extends zzme implements zznm {
    private static final zzje zzj;
    private int zzb;
    private int zzd;
    private zzmn zze = zzme.zzcv();
    private String zzf = "";
    private String zzg = "";
    private boolean zzh;
    private double zzi;

    public final List zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzf;
    }

    public final boolean zzc() {
        return (this.zzb & 4) != 0;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final boolean zze() {
        return (this.zzb & 8) != 0;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return (this.zzb & 16) != 0;
    }

    public final double zzh() {
        return this.zzi;
    }

    public final int zzj() {
        int iZza = zzjd.zza(this.zzd);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    static {
        zzje zzjeVar = new zzje();
        zzj = zzjeVar;
        zzme.zzcp(zzje.class, zzjeVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzme.zzcq(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zzd", zzjc.zza, "zze", zzje.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new zzje();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new zzjb(bArr);
        }
        if (i3 == 5) {
            return zzj;
        }
        throw null;
    }

    private zzje() {
    }
}
