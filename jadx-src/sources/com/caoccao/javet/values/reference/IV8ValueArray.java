package com.caoccao.javet.values.reference;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetUniConsumer;
import com.caoccao.javet.interfaces.IJavetUniIndexedConsumer;
import com.caoccao.javet.utils.JavetResourceUtils;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.caoccao.javet.values.primitive.V8ValuePrimitive;
import com.caoccao.javet.values.primitive.V8ValueUndefined;
import j$.time.ZonedDateTime;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface IV8ValueArray extends IV8ValueObject {
    public static final String FUNCTION_FLAT = "flat";
    public static final String FUNCTION_POP = "pop";
    public static final String FUNCTION_PUSH = "push";
    public static final String FUNCTION_SHIFT = "shift";
    public static final String FUNCTION_UNSHIFT = "unshift";

    int batchGet(V8Value[] v8ValueArr, int i2, int i3) throws JavetException;

    default <T extends V8Value> T[] batchGet() throws JavetException {
        int length = getLength();
        T[] tArr = (T[]) new V8Value[length];
        if (length <= 0) {
            return tArr;
        }
        try {
            batchGet(tArr, 0, length);
            return tArr;
        } catch (Throwable th) {
            JavetResourceUtils.safeClose((V8Value[]) tArr);
            Arrays.fill(tArr, (Object) null);
            throw th;
        }
    }

    default IV8ValueArray flat() throws JavetException {
        return (IV8ValueArray) invoke(FUNCTION_FLAT, new V8Value[0]);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    <Value extends V8Value, E extends Throwable> int forEach(IJavetUniConsumer<Value, E> iJavetUniConsumer, int i2) throws Throwable;

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    <Value extends V8Value, E extends Throwable> int forEach(IJavetUniIndexedConsumer<Value, E> iJavetUniIndexedConsumer, int i2) throws Throwable;

    <T extends V8Value> T get(int i2) throws JavetException;

    List<Integer> getKeys() throws JavetException;

    int getLength() throws JavetException;

    default <T extends V8Value> T pop() throws JavetException {
        return (T) invoke(FUNCTION_POP, new V8Value[0]);
    }

    default <T extends V8Value> T shift() throws JavetException {
        return (T) invoke(FUNCTION_SHIFT, new V8Value[0]);
    }

    default IV8ValueArray flat(int i2) throws JavetException {
        return (IV8ValueArray) invoke(FUNCTION_FLAT, getV8Runtime().createV8ValueInteger(i2));
    }

    default int push(Object... objArr) throws JavetException {
        return invokeInteger(FUNCTION_PUSH, objArr).intValue();
    }

    default int unshift(Object... objArr) throws JavetException {
        return invokeInteger(FUNCTION_UNSHIFT, objArr).intValue();
    }

    default BigInteger popBigInteger() throws JavetException {
        return (BigInteger) popPrimitive();
    }

    default Boolean popBoolean() throws JavetException {
        return (Boolean) popPrimitive();
    }

    default Double popDouble() throws JavetException {
        return (Double) popPrimitive();
    }

    default Integer popInteger() throws JavetException {
        return (Integer) popPrimitive();
    }

    default Long popLong() throws JavetException {
        return (Long) popPrimitive();
    }

    default V8ValueNull popNull() throws JavetException {
        return (V8ValueNull) pop();
    }

    default <T> T popObject() throws JavetException {
        try {
            return (T) getV8Runtime().toObject(pop(), true);
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default <R, T extends V8ValuePrimitive<R>> R popPrimitive() throws JavetException {
        try {
            V8Value v8ValuePop = pop();
            try {
                R r2 = (R) ((V8ValuePrimitive) v8ValuePop).getValue();
                if (v8ValuePop != null) {
                    v8ValuePop.close();
                    return r2;
                }
                return r2;
            } catch (Throwable th) {
                if (v8ValuePop != null) {
                    try {
                        v8ValuePop.close();
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

    default String popString() throws JavetException {
        return (String) popPrimitive();
    }

    default V8ValueUndefined popUndefined() throws JavetException {
        return (V8ValueUndefined) pop();
    }

    default ZonedDateTime popZonedDateTime() throws JavetException {
        return (ZonedDateTime) popPrimitive();
    }

    default int pushNull() throws JavetException {
        return push(getV8Runtime().createV8ValueNull());
    }

    default int pushUndefined() throws JavetException {
        return push(getV8Runtime().createV8ValueUndefined());
    }

    default BigInteger shiftBigInteger() throws JavetException {
        return (BigInteger) shiftPrimitive();
    }

    default Boolean shiftBoolean() throws JavetException {
        return (Boolean) shiftPrimitive();
    }

    default Double shiftDouble() throws JavetException {
        return (Double) shiftPrimitive();
    }

    default Integer shiftInteger() throws JavetException {
        return (Integer) shiftPrimitive();
    }

    default Long shiftLong() throws JavetException {
        return (Long) shiftPrimitive();
    }

    default V8ValueNull shiftNull() throws JavetException {
        return (V8ValueNull) shift();
    }

    default <T> T shiftObject() throws JavetException {
        try {
            return (T) getV8Runtime().toObject(shift(), true);
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default <R, T extends V8ValuePrimitive<R>> R shiftPrimitive() throws JavetException {
        try {
            V8Value v8ValueShift = shift();
            try {
                R r2 = (R) ((V8ValuePrimitive) v8ValueShift).getValue();
                if (v8ValueShift != null) {
                    v8ValueShift.close();
                    return r2;
                }
                return r2;
            } catch (Throwable th) {
                if (v8ValueShift != null) {
                    try {
                        v8ValueShift.close();
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

    default String shiftString() throws JavetException {
        return (String) shiftPrimitive();
    }

    default V8ValueUndefined shiftUndefined() throws JavetException {
        return (V8ValueUndefined) shift();
    }

    default ZonedDateTime shiftZonedDateTime() throws JavetException {
        return (ZonedDateTime) shiftPrimitive();
    }

    default V8Value[] toArray() throws JavetException {
        return batchGet();
    }

    default int unshiftNull() throws JavetException {
        return unshift(getV8Runtime().createV8ValueNull());
    }

    default int unshiftUndefined() throws JavetException {
        return unshift(getV8Runtime().createV8ValueUndefined());
    }
}
