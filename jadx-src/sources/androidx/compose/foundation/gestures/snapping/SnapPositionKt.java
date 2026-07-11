package androidx.compose.foundation.gestures.snapping;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aO\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "mainAxisViewPortSize", "beforeContentPadding", "afterContentPadding", "itemSize", "itemOffset", "itemIndex", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "snapPosition", "itemCount", "", c.f62177j, "(IIIIIILandroidx/compose/foundation/gestures/snapping/SnapPosition;I)F", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SnapPositionKt {
    public static final float n(int i2, int i3, int i5, int i7, int i8, int i9, SnapPosition snapPosition, int i10) {
        return i8 - snapPosition.n(i2, i7, i3, i5, i9, i10);
    }
}
