package com.caoccao.javet.utils;

import com.caoccao.javet.interop.proxy.plugins.f0;
import java.io.Serializable;
import java.lang.invoke.SerializedLambda;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class JavetReflectionUtils {
    private static final String METHOD_NAME_WRITE_REPLACE = "writeReplace";

    public static void safeSetAccessible(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Throwable unused) {
        }
    }

    private JavetReflectionUtils() {
    }

    public static String getMethodNameFromLambda(Serializable serializable) {
        Objects.requireNonNull(serializable);
        try {
            Method declaredMethod = serializable.getClass().getDeclaredMethod(METHOD_NAME_WRITE_REPLACE, new Class[0]);
            declaredMethod.setAccessible(true);
            return ((SerializedLambda) declaredMethod.invoke(serializable, new Object[0])).getImplMethodName();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Set<String> getMethodNameSetFromLambdas(Serializable... serializableArr) {
        Objects.requireNonNull(serializableArr);
        return (Set) Stream.of((Object[]) serializableArr).filter(new Predicate() { // from class: com.caoccao.javet.utils.j
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((Serializable) obj);
            }
        }).map(new Function() { // from class: com.caoccao.javet.utils.n
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return JavetReflectionUtils.getMethodNameFromLambda((Serializable) obj);
            }
        }).filter(new f0()).collect(Collectors.toSet());
    }
}
