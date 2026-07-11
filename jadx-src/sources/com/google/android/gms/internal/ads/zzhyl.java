package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class zzhyl {
    @Deprecated
    public zzhyl() {
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            zzhzs zzhzsVar = new zzhzs(zzhzg.zza(sb));
            zzhzsVar.zza(zzhyq.LENIENT);
            zzhzo.zza.zza(zzhzsVar, this);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final zzhyn zze() {
        if (this instanceof zzhyn) {
            return (zzhyn) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final zzhyk zzf() {
        if (this instanceof zzhyk) {
            return (zzhyk) this;
        }
        throw new IllegalStateException("Not a JSON Array: ".concat(toString()));
    }

    public final zzhyp zzg() {
        if (this instanceof zzhyp) {
            return (zzhyp) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }

    public String zzd() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }
}
