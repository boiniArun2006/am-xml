package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.V8ContextType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueBigInteger;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.caoccao.javet.values.primitive.V8ValueUndefined;
import com.caoccao.javet.values.primitive.V8ValueZonedDateTime;
import j$.time.ZonedDateTime;
import java.math.BigInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface IV8Context extends IV8ValueReference {
    <T extends V8Value> T get(int i2) throws JavetException;

    int getLength() throws JavetException;

    default String getString(int i2) throws JavetException {
        try {
            V8Value v8Value = get(i2);
            try {
                if (v8Value.isNullOrUndefined()) {
                    v8Value.close();
                    return null;
                }
                String strAsString = v8Value.asString();
                v8Value.close();
                return strAsString;
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

    boolean isContextType(V8ContextType v8ContextType) throws JavetException;

    boolean setLength(int i2) throws JavetException;

    default boolean isAwaitContext() throws JavetException {
        return isContextType(V8ContextType.Await);
    }

    default boolean isBlockContext() throws JavetException {
        return isContextType(V8ContextType.Block);
    }

    default boolean isCatchContext() throws JavetException {
        return isContextType(V8ContextType.Catch);
    }

    default boolean isDebugEvaluateContext() throws JavetException {
        return isContextType(V8ContextType.DebugEvaluate);
    }

    default boolean isDeclarationContext() throws JavetException {
        return isContextType(V8ContextType.Declaration);
    }

    default boolean isEvalContext() throws JavetException {
        return isContextType(V8ContextType.Eval);
    }

    default boolean isFunctionContext() throws JavetException {
        return isContextType(V8ContextType.Function);
    }

    default boolean isModuleContext() throws JavetException {
        return isContextType(V8ContextType.Module);
    }

    default boolean isScriptContext() throws JavetException {
        return isContextType(V8ContextType.Script);
    }

    default boolean isWithContext() throws JavetException {
        return isContextType(V8ContextType.With);
    }

    default BigInteger getBigInteger(int i2) throws JavetException {
        try {
            V8Value v8Value = get(i2);
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

    default Boolean getBoolean(int i2) throws JavetException {
        try {
            V8Value v8Value = get(i2);
            try {
                Boolean boolValueOf = Boolean.valueOf(v8Value.asBoolean());
                v8Value.close();
                return boolValueOf;
            } finally {
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default Double getDouble(int i2) throws JavetException {
        try {
            V8Value v8Value = get(i2);
            try {
                Double dValueOf = Double.valueOf(v8Value.asDouble());
                v8Value.close();
                return dValueOf;
            } finally {
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default Float getFloat(int i2) throws JavetException {
        Double d2 = getDouble(i2);
        if (d2 == null) {
            return null;
        }
        return Float.valueOf(d2.floatValue());
    }

    default Integer getInteger(int i2) throws JavetException {
        try {
            V8Value v8Value = get(i2);
            try {
                Integer numValueOf = Integer.valueOf(v8Value.asInt());
                v8Value.close();
                return numValueOf;
            } finally {
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default Long getLong(int i2) throws JavetException {
        try {
            V8Value v8Value = get(i2);
            try {
                Long lValueOf = Long.valueOf(v8Value.asLong());
                v8Value.close();
                return lValueOf;
            } finally {
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default V8ValueNull getNull(int i2) throws JavetException {
        return (V8ValueNull) get(i2);
    }

    default <T> T getObject(int i2) throws JavetException {
        try {
            return (T) getV8Runtime().toObject(get(i2), true);
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default V8ValueUndefined getUndefined(int i2) throws JavetException {
        return (V8ValueUndefined) get(i2);
    }

    default ZonedDateTime getZonedDateTime(int i2) throws JavetException {
        try {
            V8Value v8Value = get(i2);
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
}
