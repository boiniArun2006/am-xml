package org.junit.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class n implements Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f71578n;

    static Object n(Object obj) {
        return (obj == null || (obj instanceof Serializable)) ? obj : new n(obj);
    }

    public String toString() {
        return this.f71578n;
    }

    private n(Object obj) {
        this.f71578n = String.valueOf(obj);
    }
}
