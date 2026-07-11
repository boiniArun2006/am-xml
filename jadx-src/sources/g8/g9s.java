package g8;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class g9s {
    public static final void J2(final ColumnScope columnScope, Modifier modifier, final s4 selected, final Function1 onSelectionChanged, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(onSelectionChanged, "onSelectionChanged");
        Composer composerKN = composer.KN(1541641724);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 48;
            modifier2 = modifier;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 32 : 16) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(selected) ? 256 : 128;
        }
        if ((i3 & 4) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(onSelectionChanged) ? 2048 : 1024;
        }
        if ((i5 & 1169) == 1168 && composerKN.xMQ()) {
            composerKN.wTp();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i7 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.v()) {
                ComposerKt.p5(1541641724, i5, -1, "com.alightcreative.monetization.stackedintro.components.PeriodicitySwitch (PeriodicitySwitch.kt:41)");
            }
            Modifier modifierNr = BackgroundKt.nr(ClipKt.n(modifier4, RoundedCornerShapeKt.t(Dp.KN(32))), ColorKt.nr(2570664518L), null, 2, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierNr);
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
            Updater.O(composerN, measurePolicyUo, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.nr(), companion.qie(), composerKN, 6);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, companion3);
            Function0 function0N2 = companion2.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N2);
            } else {
                composerKN.r();
            }
            Composer composerN2 = Updater.n(composerKN);
            Updater.O(composerN2, measurePolicyRl, companion2.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
            Function2 function2Rl2 = companion2.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion2.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            String strT = StringResources_androidKt.t(2132019862, composerKN, 6);
            boolean z2 = selected == s4.f67124n;
            composerKN.eF(-664958248);
            int i8 = i5 & 7168;
            boolean z3 = i8 == 2048;
            Object objIF = composerKN.iF();
            if (z3 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: g8.UGc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return g9s.Uo(onSelectionChanged);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            mUb(null, strT, z2, (Function0) objIF, composerKN, 0, 1);
            String strT2 = StringResources_androidKt.t(2132019863, composerKN, 6);
            boolean z4 = selected == s4.f67125t;
            composerKN.eF(-664950536);
            boolean z5 = i8 == 2048;
            Object objIF2 = composerKN.iF();
            if (z5 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function0() { // from class: g8.Q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return g9s.KN(onSelectionChanged);
                    }
                };
                composerKN.o(objIF2);
            }
            composerKN.Xw();
            mUb(null, strT2, z4, (Function0) objIF2, composerKN, 0, 1);
            composerKN.XQ();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier3 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: g8.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g9s.xMQ(columnScope, modifier3, selected, onSelectionChanged, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(Function1 function1) {
        function1.invoke(s4.f67125t);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(Function1 function1) {
        function1.invoke(s4.f67124n);
        return Unit.INSTANCE;
    }

    public static final void mUb(Modifier modifier, final String text, final boolean z2, final Function0 onClicked, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClicked, "onClicked");
        Composer composerKN = composer.KN(-881374127);
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
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(text) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.n(z2) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(onClicked) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i7 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.v()) {
                ComposerKt.p5(-881374127, i5, -1, "com.alightcreative.monetization.stackedintro.components.ToggleText (PeriodicitySwitch.kt:71)");
            }
            int i8 = i5;
            Modifier modifier5 = modifier4;
            State stateN = SingleValueAnimationKt.n(z2 ? ColorKt.nr(4284440687L) : Color.INSTANCE.Uo(), null, null, null, composerKN, 0, 14);
            State stateN2 = SingleValueAnimationKt.n(z2 ? Color.INSTANCE.KN() : ColorKt.nr(4292072415L), null, null, null, composerKN, 0, 14);
            float f3 = 32;
            Modifier modifierNr = BackgroundKt.nr(ClipKt.n(PaddingKt.xMQ(modifier5, Dp.KN(2)), RoundedCornerShapeKt.t(Dp.KN(f3))), az(stateN), null, 2, null);
            composerKN.eF(-1465815641);
            boolean z3 = (i8 & 7168) == 2048;
            Object objIF = composerKN.iF();
            if (z3 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: g8.SPz
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return g9s.gh(onClicked);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            TextKt.t(text, PaddingKt.mUb(ClickableKt.J2(modifierNr, false, null, null, (Function0) objIF, 7, null), Dp.KN(f3), Dp.KN(6)), ty(stateN2), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.f26164n.t(composerKN, MaterialTheme.rl).getTitleMedium(), composerKN, (i8 >> 3) & 14, 0, 65528);
            composerKN = composerKN;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: g8.ci
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g9s.qie(modifier3, text, z2, onClicked, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(Modifier modifier, String str, boolean z2, Function0 function0, int i2, int i3, Composer composer, int i5) {
        mUb(modifier, str, z2, function0, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(ColumnScope columnScope, Modifier modifier, s4 s4Var, Function1 function1, int i2, int i3, Composer composer, int i5) {
        J2(columnScope, modifier, s4Var, function1, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    private static final long az(State state) {
        return ((Color) state.getValue()).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final long ty(State state) {
        return ((Color) state.getValue()).getValue();
    }
}
