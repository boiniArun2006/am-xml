package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001BF\u0012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015Rm\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u00072'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b*\u0004\b\u001c\u0010\u001dRG\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!*\u0004\b\"\u0010\u001d¨\u0006#"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;", "Landroidx/compose/ui/node/DelegatingNode;", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropStartDetectorScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "detectDragStart", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "transferData", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;", "jB", "Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;", "cacheDrawScopeDragShadowCallback", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;", "U", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;", "dragAndDropModifierNode", "<set-?>", "getDetectDragStart", "()Lkotlin/jvm/functions/Function2;", "ni", "(Lkotlin/jvm/functions/Function2;)V", "getDetectDragStart$delegate", "(Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;)Ljava/lang/Object;", "getTransferData", "()Lkotlin/jvm/functions/Function1;", "GT", "(Lkotlin/jvm/functions/Function1;)V", "getTransferData$delegate", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DragSourceNodeWithDefaultPainter extends DelegatingNode {

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final DragAndDropSourceNode dragAndDropModifierNode;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private final CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback;

    public final void GT(Function1 function1) {
        this.dragAndDropModifierNode.jE(function1);
    }

    public final void ni(Function2 function2) {
        this.dragAndDropModifierNode.WKb(function2);
    }

    public DragSourceNodeWithDefaultPainter(Function2 function2, Function1 function1) {
        CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback = new CacheDrawScopeDragShadowCallback();
        UR(DrawModifierKt.n(new DragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1(cacheDrawScopeDragShadowCallback)));
        this.cacheDrawScopeDragShadowCallback = cacheDrawScopeDragShadowCallback;
        this.dragAndDropModifierNode = (DragAndDropSourceNode) UR(new DragAndDropSourceNode(new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter$dragAndDropModifierNode$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                n(drawScope);
                return Unit.INSTANCE;
            }

            public final void n(DrawScope drawScope) {
                this.f16429n.cacheDrawScopeDragShadowCallback.t(drawScope);
            }
        }, function2, function1));
    }
}
