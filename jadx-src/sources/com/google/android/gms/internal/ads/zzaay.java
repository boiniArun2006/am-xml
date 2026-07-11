package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final /* synthetic */ class zzaay implements zzdr {
    static final /* synthetic */ zzaay zza = new zzaay();

    private /* synthetic */ zzaay() {
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final /* synthetic */ void zza(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
