package com.google.android.gms.internal.measurement;

import androidx.core.database.sqlite.cL.PtsLKY;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class zzgf extends zzme implements zznm {
    private static final zzgf zzi;
    private int zzb;
    private boolean zzg;
    private zzmn zzd = zzme.zzcv();
    private zzmn zze = zzme.zzcv();
    private zzmn zzf = zzme.zzcv();
    private zzmn zzh = zzme.zzcv();

    public static zzgf zzg() {
        return zzi;
    }

    public final List zza() {
        return this.zzd;
    }

    public final List zzb() {
        return this.zze;
    }

    public final List zzc() {
        return this.zzf;
    }

    public final boolean zzd() {
        return (this.zzb & 1) != 0;
    }

    public final boolean zze() {
        return this.zzg;
    }

    public final List zzf() {
        return this.zzh;
    }

    static {
        zzgf zzgfVar = new zzgf();
        zzi = zzgfVar;
        zzme.zzcp(zzgf.class, zzgfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzme.zzcq(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{PtsLKY.kKvmouY, "zzd", zzfu.class, "zze", zzfw.class, "zzf", zzgc.class, "zzg", "zzh", zzfu.class});
        }
        if (i3 == 3) {
            return new zzgf();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new zzfs(bArr);
        }
        if (i3 == 5) {
            return zzi;
        }
        throw null;
    }

    private zzgf() {
    }
}
