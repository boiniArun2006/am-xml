package com.caoccao.javet.interop.callback;

import com.caoccao.javet.enums.JavetPromiseRejectEvent;
import com.caoccao.javet.interfaces.IJavetLogger;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.V8ValuePromise;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class JavetPromiseRejectCallback implements IJavetPromiseRejectCallback {
    protected IJavetLogger logger;

    @Override // com.caoccao.javet.interop.callback.IJavetPromiseRejectCallback
    public void callback(JavetPromiseRejectEvent javetPromiseRejectEvent, V8ValuePromise v8ValuePromise, V8Value v8Value) {
        this.logger.logWarn("Received promise reject callback with event {0} {1}.", Integer.valueOf(javetPromiseRejectEvent.getCode()), javetPromiseRejectEvent.getName());
    }

    public JavetPromiseRejectCallback(IJavetLogger iJavetLogger) {
        this.logger = iJavetLogger;
    }
}
