package androidx.compose.ui.draganddrop;

import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropManager;", "", "Landroidx/compose/ui/draganddrop/DragAndDropNode;", "node", "Landroidx/compose/ui/geometry/Offset;", "offset", "", "iF", "(Landroidx/compose/ui/draganddrop/DragAndDropNode;J)V", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "target", "E2", "(Landroidx/compose/ui/draganddrop/DragAndDropTarget;)V", "", "fD", "(Landroidx/compose/ui/draganddrop/DragAndDropTarget;)Z", "te", "()Z", "isRequestDragAndDropTransferRequired", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DragAndDropManager {
    void E2(DragAndDropTarget target);

    boolean fD(DragAndDropTarget target);

    void iF(DragAndDropNode node, long offset);

    boolean te();
}
