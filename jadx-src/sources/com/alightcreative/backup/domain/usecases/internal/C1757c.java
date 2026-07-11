package com.alightcreative.backup.domain.usecases.internal;

import TFv.rv6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.alightcreative.backup.domain.usecases.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C1757c implements wtO.CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final kgE.fuX f46541n;

    public C1757c(kgE.fuX iapManager) {
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        this.f46541n = iapManager;
    }

    @Override // wtO.CN3
    public rv6 invoke() {
        return this.f46541n.o();
    }
}
