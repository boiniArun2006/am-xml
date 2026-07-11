package com.caoccao.javet.interop.callback;

import com.caoccao.javet.enums.JavetPromiseRejectEvent;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.V8ValuePromise;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface IJavetPromiseRejectCallback {
    void callback(JavetPromiseRejectEvent javetPromiseRejectEvent, V8ValuePromise v8ValuePromise, V8Value v8Value);
}
