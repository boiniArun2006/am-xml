package JWp;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class qz implements Executor {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Logger f4588o = Logger.getLogger(qz.class.getName());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f4590n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Deque f4592t = new ArrayDeque();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private w6 f4589O = w6.f4598n;
    private long J2 = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final n f4591r = new n(this, null);

    class j implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Runnable f4593n;

        j(Runnable runnable) {
            this.f4593n = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4593n.run();
        }

        public String toString() {
            return this.f4593n.toString();
        }
    }

    private final class n implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Runnable f4595n;

        private n() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        
            r8.f4595n.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        
            JWp.qz.f4588o.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f4595n, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        
            r8.f4595n = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        
            return;
         */
        /* JADX WARN: Removed duplicated region for block: B:46:0x003d A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void n() {
            Runnable runnable;
            boolean z2 = false;
            boolean zInterrupted = false;
            while (true) {
                try {
                    synchronized (qz.this.f4592t) {
                        if (z2) {
                            runnable = (Runnable) qz.this.f4592t.poll();
                            this.f4595n = runnable;
                            if (runnable != null) {
                            }
                        } else {
                            w6 w6Var = qz.this.f4589O;
                            w6 w6Var2 = w6.RUNNING;
                            if (w6Var != w6Var2) {
                                qz.nr(qz.this);
                                qz.this.f4589O = w6Var2;
                                z2 = true;
                                runnable = (Runnable) qz.this.f4592t.poll();
                                this.f4595n = runnable;
                                if (runnable != null) {
                                    qz.this.f4589O = w6.f4598n;
                                }
                            }
                        }
                    }
                    if (!zInterrupted) {
                        return;
                    }
                } finally {
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* synthetic */ n(qz qzVar, j jVar) {
            this();
        }

        public String toString() {
            Runnable runnable = this.f4595n;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + qz.this.f4589O + "}";
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                n();
            } catch (Error e2) {
                synchronized (qz.this.f4592t) {
                    qz.this.f4589O = w6.f4598n;
                    throw e2;
                }
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    enum w6 {
        f4598n,
        QUEUING,
        f4597O,
        RUNNING
    }

    static /* synthetic */ long nr(qz qzVar) {
        long j2 = qzVar.J2;
        qzVar.J2 = 1 + j2;
        return j2;
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f4590n + "}";
    }

    qz(Executor executor) {
        this.f4590n = (Executor) Preconditions.checkNotNull(executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void execute(Runnable runnable) {
        w6 w6Var;
        boolean z2;
        Preconditions.checkNotNull(runnable);
        synchronized (this.f4592t) {
            w6 w6Var2 = this.f4589O;
            if (w6Var2 != w6.RUNNING && w6Var2 != (w6Var = w6.f4597O)) {
                long j2 = this.J2;
                j jVar = new j(runnable);
                this.f4592t.add(jVar);
                w6 w6Var3 = w6.QUEUING;
                this.f4589O = w6Var3;
                try {
                    this.f4590n.execute(this.f4591r);
                    if (this.f4589O != w6Var3) {
                        return;
                    }
                    synchronized (this.f4592t) {
                        try {
                            if (this.J2 == j2 && this.f4589O == w6Var3) {
                                this.f4589O = w6Var;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e2) {
                    synchronized (this.f4592t) {
                        try {
                            w6 w6Var4 = this.f4589O;
                            if (w6Var4 == w6.f4598n || w6Var4 == w6.QUEUING) {
                                if (this.f4592t.removeLastOccurrence(jVar)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            }
                            if (!(e2 instanceof RejectedExecutionException) || z2) {
                                throw e2;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f4592t.add(runnable);
        }
    }
}
