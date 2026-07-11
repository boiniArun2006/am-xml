package com.caoccao.javet.interop;

import com.caoccao.javet.enums.V8ValueErrorType;
import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetClosable;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import com.caoccao.javet.utils.JavetResourceUtils;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class V8Scope implements IV8Creatable, IJavetClosable {
    protected static final String ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY = "V8 runtime cannot be empty.";
    protected boolean closed;
    protected boolean escapable;
    protected V8Runtime v8Runtime;
    protected List<V8Value> values;

    public V8Scope() {
        this(null);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueArrayBuffer createV8ValueArrayBuffer(int i2) throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return (V8ValueArrayBuffer) add(this.v8Runtime.createV8ValueArrayBuffer(i2));
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueBigInteger createV8ValueBigInteger(BigInteger bigInteger) throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return (V8ValueBigInteger) add(this.v8Runtime.createV8ValueBigInteger(bigInteger));
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueFunction createV8ValueFunction(JavetCallbackContext javetCallbackContext) throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return (V8ValueFunction) add(this.v8Runtime.createV8ValueFunction(javetCallbackContext));
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueZonedDateTime createV8ValueZonedDateTime(long j2) throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return this.v8Runtime.createV8ValueZonedDateTime(j2);
    }

    public V8Scope setEscapable() {
        return setEscapable(true);
    }

    V8Scope(V8Runtime v8Runtime) {
        this.closed = false;
        this.escapable = false;
        this.v8Runtime = v8Runtime;
        this.values = new ArrayList();
    }

    public <T extends V8Value> T add(T t3) {
        List<V8Value> list = this.values;
        Objects.requireNonNull(t3);
        list.add(t3);
        return t3;
    }

    @Override // com.caoccao.javet.interfaces.IJavetClosable, java.lang.AutoCloseable
    public void close() throws JavetException {
        if (this.closed) {
            return;
        }
        if (!this.escapable) {
            JavetResourceUtils.safeClose(this.values);
        }
        this.closed = true;
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8Module createV8Module(String str, IV8ValueObject iV8ValueObject) throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return (V8Module) add(this.v8Runtime.createV8Module(str, iV8ValueObject));
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueArray createV8ValueArray() throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return (V8ValueArray) add(this.v8Runtime.createV8ValueArray());
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueBoolean createV8ValueBoolean(boolean z2) throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return this.v8Runtime.createV8ValueBoolean(z2);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueBooleanObject createV8ValueBooleanObject(boolean z2) throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return this.v8Runtime.createV8ValueBooleanObject(z2);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueDataView createV8ValueDataView(V8ValueArrayBuffer v8ValueArrayBuffer) throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return (V8ValueDataView) add(this.v8Runtime.createV8ValueDataView(v8ValueArrayBuffer));
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueDouble createV8ValueDouble(double d2) throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return this.v8Runtime.createV8ValueDouble(d2);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueDoubleObject createV8ValueDoubleObject(double d2) throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return this.v8Runtime.createV8ValueDoubleObject(d2);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueError createV8ValueError(V8ValueErrorType v8ValueErrorType, String str) throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return this.v8Runtime.createV8ValueError(v8ValueErrorType, str);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueInteger createV8ValueInteger(int i2) throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return this.v8Runtime.createV8ValueInteger(i2);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueIntegerObject createV8ValueIntegerObject(int i2) throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return this.v8Runtime.createV8ValueIntegerObject(i2);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueLong createV8ValueLong(long j2) throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return this.v8Runtime.createV8ValueLong(j2);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueLongObject createV8ValueLongObject(long j2) throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return this.v8Runtime.createV8ValueLongObject(j2);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueMap createV8ValueMap() throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return (V8ValueMap) add(this.v8Runtime.createV8ValueMap());
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueNull createV8ValueNull() {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return this.v8Runtime.createV8ValueNull();
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueObject createV8ValueObject() throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return (V8ValueObject) add(this.v8Runtime.createV8ValueObject());
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValuePromise createV8ValuePromise() throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return (V8ValuePromise) add(this.v8Runtime.createV8ValuePromise());
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueProxy createV8ValueProxy(V8Value v8Value) throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return (V8ValueProxy) add(this.v8Runtime.createV8ValueProxy(v8Value));
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueSet createV8ValueSet() throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return (V8ValueSet) add(this.v8Runtime.createV8ValueSet());
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueString createV8ValueString(String str) throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return this.v8Runtime.createV8ValueString(str);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueStringObject createV8ValueStringObject(String str) throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        V8Runtime v8Runtime = this.v8Runtime;
        Objects.requireNonNull(str);
        return v8Runtime.createV8ValueStringObject(str);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueSymbol createV8ValueSymbol(String str, boolean z2) throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return (V8ValueSymbol) add(this.v8Runtime.createV8ValueSymbol(str, z2));
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueTypedArray createV8ValueTypedArray(V8ValueReferenceType v8ValueReferenceType, int i2) throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return (V8ValueTypedArray) add(this.v8Runtime.createV8ValueTypedArray(v8ValueReferenceType, i2));
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueUndefined createV8ValueUndefined() {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return this.v8Runtime.createV8ValueUndefined();
    }

    public <T extends V8Value> T get(int i2) {
        return (T) this.values.get(i2);
    }

    @Override // com.caoccao.javet.interfaces.IJavetClosable
    public boolean isClosed() {
        return this.closed;
    }

    public boolean isEscapable() {
        return this.escapable;
    }

    public V8Scope setEscapable(boolean z2) {
        this.escapable = z2;
        return this;
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueArrayBuffer createV8ValueArrayBuffer(ByteBuffer byteBuffer) throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return (V8ValueArrayBuffer) add(this.v8Runtime.createV8ValueArrayBuffer(byteBuffer));
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueBigInteger createV8ValueBigInteger(String str) throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return (V8ValueBigInteger) add(this.v8Runtime.createV8ValueBigInteger(str));
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueFunction createV8ValueFunction(String str) throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return (V8ValueFunction) add(this.v8Runtime.createV8ValueFunction(str));
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueZonedDateTime createV8ValueZonedDateTime(ZonedDateTime zonedDateTime) throws JavetException {
        Objects.requireNonNull(this.v8Runtime, ERROR_MESSAGE_V8_RUNTIME_CANNOT_BE_EMPTY);
        return this.v8Runtime.createV8ValueZonedDateTime(zonedDateTime);
    }
}
