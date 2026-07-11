package u;

import Dj7.CM;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class QJ {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[six.fuX.values().length];
            try {
                iArr[six.fuX.f73290n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[six.fuX.f73293t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[six.fuX.f73288O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[six.fuX.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[six.fuX.f73292r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void rl(final six.fuX selectedProjectType, final Function0 onCloseButtonClicked, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(selectedProjectType, "selectedProjectType");
        Intrinsics.checkNotNullParameter(onCloseButtonClicked, "onCloseButtonClicked");
        Composer composerKN = composer.KN(-506038669);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(selectedProjectType) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onCloseButtonClicked) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-506038669, i3, -1, "com.alightcreative.maineditor.templateimport.ui.components.ProjectTypeRow (ProjectTypeRow.kt:29)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierGh = PaddingKt.gh(companion, Dp.KN(16), 0.0f, 2, null);
            Arrangement.Horizontal horizontalJ2 = Arrangement.f17400n.J2();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalJ2, companion2.qie(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierGh);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion3.n();
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
            Updater.O(composerN, measurePolicyRl, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            Modifier modifierT = rowScopeInstance.t(SizeKt.ViF(PaddingKt.az(companion, 0.0f, 0.0f, Dp.KN(12), 0.0f, 11, null), Dp.KN(24)), companion2.xMQ());
            float f3 = 0;
            PaddingValues paddingValuesN = PaddingKt.n(Dp.KN(f3));
            ButtonDefaults buttonDefaults = ButtonDefaults.f21598n;
            Color.Companion companion4 = Color.INSTANCE;
            long jJ2 = companion4.J2();
            long jJ22 = companion4.J2();
            int i5 = ButtonDefaults.qie;
            ButtonKt.n(onCloseButtonClicked, modifierT, false, null, buttonDefaults.rl(Dp.KN(f3), Dp.KN(f3), 0.0f, 0.0f, 0.0f, composerKN, (i5 << 15) | 54, 28), null, null, buttonDefaults.n(jJ2, jJ22, 0L, 0L, composerKN, (i5 << 12) | 54, 12), paddingValuesN, Pl.f74095n.n(), composerKN, ((i3 >> 3) & 14) | 905969664, 108);
            int i7 = j.$EnumSwitchMapping$0[selectedProjectType.ordinal()];
            int i8 = 2132020288;
            if (i7 != 1) {
                if (i7 == 2) {
                    i8 = 2132020286;
                } else if (i7 == 3) {
                    i8 = 2132020317;
                } else if (i7 == 4) {
                    i8 = 2132019905;
                } else if (i7 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            CM.S(StringResources_androidKt.t(i8, composerKN, 0), H9N.j.f3810n.rl(composerKN, 6).fD(), rowScopeInstance.t(companion, companion2.xMQ()), aD.w6.F(), null, null, TextAlign.KN(TextAlign.INSTANCE.nr()), 0, false, 0, null, composerKN, 3072, 0, 1968);
            composer2 = composerKN;
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: u.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QJ.t(selectedProjectType, onCloseButtonClicked, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(six.fuX fux, Function0 function0, int i2, Composer composer, int i3) {
        rl(fux, function0, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
