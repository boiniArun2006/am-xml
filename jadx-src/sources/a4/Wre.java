package a4;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Wre {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J2(final CN3 onboardingPagerState, final boolean z2, final Function0 onNextClicked, final Function0 onGotItClicked, final Function0 onSkipClicked, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Alignment.Companion companion;
        Composer composer2;
        int i7;
        Modifier modifier3;
        BoxScopeInstance boxScopeInstance;
        int i8;
        boolean z3;
        Composer composer3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(onboardingPagerState, "onboardingPagerState");
        Intrinsics.checkNotNullParameter(onNextClicked, "onNextClicked");
        Intrinsics.checkNotNullParameter(onGotItClicked, "onGotItClicked");
        Intrinsics.checkNotNullParameter(onSkipClicked, "onSkipClicked");
        Composer composerKN = composer.KN(-1389563548);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(onboardingPagerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.n(z2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onNextClicked) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(onGotItClicked) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i5 |= composerKN.E2(onSkipClicked) ? 16384 : 8192;
        }
        int i9 = i3 & 32;
        if (i9 == 0) {
            if ((196608 & i2) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i5) == 74898 || !composerKN.xMQ()) {
                Modifier modifier5 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1389563548, i5, -1, "com.alightcreative.onboarding.ui.components.OnboardingPagerController (OnboardingPagerController.kt:71)");
                }
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifier5);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0 function0N = companion3.n();
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
                Updater.O(composerN, measurePolicyUo, companion3.t());
                Updater.O(composerN, compositionLocalMapIk, companion3.O());
                function2Rl = companion3.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion3.nr());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                composerKN.eF(466734827);
                if (z2) {
                    companion = companion2;
                    composer2 = composerKN;
                    i7 = i5;
                    modifier3 = modifier5;
                    boxScopeInstance = boxScopeInstance2;
                    i8 = 6;
                } else {
                    String strT = StringResources_androidKt.t(2132019791, composerKN, 6);
                    Modifier modifierN = boxScopeInstance2.n(Modifier.INSTANCE, companion2.KN());
                    composerKN.eF(466741890);
                    boolean z4 = (57344 & i5) == 16384;
                    Object objIF = composerKN.iF();
                    if (z4 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function0() { // from class: a4.j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Wre.Uo(onSkipClicked);
                            }
                        };
                        composerKN.o(objIF);
                    }
                    composerKN.Xw();
                    Modifier modifierJ2 = ClickableKt.J2(modifierN, false, null, null, (Function0) objIF, 7, null);
                    TextAlign textAlignKN = TextAlign.KN(TextAlign.INSTANCE.n());
                    TextStyle textStyleGh = H9N.j.f3810n.rl(composerKN, 6).gh();
                    modifier3 = modifier5;
                    companion = companion2;
                    boxScopeInstance = boxScopeInstance2;
                    composer2 = composerKN;
                    i7 = i5;
                    i8 = 6;
                    TextKt.t(strT, modifierJ2, 0L, 0L, null, null, null, 0L, null, textAlignKN, 0L, 0, false, 0, 0, null, textStyleGh, composer2, 0, 0, 65020);
                }
                composer2.Xw();
                PagerState pagerStateN = onboardingPagerState.n();
                int size = onboardingPagerState.rl().size();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Composer composer4 = composer2;
                gh(pagerStateN, size, boxScopeInstance.n(companion4, companion.O()), 0L, 0L, 0.0f, 0.0f, 0.0f, 0.0f, null, composer4, 0, 1016);
                if (onboardingPagerState.t()) {
                    composer4.eF(1584888413);
                    String strT2 = StringResources_androidKt.t(2132019778, composer4, i8);
                    Modifier modifierN2 = boxScopeInstance.n(companion4, companion.J2());
                    composer4.eF(466773314);
                    z3 = (i7 & 896) == 256;
                    Object objIF2 = composer4.iF();
                    if (z3 || objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new Function0() { // from class: a4.w6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Wre.xMQ(onNextClicked);
                            }
                        };
                        composer4.o(objIF2);
                    }
                    composer4.Xw();
                    composer3 = composer4;
                    TextKt.t(strT2, ClickableKt.J2(modifierN2, false, null, null, (Function0) objIF2, 7, null), 0L, 0L, null, null, null, 0L, null, TextAlign.KN(TextAlign.INSTANCE.n()), 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composer4, i8).gh(), composer3, 0, 0, 65020);
                    composer3.Xw();
                } else {
                    composer4.eF(1584531665);
                    String strT3 = StringResources_androidKt.t(2132019777, composer4, i8);
                    Modifier modifierN3 = boxScopeInstance.n(companion4, companion.J2());
                    composer4.eF(466762147);
                    z3 = (i7 & 7168) == 2048;
                    Object objIF3 = composer4.iF();
                    if (z3 || objIF3 == Composer.INSTANCE.n()) {
                        objIF3 = new Function0() { // from class: a4.n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Wre.KN(onGotItClicked);
                            }
                        };
                        composer4.o(objIF3);
                    }
                    composer4.Xw();
                    composer3 = composer4;
                    TextKt.t(strT3, ClickableKt.J2(modifierN3, false, null, null, (Function0) objIF3, 7, null), 0L, 0L, null, null, null, 0L, null, TextAlign.KN(TextAlign.INSTANCE.n()), 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composer4, i8).gh(), composer3, 0, 0, 65020);
                    composer3.Xw();
                }
                composer3.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier4 = modifier3;
            } else {
                composerKN.wTp();
                composer3 = composerKN;
                modifier4 = modifier2;
            }
            scopeUpdateScopeGh = composer3.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: a4.Ml
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Wre.mUb(onboardingPagerState, z2, onNextClicked, onGotItClicked, onSkipClicked, modifier4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 196608;
        modifier2 = modifier;
        if ((74899 & i5) == 74898) {
            if (i9 == 0) {
            }
            if (ComposerKt.v()) {
            }
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion22.HI(), false);
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifier5);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0 function0N2 = companion32.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyUo2, companion32.t());
            Updater.O(composerN, compositionLocalMapIk2, companion32.O());
            function2Rl = companion32.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO2, companion32.nr());
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.f17448n;
                composerKN.eF(466734827);
                if (z2) {
                }
                composer2.Xw();
                PagerState pagerStateN2 = onboardingPagerState.n();
                int size2 = onboardingPagerState.rl().size();
                Modifier.Companion companion42 = Modifier.INSTANCE;
                Composer composer42 = composer2;
                gh(pagerStateN2, size2, boxScopeInstance.n(companion42, companion.O()), 0L, 0L, 0.0f, 0.0f, 0.0f, 0.0f, null, composer42, 0, 1016);
                if (onboardingPagerState.t()) {
                }
                composer3.XQ();
                if (ComposerKt.v()) {
                }
                modifier4 = modifier3;
            }
        }
        scopeUpdateScopeGh = composer3.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public static final CN3 az(List onboardingCards, PagerState indicatorState, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(onboardingCards, "onboardingCards");
        Intrinsics.checkNotNullParameter(indicatorState, "indicatorState");
        composer.eF(738232729);
        if (ComposerKt.v()) {
            ComposerKt.p5(738232729, i2, -1, "com.alightcreative.onboarding.ui.components.rememberOnboardingPagerState (OnboardingPagerController.kt:55)");
        }
        composer.eF(2073367230);
        Object objIF = composer.iF();
        if (objIF == Composer.INSTANCE.n()) {
            objIF = new CN3(onboardingCards, indicatorState);
            composer.o(objIF);
        }
        CN3 cn3 = (CN3) objIF;
        composer.Xw();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return cn3;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void gh(final PagerState pagerState, final int i2, Modifier modifier, long j2, long j3, float f3, float f4, float f5, float f6, Shape shape, Composer composer, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        int i8;
        int i9;
        long jNHg;
        int i10;
        long jS7N;
        int i11;
        float fKN;
        int i12;
        float fKN2;
        int i13;
        int i14;
        float fKN3;
        float fKN4;
        Shape shapeN;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        int i15;
        final float f7;
        final long j4;
        final long j5;
        final Shape shape2;
        final float f8;
        final Modifier modifier3;
        final float f9;
        Composer composer2;
        final float f10;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1897186853);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.p5(pagerState) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((2 & i5) != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= composerKN.t(i2) ? 32 : 16;
        }
        int i16 = i5 & 4;
        if (i16 != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i7 |= 3072;
                i9 = i16;
            } else {
                i9 = i16;
                if ((i3 & 3072) == 0) {
                    jNHg = j2;
                    i7 |= composerKN.nr(jNHg) ? 2048 : 1024;
                    i10 = i5 & 16;
                    if (i10 != 0) {
                        i7 |= 24576;
                        jS7N = j3;
                    } else {
                        jS7N = j3;
                        if ((i3 & 24576) == 0) {
                            i7 |= composerKN.nr(jS7N) ? 16384 : 8192;
                        }
                    }
                    i11 = i5 & 32;
                    if (i11 != 0) {
                        i7 |= 196608;
                        fKN = f3;
                    } else {
                        fKN = f3;
                        if ((i3 & 196608) == 0) {
                            i7 |= composerKN.rl(fKN) ? 131072 : 65536;
                        }
                    }
                    i12 = i5 & 64;
                    if (i12 != 0) {
                        i7 |= 1572864;
                        fKN2 = f4;
                    } else {
                        fKN2 = f4;
                        if ((i3 & 1572864) == 0) {
                            i7 |= composerKN.rl(fKN2) ? 1048576 : 524288;
                        }
                    }
                    i13 = 128 & i5;
                    if (i13 != 0) {
                        i7 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        i7 |= composerKN.rl(f5) ? 8388608 : 4194304;
                    }
                    i14 = 256 & i5;
                    if (i14 != 0) {
                        i7 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i7 |= composerKN.rl(f6) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i7 |= ((i5 & 512) == 0 && composerKN.p5(shape)) ? 536870912 : 268435456;
                    }
                    if ((i7 & 306783379) == 306783378 && composerKN.xMQ()) {
                        composerKN.wTp();
                        shape2 = shape;
                        modifier3 = modifier2;
                        composer2 = composerKN;
                        f10 = f6;
                        float f11 = fKN2;
                        f9 = f5;
                        long j6 = jS7N;
                        f7 = fKN;
                        j4 = jNHg;
                        j5 = j6;
                        f8 = f11;
                    } else {
                        composerKN.e();
                        if ((i3 & 1) != 0 || composerKN.rV9()) {
                            if (i9 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i8 != 0) {
                                jNHg = aD.w6.nHg();
                            }
                            if (i10 != 0) {
                                jS7N = aD.w6.s7N();
                            }
                            if (i11 != 0) {
                                fKN = Dp.KN(6);
                            }
                            if (i12 != 0) {
                                fKN2 = Dp.KN(6);
                            }
                            fKN3 = i13 == 0 ? Dp.KN(16) : f5;
                            fKN4 = i14 == 0 ? Dp.KN(8) : f6;
                            if ((i5 & 512) == 0) {
                                shapeN = RoundedCornerShapeKt.n(50);
                                i7 &= -1879048193;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1897186853, i7, -1, "com.alightcreative.onboarding.ui.components.OnboardingViewPagerIndicator (OnboardingPagerController.kt:123)");
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
                                composerKN.s7N(function0N);
                            } else {
                                composerKN.r();
                            }
                            composerN = Updater.n(composerKN);
                            Updater.O(composerN, measurePolicyUo, companion2.t());
                            Updater.O(composerN, compositionLocalMapIk, companion2.O());
                            function2Rl = companion2.rl();
                            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
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
                            float f12 = fKN4;
                            Updater.O(composerN2, measurePolicyRl, companion2.t());
                            Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
                            function2Rl2 = companion2.rl();
                            if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                composerN2.o(Integer.valueOf(iN2));
                                composerN2.az(Integer.valueOf(iN2), function2Rl2);
                            }
                            Updater.O(composerN2, modifierO2, companion2.nr());
                            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                            int iS = pagerState.S();
                            float fCoerceIn = RangesKt.coerceIn(pagerState.WPU(), -1.0f, 1.0f);
                            composerKN.eF(-1611858171);
                            for (i15 = 0; i15 < i2; i15++) {
                                if (i15 == iS - 1 && fCoerceIn < 0.0f) {
                                    composerKN.eF(-1752179862);
                                    float f13 = -fCoerceIn;
                                    BoxKt.n(BackgroundKt.t(SizeKt.S(Modifier.INSTANCE, DpKt.t(fKN2, fKN3, f13), fKN), ColorKt.KN(jS7N, jNHg, f13), shapeN), composerKN, 0);
                                    composerKN.Xw();
                                } else if (i15 == pagerState.S()) {
                                    composerKN.eF(-1751446526);
                                    BoxKt.n(BackgroundKt.t(SizeKt.S(Modifier.INSTANCE, DpKt.t(fKN3, fKN2, Math.abs(fCoerceIn)), fKN), ColorKt.KN(jNHg, jS7N, Math.abs(fCoerceIn)), shapeN), composerKN, 0);
                                    composerKN.Xw();
                                } else {
                                    if (i15 != pagerState.S() + 1 || fCoerceIn <= 0.0f) {
                                        composerKN.eF(-1749992626);
                                        BoxKt.n(BackgroundKt.t(SizeKt.S(Modifier.INSTANCE, fKN2, fKN), jS7N, shapeN), composerKN, 0);
                                        composerKN.Xw();
                                    } else {
                                        composerKN.eF(-1750677044);
                                        BoxKt.n(BackgroundKt.t(SizeKt.S(Modifier.INSTANCE, DpKt.t(fKN2, fKN3, fCoerceIn), fKN), ColorKt.KN(jS7N, jNHg, fCoerceIn), shapeN), composerKN, 0);
                                        composerKN.Xw();
                                    }
                                }
                            }
                            composerKN.Xw();
                            composerKN.XQ();
                            composerKN.XQ();
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            long j7 = jS7N;
                            f7 = fKN;
                            j4 = jNHg;
                            j5 = j7;
                            shape2 = shapeN;
                            f8 = fKN2;
                            modifier3 = modifier4;
                            f9 = fKN3;
                            composer2 = composerKN;
                            f10 = f12;
                        } else {
                            composerKN.wTp();
                            if ((i5 & 512) != 0) {
                                i7 &= -1879048193;
                            }
                            fKN3 = f5;
                            fKN4 = f6;
                        }
                        shapeN = shape;
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
                        if (composerN.getInserting()) {
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
                            float f122 = fKN4;
                            Updater.O(composerN2, measurePolicyRl2, companion22.t());
                            Updater.O(composerN2, compositionLocalMapIk22, companion22.O());
                            function2Rl2 = companion22.rl();
                            if (!composerN2.getInserting()) {
                                composerN2.o(Integer.valueOf(iN2));
                                composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                Updater.O(composerN2, modifierO22, companion22.nr());
                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                                int iS2 = pagerState.S();
                                float fCoerceIn2 = RangesKt.coerceIn(pagerState.WPU(), -1.0f, 1.0f);
                                composerKN.eF(-1611858171);
                                while (i15 < i2) {
                                }
                                composerKN.Xw();
                                composerKN.XQ();
                                composerKN.XQ();
                                if (ComposerKt.v()) {
                                }
                                long j72 = jS7N;
                                f7 = fKN;
                                j4 = jNHg;
                                j5 = j72;
                                shape2 = shapeN;
                                f8 = fKN2;
                                modifier3 = modifier42;
                                f9 = fKN3;
                                composer2 = composerKN;
                                f10 = f122;
                            }
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                        scopeUpdateScopeGh.n(new Function2() { // from class: a4.I28
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return Wre.qie(pagerState, i2, modifier3, j4, j5, f7, f8, f9, f10, shape2, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
            }
            jNHg = j2;
            i10 = i5 & 16;
            if (i10 != 0) {
            }
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = 128 & i5;
            if (i13 != 0) {
            }
            i14 = 256 & i5;
            if (i14 != 0) {
            }
            if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            }
            if ((i7 & 306783379) == 306783378) {
                composerKN.e();
                if ((i3 & 1) != 0) {
                    if (i9 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if ((i5 & 512) == 0) {
                        shapeN = shape;
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    Alignment.Companion companion42 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyUo22 = BoxKt.Uo(companion42.KN(), false);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk32 = composerKN.Ik();
                    Modifier modifierO32 = ComposedModifierKt.O(composerKN, modifier2);
                    ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
                    Modifier modifier422 = modifier2;
                    Function0 function0N32 = companion222.n();
                    if (composerKN.getApplier() == null) {
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                    }
                    composerN = Updater.n(composerKN);
                    Updater.O(composerN, measurePolicyUo22, companion222.t());
                    Updater.O(composerN, compositionLocalMapIk32, companion222.O());
                    function2Rl = companion222.rl();
                    if (composerN.getInserting()) {
                    }
                }
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        jNHg = j2;
        i10 = i5 & 16;
        if (i10 != 0) {
        }
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = 128 & i5;
        if (i13 != 0) {
        }
        i14 = 256 & i5;
        if (i14 != 0) {
        }
        if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(CN3 cn3, boolean z2, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        J2(cn3, z2, function0, function02, function03, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(PagerState pagerState, int i2, Modifier modifier, long j2, long j3, float f3, float f4, float f5, float f6, Shape shape, int i3, int i5, Composer composer, int i7) {
        gh(pagerState, i2, modifier, j2, j3, f3, f4, f5, f6, shape, composer, RecomposeScopeImplKt.n(i3 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
