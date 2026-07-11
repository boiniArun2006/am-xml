package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@LazyScopeMarker
@Stable
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyItemScope;", "", "Landroidx/compose/ui/Modifier;", "", "fraction", "rl", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LazyItemScope {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    Modifier rl(Modifier modifier, float f3);

    static /* synthetic */ Modifier n(LazyItemScope lazyItemScope, Modifier modifier, float f3, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
        }
        if ((i2 & 1) != 0) {
            f3 = 1.0f;
        }
        return lazyItemScope.rl(modifier, f3);
    }
}
