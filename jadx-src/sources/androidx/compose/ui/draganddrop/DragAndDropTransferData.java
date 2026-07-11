package androidx.compose.ui.draganddrop;

import android.content.ClipData;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0007\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "", "Landroid/content/ClipData;", c.f62177j, "Landroid/content/ClipData;", "()Landroid/content/ClipData;", "clipData", "rl", "Ljava/lang/Object;", "t", "()Ljava/lang/Object;", "localState", "", "I", "()I", "flags", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DragAndDropTransferData {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ClipData clipData;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Object localState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int flags;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final ClipData getClipData() {
        return this.clipData;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int getFlags() {
        return this.flags;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Object getLocalState() {
        return this.localState;
    }
}
