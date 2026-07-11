package MuZ;

import SFf.Ew;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.SwitchColors;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Ml {
    /* JADX WARN: Removed duplicated region for block: B:165:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0247 A[PHI: r37
      0x0247: PHI (r37v17 int) = (r37v0 int), (r37v3 int), (r37v4 int) binds: [B:174:0x0245, B:181:0x0257, B:180:0x0254] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x029c A[PHI: r26
      0x029c: PHI (r26v28 int) = (r26v0 int), (r26v3 int), (r26v4 int) binds: [B:204:0x029a, B:212:0x02b0, B:211:0x02ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:377:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final List trackers, final Map preferences, final State isTechnicalEnabled, final State isAnalyticsEnabled, final State isProfilingEnabled, final Function2 function2, final Function2 function22, final Function1 onInfoButtonClicked, final TextStyle categoryNameTextStyle, final TextStyle categoryDescriptionTextStyle, final TextStyle textStyle, final SwitchColors switchColors, final long j2, final long j3, final long j4, final long j5, final Shape shape, final float f3, final PaddingValues categorySectionContentPadding, Modifier modifier, String str, String str2, String str3, String str4, String str5, String str6, Composer composer, final int i2, final int i3, final int i5, final int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        long j6;
        int i14;
        PaddingValues paddingValues;
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
        int i25;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Iterator it;
        Composer composer2;
        final String str7;
        final String str8;
        final String str9;
        final String str10;
        final String str11;
        final String str12;
        final Modifier modifier2;
        State state;
        int i26;
        ScopeUpdateScope scopeUpdateScopeGh;
        Function2 onCategoryToggled = function2;
        Function2 onTrackerToggled = function22;
        TextStyle trackerNameTextStyle = textStyle;
        SwitchColors switchColors2 = switchColors;
        Shape categoryBackgroundShape = shape;
        int i27 = com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(isTechnicalEnabled, "isTechnicalEnabled");
        Intrinsics.checkNotNullParameter(isAnalyticsEnabled, "isAnalyticsEnabled");
        Intrinsics.checkNotNullParameter(isProfilingEnabled, "isProfilingEnabled");
        Intrinsics.checkNotNullParameter(onCategoryToggled, "onCategoryToggled");
        Intrinsics.checkNotNullParameter(onTrackerToggled, "onTrackerToggled");
        Intrinsics.checkNotNullParameter(onInfoButtonClicked, "onInfoButtonClicked");
        Intrinsics.checkNotNullParameter(categoryNameTextStyle, "categoryNameTextStyle");
        Intrinsics.checkNotNullParameter(categoryDescriptionTextStyle, "categoryDescriptionTextStyle");
        Intrinsics.checkNotNullParameter(trackerNameTextStyle, "trackerNameTextStyle");
        Intrinsics.checkNotNullParameter(switchColors2, "switchColors");
        Intrinsics.checkNotNullParameter(categoryBackgroundShape, "categoryBackgroundShape");
        Intrinsics.checkNotNullParameter(categorySectionContentPadding, "categorySectionContentPadding");
        Composer composerKN = composer.KN(1370689000);
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
        int i28 = i8;
        if ((i7 & 4) != 0) {
            i28 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i28 |= composerKN.p5(isTechnicalEnabled) ? 256 : 128;
        }
        if ((i7 & 8) != 0) {
            i28 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i28 |= composerKN.p5(isAnalyticsEnabled) ? 2048 : 1024;
        }
        if ((i7 & 16) != 0) {
            i28 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i28 |= composerKN.p5(isProfilingEnabled) ? 16384 : 8192;
        }
        if ((i7 & 32) != 0) {
            i28 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i28 |= composerKN.E2(onCategoryToggled) ? 131072 : 65536;
        }
        int i29 = 1572864;
        if ((i7 & 64) != 0) {
            i28 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i28 |= composerKN.E2(onTrackerToggled) ? 1048576 : 524288;
        }
        if ((i7 & 128) != 0) {
            i28 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i28 |= composerKN.E2(onInfoButtonClicked) ? 8388608 : 4194304;
        }
        if ((i7 & 256) != 0) {
            i28 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i28 |= composerKN.p5(categoryNameTextStyle) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i7 & 512) != 0) {
            i28 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
        } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            i28 |= composerKN.p5(categoryDescriptionTextStyle) ? 536870912 : 268435456;
        }
        int i30 = i28;
        if ((i7 & 1024) != 0) {
            i9 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i9 = i3 | (composerKN.p5(trackerNameTextStyle) ? 4 : 2);
        } else {
            i9 = i3;
        }
        if ((i7 & 2048) != 0) {
            i9 |= 48;
        } else if ((i3 & 48) == 0) {
            i9 |= composerKN.p5(switchColors2) ? 32 : 16;
        }
        if ((i7 & 4096) != 0) {
            i11 = i9 | RendererCapabilities.DECODER_SUPPORT_MASK;
            i10 = i3;
        } else {
            i10 = i3;
            int i31 = i9;
            if ((i10 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i31 |= composerKN.nr(j2) ? 256 : 128;
            }
            i11 = i31;
        }
        if ((i7 & 8192) != 0) {
            i12 = i11 | 3072;
        } else {
            int i32 = i11;
            if ((i10 & 3072) == 0) {
                i32 |= composerKN.nr(j3) ? 2048 : 1024;
            }
            i12 = i32;
        }
        if ((i7 & 16384) != 0) {
            i12 |= 24576;
        } else {
            if ((i10 & 24576) == 0) {
                i13 = i12 | (composerKN.nr(j4) ? 16384 : 8192);
            }
            if ((i7 & 32768) == 0) {
                i13 |= 196608;
                j6 = j5;
            } else {
                j6 = j5;
                if ((i10 & 196608) == 0) {
                    i13 |= composerKN.nr(j6) ? 131072 : 65536;
                }
            }
            if ((i7 & 65536) != 0) {
                i13 |= i29;
            } else if ((i10 & 1572864) == 0) {
                i29 = composerKN.p5(categoryBackgroundShape) ? 1048576 : 524288;
                i13 |= i29;
            }
            if ((i7 & 131072) == 0) {
                i13 |= 12582912;
            } else {
                if ((i10 & 12582912) == 0) {
                    i14 = i13 | (composerKN.rl(f3) ? 8388608 : 4194304);
                }
                if ((i7 & 262144) != 0) {
                    i14 |= 100663296;
                    paddingValues = categorySectionContentPadding;
                } else {
                    paddingValues = categorySectionContentPadding;
                    if ((i10 & 100663296) == 0) {
                        i14 |= composerKN.p5(paddingValues) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                }
                i15 = i7 & 524288;
                if (i15 != 0) {
                    i14 |= i27;
                } else if ((i10 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    i27 = composerKN.p5(modifier) ? 536870912 : 268435456;
                    i14 |= i27;
                }
                int i33 = i14;
                i16 = i7 & 1048576;
                if (i16 != 0) {
                    i17 = i5 | 6;
                } else if ((i5 & 6) == 0) {
                    i17 = i5 | (composerKN.p5(str) ? 4 : 2);
                } else {
                    i17 = i5;
                }
                i18 = i7 & 2097152;
                if (i18 != 0) {
                    i17 |= 48;
                } else if ((i5 & 48) == 0) {
                    i17 |= composerKN.p5(str2) ? 32 : 16;
                }
                int i34 = i17;
                i19 = i7 & 4194304;
                if (i19 != 0) {
                    i20 = i34 | RendererCapabilities.DECODER_SUPPORT_MASK;
                } else if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i20 = i34 | (composerKN.p5(str3) ? 256 : 128);
                } else {
                    i20 = i34;
                }
                i21 = i7 & 8388608;
                if (i21 != 0) {
                    i22 = i20 | 3072;
                } else {
                    int i35 = i20;
                    if ((i5 & 3072) == 0) {
                        i35 |= composerKN.p5(str4) ? 2048 : 1024;
                    }
                    i22 = i35;
                }
                i23 = i7 & 16777216;
                if (i23 == 0) {
                    i24 = i22;
                    if ((i5 & 24576) == 0) {
                        i24 |= composerKN.p5(str5) ? 16384 : 8192;
                    }
                    i25 = i7 & 33554432;
                    if (i25 == 0) {
                        i24 |= 196608;
                    } else if ((i5 & 196608) == 0) {
                        i24 |= composerKN.p5(str6) ? 131072 : 65536;
                    }
                    int i36 = i24;
                    if ((i30 & 306783379) != 306783378 && (306783379 & i33) == 306783378 && (i36 & 74899) == 74898 && composerKN.xMQ()) {
                        composerKN.wTp();
                        modifier2 = modifier;
                        str7 = str;
                        str8 = str2;
                        str9 = str3;
                        str10 = str4;
                        str11 = str5;
                        str12 = str6;
                        composer2 = composerKN;
                    } else {
                        Modifier modifier3 = i15 == 0 ? Modifier.INSTANCE : modifier;
                        String str13 = i16 == 0 ? null : str;
                        String str14 = i18 == 0 ? null : str2;
                        String str15 = i19 == 0 ? null : str3;
                        String str16 = i21 == 0 ? null : str4;
                        String str17 = i23 == 0 ? null : str5;
                        String str18 = i25 == 0 ? null : str6;
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1370689000, i30, i33, "com.bendingspoons.legal.privacy.ui.settings.internal.CategoriesList (CategoriesList.kt:65)");
                        }
                        MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
                        iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                        int i37 = i33;
                        Modifier modifierO = ComposedModifierKt.O(composerKN, modifier3);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Modifier modifier4 = modifier3;
                        Function0 function0N = companion.n();
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
                        Updater.O(composerN, measurePolicyN, companion.t());
                        Updater.O(composerN, compositionLocalMapIk, companion.O());
                        function2Rl = companion.rl();
                        if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion.nr());
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                        it = ArrayIteratorKt.iterator(Pr.Ml.values());
                        composerKN.eF(-578304474);
                        while (it.hasNext()) {
                            Pr.Ml ml = (Pr.Ml) it.next();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : trackers) {
                                Iterator it2 = it;
                                if (((Ew) obj).n() == ml) {
                                    arrayList.add(obj);
                                }
                                it = it2;
                            }
                            Iterator it3 = it;
                            int i38 = j.$EnumSwitchMapping$0[ml.ordinal()];
                            if (i38 == 1) {
                                state = isTechnicalEnabled;
                            } else if (i38 == 2) {
                                state = isAnalyticsEnabled;
                            } else {
                                if (i38 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                state = isProfilingEnabled;
                            }
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            State state2 = state;
                            int i39 = i30 >> 12;
                            int i40 = i37 << 18;
                            int i41 = ((i30 << 3) & 896) | (i39 & 57344) | (i39 & 458752) | (i40 & 3670016) | (i40 & 29360128);
                            int i42 = i37 << 15;
                            int i43 = i41 | (i42 & 234881024) | (i42 & 1879048192);
                            int i44 = ((i30 >> 18) & 14) | (i39 & 112) | ((i30 >> 15) & 896);
                            int i45 = i36 << 12;
                            int i46 = i44 | (i45 & 57344) | (i45 & 458752) | (i45 & 3670016) | (i45 & 29360128) | (i45 & 234881024) | (i45 & 1879048192);
                            int i47 = i37;
                            String str19 = str15;
                            String str20 = str13;
                            String str21 = str14;
                            Modifier modifier5 = modifier4;
                            Composer composer3 = composerKN;
                            String str22 = str16;
                            aC.t(ml, arrayList, preferences, state2, categoryNameTextStyle, categoryDescriptionTextStyle, trackerNameTextStyle, switchColors2, j3, j4, onTrackerToggled, onCategoryToggled, onInfoButtonClicked, PaddingKt.KN(BackgroundKt.t(companion2, j6, categoryBackgroundShape), paddingValues), str20, str21, str19, str22, str17, str18, composer3, i43, i46, 0);
                            composer3.eF(-578252249);
                            if (it3.hasNext()) {
                                float f4 = (float) 0.75d;
                                Modifier modifierKN = SizeKt.KN(SizeKt.xMQ(companion2, Dp.KN(Math.max(f3, Dp.KN(f4)))), 0.0f, 1, null);
                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), false);
                                int iN2 = ComposablesKt.n(composer3, 0);
                                CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                                Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierKN);
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0 function0N2 = companion4.n();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.t();
                                }
                                composer3.T();
                                if (composer3.getInserting()) {
                                    composer3.s7N(function0N2);
                                } else {
                                    composer3.r();
                                }
                                Composer composerN2 = Updater.n(composer3);
                                Updater.O(composerN2, measurePolicyUo, companion4.t());
                                Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
                                Function2 function2Rl2 = companion4.rl();
                                if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                    composerN2.o(Integer.valueOf(iN2));
                                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                }
                                Updater.O(composerN2, modifierO2, companion4.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                float fKN = Dp.KN(f4);
                                Modifier modifierN = boxScopeInstance.n(companion2, companion3.O());
                                i26 = i47;
                                DividerKt.rl(modifierN, fKN, j2, composer3, (i26 & 896) | 48, 0);
                                composer3.XQ();
                            } else {
                                i26 = i47;
                            }
                            composer3.Xw();
                            onCategoryToggled = function2;
                            onTrackerToggled = function22;
                            trackerNameTextStyle = textStyle;
                            switchColors2 = switchColors;
                            categoryBackgroundShape = shape;
                            paddingValues = categorySectionContentPadding;
                            composerKN = composer3;
                            i37 = i26;
                            str16 = str22;
                            it = it3;
                            modifier4 = modifier5;
                            j6 = j5;
                            str14 = str21;
                            str13 = str20;
                            str15 = str19;
                        }
                        composer2 = composerKN;
                        String str23 = str15;
                        String str24 = str13;
                        String str25 = str14;
                        Modifier modifier6 = modifier4;
                        String str26 = str16;
                        composer2.Xw();
                        composer2.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        str7 = str24;
                        str8 = str25;
                        str9 = str23;
                        str10 = str26;
                        str11 = str17;
                        str12 = str18;
                        modifier2 = modifier6;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2() { // from class: MuZ.w6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return Ml.t(trackers, preferences, isTechnicalEnabled, isAnalyticsEnabled, isProfilingEnabled, function2, function22, onInfoButtonClicked, categoryNameTextStyle, categoryDescriptionTextStyle, textStyle, switchColors, j2, j3, j4, j5, shape, f3, categorySectionContentPadding, modifier2, str7, str8, str9, str10, str11, str12, i2, i3, i5, i7, (Composer) obj2, ((Integer) obj3).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i24 = i22 | 24576;
                i25 = i7 & 33554432;
                if (i25 == 0) {
                }
                int i362 = i24;
                if ((i30 & 306783379) != 306783378) {
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if (i23 == 0) {
                    }
                    if (i25 == 0) {
                    }
                    if (ComposerKt.v()) {
                    }
                    MeasurePolicy measurePolicyN2 = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                    int i372 = i33;
                    Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifier3);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Modifier modifier42 = modifier3;
                    Function0 function0N3 = companion5.n();
                    if (composerKN.getApplier() == null) {
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                    }
                    composerN = Updater.n(composerKN);
                    Updater.O(composerN, measurePolicyN2, companion5.t());
                    Updater.O(composerN, compositionLocalMapIk3, companion5.O());
                    function2Rl = companion5.rl();
                    if (!composerN.getInserting()) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                        Updater.O(composerN, modifierO3, companion5.nr());
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                        it = ArrayIteratorKt.iterator(Pr.Ml.values());
                        composerKN.eF(-578304474);
                        while (it.hasNext()) {
                        }
                        composer2 = composerKN;
                        String str232 = str15;
                        String str242 = str13;
                        String str252 = str14;
                        Modifier modifier62 = modifier42;
                        String str262 = str16;
                        composer2.Xw();
                        composer2.XQ();
                        if (ComposerKt.v()) {
                        }
                        str7 = str242;
                        str8 = str252;
                        str9 = str232;
                        str10 = str262;
                        str11 = str17;
                        str12 = str18;
                        modifier2 = modifier62;
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            i14 = i13;
            if ((i7 & 262144) != 0) {
            }
            i15 = i7 & 524288;
            if (i15 != 0) {
            }
            int i332 = i14;
            i16 = i7 & 1048576;
            if (i16 != 0) {
            }
            i18 = i7 & 2097152;
            if (i18 != 0) {
            }
            int i342 = i17;
            i19 = i7 & 4194304;
            if (i19 != 0) {
            }
            i21 = i7 & 8388608;
            if (i21 != 0) {
            }
            i23 = i7 & 16777216;
            if (i23 == 0) {
            }
            i25 = i7 & 33554432;
            if (i25 == 0) {
            }
            int i3622 = i24;
            if ((i30 & 306783379) != 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        i13 = i12;
        if ((i7 & 32768) == 0) {
        }
        if ((i7 & 65536) != 0) {
        }
        if ((i7 & 131072) == 0) {
        }
        i14 = i13;
        if ((i7 & 262144) != 0) {
        }
        i15 = i7 & 524288;
        if (i15 != 0) {
        }
        int i3322 = i14;
        i16 = i7 & 1048576;
        if (i16 != 0) {
        }
        i18 = i7 & 2097152;
        if (i18 != 0) {
        }
        int i3422 = i17;
        i19 = i7 & 4194304;
        if (i19 != 0) {
        }
        i21 = i7 & 8388608;
        if (i21 != 0) {
        }
        i23 = i7 & 16777216;
        if (i23 == 0) {
        }
        i25 = i7 & 33554432;
        if (i25 == 0) {
        }
        int i36222 = i24;
        if ((i30 & 306783379) != 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(List list, Map map, State state, State state2, State state3, Function2 function2, Function2 function22, Function1 function1, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, SwitchColors switchColors, long j2, long j3, long j4, long j5, Shape shape, float f3, PaddingValues paddingValues, Modifier modifier, String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3, int i5, int i7, Composer composer, int i8) {
        rl(list, map, state, state2, state3, function2, function22, function1, textStyle, textStyle2, textStyle3, switchColors, j2, j3, j4, j5, shape, f3, paddingValues, modifier, str, str2, str3, str4, str5, str6, composer, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), RecomposeScopeImplKt.n(i5), i7);
        return Unit.INSTANCE;
    }

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Pr.Ml.values().length];
            try {
                iArr[Pr.Ml.f7844n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Pr.Ml.f7846t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Pr.Ml.f7843O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
