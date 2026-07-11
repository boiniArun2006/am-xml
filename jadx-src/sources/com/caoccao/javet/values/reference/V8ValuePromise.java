package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import com.caoccao.javet.interop.callback.JavetCallbackType;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.IV8ValuePromise;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class V8ValuePromise extends V8ValueObject implements IV8ValuePromise {
    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public V8ValueReferenceType getType() {
        return V8ValueReferenceType.Promise;
    }

    V8ValuePromise(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValuePromise
    public V8ValuePromise _catch(IV8ValueFunction iV8ValueFunction) throws JavetException {
        return checkV8Runtime().getV8Internal().promiseCatch(this, iV8ValueFunction);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValuePromise
    public V8ValuePromise getPromise() throws JavetException {
        return checkV8Runtime().getV8Internal().promiseGetPromise(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValuePromise
    public <Value extends V8Value> Value getResult() throws JavetException {
        return (Value) checkV8Runtime().getV8Internal().promiseGetResult(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValuePromise
    public int getState() throws JavetException {
        return checkV8Runtime().getV8Internal().promiseGetState(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValuePromise
    public boolean hasHandler() throws JavetException {
        return checkV8Runtime().getV8Internal().promiseHasHandler(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValuePromise
    public void markAsHandled() throws JavetException {
        checkV8Runtime().getV8Internal().promiseMarkAsHandled(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValuePromise
    public boolean register(IV8ValuePromise.IListener iListener) throws JavetException {
        checkV8Runtime();
        try {
            JavetCallbackType javetCallbackType = JavetCallbackType.DirectCallNoThisAndNoResult;
            JavetCallbackContext javetCallbackContext = new JavetCallbackContext(IV8ValuePromise.IListener.ON_CATCH, iListener, javetCallbackType, new Wre(iListener));
            JavetCallbackContext javetCallbackContext2 = new JavetCallbackContext(IV8ValuePromise.IListener.ON_FULFILLED, iListener, javetCallbackType, new CN3(iListener));
            JavetCallbackContext javetCallbackContext3 = new JavetCallbackContext(IV8ValuePromise.IListener.ON_REJECTED, iListener, javetCallbackType, new fuX(iListener));
            V8ValueFunction v8ValueFunctionCreateV8ValueFunction = this.v8Runtime.createV8ValueFunction(javetCallbackContext);
            try {
                V8ValueFunction v8ValueFunctionCreateV8ValueFunction2 = this.v8Runtime.createV8ValueFunction(javetCallbackContext2);
                try {
                    V8ValueFunction v8ValueFunctionCreateV8ValueFunction3 = this.v8Runtime.createV8ValueFunction(javetCallbackContext3);
                    try {
                        V8ValuePromise promise = getPromise();
                        try {
                            V8ValuePromise v8ValuePromiseThen = promise.then(v8ValueFunctionCreateV8ValueFunction2, v8ValueFunctionCreateV8ValueFunction3);
                            if (v8ValuePromiseThen != null) {
                                v8ValuePromiseThen.close();
                            }
                            V8ValuePromise v8ValuePromise_catch = promise._catch(v8ValueFunctionCreateV8ValueFunction);
                            if (v8ValuePromise_catch != null) {
                                v8ValuePromise_catch.close();
                            }
                            promise.close();
                            if (v8ValueFunctionCreateV8ValueFunction3 != null) {
                                v8ValueFunctionCreateV8ValueFunction3.close();
                            }
                            if (v8ValueFunctionCreateV8ValueFunction2 != null) {
                                v8ValueFunctionCreateV8ValueFunction2.close();
                            }
                            if (v8ValueFunctionCreateV8ValueFunction != null) {
                                v8ValueFunctionCreateV8ValueFunction.close();
                                return true;
                            }
                            return true;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            this.v8Runtime.getLogger().error("Failed to register a listener to a promise.", th);
            return false;
        }
    }

    @Override // com.caoccao.javet.values.reference.IV8ValuePromise
    public boolean reject(V8Value v8Value) throws JavetException {
        return checkV8Runtime().getV8Internal().promiseReject(this, v8Value);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValuePromise
    public boolean resolve(V8Value v8Value) throws JavetException {
        return checkV8Runtime().getV8Internal().promiseResolve(this, v8Value);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValuePromise
    public V8ValuePromise then(IV8ValueFunction iV8ValueFunction, IV8ValueFunction iV8ValueFunction2) throws JavetException {
        return checkV8Runtime().getV8Internal().promiseThen(this, iV8ValueFunction, iV8ValueFunction2);
    }
}
