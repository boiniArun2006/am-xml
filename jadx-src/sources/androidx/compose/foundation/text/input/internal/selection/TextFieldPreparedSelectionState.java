package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\"\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;", "", "<init>", "()V", "", "rl", "", c.f62177j, "F", "()F", "t", "(F)V", "cachedX", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextFieldPreparedSelectionState {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float cachedX = Float.NaN;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final float getCachedX() {
        return this.cachedX;
    }

    public final void rl() {
        this.cachedX = Float.NaN;
    }

    public final void t(float f3) {
        this.cachedX = f3;
    }
}
