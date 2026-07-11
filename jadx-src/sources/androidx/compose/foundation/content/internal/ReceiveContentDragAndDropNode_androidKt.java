package androidx.compose.foundation.content.internal;

import android.view.DragEvent;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "receiveContentConfiguration", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "", "dragAndDropRequestPermission", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", c.f62177j, "(Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "Landroidx/compose/foundation/content/TransferableContent;", "rl", "(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)Landroidx/compose/foundation/content/TransferableContent;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ReceiveContentDragAndDropNode_androidKt {
    public static final DragAndDropTargetModifierNode n(final ReceiveContentConfiguration receiveContentConfiguration, final Function1 function1) {
        return DragAndDropNodeKt.t(new Function1<DragAndDropEvent, Boolean>() { // from class: androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt$ReceiveContentDragAndDropNode$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(DragAndDropEvent dragAndDropEvent) {
                return Boolean.TRUE;
            }
        }, new DragAndDropTarget() { // from class: androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt$ReceiveContentDragAndDropNode$2
            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void I(DragAndDropEvent event) {
                receiveContentConfiguration.getReceiveContentListener().t();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void Om(DragAndDropEvent event) {
                receiveContentConfiguration.getReceiveContentListener().rl();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public boolean f(DragAndDropEvent event) {
                function1.invoke(event);
                TransferableContent transferableContentRl = ReceiveContentDragAndDropNode_androidKt.rl(event);
                return !Intrinsics.areEqual(transferableContentRl, receiveContentConfiguration.getReceiveContentListener().O(transferableContentRl));
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void i(DragAndDropEvent event) {
                receiveContentConfiguration.getReceiveContentListener().n();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void xg(DragAndDropEvent event) {
                receiveContentConfiguration.getReceiveContentListener().nr();
            }
        });
    }

    public static final TransferableContent rl(DragAndDropEvent dragAndDropEvent) {
        DragEvent dragEventRl = DragAndDrop_androidKt.rl(dragAndDropEvent);
        return new TransferableContent(AndroidClipboardManager_androidKt.n(dragEventRl.getClipData()), AndroidClipboardManager_androidKt.rl(dragEventRl.getClipDescription()), TransferableContent.Source.INSTANCE.rl(), null, 8, null);
    }
}
