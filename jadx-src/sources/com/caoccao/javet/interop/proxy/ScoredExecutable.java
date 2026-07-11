package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.annotations.V8Function;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.utils.JavetTypeUtils;
import com.caoccao.javet.utils.JavetVirtualObject;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.V8ValueObject;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class ScoredExecutable<E extends AccessibleObject> {
    private static final Class<?> V8_VALUE_CLASS = V8Value.class;
    private final E executable;
    private JavetVirtualObject[] javetVirtualObjects;
    private final IJavetReflectionObjectFactory reflectionObjectFactory;
    private double score = 0.0d;
    private final Object targetObject;
    private final V8ValueObject thisObject;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void calculateScore() throws JavetException {
        boolean zThisObjectRequired;
        double d2;
        double d4;
        double d5;
        E e2 = this.executable;
        boolean z2 = e2 instanceof Constructor;
        Class<?>[] parameterTypes = z2 ? ((Constructor) e2).getParameterTypes() : ((Method) e2).getParameterTypes();
        boolean zIsVarArgs = z2 ? ((Constructor) this.executable).isVarArgs() : ((Method) this.executable).isVarArgs();
        int i2 = 0;
        if (!z2) {
            Method method = (Method) this.executable;
            zThisObjectRequired = method.isAnnotationPresent(V8Function.class) ? ((V8Function) method.getAnnotation(V8Function.class)).thisObjectRequired() : false;
        }
        if (zThisObjectRequired) {
            JavetVirtualObject[] javetVirtualObjectArr = new JavetVirtualObject[this.javetVirtualObjects.length + 1];
            javetVirtualObjectArr[0] = new JavetVirtualObject(this.thisObject);
            JavetVirtualObject[] javetVirtualObjectArr2 = this.javetVirtualObjects;
            System.arraycopy(javetVirtualObjectArr2, 0, javetVirtualObjectArr, 1, javetVirtualObjectArr2.length);
            this.javetVirtualObjects = javetVirtualObjectArr;
        }
        int length = parameterTypes.length;
        double d6 = 0.0d;
        this.score = 0.0d;
        int length2 = this.javetVirtualObjects.length;
        double d7 = 1.0d;
        if (length2 == 0) {
            if (zIsVarArgs) {
                if (length == 1) {
                    this.score = 0.99d;
                    return;
                }
                return;
            } else {
                if (length == 0) {
                    this.score = 1.0d;
                    return;
                }
                return;
            }
        }
        boolean z3 = zIsVarArgs && length2 >= length + (-1);
        boolean z4 = !zIsVarArgs && length2 == length;
        if (z3 || z4) {
            if (zIsVarArgs) {
                length--;
            }
            JavetReflectionProxyFactory javetReflectionProxyFactory = JavetReflectionProxyFactory.getInstance();
            double d8 = 0.0d;
            while (i2 < length) {
                Class<?> cls = parameterTypes[i2];
                d2 = d6;
                V8Value v8Value = this.javetVirtualObjects[i2].getV8Value();
                Object object = this.javetVirtualObjects[i2].getObject();
                double d9 = d7;
                if (v8Value == null) {
                    if (object == null) {
                        if (cls.isPrimitive()) {
                            d8 = d2;
                            break;
                        }
                        d8 += 0.9d;
                    } else if (cls.isAssignableFrom(object.getClass())) {
                        d8 += 0.9d;
                    } else {
                        if (cls.isPrimitive() && JavetTypeUtils.toExactPrimitive(cls, object) != null) {
                            d5 = 0.8d;
                        } else {
                            if (JavetTypeUtils.toApproximatePrimitive(cls, object) == null) {
                                d8 = d2;
                                break;
                            }
                            d5 = 0.7d;
                        }
                        d8 += d5;
                    }
                } else if (V8_VALUE_CLASS.isAssignableFrom(cls) && cls.isAssignableFrom(v8Value.getClass())) {
                    d8 += d9;
                } else if (object == null || !cls.isAssignableFrom(object.getClass())) {
                    if (javetReflectionProxyFactory.isSupportedFunction(cls, v8Value)) {
                        d8 += 0.95d;
                    } else if (javetReflectionProxyFactory.isSupportedObject(cls, v8Value)) {
                        d8 += 0.85d;
                    } else {
                        IJavetReflectionObjectFactory iJavetReflectionObjectFactory = this.reflectionObjectFactory;
                        if (iJavetReflectionObjectFactory != null && iJavetReflectionObjectFactory.isSupported(cls, v8Value)) {
                            d8 += 0.5d;
                        }
                    }
                }
                i2++;
                d6 = d2;
                d7 = d9;
            }
            d2 = d6;
            if ((length == 0 || (length > 0 && d8 > d2)) && z3) {
                Class<?> componentType = parameterTypes[length].getComponentType();
                while (length < length2) {
                    V8Value v8Value2 = this.javetVirtualObjects[length].getV8Value();
                    Object object2 = this.javetVirtualObjects[length].getObject();
                    if (v8Value2 == null) {
                        if (object2 == null) {
                            if (componentType.isPrimitive()) {
                                d8 = d2;
                                break;
                            }
                            d8 += 0.85d;
                        } else if (componentType.isAssignableFrom(object2.getClass())) {
                            d8 += 0.85d;
                        } else {
                            if (componentType.isPrimitive() && JavetTypeUtils.toExactPrimitive(componentType, object2) != null) {
                                d4 = 0.75d;
                            } else {
                                if (JavetTypeUtils.toApproximatePrimitive(componentType, object2) == null) {
                                    d8 = d2;
                                    break;
                                }
                                d4 = 0.65d;
                            }
                            d8 += d4;
                        }
                    } else if (!V8_VALUE_CLASS.isAssignableFrom(componentType) || !componentType.isAssignableFrom(v8Value2.getClass())) {
                        if (object2 == null || !componentType.isAssignableFrom(object2.getClass())) {
                            if (javetReflectionProxyFactory.isSupportedFunction(componentType, v8Value2)) {
                                d8 += 0.95d;
                            } else if (!javetReflectionProxyFactory.isSupportedObject(componentType, v8Value2)) {
                                IJavetReflectionObjectFactory iJavetReflectionObjectFactory2 = this.reflectionObjectFactory;
                                if (iJavetReflectionObjectFactory2 != null && iJavetReflectionObjectFactory2.isSupported(componentType, v8Value2)) {
                                    d8 += 0.5d;
                                }
                            }
                        }
                    }
                    length++;
                }
            }
            if (d8 > d2) {
                this.score = d8 / ((double) length2);
                if (z2) {
                    if (this.targetObject == null || ((Constructor) this.executable).getDeclaringClass() == this.targetObject.getClass()) {
                        return;
                    }
                    this.score *= 0.9d;
                    return;
                }
                if (this.targetObject == null || ((Method) this.executable).getDeclaringClass() == this.targetObject.getClass()) {
                    return;
                }
                this.score *= 0.9d;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0152  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute() throws Throwable {
        boolean z2;
        Object obj;
        boolean z3;
        Object approximatePrimitive;
        Object exactPrimitive;
        boolean z4;
        Object obj2;
        boolean z5;
        Object approximatePrimitive2;
        Object exactPrimitive2;
        int length = this.javetVirtualObjects.length;
        Object obj3 = Modifier.isStatic(((Member) this.executable).getModifiers()) ? null : this.targetObject;
        E e2 = this.executable;
        Class<?>[] parameterTypes = e2 instanceof Constructor ? ((Constructor) e2).getParameterTypes() : ((Method) e2).getParameterTypes();
        int length2 = parameterTypes.length;
        E e3 = this.executable;
        boolean zIsVarArgs = e3 instanceof Constructor ? ((Constructor) e3).isVarArgs() : ((Method) e3).isVarArgs();
        if (length == 0) {
            if (!zIsVarArgs) {
                E e4 = this.executable;
                return e4 instanceof Constructor ? ((Constructor) e4).newInstance(new Object[0]) : ((Method) e4).invoke(obj3, new Object[0]);
            }
            Object objNewInstance = Array.newInstance(parameterTypes[length2 - 1].getComponentType(), 0);
            E e5 = this.executable;
            return e5 instanceof Constructor ? ((Constructor) e5).newInstance(objNewInstance) : ((Method) e5).invoke(obj3, objNewInstance);
        }
        ArrayList arrayList = new ArrayList();
        if (zIsVarArgs) {
            length2--;
        }
        JavetReflectionProxyFactory javetReflectionProxyFactory = JavetReflectionProxyFactory.getInstance();
        for (int i2 = 0; i2 < length2; i2++) {
            Class<?> cls = parameterTypes[i2];
            V8Value v8Value = this.javetVirtualObjects[i2].getV8Value();
            Object object = this.javetVirtualObjects[i2].getObject();
            if (v8Value == null) {
                z4 = true;
                obj2 = object;
            } else if (V8_VALUE_CLASS.isAssignableFrom(cls)) {
                boolean zIsAssignableFrom = cls.isAssignableFrom(v8Value.getClass());
                Object object2 = v8Value;
                if (!zIsAssignableFrom) {
                    if (object != null && cls.isAssignableFrom(object.getClass())) {
                        z4 = false;
                        obj2 = object;
                    } else if (javetReflectionProxyFactory.isSupportedFunction(cls, v8Value) || javetReflectionProxyFactory.isSupportedObject(cls, v8Value)) {
                        object2 = javetReflectionProxyFactory.toObject(cls, v8Value);
                    } else {
                        IJavetReflectionObjectFactory iJavetReflectionObjectFactory = this.reflectionObjectFactory;
                        if (iJavetReflectionObjectFactory != null && iJavetReflectionObjectFactory.isSupported(cls, v8Value)) {
                            object2 = this.reflectionObjectFactory.toObject(cls, v8Value);
                        }
                        z4 = true;
                        obj2 = object;
                    }
                }
                z4 = false;
                obj2 = object2;
            }
            if (z4 && object != null && !cls.isAssignableFrom(object.getClass())) {
                if (!cls.isPrimitive() || (exactPrimitive2 = JavetTypeUtils.toExactPrimitive(cls, object)) == null) {
                    z5 = false;
                    obj2 = obj2;
                } else {
                    obj2 = exactPrimitive2;
                    z5 = true;
                }
                if (!z5 && (approximatePrimitive2 = JavetTypeUtils.toApproximatePrimitive(cls, object)) != null) {
                    obj2 = approximatePrimitive2;
                }
            }
            arrayList.add(obj2);
        }
        if (zIsVarArgs) {
            Class<?> componentType = parameterTypes[length2].getComponentType();
            Object objNewInstance2 = Array.newInstance(componentType, length - length2);
            for (int i3 = length2; i3 < length; i3++) {
                V8Value v8Value2 = this.javetVirtualObjects[i3].getV8Value();
                Object object3 = this.javetVirtualObjects[i3].getObject();
                if (v8Value2 == null) {
                    z2 = true;
                    obj = object3;
                } else if (V8_VALUE_CLASS.isAssignableFrom(componentType)) {
                    boolean zIsAssignableFrom2 = componentType.isAssignableFrom(v8Value2.getClass());
                    Object object4 = v8Value2;
                    if (!zIsAssignableFrom2) {
                        if (object3 != null && componentType.isAssignableFrom(object3.getClass())) {
                            z2 = false;
                            obj = object3;
                        } else if (javetReflectionProxyFactory.isSupportedFunction(componentType, v8Value2) || javetReflectionProxyFactory.isSupportedObject(componentType, v8Value2)) {
                            object4 = javetReflectionProxyFactory.toObject(componentType, v8Value2);
                        } else {
                            IJavetReflectionObjectFactory iJavetReflectionObjectFactory2 = this.reflectionObjectFactory;
                            if (iJavetReflectionObjectFactory2 != null && iJavetReflectionObjectFactory2.isSupported(componentType, v8Value2)) {
                                object4 = this.reflectionObjectFactory.toObject(componentType, v8Value2);
                            }
                            z2 = true;
                            obj = object3;
                        }
                    }
                    z2 = false;
                    obj = object4;
                }
                if (z2 && object3 != null && !componentType.isAssignableFrom(object3.getClass())) {
                    if (!componentType.isPrimitive() || (exactPrimitive = JavetTypeUtils.toExactPrimitive(componentType, object3)) == null) {
                        z3 = false;
                        obj = obj;
                    } else {
                        obj = exactPrimitive;
                        z3 = true;
                    }
                    if (!z3 && (approximatePrimitive = JavetTypeUtils.toApproximatePrimitive(componentType, object3)) != null) {
                        obj = approximatePrimitive;
                    }
                }
                Array.set(objNewInstance2, i3 - length2, obj);
            }
            arrayList.add(objNewInstance2);
        }
        E e6 = this.executable;
        return e6 instanceof Constructor ? ((Constructor) e6).newInstance(arrayList.toArray()) : ((Method) e6).invoke(obj3, arrayList.toArray());
    }

    public double getScore() {
        return this.score;
    }

    public ScoredExecutable(IJavetReflectionObjectFactory iJavetReflectionObjectFactory, Object obj, V8ValueObject v8ValueObject, E e2, JavetVirtualObject[] javetVirtualObjectArr) {
        this.executable = e2;
        this.reflectionObjectFactory = iJavetReflectionObjectFactory;
        this.javetVirtualObjects = javetVirtualObjectArr;
        this.targetObject = obj;
        this.thisObject = v8ValueObject;
    }
}
