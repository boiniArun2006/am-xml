package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "<anonymous parameter 1>", c.f62177j, "(ILandroidx/compose/ui/unit/LayoutDirection;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
final class Arrangement$spacedBy$3 extends Lambda implements Function2<Integer, LayoutDirection, Integer> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Alignment.Vertical f17418n;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
        return n(num.intValue(), layoutDirection);
    }

    public final Integer n(int i2, LayoutDirection layoutDirection) {
        return Integer.valueOf(this.f17418n.n(0, i2));
    }
}
