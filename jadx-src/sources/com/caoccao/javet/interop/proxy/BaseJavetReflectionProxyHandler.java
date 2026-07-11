package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.annotations.V8Allow;
import com.caoccao.javet.annotations.V8Block;
import com.caoccao.javet.annotations.V8Function;
import com.caoccao.javet.annotations.V8Getter;
import com.caoccao.javet.annotations.V8Property;
import com.caoccao.javet.annotations.V8ProxyFunctionApply;
import com.caoccao.javet.annotations.V8Setter;
import com.caoccao.javet.enums.V8ConversionMode;
import com.caoccao.javet.enums.V8ProxyMode;
import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetEntityPropertyDescriptor;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.binding.ClassDescriptor;
import com.caoccao.javet.utils.JavetReflectionUtils;
import com.caoccao.javet.utils.JavetResourceUtils;
import com.caoccao.javet.utils.JavetTypeUtils;
import com.caoccao.javet.utils.JavetVirtualObject;
import com.caoccao.javet.utils.ListUtils;
import com.caoccao.javet.utils.SimpleMap;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueString;
import com.caoccao.javet.values.reference.V8ValueObject;
import java.lang.Exception;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class BaseJavetReflectionProxyHandler<T, E extends Exception> extends BaseJavetProxyHandler<T, E> {
    protected static final String[] GETTER_PREFIX_ARRAY = {"get", V8ValueObject.METHOD_PREFIX_IS};
    protected static final Pattern PATTERN_CAPITALIZED_PREFIX = Pattern.compile("^[A-Z]+");
    protected static final String[] SETTER_PREFIX_ARRAY = {"set", "put"};
    protected ClassDescriptor classDescriptor;

    @Override // com.caoccao.javet.interop.proxy.IJavetProxyHandler
    public V8Value getOwnPropertyDescriptor(V8Value v8Value, V8Value v8Value2) throws Exception {
        IJavetEntityPropertyDescriptor<T> proxyOwnPropertyDescriptor;
        V8Value v8ValueInternalGet = null;
        try {
            if (!(v8Value2 instanceof V8ValueString) || (proxyOwnPropertyDescriptor = this.classDescriptor.getClassProxyPlugin().getProxyOwnPropertyDescriptor(this.targetObject, ((V8ValueString) v8Value2).getValue())) == null || (v8ValueInternalGet = internalGet(v8Value, v8Value2)) == null) {
                JavetResourceUtils.safeClose(v8ValueInternalGet);
                return super.getOwnPropertyDescriptor(v8Value, v8Value2);
            }
            proxyOwnPropertyDescriptor.setValue(v8ValueInternalGet);
            return this.v8Runtime.toV8Value(proxyOwnPropertyDescriptor);
        } finally {
            JavetResourceUtils.safeClose(v8ValueInternalGet);
        }
    }

    public abstract V8ProxyMode getProxyMode();

    protected abstract void initialize();

    protected abstract V8Value internalGet(V8Value v8Value, V8Value v8Value2) throws Exception;

    /* JADX INFO: renamed from: com.caoccao.javet.interop.proxy.BaseJavetReflectionProxyHandler$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$caoccao$javet$enums$V8ConversionMode;

        static {
            int[] iArr = new int[V8ConversionMode.values().length];
            $SwitchMap$com$caoccao$javet$enums$V8ConversionMode = iArr;
            try {
                iArr[V8ConversionMode.AllowOnly.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ConversionMode[V8ConversionMode.BlockOnly.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static /* synthetic */ List J2(String str) {
        return new ArrayList();
    }

    public static /* synthetic */ List O(String str) {
        return new ArrayList();
    }

    protected static <E extends AccessibleObject> Object execute(IJavetReflectionObjectFactory iJavetReflectionObjectFactory, Object obj, V8ValueObject v8ValueObject, List<E> list, JavetVirtualObject[] javetVirtualObjectArr) throws Throwable {
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = list.iterator();
        while (it.hasNext()) {
            IJavetReflectionObjectFactory iJavetReflectionObjectFactory2 = iJavetReflectionObjectFactory;
            Object obj2 = obj;
            V8ValueObject v8ValueObject2 = v8ValueObject;
            JavetVirtualObject[] javetVirtualObjectArr2 = javetVirtualObjectArr;
            ScoredExecutable scoredExecutable = new ScoredExecutable(iJavetReflectionObjectFactory2, obj2, v8ValueObject2, (AccessibleObject) it.next(), javetVirtualObjectArr2);
            scoredExecutable.calculateScore();
            if (scoredExecutable.getScore() > 0.0d) {
                arrayList.add(scoredExecutable);
            }
            iJavetReflectionObjectFactory = iJavetReflectionObjectFactory2;
            obj = obj2;
            v8ValueObject = v8ValueObject2;
            javetVirtualObjectArr = javetVirtualObjectArr2;
        }
        if (!arrayList.isEmpty()) {
            arrayList.sort(new Comparator() { // from class: com.caoccao.javet.interop.proxy.CN3
                @Override // java.util.Comparator
                public final int compare(Object obj3, Object obj4) {
                    return Double.compare(((ScoredExecutable) obj4).getScore(), ((ScoredExecutable) obj3).getScore());
                }
            });
            Iterator it2 = arrayList.iterator();
            Throwable th = null;
            while (it2.hasNext()) {
                try {
                    return ((ScoredExecutable) it2.next()).execute();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (th != null) {
                throw th;
            }
        }
        return null;
    }

    public static /* synthetic */ List n(String str) {
        return new ArrayList();
    }

    public static /* synthetic */ List nr(String str) {
        return new ArrayList();
    }

    public static /* synthetic */ List t(String str) {
        return new ArrayList();
    }

    protected void addMethod(Method method, int i2, Map<String, List<Method>> map) {
        if (method.isAnnotationPresent(V8Function.class)) {
            String name = method.getName();
            String strName = ((V8Function) method.getAnnotation(V8Function.class)).name();
            if (!strName.isEmpty()) {
                name = strName;
            }
            map.computeIfAbsent(name, new Function() { // from class: com.caoccao.javet.interop.proxy.n
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BaseJavetReflectionProxyHandler.t((String) obj);
                }
            }).add(method);
            return;
        }
        String name2 = method.getName();
        String strSubstring = name2.substring(i2);
        if (i2 <= 0) {
            map.computeIfAbsent(strSubstring, new Function() { // from class: com.caoccao.javet.interop.proxy.Wre
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BaseJavetReflectionProxyHandler.O((String) obj);
                }
            }).add(method);
            return;
        }
        Matcher matcher = PATTERN_CAPITALIZED_PREFIX.matcher(strSubstring);
        if (!matcher.find()) {
            map.computeIfAbsent(strSubstring, new Function() { // from class: com.caoccao.javet.interop.proxy.I28
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BaseJavetReflectionProxyHandler.J2((String) obj);
                }
            }).add(method);
            return;
        }
        int length = matcher.group().length();
        if (length == 1) {
            StringBuilder sb = new StringBuilder();
            int i3 = length + i2;
            sb.append(name2.substring(i2, i3).toLowerCase(Locale.ROOT));
            sb.append(name2.substring(i3));
            map.computeIfAbsent(sb.toString(), new Function() { // from class: com.caoccao.javet.interop.proxy.w6
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BaseJavetReflectionProxyHandler.n((String) obj);
                }
            }).add(method);
            return;
        }
        for (int i5 = 1; i5 < length; i5++) {
            StringBuilder sb2 = new StringBuilder();
            int i7 = i2 + i5;
            sb2.append(name2.substring(i2, i7).toLowerCase(Locale.ROOT));
            sb2.append(name2.substring(i7));
            map.computeIfAbsent(sb2.toString(), new Function() { // from class: com.caoccao.javet.interop.proxy.Ml
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BaseJavetReflectionProxyHandler.nr((String) obj);
                }
            }).add(method);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected V8Value getByField(V8Value v8Value) throws JavetException {
        if (!this.classDescriptor.getFieldMap().isEmpty() && (v8Value instanceof V8ValueString)) {
            Field field = this.classDescriptor.getFieldMap().get(((V8ValueString) v8Value).toPrimitive());
            if (field != null) {
                try {
                    Object obj = field.get(Modifier.isStatic(field.getModifiers()) ? null : this.targetObject);
                    if (obj != null) {
                        return this.v8Runtime.toV8Value(obj);
                    }
                } catch (JavetException e2) {
                    throw e2;
                } catch (Throwable th) {
                    throw new JavetException(JavetError.CallbackUnknownFailure, SimpleMap.of("message", th.getMessage()), th);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected V8Value getByGetter(V8Value v8Value) throws JavetException {
        if (!this.classDescriptor.getGenericGetters().isEmpty()) {
            try {
                Object object = this.v8Runtime.toObject(v8Value);
                if (object != null && !(object instanceof V8Value)) {
                    for (Method method : this.classDescriptor.getGenericGetters()) {
                        Class<?> cls = method.getParameterTypes()[0];
                        Object approximatePrimitive = (V8Value.class.isAssignableFrom(cls) && cls.isAssignableFrom(v8Value.getClass())) ? v8Value : null;
                        if (approximatePrimitive == null && cls.isAssignableFrom(object.getClass())) {
                            approximatePrimitive = object;
                        }
                        if (approximatePrimitive == null && cls.isPrimitive()) {
                            approximatePrimitive = JavetTypeUtils.toExactPrimitive(cls, object);
                        }
                        if (approximatePrimitive == null) {
                            approximatePrimitive = JavetTypeUtils.toApproximatePrimitive(cls, object);
                        }
                        if (approximatePrimitive != null) {
                            Object objInvoke = method.invoke(Modifier.isStatic(method.getModifiers()) ? null : this.targetObject, approximatePrimitive);
                            if (objInvoke != null) {
                                return this.v8Runtime.toV8Value(objInvoke);
                            }
                        }
                    }
                }
            } catch (JavetException e2) {
                throw e2;
            } catch (Throwable th) {
                throw new JavetException(JavetError.CallbackUnknownFailure, SimpleMap.of("message", th.getMessage()), th);
            }
        }
        return null;
    }

    protected V8Value getByMethod(V8Value v8Value, V8Value v8Value2) throws Exception {
        if (!(v8Value2 instanceof V8ValueString)) {
            return null;
        }
        String primitive = ((V8ValueString) v8Value2).toPrimitive();
        if (this.classDescriptor.getClassProxyPlugin().isMethodProxyable(primitive, this.classDescriptor.getTargetClass())) {
            return null;
        }
        List<Method> list = this.classDescriptor.getMethodsMap().get(primitive);
        if (ListUtils.isNotEmpty(list)) {
            return this.v8Runtime.createV8ValueFunction(new JavetReflectionProxyInterceptor(this.v8Runtime.getConverter().getConfig().getReflectionObjectFactory(), this.targetObject, primitive, list).getCallbackContext());
        }
        List<Method> list2 = this.classDescriptor.getGettersMap().get(primitive);
        if (ListUtils.isNotEmpty(list2)) {
            return new JavetReflectionProxyInterceptor(this.v8Runtime.getConverter().getConfig().getReflectionObjectFactory(), this.targetObject, primitive, list2).invokeV8Value(v8Value, new V8Value[0]);
        }
        if (IJavetProxyHandler.FUNCTION_NAME_TO_V8_VALUE.equals(primitive)) {
            return this.classDescriptor.getClassProxyPlugin().getProxySymbolToPrimitive().invoke(this.v8Runtime, this.targetObject);
        }
        return null;
    }

    @Override // com.caoccao.javet.interop.proxy.IJavetProxyHandler
    public V8Value getPrototypeOf(V8Value v8Value) throws Exception {
        V8Value prototype = JavetProxyPrototypeStore.getPrototype(this.v8Runtime, getProxyMode(), this.classDescriptor.getTargetClass());
        return prototype != null ? prototype : super.getPrototypeOf(v8Value);
    }

    protected boolean hasFromGeneric(V8Value v8Value) throws JavetException {
        if (!this.classDescriptor.getGenericGetters().isEmpty()) {
            try {
                Object object = this.v8Runtime.toObject(v8Value);
                if (object != null && !(object instanceof V8Value)) {
                    for (Method method : this.classDescriptor.getGenericGetters()) {
                        Class<?> cls = method.getParameterTypes()[0];
                        T t3 = null;
                        Object approximatePrimitive = (V8Value.class.isAssignableFrom(cls) && cls.isAssignableFrom(v8Value.getClass())) ? v8Value : null;
                        if (approximatePrimitive == null && cls.isAssignableFrom(object.getClass())) {
                            approximatePrimitive = object;
                        }
                        if (approximatePrimitive == null && cls.isPrimitive()) {
                            approximatePrimitive = JavetTypeUtils.toExactPrimitive(cls, object);
                        }
                        if (approximatePrimitive == null) {
                            approximatePrimitive = JavetTypeUtils.toApproximatePrimitive(cls, object);
                        }
                        if (approximatePrimitive != null) {
                            if (!Modifier.isStatic(method.getModifiers())) {
                                t3 = this.targetObject;
                            }
                            try {
                                return method.invoke(t3, approximatePrimitive) != null;
                            } catch (Throwable unused) {
                                continue;
                            }
                        }
                    }
                }
            } catch (JavetException e2) {
                throw e2;
            } catch (Throwable unused2) {
            }
        }
        return false;
    }

    protected boolean hasFromRegular(V8Value v8Value) {
        if (!(v8Value instanceof V8ValueString)) {
            return false;
        }
        String primitive = ((V8ValueString) v8Value).toPrimitive();
        return this.classDescriptor.getFieldMap().containsKey(primitive) || this.classDescriptor.getMethodsMap().containsKey(primitive) || this.classDescriptor.getGettersMap().containsKey(primitive) || this.classDescriptor.getSettersMap().containsKey(primitive);
    }

    protected boolean isAllowed(V8ConversionMode v8ConversionMode, AccessibleObject accessibleObject) {
        int i2 = AnonymousClass1.$SwitchMap$com$caoccao$javet$enums$V8ConversionMode[v8ConversionMode.ordinal()];
        if (i2 == 1) {
            return accessibleObject.isAnnotationPresent(V8Allow.class);
        }
        if (i2 != 2) {
            return true;
        }
        return !accessibleObject.isAnnotationPresent(V8Block.class);
    }

    protected boolean isApplyFunction(Method method) {
        return method.isAnnotationPresent(V8ProxyFunctionApply.class);
    }

    protected boolean isGenericGetter(Method method) {
        if (method.isAnnotationPresent(V8Getter.class)) {
            return true;
        }
        String name = method.getName();
        for (String str : GETTER_PREFIX_ARRAY) {
            if (name.equals(str) && method.getParameterTypes().length == 1 && !method.isVarArgs()) {
                return true;
            }
        }
        return false;
    }

    protected boolean isGenericSetter(Method method) {
        if (method.isAnnotationPresent(V8Setter.class)) {
            return true;
        }
        String name = method.getName();
        for (String str : SETTER_PREFIX_ARRAY) {
            if (name.equals(str) && method.getParameterTypes().length == 2 && !method.isVarArgs()) {
                return true;
            }
        }
        return false;
    }

    protected boolean setToField(V8Value v8Value, V8Value v8Value2) throws JavetException {
        if (this.classDescriptor.getFieldMap().isEmpty() || !(v8Value instanceof V8ValueString)) {
            return false;
        }
        Field field = this.classDescriptor.getFieldMap().get(((V8ValueString) v8Value).toPrimitive());
        if (field == null) {
            return false;
        }
        int modifiers = field.getModifiers();
        if (Modifier.isFinal(modifiers)) {
            return false;
        }
        try {
            field.set(Modifier.isStatic(modifiers) ? null : this.targetObject, this.v8Runtime.toObject(v8Value2));
            return true;
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable th) {
            throw new JavetException(JavetError.CallbackUnknownFailure, SimpleMap.of("message", th.getMessage()), th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected boolean setToSetter(V8Value v8Value, V8Value v8Value2, V8Value v8Value3) throws JavetException {
        String str;
        List<Method> list;
        char c2;
        char c4 = 0;
        if (this.classDescriptor.getGenericSetters().isEmpty() && this.classDescriptor.getSettersMap().isEmpty()) {
            return false;
        }
        try {
            Object object = this.v8Runtime.toObject(v8Value2);
            Object object2 = this.v8Runtime.toObject(v8Value3);
            if (!this.classDescriptor.getGenericSetters().isEmpty() && object != null && !(object instanceof V8Value)) {
                try {
                    for (Method method : this.classDescriptor.getGenericSetters()) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        Class<?> cls = parameterTypes[c4];
                        Class<?> cls2 = parameterTypes[1];
                        T t3 = null;
                        Object approximatePrimitive = (V8Value.class.isAssignableFrom(cls) && cls.isAssignableFrom(v8Value2.getClass())) ? v8Value2 : null;
                        Object approximatePrimitive2 = (V8Value.class.isAssignableFrom(cls2) && cls2.isAssignableFrom(v8Value3.getClass())) ? v8Value3 : null;
                        if (approximatePrimitive == null) {
                            c2 = c4;
                            if (cls.isAssignableFrom(object.getClass())) {
                                approximatePrimitive = object;
                            }
                        } else {
                            c2 = c4;
                        }
                        if (approximatePrimitive2 == null && cls2.isAssignableFrom(object2.getClass())) {
                            approximatePrimitive2 = object2;
                        }
                        if (approximatePrimitive == null && cls.isPrimitive()) {
                            approximatePrimitive = JavetTypeUtils.toExactPrimitive(cls, object);
                        }
                        if (approximatePrimitive2 == null && cls2.isPrimitive()) {
                            approximatePrimitive2 = JavetTypeUtils.toExactPrimitive(cls2, object2);
                        }
                        if (approximatePrimitive == null) {
                            approximatePrimitive = JavetTypeUtils.toApproximatePrimitive(cls, object);
                        }
                        if (approximatePrimitive2 == null) {
                            approximatePrimitive2 = JavetTypeUtils.toApproximatePrimitive(cls2, object2);
                        }
                        if (approximatePrimitive != null) {
                            if (!Modifier.isStatic(method.getModifiers())) {
                                t3 = this.targetObject;
                            }
                            method.invoke(t3, approximatePrimitive, approximatePrimitive2);
                            return true;
                        }
                        c4 = c2;
                    }
                } catch (Throwable th) {
                    throw new JavetException(JavetError.CallbackUnknownFailure, SimpleMap.of("message", th.getMessage()), th);
                }
            }
            boolean z2 = c4;
            if (!(object instanceof String) || (list = this.classDescriptor.getSettersMap().get((str = (String) object))) == null) {
                return z2;
            }
            new JavetReflectionProxyInterceptor(this.v8Runtime.getConverter().getConfig().getReflectionObjectFactory(), this.targetObject, str, list).invokeObject((V8ValueObject) v8Value, v8Value3);
            return true;
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable th2) {
            throw new JavetException(JavetError.CallbackUnknownFailure, SimpleMap.of("message", th2.getMessage()), th2);
        }
    }

    public BaseJavetReflectionProxyHandler(V8Runtime v8Runtime, T t3) {
        super(v8Runtime, t3);
        this.classDescriptor = null;
        initialize();
    }

    @Override // com.caoccao.javet.interop.proxy.IJavetProxyHandler
    public V8Value get(V8Value v8Value, V8Value v8Value2, V8Value v8Value3) throws Exception {
        V8Value v8ValueInternalGet = internalGet(v8Value, v8Value2);
        if (v8ValueInternalGet == null) {
            return super.get(v8Value, v8Value2, v8Value3);
        }
        return v8ValueInternalGet;
    }

    protected int getGetterPrefixLength(Method method) {
        String name = method.getName();
        for (String str : GETTER_PREFIX_ARRAY) {
            if (name.startsWith(str) && name.length() > str.length() && method.getParameterTypes().length == 0) {
                return str.length();
            }
        }
        return 0;
    }

    protected int getSetterPrefixLength(Method method) {
        String name = method.getName();
        for (String str : SETTER_PREFIX_ARRAY) {
            if (name.startsWith(str) && name.length() > str.length() && method.getParameterTypes().length == 1) {
                return str.length();
            }
        }
        return 0;
    }

    protected void initializeConstructors(Class<?> cls, V8ConversionMode v8ConversionMode) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            if (isAllowed(v8ConversionMode, constructor)) {
                this.classDescriptor.getConstructors().add(constructor);
            }
        }
    }

    protected void initializePublicFields(Class<?> cls, V8ConversionMode v8ConversionMode, boolean z2) {
        for (Field field : cls.getFields()) {
            int modifiers = field.getModifiers();
            if ((!z2 || Modifier.isStatic(modifiers)) && Modifier.isPublic(modifiers) && isAllowed(v8ConversionMode, field)) {
                String name = field.getName();
                if (field.isAnnotationPresent(V8Property.class)) {
                    String strName = ((V8Property) field.getAnnotation(V8Property.class)).name();
                    if (!strName.isEmpty()) {
                        name = strName;
                    }
                }
                if (!this.classDescriptor.getFieldMap().containsKey(name)) {
                    JavetReflectionUtils.safeSetAccessible(field);
                    this.classDescriptor.getFieldMap().put(name, field);
                    if (!this.classDescriptor.getClassProxyPlugin().isUniqueKeySupported(this.classDescriptor.getTargetClass())) {
                        this.classDescriptor.getUniqueKeySet().add(name);
                    }
                }
            }
        }
    }

    protected void initializePublicMethods(Class<?> cls, V8ConversionMode v8ConversionMode, boolean z2) {
        for (Method method : cls.getMethods()) {
            int modifiers = method.getModifiers();
            if ((!z2 || Modifier.isStatic(modifiers)) && Modifier.isPublic(modifiers) && isAllowed(v8ConversionMode, method)) {
                JavetReflectionUtils.safeSetAccessible(method);
                if (isGenericGetter(method)) {
                    this.classDescriptor.getGenericGetters().add(method);
                } else if (isGenericSetter(method)) {
                    this.classDescriptor.getGenericSetters().add(method);
                } else if (isApplyFunction(method)) {
                    this.classDescriptor.getApplyFunctions().add(method);
                } else {
                    int getterPrefixLength = getGetterPrefixLength(method);
                    if (getterPrefixLength > 0) {
                        addMethod(method, getterPrefixLength, this.classDescriptor.getGettersMap());
                        if (!this.classDescriptor.getClassProxyPlugin().isUniqueKeySupported(this.classDescriptor.getTargetClass())) {
                            String strSubstring = method.getName().substring(getterPrefixLength);
                            Matcher matcher = PATTERN_CAPITALIZED_PREFIX.matcher(strSubstring);
                            if (matcher.find()) {
                                int length = matcher.group().length();
                                if (length == 1) {
                                    this.classDescriptor.getUniqueKeySet().add(strSubstring.substring(0, length).toLowerCase(Locale.ROOT) + strSubstring.substring(length));
                                } else {
                                    Set<String> uniqueKeySet = this.classDescriptor.getUniqueKeySet();
                                    StringBuilder sb = new StringBuilder();
                                    int i2 = length - 1;
                                    sb.append(strSubstring.substring(0, i2).toLowerCase(Locale.ROOT));
                                    sb.append(strSubstring.substring(i2));
                                    uniqueKeySet.add(sb.toString());
                                }
                            }
                        }
                    } else {
                        int setterPrefixLength = getSetterPrefixLength(method);
                        if (setterPrefixLength > 0) {
                            addMethod(method, setterPrefixLength, this.classDescriptor.getSettersMap());
                        }
                    }
                }
                addMethod(method, 0, this.classDescriptor.getMethodsMap());
            }
        }
    }
}
