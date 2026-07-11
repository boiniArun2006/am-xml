package N;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Xo {

    public static final class j implements DisposableEffectResult {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f6918n;
        final /* synthetic */ LazyListState rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f6919t;

        public j(Function1 function1, LazyListState lazyListState, int i2) {
            this.f6918n = function1;
            this.rl = lazyListState;
            this.f6919t = i2;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void n() {
            this.f6918n.invoke(Integer.valueOf(CollectionsKt.listOf((Object[]) new Integer[]{0, 1}).contains(Integer.valueOf(this.rl.Z())) ? this.rl.o() : RangesKt.coerceAtMost(this.rl.o() + 1, this.f6919t - 1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(LazyListState lazyListState, int i2, Function1 function1, int i3, Composer composer, int i5) {
        t(lazyListState, i2, function1, composer, RecomposeScopeImplKt.n(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult nr(Function1 function1, LazyListState lazyListState, int i2, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new j(function1, lazyListState, i2);
    }

    public static final void t(final LazyListState lazyListState, final int i2, final Function1 onSnapped, Composer composer, final int i3) {
        int i5;
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(onSnapped, "onSnapped");
        Composer composerKN = composer.KN(742366017);
        if ((i3 & 6) == 0) {
            i5 = (composerKN.p5(lazyListState) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerKN.t(i2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onSnapped) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(742366017, i5, -1, "com.alightcreative.common.compose.OnSnapEffect (OnSnapEffect.kt:18)");
            }
            if (lazyListState.t()) {
                Unit unit = Unit.INSTANCE;
                composerKN.eF(1951440584);
                boolean z2 = ((i5 & 14) == 4) | ((i5 & 896) == 256) | ((i5 & 112) == 32);
                Object objIF = composerKN.iF();
                if (z2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1() { // from class: N.qz
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Xo.nr(onSnapped, lazyListState, i2, (DisposableEffectScope) obj);
                        }
                    };
                    composerKN.o(objIF);
                }
                composerKN.Xw();
                EffectsKt.rl(unit, (Function1) objIF, composerKN, 6);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: N.Pl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Xo.O(lazyListState, i2, onSnapped, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
