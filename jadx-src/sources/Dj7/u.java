package Dj7;

import Dj7.u;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class u {

    static final class j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ long f1884n;

        j(long j2) {
            this.f1884n = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t() {
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            rl((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.v()) {
                ComposerKt.p5(-257404603, i2, -1, "com.alightcreative.common.compose.components.LoadingOverlay.<anonymous> (LoadingOverlay.kt:28)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierJ2 = SizeKt.J2(companion, 0.0f, 1, null);
            composer.eF(-1125110896);
            Object objIF = composer.iF();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objIF == companion2.n()) {
                objIF = InteractionSourceKt.n();
                composer.o(objIF);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objIF;
            composer.Xw();
            composer.eF(-1125107166);
            Object objIF2 = composer.iF();
            if (objIF2 == companion2.n()) {
                objIF2 = new Function0() { // from class: Dj7.DAz
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return u.j.t();
                    }
                };
                composer.o(objIF2);
            }
            composer.Xw();
            Modifier modifierNr = BackgroundKt.nr(ClickableKt.nr(modifierJ2, mutableInteractionSource, null, false, null, null, (Function0) objIF2, 28, null), this.f1884n, null, 2, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), false);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierNr);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion4.n();
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
            Updater.O(composerN, measurePolicyUo, companion4.t());
            Updater.O(composerN, compositionLocalMapIk, companion4.O());
            Function2 function2Rl = companion4.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion4.nr());
            lej.t(2131951629, BoxScopeInstance.f17448n.n(companion, companion3.O()), true, false, null, null, composer, 390, 56);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(boolean z2, long j2, int i2, int i3, Composer composer, int i5) {
        rl(z2, j2, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final boolean z2, long j2, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        long j3;
        int i8;
        final long jS2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1111117933);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerKN.n(z2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i2 | i7;
        } else {
            i5 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                j3 = j2;
                if (composerKN.nr(j3)) {
                    i8 = 32;
                } else {
                    i8 = 16;
                }
                i5 |= i8;
            }
            if ((i5 & 19) != 18 && composerKN.xMQ()) {
                composerKN.wTp();
                jS2 = j3;
            } else {
                if (i9 == 0) {
                    jS2 = aD.w6.S();
                } else {
                    jS2 = j3;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(1111117933, i5, -1, "com.alightcreative.common.compose.components.LoadingOverlay (LoadingOverlay.kt:22)");
                }
                AnimatedVisibilityKt.mUb(z2, null, EnterExitTransitionKt.HI(null, 0.0f, 3, null), EnterExitTransitionKt.Ik(null, 0.0f, 3, null), null, ComposableLambdaKt.nr(-257404603, true, new j(jS2), composerKN, 54), composerKN, (i5 & 14) | 200064, 18);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.nKK
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return u.t(z2, jS2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        j3 = j2;
        if ((i5 & 19) != 18) {
            if (i9 == 0) {
            }
            if (ComposerKt.v()) {
            }
            AnimatedVisibilityKt.mUb(z2, null, EnterExitTransitionKt.HI(null, 0.0f, 3, null), EnterExitTransitionKt.Ik(null, 0.0f, 3, null), null, ComposableLambdaKt.nr(-257404603, true, new j(jS2), composerKN, 54), composerKN, (i5 & 14) | 200064, 18);
            if (ComposerKt.v()) {
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
