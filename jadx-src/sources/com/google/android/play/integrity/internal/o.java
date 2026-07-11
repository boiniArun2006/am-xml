package com.google.android.play.integrity.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class o implements C {
    private static final o rl = new o(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f59584n;

    private o(Object obj) {
        this.f59584n = obj;
    }

    @Override // com.google.android.play.integrity.internal.Pl
    public final Object a() {
        return this.f59584n;
    }

    public static C n(Object obj) {
        if (obj != null) {
            return new o(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }
}
