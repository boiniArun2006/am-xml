package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b[] f56007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56008c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f56007b, ((h) obj).f56007b);
    }

    public final int hashCode() {
        if (this.f56008c == 0) {
            this.f56008c = Arrays.hashCode(this.f56007b) + 527;
        }
        return this.f56008c;
    }

    public h(b... bVarArr) {
        this.f56007b = bVarArr;
        this.f56006a = bVarArr.length;
    }
}
