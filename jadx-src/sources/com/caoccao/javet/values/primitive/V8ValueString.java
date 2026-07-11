package com.caoccao.javet.values.primitive;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.utils.StringUtils;
import com.caoccao.javet.values.IV8ValuePrimitiveValue;
import com.caoccao.javet.values.reference.V8ValueStringObject;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class V8ValueString extends V8ValuePrimitive<String> implements IV8ValuePrimitiveValue<V8ValueStringObject> {
    public V8ValueString(V8Runtime v8Runtime) throws JavetException {
        this(v8Runtime, null);
    }

    @Override // com.caoccao.javet.interop.IV8Cloneable
    public V8ValueString toClone(boolean z2) throws JavetException {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V8ValueString(V8Runtime v8Runtime, String str) throws JavetException {
        super(v8Runtime, str);
        Objects.requireNonNull(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.IV8Value
    public boolean asBoolean() {
        return StringUtils.isNotEmpty((String) this.value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.IV8Value
    public double asDouble() {
        try {
            return Double.parseDouble(((String) this.value).trim());
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.IV8Value
    public int asInt() {
        String strTrim = ((String) this.value).trim();
        if (!StringUtils.isDigital(strTrim)) {
            return 0;
        }
        try {
            return Integer.parseInt(strTrim);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.IV8Value
    public long asLong() {
        String strTrim = ((String) this.value).trim();
        if (!StringUtils.isDigital(strTrim)) {
            return 0L;
        }
        try {
            return Long.parseLong(strTrim);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.IV8ValuePrimitiveValue
    public V8ValueStringObject toObject() throws JavetException {
        return checkV8Runtime().createV8ValueStringObject((String) this.value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toPrimitive() {
        return (String) this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.primitive.V8ValuePrimitive
    public String toString() {
        return (String) this.value;
    }
}
