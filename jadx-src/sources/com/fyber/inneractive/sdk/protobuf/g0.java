package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f56566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56567b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f56566a == g0Var.f56566a && this.f56567b == g0Var.f56567b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f56566a) * 65535) + this.f56567b;
    }

    public g0(int i2, Object obj) {
        this.f56566a = obj;
        this.f56567b = i2;
    }
}
