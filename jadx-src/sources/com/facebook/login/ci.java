package com.facebook.login;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class ci {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ci f52969n = new ci();

    public static final boolean n(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return !(StringsKt.indexOf$default((CharSequence) str, ' ', 0, false, 6, (Object) null) >= 0);
    }

    private ci() {
    }
}
