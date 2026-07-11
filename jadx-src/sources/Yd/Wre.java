package Yd;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Wre {

    static final class j implements Function3 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f12199O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ R7M.j f12200n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ TextStyle f12201t;

        j(R7M.j jVar, TextStyle textStyle, String str) {
            this.f12200n = jVar;
            this.f12201t = textStyle;
            this.f12199O = str;
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
                ComposerKt.p5(2000504823, i2, -1, "com.bendingspoons.legal.privacy.ui.internal.PrivacyButton.<anonymous> (PrivacyButton.kt:58)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierKN = PaddingKt.KN(BackgroundKt.rl(ClipKt.n(SizeKt.J2(companion, 0.0f, 1, null), this.f12200n.J2()), this.f12200n.rl(), null, 0.0f, 6, null), this.f12200n.nr());
            Alignment alignmentO = Alignment.INSTANCE.O();
            TextStyle textStyle = this.f12201t;
            String str = this.f12199O;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierKN);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
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
            Updater.O(composerN, measurePolicyUo, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            TextKt.t(str, SizeKt.KN(companion, 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.t(textStyle, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.n(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composer, 48, 0, 65532);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final String text, final R7M.j buttonStyle, final TextStyle textStyle, Modifier modifier, final Function0 onClick, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerKN = composer.KN(1401392135);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(text) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(buttonStyle) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(textStyle) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i5 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i5 |= composerKN.E2(onClick) ? 16384 : 8192;
            }
            if ((i5 & 9363) == 9362 || !composerKN.xMQ()) {
                if (i7 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(1401392135, i5, -1, "com.bendingspoons.legal.privacy.ui.internal.PrivacyButton (PrivacyButton.kt:46)");
                }
                Modifier modifier4 = modifier2;
                ButtonColors buttonColorsRl = ButtonDefaults.f24588n.rl(Color.INSTANCE.J2(), buttonStyle.t(), 0L, 0L, composerKN, (ButtonDefaults.HI << 12) | 6, 12);
                PaddingValues paddingValuesT = PaddingKt.t(0.0f, 0.0f, 3, null);
                ButtonKt.n(onClick, PaddingKt.KN(modifier4, buttonStyle.O()), false, buttonStyle.J2(), buttonColorsRl, null, buttonStyle.n(), paddingValuesT, null, ComposableLambdaKt.nr(2000504823, true, new j(buttonStyle, textStyle, text), composerKN, 54), composerKN, ((i5 >> 12) & 14) | 817889280, 292);
                composer2 = composerKN;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier4;
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
                composer2 = composerKN;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: Yd.I28
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Wre.t(text, buttonStyle, textStyle, modifier3, onClick, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 3072;
        modifier2 = modifier;
        if ((i3 & 16) == 0) {
        }
        if ((i5 & 9363) == 9362) {
            if (i7 != 0) {
            }
            if (ComposerKt.v()) {
            }
            Modifier modifier42 = modifier2;
            ButtonColors buttonColorsRl2 = ButtonDefaults.f24588n.rl(Color.INSTANCE.J2(), buttonStyle.t(), 0L, 0L, composerKN, (ButtonDefaults.HI << 12) | 6, 12);
            PaddingValues paddingValuesT2 = PaddingKt.t(0.0f, 0.0f, 3, null);
            ButtonKt.n(onClick, PaddingKt.KN(modifier42, buttonStyle.O()), false, buttonStyle.J2(), buttonColorsRl2, null, buttonStyle.n(), paddingValuesT2, null, ComposableLambdaKt.nr(2000504823, true, new j(buttonStyle, textStyle, text), composerKN, 54), composerKN, ((i5 >> 12) & 14) | 817889280, 292);
            composer2 = composerKN;
            if (ComposerKt.v()) {
            }
            modifier3 = modifier42;
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(String str, R7M.j jVar, TextStyle textStyle, Modifier modifier, Function0 function0, int i2, int i3, Composer composer, int i5) {
        rl(str, jVar, textStyle, modifier, function0, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }
}
