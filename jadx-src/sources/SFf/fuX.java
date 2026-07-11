package SFf;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SwitchColors;
import androidx.compose.material3.SwitchDefaults;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class fuX {
    /* JADX WARN: Removed duplicated region for block: B:169:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a6 A[PHI: r36
      0x02a6: PHI (r36v11 int) = (r36v4 int), (r36v7 int), (r36v8 int) binds: [B:209:0x02a4, B:217:0x02ba, B:216:0x02b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:412:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KN(final List trackers, final Map preferences, final State isTechnicalEnabled, final State isAnalyticsEnabled, final State isProfilingEnabled, final boolean z2, Modifier modifier, boolean z3, boolean z4, boolean z5, boolean z6, String str, String str2, String str3, String str4, String str5, String str6, Function0 function0, Function0 function02, Function0 function03, Function1 function1, final Function2 onCategoryToggled, final Function2 onTrackerToggled, g9s g9sVar, Composer composer, final int i2, final int i3, final int i5, final int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        String str7;
        Modifier modifier2;
        Function0 function04;
        Function0 function05;
        Function0 function06;
        Function0 function07;
        Function0 function08;
        Function0 function09;
        Function1 function12;
        Function0 function010;
        Function0 function011;
        int i25;
        Function1 function13;
        g9s g9sVar2;
        boolean z7;
        boolean z9;
        boolean z10;
        boolean z11;
        String str8;
        String str9;
        Modifier modifier3;
        Function0 function012;
        String str10;
        String str11;
        String str12;
        String str13;
        Object objIF;
        Composer.Companion companion;
        int i26;
        Alignment.Companion companion2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Modifier.Companion companion3;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        ColumnScopeInstance columnScopeInstance;
        Function0 function013;
        Composer composer2;
        SwitchColors switchColorsIF;
        int i27;
        Object objIF2;
        int i28;
        Composer composer3;
        Modifier.Companion companion4;
        Object obj;
        float f3;
        boolean z12;
        boolean z13;
        Function0 function014;
        Function0 function015;
        Ew ew;
        Function1 function14;
        final Function0 function016;
        final boolean z14;
        final boolean z15;
        final String str14;
        final String str15;
        final String str16;
        final String str17;
        final String str18;
        final Function1 function15;
        final Modifier modifier4;
        final boolean z16;
        final boolean z17;
        final g9s g9sVar3;
        final Function0 function017;
        final String str19;
        final Function0 function018;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i29;
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(isTechnicalEnabled, "isTechnicalEnabled");
        Intrinsics.checkNotNullParameter(isAnalyticsEnabled, "isAnalyticsEnabled");
        Intrinsics.checkNotNullParameter(isProfilingEnabled, "isProfilingEnabled");
        Intrinsics.checkNotNullParameter(onCategoryToggled, "onCategoryToggled");
        Intrinsics.checkNotNullParameter(onTrackerToggled, "onTrackerToggled");
        Composer composerKN = composer.KN(938668207);
        if ((i7 & 1) != 0) {
            i8 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i8 = i2 | (composerKN.E2(trackers) ? 4 : 2);
        } else {
            i8 = i2;
        }
        if ((i7 & 2) != 0) {
            i8 |= 48;
        } else if ((i2 & 48) == 0) {
            i8 |= composerKN.E2(preferences) ? 32 : 16;
        }
        int i30 = i8;
        if ((i7 & 4) != 0) {
            i30 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i30 |= composerKN.p5(isTechnicalEnabled) ? 256 : 128;
        }
        if ((i7 & 8) != 0) {
            i30 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i30 |= composerKN.p5(isAnalyticsEnabled) ? 2048 : 1024;
        }
        if ((i7 & 16) != 0) {
            i30 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i30 |= composerKN.p5(isProfilingEnabled) ? 16384 : 8192;
        }
        if ((i7 & 32) != 0) {
            i30 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i30 |= composerKN.n(z2) ? 131072 : 65536;
        }
        int i31 = i7 & 64;
        if (i31 != 0) {
            i30 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i30 |= composerKN.p5(modifier) ? 1048576 : 524288;
        }
        int i32 = i7 & 128;
        if (i32 != 0) {
            i30 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i30 |= composerKN.n(z3) ? 8388608 : 4194304;
        }
        int i33 = i7 & 256;
        if (i33 != 0) {
            i30 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i30 |= composerKN.n(z4) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        int i34 = i7 & 512;
        int i35 = com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
        if (i34 != 0) {
            i30 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
            i9 = i34;
        } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            i9 = i34;
            i30 |= composerKN.n(z5) ? 536870912 : 268435456;
        } else {
            i9 = i34;
        }
        int i36 = i7 & 1024;
        if (i36 != 0) {
            i10 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i10 = i3 | (composerKN.n(z6) ? 4 : 2);
        } else {
            i10 = i3;
        }
        int i37 = i7 & 2048;
        if (i37 != 0) {
            i10 |= 48;
            i11 = i37;
        } else if ((i3 & 48) == 0) {
            i11 = i37;
            i10 |= composerKN.p5(str) ? 32 : 16;
        } else {
            i11 = i37;
        }
        int i38 = i10;
        int i39 = i7 & 4096;
        if (i39 != 0) {
            i13 = i38 | RendererCapabilities.DECODER_SUPPORT_MASK;
            i12 = i39;
        } else {
            int i40 = i38;
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i40 |= composerKN.p5(str2) ? 256 : 128;
            }
            i12 = i39;
            i13 = i40;
        }
        int i41 = i7 & 8192;
        if (i41 != 0) {
            i13 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i13 |= composerKN.p5(str3) ? 2048 : 1024;
        }
        int i42 = i7 & 16384;
        if (i42 != 0) {
            i13 |= 24576;
        } else {
            if ((i3 & 24576) == 0) {
                i13 |= composerKN.p5(str4) ? 16384 : 8192;
            }
            i14 = i7 & 32768;
            if (i14 == 0) {
                i13 |= 196608;
            } else {
                if ((i3 & 196608) == 0) {
                    i15 = i13 | (composerKN.p5(str5) ? 131072 : 65536);
                }
                i16 = i7 & 65536;
                if (i16 != 0) {
                    i15 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i15 |= composerKN.p5(str6) ? 1048576 : 524288;
                }
                i17 = i7 & 131072;
                if (i17 != 0) {
                    i15 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    i15 |= composerKN.E2(function0) ? 8388608 : 4194304;
                }
                i18 = i7 & 262144;
                if (i18 != 0) {
                    i15 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    i15 |= composerKN.E2(function02) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                }
                i19 = i7 & 524288;
                if (i19 != 0) {
                    i15 |= i35;
                } else if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    i35 = composerKN.E2(function03) ? 536870912 : 268435456;
                    i15 |= i35;
                }
                int i43 = i15;
                i20 = i7 & 1048576;
                if (i20 != 0) {
                    i21 = i5 | 6;
                } else if ((i5 & 6) == 0) {
                    i21 = i5 | (composerKN.E2(function1) ? 4 : 2);
                } else {
                    i21 = i5;
                }
                if ((i7 & 2097152) != 0) {
                    i21 |= 48;
                } else if ((i5 & 48) == 0) {
                    i21 |= composerKN.E2(onCategoryToggled) ? 32 : 16;
                }
                int i44 = i21;
                if ((i7 & 4194304) == 0) {
                    i22 = i44;
                    if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        i23 = i22 | (composerKN.E2(onTrackerToggled) ? 256 : 128);
                    }
                    if ((i5 & 3072) == 0) {
                        i24 = i22;
                    } else if ((i7 & 8388608) != 0) {
                        i29 = 1024;
                        i24 = i22 | i29;
                    } else {
                        if ((i5 & 4096) == 0 ? composerKN.p5(g9sVar) : composerKN.E2(g9sVar)) {
                            i29 = 2048;
                        }
                        i24 = i22 | i29;
                    }
                    if ((i30 & 306783379) != 306783378 && (306783379 & i43) == 306783378 && (i24 & 1171) == 1170 && composerKN.xMQ()) {
                        composerKN.wTp();
                        modifier4 = modifier;
                        z14 = z4;
                        z15 = z5;
                        z17 = z6;
                        str15 = str;
                        str16 = str2;
                        str18 = str4;
                        str19 = str5;
                        str14 = str6;
                        function018 = function0;
                        function016 = function02;
                        function017 = function03;
                        function15 = function1;
                        g9sVar3 = g9sVar;
                        composer3 = composerKN;
                        z16 = z3;
                        str17 = str3;
                    } else {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            Modifier modifier5 = i31 == 0 ? Modifier.INSTANCE : modifier;
                            boolean z18 = i32 == 0 ? true : z3;
                            boolean z19 = i33 == 0 ? true : z4;
                            boolean z20 = i9 == 0 ? true : z5;
                            boolean z21 = i36 == 0 ? true : z6;
                            String str20 = i11 == 0 ? null : str;
                            String str21 = i12 == 0 ? null : str2;
                            String str22 = i41 == 0 ? null : str3;
                            String str23 = i42 == 0 ? null : str4;
                            String str24 = i14 == 0 ? null : str5;
                            str7 = i16 == 0 ? null : str6;
                            if (i17 == 0) {
                                composerKN.eF(794371053);
                                Object objIF3 = composerKN.iF();
                                modifier2 = modifier5;
                                if (objIF3 == Composer.INSTANCE.n()) {
                                    objIF3 = new Function0() { // from class: SFf.j
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return fuX.xMQ();
                                        }
                                    };
                                    composerKN.o(objIF3);
                                }
                                function04 = (Function0) objIF3;
                                composerKN.Xw();
                            } else {
                                modifier2 = modifier5;
                                function04 = function0;
                            }
                            if (i18 == 0) {
                                composerKN.eF(794372429);
                                Object objIF4 = composerKN.iF();
                                function05 = function04;
                                if (objIF4 == Composer.INSTANCE.n()) {
                                    objIF4 = new Function0() { // from class: SFf.n
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return fuX.az();
                                        }
                                    };
                                    composerKN.o(objIF4);
                                }
                                function06 = (Function0) objIF4;
                                composerKN.Xw();
                            } else {
                                function05 = function04;
                                function06 = function02;
                            }
                            if (i19 == 0) {
                                composerKN.eF(794374029);
                                Object objIF5 = composerKN.iF();
                                function07 = function06;
                                if (objIF5 == Composer.INSTANCE.n()) {
                                    objIF5 = new Function0() { // from class: SFf.w6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return fuX.ty();
                                        }
                                    };
                                    composerKN.o(objIF5);
                                }
                                function08 = (Function0) objIF5;
                                composerKN.Xw();
                            } else {
                                function07 = function06;
                                function08 = function03;
                            }
                            if (i20 == 0) {
                                composerKN.eF(794375789);
                                Object objIF6 = composerKN.iF();
                                function09 = function08;
                                if (objIF6 == Composer.INSTANCE.n()) {
                                    objIF6 = new Function1() { // from class: SFf.Ml
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return fuX.HI((String) obj2);
                                        }
                                    };
                                    composerKN.o(objIF6);
                                }
                                function12 = (Function1) objIF6;
                                composerKN.Xw();
                            } else {
                                function09 = function08;
                                function12 = function1;
                            }
                            if ((i7 & 8388608) == 0) {
                                function010 = function05;
                                function011 = function07;
                                function012 = function09;
                                i25 = i24 & (-7169);
                                function13 = function12;
                                z9 = z19;
                                z10 = z20;
                                z11 = z21;
                                str8 = str22;
                                str9 = str24;
                                g9sVar2 = new g9s(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0.0f, 0.0f, null, null, 0.0f, null, Integer.MAX_VALUE, null);
                                modifier3 = modifier2;
                                z7 = z18;
                            } else {
                                function010 = function05;
                                function011 = function07;
                                i25 = i24;
                                function13 = function12;
                                g9sVar2 = g9sVar;
                                z7 = z18;
                                z9 = z19;
                                z10 = z20;
                                z11 = z21;
                                str8 = str22;
                                str9 = str24;
                                modifier3 = modifier2;
                                function012 = function09;
                            }
                            str10 = str21;
                            str11 = str20;
                            str12 = str23;
                        } else {
                            composerKN.wTp();
                            if ((i7 & 8388608) != 0) {
                                i24 &= -7169;
                            }
                            z7 = z3;
                            z9 = z4;
                            z10 = z5;
                            z11 = z6;
                            str11 = str;
                            str10 = str2;
                            str8 = str3;
                            str12 = str4;
                            str9 = str5;
                            str7 = str6;
                            function010 = function0;
                            function011 = function02;
                            function13 = function1;
                            i25 = i24;
                            g9sVar2 = g9sVar;
                            modifier3 = modifier;
                            function012 = function03;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            str13 = str8;
                        } else {
                            str13 = str8;
                            ComposerKt.p5(938668207, i30, i43, "com.bendingspoons.legal.privacy.ui.settings.PrivacySettingsContent (PrivacySettingsContent.kt:95)");
                        }
                        composerKN.eF(794383851);
                        objIF = composerKN.iF();
                        companion = Composer.INSTANCE;
                        if (objIF != companion.n()) {
                            i26 = i43;
                            objIF = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
                            composerKN.o(objIF);
                        } else {
                            i26 = i43;
                        }
                        final MutableState mutableState = (MutableState) objIF;
                        composerKN.Xw();
                        companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
                        iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                        String str25 = str9;
                        Modifier modifierO = ComposedModifierKt.O(composerKN, modifier3);
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        Modifier modifier6 = modifier3;
                        Function0 function0N = companion5.n();
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
                        Updater.O(composerN, measurePolicyUo, companion5.t());
                        Updater.O(composerN, compositionLocalMapIk, companion5.O());
                        function2Rl = companion5.rl();
                        if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion5.nr());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                        companion3 = Modifier.INSTANCE;
                        Modifier modifierKN = PaddingKt.KN(ScrollKt.Uo(SizeKt.J2(companion3, 0.0f, 1, null), ScrollKt.t(0, composerKN, 0, 1), false, null, false, 14, null), g9sVar2.g());
                        MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), companion2.gh(), composerKN, 0);
                        iN2 = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                        Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierKN);
                        Function0 function0N2 = companion5.n();
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
                        Updater.O(composerN2, measurePolicyN, companion5.t());
                        Updater.O(composerN2, compositionLocalMapIk2, companion5.O());
                        function2Rl2 = companion5.rl();
                        if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                            composerN2.o(Integer.valueOf(iN2));
                            composerN2.az(Integer.valueOf(iN2), function2Rl2);
                        }
                        Updater.O(composerN2, modifierO2, companion5.nr());
                        columnScopeInstance = ColumnScopeInstance.f17468n;
                        composerKN.eF(-1714071728);
                        if (z11) {
                            function013 = function012;
                            composer2 = composerKN;
                        } else {
                            Function0 function019 = function012;
                            MuZ.qz.t(PaddingKt.xMQ(companion3, Dp.KN(20)), function019, g9sVar2.nY(), g9sVar2.WPU(), composerKN, ((i26 >> 24) & 112) | 6, 0);
                            function013 = function019;
                            composer2 = composerKN;
                        }
                        composer2.Xw();
                        TextStyle textStyleJ2 = g9sVar2.J2();
                        TextStyle textStyleO = g9sVar2.O();
                        TextStyle textStyleE2 = g9sVar2.E2();
                        switchColorsIF = g9sVar2.iF();
                        composer2.eF(-1714038673);
                        if (switchColorsIF == null) {
                            switchColorsIF = SwitchDefaults.f28005n.rl(0L, Yd.j.xMQ(), 0L, 0L, 0L, Color.INSTANCE.J2(), 0L, 0L, 0L, Yd.j.mUb(), 0L, 0L, 0L, 0L, 0L, 0L, composer2, 805503024, SwitchDefaults.f28006t << 18, 64989);
                        }
                        composer2.Xw();
                        long jUo = g9sVar2.Uo();
                        Shape shapeKN = g9sVar2.KN();
                        long jMUb = g9sVar2.mUb();
                        long jGh = g9sVar2.gh();
                        i27 = i26;
                        long jFD = g9sVar2.fD();
                        String str26 = str7;
                        float fAz = g9sVar2.az();
                        PaddingValues paddingValuesXMQ = g9sVar2.xMQ();
                        SwitchColors switchColors = switchColorsIF;
                        Modifier modifierGh = PaddingKt.gh(companion3, g9sVar2.qie(), 0.0f, 2, null);
                        composer2.eF(-1714047898);
                        objIF2 = composer2.iF();
                        if (objIF2 == companion.n()) {
                            objIF2 = new Function1() { // from class: SFf.I28
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return fuX.mUb(mutableState, (Ew) obj2);
                                }
                            };
                            composer2.o(objIF2);
                        }
                        composer2.Xw();
                        int i45 = i25 << 12;
                        String str27 = str13;
                        i28 = i30;
                        Composer composer4 = composer2;
                        MuZ.Ml.rl(trackers, preferences, isTechnicalEnabled, isAnalyticsEnabled, isProfilingEnabled, onCategoryToggled, onTrackerToggled, (Function1) objIF2, textStyleJ2, textStyleO, textStyleE2, switchColors, jMUb, jGh, jFD, jUo, shapeKN, fAz, paddingValuesXMQ, modifierGh, str11, str10, str27, str12, str25, str26, composer4, (i30 & 14) | 12582912 | (i30 & 112) | (i30 & 896) | (i30 & 7168) | (57344 & i30) | (i45 & 458752) | (i45 & 3670016), 0, (i27 >> 3) & 524286, 0);
                        composer3 = composer4;
                        composer3.eF(-1713999222);
                        if (!z9 || z10 || z7) {
                            companion4 = companion3;
                            obj = null;
                            f3 = 0.0f;
                            boolean z22 = z9;
                            boolean z23 = z10;
                            Function0 function020 = function010;
                            Function0 function021 = function011;
                            MuZ.n.rl(SizeKt.KN(columnScopeInstance.t(PaddingKt.mUb(companion4, g9sVar2.t(), Dp.KN(20)), companion2.Uo()), 0.0f, 1, null), z22, z23, g9sVar2.rl(), g9sVar2.HI(), g9sVar2.n(), g9sVar2.ty(), g9sVar2.te(), g9sVar2.nr(), function020, function021, composer3, ((i28 >> 21) & 1008) | ((i27 << 6) & 1879048192), (i27 >> 24) & 14, 0);
                            z12 = z22;
                            z13 = z23;
                            function014 = function020;
                            function015 = function021;
                        } else {
                            z12 = z9;
                            z13 = z10;
                            function014 = function010;
                            function015 = function011;
                            companion4 = companion3;
                            obj = null;
                            f3 = 0.0f;
                        }
                        composer3.Xw();
                        composer3.XQ();
                        ew = (Ew) mutableState.getValue();
                        composer3.eF(64281186);
                        if (ew != null) {
                            function14 = function13;
                        } else {
                            Modifier modifierGh2 = PaddingKt.gh(companion4, Dp.KN(38), f3, 2, obj);
                            long jCk = g9sVar2.ck();
                            TextStyle textStyleS = g9sVar2.S();
                            TextStyle textStyleIk = g9sVar2.Ik();
                            TextStyle textStyleXQ = g9sVar2.XQ();
                            TextStyle textStyleO2 = g9sVar2.o();
                            R7M.j jVarR = g9sVar2.r();
                            TextStyle textStyleZ = g9sVar2.Z();
                            composer3.eF(-1713958648);
                            Object objIF7 = composer3.iF();
                            if (objIF7 == companion.n()) {
                                objIF7 = new Function0() { // from class: SFf.Wre
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return fuX.gh(mutableState);
                                    }
                                };
                                composer3.o(objIF7);
                            }
                            composer3.Xw();
                            function14 = function13;
                            MuZ.eO.rl(ew, jCk, textStyleS, textStyleIk, textStyleXQ, textStyleZ, textStyleO2, jVarR, modifierGh2, function14, (Function0) objIF7, composer3, ((i25 << 27) & 1879048192) | 100663296, 6, 0);
                            Unit unit = Unit.INSTANCE;
                        }
                        composer3.Xw();
                        composer3.eF(64308229);
                        if (z2) {
                            Yd.Ml.t(g9sVar2.aYN(), g9sVar2.ViF(), composer3, 0);
                        }
                        composer3.Xw();
                        composer3.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        function016 = function015;
                        z14 = z12;
                        z15 = z13;
                        str14 = str26;
                        str15 = str11;
                        str16 = str10;
                        str17 = str27;
                        str18 = str12;
                        function15 = function14;
                        modifier4 = modifier6;
                        z16 = z7;
                        z17 = z11;
                        g9sVar3 = g9sVar2;
                        function017 = function013;
                        str19 = str25;
                        function018 = function014;
                    }
                    scopeUpdateScopeGh = composer3.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2() { // from class: SFf.CN3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return fuX.qie(trackers, preferences, isTechnicalEnabled, isAnalyticsEnabled, isProfilingEnabled, z2, modifier4, z16, z14, z15, z17, str15, str16, str17, str18, str19, str14, function018, function016, function017, function15, onCategoryToggled, onTrackerToggled, g9sVar3, i2, i3, i5, i7, (Composer) obj2, ((Integer) obj3).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i23 = i44 | RendererCapabilities.DECODER_SUPPORT_MASK;
                i22 = i23;
                if ((i5 & 3072) == 0) {
                }
                if ((i30 & 306783379) != 306783378) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i31 == 0) {
                        }
                        if (i32 == 0) {
                        }
                        if (i33 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i36 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i41 == 0) {
                        }
                        if (i42 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i20 == 0) {
                        }
                        if ((i7 & 8388608) == 0) {
                        }
                        str10 = str21;
                        str11 = str20;
                        str12 = str23;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        composerKN.eF(794383851);
                        objIF = composerKN.iF();
                        companion = Composer.INSTANCE;
                        if (objIF != companion.n()) {
                        }
                        final MutableState mutableState2 = (MutableState) objIF;
                        composerKN.Xw();
                        companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion2.HI(), false);
                        iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                        String str252 = str9;
                        Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifier3);
                        ComposeUiNode.Companion companion52 = ComposeUiNode.INSTANCE;
                        Modifier modifier62 = modifier3;
                        Function0 function0N3 = companion52.n();
                        if (composerKN.getApplier() == null) {
                        }
                        composerKN.T();
                        if (composerKN.getInserting()) {
                        }
                        composerN = Updater.n(composerKN);
                        Updater.O(composerN, measurePolicyUo2, companion52.t());
                        Updater.O(composerN, compositionLocalMapIk3, companion52.O());
                        function2Rl = companion52.rl();
                        if (!composerN.getInserting()) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                            Updater.O(composerN, modifierO3, companion52.nr());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                            companion3 = Modifier.INSTANCE;
                            Modifier modifierKN2 = PaddingKt.KN(ScrollKt.Uo(SizeKt.J2(companion3, 0.0f, 1, null), ScrollKt.t(0, composerKN, 0, 1), false, null, false, 14, null), g9sVar2.g());
                            MeasurePolicy measurePolicyN2 = ColumnKt.n(Arrangement.f17400n.Uo(), companion2.gh(), composerKN, 0);
                            iN2 = ComposablesKt.n(composerKN, 0);
                            CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                            Modifier modifierO22 = ComposedModifierKt.O(composerKN, modifierKN2);
                            Function0 function0N22 = companion52.n();
                            if (composerKN.getApplier() == null) {
                            }
                            composerKN.T();
                            if (composerKN.getInserting()) {
                            }
                            composerN2 = Updater.n(composerKN);
                            Updater.O(composerN2, measurePolicyN2, companion52.t());
                            Updater.O(composerN2, compositionLocalMapIk22, companion52.O());
                            function2Rl2 = companion52.rl();
                            if (!composerN2.getInserting()) {
                                composerN2.o(Integer.valueOf(iN2));
                                composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                Updater.O(composerN2, modifierO22, companion52.nr());
                                columnScopeInstance = ColumnScopeInstance.f17468n;
                                composerKN.eF(-1714071728);
                                if (z11) {
                                }
                                composer2.Xw();
                                TextStyle textStyleJ22 = g9sVar2.J2();
                                TextStyle textStyleO3 = g9sVar2.O();
                                TextStyle textStyleE22 = g9sVar2.E2();
                                switchColorsIF = g9sVar2.iF();
                                composer2.eF(-1714038673);
                                if (switchColorsIF == null) {
                                }
                                composer2.Xw();
                                long jUo2 = g9sVar2.Uo();
                                Shape shapeKN2 = g9sVar2.KN();
                                long jMUb2 = g9sVar2.mUb();
                                long jGh2 = g9sVar2.gh();
                                i27 = i26;
                                long jFD2 = g9sVar2.fD();
                                String str262 = str7;
                                float fAz2 = g9sVar2.az();
                                PaddingValues paddingValuesXMQ2 = g9sVar2.xMQ();
                                SwitchColors switchColors2 = switchColorsIF;
                                Modifier modifierGh3 = PaddingKt.gh(companion3, g9sVar2.qie(), 0.0f, 2, null);
                                composer2.eF(-1714047898);
                                objIF2 = composer2.iF();
                                if (objIF2 == companion.n()) {
                                }
                                composer2.Xw();
                                int i452 = i25 << 12;
                                String str272 = str13;
                                i28 = i30;
                                Composer composer42 = composer2;
                                MuZ.Ml.rl(trackers, preferences, isTechnicalEnabled, isAnalyticsEnabled, isProfilingEnabled, onCategoryToggled, onTrackerToggled, (Function1) objIF2, textStyleJ22, textStyleO3, textStyleE22, switchColors2, jMUb2, jGh2, jFD2, jUo2, shapeKN2, fAz2, paddingValuesXMQ2, modifierGh3, str11, str10, str272, str12, str252, str262, composer42, (i30 & 14) | 12582912 | (i30 & 112) | (i30 & 896) | (i30 & 7168) | (57344 & i30) | (i452 & 458752) | (i452 & 3670016), 0, (i27 >> 3) & 524286, 0);
                                composer3 = composer42;
                                composer3.eF(-1713999222);
                                if (z9) {
                                    companion4 = companion3;
                                    obj = null;
                                    f3 = 0.0f;
                                    boolean z222 = z9;
                                    boolean z232 = z10;
                                    Function0 function0202 = function010;
                                    Function0 function0212 = function011;
                                    MuZ.n.rl(SizeKt.KN(columnScopeInstance.t(PaddingKt.mUb(companion4, g9sVar2.t(), Dp.KN(20)), companion2.Uo()), 0.0f, 1, null), z222, z232, g9sVar2.rl(), g9sVar2.HI(), g9sVar2.n(), g9sVar2.ty(), g9sVar2.te(), g9sVar2.nr(), function0202, function0212, composer3, ((i28 >> 21) & 1008) | ((i27 << 6) & 1879048192), (i27 >> 24) & 14, 0);
                                    z12 = z222;
                                    z13 = z232;
                                    function014 = function0202;
                                    function015 = function0212;
                                    composer3.Xw();
                                    composer3.XQ();
                                    ew = (Ew) mutableState2.getValue();
                                    composer3.eF(64281186);
                                    if (ew != null) {
                                    }
                                    composer3.Xw();
                                    composer3.eF(64308229);
                                    if (z2) {
                                    }
                                    composer3.Xw();
                                    composer3.XQ();
                                    if (ComposerKt.v()) {
                                    }
                                    function016 = function015;
                                    z14 = z12;
                                    z15 = z13;
                                    str14 = str262;
                                    str15 = str11;
                                    str16 = str10;
                                    str17 = str272;
                                    str18 = str12;
                                    function15 = function14;
                                    modifier4 = modifier62;
                                    z16 = z7;
                                    z17 = z11;
                                    g9sVar3 = g9sVar2;
                                    function017 = function013;
                                    str19 = str252;
                                    function018 = function014;
                                }
                            }
                        }
                    }
                }
                scopeUpdateScopeGh = composer3.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            i15 = i13;
            i16 = i7 & 65536;
            if (i16 != 0) {
            }
            i17 = i7 & 131072;
            if (i17 != 0) {
            }
            i18 = i7 & 262144;
            if (i18 != 0) {
            }
            i19 = i7 & 524288;
            if (i19 != 0) {
            }
            int i432 = i15;
            i20 = i7 & 1048576;
            if (i20 != 0) {
            }
            if ((i7 & 2097152) != 0) {
            }
            int i442 = i21;
            if ((i7 & 4194304) == 0) {
            }
            i22 = i23;
            if ((i5 & 3072) == 0) {
            }
            if ((i30 & 306783379) != 306783378) {
            }
            scopeUpdateScopeGh = composer3.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        i14 = i7 & 32768;
        if (i14 == 0) {
        }
        i15 = i13;
        i16 = i7 & 65536;
        if (i16 != 0) {
        }
        i17 = i7 & 131072;
        if (i17 != 0) {
        }
        i18 = i7 & 262144;
        if (i18 != 0) {
        }
        i19 = i7 & 524288;
        if (i19 != 0) {
        }
        int i4322 = i15;
        i20 = i7 & 1048576;
        if (i20 != 0) {
        }
        if ((i7 & 2097152) != 0) {
        }
        int i4422 = i21;
        if ((i7 & 4194304) == 0) {
        }
        i22 = i23;
        if ((i5 & 3072) == 0) {
        }
        if ((i30 & 306783379) != 306783378) {
        }
        scopeUpdateScopeGh = composer3.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(MutableState mutableState) {
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(List list, Map map, State state, State state2, State state3, boolean z2, Modifier modifier, boolean z3, boolean z4, boolean z5, boolean z6, String str, String str2, String str3, String str4, String str5, String str6, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function2 function2, Function2 function22, g9s g9sVar, int i2, int i3, int i5, int i7, Composer composer, int i8) {
        KN(list, map, state, state2, state3, z2, modifier, z3, z4, z5, z6, str, str2, str3, str4, str5, str6, function0, function02, function03, function1, function2, function22, g9sVar, composer, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), RecomposeScopeImplKt.n(i5), i7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(MutableState mutableState, Ew it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ty() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ() {
        return Unit.INSTANCE;
    }
}
