package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class w0 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f56697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j4 f56699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f56700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f56701e;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f56698b - ((w0) obj).f56698b;
    }

    public w0(e1 e1Var, int i2, j4 j4Var, boolean z2, boolean z3) {
        this.f56697a = e1Var;
        this.f56698b = i2;
        this.f56699c = j4Var;
        this.f56700d = z2;
        this.f56701e = z3;
    }
}
