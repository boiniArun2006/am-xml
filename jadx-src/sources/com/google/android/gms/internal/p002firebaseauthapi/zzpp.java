package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzpp<P> implements Iterator<P> {
    private final Iterator<P> zza;
    private final Iterator<P> zzb;

    private zzpp(Iterator<P> it, Iterator<P> it2) {
        this.zza = it;
        this.zzb = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final P next() {
        return this.zza.hasNext() ? this.zza.next() : this.zzb.next();
    }
}
