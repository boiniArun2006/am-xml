package com.google.android.gms.internal.ads;

import GJW.Lu;
import GJW.R6;
import GJW.vd;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfzj {
    public static final zzfzh zza(final ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        return new zzfzh() { // from class: com.google.android.gms.internal.ads.zzfzi
            @Override // com.google.android.gms.internal.ads.zzfzh
            public final /* synthetic */ vd zza() {
                return Lu.n(R6.t(executorService));
            }
        };
    }
}
