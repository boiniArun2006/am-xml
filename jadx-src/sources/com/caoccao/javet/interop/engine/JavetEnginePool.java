package com.caoccao.javet.interop.engine;

import com.caoccao.javet.enums.JSRuntimeType;
import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetLogger;
import com.caoccao.javet.interop.V8Host;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.engine.observers.IV8RuntimeObserver;
import com.caoccao.javet.interop.monitoring.V8SharedMemoryStatistics;
import com.caoccao.javet.interop.options.RuntimeOptions;
import com.caoccao.javet.interop.options.V8RuntimeOptions;
import com.caoccao.javet.utils.JavetDateTimeUtils;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoUnit;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class JavetEnginePool<R extends V8Runtime> implements IJavetEnginePool<R>, Runnable {
    protected static final String JAVET_DAEMON_THREAD_NAME = "Javet Daemon";
    protected volatile boolean active;
    protected JavetEngineConfig config;
    protected Thread daemonThread;
    protected JavetEngine<R>[] engines;
    protected final Object externalLock;
    protected final ConcurrentLinkedQueue<Integer> idleEngineIndexList;
    protected final Object internalLock;
    protected volatile boolean quitting;
    protected Random random;
    protected final ConcurrentLinkedQueue<Integer> releasedEngineIndexList;
    protected Semaphore semaphore;

    public JavetEnginePool() {
        this(new JavetEngineConfig());
    }

    @Override // com.caoccao.javet.interop.engine.IJavetEnginePool
    public int observe(IV8RuntimeObserver<?>... iV8RuntimeObserverArr) {
        int i2;
        if (iV8RuntimeObserverArr.length <= 0) {
            return 0;
        }
        synchronized (this.internalLock) {
            try {
                IJavetLogger javetLogger = this.config.getJavetLogger();
                i2 = 0;
                for (JavetEngine<R> javetEngine : this.engines) {
                    if (javetEngine != null) {
                        for (IV8RuntimeObserver<?> iV8RuntimeObserver : iV8RuntimeObserverArr) {
                            if (!javetEngine.v8Runtime.isClosed()) {
                                try {
                                    iV8RuntimeObserver.observe(javetEngine.v8Runtime);
                                } finally {
                                }
                                i2++;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    public JavetEnginePool(JavetEngineConfig javetEngineConfig) {
        Objects.requireNonNull(javetEngineConfig);
        this.config = javetEngineConfig.freezePoolSize();
        this.idleEngineIndexList = new ConcurrentLinkedQueue<>();
        this.releasedEngineIndexList = new ConcurrentLinkedQueue<>();
        this.engines = new JavetEngine[javetEngineConfig.getPoolMaxSize()];
        this.externalLock = new Object();
        this.internalLock = new Object();
        this.active = false;
        this.quitting = false;
        this.random = new Random();
        this.semaphore = null;
        startDaemon();
    }

    protected JavetEngine<R> createEngine() throws JavetException {
        JSRuntimeType jSRuntimeType = this.config.getJSRuntimeType();
        RuntimeOptions<?> runtimeOptions = jSRuntimeType.getRuntimeOptions();
        if (runtimeOptions instanceof V8RuntimeOptions) {
            ((V8RuntimeOptions) runtimeOptions).setGlobalName(this.config.getGlobalName());
        }
        V8Runtime v8RuntimeCreateV8Runtime = V8Host.getInstance(jSRuntimeType).createV8Runtime(true, runtimeOptions);
        v8RuntimeCreateV8Runtime.allowEval(this.config.isAllowEval());
        v8RuntimeCreateV8Runtime.setLogger(this.config.getJavetLogger());
        return new JavetEngine<>(this, v8RuntimeCreateV8Runtime);
    }

    @Override // com.caoccao.javet.interop.engine.IJavetEnginePool
    public int getActiveEngineCount() {
        return (this.engines.length - getIdleEngineCount()) - getReleasedEngineCount();
    }

    @Override // com.caoccao.javet.interop.engine.IJavetEnginePool
    public JavetEngineConfig getConfig() {
        return this.config;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ec, code lost:
    
        java.util.Objects.requireNonNull(r3);
        r3.setActive(true);
        r3.getUsage().increaseUsedCount();
        r0.debug("JavetEnginePool.getEngine() ends.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fe, code lost:
    
        return r3;
     */
    @Override // com.caoccao.javet.interop.engine.IJavetEnginePool
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IJavetEngine<R> getEngine() throws JavetException {
        IJavetLogger javetLogger = this.config.getJavetLogger();
        javetLogger.debug("JavetEnginePool.getEngine() begins.");
        long jCurrentTimeMillis = System.currentTimeMillis();
        JavetEngine<R> javetEngineCreateEngine = null;
        long j2 = jCurrentTimeMillis;
        int i2 = 0;
        while (true) {
            if (this.quitting) {
                break;
            }
            if (this.semaphore.tryAcquire()) {
                try {
                    Integer numPoll = this.idleEngineIndexList.poll();
                    if (numPoll == null) {
                        Integer numPoll2 = this.releasedEngineIndexList.poll();
                        if (numPoll2 != null) {
                            javetEngineCreateEngine = createEngine();
                            javetEngineCreateEngine.setIndex(numPoll2.intValue());
                            this.engines[numPoll2.intValue()] = javetEngineCreateEngine;
                            break;
                        }
                        this.semaphore.release();
                    } else {
                        javetEngineCreateEngine = this.engines[numPoll.intValue()];
                        if (javetEngineCreateEngine == null) {
                            javetEngineCreateEngine = createEngine();
                            javetEngineCreateEngine.setIndex(numPoll.intValue());
                            this.engines[numPoll.intValue()] = javetEngineCreateEngine;
                        }
                    }
                } catch (Throwable th) {
                    javetLogger.logError(th, "Failed to create a new engine.", new Object[0]);
                }
            }
            i2++;
            if (i2 >= this.config.getWaitForEngineMaxRetryCount()) {
                javetLogger.logError("Failed to get an engine after {0} tries in {1}ms.", Integer.valueOf(this.config.getWaitForEngineMaxRetryCount()), Long.toString(System.currentTimeMillis() - jCurrentTimeMillis));
                throw new JavetException(JavetError.EngineNotAvailable);
            }
            try {
                TimeUnit.MILLISECONDS.sleep(this.config.getWaitForEngineSleepIntervalMillis()[this.random.nextInt(this.config.getWaitForEngineSleepIntervalMillis().length)]);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (jCurrentTimeMillis2 - j2 >= this.config.getWaitForEngineLogIntervalMillis()) {
                    javetLogger.logWarn("{0}ms passed while waiting for an idle engine.", Long.toString(jCurrentTimeMillis2 - jCurrentTimeMillis));
                    j2 = jCurrentTimeMillis2;
                }
            } catch (Throwable th2) {
                javetLogger.logError(th2, "Failed to sleep a while to wait for an idle engine.", new Object[0]);
            }
        }
    }

    @Override // com.caoccao.javet.interop.engine.IJavetEnginePool
    public int getIdleEngineCount() {
        return this.idleEngineIndexList.size();
    }

    @Override // com.caoccao.javet.interop.engine.IJavetEnginePool
    public int getReleasedEngineCount() {
        return this.releasedEngineIndexList.size();
    }

    @Override // com.caoccao.javet.interop.engine.IJavetEnginePool
    public V8SharedMemoryStatistics getV8SharedMemoryStatistics() {
        return V8Host.getInstance(this.config.getJSRuntimeType()).getV8SharedMemoryStatistics();
    }

    @Override // com.caoccao.javet.interop.engine.IJavetEnginePool
    public boolean isActive() {
        return this.active;
    }

    @Override // com.caoccao.javet.interfaces.IJavetClosable
    public boolean isClosed() {
        return !this.active;
    }

    @Override // com.caoccao.javet.interop.engine.IJavetEnginePool
    public boolean isQuitting() {
        return this.quitting;
    }

    @Override // com.caoccao.javet.interop.engine.IJavetEnginePool
    public void releaseEngine(IJavetEngine<R> iJavetEngine) {
        IJavetLogger javetLogger = this.config.getJavetLogger();
        javetLogger.debug("JavetEnginePool.releaseEngine() begins.");
        Objects.requireNonNull(iJavetEngine);
        JavetEngine javetEngine = (JavetEngine) iJavetEngine;
        javetEngine.setActive(false);
        if (this.config.isAutoSendGCNotification()) {
            javetEngine.sendGCNotification();
        }
        this.idleEngineIndexList.add(Integer.valueOf(javetEngine.getIndex()));
        this.semaphore.release();
        wakeUpDaemon();
        javetLogger.debug("JavetEnginePool.releaseEngine() ends.");
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public void run() {
        ConcurrentLinkedQueue<Integer> concurrentLinkedQueue;
        IJavetLogger javetLogger = this.config.getJavetLogger();
        javetLogger.debug("JavetEnginePool.run() begins.");
        while (true) {
            if (this.quitting) {
                break;
            }
            synchronized (this.internalLock) {
                try {
                    int size = this.idleEngineIndexList.size();
                    for (int poolMinSize = this.config.getPoolMinSize(); poolMinSize < size; poolMinSize++) {
                        int size2 = this.idleEngineIndexList.size();
                        Integer numPoll = this.idleEngineIndexList.poll();
                        if (numPoll == null) {
                            break;
                        }
                        JavetEngine<R> javetEngine = this.engines[numPoll.intValue()];
                        Objects.requireNonNull(javetEngine, "The idle engine must not be null.");
                        JavetEngineUsage usage = javetEngine.getUsage();
                        ZonedDateTime lastActiveZonedDatetime = usage.getLastActiveZonedDatetime();
                        long poolIdleTimeoutSeconds = this.config.getPoolIdleTimeoutSeconds();
                        ChronoUnit chronoUnit = ChronoUnit.SECONDS;
                        ZonedDateTime zonedDateTimeB = lastActiveZonedDatetime.b(poolIdleTimeoutSeconds, chronoUnit);
                        if (size2 > this.engines.length || zonedDateTimeB.isBefore(getUTCNow())) {
                            try {
                                javetEngine.close(true);
                                this.engines[numPoll.intValue()] = null;
                                concurrentLinkedQueue = this.releasedEngineIndexList;
                            } finally {
                                try {
                                } finally {
                                }
                            }
                            concurrentLinkedQueue.add(numPoll);
                        } else {
                            if (this.config.getResetEngineTimeoutSeconds() > 0 && usage.getLastActiveZonedDatetime().b(this.config.getResetEngineTimeoutSeconds(), chronoUnit).isBefore(getUTCNow())) {
                                try {
                                    javetLogger.debug("JavetEnginePool reset engine begins.");
                                    javetEngine.resetContext();
                                    javetLogger.debug("JavetEnginePool reset engine ends.");
                                } catch (Throwable th) {
                                    javetLogger.logError(th, "Failed to reset idle engine.", new Object[0]);
                                }
                            }
                            this.idleEngineIndexList.add(numPoll);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            synchronized (this.externalLock) {
                try {
                    this.externalLock.wait(this.config.getPoolDaemonCheckIntervalMillis());
                } catch (InterruptedException e2) {
                    javetLogger.logError(e2, "Failed to sleep a while to wait for next round in Javet engine pool daemon.", new Object[0]);
                }
            }
        }
        javetLogger.logDebug("JavetEnginePool daemon is quitting with {0}/{1}/{2} engines.", Integer.toString(getActiveEngineCount()), Integer.toString(getIdleEngineCount()), Integer.toString(this.engines.length));
        synchronized (this.internalLock) {
            TreeSet treeSet = new TreeSet(this.idleEngineIndexList);
            TreeSet treeSet2 = new TreeSet(this.releasedEngineIndexList);
            int i2 = 0;
            while (true) {
                JavetEngine<R>[] javetEngineArr = this.engines;
                if (i2 < javetEngineArr.length) {
                    JavetEngine<R> javetEngine2 = javetEngineArr[i2];
                    if (javetEngine2 != null) {
                        try {
                            if (javetEngine2.isActive()) {
                                try {
                                    javetEngine2.getV8Runtime().terminateExecution();
                                } catch (Throwable th3) {
                                    javetLogger.logError(th3, "Failed to terminate active engine.", new Object[0]);
                                }
                            }
                            javetEngine2.close(true);
                        } catch (Throwable th4) {
                            try {
                                javetLogger.logError(th4, "Failed to release engine.", new Object[0]);
                                this.engines[i2] = null;
                            } finally {
                                this.engines[i2] = null;
                            }
                        }
                    }
                    if (treeSet.contains(Integer.valueOf(i2))) {
                        treeSet.remove(Integer.valueOf(i2));
                        this.idleEngineIndexList.remove(Integer.valueOf(i2));
                    }
                    if (!treeSet2.contains(Integer.valueOf(i2))) {
                        treeSet2.add(Integer.valueOf(i2));
                        this.releasedEngineIndexList.add(Integer.valueOf(i2));
                    }
                    i2++;
                }
            }
        }
        javetLogger.debug("JavetEnginePool.run() ends.");
    }

    protected void startDaemon() {
        IJavetLogger javetLogger = this.config.getJavetLogger();
        javetLogger.debug("JavetEnginePool.startDaemon() begins.");
        this.idleEngineIndexList.clear();
        this.releasedEngineIndexList.clear();
        for (int i2 = 0; i2 < this.engines.length; i2++) {
            this.releasedEngineIndexList.add(Integer.valueOf(i2));
        }
        this.semaphore = new Semaphore(this.engines.length);
        this.quitting = false;
        Thread thread = new Thread(this);
        this.daemonThread = thread;
        thread.setDaemon(true);
        this.daemonThread.setName(JAVET_DAEMON_THREAD_NAME);
        this.daemonThread.start();
        this.active = true;
        javetLogger.debug("JavetEnginePool.startDaemon() ends.");
    }

    protected void stopDaemon() {
        IJavetLogger javetLogger = this.config.getJavetLogger();
        javetLogger.debug("JavetEnginePool.stopDaemon() begins.");
        this.quitting = true;
        try {
            try {
                Thread thread = this.daemonThread;
                if (thread != null) {
                    thread.join();
                }
            } catch (Exception e2) {
                javetLogger.logError(e2, e2.getMessage(), new Object[0]);
            }
            this.active = false;
            this.quitting = false;
            this.semaphore = null;
            javetLogger.debug("JavetEnginePool.stopDaemon() ends.");
        } finally {
            this.daemonThread = null;
        }
    }

    @Override // com.caoccao.javet.interop.engine.IJavetEnginePool
    public void wakeUpDaemon() {
        synchronized (this.externalLock) {
            this.externalLock.notify();
        }
    }

    @Override // com.caoccao.javet.interfaces.IJavetClosable, java.lang.AutoCloseable
    public void close() throws JavetException {
        stopDaemon();
    }

    protected ZonedDateTime getUTCNow() {
        return JavetDateTimeUtils.getUTCNow();
    }
}
