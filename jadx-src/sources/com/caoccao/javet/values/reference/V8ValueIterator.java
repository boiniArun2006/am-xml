package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class V8ValueIterator<T extends V8Value> extends V8ValueObject implements IV8ValueIterator<T> {
    protected static final String FUNCTION_NEXT = "next";
    protected static final String PROPERTY_DONE = "done";
    protected static final String PROPERTY_VALUE = "value";

    @Override // com.caoccao.javet.values.reference.IV8ValueIterator
    public T getNext() {
        try {
            V8ValueObject v8ValueObject = (V8ValueObject) invoke(FUNCTION_NEXT, new V8Value[0]);
            try {
                if (v8ValueObject.getBoolean(PROPERTY_DONE).booleanValue()) {
                    v8ValueObject.close();
                    return null;
                }
                T t3 = (T) v8ValueObject.get("value");
                v8ValueObject.close();
                return t3;
            } finally {
            }
        } catch (JavetException unused) {
            return null;
        }
        return null;
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public V8ValueReferenceType getType() {
        return V8ValueReferenceType.Iterator;
    }

    V8ValueIterator(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
    }
}
