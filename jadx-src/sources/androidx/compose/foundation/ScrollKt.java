package androidx.compose.foundation;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\f\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\r\u001aQ\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"", "initial", "Landroidx/compose/foundation/ScrollState;", "t", "(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;", "Landroidx/compose/ui/Modifier;", "state", "", "enabled", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "reverseScrolling", "J2", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;Z)Landroidx/compose/ui/Modifier;", c.f62177j, "isScrollable", "isVertical", "useLocalOverscrollFactory", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "nr", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZZZLandroidx/compose/foundation/OverscrollEffect;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,485:1\n1247#2,6:486\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n*L\n70#1:486,6\n*E\n"})
public final class ScrollKt {
    public static final ScrollState t(final int i2, Composer composer, int i3, int i5) {
        boolean z2 = true;
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-1464256199, i3, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:68)");
        }
        Object[] objArr = new Object[0];
        Saver saverN = ScrollState.INSTANCE.n();
        if ((((i3 & 14) ^ 6) <= 4 || !composer.t(i2)) && (i3 & 6) != 4) {
            z2 = false;
        }
        Object objIF = composer.iF();
        if (z2 || objIF == Composer.INSTANCE.n()) {
            objIF = new Function0<ScrollState>() { // from class: androidx.compose.foundation.ScrollKt$rememberScrollState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final ScrollState invoke() {
                    return new ScrollState(i2);
                }
            };
            composer.o(objIF);
        }
        ScrollState scrollState = (ScrollState) RememberSaveableKt.O(objArr, saverN, null, (Function0) objIF, composer, 0, 4);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return scrollState;
    }

    public static final Modifier J2(Modifier modifier, ScrollState scrollState, boolean z2, FlingBehavior flingBehavior, boolean z3) {
        return O(modifier, scrollState, z3, flingBehavior, z2, true, true, null, 64, null);
    }

    static /* synthetic */ Modifier O(Modifier modifier, ScrollState scrollState, boolean z2, FlingBehavior flingBehavior, boolean z3, boolean z4, boolean z5, OverscrollEffect overscrollEffect, int i2, Object obj) {
        return nr(modifier, scrollState, z2, flingBehavior, z3, z4, z5, (i2 & 64) != 0 ? null : overscrollEffect);
    }

    public static /* synthetic */ Modifier Uo(Modifier modifier, ScrollState scrollState, boolean z2, FlingBehavior flingBehavior, boolean z3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            flingBehavior = null;
        }
        if ((i2 & 8) != 0) {
            z3 = false;
        }
        return J2(modifier, scrollState, z2, flingBehavior, z3);
    }

    public static final Modifier n(Modifier modifier, ScrollState scrollState, boolean z2, FlingBehavior flingBehavior, boolean z3) {
        return O(modifier, scrollState, z3, flingBehavior, z2, false, true, null, 64, null);
    }

    private static final Modifier nr(Modifier modifier, ScrollState scrollState, boolean z2, FlingBehavior flingBehavior, boolean z3, boolean z4, boolean z5, OverscrollEffect overscrollEffect) {
        return ScrollingContainerKt.n(modifier, scrollState, z4 ? Orientation.f16969n : Orientation.f16970t, z3, z2, flingBehavior, scrollState.getInternalInteractionSource(), z5, overscrollEffect, (256 & 256) != 0 ? null : null).Zmq(new ScrollingLayoutElement(scrollState, z2, z4));
    }

    public static /* synthetic */ Modifier rl(Modifier modifier, ScrollState scrollState, boolean z2, FlingBehavior flingBehavior, boolean z3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            flingBehavior = null;
        }
        if ((i2 & 8) != 0) {
            z3 = false;
        }
        return n(modifier, scrollState, z2, flingBehavior, z3);
    }
}
