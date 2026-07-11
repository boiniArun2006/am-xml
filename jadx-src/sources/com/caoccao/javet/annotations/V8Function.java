package com.caoccao.javet.annotations;

import com.caoccao.javet.enums.V8ValueSymbolType;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface V8Function {
    String name() default "";

    V8ValueSymbolType symbolType() default V8ValueSymbolType.None;

    boolean thisObjectRequired() default false;
}
