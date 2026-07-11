package D;

import Dj7.lej;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class I28 {

    static final class j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f1067n;

        j(float f3) {
            this.f1067n = f3;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.v()) {
                ComposerKt.p5(-1618193416, i2, -1, "com.alightcreative.monetization.ui.components.PaywallLoadingOverlay.<anonymous> (PaywallLoadingOverlay.kt:33)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierJ2 = SizeKt.J2(BackgroundKt.nr(companion, Color.az(aD.w6.GR(), this.f1067n, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierJ2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion3.n();
            if (composer.getApplier() == null) {
                ComposablesKt.t();
            }
            composer.T();
            if (composer.getInserting()) {
                composer.s7N(function0N);
            } else {
                composer.r();
            }
            Composer composerN = Updater.n(composer);
            Updater.O(composerN, measurePolicyUo, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            lej.t(2131951629, BoxScopeInstance.f17448n.n(companion, companion2.O()), true, false, null, null, composer, 390, 56);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(float f3, boolean z2, int i2, int i3, Composer composer, int i5) {
        rl(f3, z2, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final void rl(final float f3, final boolean z2, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        int i8;
        Composer composerKN = composer.KN(1688674256);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerKN.rl(f3)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i7 | i2;
        } else {
            i5 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            if (composerKN.n(z2)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i5 |= i8;
        }
        if ((i5 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (i9 != 0) {
                f3 = 1.0f;
            }
            if (i10 != 0) {
                z2 = true;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1688674256, i5, -1, "com.alightcreative.monetization.ui.components.PaywallLoadingOverlay (PaywallLoadingOverlay.kt:27)");
            }
            int i11 = ((i5 >> 3) & 14) | 200064;
            boolean z3 = z2;
            AnimatedVisibilityKt.mUb(z3, null, EnterExitTransitionKt.HI(null, 0.0f, 3, null), EnterExitTransitionKt.Ik(null, 0.0f, 3, null), null, ComposableLambdaKt.nr(-1618193416, true, new j(f3), composerKN, 54), composerKN, i11, 18);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            z2 = z3;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: D.Ml
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return I28.t(f3, z2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
