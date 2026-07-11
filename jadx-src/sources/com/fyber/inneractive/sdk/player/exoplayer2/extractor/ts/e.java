package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f55495b;

    public final f0 a(int i2, d0 d0Var) {
        if (i2 == 2) {
            return new s(new j());
        }
        if (i2 == 3 || i2 == 4) {
            return new s(new q(d0Var.f55491a));
        }
        if (i2 == 15) {
            if (a(2)) {
                return null;
            }
            return new s(new d(false, d0Var.f55491a));
        }
        if (i2 == 21) {
            return new s(new p());
        }
        if (i2 == 27) {
            if (a(4)) {
                return null;
            }
            return new s(new m(a(d0Var), a(1), a(8)));
        }
        if (i2 == 36) {
            return new s(new o(a(d0Var)));
        }
        if (i2 == 89) {
            return new s(new g(d0Var.f55492b));
        }
        if (i2 != 138) {
            if (i2 != 129) {
                if (i2 != 130) {
                    if (i2 == 134) {
                        if (a(16)) {
                            return null;
                        }
                        return new w(new y());
                    }
                    if (i2 != 135) {
                        return null;
                    }
                }
            }
            return new s(new b(d0Var.f55491a));
        }
        return new s(new f(d0Var.f55491a));
    }

    public e(int i2, List list) {
        this.f55494a = i2;
        if (!a(32) && list.isEmpty()) {
            list = Collections.singletonList(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "application/cea-608", 0, null, -1, null, Long.MAX_VALUE, Collections.EMPTY_LIST));
        }
        this.f55495b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final x a(d0 d0Var) {
        int i2;
        String str;
        if (a(32)) {
            return new x(this.f55495b);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(d0Var.f55493c);
        ArrayList arrayList = this.f55495b;
        while (nVar.f56208c - nVar.f56207b > 0) {
            int iJ = nVar.j();
            int iJ2 = nVar.f56207b + nVar.j();
            if (iJ == 134) {
                arrayList = new ArrayList();
                int iJ3 = nVar.j() & 31;
                for (int i3 = 0; i3 < iJ3; i3++) {
                    String strB = nVar.b(3);
                    int iJ4 = nVar.j();
                    if ((iJ4 & 128) != 0) {
                        i2 = iJ4 & 63;
                        str = "application/cea-708";
                    } else {
                        i2 = 1;
                        str = "application/cea-608";
                    }
                    arrayList.add(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, str, 0, strB, i2, null, Long.MAX_VALUE, Collections.EMPTY_LIST));
                    nVar.e(nVar.f56207b + 2);
                }
            }
            nVar.e(iJ2);
            arrayList = arrayList;
        }
        return new x(arrayList);
    }

    public final boolean a(int i2) {
        return (i2 & this.f55494a) != 0;
    }
}
