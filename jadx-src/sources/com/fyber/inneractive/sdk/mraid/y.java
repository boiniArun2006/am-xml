package com.fyber.inneractive.sdk.mraid;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class y {
    public abstract String a();

    public final String toString() {
        String strA = a();
        if (strA == null) {
            return "";
        }
        return strA.replaceAll("[^a-zA-Z0-9_,:\\s\\{\\}\\'\\\"]", "");
    }
}
