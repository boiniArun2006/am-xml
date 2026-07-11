package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzad implements Iterator {
    final /* synthetic */ zzae zza;
    private int zzb;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zzh();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        zzae zzaeVar = this.zza;
        if (this.zzb < zzaeVar.zzh()) {
            int i2 = this.zzb;
            this.zzb = i2 + 1;
            return zzaeVar.zzl(i2);
        }
        int i3 = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 21);
        sb.append("Out of bounds index: ");
        sb.append(i3);
        throw new NoSuchElementException(sb.toString());
    }

    zzad(zzae zzaeVar) {
        Objects.requireNonNull(zzaeVar);
        this.zza = zzaeVar;
        this.zzb = 0;
    }
}
