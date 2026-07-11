package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzgc extends zzme implements zznm {
    private static final zzgc zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    public final String zza() {
        return this.zzd;
    }

    static {
        zzgc zzgcVar = new zzgc();
        zzf = zzgcVar;
        zzme.zzcp(zzgc.class, zzgcVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzme.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzgc();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new zzgb(bArr);
        }
        if (i3 == 5) {
            return zzf;
        }
        throw null;
    }

    private zzgc() {
    }
}
