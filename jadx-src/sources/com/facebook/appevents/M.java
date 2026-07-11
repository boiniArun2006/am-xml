package com.facebook.appevents;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class M {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f52274n;
    private iwV rl = iwV.SUCCESS;

    public final int n() {
        return this.f52274n;
    }

    public final void nr(iwV iwv) {
        Intrinsics.checkNotNullParameter(iwv, "<set-?>");
        this.rl = iwv;
    }

    public final iwV rl() {
        return this.rl;
    }

    public final void t(int i2) {
        this.f52274n = i2;
    }
}
