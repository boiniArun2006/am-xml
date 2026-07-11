package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgsh implements Iterator {
    final Iterator zza;
    Collection zzb;
    final /* synthetic */ zzgsi zzc;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        return this.zzc.zzb(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzgrc.zzj(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        int size = this.zzb.size();
        zzgsv zzgsvVar = this.zzc.zzb;
        zzgsvVar.zzq(zzgsvVar.zzp() - size);
        this.zzb.clear();
        this.zzb = null;
    }

    zzgsh(zzgsi zzgsiVar) {
        Objects.requireNonNull(zzgsiVar);
        this.zzc = zzgsiVar;
        this.zza = zzgsiVar.zza.entrySet().iterator();
    }
}
