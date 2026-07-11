package com.caoccao.javet.interop.converters;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValuePrimitive;
import j$.time.ZonedDateTime;
import java.math.BigInteger;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class JavetPrimitiveConverter extends BaseJavetConverter {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.interop.converters.BaseJavetConverter
    protected <T> T toObject(V8Value v8Value, int i2) throws JavetException {
        validateDepth(i2);
        if (v8Value != 0 && !v8Value.isNull() && !v8Value.isUndefined()) {
            if (v8Value instanceof V8ValuePrimitive) {
                return (T) ((V8ValuePrimitive) v8Value).getValue();
            }
            return v8Value;
        }
        return null;
    }

    @Override // com.caoccao.javet.interop.converters.BaseJavetConverter
    protected <T extends V8Value> T toV8Value(V8Runtime v8Runtime, Object obj, int i2) throws JavetException {
        validateDepth(i2);
        if (obj == null) {
            return v8Runtime.createV8ValueNull();
        }
        if (obj.getClass().isPrimitive()) {
            Class<?> cls = obj.getClass();
            if (cls == Integer.TYPE) {
                return v8Runtime.createV8ValueInteger(((Integer) obj).intValue());
            }
            if (cls == Boolean.TYPE) {
                return v8Runtime.createV8ValueBoolean(((Boolean) obj).booleanValue());
            }
            if (cls == Double.TYPE) {
                return v8Runtime.createV8ValueDouble(((Double) obj).doubleValue());
            }
            if (cls == Float.TYPE) {
                return v8Runtime.createV8ValueDouble(((Double) obj).doubleValue());
            }
            if (cls == Long.TYPE) {
                return v8Runtime.createV8ValueLong(((Long) obj).longValue());
            }
            if (cls == Short.TYPE) {
                return v8Runtime.createV8ValueInteger(((Integer) obj).intValue());
            }
            if (cls == Byte.TYPE) {
                return v8Runtime.createV8ValueInteger(((Integer) obj).intValue());
            }
            if (cls == Character.TYPE) {
                return v8Runtime.createV8ValueString(Character.toString(((Character) obj).charValue()));
            }
            return v8Runtime.createV8ValueUndefined();
        }
        if (obj instanceof V8Value) {
            return (T) obj;
        }
        if (obj instanceof Integer) {
            return v8Runtime.createV8ValueInteger(((Integer) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return v8Runtime.createV8ValueBoolean(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return v8Runtime.createV8ValueString((String) obj);
        }
        if (obj instanceof Double) {
            return v8Runtime.createV8ValueDouble(((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return v8Runtime.createV8ValueDouble(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return v8Runtime.createV8ValueLong(((Long) obj).longValue());
        }
        if (obj instanceof Short) {
            return v8Runtime.createV8ValueInteger(((Short) obj).shortValue());
        }
        if (obj instanceof ZonedDateTime) {
            return v8Runtime.createV8ValueZonedDateTime((ZonedDateTime) obj);
        }
        if (obj instanceof Byte) {
            return v8Runtime.createV8ValueInteger(((Byte) obj).byteValue());
        }
        if (obj instanceof Character) {
            return v8Runtime.createV8ValueString(((Character) obj).toString());
        }
        if (obj instanceof BigInteger) {
            return v8Runtime.createV8ValueBigInteger((BigInteger) obj);
        }
        if (obj instanceof Optional) {
            Optional optional = (Optional) obj;
            if (optional.isPresent()) {
                return (T) toV8Value(v8Runtime, optional.get(), i2);
            }
            return v8Runtime.createV8ValueNull();
        }
        if (obj instanceof OptionalInt) {
            OptionalInt optionalInt = (OptionalInt) obj;
            if (optionalInt.isPresent()) {
                return (T) toV8Value(v8Runtime, Integer.valueOf(optionalInt.getAsInt()), i2);
            }
            return v8Runtime.createV8ValueNull();
        }
        if (obj instanceof OptionalDouble) {
            OptionalDouble optionalDouble = (OptionalDouble) obj;
            if (optionalDouble.isPresent()) {
                return (T) toV8Value(v8Runtime, Double.valueOf(optionalDouble.getAsDouble()), i2);
            }
            return v8Runtime.createV8ValueNull();
        }
        if (obj instanceof OptionalLong) {
            OptionalLong optionalLong = (OptionalLong) obj;
            if (optionalLong.isPresent()) {
                return (T) toV8Value(v8Runtime, Long.valueOf(optionalLong.getAsLong()), i2);
            }
            return v8Runtime.createV8ValueNull();
        }
        return v8Runtime.createV8ValueUndefined();
    }
}
