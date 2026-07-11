package com.caoccao.javet.values.primitive;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.IV8ValuePrimitiveValue;
import com.caoccao.javet.values.reference.V8ValueDoubleObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class V8ValueDouble extends V8ValueNumber<Double> implements IV8ValuePrimitiveValue<V8ValueDoubleObject> {
    public static final String INFINITY = "Infinity";

    public V8ValueDouble(V8Runtime v8Runtime) throws JavetException {
        this(v8Runtime, 0.0d);
    }

    @Override // com.caoccao.javet.interop.IV8Cloneable
    public V8ValueDouble toClone(boolean z2) throws JavetException {
        return this;
    }

    @Override // com.caoccao.javet.values.primitive.V8ValuePrimitive
    public String toString() {
        return toString(10);
    }

    public V8ValueDouble(V8Runtime v8Runtime, double d2) throws JavetException {
        super(v8Runtime, Double.valueOf(d2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.IV8Value
    public boolean asBoolean() {
        return (((Double) this.value).doubleValue() == 0.0d || Double.isNaN(((Double) this.value).doubleValue()) || !Double.isFinite(((Double) this.value).doubleValue())) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.IV8Value
    public double asDouble() throws JavetException {
        return ((Double) this.value).doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.IV8Value
    public int asInt() {
        return ((Double) this.value).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.IV8Value
    public long asLong() throws JavetException {
        return ((Double) this.value).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean isFinite() {
        return Double.isFinite(((Double) this.value).doubleValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean isInfinite() {
        return Double.isInfinite(((Double) this.value).doubleValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean isNaN() {
        return Double.isNaN(((Double) this.value).doubleValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.IV8ValuePrimitiveValue
    public V8ValueDoubleObject toObject() throws JavetException {
        return checkV8Runtime().createV8ValueDoubleObject(((Double) this.value).doubleValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public double toPrimitive() {
        return ((Double) this.value).doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString(int i2) {
        try {
            return checkV8Runtime().getExecutor("(" + this.value + ").toString(" + i2 + ")").executeString();
        } catch (JavetException unused) {
            return ((Double) this.value).toString();
        }
    }
}
