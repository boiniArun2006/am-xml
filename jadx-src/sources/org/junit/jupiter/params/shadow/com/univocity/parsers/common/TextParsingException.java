package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class TextParsingException extends j {
    private long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f71584O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    protected int[] f71585S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private String[] f71586Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f71587o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f71588r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f71589t;

    public final String[] mUb() {
        return this.f71586Z;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.j
    protected String n() {
        String strT = j.t(j.t(j.t("", "line", Long.valueOf(this.f71589t)), "column", Integer.valueOf(this.f71588r)), "record", Long.valueOf(this.J2));
        long j2 = this.f71584O;
        if (j2 != 0) {
            strT = j.t(strT, "charIndex", Long.valueOf(j2));
        }
        return j.t(j.t(strT, "headers", this.f71586Z), "content parsed", O(this.f71587o));
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.j
    protected String rl() {
        return "Error parsing input";
    }
}
