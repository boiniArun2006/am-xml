package nz;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class CN3 {

    static final class j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f71272n;

        j(Function0 function0) {
            this.f71272n = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.v()) {
                ComposerKt.p5(1123926411, i2, -1, "com.alightcreative.app.motion.activities.main.templatepreview.composables.FooterSection.<anonymous>.<anonymous> (FooterSection.kt:49)");
            }
            ButtonKt.n(this.f71272n, SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), false, RoundedCornerShapeKt.t(Dp.KN(12)), ButtonDefaults.f24588n.rl(Color.az(Color.INSTANCE.KN(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), aD.w6.EWS(), 0L, 0L, composer, (ButtonDefaults.HI << 12) | 54, 12), null, null, PaddingKt.n(Dp.KN(16)), null, nz.j.f71294n.n(), composer, 817889328, 356);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(Modifier modifier, int i2, int i3, Composer composer, int i5) {
        O(modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    private static final void O(Modifier modifier, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        final Modifier modifier3;
        Composer composerKN = composer.KN(-1128336828);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i5 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i7 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.v()) {
                ComposerKt.p5(-1128336828, i5, -1, "com.alightcreative.app.motion.activities.main.templatepreview.composables.SwipeHint (FooterSection.kt:110)");
            }
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.ty(Dp.KN(10)), Alignment.INSTANCE.Uo(), composerKN, 54);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifier4);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
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
            Updater.O(composerN, measurePolicyN, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            Painter painterT = PainterResources_androidKt.t(2131232006, composerKN, 6);
            Color.Companion companion2 = Color.INSTANCE;
            IconKt.t(painterT, null, SizeKt.Z(Modifier.INSTANCE, Dp.KN(60)), companion2.KN(), composerKN, 3504, 0);
            modifier3 = modifier4;
            TextKt.t(StringResources_androidKt.t(2132020278, composerKN, 6), null, companion2.KN(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, 6).v(), composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
            composerKN = composerKN;
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: nz.Wre
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CN3.J2(modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(boolean z2, boolean z3, Function0 function0, Function0 function02, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        t(z2, z3, function0, function02, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final boolean z2, final boolean z3, final Function0 onUseTemplateClicked, final Function0 onSeeAllSavedClicked, Modifier modifier, Composer composer, final int i2, final int i3) {
        boolean z4;
        int i5;
        Modifier modifier2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(onUseTemplateClicked, "onUseTemplateClicked");
        Intrinsics.checkNotNullParameter(onSeeAllSavedClicked, "onSeeAllSavedClicked");
        Composer composerKN = composer.KN(394799037);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.n(z4) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.n(z3) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onUseTemplateClicked) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(onSeeAllSavedClicked) ? 2048 : 1024;
        }
        int i7 = i3 & 16;
        if (i7 == 0) {
            if ((i2 & 24576) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 16384 : 8192;
            }
            if ((i5 & 9363) == 9362 || !composerKN.xMQ()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(394799037, i5, -1, "com.alightcreative.app.motion.activities.main.templatepreview.composables.FooterSection (FooterSection.kt:38)");
                }
                float f3 = 12;
                MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.ty(Dp.KN(f3)), Alignment.INSTANCE.Uo(), composerKN, 54);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifier4);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0 function0N = companion.n();
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
                Updater.O(composerN, measurePolicyN, companion.t());
                Updater.O(composerN, compositionLocalMapIk, companion.O());
                function2Rl = companion.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion.nr());
                int i8 = i5;
                Modifier modifier5 = modifier4;
                AnimatedVisibilityKt.Uo(ColumnScopeInstance.f17468n, z4, null, EnterTransition.INSTANCE.n(), EnterExitTransitionKt.Ik(null, 0.0f, 3, null), null, ComposableLambdaKt.nr(1123926411, true, new j(onSeeAllSavedClicked), composerKN, 54), composerKN, ((i8 << 3) & 112) | 1597446, 18);
                composerKN.eF(645389638);
                if (z3) {
                    O(PaddingKt.az(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.KN(f3), 7, null), composerKN, 6, 0);
                }
                composerKN.Xw();
                ButtonKt.n(onUseTemplateClicked, SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), false, RoundedCornerShapeKt.t(Dp.KN(f3)), ButtonDefaults.f24588n.rl(((aF1.j) composerKN.ty(aF1.w6.t())).ck(), aD.w6.EWS(), 0L, 0L, composerKN, (ButtonDefaults.HI << 12) | 48, 12), null, null, PaddingKt.n(Dp.KN(16)), null, nz.j.f71294n.rl(), composerKN, ((i8 >> 6) & 14) | 817889328, 356);
                composerKN = composerKN;
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier5;
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: nz.I28
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CN3.nr(z2, z3, onUseTemplateClicked, onSeeAllSavedClicked, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 24576;
        modifier2 = modifier;
        if ((i5 & 9363) == 9362) {
            if (i7 == 0) {
            }
            if (ComposerKt.v()) {
            }
            float f32 = 12;
            MeasurePolicy measurePolicyN2 = ColumnKt.n(Arrangement.f17400n.ty(Dp.KN(f32)), Alignment.INSTANCE.Uo(), composerKN, 54);
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifier4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N2 = companion2.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyN2, companion2.t());
            Updater.O(composerN, compositionLocalMapIk2, companion2.O());
            function2Rl = companion2.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO2, companion2.nr());
                int i82 = i5;
                Modifier modifier52 = modifier4;
                AnimatedVisibilityKt.Uo(ColumnScopeInstance.f17468n, z4, null, EnterTransition.INSTANCE.n(), EnterExitTransitionKt.Ik(null, 0.0f, 3, null), null, ComposableLambdaKt.nr(1123926411, true, new j(onSeeAllSavedClicked), composerKN, 54), composerKN, ((i82 << 3) & 112) | 1597446, 18);
                composerKN.eF(645389638);
                if (z3) {
                }
                composerKN.Xw();
                ButtonKt.n(onUseTemplateClicked, SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), false, RoundedCornerShapeKt.t(Dp.KN(f32)), ButtonDefaults.f24588n.rl(((aF1.j) composerKN.ty(aF1.w6.t())).ck(), aD.w6.EWS(), 0L, 0L, composerKN, (ButtonDefaults.HI << 12) | 48, 12), null, null, PaddingKt.n(Dp.KN(16)), null, nz.j.f71294n.rl(), composerKN, ((i82 >> 6) & 14) | 817889328, 356);
                composerKN = composerKN;
                composerKN.XQ();
                if (ComposerKt.v()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
