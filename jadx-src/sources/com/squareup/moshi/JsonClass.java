package com.squareup.moshi;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonClass {
    boolean generateAdapter();

    String generator() default "";
}
