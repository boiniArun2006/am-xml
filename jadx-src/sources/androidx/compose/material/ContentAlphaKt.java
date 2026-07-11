package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\"\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "", c.f62177j, "Landroidx/compose/runtime/ProvidableCompositionLocal;", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalContentAlpha", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ContentAlphaKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ProvidableCompositionLocal f21746n = CompositionLocalKt.O(null, new Function0<Float>() { // from class: androidx.compose.material.ContentAlphaKt$LocalContentAlpha$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(1.0f);
        }
    }, 1, null);

    public static final ProvidableCompositionLocal n() {
        return f21746n;
    }
}
