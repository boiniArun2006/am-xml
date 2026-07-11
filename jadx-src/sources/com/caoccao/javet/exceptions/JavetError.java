package com.caoccao.javet.exceptions;

import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import com.caoccao.javet.enums.JavetErrorType;
import com.caoccao.javet.utils.SimpleFreeMarkerFormat;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class JavetError {
    public static final JavetError CallbackInjectionFailure;
    public static final JavetError CallbackMethodFailure;
    public static final JavetError CallbackRegistrationFailure;
    public static final JavetError CallbackSignatureParameterSizeMismatch;
    public static final JavetError CallbackSignatureParameterTypeMismatch;
    public static final JavetError CallbackTypeNotSupported;
    public static final JavetError CallbackUnknownFailure;
    public static final JavetError CallbackUnregistrationFailure;
    public static final JavetError CompilationFailure;
    public static final JavetError ConverterCircularStructure;
    public static final JavetError ConverterFailure;
    public static final JavetError ConverterSymbolNotBuiltIn;
    public static final JavetError EngineNotAvailable;
    public static final JavetError ExecutionFailure;
    public static final JavetError ExecutionTerminated;
    public static final JavetError FailedToReadPath;
    public static final JavetError LibraryNotFound;
    public static final JavetError LibraryNotLoaded;
    public static final JavetError LockAcquisitionFailure;
    public static final JavetError LockConflictThreadIdMismatch;
    public static final JavetError LockReleaseFailure;
    public static final JavetError ModuleNameEmpty;
    public static final JavetError ModuleNotFound;
    public static final JavetError ModulePermissionDenied;
    public static final JavetError NotSupported;
    public static final JavetError OSNotSupported;
    public static final String PARAMETER_ACTUAL_PARAMETER_SIZE = "actualParameterSize";
    public static final String PARAMETER_ACTUAL_PARAMETER_TYPE = "actualParameterType";
    public static final String PARAMETER_CALLBACK_CONTEXT_COUNT = "callbackContextCount";
    public static final String PARAMETER_CALLBACK_TYPE = "callbackType";
    public static final String PARAMETER_CONTINUABLE = "continuable";
    public static final String PARAMETER_COUNT = "count";
    public static final String PARAMETER_CURRENT_THREAD_ID = "currentThreadId";
    public static final String PARAMETER_END_COLUMN = "endColumn";
    public static final String PARAMETER_END_POSITION = "endPosition";
    public static final String PARAMETER_EXPECTED_PARAMETER_SIZE = "expectedParameterSize";
    public static final String PARAMETER_EXPECTED_PARAMETER_TYPE = "expectedParameterType";
    public static final String PARAMETER_FEATURE = "feature";
    public static final String PARAMETER_HEAP_STATISTICS = "heapStatistics";
    public static final String PARAMETER_LINE_NUMBER = "lineNumber";
    public static final String PARAMETER_LOCKED_THREAD_ID = "lockedThreadId";
    public static final String PARAMETER_MAX_DEPTH = "maxDepth";
    public static final String PARAMETER_MESSAGE = "message";
    public static final String PARAMETER_METHOD_NAME = "methodName";
    public static final String PARAMETER_OS = "OS";
    public static final String PARAMETER_PATH = "path";
    public static final String PARAMETER_REASON = "reason";
    public static final String PARAMETER_REFERENCE_COUNT = "referenceCount";
    public static final String PARAMETER_RESOURCE_NAME = "resourceName";
    public static final String PARAMETER_SOURCE_LINE = "sourceLine";
    public static final String PARAMETER_START_COLUMN = "startColumn";
    public static final String PARAMETER_START_POSITION = "startPosition";
    public static final String PARAMETER_SYMBOL = "symbol";
    public static final String PARAMETER_V8_MODULE_COUNT = "v8ModuleCount";
    public static final JavetError RuntimeAlreadyClosed;
    public static final JavetError RuntimeAlreadyRegistered;
    public static final JavetError RuntimeCloseFailure;
    public static final JavetError RuntimeCreateSnapshotBlocked;
    public static final JavetError RuntimeCreateSnapshotDisabled;
    public static final JavetError RuntimeLeakageDetected;
    public static final JavetError RuntimeNotRegistered;
    public static final JavetError RuntimeOutOfMemory;
    protected int code;
    protected String format;
    protected JavetErrorType type;

    static {
        JavetErrorType javetErrorType = JavetErrorType.System;
        OSNotSupported = new JavetError(101, javetErrorType, "OS ${OS} is not supported");
        LibraryNotFound = new JavetError(102, javetErrorType, "Javet library ${path} is not found");
        LibraryNotLoaded = new JavetError(103, javetErrorType, "Javet library is not loaded because ${reason}");
        NotSupported = new JavetError(104, javetErrorType, "${feature} is not supported");
        FailedToReadPath = new JavetError(105, javetErrorType, "Failed to read ${path}");
        CompilationFailure = new JavetError(201, JavetErrorType.Compilation, "${message}");
        JavetErrorType javetErrorType2 = JavetErrorType.Execution;
        ExecutionFailure = new JavetError(Sdk.SDKError.Reason.MRAID_ERROR_VALUE, javetErrorType2, "${message}");
        ExecutionTerminated = new JavetError(Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE, javetErrorType2, "Execution is terminated and continuable is ${continuable}");
        JavetErrorType javetErrorType3 = JavetErrorType.Callback;
        CallbackSignatureParameterSizeMismatch = new JavetError(401, javetErrorType3, "Callback signature mismatches: method name is ${methodName}, expected parameter size is ${expectedParameterSize}, actual parameter size is ${actualParameterSize}");
        CallbackSignatureParameterTypeMismatch = new JavetError(402, javetErrorType3, "Callback signature mismatches: expected parameter type is ${expectedParameterType}, actual parameter type is ${actualParameterType}");
        CallbackInjectionFailure = new JavetError(403, javetErrorType3, "Failed to inject runtime with error message ${message}");
        CallbackRegistrationFailure = new JavetError(404, javetErrorType3, "Callback ${methodName} registration failed with error message ${message}");
        CallbackMethodFailure = new JavetError(405, javetErrorType3, obbPUqyhtS.fusNpCRHpgb);
        CallbackUnknownFailure = new JavetError(406, javetErrorType3, "Callback failed with unknown error message ${message}");
        CallbackUnregistrationFailure = new JavetError(407, javetErrorType3, "Callback ${methodName} unregistration failed with error message ${message}");
        CallbackTypeNotSupported = new JavetError(408, javetErrorType3, "Callback type ${callbackType} is not supported");
        JavetErrorType javetErrorType4 = JavetErrorType.Converter;
        ConverterFailure = new JavetError(501, javetErrorType4, "Failed to convert values with error message ${message}");
        ConverterCircularStructure = new JavetError(502, javetErrorType4, "Circular structure is detected with max depth ${maxDepth} reached");
        ConverterSymbolNotBuiltIn = new JavetError(503, javetErrorType4, "${symbol} is not a built-in symbol");
        JavetErrorType javetErrorType5 = JavetErrorType.Module;
        ModuleNameEmpty = new JavetError(Sdk.SDKError.Reason.NATIVE_VIDEO_PLAYBACK_ERROR_VALUE, javetErrorType5, "Module name is empty");
        ModuleNotFound = new JavetError(602, javetErrorType5, "Module ${moduleName} is not found");
        ModulePermissionDenied = new JavetError(603, javetErrorType5, "Denied access to module ${moduleName}");
        JavetErrorType javetErrorType6 = JavetErrorType.Lock;
        LockAcquisitionFailure = new JavetError(701, javetErrorType6, "Failed to acquire the lock");
        LockReleaseFailure = new JavetError(702, javetErrorType6, "Failed to release the lock");
        LockConflictThreadIdMismatch = new JavetError(703, javetErrorType6, "Runtime lock conflict is detected with locked thread ID ${lockedThreadID} and current thread ID ${currentThreadID}");
        JavetErrorType javetErrorType7 = JavetErrorType.Runtime;
        RuntimeAlreadyClosed = new JavetError(801, javetErrorType7, "Runtime is already closed");
        RuntimeAlreadyRegistered = new JavetError(802, javetErrorType7, "Runtime is already registered");
        RuntimeNotRegistered = new JavetError(803, javetErrorType7, "Runtime is not registered");
        RuntimeLeakageDetected = new JavetError(804, javetErrorType7, "${count} runtime(s) leakage is detected");
        RuntimeCloseFailure = new JavetError(805, javetErrorType7, "Failed to close the runtime with error message ${message}");
        RuntimeOutOfMemory = new JavetError(806, javetErrorType7, "Runtime is out of memory because ${message} with ${heapStatistics}");
        RuntimeCreateSnapshotDisabled = new JavetError(807, javetErrorType7, "Runtime create snapshot is disabled");
        RuntimeCreateSnapshotBlocked = new JavetError(808, javetErrorType7, "Runtime create snapshot is blocked because of ${callbackContextCount} callback context(s), ${referenceCount} reference(s), ${v8ModuleCount} module(s)");
        EngineNotAvailable = new JavetError(901, JavetErrorType.Engine, "Engine is not available.");
    }

    public int getCode() {
        return this.code;
    }

    public String getFormat() {
        return this.format;
    }

    public String getMessage(Map<String, Object> map) {
        return SimpleFreeMarkerFormat.format(this.format, map);
    }

    public JavetErrorType getType() {
        return this.type;
    }

    JavetError(int i2, JavetErrorType javetErrorType, String str) {
        this.code = i2;
        this.format = str;
        this.type = javetErrorType;
    }
}
