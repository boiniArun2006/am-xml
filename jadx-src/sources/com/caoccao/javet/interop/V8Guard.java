package com.caoccao.javet.interop;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetClosable;
import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class V8Guard implements IJavetClosable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DEFAULT_TIMEOUT_MILLIS = 30000;
    private volatile boolean closed;
    private boolean debugModeEnabled;
    private long endTimeMillis;
    private final long startTimeMillis;
    private final V8Runtime v8Runtime;

    V8Guard(V8Runtime v8Runtime) {
        this(v8Runtime, 30000L, false);
    }

    public void setTimeoutMillis(long j2) {
        setTimeoutMillis(j2, false);
    }

    V8Guard(V8Runtime v8Runtime, long j2) {
        this(v8Runtime, j2, false);
    }

    private void setTimeoutMillis(long j2, boolean z2) {
        this.endTimeMillis = this.startTimeMillis + j2;
        if (isClosed()) {
            return;
        }
        PriorityBlockingQueue<V8Guard> v8GuardQueue = this.v8Runtime.getV8Host().getV8GuardDaemon().getV8GuardQueue();
        if (!z2) {
            v8GuardQueue.remove(this);
        }
        v8GuardQueue.add(this);
    }

    public long getEndTimeMillis() {
        return this.endTimeMillis;
    }

    public long getStartTimeMillis() {
        return this.startTimeMillis;
    }

    public long getTimeoutMillis() {
        return this.endTimeMillis - this.startTimeMillis;
    }

    public V8Runtime getV8Runtime() {
        return this.v8Runtime;
    }

    @Override // com.caoccao.javet.interfaces.IJavetClosable
    public boolean isClosed() {
        return this.closed;
    }

    public boolean isDebugModeEnabled() {
        return this.debugModeEnabled;
    }

    public void setDebugModeEnabled(boolean z2) {
        this.debugModeEnabled = z2;
    }

    V8Guard(V8Runtime v8Runtime, long j2, boolean z2) {
        this.closed = false;
        this.debugModeEnabled = z2;
        this.startTimeMillis = System.currentTimeMillis();
        Objects.requireNonNull(v8Runtime);
        this.v8Runtime = v8Runtime;
        setTimeoutMillis(j2, true);
    }

    public void cancel() {
        if (!isClosed()) {
            this.closed = true;
            synchronized (this.v8Runtime.getCloseLock()) {
                this.v8Runtime.getV8Host().getV8GuardDaemon().getV8GuardQueue().remove(this);
            }
        }
    }

    @Override // com.caoccao.javet.interfaces.IJavetClosable, java.lang.AutoCloseable
    public void close() throws JavetException {
        cancel();
    }
}
