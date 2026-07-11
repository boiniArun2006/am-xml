package com.fyber.inneractive.sdk.protobuf;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class s1 extends t1 {
    @Override // com.fyber.inneractive.sdk.protobuf.t1
    public final void a(Object obj, long j2) {
        ((c) ((k1) x3.e(obj, j2))).f56537a = false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t1
    public final List b(Object obj, long j2) {
        int i2;
        k1 k1Var = (k1) x3.e(obj, j2);
        if (!((c) k1Var).f56537a) {
            int size = k1Var.size();
            if (size == 0) {
                i2 = 10;
            } else {
                i2 = size * 2;
            }
            k1 k1VarB = k1Var.b(i2);
            x3.a(j2, obj, k1VarB);
            return k1VarB;
        }
        return k1Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t1
    public final void a(long j2, Object obj, Object obj2) {
        k1 k1VarB = (k1) x3.e(obj, j2);
        k1 k1Var = (k1) x3.e(obj2, j2);
        int size = k1VarB.size();
        int size2 = k1Var.size();
        if (size > 0 && size2 > 0) {
            if (!((c) k1VarB).f56537a) {
                k1VarB = k1VarB.b(size2 + size);
            }
            k1VarB.addAll(k1Var);
        }
        if (size > 0) {
            k1Var = k1VarB;
        }
        x3.a(j2, obj, k1Var);
    }
}
