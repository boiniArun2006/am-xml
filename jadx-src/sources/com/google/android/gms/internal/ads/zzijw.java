package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzijw implements Iterator {
    int zza = 0;
    final /* synthetic */ zzijx zzb;

    zzijw(zzijx zzijxVar) {
        this.zzb = zzijxVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.zza;
        zzijx zzijxVar = this.zzb;
        return i2 < zzijxVar.zza.size() || zzijxVar.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.zza;
        zzijx zzijxVar = this.zzb;
        List list = zzijxVar.zza;
        if (i2 >= list.size()) {
            list.add(zzijxVar.zzb.next());
            return next();
        }
        int i3 = this.zza;
        this.zza = i3 + 1;
        return list.get(i3);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
