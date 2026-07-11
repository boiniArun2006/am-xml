package a;

import GJW.Lu;
import GJW.OU;
import GJW.vd;
import SJ0.eZk;
import Si.o;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.alightcreative.widget.TimelineTrimmingBarView;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class w6 extends AbstractC1499n {
    private final long KN;
    private final MutableState xMQ;

    public /* synthetic */ w6(long j2, o oVar, vd vdVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, oVar, (i2 & 4) != 0 ? Lu.n(OU.n()) : vdVar);
    }

    @Override // a.AbstractC1499n
    protected void Ik(boolean z2) {
        if (z2) {
            nr().s7N((int) XQ(), (int) Z());
        } else {
            nr().pause();
        }
    }

    public void S(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        eZk ezkN = eZk.n(view);
        Intrinsics.checkNotNullExpressionValue(ezkN, "bind(...)");
        ezkN.rl.n(CollectionsKt.emptyList(), J2());
        TimelineTrimmingBarView timelineTrimmingBarView = ezkN.f9432t;
        timelineTrimmingBarView.setTimelineDurationMillis(J2());
        timelineTrimmingBarView.setSelectionDurationMillis(this.KN);
        timelineTrimmingBarView.setDragging(KN());
        timelineTrimmingBarView.setSelectionStartMillis(((Number) this.xMQ.getValue()).longValue());
    }

    public final long XQ() {
        return ((Number) this.xMQ.getValue()).longValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(long j2, o player, vd scope) {
        super(player, scope);
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.KN = j2;
        this.xMQ = SnapshotStateKt__SnapshotStateKt.O(0L, null, 2, null);
    }

    private final long Z() {
        return XQ() + this.KN;
    }

    public final void WPU(float f3) {
        this.xMQ.setValue(Long.valueOf(XQ() + Math.max(-XQ(), Math.min((long) ((J2() * f3) / Uo()), J2() - Z()))));
        ty(XQ());
    }
}
