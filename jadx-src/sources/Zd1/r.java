package Zd1;

import Zd1.r;
import androidx.compose.foundation.OverscrollConfiguration_androidKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class r {

    static final class j implements Function2 {
        final /* synthetic */ List J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f12539O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ float f12540S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Function1 f12541Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ LazyListState f12542n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Map f12543o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f12544r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f12545t;

        /* JADX INFO: renamed from: Zd1.r$j$j, reason: collision with other inner class name */
        static final class C0452j implements Function4 {
            final /* synthetic */ float J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ List f12546O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ List f12547n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Map f12548o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ boolean f12549r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ int f12550t;

            C0452j(List list, int i2, List list2, float f3, boolean z2, Map map) {
                this.f12547n = list;
                this.f12550t = i2;
                this.f12546O = list2;
                this.J2 = f3;
                this.f12549r = z2;
                this.f12548o = map;
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                n((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return Unit.INSTANCE;
            }

            public final void n(LazyItemScope items, int i2, Composer composer, int i3) {
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i3 & 48) == 0) {
                    i3 |= composer.t(i2) ? 32 : 16;
                }
                if ((i3 & 145) == 144 && composer.xMQ()) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(1819709274, i3, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PlayfulCardRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PlayfulCardRow.kt:65)");
                }
                s4.rl(Dp.nr(this.J2), (mg4.w6) this.f12547n.get(i2), this.f12549r, this.f12550t == i2, this.f12548o, (String) this.f12546O.get(i2), null, composer, 6, 64);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        j(LazyListState lazyListState, List list, int i2, List list2, boolean z2, Map map, Function1 function1, float f3) {
            this.f12542n = lazyListState;
            this.f12545t = list;
            this.f12539O = i2;
            this.J2 = list2;
            this.f12544r = z2;
            this.f12543o = map;
            this.f12541Z = function1;
            this.f12540S = f3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(List list, int i2, List list2, float f3, boolean z2, Map map, LazyListScope LazyRow) {
            Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
            LazyListScope.nr(LazyRow, list.size(), null, null, ComposableLambdaKt.rl(1819709274, true, new C0452j(list, i2, list2, f3, z2, map)), 6, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-547735418, i2, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PlayfulCardRow.<anonymous> (PlayfulCardRow.kt:53)");
            }
            composer.eF(-1820174029);
            float f3 = this.f12540S;
            Object objIF = composer.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = Dp.nr(((Dp) ComparisonsKt.minOf(Dp.nr(Dp.KN(500)), Dp.nr(Dp.KN(f3 - Dp.KN(48))))).getValue());
                composer.o(objIF);
            }
            final float value = ((Dp) objIF).getValue();
            composer.Xw();
            Modifier modifierGh = PaddingKt.gh(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.KN(16), 1, null);
            PaddingValues paddingValuesT = PaddingKt.t(Dp.KN(20), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(12));
            Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
            FlingBehavior flingBehaviorO = LazyListSnapLayoutInfoProviderKt.O(this.f12542n, null, composer, 0, 2);
            LazyListState lazyListState = this.f12542n;
            composer.eF(-1820157984);
            boolean zE2 = composer.E2(this.f12545t) | composer.t(this.f12539O) | composer.E2(this.J2) | composer.n(this.f12544r) | composer.E2(this.f12543o);
            final List list = this.f12545t;
            final int i3 = this.f12539O;
            final List list2 = this.J2;
            final boolean z2 = this.f12544r;
            final Map map = this.f12543o;
            Object objIF2 = composer.iF();
            if (zE2 || objIF2 == companion.n()) {
                Function1 function1 = new Function1() { // from class: Zd1.Q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.j.t(list, i3, list2, value, z2, map, (LazyListScope) obj);
                    }
                };
                composer.o(function1);
                objIF2 = function1;
            }
            composer.Xw();
            LazyDslKt.O(modifierGh, lazyListState, paddingValuesT, false, horizontalOrVerticalTy, verticalXMQ, flingBehaviorO, false, null, (Function1) objIF2, composer, 221574, 392);
            N.Xo.t(this.f12542n, this.f12545t.size(), this.f12541Z, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final void rl(final float f3, final int i2, final List tiers, final boolean z2, final Map storageMap, final LazyListState lazyListState, final List shownPrices, final Function1 onCardSnapped, Composer composer, final int i3) {
        int i5;
        Intrinsics.checkNotNullParameter(tiers, "tiers");
        Intrinsics.checkNotNullParameter(storageMap, "storageMap");
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(shownPrices, "shownPrices");
        Intrinsics.checkNotNullParameter(onCardSnapped, "onCardSnapped");
        Composer composerKN = composer.KN(-276352058);
        if ((i3 & 6) == 0) {
            i5 = (composerKN.rl(f3) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerKN.t(i2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(tiers) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerKN.n(z2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= composerKN.E2(storageMap) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= composerKN.p5(lazyListState) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i5 |= composerKN.E2(shownPrices) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i5 |= composerKN.E2(onCardSnapped) ? 8388608 : 4194304;
        }
        if ((4793491 & i5) == 4793490 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-276352058, i5, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PlayfulCardRow (PlayfulCardRow.kt:49)");
            }
            CompositionLocalKt.rl(OverscrollConfiguration_androidKt.n().nr(null), ComposableLambdaKt.nr(-547735418, true, new j(lazyListState, tiers, i2, shownPrices, z2, storageMap, onCardSnapped, f3), composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Zd1.UGc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r.t(f3, i2, tiers, z2, storageMap, lazyListState, shownPrices, onCardSnapped, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(float f3, int i2, List list, boolean z2, Map map, LazyListState lazyListState, List list2, Function1 function1, int i3, Composer composer, int i5) {
        rl(f3, i2, list, z2, map, lazyListState, list2, function1, composer, RecomposeScopeImplKt.n(i3 | 1));
        return Unit.INSTANCE;
    }
}
