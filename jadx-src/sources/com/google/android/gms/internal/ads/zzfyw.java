package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfyw extends zzibl implements zzidd {
    private zzfyw() {
        throw null;
    }

    /* synthetic */ zzfyw(byte[] bArr) {
        super(zzfyy.zzb);
    }

    public final Map zzb() {
        return Collections.unmodifiableMap(((zzfyy) this.zza).zzb());
    }

    public final zzfyw zza(String str) {
        str.getClass();
        zzbg();
        ((zzfyy) this.zza).zze().remove(str);
        return this;
    }

    public final zzfyw zzc(String str, zzfyu zzfyuVar) {
        str.getClass();
        zzfyuVar.getClass();
        zzbg();
        ((zzfyy) this.zza).zze().put(str, zzfyuVar);
        return this;
    }
}
