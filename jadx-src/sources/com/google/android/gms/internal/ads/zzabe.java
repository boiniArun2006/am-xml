package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzabe extends IOException {
    public zzabe(Throwable th) {
        String strConcat;
        String simpleName = th.getClass().getSimpleName();
        if (th.getMessage() != null) {
            strConcat = ": ".concat(String.valueOf(th.getMessage()));
        } else {
            strConcat = "";
        }
        StringBuilder sb = new StringBuilder(simpleName.length() + 11 + strConcat.length());
        sb.append("Unexpected ");
        sb.append(simpleName);
        sb.append(strConcat);
        super(sb.toString(), th);
    }
}
