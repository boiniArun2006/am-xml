package com.caoccao.javet.values.reference.builtin;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.IV8ValueArray;
import com.caoccao.javet.values.reference.IV8ValueObject;
import com.caoccao.javet.values.reference.V8ValueObject;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class V8ValueBuiltInObject extends V8ValueObject {
    public static final String FUNCTION_ASSIGN = "assign";
    public static final String FUNCTION_CREATE = "create";
    public static final String FUNCTION_FREEZE = "freeze";
    public static final String FUNCTION_GET_OWN_PROPERTY_SYMBOLS = "getOwnPropertySymbols";
    public static final String FUNCTION_GET_PROTOTYPE_OF = "getPrototypeOf";
    public static final String FUNCTION_SEAL = "seal";
    public static final String FUNCTION_SET_PROTOTYPE_OF = "setPrototypeOf";
    public static final String NAME = "Object";

    public V8ValueObject create(IV8ValueObject iV8ValueObject) throws JavetException {
        Objects.requireNonNull(iV8ValueObject);
        return (V8ValueObject) invoke(FUNCTION_CREATE, iV8ValueObject);
    }

    @Override // com.caoccao.javet.interop.IV8Cloneable
    public V8ValueBuiltInObject toClone() throws JavetException {
        return this;
    }

    public <T extends IV8ValueObject> T create(IV8ValueObject iV8ValueObject, IV8ValueObject iV8ValueObject2) throws JavetException {
        Objects.requireNonNull(iV8ValueObject);
        Objects.requireNonNull(iV8ValueObject2);
        return (T) invoke(FUNCTION_CREATE, iV8ValueObject, iV8ValueObject2);
    }

    public IV8ValueArray getOwnPropertySymbols(IV8ValueObject iV8ValueObject) throws JavetException {
        return (IV8ValueArray) invoke(FUNCTION_GET_OWN_PROPERTY_SYMBOLS, iV8ValueObject);
    }

    public V8ValueBuiltInObject(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
    }

    public V8ValueObject assign(IV8ValueObject iV8ValueObject, IV8ValueObject iV8ValueObject2) throws JavetException {
        Objects.requireNonNull(iV8ValueObject);
        Objects.requireNonNull(iV8ValueObject2);
        return (V8ValueObject) invoke(FUNCTION_ASSIGN, iV8ValueObject, iV8ValueObject2);
    }

    public <T extends IV8ValueObject> T freeze(T t3) throws JavetException {
        Objects.requireNonNull(t3);
        return (T) invoke(FUNCTION_FREEZE, t3);
    }

    public V8Value getPrototypeOf(V8Value v8Value) throws JavetException {
        Objects.requireNonNull(v8Value);
        return invoke("getPrototypeOf", v8Value);
    }

    public <T extends IV8ValueObject> T seal(T t3) throws JavetException {
        Objects.requireNonNull(t3);
        return (T) invoke(FUNCTION_SEAL, t3);
    }

    public V8Value setPrototypeOf(V8Value v8Value, V8Value v8Value2) throws JavetException {
        Objects.requireNonNull(v8Value);
        Objects.requireNonNull(v8Value2);
        return invoke("setPrototypeOf", v8Value, v8Value2);
    }
}
