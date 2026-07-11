package r4;

import E14.j;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowRightKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ListItemKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class w6 {

    static final class Ml implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ E14.w6 f72802n;

        Ml(E14.w6 w6Var) {
            this.f72802n = w6Var;
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
                ComposerKt.p5(-1916587825, i2, -1, "com.bendingspoons.secretmenu.ui.mainscreen.compose.SecretMenuItem.<anonymous> (SecretMenuItem.kt:29)");
            }
            E14.j jVarN = this.f72802n.n();
            if (jVarN instanceof j.C0078j) {
                composer.eF(-42160860);
                ((j.C0078j) jVarN).n().invoke(composer, 0);
                composer.Xw();
            } else if (Intrinsics.areEqual(jVarN, j.n.f2244n)) {
                composer.eF(-1306930331);
                composer.Xw();
            } else {
                if (!Intrinsics.areEqual(jVarN, j.w6.f2245n)) {
                    composer.eF(-42163719);
                    composer.Xw();
                    throw new NoWhenBranchMatchedException();
                }
                composer.eF(-1306870067);
                IconKt.nr(KeyboardArrowRightKt.n(Icons.AutoMirrored.Rounded.f23859n), "", null, 0L, composer, 48, 12);
                composer.Xw();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f72803n;

        j(String str) {
            this.f72803n = str;
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
                ComposerKt.p5(-230385973, i2, -1, "com.bendingspoons.secretmenu.ui.mainscreen.compose.SecretMenuItem.<anonymous>.<anonymous> (SecretMenuItem.kt:25)");
            }
            TextKt.t(this.f72803n, null, Color.INSTANCE.t(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class n implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ E14.w6 f72804n;

        n(E14.w6 w6Var) {
            this.f72804n = w6Var;
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
                ComposerKt.p5(1424000692, i2, -1, "com.bendingspoons.secretmenu.ui.mainscreen.compose.SecretMenuItem.<anonymous> (SecretMenuItem.kt:23)");
            }
            TextKt.t(this.f72804n.O(), null, Color.INSTANCE.n(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: renamed from: r4.w6$w6, reason: collision with other inner class name */
    static final class C1148w6 implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ E14.w6 f72805n;

        C1148w6(E14.w6 w6Var) {
            this.f72805n = w6Var;
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
                ComposerKt.p5(1328510256, i2, -1, "com.bendingspoons.secretmenu.ui.mainscreen.compose.SecretMenuItem.<anonymous> (SecretMenuItem.kt:27)");
            }
            TextKt.t(this.f72805n.t(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Modifier modifier, E14.w6 w6Var, Function0 function0, int i2, int i3, Composer composer, int i5) {
        t(modifier, w6Var, function0, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final void t(Modifier modifier, final E14.w6 state, final Function0 onItemClicked, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onItemClicked, "onItemClicked");
        Composer composerKN = composer.KN(1474218706);
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
            i5 |= composerKN.p5(state) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onItemClicked) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i7 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.v()) {
                ComposerKt.p5(1474218706, i5, -1, "com.bendingspoons.secretmenu.ui.mainscreen.compose.SecretMenuItem (SecretMenuItem.kt:20)");
            }
            composerKN.eF(9101807);
            boolean z2 = (i5 & 896) == 256;
            Object objIF = composerKN.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: r4.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return w6.nr(onItemClicked);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            Modifier modifierJ2 = ClickableKt.J2(modifier4, false, null, null, (Function0) objIF, 7, null);
            Modifier modifier5 = modifier4;
            String strRl = state.rl();
            composerKN.eF(9106488);
            ComposableLambda composableLambdaNr = strRl == null ? null : ComposableLambdaKt.nr(-230385973, true, new j(strRl), composerKN, 54);
            composerKN.Xw();
            ListItemKt.n(ComposableLambdaKt.nr(1424000692, true, new n(state), composerKN, 54), modifierJ2, null, composableLambdaNr, ComposableLambdaKt.nr(1328510256, true, new C1148w6(state), composerKN, 54), ComposableLambdaKt.nr(-1916587825, true, new Ml(state), composerKN, 54), null, 0.0f, 0.0f, composerKN, 221190, 452);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: r4.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w6.O(modifier3, state, onItemClicked, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
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
