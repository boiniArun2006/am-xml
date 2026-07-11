package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzpn implements Iterable {
    private final /* synthetic */ List zza;
    private final /* synthetic */ List zzb;

    zzpn(zzpo zzpoVar, List list, List list2) {
        this.zza = list;
        this.zzb = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzpp(this.zza.iterator(), this.zzb.iterator());
    }
}
