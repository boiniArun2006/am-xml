package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
abstract class zzgti implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzgtm zze;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    abstract Object zza(int i2);

    private final void zzb() {
        if (this.zze.zzs() != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    /* synthetic */ zzgti(zzgtm zzgtmVar, byte[] bArr) {
        Objects.requireNonNull(zzgtmVar);
        this.zze = zzgtmVar;
        this.zzb = zzgtmVar.zzs();
        this.zzc = zzgtmVar.zzf();
        this.zzd = -1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (hasNext()) {
            int i2 = this.zzc;
            this.zzd = i2;
            Object objZza = zza(i2);
            this.zzc = this.zze.zzg(this.zzc);
            return objZza;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z2;
        zzb();
        if (this.zzd >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzgrc.zzj(z2, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i2 = this.zzd;
        zzgtm zzgtmVar = this.zze;
        zzgtmVar.remove(zzgtmVar.zzo(i2));
        this.zzc--;
        this.zzd = -1;
    }
}
