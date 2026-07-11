package com.caoccao.javet.values.reference.builtin;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.caoccao.javet.values.reference.V8ValueArray;
import com.caoccao.javet.values.reference.V8ValueObject;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class V8ValueBuiltInReflect extends V8ValueObject {
    public static final String FUNCTION_APPLY = "apply";
    public static final String FUNCTION_CONSTRUCT = "construct";
    public static final String FUNCTION_DEFINE_PROPERTY = "defineProperty";
    public static final String FUNCTION_DELETE_PROPERTY = "deleteProperty";
    public static final String FUNCTION_GET = "get";
    public static final String FUNCTION_GET_OWN_PROPERTY_DESCRIPTOR = "getOwnPropertyDescriptor";
    public static final String FUNCTION_GET_PROTOTYPE_OF = "getPrototypeOf";
    public static final String FUNCTION_HAS = "has";
    public static final String FUNCTION_IS_EXTENSIBLE = "isExtensible";
    public static final String FUNCTION_OWN_KEYS = "ownKeys";
    public static final String FUNCTION_PREVENT_EXTENSIONS = "preventExtensions";
    public static final String FUNCTION_SET = "set";
    public static final String FUNCTION_SET_PROTOTYPE_OF = "setPrototypeOf";
    public static final String NAME = "Reflect";

    @Override // com.caoccao.javet.interop.IV8Cloneable
    public V8ValueBuiltInReflect toClone() throws JavetException {
        return this;
    }

    public V8ValueBuiltInReflect(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
    }

    public V8Value _get(V8Value v8Value, V8Value v8Value2) throws JavetException {
        Objects.requireNonNull(v8Value);
        Objects.requireNonNull(v8Value2);
        return invoke("get", v8Value, v8Value2);
    }

    public V8ValueBoolean _has(V8Value v8Value, V8Value v8Value2) throws JavetException {
        Objects.requireNonNull(v8Value);
        Objects.requireNonNull(v8Value2);
        return (V8ValueBoolean) invoke("has", v8Value, v8Value2);
    }

    public V8ValueBoolean _set(V8Value v8Value, V8Value v8Value2, V8Value v8Value3, V8Value v8Value4) throws JavetException {
        Objects.requireNonNull(v8Value);
        Objects.requireNonNull(v8Value2);
        Objects.requireNonNull(v8Value3);
        Objects.requireNonNull(v8Value4);
        return (V8ValueBoolean) invoke("set", v8Value, v8Value2, v8Value3, v8Value4);
    }

    public V8Value apply(V8Value v8Value, V8Value v8Value2, V8ValueArray v8ValueArray) throws JavetException {
        Objects.requireNonNull(v8Value);
        Objects.requireNonNull(v8Value2);
        Objects.requireNonNull(v8ValueArray);
        return invoke("apply", v8Value, v8Value2, v8ValueArray);
    }

    public V8Value construct(V8Value v8Value, V8ValueArray v8ValueArray, V8Value v8Value2) throws JavetException {
        Objects.requireNonNull(v8Value);
        Objects.requireNonNull(v8ValueArray);
        Objects.requireNonNull(v8Value2);
        return invoke("construct", v8Value, v8ValueArray, v8Value2);
    }

    public V8ValueBoolean defineProperty(V8Value v8Value, V8Value v8Value2, V8ValueObject v8ValueObject) throws JavetException {
        Objects.requireNonNull(v8Value);
        Objects.requireNonNull(v8Value2);
        Objects.requireNonNull(v8ValueObject);
        return (V8ValueBoolean) invoke(FUNCTION_DEFINE_PROPERTY, v8Value, v8Value2, v8ValueObject);
    }

    public V8ValueBoolean deleteProperty(V8Value v8Value, V8Value v8Value2) throws JavetException {
        Objects.requireNonNull(v8Value);
        Objects.requireNonNull(v8Value2);
        return (V8ValueBoolean) invoke("deleteProperty", v8Value, v8Value2);
    }

    public V8Value getOwnPropertyDescriptor(V8Value v8Value, V8Value v8Value2) throws JavetException {
        Objects.requireNonNull(v8Value);
        Objects.requireNonNull(v8Value2);
        return invoke("getOwnPropertyDescriptor", v8Value, v8Value2);
    }

    public V8Value getPrototypeOf(V8Value v8Value) throws JavetException {
        Objects.requireNonNull(v8Value);
        return invoke("getPrototypeOf", v8Value);
    }

    public V8ValueBoolean isExtensible(V8Value v8Value) throws JavetException {
        Objects.requireNonNull(v8Value);
        return (V8ValueBoolean) invoke(FUNCTION_IS_EXTENSIBLE, v8Value);
    }

    public V8ValueArray ownKeys(V8Value v8Value) throws JavetException {
        Objects.requireNonNull(v8Value);
        return (V8ValueArray) invoke("ownKeys", v8Value);
    }

    public V8ValueBoolean preventExtensions(V8Value v8Value) throws JavetException {
        Objects.requireNonNull(v8Value);
        return (V8ValueBoolean) invoke(FUNCTION_PREVENT_EXTENSIONS, v8Value);
    }

    public V8ValueBoolean setPrototypeOf(V8Value v8Value, V8Value v8Value2) throws JavetException {
        Objects.requireNonNull(v8Value);
        Objects.requireNonNull(v8Value2);
        return (V8ValueBoolean) invoke("setPrototypeOf", v8Value, v8Value2);
    }
}
