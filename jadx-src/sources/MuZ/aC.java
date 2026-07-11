package MuZ;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.material3.SwitchColors;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class aC {

    static final class j implements Function3 {
        final /* synthetic */ SwitchColors J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ TextStyle f6839O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Function1 f6840Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f6841n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function2 f6842o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f6843r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Map f6844t;

        j(List list, Map map, TextStyle textStyle, SwitchColors switchColors, long j2, Function2 function2, Function1 function1) {
            this.f6841n = list;
            this.f6844t = map;
            this.f6839O = textStyle;
            this.J2 = switchColors;
            this.f6843r = j2;
            this.f6842o = function2;
            this.f6840Z = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.v()) {
                ComposerKt.p5(-491303237, i2, -1, "com.bendingspoons.legal.privacy.ui.settings.internal.CategorySection.<anonymous>.<anonymous> (CategorySection.kt:73)");
            }
            AbstractC1419c.nr(this.f6841n, this.f6844t, this.f6839O, this.J2, this.f6843r, null, this.f6842o, this.f6840Z, composer, 0, 32);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Pr.Ml ml, List list, Map map, State state, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, SwitchColors switchColors, long j2, long j3, Function2 function2, Function2 function22, Function1 function1, Modifier modifier, String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3, int i5, Composer composer, int i7) {
        t(ml, list, map, state, textStyle, textStyle2, textStyle3, switchColors, j2, j3, function2, function22, function1, modifier, str, str2, str3, str4, str5, str6, composer, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:274:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final Pr.Ml category, final List trackers, final Map preferences, final State allowed, final TextStyle categoryNameTextStyle, final TextStyle categoryDescriptionTextStyle, final TextStyle trackerNameTextStyle, final SwitchColors switchColors, final long j2, final long j3, final Function2 onTrackerToggled, final Function2 onCategoryToggled, final Function1 onInfoButtonClicked, Modifier modifier, String str, String str2, String str3, String str4, String str5, String str6, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
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
        Object objIF;
        Composer.Companion companion;
        Composer.Companion companion2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Object objIF2;
        Composer composer2;
        final String str7;
        final String str8;
        final String str9;
        final String str10;
        final Modifier modifier2;
        final String str11;
        final String str12;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(allowed, "allowed");
        Intrinsics.checkNotNullParameter(categoryNameTextStyle, "categoryNameTextStyle");
        Intrinsics.checkNotNullParameter(categoryDescriptionTextStyle, "categoryDescriptionTextStyle");
        Intrinsics.checkNotNullParameter(trackerNameTextStyle, "trackerNameTextStyle");
        Intrinsics.checkNotNullParameter(switchColors, "switchColors");
        Intrinsics.checkNotNullParameter(onTrackerToggled, "onTrackerToggled");
        Intrinsics.checkNotNullParameter(onCategoryToggled, "onCategoryToggled");
        Intrinsics.checkNotNullParameter(onInfoButtonClicked, "onInfoButtonClicked");
        Composer composerKN = composer.KN(-1156364691);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = i2 | (composerKN.p5(category) ? 4 : 2);
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            i7 |= composerKN.E2(trackers) ? 32 : 16;
        }
        int i20 = i7;
        if ((i5 & 4) != 0) {
            i20 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i20 |= composerKN.E2(preferences) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i20 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i20 |= composerKN.p5(allowed) ? 2048 : 1024;
        }
        if ((i5 & 16) != 0) {
            i20 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i20 |= composerKN.p5(categoryNameTextStyle) ? 16384 : 8192;
        }
        if ((i5 & 32) != 0) {
            i20 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i20 |= composerKN.p5(categoryDescriptionTextStyle) ? 131072 : 65536;
        }
        if ((i5 & 64) != 0) {
            i20 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i20 |= composerKN.p5(trackerNameTextStyle) ? 1048576 : 524288;
        }
        if ((i5 & 128) != 0) {
            i20 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i20 |= composerKN.p5(switchColors) ? 8388608 : 4194304;
        }
        if ((i5 & 256) != 0) {
            i20 |= 100663296;
        } else {
            if ((i2 & 100663296) == 0) {
                i20 |= composerKN.nr(j2) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
            }
            if ((i5 & 512) == 0) {
                i20 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                i8 = 805306368;
            } else {
                i8 = 805306368;
                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    i20 |= composerKN.nr(j3) ? 536870912 : 268435456;
                }
                if ((i5 & 1024) != 0) {
                    i9 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    i9 = i3 | (composerKN.E2(onTrackerToggled) ? 4 : 2);
                } else {
                    i9 = i3;
                }
                if ((i5 & 2048) != 0) {
                    i9 |= 48;
                } else if ((i3 & 48) == 0) {
                    i9 |= composerKN.E2(onCategoryToggled) ? 32 : 16;
                }
                if ((i5 & 4096) != 0) {
                    i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i9 |= composerKN.E2(onInfoButtonClicked) ? 256 : 128;
                }
                i10 = i5 & 8192;
                if (i10 != 0) {
                    i11 = i9 | 3072;
                } else {
                    int i21 = i9;
                    if ((i3 & 3072) == 0) {
                        i21 |= composerKN.p5(modifier) ? 2048 : 1024;
                    }
                    i11 = i21;
                }
                i12 = i5 & 16384;
                if (i12 == 0) {
                    i13 = i11;
                    if ((i3 & 24576) == 0) {
                        i13 |= composerKN.p5(str) ? 16384 : 8192;
                    }
                    i14 = i5 & 32768;
                    if (i14 == 0) {
                        i13 |= 196608;
                    } else if ((i3 & 196608) == 0) {
                        i13 |= composerKN.p5(str2) ? 131072 : 65536;
                    }
                    i15 = i5 & 65536;
                    if (i15 == 0) {
                        i13 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i13 |= composerKN.p5(str3) ? 1048576 : 524288;
                    }
                    i16 = i5 & 131072;
                    if (i16 == 0) {
                        i13 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        i13 |= composerKN.p5(str4) ? 8388608 : 4194304;
                    }
                    i17 = i5 & 262144;
                    if (i17 == 0) {
                        i13 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i13 |= composerKN.p5(str5) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    i18 = i5 & 524288;
                    if (i18 == 0) {
                        i13 |= i8;
                    } else if ((i3 & i8) == 0) {
                        i13 |= composerKN.p5(str6) ? 536870912 : 268435456;
                    }
                    i19 = i13;
                    if ((i20 & 306783379) != 306783378 && (306783379 & i19) == 306783378 && composerKN.xMQ()) {
                        composerKN.wTp();
                        modifier2 = modifier;
                        str11 = str;
                        str12 = str2;
                        str7 = str3;
                        str8 = str4;
                        str9 = str5;
                        str10 = str6;
                        composer2 = composerKN;
                    } else {
                        Modifier modifier3 = i10 == 0 ? Modifier.INSTANCE : modifier;
                        String str13 = i12 == 0 ? null : str;
                        String str14 = i14 == 0 ? null : str2;
                        String str15 = i15 == 0 ? null : str3;
                        String str16 = i16 == 0 ? null : str4;
                        String str17 = i17 == 0 ? null : str5;
                        String str18 = i18 == 0 ? null : str6;
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1156364691, i20, i19, "com.bendingspoons.legal.privacy.ui.settings.internal.CategorySection (CategorySection.kt:47)");
                        }
                        composerKN.eF(-1150216716);
                        objIF = composerKN.iF();
                        companion = Composer.INSTANCE;
                        if (objIF != companion.n()) {
                            companion2 = companion;
                            objIF = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                            composerKN.o(objIF);
                        } else {
                            companion2 = companion;
                        }
                        final MutableState mutableState = (MutableState) objIF;
                        composerKN.Xw();
                        Pr.Ml ml = Pr.Ml.f7844n;
                        boolean z2 = category == ml;
                        boolean z3 = category == ml;
                        MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
                        iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                        Modifier modifierO = ComposedModifierKt.O(composerKN, modifier3);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Modifier modifier4 = modifier3;
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
                        boolean z4 = z3;
                        Updater.O(composerN, measurePolicyN, companion3.t());
                        Updater.O(composerN, compositionLocalMapIk, companion3.O());
                        function2Rl = companion3.rl();
                        if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion3.nr());
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                        boolean zBooleanValue = ((Boolean) allowed.getValue()).booleanValue();
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        boolean zBooleanValue2 = ((Boolean) mutableState.getValue()).booleanValue();
                        composerKN.eF(-1223744235);
                        objIF2 = composerKN.iF();
                        if (objIF2 == companion2.n()) {
                            objIF2 = new Function0() { // from class: MuZ.fuX
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return aC.nr(mutableState);
                                }
                            };
                            composerKN.o(objIF2);
                        }
                        composerKN.Xw();
                        int i22 = i20 << 6;
                        int i23 = (i20 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i22 & 3670016) | (i22 & 29360128);
                        int i24 = i20 << 3;
                        int i25 = i19 >> 6;
                        String str19 = str13;
                        String str20 = str15;
                        String str21 = str16;
                        String str22 = str18;
                        String str23 = str14;
                        String str24 = str17;
                        CN3.t(category, zBooleanValue, companion4, z2, zBooleanValue2, z4, categoryNameTextStyle, categoryDescriptionTextStyle, switchColors, j2, (Function0) objIF2, onCategoryToggled, str19, str23, str20, str21, str24, str22, composerKN, i23 | (i24 & 234881024) | (i24 & 1879048192), (i25 & 29360128) | (i25 & 896) | (i19 & 112) | 6 | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25), 0);
                        composer2 = composerKN;
                        AnimatedVisibilityKt.Uo(columnScopeInstance, ((Boolean) mutableState.getValue()).booleanValue(), null, null, null, null, ComposableLambdaKt.nr(-491303237, true, new j(trackers, preferences, trackerNameTextStyle, switchColors, j3, onTrackerToggled, onInfoButtonClicked), composerKN, 54), composer2, 1572870, 30);
                        composer2.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        str7 = str20;
                        str8 = str21;
                        str9 = str24;
                        str10 = str22;
                        modifier2 = modifier4;
                        str11 = str19;
                        str12 = str23;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2() { // from class: MuZ.Dsr
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return aC.O(category, trackers, preferences, allowed, categoryNameTextStyle, categoryDescriptionTextStyle, trackerNameTextStyle, switchColors, j2, j3, onTrackerToggled, onCategoryToggled, onInfoButtonClicked, modifier2, str11, str12, str7, str8, str9, str10, i2, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i13 = i11 | 24576;
                i14 = i5 & 32768;
                if (i14 == 0) {
                }
                i15 = i5 & 65536;
                if (i15 == 0) {
                }
                i16 = i5 & 131072;
                if (i16 == 0) {
                }
                i17 = i5 & 262144;
                if (i17 == 0) {
                }
                i18 = i5 & 524288;
                if (i18 == 0) {
                }
                i19 = i13;
                if ((i20 & 306783379) != 306783378) {
                    if (i10 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (ComposerKt.v()) {
                    }
                    composerKN.eF(-1150216716);
                    objIF = composerKN.iF();
                    companion = Composer.INSTANCE;
                    if (objIF != companion.n()) {
                    }
                    final MutableState mutableState2 = (MutableState) objIF;
                    composerKN.Xw();
                    Pr.Ml ml2 = Pr.Ml.f7844n;
                    if (category == ml2) {
                    }
                    if (category == ml2) {
                    }
                    MeasurePolicy measurePolicyN2 = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifier3);
                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                    Modifier modifier42 = modifier3;
                    Function0 function0N2 = companion32.n();
                    if (composerKN.getApplier() == null) {
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                    }
                    composerN = Updater.n(composerKN);
                    boolean z42 = z3;
                    Updater.O(composerN, measurePolicyN2, companion32.t());
                    Updater.O(composerN, compositionLocalMapIk2, companion32.O());
                    function2Rl = companion32.rl();
                    if (!composerN.getInserting()) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                        Updater.O(composerN, modifierO2, companion32.nr());
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                        boolean zBooleanValue3 = ((Boolean) allowed.getValue()).booleanValue();
                        Modifier.Companion companion42 = Modifier.INSTANCE;
                        boolean zBooleanValue22 = ((Boolean) mutableState2.getValue()).booleanValue();
                        composerKN.eF(-1223744235);
                        objIF2 = composerKN.iF();
                        if (objIF2 == companion2.n()) {
                        }
                        composerKN.Xw();
                        int i222 = i20 << 6;
                        int i232 = (i20 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i222 & 3670016) | (i222 & 29360128);
                        int i242 = i20 << 3;
                        int i252 = i19 >> 6;
                        String str192 = str13;
                        String str202 = str15;
                        String str212 = str16;
                        String str222 = str18;
                        String str232 = str14;
                        String str242 = str17;
                        CN3.t(category, zBooleanValue3, companion42, z2, zBooleanValue22, z42, categoryNameTextStyle, categoryDescriptionTextStyle, switchColors, j2, (Function0) objIF2, onCategoryToggled, str192, str232, str202, str212, str242, str222, composerKN, i232 | (i242 & 234881024) | (i242 & 1879048192), (i252 & 29360128) | (i252 & 896) | (i19 & 112) | 6 | (i252 & 7168) | (57344 & i252) | (458752 & i252) | (3670016 & i252), 0);
                        composer2 = composerKN;
                        AnimatedVisibilityKt.Uo(columnScopeInstance2, ((Boolean) mutableState2.getValue()).booleanValue(), null, null, null, null, ComposableLambdaKt.nr(-491303237, true, new j(trackers, preferences, trackerNameTextStyle, switchColors, j3, onTrackerToggled, onInfoButtonClicked), composerKN, 54), composer2, 1572870, 30);
                        composer2.XQ();
                        if (ComposerKt.v()) {
                        }
                        str7 = str202;
                        str8 = str212;
                        str9 = str242;
                        str10 = str222;
                        modifier2 = modifier42;
                        str11 = str192;
                        str12 = str232;
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            if ((i5 & 1024) != 0) {
            }
            if ((i5 & 2048) != 0) {
            }
            if ((i5 & 4096) != 0) {
            }
            i10 = i5 & 8192;
            if (i10 != 0) {
            }
            i12 = i5 & 16384;
            if (i12 == 0) {
            }
            i14 = i5 & 32768;
            if (i14 == 0) {
            }
            i15 = i5 & 65536;
            if (i15 == 0) {
            }
            i16 = i5 & 131072;
            if (i16 == 0) {
            }
            i17 = i5 & 262144;
            if (i17 == 0) {
            }
            i18 = i5 & 524288;
            if (i18 == 0) {
            }
            i19 = i13;
            if ((i20 & 306783379) != 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        if ((i5 & 512) == 0) {
        }
        if ((i5 & 1024) != 0) {
        }
        if ((i5 & 2048) != 0) {
        }
        if ((i5 & 4096) != 0) {
        }
        i10 = i5 & 8192;
        if (i10 != 0) {
        }
        i12 = i5 & 16384;
        if (i12 == 0) {
        }
        i14 = i5 & 32768;
        if (i14 == 0) {
        }
        i15 = i5 & 65536;
        if (i15 == 0) {
        }
        i16 = i5 & 131072;
        if (i16 == 0) {
        }
        i17 = i5 & 262144;
        if (i17 == 0) {
        }
        i18 = i5 & 524288;
        if (i18 == 0) {
        }
        i19 = i13;
        if ((i20 & 306783379) != 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(MutableState mutableState) {
        mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
        return Unit.INSTANCE;
    }
}
