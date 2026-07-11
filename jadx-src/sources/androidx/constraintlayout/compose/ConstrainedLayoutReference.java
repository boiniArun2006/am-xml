package androidx.constraintlayout.compose;

import androidx.compose.runtime.Stable;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Stable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u0011\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR \u0010\u0014\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\f\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000eR \u0010\u001a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0016\u0010\u0018R \u0010\u001d\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\f\u0012\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u000b\u0010\u000eR \u0010!\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\f\u0012\u0004\b \u0010\u0010\u001a\u0004\b\u001f\u0010\u000eR \u0010$\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0017\u0012\u0004\b#\u0010\u0010\u001a\u0004\b\u0006\u0010\u0018R \u0010+\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010\u0010\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "Landroidx/constraintlayout/compose/LayoutReference;", "", "id", "<init>", "(Ljava/lang/Object;)V", "t", "Ljava/lang/Object;", "rl", "()Ljava/lang/Object;", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "nr", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "O", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "getStart$annotations", "()V", TtmlNode.START, "getAbsoluteLeft", "getAbsoluteLeft$annotations", "absoluteLeft", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "J2", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "getTop$annotations", "top", "Uo", "getEnd$annotations", TtmlNode.END, "KN", "getAbsoluteRight", "getAbsoluteRight$annotations", "absoluteRight", "xMQ", "getBottom$annotations", "bottom", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "mUb", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "getBaseline", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "getBaseline$annotations", "baseline", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConstrainedLayoutReference extends LayoutReference {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final ConstraintLayoutBaseScope.HorizontalAnchor top;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final ConstraintLayoutBaseScope.VerticalAnchor absoluteRight;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final ConstraintLayoutBaseScope.VerticalAnchor absoluteLeft;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final ConstraintLayoutBaseScope.VerticalAnchor end;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final ConstraintLayoutBaseScope.BaselineAnchor baseline;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final ConstraintLayoutBaseScope.VerticalAnchor start;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Object id;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final ConstraintLayoutBaseScope.HorizontalAnchor bottom;

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final ConstraintLayoutBaseScope.HorizontalAnchor getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final ConstraintLayoutBaseScope.VerticalAnchor getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final ConstraintLayoutBaseScope.VerticalAnchor getEnd() {
        return this.end;
    }

    @Override // androidx.constraintlayout.compose.LayoutReference
    /* JADX INFO: renamed from: rl, reason: from getter */
    public Object getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final ConstraintLayoutBaseScope.HorizontalAnchor getBottom() {
        return this.bottom;
    }

    public ConstrainedLayoutReference(Object obj) {
        super(obj);
        this.id = obj;
        this.start = new ConstraintLayoutBaseScope.VerticalAnchor(getId(), -2, this);
        this.absoluteLeft = new ConstraintLayoutBaseScope.VerticalAnchor(getId(), 0, this);
        this.top = new ConstraintLayoutBaseScope.HorizontalAnchor(getId(), 0, this);
        this.end = new ConstraintLayoutBaseScope.VerticalAnchor(getId(), -1, this);
        this.absoluteRight = new ConstraintLayoutBaseScope.VerticalAnchor(getId(), 1, this);
        this.bottom = new ConstraintLayoutBaseScope.HorizontalAnchor(getId(), 1, this);
        this.baseline = new ConstraintLayoutBaseScope.BaselineAnchor(getId(), this);
    }
}
