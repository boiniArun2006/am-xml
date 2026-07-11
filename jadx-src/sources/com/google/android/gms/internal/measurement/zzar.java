package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzar implements Iterator {
    final /* synthetic */ zzas zza;
    private int zzb;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zzb().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        zzas zzasVar = this.zza;
        String strZzb = zzasVar.zzb();
        int i2 = this.zzb;
        if (i2 >= strZzb.length()) {
            throw new NoSuchElementException();
        }
        this.zzb = i2 + 1;
        return new zzas(String.valueOf(zzasVar.zzb().charAt(i2)));
    }

    zzar(zzas zzasVar) {
        Objects.requireNonNull(zzasVar);
        this.zza = zzasVar;
        this.zzb = 0;
    }
}
