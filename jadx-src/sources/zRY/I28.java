package zRY;

import Dj7.CM;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f76471n = Dp.KN(150);
    private static final float rl = Dp.KN(158);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f76472t = Dp.KN(84);

    /* JADX INFO: renamed from: zRY.I28$I28, reason: collision with other inner class name */
    public static final class C1297I28 extends Lambda implements Function4 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f76473O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f76474n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ eQ.fuX f76475t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1297I28(List list, eQ.fuX fux, Function1 function1) {
            super(4);
            this.f76474n = list;
            this.f76475t = fux;
            this.f76473O = function1;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            n((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return Unit.INSTANCE;
        }

        public final void n(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
            int i5;
            if ((i3 & 6) == 0) {
                i5 = (composer.p5(lazyItemScope) ? 4 : 2) | i3;
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
                ComposerKt.p5(-632812321, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            tN.n nVar = (tN.n) this.f76474n.get(i2);
            composer.eF(-367812883);
            Modifier modifierXMQ = SizeKt.xMQ(SizeKt.ViF(Modifier.INSTANCE, I28.rl), I28.f76471n);
            eQ.fuX fux = this.f76475t;
            composer.eF(1927805976);
            boolean zP5 = composer.p5(this.f76473O) | composer.E2(nVar);
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new j(this.f76473O, nVar);
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

    public static final class Ml extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f76476n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f76477t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Function1 function1, List list) {
            super(1);
            this.f76476n = function1;
            this.f76477t = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n(((Number) obj).intValue());
        }

        public final Object n(int i2) {
            return this.f76476n.invoke(this.f76477t.get(i2));
        }
    }

    static final class j implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f76478n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ tN.n f76479t;

        j(Function1 function1, tN.n nVar) {
            this.f76478n = function1;
            this.f76479t = nVar;
        }

        public final void n() {
            this.f76478n.invoke(this.f76479t);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    static final class n implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f76480n;

        n(Function0 function0) {
            this.f76480n = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((LazyItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(LazyItemScope item, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(341230676, i2, -1, "com.alightcreative.app.motion.premade.ui.PremadeContentHorizontalList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PremadeContentHorizontalList.kt:61)");
            }
            u.t(DpKt.rl(I28.f76472t, I28.f76471n), this.f76480n, composer, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final class w6 extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f76481n = new w6();

        public w6() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    public static final void J2(final List items, final eQ.fuX imageLoader, final Function1 onItemClicked, final Function0 onSeeAllClicked, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(onItemClicked, "onItemClicked");
        Intrinsics.checkNotNullParameter(onSeeAllClicked, "onSeeAllClicked");
        Composer composerKN = composer.KN(717472807);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(items) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(imageLoader) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onItemClicked) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(onSeeAllClicked) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(717472807, i3, -1, "com.alightcreative.app.motion.premade.ui.PremadeContentHorizontalList (PremadeContentHorizontalList.kt:35)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.f17400n;
            MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N);
            } else {
                composerKN.r();
            }
            Composer composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyN, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            nr(onSeeAllClicked, composerKN, (i3 >> 9) & 14);
            float f3 = 12;
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f3)), composerKN, 6);
            Modifier modifierXMQ = SizeKt.xMQ(companion, f76471n);
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = arrangement.ty(Dp.KN(f3));
            PaddingValues paddingValuesT = PaddingKt.t(Dp.KN(16), 0.0f, 2, null);
            composerKN.eF(-1939820582);
            boolean zE2 = composerKN.E2(items) | composerKN.E2(imageLoader) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objIF = composerKN.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: zRY.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return I28.Uo(items, imageLoader, onItemClicked, onSeeAllClicked, (LazyListScope) obj);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            composer2 = composerKN;
            LazyDslKt.O(modifierXMQ, null, paddingValuesT, false, horizontalOrVerticalTy, null, null, false, null, (Function1) objIF, composer2, 24966, 490);
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: zRY.w6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return I28.KN(items, imageLoader, onItemClicked, onSeeAllClicked, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(List list, eQ.fuX fux, Function1 function1, Function0 function0, int i2, Composer composer, int i3) {
        J2(list, fux, function1, function0, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Function0 function0, int i2, Composer composer, int i3) {
        nr(function0, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(List list, eQ.fuX fux, Function1 function1, Function0 function0, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyRow.qie(list.size(), null, new Ml(w6.f76481n, list), ComposableLambdaKt.rl(-632812321, true, new C1297I28(list, fux, function1)));
        LazyListScope.O(LazyRow, null, null, ComposableLambdaKt.rl(341230676, true, new n(function0)), 3, null);
        return Unit.INSTANCE;
    }

    public static final void nr(final Function0 onSeeAllClicked, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onSeeAllClicked, "onSeeAllClicked");
        Composer composerKN = composer.KN(-1080712792);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(onSeeAllClicked) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1080712792, i3, -1, "com.alightcreative.app.motion.premade.ui.HeaderRow (PremadeContentHorizontalList.kt:73)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierGh = PaddingKt.gh(SizeKt.xMQ(companion, Dp.KN(24)), Dp.KN(16), 0.0f, 2, null);
            MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), Alignment.INSTANCE.xMQ(), composerKN, 48);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierGh);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N);
            } else {
                composerKN.r();
            }
            Composer composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyRl, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            CM.S(StringResources_androidKt.t(2132020314, composerKN, 6), H9N.j.f3810n.rl(composerKN, 6).g(), RowScope.rl(RowScopeInstance.f17780n, companion, 1.0f, false, 2, null), aD.w6.F(), null, null, TextAlign.KN(TextAlign.INSTANCE.nr()), 0, false, 0, null, composerKN, 3072, 0, 1968);
            ButtonDefaults buttonDefaults = ButtonDefaults.f21598n;
            long jJ2 = Color.INSTANCE.J2();
            long jF = aD.w6.F();
            int i5 = ButtonDefaults.qie;
            float f3 = 0;
            ButtonKt.n(onSeeAllClicked, null, false, null, buttonDefaults.rl(Dp.KN(f3), Dp.KN(f3), 0.0f, 0.0f, 0.0f, composerKN, (i5 << 15) | 54, 28), null, null, buttonDefaults.Uo(jJ2, jF, 0L, composerKN, (i5 << 9) | 54, 4), PaddingKt.n(Dp.KN(f3)), zRY.j.f76521n.n(), composerKN, (i3 & 14) | 905969664, 110);
            composerKN = composerKN;
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: zRY.Ml
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return I28.O(onSeeAllClicked, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
