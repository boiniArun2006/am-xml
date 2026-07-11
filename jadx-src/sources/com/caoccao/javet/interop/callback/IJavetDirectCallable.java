package com.caoccao.javet.interop.callback;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface IJavetDirectCallable {

    public interface DirectCall extends Serializable {
    }

    public interface GetterAndNoThis<E extends Exception> extends DirectCall {
        V8Value get() throws Exception;
    }

    public interface GetterAndThis<E extends Exception> extends DirectCall {
        V8Value get(V8Value v8Value) throws Exception;
    }

    public interface NoThisAndNoResult<E extends Exception> extends DirectCall {
        void call(V8Value... v8ValueArr) throws Exception;
    }

    public interface NoThisAndResult<E extends Exception> extends DirectCall {
        V8Value call(V8Value... v8ValueArr) throws Exception;
    }

    public interface SetterAndNoThis<E extends Exception> extends DirectCall {
        V8Value set(V8Value v8Value) throws Exception;
    }

    public interface SetterAndThis<E extends Exception> extends DirectCall {
        V8Value set(V8Value v8Value, V8Value v8Value2) throws Exception;
    }

    public interface ThisAndNoResult<E extends Exception> extends DirectCall {
        void call(V8Value v8Value, V8Value... v8ValueArr) throws Exception;
    }

    public interface ThisAndResult<E extends Exception> extends DirectCall {
        V8Value call(V8Value v8Value, V8Value... v8ValueArr) throws Exception;
    }

    JavetCallbackContext[] getCallbackContexts();

    default void setV8Runtime(V8Runtime v8Runtime) {
    }
}
