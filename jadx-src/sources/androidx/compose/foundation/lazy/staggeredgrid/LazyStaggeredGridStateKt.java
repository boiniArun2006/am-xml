package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "initialFirstVisibleItemIndex", "initialFirstVisibleItemScrollOffset", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", c.f62177j, "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,639:1\n1247#2,6:640\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridStateKt\n*L\n77#1:640,6\n*E\n"})
public final class LazyStaggeredGridStateKt {
    public static final LazyStaggeredGridState n(final int i2, final int i3, Composer composer, int i5, int i7) {
        if ((i7 & 1) != 0) {
            i2 = 0;
        }
        if ((i7 & 2) != 0) {
            i3 = 0;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(161145796, i5, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState (LazyStaggeredGridState.kt:76)");
        }
        Object[] objArr = new Object[0];
        Saver saverN = LazyStaggeredGridState.INSTANCE.n();
        boolean z2 = ((((i5 & 14) ^ 6) > 4 && composer.t(i2)) || (i5 & 6) == 4) | ((((i5 & 112) ^ 48) > 32 && composer.t(i3)) || (i5 & 48) == 32);
        Object objIF = composer.iF();
        if (z2 || objIF == Composer.INSTANCE.n()) {
            objIF = new Function0<LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final LazyStaggeredGridState invoke() {
                    return new LazyStaggeredGridState(i2, i3);
                }
            };
            composer.o(objIF);
        }
        LazyStaggeredGridState lazyStaggeredGridState = (LazyStaggeredGridState) RememberSaveableKt.O(objArr, saverN, null, (Function0) objIF, composer, 0, 4);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return lazyStaggeredGridState;
    }
}
