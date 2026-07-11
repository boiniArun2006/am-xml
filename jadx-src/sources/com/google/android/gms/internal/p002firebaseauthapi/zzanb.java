package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzanb extends zzanc {
    private final /* synthetic */ zzamw zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzanb(zzamw zzamwVar) {
        super(zzamwVar);
        this.zza = zzamwVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanc, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzamy(this.zza);
    }
}
