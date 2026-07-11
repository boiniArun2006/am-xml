package KA9;

import KA9.Lu;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.BitmapLruCache;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class g9s {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f4945n = Dp.KN(8);

    /* JADX WARN: Removed duplicated region for block: B:100:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:311:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(final ProjectInfo project, final float f3, final float f4, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, Function0 function08, Function0 function09, Function0 function010, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker, okd.n nVar, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        int i8;
        int i9;
        Function0 function011;
        int i10;
        Function0 function012;
        int i11;
        Function0 function013;
        int i12;
        Function0 function014;
        int i13;
        Function0 function015;
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
        int i25;
        int i26;
        int i27;
        final Function0 function016;
        Function0 function017;
        Object objIF;
        Composer.Companion companion;
        boolean z2;
        Object objIF2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Function0 function018;
        final Function0 function019;
        final BitmapLruCache bitmapLruCache2;
        final SceneThumbnailMaker sceneThumbnailMaker2;
        final okd.n nVar2;
        Composer composer2;
        final Function0 function020;
        final Function0 function021;
        final Function0 function022;
        final Function0 function023;
        final Function0 function024;
        final Function0 function025;
        final Function0 function026;
        final Function0 function027;
        final Function0 function028;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(project, "project");
        Composer composerKN = composer.KN(-650146468);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = i2 | (composerKN.p5(project) ? 4 : 2);
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            i7 |= composerKN.rl(f3) ? 32 : 16;
        }
        int i28 = i7;
        if ((i5 & 4) != 0) {
            i28 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            i8 = 2;
        } else {
            i8 = 2;
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i28 |= composerKN.rl(f4) ? 256 : 128;
            }
        }
        int i29 = i5 & 8;
        if (i29 != 0) {
            i28 |= 3072;
            i9 = 1;
        } else {
            i9 = 1;
            if ((i2 & 3072) == 0) {
                function011 = function0;
                i28 |= composerKN.E2(function011) ? 2048 : 1024;
            }
            i10 = i5 & 16;
            if (i10 == 0) {
                i28 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    function012 = function02;
                    i28 |= composerKN.E2(function012) ? 16384 : 8192;
                }
                i11 = i5 & 32;
                if (i11 != 0) {
                    i28 |= 196608;
                    function013 = function03;
                } else {
                    function013 = function03;
                    if ((i2 & 196608) == 0) {
                        i28 |= composerKN.E2(function013) ? 131072 : 65536;
                    }
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                    i28 |= 1572864;
                    function014 = function04;
                } else {
                    function014 = function04;
                    if ((i2 & 1572864) == 0) {
                        i28 |= composerKN.E2(function014) ? 1048576 : 524288;
                    }
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                    i28 |= 12582912;
                    function015 = function05;
                } else {
                    function015 = function05;
                    if ((i2 & 12582912) == 0) {
                        i28 |= composerKN.E2(function015) ? 8388608 : 4194304;
                    }
                }
                i14 = i5 & 256;
                if (i14 != 0) {
                    i28 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i28 |= composerKN.E2(function06) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                }
                i15 = i5 & 512;
                if (i15 != 0) {
                    i28 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    i16 = i15;
                } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    i16 = i15;
                    i28 |= composerKN.E2(function07) ? 536870912 : 268435456;
                } else {
                    i16 = i15;
                }
                i17 = i5 & 1024;
                if (i17 != 0) {
                    i18 = i17;
                    i19 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    i19 = i3 | (composerKN.E2(function08) ? 4 : i8);
                    i18 = i17;
                } else {
                    i18 = i17;
                    i19 = i3;
                }
                i20 = i5 & 2048;
                if (i20 != 0) {
                    i19 |= 48;
                } else if ((i3 & 48) == 0) {
                    i19 |= composerKN.E2(function09) ? 32 : 16;
                }
                int i30 = i19;
                i21 = i5 & 4096;
                if (i21 != 0) {
                    i23 = i30 | RendererCapabilities.DECODER_SUPPORT_MASK;
                } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i23 = i30 | (composerKN.E2(function010) ? 256 : 128);
                } else {
                    i22 = i21;
                    i23 = i30;
                    i24 = i5 & 8192;
                    if (i24 == 0) {
                        i23 |= 3072;
                    } else if ((i3 & 3072) == 0) {
                        i23 |= composerKN.p5(bitmapLruCache) ? 2048 : 1024;
                    }
                    i25 = i5 & 16384;
                    if (i25 != 0) {
                        if ((i3 & 24576) == 0) {
                            i23 |= composerKN.E2(sceneThumbnailMaker) ? 16384 : 8192;
                        }
                        i26 = i5 & 32768;
                        if (i26 != 0) {
                            i27 = i23 | 196608;
                        } else if ((i3 & 196608) == 0) {
                            i27 = i23 | (composerKN.p5(nVar) ? 131072 : 65536);
                        } else {
                            i27 = i23;
                        }
                        if ((i28 & 306783379) == 306783378 && (74899 & i27) == 74898 && composerKN.xMQ()) {
                            composerKN.wTp();
                            function022 = function07;
                            bitmapLruCache2 = bitmapLruCache;
                            sceneThumbnailMaker2 = sceneThumbnailMaker;
                            nVar2 = nVar;
                            function019 = function011;
                            composer2 = composerKN;
                            function028 = function012;
                            function020 = function013;
                            function021 = function06;
                            function023 = function08;
                            function026 = function09;
                            function027 = function015;
                            function025 = function014;
                            function024 = function010;
                        } else {
                            if (i29 == 0) {
                                composerKN.eF(-1144141473);
                                Object objIF3 = composerKN.iF();
                                if (objIF3 == Composer.INSTANCE.n()) {
                                    objIF3 = new Function0() { // from class: KA9.Q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return g9s.J2();
                                        }
                                    };
                                    composerKN.o(objIF3);
                                }
                                function016 = (Function0) objIF3;
                                composerKN.Xw();
                            } else {
                                function016 = function011;
                            }
                            function017 = i10 == 0 ? null : function012;
                            Function0 function029 = i11 == 0 ? null : function013;
                            Function0 function030 = i12 == 0 ? null : function014;
                            if (i13 != 0) {
                                function015 = null;
                            }
                            Function0 function031 = i14 == 0 ? null : function06;
                            Function0 function032 = i16 == 0 ? null : function07;
                            Function0 function033 = i18 == 0 ? null : function08;
                            Function0 function034 = i20 == 0 ? null : function09;
                            Function0 function035 = i22 == 0 ? null : function010;
                            BitmapLruCache bitmapLruCache3 = i24 == 0 ? null : bitmapLruCache;
                            SceneThumbnailMaker sceneThumbnailMaker3 = i25 == 0 ? null : sceneThumbnailMaker;
                            okd.n nVar3 = i26 == 0 ? null : nVar;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-650146468, i28, i27, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.components.ProjectItemSelected (ProjectItemSelected.kt:56)");
                            }
                            composerKN.eF(-1144124092);
                            objIF = composerKN.iF();
                            companion = Composer.INSTANCE;
                            int i31 = i27;
                            if (objIF == companion.n()) {
                                objIF = InteractionSourceKt.n();
                                composerKN.o(objIF);
                            }
                            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objIF;
                            composerKN.Xw();
                            Lu.fuX fux = function017 == null ? new Lu.fuX(function017) : null;
                            Lu.Wre wre = function029 == null ? new Lu.Wre(function029) : null;
                            Lu.CN3 cn3 = function015 == null ? new Lu.CN3(function015) : null;
                            Lu.I28 i282 = function030 == null ? new Lu.I28(function030) : null;
                            Lu.Dsr dsr = function031 == null ? new Lu.Dsr(function031) : null;
                            Lu.j jVar = function033 == null ? new Lu.j(function033) : null;
                            Lu.Ml ml = function032 == null ? new Lu.Ml(function032) : null;
                            Lu.w6 w6Var = function034 == null ? new Lu.w6(function034) : null;
                            Lu.n nVar4 = function035 == null ? new Lu.n(function035) : null;
                            Lu[] luArr = new Lu[9];
                            luArr[0] = fux;
                            luArr[i9] = wre;
                            luArr[i8] = cn3;
                            luArr[3] = i282;
                            luArr[4] = dsr;
                            luArr[5] = jVar;
                            luArr[6] = ml;
                            luArr[7] = w6Var;
                            luArr[8] = nVar4;
                            List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) luArr);
                            float fKN = Dp.KN(104 + (listListOfNotNull.size() * 48));
                            float fKN2 = Dp.Uo(Dp.KN(f3 + fKN), f4) >= 0 ? Dp.KN(0) : Dp.KN(Dp.KN(-fKN) - f4945n);
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Modifier modifierNr = BackgroundKt.nr(companion2, aD.w6.a63(), null, 2, null);
                            float f5 = fKN2;
                            Function0 function036 = function035;
                            Modifier modifierGh = PaddingKt.gh(SizeKt.J2(modifierNr, 0.0f, i9, null), Dp.KN(16), 0.0f, i8, null);
                            composerKN.eF(-1144086256);
                            z2 = (i28 & 7168) != 2048;
                            objIF2 = composerKN.iF();
                            if (!z2 || objIF2 == companion.n()) {
                                objIF2 = new Function0() { // from class: KA9.r
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return g9s.Uo(function016);
                                    }
                                };
                                composerKN.o(objIF2);
                            }
                            composerKN.Xw();
                            Modifier modifierT = OffsetKt.t(ClickableKt.nr(modifierGh, mutableInteractionSource, null, false, null, null, (Function0) objIF2, 28, null), 0.0f, f3, 1, null);
                            Arrangement.Vertical verticalUo = Arrangement.f17400n.Uo();
                            Alignment.Companion companion3 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion3.gh(), composerKN, 0);
                            iN = ComposablesKt.n(composerKN, 0);
                            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierT);
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            Function0 function0N = companion4.n();
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
                            Function0 function037 = function016;
                            Updater.O(composerN, measurePolicyN, companion4.t());
                            Updater.O(composerN, compositionLocalMapIk, companion4.O());
                            function2Rl = companion4.rl();
                            if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                composerN.o(Integer.valueOf(iN));
                                composerN.az(Integer.valueOf(iN), function2Rl);
                            }
                            Updater.O(composerN, modifierO, companion4.nr());
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                            composerKN.eF(2024677930);
                            if (function017 != null) {
                                composerKN.eF(2024678302);
                                Object objIF4 = composerKN.iF();
                                if (objIF4 == companion.n()) {
                                    objIF4 = new Function0() { // from class: KA9.SPz
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return g9s.KN();
                                        }
                                    };
                                    composerKN.o(objIF4);
                                }
                                function018 = (Function0) objIF4;
                                composerKN.Xw();
                            } else {
                                function018 = function017;
                            }
                            composerKN.Xw();
                            int i32 = (i31 >> 9) & 1022;
                            Function0 function038 = function030;
                            SceneThumbnailMaker sceneThumbnailMaker4 = sceneThumbnailMaker3;
                            Function0 function039 = function032;
                            Function0 function040 = function033;
                            Function0 function041 = function034;
                            Function0 function042 = function015;
                            Function0 function043 = function017;
                            BitmapLruCache bitmapLruCache4 = bitmapLruCache3;
                            Function0 function044 = function029;
                            okd.n nVar5 = nVar3;
                            Function0 function045 = function031;
                            UGc.KN(project, false, false, null, null, function037, null, false, false, function018, bitmapLruCache4, sceneThumbnailMaker4, nVar5, composerKN, (i28 & 14) | 100663728 | ((i28 << 6) & 458752), i32, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
                            SpacerKt.n(SizeKt.xMQ(companion2, f4945n), composerKN, 6);
                            vd.xMQ(OffsetKt.t(BackgroundKt.nr(columnScopeInstance.t(companion2, companion3.mUb()), Color.INSTANCE.J2(), null, 2, null), 0.0f, f5, 1, null), false, function037, listListOfNotNull, composerKN, ((i28 >> 3) & 896) | 48, 0);
                            composerKN.XQ();
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            function019 = function037;
                            bitmapLruCache2 = bitmapLruCache4;
                            sceneThumbnailMaker2 = sceneThumbnailMaker4;
                            nVar2 = nVar5;
                            composer2 = composerKN;
                            function020 = function044;
                            function021 = function045;
                            function022 = function039;
                            function023 = function040;
                            function024 = function036;
                            function025 = function038;
                            function026 = function041;
                            function027 = function042;
                            function028 = function043;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2() { // from class: KA9.ci
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return g9s.xMQ(project, f3, f4, function019, function028, function020, function025, function027, function021, function022, function023, function026, function024, bitmapLruCache2, sceneThumbnailMaker2, nVar2, i2, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i23 |= 24576;
                    i26 = i5 & 32768;
                    if (i26 != 0) {
                    }
                    if ((i28 & 306783379) == 306783378) {
                        if (i29 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i20 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i24 == 0) {
                        }
                        if (i25 == 0) {
                        }
                        if (i26 == 0) {
                        }
                        if (ComposerKt.v()) {
                        }
                        composerKN.eF(-1144124092);
                        objIF = composerKN.iF();
                        companion = Composer.INSTANCE;
                        int i312 = i27;
                        if (objIF == companion.n()) {
                        }
                        MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objIF;
                        composerKN.Xw();
                        Lu.fuX fux2 = function017 == null ? new Lu.fuX(function017) : null;
                        Lu.Wre wre2 = function029 == null ? new Lu.Wre(function029) : null;
                        Lu.CN3 cn32 = function015 == null ? new Lu.CN3(function015) : null;
                        Lu.I28 i2822 = function030 == null ? new Lu.I28(function030) : null;
                        Lu.Dsr dsr2 = function031 == null ? new Lu.Dsr(function031) : null;
                        Lu.j jVar2 = function033 == null ? new Lu.j(function033) : null;
                        Lu.Ml ml2 = function032 == null ? new Lu.Ml(function032) : null;
                        Lu.w6 w6Var2 = function034 == null ? new Lu.w6(function034) : null;
                        if (function035 == null) {
                        }
                        Lu[] luArr2 = new Lu[9];
                        luArr2[0] = fux2;
                        luArr2[i9] = wre2;
                        luArr2[i8] = cn32;
                        luArr2[3] = i2822;
                        luArr2[4] = dsr2;
                        luArr2[5] = jVar2;
                        luArr2[6] = ml2;
                        luArr2[7] = w6Var2;
                        luArr2[8] = nVar4;
                        List listListOfNotNull2 = CollectionsKt.listOfNotNull((Object[]) luArr2);
                        float fKN3 = Dp.KN(104 + (listListOfNotNull2.size() * 48));
                        if (Dp.Uo(Dp.KN(f3 + fKN3), f4) >= 0) {
                        }
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        Modifier modifierNr2 = BackgroundKt.nr(companion22, aD.w6.a63(), null, 2, null);
                        float f53 = fKN2;
                        Function0 function0362 = function035;
                        Modifier modifierGh2 = PaddingKt.gh(SizeKt.J2(modifierNr2, 0.0f, i9, null), Dp.KN(16), 0.0f, i8, null);
                        composerKN.eF(-1144086256);
                        if ((i28 & 7168) != 2048) {
                        }
                        objIF2 = composerKN.iF();
                        if (!z2) {
                            objIF2 = new Function0() { // from class: KA9.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return g9s.Uo(function016);
                                }
                            };
                            composerKN.o(objIF2);
                            composerKN.Xw();
                            Modifier modifierT2 = OffsetKt.t(ClickableKt.nr(modifierGh2, mutableInteractionSource2, null, false, null, null, (Function0) objIF2, 28, null), 0.0f, f3, 1, null);
                            Arrangement.Vertical verticalUo2 = Arrangement.f17400n.Uo();
                            Alignment.Companion companion32 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyN2 = ColumnKt.n(verticalUo2, companion32.gh(), composerKN, 0);
                            iN = ComposablesKt.n(composerKN, 0);
                            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierT2);
                            ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                            Function0 function0N2 = companion42.n();
                            if (composerKN.getApplier() == null) {
                            }
                            composerKN.T();
                            if (composerKN.getInserting()) {
                            }
                            composerN = Updater.n(composerKN);
                            Function0 function0372 = function016;
                            Updater.O(composerN, measurePolicyN2, companion42.t());
                            Updater.O(composerN, compositionLocalMapIk2, companion42.O());
                            function2Rl = companion42.rl();
                            if (!composerN.getInserting()) {
                                composerN.o(Integer.valueOf(iN));
                                composerN.az(Integer.valueOf(iN), function2Rl);
                                Updater.O(composerN, modifierO2, companion42.nr());
                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                                composerKN.eF(2024677930);
                                if (function017 != null) {
                                }
                                composerKN.Xw();
                                int i322 = (i312 >> 9) & 1022;
                                Function0 function0382 = function030;
                                SceneThumbnailMaker sceneThumbnailMaker42 = sceneThumbnailMaker3;
                                Function0 function0392 = function032;
                                Function0 function0402 = function033;
                                Function0 function0412 = function034;
                                Function0 function0422 = function015;
                                Function0 function0432 = function017;
                                BitmapLruCache bitmapLruCache42 = bitmapLruCache3;
                                Function0 function0442 = function029;
                                okd.n nVar52 = nVar3;
                                Function0 function0452 = function031;
                                UGc.KN(project, false, false, null, null, function0372, null, false, false, function018, bitmapLruCache42, sceneThumbnailMaker42, nVar52, composerKN, (i28 & 14) | 100663728 | ((i28 << 6) & 458752), i322, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
                                SpacerKt.n(SizeKt.xMQ(companion22, f4945n), composerKN, 6);
                                vd.xMQ(OffsetKt.t(BackgroundKt.nr(columnScopeInstance2.t(companion22, companion32.mUb()), Color.INSTANCE.J2(), null, 2, null), 0.0f, f53, 1, null), false, function0372, listListOfNotNull2, composerKN, ((i28 >> 3) & 896) | 48, 0);
                                composerKN.XQ();
                                if (ComposerKt.v()) {
                                }
                                function019 = function0372;
                                bitmapLruCache2 = bitmapLruCache42;
                                sceneThumbnailMaker2 = sceneThumbnailMaker42;
                                nVar2 = nVar52;
                                composer2 = composerKN;
                                function020 = function0442;
                                function021 = function0452;
                                function022 = function0392;
                                function023 = function0402;
                                function024 = function0362;
                                function025 = function0382;
                                function026 = function0412;
                                function027 = function0422;
                                function028 = function0432;
                            }
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i22 = i21;
                i24 = i5 & 8192;
                if (i24 == 0) {
                }
                i25 = i5 & 16384;
                if (i25 != 0) {
                }
                i26 = i5 & 32768;
                if (i26 != 0) {
                }
                if ((i28 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            function012 = function02;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            i14 = i5 & 256;
            if (i14 != 0) {
            }
            i15 = i5 & 512;
            if (i15 != 0) {
            }
            i17 = i5 & 1024;
            if (i17 != 0) {
            }
            i20 = i5 & 2048;
            if (i20 != 0) {
            }
            int i302 = i19;
            i21 = i5 & 4096;
            if (i21 != 0) {
            }
            i22 = i21;
            i24 = i5 & 8192;
            if (i24 == 0) {
            }
            i25 = i5 & 16384;
            if (i25 != 0) {
            }
            i26 = i5 & 32768;
            if (i26 != 0) {
            }
            if ((i28 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        function011 = function0;
        i10 = i5 & 16;
        if (i10 == 0) {
        }
        function012 = function02;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        i14 = i5 & 256;
        if (i14 != 0) {
        }
        i15 = i5 & 512;
        if (i15 != 0) {
        }
        i17 = i5 & 1024;
        if (i17 != 0) {
        }
        i20 = i5 & 2048;
        if (i20 != 0) {
        }
        int i3022 = i19;
        i21 = i5 & 4096;
        if (i21 != 0) {
        }
        i22 = i21;
        i24 = i5 & 8192;
        if (i24 == 0) {
        }
        i25 = i5 & 16384;
        if (i25 != 0) {
        }
        i26 = i5 & 32768;
        if (i26 != 0) {
        }
        if ((i28 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(ProjectInfo projectInfo, float f3, float f4, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, Function0 function08, Function0 function09, Function0 function010, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker, okd.n nVar, int i2, int i3, int i5, Composer composer, int i7) {
        O(projectInfo, f3, f4, function0, function02, function03, function04, function05, function06, function07, function08, function09, function010, bitmapLruCache, sceneThumbnailMaker, nVar, composer, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
