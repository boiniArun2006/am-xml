package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Stable
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0003R+\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR+\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001b¨\u0006 "}, d2 = {"Landroidx/compose/material3/DrawerPredictiveBackState;", "", "<init>", "()V", "", "progress", "", "swipeEdgeLeft", "isRtl", "maxScaleXDistanceGrow", "maxScaleXDistanceShrink", "maxScaleYDistance", "", "KN", "(FZZFFF)V", c.f62177j, "<set-?>", "Landroidx/compose/runtime/MutableState;", "nr", "()Z", "Uo", "(Z)V", "swipeEdgeMatchesDrawer", "rl", "Landroidx/compose/runtime/MutableFloatState;", "()F", "O", "(F)V", "scaleXDistance", "t", "J2", "scaleYDistance", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/DrawerPredictiveBackState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,1167:1\n81#2:1168\n107#2,2:1169\n76#3:1171\n109#3,2:1172\n76#3:1174\n109#3,2:1175\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/DrawerPredictiveBackState\n*L\n1051#1:1168\n1051#1:1169,2\n1053#1:1171\n1053#1:1172,2\n1055#1:1174\n1055#1:1175,2\n*E\n"})
public final class DrawerPredictiveBackState {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableState swipeEdgeMatchesDrawer = SnapshotStateKt__SnapshotStateKt.O(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableFloatState scaleXDistance = PrimitiveSnapshotStateKt.n(0.0f);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableFloatState scaleYDistance = PrimitiveSnapshotStateKt.n(0.0f);

    public final void n() {
        Uo(true);
        O(0.0f);
        J2(0.0f);
    }

    public final void J2(float f3) {
        this.scaleYDistance.Z(f3);
    }

    public final void KN(float progress, boolean swipeEdgeLeft, boolean isRtl, float maxScaleXDistanceGrow, float maxScaleXDistanceShrink, float maxScaleYDistance) {
        Uo(swipeEdgeLeft != isRtl);
        if (!nr()) {
            maxScaleXDistanceGrow = maxScaleXDistanceShrink;
        }
        O(MathHelpersKt.rl(0.0f, maxScaleXDistanceGrow, progress));
        J2(MathHelpersKt.rl(0.0f, maxScaleYDistance, progress));
    }

    public final void O(float f3) {
        this.scaleXDistance.Z(f3);
    }

    public final void Uo(boolean z2) {
        this.swipeEdgeMatchesDrawer.setValue(Boolean.valueOf(z2));
    }

    public final boolean nr() {
        return ((Boolean) this.swipeEdgeMatchesDrawer.getValue()).booleanValue();
    }

    public final float rl() {
        return this.scaleXDistance.n();
    }

    public final float t() {
        return this.scaleYDistance.n();
    }
}
