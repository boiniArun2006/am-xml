package r;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
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
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.vungle.ads.internal.protos.Sdk;
import java.text.DecimalFormatSymbols;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: r.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class AbstractC2350z {

    /* JADX INFO: renamed from: r.z$j */
    static final class j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f72729n;

        j(String str) {
            this.f72729n = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(RowScope KeypadButton, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(KeypadButton, "$this$KeypadButton");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(607930511, i2, -1, "com.alightcreative.app.motion.numerickeypad.DigitButton.<anonymous> (KeypadKeys.kt:105)");
            }
            long jKN = TextUnitKt.KN(20);
            TextKt.t(this.f72729n, null, ((aF1.j) composer.ty(aF1.w6.t())).HI(), jKN, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 3072, 0, 131058);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: renamed from: r.z$n */
    static final class n implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f72730n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f72731t;

        n(int i2, String str) {
            this.f72730n = i2;
            this.f72731t = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(RowScope KeypadButton, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(KeypadButton, "$this$KeypadButton");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(728624946, i2, -1, "com.alightcreative.app.motion.numerickeypad.IconButton.<anonymous> (KeypadKeys.kt:118)");
            }
            ImageKt.n(PainterResources_androidKt.t(this.f72730n, composer, 0), this.f72731t, null, null, null, 0.0f, null, composer, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(ColumnScope columnScope, int i2, String str, long j2, Function0 function0, Modifier modifier, int i3, int i5, Composer composer, int i7) {
        ty(columnScope, i2, str, j2, function0, modifier, composer, RecomposeScopeImplKt.n(i3 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ik() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(Z z2) {
        if (z2 != null) {
            z2.qie();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WPU(Z z2) {
        if (z2 != null) {
            z2.Ik("-");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit aYN(Function0 function0, int i2, int i3, Composer composer, int i5) {
        o(function0, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(ColumnScope columnScope, String str, long j2, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        gh(columnScope, str, j2, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ck(final ColumnScope columnScope, Modifier modifier, final long j2, Function0 function0, Function3 function3, Composer composer, final int i2, final int i3) {
        ColumnScope columnScope2;
        int i5;
        Modifier modifier2;
        int i7;
        Function0 function02;
        int i8;
        Function3 function32;
        Function0 function03;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Composer composer2;
        final Modifier modifier3;
        final Function0 function04;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-2133426661);
        if ((i3 & Integer.MIN_VALUE) != 0) {
            i5 = i2 | 6;
            columnScope2 = columnScope;
        } else {
            columnScope2 = columnScope;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.p5(columnScope2) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i9 = i3 & 1;
        if (i9 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i3 & 2) == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.nr(j2) ? 256 : 128;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    function02 = function0;
                    i5 |= composerKN.E2(function02) ? 2048 : 1024;
                }
                i8 = i3 & 8;
                if (i8 == 0) {
                    if ((i2 & 24576) == 0) {
                        function32 = function3;
                        i5 |= composerKN.E2(function32) ? 16384 : 8192;
                    }
                    if ((i5 & 9363) == 9362 || !composerKN.xMQ()) {
                        Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i7 == 0) {
                            composerKN.eF(-369012989);
                            Object objIF = composerKN.iF();
                            if (objIF == Composer.INSTANCE.n()) {
                                objIF = new Function0() { // from class: r.Xo
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AbstractC2350z.Ik();
                                    }
                                };
                                composerKN.o(objIF);
                            }
                            function03 = (Function0) objIF;
                            composerKN.Xw();
                        } else {
                            function03 = function02;
                        }
                        Function3 function3N = i8 == 0 ? C2347j.f72693n.n() : function32;
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-2133426661, i5, -1, "com.alightcreative.app.motion.numerickeypad.KeypadButton (KeypadKeys.kt:70)");
                        }
                        RoundedCornerShape roundedCornerShapeT = RoundedCornerShapeKt.t(Dp.KN(4));
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierZmq = modifier4.Zmq(PaddingKt.az(SizeKt.KN(ColumnScope.rl(columnScope2, companion, 1.0f, false, 2, null), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.KN(5), 7, null));
                        MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                        iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                        Modifier modifierO = ComposedModifierKt.O(composerKN, modifierZmq);
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
                        Function0 function05 = function03;
                        Function3 function33 = function3N;
                        ButtonKt.n(function05, SizeKt.J2(companion, 0.0f, 1, null), false, null, null, roundedCornerShapeT, null, ButtonDefaults.f21598n.n(j2, 0L, 0L, 0L, composerKN, ((i5 >> 6) & 14) | (ButtonDefaults.qie << 12), 14), null, function33, composerKN, ((i5 >> 9) & 14) | 48 | ((i5 << 15) & 1879048192), 348);
                        function32 = function33;
                        composer2 = composerKN;
                        composer2.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier3 = modifier4;
                        function04 = function05;
                    } else {
                        composerKN.wTp();
                        composer2 = composerKN;
                        modifier3 = modifier2;
                        function04 = function02;
                    }
                    final Function3 function34 = function32;
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2() { // from class: r.eO
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AbstractC2350z.r(columnScope, modifier3, j2, function04, function34, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 24576;
                function32 = function3;
                if ((i5 & 9363) == 9362) {
                    if (i9 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (ComposerKt.v()) {
                    }
                    RoundedCornerShape roundedCornerShapeT2 = RoundedCornerShapeKt.t(Dp.KN(4));
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierZmq2 = modifier4.Zmq(PaddingKt.az(SizeKt.KN(ColumnScope.rl(columnScope2, companion3, 1.0f, false, 2, null), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.KN(5), 7, null));
                    MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierZmq2);
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
                        Function0 function052 = function03;
                        Function3 function332 = function3N;
                        ButtonKt.n(function052, SizeKt.J2(companion3, 0.0f, 1, null), false, null, null, roundedCornerShapeT2, null, ButtonDefaults.f21598n.n(j2, 0L, 0L, 0L, composerKN, ((i5 >> 6) & 14) | (ButtonDefaults.qie << 12), 14), null, function332, composerKN, ((i5 >> 9) & 14) | 48 | ((i5 << 15) & 1879048192), 348);
                        function32 = function332;
                        composer2 = composerKN;
                        composer2.XQ();
                        if (ComposerKt.v()) {
                        }
                        modifier3 = modifier4;
                        function04 = function052;
                    }
                }
                final Function3 function342 = function32;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            function02 = function0;
            i8 = i3 & 8;
            if (i8 == 0) {
            }
            function32 = function3;
            if ((i5 & 9363) == 9362) {
            }
            final Function3 function3422 = function32;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & 2) == 0) {
        }
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        function02 = function0;
        i8 = i3 & 8;
        if (i8 == 0) {
        }
        function32 = function3;
        if ((i5 & 9363) == 9362) {
        }
        final Function3 function34222 = function32;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void gh(final ColumnScope columnScope, final String str, final long j2, Modifier modifier, Composer composer, final int i2, final int i3) {
        ColumnScope columnScope2;
        int i5;
        long j3;
        Modifier modifier2;
        final Z z2;
        boolean zE2;
        Object objIF;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1329192817);
        if ((i3 & Integer.MIN_VALUE) != 0) {
            i5 = i2 | 6;
            columnScope2 = columnScope;
        } else if ((i2 & 6) == 0) {
            columnScope2 = columnScope;
            i5 = (composerKN.p5(columnScope2) ? 4 : 2) | i2;
        } else {
            columnScope2 = columnScope;
            i5 = i2;
        }
        if ((i3 & 1) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(str) ? 32 : 16;
        }
        if ((i3 & 2) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            j3 = j2;
        } else {
            j3 = j2;
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.nr(j3) ? 256 : 128;
            }
        }
        int i7 = i3 & 4;
        if (i7 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 2048 : 1024;
            }
            if ((i5 & 1171) == 1170 || !composerKN.xMQ()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(1329192817, i5, -1, "com.alightcreative.app.motion.numerickeypad.DigitButton (KeypadKeys.kt:98)");
                }
                Object objTy = composerKN.ty(CompositionLocalsKt.r());
                z2 = !(objTy instanceof Z) ? (Z) objTy : null;
                composerKN.eF(1631998565);
                zE2 = composerKN.E2(z2) | ((i5 & 112) != 32);
                objIF = composerKN.iF();
                if (!zE2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: r.o
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC2350z.qie(z2, str);
                        }
                    };
                    composerKN.o(objIF);
                }
                composerKN.Xw();
                ck(columnScope2, modifier4, j3, (Function0) objIF, ComposableLambdaKt.nr(607930511, true, new j(str), composerKN, 54), composerKN, (i5 & 14) | 24576 | ((i5 >> 6) & 112) | (i5 & 896), 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier4;
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: r.qz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC2350z.az(columnScope, str, j2, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 3072;
        modifier2 = modifier;
        if ((i5 & 1171) == 1170) {
            if (i7 == 0) {
            }
            if (ComposerKt.v()) {
            }
            Object objTy2 = composerKN.ty(CompositionLocalsKt.r());
            if (!(objTy2 instanceof Z)) {
            }
            composerKN.eF(1631998565);
            zE2 = composerKN.E2(z2) | ((i5 & 112) != 32);
            objIF = composerKN.iF();
            if (!zE2) {
                objIF = new Function0() { // from class: r.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC2350z.qie(z2, str);
                    }
                };
                composerKN.o(objIF);
                composerKN.Xw();
                ck(columnScope2, modifier4, j3, (Function0) objIF, ComposableLambdaKt.nr(607930511, true, new j(str), composerKN, 54), composerKN, (i5 & 14) | 24576 | ((i5 >> 6) & 112) | (i5 & 896), 0);
                if (ComposerKt.v()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public static final void o(Function0 function0, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        final Function0 function03;
        Composer composerKN = composer.KN(-1077584381);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
            function02 = function0;
        } else if ((i2 & 6) == 0) {
            function02 = function0;
            i5 = (composerKN.E2(function02) ? 4 : 2) | i2;
        } else {
            function02 = function0;
            i5 = i2;
        }
        if ((i5 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
            function03 = function02;
        } else {
            if (i7 != 0) {
                composerKN.eF(-700328667);
                Object objIF = composerKN.iF();
                if (objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: r.CN3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC2350z.Z();
                        }
                    };
                    composerKN.o(objIF);
                }
                composerKN.Xw();
                function03 = (Function0) objIF;
            } else {
                function03 = function02;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1077584381, i5, -1, "com.alightcreative.app.motion.numerickeypad.KeypadKeys (KeypadKeys.kt:29)");
            }
            aF1.j jVar = (aF1.j) composerKN.ty(aF1.w6.t());
            Object objTy = composerKN.ty(CompositionLocalsKt.r());
            final Z z2 = objTy instanceof Z ? (Z) objTy : null;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierJ2 = SizeKt.J2(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.f17400n;
            Arrangement.Horizontal horizontalJ2 = arrangement.J2();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalJ2, companion2.qie(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierJ2);
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
            Updater.O(composerN, measurePolicyRl, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            Modifier modifierRl = RowScope.rl(rowScopeInstance, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.Uo(), companion2.gh(), composerKN, 0);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierRl);
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
            Updater.O(composerN2, measurePolicyN, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            gh(columnScopeInstance, "7", jVar.ty(), ColumnScope.rl(columnScopeInstance, companion, 1.0f, false, 2, null), composerKN, 54, 0);
            gh(columnScopeInstance, "4", jVar.ty(), null, composerKN, 54, 4);
            gh(columnScopeInstance, "1", jVar.ty(), null, composerKN, 54, 4);
            long jQie = jVar.qie();
            composerKN.eF(1000390140);
            boolean zE2 = composerKN.E2(z2);
            Object objIF2 = composerKN.iF();
            if (zE2 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function0() { // from class: r.fuX
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC2350z.WPU(z2);
                    }
                };
                composerKN.o(objIF2);
            }
            composerKN.Xw();
            final Z z3 = z2;
            int i8 = i5;
            ty(columnScopeInstance, 2131231881, "+/-", jQie, (Function0) objIF2, null, composerKN, 438, 16);
            composerKN.XQ();
            float f3 = 5;
            SpacerKt.n(SizeKt.ViF(companion, Dp.KN(f3)), composerKN, 6);
            Modifier modifierRl2 = RowScope.rl(rowScopeInstance, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyN2 = ColumnKt.n(arrangement.Uo(), companion2.gh(), composerKN, 0);
            int iN3 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierRl2);
            Function0 function0N3 = companion3.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N3);
            } else {
                composerKN.r();
            }
            Composer composerN3 = Updater.n(composerKN);
            Updater.O(composerN3, measurePolicyN2, companion3.t());
            Updater.O(composerN3, compositionLocalMapIk3, companion3.O());
            Function2 function2Rl3 = companion3.rl();
            if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                composerN3.o(Integer.valueOf(iN3));
                composerN3.az(Integer.valueOf(iN3), function2Rl3);
            }
            Updater.O(composerN3, modifierO3, companion3.nr());
            gh(columnScopeInstance, "8", jVar.ty(), null, composerKN, 54, 4);
            gh(columnScopeInstance, "5", jVar.ty(), null, composerKN, 54, 4);
            gh(columnScopeInstance, "2", jVar.ty(), null, composerKN, 54, 4);
            gh(columnScopeInstance, "0", jVar.ty(), null, composerKN, 54, 4);
            composerKN.XQ();
            SpacerKt.n(SizeKt.ViF(companion, Dp.KN(f3)), composerKN, 6);
            Modifier modifierRl3 = RowScope.rl(rowScopeInstance, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyN3 = ColumnKt.n(arrangement.Uo(), companion2.gh(), composerKN, 0);
            int iN4 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk4 = composerKN.Ik();
            Modifier modifierO4 = ComposedModifierKt.O(composerKN, modifierRl3);
            Function0 function0N4 = companion3.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N4);
            } else {
                composerKN.r();
            }
            Composer composerN4 = Updater.n(composerKN);
            Updater.O(composerN4, measurePolicyN3, companion3.t());
            Updater.O(composerN4, compositionLocalMapIk4, companion3.O());
            Function2 function2Rl4 = companion3.rl();
            if (composerN4.getInserting() || !Intrinsics.areEqual(composerN4.iF(), Integer.valueOf(iN4))) {
                composerN4.o(Integer.valueOf(iN4));
                composerN4.az(Integer.valueOf(iN4), function2Rl4);
            }
            Updater.O(composerN4, modifierO4, companion3.nr());
            gh(columnScopeInstance, "9", jVar.ty(), null, composerKN, 54, 4);
            gh(columnScopeInstance, "6", jVar.ty(), null, composerKN, 54, 4);
            gh(columnScopeInstance, "3", jVar.ty(), null, composerKN, 54, 4);
            gh(columnScopeInstance, String.valueOf(DecimalFormatSymbols.getInstance().getDecimalSeparator()), jVar.qie(), null, composerKN, 6, 4);
            composerKN.XQ();
            SpacerKt.n(SizeKt.ViF(companion, Dp.KN(f3)), composerKN, 6);
            Modifier modifierRl4 = RowScope.rl(rowScopeInstance, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyN4 = ColumnKt.n(arrangement.Uo(), companion2.gh(), composerKN, 0);
            int iN5 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk5 = composerKN.Ik();
            Modifier modifierO5 = ComposedModifierKt.O(composerKN, modifierRl4);
            Function0 function0N5 = companion3.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N5);
            } else {
                composerKN.r();
            }
            Composer composerN5 = Updater.n(composerKN);
            Updater.O(composerN5, measurePolicyN4, companion3.t());
            Updater.O(composerN5, compositionLocalMapIk5, companion3.O());
            Function2 function2Rl5 = companion3.rl();
            if (composerN5.getInserting() || !Intrinsics.areEqual(composerN5.iF(), Integer.valueOf(iN5))) {
                composerN5.o(Integer.valueOf(iN5));
                composerN5.az(Integer.valueOf(iN5), function2Rl5);
            }
            Updater.O(composerN5, modifierO5, companion3.nr());
            long jQie2 = jVar.qie();
            composerKN.eF(1000422622);
            boolean zE22 = composerKN.E2(z3);
            Object objIF3 = composerKN.iF();
            if (zE22 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new Function0() { // from class: r.Dsr
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC2350z.S(z3);
                    }
                };
                composerKN.o(objIF3);
            }
            composerKN.Xw();
            ty(columnScopeInstance, 2131231543, "backspace", jQie2, (Function0) objIF3, null, composerKN, 438, 16);
            long jRl = jVar.rl();
            composerKN.eF(1000427885);
            boolean z4 = (i8 & 14) == 4;
            Object objIF4 = composerKN.iF();
            if (z4 || objIF4 == Composer.INSTANCE.n()) {
                objIF4 = new Function0() { // from class: r.aC
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC2350z.XQ(function03);
                    }
                };
                composerKN.o(objIF4);
            }
            composerKN.Xw();
            ty(columnScopeInstance, 2131231659, "Done", jRl, (Function0) objIF4, ColumnScope.rl(columnScopeInstance, companion, 3.0f, false, 2, null), composerKN, 438, 0);
            composerKN = composerKN;
            composerKN.XQ();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: r.C
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC2350z.aYN(function03, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(Z z2, String str) {
        if (z2 != null) {
            z2.Ik(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(ColumnScope columnScope, Modifier modifier, long j2, Function0 function0, Function3 function3, int i2, int i3, Composer composer, int i5) {
        ck(columnScope, modifier, j2, function0, function3, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ty(final ColumnScope columnScope, final int i2, final String str, final long j2, final Function0 function0, Modifier modifier, Composer composer, final int i3, final int i5) {
        ColumnScope columnScope2;
        int i7;
        long j3;
        Function0 function02;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-578807920);
        if ((i5 & Integer.MIN_VALUE) != 0) {
            i7 = i3 | 6;
            columnScope2 = columnScope;
        } else {
            columnScope2 = columnScope;
            if ((i3 & 6) == 0) {
                i7 = (composerKN.p5(columnScope2) ? 4 : 2) | i3;
            } else {
                i7 = i3;
            }
        }
        if ((i5 & 1) != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= composerKN.t(i2) ? 32 : 16;
        }
        if ((i5 & 2) != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerKN.p5(str) ? 256 : 128;
        }
        if ((i5 & 4) != 0) {
            i7 |= 3072;
            j3 = j2;
        } else {
            j3 = j2;
            if ((i3 & 3072) == 0) {
                i7 |= composerKN.nr(j3) ? 2048 : 1024;
            }
        }
        if ((i5 & 8) != 0) {
            i7 |= 24576;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i3 & 24576) == 0) {
                i7 |= composerKN.E2(function02) ? 16384 : 8192;
            }
        }
        int i8 = i5 & 16;
        if (i8 == 0) {
            if ((196608 & i3) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i7) == 74898 || !composerKN.xMQ()) {
                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(-578807920, i7, -1, "com.alightcreative.app.motion.numerickeypad.IconButton (KeypadKeys.kt:116)");
                }
                int i9 = (i7 & 14) | 24576 | ((i7 >> 12) & 112);
                int i10 = i7 >> 3;
                ck(columnScope2, modifier4, j3, function02, ComposableLambdaKt.nr(728624946, true, new n(i2, str), composerKN, 54), composerKN, i9 | (i10 & 896) | (i10 & 7168), 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier4;
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: r.Pl
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC2350z.HI(columnScope, i2, str, j2, function0, modifier3, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i7 |= 196608;
        modifier2 = modifier;
        if ((74899 & i7) == 74898) {
            if (i8 == 0) {
            }
            if (ComposerKt.v()) {
            }
            int i92 = (i7 & 14) | 24576 | ((i7 >> 12) & 112);
            int i102 = i7 >> 3;
            ck(columnScope2, modifier4, j3, function02, ComposableLambdaKt.nr(728624946, true, new n(i2, str), composerKN, 54), composerKN, i92 | (i102 & 896) | (i102 & 7168), 0);
            if (ComposerKt.v()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit XQ(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
