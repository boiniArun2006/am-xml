package com.google.firebase.functions;

import com.google.firebase.functions.I28;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Wre implements jh.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f60491n;

    public static Wre n(InterfaceC2342j interfaceC2342j) {
        return new Wre(interfaceC2342j);
    }

    public static I28 t(I28.j jVar) {
        return new I28(jVar);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public I28 get() {
        return t((I28.j) this.f60491n.get());
    }

    public Wre(InterfaceC2342j interfaceC2342j) {
        this.f60491n = interfaceC2342j;
    }
}
