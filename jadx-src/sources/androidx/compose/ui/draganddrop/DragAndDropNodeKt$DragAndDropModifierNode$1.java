package androidx.compose.ui.draganddrop;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.events.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropEvent;", a.f62811a, "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", c.f62177j, "(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)Landroidx/compose/ui/draganddrop/DragAndDropTarget;"}, k = 3, mv = {1, 9, 0})
final class DragAndDropNodeKt$DragAndDropModifierNode$1 extends Lambda implements Function1<DragAndDropEvent, DragAndDropTarget> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function1 f31233n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ DragAndDropTarget f31234t;

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final DragAndDropTarget invoke(DragAndDropEvent dragAndDropEvent) {
        if (((Boolean) this.f31233n.invoke(dragAndDropEvent)).booleanValue()) {
            return this.f31234t;
        }
        return null;
    }
}
