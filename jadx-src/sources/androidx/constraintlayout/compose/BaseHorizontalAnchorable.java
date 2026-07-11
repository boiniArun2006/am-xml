package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLString;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/constraintlayout/compose/BaseHorizontalAnchorable;", "Landroidx/constraintlayout/compose/HorizontalAnchorable;", "Landroidx/constraintlayout/core/parser/CLObject;", "containerObject", "", "index", "<init>", "(Landroidx/constraintlayout/core/parser/CLObject;I)V", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "anchor", "Landroidx/compose/ui/unit/Dp;", "margin", "goneMargin", "", "rl", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FF)V", c.f62177j, "Landroidx/constraintlayout/core/parser/CLObject;", "", "Ljava/lang/String;", "anchorName", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BaseHorizontalAnchorable implements HorizontalAnchorable {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final CLObject containerObject;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final String anchorName;

    @Override // androidx.constraintlayout.compose.HorizontalAnchorable
    public final void rl(ConstraintLayoutBaseScope.HorizontalAnchor anchor, float margin, float goneMargin) {
        String strN = AnchorFunctions.f34404n.n(anchor.getIndex());
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.r(CLString.o(anchor.getId().toString()));
        cLArray.r(CLString.o(strN));
        cLArray.r(new CLNumber(margin));
        cLArray.r(new CLNumber(goneMargin));
        this.containerObject.wTp(this.anchorName, cLArray);
    }

    public BaseHorizontalAnchorable(CLObject cLObject, int i2) {
        this.containerObject = cLObject;
        this.anchorName = AnchorFunctions.f34404n.n(i2);
    }
}
