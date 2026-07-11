package androidx.compose.ui.draganddrop;

import androidx.compose.ui.geometry.Offset;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropStartTransferScope;", "Landroidx/compose/ui/geometry/Offset;", "it", "", c.f62177j, "(Landroidx/compose/ui/draganddrop/DragAndDropStartTransferScope;J)V"}, k = 3, mv = {1, 9, 0})
final class DragAndDropNode$drag$1 extends Lambda implements Function2<DragAndDropStartTransferScope, Offset, Unit> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Function1 f31223O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ DragAndDropTransferData f31224n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ long f31225t;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(DragAndDropStartTransferScope dragAndDropStartTransferScope, Offset offset) {
        n(dragAndDropStartTransferScope, offset.getPackedValue());
        return Unit.INSTANCE;
    }

    public final void n(DragAndDropStartTransferScope dragAndDropStartTransferScope, long j2) {
        dragAndDropStartTransferScope.n(this.f31224n, this.f31225t, this.f31223O);
    }
}
