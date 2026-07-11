package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import com.caoccao.javet.interop.callback.JavetCallbackType;
import com.caoccao.javet.utils.SimpleMap;
import com.caoccao.javet.utils.V8ValueUtils;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.V8ValueObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class JavetReflectionProxyInterceptor {
    private static final String METHOD_NAME_INVOKE = "invoke";
    private final String jsMethodName;
    private final List<Method> methods;
    private final IJavetReflectionObjectFactory reflectionObjectFactory;
    private final Object targetObject;

    public JavetCallbackContext getCallbackContext() {
        return new JavetCallbackContext(METHOD_NAME_INVOKE, JavetCallbackType.DirectCallThisAndResult, new iF(this));
    }

    public String getJSMethodName() {
        return this.jsMethodName;
    }

    public List<Method> getMethods() {
        return this.methods;
    }

    public Object getTargetObject() {
        return this.targetObject;
    }

    public Object invokeObject(V8ValueObject v8ValueObject, V8Value... v8ValueArr) throws JavetException {
        try {
            return BaseJavetReflectionProxyHandler.execute(this.reflectionObjectFactory, this.targetObject, v8ValueObject, this.methods, V8ValueUtils.convertToVirtualObjects(v8ValueArr));
        } catch (JavetException e2) {
            throw e2;
        } catch (InvocationTargetException e3) {
            throw new JavetException(JavetError.CallbackMethodFailure, SimpleMap.of(JavetError.PARAMETER_METHOD_NAME, this.jsMethodName, "message", e3.getTargetException().getMessage()), e3.getTargetException());
        } catch (Throwable th) {
            throw new JavetException(JavetError.CallbackMethodFailure, SimpleMap.of(JavetError.PARAMETER_METHOD_NAME, this.jsMethodName, "message", th.getMessage()), th);
        }
    }

    public JavetReflectionProxyInterceptor(IJavetReflectionObjectFactory iJavetReflectionObjectFactory, Object obj, String str, List<Method> list) {
        this.reflectionObjectFactory = iJavetReflectionObjectFactory;
        this.jsMethodName = str;
        this.methods = list;
        this.targetObject = obj;
    }

    public V8Value invokeV8Value(V8Value v8Value, V8Value... v8ValueArr) throws JavetException {
        return v8Value.getV8Runtime().toV8Value(invokeObject((V8ValueObject) v8Value, v8ValueArr));
    }
}
