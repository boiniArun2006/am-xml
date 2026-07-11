package Zd1;

import Dj7.CM;
import Dj7.QaP;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class M {

    static final class j implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f12411O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f12412n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f12413t;

        j(boolean z2, int i2, Function0 function0) {
            this.f12412n = z2;
            this.f12413t = i2;
            this.f12411O = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1279498286, i2, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PlayfulStartScreen.<anonymous> (PlayfulStartScreen.kt:63)");
            }
            Modifier modifierJ2 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null);
            int i3 = this.f12413t;
            Function0 function0 = this.f12411O;
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer, 0);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierJ2);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
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
            Updater.O(composerN, measurePolicyN, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            M.ty(composer, 0);
            M.gh(i3, function0, composer, 0);
            composer.XQ();
            D.I28.rl(0.9f, this.f12412n, composer, 6, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(int i2, Composer composer, int i3) {
        ty(composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ik(RowScope rowScope, int i2, Composer composer, int i3) {
        ck(rowScope, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(BoxWithConstraintsScope boxWithConstraintsScope, float f3, float f4, float f5, float f6, int i2, Composer composer, int i3) {
        Uo(boxWithConstraintsScope, f3, f4, f5, f6, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo(final BoxWithConstraintsScope boxWithConstraintsScope, final float f3, final float f4, final float f5, final float f6, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(1431498518);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(boxWithConstraintsScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.rl(f3) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.rl(f4) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.rl(f5) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.rl(f6) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1431498518, i3, -1, "com.alightcreative.monetization.ui.components.playfulunlock.Glow (PlayfulStartScreen.kt:134)");
            }
            Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
            float f7 = 2;
            BoxKt.n(BackgroundKt.rl(SizeKt.J2(boxWithConstraintsScope.n(Modifier.INSTANCE, Alignment.INSTANCE.HI()), 0.0f, 1, null), Brush.Companion.O(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.xMQ(Color.az(aD.w6.J(), f3, 0.0f, 0.0f, 0.0f, 14, null)), Color.xMQ(Color.INSTANCE.J2())}), Offset.O((((long) Float.floatToRawIntBits(density.l(Dp.KN(Dp.KN(boxWithConstraintsScope.nr() / f7) + f5)))) & 4294967295L) | (((long) Float.floatToRawIntBits(density.l(Dp.KN(Dp.KN(boxWithConstraintsScope.t() / f7) + f4)))) << 32)), density.l(f6), 0, 8, null), null, 0.0f, 6, null), composerKN, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Zd1.lej
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M.KN(boxWithConstraintsScope, f3, f4, f5, f6, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(int i2, Function0 function0, int i3, Composer composer, int i5) {
        gh(i2, function0, composer, RecomposeScopeImplKt.n(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gh(final int i2, final Function0 function0, Composer composer, final int i3) {
        int i5;
        Composer composer2;
        Composer composerKN = composer.KN(-1821792244);
        if ((i3 & 6) == 0) {
            i5 = (composerKN.t(i2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerKN.E2(function0) ? 32 : 16;
        }
        int i7 = i5;
        if ((i7 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1821792244, i7, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PlayfulStartScreenMainContent (PlayfulStartScreen.kt:170)");
            }
            ScrollState scrollStateT = ScrollKt.t(0, composerKN, 0, 1);
            Modifier.Companion companion = Modifier.INSTANCE;
            float f3 = 24;
            Modifier modifierAz = PaddingKt.az(PaddingKt.gh(SizeKt.J2(companion, 0.0f, 1, null), Dp.KN(f3), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, Dp.KN(f3), 7, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal horizontalUo = companion2.Uo();
            Arrangement arrangement = Arrangement.f17400n;
            MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.Uo(), horizontalUo, composerKN, 48);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierAz);
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
            Updater.O(composerN, measurePolicyN, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            Modifier modifierUo = ScrollKt.Uo(PaddingKt.az(ColumnScope.rl(ColumnScopeInstance.f17468n, companion, 1.0f, false, 2, null), 0.0f, 0.0f, 0.0f, Dp.KN(f3), 7, null), scrollStateT, false, null, false, 14, null);
            MeasurePolicy measurePolicyN2 = ColumnKt.n(arrangement.ty(Dp.KN(16)), companion2.Uo(), composerKN, 54);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierUo);
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
            Updater.O(composerN2, measurePolicyN2, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            String strNr = StringResources_androidKt.nr(2132019877, new Object[]{Integer.valueOf(i2)}, composerKN, 6);
            H9N.j jVar = H9N.j.f3810n;
            TextStyle textStyleNr = jVar.rl(composerKN, 6).nr();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            CM.xMQ(strNr, null, 0L, TextAlign.KN(companion4.n()), textStyleNr, CollectionsKt.listOf(new QaP("green", new P0j.Dsr(false, false, false, false, false, Color.xMQ(aD.w6.Y()), 0L, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, null))), composerKN, 0, 6);
            TextKt.t(StringResources_androidKt.nr(2132019878, new Object[]{Integer.valueOf(i2)}, composerKN, 6), null, 0L, 0L, null, null, null, 0L, null, TextAlign.KN(companion4.n()), 0L, 0, false, 0, 0, null, jVar.rl(composerKN, 6).xMQ(), composerKN, 0, 0, 65022);
            composerKN.XQ();
            composerKN.eF(-467365623);
            boolean z2 = (i7 & 112) == 32;
            Object objIF = composerKN.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: Zd1.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return M.qie(function0);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            composer2 = composerKN;
            Dj7.eO.J2((Function0) objIF, StringResources_androidKt.t(2132019876, composerKN, 6), SizeKt.KN(companion, 0.0f, 1, null), null, Dj7.CN3.f1599r, null, 0, 0, 0.0f, null, null, null, false, composer2, 24960, 0, 8168);
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Zd1.qf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M.az(i2, function0, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(int i2, Function0 function0, boolean z2, int i3, Composer composer, int i5) {
        xMQ(i2, function0, z2, composer, RecomposeScopeImplKt.n(i3 | 1));
        return Unit.INSTANCE;
    }

    public static final void xMQ(final int i2, final Function0 onPlayNowClicked, final boolean z2, Composer composer, final int i3) {
        int i5;
        Intrinsics.checkNotNullParameter(onPlayNowClicked, "onPlayNowClicked");
        Composer composerKN = composer.KN(1416268174);
        if ((i3 & 6) == 0) {
            i5 = (composerKN.t(i2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerKN.E2(onPlayNowClicked) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.n(z2) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1416268174, i5, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PlayfulStartScreen (PlayfulStartScreen.kt:55)");
            }
            Modifier modifierT = WindowInsetsPadding_androidKt.t(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null));
            H9N.j jVar = H9N.j.f3810n;
            SurfaceKt.n(modifierT, null, jVar.n(composerKN, 6).rl(), jVar.n(composerKN, 6).t(), null, 0.0f, ComposableLambdaKt.nr(-1279498286, true, new j(z2, i2, onPlayNowClicked), composerKN, 54), composerKN, 1572864, 50);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Zd1.DAz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M.mUb(i2, onPlayNowClicked, z2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ck(final RowScope rowScope, Composer composer, final int i2) {
        int i3;
        int i5;
        Composer composerKN = composer.KN(408521278);
        if ((i2 & 6) == 0) {
            if (composerKN.p5(rowScope)) {
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
                ComposerKt.p5(408521278, i3, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PresentBox (PlayfulStartScreen.kt:157)");
            }
            ImageKt.n(PainterResources_androidKt.t(2131232074, composerKN, 6), "Present box", RowScope.rl(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), null, ContentScale.INSTANCE.O(), 0.0f, null, composerKN, 24624, 104);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Zd1.iwV
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M.Ik(rowScope, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ty(Composer composer, final int i2) {
        Composer composerKN = composer.KN(2073538573);
        if (i2 == 0 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(2073538573, i2, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PlayfulStartVisual (PlayfulStartScreen.kt:80)");
            }
            BoxWithConstraintsKt.n(SizeKt.KN(SizeKt.t(Modifier.INSTANCE, 0.5f), 0.0f, 1, null), null, false, Zd1.j.f12506n.n(), composerKN, 3078, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Zd1.Ln
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M.HI(i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
