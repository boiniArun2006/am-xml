package com.caoccao.javet.interop.callback;

import com.caoccao.javet.enums.V8GCCallbackFlags;
import com.caoccao.javet.enums.V8GCType;
import com.caoccao.javet.interfaces.IEnumBitset;
import com.caoccao.javet.interfaces.IJavetLogger;
import java.util.EnumSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class JavetGCCallback implements IJavetGCCallback {
    protected IJavetLogger logger;

    @Override // com.caoccao.javet.interop.callback.IJavetGCCallback
    public void callback(EnumSet<V8GCType> enumSet, EnumSet<V8GCCallbackFlags> enumSet2) {
        this.logger.logWarn("Received GC callback with GC type {0} and GC callback flags {1}.", Integer.toString(IEnumBitset.getValue(enumSet)), Integer.toString(IEnumBitset.getValue(enumSet2)));
    }

    public JavetGCCallback(IJavetLogger iJavetLogger) {
        this.logger = iJavetLogger;
    }
}
