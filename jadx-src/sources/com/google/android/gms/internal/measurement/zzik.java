package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzik extends zzme implements zznm {
    private static final zzik zzf;
    private int zzb;
    private int zzd;
    private zzmm zze = zzme.zzct();

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final List zzc() {
        return this.zze;
    }

    final /* synthetic */ void zzg(int i2) {
        this.zzb |= 1;
        this.zzd = i2;
    }

    static {
        zzik zzikVar = new zzik();
        zzf = zzikVar;
        zzme.zzcp(zzik.class, zzikVar);
    }

    public static zzij zzf() {
        return (zzij) zzf.zzck();
    }

    public final int zzd() {
        return this.zze.size();
    }

    public final long zze(int i2) {
        return this.zze.zzc(i2);
    }

    final /* synthetic */ void zzh(Iterable iterable) {
        zzmm zzmmVar = this.zze;
        if (!zzmmVar.zza()) {
            this.zze = zzme.zzcu(zzmmVar);
        }
        zzkr.zzce(iterable, this.zze);
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzme.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzik();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new zzij(bArr);
        }
        if (i3 == 5) {
            return zzf;
        }
        throw null;
    }

    private zzik() {
    }
}
