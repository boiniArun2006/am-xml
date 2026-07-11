package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class x0 extends e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2 f56711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f56712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d2 f56713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w0 f56714d;

    public x0(d2 d2Var, Object obj, d2 d2Var2, w0 w0Var) {
        if (d2Var != null) {
            if (w0Var.f56699c == j4.MESSAGE && d2Var2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f56711a = d2Var;
            this.f56712b = obj;
            this.f56713c = d2Var2;
            this.f56714d = w0Var;
            return;
        }
        throw new IllegalArgumentException("Null containingTypeDefaultInstance");
    }
}
