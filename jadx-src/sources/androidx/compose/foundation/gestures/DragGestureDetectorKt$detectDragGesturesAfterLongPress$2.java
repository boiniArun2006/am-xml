package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "it", "", c.f62177j, "(J)V"}, k = 3, mv = {1, 9, 0})
final class DragGestureDetectorKt$detectDragGesturesAfterLongPress$2 extends Lambda implements Function1<Offset, Unit> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final DragGestureDetectorKt$detectDragGesturesAfterLongPress$2 f16747n = new DragGestureDetectorKt$detectDragGesturesAfterLongPress$2();

    DragGestureDetectorKt$detectDragGesturesAfterLongPress$2() {
        super(1);
    }

    public final void n(long j2) {
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
        n(offset.getPackedValue());
        return Unit.INSTANCE;
    }
}
