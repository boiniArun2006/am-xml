package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.unit.IntRect;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u000f\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/scrollcapture/ScrollCaptureCandidate;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "", "depth", "Landroidx/compose/ui/unit/IntRect;", "viewportBoundsInWindow", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;ILandroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/layout/LayoutCoordinates;)V", "", "toString", "()Ljava/lang/String;", c.f62177j, "Landroidx/compose/ui/semantics/SemanticsNode;", "t", "()Landroidx/compose/ui/semantics/SemanticsNode;", "rl", "I", "()I", "Landroidx/compose/ui/unit/IntRect;", "nr", "()Landroidx/compose/ui/unit/IntRect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ScrollCaptureCandidate {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final SemanticsNode node;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
    private final LayoutCoordinates coordinates;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final int depth;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final IntRect viewportBoundsInWindow;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final LayoutCoordinates getCoordinates() {
        return this.coordinates;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final IntRect getViewportBoundsInWindow() {
        return this.viewportBoundsInWindow;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final SemanticsNode getNode() {
        return this.node;
    }

    public String toString() {
        return "ScrollCaptureCandidate(node=" + this.node + ", depth=" + this.depth + ", viewportBoundsInWindow=" + this.viewportBoundsInWindow + ", coordinates=" + this.coordinates + ')';
    }

    public ScrollCaptureCandidate(SemanticsNode semanticsNode, int i2, IntRect intRect, LayoutCoordinates layoutCoordinates) {
        this.node = semanticsNode;
        this.depth = i2;
        this.viewportBoundsInWindow = intRect;
        this.coordinates = layoutCoordinates;
    }
}
