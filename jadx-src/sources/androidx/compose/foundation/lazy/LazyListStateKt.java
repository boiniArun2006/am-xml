package androidx.compose.foundation.lazy;

import GJW.Lu;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.DensityKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"", "initialFirstVisibleItemIndex", "initialFirstVisibleItemScrollOffset", "Landroidx/compose/foundation/lazy/LazyListState;", "rl", "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/LazyListState;", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", c.f62177j, "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "EmptyLazyListMeasureResult", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,603:1\n1247#2,6:604\n1247#2,6:610\n1247#2,6:616\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListStateKt\n*L\n76#1:604,6\n98#1:610,6\n100#1:616,6\n*E\n"})
public final class LazyListStateKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final LazyListMeasureResult f18135n;

    static {
        MeasureResult measureResult = new MeasureResult() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$EmptyLazyListMeasureResult$1

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
            private final int width;

            /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
            private final int height;

            /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
            private final Map alignmentLines = MapsKt.emptyMap();

            @Override // androidx.compose.ui.layout.MeasureResult
            public void Z() {
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* JADX INFO: renamed from: o, reason: from getter */
            public Map getAlignmentLines() {
                return this.alignmentLines;
            }
        };
        List listEmptyList = CollectionsKt.emptyList();
        Orientation orientation = Orientation.f16969n;
        int i2 = 0;
        boolean z2 = false;
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z3 = false;
        f18135n = new LazyListMeasureResult(null, i2, z2, f3, measureResult, f4, z3, Lu.n(EmptyCoroutineContext.INSTANCE), DensityKt.rl(1.0f, 0.0f, 2, null), ConstraintsKt.rl(0, 0, 0, 0, 15, null), listEmptyList, 0, 0, 0, false, orientation, 0, 0, null);
    }

    public static final LazyListState rl(final int i2, final int i3, Composer composer, int i5, int i7) {
        if ((i7 & 1) != 0) {
            i2 = 0;
        }
        if ((i7 & 2) != 0) {
            i3 = 0;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(1470655220, i5, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:74)");
        }
        Object[] objArr = new Object[0];
        Saver saverN = LazyListState.INSTANCE.n();
        boolean z2 = ((((i5 & 14) ^ 6) > 4 && composer.t(i2)) || (i5 & 6) == 4) | ((((i5 & 112) ^ 48) > 32 && composer.t(i3)) || (i5 & 48) == 32);
        Object objIF = composer.iF();
        if (z2 || objIF == Composer.INSTANCE.n()) {
            objIF = new Function0<LazyListState>() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$rememberLazyListState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final LazyListState invoke() {
                    return new LazyListState(i2, i3);
                }
            };
            composer.o(objIF);
        }
        LazyListState lazyListState = (LazyListState) RememberSaveableKt.O(objArr, saverN, null, (Function0) objIF, composer, 0, 4);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return lazyListState;
    }
}
