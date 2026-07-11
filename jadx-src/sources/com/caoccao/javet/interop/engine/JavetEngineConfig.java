package com.caoccao.javet.interop.engine;

import com.caoccao.javet.enums.JSRuntimeType;
import com.caoccao.javet.interfaces.IJavetLogger;
import com.caoccao.javet.utils.JavetDefaultLogger;
import com.caoccao.javet.utils.JavetOSUtils;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class JavetEngineConfig {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DEFAULT_OBSERVER_TIMEOUT_MILLIS = 5000;
    public static final int DEFAULT_POOL_DAEMON_CHECK_INTERVAL_MILLIS = 1000;
    public static final int DEFAULT_POOL_IDLE_TIMEOUT_SECONDS = 60;
    public static final int DEFAULT_POOL_MIN_SIZE = 1;
    public static final int DEFAULT_POOL_SHUTDOWN_TIMEOUT_SECONDS = 5;
    public static final int DEFAULT_RESET_ENGINE_TIMEOUT_SECONDS = 3600;
    public static final int DEFAULT_WAIT_FOR_ENGINE_LOG_INTERVAL_MILLIS = 1000;
    public static final int DEFAULT_WAIT_FOR_ENGINE_MAX_RETRY_COUNT = 500;
    public static final int MAX_POOL_SIZE = 4096;
    private boolean allowEval;
    private boolean autoSendGCNotification;
    private int defaultEngineGuardTimeoutMillis;
    private boolean gcBeforeEngineClose;
    private String globalName;
    private IJavetLogger javetLogger;
    private JSRuntimeType jsRuntimeType;
    private int observerTimeoutMillis;
    private int poolDaemonCheckIntervalMillis;
    private int poolIdleTimeoutSeconds;
    private int poolMaxSize;
    private int poolMinSize;
    private int poolShutdownTimeoutSeconds;
    private boolean poolSizeFrozen;
    private int resetEngineTimeoutSeconds;
    private int waitForEngineLogIntervalMillis;
    private int waitForEngineMaxRetryCount;
    private int[] waitForEngineSleepIntervalMillis;
    public static final JSRuntimeType DEFAULT_JS_RUNTIME_TYPE = JSRuntimeType.V8;
    protected static final int[] DEFAULT_WAIT_FOR_ENGINE_SLEEP_INTERVAL_MILLIS = {5, 6, 7, 8, 9, 10};
    public static IJavetLogger DEFAULT_JAVET_LOGGER = new JavetDefaultLogger(JavetEnginePool.class.getName());

    public JavetEngineConfig freezePoolSize() {
        if (!this.poolSizeFrozen) {
            this.poolSizeFrozen = true;
        }
        return this;
    }

    public int getDefaultEngineGuardTimeoutMillis() {
        return this.defaultEngineGuardTimeoutMillis;
    }

    public String getGlobalName() {
        return this.globalName;
    }

    public JSRuntimeType getJSRuntimeType() {
        return this.jsRuntimeType;
    }

    public IJavetLogger getJavetLogger() {
        return this.javetLogger;
    }

    public int getObserverTimeoutMillis() {
        return this.observerTimeoutMillis;
    }

    public int getPoolDaemonCheckIntervalMillis() {
        return this.poolDaemonCheckIntervalMillis;
    }

    public int getPoolIdleTimeoutSeconds() {
        return this.poolIdleTimeoutSeconds;
    }

    public int getPoolMaxSize() {
        return this.poolMaxSize;
    }

    public int getPoolMinSize() {
        return this.poolMinSize;
    }

    public int getPoolShutdownTimeoutSeconds() {
        return this.poolShutdownTimeoutSeconds;
    }

    public int getResetEngineTimeoutSeconds() {
        return this.resetEngineTimeoutSeconds;
    }

    public int getWaitForEngineLogIntervalMillis() {
        return this.waitForEngineLogIntervalMillis;
    }

    public int getWaitForEngineMaxRetryCount() {
        return this.waitForEngineMaxRetryCount;
    }

    public int[] getWaitForEngineSleepIntervalMillis() {
        return this.waitForEngineSleepIntervalMillis;
    }

    public boolean isAllowEval() {
        return this.allowEval;
    }

    public boolean isAutoSendGCNotification() {
        return this.autoSendGCNotification;
    }

    public boolean isGCBeforeEngineClose() {
        return this.gcBeforeEngineClose;
    }

    public JavetEngineConfig setAllowEval(boolean z2) {
        this.allowEval = z2;
        return this;
    }

    public JavetEngineConfig setAutoSendGCNotification(boolean z2) {
        this.autoSendGCNotification = z2;
        return this;
    }

    public JavetEngineConfig setDefaultEngineGuardTimeoutMillis(int i2) {
        this.defaultEngineGuardTimeoutMillis = i2;
        return this;
    }

    public JavetEngineConfig setGCBeforeEngineClose(boolean z2) {
        this.gcBeforeEngineClose = z2;
        return this;
    }

    public JavetEngineConfig setGlobalName(String str) {
        this.globalName = str;
        return this;
    }

    public JavetEngineConfig setObserverTimeoutMillis(int i2) {
        this.observerTimeoutMillis = i2;
        return this;
    }

    public JavetEngineConfig setPoolDaemonCheckIntervalMillis(int i2) {
        this.poolDaemonCheckIntervalMillis = i2;
        return this;
    }

    public JavetEngineConfig setPoolIdleTimeoutSeconds(int i2) {
        this.poolIdleTimeoutSeconds = i2;
        return this;
    }

    public JavetEngineConfig setPoolMaxSize(int i2) {
        if (!this.poolSizeFrozen) {
            this.poolMaxSize = i2;
        }
        return this;
    }

    public JavetEngineConfig setPoolMinSize(int i2) {
        if (!this.poolSizeFrozen) {
            this.poolMinSize = i2;
        }
        return this;
    }

    public JavetEngineConfig setPoolShutdownTimeoutSeconds(int i2) {
        this.poolShutdownTimeoutSeconds = i2;
        return this;
    }

    public JavetEngineConfig setResetEngineTimeoutSeconds(int i2) {
        this.resetEngineTimeoutSeconds = i2;
        return this;
    }

    public JavetEngineConfig setWaitForEngineLogIntervalMillis(int i2) {
        this.waitForEngineLogIntervalMillis = i2;
        return this;
    }

    public JavetEngineConfig setWaitForEngineMaxRetryCount(int i2) {
        this.waitForEngineMaxRetryCount = i2;
        return this;
    }

    public JavetEngineConfig() {
        setJavetLogger(DEFAULT_JAVET_LOGGER);
        setGlobalName(null);
        setAllowEval(false);
        setAutoSendGCNotification(true);
        setDefaultEngineGuardTimeoutMillis(30000);
        setGCBeforeEngineClose(false);
        setJSRuntimeType(DEFAULT_JS_RUNTIME_TYPE);
        this.poolSizeFrozen = false;
        int cPUCount = JavetOSUtils.getCPUCount();
        setPoolMinSize(Math.max(1, cPUCount >> 1));
        setPoolMaxSize(Math.max(1, cPUCount));
        setPoolIdleTimeoutSeconds(60);
        setPoolShutdownTimeoutSeconds(5);
        setPoolDaemonCheckIntervalMillis(1000);
        setResetEngineTimeoutSeconds(DEFAULT_RESET_ENGINE_TIMEOUT_SECONDS);
        setWaitForEngineLogIntervalMillis(1000);
        setWaitForEngineMaxRetryCount(500);
        setWaitForEngineSleepIntervalMillis(DEFAULT_WAIT_FOR_ENGINE_SLEEP_INTERVAL_MILLIS);
    }

    public JavetEngineConfig setJSRuntimeType(JSRuntimeType jSRuntimeType) {
        Objects.requireNonNull(jSRuntimeType);
        this.jsRuntimeType = jSRuntimeType;
        return this;
    }

    public JavetEngineConfig setJavetLogger(IJavetLogger iJavetLogger) {
        Objects.requireNonNull(iJavetLogger);
        this.javetLogger = iJavetLogger;
        return this;
    }

    public JavetEngineConfig setWaitForEngineSleepIntervalMillis(int[] iArr) {
        Objects.requireNonNull(iArr);
        this.waitForEngineSleepIntervalMillis = Arrays.copyOf(iArr, iArr.length);
        return this;
    }
}
