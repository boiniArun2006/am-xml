package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgrl implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzgrr zzb;

    zzgrl(zzgrr zzgrrVar, CharSequence charSequence) {
        this.zza = charSequence;
        Objects.requireNonNull(zzgrrVar);
        this.zzb = zzgrrVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzf(this.zza);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzgqw.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
