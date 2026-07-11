package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.JSFunctionType;
import com.caoccao.javet.enums.JSScopeType;
import com.caoccao.javet.enums.V8ScopeType;
import com.caoccao.javet.enums.V8ValueInternalType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetClosable;
import com.caoccao.javet.interfaces.IJavetUniConsumer;
import com.caoccao.javet.utils.StringUtils;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueBigInteger;
import com.caoccao.javet.values.primitive.V8ValueZonedDateTime;
import com.caoccao.javet.values.reference.IV8ValueFunction;
import j$.time.ZonedDateTime;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface IV8ValueFunction extends IV8Cacheable, IV8ValueObject {

    public static final class GetScopeInfosOptions implements Cloneable {
        public static final GetScopeInfosOptions Default = new GetScopeInfosOptions();
        private boolean includeGlobalVariables;
        private boolean includeScopeTypeGlobal;

        private GetScopeInfosOptions setIncludeGlobalVariables(boolean z2) {
            this.includeGlobalVariables = z2;
            return this;
        }

        private GetScopeInfosOptions setIncludeScopeTypeGlobal(boolean z2) {
            this.includeScopeTypeGlobal = z2;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public GetScopeInfosOptions m177clone() {
            return new GetScopeInfosOptions().setIncludeGlobalVariables(isIncludeGlobalVariables()).setIncludeScopeTypeGlobal(isIncludeScopeTypeGlobal());
        }

        public boolean isIncludeGlobalVariables() {
            return this.includeGlobalVariables;
        }

        public boolean isIncludeScopeTypeGlobal() {
            return this.includeScopeTypeGlobal;
        }

        public GetScopeInfosOptions() {
            setIncludeGlobalVariables(false);
            setIncludeScopeTypeGlobal(false);
        }

        public GetScopeInfosOptions withIncludeGlobalVariables(boolean z2) {
            return m177clone().setIncludeGlobalVariables(z2);
        }

        public GetScopeInfosOptions withIncludeScopeTypeGlobal(boolean z2) {
            return m177clone().setIncludeScopeTypeGlobal(z2);
        }
    }

    public static final class ScopeInfo implements IJavetClosable {
        private final boolean context;
        private final int endPosition;
        private final V8ValueObject scopeObject;
        private final int startPosition;
        private final V8ScopeType type;

        @Override // com.caoccao.javet.interfaces.IJavetClosable, java.lang.AutoCloseable
        public void close() throws JavetException {
            this.scopeObject.close();
        }

        public int getEndPosition() {
            return this.endPosition;
        }

        public V8ValueObject getScopeObject() {
            return this.scopeObject;
        }

        public int getStartPosition() {
            return this.startPosition;
        }

        public V8ScopeType getType() {
            return this.type;
        }

        public boolean hasContext() {
            return this.context;
        }

        @Override // com.caoccao.javet.interfaces.IJavetClosable
        public boolean isClosed() {
            return this.scopeObject.isClosed();
        }

        ScopeInfo(V8ScopeType v8ScopeType, V8ValueObject v8ValueObject, boolean z2, int i2, int i3) {
            this.context = z2;
            this.endPosition = i3;
            this.scopeObject = v8ValueObject;
            this.startPosition = i2;
            this.type = v8ScopeType;
        }
    }

    public static final class ScopeInfos implements IJavetClosable {
        private static final int INDEX_SCOPE_END_POSITION = 4;
        private static final int INDEX_SCOPE_HAS_CONTEXT = 2;
        private static final int INDEX_SCOPE_OBJECT = 1;
        private static final int INDEX_SCOPE_START_POSITION = 3;
        private static final int INDEX_SCOPE_TYPE = 0;
        private final List<ScopeInfo> scopeInfos;

        private static List<ScopeInfo> createFrom(IV8ValueArray iV8ValueArray) throws Throwable {
            final ArrayList arrayList = new ArrayList();
            if (iV8ValueArray != null) {
                iV8ValueArray.forEach(new IJavetUniConsumer() { // from class: com.caoccao.javet.values.reference.j
                    @Override // com.caoccao.javet.interfaces.IJavetUniConsumer
                    public final void accept(V8Value v8Value) {
                        IV8ValueFunction.ScopeInfos.rl(arrayList, v8Value);
                    }
                });
            }
            return arrayList;
        }

        public static /* synthetic */ void rl(List list, V8Value v8Value) {
            if (v8Value instanceof V8ValueArray) {
                V8ValueArray v8ValueArray = (V8ValueArray) v8Value;
                list.add(new ScopeInfo(V8ScopeType.parse(v8ValueArray.getInteger(0).intValue()), (V8ValueObject) v8ValueArray.get(1), v8ValueArray.getBoolean(2).booleanValue(), v8ValueArray.getInteger(3).intValue(), v8ValueArray.getInteger(4).intValue()));
            }
        }

        @Override // com.caoccao.javet.interfaces.IJavetClosable, java.lang.AutoCloseable
        public void close() throws JavetException {
            Iterator<ScopeInfo> it = this.scopeInfos.iterator();
            while (it.hasNext()) {
                it.next().close();
            }
        }

        public ScopeInfo get(int i2) {
            return this.scopeInfos.get(i2);
        }

        public List<List<String>> getVariablesInClosure() throws JavetException {
            ArrayList arrayList = new ArrayList();
            Iterator<ScopeInfo> it = this.scopeInfos.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getScopeObject().getOwnPropertyNameStrings());
            }
            return arrayList;
        }

        public boolean hasVariablesInClosure() throws JavetException {
            Iterator it = ((List) this.scopeInfos.stream().filter(new Predicate() { // from class: com.caoccao.javet.values.reference.n
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return IV8ValueFunction.ScopeInfos.n((IV8ValueFunction.ScopeInfo) obj);
                }
            }).map(new Function() { // from class: com.caoccao.javet.values.reference.w6
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((IV8ValueFunction.ScopeInfo) obj).getScopeObject();
                }
            }).collect(Collectors.toList())).iterator();
            while (it.hasNext()) {
                IV8ValueArray ownPropertyNames = ((V8ValueObject) it.next()).getOwnPropertyNames();
                try {
                    if (ownPropertyNames.getLength() > 0) {
                        ownPropertyNames.close();
                        return true;
                    }
                    ownPropertyNames.close();
                } catch (Throwable th) {
                    if (ownPropertyNames != null) {
                        try {
                            ownPropertyNames.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            return false;
        }

        @Override // com.caoccao.javet.interfaces.IJavetClosable
        public boolean isClosed() {
            return this.scopeInfos.stream().allMatch(new Predicate() { // from class: com.caoccao.javet.values.reference.Ml
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((IV8ValueFunction.ScopeInfo) obj).isClosed();
                }
            });
        }

        public int size() {
            return this.scopeInfos.size();
        }

        ScopeInfos(IV8ValueArray iV8ValueArray) throws JavetException {
            this.scopeInfos = createFrom(iV8ValueArray);
        }

        public static /* synthetic */ boolean n(ScopeInfo scopeInfo) {
            if (scopeInfo.getType() == V8ScopeType.Closure) {
                return true;
            }
            return false;
        }
    }

    public static final class ScriptSource {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final String code;
        private final int endPosition;
        private final int startPosition;

        public ScriptSource(String str, int i2, int i3) {
            Objects.requireNonNull(str, "Code cannot be null.");
            this.code = str;
            this.startPosition = i2;
            this.endPosition = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && ScriptSource.class == obj.getClass()) {
                ScriptSource scriptSource = (ScriptSource) obj;
                if (getEndPosition() == scriptSource.getEndPosition() && getStartPosition() == scriptSource.getStartPosition() && getCode().equals(scriptSource.getCode())) {
                    return true;
                }
            }
            return false;
        }

        public String getCode() {
            return this.code;
        }

        public String getCodeSnippet() {
            return this.code.substring(this.startPosition, this.endPosition);
        }

        public int getEndPosition() {
            return this.endPosition;
        }

        public int getStartPosition() {
            return this.startPosition;
        }

        public int hashCode() {
            return Objects.hash(getCode(), Integer.valueOf(getEndPosition()), Integer.valueOf(getStartPosition()));
        }

        public ScriptSource setCodeSnippet(String str) {
            if (StringUtils.isNotEmpty(str)) {
                int length = this.code.length();
                int length2 = str.length();
                StringBuilder sb = new StringBuilder((length - (this.endPosition - this.startPosition)) + length2);
                sb.append((CharSequence) this.code, 0, this.startPosition);
                sb.append(str);
                sb.append((CharSequence) this.code, this.endPosition, length);
                String string = sb.toString();
                int i2 = this.startPosition;
                return new ScriptSource(string, i2, length2 + i2);
            }
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ScriptSource(String str) {
            this(str, 0, str.length());
            Objects.requireNonNull(str);
        }
    }

    public static final class SetSourceCodeOptions implements Cloneable {
        public static final SetSourceCodeOptions DEFAULT = new SetSourceCodeOptions();
        public static final SetSourceCodeOptions GC = new SetSourceCodeOptions().setPreGC(true).setPostGC(true);
        public static final SetSourceCodeOptions NATIVE_GC = new SetSourceCodeOptions().setPreGC(true).setPostGC(true).setNativeCalculation(true);
        private boolean cloneScript;
        private boolean nativeCalculation;
        private boolean postGC;
        private boolean preGC;
        private boolean trimTailingCharacters;

        private SetSourceCodeOptions setCloneScript(boolean z2) {
            this.cloneScript = z2;
            return this;
        }

        private SetSourceCodeOptions setNativeCalculation(boolean z2) {
            this.nativeCalculation = z2;
            return this;
        }

        private SetSourceCodeOptions setPostGC(boolean z2) {
            this.postGC = z2;
            return this;
        }

        private SetSourceCodeOptions setPreGC(boolean z2) {
            this.preGC = z2;
            return this;
        }

        private SetSourceCodeOptions setTrimTailingCharacters(boolean z2) {
            this.trimTailingCharacters = z2;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public SetSourceCodeOptions m178clone() {
            return new SetSourceCodeOptions().setCloneScript(isCloneScript()).setNativeCalculation(isNativeCalculation()).setPreGC(isPreGC()).setPostGC(isPostGC()).setTrimTailingCharacters(isTrimTailingCharacters());
        }

        public boolean isCloneScript() {
            return this.cloneScript;
        }

        public boolean isNativeCalculation() {
            return this.nativeCalculation;
        }

        public boolean isPostGC() {
            return this.postGC;
        }

        public boolean isPreGC() {
            return this.preGC;
        }

        public boolean isTrimTailingCharacters() {
            return this.trimTailingCharacters;
        }

        private SetSourceCodeOptions() {
            setCloneScript(false).setPreGC(false).setPostGC(false);
            setNativeCalculation(false).setTrimTailingCharacters(false);
        }

        public SetSourceCodeOptions withCloneScript(boolean z2) {
            return m178clone().setCloneScript(z2);
        }

        public SetSourceCodeOptions withNativeCalculation(boolean z2) {
            return m178clone().setNativeCalculation(z2);
        }

        public SetSourceCodeOptions withPostGC(boolean z2) {
            return m178clone().setPostGC(z2);
        }

        public SetSourceCodeOptions withPreGC(boolean z2) {
            return m178clone().setPreGC(z2);
        }

        public SetSourceCodeOptions withTrimTailingCharacters(boolean z2) {
            return m178clone().setTrimTailingCharacters(z2);
        }
    }

    default <T extends V8Value> T call(V8Value v8Value, Object... objArr) throws JavetException {
        return (T) callExtended(v8Value, true, objArr);
    }

    <T extends V8Value> T callAsConstructor(V8Value... v8ValueArr) throws JavetException;

    <T extends V8Value> T callAsConstructor(Object... objArr) throws JavetException;

    default BigInteger callBigInteger(V8Value v8Value, Object... objArr) throws JavetException {
        try {
            V8Value v8ValueCallExtended = callExtended(v8Value, true, objArr);
            try {
                if (!(v8ValueCallExtended instanceof V8ValueBigInteger)) {
                    if (v8ValueCallExtended == null) {
                        return null;
                    }
                    v8ValueCallExtended.close();
                    return null;
                }
                BigInteger value = ((V8ValueBigInteger) v8ValueCallExtended).getValue();
                if (v8ValueCallExtended == null) {
                    return value;
                }
                v8ValueCallExtended.close();
                return value;
            } finally {
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
        throw e2;
    }

    default Boolean callBoolean(V8Value v8Value, Object... objArr) throws JavetException {
        try {
            V8Value v8ValueCallExtended = callExtended(v8Value, true, objArr);
            try {
                Boolean boolValueOf = Boolean.valueOf(v8ValueCallExtended.asBoolean());
                v8ValueCallExtended.close();
                return boolValueOf;
            } finally {
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default Double callDouble(V8Value v8Value, Object... objArr) throws JavetException {
        try {
            V8Value v8ValueCallExtended = callExtended(v8Value, true, objArr);
            try {
                Double dValueOf = Double.valueOf(v8ValueCallExtended.asDouble());
                v8ValueCallExtended.close();
                return dValueOf;
            } finally {
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    <T extends V8Value> T callExtended(V8Value v8Value, boolean z2, V8Value... v8ValueArr) throws JavetException;

    <T extends V8Value> T callExtended(V8Value v8Value, boolean z2, Object... objArr) throws JavetException;

    default Integer callInteger(V8Value v8Value, Object... objArr) throws JavetException {
        try {
            V8Value v8ValueCallExtended = callExtended(v8Value, true, objArr);
            try {
                Integer numValueOf = Integer.valueOf(v8ValueCallExtended.asInt());
                v8ValueCallExtended.close();
                return numValueOf;
            } finally {
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default Long callLong(V8Value v8Value, Object... objArr) throws JavetException {
        try {
            V8Value v8ValueCallExtended = callExtended(v8Value, true, objArr);
            try {
                Long lValueOf = Long.valueOf(v8ValueCallExtended.asLong());
                v8ValueCallExtended.close();
                return lValueOf;
            } finally {
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default String callString(V8Value v8Value, Object... objArr) throws JavetException {
        try {
            V8Value v8ValueCallExtended = callExtended(v8Value, true, objArr);
            try {
                if (v8ValueCallExtended.isNullOrUndefined()) {
                    v8ValueCallExtended.close();
                    return null;
                }
                String strAsString = v8ValueCallExtended.asString();
                v8ValueCallExtended.close();
                return strAsString;
            } finally {
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
        throw e2;
    }

    default void callVoid(V8Value v8Value, Object... objArr) throws JavetException {
        callExtended(v8Value, false, objArr);
    }

    default ZonedDateTime callZonedDateTime(V8Value v8Value, Object... objArr) throws JavetException {
        try {
            V8Value v8ValueCallExtended = callExtended(v8Value, true, objArr);
            try {
                if (!(v8ValueCallExtended instanceof V8ValueZonedDateTime)) {
                    if (v8ValueCallExtended == null) {
                        return null;
                    }
                    v8ValueCallExtended.close();
                    return null;
                }
                ZonedDateTime value = ((V8ValueZonedDateTime) v8ValueCallExtended).getValue();
                if (v8ValueCallExtended == null) {
                    return value;
                }
                v8ValueCallExtended.close();
                return value;
            } finally {
            }
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
        throw e2;
    }

    boolean canDiscardCompiled() throws JavetException;

    boolean copyScopeInfoFrom(IV8ValueFunction iV8ValueFunction) throws JavetException;

    boolean discardCompiled() throws JavetException;

    String[] getArguments() throws JavetException;

    V8Context getContext() throws JavetException;

    IV8ValueArray getInternalProperties() throws JavetException;

    JSFunctionType getJSFunctionType() throws JavetException;

    JSScopeType getJSScopeType() throws JavetException;

    default ScopeInfos getScopeInfos() throws JavetException {
        return getScopeInfos(GetScopeInfosOptions.Default);
    }

    ScopeInfos getScopeInfos(GetScopeInfosOptions getScopeInfosOptions) throws JavetException;

    ScriptSource getScriptSource() throws JavetException;

    String getSourceCode() throws JavetException;

    boolean isCompiled() throws JavetException;

    boolean isWrapped() throws JavetException;

    boolean setContext(V8Context v8Context) throws JavetException;

    default boolean setScriptSource(ScriptSource scriptSource) throws JavetException {
        return setScriptSource(scriptSource, false);
    }

    boolean setScriptSource(ScriptSource scriptSource, boolean z2) throws JavetException;

    default boolean setSourceCode(String str) throws JavetException {
        return setSourceCode(str, SetSourceCodeOptions.DEFAULT);
    }

    boolean setSourceCode(String str, SetSourceCodeOptions setSourceCodeOptions) throws JavetException;

    default <T extends V8Value> T call(V8Value v8Value, V8Value... v8ValueArr) throws JavetException {
        return (T) callExtended(v8Value, true, (Object[]) v8ValueArr);
    }

    default void callVoid(V8Value v8Value, V8Value... v8ValueArr) throws JavetException {
        callExtended(v8Value, false, (Object[]) v8ValueArr);
    }

    default boolean isAsyncFunction() throws JavetException {
        return hasInternalType(V8ValueInternalType.AsyncFunction);
    }

    default boolean isGeneratorFunction() throws JavetException {
        return hasInternalType(V8ValueInternalType.GeneratorFunction);
    }

    default Float callFloat(V8Value v8Value, Object... objArr) throws JavetException {
        Double dCallDouble = callDouble(v8Value, objArr);
        if (dCallDouble == null) {
            return null;
        }
        return Float.valueOf(dCallDouble.floatValue());
    }

    default <T> T callObject(V8Value v8Value, Object... objArr) throws JavetException {
        try {
            return (T) getV8Runtime().toObject(callExtended(v8Value, true, objArr), true);
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    default boolean copyContextFrom(IV8ValueFunction iV8ValueFunction) throws JavetException {
        V8Context context = iV8ValueFunction.getContext();
        try {
            boolean context2 = setContext(context);
            if (context != null) {
                context.close();
            }
            return context2;
        } catch (Throwable th) {
            if (context != null) {
                try {
                    context.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
