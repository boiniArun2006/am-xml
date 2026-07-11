package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f50623a = Collections.synchronizedList(new ArrayList());

    public interface a {
        void a(y2 y2Var);
    }

    public void a(a aVar) {
        this.f50623a.add(aVar);
    }

    public void a(y2 y2Var) {
        Iterator it = new ArrayList(this.f50623a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(y2Var);
        }
    }

    public void b(a aVar) {
        this.f50623a.remove(aVar);
    }
}
