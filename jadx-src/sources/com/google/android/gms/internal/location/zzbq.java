package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzbq<E> extends zzbo<E> {
    private final zzbs<E> zza;

    @Override // com.google.android.gms.internal.location.zzbo
    protected final E zza(int i2) {
        return this.zza.get(i2);
    }

    zzbq(zzbs<E> zzbsVar, int i2) {
        super(zzbsVar.size(), i2);
        this.zza = zzbsVar;
    }
}
