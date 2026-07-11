package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
abstract class zzhza implements Iterator {
    zzhzb zza;
    zzhzb zzb;
    int zzc;
    final /* synthetic */ zzhzc zzd;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza != this.zzd.zzd;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzhzb zzhzbVar = this.zzb;
        if (zzhzbVar == null) {
            throw new IllegalStateException();
        }
        zzhzc zzhzcVar = this.zzd;
        zzhzcVar.zzd(zzhzbVar, true);
        this.zzb = null;
        this.zzc = zzhzcVar.zzc;
    }

    final zzhzb zza() {
        zzhzc zzhzcVar = this.zzd;
        zzhzb zzhzbVar = this.zza;
        if (zzhzbVar == zzhzcVar.zzd) {
            throw new NoSuchElementException();
        }
        if (zzhzcVar.zzc != this.zzc) {
            throw new ConcurrentModificationException();
        }
        this.zza = zzhzbVar.zzd;
        this.zzb = zzhzbVar;
        return zzhzbVar;
    }

    zzhza(zzhzc zzhzcVar) {
        Objects.requireNonNull(zzhzcVar);
        this.zzd = zzhzcVar;
        this.zza = zzhzcVar.zzd.zzd;
        this.zzb = null;
        this.zzc = zzhzcVar.zzc;
    }
}
