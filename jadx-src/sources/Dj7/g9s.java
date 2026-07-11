package Dj7;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class g9s {

    static final class j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f1793n;

        j(String str) {
            this.f1793n = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.v()) {
                ComposerKt.p5(-1971646828, i2, -1, "com.alightcreative.common.compose.components.ExpandableText.<anonymous>.<anonymous> (ExpandableText.kt:60)");
            }
            TextKt.t(this.f1793n, SizeKt.E2(PaddingKt.az(Modifier.INSTANCE, 0.0f, Dp.KN(8), 0.0f, 0.0f, 13, null), null, false, 3, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composer, 6).wTp(), composer, 48, 0, 65532);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(String str, String str2, int i2, Composer composer, int i3) {
        t(str, str2, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void t(final String visibleText, String hiddenText, Composer composer, final int i2) {
        int i3;
        Painter painterT;
        final String str;
        Composer composer2;
        Intrinsics.checkNotNullParameter(visibleText, "visibleText");
        Intrinsics.checkNotNullParameter(hiddenText, "hiddenText");
        Composer composerKN = composer.KN(892802886);
        if ((i2 & 6) == 0) {
            i3 = i2 | (composerKN.p5(visibleText) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(hiddenText) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
            str = hiddenText;
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(892802886, i3, -1, "com.alightcreative.common.compose.components.ExpandableText (ExpandableText.kt:32)");
            }
            composerKN.eF(827647865);
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                composerKN.o(objIF);
            }
            final MutableState mutableState = (MutableState) objIF;
            composerKN.Xw();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.f17400n;
            Arrangement.Vertical verticalUo = arrangement.Uo();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion3.gh(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, companion2);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion4.n();
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
            Updater.O(composerN, measurePolicyN, companion4.t());
            Updater.O(composerN, compositionLocalMapIk, companion4.O());
            Function2 function2Rl = companion4.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion4.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            Arrangement.HorizontalOrVertical horizontalOrVerticalNr = arrangement.nr();
            Alignment.Vertical verticalXMQ = companion3.xMQ();
            composerKN.eF(-1051763918);
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                objIF2 = new Function0() { // from class: Dj7.SPz
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return g9s.J2(mutableState);
                    }
                };
                composerKN.o(objIF2);
            }
            composerKN.Xw();
            Modifier modifierJ2 = ClickableKt.J2(companion2, false, null, null, (Function0) objIF2, 7, null);
            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalNr, verticalXMQ, composerKN, 54);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierJ2);
            Function0 function0N2 = companion4.n();
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
            Updater.O(composerN2, measurePolicyRl, companion4.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
            Function2 function2Rl2 = companion4.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion4.nr());
            TextKt.t(visibleText, RowScope.rl(RowScopeInstance.f17780n, companion2, 1.0f, false, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, 6).g(), composerKN, i3 & 14, 0, 65532);
            SpacerKt.n(SizeKt.ViF(companion2, Dp.KN(15)), composerKN, 6);
            if (nr(mutableState)) {
                composerKN.eF(-1955393636);
                painterT = PainterResources_androidKt.t(2131231531, composerKN, 6);
                composerKN.Xw();
            } else {
                composerKN.eF(-1955307394);
                painterT = PainterResources_androidKt.t(2131231534, composerKN, 6);
                composerKN.Xw();
            }
            IconKt.n(painterT, null, SizeKt.Z(companion2, Dp.KN(10)), 0L, composerKN, 432, 8);
            composerKN.XQ();
            boolean zNr = nr(mutableState);
            str = hiddenText;
            composer2 = composerKN;
            AnimatedVisibilityKt.Uo(columnScopeInstance, zNr, null, null, null, null, ComposableLambdaKt.nr(-1971646828, true, new j(str), composerKN, 54), composer2, 1572870, 30);
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.ci
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g9s.Uo(visibleText, str, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(MutableState mutableState) {
        O(mutableState, !nr(mutableState));
        return Unit.INSTANCE;
    }

    private static final void O(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    private static final boolean nr(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }
}
