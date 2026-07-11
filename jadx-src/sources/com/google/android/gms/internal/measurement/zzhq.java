package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzhq extends zzme implements zznm {
    private static final zzhq zzf;
    private int zzb;
    private int zzd;
    private long zze;

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return (this.zzb & 2) != 0;
    }

    public final long zzd() {
        return this.zze;
    }

    final /* synthetic */ void zzf(int i2) {
        this.zzb |= 1;
        this.zzd = i2;
    }

    final /* synthetic */ void zzg(long j2) {
        this.zzb |= 2;
        this.zze = j2;
    }

    static {
        zzhq zzhqVar = new zzhq();
        zzf = zzhqVar;
        zzme.zzcp(zzhq.class, zzhqVar);
    }

    public static zzhp zze() {
        return (zzhp) zzf.zzck();
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzme.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzhq();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new zzhp(bArr);
        }
        if (i3 == 5) {
            return zzf;
        }
        throw null;
    }

    private zzhq() {
    }
}
