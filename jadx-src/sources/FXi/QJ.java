package FXi;

import FXi.s4;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.net.Toe.GDEJgAYrPQHfw;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.view.compose.FlowExtKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class QJ {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    /* synthetic */ class j extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f2637n = new j();

        j() {
            super(2, Yd.CN3.class, "startBrowserActivity", "startBrowserActivity(Ljava/lang/String;Landroid/content/Context;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((String) obj, (Context) obj2);
            return Unit.INSTANCE;
        }

        public final void n(String p0, Context p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Yd.CN3.rl(p0, p1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void mUb(final C1350c viewModel, final l3D style, Modifier modifier, final Function0 navigateToPrivacySettings, final Function0 navigateAway, Function2 function2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        Function2 function22;
        int i8;
        final Function0 function05;
        int i9;
        int i10;
        Function0 function06;
        int i11;
        int i12;
        Function2 function23;
        final Function0 function07;
        Function0 function08;
        Function0 function09;
        Function0 function010;
        boolean z2;
        Object objIF;
        boolean z3;
        Object objIF2;
        boolean z4;
        Object objIF3;
        final Function0 function011;
        boolean z5;
        Object objIF4;
        final Function0 function012;
        s4.j jVarT;
        final Function2 function24;
        final Modifier modifier3;
        Composer composer2;
        final Function0 function013;
        final Function0 function014;
        final Function0 function015;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(navigateToPrivacySettings, "navigateToPrivacySettings");
        Intrinsics.checkNotNullParameter(navigateAway, "navigateAway");
        Composer composerKN = composer.KN(-1779533221);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = ((i2 & 8) == 0 ? composerKN.p5(viewModel) : composerKN.E2(viewModel) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(style) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= composerKN.E2(navigateToPrivacySettings) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i5 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i5 |= composerKN.E2(navigateAway) ? 16384 : 8192;
            }
            i7 = i3 & 32;
            if (i7 == 0) {
                i5 |= 196608;
            } else {
                if ((196608 & i2) == 0) {
                    function22 = function2;
                    i5 |= composerKN.E2(function22) ? 131072 : 65536;
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                    function05 = function0;
                } else {
                    function05 = function0;
                    if ((i2 & 1572864) == 0) {
                        i5 |= composerKN.E2(function05) ? 1048576 : 524288;
                    }
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i5 |= composerKN.E2(function02) ? 8388608 : 4194304;
                }
                i10 = i3 & 256;
                if (i10 != 0) {
                    i5 |= 100663296;
                    function06 = function03;
                } else {
                    function06 = function03;
                    if ((i2 & 100663296) == 0) {
                        i5 |= composerKN.E2(function06) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                }
                i11 = i3 & 512;
                if (i11 == 0) {
                    if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i12 = i11;
                        i5 |= composerKN.E2(function04) ? 536870912 : 268435456;
                    }
                    if ((i5 & 306783379) == 306783378 || !composerKN.xMQ()) {
                        Modifier modifier4 = i13 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i7 == 0) {
                            composerKN.eF(-1007853853);
                            Object objIF5 = composerKN.iF();
                            if (objIF5 == Composer.INSTANCE.n()) {
                                objIF5 = j.f2637n;
                                composerKN.o(objIF5);
                            }
                            composerKN.Xw();
                            function23 = (Function2) ((KFunction) objIF5);
                        } else {
                            function23 = function22;
                        }
                        if (i8 != 0) {
                            composerKN.eF(-1007851920);
                            Object objIF6 = composerKN.iF();
                            if (objIF6 == Composer.INSTANCE.n()) {
                                objIF6 = new Function0() { // from class: FXi.Dsr
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return QJ.ck();
                                    }
                                };
                                composerKN.o(objIF6);
                            }
                            composerKN.Xw();
                            function05 = (Function0) objIF6;
                        }
                        if (i9 == 0) {
                            composerKN.eF(-1007850576);
                            Object objIF7 = composerKN.iF();
                            if (objIF7 == Composer.INSTANCE.n()) {
                                objIF7 = new Function0() { // from class: FXi.aC
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return QJ.Ik();
                                    }
                                };
                                composerKN.o(objIF7);
                            }
                            composerKN.Xw();
                            function07 = (Function0) objIF7;
                        } else {
                            function07 = function02;
                        }
                        if (i10 != 0) {
                            composerKN.eF(-1007849360);
                            Object objIF8 = composerKN.iF();
                            if (objIF8 == Composer.INSTANCE.n()) {
                                objIF8 = new Function0() { // from class: FXi.C
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return QJ.r();
                                    }
                                };
                                composerKN.o(objIF8);
                            }
                            function06 = (Function0) objIF8;
                            composerKN.Xw();
                        }
                        if (i12 == 0) {
                            composerKN.eF(-1007847760);
                            Object objIF9 = composerKN.iF();
                            if (objIF9 == Composer.INSTANCE.n()) {
                                objIF9 = new Function0() { // from class: FXi.o
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return QJ.o();
                                    }
                                };
                                composerKN.o(objIF9);
                            }
                            function08 = (Function0) objIF9;
                            composerKN.Xw();
                        } else {
                            function08 = function04;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1779533221, i5, -1, GDEJgAYrPQHfw.jCshhfmCSGKX);
                        }
                        Context context = (Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo());
                        int i14 = i5;
                        function09 = function06;
                        function010 = function08;
                        Modifier modifier5 = modifier4;
                        s4 s4Var = (s4) FlowExtKt.t(viewModel.t(), null, null, null, composerKN, 0, 7).getValue();
                        boolean zNr = s4Var.nr();
                        composerKN.eF(-1007840540);
                        int i15 = i14 & 14;
                        z2 = ((i14 & 3670016) != 1048576) | (i15 != 4 || ((i14 & 8) != 0 && composerKN.E2(viewModel)));
                        objIF = composerKN.iF();
                        if (!z2 || objIF == Composer.INSTANCE.n()) {
                            objIF = new Function0() { // from class: FXi.qz
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return QJ.gh(viewModel, function05);
                                }
                            };
                            composerKN.o(objIF);
                        }
                        Function0 function016 = (Function0) objIF;
                        composerKN.Xw();
                        composerKN.eF(-1007836764);
                        z3 = ((i14 & 29360128) != 8388608) | (i15 != 4 || ((i14 & 8) != 0 && composerKN.E2(viewModel)));
                        objIF2 = composerKN.iF();
                        if (!z3 || objIF2 == Composer.INSTANCE.n()) {
                            objIF2 = new Function0() { // from class: FXi.Pl
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return QJ.qie(viewModel, function07);
                                }
                            };
                            composerKN.o(objIF2);
                        }
                        Function0 function017 = (Function0) objIF2;
                        composerKN.Xw();
                        composerKN.eF(-1007833124);
                        z4 = (i15 != 4 || ((i14 & 8) != 0 && composerKN.E2(viewModel))) | ((i14 & 234881024) != 67108864);
                        objIF3 = composerKN.iF();
                        if (!z4 || objIF3 == Composer.INSTANCE.n()) {
                            function011 = function09;
                            objIF3 = new Function0() { // from class: FXi.Xo
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return QJ.az(viewModel, function011);
                                }
                            };
                            composerKN.o(objIF3);
                        } else {
                            function011 = function09;
                        }
                        Function0 function018 = (Function0) objIF3;
                        composerKN.Xw();
                        composerKN.eF(-1007829324);
                        Function0 function019 = function011;
                        z5 = ((i14 & 1879048192) != 536870912) | (i15 != 4 || ((i14 & 8) != 0 && composerKN.E2(viewModel)));
                        objIF4 = composerKN.iF();
                        if (!z5 || objIF4 == Composer.INSTANCE.n()) {
                            function012 = function010;
                            objIF4 = new Function0() { // from class: FXi.eO
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return QJ.ty(viewModel, function012);
                                }
                            };
                            composerKN.o(objIF4);
                        } else {
                            function012 = function010;
                        }
                        composerKN.Xw();
                        Function0 function020 = function07;
                        Function0 function021 = function012;
                        Ml.xMQ(modifier5, style, zNr, function016, function017, function018, (Function0) objIF4, composerKN, ((i14 >> 6) & 14) | (i14 & 112), 0);
                        jVarT = s4Var.t();
                        if (jVarT != null) {
                            if (jVarT instanceof s4.j.C0090j) {
                                navigateAway.invoke();
                            } else if (jVarT instanceof s4.j.n) {
                                navigateToPrivacySettings.invoke();
                            } else {
                                if (!(jVarT instanceof s4.j.w6)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                function23.invoke(((s4.j.w6) jVarT).n(), context);
                            }
                            viewModel.ck();
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        function24 = function23;
                        modifier3 = modifier5;
                        composer2 = composerKN;
                        function013 = function020;
                        function014 = function019;
                        function015 = function021;
                    } else {
                        composerKN.wTp();
                        function015 = function04;
                        modifier3 = modifier2;
                        composer2 = composerKN;
                        function24 = function22;
                        function013 = function02;
                        function014 = function06;
                    }
                    final Function0 function022 = function05;
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2() { // from class: FXi.z
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return QJ.HI(viewModel, style, modifier3, navigateToPrivacySettings, navigateAway, function24, function022, function013, function014, function015, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                i12 = i11;
                if ((i5 & 306783379) == 306783378) {
                    if (i13 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.v()) {
                    }
                    Context context2 = (Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo());
                    int i142 = i5;
                    function09 = function06;
                    function010 = function08;
                    Modifier modifier52 = modifier4;
                    s4 s4Var2 = (s4) FlowExtKt.t(viewModel.t(), null, null, null, composerKN, 0, 7).getValue();
                    boolean zNr2 = s4Var2.nr();
                    composerKN.eF(-1007840540);
                    int i152 = i142 & 14;
                    if (i152 != 4) {
                        z2 = ((i142 & 3670016) != 1048576) | (i152 != 4 || ((i142 & 8) != 0 && composerKN.E2(viewModel)));
                        objIF = composerKN.iF();
                        if (!z2) {
                            objIF = new Function0() { // from class: FXi.qz
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return QJ.gh(viewModel, function05);
                                }
                            };
                            composerKN.o(objIF);
                            Function0 function0162 = (Function0) objIF;
                            composerKN.Xw();
                            composerKN.eF(-1007836764);
                            if (i152 != 4) {
                                z3 = ((i142 & 29360128) != 8388608) | (i152 != 4 || ((i142 & 8) != 0 && composerKN.E2(viewModel)));
                                objIF2 = composerKN.iF();
                                if (!z3) {
                                    objIF2 = new Function0() { // from class: FXi.Pl
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return QJ.qie(viewModel, function07);
                                        }
                                    };
                                    composerKN.o(objIF2);
                                    Function0 function0172 = (Function0) objIF2;
                                    composerKN.Xw();
                                    composerKN.eF(-1007833124);
                                    if (i152 != 4) {
                                        z4 = (i152 != 4 || ((i142 & 8) != 0 && composerKN.E2(viewModel))) | ((i142 & 234881024) != 67108864);
                                        objIF3 = composerKN.iF();
                                        if (z4) {
                                            function011 = function09;
                                            objIF3 = new Function0() { // from class: FXi.Xo
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return QJ.az(viewModel, function011);
                                                }
                                            };
                                            composerKN.o(objIF3);
                                            Function0 function0182 = (Function0) objIF3;
                                            composerKN.Xw();
                                            composerKN.eF(-1007829324);
                                            if (i152 != 4) {
                                                Function0 function0192 = function011;
                                                z5 = ((i142 & 1879048192) != 536870912) | (i152 != 4 || ((i142 & 8) != 0 && composerKN.E2(viewModel)));
                                                objIF4 = composerKN.iF();
                                                if (z5) {
                                                    function012 = function010;
                                                    objIF4 = new Function0() { // from class: FXi.eO
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return QJ.ty(viewModel, function012);
                                                        }
                                                    };
                                                    composerKN.o(objIF4);
                                                    composerKN.Xw();
                                                    Function0 function0202 = function07;
                                                    Function0 function0212 = function012;
                                                    Ml.xMQ(modifier52, style, zNr2, function0162, function0172, function0182, (Function0) objIF4, composerKN, ((i142 >> 6) & 14) | (i142 & 112), 0);
                                                    jVarT = s4Var2.t();
                                                    if (jVarT != null) {
                                                    }
                                                    if (ComposerKt.v()) {
                                                    }
                                                    function24 = function23;
                                                    modifier3 = modifier52;
                                                    composer2 = composerKN;
                                                    function013 = function0202;
                                                    function014 = function0192;
                                                    function015 = function0212;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                final Function0 function0222 = function05;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            function22 = function2;
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            i10 = i3 & 256;
            if (i10 != 0) {
            }
            i11 = i3 & 512;
            if (i11 == 0) {
            }
            i12 = i11;
            if ((i5 & 306783379) == 306783378) {
            }
            final Function0 function02222 = function05;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        function22 = function2;
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        i10 = i3 & 256;
        if (i10 != 0) {
        }
        i11 = i3 & 512;
        if (i11 == 0) {
        }
        i12 = i11;
        if ((i5 & 306783379) == 306783378) {
        }
        final Function0 function022222 = function05;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(C1350c c1350c, l3D l3d, Modifier modifier, Function0 function0, Function0 function02, Function2 function2, Function0 function03, Function0 function04, Function0 function05, Function0 function06, int i2, int i3, Composer composer, int i5) {
        mUb(c1350c, l3d, modifier, function0, function02, function2, function03, function04, function05, function06, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ik() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(C1350c c1350c, Function0 function0) {
        c1350c.az();
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(C1350c c1350c, Function0 function0) {
        c1350c.qie();
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(C1350c c1350c, Function0 function0) {
        c1350c.ty();
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ty(C1350c c1350c, Function0 function0) {
        c1350c.HI();
        function0.invoke();
        return Unit.INSTANCE;
    }
}
