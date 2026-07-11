package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f56538a;

    public final void a(int i2, float f3) {
        b0 b0Var = this.f56538a;
        b0Var.getClass();
        b0Var.a(i2, Float.floatToRawIntBits(f3));
    }

    public c0(b0 b0Var) {
        Charset charset = l1.f56612a;
        if (b0Var != null) {
            this.f56538a = b0Var;
            b0Var.f56533a = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public final void a(int i2, double d2) {
        b0 b0Var = this.f56538a;
        b0Var.getClass();
        b0Var.a(i2, Double.doubleToRawLongBits(d2));
    }

    public final void a(int i2, int i3) {
        this.f56538a.d(i2, b0.d(i3));
    }

    public final void a(int i2, long j2) {
        this.f56538a.b(i2, b0.b(j2));
    }

    public final void a(int i2, Object obj, t2 t2Var) {
        b0 b0Var = this.f56538a;
        b0Var.c(i2, 3);
        t2Var.a(obj, b0Var.f56533a);
        b0Var.c(i2, 4);
    }
}
