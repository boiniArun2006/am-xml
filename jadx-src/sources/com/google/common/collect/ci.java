package com.google.common.collect;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class ci {
    protected abstract Object delegate();

    protected ci() {
    }

    public String toString() {
        return delegate().toString();
    }
}
