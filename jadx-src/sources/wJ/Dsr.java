package wJ;

import Dj7.eO;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Dsr {

    /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {
        j(Object obj) {
            super(0, obj, N.Dsr.class, "hide", "hide()V", 0);
        }

        public final void n() {
            ((N.Dsr) this.receiver).rl();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    static final class n implements Function2 {
        final /* synthetic */ Function0 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f74895O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Modifier f74896n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function0 f74897r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f74898t;

        static final class j implements Function2 {
            final /* synthetic */ Function0 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Function0 f74899O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f74900n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f74901t;

            j(String str, String str2, Function0 function0, Function0 function02) {
                this.f74900n = str;
                this.f74901t = str2;
                this.f74899O = function0;
                this.J2 = function02;
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
                    ComposerKt.p5(1426892903, i2, -1, "com.alightcreative.monetization.ui.components.dialogs.PaywallDialogContent.<anonymous>.<anonymous> (PaywallDialog.kt:88)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                float f3 = 24;
                Modifier modifierKN = SizeKt.KN(PaddingKt.xMQ(companion, Dp.KN(f3)), 0.0f, 1, null);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Alignment.Horizontal horizontalUo = companion2.Uo();
                String str = this.f74900n;
                String str2 = this.f74901t;
                Function0 function0 = this.f74899O;
                Function0 function02 = this.J2;
                Arrangement arrangement = Arrangement.f17400n;
                MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.Uo(), horizontalUo, composer, 48);
                int iN = ComposablesKt.n(composer, 0);
                CompositionLocalMap compositionLocalMapIk = composer.Ik();
                Modifier modifierO = ComposedModifierKt.O(composer, modifierKN);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0 function0N = companion3.n();
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
                Updater.O(composerN, measurePolicyN, companion3.t());
                Updater.O(composerN, compositionLocalMapIk, companion3.O());
                Function2 function2Rl = companion3.rl();
                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion3.nr());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                Modifier modifierKN2 = SizeKt.KN(companion, 0.0f, 1, null);
                TextAlign.Companion companion4 = TextAlign.INSTANCE;
                int iJ2 = companion4.J2();
                H9N.j jVar = H9N.j.f3810n;
                TextKt.t(str, modifierKN2, aD.w6.B(), 0L, null, null, null, 0L, null, TextAlign.KN(iJ2), 0L, 0, false, 0, 0, null, jVar.rl(composer, 6).ty(), composer, 432, 0, 65016);
                SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(16)), composer, 6);
                TextKt.t(str2, SizeKt.KN(companion, 0.0f, 1, null), aD.w6.FX(), 0L, null, null, null, 0L, null, TextAlign.KN(companion4.J2()), 0L, 0, false, 0, 0, null, jVar.rl(composer, 6).az(), composer, 432, 0, 65016);
                SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f3)), composer, 6);
                Modifier modifierKN3 = SizeKt.KN(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRl = RowKt.rl(arrangement.t(), companion2.xMQ(), composer, 54);
                int iN2 = ComposablesKt.n(composer, 0);
                CompositionLocalMap compositionLocalMapIk2 = composer.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composer, modifierKN3);
                Function0 function0N2 = companion3.n();
                if (composer.getApplier() == null) {
                    ComposablesKt.t();
                }
                composer.T();
                if (composer.getInserting()) {
                    composer.s7N(function0N2);
                } else {
                    composer.r();
                }
                Composer composerN2 = Updater.n(composer);
                Updater.O(composerN2, measurePolicyRl, companion3.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                Function2 function2Rl2 = companion3.rl();
                if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion3.nr());
                RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                float f4 = 12;
                float f5 = 10;
                eO.az(function0, StringResources_androidKt.t(2132019849, composer, 6), null, null, PaddingKt.rl(Dp.KN(f4), Dp.KN(f5)), jVar.rl(composer, 6).HI(), aD.w6.M(), null, composer, 1597440, 140);
                SpacerKt.n(SizeKt.ViF(companion, Dp.KN(8)), composer, 6);
                eO.az(function02, StringResources_androidKt.t(2132019850, composer, 6), null, null, PaddingKt.rl(Dp.KN(f4), Dp.KN(f5)), jVar.rl(composer, 6).HI(), aD.w6.M(), null, composer, 1597440, 140);
                composer.XQ();
                composer.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        n(Modifier modifier, String str, String str2, Function0 function0, Function0 function02) {
            this.f74896n = modifier;
            this.f74898t = str;
            this.f74895O = str2;
            this.J2 = function0;
            this.f74897r = function02;
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
                ComposerKt.p5(307895339, i2, -1, "com.alightcreative.monetization.ui.components.dialogs.PaywallDialogContent.<anonymous> (PaywallDialog.kt:83)");
            }
            SurfaceKt.n(ScrollKt.Uo(this.f74896n, ScrollKt.t(0, composer, 0, 1), false, null, false, 14, null), RoundedCornerShapeKt.t(Dp.KN(28)), aD.w6.E(), 0L, null, 0.0f, ComposableLambdaKt.nr(1426892903, true, new j(this.f74898t, this.f74895O, this.J2, this.f74897r), composer, 54), composer, 1573248, 56);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(String str, String str2, Function0 function0, Function0 function02, Modifier modifier, DialogProperties dialogProperties, int i2, int i3, Composer composer, int i5) {
        O(str, str2, function0, function02, modifier, dialogProperties, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void O(final String str, final String str2, final Function0 function0, final Function0 function02, Modifier modifier, DialogProperties dialogProperties, Composer composer, final int i2, final int i3) {
        String str3;
        int i5;
        String str4;
        Function0 function03;
        Function0 function04;
        Modifier modifier2;
        int i7;
        final DialogProperties dialogProperties2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1164129260);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            str3 = str;
        } else {
            str3 = str;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.p5(str3) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            str4 = str2;
        } else {
            str4 = str2;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.p5(str4) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            function03 = function0;
        } else {
            function03 = function0;
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.E2(function03) ? 256 : 128;
            }
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
            function04 = function02;
        } else {
            function04 = function02;
            if ((i2 & 3072) == 0) {
                i5 |= composerKN.E2(function04) ? 2048 : 1024;
            }
        }
        int i8 = i3 & 16;
        if (i8 != 0) {
            i5 |= 24576;
        } else {
            if ((i2 & 24576) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 16384 : 8192;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((196608 & i2) == 0) {
                    dialogProperties2 = dialogProperties;
                    i5 |= composerKN.p5(dialogProperties2) ? 131072 : 65536;
                }
                if ((74899 & i5) == 74898 && composerKN.xMQ()) {
                    composerKN.wTp();
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    DialogProperties dialogProperties3 = i7 == 0 ? new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null) : dialogProperties2;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1164129260, i5, -1, "com.alightcreative.monetization.ui.components.dialogs.PaywallDialogContent (PaywallDialog.kt:78)");
                    }
                    AndroidDialog_androidKt.n(function0, dialogProperties3, ComposableLambdaKt.nr(307895339, true, new n(modifier4, str3, str4, function03, function04), composerKN, 54), composerKN, ((i5 >> 6) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | ((i5 >> 12) & 112), 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    dialogProperties2 = dialogProperties3;
                    modifier3 = modifier4;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: wJ.fuX
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Dsr.J2(str, str2, function0, function02, modifier3, dialogProperties2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 196608;
            dialogProperties2 = dialogProperties;
            if ((74899 & i5) == 74898) {
                if (i8 == 0) {
                }
                if (i7 == 0) {
                }
                if (ComposerKt.v()) {
                }
                AndroidDialog_androidKt.n(function0, dialogProperties3, ComposableLambdaKt.nr(307895339, true, new n(modifier4, str3, str4, function03, function04), composerKN, 54), composerKN, ((i5 >> 6) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | ((i5 >> 12) & 112), 0);
                if (ComposerKt.v()) {
                }
                dialogProperties2 = dialogProperties3;
                modifier3 = modifier4;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        dialogProperties2 = dialogProperties;
        if ((74899 & i5) == 74898) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(N.Dsr dsr, String str, String str2, Function0 function0, Modifier modifier, Function0 function02, DialogProperties dialogProperties, int i2, int i3, Composer composer, int i5) {
        t(dsr, str, str2, function0, modifier, function02, dialogProperties, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final N.Dsr dialogState, final String title, final String message, final Function0 onRetryButtonClicked, Modifier modifier, Function0 function0, DialogProperties dialogProperties, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        Function0 function02;
        int i7;
        DialogProperties dialogProperties2;
        Function0 function03;
        int i8;
        Modifier modifier3;
        Function0 function04;
        final DialogProperties dialogProperties3;
        final Modifier modifier4;
        final Function0 function05;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(dialogState, "dialogState");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(onRetryButtonClicked, "onRetryButtonClicked");
        Composer composerKN = composer.KN(-1527881968);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(dialogState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(title) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(message) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(onRetryButtonClicked) ? 2048 : 1024;
        }
        int i9 = i3 & 16;
        if (i9 != 0) {
            i5 |= 24576;
        } else {
            if ((i2 & 24576) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 16384 : 8192;
            }
            if ((196608 & i2) != 0) {
                if ((i3 & 32) == 0) {
                    function02 = function0;
                    int i10 = composerKN.E2(function02) ? 131072 : 65536;
                    i5 |= i10;
                } else {
                    function02 = function0;
                }
                i5 |= i10;
            } else {
                function02 = function0;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                if ((1572864 & i2) == 0) {
                    dialogProperties2 = dialogProperties;
                    i5 |= composerKN.p5(dialogProperties2) ? 1048576 : 524288;
                }
                if ((599187 & i5) == 599186 && composerKN.xMQ()) {
                    composerKN.wTp();
                    modifier4 = modifier2;
                    function05 = function02;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerKN.e();
                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                        Modifier modifier5 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i3 & 32) == 0) {
                            composerKN.eF(-380199166);
                            boolean z2 = (i5 & 14) == 4;
                            Object objIF = composerKN.iF();
                            if (z2 || objIF == Composer.INSTANCE.n()) {
                                objIF = new j(dialogState);
                                composerKN.o(objIF);
                            }
                            composerKN.Xw();
                            function03 = (Function0) ((KFunction) objIF);
                            i5 &= -458753;
                        } else {
                            function03 = function02;
                        }
                        if (i7 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, false, 5, (DefaultConstructorMarker) null);
                        }
                        Modifier modifier6 = modifier5;
                        i8 = i5;
                        modifier3 = modifier6;
                        function04 = function03;
                    } else {
                        composerKN.wTp();
                        if ((i3 & 32) != 0) {
                            i5 &= -458753;
                        }
                        i8 = i5;
                        modifier3 = modifier2;
                        function04 = function02;
                    }
                    dialogProperties3 = dialogProperties2;
                    composerKN.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1527881968, i8, -1, "com.alightcreative.monetization.ui.components.dialogs.PaywallDialog (PaywallDialog.kt:56)");
                    }
                    if (((Boolean) dialogState.f6906n.getValue()).booleanValue()) {
                        int i11 = i8 >> 3;
                        O(title, message, function04, onRetryButtonClicked, modifier3, dialogProperties3, composerKN, (i8 & 57344) | (i11 & 126) | ((i8 >> 9) & 896) | (i8 & 7168) | (i11 & 458752), 0);
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier4 = modifier3;
                    function05 = function04;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: wJ.CN3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Dsr.nr(dialogState, title, message, onRetryButtonClicked, modifier4, function05, dialogProperties3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 1572864;
            dialogProperties2 = dialogProperties;
            if ((599187 & i5) == 599186) {
                composerKN.e();
                if ((i2 & 1) != 0) {
                    if (i9 == 0) {
                    }
                    if ((i3 & 32) == 0) {
                    }
                    if (i7 != 0) {
                    }
                    Modifier modifier62 = modifier5;
                    i8 = i5;
                    modifier3 = modifier62;
                    function04 = function03;
                    dialogProperties3 = dialogProperties2;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    if (((Boolean) dialogState.f6906n.getValue()).booleanValue()) {
                    }
                    if (ComposerKt.v()) {
                    }
                    modifier4 = modifier3;
                    function05 = function04;
                }
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((196608 & i2) != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        dialogProperties2 = dialogProperties;
        if ((599187 & i5) == 599186) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }
}
