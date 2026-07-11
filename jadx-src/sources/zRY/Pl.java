package zRY;

import Dj7.YzO;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Pl {

    public static final class Ml extends Lambda implements Function4 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f76484O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f76485n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ eQ.fuX f76486t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(List list, eQ.fuX fux, Function1 function1) {
            super(4);
            this.f76485n = list;
            this.f76486t = fux;
            this.f76484O = function1;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            n((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return Unit.INSTANCE;
        }

        public final void n(LazyGridItemScope lazyGridItemScope, int i2, Composer composer, int i3) {
            int i5;
            if ((i3 & 6) == 0) {
                i5 = (composer.p5(lazyGridItemScope) ? 4 : 2) | i3;
            } else {
                i5 = i3;
            }
            if ((i3 & 48) == 0) {
                i5 |= composer.t(i2) ? 32 : 16;
            }
            if (!composer.HI((i5 & 147) != 146, i5 & 1)) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(699646206, i5, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
            }
            tN.n nVar = (tN.n) this.f76485n.get(i2);
            composer.eF(1920651996);
            Modifier modifierXMQ = SizeKt.xMQ(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), Dp.KN(159));
            eQ.fuX fux = this.f76486t;
            composer.eF(-907866737);
            boolean zP5 = composer.p5(this.f76484O) | composer.E2(nVar);
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new j(this.f76484O, nVar);
                composer.o(objIF);
            }
            composer.Xw();
            Dsr.nr(modifierXMQ, nVar, fux, (Function0) objIF, composer, 6, 0);
            composer.Xw();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class j implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f76487n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ tN.n f76488t;

        j(Function1 function1, tN.n nVar) {
            this.f76487n = function1;
            this.f76488t = nVar;
        }

        public final void n() {
            this.f76487n.invoke(this.f76488t);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    public static final class n extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f76489n = new n();

        public n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    public static final class w6 extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f76490n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f76491t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(Function1 function1, List list) {
            super(1);
            this.f76490n = function1;
            this.f76491t = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n(((Number) obj).intValue());
        }

        public final Object n(int i2) {
            return this.f76490n.invoke(this.f76491t.get(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(tN.n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(List list, eQ.fuX fux, Function1 function1, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        LazyVerticalGrid.gh(list.size(), null, null, new w6(n.f76489n, list), ComposableLambdaKt.rl(699646206, true, new Ml(list, fux, function1)));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(final List contentItems, final eQ.fuX imageLoader, Function1 function1, Composer composer, final int i2, final int i3) {
        int i5;
        Function1 function12;
        final Function1 function13;
        Object objIF;
        Composer.Companion companion;
        State state;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        boolean zE2;
        Object objIF2;
        Composer composer2;
        final Function1 function14;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(contentItems, "contentItems");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Composer composerKN = composer.KN(-822107885);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(contentItems) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(imageLoader) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 == 0) {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                function12 = function1;
                i5 |= composerKN.E2(function12) ? 256 : 128;
            }
            if ((i5 & 147) == 146 || !composerKN.xMQ()) {
                if (i7 == 0) {
                    composerKN.eF(-1498852302);
                    Object objIF3 = composerKN.iF();
                    if (objIF3 == Composer.INSTANCE.n()) {
                        objIF3 = new Function1() { // from class: zRY.aC
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Pl.J2((tN.n) obj);
                            }
                        };
                        composerKN.o(objIF3);
                    }
                    function13 = (Function1) objIF3;
                    composerKN.Xw();
                } else {
                    function13 = function12;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-822107885, i5, -1, "com.alightcreative.app.motion.premade.ui.PremadeContentItemGrid (PremadeContentItemGrid.kt:28)");
                }
                final LazyGridState lazyGridStateRl = LazyGridStateKt.rl(0, 0, composerKN, 0, 3);
                composerKN.eF(-1498849482);
                objIF = composerKN.iF();
                companion = Composer.INSTANCE;
                if (objIF == companion.n()) {
                    objIF = SnapshotStateKt.O(new Function0() { // from class: zRY.C
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(Pl.Uo(lazyGridStateRl));
                        }
                    });
                    composerKN.o(objIF);
                }
                state = (State) objIF;
                composerKN.Xw();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, companion2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0 function0N = companion3.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                    composerKN.r();
                } else {
                    composerKN.s7N(function0N);
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyUo, companion3.t());
                Updater.O(composerN, compositionLocalMapIk, companion3.O());
                function2Rl = companion3.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion3.nr());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                GridCells.Fixed fixed = new GridCells.Fixed(2);
                float f3 = 16;
                Modifier modifierJ2 = SizeKt.J2(PaddingKt.gh(companion2, Dp.KN(f3), 0.0f, 2, null), 0.0f, 1, null);
                Arrangement arrangement = Arrangement.f17400n;
                float f4 = 12;
                Arrangement.HorizontalOrVertical horizontalOrVerticalTy = arrangement.ty(Dp.KN(f4));
                Arrangement.HorizontalOrVertical horizontalOrVerticalTy2 = arrangement.ty(Dp.KN(f4));
                PaddingValues paddingValuesO = PaddingKt.O(0.0f, 0.0f, 0.0f, Dp.KN(f3), 7, null);
                composerKN.eF(1198604254);
                zE2 = composerKN.E2(contentItems) | composerKN.E2(imageLoader) | ((i5 & 896) != 256);
                objIF2 = composerKN.iF();
                if (!zE2 || objIF2 == companion.n()) {
                    objIF2 = new Function1() { // from class: zRY.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Pl.KN(contentItems, imageLoader, function13, (LazyGridScope) obj);
                        }
                    };
                    composerKN.o(objIF2);
                }
                composerKN.Xw();
                LazyGridDslKt.t(fixed, modifierJ2, lazyGridStateRl, paddingValuesO, false, horizontalOrVerticalTy, horizontalOrVerticalTy2, null, false, null, (Function1) objIF2, composerKN, 1772592, 0, 912);
                composerKN.eF(1198618079);
                if (((Boolean) state.getValue()).booleanValue()) {
                    YzO.rl(aD.w6.tFV(), SizeKt.xMQ(companion2, Dp.KN(25)), null, composerKN, 54, 4);
                }
                composer2 = composerKN;
                composer2.Xw();
                composer2.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                function14 = function13;
            } else {
                composerKN.wTp();
                composer2 = composerKN;
                function14 = function12;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: zRY.qz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Pl.xMQ(contentItems, imageLoader, function14, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        function12 = function1;
        if ((i5 & 147) == 146) {
            if (i7 == 0) {
            }
            if (ComposerKt.v()) {
            }
            final LazyGridState lazyGridStateRl2 = LazyGridStateKt.rl(0, 0, composerKN, 0, 3);
            composerKN.eF(-1498849482);
            objIF = composerKN.iF();
            companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
            }
            state = (State) objIF;
            composerKN.Xw();
            Modifier.Companion companion22 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, companion22);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0 function0N2 = companion32.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyUo2, companion32.t());
            Updater.O(composerN, compositionLocalMapIk2, companion32.O());
            function2Rl = companion32.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO2, companion32.nr());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                GridCells.Fixed fixed2 = new GridCells.Fixed(2);
                float f32 = 16;
                Modifier modifierJ22 = SizeKt.J2(PaddingKt.gh(companion22, Dp.KN(f32), 0.0f, 2, null), 0.0f, 1, null);
                Arrangement arrangement2 = Arrangement.f17400n;
                float f42 = 12;
                Arrangement.HorizontalOrVertical horizontalOrVerticalTy3 = arrangement2.ty(Dp.KN(f42));
                Arrangement.HorizontalOrVertical horizontalOrVerticalTy22 = arrangement2.ty(Dp.KN(f42));
                PaddingValues paddingValuesO2 = PaddingKt.O(0.0f, 0.0f, 0.0f, Dp.KN(f32), 7, null);
                composerKN.eF(1198604254);
                zE2 = composerKN.E2(contentItems) | composerKN.E2(imageLoader) | ((i5 & 896) != 256);
                objIF2 = composerKN.iF();
                if (!zE2) {
                    objIF2 = new Function1() { // from class: zRY.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Pl.KN(contentItems, imageLoader, function13, (LazyGridScope) obj);
                        }
                    };
                    composerKN.o(objIF2);
                    composerKN.Xw();
                    LazyGridDslKt.t(fixed2, modifierJ22, lazyGridStateRl2, paddingValuesO2, false, horizontalOrVerticalTy3, horizontalOrVerticalTy22, null, false, null, (Function1) objIF2, composerKN, 1772592, 0, 912);
                    composerKN.eF(1198618079);
                    if (((Boolean) state.getValue()).booleanValue()) {
                    }
                    composer2 = composerKN;
                    composer2.Xw();
                    composer2.XQ();
                    if (ComposerKt.v()) {
                    }
                    function14 = function13;
                }
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(List list, eQ.fuX fux, Function1 function1, int i2, int i3, Composer composer, int i5) {
        O(list, fux, function1, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Uo(LazyGridState lazyGridState) {
        if (lazyGridState.r() == 0 && lazyGridState.o() <= 0) {
            return false;
        }
        return true;
    }
}
