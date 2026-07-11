package mb8;

import R5.Ml;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import eo.AbstractC1969w6;
import f.EnumC1982eO;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class QJ {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC1982eO.values().length];
            try {
                iArr[EnumC1982eO.f64016O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1982eO.f64025t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1982eO.f64023o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(EnumC1982eO enumC1982eO, Ml.j.C0297j c0297j, Function0 function0, boolean z2, int i2, Composer composer, int i3) {
        qie(enumC1982eO, c0297j, function0, z2, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void J2(final Ml.j.I28 viewState, final Function0 onFreeTrialCheckboxClicked, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onFreeTrialCheckboxClicked, "onFreeTrialCheckboxClicked");
        Composer composerKN = composer.KN(-1474581458);
        if ((i2 & 6) == 0) {
            i3 = i2 | (composerKN.E2(viewState) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onFreeTrialCheckboxClicked) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1474581458, i3, -1, "com.alightcreative.monetization.ui.components.switches.ComparisonFreeTrial (PaywallFreeTrialTypes.kt:108)");
            }
            R5.Wre wreRl = viewState.rl();
            if ((wreRl != null ? wreRl.Uo() : null) != null && !viewState.n()) {
                Modifier.Companion companion = Modifier.INSTANCE;
                SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(16)), composerKN, 6);
                Q.xMQ(viewState.nr(), onFreeTrialCheckboxClicked, SizeKt.KN(companion, 0.0f, 1, null), aD.w6.M7(), Color.az(aD.w6.M7(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), aD.w6.dR0(), 0, 0, 0, composerKN, (i3 & 112) | 224640, 448);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: mb8.Xo
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QJ.Uo(viewState, onFreeTrialCheckboxClicked, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void KN(final Ml.j jVar, final boolean z2, final Function0 function0, final boolean z3, Composer composer, final int i2) {
        int i3;
        boolean z4;
        Function0 function02;
        Composer composerKN = composer.KN(1086534255);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(jVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            z4 = z2;
            i3 |= composerKN.n(z4) ? 32 : 16;
        } else {
            z4 = z2;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function02 = function0;
            i3 |= composerKN.E2(function02) ? 256 : 128;
        } else {
            function02 = function0;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.n(z3) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1086534255, i3, -1, "com.alightcreative.monetization.ui.components.switches.DefaultFreeTrial (PaywallFreeTrialTypes.kt:64)");
            }
            boolean z5 = jVar instanceof Ml.j.C0297j;
            Modifier.Companion companion = Modifier.INSTANCE;
            SpacerKt.n(SizeKt.xMQ(companion, z5 ? Dp.KN(24) : z3 ? Dp.KN(48) : Dp.KN(64)), composerKN, 0);
            R5.Wre wreRl = jVar.rl();
            if ((wreRl != null ? wreRl.Uo() : null) == null || jVar.n()) {
                composerKN.eF(-145505508);
                SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(z5 ? 32 : 8)), composerKN, 0);
                composerKN.Xw();
            } else {
                composerKN.eF(-145712123);
                int i5 = i3 >> 3;
                Q.xMQ(z4, function02, SizeKt.KN(companion, 0.0f, 1, null), 0L, 0L, 0L, 0, 0, 0, composerKN, (i5 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i5 & 112), 504);
                composerKN.Xw();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: mb8.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QJ.xMQ(jVar, z2, function0, z3, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(Ml.j.I28 i28, Function0 function0, int i2, Composer composer, int i3) {
        J2(i28, function0, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void az(final EnumC1982eO paywallType, Ml.j.I28 viewState, Function0 onFreeTrialCheckboxClicked, boolean z2, Composer composer, final int i2) {
        int i3;
        boolean z3;
        final Function0 function0;
        final Ml.j.I28 i28;
        Intrinsics.checkNotNullParameter(paywallType, "paywallType");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onFreeTrialCheckboxClicked, "onFreeTrialCheckboxClicked");
        Composer composerKN = composer.KN(362704087);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(paywallType) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(viewState) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onFreeTrialCheckboxClicked) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.n(z2) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
            z3 = z2;
            function0 = onFreeTrialCheckboxClicked;
            i28 = viewState;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(362704087, i3, -1, "com.alightcreative.monetization.ui.components.switches.PaywallFreeTrial (PaywallFreeTrialTypes.kt:21)");
            }
            int i5 = j.$EnumSwitchMapping$0[paywallType.ordinal()];
            if (i5 == 1) {
                z3 = z2;
                function0 = onFreeTrialCheckboxClicked;
                i28 = viewState;
                composerKN.eF(-1879682330);
                mUb(i28, function0, composerKN, (i3 >> 3) & 126);
                composerKN.Xw();
            } else if (i5 != 2) {
                composerKN.eF(-1879671643);
                z3 = z2;
                KN(viewState, viewState.nr(), onFreeTrialCheckboxClicked, z3, composerKN, ((i3 >> 3) & 14) | (i3 & 896) | (i3 & 7168));
                i28 = viewState;
                function0 = onFreeTrialCheckboxClicked;
                composerKN.Xw();
            } else {
                z3 = z2;
                function0 = onFreeTrialCheckboxClicked;
                i28 = viewState;
                composerKN.eF(-1879676572);
                J2(i28, function0, composerKN, (i3 >> 3) & 126);
                composerKN.Xw();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            final boolean z4 = z3;
            scopeUpdateScopeGh.n(new Function2() { // from class: mb8.qz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QJ.ty(paywallType, i28, function0, z4, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(Ml.j.I28 i28, Function0 function0, int i2, Composer composer, int i3) {
        mUb(i28, function0, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void mUb(final Ml.j.I28 viewState, final Function0 onFreeTrialCheckboxClicked, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onFreeTrialCheckboxClicked, "onFreeTrialCheckboxClicked");
        Composer composerKN = composer.KN(-716692333);
        if ((i2 & 6) == 0) {
            i3 = i2 | (composerKN.E2(viewState) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onFreeTrialCheckboxClicked) ? 32 : 16;
        }
        int i5 = i3;
        if ((i5 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-716692333, i5, -1, "com.alightcreative.monetization.ui.components.switches.OtherOptionsFreeTrial (PaywallFreeTrialTypes.kt:90)");
            }
            R5.Wre wreRl = viewState.rl();
            boolean z2 = ((wreRl != null ? wreRl.Uo() : null) == null || viewState.n()) ? false : true;
            Modifier.Companion companion = Modifier.INSTANCE;
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(z2 ? 16 : 48)), composerKN, 0);
            AbstractC1969w6.t(D.fuX.Uo(viewState.rl(), viewState.nr(), false, false, composerKN, 0, 12), null, 0, 0, composerKN, 0, 14);
            if (z2) {
                SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(16)), composerKN, 6);
                Q.xMQ(viewState.nr(), onFreeTrialCheckboxClicked, SizeKt.KN(companion, 0.0f, 1, null), 0L, 0L, 0L, 0, 0, 0, composerKN, (i5 & 112) | RendererCapabilities.DECODER_SUPPORT_MASK, 504);
                composerKN = composerKN;
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: mb8.Pl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QJ.gh(viewState, onFreeTrialCheckboxClicked, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void qie(final EnumC1982eO paywallType, Ml.j.C0297j viewState, Function0 onFreeTrialCheckboxClicked, boolean z2, Composer composer, final int i2) {
        int i3;
        final Ml.j.C0297j c0297j;
        final Function0 function0;
        final boolean z3;
        Intrinsics.checkNotNullParameter(paywallType, "paywallType");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onFreeTrialCheckboxClicked, "onFreeTrialCheckboxClicked");
        Composer composerKN = composer.KN(-538492741);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(paywallType) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(viewState) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onFreeTrialCheckboxClicked) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.n(z2) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
            z3 = z2;
            function0 = onFreeTrialCheckboxClicked;
            c0297j = viewState;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-538492741, i3, -1, "com.alightcreative.monetization.ui.components.switches.PaywallFreeTrial (PaywallFreeTrialTypes.kt:46)");
            }
            if (j.$EnumSwitchMapping$0[paywallType.ordinal()] == 3) {
                composerKN.eF(-1879656057);
                SpacerKt.n(SizeKt.xMQ(Modifier.INSTANCE, Dp.KN(48)), composerKN, 6);
                composerKN.Xw();
                z3 = z2;
                function0 = onFreeTrialCheckboxClicked;
                c0297j = viewState;
            } else {
                composerKN.eF(-1879654011);
                KN(viewState, viewState.t(), onFreeTrialCheckboxClicked, z2, composerKN, ((i3 >> 3) & 14) | (i3 & 896) | (i3 & 7168));
                c0297j = viewState;
                function0 = onFreeTrialCheckboxClicked;
                z3 = z2;
                composerKN.Xw();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: mb8.eO
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QJ.HI(paywallType, c0297j, function0, z3, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ty(EnumC1982eO enumC1982eO, Ml.j.I28 i28, Function0 function0, boolean z2, int i2, Composer composer, int i3) {
        az(enumC1982eO, i28, function0, z2, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(Ml.j jVar, boolean z2, Function0 function0, boolean z3, int i2, Composer composer, int i3) {
        KN(jVar, z2, function0, z3, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
