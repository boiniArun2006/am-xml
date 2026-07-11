package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfd extends zzme implements zznm {
    private static final zzfd zzi;
    private int zzb;
    private int zzd;
    private zzmn zze = zzme.zzcv();
    private zzmn zzf = zzme.zzcv();
    private boolean zzg;
    private boolean zzh;

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final List zzc() {
        return this.zze;
    }

    public final List zzf() {
        return this.zzf;
    }

    static {
        zzfd zzfdVar = new zzfd();
        zzi = zzfdVar;
        zzme.zzcp(zzfd.class, zzfdVar);
    }

    public final int zzd() {
        return this.zze.size();
    }

    public final zzfn zze(int i2) {
        return (zzfn) this.zze.get(i2);
    }

    public final int zzg() {
        return this.zzf.size();
    }

    public final zzff zzh(int i2) {
        return (zzff) this.zzf.get(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzme.zzcq(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", zzfn.class, "zzf", zzff.class, "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzfd();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new zzfc(bArr);
        }
        if (i3 == 5) {
            return zzi;
        }
        throw null;
    }

    private zzfd() {
    }

    final /* synthetic */ void zzi(int i2, zzfn zzfnVar) {
        zzfnVar.getClass();
        zzmn zzmnVar = this.zze;
        if (!zzmnVar.zza()) {
            this.zze = zzme.zzcw(zzmnVar);
        }
        this.zze.set(i2, zzfnVar);
    }

    final /* synthetic */ void zzj(int i2, zzff zzffVar) {
        zzffVar.getClass();
        zzmn zzmnVar = this.zzf;
        if (!zzmnVar.zza()) {
            this.zzf = zzme.zzcw(zzmnVar);
        }
        this.zzf.set(i2, zzffVar);
    }
}
