package com.facebook.login;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public enum Pl {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true, true),
    NATIVE_ONLY(true, true, false, false, false, true, true),
    KATANA_ONLY(false, true, false, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false, false),
    DIALOG_ONLY(false, true, true, false, true, true, true),
    DEVICE_AUTH(false, false, false, true, false, false, false);

    private final boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f52932O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final boolean f52933Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f52934n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f52935o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f52936r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f52937t;

    public final boolean J2() {
        return this.f52933Z;
    }

    public final boolean KN() {
        return this.f52932O;
    }

    public final boolean Uo() {
        return this.f52937t;
    }

    public final boolean nr() {
        return this.f52934n;
    }

    public final boolean rl() {
        return this.f52936r;
    }

    public final boolean t() {
        return this.J2;
    }

    Pl(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z9) {
        this.f52934n = z2;
        this.f52937t = z3;
        this.f52932O = z4;
        this.J2 = z5;
        this.f52936r = z6;
        this.f52935o = z7;
        this.f52933Z = z9;
    }
}
