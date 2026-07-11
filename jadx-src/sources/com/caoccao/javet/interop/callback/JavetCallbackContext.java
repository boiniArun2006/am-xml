package com.caoccao.javet.interop.callback;

import com.caoccao.javet.enums.V8ValueSymbolType;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class JavetCallbackContext {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ERROR_CALLBACK_RECEIVER_OR_CALLBACK_METHOD_IS_INVALID = "Callback receiver or callback method is invalid";
    private static final String ERROR_CALLBACK_TYPE_MISMATCHES = "Callback type mismatches.";
    private static final String ERROR_JAVET_CALLBACK_CONTEXT_HANDLE_IS_INVALID = "Javet callback context handle is invalid";
    public static final long INVALID_HANDLE = 0;
    private final Object callbackMethod;
    private final Object callbackReceiver;
    private final JavetCallbackType callbackType;
    private long handle;
    private final String name;
    private boolean returnResult;
    private final V8ValueSymbolType symbolType;
    private final boolean thisObjectRequired;

    public JavetCallbackContext(String str, JavetCallbackType javetCallbackType, IJavetDirectCallable.DirectCall directCall) {
        this(str, V8ValueSymbolType.None, javetCallbackType, directCall);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JavetCallbackContext(String str, Object obj, JavetCallbackType javetCallbackType, IJavetDirectCallable.DirectCall directCall) {
        this(str, V8ValueSymbolType.None, obj, javetCallbackType, directCall);
        Objects.requireNonNull(str);
    }

    public <T> T getCallbackMethod() {
        return (T) this.callbackMethod;
    }

    public Object getCallbackReceiver() {
        return this.callbackReceiver;
    }

    public JavetCallbackType getCallbackType() {
        return this.callbackType;
    }

    public long getHandle() {
        return this.handle;
    }

    public String getName() {
        return this.name;
    }

    public V8ValueSymbolType getSymbolType() {
        return this.symbolType;
    }

    public boolean isReturnResult() {
        return this.returnResult;
    }

    public boolean isThisObjectRequired() {
        return this.thisObjectRequired;
    }

    public boolean isValid() {
        return this.handle != 0;
    }

    void setHandle(long j2) {
        this.handle = j2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JavetCallbackContext(String str, V8ValueSymbolType v8ValueSymbolType, JavetCallbackType javetCallbackType, IJavetDirectCallable.DirectCall directCall) {
        this(str, v8ValueSymbolType, (Object) null, javetCallbackType, directCall);
        Objects.requireNonNull(str);
    }

    public JavetCallbackContext(String str, Object obj, Method method) {
        this(str, V8ValueSymbolType.None, obj, method);
    }

    public JavetCallbackContext(String str, V8ValueSymbolType v8ValueSymbolType, Object obj, Method method) {
        this(str, v8ValueSymbolType, obj, method, false);
    }

    public JavetCallbackContext(String str, Object obj, Method method, boolean z2) {
        this(str, V8ValueSymbolType.None, obj, method, z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JavetCallbackContext(String str, V8ValueSymbolType v8ValueSymbolType, Object obj, JavetCallbackType javetCallbackType, IJavetDirectCallable.DirectCall directCall) {
        this(str, v8ValueSymbolType, obj, javetCallbackType, directCall, javetCallbackType.getThisObjectRequired().booleanValue());
        Objects.requireNonNull(javetCallbackType);
        this.returnResult = javetCallbackType.getReturnResult().booleanValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JavetCallbackContext(String str, V8ValueSymbolType v8ValueSymbolType, Object obj, Method method, boolean z2) {
        this(str, v8ValueSymbolType, obj, JavetCallbackType.Reflection, method, z2);
        Objects.requireNonNull(str);
        this.returnResult = !method.getReturnType().equals(Void.TYPE);
    }

    private JavetCallbackContext(String str, V8ValueSymbolType v8ValueSymbolType, Object obj, JavetCallbackType javetCallbackType, Object obj2, boolean z2) {
        Objects.requireNonNull(obj2);
        this.callbackMethod = obj2;
        this.callbackReceiver = obj;
        Objects.requireNonNull(javetCallbackType);
        this.callbackType = javetCallbackType;
        this.handle = 0L;
        this.name = str;
        this.thisObjectRequired = z2;
        Objects.requireNonNull(v8ValueSymbolType);
        this.symbolType = v8ValueSymbolType;
    }
}
