package DD;

import java.util.ConcurrentModificationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ReentrantLock f1403n = new ReentrantLock();
    private j rl;

    private static final class j extends Exception {
        public j() {
            super("Code which didn't finish executing yet:");
        }
    }

    public final void n() {
        ReentrantLock reentrantLock = this.f1403n;
        reentrantLock.lock();
        try {
            this.rl = null;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void rl() {
        ReentrantLock reentrantLock = this.f1403n;
        reentrantLock.lock();
        try {
            if (this.rl != null) {
                throw new ConcurrentModificationException("Started executing code before previously started code execution finished", this.rl);
            }
            this.rl = new j();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
