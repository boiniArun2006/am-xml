package r4;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class aC {

    static final class j implements Function2 {
        final /* synthetic */ Function0 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f72787O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Modifier f72788n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ E14.n f72789t;

        j(Modifier modifier, E14.n nVar, Function0 function0, Function0 function02) {
            this.f72788n = modifier;
            this.f72789t = nVar;
            this.f72787O = function0;
            this.J2 = function02;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            long jQie;
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1741338565, i2, -1, "com.bendingspoons.secretmenu.ui.mainscreen.compose.SecretMenuScreenHeader.<anonymous> (SecretMenuScreenHeader.kt:40)");
            }
            Modifier modifierXMQ = PaddingKt.xMQ(SizeKt.KN(this.f72788n, 0.0f, 1, null), Dp.KN(8));
            Arrangement.HorizontalOrVertical horizontalOrVerticalNr = Arrangement.f17400n.nr();
            E14.n nVar = this.f72789t;
            Function0 function0 = this.f72787O;
            Function0 function02 = this.J2;
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalNr, companion.qie(), composer, 6);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierXMQ);
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
            Updater.O(composerN, measurePolicyRl, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            composer.eF(1025252339);
            if (nVar.n()) {
                aC.O(rowScopeInstance, ArrowBackKt.n(Icons.AutoMirrored.Filled.f23857n), function0, composer, 6);
            }
            composer.Xw();
            int length = nVar.rl().length();
            if (20 <= length && length <= Integer.MAX_VALUE) {
                composer.eF(1025267464);
                jQie = MaterialTheme.f26164n.t(composer, MaterialTheme.rl).getBodyLarge().qie();
                composer.Xw();
            } else if (10 > length || length >= 20) {
                composer.eF(1025272264);
                jQie = MaterialTheme.f26164n.t(composer, MaterialTheme.rl).getHeadlineMedium().qie();
                composer.Xw();
            } else {
                composer.eF(1025269928);
                jQie = MaterialTheme.f26164n.t(composer, MaterialTheme.rl).getHeadlineSmall().qie();
                composer.Xw();
            }
            Modifier modifierT = rowScopeInstance.t(rowScopeInstance.n(Modifier.INSTANCE, 1.0f, true), companion.xMQ());
            int iN2 = TextAlign.INSTANCE.n();
            TextKt.t(nVar.rl(), modifierT, Color.INSTANCE.n(), jQie, null, null, null, 0L, null, TextAlign.KN(iN2), 0L, 0, false, 0, 0, null, TextStyle.t(MaterialTheme.f26164n.t(composer, MaterialTheme.rl).getHeadlineMedium(), 0L, 0L, FontWeight.INSTANCE.n(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65008);
            aC.O(rowScopeInstance, CloseKt.n(Icons.Filled.f23862n), function02, composer, 6);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class n implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ImageVector f72790n;

        n(ImageVector imageVector) {
            this.f72790n = imageVector;
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
                ComposerKt.p5(-1824990246, i2, -1, "com.bendingspoons.secretmenu.ui.mainscreen.compose.SimpleButton.<anonymous> (SecretMenuScreenHeader.kt:95)");
            }
            IconKt.nr(this.f72790n, null, null, 0L, composer, 48, 12);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(RowScope rowScope, ImageVector imageVector, Function0 function0, int i2, Composer composer, int i3) {
        O(rowScope, imageVector, function0, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(final RowScope rowScope, final ImageVector imageVector, final Function0 function0, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(761185738);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(rowScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(imageVector) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(function0) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(761185738, i3, -1, "com.bendingspoons.secretmenu.ui.mainscreen.compose.SimpleButton (SecretMenuScreenHeader.kt:85)");
            }
            Modifier modifierT = rowScope.t(Modifier.INSTANCE, Alignment.INSTANCE.xMQ());
            ButtonDefaults buttonDefaults = ButtonDefaults.f24588n;
            Color.Companion companion = Color.INSTANCE;
            ButtonKt.n(function0, modifierT, false, null, buttonDefaults.rl(companion.KN(), companion.n(), 0L, 0L, composerKN, (ButtonDefaults.HI << 12) | 54, 12), null, null, PaddingKt.n(Dp.KN(4)), null, ComposableLambdaKt.nr(-1824990246, true, new n(imageVector), composerKN, 54), composerKN, ((i3 >> 6) & 14) | 817889280, 364);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: r4.Dsr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return aC.J2(rowScope, imageVector, function0, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(Modifier modifier, E14.n nVar, Function0 function0, Function0 function02, int i2, int i3, Composer composer, int i5) {
        t(modifier, nVar, function0, function02, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final void t(Modifier modifier, final E14.n state, final Function0 onBackClicked, final Function0 onCloseClicked, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        Composer composerKN = composer.KN(16330624);
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
            i5 |= composerKN.E2(onBackClicked) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(onCloseClicked) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i7 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.v()) {
                ComposerKt.p5(16330624, i5, -1, "com.bendingspoons.secretmenu.ui.mainscreen.compose.SecretMenuScreenHeader (SecretMenuScreenHeader.kt:35)");
            }
            Modifier modifier5 = modifier4;
            composer2 = composerKN;
            SurfaceKt.n(null, null, Color.INSTANCE.KN(), 0L, 0.0f, Dp.KN(4), null, ComposableLambdaKt.nr(1741338565, true, new j(modifier4, state, onBackClicked, onCloseClicked), composerKN, 54), composer2, 12779904, 91);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: r4.fuX
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return aC.nr(modifier3, state, onBackClicked, onCloseClicked, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
