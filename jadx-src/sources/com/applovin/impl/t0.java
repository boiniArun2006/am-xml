package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f50492a = new StringBuilder();

    public void a(v0 v0Var, long j2) {
        if (v0Var.d() == v0.b.DECISION) {
            return;
        }
        a(a(v0Var), j2);
    }

    public void b() {
        a("Invalid Activity");
    }

    public void b(String str) {
        a("Invalid state: " + str);
    }

    public String toString() {
        return this.f50492a.toString();
    }

    public void a(v0 v0Var, boolean z2, long j2) {
        a(a(v0Var) + ": " + z2, j2);
    }

    public void a() {
        this.f50492a.setLength(0);
    }

    private void a(String str, long j2) {
        a(str + " after " + j2 + "ms");
    }

    private void a(String str) {
        StringBuilder sb = this.f50492a;
        sb.append(str);
        sb.append("\n");
    }

    private String a(v0 v0Var) {
        v0.b bVarD = v0Var.d();
        if (bVarD == v0.b.EVENT) {
            return ((y0) v0Var).g();
        }
        if (bVarD == v0.b.DECISION) {
            return StringUtils.emptyIfNull(v0Var.b());
        }
        return StringUtils.emptyIfNull(v0Var.e());
    }
}
