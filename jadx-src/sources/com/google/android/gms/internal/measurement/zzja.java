package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzja extends zzme implements zznm {
    private static final zzja zzf;
    private int zzb;
    private zzmn zzd = zzme.zzcv();
    private zziw zze;

    public final List zza() {
        return this.zzd;
    }

    static {
        zzja zzjaVar = new zzja();
        zzf = zzjaVar;
        zzme.zzcp(zzja.class, zzjaVar);
    }

    public final zziw zzb() {
        zziw zziwVar = this.zze;
        return zziwVar == null ? zziw.zzc() : zziwVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzme.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", zzje.class, "zze"});
        }
        if (i3 == 3) {
            return new zzja();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new zziz(bArr);
        }
        if (i3 == 5) {
            return zzf;
        }
        throw null;
    }

    private zzja() {
    }
}
