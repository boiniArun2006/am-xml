package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.CorePixelDp;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010!\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/constraintlayout/compose/State;", "Landroidx/constraintlayout/core/state/State;", "Landroidx/constraintlayout/compose/SolverState;", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "", "value", "", "O", "(Ljava/lang/Object;)I", "qie", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "az", "J", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "()J", "N", "(J)V", "rootIncomingConstraints", "Landroidx/compose/ui/unit/LayoutDirection;", "ty", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "getLayoutDirection$annotations", "()V", "layoutDirection", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/State\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2303:1\n1#2:2304\n288#3,2:2305\n*S KotlinDebug\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/State\n*L\n1584#1:2305,2\n*E\n"})
public final class State extends androidx.constraintlayout.core.state.State {

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final Density density;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private long rootIncomingConstraints = ConstraintsKt.rl(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private LayoutDirection layoutDirection = LayoutDirection.f34160n;

    /* JADX INFO: Access modifiers changed from: private */
    public static final float X(State state, float f3) {
        return state.density.getDensity() * f3;
    }

    public final void N(long j2) {
        this.rootIncomingConstraints = j2;
    }

    @Override // androidx.constraintlayout.core.state.State
    public int O(Object value) {
        return value instanceof Dp ? this.density.How(((Dp) value).getValue()) : super.O(value);
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final long getRootIncomingConstraints() {
        return this.rootIncomingConstraints;
    }

    public State(Density density) {
        this.density = density;
        aYN(new CorePixelDp() { // from class: androidx.constraintlayout.compose.w6
            @Override // androidx.constraintlayout.core.state.CorePixelDp
            public final float n(float f3) {
                return State.X(this.f34967n, f3);
            }
        });
    }
}
