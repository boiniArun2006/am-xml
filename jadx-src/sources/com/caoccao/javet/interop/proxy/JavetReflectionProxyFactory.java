package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.V8ValueFunction;
import com.caoccao.javet.values.reference.V8ValueObject;
import com.caoccao.javet.values.reference.V8ValueProxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class JavetReflectionProxyFactory {
    private static final JavetReflectionProxyFactory instance = new JavetReflectionProxyFactory();

    public static JavetReflectionProxyFactory getInstance() {
        return instance;
    }

    private JavetReflectionProxyFactory() {
    }

    public boolean isSupportedFunction(Class<?> cls, V8Value v8Value) {
        if (cls.isInterface() && (v8Value instanceof V8ValueFunction)) {
            return true;
        }
        return false;
    }

    public boolean isSupportedObject(Class<?> cls, V8Value v8Value) {
        if (cls.isInterface() && (v8Value instanceof V8ValueObject) && !(v8Value instanceof V8ValueProxy) && !(v8Value instanceof V8ValueFunction)) {
            return true;
        }
        return false;
    }

    public Object toObject(Class<?> cls, V8Value v8Value) throws JavetException {
        InvocationHandler javetReflectionProxyV8ValueObjectInvocationHandler;
        if (cls.isInterface()) {
            if (v8Value instanceof V8ValueFunction) {
                javetReflectionProxyV8ValueObjectInvocationHandler = new JavetReflectionProxyV8ValueFunctionInvocationHandler((V8ValueFunction) v8Value.toClone());
            } else if ((v8Value instanceof V8ValueObject) && !(v8Value instanceof V8ValueProxy)) {
                javetReflectionProxyV8ValueObjectInvocationHandler = new JavetReflectionProxyV8ValueObjectInvocationHandler((V8ValueObject) v8Value.toClone());
            } else {
                javetReflectionProxyV8ValueObjectInvocationHandler = null;
            }
            if (javetReflectionProxyV8ValueObjectInvocationHandler != null) {
                return Proxy.newProxyInstance(JavetReflectionProxyFactory.class.getClassLoader(), new Class[]{cls, AutoCloseable.class}, javetReflectionProxyV8ValueObjectInvocationHandler);
            }
        }
        return null;
    }
}
