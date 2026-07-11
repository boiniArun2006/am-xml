package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzho extends zzme implements zznm {
    private static final zzho zzd;
    private zzmn zzb = zzme.zzcv();

    public static zzho zzc() {
        return zzd;
    }

    public final List zza() {
        return this.zzb;
    }

    static {
        zzho zzhoVar = new zzho();
        zzd = zzhoVar;
        zzme.zzcp(zzho.class, zzhoVar);
    }

    public static zzhh zzb() {
        return (zzhh) zzd.zzck();
    }

    final /* synthetic */ void zzd(Iterable iterable) {
        zzmn zzmnVar = this.zzb;
        if (!zzmnVar.zza()) {
            this.zzb = zzme.zzcw(zzmnVar);
        }
        zzkr.zzce(iterable, this.zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzme.zzcq(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzhl.class});
        }
        if (i3 == 3) {
            return new zzho();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new zzhh(bArr);
        }
        if (i3 == 5) {
            return zzd;
        }
        throw null;
    }

    private zzho() {
    }
}
