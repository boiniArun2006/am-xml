package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final /* synthetic */ class zzyy implements Comparator {
    static final /* synthetic */ zzyy zza = new zzyy();

    private /* synthetic */ zzyy() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzyx) Collections.max((List) obj)).compareTo((zzyx) Collections.max((List) obj2));
    }
}
