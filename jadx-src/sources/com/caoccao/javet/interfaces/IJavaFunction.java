package com.caoccao.javet.interfaces;

import com.caoccao.javet.interfaces.IJavaFunction;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@FunctionalInterface
public interface IJavaFunction<T, R> {
    static /* synthetic */ Object n(Object obj) {
        return obj;
    }

    R apply(T t3);

    static <T> IJavaFunction<T, T> identity() {
        return new IJavaFunction() { // from class: Ud.n
            @Override // com.caoccao.javet.interfaces.IJavaFunction
            public final Object apply(Object obj) {
                return IJavaFunction.n(obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object t(IJavaFunction iJavaFunction, IJavaFunction iJavaFunction2, Object obj) {
        iJavaFunction.getClass();
        return iJavaFunction.apply(iJavaFunction2.apply(obj));
    }

    default <V> IJavaFunction<T, V> andThen(final IJavaFunction<? super R, ? extends V> iJavaFunction) {
        Objects.requireNonNull(iJavaFunction);
        return new IJavaFunction() { // from class: Ud.j
            @Override // com.caoccao.javet.interfaces.IJavaFunction
            public final Object apply(Object obj) {
                return iJavaFunction.apply(this.f10790n.apply(obj));
            }
        };
    }

    default <V> IJavaFunction<V, R> compose(final IJavaFunction<? super V, ? extends T> iJavaFunction) {
        Objects.requireNonNull(iJavaFunction);
        return new IJavaFunction() { // from class: Ud.w6
            @Override // com.caoccao.javet.interfaces.IJavaFunction
            public final Object apply(Object obj) {
                return IJavaFunction.t(this.f10791n, iJavaFunction, obj);
            }
        };
    }
}
