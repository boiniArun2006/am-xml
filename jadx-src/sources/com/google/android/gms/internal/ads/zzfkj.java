package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfkj {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzgzy zzc;

    public final synchronized void zza(int i2) {
        Deque deque = this.zza;
        int size = i2 - deque.size();
        for (int i3 = 0; i3 < size; i3++) {
            deque.add(this.zzc.submit(this.zzb));
        }
    }

    @Nullable
    public final synchronized com.google.common.util.concurrent.Xo zzb() {
        zza(1);
        return (com.google.common.util.concurrent.Xo) this.zza.poll();
    }

    public final synchronized void zzc(com.google.common.util.concurrent.Xo xo) {
        this.zza.addFirst(xo);
    }

    public zzfkj(Callable callable, zzgzy zzgzyVar) {
        this.zzb = callable;
        this.zzc = zzgzyVar;
    }
}
