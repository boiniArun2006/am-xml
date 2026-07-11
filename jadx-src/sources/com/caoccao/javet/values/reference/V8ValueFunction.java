package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.JSFunctionType;
import com.caoccao.javet.enums.JSScopeType;
import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Internal;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.utils.StringUtils;
import com.caoccao.javet.utils.V8ValueUtils;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.IV8ValueFunction;
import com.caoccao.javet.values.virtual.V8VirtualValueList;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class V8ValueFunction extends V8ValueObject implements IV8ValueFunction {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected static final String ERROR_THE_SOURCE_FUNCTION_CANNOT_BE_IN_ANOTHER_V8_RUNTIME = "The source function cannot be in another V8 runtime.";
    protected static final String ERROR_THE_SOURCE_FUNCTION_CANNOT_BE_THE_CALLER = "The source function cannot be the caller.";
    protected static final String ERROR_V8_CONTEXT_CANNOT_BE_NULL = "V8 context cannot be null.";
    protected JSFunctionType jsFunctionType;

    @Override // com.caoccao.javet.values.reference.IV8ValueFunction
    public <T extends V8Value> T callAsConstructor(Object... objArr) throws JavetException {
        V8VirtualValueList v8VirtualValueList = new V8VirtualValueList(checkV8Runtime(), null, objArr);
        try {
            T t3 = (T) this.v8Runtime.getV8Internal().functionCallAsConstructor(this, v8VirtualValueList.get());
            v8VirtualValueList.close();
            return t3;
        } catch (Throwable th) {
            try {
                v8VirtualValueList.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueFunction
    public <T extends V8Value> T callExtended(V8Value v8Value, boolean z2, Object... objArr) throws JavetException {
        V8VirtualValueList v8VirtualValueList = new V8VirtualValueList(checkV8Runtime(), null, objArr);
        try {
            T t3 = (T) this.v8Runtime.getV8Internal().functionCall(this, v8Value, z2, v8VirtualValueList.get());
            v8VirtualValueList.close();
            return t3;
        } catch (Throwable th) {
            try {
                v8VirtualValueList.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueFunction
    public JSFunctionType getJSFunctionType() throws JavetException {
        if (this.jsFunctionType == null) {
            this.jsFunctionType = checkV8Runtime().getV8Internal().functionGetJSFunctionType(this);
        }
        return this.jsFunctionType;
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public V8ValueReferenceType getType() {
        return V8ValueReferenceType.Function;
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueFunction
    public boolean setContext(V8Context v8Context) throws JavetException {
        Objects.requireNonNull(v8Context, ERROR_V8_CONTEXT_CANNOT_BE_NULL);
        return checkV8Runtime().getV8Internal().functionSetContext(this, v8Context);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueFunction
    public boolean setSourceCode(String str, IV8ValueFunction.SetSourceCodeOptions setSourceCodeOptions) throws JavetException {
        Objects.requireNonNull(setSourceCodeOptions, "Options cannot be null.");
        boolean zFunctionSetScriptSource = false;
        if (!getJSFunctionType().isUserDefined() || ((!getJSScopeType().isFunction() && !getJSScopeType().isScript()) || !StringUtils.isNotEmpty(str))) {
            return false;
        }
        if (setSourceCodeOptions.isTrimTailingCharacters()) {
            str = V8ValueUtils.trimAnonymousFunction(str);
        }
        V8Internal v8Internal = checkV8Runtime().getV8Internal();
        if (setSourceCodeOptions.isPreGC()) {
            this.v8Runtime.lowMemoryNotification();
        }
        try {
            if (setSourceCodeOptions.isNativeCalculation()) {
                zFunctionSetScriptSource = v8Internal.functionSetSourceCode(this, str, setSourceCodeOptions.isCloneScript());
            } else {
                IV8ValueFunction.ScriptSource codeSnippet = v8Internal.functionGetScriptSource(this).setCodeSnippet(str);
                if (getJSFunctionType().isUserDefined() && (getJSScopeType().isFunction() || getJSScopeType().isScript())) {
                    zFunctionSetScriptSource = v8Internal.functionSetScriptSource(this, codeSnippet, setSourceCodeOptions.isCloneScript());
                }
            }
            if (setSourceCodeOptions.isPostGC()) {
                this.v8Runtime.lowMemoryNotification();
            }
            return zFunctionSetScriptSource;
        } catch (Throwable th) {
            if (setSourceCodeOptions.isPostGC()) {
                this.v8Runtime.lowMemoryNotification();
            }
            throw th;
        }
    }

    protected V8ValueFunction(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
        this.jsFunctionType = null;
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueFunction
    public boolean canDiscardCompiled() throws JavetException {
        return checkV8Runtime().getV8Internal().functionCanDiscardCompiled(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueFunction
    public boolean copyScopeInfoFrom(IV8ValueFunction iV8ValueFunction) throws JavetException {
        if (getJSFunctionType().isUserDefined() && iV8ValueFunction.getJSFunctionType().isUserDefined()) {
            return this.v8Runtime.getV8Internal().functionCopyScopeInfoFrom(this, iV8ValueFunction);
        }
        return false;
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueFunction
    public boolean discardCompiled() throws JavetException {
        return checkV8Runtime().getV8Internal().functionDiscardCompiled(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueFunction
    public String[] getArguments() throws JavetException {
        return checkV8Runtime().getV8Internal().functionGetArguments(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8Cacheable
    public byte[] getCachedData() throws JavetException {
        return checkV8Runtime().getV8Internal().functionGetCachedData(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueFunction
    public V8Context getContext() throws JavetException {
        return checkV8Runtime().getV8Internal().functionGetContext(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueFunction
    public IV8ValueArray getInternalProperties() throws JavetException {
        return checkV8Runtime().getV8Internal().functionGetInternalProperties(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueFunction
    public JSScopeType getJSScopeType() throws JavetException {
        return checkV8Runtime().getV8Internal().functionGetJSScopeType(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueFunction
    public IV8ValueFunction.ScopeInfos getScopeInfos(IV8ValueFunction.GetScopeInfosOptions getScopeInfosOptions) throws JavetException {
        IV8ValueArray iV8ValueArrayFunctionGetScopeInfos = checkV8Runtime().getV8Internal().functionGetScopeInfos(this, getScopeInfosOptions);
        try {
            IV8ValueFunction.ScopeInfos scopeInfos = new IV8ValueFunction.ScopeInfos(iV8ValueArrayFunctionGetScopeInfos);
            if (iV8ValueArrayFunctionGetScopeInfos != null) {
                iV8ValueArrayFunctionGetScopeInfos.close();
            }
            return scopeInfos;
        } catch (Throwable th) {
            if (iV8ValueArrayFunctionGetScopeInfos != null) {
                try {
                    iV8ValueArrayFunctionGetScopeInfos.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueFunction
    public IV8ValueFunction.ScriptSource getScriptSource() throws JavetException {
        if (getJSFunctionType().isUserDefined()) {
            return checkV8Runtime().getV8Internal().functionGetScriptSource(this);
        }
        return null;
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueFunction
    public String getSourceCode() throws JavetException {
        if (getJSFunctionType().isUserDefined()) {
            return checkV8Runtime().getV8Internal().functionGetSourceCode(this);
        }
        return null;
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueFunction
    public boolean isCompiled() throws JavetException {
        return checkV8Runtime().getV8Internal().functionIsCompiled(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueFunction
    public boolean isWrapped() throws JavetException {
        return checkV8Runtime().getV8Internal().functionIsWrapped(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueFunction
    public boolean setScriptSource(IV8ValueFunction.ScriptSource scriptSource, boolean z2) throws JavetException {
        if (getJSFunctionType().isUserDefined()) {
            if ((getJSScopeType().isFunction() || getJSScopeType().isScript()) && scriptSource != null) {
                return checkV8Runtime().getV8Internal().functionSetScriptSource(this, scriptSource, z2);
            }
            return false;
        }
        return false;
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueFunction
    public <T extends V8Value> T callAsConstructor(V8Value... v8ValueArr) throws JavetException {
        return (T) checkV8Runtime().getV8Internal().functionCallAsConstructor(this, v8ValueArr);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueFunction
    public <T extends V8Value> T callExtended(V8Value v8Value, boolean z2, V8Value... v8ValueArr) throws JavetException {
        return (T) checkV8Runtime().getV8Internal().functionCall(this, v8Value, z2, v8ValueArr);
    }
}
