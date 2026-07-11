package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final /* synthetic */ class zzfrw implements Comparator {
    static final /* synthetic */ zzfrw zza = new zzfrw();

    private /* synthetic */ zzfrw() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzfro zzfroVar = (zzfro) obj2;
        zzfro zzfroVar2 = (zzfro) obj;
        int iCompare = Double.compare(zzfroVar.zze(), zzfroVar2.zze());
        return iCompare == 0 ? Long.compare(zzfroVar2.zzd(), zzfroVar.zzd()) : iCompare;
    }
}
