package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzbr {
    final Map zza = new ConcurrentHashMap();

    public final Bitmap zza(Integer num) {
        return (Bitmap) this.zza.get(num);
    }

    public zzbr() {
        new AtomicInteger(0);
    }
}
