package D;

import R5.Ml;
import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.material3.windowsizeclass.WindowSizeClass;
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass;
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
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.account.PurchasePeriod;
import com.safedk.android.analytics.brandsafety.b;
import eo.AbstractC1969w6;
import f.EnumC1982eO;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class fuX {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchasePeriod.Unit.values().length];
            try {
                iArr[PurchasePeriod.Unit.Day.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchasePeriod.Unit.Week.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchasePeriod.Unit.Month.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PurchasePeriod.Unit.Year.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final float J2(float f3, boolean z2, boolean z3) {
        if (z2) {
            return Dp.KN(0);
        }
        return Dp.KN(f3 * (1.0f - (z3 ? 0.63f : 0.4f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String KN(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return P0j.fuX.xMQ().replace(it, "");
    }

    private static final float O(float f3, boolean z2, boolean z3) {
        if (z2) {
            return z3 ? Dp.KN(b.f61769v) : Dp.KN(200);
        }
        return Dp.KN(f3 * (z3 ? 0.1655f : 0.06f));
    }

    private static final Modifier gh(Modifier modifier, Ml.j.I28 i28, boolean z2, boolean z3) {
        Pair[] pairArrD;
        if (!z2) {
            return modifier;
        }
        Brush.Companion companion = Brush.INSTANCE;
        if (z3) {
            R5.Wre wreRl = i28.rl();
            pairArrD = ((wreRl != null ? wreRl.Uo() : null) == null || i28.n()) ? aD.w6.jB() : aD.w6.a();
        } else {
            pairArrD = aD.w6.D();
        }
        return BackgroundKt.rl(modifier, Brush.Companion.mUb(companion, (Pair[]) Arrays.copyOf(pairArrD, pairArrD.length), 0.0f, 0.0f, 0, 14, null), null, z3 ? 0.8f : 1.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(BoxScope boxScope, WindowSizeClass windowSizeClass, float f3, Ml.j.I28 i28, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function0 function04, int i2, Composer composer, int i3) {
        t(boxScope, windowSizeClass, f3, i28, function0, function02, function03, function1, function04, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0286  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final BoxScope PaywallMainContent, final WindowSizeClass windowSizeClass, final float f3, final Ml.j.I28 i28, final Function0 onContinueButtonClicked, final Function0 onManageSubscriptionClicked, final Function0 onFreeTrialCheckboxClicked, final Function1 onSubscriptionClicked, final Function0 onOtherOptionsClicked, Composer composer, final int i2) {
        int i3;
        boolean z2;
        Pair[] pairArrA;
        float f4;
        TextStyle textStyleO;
        Intrinsics.checkNotNullParameter(PaywallMainContent, "$this$PaywallMainContent");
        Intrinsics.checkNotNullParameter(windowSizeClass, "windowSizeClass");
        Intrinsics.checkNotNullParameter(i28, qUrazMnwDskFs.SKDRBqht);
        Intrinsics.checkNotNullParameter(onContinueButtonClicked, "onContinueButtonClicked");
        Intrinsics.checkNotNullParameter(onManageSubscriptionClicked, "onManageSubscriptionClicked");
        Intrinsics.checkNotNullParameter(onFreeTrialCheckboxClicked, "onFreeTrialCheckboxClicked");
        Intrinsics.checkNotNullParameter(onSubscriptionClicked, "onSubscriptionClicked");
        Intrinsics.checkNotNullParameter(onOtherOptionsClicked, "onOtherOptionsClicked");
        Composer composerKN = composer.KN(-1395520319);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(PaywallMainContent) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(windowSizeClass) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.rl(f3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(i28) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(onContinueButtonClicked) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(onManageSubscriptionClicked) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.E2(onFreeTrialCheckboxClicked) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerKN.E2(onSubscriptionClicked) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerKN.E2(onOtherOptionsClicked) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        int i5 = i3;
        if ((38347923 & i5) == 38347922 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1395520319, i5, -1, "com.alightcreative.monetization.ui.components.PaywallMainContent (PaywallMainContent.kt:53)");
            }
            boolean zQie = WindowWidthSizeClass.qie(windowSizeClass.getWidthSizeClass(), WindowWidthSizeClass.INSTANCE.nr());
            EnumC1982eO enumC1982eOJ2 = i28.J2();
            boolean z3 = enumC1982eOJ2 == EnumC1982eO.f64025t;
            composerKN.eF(1172656930);
            if (z3 && zQie) {
                boolean z4 = z3;
                String strT = StringResources_androidKt.t(2132019859, composerKN, 6);
                float f5 = 25;
                Modifier modifierN = PaywallMainContent.n(PaddingKt.az(Modifier.INSTANCE, Dp.KN(f5), Dp.KN(b.f61769v), Dp.KN(f5), 0.0f, 8, null), Alignment.INSTANCE.az());
                H9N.j jVar = H9N.j.f3810n;
                z2 = z4;
                TextKt.t(strT, modifierN, jVar.n(composerKN, 6).t(), 0L, null, null, null, 0L, null, TextAlign.KN(TextAlign.INSTANCE.n()), 0L, 0, false, 0, 0, null, jVar.rl(composerKN, 6).nr(), composerKN, 0, 0, 65016);
            } else {
                z2 = z3;
            }
            composerKN.Xw();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierAz = PaddingKt.az(SizeKt.KN(companion, 0.0f, 1, null), 0.0f, J2(f3, z2, zQie), 0.0f, 0.0f, 13, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierN2 = PaywallMainContent.n(modifierAz, companion2.rl());
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN2);
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
            Updater.O(composerN, measurePolicyUo, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            composerKN.eF(617713098);
            EnumC1982eO enumC1982eO = EnumC1982eO.f64022n;
            if (enumC1982eOJ2 == enumC1982eO || enumC1982eOJ2 == EnumC1982eO.f64016O) {
                Modifier modifierN3 = boxScopeInstance.n(SizeKt.xMQ(SizeKt.KN(companion, 0.0f, 1, null), Dp.KN((zQie ? 0.63f : 0.4f) * f3)), companion2.az());
                Brush.Companion companion4 = Brush.INSTANCE;
                if (zQie) {
                    R5.Wre wreRl = i28.rl();
                    if ((wreRl != null ? wreRl.Uo() : null) == null || i28.n()) {
                        pairArrA = aD.w6.eF();
                    }
                    BoxKt.n(BackgroundKt.rl(modifierN3, Brush.Companion.mUb(companion4, (Pair[]) Arrays.copyOf(pairArrA, pairArrA.length), 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null), composerKN, 0);
                } else {
                    pairArrA = aD.w6.a();
                    BoxKt.n(BackgroundKt.rl(modifierN3, Brush.Companion.mUb(companion4, (Pair[]) Arrays.copyOf(pairArrA, pairArrA.length), 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null), composerKN, 0);
                }
            }
            composerKN.Xw();
            Modifier modifierN4 = boxScopeInstance.n(SizeKt.KN(gh(companion, i28, z2, zQie), 0.0f, 1, null), companion2.rl());
            Alignment.Horizontal horizontalUo = companion2.Uo();
            Arrangement arrangement = Arrangement.f17400n;
            MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.n(), horizontalUo, composerKN, 54);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierN4);
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
            Updater.O(composerN2, measurePolicyN, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            SpacerKt.n(SizeKt.xMQ(companion, O(f3, z2, zQie)), composerKN, 0);
            composerKN.eF(-1910695000);
            if (enumC1982eOJ2 == enumC1982eO || enumC1982eOJ2 == EnumC1982eO.f64016O || !zQie) {
                String strT2 = StringResources_androidKt.t(2132019859, composerKN, 6);
                f4 = 0.0f;
                Modifier modifierT = columnScopeInstance.t(PaddingKt.gh(companion, Dp.KN(25), 0.0f, 2, null), companion2.Uo());
                H9N.j jVar2 = H9N.j.f3810n;
                long jT2 = jVar2.n(composerKN, 6).t();
                TextAlign textAlignKN = TextAlign.KN(TextAlign.INSTANCE.n());
                if (zQie) {
                    composerKN.eF(-1910677029);
                    textStyleO = jVar2.rl(composerKN, 6).nr();
                } else {
                    composerKN.eF(-1910675813);
                    textStyleO = jVar2.rl(composerKN, 6).O();
                }
                composerKN.Xw();
                TextKt.t(strT2, modifierT, jT2, 0L, null, null, null, 0L, null, textAlignKN, 0L, 0, false, 0, 0, null, textStyleO, composerKN, 0, 0, 65016);
            } else {
                f4 = 0.0f;
            }
            composerKN.Xw();
            Modifier modifierG = SizeKt.g(PaddingKt.gh(companion, Dp.KN(24), f4, 2, null), f4, Dp.KN(334), 1, null);
            MeasurePolicy measurePolicyN2 = ColumnKt.n(arrangement.n(), companion2.gh(), composerKN, 6);
            int iN3 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierG);
            Function0 function0N3 = companion3.n();
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
            Updater.O(composerN3, measurePolicyN2, companion3.t());
            Updater.O(composerN3, compositionLocalMapIk3, companion3.O());
            Function2 function2Rl3 = companion3.rl();
            if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                composerN3.o(Integer.valueOf(iN3));
                composerN3.az(Integer.valueOf(iN3), function2Rl3);
            }
            Updater.O(composerN3, modifierO3, companion3.nr());
            composerKN.eF(-1751313796);
            if (z2) {
                composerKN.eF(-1751312659);
                if (!zQie) {
                    SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(40)), composerKN, 6);
                }
                composerKN.Xw();
                mb8.fuX.mUb(i28.KN(), i28.Uo(), onSubscriptionClicked, composerKN, (i5 >> 15) & 896);
            }
            composerKN.Xw();
            int i7 = i5 >> 6;
            int i8 = i5 >> 12;
            mb8.QJ.az(enumC1982eOJ2, i28, onFreeTrialCheckboxClicked, zQie, composerKN, (i7 & 112) | (i8 & 896));
            float f6 = 16;
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f6)), composerKN, 6);
            o.o.t(i28.nr(), !i28.n(), onContinueButtonClicked, 0.0f, composerKN, i7 & 896, 8);
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f6)), composerKN, 6);
            if (i28.n()) {
                composerKN.eF(1545600534);
                o.Ml.t(onManageSubscriptionClicked, composerKN, (i5 >> 15) & 14);
                composerKN.Xw();
            } else {
                composerKN.eF(1544950774);
                if (enumC1982eOJ2 == EnumC1982eO.f64016O) {
                    composerKN.eF(1545008155);
                    eo.C.O(columnScopeInstance, StringResources_androidKt.t(2132019807, composerKN, 6), 0L, null, onOtherOptionsClicked, composerKN, 6 | (i8 & 57344), 6);
                    composerKN.Xw();
                } else {
                    composerKN.eF(1545260619);
                    AbstractC1969w6.t(Uo(i28.rl(), i28.nr(), false, false, composerKN, 0, 12), null, 0, 0, composerKN, 0, 14);
                    composerKN.Xw();
                }
                composerKN.Xw();
            }
            composerKN.XQ();
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f6)), composerKN, 6);
            composerKN.XQ();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: D.Wre
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return fuX.nr(PaywallMainContent, windowSizeClass, f3, i28, onContinueButtonClicked, onManageSubscriptionClicked, onFreeTrialCheckboxClicked, onSubscriptionClicked, onOtherOptionsClicked, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final String Uo(R5.Wre wre, boolean z2, boolean z3, boolean z4, Composer composer, int i2, int i3) {
        String strXMQ;
        Integer numUo;
        composer.eF(-1074450110);
        String str = null;
        if ((i3 & 2) != 0) {
            if (wre != null) {
                numUo = wre.Uo();
            } else {
                numUo = null;
            }
            if (numUo != null) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if ((i3 & 4) != 0) {
            z3 = false;
        }
        if ((i3 & 8) != 0) {
            z4 = false;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-1074450110, i2, -1, "com.alightcreative.monetization.ui.components.getPaywallPrice (PaywallMainContent.kt:235)");
        }
        composer.eF(779681485);
        if (wre == null) {
            strXMQ = null;
        } else if (wre.mUb() == null) {
            composer.eF(987735361);
            strXMQ = mUb(wre, z2, z3, composer, i2 & 1008);
            composer.Xw();
        } else {
            composer.eF(987893988);
            strXMQ = xMQ(wre, z2, composer, i2 & 112);
            composer.Xw();
        }
        composer.Xw();
        if (strXMQ != null) {
            composer.eF(779693585);
            Object objIF = composer.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: D.CN3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return fuX.KN((String) obj);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            str = (String) w9.Wre.n(strXMQ, z4, (Function1) objIF);
        }
        if (str == null) {
            str = "";
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final String mUb(R5.Wre wre, boolean z2, boolean z3, Composer composer, int i2) {
        String strQie;
        int i3;
        String strNr;
        composer.eF(1314932083);
        if (ComposerKt.v()) {
            ComposerKt.p5(1314932083, i2, -1, "com.alightcreative.monetization.ui.components.getPaywallPriceWithoutIntroductoryPeriod (PaywallMainContent.kt:328)");
        }
        if (z3) {
            strQie = wre.O();
        } else {
            String strNr2 = wre.nr();
            if (strNr2 != null) {
                strQie = "{line_through}" + wre.qie() + "{/line_through} " + strNr2;
                if (strQie == null) {
                    strQie = wre.qie();
                }
            }
        }
        if (wre.Uo() != null && z2) {
            composer.eF(-142973694);
            int i5 = j.$EnumSwitchMapping$0[wre.ty().getUnit().ordinal()];
            int i7 = 2132019438;
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 == 4) {
                        i7 = 2132019441;
                    }
                } else {
                    i7 = 2132019431;
                }
            }
            strNr = StringResources_androidKt.nr(i7, new Object[]{wre.Uo(), strQie}, composer, 0);
            composer.Xw();
        } else {
            composer.eF(-142427071);
            if (z3) {
                int i8 = j.$EnumSwitchMapping$0[wre.ty().getUnit().ordinal()];
                i3 = 2132019796;
                if (i8 != 2 && i8 == 4) {
                    i3 = 2132019797;
                }
            } else {
                int i9 = j.$EnumSwitchMapping$0[wre.ty().getUnit().ordinal()];
                i3 = 2132019437;
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 == 4) {
                            i3 = 2132019440;
                        }
                    } else {
                        i3 = 2132019430;
                    }
                }
            }
            strNr = StringResources_androidKt.nr(i3, new Object[]{strQie}, composer, 0);
            composer.Xw();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return strNr;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final String xMQ(R5.Wre wre, boolean z2, Composer composer, int i2) {
        String strNr;
        Pair pair;
        composer.eF(-1933469253);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1933469253, i2, -1, "com.alightcreative.monetization.ui.components.getPaywallPriceWithIntroductoryPeriod (PaywallMainContent.kt:256)");
        }
        if (wre.xMQ() != null && wre.KN() != null) {
            PurchasePeriod purchasePeriodTy = wre.ty();
            PurchasePeriod.Companion companion = PurchasePeriod.INSTANCE;
            int i3 = 2132019437;
            if (!Intrinsics.areEqual(purchasePeriodTy, companion.rl())) {
                if (Intrinsics.areEqual(purchasePeriodTy, companion.n())) {
                    i3 = 2132019430;
                } else if (Intrinsics.areEqual(purchasePeriodTy, companion.t())) {
                    i3 = 2132019440;
                }
            }
            String strNr2 = StringResources_androidKt.nr(i3, new Object[]{wre.qie()}, composer, 0);
            String strNr3 = StringResources_androidKt.nr(2132019421, new Object[]{wre.xMQ()}, composer, 6);
            int i5 = 2131886093;
            if (z2) {
                composer.eF(-1030183942);
                if (wre.Uo() != null) {
                    if (wre.Uo().intValue() % 7 == 0) {
                        pair = TuplesKt.to(Integer.valueOf(wre.Uo().intValue() / 7), 2131886095);
                    } else {
                        pair = TuplesKt.to(wre.Uo(), 2131886093);
                    }
                    int iIntValue = ((Number) pair.component1()).intValue();
                    strNr = StringResources_androidKt.nr(2132019422, new Object[]{StringResources_androidKt.rl(((Number) pair.component2()).intValue(), iIntValue, new Object[]{Integer.valueOf(iIntValue)}, composer, 0), strNr3}, composer, 6);
                    composer.Xw();
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                composer.eF(-1029446917);
                strNr = StringResources_androidKt.nr(2132019423, new Object[]{wre.qie(), strNr3}, composer, 6);
                composer.Xw();
            }
            int i7 = j.$EnumSwitchMapping$0[wre.KN().getUnit().ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 == 4) {
                            i5 = 2131886096;
                        }
                    } else {
                        i5 = 2131886094;
                    }
                } else {
                    i5 = 2131886095;
                }
            }
            String str = strNr + "\n{small}" + StringResources_androidKt.nr(2132019424, new Object[]{strNr2, StringResources_androidKt.rl(i5, wre.KN().getCount(), new Object[]{Integer.valueOf(wre.KN().getCount())}, composer, 0)}, composer, 6) + "{/small}";
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            composer.Xw();
            return str;
        }
        throw new IllegalStateException("Check failed.");
    }
}
