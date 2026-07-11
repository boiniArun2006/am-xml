package pTd;

import XFr.j;
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
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import pTd.Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map f71914n;

    static final class j implements Function2 {
        final /* synthetic */ int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ List f71915O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ List f71916S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ boolean f71917Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f71918g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f71919n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Map f71920o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ List f71921r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ LazyListState f71922t;

        /* JADX INFO: renamed from: pTd.Dsr$j$j, reason: collision with other inner class name */
        static final class C1102j implements Function4 {
            final /* synthetic */ List J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ int f71923O;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            final /* synthetic */ List f71924Z;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ float f71925n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ boolean f71926o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Map f71927r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ List f71928t;

            C1102j(float f3, List list, int i2, List list2, Map map, boolean z2, List list3) {
                this.f71925n = f3;
                this.f71928t = list;
                this.f71923O = i2;
                this.J2 = list2;
                this.f71927r = map;
                this.f71926o = z2;
                this.f71924Z = list3;
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
                    ComposerKt.p5(-1577730855, i3, -1, "com.alightcreative.monetization.ui.components.cloudcards.CloudCardRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CloudCardRow.kt:69)");
                }
                Wre.rl(this.f71925n, (mg4.w6) this.f71928t.get(i2), this.f71923O == i2, (Integer) this.J2.get(i2), this.f71927r, this.f71926o, (String) CollectionsKt.getOrNull(this.f71924Z, i2), composer, 6);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        j(float f3, LazyListState lazyListState, List list, int i2, List list2, Map map, boolean z2, List list3, Function1 function1) {
            this.f71919n = f3;
            this.f71922t = lazyListState;
            this.f71915O = list;
            this.J2 = i2;
            this.f71921r = list2;
            this.f71920o = map;
            this.f71917Z = z2;
            this.f71916S = list3;
            this.f71918g = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(List list, float f3, int i2, List list2, Map map, boolean z2, List list3, LazyListScope LazyRow) {
            Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
            LazyListScope.nr(LazyRow, list.size(), null, null, ComposableLambdaKt.rl(-1577730855, true, new C1102j(f3, list, i2, list2, map, z2, list3)), 6, null);
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
                ComposerKt.p5(-1177960187, i2, -1, "com.alightcreative.monetization.ui.components.cloudcards.CloudCardRow.<anonymous> (CloudCardRow.kt:59)");
            }
            composer.eF(1564161690);
            float f3 = this.f71919n;
            Object objIF = composer.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = Dp.nr(((Dp) ComparisonsKt.minOf(Dp.nr(Dp.KN(500)), Dp.nr(Dp.KN(f3 - Dp.KN(80))))).getValue());
                composer.o(objIF);
            }
            final float value = ((Dp) objIF).getValue();
            composer.Xw();
            Modifier modifierJ2 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null);
            PaddingValues paddingValuesT = PaddingKt.t(Dp.KN(Dp.KN(this.f71919n - value) / 2), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(20));
            Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
            FlingBehavior flingBehaviorO = LazyListSnapLayoutInfoProviderKt.O(this.f71922t, null, composer, 0, 2);
            LazyListState lazyListState = this.f71922t;
            composer.eF(1564176521);
            boolean zE2 = composer.E2(this.f71915O) | composer.t(this.J2) | composer.E2(this.f71921r) | composer.E2(this.f71920o) | composer.n(this.f71917Z) | composer.E2(this.f71916S);
            final List list = this.f71915O;
            final int i3 = this.J2;
            final List list2 = this.f71921r;
            final Map map = this.f71920o;
            final boolean z2 = this.f71917Z;
            final List list3 = this.f71916S;
            Object objIF2 = composer.iF();
            if (zE2 || objIF2 == companion.n()) {
                Function1 function1 = new Function1() { // from class: pTd.fuX
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Dsr.j.t(list, value, i3, list2, map, z2, list3, (LazyListScope) obj);
                    }
                };
                composer.o(function1);
                objIF2 = function1;
            }
            composer.Xw();
            LazyDslKt.O(modifierJ2, lazyListState, paddingValuesT, false, horizontalOrVerticalTy, verticalXMQ, flingBehaviorO, false, null, (Function1) objIF2, composer, 221190, 392);
            N.Xo.t(this.f71922t, this.f71915O.size(), this.f71918g, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static {
        mg4.w6 w6Var = mg4.w6.f70997n;
        j.C0428j c0428j = XFr.j.f11812t;
        f71914n = MapsKt.mapOf(TuplesKt.to(w6Var, XFr.j.n(c0428j.t(20.0d))), TuplesKt.to(mg4.w6.f70998t, XFr.j.n(c0428j.n(100.0d))));
    }

    public static final void rl(final float f3, final int i2, final List tiers, final List discountAmounts, final Map storageMap, final LazyListState lazyListState, final boolean z2, final List shownPrices, final Function1 onCardSnapped, Composer composer, final int i3) {
        int i5;
        boolean z3;
        Intrinsics.checkNotNullParameter(tiers, "tiers");
        Intrinsics.checkNotNullParameter(discountAmounts, "discountAmounts");
        Intrinsics.checkNotNullParameter(storageMap, "storageMap");
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(shownPrices, "shownPrices");
        Intrinsics.checkNotNullParameter(onCardSnapped, "onCardSnapped");
        Composer composerKN = composer.KN(1803324485);
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
            i5 |= composerKN.E2(discountAmounts) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= composerKN.E2(storageMap) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= composerKN.p5(lazyListState) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            z3 = z2;
            i5 |= composerKN.n(z3) ? 1048576 : 524288;
        } else {
            z3 = z2;
        }
        if ((12582912 & i3) == 0) {
            i5 |= composerKN.E2(shownPrices) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i5 |= composerKN.E2(onCardSnapped) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((38347923 & i5) == 38347922 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1803324485, i5, -1, "com.alightcreative.monetization.ui.components.cloudcards.CloudCardRow (CloudCardRow.kt:55)");
            }
            CompositionLocalKt.rl(OverscrollConfiguration_androidKt.n().nr(null), ComposableLambdaKt.nr(-1177960187, true, new j(f3, lazyListState, tiers, i2, discountAmounts, storageMap, z3, shownPrices, onCardSnapped), composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pTd.CN3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Dsr.t(f3, i2, tiers, discountAmounts, storageMap, lazyListState, z2, shownPrices, onCardSnapped, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(float f3, int i2, List list, List list2, Map map, LazyListState lazyListState, boolean z2, List list3, Function1 function1, int i3, Composer composer, int i5) {
        rl(f3, i2, list, list2, map, lazyListState, z2, list3, function1, composer, RecomposeScopeImplKt.n(i3 | 1));
        return Unit.INSTANCE;
    }
}
