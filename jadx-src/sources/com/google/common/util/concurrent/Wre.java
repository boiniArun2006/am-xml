package com.google.common.util.concurrent;

import com.google.common.collect.ci;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Wre extends ci implements Future {
    @Override // java.util.concurrent.Future
    public Object get() {
        return t().get();
    }

    protected abstract Future t();

    @Override // java.util.concurrent.Future
    public Object get(long j2, TimeUnit timeUnit) {
        return t().get(j2, timeUnit);
    }

    protected Wre() {
    }

    public boolean cancel(boolean z2) {
        return t().cancel(z2);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return t().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return t().isDone();
    }
}
