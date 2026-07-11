package com.caoccao.javet.values.primitive;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.IV8ValuePrimitiveValue;
import com.caoccao.javet.values.reference.V8ValueBooleanObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class V8ValueBoolean extends V8ValuePrimitive<Boolean> implements IV8ValuePrimitiveValue<V8ValueBooleanObject> {
    public static final String FALSE = "false";
    public static final String TRUE = "true";

    public V8ValueBoolean(V8Runtime v8Runtime) throws JavetException {
        this(v8Runtime, false);
    }

    @Override // com.caoccao.javet.interop.IV8Cloneable
    public V8ValueBoolean toClone(boolean z2) throws JavetException {
        return this;
    }

    public V8ValueBoolean(V8Runtime v8Runtime, boolean z2) throws JavetException {
        super(v8Runtime, Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.IV8Value
    public boolean asBoolean() {
        return ((Boolean) this.value).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.IV8Value
    public int asInt() {
        return ((Boolean) this.value).booleanValue() ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.IV8ValuePrimitiveValue
    public V8ValueBooleanObject toObject() throws JavetException {
        return checkV8Runtime().createV8ValueBooleanObject(((Boolean) this.value).booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean toPrimitive() {
        return ((Boolean) this.value).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.primitive.V8ValuePrimitive
    public String toString() {
        return ((Boolean) this.value).booleanValue() ? "true" : FALSE;
    }
}
