package com.caoccao.javet.interop;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class V8Native implements IV8Native {
    @Override // com.caoccao.javet.interop.IV8Native
    public native void allowCodeGenerationFromStrings(long j2, boolean z2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object arrayBufferCreate(long j2, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object arrayBufferCreate(long j2, ByteBuffer byteBuffer);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object arrayCreate(long j2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native int arrayGetLength(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean await(long j2, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native int batchArrayGet(long j2, long j3, int i2, Object[] objArr, int i3, int i5);

    @Override // com.caoccao.javet.interop.IV8Native
    public native int batchObjectGet(long j2, long j3, int i2, Object[] objArr, Object[] objArr2, int i3);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object booleanObjectCreate(long j2, boolean z2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object booleanObjectValueOf(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native void clearInternalStatistic();

    @Override // com.caoccao.javet.interop.IV8Native
    public native void clearWeak(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object cloneV8Value(long j2, long j3, int i2, boolean z2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native void closeV8Runtime(long j2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object contextGet(long j2, long j3, int i2, int i3);

    @Override // com.caoccao.javet.interop.IV8Native
    public native int contextGetLength(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean contextIsContextType(long j2, long j3, int i2, int i3);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean contextSetLength(long j2, long j3, int i2, int i3);

    @Override // com.caoccao.javet.interop.IV8Native
    public native void createV8Inspector(long j2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native long createV8Runtime(Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object doubleObjectCreate(long j2, double d2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object doubleObjectValueOf(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean equals(long j2, long j3, long j4);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object errorCreate(long j2, int i2, String str);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object functionCall(long j2, long j3, int i2, Object obj, boolean z2, Object[] objArr);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object functionCallAsConstructor(long j2, long j3, int i2, Object[] objArr);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean functionCanDiscardCompiled(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object functionCompile(long j2, String str, byte[] bArr, String str2, int i2, int i3, int i5, boolean z2, String[] strArr, Object[] objArr);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean functionCopyScopeInfoFrom(long j2, long j3, int i2, long j4, int i3);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object functionCreate(long j2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean functionDiscardCompiled(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native String[] functionGetArguments(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native byte[] functionGetCachedData(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object functionGetContext(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object functionGetInternalProperties(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native int functionGetJSFunctionType(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native int functionGetJSScopeType(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object functionGetScopeInfos(long j2, long j3, int i2, boolean z2, boolean z3);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object functionGetScriptSource(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native String functionGetSourceCode(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean functionIsCompiled(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean functionIsWrapped(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean functionSetContext(long j2, long j3, int i2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean functionSetScriptSource(long j2, long j3, int i2, Object obj, boolean z2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean functionSetSourceCode(long j2, long j3, int i2, String str, boolean z2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object getGlobalObject(long j2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native long[] getInternalStatistic();

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object getV8HeapSpaceStatistics(long j2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object getV8HeapStatistics(long j2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object getV8SharedMemoryStatistics();

    @Override // com.caoccao.javet.interop.IV8Native
    public native String getVersion();

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean hasException(long j2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean hasInternalType(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean hasPendingMessage(long j2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object integerObjectCreate(long j2, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object integerObjectValueOf(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean isDead(long j2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean isI18nEnabled();

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean isInUse(long j2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean isWeak(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean lockV8Runtime(long j2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object longObjectCreate(long j2, long j3);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object longObjectValueOf(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native void lowMemoryNotification(long j2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object mapAsArray(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native void mapClear(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object mapCreate(long j2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean mapDelete(long j2, long j3, int i2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object mapGet(long j2, long j3, int i2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean mapGetBoolean(long j2, long j3, int i2, Object obj, boolean[] zArr);

    @Override // com.caoccao.javet.interop.IV8Native
    public native double mapGetDouble(long j2, long j3, int i2, Object obj, boolean[] zArr);

    @Override // com.caoccao.javet.interop.IV8Native
    public native int mapGetInteger(long j2, long j3, int i2, Object obj, boolean[] zArr);

    @Override // com.caoccao.javet.interop.IV8Native
    public native long mapGetLong(long j2, long j3, int i2, Object obj, boolean[] zArr);

    @Override // com.caoccao.javet.interop.IV8Native
    public native int mapGetSize(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native String mapGetString(long j2, long j3, int i2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean mapHas(long j2, long j3, int i2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean mapSet(long j2, long j3, int i2, Object[] objArr);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean mapSetBoolean(long j2, long j3, int i2, Object obj, boolean z2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean mapSetDouble(long j2, long j3, int i2, Object obj, double d2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean mapSetInteger(long j2, long j3, int i2, Object obj, int i3);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean mapSetLong(long j2, long j3, int i2, Object obj, long j4);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean mapSetNull(long j2, long j3, int i2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean mapSetString(long j2, long j3, int i2, Object obj, String str);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean mapSetUndefined(long j2, long j3, int i2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object moduleCompile(long j2, String str, byte[] bArr, boolean z2, String str2, int i2, int i3, int i5, boolean z3, boolean z4);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object moduleCreate(long j2, String str, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object moduleEvaluate(long j2, long j3, int i2, boolean z2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object moduleExecute(long j2, String str, byte[] bArr, boolean z2, String str2, int i2, int i3, int i5, boolean z3);

    @Override // com.caoccao.javet.interop.IV8Native
    public native byte[] moduleGetCachedData(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object moduleGetException(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native int moduleGetIdentityHash(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object moduleGetNamespace(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native String moduleGetResourceName(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native int moduleGetScriptId(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native int moduleGetStatus(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean moduleInstantiate(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean moduleIsSourceTextModule(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean moduleIsSyntheticModule(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object objectCreate(long j2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean objectDelete(long j2, long j3, int i2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean objectDeletePrivateProperty(long j2, long j3, int i2, String str);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object objectGet(long j2, long j3, int i2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean objectGetBoolean(long j2, long j3, int i2, Object obj, boolean[] zArr);

    @Override // com.caoccao.javet.interop.IV8Native
    public native double objectGetDouble(long j2, long j3, int i2, Object obj, boolean[] zArr);

    @Override // com.caoccao.javet.interop.IV8Native
    public native int objectGetIdentityHash(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native int objectGetInteger(long j2, long j3, int i2, Object obj, boolean[] zArr);

    @Override // com.caoccao.javet.interop.IV8Native
    public native long objectGetLong(long j2, long j3, int i2, Object obj, boolean[] zArr);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object objectGetOwnPropertyNames(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object objectGetPrivateProperty(long j2, long j3, int i2, String str);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object objectGetProperty(long j2, long j3, int i2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object objectGetPropertyNames(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object objectGetPrototype(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native String objectGetString(long j2, long j3, int i2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean objectHas(long j2, long j3, int i2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean objectHasOwnProperty(long j2, long j3, int i2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean objectHasPrivateProperty(long j2, long j3, int i2, String str);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object objectInvoke(long j2, long j3, int i2, String str, boolean z2, Object[] objArr);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean objectIsFrozen(long j2, long j3);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean objectIsSealed(long j2, long j3);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean objectSet(long j2, long j3, int i2, Object[] objArr);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean objectSetAccessor(long j2, long j3, int i2, Object obj, Object obj2, Object obj3);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean objectSetBoolean(long j2, long j3, int i2, Object obj, boolean z2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean objectSetDouble(long j2, long j3, int i2, Object obj, double d2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean objectSetInteger(long j2, long j3, int i2, Object obj, int i3);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean objectSetLong(long j2, long j3, int i2, Object obj, long j4);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean objectSetNull(long j2, long j3, int i2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean objectSetPrivateProperty(long j2, long j3, int i2, String str, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean objectSetProperty(long j2, long j3, int i2, Object obj, Object obj2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean objectSetPrototype(long j2, long j3, int i2, long j4);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean objectSetString(long j2, long j3, int i2, Object obj, String str);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean objectSetUndefined(long j2, long j3, int i2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native String objectToProtoString(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object promiseCatch(long j2, long j3, int i2, long j4);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object promiseCreate(long j2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object promiseGetPromise(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object promiseGetResult(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native int promiseGetState(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean promiseHasHandler(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native void promiseMarkAsHandled(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean promiseReject(long j2, long j3, int i2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean promiseResolve(long j2, long j3, int i2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object promiseThen(long j2, long j3, int i2, long j4, long j5);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object proxyCreate(long j2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object proxyGetHandler(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object proxyGetTarget(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean proxyIsRevoked(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native void proxyRevoke(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native void registerGCEpilogueCallback(long j2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native void registerGCPrologueCallback(long j2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native void registerV8Runtime(long j2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native void removeJNIGlobalRef(long j2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native void removeRawPointer(long j2, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native void removeReferenceHandle(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean reportPendingMessages(long j2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native void requestGarbageCollectionForTesting(long j2, boolean z2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native void resetV8Context(long j2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native void resetV8Isolate(long j2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean sameValue(long j2, long j3, long j4);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object scriptCompile(long j2, String str, byte[] bArr, boolean z2, String str2, int i2, int i3, int i5, boolean z3, boolean z4);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object scriptExecute(long j2, String str, byte[] bArr, boolean z2, String str2, int i2, int i3, int i5, boolean z3);

    @Override // com.caoccao.javet.interop.IV8Native
    public native byte[] scriptGetCachedData(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native String scriptGetResourceName(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object scriptRun(long j2, long j3, int i2, boolean z2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native void setAdd(long j2, long j3, int i2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object setAsArray(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native void setClear(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object setCreate(long j2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean setDelete(long j2, long j3, int i2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native int setGetSize(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean setHas(long j2, long j3, int i2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native void setWeak(long j2, long j3, int i2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native byte[] snapshotCreate(long j2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean strictEquals(long j2, long j3, long j4);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object stringObjectCreate(long j2, String str);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object stringObjectValueOf(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object symbolCreate(long j2, String str);

    @Override // com.caoccao.javet.interop.IV8Native
    public native String symbolDescription(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object symbolObjectValueOf(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native Object symbolToObject(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native void terminateExecution(long j2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean throwError(long j2, int i2, String str);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean throwError(long j2, Object obj);

    @Override // com.caoccao.javet.interop.IV8Native
    public native String toString(long j2, long j3, int i2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native boolean unlockV8Runtime(long j2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native void unregisterGCEpilogueCallback(long j2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native void unregisterGCPrologueCallback(long j2);

    @Override // com.caoccao.javet.interop.IV8Native
    public native void v8InspectorSend(long j2, String str);

    V8Native() {
    }
}
