package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzhu extends zzme implements zznm {
    private static final zzhu zzf;
    private int zzb;
    private String zzd = "";
    private long zze;

    final /* synthetic */ void zzc(long j2) {
        this.zzb |= 2;
        this.zze = j2;
    }

    static {
        zzhu zzhuVar = new zzhu();
        zzf = zzhuVar;
        zzme.zzcp(zzhu.class, zzhuVar);
    }

    public static zzht zza() {
        return (zzht) zzf.zzck();
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzme.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzhu();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new zzht(bArr);
        }
        if (i3 == 5) {
            return zzf;
        }
        throw null;
    }

    private zzhu() {
    }

    final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }
}
