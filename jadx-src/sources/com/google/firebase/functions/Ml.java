package com.google.firebase.functions;

import com.google.firebase.functions.w6;
import com.google.firebase.qz;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ml implements jh.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f60490n;

    public static String n(qz qzVar) {
        return w6.n.f60503n.n(qzVar);
    }

    public static Ml rl(InterfaceC2342j interfaceC2342j) {
        return new Ml(interfaceC2342j);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public String get() {
        return n((qz) this.f60490n.get());
    }

    public Ml(InterfaceC2342j interfaceC2342j) {
        this.f60490n = interfaceC2342j;
    }
}
