package com.fyber.inneractive.sdk.metrics;

import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54092a = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54093b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return this.f54092a.equals(((h) obj).f54092a);
    }

    public final int hashCode() {
        return this.f54092a.hashCode();
    }

    public h(String str) {
        this.f54093b = str;
    }
}
