package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgst extends zzgsr implements ListIterator {
    final /* synthetic */ zzgsu zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgst(zzgsu zzgsuVar) {
        super(zzgsuVar);
        Objects.requireNonNull(zzgsuVar);
        this.zzd = zzgsuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgst(zzgsu zzgsuVar, int i2) {
        super(zzgsuVar, ((List) zzgsuVar.zzb).listIterator(i2));
        Objects.requireNonNull(zzgsuVar);
        this.zzd = zzgsuVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        zzgsu zzgsuVar = this.zzd;
        boolean zIsEmpty = zzgsuVar.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzgsv zzgsvVar = zzgsuVar.zzf;
        zzgsvVar.zzq(zzgsvVar.zzp() + 1);
        if (zIsEmpty) {
            zzgsuVar.zzc();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }
}
