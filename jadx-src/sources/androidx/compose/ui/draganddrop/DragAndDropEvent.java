package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "", "Landroid/view/DragEvent;", "dragEvent", "<init>", "(Landroid/view/DragEvent;)V", c.f62177j, "Landroid/view/DragEvent;", "()Landroid/view/DragEvent;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DragAndDropEvent {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final DragEvent dragEvent;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final DragEvent getDragEvent() {
        return this.dragEvent;
    }

    public DragAndDropEvent(DragEvent dragEvent) {
        this.dragEvent = dragEvent;
    }
}
