package androidx.transition;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class PropertyValuesHolderUtils {

    @RequiresApi
    static class Api21Impl {
        @DoNotInline
        static <V> PropertyValuesHolder n(Property<?, V> property, Path path) {
            return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
        }
    }

    static PropertyValuesHolder n(Property property, Path path) {
        return Api21Impl.n(property, path);
    }
}
