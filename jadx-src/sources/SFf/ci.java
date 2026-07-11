package SFf;

import SFf.Z;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.view.LiveData;
import androidx.view.MutableLiveData;
import androidx.view.compose.FlowExtKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class ci {

    /* synthetic */ class j extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f9015n = new j();

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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit aYN(afx afxVar, g9s g9sVar, Modifier modifier, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, String str4, String str5, String str6, Function1 function1, Function2 function2, Function2 function22, Function2 function23, Function0 function0, Function0 function02, Function0 function03, Function1 function12, int i2, int i3, int i5, Composer composer, int i7) {
        ty(afxVar, g9sVar, modifier, z2, z3, z4, str, str2, str3, str4, str5, str6, function1, function2, function22, function23, function0, function02, function03, function12, composer, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04f4 A[LOOP:0: B:308:0x04ee->B:310:0x04f4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:385:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ty(final afx viewModel, final g9s style, Modifier modifier, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, String str4, String str5, String str6, final Function1 navigateAway, Function2 function2, Function2 function22, Function2 function23, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        int i8;
        boolean z5;
        int i9;
        boolean z6;
        int i10;
        boolean z7;
        int i11;
        int i12;
        int i13;
        final String str7;
        int i14;
        String str8;
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
        int i28;
        int i29;
        int i30;
        String str9;
        Function2 function24;
        Function2 function25;
        final Function2 function26;
        String str10;
        final Function2 function27;
        final Function0 function04;
        String str11;
        final Function0 function05;
        String str12;
        final Function0 function06;
        Modifier modifier3;
        final Function1 function12;
        boolean z9;
        Object mutableLiveData;
        Object mutableLiveData2;
        Object mutableLiveData3;
        Iterator it;
        boolean zE2;
        Object objIF;
        boolean zE22;
        Object objIF2;
        boolean zE23;
        Object objIF3;
        boolean zE24;
        Object objIF4;
        boolean zE25;
        Object objIF5;
        boolean zE26;
        Object objIF6;
        Composer composer2;
        Z.j jVarNr;
        final Modifier modifier4;
        final boolean z10;
        final boolean z11;
        final String str13;
        final String str14;
        final String str15;
        final String str16;
        final String str17;
        final boolean z12;
        final Function2 function28;
        final Function2 function29;
        final Function0 function07;
        final Function0 function08;
        final Function0 function09;
        final Function1 function13;
        final Function2 function210;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(navigateAway, "navigateAway");
        Composer composerKN = composer.KN(-19623156);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = i2 | (composerKN.E2(viewModel) ? 4 : 2);
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            i7 |= (i2 & 64) == 0 ? composerKN.p5(style) : composerKN.E2(style) ? 32 : 16;
        }
        int i31 = i7;
        int i32 = i5 & 4;
        if (i32 != 0) {
            i31 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i31 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i31 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    z5 = z2;
                    i31 |= composerKN.n(z5) ? 2048 : 1024;
                }
                i9 = i5 & 16;
                if (i9 != 0) {
                    i31 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        z6 = z3;
                        i31 |= composerKN.n(z6) ? 16384 : 8192;
                    }
                    i10 = i5 & 32;
                    if (i10 == 0) {
                        i31 |= 196608;
                        z7 = z4;
                    } else {
                        z7 = z4;
                        if ((i2 & 196608) == 0) {
                            i11 = 131072;
                            i31 |= composerKN.n(z7) ? 131072 : 65536;
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i31 |= 1572864;
                        } else {
                            if ((i2 & 1572864) == 0) {
                                i13 = 48;
                                str7 = str;
                                i31 |= composerKN.p5(str7) ? 1048576 : 524288;
                            }
                            i14 = i5 & 128;
                            if (i14 == 0) {
                                i31 |= 12582912;
                                str8 = str2;
                            } else {
                                str8 = str2;
                                if ((i2 & 12582912) == 0) {
                                    i31 |= composerKN.p5(str8) ? 8388608 : 4194304;
                                }
                            }
                            i15 = i5 & 256;
                            if (i15 == 0) {
                                i31 |= 100663296;
                            } else if ((i2 & 100663296) == 0) {
                                i31 |= composerKN.p5(str3) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            i16 = i5 & 512;
                            if (i16 == 0) {
                                i31 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                                i17 = i16;
                            } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i17 = i16;
                                i31 |= composerKN.p5(str4) ? 536870912 : 268435456;
                            } else {
                                i17 = i16;
                            }
                            i18 = i5 & 1024;
                            if (i18 == 0) {
                                i19 = i3 | 6;
                            } else if ((i3 & 6) == 0) {
                                i19 = i3 | (composerKN.p5(str5) ? 4 : 2);
                            } else {
                                i19 = i3;
                            }
                            i20 = i5 & 2048;
                            if (i20 == 0) {
                                i19 |= 48;
                                i21 = i20;
                            } else if ((i3 & 48) == 0) {
                                i21 = i20;
                                i19 |= composerKN.p5(str6) ? 32 : 16;
                            } else {
                                i21 = i20;
                            }
                            int i33 = i19;
                            if ((i5 & 4096) == 0) {
                                i33 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                            } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                i33 |= composerKN.E2(navigateAway) ? 256 : 128;
                            }
                            i22 = i5 & 8192;
                            if (i22 == 0) {
                                i33 |= 3072;
                            } else {
                                if ((i3 & 3072) == 0) {
                                    i33 |= composerKN.E2(function2) ? 2048 : 1024;
                                }
                                i23 = i5 & 16384;
                                if (i23 == 0) {
                                    i24 = i33;
                                    if ((i3 & 24576) == 0) {
                                        i24 |= composerKN.E2(function22) ? 16384 : 8192;
                                    }
                                    i25 = i5 & 32768;
                                    if (i25 == 0) {
                                        i24 |= 196608;
                                    } else if ((i3 & 196608) == 0) {
                                        i24 |= composerKN.E2(function23) ? i11 : 65536;
                                    }
                                    i26 = i5 & 65536;
                                    if (i26 == 0) {
                                        i24 |= 1572864;
                                    } else if ((i3 & 1572864) == 0) {
                                        i24 |= composerKN.E2(function0) ? 1048576 : 524288;
                                    }
                                    i27 = i5 & i11;
                                    if (i27 == 0) {
                                        i24 |= 12582912;
                                    } else if ((i3 & 12582912) == 0) {
                                        i24 |= composerKN.E2(function02) ? 8388608 : 4194304;
                                    }
                                    i28 = i5 & 262144;
                                    if (i28 == 0) {
                                        i24 |= 100663296;
                                    } else if ((i3 & 100663296) == 0) {
                                        i24 |= composerKN.E2(function03) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                    }
                                    i29 = i5 & 524288;
                                    if (i29 == 0) {
                                        i24 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                                    } else if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                        i24 |= composerKN.E2(function1) ? 536870912 : 268435456;
                                    }
                                    i30 = i24;
                                    if ((i31 & 306783379) != 306783378 && (306783379 & i30) == 306783378 && composerKN.xMQ()) {
                                        composerKN.wTp();
                                        function210 = function2;
                                        function29 = function23;
                                        function07 = function0;
                                        function08 = function02;
                                        function09 = function03;
                                        function13 = function1;
                                        modifier4 = modifier2;
                                        z10 = z5;
                                        z12 = z6;
                                        composer2 = composerKN;
                                        z11 = z7;
                                        str13 = str8;
                                        str14 = str3;
                                        str15 = str4;
                                        str16 = str5;
                                        str17 = str6;
                                        function28 = function22;
                                    } else {
                                        if (i32 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i8 != 0) {
                                            z5 = true;
                                        }
                                        if (i9 != 0) {
                                            z6 = true;
                                        }
                                        if (i10 != 0) {
                                            z7 = true;
                                        }
                                        if (i12 != 0) {
                                            str7 = null;
                                        }
                                        if (i14 != 0) {
                                            str8 = null;
                                        }
                                        String str18 = i15 == 0 ? null : str3;
                                        String str19 = i17 == 0 ? null : str4;
                                        String str20 = i18 == 0 ? null : str5;
                                        String str21 = i21 == 0 ? str6 : null;
                                        if (i22 == 0) {
                                            composerKN.eF(42877329);
                                            Object objIF7 = composerKN.iF();
                                            str9 = str21;
                                            if (objIF7 == Composer.INSTANCE.n()) {
                                                objIF7 = j.f9015n;
                                                composerKN.o(objIF7);
                                            }
                                            composerKN.Xw();
                                            function24 = (Function2) ((KFunction) objIF7);
                                        } else {
                                            str9 = str21;
                                            function24 = function2;
                                        }
                                        if (i23 == 0) {
                                            composerKN.eF(42880646);
                                            Object objIF8 = composerKN.iF();
                                            function25 = function24;
                                            if (objIF8 == Composer.INSTANCE.n()) {
                                                objIF8 = new Function2() { // from class: SFf.qz
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj, Object obj2) {
                                                        return ci.r((Pr.Ml) obj, ((Boolean) obj2).booleanValue());
                                                    }
                                                };
                                                composerKN.o(objIF8);
                                            }
                                            function26 = (Function2) objIF8;
                                            composerKN.Xw();
                                        } else {
                                            function25 = function24;
                                            function26 = function22;
                                        }
                                        if (i25 == 0) {
                                            composerKN.eF(42883526);
                                            Object objIF9 = composerKN.iF();
                                            str10 = str18;
                                            if (objIF9 == Composer.INSTANCE.n()) {
                                                objIF9 = new Function2() { // from class: SFf.c
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj, Object obj2) {
                                                        return ci.ViF((Ew) obj, ((Boolean) obj2).booleanValue());
                                                    }
                                                };
                                                composerKN.o(objIF9);
                                            }
                                            function27 = (Function2) objIF9;
                                            composerKN.Xw();
                                        } else {
                                            str10 = str18;
                                            function27 = function23;
                                        }
                                        if (i26 == 0) {
                                            composerKN.eF(42885118);
                                            Object objIF10 = composerKN.iF();
                                            if (objIF10 == Composer.INSTANCE.n()) {
                                                objIF10 = new Function0() { // from class: SFf.s4
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return ci.nY();
                                                    }
                                                };
                                                composerKN.o(objIF10);
                                            }
                                            function04 = (Function0) objIF10;
                                            composerKN.Xw();
                                        } else {
                                            function04 = function0;
                                        }
                                        if (i27 == 0) {
                                            composerKN.eF(42886494);
                                            Object objIF11 = composerKN.iF();
                                            str11 = str7;
                                            if (objIF11 == Composer.INSTANCE.n()) {
                                                objIF11 = new Function0() { // from class: SFf.UGc
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return ci.g();
                                                    }
                                                };
                                                composerKN.o(objIF11);
                                            }
                                            function05 = (Function0) objIF11;
                                            composerKN.Xw();
                                        } else {
                                            str11 = str7;
                                            function05 = function02;
                                        }
                                        if (i28 == 0) {
                                            composerKN.eF(42888094);
                                            Object objIF12 = composerKN.iF();
                                            str12 = str19;
                                            if (objIF12 == Composer.INSTANCE.n()) {
                                                objIF12 = new Function0() { // from class: SFf.Q
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return ci.HI();
                                                    }
                                                };
                                                composerKN.o(objIF12);
                                            }
                                            function06 = (Function0) objIF12;
                                            composerKN.Xw();
                                        } else {
                                            str12 = str19;
                                            function06 = function03;
                                        }
                                        if (i29 == 0) {
                                            composerKN.eF(42890014);
                                            Object objIF13 = composerKN.iF();
                                            modifier3 = modifier2;
                                            if (objIF13 == Composer.INSTANCE.n()) {
                                                objIF13 = new Function1() { // from class: SFf.r
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return ci.ck((String) obj);
                                                    }
                                                };
                                                composerKN.o(objIF13);
                                            }
                                            function12 = (Function1) objIF13;
                                            composerKN.Xw();
                                        } else {
                                            modifier3 = modifier2;
                                            function12 = function1;
                                        }
                                        if (ComposerKt.v()) {
                                            z9 = z5;
                                        } else {
                                            z9 = z5;
                                            ComposerKt.p5(-19623156, i31, i30, "com.bendingspoons.legal.privacy.ui.settings.PrivacySettingsScreen (PrivacySettingsScreen.kt:62)");
                                        }
                                        Context context = (Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo());
                                        Z z13 = (Z) FlowExtKt.t(viewModel.t(), null, null, null, composerKN, 0, 7).getValue();
                                        mutableLiveData = z13.t().get(Pr.Ml.f7846t);
                                        if (mutableLiveData == null) {
                                            mutableLiveData = new MutableLiveData(Boolean.FALSE);
                                        }
                                        Boolean bool = Boolean.FALSE;
                                        State stateRl = LiveDataAdapterKt.rl((LiveData) mutableLiveData, bool, composerKN, i13);
                                        mutableLiveData2 = z13.t().get(Pr.Ml.f7843O);
                                        if (mutableLiveData2 == null) {
                                            mutableLiveData2 = new MutableLiveData(bool);
                                        }
                                        State stateRl2 = LiveDataAdapterKt.rl((LiveData) mutableLiveData2, bool, composerKN, 48);
                                        mutableLiveData3 = z13.t().get(Pr.Ml.f7844n);
                                        if (mutableLiveData3 == null) {
                                            mutableLiveData3 = new MutableLiveData(bool);
                                        }
                                        State stateRl3 = LiveDataAdapterKt.rl((LiveData) mutableLiveData3, Boolean.TRUE, composerKN, 48);
                                        List listZ = viewModel.Z();
                                        composerKN.eF(42915111);
                                        Map mapO = z13.O();
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapO.size()));
                                        it = mapO.entrySet().iterator();
                                        while (it.hasNext()) {
                                            Map.Entry entry = (Map.Entry) it.next();
                                            linkedHashMap.put(entry.getKey(), LiveDataAdapterKt.rl((LiveData) entry.getValue(), Boolean.FALSE, composerKN, 48));
                                            it = it;
                                            z6 = z6;
                                            z7 = z7;
                                        }
                                        boolean z14 = z6;
                                        boolean z15 = z7;
                                        composerKN.Xw();
                                        boolean zJ2 = z13.J2();
                                        composerKN.eF(42928626);
                                        zE2 = composerKN.E2(viewModel) | ((i30 & 3670016) != 1048576);
                                        objIF = composerKN.iF();
                                        if (!zE2 || objIF == Composer.INSTANCE.n()) {
                                            objIF = new Function0() { // from class: SFf.SPz
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return ci.Ik(viewModel, function04);
                                                }
                                            };
                                            composerKN.o(objIF);
                                        }
                                        Function0 function010 = (Function0) objIF;
                                        composerKN.Xw();
                                        composerKN.eF(42932442);
                                        zE22 = ((i30 & 29360128) != 8388608) | composerKN.E2(viewModel);
                                        objIF2 = composerKN.iF();
                                        if (!zE22 || objIF2 == Composer.INSTANCE.n()) {
                                            objIF2 = new Function0() { // from class: SFf.Pl
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return ci.o(viewModel, function05);
                                                }
                                            };
                                            composerKN.o(objIF2);
                                        }
                                        Function0 function011 = (Function0) objIF2;
                                        composerKN.Xw();
                                        composerKN.eF(42936738);
                                        zE23 = composerKN.E2(viewModel) | ((i30 & 234881024) != 67108864);
                                        objIF3 = composerKN.iF();
                                        if (!zE23 || objIF3 == Composer.INSTANCE.n()) {
                                            objIF3 = new Function0() { // from class: SFf.Xo
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return ci.Z(viewModel, function06);
                                                }
                                            };
                                            composerKN.o(objIF3);
                                        }
                                        Function0 function012 = (Function0) objIF3;
                                        composerKN.Xw();
                                        composerKN.eF(42941263);
                                        Function0 function013 = function04;
                                        zE24 = composerKN.E2(viewModel) | ((i30 & 1879048192) != 536870912);
                                        objIF4 = composerKN.iF();
                                        if (!zE24 || objIF4 == Composer.INSTANCE.n()) {
                                            objIF4 = new Function1() { // from class: SFf.eO
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return ci.XQ(viewModel, function12, (String) obj);
                                                }
                                            };
                                            composerKN.o(objIF4);
                                        }
                                        Function1 function14 = (Function1) objIF4;
                                        composerKN.Xw();
                                        composerKN.eF(42917581);
                                        zE25 = composerKN.E2(viewModel) | ((i30 & 57344) != 16384);
                                        objIF5 = composerKN.iF();
                                        if (!zE25 || objIF5 == Composer.INSTANCE.n()) {
                                            objIF5 = new Function2() { // from class: SFf.z
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    return ci.S(viewModel, function26, (Pr.Ml) obj, ((Boolean) obj2).booleanValue());
                                                }
                                            };
                                            composerKN.o(objIF5);
                                        }
                                        Function2 function211 = (Function2) objIF5;
                                        composerKN.Xw();
                                        composerKN.eF(42923176);
                                        Function2 function212 = function26;
                                        zE26 = composerKN.E2(viewModel) | ((i30 & 458752) == i11);
                                        objIF6 = composerKN.iF();
                                        if (!zE26 || objIF6 == Composer.INSTANCE.n()) {
                                            objIF6 = new Function2() { // from class: SFf.QJ
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    return ci.WPU(viewModel, function27, (Ew) obj, ((Boolean) obj2).booleanValue());
                                                }
                                            };
                                            composerKN.o(objIF6);
                                        }
                                        composerKN.Xw();
                                        int i34 = i31 << 15;
                                        int i35 = ((i31 << 12) & 3670016) | 12582912 | (i34 & 234881024) | (i34 & 1879048192);
                                        int i36 = i30 << 15;
                                        int i37 = ((i31 >> 15) & 65534) | (i36 & 458752) | (i36 & 3670016);
                                        int i38 = (i31 << 6) & 7168;
                                        Function0 function014 = function06;
                                        composer2 = composerKN;
                                        Function2 function213 = function25;
                                        Function2 function214 = function27;
                                        Function0 function015 = function05;
                                        Function1 function15 = function12;
                                        String str22 = str8;
                                        Modifier modifier5 = modifier3;
                                        String str23 = str10;
                                        boolean z16 = z9;
                                        String str24 = str11;
                                        String str25 = str12;
                                        String str26 = str9;
                                        fuX.KN(listZ, linkedHashMap, stateRl3, stateRl, stateRl2, zJ2, modifier5, false, z16, z14, z15, str24, str22, str23, str25, str20, str26, function010, function011, function012, function14, function211, (Function2) objIF6, style, composer2, i35, i37, i38, 0);
                                        jVarNr = z13.nr();
                                        if (jVarNr != null) {
                                            if (jVarNr instanceof Z.j.C0307j) {
                                                navigateAway.invoke(Boolean.valueOf(((Z.j.C0307j) jVarNr).n()));
                                            } else {
                                                if (!(jVarNr instanceof Z.j.n)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                function213.invoke(((Z.j.n) jVarNr).n(), context);
                                            }
                                            viewModel.fD();
                                            Unit unit = Unit.INSTANCE;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                        modifier4 = modifier5;
                                        z10 = z16;
                                        z11 = z15;
                                        str7 = str24;
                                        str13 = str22;
                                        str14 = str23;
                                        str15 = str25;
                                        str16 = str20;
                                        str17 = str26;
                                        z12 = z14;
                                        function28 = function212;
                                        function29 = function214;
                                        function07 = function013;
                                        function08 = function015;
                                        function09 = function014;
                                        function13 = function15;
                                        function210 = function213;
                                    }
                                    scopeUpdateScopeGh = composer2.gh();
                                    if (scopeUpdateScopeGh == null) {
                                        scopeUpdateScopeGh.n(new Function2() { // from class: SFf.l3D
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return ci.aYN(viewModel, style, modifier4, z10, z12, z11, str7, str13, str14, str15, str16, str17, navigateAway, function210, function28, function29, function07, function08, function09, function13, i2, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i24 = i33 | 24576;
                                i25 = i5 & 32768;
                                if (i25 == 0) {
                                }
                                i26 = i5 & 65536;
                                if (i26 == 0) {
                                }
                                i27 = i5 & i11;
                                if (i27 == 0) {
                                }
                                i28 = i5 & 262144;
                                if (i28 == 0) {
                                }
                                i29 = i5 & 524288;
                                if (i29 == 0) {
                                }
                                i30 = i24;
                                if ((i31 & 306783379) != 306783378) {
                                    if (i32 != 0) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if (i12 != 0) {
                                    }
                                    if (i14 != 0) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i18 == 0) {
                                    }
                                    if (i21 == 0) {
                                    }
                                    if (i22 == 0) {
                                    }
                                    if (i23 == 0) {
                                    }
                                    if (i25 == 0) {
                                    }
                                    if (i26 == 0) {
                                    }
                                    if (i27 == 0) {
                                    }
                                    if (i28 == 0) {
                                    }
                                    if (i29 == 0) {
                                    }
                                    if (ComposerKt.v()) {
                                    }
                                    Context context2 = (Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo());
                                    Z z132 = (Z) FlowExtKt.t(viewModel.t(), null, null, null, composerKN, 0, 7).getValue();
                                    mutableLiveData = z132.t().get(Pr.Ml.f7846t);
                                    if (mutableLiveData == null) {
                                    }
                                    Boolean bool2 = Boolean.FALSE;
                                    State stateRl4 = LiveDataAdapterKt.rl((LiveData) mutableLiveData, bool2, composerKN, i13);
                                    mutableLiveData2 = z132.t().get(Pr.Ml.f7843O);
                                    if (mutableLiveData2 == null) {
                                    }
                                    State stateRl22 = LiveDataAdapterKt.rl((LiveData) mutableLiveData2, bool2, composerKN, 48);
                                    mutableLiveData3 = z132.t().get(Pr.Ml.f7844n);
                                    if (mutableLiveData3 == null) {
                                    }
                                    State stateRl32 = LiveDataAdapterKt.rl((LiveData) mutableLiveData3, Boolean.TRUE, composerKN, 48);
                                    List listZ2 = viewModel.Z();
                                    composerKN.eF(42915111);
                                    Map mapO2 = z132.O();
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(mapO2.size()));
                                    it = mapO2.entrySet().iterator();
                                    while (it.hasNext()) {
                                    }
                                    boolean z142 = z6;
                                    boolean z152 = z7;
                                    composerKN.Xw();
                                    boolean zJ22 = z132.J2();
                                    composerKN.eF(42928626);
                                    zE2 = composerKN.E2(viewModel) | ((i30 & 3670016) != 1048576);
                                    objIF = composerKN.iF();
                                    if (!zE2) {
                                        objIF = new Function0() { // from class: SFf.SPz
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return ci.Ik(viewModel, function04);
                                            }
                                        };
                                        composerKN.o(objIF);
                                        Function0 function0102 = (Function0) objIF;
                                        composerKN.Xw();
                                        composerKN.eF(42932442);
                                        zE22 = ((i30 & 29360128) != 8388608) | composerKN.E2(viewModel);
                                        objIF2 = composerKN.iF();
                                        if (!zE22) {
                                            objIF2 = new Function0() { // from class: SFf.Pl
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return ci.o(viewModel, function05);
                                                }
                                            };
                                            composerKN.o(objIF2);
                                            Function0 function0112 = (Function0) objIF2;
                                            composerKN.Xw();
                                            composerKN.eF(42936738);
                                            zE23 = composerKN.E2(viewModel) | ((i30 & 234881024) != 67108864);
                                            objIF3 = composerKN.iF();
                                            if (!zE23) {
                                                objIF3 = new Function0() { // from class: SFf.Xo
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return ci.Z(viewModel, function06);
                                                    }
                                                };
                                                composerKN.o(objIF3);
                                                Function0 function0122 = (Function0) objIF3;
                                                composerKN.Xw();
                                                composerKN.eF(42941263);
                                                Function0 function0132 = function04;
                                                zE24 = composerKN.E2(viewModel) | ((i30 & 1879048192) != 536870912);
                                                objIF4 = composerKN.iF();
                                                if (!zE24) {
                                                    objIF4 = new Function1() { // from class: SFf.eO
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return ci.XQ(viewModel, function12, (String) obj);
                                                        }
                                                    };
                                                    composerKN.o(objIF4);
                                                    Function1 function142 = (Function1) objIF4;
                                                    composerKN.Xw();
                                                    composerKN.eF(42917581);
                                                    zE25 = composerKN.E2(viewModel) | ((i30 & 57344) != 16384);
                                                    objIF5 = composerKN.iF();
                                                    if (!zE25) {
                                                        objIF5 = new Function2() { // from class: SFf.z
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj, Object obj2) {
                                                                return ci.S(viewModel, function26, (Pr.Ml) obj, ((Boolean) obj2).booleanValue());
                                                            }
                                                        };
                                                        composerKN.o(objIF5);
                                                        Function2 function2112 = (Function2) objIF5;
                                                        composerKN.Xw();
                                                        composerKN.eF(42923176);
                                                        Function2 function2122 = function26;
                                                        zE26 = composerKN.E2(viewModel) | ((i30 & 458752) == i11);
                                                        objIF6 = composerKN.iF();
                                                        if (!zE26) {
                                                            objIF6 = new Function2() { // from class: SFf.QJ
                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final Object invoke(Object obj, Object obj2) {
                                                                    return ci.WPU(viewModel, function27, (Ew) obj, ((Boolean) obj2).booleanValue());
                                                                }
                                                            };
                                                            composerKN.o(objIF6);
                                                            composerKN.Xw();
                                                            int i342 = i31 << 15;
                                                            int i352 = ((i31 << 12) & 3670016) | 12582912 | (i342 & 234881024) | (i342 & 1879048192);
                                                            int i362 = i30 << 15;
                                                            int i372 = ((i31 >> 15) & 65534) | (i362 & 458752) | (i362 & 3670016);
                                                            int i382 = (i31 << 6) & 7168;
                                                            Function0 function0142 = function06;
                                                            composer2 = composerKN;
                                                            Function2 function2132 = function25;
                                                            Function2 function2142 = function27;
                                                            Function0 function0152 = function05;
                                                            Function1 function152 = function12;
                                                            String str222 = str8;
                                                            Modifier modifier52 = modifier3;
                                                            String str232 = str10;
                                                            boolean z162 = z9;
                                                            String str242 = str11;
                                                            String str252 = str12;
                                                            String str262 = str9;
                                                            fuX.KN(listZ2, linkedHashMap2, stateRl32, stateRl4, stateRl22, zJ22, modifier52, false, z162, z142, z152, str242, str222, str232, str252, str20, str262, function0102, function0112, function0122, function142, function2112, (Function2) objIF6, style, composer2, i352, i372, i382, 0);
                                                            jVarNr = z132.nr();
                                                            if (jVarNr != null) {
                                                            }
                                                            if (ComposerKt.v()) {
                                                            }
                                                            modifier4 = modifier52;
                                                            z10 = z162;
                                                            z11 = z152;
                                                            str7 = str242;
                                                            str13 = str222;
                                                            str14 = str232;
                                                            str15 = str252;
                                                            str16 = str20;
                                                            str17 = str262;
                                                            z12 = z142;
                                                            function28 = function2122;
                                                            function29 = function2142;
                                                            function07 = function0132;
                                                            function08 = function0152;
                                                            function09 = function0142;
                                                            function13 = function152;
                                                            function210 = function2132;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh == null) {
                                }
                            }
                            i23 = i5 & 16384;
                            if (i23 == 0) {
                            }
                            i25 = i5 & 32768;
                            if (i25 == 0) {
                            }
                            i26 = i5 & 65536;
                            if (i26 == 0) {
                            }
                            i27 = i5 & i11;
                            if (i27 == 0) {
                            }
                            i28 = i5 & 262144;
                            if (i28 == 0) {
                            }
                            i29 = i5 & 524288;
                            if (i29 == 0) {
                            }
                            i30 = i24;
                            if ((i31 & 306783379) != 306783378) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                            }
                        }
                        i13 = 48;
                        str7 = str;
                        i14 = i5 & 128;
                        if (i14 == 0) {
                        }
                        i15 = i5 & 256;
                        if (i15 == 0) {
                        }
                        i16 = i5 & 512;
                        if (i16 == 0) {
                        }
                        i18 = i5 & 1024;
                        if (i18 == 0) {
                        }
                        i20 = i5 & 2048;
                        if (i20 == 0) {
                        }
                        int i332 = i19;
                        if ((i5 & 4096) == 0) {
                        }
                        i22 = i5 & 8192;
                        if (i22 == 0) {
                        }
                        i23 = i5 & 16384;
                        if (i23 == 0) {
                        }
                        i25 = i5 & 32768;
                        if (i25 == 0) {
                        }
                        i26 = i5 & 65536;
                        if (i26 == 0) {
                        }
                        i27 = i5 & i11;
                        if (i27 == 0) {
                        }
                        i28 = i5 & 262144;
                        if (i28 == 0) {
                        }
                        i29 = i5 & 524288;
                        if (i29 == 0) {
                        }
                        i30 = i24;
                        if ((i31 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i11 = 131072;
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    i13 = 48;
                    str7 = str;
                    i14 = i5 & 128;
                    if (i14 == 0) {
                    }
                    i15 = i5 & 256;
                    if (i15 == 0) {
                    }
                    i16 = i5 & 512;
                    if (i16 == 0) {
                    }
                    i18 = i5 & 1024;
                    if (i18 == 0) {
                    }
                    i20 = i5 & 2048;
                    if (i20 == 0) {
                    }
                    int i3322 = i19;
                    if ((i5 & 4096) == 0) {
                    }
                    i22 = i5 & 8192;
                    if (i22 == 0) {
                    }
                    i23 = i5 & 16384;
                    if (i23 == 0) {
                    }
                    i25 = i5 & 32768;
                    if (i25 == 0) {
                    }
                    i26 = i5 & 65536;
                    if (i26 == 0) {
                    }
                    i27 = i5 & i11;
                    if (i27 == 0) {
                    }
                    i28 = i5 & 262144;
                    if (i28 == 0) {
                    }
                    i29 = i5 & 524288;
                    if (i29 == 0) {
                    }
                    i30 = i24;
                    if ((i31 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                z6 = z3;
                i10 = i5 & 32;
                if (i10 == 0) {
                }
                i11 = 131072;
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                i13 = 48;
                str7 = str;
                i14 = i5 & 128;
                if (i14 == 0) {
                }
                i15 = i5 & 256;
                if (i15 == 0) {
                }
                i16 = i5 & 512;
                if (i16 == 0) {
                }
                i18 = i5 & 1024;
                if (i18 == 0) {
                }
                i20 = i5 & 2048;
                if (i20 == 0) {
                }
                int i33222 = i19;
                if ((i5 & 4096) == 0) {
                }
                i22 = i5 & 8192;
                if (i22 == 0) {
                }
                i23 = i5 & 16384;
                if (i23 == 0) {
                }
                i25 = i5 & 32768;
                if (i25 == 0) {
                }
                i26 = i5 & 65536;
                if (i26 == 0) {
                }
                i27 = i5 & i11;
                if (i27 == 0) {
                }
                i28 = i5 & 262144;
                if (i28 == 0) {
                }
                i29 = i5 & 524288;
                if (i29 == 0) {
                }
                i30 = i24;
                if ((i31 & 306783379) != 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z5 = z2;
            i9 = i5 & 16;
            if (i9 != 0) {
            }
            z6 = z3;
            i10 = i5 & 32;
            if (i10 == 0) {
            }
            i11 = 131072;
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = 48;
            str7 = str;
            i14 = i5 & 128;
            if (i14 == 0) {
            }
            i15 = i5 & 256;
            if (i15 == 0) {
            }
            i16 = i5 & 512;
            if (i16 == 0) {
            }
            i18 = i5 & 1024;
            if (i18 == 0) {
            }
            i20 = i5 & 2048;
            if (i20 == 0) {
            }
            int i332222 = i19;
            if ((i5 & 4096) == 0) {
            }
            i22 = i5 & 8192;
            if (i22 == 0) {
            }
            i23 = i5 & 16384;
            if (i23 == 0) {
            }
            i25 = i5 & 32768;
            if (i25 == 0) {
            }
            i26 = i5 & 65536;
            if (i26 == 0) {
            }
            i27 = i5 & i11;
            if (i27 == 0) {
            }
            i28 = i5 & 262144;
            if (i28 == 0) {
            }
            i29 = i5 & 524288;
            if (i29 == 0) {
            }
            i30 = i24;
            if ((i31 & 306783379) != 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        z5 = z2;
        i9 = i5 & 16;
        if (i9 != 0) {
        }
        z6 = z3;
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        i11 = 131072;
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = 48;
        str7 = str;
        i14 = i5 & 128;
        if (i14 == 0) {
        }
        i15 = i5 & 256;
        if (i15 == 0) {
        }
        i16 = i5 & 512;
        if (i16 == 0) {
        }
        i18 = i5 & 1024;
        if (i18 == 0) {
        }
        i20 = i5 & 2048;
        if (i20 == 0) {
        }
        int i3322222 = i19;
        if ((i5 & 4096) == 0) {
        }
        i22 = i5 & 8192;
        if (i22 == 0) {
        }
        i23 = i5 & 16384;
        if (i23 == 0) {
        }
        i25 = i5 & 32768;
        if (i25 == 0) {
        }
        i26 = i5 & 65536;
        if (i26 == 0) {
        }
        i27 = i5 & i11;
        if (i27 == 0) {
        }
        i28 = i5 & 262144;
        if (i28 == 0) {
        }
        i29 = i5 & 524288;
        if (i29 == 0) {
        }
        i30 = i24;
        if ((i31 & 306783379) != 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(afx afxVar, Function2 function2, Pr.Ml category, boolean z2) {
        Intrinsics.checkNotNullParameter(category, "category");
        afxVar.aYN(category, z2);
        function2.invoke(category, Boolean.valueOf(z2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ViF(Ew ew, boolean z2) {
        Intrinsics.checkNotNullParameter(ew, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WPU(afx afxVar, Function2 function2, Ew tracker, boolean z2) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        afxVar.iF(tracker, z2);
        function2.invoke(tracker, Boolean.valueOf(z2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit XQ(afx afxVar, Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        afxVar.te(it);
        function1.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nY() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Pr.Ml ml, boolean z2) {
        Intrinsics.checkNotNullParameter(ml, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ik(afx afxVar, Function0 function0) {
        afxVar.S();
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(afx afxVar, Function0 function0) {
        afxVar.nY();
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(afx afxVar, Function0 function0) {
        afxVar.ViF();
        function0.invoke();
        return Unit.INSTANCE;
    }
}
