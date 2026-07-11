package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.o[] f55986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55987c;

    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        int i2 = 0;
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = this.f55986b;
            if (i2 >= oVarArr.length) {
                return -1;
            }
            if (oVar == oVarArr[i2]) {
                return i2;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (this.f55985a == yVar.f55985a && Arrays.equals(this.f55986b, yVar.f55986b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f55987c == 0) {
            this.f55987c = Arrays.hashCode(this.f55986b) + 527;
        }
        return this.f55987c;
    }

    public y(com.fyber.inneractive.sdk.player.exoplayer2.o... oVarArr) {
        if (oVarArr.length > 0) {
            this.f55986b = oVarArr;
            this.f55985a = oVarArr.length;
            return;
        }
        throw new IllegalStateException();
    }
}
