package KA9;

import Dj7.CM;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import d8q.jqQ.QTafcm;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: KA9.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class AbstractC1381p {

    /* JADX INFO: renamed from: KA9.p$n */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class n implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f4993n;

        n(String str) {
            this.f4993n = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(RowScope Button, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(43581438, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.components.YourProjectsRow.<anonymous>.<anonymous> (YourProjectsRow.kt:64)");
            }
            CM.S(this.f4993n, H9N.j.f3810n.rl(composer, 6).wTp(), null, 0L, null, null, null, 0, false, 0, null, composer, 0, 0, 2044);
            SpacerKt.n(SizeKt.ViF(Modifier.INSTANCE, Dp.KN(4)), composer, 6);
            IconKt.n(PainterResources_androidKt.t(2131231923, composer, 6), null, null, 0L, composer, 48, 12);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: renamed from: KA9.p$j */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
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

    public static final void rl(final six.fuX fux, final String sortText, Function0 function0, Composer composer, final int i2) {
        int i3;
        String strT;
        final Function0 onSortMenuTriggered = function0;
        Intrinsics.checkNotNullParameter(fux, QTafcm.kUeSoSbelaPat);
        Intrinsics.checkNotNullParameter(sortText, "sortText");
        Intrinsics.checkNotNullParameter(onSortMenuTriggered, "onSortMenuTriggered");
        Composer composerKN = composer.KN(-229904942);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(fux) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(sortText) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onSortMenuTriggered) ? 256 : 128;
        }
        int i5 = i3;
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-229904942, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.components.YourProjectsRow (YourProjectsRow.kt:31)");
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
            Modifier modifierRl = RowScope.rl(RowScopeInstance.f17780n, companion, 1.0f, false, 2, null);
            int iNr = TextAlign.INSTANCE.nr();
            TextStyle textStyleG = H9N.j.f3810n.rl(composerKN, 6).g();
            int i7 = j.$EnumSwitchMapping$0[fux.ordinal()];
            if (i7 == 1) {
                composerKN.eF(2091993377);
                strT = StringResources_androidKt.t(2132019993, composerKN, 6);
                composerKN.Xw();
            } else if (i7 == 2) {
                composerKN.eF(2091996673);
                strT = StringResources_androidKt.t(2132019991, composerKN, 6);
                composerKN.Xw();
            } else if (i7 == 3) {
                composerKN.eF(2092000003);
                strT = StringResources_androidKt.t(2132020318, composerKN, 6);
                composerKN.Xw();
            } else if (i7 == 4) {
                composerKN.eF(2092003327);
                strT = StringResources_androidKt.t(2132019921, composerKN, 6);
                composerKN.Xw();
            } else {
                if (i7 != 5) {
                    composerKN.eF(2091991755);
                    composerKN.Xw();
                    throw new NoWhenBranchMatchedException();
                }
                composerKN.eF(2092006497);
                strT = StringResources_androidKt.t(2132019993, composerKN, 6);
                composerKN.Xw();
            }
            CM.S(strT, textStyleG, modifierRl, aD.w6.F(), null, null, TextAlign.KN(iNr), 0, false, 0, null, composerKN, 3072, 0, 1968);
            ButtonDefaults buttonDefaults = ButtonDefaults.f21598n;
            long jJ2 = Color.INSTANCE.J2();
            long jF = aD.w6.F();
            int i8 = ButtonDefaults.qie;
            float f3 = 0;
            onSortMenuTriggered = function0;
            ButtonKt.n(onSortMenuTriggered, null, false, null, buttonDefaults.rl(Dp.KN(f3), Dp.KN(f3), 0.0f, 0.0f, 0.0f, composerKN, (i8 << 15) | 54, 28), null, null, buttonDefaults.Uo(jJ2, jF, 0L, composerKN, (i8 << 9) | 54, 4), PaddingKt.n(Dp.KN(f3)), ComposableLambdaKt.nr(43581438, true, new n(sortText), composerKN, 54), composerKN, ((i5 >> 6) & 14) | 905969664, 110);
            composerKN = composerKN;
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: KA9.OU
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC1381p.t(fux, sortText, onSortMenuTriggered, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(six.fuX fux, String str, Function0 function0, int i2, Composer composer, int i3) {
        rl(fux, str, function0, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
