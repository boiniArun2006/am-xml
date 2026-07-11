package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class ObjectAnimatorUtils {

    @RequiresApi
    static class Api21Impl {
        @DoNotInline
        static <T, V> ObjectAnimator n(T t3, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t3, property, (TypeConverter) null, path);
        }
    }

    static ObjectAnimator n(Object obj, Property property, Path path) {
        return Api21Impl.n(obj, property, path);
    }
}
