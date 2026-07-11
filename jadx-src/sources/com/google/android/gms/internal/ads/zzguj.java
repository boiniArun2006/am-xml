package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzguj extends zzgwt {
    final Iterator zza;
    Object zzb;
    Iterator zzc;
    final /* synthetic */ zzgun zzd;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc.hasNext() || this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.zzc.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            this.zzb = entry.getKey();
            this.zzc = ((zzgub) entry.getValue()).iterator();
        }
        Object obj = this.zzb;
        Objects.requireNonNull(obj);
        return new AbstractMap.SimpleImmutableEntry(obj, this.zzc.next());
    }

    zzguj(zzgun zzgunVar) {
        Objects.requireNonNull(zzgunVar);
        this.zzd = zzgunVar;
        this.zza = zzgunVar.map.entrySet().zze().listIterator(0);
        this.zzb = null;
        this.zzc = zzguv.zza;
    }
}
