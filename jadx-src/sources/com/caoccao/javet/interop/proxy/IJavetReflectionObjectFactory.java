package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.V8ValueObject;
import com.caoccao.javet.values.reference.V8ValueProxy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface IJavetReflectionObjectFactory {
    Object toObject(Class<?> cls, V8Value v8Value);

    default boolean isSupported(Class<?> cls, V8Value v8Value) {
        if (cls.isInterface() || cls.isSynthetic() || cls.isPrimitive() || cls.isArray() || cls.isEnum() || cls.isAnnotation() || !(v8Value instanceof V8ValueObject) || (v8Value instanceof V8ValueProxy)) {
            return false;
        }
        return true;
    }
}
