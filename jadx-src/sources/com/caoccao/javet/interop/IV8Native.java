package com.caoccao.javet.interop;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface IV8Native {
    void allowCodeGenerationFromStrings(long j2, boolean z2);

    Object arrayBufferCreate(long j2, int i2);

    Object arrayBufferCreate(long j2, ByteBuffer byteBuffer);

    Object arrayCreate(long j2);

    int arrayGetLength(long j2, long j3, int i2);

    boolean await(long j2, int i2);

    int batchArrayGet(long j2, long j3, int i2, Object[] objArr, int i3, int i5);

    int batchObjectGet(long j2, long j3, int i2, Object[] objArr, Object[] objArr2, int i3);

    Object booleanObjectCreate(long j2, boolean z2);

    Object booleanObjectValueOf(long j2, long j3, int i2);

    void clearInternalStatistic();

    void clearWeak(long j2, long j3, int i2);

    Object cloneV8Value(long j2, long j3, int i2, boolean z2);

    void closeV8Runtime(long j2);

    Object contextGet(long j2, long j3, int i2, int i3);

    int contextGetLength(long j2, long j3, int i2);

    boolean contextIsContextType(long j2, long j3, int i2, int i3);

    boolean contextSetLength(long j2, long j3, int i2, int i3);

    void createV8Inspector(long j2, Object obj);

    long createV8Runtime(Object obj);

    Object doubleObjectCreate(long j2, double d2);

    Object doubleObjectValueOf(long j2, long j3, int i2);

    boolean equals(long j2, long j3, long j4);

    Object errorCreate(long j2, int i2, String str);

    Object functionCall(long j2, long j3, int i2, Object obj, boolean z2, Object[] objArr);

    Object functionCallAsConstructor(long j2, long j3, int i2, Object[] objArr);

    boolean functionCanDiscardCompiled(long j2, long j3, int i2);

    Object functionCompile(long j2, String str, byte[] bArr, String str2, int i2, int i3, int i5, boolean z2, String[] strArr, Object[] objArr);

    boolean functionCopyScopeInfoFrom(long j2, long j3, int i2, long j4, int i3);

    Object functionCreate(long j2, Object obj);

    boolean functionDiscardCompiled(long j2, long j3, int i2);

    String[] functionGetArguments(long j2, long j3, int i2);

    byte[] functionGetCachedData(long j2, long j3, int i2);

    Object functionGetContext(long j2, long j3, int i2);

    Object functionGetInternalProperties(long j2, long j3, int i2);

    int functionGetJSFunctionType(long j2, long j3, int i2);

    int functionGetJSScopeType(long j2, long j3, int i2);

    Object functionGetScopeInfos(long j2, long j3, int i2, boolean z2, boolean z3);

    Object functionGetScriptSource(long j2, long j3, int i2);

    String functionGetSourceCode(long j2, long j3, int i2);

    boolean functionIsCompiled(long j2, long j3, int i2);

    boolean functionIsWrapped(long j2, long j3, int i2);

    boolean functionSetContext(long j2, long j3, int i2, Object obj);

    boolean functionSetScriptSource(long j2, long j3, int i2, Object obj, boolean z2);

    boolean functionSetSourceCode(long j2, long j3, int i2, String str, boolean z2);

    Object getGlobalObject(long j2);

    long[] getInternalStatistic();

    Object getV8HeapSpaceStatistics(long j2, Object obj);

    Object getV8HeapStatistics(long j2);

    Object getV8SharedMemoryStatistics();

    String getVersion();

    boolean hasException(long j2);

    boolean hasInternalType(long j2, long j3, int i2);

    boolean hasPendingMessage(long j2);

    Object integerObjectCreate(long j2, int i2);

    Object integerObjectValueOf(long j2, long j3, int i2);

    boolean isDead(long j2);

    boolean isI18nEnabled();

    boolean isInUse(long j2);

    boolean isWeak(long j2, long j3, int i2);

    boolean lockV8Runtime(long j2);

    Object longObjectCreate(long j2, long j3);

    Object longObjectValueOf(long j2, long j3, int i2);

    void lowMemoryNotification(long j2);

    Object mapAsArray(long j2, long j3, int i2);

    void mapClear(long j2, long j3, int i2);

    Object mapCreate(long j2);

    boolean mapDelete(long j2, long j3, int i2, Object obj);

    Object mapGet(long j2, long j3, int i2, Object obj);

    boolean mapGetBoolean(long j2, long j3, int i2, Object obj, boolean[] zArr);

    double mapGetDouble(long j2, long j3, int i2, Object obj, boolean[] zArr);

    int mapGetInteger(long j2, long j3, int i2, Object obj, boolean[] zArr);

    long mapGetLong(long j2, long j3, int i2, Object obj, boolean[] zArr);

    int mapGetSize(long j2, long j3, int i2);

    String mapGetString(long j2, long j3, int i2, Object obj);

    boolean mapHas(long j2, long j3, int i2, Object obj);

    boolean mapSet(long j2, long j3, int i2, Object[] objArr);

    boolean mapSetBoolean(long j2, long j3, int i2, Object obj, boolean z2);

    boolean mapSetDouble(long j2, long j3, int i2, Object obj, double d2);

    boolean mapSetInteger(long j2, long j3, int i2, Object obj, int i3);

    boolean mapSetLong(long j2, long j3, int i2, Object obj, long j4);

    boolean mapSetNull(long j2, long j3, int i2, Object obj);

    boolean mapSetString(long j2, long j3, int i2, Object obj, String str);

    boolean mapSetUndefined(long j2, long j3, int i2, Object obj);

    Object moduleCompile(long j2, String str, byte[] bArr, boolean z2, String str2, int i2, int i3, int i5, boolean z3, boolean z4);

    Object moduleCreate(long j2, String str, long j3, int i2);

    Object moduleEvaluate(long j2, long j3, int i2, boolean z2);

    Object moduleExecute(long j2, String str, byte[] bArr, boolean z2, String str2, int i2, int i3, int i5, boolean z3);

    byte[] moduleGetCachedData(long j2, long j3, int i2);

    Object moduleGetException(long j2, long j3, int i2);

    int moduleGetIdentityHash(long j2, long j3, int i2);

    Object moduleGetNamespace(long j2, long j3, int i2);

    String moduleGetResourceName(long j2, long j3, int i2);

    int moduleGetScriptId(long j2, long j3, int i2);

    int moduleGetStatus(long j2, long j3, int i2);

    boolean moduleInstantiate(long j2, long j3, int i2);

    boolean moduleIsSourceTextModule(long j2, long j3, int i2);

    boolean moduleIsSyntheticModule(long j2, long j3, int i2);

    Object objectCreate(long j2);

    boolean objectDelete(long j2, long j3, int i2, Object obj);

    boolean objectDeletePrivateProperty(long j2, long j3, int i2, String str);

    Object objectGet(long j2, long j3, int i2, Object obj);

    boolean objectGetBoolean(long j2, long j3, int i2, Object obj, boolean[] zArr);

    double objectGetDouble(long j2, long j3, int i2, Object obj, boolean[] zArr);

    int objectGetIdentityHash(long j2, long j3, int i2);

    int objectGetInteger(long j2, long j3, int i2, Object obj, boolean[] zArr);

    long objectGetLong(long j2, long j3, int i2, Object obj, boolean[] zArr);

    Object objectGetOwnPropertyNames(long j2, long j3, int i2);

    Object objectGetPrivateProperty(long j2, long j3, int i2, String str);

    Object objectGetProperty(long j2, long j3, int i2, Object obj);

    Object objectGetPropertyNames(long j2, long j3, int i2);

    Object objectGetPrototype(long j2, long j3, int i2);

    String objectGetString(long j2, long j3, int i2, Object obj);

    boolean objectHas(long j2, long j3, int i2, Object obj);

    boolean objectHasOwnProperty(long j2, long j3, int i2, Object obj);

    boolean objectHasPrivateProperty(long j2, long j3, int i2, String str);

    Object objectInvoke(long j2, long j3, int i2, String str, boolean z2, Object[] objArr);

    boolean objectIsFrozen(long j2, long j3);

    boolean objectIsSealed(long j2, long j3);

    boolean objectSet(long j2, long j3, int i2, Object[] objArr);

    boolean objectSetAccessor(long j2, long j3, int i2, Object obj, Object obj2, Object obj3);

    boolean objectSetBoolean(long j2, long j3, int i2, Object obj, boolean z2);

    boolean objectSetDouble(long j2, long j3, int i2, Object obj, double d2);

    boolean objectSetInteger(long j2, long j3, int i2, Object obj, int i3);

    boolean objectSetLong(long j2, long j3, int i2, Object obj, long j4);

    boolean objectSetNull(long j2, long j3, int i2, Object obj);

    boolean objectSetPrivateProperty(long j2, long j3, int i2, String str, Object obj);

    boolean objectSetProperty(long j2, long j3, int i2, Object obj, Object obj2);

    boolean objectSetPrototype(long j2, long j3, int i2, long j4);

    boolean objectSetString(long j2, long j3, int i2, Object obj, String str);

    boolean objectSetUndefined(long j2, long j3, int i2, Object obj);

    String objectToProtoString(long j2, long j3, int i2);

    Object promiseCatch(long j2, long j3, int i2, long j4);

    Object promiseCreate(long j2);

    Object promiseGetPromise(long j2, long j3, int i2);

    Object promiseGetResult(long j2, long j3, int i2);

    int promiseGetState(long j2, long j3, int i2);

    boolean promiseHasHandler(long j2, long j3, int i2);

    void promiseMarkAsHandled(long j2, long j3, int i2);

    boolean promiseReject(long j2, long j3, int i2, Object obj);

    boolean promiseResolve(long j2, long j3, int i2, Object obj);

    Object promiseThen(long j2, long j3, int i2, long j4, long j5);

    Object proxyCreate(long j2, Object obj);

    Object proxyGetHandler(long j2, long j3, int i2);

    Object proxyGetTarget(long j2, long j3, int i2);

    boolean proxyIsRevoked(long j2, long j3, int i2);

    void proxyRevoke(long j2, long j3, int i2);

    void registerGCEpilogueCallback(long j2);

    void registerGCPrologueCallback(long j2);

    void registerV8Runtime(long j2, Object obj);

    void removeJNIGlobalRef(long j2);

    void removeRawPointer(long j2, int i2);

    void removeReferenceHandle(long j2, long j3, int i2);

    boolean reportPendingMessages(long j2);

    void requestGarbageCollectionForTesting(long j2, boolean z2);

    void resetV8Context(long j2, Object obj);

    void resetV8Isolate(long j2, Object obj);

    boolean sameValue(long j2, long j3, long j4);

    Object scriptCompile(long j2, String str, byte[] bArr, boolean z2, String str2, int i2, int i3, int i5, boolean z3, boolean z4);

    Object scriptExecute(long j2, String str, byte[] bArr, boolean z2, String str2, int i2, int i3, int i5, boolean z3);

    byte[] scriptGetCachedData(long j2, long j3, int i2);

    String scriptGetResourceName(long j2, long j3, int i2);

    Object scriptRun(long j2, long j3, int i2, boolean z2);

    void setAdd(long j2, long j3, int i2, Object obj);

    Object setAsArray(long j2, long j3, int i2);

    void setClear(long j2, long j3, int i2);

    Object setCreate(long j2);

    boolean setDelete(long j2, long j3, int i2, Object obj);

    int setGetSize(long j2, long j3, int i2);

    boolean setHas(long j2, long j3, int i2, Object obj);

    void setWeak(long j2, long j3, int i2, Object obj);

    byte[] snapshotCreate(long j2);

    boolean strictEquals(long j2, long j3, long j4);

    Object stringObjectCreate(long j2, String str);

    Object stringObjectValueOf(long j2, long j3, int i2);

    Object symbolCreate(long j2, String str);

    String symbolDescription(long j2, long j3, int i2);

    Object symbolObjectValueOf(long j2, long j3, int i2);

    Object symbolToObject(long j2, long j3, int i2);

    void terminateExecution(long j2);

    boolean throwError(long j2, int i2, String str);

    boolean throwError(long j2, Object obj);

    String toString(long j2, long j3, int i2);

    boolean unlockV8Runtime(long j2);

    void unregisterGCEpilogueCallback(long j2);

    void unregisterGCPrologueCallback(long j2);

    void v8InspectorSend(long j2, String str);
}
