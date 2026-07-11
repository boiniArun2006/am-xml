package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class zzd<T> implements Iterator<T> {
    private int zza = 2;
    private T zzb;

    protected abstract T zza();

    protected final T zzb() {
        this.zza = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.zza;
        if (i2 == 4) {
            throw new IllegalStateException();
        }
        int i3 = i2 - 1;
        if (i3 == 0) {
            return true;
        }
        if (i3 != 2) {
            this.zza = 4;
            this.zzb = zza();
            if (this.zza != 3) {
                this.zza = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    protected zzd() {
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.zza = 2;
            T t3 = this.zzb;
            this.zzb = null;
            return t3;
        }
        throw new NoSuchElementException();
    }
}
