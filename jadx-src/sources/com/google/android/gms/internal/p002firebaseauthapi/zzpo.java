package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzpo<P> {
    private static final zzaae zza = zzaae.zza(new byte[0]);
    private final Map<zzaae, List<P>> zzb;

    private zzpo(Map<zzaae, List<P>> map) {
        this.zzb = map;
    }

    public final Iterable<P> zza(byte[] bArr) {
        List<P> list = this.zzb.get(zza);
        List<P> list2 = bArr.length >= 5 ? this.zzb.get(zzaae.zza(bArr, 0, 5)) : null;
        return (list == null && list2 == null) ? new ArrayList() : list == null ? list2 : list2 == null ? list : new zzpn(this, list2, list);
    }
}
