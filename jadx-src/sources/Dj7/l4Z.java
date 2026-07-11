package Dj7;

import Dj7.l4Z;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.AndroidAlertDialog_androidKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class l4Z {

    static final class j implements Function2 {
        final /* synthetic */ boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f1826O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f1827n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f1828t;

        j(float f3, boolean z2, Function0 function0, boolean z3) {
            this.f1827n = f3;
            this.f1828t = z2;
            this.f1826O = function0;
            this.J2 = z3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(Composer composer, int i2) {
            int i3;
            ColumnScopeInstance columnScopeInstance;
            Modifier.Companion companion;
            Function0 function0;
            boolean z2;
            Modifier.Companion companion2;
            Composer composer2 = composer;
            if ((i2 & 3) == 2 && composer2.xMQ()) {
                composer2.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(145445035, i2, -1, "com.alightcreative.common.compose.components.ProgressDialog.<anonymous> (ProgressDialog.kt:85)");
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierGh = PaddingKt.gh(companion3, Dp.KN(24), 0.0f, 2, null);
            float f3 = this.f1827n;
            boolean z3 = this.f1828t;
            Function0 function02 = this.f1826O;
            boolean z4 = this.J2;
            Arrangement.Vertical verticalUo = Arrangement.f17400n.Uo();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion4.gh(), composer2, 0);
            int iN = ComposablesKt.n(composer2, 0);
            CompositionLocalMap compositionLocalMapIk = composer2.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer2, modifierGh);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion5.n();
            if (composer2.getApplier() == null) {
                ComposablesKt.t();
            }
            composer2.T();
            if (composer2.getInserting()) {
                composer2.s7N(function0N);
            } else {
                composer2.r();
            }
            Composer composerN = Updater.n(composer2);
            Updater.O(composerN, measurePolicyN, companion5.t());
            Updater.O(composerN, compositionLocalMapIk, companion5.O());
            Function2 function2Rl = companion5.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion5.nr());
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
            l4Z.nr(f3, 0L, composer2, 0, 2);
            composer2.eF(-698663741);
            if (z3) {
                SpacerKt.n(SizeKt.xMQ(companion3, Dp.KN(4)), composer2, 6);
                function0 = function02;
                companion = companion3;
                columnScopeInstance = columnScopeInstance2;
                i3 = 6;
                z2 = z4;
                TextKt.t(MathKt.roundToInt(f3 * 100) + "%", null, Color.az(Color.INSTANCE.n(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composer2, 6).KN(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
                composer2 = composer;
            } else {
                i3 = 6;
                columnScopeInstance = columnScopeInstance2;
                companion = companion3;
                function0 = function02;
                z2 = z4;
            }
            composer2.Xw();
            composer2.eF(-698651720);
            if (function0 != null) {
                Modifier.Companion companion6 = companion;
                SpacerKt.n(SizeKt.xMQ(companion6, Dp.KN(32)), composer2, i3);
                String upperCase = StringResources_androidKt.t(2132017396, composer2, i3).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                TextStyle textStyleKN = H9N.j.f3810n.rl(composer2, i3).KN();
                long jT2 = z2 ? aD.w6.t() : aD.w6.qie();
                Modifier modifierT = columnScopeInstance.t(companion6, companion4.mUb());
                composer2.eF(-698632039);
                final Function0 function03 = function0;
                boolean zP5 = composer2.p5(function03);
                Object objIF = composer2.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: Dj7.Sis
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return l4Z.j.t(function03);
                        }
                    };
                    composer2.o(objIF);
                }
                composer2.Xw();
                companion2 = companion6;
                TextKt.t(upperCase, PaddingKt.gh(ClickableKt.J2(modifierT, z2, null, null, (Function0) objIF, 6, null), Dp.KN(i3), 0.0f, 2, null), jT2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleKN, composer, 0, 0, 65528);
                composer2 = composer;
            } else {
                companion2 = companion;
            }
            composer2.Xw();
            SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(15)), composer2, 6);
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    static final class n implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ long f1829O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f1830n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f1831t;

        n(String str, String str2, long j2) {
            this.f1830n = str;
            this.f1831t = str2;
            this.f1829O = j2;
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
                ComposerKt.p5(654223849, i2, -1, "com.alightcreative.common.compose.components.ProgressDialog.<anonymous> (ProgressDialog.kt:67)");
            }
            Modifier modifierAz = PaddingKt.az(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.KN(20), 7, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(4));
            String str = this.f1830n;
            String str2 = this.f1831t;
            long j2 = this.f1829O;
            MeasurePolicy measurePolicyN = ColumnKt.n(horizontalOrVerticalTy, Alignment.INSTANCE.gh(), composer, 6);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierAz);
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
            H9N.j jVar = H9N.j.f3810n;
            TextKt.t(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composer, 6).gh(), composer, 0, 0, 65534);
            composer.eF(-698677319);
            if (str2 != null) {
                TextKt.t(str2, null, j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composer, 6).Ik(), composer, 0, 0, 65530);
            }
            composer.Xw();
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J2(final String title, final float f3, String str, long j2, boolean z2, Function0 function0, boolean z3, Composer composer, final int i2, final int i3) {
        int i5;
        String str2;
        int i7;
        long jUo;
        int i8;
        boolean z4;
        int i9;
        Function0 function02;
        int i10;
        Object objIF;
        Composer composer2;
        final boolean z5;
        final long j3;
        final String str3;
        final boolean z6;
        final Function0 function03;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer composerKN = composer.KN(-841272845);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(title) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.rl(f3) ? 32 : 16;
        }
        int i11 = i3 & 4;
        if (i11 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                str2 = str;
                i5 |= composerKN.p5(str2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
                jUo = j2;
            } else {
                jUo = j2;
                if ((i2 & 3072) == 0) {
                    i5 |= composerKN.nr(jUo) ? 2048 : 1024;
                }
            }
            i8 = i3 & 16;
            if (i8 == 0) {
                i5 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    z4 = z2;
                    i5 |= composerKN.n(z4) ? 16384 : 8192;
                }
                i9 = i3 & 32;
                if (i9 == 0) {
                    if ((196608 & i2) == 0) {
                        function02 = function0;
                        i5 |= composerKN.E2(function02) ? 131072 : 65536;
                    }
                    i10 = i3 & 64;
                    if (i10 == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i5 |= composerKN.n(z3) ? 1048576 : 524288;
                    }
                    if ((i5 & 599187) == 599186 || !composerKN.xMQ()) {
                        if (i11 != 0) {
                            str2 = null;
                        }
                        if (i7 != 0) {
                            jUo = Color.INSTANCE.Uo();
                        }
                        boolean z7 = i8 == 0 ? true : z4;
                        Function0 function04 = i9 == 0 ? null : function02;
                        boolean z9 = i10 == 0 ? true : z3;
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-841272845, i5, -1, "com.alightcreative.common.compose.components.ProgressDialog (ProgressDialog.kt:57)");
                        }
                        DialogProperties dialogProperties = new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null);
                        Modifier modifierKN = SizeKt.KN(PaddingKt.xMQ(Modifier.INSTANCE, Dp.KN(28)), 0.0f, 1, null);
                        composerKN.eF(-452857811);
                        objIF = composerKN.iF();
                        if (objIF == Composer.INSTANCE.n()) {
                            objIF = new Function0() { // from class: Dj7.iF
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return l4Z.Uo();
                                }
                            };
                            composerKN.o(objIF);
                        }
                        composerKN.Xw();
                        composer2 = composerKN;
                        boolean z10 = z9;
                        long j4 = jUo;
                        AndroidAlertDialog_androidKt.rl((Function0) objIF, ComposableLambdaKt.nr(145445035, true, new j(f3, z7, function04, z9), composerKN, 54), modifierKN, ComposableLambdaKt.nr(654223849, true, new n(title, str2, jUo), composerKN, 54), null, null, 0L, 0L, dialogProperties, composer2, 100666806, 240);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        Function0 function05 = function04;
                        z5 = z10;
                        j3 = j4;
                        str3 = str2;
                        z6 = z7;
                        function03 = function05;
                    } else {
                        composerKN.wTp();
                        z5 = z3;
                        composer2 = composerKN;
                        str3 = str2;
                        j3 = jUo;
                        z6 = z4;
                        function03 = function02;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.yg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return l4Z.KN(title, f3, str3, j3, z6, function03, z5, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 196608;
                function02 = function0;
                i10 = i3 & 64;
                if (i10 == 0) {
                }
                if ((i5 & 599187) == 599186) {
                    if (i11 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (ComposerKt.v()) {
                    }
                    DialogProperties dialogProperties2 = new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null);
                    Modifier modifierKN2 = SizeKt.KN(PaddingKt.xMQ(Modifier.INSTANCE, Dp.KN(28)), 0.0f, 1, null);
                    composerKN.eF(-452857811);
                    objIF = composerKN.iF();
                    if (objIF == Composer.INSTANCE.n()) {
                    }
                    composerKN.Xw();
                    composer2 = composerKN;
                    boolean z102 = z9;
                    long j42 = jUo;
                    AndroidAlertDialog_androidKt.rl((Function0) objIF, ComposableLambdaKt.nr(145445035, true, new j(f3, z7, function04, z9), composerKN, 54), modifierKN2, ComposableLambdaKt.nr(654223849, true, new n(title, str2, jUo), composerKN, 54), null, null, 0L, 0L, dialogProperties2, composer2, 100666806, 240);
                    if (ComposerKt.v()) {
                    }
                    Function0 function052 = function04;
                    z5 = z102;
                    j3 = j42;
                    str3 = str2;
                    z6 = z7;
                    function03 = function052;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z4 = z2;
            i9 = i3 & 32;
            if (i9 == 0) {
            }
            function02 = function0;
            i10 = i3 & 64;
            if (i10 == 0) {
            }
            if ((i5 & 599187) == 599186) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        str2 = str;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        i8 = i3 & 16;
        if (i8 == 0) {
        }
        z4 = z2;
        i9 = i3 & 32;
        if (i9 == 0) {
        }
        function02 = function0;
        i10 = i3 & 64;
        if (i10 == 0) {
        }
        if ((i5 & 599187) == 599186) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(String str, float f3, String str2, long j2, boolean z2, Function0 function0, boolean z3, int i2, int i3, Composer composer, int i5) {
        J2(str, f3, str2, j2, z2, function0, z3, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(float f3, long j2, int i2, int i3, Composer composer, int i5) {
        nr(f3, j2, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(final float f3, long j2, Composer composer, final int i2, final int i3) {
        int i5;
        long jT2;
        long j3;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1056674914);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (composerKN.rl(f3) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 48) == 0) {
                jT2 = j2;
                i5 |= composerKN.nr(jT2) ? 32 : 16;
            }
            if ((i5 & 19) == 18 || !composerKN.xMQ()) {
                if (i7 != 0) {
                    jT2 = aD.w6.t();
                }
                j3 = jT2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(1056674914, i5, -1, "com.alightcreative.common.compose.components.ProgressBar (ProgressDialog.kt:121)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierNr = BackgroundKt.nr(ClipKt.n(SizeKt.xMQ(SizeKt.KN(companion, 0.0f, 1, null), Dp.KN(4)), RoundedCornerShapeKt.n(50)), aD.w6.rl(), null, 2, null);
                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierNr);
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
                BoxKt.n(BackgroundKt.nr(ClipKt.n(SizeKt.Uo(SizeKt.nr(companion, 0.0f, 1, null), f3), RoundedCornerShapeKt.n(50)), j3, null, 2, null), composerKN, 0);
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            } else {
                composerKN.wTp();
                j3 = jT2;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                final long j4 = j3;
                scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.pO
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return l4Z.O(f3, j4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        jT2 = j2;
        if ((i5 & 19) == 18) {
            if (i7 != 0) {
            }
            j3 = jT2;
            if (ComposerKt.v()) {
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierNr2 = BackgroundKt.nr(ClipKt.n(SizeKt.xMQ(SizeKt.KN(companion3, 0.0f, 1, null), Dp.KN(4)), RoundedCornerShapeKt.n(50)), aD.w6.rl(), null, 2, null);
            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierNr2);
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
                BoxKt.n(BackgroundKt.nr(ClipKt.n(SizeKt.Uo(SizeKt.nr(companion3, 0.0f, 1, null), f3), RoundedCornerShapeKt.n(50)), j3, null, 2, null), composerKN, 0);
                composerKN.XQ();
                if (ComposerKt.v()) {
                }
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
