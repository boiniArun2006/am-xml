package com.google.firebase.storage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f60861n = new HashMap();
    private final oSp.n nr;
    private final com.google.firebase.Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final oSp.n f60862t;

    synchronized I28 n(String str) {
        I28 i28;
        i28 = (I28) this.f60861n.get(str);
        if (i28 == null) {
            i28 = new I28(str, this.rl, this.f60862t, this.nr);
            this.f60861n.put(str, i28);
        }
        return i28;
    }

    Wre(com.google.firebase.Wre wre, oSp.n nVar, oSp.n nVar2, Executor executor, Executor executor2) {
        this.rl = wre;
        this.f60862t = nVar;
        this.nr = nVar2;
        Z.nr(executor, executor2);
    }
}
