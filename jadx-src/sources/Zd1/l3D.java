package Zd1;

import Dj7.YzO;
import Dj7.xZD;
import Zd1.l3D;
import androidx.compose.foundation.OverscrollConfiguration_androidKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class l3D {

    static final class j implements Function2 {
        final /* synthetic */ List J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f12508O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ Function1 f12509S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ BoxScope f12510Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ LazyListState f12511n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Map f12512o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f12513r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f12514t;

        /* JADX INFO: renamed from: Zd1.l3D$j$j, reason: collision with other inner class name */
        static final class C0451j implements Function4 {
            final /* synthetic */ boolean J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ List f12515O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ List f12516n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ MutableState f12517o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Map f12518r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ int f12519t;

            C0451j(List list, int i2, List list2, boolean z2, Map map, MutableState mutableState) {
                this.f12516n = list;
                this.f12519t = i2;
                this.f12515O = list2;
                this.J2 = z2;
                this.f12518r = map;
                this.f12517o = mutableState;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit t(MutableState mutableState, LayoutCoordinates it) {
                Intrinsics.checkNotNullParameter(it, "it");
                j.J2(mutableState, Math.max(j.O(mutableState), (int) (it.n() & 4294967295L)));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                rl((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return Unit.INSTANCE;
            }

            public final void rl(LazyItemScope items, int i2, Composer composer, int i3) {
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i3 & 48) == 0) {
                    i3 |= composer.t(i2) ? 32 : 16;
                }
                if ((i3 & 145) == 144 && composer.xMQ()) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1591719009, i3, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PlayfulCardColumn.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PlayfulCardColumn.kt:73)");
                }
                mg4.w6 w6Var = (mg4.w6) this.f12516n.get(i2);
                boolean z2 = this.f12519t == i2;
                String str = (String) this.f12515O.get(i2);
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.eF(-687815256);
                final MutableState mutableState = this.f12517o;
                Object objIF = composer.iF();
                if (objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1() { // from class: Zd1.QJ
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return l3D.j.C0451j.t(mutableState, (LayoutCoordinates) obj);
                        }
                    };
                    composer.o(objIF);
                }
                composer.Xw();
                s4.rl(null, w6Var, this.J2, z2, this.f12518r, str, OnGloballyPositionedModifierKt.n(companion, (Function1) objIF), composer, 1572870, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        j(LazyListState lazyListState, List list, int i2, List list2, boolean z2, Map map, BoxScope boxScope, Function1 function1) {
            this.f12511n = lazyListState;
            this.f12514t = list;
            this.f12508O = i2;
            this.J2 = list2;
            this.f12513r = z2;
            this.f12512o = map;
            this.f12510Z = boxScope;
            this.f12509S = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Uo(List list, int i2, List list2, boolean z2, Map map, MutableState mutableState, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.nr(LazyColumn, list.size(), null, null, ComposableLambdaKt.rl(-1591719009, true, new C0451j(list, i2, list2, z2, map, mutableState)), 6, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            nr((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void nr(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1770028415, i2, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PlayfulCardColumn.<anonymous> (PlayfulCardColumn.kt:60)");
            }
            composer.eF(-1392423259);
            Object objIF = composer.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O(0, null, 2, null);
                composer.o(objIF);
            }
            final MutableState mutableState = (MutableState) objIF;
            composer.Xw();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f3 = 20;
            Modifier modifierXMQ = SizeKt.xMQ(PaddingKt.gh(SizeKt.KN(companion2, 0.0f, 1, null), Dp.KN(f3), 0.0f, 2, null), Dp.KN(((Density) composer.ty(CompositionLocalsKt.J2())).rV9(O(mutableState)) + Dp.KN(55)));
            PaddingValues paddingValuesT = PaddingKt.t(0.0f, Dp.KN(f3), 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(12));
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment.Horizontal horizontalUo = companion3.Uo();
            FlingBehavior flingBehaviorO = LazyListSnapLayoutInfoProviderKt.O(this.f12511n, null, composer, 0, 2);
            LazyListState lazyListState = this.f12511n;
            composer.eF(-1392404610);
            boolean zE2 = composer.E2(this.f12514t) | composer.t(this.f12508O) | composer.E2(this.J2) | composer.n(this.f12513r) | composer.E2(this.f12512o);
            final List list = this.f12514t;
            final int i3 = this.f12508O;
            final List list2 = this.J2;
            final boolean z2 = this.f12513r;
            final Map map = this.f12512o;
            Object objIF2 = composer.iF();
            if (zE2 || objIF2 == companion.n()) {
                Function1 function1 = new Function1() { // from class: Zd1.z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return l3D.j.Uo(list, i3, list2, z2, map, mutableState, (LazyListScope) obj);
                    }
                };
                composer.o(function1);
                objIF2 = function1;
            }
            composer.Xw();
            LazyDslKt.rl(modifierXMQ, lazyListState, paddingValuesT, false, horizontalOrVerticalTy, horizontalUo, flingBehaviorO, false, null, (Function1) objIF2, composer, 221568, 392);
            float f4 = 6;
            YzO.rl(aD.w6.M7(), this.f12510Z.n(SizeKt.xMQ(companion2, Dp.KN(f4)), companion3.az()), xZD.f1895n, composer, 390, 0);
            YzO.rl(aD.w6.M7(), this.f12510Z.n(SizeKt.xMQ(companion2, Dp.KN(f4)), companion3.rl()), xZD.f1896t, composer, 390, 0);
            N.Xo.t(this.f12511n, this.f12514t.size(), this.f12509S, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void J2(MutableState mutableState, int i2) {
            mutableState.setValue(Integer.valueOf(i2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int O(MutableState mutableState) {
            return ((Number) mutableState.getValue()).intValue();
        }
    }

    public static final void rl(final BoxScope boxScope, final int i2, final List tiers, final boolean z2, final Map storageMap, final LazyListState lazyListState, final List shownPrices, final Function1 onCardSnapped, Composer composer, final int i3) {
        int i5;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(tiers, "tiers");
        Intrinsics.checkNotNullParameter(storageMap, "storageMap");
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(shownPrices, "shownPrices");
        Intrinsics.checkNotNullParameter(onCardSnapped, "onCardSnapped");
        Composer composerKN = composer.KN(-590504511);
        if ((i3 & 6) == 0) {
            i5 = (composerKN.p5(boxScope) ? 4 : 2) | i3;
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
                ComposerKt.p5(-590504511, i5, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PlayfulCardColumn (PlayfulCardColumn.kt:56)");
            }
            CompositionLocalKt.rl(OverscrollConfiguration_androidKt.n().nr(null), ComposableLambdaKt.nr(-1770028415, true, new j(lazyListState, tiers, i2, shownPrices, z2, storageMap, boxScope, onCardSnapped), composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Zd1.eO
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l3D.t(boxScope, i2, tiers, z2, storageMap, lazyListState, shownPrices, onCardSnapped, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(BoxScope boxScope, int i2, List list, boolean z2, Map map, LazyListState lazyListState, List list2, Function1 function1, int i3, Composer composer, int i5) {
        rl(boxScope, i2, list, z2, map, lazyListState, list2, function1, composer, RecomposeScopeImplKt.n(i3 | 1));
        return Unit.INSTANCE;
    }
}
