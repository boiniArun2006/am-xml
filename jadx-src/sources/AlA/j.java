package AlA;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface j {
    boolean deserialize() default true;

    boolean serialize() default true;
}
