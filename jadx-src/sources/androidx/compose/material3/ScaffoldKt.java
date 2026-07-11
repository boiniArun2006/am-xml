package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.FabPosition;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a±\u0001\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0013\b\u0002\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0087\u0001\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\t2\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u00042\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "topBar", "bottomBar", "snackbarHost", "floatingActionButton", "Landroidx/compose/material3/FabPosition;", "floatingActionButtonPosition", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/WindowInsets;", "contentWindowInsets", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IJJLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "fabPosition", "snackbar", "fab", "rl", "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/Dp;", "F", "FabSpacing", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,355:1\n1223#2,6:356\n1223#2,6:362\n1223#2,6:368\n148#3:374\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt\n*L\n96#1:356,6\n99#1:362,6\n140#1:368,6\n346#1:374\n*E\n"})
public final class ScaffoldKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f27179n = Dp.KN(16);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(Modifier modifier, Function2 function2, Function2 function22, Function2 function23, Function2 function24, int i2, long j2, long j3, WindowInsets windowInsets, final Function3 function3, Composer composer, final int i3, final int i5) {
        int i7;
        Function2 function25;
        int i8;
        Function2 function26;
        int i9;
        Function2 function27;
        int i10;
        Function2 function28;
        int i11;
        int i12;
        Modifier modifier2;
        Function2 function2N;
        Function2 function2Rl;
        Function2 function2T;
        Function2 function2Nr;
        int iN;
        int i13;
        int i14;
        long jN;
        long jT2;
        final WindowInsets windowInsetsN;
        int i15;
        long j4;
        int i16;
        boolean z2;
        Object objIF;
        final MutableWindowInsets mutableWindowInsets;
        boolean zP5;
        Object objIF2;
        Composer composer2;
        final Modifier modifier3;
        final Function2 function29;
        final Function2 function210;
        final Function2 function211;
        final Function2 function212;
        final int i17;
        final long j5;
        final long j6;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1219521777);
        int i18 = i5 & 1;
        if (i18 != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.p5(modifier) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        int i19 = i5 & 2;
        if (i19 != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                function25 = function2;
                i7 |= composerKN.E2(function25) ? 32 : 16;
            }
            i8 = i5 & 4;
            if (i8 == 0) {
                i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    function26 = function22;
                    i7 |= composerKN.E2(function26) ? 256 : 128;
                }
                i9 = i5 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        function27 = function23;
                        i7 |= composerKN.E2(function27) ? 2048 : 1024;
                    }
                    i10 = i5 & 16;
                    if (i10 == 0) {
                        i7 |= 24576;
                    } else {
                        if ((i3 & 24576) == 0) {
                            function28 = function24;
                            i7 |= composerKN.E2(function28) ? 16384 : 8192;
                        }
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i7 |= 196608;
                        } else if ((i3 & 196608) == 0) {
                            i7 |= composerKN.t(i2) ? 131072 : 65536;
                        }
                        if ((i3 & 1572864) == 0) {
                            i12 = i18;
                            i7 |= ((i5 & 64) == 0 && composerKN.nr(j2)) ? 1048576 : 524288;
                        } else {
                            i12 = i18;
                        }
                        if ((i3 & 12582912) == 0) {
                            i7 |= ((i5 & 128) == 0 && composerKN.nr(j3)) ? 8388608 : 4194304;
                        }
                        if ((i3 & 100663296) == 0) {
                            i7 |= ((i5 & 256) == 0 && composerKN.p5(windowInsets)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        if ((i5 & 512) == 0) {
                            if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i7 |= composerKN.E2(function3) ? 536870912 : 268435456;
                            }
                            if ((i7 & 306783379) == 306783378 || !composerKN.xMQ()) {
                                composerKN.e();
                                if ((i3 & 1) != 0 || composerKN.rV9()) {
                                    modifier2 = i12 == 0 ? Modifier.INSTANCE : modifier;
                                    function2N = i19 == 0 ? ComposableSingletons$ScaffoldKt.f25096n.n() : function25;
                                    function2Rl = i8 == 0 ? ComposableSingletons$ScaffoldKt.f25096n.rl() : function26;
                                    function2T = i9 == 0 ? ComposableSingletons$ScaffoldKt.f25096n.t() : function27;
                                    function2Nr = i10 == 0 ? ComposableSingletons$ScaffoldKt.f25096n.nr() : function28;
                                    iN = i11 == 0 ? FabPosition.INSTANCE.n() : i2;
                                    if ((i5 & 64) == 0) {
                                        i7 &= -3670017;
                                        i13 = -234881025;
                                        i14 = -29360129;
                                        jN = MaterialTheme.f26164n.n(composerKN, 6).getBackground();
                                    } else {
                                        i13 = -234881025;
                                        i14 = -29360129;
                                        jN = j2;
                                    }
                                    if ((i5 & 128) == 0) {
                                        jT2 = ColorSchemeKt.t(jN, composerKN, (i7 >> 18) & 14);
                                        i7 &= i14;
                                    } else {
                                        jT2 = j3;
                                    }
                                    if ((i5 & 256) == 0) {
                                        windowInsetsN = ScaffoldDefaults.f27178n.n(composerKN, 6);
                                        i7 &= i13;
                                    } else {
                                        windowInsetsN = windowInsets;
                                    }
                                    i15 = 100663296;
                                    j4 = jT2;
                                } else {
                                    composerKN.wTp();
                                    if ((i5 & 64) != 0) {
                                        i7 &= -3670017;
                                    }
                                    if ((i5 & 128) != 0) {
                                        i7 &= -29360129;
                                    }
                                    if ((i5 & 256) != 0) {
                                        i7 &= -234881025;
                                    }
                                    modifier2 = modifier;
                                    iN = i2;
                                    jN = j2;
                                    windowInsetsN = windowInsets;
                                    function2N = function25;
                                    function2Rl = function26;
                                    function2T = function27;
                                    function2Nr = function28;
                                    i15 = 100663296;
                                    j4 = j3;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    i16 = i15;
                                } else {
                                    i16 = i15;
                                    ComposerKt.p5(-1219521777, i7, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                                }
                                int i20 = (234881024 & i7) ^ i16;
                                z2 = (i20 <= 67108864 && composerKN.p5(windowInsetsN)) || (i7 & i16) == 67108864;
                                objIF = composerKN.iF();
                                if (z2 || objIF == Composer.INSTANCE.n()) {
                                    objIF = new MutableWindowInsets(windowInsetsN);
                                    composerKN.o(objIF);
                                }
                                mutableWindowInsets = (MutableWindowInsets) objIF;
                                long j7 = jN;
                                zP5 = ((i20 <= 67108864 && composerKN.p5(windowInsetsN)) || (i7 & i16) == 67108864) | composerKN.p5(mutableWindowInsets);
                                objIF2 = composerKN.iF();
                                if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                                    objIF2 = new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets2) {
                                            n(windowInsets2);
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(WindowInsets windowInsets2) {
                                            mutableWindowInsets.J2(WindowInsetsKt.Uo(windowInsetsN, windowInsets2));
                                        }
                                    };
                                    composerKN.o(objIF2);
                                }
                                final Function2 function213 = function2N;
                                final Function2 function214 = function2Rl;
                                final Function2 function215 = function2T;
                                final Function2 function216 = function2Nr;
                                final int i21 = iN;
                                int i22 = i7 >> 12;
                                composer2 = composerKN;
                                SurfaceKt.n(WindowInsetsPaddingKt.t(modifier2, (Function1) objIF2), null, j7, j4, 0.0f, 0.0f, null, ComposableLambdaKt.nr(-1979205334, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i23) {
                                        if ((i23 & 3) == 2 && composer3.xMQ()) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-1979205334, i23, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:105)");
                                        }
                                        ScaffoldKt.rl(i21, function213, function3, function215, function216, mutableWindowInsets, function214, composer3, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composer2, (i22 & 896) | 12582912 | (i22 & 7168), 114);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                modifier3 = modifier2;
                                function29 = function2N;
                                function210 = function2Rl;
                                function211 = function2T;
                                function212 = function2Nr;
                                i17 = iN;
                                j5 = j7;
                                j6 = j4;
                            } else {
                                composerKN.wTp();
                                windowInsetsN = windowInsets;
                                composer2 = composerKN;
                                function29 = function25;
                                function210 = function26;
                                function211 = function27;
                                function212 = function28;
                                modifier3 = modifier;
                                i17 = i2;
                                j5 = j2;
                                j6 = j3;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i23) {
                                        ScaffoldKt.n(modifier3, function29, function210, function211, function212, i17, j5, j6, windowInsetsN, function3, composer3, RecomposeScopeImplKt.n(i3 | 1), i5);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        if ((i7 & 306783379) == 306783378) {
                            composerKN.e();
                            if ((i3 & 1) != 0) {
                                if (i12 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if ((i5 & 64) == 0) {
                                }
                                if ((i5 & 128) == 0) {
                                }
                                if ((i5 & 256) == 0) {
                                }
                                i15 = 100663296;
                                j4 = jT2;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                int i202 = (234881024 & i7) ^ i16;
                                if (i202 <= 67108864) {
                                    objIF = composerKN.iF();
                                    if (z2) {
                                        objIF = new MutableWindowInsets(windowInsetsN);
                                        composerKN.o(objIF);
                                        mutableWindowInsets = (MutableWindowInsets) objIF;
                                        long j72 = jN;
                                        if (i202 <= 67108864) {
                                            zP5 = ((i202 <= 67108864 && composerKN.p5(windowInsetsN)) || (i7 & i16) == 67108864) | composerKN.p5(mutableWindowInsets);
                                            objIF2 = composerKN.iF();
                                            if (zP5) {
                                                objIF2 = new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets2) {
                                                        n(windowInsets2);
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(WindowInsets windowInsets2) {
                                                        mutableWindowInsets.J2(WindowInsetsKt.Uo(windowInsetsN, windowInsets2));
                                                    }
                                                };
                                                composerKN.o(objIF2);
                                                final Function2 function2132 = function2N;
                                                final Function2 function2142 = function2Rl;
                                                final Function2 function2152 = function2T;
                                                final Function2 function2162 = function2Nr;
                                                final int i212 = iN;
                                                int i222 = i7 >> 12;
                                                composer2 = composerKN;
                                                SurfaceKt.n(WindowInsetsPaddingKt.t(modifier2, (Function1) objIF2), null, j72, j4, 0.0f, 0.0f, null, ComposableLambdaKt.nr(-1979205334, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                        n(composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(Composer composer3, int i23) {
                                                        if ((i23 & 3) == 2 && composer3.xMQ()) {
                                                            composer3.wTp();
                                                            return;
                                                        }
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.p5(-1979205334, i23, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:105)");
                                                        }
                                                        ScaffoldKt.rl(i212, function2132, function3, function2152, function2162, mutableWindowInsets, function2142, composer3, 0);
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.M7();
                                                        }
                                                    }
                                                }, composerKN, 54), composer2, (i222 & 896) | 12582912 | (i222 & 7168), 114);
                                                if (ComposerKt.v()) {
                                                }
                                                modifier3 = modifier2;
                                                function29 = function2N;
                                                function210 = function2Rl;
                                                function211 = function2T;
                                                function212 = function2Nr;
                                                i17 = iN;
                                                j5 = j72;
                                                j6 = j4;
                                            }
                                        } else {
                                            zP5 = ((i202 <= 67108864 && composerKN.p5(windowInsetsN)) || (i7 & i16) == 67108864) | composerKN.p5(mutableWindowInsets);
                                            objIF2 = composerKN.iF();
                                            if (zP5) {
                                            }
                                        }
                                    }
                                } else {
                                    objIF = composerKN.iF();
                                    if (z2) {
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    function28 = function24;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    if ((i3 & 1572864) == 0) {
                    }
                    if ((i3 & 12582912) == 0) {
                    }
                    if ((i3 & 100663296) == 0) {
                    }
                    if ((i5 & 512) == 0) {
                    }
                    if ((i7 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                function27 = function23;
                i10 = i5 & 16;
                if (i10 == 0) {
                }
                function28 = function24;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                if ((i3 & 1572864) == 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                if ((i3 & 100663296) == 0) {
                }
                if ((i5 & 512) == 0) {
                }
                if ((i7 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            function26 = function22;
            i9 = i5 & 8;
            if (i9 != 0) {
            }
            function27 = function23;
            i10 = i5 & 16;
            if (i10 == 0) {
            }
            function28 = function24;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            if ((i3 & 1572864) == 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            if ((i3 & 100663296) == 0) {
            }
            if ((i5 & 512) == 0) {
            }
            if ((i7 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        function25 = function2;
        i8 = i5 & 4;
        if (i8 == 0) {
        }
        function26 = function22;
        i9 = i5 & 8;
        if (i9 != 0) {
        }
        function27 = function23;
        i10 = i5 & 16;
        if (i10 == 0) {
        }
        function28 = function24;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        if ((i3 & 1572864) == 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        if ((i3 & 100663296) == 0) {
        }
        if ((i5 & 512) == 0) {
        }
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(final int i2, final Function2 function2, final Function3 function3, final Function2 function22, final Function2 function23, final WindowInsets windowInsets, final Function2 function24, Composer composer, final int i3) {
        int i5;
        Function3 function32;
        Function2 function25;
        final WindowInsets windowInsets2;
        int i7;
        Composer composerKN = composer.KN(-975511942);
        if ((i3 & 6) == 0) {
            i5 = (composerKN.t(i2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerKN.E2(function2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function32 = function3;
            i5 |= composerKN.E2(function32) ? 256 : 128;
        } else {
            function32 = function3;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerKN.E2(function22) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            function25 = function23;
            i5 |= composerKN.E2(function25) ? 16384 : 8192;
        } else {
            function25 = function23;
        }
        if ((196608 & i3) == 0) {
            windowInsets2 = windowInsets;
            i5 |= composerKN.p5(windowInsets2) ? 131072 : 65536;
        } else {
            windowInsets2 = windowInsets;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= composerKN.E2(function24) ? 1048576 : 524288;
        }
        if ((i5 & 599187) == 599186 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-975511942, i5, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:138)");
            }
            boolean z2 = ((i5 & 112) == 32) | ((i5 & 7168) == 2048) | ((458752 & i5) == 131072) | ((57344 & i5) == 16384) | ((i5 & 14) == 4) | ((3670016 & i5) == 1048576) | ((i5 & 896) == 256);
            Object objIF = composerKN.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                final Function3 function33 = function32;
                i7 = 1;
                final Function2 function26 = function25;
                Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function27 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final MeasureResult n(final SubcomposeMeasureScope subcomposeMeasureScope, long j2) {
                        Object obj;
                        Object obj2;
                        Object obj3;
                        int i8;
                        FabPlacement fabPlacement;
                        Object obj4;
                        Integer numValueOf;
                        int height;
                        int iT;
                        Object obj5;
                        Object obj6;
                        int iHow;
                        int iHow2;
                        final int iQie = Constraints.qie(j2);
                        final int iGh = Constraints.gh(j2);
                        long jNr = Constraints.nr(j2, 0, 0, 0, 0, 10, null);
                        List listY = subcomposeMeasureScope.Y(ScaffoldLayoutContent.TopBar, function2);
                        ArrayList arrayList = new ArrayList(listY.size());
                        int size = listY.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            arrayList.add(((Measurable) listY.get(i9)).dR0(jNr));
                        }
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            obj = arrayList.get(0);
                            int height2 = ((Placeable) obj).getHeight();
                            int lastIndex = CollectionsKt.getLastIndex(arrayList);
                            if (1 <= lastIndex) {
                                int i10 = 1;
                                while (true) {
                                    Object obj7 = arrayList.get(i10);
                                    int height3 = ((Placeable) obj7).getHeight();
                                    if (height2 < height3) {
                                        obj = obj7;
                                        height2 = height3;
                                    }
                                    if (i10 == lastIndex) {
                                        break;
                                    }
                                    i10++;
                                }
                            }
                        }
                        Placeable placeable = (Placeable) obj;
                        int height4 = placeable != null ? placeable.getHeight() : 0;
                        List listY2 = subcomposeMeasureScope.Y(ScaffoldLayoutContent.Snackbar, function22);
                        WindowInsets windowInsets3 = windowInsets2;
                        final ArrayList arrayList2 = new ArrayList(listY2.size());
                        int size2 = listY2.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            arrayList2.add(((Measurable) listY2.get(i11)).dR0(ConstraintsKt.xMQ(jNr, (-windowInsets3.nr(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets3.rl(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets3.t(subcomposeMeasureScope))));
                            i11++;
                            arrayList = arrayList;
                            listY2 = listY2;
                        }
                        final ArrayList arrayList3 = arrayList;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            obj2 = arrayList2.get(0);
                            int height5 = ((Placeable) obj2).getHeight();
                            int lastIndex2 = CollectionsKt.getLastIndex(arrayList2);
                            if (1 <= lastIndex2) {
                                Object obj8 = obj2;
                                int i12 = height5;
                                int i13 = 1;
                                while (true) {
                                    Object obj9 = arrayList2.get(i13);
                                    int height6 = ((Placeable) obj9).getHeight();
                                    if (i12 < height6) {
                                        obj8 = obj9;
                                        i12 = height6;
                                    }
                                    if (i13 == lastIndex2) {
                                        break;
                                    }
                                    i13++;
                                }
                                obj2 = obj8;
                            }
                        }
                        Placeable placeable2 = (Placeable) obj2;
                        int height7 = placeable2 != null ? placeable2.getHeight() : 0;
                        if (arrayList2.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList2.get(0);
                            int width = ((Placeable) obj3).getWidth();
                            int lastIndex3 = CollectionsKt.getLastIndex(arrayList2);
                            if (1 <= lastIndex3) {
                                Object obj10 = obj3;
                                int i14 = width;
                                int i15 = 1;
                                while (true) {
                                    Object obj11 = arrayList2.get(i15);
                                    int width2 = ((Placeable) obj11).getWidth();
                                    if (i14 < width2) {
                                        obj10 = obj11;
                                        i14 = width2;
                                    }
                                    if (i15 == lastIndex3) {
                                        break;
                                    }
                                    i15++;
                                }
                                obj3 = obj10;
                            }
                        }
                        Placeable placeable3 = (Placeable) obj3;
                        int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                        List listY3 = subcomposeMeasureScope.Y(ScaffoldLayoutContent.Fab, function26);
                        WindowInsets windowInsets4 = windowInsets2;
                        final int i16 = width3;
                        final ArrayList arrayList4 = new ArrayList(listY3.size());
                        int size3 = listY3.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            int i18 = height7;
                            List list = listY3;
                            Placeable placeableDR0 = ((Measurable) listY3.get(i17)).dR0(ConstraintsKt.xMQ(jNr, (-windowInsets4.nr(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets4.rl(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets4.t(subcomposeMeasureScope)));
                            if (placeableDR0.getHeight() == 0 || placeableDR0.getWidth() == 0) {
                                placeableDR0 = null;
                            }
                            if (placeableDR0 != null) {
                                arrayList4.add(placeableDR0);
                            }
                            i17++;
                            height7 = i18;
                            listY3 = list;
                        }
                        int i19 = height7;
                        if (arrayList4.isEmpty()) {
                            i8 = height4;
                            fabPlacement = null;
                        } else {
                            if (arrayList4.isEmpty()) {
                                obj5 = null;
                            } else {
                                obj5 = arrayList4.get(0);
                                int width4 = ((Placeable) obj5).getWidth();
                                int lastIndex4 = CollectionsKt.getLastIndex(arrayList4);
                                if (1 <= lastIndex4) {
                                    Object obj12 = obj5;
                                    int i20 = width4;
                                    int i21 = 1;
                                    while (true) {
                                        Object obj13 = arrayList4.get(i21);
                                        int width5 = ((Placeable) obj13).getWidth();
                                        if (i20 < width5) {
                                            obj12 = obj13;
                                            i20 = width5;
                                        }
                                        if (i21 == lastIndex4) {
                                            break;
                                        }
                                        i21++;
                                    }
                                    obj5 = obj12;
                                }
                            }
                            Intrinsics.checkNotNull(obj5);
                            int width6 = ((Placeable) obj5).getWidth();
                            if (arrayList4.isEmpty()) {
                                i8 = height4;
                                obj6 = null;
                            } else {
                                obj6 = arrayList4.get(0);
                                int height8 = ((Placeable) obj6).getHeight();
                                int lastIndex5 = CollectionsKt.getLastIndex(arrayList4);
                                if (1 <= lastIndex5) {
                                    Object obj14 = obj6;
                                    int i22 = height8;
                                    int i23 = 1;
                                    while (true) {
                                        Object obj15 = arrayList4.get(i23);
                                        i8 = height4;
                                        int height9 = ((Placeable) obj15).getHeight();
                                        if (i22 < height9) {
                                            i22 = height9;
                                            obj14 = obj15;
                                        }
                                        if (i23 == lastIndex5) {
                                            break;
                                        }
                                        i23++;
                                        height4 = i8;
                                    }
                                    obj6 = obj14;
                                } else {
                                    i8 = height4;
                                }
                            }
                            Intrinsics.checkNotNull(obj6);
                            int height10 = ((Placeable) obj6).getHeight();
                            int i24 = i2;
                            FabPosition.Companion companion = FabPosition.INSTANCE;
                            if (!FabPosition.J2(i24, companion.t())) {
                                if (!(FabPosition.J2(i24, companion.n()) ? true : FabPosition.J2(i24, companion.rl()))) {
                                    iHow = (iQie - width6) / 2;
                                } else if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.f34160n) {
                                    iHow2 = subcomposeMeasureScope.How(ScaffoldKt.f27179n);
                                    iHow = (iQie - iHow2) - width6;
                                } else {
                                    iHow = subcomposeMeasureScope.How(ScaffoldKt.f27179n);
                                }
                                fabPlacement = new FabPlacement(iHow, width6, height10);
                            } else if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.f34160n) {
                                iHow = subcomposeMeasureScope.How(ScaffoldKt.f27179n);
                                fabPlacement = new FabPlacement(iHow, width6, height10);
                            } else {
                                iHow2 = subcomposeMeasureScope.How(ScaffoldKt.f27179n);
                                iHow = (iQie - iHow2) - width6;
                                fabPlacement = new FabPlacement(iHow, width6, height10);
                            }
                        }
                        ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.BottomBar;
                        final Function2 function28 = function24;
                        List listY4 = subcomposeMeasureScope.Y(scaffoldLayoutContent, ComposableLambdaKt.rl(-2146438447, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$bottomBarPlaceables$1
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                n(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer2, int i25) {
                                if ((i25 & 3) == 2 && composer2.xMQ()) {
                                    composer2.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-2146438447, i25, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:209)");
                                }
                                function28.invoke(composer2, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }));
                        final ArrayList arrayList5 = new ArrayList(listY4.size());
                        int size4 = listY4.size();
                        for (int i25 = 0; i25 < size4; i25++) {
                            arrayList5.add(((Measurable) listY4.get(i25)).dR0(jNr));
                        }
                        if (arrayList5.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList5.get(0);
                            int height11 = ((Placeable) obj4).getHeight();
                            int lastIndex6 = CollectionsKt.getLastIndex(arrayList5);
                            if (1 <= lastIndex6) {
                                int i26 = 1;
                                while (true) {
                                    Object obj16 = arrayList5.get(i26);
                                    int height12 = ((Placeable) obj16).getHeight();
                                    if (height11 < height12) {
                                        height11 = height12;
                                        obj4 = obj16;
                                    }
                                    if (i26 == lastIndex6) {
                                        break;
                                    }
                                    i26++;
                                }
                            }
                        }
                        Placeable placeable4 = (Placeable) obj4;
                        final Integer numValueOf2 = placeable4 != null ? Integer.valueOf(placeable4.getHeight()) : null;
                        if (fabPlacement != null) {
                            int i27 = i2;
                            WindowInsets windowInsets5 = windowInsets2;
                            if (numValueOf2 == null || FabPosition.J2(i27, FabPosition.INSTANCE.rl())) {
                                height = fabPlacement.getHeight() + subcomposeMeasureScope.How(ScaffoldKt.f27179n);
                                iT = windowInsets5.t(subcomposeMeasureScope);
                            } else {
                                height = numValueOf2.intValue() + fabPlacement.getHeight();
                                iT = subcomposeMeasureScope.How(ScaffoldKt.f27179n);
                            }
                            numValueOf = Integer.valueOf(height + iT);
                        } else {
                            numValueOf = null;
                        }
                        int iIntValue = i19 != 0 ? i19 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : windowInsets2.t(subcomposeMeasureScope)) : 0;
                        ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.MainContent;
                        final WindowInsets windowInsets6 = windowInsets2;
                        final Function3 function34 = function33;
                        final int i28 = i8;
                        List listY5 = subcomposeMeasureScope.Y(scaffoldLayoutContent2, ComposableLambdaKt.rl(-1213360416, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$bodyContentPlaceables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                n(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer2, int i29) {
                                Integer num;
                                if ((i29 & 3) == 2 && composer2.xMQ()) {
                                    composer2.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1213360416, i29, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:238)");
                                }
                                PaddingValues paddingValuesJ2 = WindowInsetsKt.J2(windowInsets6, subcomposeMeasureScope);
                                function34.invoke(PaddingKt.nr(PaddingKt.Uo(paddingValuesJ2, subcomposeMeasureScope.getLayoutDirection()), arrayList3.isEmpty() ? paddingValuesJ2.getTop() : subcomposeMeasureScope.rV9(i28), PaddingKt.J2(paddingValuesJ2, subcomposeMeasureScope.getLayoutDirection()), (arrayList5.isEmpty() || (num = numValueOf2) == null) ? paddingValuesJ2.getBottom() : subcomposeMeasureScope.rV9(num.intValue())), composer2, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }));
                        final ArrayList arrayList6 = new ArrayList(listY5.size());
                        int size5 = listY5.size();
                        for (int i29 = 0; i29 < size5; i29++) {
                            arrayList6.add(((Measurable) listY5.get(i29)).dR0(jNr));
                        }
                        final Integer num = numValueOf2;
                        final WindowInsets windowInsets7 = windowInsets2;
                        final Integer num2 = numValueOf;
                        final int i30 = iIntValue;
                        final FabPlacement fabPlacement2 = fabPlacement;
                        return MeasureScope.ER(subcomposeMeasureScope, iQie, iGh, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                n(placementScope);
                                return Unit.INSTANCE;
                            }

                            public final void n(Placeable.PlacementScope placementScope) {
                                List list2 = arrayList6;
                                int size6 = list2.size();
                                for (int i31 = 0; i31 < size6; i31++) {
                                    Placeable.PlacementScope.xMQ(placementScope, (Placeable) list2.get(i31), 0, 0, 0.0f, 4, null);
                                }
                                List list3 = arrayList3;
                                int size7 = list3.size();
                                for (int i32 = 0; i32 < size7; i32++) {
                                    Placeable.PlacementScope.xMQ(placementScope, (Placeable) list3.get(i32), 0, 0, 0.0f, 4, null);
                                }
                                List list4 = arrayList2;
                                int i33 = iQie;
                                int i34 = i16;
                                WindowInsets windowInsets8 = windowInsets7;
                                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                int i35 = iGh;
                                int i36 = i30;
                                int size8 = list4.size();
                                for (int i37 = 0; i37 < size8; i37++) {
                                    Placeable.PlacementScope.xMQ(placementScope, (Placeable) list4.get(i37), ((i33 - i34) / 2) + windowInsets8.nr(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection()), i35 - i36, 0.0f, 4, null);
                                }
                                List list5 = arrayList5;
                                int i38 = iGh;
                                Integer num3 = num;
                                int size9 = list5.size();
                                for (int i39 = 0; i39 < size9; i39++) {
                                    Placeable.PlacementScope.xMQ(placementScope, (Placeable) list5.get(i39), 0, i38 - (num3 != null ? num3.intValue() : 0), 0.0f, 4, null);
                                }
                                FabPlacement fabPlacement3 = fabPlacement2;
                                if (fabPlacement3 != null) {
                                    List list6 = arrayList4;
                                    int i40 = iGh;
                                    Integer num4 = num2;
                                    int size10 = list6.size();
                                    for (int i41 = 0; i41 < size10; i41++) {
                                        Placeable placeable5 = (Placeable) list6.get(i41);
                                        int left = fabPlacement3.getLeft();
                                        Intrinsics.checkNotNull(num4);
                                        Placeable.PlacementScope.xMQ(placementScope, placeable5, left, i40 - num4.intValue(), 0.0f, 4, null);
                                    }
                                }
                            }
                        }, 4, null);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return n(subcomposeMeasureScope, constraints.getValue());
                    }
                };
                composerKN.o(function27);
                objIF = function27;
            } else {
                i7 = 1;
            }
            SubcomposeLayoutKt.n(null, (Function2) objIF, composerKN, 0, i7);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i8) {
                    ScaffoldKt.rl(i2, function2, function3, function22, function23, windowInsets, function24, composer2, RecomposeScopeImplKt.n(i3 | 1));
                }
            });
        }
    }
}
