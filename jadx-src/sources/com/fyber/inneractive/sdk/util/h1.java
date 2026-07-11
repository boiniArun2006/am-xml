package com.fyber.inneractive.sdk.util;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f57003b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h1.class == obj.getClass()) {
            h1 h1Var = (h1) obj;
            if (this.f57002a == h1Var.f57002a && this.f57003b == h1Var.f57003b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f57002a * 31) + this.f57003b;
    }

    public h1(int i2, int i3) {
        this.f57002a = i2;
        this.f57003b = i3;
    }
}
