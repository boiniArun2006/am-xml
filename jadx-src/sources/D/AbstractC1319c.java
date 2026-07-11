package D;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.media3.exoplayer.RendererCapabilities;
import f.EnumC1982eO;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: D.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class AbstractC1319c {

    /* JADX INFO: renamed from: D.c$j */
    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC1982eO.values().length];
            try {
                iArr[EnumC1982eO.f64025t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1982eO.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1982eO.f64024r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC1982eO.f64019Z.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC1982eO.f64023o.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(BoxScope boxScope, EnumC1982eO enumC1982eO, WindowSizeClass windowSizeClass, float f3, float f4, int i2, Composer composer, int i3) {
        ty(boxScope, enumC1982eO, windowSizeClass, f3, f4, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void J2(Modifier modifier, Composer composer, final int i2, final int i3) {
        final Modifier modifier2;
        int i5;
        Composer composerKN = composer.KN(1369154652);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = i2 | (composerKN.p5(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i5 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            Modifier modifier3 = i7 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.v()) {
                ComposerKt.p5(1369154652, i5, -1, "com.alightcreative.monetization.ui.components.CountdownPaywallVisual (PaywallVisual.kt:103)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifier3);
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
            Painter painterT = PainterResources_androidKt.t(2131232076, composerKN, 6);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifier4 = modifier3;
            ImageKt.n(painterT, "Countdown paywall visual", SizeKt.KN(companion3, 0.0f, 1, null), null, ContentScale.INSTANCE.n(), 0.0f, null, composerKN, 25008, 104);
            Modifier modifierN = boxScopeInstance.n(SizeKt.xMQ(SizeKt.KN(companion3, 0.0f, 1, null), Dp.KN(72)), companion.rl());
            Brush.Companion companion4 = Brush.INSTANCE;
            Pair[] pairArrU = aD.w6.U();
            BoxKt.n(BackgroundKt.rl(modifierN, Brush.Companion.mUb(companion4, (Pair[]) Arrays.copyOf(pairArrU, pairArrU.length), 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null), composerKN, 0);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: D.Xo
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC1319c.Uo(modifier2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KN(final BoxScope PaywallDefaultVisual, Modifier modifier, final WindowSizeClass windowSizeClass, final float f3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        boolean zQie;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(PaywallDefaultVisual, "$this$PaywallDefaultVisual");
        Intrinsics.checkNotNullParameter(windowSizeClass, "windowSizeClass");
        Composer composerKN = composer.KN(1761352296);
        if ((i3 & Integer.MIN_VALUE) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(PaywallDefaultVisual) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i7 = i3 & 1;
        if (i7 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i3 & 2) == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.p5(windowSizeClass) ? 256 : 128;
            }
            if ((i3 & 4) == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= composerKN.rl(f3) ? 2048 : 1024;
            }
            if ((i5 & 1171) == 1170 || !composerKN.xMQ()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(1761352296, i5, -1, "com.alightcreative.monetization.ui.components.PaywallDefaultVisual (PaywallVisual.kt:57)");
                }
                zQie = WindowWidthSizeClass.qie(windowSizeClass.getWidthSizeClass(), WindowWidthSizeClass.INSTANCE.nr());
                Modifier modifierKN = SizeKt.KN(SizeKt.xMQ(modifier4, Dp.KN((!zQie ? 0.66f : 0.78f) * f3)), 0.0f, 1, null);
                Alignment.Companion companion = Alignment.INSTANCE;
                Modifier modifierN = PaywallDefaultVisual.n(modifierKN, companion.az());
                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), false);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0 function0N = companion2.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                    composerKN.r();
                } else {
                    composerKN.s7N(function0N);
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyUo, companion2.t());
                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                function2Rl = companion2.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion2.nr());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                Painter painterT = PainterResources_androidKt.t(2131232071, composerKN, 6);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierJ2 = SizeKt.J2(companion3, 0.0f, 1, null);
                ContentScale.Companion companion4 = ContentScale.INSTANCE;
                Modifier modifier5 = modifier4;
                ImageKt.n(painterT, null, modifierJ2, null, companion4.n(), 0.0f, null, composerKN, 25008, 104);
                Modifier modifierN2 = boxScopeInstance.n(companion3, companion.O());
                Painter painterT2 = PainterResources_androidKt.t(2131232070, composerKN, 6);
                if (!zQie) {
                    modifierN2 = SizeKt.XQ(modifierN2, DpKt.rl(Dp.KN(506), Dp.KN(468)));
                }
                ImageKt.n(painterT2, null, modifierN2, null, companion4.O(), 0.0f, null, composerKN, 24624, 104);
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier5;
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: D.l3D
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC1319c.xMQ(PaywallDefaultVisual, modifier3, windowSizeClass, f3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        modifier2 = modifier;
        if ((i3 & 2) == 0) {
        }
        if ((i3 & 4) == 0) {
        }
        if ((i5 & 1171) == 1170) {
            if (i7 == 0) {
            }
            if (ComposerKt.v()) {
            }
            zQie = WindowWidthSizeClass.qie(windowSizeClass.getWidthSizeClass(), WindowWidthSizeClass.INSTANCE.nr());
            Modifier modifierKN2 = SizeKt.KN(SizeKt.xMQ(modifier4, Dp.KN((!zQie ? 0.66f : 0.78f) * f3)), 0.0f, 1, null);
            Alignment.Companion companion5 = Alignment.INSTANCE;
            Modifier modifierN3 = PaywallDefaultVisual.n(modifierKN2, companion5.az());
            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion5.HI(), false);
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierN3);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0 function0N2 = companion22.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyUo2, companion22.t());
            Updater.O(composerN, compositionLocalMapIk2, companion22.O());
            function2Rl = companion22.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO2, companion22.nr());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                Painter painterT3 = PainterResources_androidKt.t(2131232071, composerKN, 6);
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierJ22 = SizeKt.J2(companion32, 0.0f, 1, null);
                ContentScale.Companion companion42 = ContentScale.INSTANCE;
                Modifier modifier52 = modifier4;
                ImageKt.n(painterT3, null, modifierJ22, null, companion42.n(), 0.0f, null, composerKN, 25008, 104);
                Modifier modifierN22 = boxScopeInstance2.n(companion32, companion5.O());
                Painter painterT22 = PainterResources_androidKt.t(2131232070, composerKN, 6);
                if (!zQie) {
                }
                ImageKt.n(painterT22, null, modifierN22, null, companion42.O(), 0.0f, null, composerKN, 24624, 104);
                composerKN.XQ();
                if (ComposerKt.v()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(Modifier modifier, int i2, int i3, Composer composer, int i5) {
        J2(modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(long j2, int i2, Composer composer, int i3) {
        qie(j2, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(Modifier modifier, int i2, int i3, Composer composer, int i5) {
        mUb(modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final void mUb(Modifier modifier, Composer composer, final int i2, final int i3) {
        final Modifier modifier2;
        int i5;
        Composer composerKN = composer.KN(-117594020);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = i2 | (composerKN.p5(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i5 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            Modifier modifier3 = i7 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.v()) {
                ComposerKt.p5(-117594020, i5, -1, "com.alightcreative.monetization.ui.components.PaywallOneTimeVisual (PaywallVisual.kt:124)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifier3);
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
            Painter painterT = PainterResources_androidKt.t(2131232073, composerKN, 6);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifier4 = modifier3;
            ImageKt.n(painterT, "One-time paywall visual", SizeKt.KN(companion3, 0.0f, 1, null), null, ContentScale.INSTANCE.n(), 0.0f, null, composerKN, 25008, 104);
            Modifier modifierN = boxScopeInstance.n(SizeKt.xMQ(SizeKt.KN(companion3, 0.0f, 1, null), Dp.KN(148)), companion.rl());
            Brush.Companion companion4 = Brush.INSTANCE;
            Pair[] pairArrNxk = aD.w6.Nxk();
            BoxKt.n(BackgroundKt.rl(modifierN, Brush.Companion.mUb(companion4, (Pair[]) Arrays.copyOf(pairArrNxk, pairArrNxk.length), 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null), composerKN, 0);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: D.eO
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC1319c.gh(modifier2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ty(BoxScope PaywallVisual, final EnumC1982eO paywallType, WindowSizeClass windowSizeClass, float f3, final float f4, Composer composer, final int i2) {
        int i3;
        BoxScope boxScope;
        float f5;
        final WindowSizeClass windowSizeClass2;
        Intrinsics.checkNotNullParameter(PaywallVisual, "$this$PaywallVisual");
        Intrinsics.checkNotNullParameter(paywallType, "paywallType");
        Intrinsics.checkNotNullParameter(windowSizeClass, "windowSizeClass");
        Composer composerKN = composer.KN(241660850);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(PaywallVisual) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(paywallType) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.p5(windowSizeClass) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.rl(f3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.rl(f4) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerKN.xMQ()) {
            composerKN.wTp();
            boxScope = PaywallVisual;
            f5 = f3;
            windowSizeClass2 = windowSizeClass;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(241660850, i3, -1, "com.alightcreative.monetization.ui.components.PaywallVisual (PaywallVisual.kt:35)");
            }
            int i5 = j.$EnumSwitchMapping$0[paywallType.ordinal()];
            if (i5 == 1) {
                boxScope = PaywallVisual;
                f5 = f3;
                windowSizeClass2 = windowSizeClass;
                composerKN.eF(-201404871);
                qie(DpKt.rl(f4, f5), composerKN, 0);
                composerKN.Xw();
            } else if (i5 == 2 || i5 == 3 || i5 == 4 || i5 == 5) {
                boxScope = PaywallVisual;
                f5 = f3;
                windowSizeClass2 = windowSizeClass;
                composerKN.eF(-201396880);
                composerKN.Xw();
            } else {
                composerKN.eF(-201396099);
                boxScope = PaywallVisual;
                f5 = f3;
                KN(boxScope, null, windowSizeClass, f5, composerKN, i3 & 8078, 1);
                windowSizeClass2 = windowSizeClass;
                composerKN.Xw();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            final BoxScope boxScope2 = boxScope;
            final float f6 = f5;
            scopeUpdateScopeGh.n(new Function2() { // from class: D.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC1319c.HI(boxScope2, paywallType, windowSizeClass2, f6, f4, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(BoxScope boxScope, Modifier modifier, WindowSizeClass windowSizeClass, float f3, int i2, int i3, Composer composer, int i5) {
        KN(boxScope, modifier, windowSizeClass, f3, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    private static final void qie(final long j2, Composer composer, final int i2) {
        int i3;
        int i5;
        Composer composerKN = composer.KN(-475320352);
        if ((i2 & 6) == 0) {
            if (composerKN.nr(j2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-475320352, i3, -1, "com.alightcreative.monetization.ui.components.PaywallPROVisual (PaywallVisual.kt:93)");
            }
            ImageKt.n(PainterResources_androidKt.t(2131232075, composerKN, 6), null, SizeKt.XQ(Modifier.INSTANCE, j2), null, ContentScale.INSTANCE.n(), 0.0f, null, composerKN, 24624, 104);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: D.QJ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC1319c.az(j2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
