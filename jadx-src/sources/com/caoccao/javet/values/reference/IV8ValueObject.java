package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.V8ValueInternalType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetBiConsumer;
import com.caoccao.javet.interfaces.IJavetBiIndexedConsumer;
import com.caoccao.javet.interfaces.IJavetUniConsumer;
import com.caoccao.javet.interfaces.IJavetUniIndexedConsumer;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueBigInteger;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.caoccao.javet.values.primitive.V8ValuePrimitive;
import com.caoccao.javet.values.primitive.V8ValueString;
import com.caoccao.javet.values.primitive.V8ValueUndefined;
import com.caoccao.javet.values.primitive.V8ValueZonedDateTime;
import j$.time.ZonedDateTime;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface IV8ValueObject extends IV8ValueReference {
    public static final int DEFAULT_BATCH_SIZE = 100;
    public static final int MIN_BATCH_SIZE = 1;

    int batchGet(V8Value[] v8ValueArr, V8Value[] v8ValueArr2, int i2) throws JavetException;

    List<JavetCallbackContext> bind(Object obj) throws JavetException;

    boolean bindFunction(JavetCallbackContext javetCallbackContext) throws JavetException;

    default boolean bindFunction(String str, String str2) throws JavetException {
        Objects.requireNonNull(str);
        Objects.requireNonNull(str2);
        V8ValueFunction v8ValueFunctionCreateV8ValueFunction = getV8Runtime().createV8ValueFunction(str2);
        try {
            boolean z2 = set(str, v8ValueFunctionCreateV8ValueFunction);
            if (v8ValueFunctionCreateV8ValueFunction != null) {
                v8ValueFunctionCreateV8ValueFunction.close();
            }
            return z2;
        } catch (Throwable th) {
            if (v8ValueFunctionCreateV8ValueFunction != null) {
                try {
                    v8ValueFunctionCreateV8ValueFunction.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    default boolean bindProperty(JavetCallbackContext javetCallbackContext) throws JavetException {
        return bindProperty(javetCallbackContext, null);
    }

    boolean bindProperty(JavetCallbackContext javetCallbackContext, JavetCallbackContext javetCallbackContext2) throws JavetException;

    boolean delete(Object obj) throws JavetException;

    boolean deletePrivateProperty(String str) throws JavetException;

    <Key extends V8Value, Value extends V8Value, E extends Throwable> int forEach(IJavetBiConsumer<Key, Value, E> iJavetBiConsumer, int i2) throws Throwable;

    <Key extends V8Value, Value extends V8Value, E extends Throwable> int forEach(IJavetBiIndexedConsumer<Key, Value, E> iJavetBiIndexedConsumer, int i2) throws Throwable;

    default <Key extends V8Value, E extends Throwable> int forEach(IJavetUniConsumer<Key, E> iJavetUniConsumer) throws Throwable {
        return forEach(iJavetUniConsumer, 100);
    }

    <T extends V8Value> T get(Object obj) throws JavetException;

    Boolean getBoolean(Object obj) throws JavetException;

    Double getDouble(Object obj) throws JavetException;

    int getIdentityHash() throws JavetException;

    Integer getInteger(Object obj) throws JavetException;

    Long getLong(Object obj) throws JavetException;

    IV8ValueArray getOwnPropertyNames() throws JavetException;

    <T extends V8Value> T getPrivateProperty(String str) throws JavetException;

    <T extends V8Value> T getProperty(Object obj) throws JavetException;

    IV8ValueArray getPropertyNames() throws JavetException;

    <T extends IV8ValueObject> T getPrototype() throws JavetException;

    String getString(Object obj) throws JavetException;

    boolean has(Object obj) throws JavetException;

    boolean hasInternalType(V8ValueInternalType v8ValueInternalType) throws JavetException;

    boolean hasOwnProperty(Object obj) throws JavetException;

    boolean hasPrivateProperty(String str) throws JavetException;

    default <T extends V8Value> T invoke(String str, Object... objArr) throws JavetException {
        return (T) invokeExtended(str, true, objArr);
    }

    default BigInteger invokeBigInteger(String str, Object... objArr) throws JavetException {
        try {
            V8Value v8ValueInvokeExtended = invokeExtended(str, true, objArr);
            try {
                if (!(v8ValueInvokeExtended instanceof V8ValueBigInteger)) {
                    if (v8ValueInvokeExtended == null) {
                        return null;
                    }
                    v8ValueInvokeExtended.close();
                    return null;
                }
                BigInteger value = ((V8ValueBigInteger) v8ValueInvokeExtended).getValue();
                if (v8ValueInvokeExtended == null) {
                    return value;
                }
                v8ValueInvokeExtended.close();
                return value;
            } finally {
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
        throw e2;
    }

    default Boolean invokeBoolean(String str, Object... objArr) throws JavetException {
        try {
            V8Value v8ValueInvokeExtended = invokeExtended(str, true, objArr);
            try {
                Boolean boolValueOf = Boolean.valueOf(v8ValueInvokeExtended.asBoolean());
                v8ValueInvokeExtended.close();
                return boolValueOf;
            } finally {
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default Double invokeDouble(String str, Object... objArr) throws JavetException {
        try {
            V8Value v8ValueInvokeExtended = invokeExtended(str, true, objArr);
            try {
                Double dValueOf = Double.valueOf(v8ValueInvokeExtended.asDouble());
                v8ValueInvokeExtended.close();
                return dValueOf;
            } finally {
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    <T extends V8Value> T invokeExtended(String str, boolean z2, V8Value... v8ValueArr) throws JavetException;

    <T extends V8Value> T invokeExtended(String str, boolean z2, Object... objArr) throws JavetException;

    default Integer invokeInteger(String str, Object... objArr) throws JavetException {
        try {
            V8Value v8ValueInvokeExtended = invokeExtended(str, true, objArr);
            try {
                Integer numValueOf = Integer.valueOf(v8ValueInvokeExtended.asInt());
                v8ValueInvokeExtended.close();
                return numValueOf;
            } finally {
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default Long invokeLong(String str, Object... objArr) throws JavetException {
        try {
            V8Value v8ValueInvokeExtended = invokeExtended(str, true, objArr);
            try {
                Long lValueOf = Long.valueOf(v8ValueInvokeExtended.asLong());
                v8ValueInvokeExtended.close();
                return lValueOf;
            } finally {
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default String invokeString(String str, Object... objArr) throws JavetException {
        try {
            V8Value v8ValueInvokeExtended = invokeExtended(str, true, objArr);
            try {
                if (v8ValueInvokeExtended.isNullOrUndefined()) {
                    v8ValueInvokeExtended.close();
                    return null;
                }
                String strAsString = v8ValueInvokeExtended.asString();
                v8ValueInvokeExtended.close();
                return strAsString;
            } finally {
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
        throw e2;
    }

    default void invokeVoid(String str, Object... objArr) throws JavetException {
        invokeExtended(str, false, objArr);
    }

    default ZonedDateTime invokeZonedDateTime(String str, Object... objArr) throws JavetException {
        try {
            V8Value v8ValueInvokeExtended = invokeExtended(str, true, objArr);
            try {
                if (!(v8ValueInvokeExtended instanceof V8ValueZonedDateTime)) {
                    if (v8ValueInvokeExtended == null) {
                        return null;
                    }
                    v8ValueInvokeExtended.close();
                    return null;
                }
                ZonedDateTime value = ((V8ValueZonedDateTime) v8ValueInvokeExtended).getValue();
                if (v8ValueInvokeExtended == null) {
                    return value;
                }
                v8ValueInvokeExtended.close();
                return value;
            } finally {
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
        throw e2;
    }

    boolean isFrozen() throws JavetException;

    boolean isSealed() throws JavetException;

    boolean set(Object obj, Object obj2) throws JavetException;

    boolean set(Object... objArr) throws JavetException;

    boolean setBoolean(Object obj, Boolean bool) throws JavetException;

    boolean setDouble(Object obj, Double d2) throws JavetException;

    boolean setInteger(Object obj, Integer num) throws JavetException;

    boolean setLong(Object obj, Long l2) throws JavetException;

    boolean setNull(Object obj) throws JavetException;

    boolean setPrivateProperty(String str, Object obj) throws JavetException;

    boolean setProperty(Object obj, Object obj2) throws JavetException;

    boolean setPrototype(V8Value v8Value) throws JavetException;

    boolean setString(Object obj, String str) throws JavetException;

    boolean setUndefined(Object obj) throws JavetException;

    String toJsonString();

    String toProtoString();

    int unbind(Object obj) throws JavetException;

    default boolean unbindFunction(String str) throws JavetException {
        return delete(str);
    }

    boolean unbindProperty(JavetCallbackContext javetCallbackContext) throws JavetException;

    boolean unbindProperty(V8ValueString v8ValueString) throws JavetException;

    boolean unbindProperty(V8ValueSymbol v8ValueSymbol) throws JavetException;

    default boolean unbindProperty(String str) throws JavetException {
        V8Runtime v8Runtime = getV8Runtime();
        Objects.requireNonNull(str);
        return unbindProperty(v8Runtime.createV8ValueString(str));
    }

    static /* synthetic */ void xg(List list, V8Value v8Value) {
        if (v8Value instanceof V8ValueString) {
            list.add(((V8ValueString) v8Value).getValue());
        }
    }

    default <Key extends V8Value, E extends Throwable> int forEach(IJavetUniConsumer<Key, E> iJavetUniConsumer, int i2) throws Throwable {
        Objects.requireNonNull(iJavetUniConsumer);
        IV8ValueArray ownPropertyNames = getOwnPropertyNames();
        try {
            int iForEach = ownPropertyNames.forEach(iJavetUniConsumer, i2);
            ownPropertyNames.close();
            return iForEach;
        } catch (Throwable th) {
            if (ownPropertyNames != null) {
                try {
                    ownPropertyNames.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    default List<String> getOwnPropertyNameStrings() throws Throwable {
        final ArrayList arrayList = new ArrayList();
        forEach(new IJavetUniConsumer() { // from class: com.caoccao.javet.values.reference.I28
            @Override // com.caoccao.javet.interfaces.IJavetUniConsumer
            public final void accept(V8Value v8Value) {
                IV8ValueObject.xg(arrayList, v8Value);
            }
        });
        return arrayList;
    }

    default <T extends V8Value> T invoke(String str, V8Value... v8ValueArr) throws JavetException {
        return (T) invokeExtended(str, true, v8ValueArr);
    }

    default void invokeVoid(String str, V8Value... v8ValueArr) throws JavetException {
        invokeExtended(str, false, v8ValueArr);
    }

    default boolean isGeneratorObject() throws JavetException {
        return hasInternalType(V8ValueInternalType.GeneratorObject);
    }

    default boolean unbindFunction(V8ValueString v8ValueString) throws JavetException {
        return delete(v8ValueString);
    }

    default boolean deleteNull() throws JavetException {
        return delete(getV8Runtime().createV8ValueNull());
    }

    default boolean deleteUndefined() throws JavetException {
        return delete(getV8Runtime().createV8ValueUndefined());
    }

    default BigInteger getBigInteger(Object obj) throws JavetException {
        try {
            V8Value v8Value = get(obj);
            try {
                if (v8Value instanceof V8ValueBigInteger) {
                    BigInteger value = ((V8ValueBigInteger) v8Value).getValue();
                    if (v8Value != null) {
                        v8Value.close();
                        return value;
                    }
                    return value;
                }
                if (v8Value != null) {
                    v8Value.close();
                    return null;
                }
                return null;
            } catch (Throwable th) {
                if (v8Value != null) {
                    try {
                        v8Value.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default Float getFloat(Object obj) throws JavetException {
        Double d2 = getDouble(obj);
        if (d2 == null) {
            return null;
        }
        return Float.valueOf(d2.floatValue());
    }

    default V8ValueNull getNull(Object obj) throws JavetException {
        return (V8ValueNull) get(obj);
    }

    default <T> T getObject(Object obj) throws JavetException {
        try {
            return (T) getV8Runtime().toObject(get(obj), true);
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default Boolean getPrivatePropertyBoolean(String str) throws JavetException {
        return (Boolean) getPrivatePropertyPrimitive(str);
    }

    default Double getPrivatePropertyDouble(String str) throws JavetException {
        return (Double) getPrivatePropertyPrimitive(str);
    }

    default Float getPrivatePropertyFloat(String str) throws JavetException {
        Double privatePropertyDouble = getPrivatePropertyDouble(str);
        if (privatePropertyDouble == null) {
            return null;
        }
        return Float.valueOf(privatePropertyDouble.floatValue());
    }

    default Integer getPrivatePropertyInteger(String str) throws JavetException {
        return (Integer) getPrivatePropertyPrimitive(str);
    }

    default Long getPrivatePropertyLong(String str) throws JavetException {
        return (Long) getPrivatePropertyPrimitive(str);
    }

    default V8ValueNull getPrivatePropertyNull(String str) throws JavetException {
        return (V8ValueNull) getPrivateProperty(str);
    }

    default <T> T getPrivatePropertyObject(String str) throws JavetException {
        try {
            return (T) getV8Runtime().toObject(getPrivateProperty(str), true);
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default <R, T extends V8ValuePrimitive<R>> R getPrivatePropertyPrimitive(String str) throws JavetException {
        try {
            V8Value privateProperty = getPrivateProperty(str);
            try {
                R r2 = (R) ((V8ValuePrimitive) privateProperty).getValue();
                if (privateProperty != null) {
                    privateProperty.close();
                    return r2;
                }
                return r2;
            } catch (Throwable th) {
                if (privateProperty != null) {
                    try {
                        privateProperty.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default String getPrivatePropertyString(String str) throws JavetException {
        return (String) getPrivatePropertyPrimitive(str);
    }

    default V8ValueUndefined getPrivatePropertyUndefined(String str) throws JavetException {
        return (V8ValueUndefined) getPrivateProperty(str);
    }

    default ZonedDateTime getPrivatePropertyZonedDateTime(String str) throws JavetException {
        return (ZonedDateTime) getPrivatePropertyPrimitive(str);
    }

    default Boolean getPropertyBoolean(Object obj) throws JavetException {
        return (Boolean) getPropertyPrimitive(obj);
    }

    default Double getPropertyDouble(Object obj) throws JavetException {
        return (Double) getPropertyPrimitive(obj);
    }

    default Float getPropertyFloat(Object obj) throws JavetException {
        Double propertyDouble = getPropertyDouble(obj);
        if (propertyDouble == null) {
            return null;
        }
        return Float.valueOf(propertyDouble.floatValue());
    }

    default Integer getPropertyInteger(Object obj) throws JavetException {
        return (Integer) getPropertyPrimitive(obj);
    }

    default Long getPropertyLong(Object obj) throws JavetException {
        return (Long) getPropertyPrimitive(obj);
    }

    default <T> T getPropertyObject(Object obj) throws JavetException {
        try {
            return (T) getV8Runtime().toObject(getProperty(obj), true);
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default <R, T extends V8ValuePrimitive<R>> R getPropertyPrimitive(Object obj) throws JavetException {
        try {
            V8Value property = getProperty(obj);
            try {
                R r2 = (R) ((V8ValuePrimitive) property).getValue();
                if (property != null) {
                    property.close();
                    return r2;
                }
                return r2;
            } catch (Throwable th) {
                if (property != null) {
                    try {
                        property.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default String getPropertyString(Object obj) throws JavetException {
        return (String) getPropertyPrimitive(obj);
    }

    default ZonedDateTime getPropertyZonedDateTime(Object obj) throws JavetException {
        return (ZonedDateTime) getPropertyPrimitive(obj);
    }

    default V8ValueUndefined getUndefined(Object obj) throws JavetException {
        return (V8ValueUndefined) get(obj);
    }

    default ZonedDateTime getZonedDateTime(Object obj) throws JavetException {
        try {
            V8Value v8Value = get(obj);
            try {
                if (v8Value instanceof V8ValueZonedDateTime) {
                    ZonedDateTime value = ((V8ValueZonedDateTime) v8Value).getValue();
                    if (v8Value != null) {
                        v8Value.close();
                        return value;
                    }
                    return value;
                }
                if (v8Value != null) {
                    v8Value.close();
                    return null;
                }
                return null;
            } catch (Throwable th) {
                if (v8Value != null) {
                    try {
                        v8Value.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default boolean hasNull() throws JavetException {
        return has(getV8Runtime().createV8ValueNull());
    }

    default boolean hasUndefined() throws JavetException {
        return has(getV8Runtime().createV8ValueUndefined());
    }

    default Float invokeFloat(String str, Object... objArr) throws JavetException {
        Double dInvokeDouble = invokeDouble(str, objArr);
        if (dInvokeDouble == null) {
            return null;
        }
        return Float.valueOf(dInvokeDouble.floatValue());
    }

    default <T> T invokeObject(String str, Object... objArr) throws JavetException {
        try {
            return (T) getV8Runtime().toObject(invokeExtended(str, true, objArr), true);
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default boolean setPrivatePropertyNull(String str) throws JavetException {
        return setPrivateProperty(str, getV8Runtime().createV8ValueNull());
    }

    default boolean setPrivatePropertyUndefined(String str) throws JavetException {
        return setPrivateProperty(str, getV8Runtime().createV8ValueUndefined());
    }

    default boolean setPropertyNull(Object obj) throws JavetException {
        return setProperty(obj, getV8Runtime().createV8ValueNull());
    }

    default boolean setPropertyUndefined(Object obj) throws JavetException {
        return setProperty(obj, getV8Runtime().createV8ValueUndefined());
    }

    default boolean unbindFunction(V8ValueSymbol v8ValueSymbol) throws JavetException {
        return delete(v8ValueSymbol);
    }

    default boolean bindFunction(V8ValueSymbol v8ValueSymbol, String str) throws JavetException {
        Objects.requireNonNull(v8ValueSymbol);
        Objects.requireNonNull(str);
        V8ValueFunction v8ValueFunctionCreateV8ValueFunction = getV8Runtime().createV8ValueFunction(str);
        try {
            boolean z2 = set(v8ValueSymbol, v8ValueFunctionCreateV8ValueFunction);
            if (v8ValueFunctionCreateV8ValueFunction != null) {
                v8ValueFunctionCreateV8ValueFunction.close();
            }
            return z2;
        } catch (Throwable th) {
            if (v8ValueFunctionCreateV8ValueFunction != null) {
                try {
                    v8ValueFunctionCreateV8ValueFunction.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    default <Key extends V8Value, E extends Throwable> int forEach(IJavetUniIndexedConsumer<Key, E> iJavetUniIndexedConsumer) throws Throwable {
        return forEach(iJavetUniIndexedConsumer, 100);
    }

    default <Key extends V8Value, E extends Throwable> int forEach(IJavetUniIndexedConsumer<Key, E> iJavetUniIndexedConsumer, int i2) throws Throwable {
        Objects.requireNonNull(iJavetUniIndexedConsumer);
        IV8ValueArray ownPropertyNames = getOwnPropertyNames();
        try {
            int iForEach = ownPropertyNames.forEach(iJavetUniIndexedConsumer, i2);
            ownPropertyNames.close();
            return iForEach;
        } catch (Throwable th) {
            if (ownPropertyNames != null) {
                try {
                    ownPropertyNames.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    default <Key extends V8Value, Value extends V8Value, E extends Throwable> int forEach(IJavetBiConsumer<Key, Value, E> iJavetBiConsumer) throws Throwable {
        return forEach(iJavetBiConsumer, 100);
    }

    default <Key extends V8Value, Value extends V8Value, E extends Throwable> int forEach(IJavetBiIndexedConsumer<Key, Value, E> iJavetBiIndexedConsumer) throws Throwable {
        return forEach(iJavetBiIndexedConsumer, 100);
    }
}
