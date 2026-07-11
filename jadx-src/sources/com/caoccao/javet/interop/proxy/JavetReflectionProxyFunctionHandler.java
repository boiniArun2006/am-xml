package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.enums.V8ProxyMode;
import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import com.caoccao.javet.interop.callback.JavetCallbackType;
import com.caoccao.javet.utils.JavetResourceUtils;
import com.caoccao.javet.utils.SimpleMap;
import com.caoccao.javet.utils.V8ValueUtils;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.V8ValueArray;
import java.lang.Exception;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class JavetReflectionProxyFunctionHandler<T, E extends Exception> extends JavetReflectionProxyObjectHandler<T, E> {
    protected static final String METHOD_NAME_APPLY = "apply";

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.interop.proxy.IJavetProxyHandler
    public V8Value apply(V8Value v8Value, V8Value v8Value2, V8ValueArray v8ValueArray) throws Exception {
        Throwable th;
        if (this.classDescriptor.getApplyFunctions().isEmpty()) {
            return super.apply(v8Value, v8Value2, v8ValueArray);
        }
        try {
            try {
                V8Value[] array = v8ValueArray.toArray();
                try {
                    V8Runtime v8Runtime = this.v8Runtime;
                    V8Value v8Value3 = v8Runtime.toV8Value(BaseJavetReflectionProxyHandler.execute(v8Runtime.getConverter().getConfig().getReflectionObjectFactory(), this.targetObject, null, this.classDescriptor.getApplyFunctions(), V8ValueUtils.convertToVirtualObjects(array)));
                    if (array != null) {
                        JavetResourceUtils.safeClose(array);
                    }
                    return v8Value3;
                } catch (JavetException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    th = th2;
                    throw new JavetException(JavetError.CallbackMethodFailure, SimpleMap.of(JavetError.PARAMETER_METHOD_NAME, "apply", "message", th.getMessage()), th);
                }
            } catch (Throwable th3) {
                if (v8Value2 != 0) {
                    JavetResourceUtils.safeClose((V8Value[]) v8Value2);
                }
                throw th3;
            }
        } catch (JavetException e3) {
            throw e3;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // com.caoccao.javet.interop.proxy.JavetReflectionProxyObjectHandler, com.caoccao.javet.interop.callback.IJavetDirectCallable
    public JavetCallbackContext[] getCallbackContexts() {
        if (this.callbackContexts == null) {
            JavetCallbackType javetCallbackType = JavetCallbackType.DirectCallNoThisAndResult;
            this.callbackContexts = new JavetCallbackContext[]{new JavetCallbackContext("apply", this, javetCallbackType, new Lu(this)), new JavetCallbackContext("deleteProperty", this, javetCallbackType, new h(this)), new JavetCallbackContext("get", this, javetCallbackType, new K(this)), new JavetCallbackContext("getOwnPropertyDescriptor", this, javetCallbackType, new psW(this)), new JavetCallbackContext("getPrototypeOf", this, javetCallbackType, new Md(this)), new JavetCallbackContext("has", this, javetCallbackType, new Zs(this)), new JavetCallbackContext("ownKeys", this, javetCallbackType, new P(this)), new JavetCallbackContext("set", this, javetCallbackType, new C1828m(this))};
        }
        return this.callbackContexts;
    }

    @Override // com.caoccao.javet.interop.proxy.JavetReflectionProxyObjectHandler, com.caoccao.javet.interop.proxy.BaseJavetReflectionProxyHandler
    public V8ProxyMode getProxyMode() {
        return V8ProxyMode.Function;
    }

    public JavetReflectionProxyFunctionHandler(V8Runtime v8Runtime, T t3) {
        super(v8Runtime, t3);
    }

    public static /* synthetic */ V8Value HI(JavetReflectionProxyFunctionHandler javetReflectionProxyFunctionHandler, V8Value[] v8ValueArr) {
        javetReflectionProxyFunctionHandler.getClass();
        return javetReflectionProxyFunctionHandler.deleteProperty(v8ValueArr[0], v8ValueArr[1]);
    }

    public static /* synthetic */ V8Value Ik(JavetReflectionProxyFunctionHandler javetReflectionProxyFunctionHandler, V8Value[] v8ValueArr) {
        javetReflectionProxyFunctionHandler.getClass();
        return javetReflectionProxyFunctionHandler.getPrototypeOf(v8ValueArr[0]);
    }

    public static /* synthetic */ V8Value S(JavetReflectionProxyFunctionHandler javetReflectionProxyFunctionHandler, V8Value[] v8ValueArr) {
        javetReflectionProxyFunctionHandler.getClass();
        return javetReflectionProxyFunctionHandler.getOwnPropertyDescriptor(v8ValueArr[0], v8ValueArr[1]);
    }

    public static /* synthetic */ V8Value XQ(JavetReflectionProxyFunctionHandler javetReflectionProxyFunctionHandler, V8Value[] v8ValueArr) {
        javetReflectionProxyFunctionHandler.getClass();
        return javetReflectionProxyFunctionHandler.apply(v8ValueArr[0], v8ValueArr[1], (V8ValueArray) v8ValueArr[2]);
    }

    public static /* synthetic */ V8Value Z(JavetReflectionProxyFunctionHandler javetReflectionProxyFunctionHandler, V8Value[] v8ValueArr) {
        javetReflectionProxyFunctionHandler.getClass();
        return javetReflectionProxyFunctionHandler.get(v8ValueArr[0], v8ValueArr[1], v8ValueArr[2]);
    }

    public static /* synthetic */ V8Value ck(JavetReflectionProxyFunctionHandler javetReflectionProxyFunctionHandler, V8Value[] v8ValueArr) {
        javetReflectionProxyFunctionHandler.getClass();
        return javetReflectionProxyFunctionHandler.set(v8ValueArr[0], v8ValueArr[1], v8ValueArr[2], v8ValueArr[3]);
    }

    public static /* synthetic */ V8Value o(JavetReflectionProxyFunctionHandler javetReflectionProxyFunctionHandler, V8Value[] v8ValueArr) {
        javetReflectionProxyFunctionHandler.getClass();
        return javetReflectionProxyFunctionHandler.ownKeys(v8ValueArr[0]);
    }

    public static /* synthetic */ V8Value r(JavetReflectionProxyFunctionHandler javetReflectionProxyFunctionHandler, V8Value[] v8ValueArr) {
        javetReflectionProxyFunctionHandler.getClass();
        return javetReflectionProxyFunctionHandler.has(v8ValueArr[0], v8ValueArr[1]);
    }
}
