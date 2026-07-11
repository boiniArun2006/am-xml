package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zziaf extends zziag {
    final /* synthetic */ zzian zza;
    private int zzb;
    private final int zzc;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zziai
    public final byte zza() {
        int i2 = this.zzb;
        if (i2 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i2 + 1;
        return this.zza.zzb(i2);
    }

    zziaf(zzian zzianVar) {
        Objects.requireNonNull(zzianVar);
        this.zza = zzianVar;
        this.zzb = 0;
        this.zzc = zzianVar.zzc();
    }
}
