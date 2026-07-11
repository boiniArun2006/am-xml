package com.caoccao.javet.interop.engine;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetClosable;
import com.caoccao.javet.interop.V8Guard;
import com.caoccao.javet.interop.V8Runtime;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface IJavetEngine<R extends V8Runtime> extends IJavetClosable {
    JavetEngineConfig getConfig();

    V8Guard getGuard();

    V8Guard getGuard(long j2);

    R getV8Runtime() throws JavetException;

    boolean isActive();

    void resetContext() throws JavetException;

    void resetIsolate() throws JavetException;

    void sendGCNotification();
}
