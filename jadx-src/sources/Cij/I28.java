package Cij;

import Cij.I28;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.media3.exoplayer.RendererCapabilities;
import com.google.android.exoplayer2.C;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class I28 {

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f1001n;

        public final void rl(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1439001626, i2, -1, "com.bendingspoons.forceupdater.internal.ForceUpdateDialog.<anonymous> (ForceUpdateDialog.kt:35)");
            }
            composer.eF(466936471);
            boolean zP5 = composer.p5(this.f1001n);
            final Function0 function0 = this.f1001n;
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: Cij.Ml
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return I28.j.t(function0);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            ButtonKt.n((Function0) objIF, null, false, null, null, null, null, null, null, Cij.j.f1006n.n(), composer, C.ENCODING_PCM_32BIT, 510);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        j(Function0 function0) {
            this.f1001n = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    static final class n implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f1002n;

        public final void rl(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1100714076, i2, -1, "com.bendingspoons.forceupdater.internal.ForceUpdateDialog.<anonymous> (ForceUpdateDialog.kt:25)");
            }
            final Function0 function0 = this.f1002n;
            if (function0 != null) {
                composer.eF(1979081720);
                boolean zP5 = composer.p5(function0);
                Object objIF = composer.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: Cij.Wre
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return I28.n.t(function0);
                        }
                    };
                    composer.o(objIF);
                }
                composer.Xw();
                ButtonKt.nr((Function0) objIF, null, false, null, null, null, null, null, null, Cij.j.f1006n.rl(), composer, C.ENCODING_PCM_32BIT, 510);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        n(Function0 function0) {
            this.f1002n = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Modifier modifier, Function0 function0, Function0 function02, int i2, int i3, Composer composer, int i5) {
        t(modifier, function0, function02, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final void t(Modifier modifier, final Function0 function0, final Function0 onClick, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerKN = composer.KN(-951674066);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(function0) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onClick) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i7 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.v()) {
                ComposerKt.p5(-951674066, i5, -1, "com.bendingspoons.forceupdater.internal.ForceUpdateDialog (ForceUpdateDialog.kt:17)");
            }
            composerKN.eF(882743766);
            boolean z2 = (i5 & 112) == 32;
            Object objIF = composerKN.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: Cij.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return I28.nr(function0);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(-1439001626, true, new j(onClick), composerKN, 54);
            ComposableLambda composableLambdaNr2 = ComposableLambdaKt.nr(-1100714076, true, new n(function0), composerKN, 54);
            Cij.j jVar = Cij.j.f1006n;
            int i8 = ((i5 << 6) & 896) | 1772592;
            composer2 = composerKN;
            Modifier modifier5 = modifier4;
            AndroidAlertDialog_androidKt.n((Function0) objIF, composableLambdaNr, modifier5, composableLambdaNr2, null, jVar.t(), jVar.nr(), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, i8, 0, 16272);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Cij.w6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return I28.O(modifier3, function0, onClick, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
