package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzamy implements Iterator {
    private int zza;
    private Iterator zzb;
    private final /* synthetic */ zzamw zzc;

    private zzamy(zzamw zzamwVar) {
        this.zzc = zzamwVar;
        this.zza = zzamwVar.zzb;
    }

    private final Iterator zza() {
        if (this.zzb == null) {
            this.zzb = this.zzc.zzf.entrySet().iterator();
        }
        return this.zzb;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.zza;
        return (i2 > 0 && i2 <= this.zzc.zzb) || zza().hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (!zza().hasNext()) {
            Object[] objArr = this.zzc.zza;
            int i2 = this.zza - 1;
            this.zza = i2;
            return (zzana) objArr[i2];
        }
        return (Map.Entry) zza().next();
    }
}
