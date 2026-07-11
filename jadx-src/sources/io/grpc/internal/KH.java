package io.grpc.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class KH extends rv6 {
    private final j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final ReferenceQueue f68289t = new ReferenceQueue();
    private static final ConcurrentMap nr = new ConcurrentHashMap();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Logger f68288O = Logger.getLogger(KH.class.getName());

    static final class j extends WeakReference {
        private static final boolean J2 = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
        private static final RuntimeException Uo = O();

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final AtomicBoolean f68290O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ReferenceQueue f68291n;
        private final Reference nr;
        private final ConcurrentMap rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f68292t;

        static int rl(ReferenceQueue referenceQueue) {
            int i2 = 0;
            while (true) {
                j jVar = (j) referenceQueue.poll();
                if (jVar == null) {
                    return i2;
                }
                RuntimeException runtimeException = (RuntimeException) jVar.nr.get();
                jVar.t();
                if (!jVar.f68290O.get()) {
                    i2++;
                    Level level = Level.SEVERE;
                    if (KH.f68288O.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                        logRecord.setLoggerName(KH.f68288O.getName());
                        logRecord.setParameters(new Object[]{jVar.f68292t});
                        logRecord.setThrown(runtimeException);
                        KH.f68288O.log(logRecord);
                    }
                }
            }
        }

        private static RuntimeException O() {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            return runtimeException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void nr() {
            if (this.f68290O.getAndSet(true)) {
                return;
            }
            clear();
        }

        j(KH kh, JP.nKK nkk, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
            RuntimeException runtimeException;
            super(kh, referenceQueue);
            this.f68290O = new AtomicBoolean();
            if (J2) {
                runtimeException = new RuntimeException("ManagedChannel allocation site");
            } else {
                runtimeException = Uo;
            }
            this.nr = new SoftReference(runtimeException);
            this.f68292t = nkk.toString();
            this.f68291n = referenceQueue;
            this.rl = concurrentMap;
            concurrentMap.put(this, this);
            rl(referenceQueue);
        }

        private void t() {
            super.clear();
            this.rl.remove(this);
            this.nr.clear();
        }

        @Override // java.lang.ref.Reference
        public void clear() {
            t();
            rl(this.f68291n);
        }
    }

    KH(JP.nKK nkk) {
        this(nkk, f68289t, nr);
    }

    KH(JP.nKK nkk, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(nkk);
        this.rl = new j(this, nkk, referenceQueue, concurrentMap);
    }

    @Override // io.grpc.internal.rv6, JP.nKK
    public JP.nKK az() {
        this.rl.nr();
        return super.az();
    }
}
