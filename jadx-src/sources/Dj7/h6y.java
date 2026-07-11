package Dj7;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.material.SurfaceKt;
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
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class h6y {

    static final class j implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f1801O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f1802n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f1803t;

        j(String str, Function0 function0, String str2) {
            this.f1802n = str;
            this.f1803t = function0;
            this.f1801O = str2;
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
                ComposerKt.p5(868117626, i2, -1, "com.alightcreative.common.compose.components.Tooltip.<anonymous> (Tooltip.kt:110)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierXMQ = PaddingKt.xMQ(companion, Dp.KN(16));
            String str = this.f1802n;
            Function0 function0 = this.f1803t;
            String str2 = this.f1801O;
            Arrangement.Vertical verticalUo = Arrangement.f17400n.Uo();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion2.gh(), composer, 0);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierXMQ);
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
            CM.S(str, Fo.n.t().N(), null, 0L, null, null, null, 0, false, 0, null, composer, 48, 0, 2044);
            float f3 = 8;
            Modifier modifierXMQ2 = SizeKt.xMQ(PaddingKt.az(columnScopeInstance.t(companion, companion2.mUb()), 0.0f, Dp.KN(f3), 0.0f, 0.0f, 13, null), Dp.KN(32));
            float f4 = 0;
            Modifier modifierG = SizeKt.g(modifierXMQ2, Dp.KN(f4), 0.0f, 2, null);
            TextStyle textStyleAYN = H9N.j.f3810n.rl(composer, 6).aYN();
            PaddingValues paddingValuesRl = PaddingKt.rl(Dp.KN(f4), Dp.KN(f4));
            long jY = aD.w6.y();
            Color.Companion companion4 = Color.INSTANCE;
            eO.J2(function0, str2, modifierG, null, null, textStyleAYN, 0, 0, 0.0f, new Dsr(companion4.n(), jY, companion4.n(), aD.w6.Zn(), aD.w6.y(), aD.w6.y(), null), RoundedCornerShapeKt.t(Dp.KN(f3)), paddingValuesRl, false, composer, 0, 48, 4568);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class n implements Function2 {
        final /* synthetic */ Alignment.Horizontal E2;
        final /* synthetic */ Function3 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ crp f1804O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ Modifier f1805S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ String f1806Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f1807g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f1808n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f1809o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function0 f1810r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Alignment f1811t;

        n(float f3, Alignment alignment, crp crpVar, Function3 function3, Function0 function0, String str, String str2, Modifier modifier, Modifier modifier2, Alignment.Horizontal horizontal) {
            this.f1808n = f3;
            this.f1811t = alignment;
            this.f1804O = crpVar;
            this.J2 = function3;
            this.f1810r = function0;
            this.f1809o = str;
            this.f1806Z = str2;
            this.f1805S = modifier;
            this.f1807g = modifier2;
            this.E2 = horizontal;
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
                ComposerKt.p5(-392847345, i2, -1, "com.alightcreative.common.compose.components.TooltipWithHighlightedTarget.<anonymous> (Tooltip.kt:59)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierKN = SizeKt.KN(OffsetKt.t(companion, 0.0f, this.f1808n, 1, null), 0.0f, 1, null);
            Alignment alignment = this.f1811t;
            crp crpVar = this.f1804O;
            Function3 function3 = this.J2;
            Function0 function0 = this.f1810r;
            String str = this.f1809o;
            String str2 = this.f1806Z;
            Modifier modifier = this.f1805S;
            Modifier modifier2 = this.f1807g;
            Alignment.Horizontal horizontal = this.E2;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
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
            Updater.O(composerN, measurePolicyUo, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            Modifier modifierN = BoxScopeInstance.f17448n.n(PaddingKt.gh(companion, Dp.KN(16), 0.0f, 2, null), alignment);
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), companion2.gh(), composer, 0);
            int iN2 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk2 = composer.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer, modifierN);
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
            Updater.O(composerN2, measurePolicyN, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            composer.eF(-331895474);
            if (crpVar == crp.f1752n) {
                function3.invoke(columnScopeInstance, composer, 6);
            }
            composer.Xw();
            h6y.Uo(crpVar, function0, str, str2, modifier, columnScopeInstance.t(modifier2, horizontal), composer, 0, 0);
            composer.eF(-331879920);
            if (crpVar == crp.f1753t) {
                function3.invoke(columnScopeInstance, composer, 6);
            }
            composer.Xw();
            composer.XQ();
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(Function3 function3, float f3, crp crpVar, Function0 function0, String str, String str2, Alignment alignment, Alignment.Horizontal horizontal, Modifier modifier, Modifier modifier2, int i2, int i3, Composer composer, int i5) {
        az(function3, f3, crpVar, function0, str, str2, alignment, horizontal, modifier, modifier2, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(crp crpVar, Function0 function0, String str, String str2, Modifier modifier, Modifier modifier2, int i2, int i3, Composer composer, int i5) {
        Uo(crpVar, function0, str, str2, modifier, modifier2, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Uo(final crp arrowType, final Function0 onDismissRequest, final String text, final String dismissText, Modifier modifier, Modifier modifier2, Composer composer, final int i2, final int i3) {
        int i5;
        final Modifier modifier3;
        int i7;
        Modifier modifier4;
        int i8;
        Modifier modifier5;
        final Modifier modifier6;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(arrowType, "arrowType");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(dismissText, "dismissText");
        Composer composerKN = composer.KN(-1118122954);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(arrowType) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(onDismissRequest) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(text) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.p5(dismissText) ? 2048 : 1024;
        }
        int i9 = i3 & 16;
        if (i9 != 0) {
            i5 |= 24576;
        } else {
            if ((i2 & 24576) == 0) {
                modifier3 = modifier;
                i5 |= composerKN.p5(modifier3) ? 16384 : 8192;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((196608 & i2) == 0) {
                    modifier4 = modifier2;
                    i5 |= composerKN.p5(modifier4) ? 131072 : 65536;
                }
                i8 = i5;
                if ((74899 & i8) == 74898 && composerKN.xMQ()) {
                    composerKN.wTp();
                    modifier6 = modifier4;
                } else {
                    Modifier modifier7 = i9 == 0 ? Modifier.INSTANCE : modifier3;
                    if (i7 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1118122954, i8, -1, "com.alightcreative.common.compose.components.Tooltip (Tooltip.kt:98)");
                    }
                    composerKN.eF(1658846888);
                    if (arrowType != crp.f1752n) {
                        modifier5 = modifier4;
                        xMQ(arrowType, modifier5, 0.0f, 0.0f, composerKN, (i8 & 14) | ((i8 >> 12) & 112), 12);
                    } else {
                        modifier5 = modifier4;
                    }
                    composerKN.Xw();
                    Modifier modifier8 = modifier7;
                    int i10 = i8 >> 12;
                    SurfaceKt.n(modifier8, RoundedCornerShapeKt.t(Dp.KN(12)), aD.w6.uG(), 0L, null, 0.0f, ComposableLambdaKt.nr(868117626, true, new j(text, onDismissRequest, dismissText), composerKN, 54), composerKN, (i10 & 14) | 1573248, 56);
                    if (arrowType == crp.f1753t) {
                        xMQ(arrowType, modifier5, 0.0f, 0.0f, composerKN, (i8 & 14) | (i10 & 112), 12);
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier6 = modifier5;
                    modifier3 = modifier8;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.T
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return h6y.KN(arrowType, onDismissRequest, text, dismissText, modifier3, modifier6, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 196608;
            modifier4 = modifier2;
            i8 = i5;
            if ((74899 & i8) == 74898) {
                if (i9 == 0) {
                }
                if (i7 != 0) {
                }
                if (ComposerKt.v()) {
                }
                composerKN.eF(1658846888);
                if (arrowType != crp.f1752n) {
                }
                composerKN.Xw();
                Modifier modifier82 = modifier7;
                int i102 = i8 >> 12;
                SurfaceKt.n(modifier82, RoundedCornerShapeKt.t(Dp.KN(12)), aD.w6.uG(), 0L, null, 0.0f, ComposableLambdaKt.nr(868117626, true, new j(text, onDismissRequest, dismissText), composerKN, 54), composerKN, (i102 & 14) | 1573248, 56);
                if (arrowType == crp.f1753t) {
                }
                if (ComposerKt.v()) {
                }
                modifier6 = modifier5;
                modifier3 = modifier82;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier3 = modifier;
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        modifier4 = modifier2;
        i8 = i5;
        if ((74899 & i8) == 74898) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void az(final Function3 target, final float f3, final crp arrowType, final Function0 onDismissRequest, final String text, final String dismissText, final Alignment tooltipAlignment, final Alignment.Horizontal arrowAlignment, Modifier modifier, Modifier modifier2, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        Modifier modifier3;
        int i8;
        Object objIF;
        Composer composer2;
        final Modifier modifier4;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(arrowType, "arrowType");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(dismissText, "dismissText");
        Intrinsics.checkNotNullParameter(tooltipAlignment, "tooltipAlignment");
        Intrinsics.checkNotNullParameter(arrowAlignment, "arrowAlignment");
        Composer composerKN = composer.KN(1395309399);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(target) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerKN.rl(f3) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.p5(arrowType) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= composerKN.E2(onDismissRequest) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i5 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i5 |= composerKN.p5(text) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i5 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i5 |= composerKN.p5(dismissText) ? 131072 : 65536;
            }
            if ((i3 & 64) == 0) {
                i5 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i5 |= composerKN.p5(tooltipAlignment) ? 1048576 : 524288;
            }
            if ((i3 & 128) == 0) {
                i5 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i5 |= composerKN.p5(arrowAlignment) ? 8388608 : 4194304;
            }
            i7 = i3 & 256;
            if (i7 != 0) {
                if ((100663296 & i2) == 0) {
                    modifier3 = modifier;
                    i5 |= composerKN.p5(modifier3) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                }
                i8 = i3 & 512;
                if (i8 != 0) {
                    i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    i5 |= composerKN.p5(modifier2) ? 536870912 : 268435456;
                }
                if ((i5 & 306783379) == 306783378 && composerKN.xMQ()) {
                    composerKN.wTp();
                    modifier4 = modifier2;
                    composer2 = composerKN;
                    modifier5 = modifier3;
                } else {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    }
                    Modifier modifier6 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1395309399, i5, -1, "com.alightcreative.common.compose.components.TooltipWithHighlightedTarget (Tooltip.kt:52)");
                    }
                    long jJ2 = Color.INSTANCE.J2();
                    Modifier modifierJ2 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null);
                    DialogProperties dialogProperties = new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null);
                    composerKN.eF(-1287257325);
                    objIF = composerKN.iF();
                    if (objIF == Composer.INSTANCE.n()) {
                        objIF = new Function0() { // from class: Dj7.Ogx
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return h6y.ty();
                            }
                        };
                        composerKN.o(objIF);
                    }
                    composerKN.Xw();
                    Modifier modifier7 = modifier6;
                    Modifier modifier8 = modifier3;
                    composer2 = composerKN;
                    AndroidAlertDialog_androidKt.rl((Function0) objIF, ComposableLambdaKt.nr(-392847345, true, new n(f3, tooltipAlignment, arrowType, target, onDismissRequest, text, dismissText, modifier8, modifier7, arrowAlignment), composerKN, 54), modifierJ2, null, null, null, jJ2, 0L, dialogProperties, composer2, 102236598, 184);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier4 = modifier7;
                    modifier5 = modifier8;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.DC
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return h6y.HI(target, f3, arrowType, onDismissRequest, text, dismissText, tooltipAlignment, arrowAlignment, modifier5, modifier4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 100663296;
            modifier3 = modifier;
            i8 = i3 & 512;
            if (i8 != 0) {
            }
            if ((i5 & 306783379) == 306783378) {
                if (i7 != 0) {
                }
                if (i8 == 0) {
                }
                if (ComposerKt.v()) {
                }
                long jJ22 = Color.INSTANCE.J2();
                Modifier modifierJ22 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null);
                DialogProperties dialogProperties2 = new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null);
                composerKN.eF(-1287257325);
                objIF = composerKN.iF();
                if (objIF == Composer.INSTANCE.n()) {
                }
                composerKN.Xw();
                Modifier modifier72 = modifier6;
                Modifier modifier82 = modifier3;
                composer2 = composerKN;
                AndroidAlertDialog_androidKt.rl((Function0) objIF, ComposableLambdaKt.nr(-392847345, true, new n(f3, tooltipAlignment, arrowType, target, onDismissRequest, text, dismissText, modifier82, modifier72, arrowAlignment), composerKN, 54), modifierJ22, null, null, null, jJ22, 0L, dialogProperties2, composer2, 102236598, 184);
                if (ComposerKt.v()) {
                }
                modifier4 = modifier72;
                modifier5 = modifier82;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        i7 = i3 & 256;
        if (i7 != 0) {
        }
        modifier3 = modifier;
        i8 = i3 & 512;
        if (i8 != 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier gh(Modifier runIf) {
        Intrinsics.checkNotNullParameter(runIf, "$this$runIf");
        return RotateKt.n(OffsetKt.t(runIf, 0.0f, Dp.KN(-4), 1, null), 180.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier mUb(Modifier runIf) {
        Intrinsics.checkNotNullParameter(runIf, "$this$runIf");
        return OffsetKt.t(runIf, 0.0f, Dp.KN(4), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(crp crpVar, Modifier modifier, float f3, float f4, int i2, int i3, Composer composer, int i5) {
        xMQ(crpVar, modifier, f3, f4, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ty() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void xMQ(final crp crpVar, final Modifier modifier, float f3, float f4, Composer composer, final int i2, final int i3) {
        int i5;
        float f5;
        int i7;
        float f6;
        Object objIF;
        Composer.Companion companion;
        Object objIF2;
        final float f7;
        final float f8;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-300066525);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(crpVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(modifier) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                f5 = f3;
                i5 |= composerKN.rl(f5) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    f6 = f4;
                    i5 |= composerKN.rl(f6) ? 2048 : 1024;
                }
                if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
                    composerKN.wTp();
                    f7 = f5;
                    f8 = f6;
                } else {
                    float fKN = i8 == 0 ? Dp.KN((float) 15.76d) : f5;
                    float fKN2 = i7 == 0 ? Dp.KN((float) 27.7d) : f6;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-300066525, i5, -1, "com.alightcreative.common.compose.components.TooltipTriangle (Tooltip.kt:156)");
                    }
                    Painter painterT = PainterResources_androidKt.t(2131232316, composerKN, 6);
                    Modifier modifierXMQ = SizeKt.xMQ(SizeKt.ViF(modifier, fKN2), fKN);
                    boolean z2 = crpVar != crp.f1752n;
                    composerKN.eF(299584517);
                    objIF = composerKN.iF();
                    companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                        objIF = new Function1() { // from class: Dj7.V1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return h6y.mUb((Modifier) obj);
                            }
                        };
                        composerKN.o(objIF);
                    }
                    composerKN.Xw();
                    Modifier modifierN = N.o.n(modifierXMQ, z2, (Function1) objIF);
                    boolean z3 = crpVar == crp.f1753t;
                    composerKN.eF(299587925);
                    objIF2 = composerKN.iF();
                    if (objIF2 == companion.n()) {
                        objIF2 = new Function1() { // from class: Dj7.oXP
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return h6y.gh((Modifier) obj);
                            }
                        };
                        composerKN.o(objIF2);
                    }
                    composerKN.Xw();
                    float f9 = fKN2;
                    ImageKt.n(painterT, null, N.o.n(modifierN, z3, (Function1) objIF2), null, ContentScale.INSTANCE.rl(), 0.0f, null, composerKN, 24624, 104);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    f7 = fKN;
                    f8 = f9;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.U4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return h6y.qie(crpVar, modifier, f7, f8, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 3072;
            f6 = f4;
            if ((i5 & 1171) == 1170) {
                if (i8 == 0) {
                }
                if (i7 == 0) {
                }
                if (ComposerKt.v()) {
                }
                Painter painterT2 = PainterResources_androidKt.t(2131232316, composerKN, 6);
                Modifier modifierXMQ2 = SizeKt.xMQ(SizeKt.ViF(modifier, fKN2), fKN);
                if (crpVar != crp.f1752n) {
                }
                composerKN.eF(299584517);
                objIF = composerKN.iF();
                companion = Composer.INSTANCE;
                if (objIF == companion.n()) {
                }
                composerKN.Xw();
                Modifier modifierN2 = N.o.n(modifierXMQ2, z2, (Function1) objIF);
                if (crpVar == crp.f1753t) {
                }
                composerKN.eF(299587925);
                objIF2 = composerKN.iF();
                if (objIF2 == companion.n()) {
                }
                composerKN.Xw();
                float f92 = fKN2;
                ImageKt.n(painterT2, null, N.o.n(modifierN2, z3, (Function1) objIF2), null, ContentScale.INSTANCE.rl(), 0.0f, null, composerKN, 24624, 104);
                if (ComposerKt.v()) {
                }
                f7 = fKN;
                f8 = f92;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        f5 = f3;
        i7 = i3 & 8;
        if (i7 != 0) {
        }
        f6 = f4;
        if ((i5 & 1171) == 1170) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }
}
