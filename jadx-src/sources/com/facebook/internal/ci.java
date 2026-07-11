package com.facebook.internal;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class ci {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ci f52790n = new ci();
    private static volatile String rl;

    public static final String n() {
        return rl;
    }

    public static final boolean rl() {
        String str = rl;
        return str != null && StringsKt.startsWith$default(str, "Unity.", false, 2, (Object) null);
    }

    private ci() {
    }
}
