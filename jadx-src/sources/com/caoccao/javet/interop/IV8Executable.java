package com.caoccao.javet.interop;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueBigInteger;
import com.caoccao.javet.values.primitive.V8ValueZonedDateTime;
import j$.time.ZonedDateTime;
import java.math.BigInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface IV8Executable extends IV8Convertible {
    default <T extends V8Value> T execute() throws JavetException {
        return (T) execute(true);
    }

    <T extends V8Value> T execute(boolean z2) throws JavetException;

    default String executeString() throws JavetException {
        try {
            V8Value v8ValueExecute = execute();
            try {
                if (v8ValueExecute.isNullOrUndefined()) {
                    v8ValueExecute.close();
                    return null;
                }
                String strAsString = v8ValueExecute.asString();
                v8ValueExecute.close();
                return strAsString;
            } catch (Throwable th) {
                if (v8ValueExecute != null) {
                    try {
                        v8ValueExecute.close();
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

    default void executeVoid() throws JavetException {
        execute(false);
    }

    default BigInteger executeBigInteger() throws JavetException {
        try {
            V8Value v8ValueExecute = execute();
            try {
                if (v8ValueExecute instanceof V8ValueBigInteger) {
                    BigInteger value = ((V8ValueBigInteger) v8ValueExecute).getValue();
                    if (v8ValueExecute != null) {
                        v8ValueExecute.close();
                        return value;
                    }
                    return value;
                }
                if (v8ValueExecute != null) {
                    v8ValueExecute.close();
                    return null;
                }
                return null;
            } catch (Throwable th) {
                if (v8ValueExecute != null) {
                    try {
                        v8ValueExecute.close();
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

    default Boolean executeBoolean() throws JavetException {
        try {
            V8Value v8ValueExecute = execute();
            try {
                Boolean boolValueOf = Boolean.valueOf(v8ValueExecute.asBoolean());
                v8ValueExecute.close();
                return boolValueOf;
            } finally {
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default Double executeDouble() throws JavetException {
        try {
            V8Value v8ValueExecute = execute();
            try {
                Double dValueOf = Double.valueOf(v8ValueExecute.asDouble());
                v8ValueExecute.close();
                return dValueOf;
            } finally {
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default Integer executeInteger() throws JavetException {
        try {
            V8Value v8ValueExecute = execute();
            try {
                Integer numValueOf = Integer.valueOf(v8ValueExecute.asInt());
                v8ValueExecute.close();
                return numValueOf;
            } finally {
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default Long executeLong() throws JavetException {
        try {
            V8Value v8ValueExecute = execute();
            try {
                Long lValueOf = Long.valueOf(v8ValueExecute.asLong());
                v8ValueExecute.close();
                return lValueOf;
            } finally {
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default <T> T executeObject() throws JavetException {
        try {
            V8Value v8ValueExecute = execute();
            try {
                T t3 = (T) toObject(v8ValueExecute);
                if (v8ValueExecute != null) {
                    v8ValueExecute.close();
                    return t3;
                }
                return t3;
            } finally {
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default ZonedDateTime executeZonedDateTime() throws JavetException {
        try {
            V8Value v8ValueExecute = execute();
            try {
                if (v8ValueExecute instanceof V8ValueZonedDateTime) {
                    ZonedDateTime value = ((V8ValueZonedDateTime) v8ValueExecute).getValue();
                    if (v8ValueExecute != null) {
                        v8ValueExecute.close();
                        return value;
                    }
                    return value;
                }
                if (v8ValueExecute != null) {
                    v8ValueExecute.close();
                    return null;
                }
                return null;
            } catch (Throwable th) {
                if (v8ValueExecute != null) {
                    try {
                        v8ValueExecute.close();
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
