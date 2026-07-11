package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzbeh implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbem zzbemVar = (zzbem) obj;
        zzbem zzbemVar2 = (zzbem) obj2;
        int i2 = zzbemVar.zzc - zzbemVar2.zzc;
        return i2 != 0 ? i2 : Long.compare(zzbemVar.zza, zzbemVar2.zza);
    }

    zzbeh(zzbej zzbejVar) {
        Objects.requireNonNull(zzbejVar);
    }
}
