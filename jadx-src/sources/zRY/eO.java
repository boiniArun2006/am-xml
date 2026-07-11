package zRY;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class eO {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[tN.CN3.values().length];
            try {
                iArr[tN.CN3.f73454n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[tN.CN3.f73455t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void rl(final tN.CN3 cn3, final Set tags, Composer composer, final int i2) {
        Object obj;
        long jETf;
        int i3;
        Intrinsics.checkNotNullParameter(tags, "tags");
        Composer composerKN = composer.KN(1248308079);
        int i5 = 6;
        int i7 = (i2 & 6) == 0 ? (composerKN.p5(cn3) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i7 |= composerKN.E2(tags) ? 32 : 16;
        }
        if ((i7 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1248308079, i7, -1, "com.alightcreative.app.motion.premade.ui.PremadeContentItemTagRow (PremadeContentItemTagRow.kt:31)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierXMQ = SizeKt.xMQ(companion, Dp.KN(16));
            Arrangement.Horizontal horizontalJ2 = Arrangement.f17400n.J2();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalJ2, companion2.qie(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierXMQ);
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
            composerKN.eF(2062258277);
            if (cn3 != null) {
                Modifier modifierNr = SizeKt.nr(companion, 0.0f, 1, null);
                int[] iArr = j.$EnumSwitchMapping$0;
                int i8 = iArr[cn3.ordinal()];
                if (i8 == 1) {
                    jETf = aD.w6.eTf();
                } else {
                    if (i8 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jETf = aD.w6.ijL();
                }
                float f3 = 4;
                Modifier modifierMUb = PaddingKt.mUb(BackgroundKt.t(modifierNr, jETf, RoundedCornerShapeKt.t(Dp.KN(f3))), Dp.KN(6), Dp.KN(f3));
                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
                int iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierMUb);
                Function0 function0N2 = companion3.n();
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
                Updater.O(composerN2, measurePolicyUo, companion3.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                Function2 function2Rl2 = companion3.rl();
                if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion3.nr());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                int i9 = iArr[cn3.ordinal()];
                if (i9 == 1) {
                    i3 = 2131231893;
                } else {
                    if (i9 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = 2131231892;
                }
                obj = null;
                ImageKt.n(PainterResources_androidKt.t(i3, composerKN, 0), null, null, null, ContentScale.INSTANCE.O(), 0.0f, ColorFilter.Companion.rl(ColorFilter.INSTANCE, aD.w6.F(), 0, 2, null), composerKN, 1597488, 44);
                composerKN.XQ();
                SpacerKt.n(SizeKt.ViF(companion, Dp.KN(f3)), composerKN, 6);
            } else {
                obj = null;
            }
            composerKN.Xw();
            composerKN.eF(2062295961);
            for (Iterator it = tags.iterator(); it.hasNext(); it = it) {
                String str = (String) it.next();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                float f4 = 4;
                Modifier modifierGh = PaddingKt.gh(BackgroundKt.t(SizeKt.nr(companion4, 0.0f, 1, obj), aD.w6.m(), RoundedCornerShapeKt.t(Dp.KN(f4))), Dp.KN(i5), 0.0f, 2, obj);
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                int iN3 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierGh);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0 function0N3 = companion5.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                    composerKN.s7N(function0N3);
                } else {
                    composerKN.r();
                }
                Composer composerN3 = Updater.n(composerKN);
                Updater.O(composerN3, measurePolicyUo2, companion5.t());
                Updater.O(composerN3, compositionLocalMapIk3, companion5.O());
                Function2 function2Rl3 = companion5.rl();
                if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                    composerN3.o(Integer.valueOf(iN3));
                    composerN3.az(Integer.valueOf(iN3), function2Rl3);
                }
                Updater.O(composerN3, modifierO3, companion5.nr());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                String upperCase = str.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                Composer composer2 = composerKN;
                TextKt.t(upperCase, null, aD.w6.F(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, i5).U(), composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
                composerKN = composer2;
                composerKN.XQ();
                SpacerKt.n(SizeKt.ViF(companion4, Dp.KN(f4)), composerKN, 6);
                i5 = 6;
                obj = obj;
            }
            composerKN.Xw();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: zRY.Xo
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return eO.t(cn3, tags, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(tN.CN3 cn3, Set set, int i2, Composer composer, int i3) {
        rl(cn3, set, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
