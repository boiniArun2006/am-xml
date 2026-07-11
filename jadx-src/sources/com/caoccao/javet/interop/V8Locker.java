package com.caoccao.javet.interop;

import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetClosable;
import com.caoccao.javet.utils.SimpleMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class V8Locker implements IJavetClosable {
    private volatile boolean locked;
    private final long threadId;
    private final IV8Native v8Native;
    private final V8Runtime v8Runtime;

    @Override // com.caoccao.javet.interfaces.IJavetClosable
    public boolean isClosed() {
        return !this.locked;
    }

    public boolean isLocked() {
        return this.locked;
    }

    V8Locker(V8Runtime v8Runtime, IV8Native iV8Native) throws JavetException {
        Objects.requireNonNull(v8Runtime);
        this.threadId = Thread.currentThread().getId();
        this.v8Native = iV8Native;
        this.v8Runtime = v8Runtime;
        if (iV8Native.lockV8Runtime(v8Runtime.getHandle())) {
            this.locked = true;
            return;
        }
        throw new JavetException(JavetError.LockAcquisitionFailure);
    }

    @Override // com.caoccao.javet.interfaces.IJavetClosable, java.lang.AutoCloseable
    public void close() throws JavetException {
        long id = Thread.currentThread().getId();
        if (this.threadId == id) {
            if (this.v8Native.unlockV8Runtime(this.v8Runtime.getHandle())) {
                this.locked = false;
                return;
            }
            throw new JavetException(JavetError.LockReleaseFailure);
        }
        throw new JavetException(JavetError.LockConflictThreadIdMismatch, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_LOCKED_THREAD_ID, Long.toString(this.threadId), JavetError.PARAMETER_CURRENT_THREAD_ID, Long.toString(id)));
    }
}
