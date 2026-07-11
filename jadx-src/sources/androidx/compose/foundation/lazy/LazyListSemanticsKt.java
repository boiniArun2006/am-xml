package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "state", "", "isVertical", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", c.f62177j, "(Landroidx/compose/foundation/lazy/LazyListState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyListSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSemantics.kt\nandroidx/compose/foundation/lazy/LazyListSemanticsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,32:1\n1247#2,6:33\n*S KotlinDebug\n*F\n+ 1 LazyListSemantics.kt\nandroidx/compose/foundation/lazy/LazyListSemanticsKt\n*L\n28#1:33,6\n*E\n"})
public final class LazyListSemanticsKt {
    public static final LazyLayoutSemanticState n(LazyListState lazyListState, boolean z2, Composer composer, int i2) {
        boolean z3;
        if (ComposerKt.v()) {
            ComposerKt.p5(596174919, i2, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazyListSemantics.kt:26)");
        }
        boolean z4 = false;
        if ((((i2 & 14) ^ 6) > 4 && composer.p5(lazyListState)) || (i2 & 6) == 4) {
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
            objIF = LazyLayoutSemanticStateKt.n(lazyListState, z2);
            composer.o(objIF);
        }
        LazyLayoutSemanticState lazyLayoutSemanticState = (LazyLayoutSemanticState) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return lazyLayoutSemanticState;
    }
}
