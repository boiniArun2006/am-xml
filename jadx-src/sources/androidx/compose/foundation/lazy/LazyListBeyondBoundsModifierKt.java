package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "state", "", "beyondBoundsItemCount", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", c.f62177j, "(Landroidx/compose/foundation/lazy/LazyListState;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyListBeyondBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsModifierKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,61:1\n1247#2,6:62\n*S KotlinDebug\n*F\n+ 1 LazyListBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsModifierKt\n*L\n29#1:62,6\n*E\n"})
public final class LazyListBeyondBoundsModifierKt {
    public static final LazyLayoutBeyondBoundsState n(LazyListState lazyListState, int i2, Composer composer, int i3) {
        boolean z2;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1877443446, i3, -1, "androidx.compose.foundation.lazy.rememberLazyListBeyondBoundsState (LazyListBeyondBoundsModifier.kt:27)");
        }
        boolean z3 = false;
        if ((((i3 & 14) ^ 6) > 4 && composer.p5(lazyListState)) || (i3 & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((((i3 & 112) ^ 48) > 32 && composer.t(i2)) || (i3 & 48) == 32) {
            z3 = true;
        }
        boolean z4 = z2 | z3;
        Object objIF = composer.iF();
        if (z4 || objIF == Composer.INSTANCE.n()) {
            objIF = new LazyListBeyondBoundsState(lazyListState, i2);
            composer.o(objIF);
        }
        LazyListBeyondBoundsState lazyListBeyondBoundsState = (LazyListBeyondBoundsState) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return lazyListBeyondBoundsState;
    }
}
