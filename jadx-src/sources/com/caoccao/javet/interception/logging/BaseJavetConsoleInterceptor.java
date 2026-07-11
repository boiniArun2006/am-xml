package com.caoccao.javet.interception.logging;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interception.BaseJavetDirectCallableInterceptor;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import com.caoccao.javet.interop.callback.JavetCallbackType;
import com.caoccao.javet.utils.V8ValueUtils;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.IV8ValueObject;
import com.caoccao.javet.values.reference.V8ValueObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class BaseJavetConsoleInterceptor extends BaseJavetDirectCallableInterceptor {
    protected static final String JS_FUNCTION_DEBUG = "debug";
    protected static final String JS_FUNCTION_ERROR = "error";
    protected static final String JS_FUNCTION_INFO = "info";
    protected static final String JS_FUNCTION_LOG = "log";
    protected static final String JS_FUNCTION_TRACE = "trace";
    protected static final String JS_FUNCTION_WARN = "warn";
    protected static final String PROPERTY_CONSOLE = "console";
    protected static final String SPACE = " ";

    public abstract void consoleDebug(V8Value... v8ValueArr);

    public abstract void consoleError(V8Value... v8ValueArr);

    public abstract void consoleInfo(V8Value... v8ValueArr);

    public abstract void consoleLog(V8Value... v8ValueArr);

    public abstract void consoleTrace(V8Value... v8ValueArr);

    public abstract void consoleWarn(V8Value... v8ValueArr);

    @Override // com.caoccao.javet.interception.BaseJavetInterceptor, com.caoccao.javet.interfaces.IJavetInterceptor
    public boolean unregister(IV8ValueObject... iV8ValueObjectArr) throws JavetException {
        boolean zDelete = true;
        for (IV8ValueObject iV8ValueObject : iV8ValueObjectArr) {
            zDelete &= iV8ValueObject.delete(PROPERTY_CONSOLE);
        }
        return zDelete;
    }

    public String concat(V8Value... v8ValueArr) {
        return V8ValueUtils.concat(SPACE, v8ValueArr);
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable
    public JavetCallbackContext[] getCallbackContexts() {
        JavetCallbackType javetCallbackType = JavetCallbackType.DirectCallNoThisAndNoResult;
        return new JavetCallbackContext[]{new JavetCallbackContext(JS_FUNCTION_DEBUG, this, javetCallbackType, new j(this)), new JavetCallbackContext("error", this, javetCallbackType, new n(this)), new JavetCallbackContext(JS_FUNCTION_INFO, this, javetCallbackType, new w6(this)), new JavetCallbackContext("log", this, javetCallbackType, new Ml(this)), new JavetCallbackContext(JS_FUNCTION_TRACE, this, javetCallbackType, new I28(this)), new JavetCallbackContext(JS_FUNCTION_WARN, this, javetCallbackType, new Wre(this))};
    }

    @Override // com.caoccao.javet.interception.BaseJavetInterceptor, com.caoccao.javet.interfaces.IJavetInterceptor
    public boolean register(IV8ValueObject... iV8ValueObjectArr) throws JavetException {
        V8ValueObject v8ValueObjectCreateV8ValueObject = this.v8Runtime.createV8ValueObject();
        try {
            v8ValueObjectCreateV8ValueObject.bind(this);
            boolean z2 = true;
            for (IV8ValueObject iV8ValueObject : iV8ValueObjectArr) {
                z2 &= iV8ValueObject.set(PROPERTY_CONSOLE, v8ValueObjectCreateV8ValueObject);
            }
            v8ValueObjectCreateV8ValueObject.close();
            return z2;
        } catch (Throwable th) {
            if (v8ValueObjectCreateV8ValueObject != null) {
                try {
                    v8ValueObjectCreateV8ValueObject.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public BaseJavetConsoleInterceptor(V8Runtime v8Runtime) {
        super(v8Runtime);
    }
}
