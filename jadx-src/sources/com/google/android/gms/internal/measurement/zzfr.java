package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfr extends zzme implements zznm {
    private static final zzfr zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private zzmn zzg = zzme.zzcv();

    public static zzfr zzh() {
        return zzh;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final boolean zzb() {
        return (this.zzb & 2) != 0;
    }

    public final String zzc() {
        return this.zze;
    }

    public final boolean zzd() {
        return (this.zzb & 4) != 0;
    }

    public final boolean zze() {
        return this.zzf;
    }

    public final List zzf() {
        return this.zzg;
    }

    public final int zzj() {
        int iZza = zzfq.zza(this.zzd);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    static {
        zzfr zzfrVar = new zzfr();
        zzh = zzfrVar;
        zzme.zzcp(zzfr.class, zzfrVar);
    }

    public final int zzg() {
        return this.zzg.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzme.zzcq(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zzd", zzfp.zza, "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzfr();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new zzfo(bArr);
        }
        if (i3 == 5) {
            return zzh;
        }
        throw null;
    }

    private zzfr() {
    }
}
