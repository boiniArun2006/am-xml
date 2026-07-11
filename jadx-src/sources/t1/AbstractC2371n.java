package t1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: t1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class AbstractC2371n implements Iterator {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private j f73427n = j.NOT_READY;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Object f73428t;

    /* JADX INFO: renamed from: t1.n$j */
    private enum j {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected abstract Object n();

    private boolean t() {
        this.f73427n = j.FAILED;
        this.f73428t = n();
        if (this.f73427n == j.DONE) {
            return false;
        }
        this.f73427n = j.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Xo.XQ(this.f73427n != j.FAILED);
        int iOrdinal = this.f73427n.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return t();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    protected final Object rl() {
        this.f73427n = j.DONE;
        return null;
    }

    protected AbstractC2371n() {
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f73427n = j.NOT_READY;
            Object objN = aC.n(this.f73428t);
            this.f73428t = null;
            return objN;
        }
        throw new NoSuchElementException();
    }
}
