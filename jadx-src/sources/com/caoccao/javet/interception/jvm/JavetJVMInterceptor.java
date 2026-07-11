package com.caoccao.javet.interception.jvm;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interception.BaseJavetDirectCallableInterceptor;
import com.caoccao.javet.interception.jvm.JavetJVMInterceptor;
import com.caoccao.javet.interfaces.IJavetUniFunction;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import com.caoccao.javet.interop.callback.JavetCallbackType;
import com.caoccao.javet.interop.converters.JavetProxyConverter;
import com.caoccao.javet.interop.proxy.IJavetDirectProxyHandler;
import com.caoccao.javet.utils.JavetResourceUtils;
import com.caoccao.javet.utils.SimpleList;
import com.caoccao.javet.utils.StringUtils;
import com.caoccao.javet.utils.V8ValueUtils;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueString;
import com.caoccao.javet.values.reference.IV8ValueObject;
import com.caoccao.javet.values.reference.V8ValueArray;
import com.caoccao.javet.values.reference.V8ValueObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class JavetJVMInterceptor extends BaseJavetDirectCallableInterceptor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String DEFAULT_NAME = "javet";
    protected static final String ERROR_THE_CONVERTER_MUST_BE_INSTANCE_OF_JAVET_PROXY_CONVERTER = "The converter must be instance of JavetProxyConverter.";
    protected static final JavetProxyConverter JAVET_PROXY_CONVERTER = new JavetProxyConverter();
    protected static final String JS_PROPERTY_PACKAGE = "package";
    protected static final String JS_PROPERTY_V8 = "v8";
    protected List<JavetCallbackContext> callbackContexts;
    protected String name;

    static abstract class BaseJavetPackage implements IJavetDirectProxyHandler<Exception> {
        protected Map<String, IJavetUniFunction<String, ? extends V8Value, Exception>> stringGetterMap;
        protected V8Runtime v8Runtime;

        public abstract String getName();

        public abstract boolean isValid();

        public static /* synthetic */ V8Value gh(BaseJavetPackage baseJavetPackage, V8Value[] v8ValueArr) {
            final String str = baseJavetPackage.getName() + ".";
            List list = (List) Stream.of((Object[]) Package.getPackages()).filter(new Predicate() { // from class: com.caoccao.javet.interception.jvm.CN3
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((Package) obj).getName().startsWith(str);
                }
            }).filter(new Predicate() { // from class: com.caoccao.javet.interception.jvm.fuX
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((Package) obj).getName().substring(str.length()).contains(".");
                }
            }).collect(Collectors.toList());
            ArrayList arrayList = new ArrayList(list.size());
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new JavetPackage(baseJavetPackage.v8Runtime, (Package) it.next()).toV8Value());
                }
                V8ValueArray v8ValueArrayCreateV8ValueArray = V8ValueUtils.createV8ValueArray(baseJavetPackage.v8Runtime, arrayList.toArray());
                JavetResourceUtils.safeClose(arrayList);
                return v8ValueArrayCreateV8ValueArray;
            } catch (Throwable th) {
                JavetResourceUtils.safeClose(arrayList);
                throw th;
            }
        }

        @Override // com.caoccao.javet.interop.proxy.IJavetDirectProxyHandler
        public V8Runtime getV8Runtime() {
            return this.v8Runtime;
        }

        @Override // com.caoccao.javet.interop.proxy.IJavetDirectProxyHandler
        public Map<String, IJavetUniFunction<String, ? extends V8Value, Exception>> proxyGetStringGetterMap() {
            if (this.stringGetterMap == null) {
                HashMap map = new HashMap();
                this.stringGetterMap = map;
                map.put(".getPackages", new IJavetUniFunction() { // from class: com.caoccao.javet.interception.jvm.w6
                    @Override // com.caoccao.javet.interfaces.IJavetUniFunction
                    public final Object apply(Object obj) {
                        JavetJVMInterceptor.BaseJavetPackage baseJavetPackage = this.f51602n;
                        return baseJavetPackage.v8Runtime.createV8ValueFunction(new JavetCallbackContext((String) obj, baseJavetPackage, JavetCallbackType.DirectCallNoThisAndResult, new Wre(baseJavetPackage)));
                    }
                });
                this.stringGetterMap.put(".name", new IJavetUniFunction() { // from class: com.caoccao.javet.interception.jvm.Ml
                    @Override // com.caoccao.javet.interfaces.IJavetUniFunction
                    public final Object apply(Object obj) {
                        JavetJVMInterceptor.BaseJavetPackage baseJavetPackage = this.f51591n;
                        return baseJavetPackage.v8Runtime.createV8ValueString(baseJavetPackage.getName());
                    }
                });
                this.stringGetterMap.put(".valid", new IJavetUniFunction() { // from class: com.caoccao.javet.interception.jvm.I28
                    @Override // com.caoccao.javet.interfaces.IJavetUniFunction
                    public final Object apply(Object obj) {
                        JavetJVMInterceptor.BaseJavetPackage baseJavetPackage = this.f51590n;
                        return baseJavetPackage.v8Runtime.createV8ValueBoolean(baseJavetPackage.isValid());
                    }
                });
            }
            return this.stringGetterMap;
        }

        public V8Value toV8Value() throws JavetException {
            return JavetJVMInterceptor.JAVET_PROXY_CONVERTER.toV8Value(this.v8Runtime, this);
        }

        public BaseJavetPackage(V8Runtime v8Runtime) {
            this.v8Runtime = v8Runtime;
        }

        @Override // com.caoccao.javet.interop.proxy.IJavetDirectProxyHandler
        public V8Value proxyGet(V8Value v8Value, V8Value v8Value2, V8Value v8Value3) throws Exception {
            V8Value v8ValueProxyGet = super.proxyGet(v8Value, v8Value2, v8Value3);
            if (v8ValueProxyGet == null && (v8Value2 instanceof V8ValueString)) {
                String value = ((V8ValueString) v8Value2).getValue();
                if (!StringUtils.isEmpty(value)) {
                    if (!StringUtils.isEmpty(getName())) {
                        value = getName() + "." + value;
                    }
                    try {
                        return JavetJVMInterceptor.JAVET_PROXY_CONVERTER.toV8Value(this.v8Runtime, Class.forName(value));
                    } catch (Throwable unused) {
                        Package r2 = Package.getPackage(value);
                        if (r2 != null) {
                            return new JavetPackage(this.v8Runtime, r2).toV8Value();
                        }
                        return new JavetVirtualPackage(this.v8Runtime, value).toV8Value();
                    }
                }
                return v8ValueProxyGet;
            }
            return v8ValueProxyGet;
        }
    }

    static class JavetPackage extends BaseJavetPackage {
        protected Package namedPackage;

        @Override // com.caoccao.javet.interception.jvm.JavetJVMInterceptor.BaseJavetPackage
        public boolean isValid() {
            return true;
        }

        @Override // com.caoccao.javet.interception.jvm.JavetJVMInterceptor.BaseJavetPackage
        public String getName() {
            return this.namedPackage.getName();
        }

        @Override // com.caoccao.javet.interception.jvm.JavetJVMInterceptor.BaseJavetPackage, com.caoccao.javet.interop.proxy.IJavetDirectProxyHandler
        public Map<String, IJavetUniFunction<String, ? extends V8Value, Exception>> proxyGetStringGetterMap() {
            if (this.stringGetterMap == null) {
                Map<String, IJavetUniFunction<String, ? extends V8Value, Exception>> mapProxyGetStringGetterMap = super.proxyGetStringGetterMap();
                this.stringGetterMap = mapProxyGetStringGetterMap;
                mapProxyGetStringGetterMap.put(".implementationTitle", new IJavetUniFunction() { // from class: com.caoccao.javet.interception.jvm.Dsr
                    @Override // com.caoccao.javet.interfaces.IJavetUniFunction
                    public final Object apply(Object obj) {
                        JavetJVMInterceptor.JavetPackage javetPackage = this.f51589n;
                        return javetPackage.v8Runtime.createV8ValueString(javetPackage.namedPackage.getImplementationTitle());
                    }
                });
                this.stringGetterMap.put(".implementationVersion", new IJavetUniFunction() { // from class: com.caoccao.javet.interception.jvm.aC
                    @Override // com.caoccao.javet.interfaces.IJavetUniFunction
                    public final Object apply(Object obj) {
                        JavetJVMInterceptor.JavetPackage javetPackage = this.f51595n;
                        return javetPackage.v8Runtime.createV8ValueString(javetPackage.namedPackage.getImplementationVersion());
                    }
                });
                this.stringGetterMap.put(".implementationVendor", new IJavetUniFunction() { // from class: com.caoccao.javet.interception.jvm.C
                    @Override // com.caoccao.javet.interfaces.IJavetUniFunction
                    public final Object apply(Object obj) {
                        JavetJVMInterceptor.JavetPackage javetPackage = this.f51587n;
                        return javetPackage.v8Runtime.createV8ValueString(javetPackage.namedPackage.getImplementationVendor());
                    }
                });
                this.stringGetterMap.put(".sealed", new IJavetUniFunction() { // from class: com.caoccao.javet.interception.jvm.o
                    @Override // com.caoccao.javet.interfaces.IJavetUniFunction
                    public final Object apply(Object obj) {
                        JavetJVMInterceptor.JavetPackage javetPackage = this.f51600n;
                        return javetPackage.v8Runtime.createV8ValueBoolean(javetPackage.namedPackage.isSealed());
                    }
                });
                this.stringGetterMap.put(".specificationTitle", new IJavetUniFunction() { // from class: com.caoccao.javet.interception.jvm.qz
                    @Override // com.caoccao.javet.interfaces.IJavetUniFunction
                    public final Object apply(Object obj) {
                        JavetJVMInterceptor.JavetPackage javetPackage = this.f51601n;
                        return javetPackage.v8Runtime.createV8ValueString(javetPackage.namedPackage.getSpecificationTitle());
                    }
                });
                this.stringGetterMap.put(".specificationVersion", new IJavetUniFunction() { // from class: com.caoccao.javet.interception.jvm.Pl
                    @Override // com.caoccao.javet.interfaces.IJavetUniFunction
                    public final Object apply(Object obj) {
                        JavetJVMInterceptor.JavetPackage javetPackage = this.f51592n;
                        return javetPackage.v8Runtime.createV8ValueString(javetPackage.namedPackage.getSpecificationVersion());
                    }
                });
                this.stringGetterMap.put(".specificationVendor", new IJavetUniFunction() { // from class: com.caoccao.javet.interception.jvm.Xo
                    @Override // com.caoccao.javet.interfaces.IJavetUniFunction
                    public final Object apply(Object obj) {
                        JavetJVMInterceptor.JavetPackage javetPackage = this.f51594n;
                        return javetPackage.v8Runtime.createV8ValueString(javetPackage.namedPackage.getSpecificationVendor());
                    }
                });
            }
            return this.stringGetterMap;
        }

        public JavetPackage(V8Runtime v8Runtime, Package r2) {
            super(v8Runtime);
            this.namedPackage = r2;
            this.stringGetterMap = null;
        }
    }

    static class JavetV8 implements IJavetDirectProxyHandler<Exception> {
        protected Map<String, IJavetUniFunction<String, ? extends V8Value, Exception>> stringGetterMap;
        protected V8Runtime v8Runtime;

        @Override // com.caoccao.javet.interop.proxy.IJavetDirectProxyHandler
        public V8Runtime getV8Runtime() {
            return this.v8Runtime;
        }

        @Override // com.caoccao.javet.interop.proxy.IJavetDirectProxyHandler
        public Map<String, IJavetUniFunction<String, ? extends V8Value, Exception>> proxyGetStringGetterMap() {
            if (this.stringGetterMap == null) {
                HashMap map = new HashMap();
                this.stringGetterMap = map;
                map.put("gc", new IJavetUniFunction() { // from class: com.caoccao.javet.interception.jvm.eO
                    @Override // com.caoccao.javet.interfaces.IJavetUniFunction
                    public final Object apply(Object obj) {
                        JavetJVMInterceptor.JavetV8 javetV8 = this.f51596n;
                        return javetV8.v8Runtime.createV8ValueFunction(new JavetCallbackContext((String) obj, javetV8, JavetCallbackType.DirectCallNoThisAndNoResult, new z(javetV8)));
                    }
                });
            }
            return this.stringGetterMap;
        }

        public V8Value toV8Value() throws JavetException {
            return JavetJVMInterceptor.JAVET_PROXY_CONVERTER.toV8Value(this.v8Runtime, this);
        }

        public JavetV8(V8Runtime v8Runtime) {
            this.v8Runtime = v8Runtime;
        }
    }

    static class JavetVirtualPackage extends BaseJavetPackage {
        protected String packageName;

        @Override // com.caoccao.javet.interception.jvm.JavetJVMInterceptor.BaseJavetPackage
        public boolean isValid() {
            return false;
        }

        @Override // com.caoccao.javet.interception.jvm.JavetJVMInterceptor.BaseJavetPackage
        public String getName() {
            return this.packageName;
        }

        public JavetVirtualPackage(V8Runtime v8Runtime, String str) {
            super(v8Runtime);
            this.packageName = str;
        }
    }

    @Override // com.caoccao.javet.interception.BaseJavetInterceptor, com.caoccao.javet.interfaces.IJavetInterceptor
    public boolean unregister(IV8ValueObject... iV8ValueObjectArr) throws JavetException {
        boolean zDelete = true;
        for (IV8ValueObject iV8ValueObject : iV8ValueObjectArr) {
            zDelete &= iV8ValueObject.delete(this.name);
        }
        return zDelete;
    }

    public void addCallbackContexts(JavetCallbackContext... javetCallbackContextArr) {
        Collections.addAll(this.callbackContexts, javetCallbackContextArr);
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable
    public JavetCallbackContext[] getCallbackContexts() {
        return (JavetCallbackContext[]) this.callbackContexts.toArray(new JavetCallbackContext[0]);
    }

    public String getName() {
        return this.name;
    }

    @Override // com.caoccao.javet.interception.BaseJavetInterceptor, com.caoccao.javet.interfaces.IJavetInterceptor
    public boolean register(IV8ValueObject... iV8ValueObjectArr) throws JavetException {
        V8ValueObject v8ValueObjectCreateV8ValueObject = this.v8Runtime.createV8ValueObject();
        try {
            v8ValueObjectCreateV8ValueObject.bind(this);
            boolean z2 = true;
            for (IV8ValueObject iV8ValueObject : iV8ValueObjectArr) {
                z2 &= iV8ValueObject.set(this.name, v8ValueObjectCreateV8ValueObject);
            }
            v8ValueObjectCreateV8ValueObject.close();
            return z2;
        } catch (Throwable th) {
            if (v8ValueObjectCreateV8ValueObject != null) {
                try {
                    v8ValueObjectCreateV8ValueObject.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public JavetJVMInterceptor(V8Runtime v8Runtime) {
        super(v8Runtime);
        JavetCallbackType javetCallbackType = JavetCallbackType.DirectCallGetterAndNoThis;
        this.callbackContexts = SimpleList.of(new JavetCallbackContext(JS_PROPERTY_V8, this, javetCallbackType, new j(v8Runtime)), new JavetCallbackContext("package", this, javetCallbackType, new n(v8Runtime)));
        this.name = DEFAULT_NAME;
    }

    public void setName(String str) {
        Objects.requireNonNull(str);
        this.name = str;
    }
}
