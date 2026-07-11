package com.caoccao.javet.interop;

import com.caoccao.javet.enums.V8ValueErrorType;
import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueBigInteger;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.caoccao.javet.values.primitive.V8ValueDouble;
import com.caoccao.javet.values.primitive.V8ValueInteger;
import com.caoccao.javet.values.primitive.V8ValueLong;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.caoccao.javet.values.primitive.V8ValueString;
import com.caoccao.javet.values.primitive.V8ValueUndefined;
import com.caoccao.javet.values.primitive.V8ValueZonedDateTime;
import com.caoccao.javet.values.reference.IV8ValueObject;
import com.caoccao.javet.values.reference.V8Module;
import com.caoccao.javet.values.reference.V8ValueArray;
import com.caoccao.javet.values.reference.V8ValueArrayBuffer;
import com.caoccao.javet.values.reference.V8ValueBooleanObject;
import com.caoccao.javet.values.reference.V8ValueDataView;
import com.caoccao.javet.values.reference.V8ValueDoubleObject;
import com.caoccao.javet.values.reference.V8ValueError;
import com.caoccao.javet.values.reference.V8ValueFunction;
import com.caoccao.javet.values.reference.V8ValueIntegerObject;
import com.caoccao.javet.values.reference.V8ValueLongObject;
import com.caoccao.javet.values.reference.V8ValueMap;
import com.caoccao.javet.values.reference.V8ValueObject;
import com.caoccao.javet.values.reference.V8ValuePromise;
import com.caoccao.javet.values.reference.V8ValueProxy;
import com.caoccao.javet.values.reference.V8ValueSet;
import com.caoccao.javet.values.reference.V8ValueStringObject;
import com.caoccao.javet.values.reference.V8ValueSymbol;
import com.caoccao.javet.values.reference.V8ValueTypedArray;
import j$.time.ZonedDateTime;
import java.math.BigInteger;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface IV8Creatable {
    V8Module createV8Module(String str, IV8ValueObject iV8ValueObject) throws JavetException;

    V8ValueArray createV8ValueArray() throws JavetException;

    V8ValueArrayBuffer createV8ValueArrayBuffer(int i2) throws JavetException;

    V8ValueArrayBuffer createV8ValueArrayBuffer(ByteBuffer byteBuffer) throws JavetException;

    V8ValueBigInteger createV8ValueBigInteger(String str) throws JavetException;

    V8ValueBigInteger createV8ValueBigInteger(BigInteger bigInteger) throws JavetException;

    V8ValueBoolean createV8ValueBoolean(boolean z2) throws JavetException;

    V8ValueBooleanObject createV8ValueBooleanObject(boolean z2) throws JavetException;

    V8ValueDataView createV8ValueDataView(V8ValueArrayBuffer v8ValueArrayBuffer) throws JavetException;

    V8ValueDouble createV8ValueDouble(double d2) throws JavetException;

    V8ValueDoubleObject createV8ValueDoubleObject(double d2) throws JavetException;

    V8ValueError createV8ValueError(V8ValueErrorType v8ValueErrorType, String str) throws JavetException;

    V8ValueFunction createV8ValueFunction(JavetCallbackContext javetCallbackContext) throws JavetException;

    V8ValueFunction createV8ValueFunction(String str) throws JavetException;

    V8ValueInteger createV8ValueInteger(int i2) throws JavetException;

    V8ValueIntegerObject createV8ValueIntegerObject(int i2) throws JavetException;

    V8ValueLong createV8ValueLong(long j2) throws JavetException;

    V8ValueLongObject createV8ValueLongObject(long j2) throws JavetException;

    V8ValueMap createV8ValueMap() throws JavetException;

    V8ValueNull createV8ValueNull();

    V8ValueObject createV8ValueObject() throws JavetException;

    V8ValuePromise createV8ValuePromise() throws JavetException;

    default V8ValueProxy createV8ValueProxy() throws JavetException {
        return createV8ValueProxy(null);
    }

    V8ValueProxy createV8ValueProxy(V8Value v8Value) throws JavetException;

    V8ValueSet createV8ValueSet() throws JavetException;

    V8ValueString createV8ValueString(String str) throws JavetException;

    V8ValueStringObject createV8ValueStringObject(String str) throws JavetException;

    default V8ValueSymbol createV8ValueSymbol(String str) throws JavetException {
        return createV8ValueSymbol(str, false);
    }

    V8ValueSymbol createV8ValueSymbol(String str, boolean z2) throws JavetException;

    V8ValueTypedArray createV8ValueTypedArray(V8ValueReferenceType v8ValueReferenceType, int i2) throws JavetException;

    V8ValueUndefined createV8ValueUndefined();

    V8ValueZonedDateTime createV8ValueZonedDateTime(long j2) throws JavetException;

    V8ValueZonedDateTime createV8ValueZonedDateTime(ZonedDateTime zonedDateTime) throws JavetException;
}
