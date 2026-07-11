package KA9;

import Dj7.CM;
import Dj7.QaP;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class DAz {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[six.CN3.values().length];
            try {
                iArr[six.CN3.f73284t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[six.CN3.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[six.CN3.f73283r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[six.CN3.f73279O.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(six.CN3 cn3, boolean z2, int i2, int i3, Composer composer, int i5) {
        rl(cn3, z2, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(six.CN3 cn3, boolean z2, Composer composer, final int i2, final int i3) {
        six.CN3 cn32;
        int i5;
        int i7;
        final boolean z3;
        int i8;
        six.CN3 cn33;
        boolean z4;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int i9;
        final six.CN3 cn34;
        String strT;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-2043977873);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i5 = i2 | 6;
            cn32 = cn3;
        } else if ((i2 & 6) == 0) {
            cn32 = cn3;
            if (composerKN.p5(cn32)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i2 | i7;
        } else {
            cn32 = cn3;
            i5 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                z3 = z2;
                if (composerKN.n(z3)) {
                    i8 = 32;
                } else {
                    i8 = 16;
                }
                i5 |= i8;
            }
            if ((i5 & 19) != 18 && composerKN.xMQ()) {
                composerKN.wTp();
                cn34 = cn32;
            } else {
                if (i10 == 0) {
                    cn33 = six.CN3.f73284t;
                } else {
                    cn33 = cn32;
                }
                if (i11 == 0) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-2043977873, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.components.ProjectListEmptyState (ProjectListEmptyState.kt:31)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierGh = PaddingKt.gh(BackgroundKt.nr(SizeKt.KN(companion, 0.0f, 1, null), Color.INSTANCE.J2(), null, 2, null), Dp.KN(35), 0.0f, 2, null);
                Arrangement.Vertical verticalUo = Arrangement.f17400n.Uo();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion2.gh(), composerKN, 0);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierGh);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0 function0N = companion3.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (!composerKN.getInserting()) {
                    composerKN.s7N(function0N);
                } else {
                    composerKN.r();
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyN, companion3.t());
                Updater.O(composerN, compositionLocalMapIk, companion3.O());
                function2Rl = companion3.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion3.nr());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                int[] iArr = j.$EnumSwitchMapping$0;
                i9 = iArr[cn33.ordinal()];
                int i12 = 2132019974;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3 && i9 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        i12 = 2132018945;
                    }
                }
                String strT2 = StringResources_androidKt.t(i12, composerKN, 0);
                Modifier modifierT = columnScopeInstance.t(companion, companion2.Uo());
                H9N.j jVar = H9N.j.f3810n;
                TextStyle textStyleIF = jVar.rl(composerKN, 6).iF();
                long jWPU = aD.w6.WPU();
                TextAlign.Companion companion4 = TextAlign.INSTANCE;
                cn34 = cn33;
                TextKt.t(strT2, modifierT, jWPU, 0L, null, null, null, 0L, null, TextAlign.KN(companion4.n()), 0L, 0, false, 0, 0, null, textStyleIF, composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65016);
                SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(8)), composerKN, 6);
                if (cn34 != six.CN3.f73283r) {
                    composerKN.eF(536570241);
                    if (z4) {
                        composerKN.eF(536604248);
                        strT = StringResources_androidKt.t(2132018948, composerKN, 6);
                        composerKN.Xw();
                    } else {
                        composerKN.eF(536699542);
                        strT = StringResources_androidKt.t(2132018951, composerKN, 6);
                        composerKN.Xw();
                    }
                    composerKN.Xw();
                } else {
                    composerKN.eF(536826363);
                    String strT3 = StringResources_androidKt.t(2132019972, composerKN, 6);
                    int i13 = iArr[cn34.ordinal()];
                    int i14 = 2132019973;
                    if (i13 != 1 && i13 == 2) {
                        i14 = 2132018944;
                    }
                    strT = strT3 + "\n{bold}" + StringResources_androidKt.t(i14, composerKN, 0) + "{/bold}";
                    composerKN.Xw();
                }
                CM.xMQ(strT, columnScopeInstance.t(companion, companion2.Uo()), aD.w6.WPU(), TextAlign.KN(companion4.n()), jVar.rl(composerKN, 6).v(), CollectionsKt.listOf(new QaP(TtmlNode.BOLD, new P0j.Dsr(false, false, false, true, false, null, 0L, null, 247, null))), composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                composerKN = composerKN;
                SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(30)), composerKN, 6);
                IconKt.n(PainterResources_androidKt.t(2131231913, composerKN, 6), null, columnScopeInstance.t(companion, companion2.Uo()), 0L, composerKN, 48, 8);
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                z3 = z4;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: KA9.nKK
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DAz.t(cn34, z3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        z3 = z2;
        if ((i5 & 19) != 18) {
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (ComposerKt.v()) {
            }
            Modifier.Companion companion5 = Modifier.INSTANCE;
            Modifier modifierGh2 = PaddingKt.gh(BackgroundKt.nr(SizeKt.KN(companion5, 0.0f, 1, null), Color.INSTANCE.J2(), null, 2, null), Dp.KN(35), 0.0f, 2, null);
            Arrangement.Vertical verticalUo2 = Arrangement.f17400n.Uo();
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN2 = ColumnKt.n(verticalUo2, companion22.gh(), composerKN, 0);
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierGh2);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0 function0N2 = companion32.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (!composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyN2, companion32.t());
            Updater.O(composerN, compositionLocalMapIk2, companion32.O());
            function2Rl = companion32.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO2, companion32.nr());
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                int[] iArr2 = j.$EnumSwitchMapping$0;
                i9 = iArr2[cn33.ordinal()];
                int i122 = 2132019974;
                if (i9 != 1) {
                }
                String strT22 = StringResources_androidKt.t(i122, composerKN, 0);
                Modifier modifierT2 = columnScopeInstance2.t(companion5, companion22.Uo());
                H9N.j jVar2 = H9N.j.f3810n;
                TextStyle textStyleIF2 = jVar2.rl(composerKN, 6).iF();
                long jWPU2 = aD.w6.WPU();
                TextAlign.Companion companion42 = TextAlign.INSTANCE;
                cn34 = cn33;
                TextKt.t(strT22, modifierT2, jWPU2, 0L, null, null, null, 0L, null, TextAlign.KN(companion42.n()), 0L, 0, false, 0, 0, null, textStyleIF2, composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65016);
                SpacerKt.n(SizeKt.xMQ(companion5, Dp.KN(8)), composerKN, 6);
                if (cn34 != six.CN3.f73283r) {
                }
                CM.xMQ(strT, columnScopeInstance2.t(companion5, companion22.Uo()), aD.w6.WPU(), TextAlign.KN(companion42.n()), jVar2.rl(composerKN, 6).v(), CollectionsKt.listOf(new QaP(TtmlNode.BOLD, new P0j.Dsr(false, false, false, true, false, null, 0L, null, 247, null))), composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                composerKN = composerKN;
                SpacerKt.n(SizeKt.xMQ(companion5, Dp.KN(30)), composerKN, 6);
                IconKt.n(PainterResources_androidKt.t(2131231913, composerKN, 6), null, columnScopeInstance2.t(companion5, companion22.Uo()), 0L, composerKN, 48, 8);
                composerKN.XQ();
                if (ComposerKt.v()) {
                }
                z3 = z4;
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
