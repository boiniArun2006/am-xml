package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcab {
    private final WeakHashMap zza = new WeakHashMap();

    final /* synthetic */ WeakHashMap zzb() {
        return this.zza;
    }

    public final Future zza(Context context) {
        return zzcei.zza.submit(new zzbzz(this, context));
    }
}
