package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R+\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0012\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\nR$\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0017\u0010\u000eR\u0011\u0010\u0019\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\fR\u0011\u0010\u001b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\f¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/TopAppBarState;", "", "", "initialHeightOffsetLimit", "initialHeightOffset", "initialContentOffset", "<init>", "(FFF)V", "<set-?>", c.f62177j, "Landroidx/compose/runtime/MutableFloatState;", "nr", "()F", "KN", "(F)V", "heightOffsetLimit", "rl", "J2", "contentOffset", "Landroidx/compose/runtime/MutableFloatState;", "t", "_heightOffset", "newOffset", "Uo", "heightOffset", "collapsedFraction", "O", "overlappedFraction", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,2543:1\n76#2:2544\n109#2,2:2545\n76#2:2547\n109#2,2:2548\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarState\n*L\n1322#1:2544\n1322#1:2545,2\n1347#1:2547\n1347#1:2548,2\n*E\n"})
public final class TopAppBarState {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableFloatState heightOffsetLimit;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableFloatState contentOffset;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private MutableFloatState _heightOffset;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Saver f28850O = ListSaverKt.n(new Function2<SaverScope, TopAppBarState, List<? extends Float>>() { // from class: androidx.compose.material3.TopAppBarState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final List invoke(SaverScope saverScope, TopAppBarState topAppBarState) {
            return CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(topAppBarState.nr()), Float.valueOf(topAppBarState.t()), Float.valueOf(topAppBarState.rl())});
        }
    }, new Function1<List<? extends Float>, TopAppBarState>() { // from class: androidx.compose.material3.TopAppBarState$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final TopAppBarState invoke(List list) {
            return new TopAppBarState(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
        }
    });

    public final void J2(float f3) {
        this.contentOffset.Z(f3);
    }

    public final void KN(float f3) {
        this.heightOffsetLimit.Z(f3);
    }

    public final void Uo(float f3) {
        this._heightOffset.Z(RangesKt.coerceIn(f3, nr(), 0.0f));
    }

    public final float nr() {
        return this.heightOffsetLimit.n();
    }

    public final float rl() {
        return this.contentOffset.n();
    }

    public final float t() {
        return this._heightOffset.n();
    }

    public TopAppBarState(float f3, float f4, float f5) {
        this.heightOffsetLimit = PrimitiveSnapshotStateKt.n(f3);
        this.contentOffset = PrimitiveSnapshotStateKt.n(f5);
        this._heightOffset = PrimitiveSnapshotStateKt.n(f4);
    }

    public final float O() {
        if (nr() == 0.0f) {
            return 0.0f;
        }
        return 1 - (RangesKt.coerceIn(nr() - rl(), nr(), 0.0f) / nr());
    }

    public final float n() {
        if (nr() == 0.0f) {
            return 0.0f;
        }
        return t() / nr();
    }
}
