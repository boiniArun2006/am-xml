package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final /* synthetic */ class zzeud implements zzgqt {
    static final /* synthetic */ zzeud zza = new zzeud();

    private /* synthetic */ zzeud() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqt
    public final /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        if (true == arrayList.isEmpty()) {
            arrayList = null;
        }
        return new zzeuf(arrayList);
    }
}
