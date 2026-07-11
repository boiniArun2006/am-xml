package com.google.gson;

import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class fuX extends Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final T6s.CN3 f60920n = new T6s.CN3(false);

    public Set entrySet() {
        return this.f60920n.entrySet();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof fuX) && ((fuX) obj).f60920n.equals(this.f60920n);
        }
        return true;
    }

    public int hashCode() {
        return this.f60920n.hashCode();
    }

    public void xMQ(String str, Wre wre) {
        T6s.CN3 cn3 = this.f60920n;
        if (wre == null) {
            wre = CN3.f60911n;
        }
        cn3.put(str, wre);
    }
}
