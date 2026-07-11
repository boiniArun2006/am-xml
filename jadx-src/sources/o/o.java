package o;

import Dj7.eO;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class o {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(boolean z2, boolean z3, Function0 function0, float f3, int i2, int i3, Composer composer, int i5) {
        t(z2, z3, function0, f3, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final boolean z2, final boolean z3, final Function0 onClicked, float f3, Composer composer, final int i2, final int i3) {
        int i5;
        float fRl;
        boolean z4;
        Object objIF;
        final float f4;
        Intrinsics.checkNotNullParameter(onClicked, "onClicked");
        Composer composerKN = composer.KN(1970461267);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.n(z3) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onClicked) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                fRl = f3;
                int i7 = composerKN.rl(fRl) ? 2048 : 1024;
                i5 |= i7;
            } else {
                fRl = f3;
            }
            i5 |= i7;
        } else {
            fRl = f3;
        }
        if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
            f4 = fRl;
        } else {
            composerKN.e();
            if ((i2 & 1) == 0 || composerKN.rV9()) {
                if ((i3 & 8) != 0) {
                    fRl = Dj7.fuX.rl(Dj7.CN3.f1599r, false, composerKN, 6, 1);
                    i5 &= -7169;
                }
                float f5 = fRl;
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(1970461267, i5, -1, "com.alightcreative.monetization.ui.components.buttons.PaywallContinueButton (PaywallContinueButton.kt:27)");
                }
                String strT = StringResources_androidKt.t(z3 ? 2132019436 : z2 ? 2132019853 : 2132019426, composerKN, 0);
                Modifier modifierKN = SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null);
                Dj7.CN3 cn3 = Dj7.CN3.f1599r;
                composerKN.eF(1167305287);
                z4 = (i5 & 896) == 256;
                objIF = composerKN.iF();
                if (!z4 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: o.aC
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.nr(onClicked);
                        }
                    };
                    composerKN.o(objIF);
                }
                composerKN.Xw();
                eO.J2((Function0) objIF, strT, modifierKN, null, cn3, null, 0, 0, f5, null, null, null, z3, composerKN, ((i5 << 15) & 234881024) | 24960, (i5 << 3) & 896, 3816);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                f4 = f5;
            } else {
                composerKN.wTp();
                if ((i3 & 8) != 0) {
                    i5 &= -7169;
                }
                float f53 = fRl;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                String strT2 = StringResources_androidKt.t(z3 ? 2132019436 : z2 ? 2132019853 : 2132019426, composerKN, 0);
                Modifier modifierKN2 = SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null);
                Dj7.CN3 cn32 = Dj7.CN3.f1599r;
                composerKN.eF(1167305287);
                if ((i5 & 896) == 256) {
                }
                objIF = composerKN.iF();
                if (!z4) {
                    objIF = new Function0() { // from class: o.aC
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.nr(onClicked);
                        }
                    };
                    composerKN.o(objIF);
                    composerKN.Xw();
                    eO.J2((Function0) objIF, strT2, modifierKN2, null, cn32, null, 0, 0, f53, null, null, null, z3, composerKN, ((i5 << 15) & 234881024) | 24960, (i5 << 3) & 896, 3816);
                    if (ComposerKt.v()) {
                    }
                    f4 = f53;
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: o.C
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return o.O(z2, z3, onClicked, f4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
