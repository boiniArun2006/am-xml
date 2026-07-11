package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f55666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.r[] f55667b;

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        for (int i2 = 0; i2 < this.f55667b.length; i2++) {
            e0Var.a();
            e0Var.b();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f55499d, 3);
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar = (com.fyber.inneractive.sdk.player.exoplayer2.o) this.f55666a.get(i2);
            String str = oVar.f55858f;
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String str2 = oVar.f55853a;
            if (str2 == null) {
                e0Var.b();
                str2 = e0Var.f55500e;
            }
            gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(str2, str, oVar.f55876x, oVar.f55877y, oVar.f55878z, null, Long.MAX_VALUE, Collections.EMPTY_LIST));
            this.f55667b[i2] = gVarA;
        }
    }

    public x(List list) {
        this.f55666a = list;
        this.f55667b = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.r[list.size()];
    }
}
