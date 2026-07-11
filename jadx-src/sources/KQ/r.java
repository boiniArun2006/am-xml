package KQ;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
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
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import jOL.w6;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class r {

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Xo f5356n;

        j(Xo xo) {
            this.f5356n = xo;
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
                ComposerKt.p5(-1024451408, i2, -1, "com.alightcreative.app.motion.activities.survey.ui.Footer.<anonymous> (SurveyScreen.kt:171)");
            }
            Dj7.eO.J2(this.f5356n.rl(), this.f5356n.t(), SizeKt.KN(PaddingKt.xMQ(Modifier.INSTANCE, Dp.KN(16)), 0.0f, 1, null), null, Dj7.CN3.f1597n, null, 0, 0, 0.0f, null, null, null, this.f5356n.n(), composer, 24960, 0, 4072);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class n implements Function2 {
        final /* synthetic */ KQ.n J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f5357O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ boolean f5358S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Function0 f5359Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0 f5360g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ eO f5361n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f5362o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Xo f5363r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Map f5364t;

        n(eO eOVar, Map map, Function1 function1, KQ.n nVar, Xo xo, boolean z2, Function0 function0, boolean z3, Function0 function02) {
            this.f5361n = eOVar;
            this.f5364t = map;
            this.f5357O = function1;
            this.J2 = nVar;
            this.f5363r = xo;
            this.f5362o = z2;
            this.f5359Z = function0;
            this.f5358S = z3;
            this.f5360g = function02;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            boolean z2;
            w6.j jVar;
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(733084709, i2, -1, "com.alightcreative.app.motion.activities.survey.ui.SurveyScreen.<anonymous> (SurveyScreen.kt:67)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierJ2 = SizeKt.J2(companion, 0.0f, 1, null);
            eO eOVar = this.f5361n;
            Map map = this.f5364t;
            Function1 function1 = this.f5357O;
            KQ.n nVar = this.J2;
            Xo xo = this.f5363r;
            boolean z3 = this.f5362o;
            Function0 function0 = this.f5359Z;
            boolean z4 = this.f5358S;
            Function0 function02 = this.f5360g;
            Arrangement.Vertical verticalUo = Arrangement.f17400n.Uo();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion2.gh(), composer, 0);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierJ2);
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
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN2 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk2 = composer.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer, companion);
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
            Updater.O(composerN2, measurePolicyUo, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            if (z3) {
                z2 = true;
                jVar = new w6.j(2131231008, true, function0);
            } else {
                z2 = true;
                jVar = null;
            }
            composer.eF(300665859);
            w6.n nVar2 = z4 ? new w6.n(StringResources_androidKt.t(2132019791, composer, 6), z2, function02) : null;
            composer.Xw();
            jOL.fuX.Uo(null, null, null, null, jVar, nVar2, 0.0f, composer, 0, 79);
            r.mUb(eOVar.J2(), eOVar.Uo(), boxScopeInstance.n(companion, companion2.O()), 0L, 0L, 0.0f, 0.0f, 0.0f, 0.0f, null, composer, 0, 1016);
            composer.XQ();
            qz.ck(ColumnScope.rl(columnScopeInstance, companion, 1.0f, false, 2, null), eOVar, map, function1, nVar, composer, 0);
            r.KN(xo, composer, 0);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ck(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(int i2) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ik(Modifier modifier, eO eOVar, Xo xo, Map map, boolean z2, boolean z3, Function0 function0, Function0 function02, Function1 function1, KQ.n nVar, int i2, int i3, Composer composer, int i5) {
        qie(modifier, eOVar, xo, map, z2, z3, function0, function02, function1, nVar, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(int i2, int i3, Modifier modifier, long j2, long j3, float f3, float f4, float f5, float f6, Shape shape, int i5, int i7, Composer composer, int i8) {
        mUb(i2, i3, modifier, j2, j3, f3, f4, f5, f6, shape, composer, RecomposeScopeImplKt.n(i5 | 1), i7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void mUb(final int i2, final int i3, Modifier modifier, long j2, long j3, float f3, float f4, float f5, float f6, Shape shape, Composer composer, final int i5, final int i7) {
        int i8;
        Modifier modifier2;
        int i9;
        int i10;
        int i11;
        final long jWTp;
        int i12;
        float fKN;
        int i13;
        final float fKN2;
        int i14;
        float fKN3;
        int i15;
        float fKN4;
        Shape shapeN;
        long j4;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        int i16;
        final float f7;
        final float f8;
        final float f9;
        final long j5;
        Composer composer2;
        final Shape shape2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(604086684);
        if ((i7 & 1) != 0) {
            i8 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i8 = (composerKN.t(i2) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        if ((2 & i7) != 0) {
            i8 |= 48;
        } else if ((i5 & 48) == 0) {
            i8 |= composerKN.t(i3) ? 32 : 16;
        }
        int i17 = i7 & 4;
        if (i17 == 0) {
            if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i8 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i9 = i7 & 8;
            if (i9 == 0) {
                i8 |= 3072;
            } else if ((i5 & 3072) == 0) {
                i8 |= composerKN.nr(j2) ? 2048 : 1024;
            }
            i10 = i7 & 16;
            if (i10 == 0) {
                i8 |= 24576;
                i11 = i17;
                jWTp = j3;
            } else {
                i11 = i17;
                jWTp = j3;
                if ((i5 & 24576) == 0) {
                    i8 |= composerKN.nr(jWTp) ? 16384 : 8192;
                }
            }
            i12 = i7 & 32;
            if (i12 == 0) {
                i8 |= 196608;
                fKN = f3;
            } else {
                fKN = f3;
                if ((i5 & 196608) == 0) {
                    i8 |= composerKN.rl(fKN) ? 131072 : 65536;
                }
            }
            i13 = i7 & 64;
            if (i13 == 0) {
                i8 |= 1572864;
                fKN2 = f4;
            } else {
                fKN2 = f4;
                if ((i5 & 1572864) == 0) {
                    i8 |= composerKN.rl(fKN2) ? 1048576 : 524288;
                }
            }
            i14 = 128 & i7;
            if (i14 == 0) {
                i8 |= 12582912;
                fKN3 = f5;
            } else {
                fKN3 = f5;
                if ((i5 & 12582912) == 0) {
                    i8 |= composerKN.rl(fKN3) ? 8388608 : 4194304;
                }
            }
            i15 = 256 & i7;
            if (i15 == 0) {
                i8 |= 100663296;
                fKN4 = f6;
            } else {
                fKN4 = f6;
                if ((i5 & 100663296) == 0) {
                    i8 |= composerKN.rl(fKN4) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                }
            }
            if ((i5 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                i8 |= ((i7 & 512) == 0 && composerKN.p5(shape)) ? 536870912 : 268435456;
            }
            if ((306783379 & i8) == 306783378 || !composerKN.xMQ()) {
                composerKN.e();
                if ((i5 & 1) != 0 || composerKN.rV9()) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    long jNHg = i9 == 0 ? aD.w6.nHg() : j2;
                    if (i10 != 0) {
                        jWTp = aD.w6.wTp();
                    }
                    if (i12 != 0) {
                        fKN = Dp.KN(6);
                    }
                    if (i13 != 0) {
                        fKN2 = Dp.KN(6);
                    }
                    if (i14 != 0) {
                        fKN3 = Dp.KN(16);
                    }
                    if (i15 != 0) {
                        fKN4 = Dp.KN(8);
                    }
                    if ((i7 & 512) == 0) {
                        i8 &= -1879048193;
                        shapeN = RoundedCornerShapeKt.n(50);
                    } else {
                        shapeN = shape;
                    }
                    j4 = jNHg;
                } else {
                    composerKN.wTp();
                    if ((i7 & 512) != 0) {
                        i8 &= -1879048193;
                    }
                    j4 = j2;
                    shapeN = shape;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(604086684, i8, -1, "com.alightcreative.app.motion.activities.survey.ui.SurveyQuestionIndicator (SurveyScreen.kt:124)");
                }
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.KN(), false);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifier2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Modifier modifier4 = modifier2;
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
                Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(fKN4);
                Alignment.Vertical verticalXMQ = companion.xMQ();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalTy, verticalXMQ, composerKN, 48);
                iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, companion3);
                Function0 function0N2 = companion2.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                    composerKN.r();
                } else {
                    composerKN.s7N(function0N2);
                }
                composerN2 = Updater.n(composerKN);
                float f10 = fKN4;
                Updater.O(composerN2, measurePolicyRl, companion2.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
                function2Rl2 = companion2.rl();
                if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion2.nr());
                RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                composerKN.eF(2089674057);
                for (i16 = 0; i16 < i2; i16++) {
                    if (i16 == i3) {
                        composerKN.eF(1850103347);
                        BoxKt.n(BackgroundKt.t(SizeKt.S(Modifier.INSTANCE, fKN3, fKN), j4, shapeN), composerKN, 0);
                        composerKN.Xw();
                    } else {
                        composerKN.eF(1850581615);
                        BoxKt.n(BackgroundKt.t(SizeKt.S(Modifier.INSTANCE, fKN2, fKN), jWTp, shapeN), composerKN, 0);
                        composerKN.Xw();
                    }
                }
                composerKN.Xw();
                composerKN.XQ();
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                f7 = fKN;
                f8 = fKN3;
                f9 = f10;
                j5 = j4;
                composer2 = composerKN;
                shape2 = shapeN;
                modifier3 = modifier4;
            } else {
                composerKN.wTp();
                float f11 = fKN3;
                f9 = fKN4;
                f8 = f11;
                modifier3 = modifier2;
                composer2 = composerKN;
                shape2 = shape;
                f7 = fKN;
                j5 = j2;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: KQ.Q
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return r.gh(i2, i3, modifier3, j5, jWTp, f7, fKN2, f8, f9, shape2, i5, i7, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        modifier2 = modifier;
        i9 = i7 & 8;
        if (i9 == 0) {
        }
        i10 = i7 & 16;
        if (i10 == 0) {
        }
        i12 = i7 & 32;
        if (i12 == 0) {
        }
        i13 = i7 & 64;
        if (i13 == 0) {
        }
        i14 = 128 & i7;
        if (i14 == 0) {
        }
        i15 = 256 & i7;
        if (i15 == 0) {
        }
        if ((i5 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        if ((306783379 & i8) == 306783378) {
            composerKN.e();
            if ((i5 & 1) != 0) {
                if (i11 != 0) {
                }
                if (i9 == 0) {
                }
                if (i10 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if ((i7 & 512) == 0) {
                }
                j4 = jNHg;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion4.KN(), false);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifier2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Modifier modifier42 = modifier2;
                Function0 function0N3 = companion22.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyUo2, companion22.t());
                Updater.O(composerN, compositionLocalMapIk3, companion22.O());
                function2Rl = companion22.rl();
                if (!composerN.getInserting()) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                    Updater.O(composerN, modifierO3, companion22.nr());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalTy2 = Arrangement.f17400n.ty(fKN4);
                    Alignment.Vertical verticalXMQ2 = companion4.xMQ();
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRl2 = RowKt.rl(horizontalOrVerticalTy2, verticalXMQ2, composerKN, 48);
                    iN2 = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                    Modifier modifierO22 = ComposedModifierKt.O(composerKN, companion32);
                    Function0 function0N22 = companion22.n();
                    if (composerKN.getApplier() == null) {
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                    }
                    composerN2 = Updater.n(composerKN);
                    float f102 = fKN4;
                    Updater.O(composerN2, measurePolicyRl2, companion22.t());
                    Updater.O(composerN2, compositionLocalMapIk22, companion22.O());
                    function2Rl2 = companion22.rl();
                    if (!composerN2.getInserting()) {
                        composerN2.o(Integer.valueOf(iN2));
                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                        Updater.O(composerN2, modifierO22, companion22.nr());
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                        composerKN.eF(2089674057);
                        while (i16 < i2) {
                        }
                        composerKN.Xw();
                        composerKN.XQ();
                        composerKN.XQ();
                        if (ComposerKt.v()) {
                        }
                        f7 = fKN;
                        f8 = fKN3;
                        f9 = f102;
                        j5 = j4;
                        composer2 = composerKN;
                        shape2 = shapeN;
                        modifier3 = modifier42;
                    }
                }
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void qie(Modifier modifier, final eO surveyPageUIModel, final Xo ctaButton, Map map, boolean z2, boolean z3, Function0 function0, Function0 function02, Function1 function1, KQ.n nVar, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        Map mapEmptyMap;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        int i9;
        Function0 function03;
        int i10;
        int i11;
        int i12;
        int i13;
        Function0 function04;
        Function0 function05;
        Function1 function12;
        Function0 function06;
        Function0 function07;
        Function1 function13;
        int i14;
        Map map2;
        boolean z6;
        final boolean z7;
        KQ.n nVar2;
        Composer composer2;
        final KQ.n nVar3;
        final boolean z9;
        final Modifier modifier3;
        final Map map3;
        final Function0 function08;
        final Function0 function09;
        final Function1 function14;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i15;
        Intrinsics.checkNotNullParameter(surveyPageUIModel, "surveyPageUIModel");
        Intrinsics.checkNotNullParameter(ctaButton, "ctaButton");
        Composer composerKN = composer.KN(454067425);
        int i16 = i3 & 1;
        if (i16 != 0) {
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
            i5 |= composerKN.E2(surveyPageUIModel) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(ctaButton) ? 256 : 128;
        }
        int i17 = i3 & 8;
        if (i17 != 0) {
            i5 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                mapEmptyMap = map;
                i5 |= composerKN.E2(mapEmptyMap) ? 2048 : 1024;
            }
            i7 = i3 & 16;
            if (i7 == 0) {
                i5 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    z4 = z2;
                    i5 |= composerKN.n(z4) ? 16384 : 8192;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                } else {
                    if ((196608 & i2) == 0) {
                        z5 = z3;
                        i5 |= composerKN.n(z5) ? 131072 : 65536;
                    }
                    i9 = i3 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                        function03 = function0;
                    } else {
                        function03 = function0;
                        if ((i2 & 1572864) == 0) {
                            i5 |= composerKN.E2(function03) ? 1048576 : 524288;
                        }
                    }
                    i10 = i3 & 128;
                    if (i10 == 0) {
                        i5 |= 12582912;
                    } else {
                        if ((i2 & 12582912) == 0) {
                            i11 = i10;
                            i5 |= composerKN.E2(function02) ? 8388608 : 4194304;
                        }
                        i12 = i3 & 256;
                        if (i12 == 0) {
                            if ((i2 & 100663296) == 0) {
                                i13 = i12;
                                i5 |= composerKN.E2(function1) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                if ((i3 & 512) != 0) {
                                    i15 = 268435456;
                                    i5 |= i15;
                                } else {
                                    if ((1073741824 & i2) == 0 ? composerKN.p5(nVar) : composerKN.E2(nVar)) {
                                        i15 = 536870912;
                                    }
                                    i5 |= i15;
                                }
                            }
                            if ((306783379 & i5) == 306783378 || !composerKN.xMQ()) {
                                composerKN.e();
                                if ((i2 & 1) != 0 || composerKN.rV9()) {
                                    if (i16 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i17 != 0) {
                                        mapEmptyMap = MapsKt.emptyMap();
                                    }
                                    if (i7 != 0) {
                                        z4 = false;
                                    }
                                    if (i8 != 0) {
                                        z5 = false;
                                    }
                                    if (i9 == 0) {
                                        composerKN.eF(-467641471);
                                        Object objIF = composerKN.iF();
                                        if (objIF == Composer.INSTANCE.n()) {
                                            objIF = new Function0() { // from class: KQ.z
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return r.az();
                                                }
                                            };
                                            composerKN.o(objIF);
                                        }
                                        function04 = (Function0) objIF;
                                        composerKN.Xw();
                                    } else {
                                        function04 = function03;
                                    }
                                    if (i11 == 0) {
                                        composerKN.eF(-467640383);
                                        Object objIF2 = composerKN.iF();
                                        if (objIF2 == Composer.INSTANCE.n()) {
                                            objIF2 = new Function0() { // from class: KQ.QJ
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return r.ty();
                                                }
                                            };
                                            composerKN.o(objIF2);
                                        }
                                        function05 = (Function0) objIF2;
                                        composerKN.Xw();
                                    } else {
                                        function05 = function02;
                                    }
                                    if (i13 == 0) {
                                        composerKN.eF(-467639135);
                                        Object objIF3 = composerKN.iF();
                                        if (objIF3 == Composer.INSTANCE.n()) {
                                            objIF3 = new Function1() { // from class: KQ.l3D
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return r.HI(((Integer) obj).intValue());
                                                }
                                            };
                                            composerKN.o(objIF3);
                                        }
                                        function12 = (Function1) objIF3;
                                        composerKN.Xw();
                                    } else {
                                        function12 = function1;
                                    }
                                    if ((i3 & 512) == 0) {
                                        composerKN.eF(-467637214);
                                        Object objIF4 = composerKN.iF();
                                        if (objIF4 == Composer.INSTANCE.n()) {
                                            objIF4 = new KQ.n() { // from class: KQ.c
                                                @Override // KQ.n
                                                public final void n(String str, String str2) {
                                                    r.ck(str, str2);
                                                }
                                            };
                                            composerKN.o(objIF4);
                                        }
                                        composerKN.Xw();
                                        function06 = function04;
                                        function13 = function12;
                                        i14 = i5 & (-1879048193);
                                        nVar2 = (KQ.n) objIF4;
                                        z7 = z5;
                                        function07 = function05;
                                        map2 = mapEmptyMap;
                                        z6 = z4;
                                    } else {
                                        function06 = function04;
                                        function07 = function05;
                                        function13 = function12;
                                        i14 = i5;
                                        map2 = mapEmptyMap;
                                        z6 = z4;
                                        z7 = z5;
                                        nVar2 = nVar;
                                    }
                                } else {
                                    composerKN.wTp();
                                    if ((i3 & 512) != 0) {
                                        i5 &= -1879048193;
                                    }
                                    function07 = function02;
                                    function13 = function1;
                                    nVar2 = nVar;
                                    function06 = function03;
                                    i14 = i5;
                                    map2 = mapEmptyMap;
                                    z6 = z4;
                                    z7 = z5;
                                }
                                Modifier modifier4 = modifier2;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(454067425, i14, -1, "com.alightcreative.app.motion.activities.survey.ui.SurveyScreen (SurveyScreen.kt:65)");
                                }
                                Map map4 = map2;
                                composer2 = composerKN;
                                SurfaceKt.n(modifier4, null, aD.w6.z(), 0L, null, 0.0f, ComposableLambdaKt.nr(733084709, true, new n(surveyPageUIModel, map2, function13, nVar2, ctaButton, z7, function07, z6, function06), composerKN, 54), composer2, (i14 & 14) | 1573248, 58);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                nVar3 = nVar2;
                                z9 = z6;
                                modifier3 = modifier4;
                                map3 = map4;
                                function08 = function07;
                                function09 = function06;
                                function14 = function13;
                            } else {
                                composerKN.wTp();
                                function14 = function1;
                                function09 = function03;
                                modifier3 = modifier2;
                                map3 = mapEmptyMap;
                                composer2 = composerKN;
                                z9 = z4;
                                z7 = z5;
                                function08 = function02;
                                nVar3 = nVar;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2() { // from class: KQ.s4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return r.Ik(modifier3, surveyPageUIModel, ctaButton, map3, z9, z7, function09, function08, function14, nVar3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= 100663296;
                        i13 = i12;
                        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        }
                        if ((306783379 & i5) == 306783378) {
                            composerKN.e();
                            if ((i2 & 1) != 0) {
                                if (i16 != 0) {
                                }
                                if (i17 != 0) {
                                }
                                if (i7 != 0) {
                                }
                                if (i8 != 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if ((i3 & 512) == 0) {
                                }
                                Modifier modifier42 = modifier2;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                Map map42 = map2;
                                composer2 = composerKN;
                                SurfaceKt.n(modifier42, null, aD.w6.z(), 0L, null, 0.0f, ComposableLambdaKt.nr(733084709, true, new n(surveyPageUIModel, map2, function13, nVar2, ctaButton, z7, function07, z6, function06), composerKN, 54), composer2, (i14 & 14) | 1573248, 58);
                                if (ComposerKt.v()) {
                                }
                                nVar3 = nVar2;
                                z9 = z6;
                                modifier3 = modifier42;
                                map3 = map42;
                                function08 = function07;
                                function09 = function06;
                                function14 = function13;
                            }
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i11 = i10;
                    i12 = i3 & 256;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    }
                    if ((306783379 & i5) == 306783378) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                z5 = z3;
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                i10 = i3 & 128;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i3 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                }
                if ((306783379 & i5) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z4 = z2;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            z5 = z3;
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            i10 = i3 & 128;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i3 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            }
            if ((306783379 & i5) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        mapEmptyMap = map;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        z4 = z2;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        z5 = z3;
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        i10 = i3 & 128;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i3 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        if ((306783379 & i5) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ty() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(Xo xo, int i2, Composer composer, int i3) {
        KN(xo, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(final Xo xo, Composer composer, final int i2) {
        int i3;
        int i5;
        Composer composerKN = composer.KN(2139410829);
        if ((i2 & 6) == 0) {
            if (composerKN.p5(xo)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(2139410829, i3, -1, "com.alightcreative.app.motion.activities.survey.ui.Footer (SurveyScreen.kt:165)");
            }
            CardKt.n(null, RectangleShapeKt.n(), aD.w6.z(), 0L, null, Dp.KN(0), ComposableLambdaKt.nr(-1024451408, true, new j(xo), composerKN, 54), composerKN, 1769904, 25);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: KQ.UGc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r.xMQ(xo, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
