package com.caoccao.javet.interop;

import com.caoccao.javet.enums.JSRuntimeType;
import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetLogger;
import com.caoccao.javet.interop.V8Host;
import com.caoccao.javet.interop.loader.JavetLibLoader;
import com.caoccao.javet.interop.monitoring.V8SharedMemoryStatistics;
import com.caoccao.javet.interop.monitoring.V8StatisticsFuture;
import com.caoccao.javet.interop.options.RuntimeOptions;
import com.caoccao.javet.utils.JavetDateTimeUtils;
import com.caoccao.javet.utils.JavetDefaultLogger;
import com.caoccao.javet.utils.SimpleMap;
import j$.time.Duration;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class V8Host {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long INVALID_HANDLE = 0;
    private Optional<Boolean> i18nEnabled;
    private boolean isolateCreated;
    private JavetClassLoader javetClassLoader;
    private final JSRuntimeType jsRuntimeType;
    private JavetException lastException;
    private volatile boolean libraryLoaded;
    private final IJavetLogger logger;
    private Thread threadV8GuardDaemon;
    private Thread threadV8StatisticsFutureDaemon;
    private final V8GuardDaemon v8GuardDaemon;
    private IV8Native v8Native;
    private final V8Notifier v8Notifier;
    private final ConcurrentHashMap<Long, V8Runtime> v8RuntimeMap;
    private final V8StatisticsFutureDaemon v8StatisticsFutureDaemon;
    private static final Map<Long, V8StatisticsFuture<?>> v8StatisticsFutureMap = new HashMap(1024);
    private static final Object v8StatisticsFutureMapLock = new Object();
    private static boolean libraryReloadable = false;
    private static volatile double memoryUsageThresholdRatio = 0.7d;

    private static class NodeI18nInstanceHolder {
        private static final V8Host INSTANCE = new V8Host(JSRuntimeType.NodeI18n, null);

        private NodeI18nInstanceHolder() {
        }
    }

    private static class NodeInstanceHolder {
        private static final V8Host INSTANCE = new V8Host(JSRuntimeType.Node, null);

        private NodeInstanceHolder() {
        }
    }

    static class V8GuardDaemon implements Runnable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final long DEFAULT_SLEEP_INTERVAL_MILLIS = 5;
        private static final int INITIAL_CAPACITY = 64;
        private static final boolean IS_IN_DEBUG_MODE = false;
        private long sleepIntervalMillis = DEFAULT_SLEEP_INTERVAL_MILLIS;
        private final PriorityBlockingQueue<V8Guard> v8GuardQueue = new PriorityBlockingQueue<>(64, new Comparator() { // from class: com.caoccao.javet.interop.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return V8Host.V8GuardDaemon.n((V8Guard) obj, (V8Guard) obj2);
            }
        });

        public long getSleepIntervalMillis() {
            return this.sleepIntervalMillis;
        }

        public PriorityBlockingQueue<V8Guard> getV8GuardQueue() {
            return this.v8GuardQueue;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    V8Guard v8GuardTake = this.v8GuardQueue.take();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis > v8GuardTake.getEndTimeMillis()) {
                        v8GuardTake.isDebugModeEnabled();
                        V8Runtime v8Runtime = v8GuardTake.getV8Runtime();
                        synchronized (v8Runtime.getCloseLock()) {
                            try {
                                if (!v8GuardTake.isClosed() && !v8Runtime.isClosed() && v8Runtime.isInUse()) {
                                    v8Runtime.terminateExecution();
                                    v8Runtime.getLogger().logWarn("Execution was terminated after {0}ms.", Long.valueOf(jCurrentTimeMillis - v8GuardTake.getStartTimeMillis()));
                                }
                            } finally {
                            }
                        }
                    } else {
                        V8Runtime v8Runtime2 = v8GuardTake.getV8Runtime();
                        synchronized (v8Runtime2.getCloseLock()) {
                            try {
                                if (!v8GuardTake.isClosed() && !v8Runtime2.isClosed()) {
                                    this.v8GuardQueue.add(v8GuardTake);
                                    long jMin = Math.min(v8GuardTake.getEndTimeMillis() - jCurrentTimeMillis, this.sleepIntervalMillis);
                                    if (jMin > 0) {
                                        TimeUnit.MILLISECONDS.sleep(jMin);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }

        public void setSleepIntervalMillis(long j2) {
            this.sleepIntervalMillis = j2;
        }

        public static /* synthetic */ int n(V8Guard v8Guard, V8Guard v8Guard2) {
            return (int) (v8Guard.getEndTimeMillis() - v8Guard2.getEndTimeMillis());
        }
    }

    private static class V8I18nInstanceHolder {
        private static final V8Host INSTANCE = new V8Host(JSRuntimeType.V8I18n, null);

        private V8I18nInstanceHolder() {
        }
    }

    private static class V8InstanceHolder {
        private static final V8Host INSTANCE = new V8Host(JSRuntimeType.V8, null);

        private V8InstanceHolder() {
        }
    }

    static class V8StatisticsFutureDaemon implements Runnable {
        private static final long SLEEP_IN_MILLIS = 1000;
        private static final long TIMEOUT_IN_SECONDS = 60;
        private IV8Native v8Native = null;
        private final ConcurrentLinkedQueue<V8StatisticsFuture<?>> v8StatisticsFutureQueue = new ConcurrentLinkedQueue<>();

        public ConcurrentLinkedQueue<V8StatisticsFuture<?>> getV8StatisticsFutureQueue() {
            return this.v8StatisticsFutureQueue;
        }

        public void purgeV8StatisticsFutureQueue() {
            while (!this.v8StatisticsFutureQueue.isEmpty()) {
                V8StatisticsFuture<?> v8StatisticsFuturePoll = this.v8StatisticsFutureQueue.poll();
                if (!v8StatisticsFuturePoll.isDone()) {
                    V8Host.purgeV8StatisticsFuture(v8StatisticsFuturePoll, this.v8Native);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    if (this.v8StatisticsFutureQueue.isEmpty()) {
                        TimeUnit.MILLISECONDS.sleep(1000L);
                    } else {
                        V8StatisticsFuture<?> v8StatisticsFuturePeek = this.v8StatisticsFutureQueue.peek();
                        if (v8StatisticsFuturePeek.isDone()) {
                            this.v8StatisticsFutureQueue.poll();
                        } else {
                            Duration durationBetween = Duration.between(JavetDateTimeUtils.getUTCNow(), v8StatisticsFuturePeek.getCreationDateTime().plusSeconds(TIMEOUT_IN_SECONDS));
                            if (durationBetween.isNegative()) {
                                V8Host.purgeV8StatisticsFuture(v8StatisticsFuturePeek, this.v8Native);
                                this.v8StatisticsFutureQueue.poll();
                            } else {
                                TimeUnit.MILLISECONDS.sleep(durationBetween.toMillis());
                            }
                        }
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }

        public void setV8Native(IV8Native iV8Native) {
            this.v8Native = iV8Native;
        }
    }

    /* synthetic */ V8Host(JSRuntimeType jSRuntimeType, AnonymousClass1 anonymousClass1) {
        this(jSRuntimeType);
    }

    private static void setMemoryUsageThreshold() {
    }

    public <R extends V8Runtime> R createV8Runtime() throws JavetException {
        return (R) createV8Runtime(getJSRuntimeType().getRuntimeOptions());
    }

    public synchronized boolean loadLibrary() {
        if (this.libraryLoaded) {
        } else {
            try {
                this.logger.logDebug("[{0}] Loading library.", this.jsRuntimeType.getName());
                JavetClassLoader javetClassLoader = new JavetClassLoader(V8Host.class.getClassLoader(), this.jsRuntimeType);
                this.javetClassLoader = javetClassLoader;
                javetClassLoader.load();
                this.v8Native = this.javetClassLoader.getNative();
                this.libraryLoaded = true;
                this.isolateCreated = false;
                Thread thread = new Thread(this.v8GuardDaemon);
                this.threadV8GuardDaemon = thread;
                thread.setDaemon(true);
                this.threadV8GuardDaemon.start();
                this.v8StatisticsFutureDaemon.setV8Native(this.v8Native);
                Thread thread2 = new Thread(this.v8StatisticsFutureDaemon);
                this.threadV8StatisticsFutureDaemon = thread2;
                thread2.setDaemon(true);
                this.threadV8StatisticsFutureDaemon.start();
            } catch (JavetException e2) {
                this.logger.logError(e2, "Failed to load Javet lib with error {0}.", e2.getMessage());
                this.lastException = e2;
            }
        }
        return this.libraryLoaded;
    }

    public synchronized boolean unloadLibrary() {
        try {
            if (this.libraryLoaded && this.v8RuntimeMap.isEmpty()) {
                this.logger.logDebug("[{0}] Unloading library.", this.jsRuntimeType.getName());
                this.threadV8GuardDaemon.interrupt();
                this.threadV8GuardDaemon = null;
                this.v8GuardDaemon.getV8GuardQueue().clear();
                this.threadV8StatisticsFutureDaemon.interrupt();
                this.threadV8StatisticsFutureDaemon = null;
                this.v8StatisticsFutureDaemon.purgeV8StatisticsFutureQueue();
                this.v8StatisticsFutureDaemon.setV8Native(null);
                this.isolateCreated = false;
                this.v8Native = null;
                this.javetClassLoader = null;
                System.gc();
                System.runFinalization();
                this.libraryLoaded = false;
                this.lastException = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return !this.libraryLoaded;
    }

    /* JADX INFO: renamed from: com.caoccao.javet.interop.V8Host$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$caoccao$javet$enums$JSRuntimeType;

        static {
            int[] iArr = new int[JSRuntimeType.values().length];
            $SwitchMap$com$caoccao$javet$enums$JSRuntimeType = iArr;
            try {
                iArr[JSRuntimeType.Node.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$JSRuntimeType[JSRuntimeType.NodeI18n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$JSRuntimeType[JSRuntimeType.V8I18n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private V8Host(JSRuntimeType jSRuntimeType) {
        Objects.requireNonNull(jSRuntimeType);
        this.javetClassLoader = null;
        this.lastException = null;
        this.libraryLoaded = false;
        this.logger = new JavetDefaultLogger(V8Host.class.getName());
        ConcurrentHashMap<Long, V8Runtime> concurrentHashMap = new ConcurrentHashMap<>();
        this.v8RuntimeMap = concurrentHashMap;
        this.v8Native = null;
        this.isolateCreated = false;
        this.i18nEnabled = Optional.empty();
        this.jsRuntimeType = jSRuntimeType;
        this.v8GuardDaemon = new V8GuardDaemon();
        this.v8StatisticsFutureDaemon = new V8StatisticsFutureDaemon();
        this.threadV8GuardDaemon = null;
        this.threadV8StatisticsFutureDaemon = null;
        loadLibrary();
        this.v8Notifier = new V8Notifier(concurrentHashMap);
    }

    public static V8Host getInstance(JSRuntimeType jSRuntimeType) {
        int[] iArr = AnonymousClass1.$SwitchMap$com$caoccao$javet$enums$JSRuntimeType;
        Objects.requireNonNull(jSRuntimeType);
        int i2 = iArr[jSRuntimeType.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? getV8Instance() : getV8I18nInstance() : getNodeI18nInstance() : getNodeInstance();
    }

    public static double getMemoryUsageThresholdRatio() {
        return memoryUsageThresholdRatio;
    }

    public static boolean isLibraryReloadable() {
        return libraryReloadable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void purgeV8StatisticsFuture(V8StatisticsFuture<?> v8StatisticsFuture, IV8Native iV8Native) {
        synchronized (v8StatisticsFutureMapLock) {
            try {
                if (v8StatisticsFutureMap.remove(Long.valueOf(v8StatisticsFuture.getHandle())) != null) {
                    iV8Native.removeRawPointer(v8StatisticsFuture.getHandle(), v8StatisticsFuture.getRawPointerType().getId());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void registerV8StatisticsFuture(V8StatisticsFuture<?> v8StatisticsFuture) {
        synchronized (v8StatisticsFutureMapLock) {
            v8StatisticsFutureMap.put(Long.valueOf(v8StatisticsFuture.getHandle()), v8StatisticsFuture);
        }
    }

    private static boolean requestV8StatisticsFuture(long j2) {
        boolean z2;
        synchronized (v8StatisticsFutureMapLock) {
            z2 = v8StatisticsFutureMap.remove(Long.valueOf(j2)) != null;
        }
        return z2;
    }

    public static void setLibraryReloadable(boolean z2) {
        libraryReloadable = z2;
    }

    public static void setMemoryUsageThresholdRatio(double d2) {
        memoryUsageThresholdRatio = d2;
    }

    public void clearInternalStatistic() {
        this.v8Native.clearInternalStatistic();
    }

    public void closeV8Runtime(V8Runtime v8Runtime) {
        if (this.libraryLoaded && v8Runtime != null) {
            long handle = v8Runtime.getHandle();
            if (handle == 0 || !this.v8RuntimeMap.containsKey(Long.valueOf(handle))) {
                return;
            }
            this.v8Native.closeV8Runtime(handle);
            this.v8RuntimeMap.remove(Long.valueOf(handle));
        }
    }

    public <R extends V8Runtime> R createV8Runtime(RuntimeOptions<?> runtimeOptions) throws JavetException {
        return (R) createV8Runtime(false, runtimeOptions);
    }

    public V8Host disableGCNotification() {
        this.v8Notifier.unregisterListener();
        return this;
    }

    public long[] getInternalStatistic() {
        return this.v8Native.getInternalStatistic();
    }

    public JSRuntimeType getJSRuntimeType() {
        return this.jsRuntimeType;
    }

    public String getJavetVersion() {
        return JavetLibLoader.LIB_VERSION;
    }

    public JavetException getLastException() {
        return this.lastException;
    }

    public IJavetLogger getLogger() {
        return this.logger;
    }

    public long getSleepIntervalMillis() {
        return this.v8GuardDaemon.getSleepIntervalMillis();
    }

    V8GuardDaemon getV8GuardDaemon() {
        return this.v8GuardDaemon;
    }

    IV8Native getV8Native() {
        return this.v8Native;
    }

    public int getV8RuntimeCount() {
        return this.v8RuntimeMap.size();
    }

    public V8SharedMemoryStatistics getV8SharedMemoryStatistics() {
        return (V8SharedMemoryStatistics) this.v8Native.getV8SharedMemoryStatistics();
    }

    public boolean isI18nEnabled() {
        if (!this.i18nEnabled.isPresent()) {
            this.i18nEnabled = Optional.of(Boolean.valueOf(this.v8Native.isI18nEnabled()));
        }
        return this.i18nEnabled.get().booleanValue();
    }

    public boolean isIsolateCreated() {
        return this.isolateCreated;
    }

    public boolean isLibraryLoaded() {
        return this.libraryLoaded;
    }

    void offerV8StatisticsFuture(V8StatisticsFuture<?> v8StatisticsFuture) {
        ConcurrentLinkedQueue<V8StatisticsFuture<?>> v8StatisticsFutureQueue = this.v8StatisticsFutureDaemon.getV8StatisticsFutureQueue();
        Objects.requireNonNull(v8StatisticsFuture);
        v8StatisticsFutureQueue.offer(v8StatisticsFuture);
    }

    public void setSleepIntervalMillis(long j2) {
        this.v8GuardDaemon.setSleepIntervalMillis(j2);
    }

    public static V8Host getNodeI18nInstance() {
        return NodeI18nInstanceHolder.INSTANCE;
    }

    public static V8Host getNodeInstance() {
        return NodeInstanceHolder.INSTANCE;
    }

    public static V8Host getV8I18nInstance() {
        return V8I18nInstanceHolder.INSTANCE;
    }

    public static V8Host getV8Instance() {
        return V8InstanceHolder.INSTANCE;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public <R extends V8Runtime> R createV8Runtime(boolean z2, RuntimeOptions<?> runtimeOptions) throws JavetException {
        V8Host v8Host;
        NodeRuntime nodeRuntime;
        if (!this.libraryLoaded) {
            JavetException javetException = this.lastException;
            if (javetException == null) {
                throw new JavetException(JavetError.LibraryNotLoaded, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_REASON, "there are unknown errors"));
            }
            throw javetException;
        }
        long jCreateV8Runtime = this.v8Native.createV8Runtime(runtimeOptions);
        this.isolateCreated = true;
        if (this.jsRuntimeType.isNode()) {
            v8Host = this;
            nodeRuntime = new NodeRuntime(v8Host, jCreateV8Runtime, z2, this.v8Native, this.jsRuntimeType, runtimeOptions);
        } else {
            v8Host = this;
            nodeRuntime = (R) new V8Runtime(v8Host, jCreateV8Runtime, z2, v8Host.v8Native, v8Host.jsRuntimeType, runtimeOptions);
        }
        v8Host.v8Native.registerV8Runtime(jCreateV8Runtime, nodeRuntime);
        v8Host.v8RuntimeMap.put(Long.valueOf(jCreateV8Runtime), nodeRuntime);
        return nodeRuntime;
    }

    public V8Host enableGCNotification() {
        setMemoryUsageThreshold();
        this.v8Notifier.registerListeners();
        return this;
    }
}
