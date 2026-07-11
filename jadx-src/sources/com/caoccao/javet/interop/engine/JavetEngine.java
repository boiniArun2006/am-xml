package com.caoccao.javet.interop.engine;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Guard;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.utils.JavetDateTimeUtils;
import j$.time.ZonedDateTime;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class JavetEngine<R extends V8Runtime> implements IJavetEngine<R> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected volatile boolean active;
    protected IJavetEnginePool<R> iJavetEnginePool;
    protected int index;
    protected JavetEngineUsage usage;
    protected R v8Runtime;

    @Override // com.caoccao.javet.interfaces.IJavetClosable, java.lang.AutoCloseable
    public void close() throws JavetException {
        close(false);
    }

    @Override // com.caoccao.javet.interop.engine.IJavetEngine
    public V8Guard getGuard() {
        return getGuard(this.iJavetEnginePool.getConfig().getDefaultEngineGuardTimeoutMillis());
    }

    @Override // com.caoccao.javet.interop.engine.IJavetEngine
    public R getV8Runtime() throws JavetException {
        setActive(true);
        return this.v8Runtime;
    }

    protected void close(boolean z2) throws JavetException {
        setActive(false);
        if (!z2) {
            this.iJavetEnginePool.releaseEngine(this);
            return;
        }
        if (this.iJavetEnginePool.getConfig().isGCBeforeEngineClose()) {
            this.v8Runtime.lowMemoryNotification();
        }
        this.v8Runtime.close(true);
    }

    @Override // com.caoccao.javet.interop.engine.IJavetEngine
    public JavetEngineConfig getConfig() {
        return this.iJavetEnginePool.getConfig();
    }

    @Override // com.caoccao.javet.interop.engine.IJavetEngine
    public V8Guard getGuard(long j2) {
        return this.v8Runtime.getGuard(j2);
    }

    public int getIndex() {
        return this.index;
    }

    protected JavetEngineUsage getUsage() {
        return this.usage;
    }

    @Override // com.caoccao.javet.interop.engine.IJavetEngine
    public boolean isActive() {
        return this.active;
    }

    @Override // com.caoccao.javet.interfaces.IJavetClosable
    public boolean isClosed() {
        R r2 = this.v8Runtime;
        return r2 == null || r2.isClosed();
    }

    @Override // com.caoccao.javet.interop.engine.IJavetEngine
    public void resetContext() throws JavetException {
        this.v8Runtime.resetContext();
        this.usage.reset();
    }

    @Override // com.caoccao.javet.interop.engine.IJavetEngine
    public void resetIsolate() throws JavetException {
        this.v8Runtime.resetIsolate();
        this.usage.reset();
    }

    @Override // com.caoccao.javet.interop.engine.IJavetEngine
    public void sendGCNotification() {
        this.v8Runtime.lowMemoryNotification();
    }

    protected void setActive(boolean z2) {
        this.active = z2;
        touchLastActiveZonedDateTime();
    }

    void setIndex(int i2) {
        this.index = i2;
    }

    protected void touchLastActiveZonedDateTime() {
        this.usage.setLastActiveZonedDatetime(getUTCNow());
    }

    public JavetEngine(IJavetEnginePool<R> iJavetEnginePool, R r2) {
        Objects.requireNonNull(iJavetEnginePool);
        this.iJavetEnginePool = iJavetEnginePool;
        Objects.requireNonNull(r2);
        this.v8Runtime = r2;
        this.usage = new JavetEngineUsage();
        setActive(false);
    }

    protected ZonedDateTime getUTCNow() {
        return JavetDateTimeUtils.getUTCNow();
    }
}
