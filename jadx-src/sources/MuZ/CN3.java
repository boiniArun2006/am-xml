package MuZ;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.KeyboardArrowDownKt;
import androidx.compose.material.icons.filled.KeyboardArrowUpKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SwitchColors;
import androidx.compose.material3.SwitchKt;
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
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class CN3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Pr.Ml ml, boolean z2, Modifier modifier, boolean z3, boolean z4, boolean z5, TextStyle textStyle, TextStyle textStyle2, SwitchColors switchColors, long j2, Function0 function0, Function2 function2, String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3, int i5, Composer composer, int i7) {
        t(ml, z2, modifier, z3, z4, z5, textStyle, textStyle2, switchColors, j2, function0, function2, str, str2, str3, str4, str5, str6, composer, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:334:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final Pr.Ml category, final boolean z2, Modifier modifier, boolean z3, boolean z4, boolean z5, final TextStyle titleTextStyle, final TextStyle descriptionTextStyle, final SwitchColors switchColors, final long j2, final Function0 onArrowClicked, final Function2 onCategoryToggled, String str, String str2, String str3, String str4, String str5, String str6, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        int i8;
        int i9;
        Modifier modifier2;
        int i10;
        int i11;
        int i12;
        boolean z6;
        int i13;
        int i14;
        int i15;
        final String str7;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z7;
        int i21;
        String strT;
        String strT2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        boolean z9;
        Object objIF;
        Composer composer2;
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final String str8;
        final String str9;
        final String str10;
        final String str11;
        final String str12;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i22;
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(titleTextStyle, "titleTextStyle");
        Intrinsics.checkNotNullParameter(descriptionTextStyle, "descriptionTextStyle");
        Intrinsics.checkNotNullParameter(switchColors, "switchColors");
        Intrinsics.checkNotNullParameter(onArrowClicked, "onArrowClicked");
        Intrinsics.checkNotNullParameter(onCategoryToggled, "onCategoryToggled");
        Composer composerKN = composer.KN(-255987788);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = i2 | (composerKN.p5(category) ? 4 : 2);
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i9 = i7 | 48;
            i8 = 4;
        } else {
            if ((i2 & 48) == 0) {
                i8 = 4;
                i7 |= composerKN.n(z2) ? 32 : 16;
            } else {
                i8 = 4;
            }
            i9 = i7;
        }
        int i23 = i5 & 4;
        if (i23 != 0) {
            i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i9 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i10 = i5 & 8;
            if (i10 == 0) {
                i9 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    i9 |= composerKN.n(z3) ? 2048 : 1024;
                }
                i11 = i5 & 16;
                if (i11 != 0) {
                    i9 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        i9 |= composerKN.n(z4) ? 16384 : 8192;
                    }
                    i12 = i5 & 32;
                    if (i12 == 0) {
                        i9 |= 196608;
                        z6 = z5;
                    } else {
                        z6 = z5;
                        if ((i2 & 196608) == 0) {
                            i9 |= composerKN.n(z6) ? 131072 : 65536;
                        }
                    }
                    if ((i5 & 64) == 0) {
                        i9 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i9 |= composerKN.p5(titleTextStyle) ? 1048576 : 524288;
                    }
                    if ((i5 & 128) == 0) {
                        i9 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i9 |= composerKN.p5(descriptionTextStyle) ? 8388608 : 4194304;
                    }
                    if ((i5 & 256) != 0) {
                        i22 = (i2 & 100663296) == 0 ? composerKN.p5(switchColors) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432 : 100663296;
                        if ((i5 & 512) != 0) {
                            i9 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i9 |= composerKN.nr(j2) ? 536870912 : 268435456;
                        }
                        i13 = i9;
                        if ((i5 & 1024) != 0) {
                            i14 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i14 = (composerKN.E2(onArrowClicked) ? i8 : 2) | i3;
                        } else {
                            i14 = i3;
                        }
                        if ((i5 & 2048) != 0) {
                            i14 |= 48;
                        } else if ((i3 & 48) == 0) {
                            i14 |= composerKN.E2(onCategoryToggled) ? 32 : 16;
                        }
                        i15 = i5 & 4096;
                        if (i15 != 0) {
                            i14 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                        } else {
                            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                str7 = str;
                                i14 |= composerKN.p5(str7) ? 256 : 128;
                            }
                            i16 = i5 & 8192;
                            if (i16 == 0) {
                                i14 |= 3072;
                            } else if ((i3 & 3072) == 0) {
                                i14 |= composerKN.p5(str2) ? 2048 : 1024;
                            }
                            i17 = i5 & 16384;
                            if (i17 != 0) {
                                if ((i3 & 24576) == 0) {
                                    i14 |= composerKN.p5(str3) ? 16384 : 8192;
                                }
                                i18 = i5 & 32768;
                                if (i18 != 0) {
                                    i14 |= 196608;
                                } else if ((i3 & 196608) == 0) {
                                    i14 |= composerKN.p5(str4) ? 131072 : 65536;
                                }
                                i19 = i5 & 65536;
                                if (i19 != 0) {
                                    i14 |= 1572864;
                                } else if ((i3 & 1572864) == 0) {
                                    i14 |= composerKN.p5(str5) ? 1048576 : 524288;
                                }
                                i20 = i5 & 131072;
                                if (i20 != 0) {
                                    i14 |= 12582912;
                                } else if ((i3 & 12582912) == 0) {
                                    i14 |= composerKN.p5(str6) ? 8388608 : 4194304;
                                }
                                if ((i13 & 306783379) == 306783378 && (4793491 & i14) == 4793490 && composerKN.xMQ()) {
                                    composerKN.wTp();
                                    z12 = z3;
                                    z11 = z4;
                                    str9 = str3;
                                    str10 = str4;
                                    str11 = str5;
                                    str12 = str6;
                                    z10 = z6;
                                    composer2 = composerKN;
                                    modifier3 = modifier2;
                                    str8 = str2;
                                } else {
                                    Modifier modifier4 = i23 == 0 ? Modifier.INSTANCE : modifier2;
                                    z7 = i10 == 0 ? true : z3;
                                    boolean z13 = i11 == 0 ? false : z4;
                                    boolean z14 = i12 == 0 ? true : z6;
                                    String str13 = i15 == 0 ? null : str7;
                                    String str14 = i16 == 0 ? null : str2;
                                    String str15 = i17 == 0 ? null : str3;
                                    String str16 = i18 == 0 ? null : str4;
                                    String str17 = i19 == 0 ? null : str5;
                                    String str18 = i20 == 0 ? null : str6;
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-255987788, i13, i14, "com.bendingspoons.legal.privacy.ui.settings.internal.CategoryHeader (CategoryHeader.kt:57)");
                                    }
                                    i21 = j.$EnumSwitchMapping$0[category.ordinal()];
                                    if (i21 != 1) {
                                        composerKN.eF(-682525830);
                                        composerKN.eF(-1823131634);
                                        strT = str13 == null ? StringResources_androidKt.t(K0.aC.f4814S, composerKN, 0) : str13;
                                        composerKN.Xw();
                                        strT2 = str14 == null ? StringResources_androidKt.t(K0.aC.XQ, composerKN, 0) : str14;
                                        composerKN.Xw();
                                        Unit unit = Unit.INSTANCE;
                                    } else if (i21 == 2) {
                                        composerKN.eF(-682192518);
                                        composerKN.eF(-1823120882);
                                        strT = str15 == null ? StringResources_androidKt.t(K0.aC.HI, composerKN, 0) : str15;
                                        composerKN.Xw();
                                        strT2 = str16 == null ? StringResources_androidKt.t(K0.aC.ty, composerKN, 0) : str16;
                                        composerKN.Xw();
                                        Unit unit2 = Unit.INSTANCE;
                                    } else {
                                        if (i21 != 3) {
                                            composerKN.eF(-1823133338);
                                            composerKN.Xw();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        composerKN.eF(-681859206);
                                        composerKN.eF(-1823110130);
                                        strT = str17 == null ? StringResources_androidKt.t(K0.aC.f4818o, composerKN, 0) : str17;
                                        composerKN.Xw();
                                        strT2 = str18 == null ? StringResources_androidKt.t(K0.aC.f4819r, composerKN, 0) : str18;
                                        composerKN.Xw();
                                        Unit unit3 = Unit.INSTANCE;
                                    }
                                    String str19 = strT2;
                                    Modifier modifierKN = SizeKt.KN(modifier4, 0.0f, 1, null);
                                    Arrangement arrangement = Arrangement.f17400n;
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalNr = arrangement.nr();
                                    Alignment.Companion companion = Alignment.INSTANCE;
                                    Modifier modifier5 = modifier4;
                                    MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalNr, companion.qie(), composerKN, 6);
                                    iN = ComposablesKt.n(composerKN, 0);
                                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composerKN, modifierKN);
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
                                    Updater.O(composerN, measurePolicyRl, companion2.t());
                                    Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                    function2Rl = companion2.rl();
                                    if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                        composerN.o(Integer.valueOf(iN));
                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                    }
                                    Updater.O(composerN, modifierO, companion2.nr());
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    Modifier modifierRl = RowScope.rl(rowScopeInstance, companion3, 0.75f, false, 2, null);
                                    MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.ty(Dp.KN(7)), companion.gh(), composerKN, 6);
                                    iN2 = ComposablesKt.n(composerKN, 0);
                                    CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                                    Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierRl);
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
                                    Updater.O(composerN2, measurePolicyN, companion2.t());
                                    Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
                                    function2Rl2 = companion2.rl();
                                    if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                        composerN2.o(Integer.valueOf(iN2));
                                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                    }
                                    Updater.O(composerN2, modifierO2, companion2.nr());
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                                    TextKt.t(strT, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, titleTextStyle, composerKN, 0, i13 & 3670016, 65534);
                                    int i24 = i13 >> 3;
                                    TextKt.t(str19, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, descriptionTextStyle, composerKN, 0, i24 & 3670016, 65534);
                                    composerKN.XQ();
                                    float f3 = 20;
                                    SpacerKt.n(SizeKt.ViF(companion3, Dp.KN(f3)), composerKN, 6);
                                    Modifier modifierT = rowScopeInstance.t(companion3, companion.xMQ());
                                    composerKN.eF(-1385805086);
                                    z9 = ((i14 & 112) != 32) | ((i13 & 14) == 4);
                                    objIF = composerKN.iF();
                                    if (!z9 || objIF == Composer.INSTANCE.n()) {
                                        objIF = new Function1() { // from class: MuZ.I28
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return CN3.nr(onCategoryToggled, category, ((Boolean) obj).booleanValue());
                                            }
                                        };
                                        composerKN.o(objIF);
                                    }
                                    composerKN.Xw();
                                    boolean z15 = z14;
                                    SwitchKt.n(z2, (Function1) objIF, modifierT, null, z15, switchColors, null, composerKN, (i24 & 57358) | ((i13 >> 9) & 458752), 72);
                                    composerKN.eF(-1385799905);
                                    if (z7) {
                                        composer2 = composerKN;
                                    } else {
                                        SpacerKt.n(SizeKt.ViF(companion3, Dp.KN(f3)), composerKN, 6);
                                        ImageVector imageVectorN = z13 ? KeyboardArrowUpKt.n(Icons.f23855n.n()) : KeyboardArrowDownKt.n(Icons.f23855n.n());
                                        composerKN.eF(-1385791866);
                                        Object objIF2 = composerKN.iF();
                                        if (objIF2 == Composer.INSTANCE.n()) {
                                            objIF2 = InteractionSourceKt.n();
                                            composerKN.o(objIF2);
                                        }
                                        composerKN.Xw();
                                        IconKt.nr(imageVectorN, "Expand/Collapse the category", ClickableKt.nr(rowScopeInstance.t(companion3, companion.xMQ()), (MutableInteractionSource) objIF2, null, false, null, null, onArrowClicked, 28, null), j2, composerKN, ((i13 >> 18) & 7168) | 48, 0);
                                        composer2 = composerKN;
                                    }
                                    composer2.Xw();
                                    composer2.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    z10 = z15;
                                    z11 = z13;
                                    z12 = z7;
                                    str7 = str13;
                                    str8 = str14;
                                    str9 = str15;
                                    str10 = str16;
                                    str11 = str17;
                                    str12 = str18;
                                    modifier3 = modifier5;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2() { // from class: MuZ.Wre
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return CN3.O(category, z2, modifier3, z12, z11, z10, titleTextStyle, descriptionTextStyle, switchColors, j2, onArrowClicked, onCategoryToggled, str7, str8, str9, str10, str11, str12, i2, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i14 |= 24576;
                            i18 = i5 & 32768;
                            if (i18 != 0) {
                            }
                            i19 = i5 & 65536;
                            if (i19 != 0) {
                            }
                            i20 = i5 & 131072;
                            if (i20 != 0) {
                            }
                            if ((i13 & 306783379) == 306783378) {
                                if (i23 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i15 == 0) {
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
                                if (ComposerKt.v()) {
                                }
                                i21 = j.$EnumSwitchMapping$0[category.ordinal()];
                                if (i21 != 1) {
                                }
                                String str192 = strT2;
                                Modifier modifierKN2 = SizeKt.KN(modifier4, 0.0f, 1, null);
                                Arrangement arrangement2 = Arrangement.f17400n;
                                Arrangement.HorizontalOrVertical horizontalOrVerticalNr2 = arrangement2.nr();
                                Alignment.Companion companion4 = Alignment.INSTANCE;
                                Modifier modifier52 = modifier4;
                                MeasurePolicy measurePolicyRl2 = RowKt.rl(horizontalOrVerticalNr2, companion4.qie(), composerKN, 6);
                                iN = ComposablesKt.n(composerKN, 0);
                                CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                                Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierKN2);
                                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                Function0 function0N3 = companion22.n();
                                if (composerKN.getApplier() == null) {
                                }
                                composerKN.T();
                                if (composerKN.getInserting()) {
                                }
                                composerN = Updater.n(composerKN);
                                Updater.O(composerN, measurePolicyRl2, companion22.t());
                                Updater.O(composerN, compositionLocalMapIk3, companion22.O());
                                function2Rl = companion22.rl();
                                if (!composerN.getInserting()) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                    Updater.O(composerN, modifierO3, companion22.nr());
                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                                    Modifier.Companion companion32 = Modifier.INSTANCE;
                                    Modifier modifierRl2 = RowScope.rl(rowScopeInstance2, companion32, 0.75f, false, 2, null);
                                    MeasurePolicy measurePolicyN2 = ColumnKt.n(arrangement2.ty(Dp.KN(7)), companion4.gh(), composerKN, 6);
                                    iN2 = ComposablesKt.n(composerKN, 0);
                                    CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                                    Modifier modifierO22 = ComposedModifierKt.O(composerKN, modifierRl2);
                                    Function0 function0N22 = companion22.n();
                                    if (composerKN.getApplier() == null) {
                                    }
                                    composerKN.T();
                                    if (composerKN.getInserting()) {
                                    }
                                    composerN2 = Updater.n(composerKN);
                                    Updater.O(composerN2, measurePolicyN2, companion22.t());
                                    Updater.O(composerN2, compositionLocalMapIk22, companion22.O());
                                    function2Rl2 = companion22.rl();
                                    if (!composerN2.getInserting()) {
                                        composerN2.o(Integer.valueOf(iN2));
                                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                        Updater.O(composerN2, modifierO22, companion22.nr());
                                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                                        TextKt.t(strT, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, titleTextStyle, composerKN, 0, i13 & 3670016, 65534);
                                        int i242 = i13 >> 3;
                                        TextKt.t(str192, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, descriptionTextStyle, composerKN, 0, i242 & 3670016, 65534);
                                        composerKN.XQ();
                                        float f32 = 20;
                                        SpacerKt.n(SizeKt.ViF(companion32, Dp.KN(f32)), composerKN, 6);
                                        Modifier modifierT2 = rowScopeInstance2.t(companion32, companion4.xMQ());
                                        composerKN.eF(-1385805086);
                                        z9 = ((i14 & 112) != 32) | ((i13 & 14) == 4);
                                        objIF = composerKN.iF();
                                        if (!z9) {
                                            objIF = new Function1() { // from class: MuZ.I28
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return CN3.nr(onCategoryToggled, category, ((Boolean) obj).booleanValue());
                                                }
                                            };
                                            composerKN.o(objIF);
                                            composerKN.Xw();
                                            boolean z152 = z14;
                                            SwitchKt.n(z2, (Function1) objIF, modifierT2, null, z152, switchColors, null, composerKN, (i242 & 57358) | ((i13 >> 9) & 458752), 72);
                                            composerKN.eF(-1385799905);
                                            if (z7) {
                                            }
                                            composer2.Xw();
                                            composer2.XQ();
                                            if (ComposerKt.v()) {
                                            }
                                            z10 = z152;
                                            z11 = z13;
                                            z12 = z7;
                                            str7 = str13;
                                            str8 = str14;
                                            str9 = str15;
                                            str10 = str16;
                                            str11 = str17;
                                            str12 = str18;
                                            modifier3 = modifier52;
                                        }
                                    }
                                }
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        str7 = str;
                        i16 = i5 & 8192;
                        if (i16 == 0) {
                        }
                        i17 = i5 & 16384;
                        if (i17 != 0) {
                        }
                        i18 = i5 & 32768;
                        if (i18 != 0) {
                        }
                        i19 = i5 & 65536;
                        if (i19 != 0) {
                        }
                        i20 = i5 & 131072;
                        if (i20 != 0) {
                        }
                        if ((i13 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    i9 |= i22;
                    if ((i5 & 512) != 0) {
                    }
                    i13 = i9;
                    if ((i5 & 1024) != 0) {
                    }
                    if ((i5 & 2048) != 0) {
                    }
                    i15 = i5 & 4096;
                    if (i15 != 0) {
                    }
                    str7 = str;
                    i16 = i5 & 8192;
                    if (i16 == 0) {
                    }
                    i17 = i5 & 16384;
                    if (i17 != 0) {
                    }
                    i18 = i5 & 32768;
                    if (i18 != 0) {
                    }
                    i19 = i5 & 65536;
                    if (i19 != 0) {
                    }
                    i20 = i5 & 131072;
                    if (i20 != 0) {
                    }
                    if ((i13 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i12 = i5 & 32;
                if (i12 == 0) {
                }
                if ((i5 & 64) == 0) {
                }
                if ((i5 & 128) == 0) {
                }
                if ((i5 & 256) != 0) {
                }
                i9 |= i22;
                if ((i5 & 512) != 0) {
                }
                i13 = i9;
                if ((i5 & 1024) != 0) {
                }
                if ((i5 & 2048) != 0) {
                }
                i15 = i5 & 4096;
                if (i15 != 0) {
                }
                str7 = str;
                i16 = i5 & 8192;
                if (i16 == 0) {
                }
                i17 = i5 & 16384;
                if (i17 != 0) {
                }
                i18 = i5 & 32768;
                if (i18 != 0) {
                }
                i19 = i5 & 65536;
                if (i19 != 0) {
                }
                i20 = i5 & 131072;
                if (i20 != 0) {
                }
                if ((i13 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            i11 = i5 & 16;
            if (i11 != 0) {
            }
            i12 = i5 & 32;
            if (i12 == 0) {
            }
            if ((i5 & 64) == 0) {
            }
            if ((i5 & 128) == 0) {
            }
            if ((i5 & 256) != 0) {
            }
            i9 |= i22;
            if ((i5 & 512) != 0) {
            }
            i13 = i9;
            if ((i5 & 1024) != 0) {
            }
            if ((i5 & 2048) != 0) {
            }
            i15 = i5 & 4096;
            if (i15 != 0) {
            }
            str7 = str;
            i16 = i5 & 8192;
            if (i16 == 0) {
            }
            i17 = i5 & 16384;
            if (i17 != 0) {
            }
            i18 = i5 & 32768;
            if (i18 != 0) {
            }
            i19 = i5 & 65536;
            if (i19 != 0) {
            }
            i20 = i5 & 131072;
            if (i20 != 0) {
            }
            if ((i13 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i10 = i5 & 8;
        if (i10 == 0) {
        }
        i11 = i5 & 16;
        if (i11 != 0) {
        }
        i12 = i5 & 32;
        if (i12 == 0) {
        }
        if ((i5 & 64) == 0) {
        }
        if ((i5 & 128) == 0) {
        }
        if ((i5 & 256) != 0) {
        }
        i9 |= i22;
        if ((i5 & 512) != 0) {
        }
        i13 = i9;
        if ((i5 & 1024) != 0) {
        }
        if ((i5 & 2048) != 0) {
        }
        i15 = i5 & 4096;
        if (i15 != 0) {
        }
        str7 = str;
        i16 = i5 & 8192;
        if (i16 == 0) {
        }
        i17 = i5 & 16384;
        if (i17 != 0) {
        }
        i18 = i5 & 32768;
        if (i18 != 0) {
        }
        i19 = i5 & 65536;
        if (i19 != 0) {
        }
        i20 = i5 & 131072;
        if (i20 != 0) {
        }
        if ((i13 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(Function2 function2, Pr.Ml ml, boolean z2) {
        function2.invoke(ml, Boolean.valueOf(z2));
        return Unit.INSTANCE;
    }
}
