package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzguk extends zzgwt {
    final Iterator zza;
    Iterator zzb;
    final /* synthetic */ zzgun zzc;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext() || this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzb.hasNext()) {
            this.zzb = ((zzgub) this.zza.next()).iterator();
        }
        return this.zzb.next();
    }

    zzguk(zzgun zzgunVar) {
        Objects.requireNonNull(zzgunVar);
        this.zzc = zzgunVar;
        this.zza = ((zzguf) zzgunVar.map.values()).listIterator(0);
        this.zzb = zzguv.zza;
    }
}
