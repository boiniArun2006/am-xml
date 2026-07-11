package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.semantics.CollectionInfo;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "", "reverseScrolling", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", c.f62177j, "(Landroidx/compose/foundation/lazy/grid/LazyGridState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazySemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySemantics.kt\nandroidx/compose/foundation/lazy/grid/LazySemanticsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,69:1\n1247#2,6:70\n*S KotlinDebug\n*F\n+ 1 LazySemantics.kt\nandroidx/compose/foundation/lazy/grid/LazySemanticsKt\n*L\n32#1:70,6\n*E\n"})
public final class LazySemanticsKt {
    public static final LazyLayoutSemanticState n(final LazyGridState lazyGridState, boolean z2, Composer composer, int i2) {
        boolean z3;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1247008005, i2, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:31)");
        }
        boolean z4 = false;
        if ((((i2 & 14) ^ 6) > 4 && composer.p5(lazyGridState)) || (i2 & 6) == 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((((i2 & 112) ^ 48) > 32 && composer.n(z2)) || (i2 & 48) == 32) {
            z4 = true;
        }
        boolean z5 = z3 | z4;
        Object objIF = composer.iF();
        if (z5 || objIF == Composer.INSTANCE.n()) {
            objIF = new LazyLayoutSemanticState() { // from class: androidx.compose.foundation.lazy.grid.LazySemanticsKt$rememberLazyGridSemanticState$1$1
                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public float J2() {
                    return LazyLayoutSemanticsKt.rl(lazyGridState.r(), lazyGridState.o());
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public int O() {
                    return (int) (lazyGridState.WPU().getOrientation() == Orientation.f16969n ? lazyGridState.WPU().rl() & 4294967295L : lazyGridState.WPU().rl() >> 32);
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public int n() {
                    return lazyGridState.WPU().nr() + lazyGridState.WPU().getAfterContentPadding();
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public CollectionInfo nr() {
                    return new CollectionInfo(-1, -1);
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public float rl() {
                    return LazyLayoutSemanticsKt.n(lazyGridState.r(), lazyGridState.o(), lazyGridState.J2());
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public Object t(int i3, Continuation continuation) {
                    Object objS7N = LazyGridState.s7N(lazyGridState, i3, 0, continuation, 2, null);
                    return objS7N == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objS7N : Unit.INSTANCE;
                }
            };
            composer.o(objIF);
        }
        LazySemanticsKt$rememberLazyGridSemanticState$1$1 lazySemanticsKt$rememberLazyGridSemanticState$1$1 = (LazySemanticsKt$rememberLazyGridSemanticState$1$1) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return lazySemanticsKt$rememberLazyGridSemanticState$1$1;
    }
}
