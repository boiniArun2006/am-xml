package KC;

import Dj7.AbstractC1328c;
import KC.DT;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.IconKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.internal.d;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class DT {

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f5062n;

        j(int i2) {
            this.f5062n = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1669594957, i2, -1, "com.alightcreative.app.motion.activities.main.MainTabsRow.<anonymous>.<anonymous> (MainTabsRow.kt:87)");
            }
            ImageKt.n(PainterResources_androidKt.t(this.f5062n, composer, 0), null, null, null, ContentScale.INSTANCE.O(), 0.0f, null, composer, 24624, 108);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class n implements Function2 {
        final /* synthetic */ boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f5063O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ M.CN3 f5064n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ M.CN3[] f5065t;

        static final class j implements Function4 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ boolean f5066O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ M.CN3[] f5067n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function1 f5068t;

            j(M.CN3[] cn3Arr, Function1 function1, boolean z2) {
                this.f5067n = cn3Arr;
                this.f5068t = function1;
                this.f5066O = z2;
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                rl((AnimatedContentScope) obj, (M.CN3) obj2, (Composer) obj3, ((Number) obj4).intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v10 */
            /* JADX WARN: Type inference failed for: r11v3, types: [androidx.compose.foundation.layout.RowScope] */
            /* JADX WARN: Type inference failed for: r11v7 */
            /* JADX WARN: Type inference failed for: r25v0 */
            /* JADX WARN: Type inference failed for: r25v1 */
            /* JADX WARN: Type inference failed for: r25v5 */
            /* JADX WARN: Type inference failed for: r58v2 */
            /* JADX WARN: Type inference failed for: r5v19 */
            /* JADX WARN: Type inference failed for: r5v2 */
            /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
            public final void rl(AnimatedContentScope AnimatedContent, M.CN3 cn3, Composer composer, int i2) {
                ?? r25;
                M.CN3 cn32;
                Modifier.Companion companion;
                Function1 function1;
                float f3;
                Object obj;
                M.CN3 selTab = cn3;
                Composer composer2 = composer;
                Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                Intrinsics.checkNotNullParameter(selTab, "selTab");
                if (ComposerKt.v()) {
                    ComposerKt.p5(760794634, i2, -1, "com.alightcreative.app.motion.activities.main.NavBar.<anonymous>.<anonymous> (MainTabsRow.kt:123)");
                }
                float f4 = 8;
                Modifier modifierKN = SizeKt.KN(PaddingKt.mUb(Modifier.INSTANCE, Dp.KN(f4), Dp.KN(12)), 0.0f, 1, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalRl = Arrangement.f17400n.rl();
                M.CN3[] cn3Arr = this.f5067n;
                final Function1 function12 = this.f5068t;
                boolean z2 = this.f5066O;
                MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalRl, Alignment.INSTANCE.qie(), composer2, 6);
                ?? r52 = 0;
                int iN = ComposablesKt.n(composer2, 0);
                CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                Modifier modifierO = ComposedModifierKt.O(composer2, modifierKN);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0 function0N = companion2.n();
                if (composer2.getApplier() == null) {
                    ComposablesKt.t();
                }
                composer2.T();
                if (composer2.getInserting()) {
                    composer2.s7N(function0N);
                } else {
                    composer2.r();
                }
                Composer composerN = Updater.n(composer2);
                Updater.O(composerN, measurePolicyRl, companion2.t());
                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                Function2 function2Rl = companion2.rl();
                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion2.nr());
                RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                composer2.eF(-33687400);
                int length = cn3Arr.length;
                int i3 = 0;
                ?? r11 = rowScopeInstance;
                while (i3 < length) {
                    final M.CN3 cn33 = cn3Arr[i3];
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierN = r11.n(SizeKt.ViF(companion3, Dp.KN(158)), 1.0f, r52);
                    composer2.eF(644411202);
                    boolean zP5 = composer2.p5(function12) | composer2.p5(cn33);
                    Object objIF = composer2.iF();
                    if (zP5 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function0() { // from class: KC.xq
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DT.n.j.t(function12, cn33);
                            }
                        };
                        composer2.o(objIF);
                    }
                    composer2.Xw();
                    Modifier modifierJ2 = ClickableKt.J2(modifierN, false, null, null, (Function0) objIF, 7, null);
                    Arrangement.Vertical verticalUo = Arrangement.f17400n.Uo();
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion4.gh(), composer2, r52);
                    int iN2 = ComposablesKt.n(composer2, r52);
                    CompositionLocalMap compositionLocalMapIk2 = composer2.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composer2, modifierJ2);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0 function0N2 = companion5.n();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composer2.T();
                    if (composer2.getInserting()) {
                        composer2.s7N(function0N2);
                    } else {
                        composer2.r();
                    }
                    Composer composerN2 = Updater.n(composer2);
                    int i5 = length;
                    Updater.O(composerN2, measurePolicyN, companion5.t());
                    Updater.O(composerN2, compositionLocalMapIk2, companion5.O());
                    Function2 function2Rl2 = companion5.rl();
                    if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                        composerN2.o(Integer.valueOf(iN2));
                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                    }
                    Updater.O(composerN2, modifierO2, companion5.nr());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                    Modifier modifierT = columnScopeInstance.t(companion3, companion4.Uo());
                    MeasurePolicy measurePolicyUo = BoxKt.Uo(companion4.HI(), false);
                    int iN3 = ComposablesKt.n(composer2, 0);
                    CompositionLocalMap compositionLocalMapIk3 = composer2.Ik();
                    Modifier modifierO3 = ComposedModifierKt.O(composer2, modifierT);
                    Function0 function0N3 = companion5.n();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composer2.T();
                    if (composer2.getInserting()) {
                        composer2.s7N(function0N3);
                    } else {
                        composer2.r();
                    }
                    Composer composerN3 = Updater.n(composer2);
                    int i7 = i3;
                    Updater.O(composerN3, measurePolicyUo, companion5.t());
                    Updater.O(composerN3, compositionLocalMapIk3, companion5.O());
                    Function2 function2Rl3 = companion5.rl();
                    if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                        composerN3.o(Integer.valueOf(iN3));
                        composerN3.az(Integer.valueOf(iN3), function2Rl3);
                    }
                    Updater.O(composerN3, modifierO3, companion5.nr());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                    boolean z3 = z2;
                    float f5 = f4;
                    ?? r58 = r11;
                    M.CN3[] cn3Arr2 = cn3Arr;
                    Composer composer3 = composer2;
                    IconKt.n(PainterResources_androidKt.t(cn33 == selTab ? cn33.t() : cn33.rl(), composer2, 0), null, null, 0L, composer3, 48, 12);
                    composer3.eF(-1090013231);
                    if (cn33 == M.CN3.f6253S && z3) {
                        Modifier modifierN2 = boxScopeInstance.n(PaddingKt.gh(BackgroundKt.nr(ClipKt.n(OffsetKt.rl(SizeKt.xMQ(companion3, Dp.KN((float) 10.67d)), Dp.KN((float) 11.75d), Dp.KN(-6)), RoundedCornerShapeKt.t(Dp.KN((float) 2.667d))), aD.w6.vl(), null, 2, null), Dp.KN(3), 0.0f, 2, null), companion4.HI());
                        MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion4.HI(), false);
                        int iN4 = ComposablesKt.n(composer3, 0);
                        CompositionLocalMap compositionLocalMapIk4 = composer3.Ik();
                        Modifier modifierO4 = ComposedModifierKt.O(composer3, modifierN2);
                        Function0 function0N4 = companion5.n();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.t();
                        }
                        composer3.T();
                        if (composer3.getInserting()) {
                            composer3.s7N(function0N4);
                        } else {
                            composer3.r();
                        }
                        Composer composerN4 = Updater.n(composer3);
                        Updater.O(composerN4, measurePolicyUo2, companion5.t());
                        Updater.O(composerN4, compositionLocalMapIk4, companion5.O());
                        Function2 function2Rl4 = companion5.rl();
                        if (composerN4.getInserting() || !Intrinsics.areEqual(composerN4.iF(), Integer.valueOf(iN4))) {
                            composerN4.o(Integer.valueOf(iN4));
                            composerN4.az(Integer.valueOf(iN4), function2Rl4);
                        }
                        Updater.O(composerN4, modifierO4, companion5.nr());
                        String upperCase = StringResources_androidKt.t(2132019725, composer3, 6).toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        obj = null;
                        f3 = f5;
                        cn32 = cn33;
                        function1 = function12;
                        r25 = r58;
                        composer2 = composer;
                        companion = companion3;
                        Dj7.CM.S(upperCase, TextStyle.t(H9N.j.f3810n.rl(composer3, 6).aYN(), 0L, TextUnitKt.J2(6.67d), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.KN(11), null, null, null, 0, 0, null, 16646141, null), null, aD.w6.WPU(), null, null, null, 0, false, 0, null, composer2, 3072, 0, 2036);
                        composer2.XQ();
                    } else {
                        r25 = r58;
                        composer2 = composer3;
                        cn32 = cn33;
                        companion = companion3;
                        function1 = function12;
                        f3 = f5;
                        obj = null;
                    }
                    composer2.Xw();
                    composer2.XQ();
                    SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f3)), composer2, 6);
                    Dj7.CM.S(StringResources_androidKt.t(cn32.nr(), composer2, 0), H9N.j.f3810n.rl(composer2, 6).X(), columnScopeInstance.t(companion, companion4.Uo()), aD.w6.WPU(), null, null, TextAlign.KN(TextAlign.INSTANCE.n()), TextOverflow.INSTANCE.rl(), false, 1, null, composer2, 817892352, 0, 1328);
                    composer2.XQ();
                    composer2.eF(-33607748);
                    M.CN3 cn34 = cn32;
                    if (cn34 == M.CN3.f6254Z || cn34 == M.CN3.f6257o) {
                        SpacerKt.n(SizeKt.ViF(companion, Dp.KN(56)), composer2, 6);
                    }
                    composer2.Xw();
                    selTab = cn3;
                    i3 = i7 + 1;
                    length = i5;
                    z2 = z3;
                    cn3Arr = cn3Arr2;
                    f4 = f3;
                    r11 = r25;
                    function12 = function1;
                    r52 = 0;
                }
                composer2.Xw();
                composer2.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit t(Function1 function1, M.CN3 cn3) {
                function1.invoke(cn3);
                return Unit.INSTANCE;
            }
        }

        n(M.CN3 cn3, M.CN3[] cn3Arr, Function1 function1, boolean z2) {
            this.f5064n = cn3;
            this.f5065t = cn3Arr;
            this.f5063O = function1;
            this.J2 = z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ContentTransform t(AnimatedContentTransitionScope AnimatedContent) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            return AnimatedContentKt.J2(EnterExitTransitionKt.HI(AnimationSpecKt.ty(d.f62986a, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.Ik(AnimationSpecKt.ty(d.f62986a, 0, null, 6, null), 0.0f, 2, null));
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
                ComposerKt.p5(140535201, i2, -1, "com.alightcreative.app.motion.activities.main.NavBar.<anonymous> (MainTabsRow.kt:115)");
            }
            M.CN3 cn3 = this.f5064n;
            composer.eF(1682192468);
            Object objIF = composer.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: KC.Sw
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DT.n.t((AnimatedContentTransitionScope) obj);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            AnimatedContentKt.rl(cn3, null, (Function1) objIF, null, "MainTabsNavBar", null, ComposableLambdaKt.nr(760794634, true, new j(this.f5065t, this.f5063O, this.J2), composer, 54), composer, 1597824, 42);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(M.CN3[] cn3Arr, Function1 function1, Function0 function0, M.CN3 cn3, int i2, boolean z2, Modifier modifier, int i3, int i5, Composer composer, int i7) {
        nr(cn3Arr, function1, function0, cn3, i2, z2, modifier, composer, RecomposeScopeImplKt.n(i3 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(M.CN3[] cn3Arr, Function1 function1, M.CN3 cn3, boolean z2, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        Uo(cn3Arr, function1, cn3, z2, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Uo(final M.CN3[] cn3Arr, final Function1 function1, final M.CN3 cn3, final boolean z2, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1547287332);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(cn3Arr) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(function1) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(cn3) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.n(z2) ? 2048 : 1024;
        }
        int i7 = i3 & 16;
        if (i7 == 0) {
            if ((i2 & 24576) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 16384 : 8192;
            }
            if ((i5 & 9363) == 9362 || !composerKN.xMQ()) {
                if (i7 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(1547287332, i5, -1, "com.alightcreative.app.motion.activities.main.NavBar (MainTabsRow.kt:103)");
                }
                Modifier modifier4 = modifier2;
                composer2 = composerKN;
                CardKt.n(AbstractC1328c.n(SizeKt.xMQ(BackgroundKt.nr(modifier2, Color.INSTANCE.KN(), null, 2, null), Dp.KN(72)), aD.w6.aYN(), Dp.KN(0), Dp.KN(30), (b.f61769v & 8) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 16) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 32) != 0 ? 1.0f : 0.0f, (b.f61769v & 64) != 0 ? 1.0f : 0.0f), RectangleShapeKt.n(), 0L, 0L, null, 0.0f, ComposableLambdaKt.nr(140535201, true, new n(cn3, cn3Arr, function1, z2), composerKN, 54), composer2, 1572912, 60);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier4;
            } else {
                composerKN.wTp();
                composer2 = composerKN;
                modifier3 = modifier2;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: KC.ibE
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DT.KN(cn3Arr, function1, cn3, z2, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 24576;
        modifier2 = modifier;
        if ((i5 & 9363) == 9362) {
            if (i7 != 0) {
            }
            if (ComposerKt.v()) {
            }
            Modifier modifier42 = modifier2;
            composer2 = composerKN;
            CardKt.n(AbstractC1328c.n(SizeKt.xMQ(BackgroundKt.nr(modifier2, Color.INSTANCE.KN(), null, 2, null), Dp.KN(72)), aD.w6.aYN(), Dp.KN(0), Dp.KN(30), (b.f61769v & 8) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 16) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 32) != 0 ? 1.0f : 0.0f, (b.f61769v & 64) != 0 ? 1.0f : 0.0f), RectangleShapeKt.n(), 0L, 0L, null, 0.0f, ComposableLambdaKt.nr(140535201, true, new n(cn3, cn3Arr, function1, z2), composerKN, 54), composer2, 1572912, 60);
            if (ComposerKt.v()) {
            }
            modifier3 = modifier42;
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(final M.CN3[] tabs, final Function1 onTabClicked, final Function0 onCreateProjectClicked, final M.CN3 selectedTab, final int i2, final boolean z2, Modifier modifier, Composer composer, final int i3, final int i5) {
        int i7;
        boolean z3;
        int i8;
        Modifier modifier2;
        int i9;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        boolean z4;
        Object objIF;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(onTabClicked, "onTabClicked");
        Intrinsics.checkNotNullParameter(onCreateProjectClicked, "onCreateProjectClicked");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Composer composerKN = composer.KN(-536067958);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.E2(tabs) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= composerKN.E2(onTabClicked) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerKN.E2(onCreateProjectClicked) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i7 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i7 |= composerKN.p5(selectedTab) ? 2048 : 1024;
        }
        if ((i5 & 16) != 0) {
            i7 |= 24576;
        } else if ((i3 & 24576) == 0) {
            i7 |= composerKN.t(i2) ? 16384 : 8192;
        }
        if ((i5 & 32) != 0) {
            i7 |= 196608;
        } else {
            if ((i3 & 196608) == 0) {
                z3 = z2;
                i7 |= composerKN.n(z3) ? 131072 : 65536;
            }
            i8 = i5 & 64;
            if (i8 != 0) {
                if ((1572864 & i3) == 0) {
                    modifier2 = modifier;
                    i7 |= composerKN.p5(modifier2) ? 1048576 : 524288;
                }
                i9 = i7;
                if ((599187 & i9) == 599186 && composerKN.xMQ()) {
                    composerKN.wTp();
                    modifier3 = modifier2;
                } else {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-536067958, i9, -1, "com.alightcreative.app.motion.activities.main.MainTabsRow (MainTabsRow.kt:60)");
                    }
                    Modifier modifierKN = SizeKt.KN(SizeKt.xMQ(modifier2, Dp.KN(88)), 0.0f, 1, null);
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), false);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composerKN, modifierKN);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion2.n();
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
                    Updater.O(composerN, measurePolicyUo, companion2.t());
                    Updater.O(composerN, compositionLocalMapIk, companion2.O());
                    function2Rl = companion2.rl();
                    if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion2.nr());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Uo(tabs, onTabClicked, selectedTab, z3, boxScopeInstance.n(companion3, companion.rl()), composerKN, (i9 & 126) | ((i9 >> 3) & 896) | ((i9 >> 6) & 7168), 0);
                    Modifier modifierN = AbstractC1328c.n(PaddingKt.az(boxScopeInstance.n(companion3, companion.rl()), 0.0f, 0.0f, 0.0f, Dp.KN(32), 7, null), aD.w6.Z(), Dp.KN(70), Dp.KN(30), (b.f61769v & 8) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 16) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 32) != 0 ? 1.0f : 0.0f, (b.f61769v & 64) != 0 ? 1.0f : 0.0f);
                    composerKN.eF(478393532);
                    z4 = (i9 & 896) != 256;
                    objIF = composerKN.iF();
                    if (!z4 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function0() { // from class: KC.IE
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DT.O(onCreateProjectClicked);
                            }
                        };
                        composerKN.o(objIF);
                    }
                    composerKN.Xw();
                    Modifier modifier4 = modifier2;
                    CardKt.n(ClickableKt.J2(modifierN, false, null, null, (Function0) objIF, 7, null), RoundedCornerShapeKt.J2(), 0L, 0L, null, 0.0f, ComposableLambdaKt.nr(-1669594957, true, new j(i2), composerKN, 54), composerKN, 1572864, 60);
                    composerKN.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier3 = modifier4;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: KC.zpl
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return DT.J2(tabs, onTabClicked, onCreateProjectClicked, selectedTab, i2, z2, modifier3, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i7 |= 1572864;
            modifier2 = modifier;
            i9 = i7;
            if ((599187 & i9) == 599186) {
                if (i8 != 0) {
                }
                if (ComposerKt.v()) {
                }
                Modifier modifierKN2 = SizeKt.KN(SizeKt.xMQ(modifier2, Dp.KN(88)), 0.0f, 1, null);
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion4.HI(), false);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierKN2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0 function0N2 = companion22.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyUo2, companion22.t());
                Updater.O(composerN, compositionLocalMapIk2, companion22.O());
                function2Rl = companion22.rl();
                if (!composerN.getInserting()) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                    Updater.O(composerN, modifierO2, companion22.nr());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Uo(tabs, onTabClicked, selectedTab, z3, boxScopeInstance2.n(companion32, companion4.rl()), composerKN, (i9 & 126) | ((i9 >> 3) & 896) | ((i9 >> 6) & 7168), 0);
                    Modifier modifierN2 = AbstractC1328c.n(PaddingKt.az(boxScopeInstance2.n(companion32, companion4.rl()), 0.0f, 0.0f, 0.0f, Dp.KN(32), 7, null), aD.w6.Z(), Dp.KN(70), Dp.KN(30), (b.f61769v & 8) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 16) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 32) != 0 ? 1.0f : 0.0f, (b.f61769v & 64) != 0 ? 1.0f : 0.0f);
                    composerKN.eF(478393532);
                    if ((i9 & 896) != 256) {
                    }
                    objIF = composerKN.iF();
                    if (!z4) {
                        objIF = new Function0() { // from class: KC.IE
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DT.O(onCreateProjectClicked);
                            }
                        };
                        composerKN.o(objIF);
                        composerKN.Xw();
                        Modifier modifier42 = modifier2;
                        CardKt.n(ClickableKt.J2(modifierN2, false, null, null, (Function0) objIF, 7, null), RoundedCornerShapeKt.J2(), 0L, 0L, null, 0.0f, ComposableLambdaKt.nr(-1669594957, true, new j(i2), composerKN, 54), composerKN, 1572864, 60);
                        composerKN.XQ();
                        if (ComposerKt.v()) {
                        }
                        modifier3 = modifier42;
                    }
                }
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        z3 = z2;
        i8 = i5 & 64;
        if (i8 != 0) {
        }
        modifier2 = modifier;
        i9 = i7;
        if ((599187 & i9) == 599186) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
