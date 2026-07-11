package com.caoccao.javet.interop;

import com.caoccao.javet.enums.JSFunctionType;
import com.caoccao.javet.enums.JSScopeType;
import com.caoccao.javet.enums.V8ValueInternalType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.caoccao.javet.values.primitive.V8ValueInteger;
import com.caoccao.javet.values.primitive.V8ValueLong;
import com.caoccao.javet.values.primitive.V8ValueNumber;
import com.caoccao.javet.values.primitive.V8ValueString;
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
import com.caoccao.javet.values.reference.V8ValueArray;
import com.caoccao.javet.values.reference.V8ValueBooleanObject;
import com.caoccao.javet.values.reference.V8ValueDoubleObject;
import com.caoccao.javet.values.reference.V8ValueError;
import com.caoccao.javet.values.reference.V8ValueIntegerObject;
import com.caoccao.javet.values.reference.V8ValueLongObject;
import com.caoccao.javet.values.reference.V8ValueObject;
import com.caoccao.javet.values.reference.V8ValuePromise;
import com.caoccao.javet.values.reference.V8ValueStringObject;
import com.caoccao.javet.values.reference.V8ValueSymbol;
import com.caoccao.javet.values.reference.V8ValueSymbolObject;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class V8Internal {
    private final V8Runtime v8Runtime;

    public int arrayGetLength(IV8ValueArray iV8ValueArray) throws JavetException {
        return this.v8Runtime.arrayGetLength(iV8ValueArray);
    }

    public void addReference(IV8ValueReference iV8ValueReference) {
        this.v8Runtime.addReference(iV8ValueReference);
    }

    public int arrayGetLength(IV8ValueTypedArray iV8ValueTypedArray) throws JavetException {
        return this.v8Runtime.arrayGetLength(iV8ValueTypedArray);
    }

    public int batchArrayGet(IV8ValueArray iV8ValueArray, V8Value[] v8ValueArr, int i2, int i3) throws JavetException {
        return this.v8Runtime.batchArrayGet(iV8ValueArray, v8ValueArr, i2, i3);
    }

    public int batchObjectGet(IV8ValueObject iV8ValueObject, V8Value[] v8ValueArr, V8Value[] v8ValueArr2, int i2) throws JavetException {
        return this.v8Runtime.batchObjectGet(iV8ValueObject, v8ValueArr, v8ValueArr2, i2);
    }

    public V8ValueBoolean booleanObjectValueOf(V8ValueBooleanObject v8ValueBooleanObject) {
        return this.v8Runtime.booleanObjectValueOf(v8ValueBooleanObject);
    }

    public void clearWeak(IV8ValueReference iV8ValueReference) throws JavetException {
        this.v8Runtime.clearWeak(iV8ValueReference);
    }

    public <T extends V8Value> T cloneV8Value(IV8ValueReference iV8ValueReference, boolean z2) throws JavetException {
        return (T) this.v8Runtime.cloneV8Value(iV8ValueReference, z2);
    }

    public <T extends V8Value> T contextGet(IV8Context iV8Context, int i2) throws JavetException {
        return (T) this.v8Runtime.contextGet(iV8Context, i2);
    }

    public int contextGetLength(IV8Context iV8Context) throws JavetException {
        return this.v8Runtime.contextGetLength(iV8Context);
    }

    public boolean contextIsContextType(IV8Context iV8Context, int i2) throws JavetException {
        return this.v8Runtime.contextIsContextType(iV8Context, i2);
    }

    public boolean contextSetLength(IV8Context iV8Context, int i2) throws JavetException {
        return this.v8Runtime.contextSetLength(iV8Context, i2);
    }

    public V8ValueNumber<?> doubleObjectValueOf(V8ValueDoubleObject v8ValueDoubleObject) {
        return this.v8Runtime.doubleObjectValueOf(v8ValueDoubleObject);
    }

    public boolean equals(IV8ValueReference iV8ValueReference, IV8ValueReference iV8ValueReference2) throws JavetException {
        return this.v8Runtime.equals(iV8ValueReference, iV8ValueReference2);
    }

    public <T extends V8Value> T functionCall(IV8ValueObject iV8ValueObject, V8Value v8Value, boolean z2, V8Value... v8ValueArr) throws JavetException {
        return (T) this.v8Runtime.functionCall(iV8ValueObject, v8Value, z2, v8ValueArr);
    }

    public <T extends V8Value> T functionCallAsConstructor(IV8ValueObject iV8ValueObject, V8Value... v8ValueArr) throws JavetException {
        return (T) this.v8Runtime.functionCallAsConstructor(iV8ValueObject, v8ValueArr);
    }

    public boolean functionCanDiscardCompiled(IV8ValueFunction iV8ValueFunction) {
        return this.v8Runtime.functionCanDiscardCompiled(iV8ValueFunction);
    }

    public boolean functionCopyScopeInfoFrom(IV8ValueFunction iV8ValueFunction, IV8ValueFunction iV8ValueFunction2) throws JavetException {
        return this.v8Runtime.functionCopyScopeInfoFrom(iV8ValueFunction, iV8ValueFunction2);
    }

    public boolean functionDiscardCompiled(IV8ValueFunction iV8ValueFunction) {
        return this.v8Runtime.functionDiscardCompiled(iV8ValueFunction);
    }

    public String[] functionGetArguments(IV8ValueFunction iV8ValueFunction) throws JavetException {
        return this.v8Runtime.functionGetArguments(iV8ValueFunction);
    }

    public byte[] functionGetCachedData(IV8ValueFunction iV8ValueFunction) throws JavetException {
        return this.v8Runtime.functionGetCachedData(iV8ValueFunction);
    }

    public V8Context functionGetContext(IV8ValueFunction iV8ValueFunction) throws JavetException {
        return this.v8Runtime.functionGetContext(iV8ValueFunction);
    }

    public IV8ValueArray functionGetInternalProperties(IV8ValueFunction iV8ValueFunction) throws JavetException {
        return this.v8Runtime.functionGetInternalProperties(iV8ValueFunction);
    }

    public JSFunctionType functionGetJSFunctionType(IV8ValueFunction iV8ValueFunction) {
        return this.v8Runtime.functionGetJSFunctionType(iV8ValueFunction);
    }

    public JSScopeType functionGetJSScopeType(IV8ValueFunction iV8ValueFunction) {
        return this.v8Runtime.functionGetJSScopeType(iV8ValueFunction);
    }

    public IV8ValueArray functionGetScopeInfos(IV8ValueFunction iV8ValueFunction, IV8ValueFunction.GetScopeInfosOptions getScopeInfosOptions) throws JavetException {
        return this.v8Runtime.functionGetScopeInfos(iV8ValueFunction, getScopeInfosOptions);
    }

    public IV8ValueFunction.ScriptSource functionGetScriptSource(IV8ValueFunction iV8ValueFunction) throws JavetException {
        return this.v8Runtime.functionGetScriptSource(iV8ValueFunction);
    }

    public String functionGetSourceCode(IV8ValueFunction iV8ValueFunction) throws JavetException {
        return this.v8Runtime.functionGetSourceCode(iV8ValueFunction);
    }

    public boolean functionIsCompiled(IV8ValueFunction iV8ValueFunction) {
        return this.v8Runtime.functionIsCompiled(iV8ValueFunction);
    }

    public boolean functionIsWrapped(IV8ValueFunction iV8ValueFunction) {
        return this.v8Runtime.functionIsWrapped(iV8ValueFunction);
    }

    public boolean functionSetContext(IV8ValueFunction iV8ValueFunction, V8Context v8Context) throws JavetException {
        return this.v8Runtime.functionSetContext(iV8ValueFunction, v8Context);
    }

    public boolean functionSetScriptSource(IV8ValueFunction iV8ValueFunction, IV8ValueFunction.ScriptSource scriptSource, boolean z2) throws JavetException {
        return this.v8Runtime.functionSetScriptSource(iV8ValueFunction, scriptSource, z2);
    }

    public boolean functionSetSourceCode(IV8ValueFunction iV8ValueFunction, String str, boolean z2) throws JavetException {
        return this.v8Runtime.functionSetSourceCode(iV8ValueFunction, str, z2);
    }

    public boolean hasInternalType(IV8ValueObject iV8ValueObject, V8ValueInternalType v8ValueInternalType) {
        return this.v8Runtime.hasInternalType(iV8ValueObject, v8ValueInternalType);
    }

    public V8ValueInteger integerObjectValueOf(V8ValueIntegerObject v8ValueIntegerObject) throws JavetException {
        return this.v8Runtime.integerObjectValueOf(v8ValueIntegerObject);
    }

    public boolean isWeak(IV8ValueReference iV8ValueReference) {
        return this.v8Runtime.isWeak(iV8ValueReference);
    }

    public V8ValueLong longObjectValueOf(V8ValueLongObject v8ValueLongObject) throws JavetException {
        return this.v8Runtime.longObjectValueOf(v8ValueLongObject);
    }

    public V8ValueArray mapAsArray(IV8ValueMap iV8ValueMap) throws JavetException {
        return this.v8Runtime.mapAsArray(iV8ValueMap);
    }

    public void mapClear(IV8ValueMap iV8ValueMap) {
        this.v8Runtime.mapClear(iV8ValueMap);
    }

    public boolean mapDelete(IV8ValueMap iV8ValueMap, V8Value v8Value) throws JavetException {
        return this.v8Runtime.mapDelete(iV8ValueMap, v8Value);
    }

    public <T extends V8Value> T mapGet(IV8ValueMap iV8ValueMap, V8Value v8Value) throws JavetException {
        return (T) this.v8Runtime.mapGet(iV8ValueMap, v8Value);
    }

    public Boolean mapGetBoolean(IV8ValueMap iV8ValueMap, V8Value v8Value) throws JavetException {
        return this.v8Runtime.mapGetBoolean(iV8ValueMap, v8Value);
    }

    public Double mapGetDouble(IV8ValueMap iV8ValueMap, V8Value v8Value) throws JavetException {
        return this.v8Runtime.mapGetDouble(iV8ValueMap, v8Value);
    }

    public Integer mapGetInteger(IV8ValueMap iV8ValueMap, V8Value v8Value) throws JavetException {
        return this.v8Runtime.mapGetInteger(iV8ValueMap, v8Value);
    }

    public Long mapGetLong(IV8ValueMap iV8ValueMap, V8Value v8Value) throws JavetException {
        return this.v8Runtime.mapGetLong(iV8ValueMap, v8Value);
    }

    public int mapGetSize(IV8ValueMap iV8ValueMap) throws JavetException {
        return this.v8Runtime.mapGetSize(iV8ValueMap);
    }

    public String mapGetString(IV8ValueMap iV8ValueMap, V8Value v8Value) throws JavetException {
        return this.v8Runtime.mapGetString(iV8ValueMap, v8Value);
    }

    public boolean mapHas(IV8ValueMap iV8ValueMap, V8Value v8Value) throws JavetException {
        return this.v8Runtime.mapHas(iV8ValueMap, v8Value);
    }

    public boolean mapSet(IV8ValueMap iV8ValueMap, V8Value... v8ValueArr) throws JavetException {
        return this.v8Runtime.mapSet(iV8ValueMap, v8ValueArr);
    }

    public boolean mapSetBoolean(IV8ValueMap iV8ValueMap, V8Value v8Value, boolean z2) throws JavetException {
        return this.v8Runtime.mapSetBoolean(iV8ValueMap, v8Value, z2);
    }

    public boolean mapSetDouble(IV8ValueMap iV8ValueMap, V8Value v8Value, double d2) throws JavetException {
        return this.v8Runtime.mapSetDouble(iV8ValueMap, v8Value, d2);
    }

    public boolean mapSetInteger(IV8ValueMap iV8ValueMap, V8Value v8Value, int i2) throws JavetException {
        return this.v8Runtime.mapSetInteger(iV8ValueMap, v8Value, i2);
    }

    public boolean mapSetLong(IV8ValueMap iV8ValueMap, V8Value v8Value, long j2) throws JavetException {
        return this.v8Runtime.mapSetLong(iV8ValueMap, v8Value, j2);
    }

    public boolean mapSetNull(IV8ValueMap iV8ValueMap, V8Value v8Value) throws JavetException {
        return this.v8Runtime.mapSetNull(iV8ValueMap, v8Value);
    }

    public boolean mapSetString(IV8ValueMap iV8ValueMap, V8Value v8Value, String str) throws JavetException {
        return this.v8Runtime.mapSetString(iV8ValueMap, v8Value, str);
    }

    public boolean mapSetUndefined(IV8ValueMap iV8ValueMap, V8Value v8Value) throws JavetException {
        return this.v8Runtime.mapSetUndefined(iV8ValueMap, v8Value);
    }

    public <T extends V8Value> T moduleEvaluate(IV8Module iV8Module, boolean z2) throws JavetException {
        return (T) this.v8Runtime.moduleEvaluate(iV8Module, z2);
    }

    public byte[] moduleGetCachedData(IV8Module iV8Module) throws JavetException {
        return this.v8Runtime.moduleGetCachedData(iV8Module);
    }

    public V8ValueError moduleGetException(IV8Module iV8Module) throws JavetException {
        return this.v8Runtime.moduleGetException(iV8Module);
    }

    public int moduleGetIdentityHash(IV8Module iV8Module) throws JavetException {
        return this.v8Runtime.moduleGetIdentityHash(iV8Module);
    }

    public V8Value moduleGetNamespace(IV8Module iV8Module) throws JavetException {
        return this.v8Runtime.moduleGetNamespace(iV8Module);
    }

    public String moduleGetResourceName(IV8Module iV8Module) throws JavetException {
        return this.v8Runtime.moduleGetResourceName(iV8Module);
    }

    public int moduleGetScriptId(IV8Module iV8Module) throws JavetException {
        return this.v8Runtime.moduleGetScriptId(iV8Module);
    }

    public int moduleGetStatus(IV8Module iV8Module) throws JavetException {
        return this.v8Runtime.moduleGetStatus(iV8Module);
    }

    public boolean moduleInstantiate(IV8Module iV8Module) throws JavetException {
        return this.v8Runtime.moduleInstantiate(iV8Module);
    }

    public boolean moduleIsSourceTextModule(IV8Module iV8Module) {
        return this.v8Runtime.moduleIsSourceTextModule(iV8Module);
    }

    public boolean moduleIsSyntheticModule(IV8Module iV8Module) {
        return this.v8Runtime.moduleIsSyntheticModule(iV8Module);
    }

    public boolean objectDelete(IV8ValueObject iV8ValueObject, V8Value v8Value) throws JavetException {
        return this.v8Runtime.objectDelete(iV8ValueObject, v8Value);
    }

    public boolean objectDeletePrivateProperty(IV8ValueObject iV8ValueObject, String str) throws JavetException {
        return this.v8Runtime.objectDeletePrivateProperty(iV8ValueObject, str);
    }

    public <T extends V8Value> T objectGet(IV8ValueObject iV8ValueObject, V8Value v8Value) throws JavetException {
        return (T) this.v8Runtime.objectGet(iV8ValueObject, v8Value);
    }

    public Boolean objectGetBoolean(IV8ValueObject iV8ValueObject, V8Value v8Value) throws JavetException {
        return this.v8Runtime.objectGetBoolean(iV8ValueObject, v8Value);
    }

    public Double objectGetDouble(IV8ValueObject iV8ValueObject, V8Value v8Value) throws JavetException {
        return this.v8Runtime.objectGetDouble(iV8ValueObject, v8Value);
    }

    public int objectGetIdentityHash(IV8ValueReference iV8ValueReference) throws JavetException {
        return this.v8Runtime.objectGetIdentityHash(iV8ValueReference);
    }

    public Integer objectGetInteger(IV8ValueObject iV8ValueObject, V8Value v8Value) throws JavetException {
        return this.v8Runtime.objectGetInteger(iV8ValueObject, v8Value);
    }

    public Long objectGetLong(IV8ValueObject iV8ValueObject, V8Value v8Value) throws JavetException {
        return this.v8Runtime.objectGetLong(iV8ValueObject, v8Value);
    }

    public IV8ValueArray objectGetOwnPropertyNames(IV8ValueObject iV8ValueObject) throws JavetException {
        return this.v8Runtime.objectGetOwnPropertyNames(iV8ValueObject);
    }

    public <T extends V8Value> T objectGetPrivateProperty(IV8ValueObject iV8ValueObject, String str) throws JavetException {
        return (T) this.v8Runtime.objectGetPrivateProperty(iV8ValueObject, str);
    }

    public <T extends V8Value> T objectGetProperty(IV8ValueObject iV8ValueObject, V8Value v8Value) throws JavetException {
        return (T) this.v8Runtime.objectGetProperty(iV8ValueObject, v8Value);
    }

    public IV8ValueArray objectGetPropertyNames(IV8ValueObject iV8ValueObject) throws JavetException {
        return this.v8Runtime.objectGetPropertyNames(iV8ValueObject);
    }

    public <T extends IV8ValueObject> T objectGetPrototype(IV8ValueObject iV8ValueObject) throws JavetException {
        return (T) this.v8Runtime.objectGetPrototype(iV8ValueObject);
    }

    public String objectGetString(IV8ValueObject iV8ValueObject, V8Value v8Value) throws JavetException {
        return this.v8Runtime.objectGetString(iV8ValueObject, v8Value);
    }

    public boolean objectHas(IV8ValueObject iV8ValueObject, V8Value v8Value) throws JavetException {
        return this.v8Runtime.objectHas(iV8ValueObject, v8Value);
    }

    public boolean objectHasOwnProperty(IV8ValueObject iV8ValueObject, V8Value v8Value) throws JavetException {
        return this.v8Runtime.objectHasOwnProperty(iV8ValueObject, v8Value);
    }

    public boolean objectHasPrivateProperty(IV8ValueObject iV8ValueObject, String str) throws JavetException {
        return this.v8Runtime.objectHasPrivateProperty(iV8ValueObject, str);
    }

    public <T extends V8Value> T objectInvoke(IV8ValueObject iV8ValueObject, String str, boolean z2, V8Value... v8ValueArr) throws JavetException {
        return (T) this.v8Runtime.objectInvoke(iV8ValueObject, str, z2, v8ValueArr);
    }

    public boolean objectIsFrozen(IV8ValueObject iV8ValueObject) {
        return this.v8Runtime.objectIsFrozen(iV8ValueObject);
    }

    public boolean objectIsSealed(IV8ValueObject iV8ValueObject) {
        return this.v8Runtime.objectIsSealed(iV8ValueObject);
    }

    public boolean objectSet(IV8ValueObject iV8ValueObject, V8Value... v8ValueArr) throws JavetException {
        return this.v8Runtime.objectSet(iV8ValueObject, v8ValueArr);
    }

    public boolean objectSetAccessor(IV8ValueObject iV8ValueObject, V8Value v8Value, JavetCallbackContext javetCallbackContext, JavetCallbackContext javetCallbackContext2) throws JavetException {
        return this.v8Runtime.objectSetAccessor(iV8ValueObject, v8Value, javetCallbackContext, javetCallbackContext2);
    }

    public boolean objectSetBoolean(IV8ValueObject iV8ValueObject, V8Value v8Value, boolean z2) throws JavetException {
        return this.v8Runtime.objectSetBoolean(iV8ValueObject, v8Value, z2);
    }

    public boolean objectSetDouble(IV8ValueObject iV8ValueObject, V8Value v8Value, double d2) throws JavetException {
        return this.v8Runtime.objectSetDouble(iV8ValueObject, v8Value, d2);
    }

    public boolean objectSetInteger(IV8ValueObject iV8ValueObject, V8Value v8Value, int i2) throws JavetException {
        return this.v8Runtime.objectSetInteger(iV8ValueObject, v8Value, i2);
    }

    public boolean objectSetLong(IV8ValueObject iV8ValueObject, V8Value v8Value, long j2) throws JavetException {
        return this.v8Runtime.objectSetLong(iV8ValueObject, v8Value, j2);
    }

    public boolean objectSetNull(IV8ValueObject iV8ValueObject, V8Value v8Value) throws JavetException {
        return this.v8Runtime.objectSetNull(iV8ValueObject, v8Value);
    }

    public boolean objectSetPrivateProperty(IV8ValueObject iV8ValueObject, String str, V8Value v8Value) throws JavetException {
        return this.v8Runtime.objectSetPrivateProperty(iV8ValueObject, str, v8Value);
    }

    public boolean objectSetProperty(IV8ValueObject iV8ValueObject, V8Value v8Value, V8Value v8Value2) throws JavetException {
        return this.v8Runtime.objectSetProperty(iV8ValueObject, v8Value, v8Value2);
    }

    public boolean objectSetPrototype(IV8ValueObject iV8ValueObject, IV8ValueObject iV8ValueObject2) throws JavetException {
        return this.v8Runtime.objectSetPrototype(iV8ValueObject, iV8ValueObject2);
    }

    public boolean objectSetString(IV8ValueObject iV8ValueObject, V8Value v8Value, String str) throws JavetException {
        return this.v8Runtime.objectSetString(iV8ValueObject, v8Value, str);
    }

    public boolean objectSetUndefined(IV8ValueObject iV8ValueObject, V8Value v8Value) throws JavetException {
        return this.v8Runtime.objectSetUndefined(iV8ValueObject, v8Value);
    }

    public String objectToProtoString(IV8ValueReference iV8ValueReference) throws JavetException {
        return this.v8Runtime.objectToProtoString(iV8ValueReference);
    }

    public <T extends V8ValuePromise> T promiseCatch(IV8ValuePromise iV8ValuePromise, IV8ValueFunction iV8ValueFunction) throws JavetException {
        return (T) this.v8Runtime.promiseCatch(iV8ValuePromise, iV8ValueFunction);
    }

    public V8ValuePromise promiseGetPromise(IV8ValuePromise iV8ValuePromise) throws JavetException {
        return this.v8Runtime.promiseGetPromise(iV8ValuePromise);
    }

    public <T extends V8Value> T promiseGetResult(IV8ValuePromise iV8ValuePromise) throws JavetException {
        return (T) this.v8Runtime.promiseGetResult(iV8ValuePromise);
    }

    public int promiseGetState(IV8ValuePromise iV8ValuePromise) {
        return this.v8Runtime.promiseGetState(iV8ValuePromise);
    }

    public boolean promiseHasHandler(IV8ValuePromise iV8ValuePromise) {
        return this.v8Runtime.promiseHasHandler(iV8ValuePromise);
    }

    public void promiseMarkAsHandled(IV8ValuePromise iV8ValuePromise) {
        this.v8Runtime.promiseMarkAsHandled(iV8ValuePromise);
    }

    public boolean promiseReject(V8ValuePromise v8ValuePromise, V8Value v8Value) {
        return this.v8Runtime.promiseReject(v8ValuePromise, v8Value);
    }

    public boolean promiseResolve(V8ValuePromise v8ValuePromise, V8Value v8Value) {
        return this.v8Runtime.promiseResolve(v8ValuePromise, v8Value);
    }

    public <T extends V8ValuePromise> T promiseThen(IV8ValuePromise iV8ValuePromise, IV8ValueFunction iV8ValueFunction, IV8ValueFunction iV8ValueFunction2) throws JavetException {
        return (T) this.v8Runtime.promiseThen(iV8ValuePromise, iV8ValueFunction, iV8ValueFunction2);
    }

    public V8ValueObject proxyGetHandler(IV8ValueProxy iV8ValueProxy) throws JavetException {
        return this.v8Runtime.proxyGetHandler(iV8ValueProxy);
    }

    public V8ValueObject proxyGetTarget(IV8ValueProxy iV8ValueProxy) throws JavetException {
        return this.v8Runtime.proxyGetTarget(iV8ValueProxy);
    }

    public boolean proxyIsRevoked(IV8ValueProxy iV8ValueProxy) throws JavetException {
        return this.v8Runtime.proxyIsRevoked(iV8ValueProxy);
    }

    public void proxyRevoke(IV8ValueProxy iV8ValueProxy) throws JavetException {
        this.v8Runtime.proxyRevoke(iV8ValueProxy);
    }

    public void removeReference(IV8ValueReference iV8ValueReference) throws JavetException {
        this.v8Runtime.removeReference(iV8ValueReference);
    }

    public boolean sameValue(IV8ValueObject iV8ValueObject, IV8ValueObject iV8ValueObject2) {
        return this.v8Runtime.sameValue(iV8ValueObject, iV8ValueObject2);
    }

    public byte[] scriptGetCachedData(IV8Script iV8Script) throws JavetException {
        return this.v8Runtime.scriptGetCachedData(iV8Script);
    }

    public String scriptGetResourceName(IV8Script iV8Script) throws JavetException {
        return this.v8Runtime.scriptGetResourceName(iV8Script);
    }

    public <T extends V8Value> T scriptRun(IV8Script iV8Script, boolean z2) throws JavetException {
        return (T) this.v8Runtime.scriptRun(iV8Script, z2);
    }

    public void setAdd(IV8ValueSet iV8ValueSet, V8Value v8Value) throws JavetException {
        this.v8Runtime.setAdd(iV8ValueSet, v8Value);
    }

    public V8ValueArray setAsArray(IV8ValueSet iV8ValueSet) throws JavetException {
        return this.v8Runtime.setAsArray(iV8ValueSet);
    }

    public void setClear(IV8ValueSet iV8ValueSet) {
        this.v8Runtime.setClear(iV8ValueSet);
    }

    public boolean setDelete(IV8ValueSet iV8ValueSet, V8Value v8Value) throws JavetException {
        return this.v8Runtime.setDelete(iV8ValueSet, v8Value);
    }

    public int setGetSize(IV8ValueSet iV8ValueSet) throws JavetException {
        return this.v8Runtime.setGetSize(iV8ValueSet);
    }

    public boolean setHas(IV8ValueSet iV8ValueSet, V8Value v8Value) throws JavetException {
        return this.v8Runtime.setHas(iV8ValueSet, v8Value);
    }

    public void setWeak(IV8ValueReference iV8ValueReference) {
        this.v8Runtime.setWeak(iV8ValueReference);
    }

    public boolean strictEquals(IV8ValueObject iV8ValueObject, IV8ValueObject iV8ValueObject2) {
        return this.v8Runtime.strictEquals(iV8ValueObject, iV8ValueObject2);
    }

    public V8ValueString stringObjectValueOf(V8ValueStringObject v8ValueStringObject) {
        return this.v8Runtime.stringObjectValueOf(v8ValueStringObject);
    }

    public String symbolDescription(V8ValueSymbol v8ValueSymbol) {
        return this.v8Runtime.symbolDescription(v8ValueSymbol);
    }

    public V8ValueSymbol symbolObjectValueOf(V8ValueSymbolObject v8ValueSymbolObject) {
        return this.v8Runtime.symbolObjectValueOf(v8ValueSymbolObject);
    }

    public V8ValueSymbolObject symbolToObject(V8ValueSymbol v8ValueSymbol) {
        return this.v8Runtime.symbolToObject(v8ValueSymbol);
    }

    public String toString(IV8ValueReference iV8ValueReference) throws JavetException {
        return this.v8Runtime.toString(iV8ValueReference);
    }

    V8Internal(V8Runtime v8Runtime) {
        Objects.requireNonNull(v8Runtime);
        this.v8Runtime = v8Runtime;
    }
}
