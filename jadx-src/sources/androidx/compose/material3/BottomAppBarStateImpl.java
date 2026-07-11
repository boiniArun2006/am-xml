package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.Stable;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Stable
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R+\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0013\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\nR$\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0019\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\f¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/BottomAppBarStateImpl;", "Landroidx/compose/material3/BottomAppBarState;", "", "initialHeightOffsetLimit", "initialHeightOffset", "initialContentOffset", "<init>", "(FFF)V", "<set-?>", c.f62177j, "Landroidx/compose/runtime/MutableFloatState;", "O", "()F", "Uo", "(F)V", "heightOffsetLimit", "rl", "t", "nr", "contentOffset", "Landroidx/compose/runtime/MutableFloatState;", "_heightOffset", "newOffset", "J2", "heightOffset", "collapsedFraction", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/BottomAppBarStateImpl\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,2543:1\n76#2:2544\n109#2,2:2545\n76#2:2547\n109#2,2:2548\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/BottomAppBarStateImpl\n*L\n1701#1:2544\n1701#1:2545,2\n1710#1:2547\n1710#1:2548,2\n*E\n"})
final class BottomAppBarStateImpl implements BottomAppBarState {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableFloatState heightOffsetLimit;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableFloatState contentOffset;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private MutableFloatState _heightOffset;

    @Override // androidx.compose.material3.BottomAppBarState
    public void J2(float f3) {
        this._heightOffset.Z(RangesKt.coerceIn(f3, O(), 0.0f));
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public float O() {
        return this.heightOffsetLimit.n();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public void Uo(float f3) {
        this.heightOffsetLimit.Z(f3);
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public void nr(float f3) {
        this.contentOffset.Z(f3);
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public float rl() {
        return this._heightOffset.n();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public float t() {
        return this.contentOffset.n();
    }

    public BottomAppBarStateImpl(float f3, float f4, float f5) {
        this.heightOffsetLimit = PrimitiveSnapshotStateKt.n(f3);
        this.contentOffset = PrimitiveSnapshotStateKt.n(f5);
        this._heightOffset = PrimitiveSnapshotStateKt.n(f4);
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public float n() {
        if (O() == 0.0f) {
            return 0.0f;
        }
        return rl() / O();
    }
}
