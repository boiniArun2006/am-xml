package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Ml extends Wre implements Iterable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f60918n = new ArrayList();

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Ml) && ((Ml) obj).f60918n.equals(this.f60918n);
        }
        return true;
    }

    public int hashCode() {
        return this.f60918n.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f60918n.iterator();
    }

    public void xMQ(Wre wre) {
        if (wre == null) {
            wre = CN3.f60911n;
        }
        this.f60918n.add(wre);
    }
}
