package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.semantics.ScrollAxisRange;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u0012\u0010\u0019\"\u0004\b\u001d\u0010\u001bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u000e\u0010 \"\u0004\b\u001c\u0010!R$\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001f\u001a\u0004\b\u0016\u0010 \"\u0004\b#\u0010!R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/compose/ui/platform/ScrollObservationScope;", "Landroidx/compose/ui/node/OwnerScope;", "", "semanticsNodeId", "", "allScopes", "", "oldXValue", "oldYValue", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "horizontalScrollAxisRange", "verticalScrollAxisRange", "<init>", "(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;Landroidx/compose/ui/semantics/ScrollAxisRange;Landroidx/compose/ui/semantics/ScrollAxisRange;)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "I", "nr", "()I", "t", "Ljava/util/List;", "getAllScopes", "()Ljava/util/List;", "O", "Ljava/lang/Float;", "rl", "()Ljava/lang/Float;", "Uo", "(Ljava/lang/Float;)V", "J2", "KN", "r", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "()Landroidx/compose/ui/semantics/ScrollAxisRange;", "(Landroidx/compose/ui/semantics/ScrollAxisRange;)V", "o", "xMQ", "", "Vvq", "()Z", "isValidOwnerScope", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ScrollObservationScope implements OwnerScope {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Float oldYValue;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Float oldXValue;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int semanticsNodeId;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private ScrollAxisRange verticalScrollAxisRange;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private ScrollAxisRange horizontalScrollAxisRange;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final List allScopes;

    public final void J2(ScrollAxisRange scrollAxisRange) {
        this.horizontalScrollAxisRange = scrollAxisRange;
    }

    public final void KN(Float f3) {
        this.oldYValue = f3;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final ScrollAxisRange getVerticalScrollAxisRange() {
        return this.verticalScrollAxisRange;
    }

    public final void Uo(Float f3) {
        this.oldXValue = f3;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean Vvq() {
        return this.allScopes.contains(this);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final ScrollAxisRange getHorizontalScrollAxisRange() {
        return this.horizontalScrollAxisRange;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final int getSemanticsNodeId() {
        return this.semanticsNodeId;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final Float getOldXValue() {
        return this.oldXValue;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Float getOldYValue() {
        return this.oldYValue;
    }

    public final void xMQ(ScrollAxisRange scrollAxisRange) {
        this.verticalScrollAxisRange = scrollAxisRange;
    }

    public ScrollObservationScope(int i2, List list, Float f3, Float f4, ScrollAxisRange scrollAxisRange, ScrollAxisRange scrollAxisRange2) {
        this.semanticsNodeId = i2;
        this.allScopes = list;
        this.oldXValue = f3;
        this.oldYValue = f4;
        this.horizontalScrollAxisRange = scrollAxisRange;
        this.verticalScrollAxisRange = scrollAxisRange2;
    }
}
