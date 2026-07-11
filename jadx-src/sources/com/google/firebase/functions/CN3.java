package com.google.firebase.functions;

import com.google.firebase.functions.I28;
import mCM.Pl;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class CN3 implements I28.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Pl f60471n;

    public static InterfaceC2342j n(Pl pl) {
        return jh.w6.n(new CN3(pl));
    }

    @Override // com.google.firebase.functions.I28.j
    public n create(String str) {
        return this.f60471n.rl(str);
    }

    CN3(Pl pl) {
        this.f60471n = pl;
    }
}
