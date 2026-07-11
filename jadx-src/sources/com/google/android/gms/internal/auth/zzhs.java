package com.google.android.gms.internal.auth;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhs extends zzev implements zzfy {
    private static final zzhs zzb;
    private zzez zzd = zzev.zzf();

    public final List zzq() {
        return this.zzd;
    }

    static {
        zzhs zzhsVar = new zzhs();
        zzb = zzhsVar;
        zzev.zzk(zzhs.class, zzhsVar);
    }

    public static zzhs zzp(byte[] bArr) throws zzfb {
        return (zzhs) zzev.zzd(zzb, bArr);
    }

    @Override // com.google.android.gms.internal.auth.zzev
    protected final Object zzn(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzev.zzh(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        }
        if (i3 == 3) {
            return new zzhs();
        }
        zzhq zzhqVar = null;
        if (i3 == 4) {
            return new zzhr(zzhqVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    private zzhs() {
    }
}
