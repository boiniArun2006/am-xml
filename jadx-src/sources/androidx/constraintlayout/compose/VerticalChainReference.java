package androidx.constraintlayout.compose;

import androidx.compose.runtime.Stable;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Stable
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R \u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR \u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u0012\u0004\b\u0010\u0010\f\u001a\u0004\b\u000f\u0010\n¨\u0006\u0012"}, d2 = {"Landroidx/constraintlayout/compose/VerticalChainReference;", "Landroidx/constraintlayout/compose/LayoutReference;", "", "id", "<init>", "(Ljava/lang/Object;)V", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "t", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "getTop", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "getTop$annotations", "()V", "top", "nr", "getBottom", "getBottom$annotations", "bottom", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VerticalChainReference extends LayoutReference {

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final ConstraintLayoutBaseScope.HorizontalAnchor bottom;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ConstraintLayoutBaseScope.HorizontalAnchor top;

    public VerticalChainReference(Object obj) {
        super(obj);
        this.top = new ConstraintLayoutBaseScope.HorizontalAnchor(obj, 0, this);
        this.bottom = new ConstraintLayoutBaseScope.HorizontalAnchor(obj, 1, this);
    }
}
