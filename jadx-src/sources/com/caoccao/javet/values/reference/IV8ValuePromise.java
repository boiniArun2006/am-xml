package com.caoccao.javet.values.reference;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValuePrimitive;
import j$.time.ZonedDateTime;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface IV8ValuePromise extends IV8ValueObject {
    public static final int STATE_FULFILLED = 1;
    public static final int STATE_PENDING = 0;
    public static final int STATE_REJECTED = 2;

    public interface IListener {
        public static final String ON_CATCH = "onCatch";
        public static final String ON_FULFILLED = "onFulfilled";
        public static final String ON_REJECTED = "onRejected";

        void onCatch(V8Value v8Value);

        void onFulfilled(V8Value v8Value);

        void onRejected(V8Value v8Value);
    }

    V8ValuePromise _catch(IV8ValueFunction iV8ValueFunction) throws JavetException;

    default V8ValuePromise _catch(String str) throws JavetException {
        Objects.requireNonNull(str);
        V8ValueFunction v8ValueFunction = (V8ValueFunction) getV8Runtime().getExecutor(str).execute();
        try {
            V8ValuePromise v8ValuePromise_catch = _catch(v8ValueFunction);
            if (v8ValueFunction != null) {
                v8ValueFunction.close();
            }
            return v8ValuePromise_catch;
        } catch (Throwable th) {
            if (v8ValueFunction != null) {
                try {
                    v8ValueFunction.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    V8ValuePromise getPromise() throws JavetException;

    <Value extends V8Value> Value getResult() throws JavetException;

    int getState() throws JavetException;

    boolean hasHandler() throws JavetException;

    default boolean isRejected() throws JavetException {
        return 2 == getState();
    }

    void markAsHandled() throws JavetException;

    boolean register(IListener iListener) throws JavetException;

    boolean reject(V8Value v8Value) throws JavetException;

    default boolean reject(Object obj) throws JavetException {
        V8Value v8Value = getV8Runtime().toV8Value(obj);
        try {
            boolean zReject = reject(v8Value);
            if (v8Value != null) {
                v8Value.close();
            }
            return zReject;
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
    }

    boolean resolve(V8Value v8Value) throws JavetException;

    default boolean resolve(Object obj) throws JavetException {
        V8Value v8Value = getV8Runtime().toV8Value(obj);
        try {
            boolean zResolve = resolve(v8Value);
            if (v8Value != null) {
                v8Value.close();
            }
            return zResolve;
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
    }

    default V8ValuePromise then(IV8ValueFunction iV8ValueFunction) throws JavetException {
        return then(iV8ValueFunction, (IV8ValueFunction) null);
    }

    V8ValuePromise then(IV8ValueFunction iV8ValueFunction, IV8ValueFunction iV8ValueFunction2) throws JavetException;

    default V8ValuePromise then(String str) throws JavetException {
        return then(str, (String) null);
    }

    default BigInteger getResultBigInteger() throws JavetException {
        return (BigInteger) getResultPrimitive();
    }

    default boolean getResultBoolean() throws JavetException {
        return ((Boolean) getResultPrimitive()).booleanValue();
    }

    default double getResultDouble() throws JavetException {
        return ((Double) getResultPrimitive()).doubleValue();
    }

    default int getResultInteger() throws JavetException {
        return ((Integer) getResultPrimitive()).intValue();
    }

    default long getResultLong() throws JavetException {
        return ((Long) getResultPrimitive()).longValue();
    }

    default <T> T getResultObject() throws JavetException {
        try {
            return (T) getV8Runtime().toObject(getResult(), true);
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default <R, T extends V8ValuePrimitive<R>> R getResultPrimitive() throws JavetException {
        try {
            return (R) ((V8ValuePrimitive) getResult()).getValue();
        } catch (Throwable unused) {
            return null;
        }
    }

    default String getResultString() throws JavetException {
        return (String) getResultPrimitive();
    }

    default ZonedDateTime getResultZonedDateTime() throws JavetException {
        return (ZonedDateTime) getResultPrimitive();
    }

    default boolean isFulfilled() throws JavetException {
        if (1 == getState()) {
            return true;
        }
        return false;
    }

    default boolean isPending() throws JavetException {
        if (getState() == 0) {
            return true;
        }
        return false;
    }

    default V8ValuePromise then(String str, String str2) throws JavetException {
        Objects.requireNonNull(str);
        V8ValueFunction v8ValueFunction = (V8ValueFunction) getV8Runtime().getExecutor(str).execute();
        try {
            if (str2 == null) {
                V8ValuePromise v8ValuePromiseThen = then(v8ValueFunction, (IV8ValueFunction) null);
                if (v8ValueFunction != null) {
                    v8ValueFunction.close();
                }
                return v8ValuePromiseThen;
            }
            V8ValueFunction v8ValueFunction2 = (V8ValueFunction) getV8Runtime().getExecutor(str2).execute();
            try {
                V8ValuePromise v8ValuePromiseThen2 = then(v8ValueFunction, v8ValueFunction2);
                if (v8ValueFunction2 != null) {
                    v8ValueFunction2.close();
                }
                if (v8ValueFunction != null) {
                    v8ValueFunction.close();
                }
                return v8ValuePromiseThen2;
            } finally {
            }
        } catch (Throwable th) {
            if (v8ValueFunction != null) {
                try {
                    v8ValueFunction.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
