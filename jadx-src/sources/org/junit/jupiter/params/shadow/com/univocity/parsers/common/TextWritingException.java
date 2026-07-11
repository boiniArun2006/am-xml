package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class TextWritingException extends j {
    private final String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Object[] f71590O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f71591t;

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.j
    protected String n() {
        return j.t(j.t(j.t("", "recordCount", Long.valueOf(this.f71591t)), "recordData", KN(this.f71590O)), "recordCharacters", O(this.J2));
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.j
    protected String rl() {
        return "Error writing data";
    }
}
