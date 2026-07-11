package com.caoccao.javet.values.virtual;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetClosable;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.converters.IJavetConverter;
import com.caoccao.javet.utils.ArrayUtils;
import com.caoccao.javet.utils.JavetResourceUtils;
import com.caoccao.javet.values.V8Value;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class V8VirtualValueList implements IJavetClosable {
    protected List<V8Value> toBeClosedValues;
    protected List<V8Value> values;

    @Override // com.caoccao.javet.interfaces.IJavetClosable, java.lang.AutoCloseable
    public void close() throws JavetException {
        JavetResourceUtils.safeClose(this.toBeClosedValues);
        this.toBeClosedValues = null;
        this.values = null;
    }

    public V8Value[] get() {
        List<V8Value> list = this.values;
        return list == null ? new V8Value[0] : (V8Value[]) list.toArray(new V8Value[0]);
    }

    @Override // com.caoccao.javet.interfaces.IJavetClosable
    public boolean isClosed() {
        return this.values == null;
    }

    public V8VirtualValueList(V8Runtime v8Runtime, IJavetConverter iJavetConverter, Object... objArr) throws JavetException {
        V8Value v8Value;
        Objects.requireNonNull(v8Runtime);
        if (ArrayUtils.isEmpty(objArr)) {
            this.toBeClosedValues = null;
            this.values = null;
            return;
        }
        this.toBeClosedValues = new ArrayList(objArr.length);
        this.values = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            if (obj instanceof V8Value) {
                this.values.add((V8Value) obj);
            } else {
                if (iJavetConverter == null) {
                    v8Value = v8Runtime.toV8Value(obj);
                } else {
                    v8Value = iJavetConverter.toV8Value(v8Runtime, obj);
                }
                this.values.add(v8Value);
                this.toBeClosedValues.add(v8Value);
            }
        }
    }
}
