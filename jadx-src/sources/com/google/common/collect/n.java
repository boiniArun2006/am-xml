package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class n extends xZD {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private j f59728n = j.NOT_READY;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Object f59729t;

    private enum j {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected abstract Object n();

    private boolean t() {
        this.f59728n = j.FAILED;
        this.f59729t = n();
        if (this.f59728n == j.DONE) {
            return false;
        }
        this.f59728n = j.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        t1.Xo.XQ(this.f59728n != j.FAILED);
        int iOrdinal = this.f59728n.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return t();
        }
        return false;
    }

    protected final Object rl() {
        this.f59728n = j.DONE;
        return null;
    }

    protected n() {
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f59728n = j.NOT_READY;
            Object objN = P.n(this.f59729t);
            this.f59729t = null;
            return objN;
        }
        throw new NoSuchElementException();
    }
}
