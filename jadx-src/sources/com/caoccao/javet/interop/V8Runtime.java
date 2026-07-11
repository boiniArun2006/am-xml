package com.caoccao.javet.interop;

import com.caoccao.javet.enums.JSFunctionType;
import com.caoccao.javet.enums.JSRuntimeType;
import com.caoccao.javet.enums.JSScopeType;
import com.caoccao.javet.enums.JavetPromiseRejectEvent;
import com.caoccao.javet.enums.V8AllocationSpace;
import com.caoccao.javet.enums.V8AwaitMode;
import com.caoccao.javet.enums.V8GCCallbackFlags;
import com.caoccao.javet.enums.V8GCType;
import com.caoccao.javet.enums.V8ValueErrorType;
import com.caoccao.javet.enums.V8ValueInternalType;
import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.exceptions.JavetExecutionException;
import com.caoccao.javet.exceptions.JavetScriptingError;
import com.caoccao.javet.exceptions.V8ErrorTemplate;
import com.caoccao.javet.interfaces.IEnumBitset;
import com.caoccao.javet.interfaces.IJavetClosable;
import com.caoccao.javet.interfaces.IJavetLogger;
import com.caoccao.javet.interop.callback.IJavetGCCallback;
import com.caoccao.javet.interop.callback.IJavetPromiseRejectCallback;
import com.caoccao.javet.interop.callback.IV8ModuleResolver;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import com.caoccao.javet.interop.callback.JavetPromiseRejectCallback;
import com.caoccao.javet.interop.converters.IJavetConverter;
import com.caoccao.javet.interop.converters.JavetObjectConverter;
import com.caoccao.javet.interop.executors.IV8Executor;
import com.caoccao.javet.interop.executors.V8FileExecutor;
import com.caoccao.javet.interop.executors.V8PathExecutor;
import com.caoccao.javet.interop.executors.V8StringExecutor;
import com.caoccao.javet.interop.monitoring.V8HeapSpaceStatistics;
import com.caoccao.javet.interop.monitoring.V8HeapStatistics;
import com.caoccao.javet.interop.monitoring.V8SharedMemoryStatistics;
import com.caoccao.javet.interop.monitoring.V8StatisticsFuture;
import com.caoccao.javet.interop.options.RuntimeOptions;
import com.caoccao.javet.utils.JavetDefaultLogger;
import com.caoccao.javet.utils.JavetResourceUtils;
import com.caoccao.javet.utils.SimpleMap;
import com.caoccao.javet.utils.StringUtils;
import com.caoccao.javet.values.IV8ValueNonProxyable;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueBigInteger;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.caoccao.javet.values.primitive.V8ValueDouble;
import com.caoccao.javet.values.primitive.V8ValueInteger;
import com.caoccao.javet.values.primitive.V8ValueLong;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.caoccao.javet.values.primitive.V8ValueNumber;
import com.caoccao.javet.values.primitive.V8ValueString;
import com.caoccao.javet.values.primitive.V8ValueUndefined;
import com.caoccao.javet.values.primitive.V8ValueZonedDateTime;
import com.caoccao.javet.values.reference.IV8Context;
import com.caoccao.javet.values.reference.IV8Module;
import com.caoccao.javet.values.reference.IV8Script;
import com.caoccao.javet.values.reference.IV8ValueArray;
import com.caoccao.javet.values.reference.IV8ValueFunction;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.caoccao.javet.values.reference.IV8ValueObject;
import com.caoccao.javet.values.reference.IV8ValuePromise;
import com.caoccao.javet.values.reference.IV8ValueProxy;
import com.caoccao.javet.values.reference.IV8ValueReference;
import com.caoccao.javet.values.reference.IV8ValueSet;
import com.caoccao.javet.values.reference.IV8ValueTypedArray;
import com.caoccao.javet.values.reference.V8Context;
import com.caoccao.javet.values.reference.V8Module;
import com.caoccao.javet.values.reference.V8Script;
import com.caoccao.javet.values.reference.V8ValueArray;
import com.caoccao.javet.values.reference.V8ValueArrayBuffer;
import com.caoccao.javet.values.reference.V8ValueBooleanObject;
import com.caoccao.javet.values.reference.V8ValueDataView;
import com.caoccao.javet.values.reference.V8ValueDoubleObject;
import com.caoccao.javet.values.reference.V8ValueError;
import com.caoccao.javet.values.reference.V8ValueFunction;
import com.caoccao.javet.values.reference.V8ValueGlobalObject;
import com.caoccao.javet.values.reference.V8ValueIntegerObject;
import com.caoccao.javet.values.reference.V8ValueLongObject;
import com.caoccao.javet.values.reference.V8ValueMap;
import com.caoccao.javet.values.reference.V8ValueObject;
import com.caoccao.javet.values.reference.V8ValuePromise;
import com.caoccao.javet.values.reference.V8ValueProxy;
import com.caoccao.javet.values.reference.V8ValueSet;
import com.caoccao.javet.values.reference.V8ValueStringObject;
import com.caoccao.javet.values.reference.V8ValueSymbol;
import com.caoccao.javet.values.reference.V8ValueSymbolObject;
import com.caoccao.javet.values.reference.V8ValueTypedArray;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.caoccao.javet.values.virtual.V8VirtualValue;
import j$.time.ZonedDateTime;
import java.io.File;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class V8Runtime implements IJavetClosable, IV8Creatable, IV8Convertible {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final IJavetConverter DEFAULT_CONVERTER = new JavetObjectConverter();
    static final String DEFAULT_MESSAGE_FORMAT_JAVET_INSPECTOR = "Javet Inspector {0}";
    protected static final String ERROR_BYTE_BUFFER_MUST_BE_DIRECT = "Byte buffer must be direct.";
    protected static final String ERROR_HANDLE_MUST_BE_VALID = "Handle must be valid.";
    protected static final String ERROR_SYMBOL_DESCRIPTION_CANNOT_BE_EMPTY = "Symbol description cannot be empty.";
    protected static final String ERROR_THE_KEY_VALUE_PAIR_MUST_MATCH = "The key value pair must match.";
    protected static final String ERROR_THE_PROPERTY_NAME_MUST_BE_EITHER_STRING_OR_SYMBOL = "The property name must be either string or symbol.";
    protected static final String ERROR_VALUE_CANNOT_BE_A_V_8_CONTEXT = "Value cannot be a V8 context.";
    protected static final String ERROR_VALUE_CANNOT_BE_A_V_8_MODULE = "Value cannot be a V8 module.";
    protected static final String ERROR_VALUE_CANNOT_BE_A_V_8_SCRIPT = "Value cannot be a V8 script.";
    static final long INVALID_HANDLE = 0;
    static final String PROPERTY_DATA_VIEW = "DataView";
    static final int V8_VALUE_BOOLEAN_FALSE_INDEX = 0;
    static final int V8_VALUE_BOOLEAN_TRUE_INDEX = 1;
    static final int V8_VALUE_NUMBER_LOWER_BOUND = -128;
    static final int V8_VALUE_NUMBER_UPPER_BOUND = 128;
    V8ValueBoolean[] cachedV8ValueBooleans;
    V8ValueInteger[] cachedV8ValueIntegers;
    V8ValueLong[] cachedV8ValueLongs;
    V8ValueNull cachedV8ValueNull;
    V8ValueUndefined cachedV8ValueUndefined;
    final Object callbackContextLock = new Object();
    final Map<Long, JavetCallbackContext> callbackContextMap = new HashMap();
    Object closeLock = new Object();
    IJavetConverter converter = DEFAULT_CONVERTER;
    final List<IJavetGCCallback> gcEpilogueCallbacks = new CopyOnWriteArrayList();
    final List<IJavetGCCallback> gcPrologueCallbacks = new CopyOnWriteArrayList();
    boolean gcScheduled = false;
    long handle;
    final JSRuntimeType jsRuntimeType;
    IJavetLogger logger;
    boolean pooled;
    final boolean[] primitiveFlags;
    IJavetPromiseRejectCallback promiseRejectCallback;
    final Object referenceLock;
    final Map<Long, IV8ValueReference> referenceMap;
    final RuntimeOptions<?> runtimeOptions;
    final V8Host v8Host;
    V8Inspector v8Inspector;
    final V8Internal v8Internal;
    final Object v8ModuleLock;
    final Map<String, IV8Module> v8ModuleMap;
    IV8ModuleResolver v8ModuleResolver;
    IV8Native v8Native;

    int arrayGetLength(IV8ValueArray iV8ValueArray) throws JavetException {
        return this.v8Native.arrayGetLength(this.handle, iV8ValueArray.getHandle(), iV8ValueArray.getType().getId());
    }

    public boolean await() {
        return await(V8AwaitMode.RunTillNoMoreTasks);
    }

    @Override // com.caoccao.javet.interfaces.IJavetClosable, java.lang.AutoCloseable
    public void close() throws JavetException {
        close(!this.pooled);
    }

    public V8Module compileV8Module(String str, byte[] bArr, V8ScriptOrigin v8ScriptOrigin, boolean z2) throws JavetException {
        v8ScriptOrigin.setModule(true);
        if (StringUtils.isEmpty(v8ScriptOrigin.getResourceName())) {
            throw new JavetException(JavetError.ModuleNameEmpty);
        }
        Object objModuleCompile = this.v8Native.moduleCompile(this.handle, str, bArr, z2, v8ScriptOrigin.getResourceName(), v8ScriptOrigin.getResourceLineOffset(), v8ScriptOrigin.getResourceColumnOffset(), v8ScriptOrigin.getScriptId(), v8ScriptOrigin.isWasm(), v8ScriptOrigin.isModule());
        if (!z2 || !(objModuleCompile instanceof V8Module)) {
            return null;
        }
        V8Module v8Module = (V8Module) objModuleCompile;
        addV8Module(v8Module);
        return v8Module;
    }

    public V8Script compileV8Script(String str, byte[] bArr, V8ScriptOrigin v8ScriptOrigin, boolean z2) throws JavetException {
        v8ScriptOrigin.setModule(false);
        return (V8Script) this.v8Native.scriptCompile(this.handle, str, bArr, z2, v8ScriptOrigin.getResourceName(), v8ScriptOrigin.getResourceLineOffset(), v8ScriptOrigin.getResourceColumnOffset(), v8ScriptOrigin.getScriptId(), v8ScriptOrigin.isWasm(), v8ScriptOrigin.isModule());
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueArrayBuffer createV8ValueArrayBuffer(int i2) throws JavetException {
        return (V8ValueArrayBuffer) this.v8Native.arrayBufferCreate(this.handle, i2);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueBigInteger createV8ValueBigInteger(BigInteger bigInteger) throws JavetException {
        return new V8ValueBigInteger(this, bigInteger);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueFunction createV8ValueFunction(JavetCallbackContext javetCallbackContext) throws JavetException {
        IV8Native iV8Native = this.v8Native;
        long j2 = this.handle;
        Objects.requireNonNull(javetCallbackContext);
        V8ValueFunction v8ValueFunction = (V8ValueFunction) iV8Native.functionCreate(j2, javetCallbackContext);
        synchronized (this.callbackContextLock) {
            this.callbackContextMap.put(Long.valueOf(javetCallbackContext.getHandle()), javetCallbackContext);
        }
        return v8ValueFunction;
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueZonedDateTime createV8ValueZonedDateTime(long j2) throws JavetException {
        return new V8ValueZonedDateTime(this, j2);
    }

    public IV8Executor getExecutor(File file) throws JavetException {
        return new V8FileExecutor(this, file);
    }

    public V8Guard getGuard() {
        return new V8Guard(this);
    }

    public V8Inspector getV8Inspector() {
        return getV8Inspector(MessageFormat.format(DEFAULT_MESSAGE_FORMAT_JAVET_INSPECTOR, Long.toString(this.handle)));
    }

    void initializeV8ValueCache() {
        try {
            this.cachedV8ValueNull = new V8ValueNull(this);
            this.cachedV8ValueUndefined = new V8ValueUndefined(this);
            this.cachedV8ValueBooleans = new V8ValueBoolean[]{new V8ValueBoolean(this, false), new V8ValueBoolean(this, true)};
            this.cachedV8ValueIntegers = new V8ValueInteger[256];
            this.cachedV8ValueLongs = new V8ValueLong[256];
            for (int i2 = V8_VALUE_NUMBER_LOWER_BOUND; i2 < 128; i2++) {
                try {
                    int i3 = i2 + 128;
                    this.cachedV8ValueIntegers[i3] = new V8ValueInteger(this, i2);
                    this.cachedV8ValueLongs[i3] = new V8ValueLong(this, i2);
                } catch (JavetException e2) {
                    this.logger.logError(e2, e2.getMessage(), new Object[0]);
                }
            }
        } catch (JavetException e3) {
            this.logger.logError(e3, e3.getMessage(), new Object[0]);
        }
    }

    void receivePromiseRejectCallback(int i2, V8ValuePromise v8ValuePromise, V8Value v8Value) {
        try {
            this.promiseRejectCallback.callback(JavetPromiseRejectEvent.parse(i2), v8ValuePromise, v8Value);
            JavetResourceUtils.safeClose(v8ValuePromise, v8Value);
        } catch (Throwable th) {
            try {
                this.logger.logError(th, "Failed to process promise reject callback {0}.", Integer.valueOf(i2));
                JavetResourceUtils.safeClose(v8ValuePromise, v8Value);
            } catch (Throwable th2) {
                JavetResourceUtils.safeClose(v8ValuePromise, v8Value);
                throw th2;
            }
        }
    }

    public void removeV8Module(String str, boolean z2) throws JavetException {
        IV8Module iV8ModuleRemove;
        synchronized (this.v8ModuleLock) {
            iV8ModuleRemove = this.v8ModuleMap.remove(str);
        }
        if (!z2 || iV8ModuleRemove == null) {
            return;
        }
        iV8ModuleRemove.close(true);
    }

    public void removeV8Modules() throws JavetException {
        removeV8Modules(false);
    }

    public boolean throwError(V8ValueErrorType v8ValueErrorType, String str) {
        IV8Native iV8Native = this.v8Native;
        long j2 = this.handle;
        Objects.requireNonNull(v8ValueErrorType);
        int id = v8ValueErrorType.getId();
        Objects.requireNonNull(str);
        return iV8Native.throwError(j2, id, str);
    }

    /* JADX INFO: renamed from: com.caoccao.javet.interop.V8Runtime$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType;

        static {
            int[] iArr = new int[V8ValueReferenceType.values().length];
            $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType = iArr;
            try {
                iArr[V8ValueReferenceType.Int8Array.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Uint8Array.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Uint8ClampedArray.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Int16Array.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Uint16Array.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Int32Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Uint32Array.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Float16Array.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Float32Array.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Float64Array.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.BigInt64Array.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.BigUint64Array.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public void addGCEpilogueCallback(IJavetGCCallback iJavetGCCallback) {
        synchronized (this.gcEpilogueCallbacks) {
            try {
                boolean zIsEmpty = this.gcEpilogueCallbacks.isEmpty();
                List<IJavetGCCallback> list = this.gcEpilogueCallbacks;
                Objects.requireNonNull(iJavetGCCallback);
                list.add(iJavetGCCallback);
                if (zIsEmpty) {
                    this.v8Native.registerGCEpilogueCallback(this.handle);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addGCPrologueCallback(IJavetGCCallback iJavetGCCallback) {
        synchronized (this.gcPrologueCallbacks) {
            try {
                boolean zIsEmpty = this.gcPrologueCallbacks.isEmpty();
                List<IJavetGCCallback> list = this.gcPrologueCallbacks;
                Objects.requireNonNull(iJavetGCCallback);
                list.add(iJavetGCCallback);
                if (zIsEmpty) {
                    this.v8Native.registerGCPrologueCallback(this.handle);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void addReference(IV8ValueReference iV8ValueReference) {
        synchronized (this.referenceLock) {
            this.referenceMap.put(Long.valueOf(iV8ValueReference.getHandle()), iV8ValueReference);
        }
    }

    public void allowEval(boolean z2) {
        this.v8Native.allowCodeGenerationFromStrings(this.handle, z2);
    }

    int arrayGetLength(IV8ValueTypedArray iV8ValueTypedArray) throws JavetException {
        return this.v8Native.arrayGetLength(this.handle, iV8ValueTypedArray.getHandle(), iV8ValueTypedArray.getType().getId());
    }

    public boolean await(V8AwaitMode v8AwaitMode) {
        IV8Native iV8Native = this.v8Native;
        long j2 = this.handle;
        Objects.requireNonNull(v8AwaitMode);
        return iV8Native.await(j2, v8AwaitMode.getId());
    }

    int batchArrayGet(IV8ValueArray iV8ValueArray, V8Value[] v8ValueArr, int i2, int i3) throws JavetException {
        return this.v8Native.batchArrayGet(this.handle, iV8ValueArray.getHandle(), iV8ValueArray.getType().getId(), v8ValueArr, i2, i3);
    }

    int batchObjectGet(IV8ValueObject iV8ValueObject, V8Value[] v8ValueArr, V8Value[] v8ValueArr2, int i2) throws JavetException {
        return this.v8Native.batchObjectGet(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), v8ValueArr, v8ValueArr2, i2);
    }

    V8ValueBoolean booleanObjectValueOf(V8ValueBooleanObject v8ValueBooleanObject) {
        IV8Native iV8Native = this.v8Native;
        long j2 = this.handle;
        Objects.requireNonNull(v8ValueBooleanObject);
        return (V8ValueBoolean) iV8Native.booleanObjectValueOf(j2, v8ValueBooleanObject.getHandle(), v8ValueBooleanObject.getType().getId());
    }

    void clearWeak(IV8ValueReference iV8ValueReference) throws JavetException {
        this.v8Native.clearWeak(this.handle, iV8ValueReference.getHandle(), iV8ValueReference.getType().getId());
    }

    <T extends V8Value> T cloneV8Value(IV8ValueReference iV8ValueReference, boolean z2) throws JavetException {
        return (T) this.v8Native.cloneV8Value(this.handle, iV8ValueReference.getHandle(), iV8ValueReference.getType().getId(), z2);
    }

    public void close(boolean z2) throws JavetException {
        if (isClosed() || !z2) {
            return;
        }
        removeAllReferences();
        synchronized (this.closeLock) {
            this.v8Host.closeV8Runtime(this);
            this.handle = 0L;
            this.v8Native = null;
        }
    }

    public V8ValueFunction compileV8ValueFunction(String str, byte[] bArr, V8ScriptOrigin v8ScriptOrigin, String[] strArr, V8ValueObject[] v8ValueObjectArr) throws JavetException {
        return (V8ValueFunction) this.v8Native.functionCompile(this.handle, str, bArr, v8ScriptOrigin.getResourceName(), v8ScriptOrigin.getResourceLineOffset(), v8ScriptOrigin.getResourceColumnOffset(), v8ScriptOrigin.getScriptId(), v8ScriptOrigin.isWasm(), strArr, v8ValueObjectArr);
    }

    public boolean containsV8Module(String str) {
        boolean zContainsKey;
        synchronized (this.v8ModuleLock) {
            zContainsKey = this.v8ModuleMap.containsKey(str);
        }
        return zContainsKey;
    }

    <T extends V8Value> T contextGet(IV8Context iV8Context, int i2) throws JavetException {
        return (T) this.v8Native.contextGet(this.handle, iV8Context.getHandle(), iV8Context.getType().getId(), i2);
    }

    int contextGetLength(IV8Context iV8Context) throws JavetException {
        return this.v8Native.contextGetLength(this.handle, iV8Context.getHandle(), iV8Context.getType().getId());
    }

    boolean contextIsContextType(IV8Context iV8Context, int i2) throws JavetException {
        return this.v8Native.contextIsContextType(this.handle, iV8Context.getHandle(), iV8Context.getType().getId(), i2);
    }

    boolean contextSetLength(IV8Context iV8Context, int i2) throws JavetException {
        return this.v8Native.contextSetLength(this.handle, iV8Context.getHandle(), iV8Context.getType().getId(), i2);
    }

    public byte[] createSnapshot() throws JavetException {
        if (!this.runtimeOptions.isCreateSnapshotEnabled()) {
            throw new JavetException(JavetError.RuntimeCreateSnapshotDisabled);
        }
        int callbackContextCount = getCallbackContextCount();
        int referenceCount = getReferenceCount();
        int v8ModuleCount = getV8ModuleCount();
        if (callbackContextCount > 0 || referenceCount > 0 || v8ModuleCount > 0) {
            throw new JavetException(JavetError.RuntimeCreateSnapshotBlocked, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_CALLBACK_CONTEXT_COUNT, Integer.valueOf(callbackContextCount), JavetError.PARAMETER_REFERENCE_COUNT, Integer.valueOf(referenceCount), JavetError.PARAMETER_V8_MODULE_COUNT, Integer.valueOf(v8ModuleCount)));
        }
        return this.v8Native.snapshotCreate(this.handle);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueArray createV8ValueArray() throws JavetException {
        return (V8ValueArray) this.v8Native.arrayCreate(this.handle);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueArrayBuffer createV8ValueArrayBuffer(ByteBuffer byteBuffer) throws JavetException {
        Objects.requireNonNull(byteBuffer);
        return (V8ValueArrayBuffer) this.v8Native.arrayBufferCreate(this.handle, byteBuffer);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueBigInteger createV8ValueBigInteger(String str) throws JavetException {
        return new V8ValueBigInteger(this, str);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueBoolean createV8ValueBoolean(boolean z2) throws JavetException {
        return this.cachedV8ValueBooleans[z2 ? 1 : 0];
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueBooleanObject createV8ValueBooleanObject(boolean z2) throws JavetException {
        return (V8ValueBooleanObject) this.v8Native.booleanObjectCreate(this.handle, z2);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueDouble createV8ValueDouble(double d2) throws JavetException {
        return new V8ValueDouble(this, d2);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueDoubleObject createV8ValueDoubleObject(double d2) throws JavetException {
        return (V8ValueDoubleObject) this.v8Native.doubleObjectCreate(this.handle, d2);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueError createV8ValueError(V8ValueErrorType v8ValueErrorType, String str) throws JavetException {
        IV8Native iV8Native = this.v8Native;
        long j2 = this.handle;
        Objects.requireNonNull(v8ValueErrorType);
        int id = v8ValueErrorType.getId();
        Objects.requireNonNull(str);
        return (V8ValueError) iV8Native.errorCreate(j2, id, str);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueInteger createV8ValueInteger(int i2) throws JavetException {
        return (i2 < V8_VALUE_NUMBER_LOWER_BOUND || i2 >= 128) ? new V8ValueInteger(this, i2) : this.cachedV8ValueIntegers[i2 - V8_VALUE_NUMBER_LOWER_BOUND];
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueIntegerObject createV8ValueIntegerObject(int i2) throws JavetException {
        return ((V8ValueDoubleObject) this.v8Native.integerObjectCreate(this.handle, i2)).toIntegerObject();
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueLong createV8ValueLong(long j2) throws JavetException {
        return (j2 < -128 || j2 >= 128) ? new V8ValueLong(this, j2) : this.cachedV8ValueLongs[((int) j2) + 128];
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueLongObject createV8ValueLongObject(long j2) throws JavetException {
        return (V8ValueLongObject) this.v8Native.longObjectCreate(this.handle, j2);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueMap createV8ValueMap() throws JavetException {
        return (V8ValueMap) this.v8Native.mapCreate(this.handle);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueNull createV8ValueNull() {
        return this.cachedV8ValueNull;
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueObject createV8ValueObject() throws JavetException {
        return (V8ValueObject) this.v8Native.objectCreate(this.handle);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValuePromise createV8ValuePromise() throws JavetException {
        return (V8ValuePromise) this.v8Native.promiseCreate(this.handle);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueProxy createV8ValueProxy(V8Value v8Value) throws JavetException {
        if (v8Value instanceof IV8ValueNonProxyable) {
            throw new JavetException(JavetError.NotSupported, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_FEATURE, v8Value.toString()));
        }
        return (V8ValueProxy) this.v8Native.proxyCreate(this.handle, v8Value);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueSet createV8ValueSet() throws JavetException {
        return (V8ValueSet) this.v8Native.setCreate(this.handle);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueString createV8ValueString(String str) throws JavetException {
        return new V8ValueString(this, str);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueStringObject createV8ValueStringObject(String str) throws JavetException {
        return (V8ValueStringObject) this.v8Native.stringObjectCreate(this.handle, str);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueSymbol createV8ValueSymbol(String str, boolean z2) throws JavetException {
        if (!z2) {
            return (V8ValueSymbol) this.v8Native.symbolCreate(this.handle, str);
        }
        V8ValueBuiltInSymbol builtInSymbol = getGlobalObject().getBuiltInSymbol();
        try {
            V8ValueSymbol v8ValueSymbol_for = builtInSymbol._for(str);
            builtInSymbol.close();
            return v8ValueSymbol_for;
        } catch (Throwable th) {
            if (builtInSymbol != null) {
                try {
                    builtInSymbol.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueTypedArray createV8ValueTypedArray(V8ValueReferenceType v8ValueReferenceType, int i2) throws JavetException {
        switch (AnonymousClass1.$SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[v8ValueReferenceType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                V8Value v8Value = getGlobalObject().get(v8ValueReferenceType.getName());
                try {
                    if (v8Value instanceof V8ValueFunction) {
                        V8ValueTypedArray v8ValueTypedArray = (V8ValueTypedArray) ((V8ValueFunction) v8Value).callAsConstructor(createV8ValueInteger(i2));
                        if (v8Value != null) {
                            v8Value.close();
                        }
                        return v8ValueTypedArray;
                    }
                    if (v8Value != null) {
                        v8Value.close();
                    }
                } catch (Throwable th) {
                    if (v8Value != null) {
                        try {
                            v8Value.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        break;
                    }
                    throw th;
                }
                break;
        }
        throw new JavetException(JavetError.NotSupported, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_FEATURE, v8ValueReferenceType.getName()));
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueUndefined createV8ValueUndefined() {
        return this.cachedV8ValueUndefined;
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueZonedDateTime createV8ValueZonedDateTime(ZonedDateTime zonedDateTime) throws JavetException {
        return new V8ValueZonedDateTime(this, zonedDateTime);
    }

    V8ValueNumber<?> doubleObjectValueOf(V8ValueDoubleObject v8ValueDoubleObject) {
        IV8Native iV8Native = this.v8Native;
        long j2 = this.handle;
        Objects.requireNonNull(v8ValueDoubleObject);
        return (V8ValueNumber) iV8Native.doubleObjectValueOf(j2, v8ValueDoubleObject.getHandle(), v8ValueDoubleObject.getType().getId());
    }

    boolean equals(IV8ValueReference iV8ValueReference, IV8ValueReference iV8ValueReference2) throws JavetException {
        return this.v8Native.equals(this.handle, iV8ValueReference.getHandle(), iV8ValueReference2.getHandle());
    }

    <T extends V8Value> T functionCall(IV8ValueObject iV8ValueObject, V8Value v8Value, boolean z2, V8Value... v8ValueArr) throws JavetException {
        return (T) this.v8Native.functionCall(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), v8Value, z2, v8ValueArr);
    }

    <T extends V8Value> T functionCallAsConstructor(IV8ValueObject iV8ValueObject, V8Value... v8ValueArr) throws JavetException {
        return (T) this.v8Native.functionCallAsConstructor(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), v8ValueArr);
    }

    boolean functionCanDiscardCompiled(IV8ValueFunction iV8ValueFunction) {
        return this.v8Native.functionCanDiscardCompiled(this.handle, iV8ValueFunction.getHandle(), iV8ValueFunction.getType().getId());
    }

    boolean functionCopyScopeInfoFrom(IV8ValueFunction iV8ValueFunction, IV8ValueFunction iV8ValueFunction2) throws JavetException {
        return this.v8Native.functionCopyScopeInfoFrom(this.handle, iV8ValueFunction.getHandle(), iV8ValueFunction.getType().getId(), iV8ValueFunction2.getHandle(), iV8ValueFunction2.getType().getId());
    }

    boolean functionDiscardCompiled(IV8ValueFunction iV8ValueFunction) {
        return this.v8Native.functionDiscardCompiled(this.handle, iV8ValueFunction.getHandle(), iV8ValueFunction.getType().getId());
    }

    String[] functionGetArguments(IV8ValueFunction iV8ValueFunction) throws JavetException {
        return this.v8Native.functionGetArguments(this.handle, iV8ValueFunction.getHandle(), iV8ValueFunction.getType().getId());
    }

    byte[] functionGetCachedData(IV8ValueFunction iV8ValueFunction) throws JavetException {
        return this.v8Native.functionGetCachedData(this.handle, iV8ValueFunction.getHandle(), iV8ValueFunction.getType().getId());
    }

    V8Context functionGetContext(IV8ValueFunction iV8ValueFunction) throws JavetException {
        return (V8Context) this.v8Native.functionGetContext(this.handle, iV8ValueFunction.getHandle(), iV8ValueFunction.getType().getId());
    }

    IV8ValueArray functionGetInternalProperties(IV8ValueFunction iV8ValueFunction) throws JavetException {
        return (V8ValueArray) this.v8Native.functionGetInternalProperties(this.handle, iV8ValueFunction.getHandle(), iV8ValueFunction.getType().getId());
    }

    JSFunctionType functionGetJSFunctionType(IV8ValueFunction iV8ValueFunction) {
        return JSFunctionType.parse(this.v8Native.functionGetJSFunctionType(this.handle, iV8ValueFunction.getHandle(), iV8ValueFunction.getType().getId()));
    }

    JSScopeType functionGetJSScopeType(IV8ValueFunction iV8ValueFunction) {
        return JSScopeType.parse(this.v8Native.functionGetJSScopeType(this.handle, iV8ValueFunction.getHandle(), iV8ValueFunction.getType().getId()), this.v8Host.getJSRuntimeType());
    }

    IV8ValueArray functionGetScopeInfos(IV8ValueFunction iV8ValueFunction, IV8ValueFunction.GetScopeInfosOptions getScopeInfosOptions) throws JavetException {
        return (IV8ValueArray) this.v8Native.functionGetScopeInfos(this.handle, iV8ValueFunction.getHandle(), iV8ValueFunction.getType().getId(), getScopeInfosOptions.isIncludeGlobalVariables(), getScopeInfosOptions.isIncludeScopeTypeGlobal());
    }

    IV8ValueFunction.ScriptSource functionGetScriptSource(IV8ValueFunction iV8ValueFunction) throws JavetException {
        return (IV8ValueFunction.ScriptSource) this.v8Native.functionGetScriptSource(this.handle, iV8ValueFunction.getHandle(), iV8ValueFunction.getType().getId());
    }

    String functionGetSourceCode(IV8ValueFunction iV8ValueFunction) throws JavetException {
        return this.v8Native.functionGetSourceCode(this.handle, iV8ValueFunction.getHandle(), iV8ValueFunction.getType().getId());
    }

    boolean functionIsCompiled(IV8ValueFunction iV8ValueFunction) {
        return this.v8Native.functionIsCompiled(this.handle, iV8ValueFunction.getHandle(), iV8ValueFunction.getType().getId());
    }

    boolean functionIsWrapped(IV8ValueFunction iV8ValueFunction) {
        return this.v8Native.functionIsWrapped(this.handle, iV8ValueFunction.getHandle(), iV8ValueFunction.getType().getId());
    }

    boolean functionSetContext(IV8ValueFunction iV8ValueFunction, V8Context v8Context) throws JavetException {
        return this.v8Native.functionSetContext(this.handle, iV8ValueFunction.getHandle(), iV8ValueFunction.getType().getId(), v8Context);
    }

    boolean functionSetScriptSource(IV8ValueFunction iV8ValueFunction, IV8ValueFunction.ScriptSource scriptSource, boolean z2) throws JavetException {
        return this.v8Native.functionSetScriptSource(this.handle, iV8ValueFunction.getHandle(), iV8ValueFunction.getType().getId(), scriptSource, z2);
    }

    boolean functionSetSourceCode(IV8ValueFunction iV8ValueFunction, String str, boolean z2) throws JavetException {
        return this.v8Native.functionSetSourceCode(this.handle, iV8ValueFunction.getHandle(), iV8ValueFunction.getType().getId(), str, z2);
    }

    public JavetCallbackContext getCallbackContext(long j2) {
        JavetCallbackContext javetCallbackContext;
        synchronized (this.callbackContextLock) {
            javetCallbackContext = this.callbackContextMap.get(Long.valueOf(j2));
        }
        return javetCallbackContext;
    }

    public int getCallbackContextCount() {
        return this.callbackContextMap.size();
    }

    Object getCloseLock() {
        return this.closeLock;
    }

    public IJavetConverter getConverter() {
        return this.converter;
    }

    public IV8Executor getExecutor(Path path) throws JavetException {
        return new V8PathExecutor(this, path);
    }

    public V8ValueGlobalObject getGlobalObject() throws JavetException {
        return (V8ValueGlobalObject) this.v8Native.getGlobalObject(this.handle);
    }

    public V8Guard getGuard(long j2) {
        return new V8Guard(this, j2);
    }

    public long getHandle() {
        return this.handle;
    }

    public JSRuntimeType getJSRuntimeType() {
        return this.jsRuntimeType;
    }

    public IJavetLogger getLogger() {
        return this.logger;
    }

    public IJavetPromiseRejectCallback getPromiseRejectCallback() {
        return this.promiseRejectCallback;
    }

    public int getReferenceCount() {
        return this.referenceMap.size();
    }

    public RuntimeOptions<?> getRuntimeOptions() {
        return this.runtimeOptions;
    }

    public CompletableFuture<V8HeapSpaceStatistics> getV8HeapSpaceStatistics(V8AllocationSpace v8AllocationSpace) {
        IV8Native iV8Native = this.v8Native;
        long j2 = this.handle;
        Objects.requireNonNull(v8AllocationSpace);
        V8StatisticsFuture<?> v8StatisticsFuture = (V8StatisticsFuture) iV8Native.getV8HeapSpaceStatistics(j2, v8AllocationSpace);
        if (!v8StatisticsFuture.isDone()) {
            this.v8Host.offerV8StatisticsFuture(v8StatisticsFuture);
        }
        return v8StatisticsFuture;
    }

    public CompletableFuture<V8HeapStatistics> getV8HeapStatistics() {
        V8StatisticsFuture<?> v8StatisticsFuture = (V8StatisticsFuture) this.v8Native.getV8HeapStatistics(this.handle);
        if (!v8StatisticsFuture.isDone()) {
            this.v8Host.offerV8StatisticsFuture(v8StatisticsFuture);
        }
        return v8StatisticsFuture;
    }

    V8Host getV8Host() {
        return this.v8Host;
    }

    public V8Inspector getV8Inspector(String str) {
        if (this.v8Inspector == null) {
            this.v8Inspector = new V8Inspector(this, str, this.v8Native);
        }
        return this.v8Inspector;
    }

    public V8Internal getV8Internal() {
        return this.v8Internal;
    }

    public V8Locker getV8Locker() throws JavetException {
        return new V8Locker(this, this.v8Native);
    }

    IV8Module getV8Module(String str, IV8Module iV8Module) throws JavetException {
        IV8Module iV8Module2;
        IV8ModuleResolver iV8ModuleResolver;
        IV8ModuleResolver iV8ModuleResolver2 = this.v8ModuleResolver;
        String absoluteResourceName = iV8ModuleResolver2 == null ? str : iV8ModuleResolver2.getAbsoluteResourceName(this, str, iV8Module);
        if (StringUtils.isEmpty(absoluteResourceName)) {
            return null;
        }
        synchronized (this.v8ModuleLock) {
            iV8Module2 = this.v8ModuleMap.get(absoluteResourceName);
        }
        return (iV8Module2 != null || (iV8ModuleResolver = this.v8ModuleResolver) == null) ? iV8Module2 : iV8ModuleResolver.resolve(this, str, iV8Module);
    }

    public int getV8ModuleCount() {
        return this.v8ModuleMap.size();
    }

    public IV8ModuleResolver getV8ModuleResolver() {
        return this.v8ModuleResolver;
    }

    public V8Scope getV8Scope() {
        return new V8Scope(this);
    }

    public V8SharedMemoryStatistics getV8SharedMemoryStatistics() {
        return this.v8Host.getV8SharedMemoryStatistics();
    }

    public String getVersion() {
        return this.v8Native.getVersion();
    }

    public boolean hasException() throws JavetException {
        return this.v8Native.hasException(this.handle);
    }

    boolean hasInternalType(IV8ValueObject iV8ValueObject, V8ValueInternalType v8ValueInternalType) {
        IV8Native iV8Native = this.v8Native;
        long j2 = this.handle;
        long handle = iV8ValueObject.getHandle();
        Objects.requireNonNull(v8ValueInternalType);
        return iV8Native.hasInternalType(j2, handle, v8ValueInternalType.getId());
    }

    public boolean hasPendingMessage() throws JavetException {
        return this.v8Native.hasPendingMessage(this.handle);
    }

    V8ValueInteger integerObjectValueOf(V8ValueIntegerObject v8ValueIntegerObject) throws JavetException {
        IV8Native iV8Native = this.v8Native;
        long j2 = this.handle;
        Objects.requireNonNull(v8ValueIntegerObject);
        return (V8ValueInteger) iV8Native.integerObjectValueOf(j2, v8ValueIntegerObject.getHandle(), v8ValueIntegerObject.getType().getId());
    }

    @Override // com.caoccao.javet.interfaces.IJavetClosable
    public boolean isClosed() {
        return this.handle == 0;
    }

    public boolean isDead() {
        return this.v8Native.isDead(this.handle);
    }

    public boolean isGCScheduled() {
        return this.gcScheduled;
    }

    public boolean isInUse() {
        return this.v8Native.isInUse(this.handle);
    }

    public boolean isPooled() {
        return this.pooled;
    }

    boolean isWeak(IV8ValueReference iV8ValueReference) {
        return this.v8Native.isWeak(this.handle, iV8ValueReference.getHandle(), iV8ValueReference.getType().getId());
    }

    V8ValueLong longObjectValueOf(V8ValueLongObject v8ValueLongObject) throws JavetException {
        IV8Native iV8Native = this.v8Native;
        long j2 = this.handle;
        Objects.requireNonNull(v8ValueLongObject);
        return (V8ValueLong) iV8Native.longObjectValueOf(j2, v8ValueLongObject.getHandle(), v8ValueLongObject.getType().getId());
    }

    V8ValueArray mapAsArray(IV8ValueMap iV8ValueMap) throws JavetException {
        return (V8ValueArray) this.v8Native.mapAsArray(this.handle, iV8ValueMap.getHandle(), iV8ValueMap.getType().getId());
    }

    void mapClear(IV8ValueMap iV8ValueMap) {
        this.v8Native.mapClear(this.handle, iV8ValueMap.getHandle(), iV8ValueMap.getType().getId());
    }

    boolean mapDelete(IV8ValueMap iV8ValueMap, V8Value v8Value) throws JavetException {
        return this.v8Native.mapDelete(this.handle, iV8ValueMap.getHandle(), iV8ValueMap.getType().getId(), v8Value);
    }

    <T extends V8Value> T mapGet(IV8ValueMap iV8ValueMap, V8Value v8Value) throws JavetException {
        return (T) this.v8Native.mapGet(this.handle, iV8ValueMap.getHandle(), iV8ValueMap.getType().getId(), v8Value);
    }

    Boolean mapGetBoolean(IV8ValueMap iV8ValueMap, V8Value v8Value) throws JavetException {
        this.primitiveFlags[0] = true;
        boolean zMapGetBoolean = this.v8Native.mapGetBoolean(this.handle, iV8ValueMap.getHandle(), iV8ValueMap.getType().getId(), v8Value, this.primitiveFlags);
        if (this.primitiveFlags[0]) {
            return Boolean.valueOf(zMapGetBoolean);
        }
        return null;
    }

    Double mapGetDouble(IV8ValueMap iV8ValueMap, V8Value v8Value) throws JavetException {
        this.primitiveFlags[0] = true;
        double dMapGetDouble = this.v8Native.mapGetDouble(this.handle, iV8ValueMap.getHandle(), iV8ValueMap.getType().getId(), v8Value, this.primitiveFlags);
        if (this.primitiveFlags[0]) {
            return Double.valueOf(dMapGetDouble);
        }
        return null;
    }

    Integer mapGetInteger(IV8ValueMap iV8ValueMap, V8Value v8Value) throws JavetException {
        this.primitiveFlags[0] = true;
        int iMapGetInteger = this.v8Native.mapGetInteger(this.handle, iV8ValueMap.getHandle(), iV8ValueMap.getType().getId(), v8Value, this.primitiveFlags);
        if (this.primitiveFlags[0]) {
            return Integer.valueOf(iMapGetInteger);
        }
        return null;
    }

    Long mapGetLong(IV8ValueMap iV8ValueMap, V8Value v8Value) throws JavetException {
        this.primitiveFlags[0] = true;
        long jMapGetLong = this.v8Native.mapGetLong(this.handle, iV8ValueMap.getHandle(), iV8ValueMap.getType().getId(), v8Value, this.primitiveFlags);
        if (this.primitiveFlags[0]) {
            return Long.valueOf(jMapGetLong);
        }
        return null;
    }

    int mapGetSize(IV8ValueMap iV8ValueMap) throws JavetException {
        return this.v8Native.mapGetSize(this.handle, iV8ValueMap.getHandle(), iV8ValueMap.getType().getId());
    }

    String mapGetString(IV8ValueMap iV8ValueMap, V8Value v8Value) throws JavetException {
        return this.v8Native.mapGetString(this.handle, iV8ValueMap.getHandle(), iV8ValueMap.getType().getId(), v8Value);
    }

    boolean mapHas(IV8ValueMap iV8ValueMap, V8Value v8Value) throws JavetException {
        return this.v8Native.mapHas(this.handle, iV8ValueMap.getHandle(), iV8ValueMap.getType().getId(), v8Value);
    }

    boolean mapSet(IV8ValueMap iV8ValueMap, V8Value... v8ValueArr) throws JavetException {
        return this.v8Native.mapSet(this.handle, iV8ValueMap.getHandle(), iV8ValueMap.getType().getId(), v8ValueArr);
    }

    boolean mapSetBoolean(IV8ValueMap iV8ValueMap, V8Value v8Value, boolean z2) throws JavetException {
        return this.v8Native.mapSetBoolean(this.handle, iV8ValueMap.getHandle(), iV8ValueMap.getType().getId(), v8Value, z2);
    }

    boolean mapSetDouble(IV8ValueMap iV8ValueMap, V8Value v8Value, double d2) throws JavetException {
        return this.v8Native.mapSetDouble(this.handle, iV8ValueMap.getHandle(), iV8ValueMap.getType().getId(), v8Value, d2);
    }

    boolean mapSetInteger(IV8ValueMap iV8ValueMap, V8Value v8Value, int i2) throws JavetException {
        return this.v8Native.mapSetInteger(this.handle, iV8ValueMap.getHandle(), iV8ValueMap.getType().getId(), v8Value, i2);
    }

    boolean mapSetLong(IV8ValueMap iV8ValueMap, V8Value v8Value, long j2) throws JavetException {
        return this.v8Native.mapSetLong(this.handle, iV8ValueMap.getHandle(), iV8ValueMap.getType().getId(), v8Value, j2);
    }

    boolean mapSetNull(IV8ValueMap iV8ValueMap, V8Value v8Value) throws JavetException {
        return this.v8Native.mapSetNull(this.handle, iV8ValueMap.getHandle(), iV8ValueMap.getType().getId(), v8Value);
    }

    boolean mapSetString(IV8ValueMap iV8ValueMap, V8Value v8Value, String str) throws JavetException {
        return this.v8Native.mapSetString(this.handle, iV8ValueMap.getHandle(), iV8ValueMap.getType().getId(), v8Value, str);
    }

    boolean mapSetUndefined(IV8ValueMap iV8ValueMap, V8Value v8Value) throws JavetException {
        return this.v8Native.mapSetUndefined(this.handle, iV8ValueMap.getHandle(), iV8ValueMap.getType().getId(), v8Value);
    }

    <T extends V8Value> T moduleEvaluate(IV8Module iV8Module, boolean z2) throws JavetException {
        return (T) this.v8Native.moduleEvaluate(this.handle, iV8Module.getHandle(), iV8Module.getType().getId(), z2);
    }

    byte[] moduleGetCachedData(IV8Module iV8Module) throws JavetException {
        return this.v8Native.moduleGetCachedData(this.handle, iV8Module.getHandle(), iV8Module.getType().getId());
    }

    V8ValueError moduleGetException(IV8Module iV8Module) throws JavetException {
        return (V8ValueError) this.v8Native.moduleGetException(this.handle, iV8Module.getHandle(), iV8Module.getType().getId());
    }

    int moduleGetIdentityHash(IV8Module iV8Module) throws JavetException {
        return this.v8Native.moduleGetIdentityHash(this.handle, iV8Module.getHandle(), iV8Module.getType().getId());
    }

    V8Value moduleGetNamespace(IV8Module iV8Module) throws JavetException {
        return (V8Value) this.v8Native.moduleGetNamespace(this.handle, iV8Module.getHandle(), iV8Module.getType().getId());
    }

    String moduleGetResourceName(IV8Module iV8Module) throws JavetException {
        return this.v8Native.moduleGetResourceName(this.handle, iV8Module.getHandle(), iV8Module.getType().getId());
    }

    int moduleGetScriptId(IV8Module iV8Module) throws JavetException {
        return this.v8Native.moduleGetScriptId(this.handle, iV8Module.getHandle(), iV8Module.getType().getId());
    }

    int moduleGetStatus(IV8Module iV8Module) throws JavetException {
        return this.v8Native.moduleGetStatus(this.handle, iV8Module.getHandle(), iV8Module.getType().getId());
    }

    boolean moduleInstantiate(IV8Module iV8Module) throws JavetException {
        return this.v8Native.moduleInstantiate(this.handle, iV8Module.getHandle(), iV8Module.getType().getId());
    }

    boolean moduleIsSourceTextModule(IV8Module iV8Module) {
        return this.v8Native.moduleIsSourceTextModule(this.handle, iV8Module.getHandle(), iV8Module.getType().getId());
    }

    boolean moduleIsSyntheticModule(IV8Module iV8Module) {
        return this.v8Native.moduleIsSyntheticModule(this.handle, iV8Module.getHandle(), iV8Module.getType().getId());
    }

    boolean objectDelete(IV8ValueObject iV8ValueObject, V8Value v8Value) throws JavetException {
        return this.v8Native.objectDelete(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), v8Value);
    }

    boolean objectDeletePrivateProperty(IV8ValueObject iV8ValueObject, String str) throws JavetException {
        return this.v8Native.objectDeletePrivateProperty(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), str);
    }

    <T extends V8Value> T objectGet(IV8ValueObject iV8ValueObject, V8Value v8Value) throws JavetException {
        return (T) this.v8Native.objectGet(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), v8Value);
    }

    Boolean objectGetBoolean(IV8ValueObject iV8ValueObject, V8Value v8Value) throws JavetException {
        this.primitiveFlags[0] = true;
        boolean zObjectGetBoolean = this.v8Native.objectGetBoolean(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), v8Value, this.primitiveFlags);
        if (this.primitiveFlags[0]) {
            return Boolean.valueOf(zObjectGetBoolean);
        }
        return null;
    }

    Double objectGetDouble(IV8ValueObject iV8ValueObject, V8Value v8Value) throws JavetException {
        this.primitiveFlags[0] = true;
        double dObjectGetDouble = this.v8Native.objectGetDouble(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), v8Value, this.primitiveFlags);
        if (this.primitiveFlags[0]) {
            return Double.valueOf(dObjectGetDouble);
        }
        return null;
    }

    int objectGetIdentityHash(IV8ValueReference iV8ValueReference) throws JavetException {
        return this.v8Native.objectGetIdentityHash(this.handle, iV8ValueReference.getHandle(), iV8ValueReference.getType().getId());
    }

    Integer objectGetInteger(IV8ValueObject iV8ValueObject, V8Value v8Value) throws JavetException {
        this.primitiveFlags[0] = true;
        int iObjectGetInteger = this.v8Native.objectGetInteger(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), v8Value, this.primitiveFlags);
        if (this.primitiveFlags[0]) {
            return Integer.valueOf(iObjectGetInteger);
        }
        return null;
    }

    Long objectGetLong(IV8ValueObject iV8ValueObject, V8Value v8Value) throws JavetException {
        this.primitiveFlags[0] = true;
        long jObjectGetLong = this.v8Native.objectGetLong(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), v8Value, this.primitiveFlags);
        if (this.primitiveFlags[0]) {
            return Long.valueOf(jObjectGetLong);
        }
        return null;
    }

    IV8ValueArray objectGetOwnPropertyNames(IV8ValueObject iV8ValueObject) throws JavetException {
        return (V8ValueArray) this.v8Native.objectGetOwnPropertyNames(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId());
    }

    <T extends V8Value> T objectGetPrivateProperty(IV8ValueObject iV8ValueObject, String str) throws JavetException {
        return (T) this.v8Native.objectGetPrivateProperty(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), str);
    }

    <T extends V8Value> T objectGetProperty(IV8ValueObject iV8ValueObject, V8Value v8Value) throws JavetException {
        return (T) this.v8Native.objectGetProperty(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), v8Value);
    }

    IV8ValueArray objectGetPropertyNames(IV8ValueObject iV8ValueObject) throws JavetException {
        return (V8ValueArray) this.v8Native.objectGetPropertyNames(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId());
    }

    <T extends IV8ValueObject> T objectGetPrototype(IV8ValueObject iV8ValueObject) throws JavetException {
        return (T) this.v8Native.objectGetPrototype(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId());
    }

    String objectGetString(IV8ValueObject iV8ValueObject, V8Value v8Value) throws JavetException {
        return this.v8Native.objectGetString(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), v8Value);
    }

    boolean objectHas(IV8ValueObject iV8ValueObject, V8Value v8Value) throws JavetException {
        return this.v8Native.objectHas(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), v8Value);
    }

    boolean objectHasOwnProperty(IV8ValueObject iV8ValueObject, V8Value v8Value) throws JavetException {
        return this.v8Native.objectHasOwnProperty(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), v8Value);
    }

    boolean objectHasPrivateProperty(IV8ValueObject iV8ValueObject, String str) throws JavetException {
        return this.v8Native.objectHasPrivateProperty(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), str);
    }

    <T extends V8Value> T objectInvoke(IV8ValueObject iV8ValueObject, String str, boolean z2, V8Value... v8ValueArr) throws JavetException {
        Object objObjectInvoke = this.v8Native.objectInvoke(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), str, z2, v8ValueArr);
        if (objObjectInvoke != null) {
            return (T) objObjectInvoke;
        }
        String str2 = MessageFormat.format("{0}: {1}", V8ValueErrorType.TypeError.getName(), V8ErrorTemplate.typeErrorValueIsNotAFunction(str));
        throw new JavetExecutionException(new JavetScriptingError(str2, str2, null), null);
    }

    public boolean objectIsFrozen(IV8ValueObject iV8ValueObject) {
        IV8Native iV8Native = this.v8Native;
        long j2 = this.handle;
        Objects.requireNonNull(iV8ValueObject);
        return iV8Native.objectIsFrozen(j2, iV8ValueObject.getHandle());
    }

    public boolean objectIsSealed(IV8ValueObject iV8ValueObject) {
        IV8Native iV8Native = this.v8Native;
        long j2 = this.handle;
        Objects.requireNonNull(iV8ValueObject);
        return iV8Native.objectIsSealed(j2, iV8ValueObject.getHandle());
    }

    boolean objectSet(IV8ValueObject iV8ValueObject, V8Value... v8ValueArr) throws JavetException {
        IV8Native iV8Native = this.v8Native;
        long j2 = this.handle;
        Objects.requireNonNull(iV8ValueObject);
        return iV8Native.objectSet(j2, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), v8ValueArr);
    }

    boolean objectSetAccessor(IV8ValueObject iV8ValueObject, V8Value v8Value, JavetCallbackContext javetCallbackContext, JavetCallbackContext javetCallbackContext2) throws JavetException {
        boolean zObjectSetAccessor = this.v8Native.objectSetAccessor(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), v8Value, javetCallbackContext, javetCallbackContext2);
        synchronized (this.callbackContextLock) {
            if (javetCallbackContext != null) {
                try {
                    if (javetCallbackContext.isValid()) {
                        this.callbackContextMap.put(Long.valueOf(javetCallbackContext.getHandle()), javetCallbackContext);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (javetCallbackContext2 != null && javetCallbackContext2.isValid()) {
                this.callbackContextMap.put(Long.valueOf(javetCallbackContext2.getHandle()), javetCallbackContext2);
            }
        }
        return zObjectSetAccessor;
    }

    boolean objectSetBoolean(IV8ValueObject iV8ValueObject, V8Value v8Value, boolean z2) throws JavetException {
        return this.v8Native.objectSetBoolean(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), v8Value, z2);
    }

    boolean objectSetDouble(IV8ValueObject iV8ValueObject, V8Value v8Value, double d2) throws JavetException {
        return this.v8Native.objectSetDouble(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), v8Value, d2);
    }

    boolean objectSetInteger(IV8ValueObject iV8ValueObject, V8Value v8Value, int i2) throws JavetException {
        return this.v8Native.objectSetInteger(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), v8Value, i2);
    }

    boolean objectSetLong(IV8ValueObject iV8ValueObject, V8Value v8Value, long j2) throws JavetException {
        return this.v8Native.objectSetLong(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), v8Value, j2);
    }

    boolean objectSetNull(IV8ValueObject iV8ValueObject, V8Value v8Value) throws JavetException {
        return this.v8Native.objectSetNull(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), v8Value);
    }

    boolean objectSetPrivateProperty(IV8ValueObject iV8ValueObject, String str, V8Value v8Value) throws JavetException {
        return this.v8Native.objectSetPrivateProperty(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), str, v8Value);
    }

    boolean objectSetProperty(IV8ValueObject iV8ValueObject, V8Value v8Value, V8Value v8Value2) throws JavetException {
        return this.v8Native.objectSetProperty(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), v8Value, v8Value2);
    }

    boolean objectSetPrototype(IV8ValueObject iV8ValueObject, IV8ValueObject iV8ValueObject2) throws JavetException {
        return this.v8Native.objectSetPrototype(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), iV8ValueObject2.getHandle());
    }

    boolean objectSetString(IV8ValueObject iV8ValueObject, V8Value v8Value, String str) throws JavetException {
        return this.v8Native.objectSetString(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), v8Value, str);
    }

    boolean objectSetUndefined(IV8ValueObject iV8ValueObject, V8Value v8Value) throws JavetException {
        return this.v8Native.objectSetUndefined(this.handle, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId(), v8Value);
    }

    String objectToProtoString(IV8ValueReference iV8ValueReference) throws JavetException {
        return this.v8Native.objectToProtoString(this.handle, iV8ValueReference.getHandle(), iV8ValueReference.getType().getId());
    }

    <T extends V8ValuePromise> T promiseCatch(IV8ValuePromise iV8ValuePromise, IV8ValueFunction iV8ValueFunction) throws JavetException {
        return (T) this.v8Native.promiseCatch(this.handle, iV8ValuePromise.getHandle(), iV8ValuePromise.getType().getId(), iV8ValueFunction.getHandle());
    }

    V8ValuePromise promiseGetPromise(IV8ValuePromise iV8ValuePromise) throws JavetException {
        return (V8ValuePromise) this.v8Native.promiseGetPromise(this.handle, iV8ValuePromise.getHandle(), iV8ValuePromise.getType().getId());
    }

    <T extends V8Value> T promiseGetResult(IV8ValuePromise iV8ValuePromise) throws JavetException {
        return (T) this.v8Native.promiseGetResult(this.handle, iV8ValuePromise.getHandle(), iV8ValuePromise.getType().getId());
    }

    int promiseGetState(IV8ValuePromise iV8ValuePromise) {
        return this.v8Native.promiseGetState(this.handle, iV8ValuePromise.getHandle(), iV8ValuePromise.getType().getId());
    }

    boolean promiseHasHandler(IV8ValuePromise iV8ValuePromise) {
        return this.v8Native.promiseHasHandler(this.handle, iV8ValuePromise.getHandle(), iV8ValuePromise.getType().getId());
    }

    void promiseMarkAsHandled(IV8ValuePromise iV8ValuePromise) {
        this.v8Native.promiseMarkAsHandled(this.handle, iV8ValuePromise.getHandle(), iV8ValuePromise.getType().getId());
    }

    boolean promiseReject(V8ValuePromise v8ValuePromise, V8Value v8Value) {
        return this.v8Native.promiseReject(this.handle, v8ValuePromise.getHandle(), v8ValuePromise.getType().getId(), v8Value);
    }

    boolean promiseResolve(V8ValuePromise v8ValuePromise, V8Value v8Value) {
        return this.v8Native.promiseResolve(this.handle, v8ValuePromise.getHandle(), v8ValuePromise.getType().getId(), v8Value);
    }

    <T extends V8ValuePromise> T promiseThen(IV8ValuePromise iV8ValuePromise, IV8ValueFunction iV8ValueFunction, IV8ValueFunction iV8ValueFunction2) throws JavetException {
        return (T) this.v8Native.promiseThen(this.handle, iV8ValuePromise.getHandle(), iV8ValuePromise.getType().getId(), iV8ValueFunction.getHandle(), iV8ValueFunction2 == null ? 0L : iV8ValueFunction2.getHandle());
    }

    V8ValueObject proxyGetHandler(IV8ValueProxy iV8ValueProxy) throws JavetException {
        return (V8ValueObject) this.v8Native.proxyGetHandler(this.handle, iV8ValueProxy.getHandle(), iV8ValueProxy.getType().getId());
    }

    V8ValueObject proxyGetTarget(IV8ValueProxy iV8ValueProxy) throws JavetException {
        return (V8ValueObject) this.v8Native.proxyGetTarget(this.handle, iV8ValueProxy.getHandle(), iV8ValueProxy.getType().getId());
    }

    boolean proxyIsRevoked(IV8ValueProxy iV8ValueProxy) throws JavetException {
        return this.v8Native.proxyIsRevoked(this.handle, iV8ValueProxy.getHandle(), iV8ValueProxy.getType().getId());
    }

    void proxyRevoke(IV8ValueProxy iV8ValueProxy) throws JavetException {
        this.v8Native.proxyRevoke(this.handle, iV8ValueProxy.getHandle(), iV8ValueProxy.getType().getId());
    }

    void receiveGCEpilogueCallback(int i2, int i3) {
        EnumSet<V8GCType> enumSet = IEnumBitset.getEnumSet(i2, V8GCType.class);
        EnumSet<V8GCCallbackFlags> enumSet2 = IEnumBitset.getEnumSet(i3, V8GCCallbackFlags.class, V8GCCallbackFlags.NoGCCallbackFlags);
        Iterator<IJavetGCCallback> it = this.gcEpilogueCallbacks.iterator();
        while (it.hasNext()) {
            it.next().callback(enumSet, enumSet2);
        }
    }

    void receiveGCPrologueCallback(int i2, int i3) {
        EnumSet<V8GCType> enumSet = IEnumBitset.getEnumSet(i2, V8GCType.class);
        EnumSet<V8GCCallbackFlags> enumSet2 = IEnumBitset.getEnumSet(i3, V8GCCallbackFlags.class, V8GCCallbackFlags.NoGCCallbackFlags);
        Iterator<IJavetGCCallback> it = this.gcPrologueCallbacks.iterator();
        while (it.hasNext()) {
            it.next().callback(enumSet, enumSet2);
        }
    }

    public void removeCallbackContext(long j2) {
        synchronized (this.callbackContextLock) {
            this.callbackContextMap.remove(Long.valueOf(j2));
        }
    }

    void removeCallbackContexts() {
        synchronized (this.callbackContextLock) {
            try {
                if (!this.callbackContextMap.isEmpty()) {
                    this.logger.logWarn("{0} V8 callback context object(s) not recycled.", Integer.toString(this.callbackContextMap.size()));
                    this.callbackContextMap.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeGCEpilogueCallback(IJavetGCCallback iJavetGCCallback) {
        synchronized (this.gcEpilogueCallbacks) {
            try {
                List<IJavetGCCallback> list = this.gcEpilogueCallbacks;
                Objects.requireNonNull(iJavetGCCallback);
                list.remove(iJavetGCCallback);
                if (this.gcEpilogueCallbacks.isEmpty()) {
                    this.v8Native.unregisterGCEpilogueCallback(this.handle);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeGCPrologueCallback(IJavetGCCallback iJavetGCCallback) {
        synchronized (this.gcPrologueCallbacks) {
            try {
                List<IJavetGCCallback> list = this.gcPrologueCallbacks;
                Objects.requireNonNull(iJavetGCCallback);
                list.remove(iJavetGCCallback);
                if (this.gcPrologueCallbacks.isEmpty()) {
                    this.v8Native.unregisterGCPrologueCallback(this.handle);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void removeReferences() throws JavetException {
        synchronized (this.referenceLock) {
            try {
                if (!this.referenceMap.isEmpty()) {
                    int referenceCount = getReferenceCount();
                    int v8ModuleCount = getV8ModuleCount();
                    int i2 = 0;
                    for (IV8ValueReference iV8ValueReference : new ArrayList(this.referenceMap.values())) {
                        if ((iV8ValueReference instanceof IV8ValueObject) && ((IV8ValueObject) iV8ValueReference).isWeak()) {
                            i2++;
                        }
                        iV8ValueReference.close(true);
                    }
                    if (v8ModuleCount + i2 < referenceCount) {
                        this.logger.logWarn("{0} V8 object(s) not recycled, {1} weak, {2} module(s).", Integer.toString(referenceCount), Integer.toString(i2), Integer.toString(v8ModuleCount));
                    } else {
                        this.logger.logDebug("{0} V8 object(s) not recycled, {1} weak, {2} module(s).", Integer.toString(referenceCount), Integer.toString(i2), Integer.toString(v8ModuleCount));
                    }
                    this.referenceMap.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeV8Modules(boolean z2) throws JavetException {
        synchronized (this.v8ModuleLock) {
            try {
                if (!this.v8ModuleMap.isEmpty()) {
                    this.logger.logWarn("{0} V8 module(s) not recycled.", Integer.toString(this.v8ModuleMap.size()));
                    for (IV8Module iV8Module : this.v8ModuleMap.values()) {
                        this.logger.logWarn("  V8 module: {0}", iV8Module.getResourceName());
                        if (z2) {
                            iV8Module.close(true);
                        }
                    }
                    this.v8ModuleMap.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean reportPendingMessages() throws JavetException {
        return this.v8Native.reportPendingMessages(this.handle);
    }

    public void requestGarbageCollectionForTesting(boolean z2) {
        this.v8Native.requestGarbageCollectionForTesting(this.handle, z2);
    }

    boolean sameValue(IV8ValueObject iV8ValueObject, IV8ValueObject iV8ValueObject2) {
        return this.v8Native.sameValue(this.handle, iV8ValueObject.getHandle(), iV8ValueObject2.getHandle());
    }

    byte[] scriptGetCachedData(IV8Script iV8Script) throws JavetException {
        return this.v8Native.scriptGetCachedData(this.handle, iV8Script.getHandle(), iV8Script.getType().getId());
    }

    String scriptGetResourceName(IV8Script iV8Script) throws JavetException {
        return this.v8Native.scriptGetResourceName(this.handle, iV8Script.getHandle(), iV8Script.getType().getId());
    }

    <T extends V8Value> T scriptRun(IV8Script iV8Script, boolean z2) throws JavetException {
        return (T) this.v8Native.scriptRun(this.handle, iV8Script.getHandle(), iV8Script.getType().getId(), z2);
    }

    void setAdd(IV8ValueSet iV8ValueSet, V8Value v8Value) throws JavetException {
        this.v8Native.setAdd(this.handle, iV8ValueSet.getHandle(), iV8ValueSet.getType().getId(), v8Value);
    }

    V8ValueArray setAsArray(IV8ValueSet iV8ValueSet) throws JavetException {
        return (V8ValueArray) this.v8Native.setAsArray(this.handle, iV8ValueSet.getHandle(), iV8ValueSet.getType().getId());
    }

    void setClear(IV8ValueSet iV8ValueSet) {
        this.v8Native.setClear(this.handle, iV8ValueSet.getHandle(), iV8ValueSet.getType().getId());
    }

    boolean setDelete(IV8ValueSet iV8ValueSet, V8Value v8Value) throws JavetException {
        return this.v8Native.setDelete(this.handle, iV8ValueSet.getHandle(), iV8ValueSet.getType().getId(), v8Value);
    }

    public void setGCScheduled(boolean z2) {
        this.gcScheduled = z2;
    }

    int setGetSize(IV8ValueSet iV8ValueSet) throws JavetException {
        return this.v8Native.setGetSize(this.handle, iV8ValueSet.getHandle(), iV8ValueSet.getType().getId());
    }

    boolean setHas(IV8ValueSet iV8ValueSet, V8Value v8Value) throws JavetException {
        return this.v8Native.setHas(this.handle, iV8ValueSet.getHandle(), iV8ValueSet.getType().getId(), v8Value);
    }

    public void setLogger(IJavetLogger iJavetLogger) {
        this.logger = iJavetLogger;
    }

    public void setV8ModuleResolver(IV8ModuleResolver iV8ModuleResolver) {
        this.v8ModuleResolver = iV8ModuleResolver;
    }

    void setWeak(IV8ValueReference iV8ValueReference) {
        this.v8Native.setWeak(this.handle, iV8ValueReference.getHandle(), iV8ValueReference.getType().getId(), iV8ValueReference);
    }

    boolean strictEquals(IV8ValueObject iV8ValueObject, IV8ValueObject iV8ValueObject2) {
        return this.v8Native.strictEquals(this.handle, iV8ValueObject.getHandle(), iV8ValueObject2.getHandle());
    }

    V8ValueString stringObjectValueOf(V8ValueStringObject v8ValueStringObject) {
        IV8Native iV8Native = this.v8Native;
        long j2 = this.handle;
        Objects.requireNonNull(v8ValueStringObject);
        return (V8ValueString) iV8Native.stringObjectValueOf(j2, v8ValueStringObject.getHandle(), v8ValueStringObject.getType().getId());
    }

    String symbolDescription(V8ValueSymbol v8ValueSymbol) {
        IV8Native iV8Native = this.v8Native;
        long j2 = this.handle;
        Objects.requireNonNull(v8ValueSymbol);
        return iV8Native.symbolDescription(j2, v8ValueSymbol.getHandle(), v8ValueSymbol.getType().getId());
    }

    V8ValueSymbol symbolObjectValueOf(V8ValueSymbolObject v8ValueSymbolObject) {
        IV8Native iV8Native = this.v8Native;
        long j2 = this.handle;
        Objects.requireNonNull(v8ValueSymbolObject);
        return (V8ValueSymbol) iV8Native.symbolObjectValueOf(j2, v8ValueSymbolObject.getHandle(), v8ValueSymbolObject.getType().getId());
    }

    V8ValueSymbolObject symbolToObject(V8ValueSymbol v8ValueSymbol) {
        IV8Native iV8Native = this.v8Native;
        long j2 = this.handle;
        Objects.requireNonNull(v8ValueSymbol);
        return (V8ValueSymbolObject) iV8Native.symbolToObject(j2, v8ValueSymbol.getHandle(), v8ValueSymbol.getType().getId());
    }

    public void terminateExecution() {
        this.v8Native.terminateExecution(this.handle);
    }

    @Override // com.caoccao.javet.interop.IV8Convertible
    public <T, V extends V8Value> T toObject(V v2) throws JavetException {
        return (T) this.converter.toObject(v2);
    }

    String toString(IV8ValueReference iV8ValueReference) throws JavetException {
        return this.v8Native.toString(this.handle, iV8ValueReference.getHandle(), iV8ValueReference.getType().getId());
    }

    @Override // com.caoccao.javet.interop.IV8Convertible
    public <T, V extends V8Value> V toV8Value(T t3) throws JavetException {
        return (V) this.converter.toV8Value(this, t3);
    }

    V8Runtime(V8Host v8Host, long j2, boolean z2, IV8Native iV8Native, JSRuntimeType jSRuntimeType, RuntimeOptions<?> runtimeOptions) {
        Objects.requireNonNull(runtimeOptions);
        this.runtimeOptions = runtimeOptions;
        this.handle = j2;
        JavetDefaultLogger javetDefaultLogger = new JavetDefaultLogger(getClass().getName());
        this.logger = javetDefaultLogger;
        this.pooled = z2;
        this.primitiveFlags = new boolean[1];
        this.promiseRejectCallback = new JavetPromiseRejectCallback(javetDefaultLogger);
        this.referenceLock = new Object();
        this.referenceMap = new HashMap();
        Objects.requireNonNull(v8Host);
        this.v8Host = v8Host;
        this.v8Inspector = null;
        Objects.requireNonNull(iV8Native);
        this.v8Native = iV8Native;
        Objects.requireNonNull(jSRuntimeType);
        this.jsRuntimeType = jSRuntimeType;
        this.v8ModuleLock = new Object();
        this.v8ModuleMap = new HashMap();
        this.v8ModuleResolver = null;
        this.v8Internal = new V8Internal(this);
        initializeV8ValueCache();
    }

    public void addV8Module(IV8Module iV8Module) throws JavetException {
        String resourceName = iV8Module.getResourceName();
        Objects.requireNonNull(resourceName);
        if (StringUtils.isNotEmpty(resourceName)) {
            synchronized (this.v8ModuleLock) {
                try {
                    if (containsV8Module(resourceName)) {
                        removeV8Module(resourceName, true);
                    }
                    this.v8ModuleMap.put(resourceName, iV8Module);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8Module createV8Module(String str, IV8ValueObject iV8ValueObject) throws JavetException {
        if (!StringUtils.isEmpty(str)) {
            Objects.requireNonNull(iV8ValueObject);
            V8Module v8Module = (V8Module) this.v8Native.moduleCreate(this.handle, str, iV8ValueObject.getHandle(), iV8ValueObject.getType().getId());
            if (v8Module != null) {
                addV8Module(v8Module);
            }
            return v8Module;
        }
        throw new JavetException(JavetError.ModuleNameEmpty);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueDataView createV8ValueDataView(V8ValueArrayBuffer v8ValueArrayBuffer) throws JavetException {
        Objects.requireNonNull(v8ValueArrayBuffer);
        V8Value v8ValueExecute = getExecutor(PROPERTY_DATA_VIEW).execute();
        try {
            if (v8ValueExecute instanceof V8ValueFunction) {
                V8ValueDataView v8ValueDataView = (V8ValueDataView) ((V8ValueFunction) v8ValueExecute).callAsConstructor(v8ValueArrayBuffer);
                if (v8ValueExecute != null) {
                    v8ValueExecute.close();
                }
                return v8ValueDataView;
            }
            if (v8ValueExecute != null) {
                v8ValueExecute.close();
            }
            throw new JavetException(JavetError.NotSupported, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_FEATURE, PROPERTY_DATA_VIEW));
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
    }

    public <T extends V8Value> T execute(String str, byte[] bArr, V8ScriptOrigin v8ScriptOrigin, boolean z2) throws JavetException {
        if (v8ScriptOrigin.isModule()) {
            return (T) this.v8Native.moduleExecute(this.handle, str, bArr, z2, v8ScriptOrigin.getResourceName(), v8ScriptOrigin.getResourceLineOffset(), v8ScriptOrigin.getResourceColumnOffset(), v8ScriptOrigin.getScriptId(), v8ScriptOrigin.isWasm());
        }
        return (T) this.v8Native.scriptExecute(this.handle, str, bArr, z2, v8ScriptOrigin.getResourceName(), v8ScriptOrigin.getResourceLineOffset(), v8ScriptOrigin.getResourceColumnOffset(), v8ScriptOrigin.getScriptId(), v8ScriptOrigin.isWasm());
    }

    public IV8Executor getExecutor(String str) {
        return new V8StringExecutor(this, str);
    }

    public V8Guard getGuard(long j2, boolean z2) {
        return new V8Guard(this, j2, z2);
    }

    public void lowMemoryNotification() {
        if (!isClosed()) {
            this.v8Native.lowMemoryNotification(this.handle);
        }
    }

    void removeAllReferences() throws JavetException {
        removeReferences();
        removeCallbackContexts();
        removeV8Modules();
        this.v8Inspector = null;
    }

    void removeJNIGlobalRef(long j2) {
        if (!isClosed()) {
            this.v8Native.removeJNIGlobalRef(j2);
        }
    }

    void removeReference(IV8ValueReference iV8ValueReference) throws JavetException {
        long handle = iV8ValueReference.getHandle();
        synchronized (this.referenceLock) {
            try {
                if (this.referenceMap.remove(Long.valueOf(handle)) != null) {
                    int id = iV8ValueReference.getType().getId();
                    if (id == V8ValueReferenceType.Module.getId()) {
                        removeV8Module((IV8Module) iV8ValueReference);
                    }
                    this.v8Native.removeReferenceHandle(this.handle, handle, id);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.gcScheduled) {
            lowMemoryNotification();
            this.gcScheduled = false;
        }
    }

    public void resetContext() throws JavetException {
        removeAllReferences();
        this.v8Native.resetV8Context(this.handle, this.runtimeOptions);
    }

    public void resetIsolate() throws JavetException {
        removeAllReferences();
        this.v8Native.resetV8Isolate(this.handle, this.runtimeOptions);
    }

    public void setConverter(IJavetConverter iJavetConverter) {
        Objects.requireNonNull(iJavetConverter);
        this.converter = iJavetConverter;
    }

    public void setPromiseRejectCallback(IJavetPromiseRejectCallback iJavetPromiseRejectCallback) {
        Objects.requireNonNull(iJavetPromiseRejectCallback);
        this.promiseRejectCallback = iJavetPromiseRejectCallback;
    }

    public IV8Executor getExecutor(String str, byte[] bArr) {
        return new V8StringExecutor(this, str, bArr);
    }

    public boolean throwError(Object obj) throws JavetException {
        IJavetConverter converter = getConverter();
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(this, converter, obj);
        try {
            boolean zThrowError = throwError(v8VirtualValue.get());
            v8VirtualValue.close();
            return zThrowError;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void removeV8Module(String str) throws JavetException {
        removeV8Module(str, false);
    }

    @Override // com.caoccao.javet.interop.IV8Creatable
    public V8ValueFunction createV8ValueFunction(String str) throws JavetException {
        return (V8ValueFunction) getExecutor(str).execute();
    }

    public void removeV8Module(IV8Module iV8Module) throws JavetException {
        removeV8Module(iV8Module, false);
    }

    public void removeV8Module(IV8Module iV8Module, boolean z2) throws JavetException {
        removeV8Module(iV8Module.getResourceName(), z2);
    }

    public boolean throwError(V8Value v8Value) {
        IV8Native iV8Native = this.v8Native;
        long j2 = this.handle;
        Objects.requireNonNull(v8Value);
        return iV8Native.throwError(j2, v8Value);
    }
}
