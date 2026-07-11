package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f55988d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y[] f55990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55991c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass()) {
            z zVar = (z) obj;
            if (this.f55989a == zVar.f55989a && Arrays.equals(this.f55990b, zVar.f55990b)) {
                return true;
            }
        }
        return false;
    }

    static {
        new z(new y[0]);
    }

    public final int hashCode() {
        if (this.f55991c == 0) {
            this.f55991c = Arrays.hashCode(this.f55990b);
        }
        return this.f55991c;
    }

    public z(y... yVarArr) {
        this.f55990b = yVarArr;
        this.f55989a = yVarArr.length;
    }
}
