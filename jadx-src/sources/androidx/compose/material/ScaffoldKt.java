package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material.FabPosition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
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
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a§\u0002\u0010(\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u0013\b\u0002\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e2\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162 \b\u0002\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020 2\b\b\u0002\u0010%\u001a\u00020 2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u009f\u0002\u0010*\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u0013\b\u0002\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e2\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162 \b\u0002\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020 2\b\b\u0002\u0010%\u001a\u00020 2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a¨\u0001\u00101\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u00142\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b.2\u001c\u0010'\u001a\u0018\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000e¢\u0006\u0002\b.2\u0016\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b.2\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b.2\u0006\u0010\b\u001a\u00020\u00072\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b.H\u0003ø\u0001\u0000¢\u0006\u0004\b1\u00102\"\"\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u000104038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u00105\u001a\u0004\b6\u00107\"\u0014\u0010:\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00109\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006;"}, d2 = {"Landroidx/compose/material/DrawerState;", "drawerState", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/material/ScaffoldState;", "Uo", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ScaffoldState;", "Landroidx/compose/foundation/layout/WindowInsets;", "contentWindowInsets", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "topBar", "bottomBar", "Lkotlin/Function1;", "snackbarHost", "floatingActionButton", "Landroidx/compose/material/FabPosition;", "floatingActionButtonPosition", "", "isFloatingActionButtonDocked", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "drawerContent", "drawerGesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "drawerShape", "Landroidx/compose/ui/unit/Dp;", "drawerElevation", "Landroidx/compose/ui/graphics/Color;", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", AppLovinEventTypes.USER_VIEWED_CONTENT, "rl", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "isFabDocked", "fabPosition", "Landroidx/compose/ui/UiComposable;", "snackbar", "fab", "t", "(ZILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/FabPlacement;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "J2", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalFabPlacement", "F", "FabSpacing", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,582:1\n1247#2,6:583\n1247#2,6:589\n1247#2,6:595\n1247#2,6:602\n1247#2,6:608\n149#3:601\n149#3:614\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt\n*L\n73#1:583,6\n74#1:589,6\n199#1:595,6\n384#1:602,6\n400#1:608,6\n326#1:601\n573#1:614\n*E\n"})
public final class ScaffoldKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ProvidableCompositionLocal f22608n = CompositionLocalKt.Uo(new Function0<FabPlacement>() { // from class: androidx.compose.material.ScaffoldKt$LocalFabPlacement$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final FabPlacement invoke() {
            return null;
        }
    });
    private static final float rl = Dp.KN(16);

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(Modifier modifier, ScaffoldState scaffoldState, Function2 function2, Function2 function22, Function3 function3, Function2 function23, int i2, boolean z2, Function3 function32, boolean z3, Shape shape, float f3, long j2, long j3, long j4, long j5, long j6, final Function3 function33, Composer composer, final int i3, final int i5, final int i7) {
        Modifier modifier2;
        int i8;
        ScaffoldState scaffoldStateUo;
        Function2 function2O;
        int i9;
        int i10;
        Function3 function3Uo;
        int i11;
        Function2 function2KN;
        int i12;
        int iRl;
        int i13;
        boolean z4;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Composer composer2;
        final Function2 function24;
        final float f4;
        final long j7;
        final long j9;
        final long j10;
        final Function3 function34;
        final Modifier modifier3;
        final ScaffoldState scaffoldState2;
        final Function2 function25;
        final int i22;
        final boolean z5;
        final Function2 function26;
        final Function3 function35;
        final boolean z6;
        final Shape shape2;
        final long j11;
        final long j12;
        ScopeUpdateScope scopeUpdateScopeGh;
        Shape large;
        float fT;
        Function2 function27;
        Function3 function36;
        long jTy;
        long jRl;
        long j13;
        int i23;
        long jNr;
        long jT2;
        boolean z7;
        Modifier modifier4;
        Function2 function28;
        Shape shape3;
        boolean z9;
        Function3 function37;
        ScaffoldState scaffoldState3;
        long j14;
        long j15;
        Function3 function38;
        long j16;
        long j17;
        int i24;
        int i25;
        Function2 function29;
        Composer composerKN = composer.KN(1037492569);
        int i26 = i7 & 1;
        if (i26 != 0) {
            i8 = i3 | 6;
            modifier2 = modifier;
        } else if ((i3 & 6) == 0) {
            modifier2 = modifier;
            i8 = (composerKN.p5(modifier2) ? 4 : 2) | i3;
        } else {
            modifier2 = modifier;
            i8 = i3;
        }
        if ((i3 & 48) == 0) {
            if ((i7 & 2) == 0) {
                scaffoldStateUo = scaffoldState;
                int i27 = composerKN.p5(scaffoldStateUo) ? 32 : 16;
                i8 |= i27;
            } else {
                scaffoldStateUo = scaffoldState;
            }
            i8 |= i27;
        } else {
            scaffoldStateUo = scaffoldState;
        }
        int i28 = i7 & 4;
        if (i28 != 0) {
            i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                function2O = function2;
                i8 |= composerKN.E2(function2O) ? 256 : 128;
            }
            i9 = i7 & 8;
            if (i9 == 0) {
                i8 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    i8 |= composerKN.E2(function22) ? 2048 : 1024;
                }
                i10 = i7 & 16;
                int i29 = 8192;
                if (i10 != 0) {
                    i8 |= 24576;
                } else {
                    if ((i3 & 24576) == 0) {
                        function3Uo = function3;
                        i8 |= composerKN.E2(function3Uo) ? 16384 : 8192;
                    }
                    i11 = i7 & 32;
                    if (i11 == 0) {
                        i8 |= 196608;
                        function2KN = function23;
                    } else {
                        function2KN = function23;
                        if ((i3 & 196608) == 0) {
                            i8 |= composerKN.E2(function2KN) ? 131072 : 65536;
                        }
                    }
                    i12 = i7 & 64;
                    if (i12 == 0) {
                        i8 |= 1572864;
                        iRl = i2;
                    } else {
                        iRl = i2;
                        if ((i3 & 1572864) == 0) {
                            i8 |= composerKN.t(iRl) ? 1048576 : 524288;
                        }
                    }
                    i13 = i7 & 128;
                    if (i13 == 0) {
                        i8 |= 12582912;
                        z4 = z2;
                    } else {
                        z4 = z2;
                        if ((i3 & 12582912) == 0) {
                            i8 |= composerKN.n(z4) ? 8388608 : 4194304;
                        }
                    }
                    i14 = i7 & 256;
                    if (i14 == 0) {
                        i8 |= 100663296;
                    } else {
                        if ((i3 & 100663296) == 0) {
                            i15 = i14;
                            i8 |= composerKN.E2(function32) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i16 = i7 & 512;
                        if (i16 != 0) {
                            i8 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        } else {
                            if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i17 = i16;
                                i8 |= composerKN.n(z3) ? 536870912 : 268435456;
                            }
                            if ((i5 & 6) != 0) {
                                i18 = i5 | (((i7 & 1024) == 0 && composerKN.p5(shape)) ? 4 : 2);
                            } else {
                                i18 = i5;
                            }
                            i19 = i7 & 2048;
                            if (i19 != 0) {
                                if ((i5 & 48) == 0) {
                                    i20 = i19;
                                    i18 |= composerKN.rl(f3) ? 32 : 16;
                                }
                                if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                    i21 = i26;
                                    i18 |= ((i7 & 4096) == 0 && composerKN.nr(j2)) ? 256 : 128;
                                } else {
                                    i21 = i26;
                                }
                                if ((i5 & 3072) == 0) {
                                    i18 |= ((i7 & 8192) == 0 && composerKN.nr(j3)) ? 2048 : 1024;
                                }
                                if ((i5 & 24576) == 0) {
                                    if ((i7 & 16384) == 0 && composerKN.nr(j4)) {
                                        i29 = 16384;
                                    }
                                    i18 |= i29;
                                }
                                if ((i5 & 196608) == 0) {
                                    i18 |= ((i7 & 32768) == 0 && composerKN.nr(j5)) ? 131072 : 65536;
                                }
                                if ((i5 & 1572864) == 0) {
                                    i18 |= ((i7 & 65536) == 0 && composerKN.nr(j6)) ? 1048576 : 524288;
                                }
                                if ((i7 & 131072) != 0) {
                                    i18 |= 12582912;
                                } else if ((i5 & 12582912) == 0) {
                                    i18 |= composerKN.E2(function33) ? 8388608 : 4194304;
                                }
                                if (composerKN.HI(((306783379 & i8) == 306783378 && (i18 & 4793491) == 4793490) ? false : true, i8 & 1)) {
                                    composerKN.e();
                                    if ((i3 & 1) == 0 || composerKN.rV9()) {
                                        if (i21 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if ((i7 & 2) != 0) {
                                            i8 &= -113;
                                            scaffoldStateUo = Uo(null, null, composerKN, 0, 3);
                                        }
                                        if (i28 != 0) {
                                            function2O = ComposableSingletons$ScaffoldKt.f21729n.O();
                                        }
                                        Function2 function2J2 = i9 != 0 ? ComposableSingletons$ScaffoldKt.f21729n.J2() : function22;
                                        if (i10 != 0) {
                                            function3Uo = ComposableSingletons$ScaffoldKt.f21729n.Uo();
                                        }
                                        if (i11 != 0) {
                                            function2KN = ComposableSingletons$ScaffoldKt.f21729n.KN();
                                        }
                                        if (i12 != 0) {
                                            iRl = FabPosition.INSTANCE.rl();
                                        }
                                        if (i13 != 0) {
                                            z4 = false;
                                        }
                                        Function3 function39 = i15 != 0 ? null : function32;
                                        boolean z10 = i17 == 0 ? z3 : true;
                                        if ((i7 & 1024) != 0) {
                                            large = MaterialTheme.f22169n.rl(composerKN, 6).getLarge();
                                            i18 &= -15;
                                        } else {
                                            large = shape;
                                        }
                                        int i30 = i18;
                                        fT = i20 != 0 ? DrawerDefaults.f21849n.t() : f3;
                                        if ((i7 & 4096) != 0) {
                                            function27 = function2J2;
                                            i30 &= -897;
                                            function36 = function39;
                                            jTy = MaterialTheme.f22169n.n(composerKN, 6).ty();
                                        } else {
                                            function27 = function2J2;
                                            function36 = function39;
                                            jTy = j2;
                                        }
                                        if ((i7 & 8192) != 0) {
                                            jRl = ColorsKt.rl(jTy, composerKN, (i30 >> 6) & 14);
                                            i30 &= -7169;
                                        } else {
                                            jRl = j3;
                                        }
                                        if ((i7 & 16384) != 0) {
                                            j13 = jTy;
                                            i23 = 6;
                                            jNr = DrawerDefaults.f21849n.nr(composerKN, 6);
                                            i30 &= -57345;
                                        } else {
                                            j13 = jTy;
                                            i23 = 6;
                                            jNr = j4;
                                        }
                                        if ((32768 & i7) != 0) {
                                            jT2 = MaterialTheme.f22169n.n(composerKN, i23).t();
                                            i30 &= -458753;
                                        } else {
                                            jT2 = j5;
                                        }
                                        if ((i7 & 65536) != 0) {
                                            long jRl2 = ColorsKt.rl(jT2, composerKN, (i30 >> 15) & 14);
                                            i30 &= -3670017;
                                            boolean z11 = z4;
                                            z7 = z10;
                                            modifier4 = modifier2;
                                            function28 = function2O;
                                            shape3 = large;
                                            z9 = z11;
                                            ScaffoldState scaffoldState4 = scaffoldStateUo;
                                            function37 = function3Uo;
                                            scaffoldState3 = scaffoldState4;
                                            long j18 = j13;
                                            j14 = jRl;
                                            j15 = j18;
                                            function38 = function36;
                                            j16 = jRl2;
                                        } else {
                                            boolean z12 = z4;
                                            z7 = z10;
                                            modifier4 = modifier2;
                                            function28 = function2O;
                                            shape3 = large;
                                            z9 = z12;
                                            ScaffoldState scaffoldState5 = scaffoldStateUo;
                                            function37 = function3Uo;
                                            scaffoldState3 = scaffoldState5;
                                            long j19 = j13;
                                            j14 = jRl;
                                            j15 = j19;
                                            function38 = function36;
                                            j16 = j6;
                                        }
                                        j17 = jT2;
                                        i24 = i30;
                                        i25 = i8;
                                        function29 = function27;
                                    } else {
                                        composerKN.wTp();
                                        if ((i7 & 2) != 0) {
                                            i8 &= -113;
                                        }
                                        if ((i7 & 1024) != 0) {
                                            i18 &= -15;
                                        }
                                        i24 = i18;
                                        if ((i7 & 4096) != 0) {
                                            i24 &= -897;
                                        }
                                        if ((i7 & 8192) != 0) {
                                            i24 &= -7169;
                                        }
                                        if ((i7 & 16384) != 0) {
                                            i24 &= -57345;
                                        }
                                        if ((32768 & i7) != 0) {
                                            i24 &= -458753;
                                        }
                                        if ((i7 & 65536) != 0) {
                                            i24 &= -3670017;
                                        }
                                        ScaffoldState scaffoldState6 = scaffoldStateUo;
                                        function37 = function3Uo;
                                        scaffoldState3 = scaffoldState6;
                                        function38 = function32;
                                        fT = f3;
                                        j15 = j2;
                                        j14 = j3;
                                        jNr = j4;
                                        j17 = j5;
                                        j16 = j6;
                                        modifier4 = modifier2;
                                        i25 = i8;
                                        z9 = z4;
                                        function28 = function2O;
                                        function29 = function22;
                                        z7 = z3;
                                        shape3 = shape;
                                    }
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(1037492569, i25, i24, "androidx.compose.material.Scaffold (Scaffold.kt:323)");
                                    }
                                    int i31 = i24 << 3;
                                    composer2 = composerKN;
                                    rl(WindowInsetsKt.t(Dp.KN(0), 0.0f, 0.0f, 0.0f, 14, null), modifier4, scaffoldState3, function28, function29, function37, function2KN, iRl, z9, function38, z7, shape3, fT, j15, j14, jNr, j17, j16, function33, composer2, (i25 << 3) & 2147483632, ((i25 >> 27) & 14) | (i31 & 112) | (i31 & 896) | (i31 & 7168) | (57344 & i31) | (458752 & i31) | (3670016 & i31) | (29360128 & i31) | (i31 & 234881024), 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    modifier3 = modifier4;
                                    scaffoldState2 = scaffoldState3;
                                    function26 = function28;
                                    function24 = function29;
                                    function34 = function37;
                                    function25 = function2KN;
                                    i22 = iRl;
                                    z5 = z9;
                                    function35 = function38;
                                    z6 = z7;
                                    shape2 = shape3;
                                    f4 = fT;
                                    j11 = j15;
                                    j12 = j14;
                                    j7 = jNr;
                                    j9 = j17;
                                    j10 = j16;
                                } else {
                                    composer2 = composerKN;
                                    composer2.wTp();
                                    function24 = function22;
                                    f4 = f3;
                                    j7 = j4;
                                    j9 = j5;
                                    j10 = j6;
                                    function34 = function3Uo;
                                    modifier3 = modifier2;
                                    scaffoldState2 = scaffoldStateUo;
                                    function25 = function2KN;
                                    i22 = iRl;
                                    z5 = z4;
                                    function26 = function2O;
                                    function35 = function32;
                                    z6 = z3;
                                    shape2 = shape;
                                    j11 = j2;
                                    j12 = j3;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i32) {
                                            ScaffoldKt.n(modifier3, scaffoldState2, function26, function24, function34, function25, i22, z5, function35, z6, shape2, f4, j11, j12, j7, j9, j10, function33, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5), i7);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i18 |= 48;
                            i20 = i19;
                            if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                            }
                            if ((i5 & 3072) == 0) {
                            }
                            if ((i5 & 24576) == 0) {
                            }
                            if ((i5 & 196608) == 0) {
                            }
                            if ((i5 & 1572864) == 0) {
                            }
                            if ((i7 & 131072) != 0) {
                            }
                            if (composerKN.HI(((306783379 & i8) == 306783378 && (i18 & 4793491) == 4793490) ? false : true, i8 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i17 = i16;
                        if ((i5 & 6) != 0) {
                        }
                        i19 = i7 & 2048;
                        if (i19 != 0) {
                        }
                        i20 = i19;
                        if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        }
                        if ((i5 & 3072) == 0) {
                        }
                        if ((i5 & 24576) == 0) {
                        }
                        if ((i5 & 196608) == 0) {
                        }
                        if ((i5 & 1572864) == 0) {
                        }
                        if ((i7 & 131072) != 0) {
                        }
                        if (composerKN.HI(((306783379 & i8) == 306783378 && (i18 & 4793491) == 4793490) ? false : true, i8 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    i15 = i14;
                    i16 = i7 & 512;
                    if (i16 != 0) {
                    }
                    i17 = i16;
                    if ((i5 & 6) != 0) {
                    }
                    i19 = i7 & 2048;
                    if (i19 != 0) {
                    }
                    i20 = i19;
                    if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    }
                    if ((i5 & 3072) == 0) {
                    }
                    if ((i5 & 24576) == 0) {
                    }
                    if ((i5 & 196608) == 0) {
                    }
                    if ((i5 & 1572864) == 0) {
                    }
                    if ((i7 & 131072) != 0) {
                    }
                    if (composerKN.HI(((306783379 & i8) == 306783378 && (i18 & 4793491) == 4793490) ? false : true, i8 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function3Uo = function3;
                i11 = i7 & 32;
                if (i11 == 0) {
                }
                i12 = i7 & 64;
                if (i12 == 0) {
                }
                i13 = i7 & 128;
                if (i13 == 0) {
                }
                i14 = i7 & 256;
                if (i14 == 0) {
                }
                i15 = i14;
                i16 = i7 & 512;
                if (i16 != 0) {
                }
                i17 = i16;
                if ((i5 & 6) != 0) {
                }
                i19 = i7 & 2048;
                if (i19 != 0) {
                }
                i20 = i19;
                if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                }
                if ((i5 & 3072) == 0) {
                }
                if ((i5 & 24576) == 0) {
                }
                if ((i5 & 196608) == 0) {
                }
                if ((i5 & 1572864) == 0) {
                }
                if ((i7 & 131072) != 0) {
                }
                if (composerKN.HI(((306783379 & i8) == 306783378 && (i18 & 4793491) == 4793490) ? false : true, i8 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            i10 = i7 & 16;
            int i292 = 8192;
            if (i10 != 0) {
            }
            function3Uo = function3;
            i11 = i7 & 32;
            if (i11 == 0) {
            }
            i12 = i7 & 64;
            if (i12 == 0) {
            }
            i13 = i7 & 128;
            if (i13 == 0) {
            }
            i14 = i7 & 256;
            if (i14 == 0) {
            }
            i15 = i14;
            i16 = i7 & 512;
            if (i16 != 0) {
            }
            i17 = i16;
            if ((i5 & 6) != 0) {
            }
            i19 = i7 & 2048;
            if (i19 != 0) {
            }
            i20 = i19;
            if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            }
            if ((i5 & 3072) == 0) {
            }
            if ((i5 & 24576) == 0) {
            }
            if ((i5 & 196608) == 0) {
            }
            if ((i5 & 1572864) == 0) {
            }
            if ((i7 & 131072) != 0) {
            }
            if (composerKN.HI(((306783379 & i8) == 306783378 && (i18 & 4793491) == 4793490) ? false : true, i8 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        function2O = function2;
        i9 = i7 & 8;
        if (i9 == 0) {
        }
        i10 = i7 & 16;
        int i2922 = 8192;
        if (i10 != 0) {
        }
        function3Uo = function3;
        i11 = i7 & 32;
        if (i11 == 0) {
        }
        i12 = i7 & 64;
        if (i12 == 0) {
        }
        i13 = i7 & 128;
        if (i13 == 0) {
        }
        i14 = i7 & 256;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i7 & 512;
        if (i16 != 0) {
        }
        i17 = i16;
        if ((i5 & 6) != 0) {
        }
        i19 = i7 & 2048;
        if (i19 != 0) {
        }
        i20 = i19;
        if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
        }
        if ((i5 & 3072) == 0) {
        }
        if ((i5 & 24576) == 0) {
        }
        if ((i5 & 196608) == 0) {
        }
        if ((i5 & 1572864) == 0) {
        }
        if ((i7 & 131072) != 0) {
        }
        if (composerKN.HI(((306783379 & i8) == 306783378 && (i18 & 4793491) == 4793490) ? false : true, i8 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:319:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final WindowInsets windowInsets, Modifier modifier, ScaffoldState scaffoldState, Function2 function2, Function2 function22, Function3 function3, Function2 function23, int i2, boolean z2, Function3 function32, boolean z3, Shape shape, float f3, long j2, long j3, long j4, long j5, long j6, final Function3 function33, Composer composer, final int i3, final int i5, final int i7) {
        int i8;
        Modifier modifier2;
        ScaffoldState scaffoldStateUo;
        int i9;
        int i10;
        Function2 function2Rl;
        int i11;
        Function3 function3T;
        int i12;
        Function2 function2Nr;
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
        Composer composer2;
        final Function2 function24;
        final int i24;
        final long j7;
        final long j9;
        final long j10;
        final long j11;
        final long j12;
        final Function2 function25;
        final Function3 function34;
        final Modifier modifier3;
        final ScaffoldState scaffoldState2;
        final Function2 function26;
        final boolean z4;
        final Function3 function35;
        final boolean z5;
        final Shape shape2;
        final float f4;
        ScopeUpdateScope scopeUpdateScopeGh;
        boolean z6;
        Function3 function36;
        boolean z7;
        Shape large;
        float fT;
        Function2 function27;
        int i25;
        Shape shape3;
        long jTy;
        long jRl;
        int i26;
        long jNr;
        int i27;
        int i28;
        long jT2;
        final Function2 function28;
        long jRl2;
        int i29;
        long j13;
        int i30;
        Shape shape4;
        int i31;
        Shape shape5;
        Shape shape6;
        Composer composerKN = composer.KN(-1288630565);
        if ((i7 & 1) != 0) {
            i8 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i8 = (composerKN.p5(windowInsets) ? 4 : 2) | i3;
        } else {
            i8 = i3;
        }
        int i32 = i7 & 2;
        if (i32 != 0) {
            i8 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i8 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i7 & 4) == 0) {
                    scaffoldStateUo = scaffoldState;
                    int i33 = composerKN.p5(scaffoldStateUo) ? 256 : 128;
                    i8 |= i33;
                } else {
                    scaffoldStateUo = scaffoldState;
                }
                i8 |= i33;
            } else {
                scaffoldStateUo = scaffoldState;
            }
            i9 = i7 & 8;
            int i34 = 1024;
            if (i9 == 0) {
                i8 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    i8 |= composerKN.E2(function2) ? 2048 : 1024;
                }
                i10 = i7 & 16;
                int i35 = 8192;
                if (i10 != 0) {
                    i8 |= 24576;
                } else {
                    if ((i3 & 24576) == 0) {
                        function2Rl = function22;
                        i8 |= composerKN.E2(function2Rl) ? 16384 : 8192;
                    }
                    i11 = i7 & 32;
                    if (i11 == 0) {
                        i8 |= 196608;
                        function3T = function3;
                    } else {
                        function3T = function3;
                        if ((i3 & 196608) == 0) {
                            i8 |= composerKN.E2(function3T) ? 131072 : 65536;
                        }
                    }
                    i12 = i7 & 64;
                    if (i12 == 0) {
                        i8 |= 1572864;
                        function2Nr = function23;
                    } else {
                        function2Nr = function23;
                        if ((i3 & 1572864) == 0) {
                            i8 |= composerKN.E2(function2Nr) ? 1048576 : 524288;
                        }
                    }
                    i13 = i7 & 128;
                    if (i13 == 0) {
                        i8 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        i8 |= composerKN.t(i2) ? 8388608 : 4194304;
                    }
                    i14 = i7 & 256;
                    if (i14 == 0) {
                        i8 |= 100663296;
                    } else {
                        if ((i3 & 100663296) == 0) {
                            i15 = i14;
                            i8 |= composerKN.n(z2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i16 = i7 & 512;
                        if (i16 != 0) {
                            i8 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        } else {
                            if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i17 = i16;
                                i8 |= composerKN.E2(function32) ? 536870912 : 268435456;
                            }
                            i18 = i7 & 1024;
                            if (i18 == 0) {
                                i20 = i5 | 6;
                                i19 = i18;
                            } else if ((i5 & 6) == 0) {
                                i19 = i18;
                                i20 = i5 | (composerKN.n(z3) ? 4 : 2);
                            } else {
                                i19 = i18;
                                i20 = i5;
                            }
                            if ((i5 & 48) == 0) {
                                i20 |= ((i7 & 2048) == 0 && composerKN.p5(shape)) ? 32 : 16;
                            }
                            int i36 = i20;
                            i21 = i7 & 4096;
                            if (i21 == 0) {
                                i22 = i36 | RendererCapabilities.DECODER_SUPPORT_MASK;
                            } else {
                                i22 = i36;
                                if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                    i22 |= composerKN.rl(f3) ? 256 : 128;
                                }
                                if ((i5 & 3072) == 0) {
                                    if ((i7 & 8192) == 0) {
                                        i23 = i21;
                                        if (composerKN.nr(j2)) {
                                            i34 = 2048;
                                        }
                                    } else {
                                        i23 = i21;
                                    }
                                    i22 |= i34;
                                } else {
                                    i23 = i21;
                                }
                                int i37 = i23;
                                if ((i5 & 24576) == 0) {
                                    if ((i7 & 16384) == 0 && composerKN.nr(j3)) {
                                        i35 = 16384;
                                    }
                                    i22 |= i35;
                                }
                                if ((i5 & 196608) == 0) {
                                    i22 |= ((32768 & i7) == 0 && composerKN.nr(j4)) ? 131072 : 65536;
                                }
                                if ((1572864 & i5) == 0) {
                                    i22 |= ((i7 & 65536) == 0 && composerKN.nr(j5)) ? 1048576 : 524288;
                                }
                                if ((12582912 & i5) == 0) {
                                    i22 |= ((i7 & 131072) == 0 && composerKN.nr(j6)) ? 8388608 : 4194304;
                                }
                                if ((262144 & i7) == 0) {
                                    if ((i5 & 100663296) == 0) {
                                        i22 |= composerKN.E2(function33) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                    }
                                    if (composerKN.HI((i8 & 306783379) == 306783378 || (i22 & 38347923) != 38347922, i8 & 1)) {
                                        composer2 = composerKN;
                                        composer2.wTp();
                                        function24 = function2;
                                        i24 = i2;
                                        j7 = j2;
                                        j9 = j3;
                                        j10 = j4;
                                        j11 = j5;
                                        j12 = j6;
                                        function25 = function2Rl;
                                        function34 = function3T;
                                        modifier3 = modifier2;
                                        scaffoldState2 = scaffoldStateUo;
                                        function26 = function2Nr;
                                        z4 = z2;
                                        function35 = function32;
                                        z5 = z3;
                                        shape2 = shape;
                                        f4 = f3;
                                    } else {
                                        composerKN.e();
                                        if ((i3 & 1) == 0 || composerKN.rV9()) {
                                            if (i32 != 0) {
                                                modifier2 = Modifier.INSTANCE;
                                            }
                                            if ((i7 & 4) != 0) {
                                                i8 &= -897;
                                                scaffoldStateUo = Uo(null, null, composerKN, 0, 3);
                                            }
                                            Function2 function2N = i9 != 0 ? ComposableSingletons$ScaffoldKt.f21729n.n() : function2;
                                            if (i10 != 0) {
                                                function2Rl = ComposableSingletons$ScaffoldKt.f21729n.rl();
                                            }
                                            if (i11 != 0) {
                                                function3T = ComposableSingletons$ScaffoldKt.f21729n.t();
                                            }
                                            if (i12 != 0) {
                                                function2Nr = ComposableSingletons$ScaffoldKt.f21729n.nr();
                                            }
                                            int iRl = i13 != 0 ? FabPosition.INSTANCE.rl() : i2;
                                            z6 = i15 != 0 ? false : z2;
                                            function36 = i17 != 0 ? null : function32;
                                            z7 = i19 != 0 ? true : z3;
                                            if ((i7 & 2048) != 0) {
                                                large = MaterialTheme.f22169n.rl(composerKN, 6).getLarge();
                                                i22 &= -113;
                                            } else {
                                                large = shape;
                                            }
                                            int i38 = i22;
                                            fT = i37 != 0 ? DrawerDefaults.f21849n.t() : f3;
                                            if ((i7 & 8192) != 0) {
                                                function27 = function2N;
                                                i25 = i8;
                                                shape3 = large;
                                                jTy = MaterialTheme.f22169n.n(composerKN, 6).ty();
                                                i38 &= -7169;
                                            } else {
                                                function27 = function2N;
                                                i25 = i8;
                                                shape3 = large;
                                                jTy = j2;
                                            }
                                            if ((i7 & 16384) != 0) {
                                                jRl = ColorsKt.rl(jTy, composerKN, (i38 >> 9) & 14);
                                                i38 &= -57345;
                                            } else {
                                                jRl = j3;
                                            }
                                            if ((32768 & i7) != 0) {
                                                i26 = 6;
                                                jNr = DrawerDefaults.f21849n.nr(composerKN, 6);
                                                i38 &= -458753;
                                            } else {
                                                i26 = 6;
                                                jNr = j4;
                                            }
                                            if ((i7 & 65536) != 0) {
                                                i28 = i38 & (-3670017);
                                                i27 = iRl;
                                                jT2 = MaterialTheme.f22169n.n(composerKN, i26).t();
                                            } else {
                                                i27 = iRl;
                                                i28 = i38;
                                                jT2 = j5;
                                            }
                                            if ((i7 & 131072) != 0) {
                                                function28 = function27;
                                                i29 = i28 & (-29360129);
                                                jRl2 = ColorsKt.rl(jT2, composerKN, (i28 >> 18) & 14);
                                                i31 = i25;
                                                j13 = jT2;
                                                i30 = i27;
                                                shape4 = shape3;
                                            } else {
                                                function28 = function27;
                                                jRl2 = j6;
                                                i29 = i28;
                                                j13 = jT2;
                                                i30 = i27;
                                                shape4 = shape3;
                                                i31 = i25;
                                            }
                                        } else {
                                            composerKN.wTp();
                                            if ((i7 & 4) != 0) {
                                                i8 &= -897;
                                            }
                                            if ((i7 & 2048) != 0) {
                                                i22 &= -113;
                                            }
                                            int i39 = i22;
                                            if ((i7 & 8192) != 0) {
                                                i39 &= -7169;
                                            }
                                            if ((i7 & 16384) != 0) {
                                                i39 &= -57345;
                                            }
                                            if ((32768 & i7) != 0) {
                                                i39 &= -458753;
                                            }
                                            if ((i7 & 65536) != 0) {
                                                i39 &= -3670017;
                                            }
                                            if ((i7 & 131072) != 0) {
                                                i39 &= -29360129;
                                            }
                                            i30 = i2;
                                            z6 = z2;
                                            function36 = function32;
                                            z7 = z3;
                                            shape4 = shape;
                                            fT = f3;
                                            jRl = j3;
                                            jNr = j4;
                                            j13 = j5;
                                            jRl2 = j6;
                                            i29 = i39;
                                            i31 = i8;
                                            function28 = function2;
                                            jTy = j2;
                                        }
                                        composerKN.S();
                                        final int i40 = i30;
                                        if (ComposerKt.v()) {
                                            shape5 = shape4;
                                            ComposerKt.p5(-1288630565, i31, i29, "androidx.compose.material.Scaffold (Scaffold.kt:197)");
                                        } else {
                                            shape5 = shape4;
                                        }
                                        boolean z9 = (i31 & 14) == 4;
                                        Object objIF = composerKN.iF();
                                        if (z9 || objIF == Composer.INSTANCE.n()) {
                                            objIF = new MutableWindowInsets(windowInsets);
                                            composerKN.o(objIF);
                                        }
                                        final MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) objIF;
                                        final boolean z10 = z6;
                                        final Function2 function29 = function2Rl;
                                        final Function3 function37 = function3T;
                                        final ScaffoldState scaffoldState3 = scaffoldStateUo;
                                        final Function2 function210 = function2Nr;
                                        final long j14 = j13;
                                        final long j15 = jRl2;
                                        Function2 function211 = function28;
                                        int i41 = i31;
                                        final ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(-219833176, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier4, Composer composer3, Integer num) {
                                                n(modifier4, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Modifier modifier4, Composer composer3, int i42) {
                                                int i43;
                                                if ((i42 & 6) == 0) {
                                                    i43 = i42 | (composer3.p5(modifier4) ? 4 : 2);
                                                } else {
                                                    i43 = i42;
                                                }
                                                if (!composer3.HI((i43 & 19) != 18, i43 & 1)) {
                                                    composer3.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-219833176, i43, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:201)");
                                                }
                                                boolean zP5 = composer3.p5(mutableWindowInsets) | composer3.p5(windowInsets);
                                                final MutableWindowInsets mutableWindowInsets2 = mutableWindowInsets;
                                                final WindowInsets windowInsets2 = windowInsets;
                                                Object objIF2 = composer3.iF();
                                                if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                                                    objIF2 = new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets3) {
                                                            n(windowInsets3);
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void n(WindowInsets windowInsets3) {
                                                            mutableWindowInsets2.J2(WindowInsetsKt.Uo(windowInsets2, windowInsets3));
                                                        }
                                                    };
                                                    composer3.o(objIF2);
                                                }
                                                Modifier modifierT = WindowInsetsPaddingKt.t(modifier4, (Function1) objIF2);
                                                long j16 = j14;
                                                long j17 = j15;
                                                final boolean z11 = z10;
                                                final int i44 = i40;
                                                final Function2 function212 = function28;
                                                final Function3 function38 = function33;
                                                final Function2 function213 = function210;
                                                final MutableWindowInsets mutableWindowInsets3 = mutableWindowInsets;
                                                final Function2 function214 = function29;
                                                final Function3 function39 = function37;
                                                final ScaffoldState scaffoldState4 = scaffoldState3;
                                                SurfaceKt.n(modifierT, null, j16, j17, null, 0.0f, ComposableLambdaKt.nr(1772955108, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                        n(composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(Composer composer4, int i45) {
                                                        if (!composer4.HI((i45 & 3) != 2, i45 & 1)) {
                                                            composer4.wTp();
                                                            return;
                                                        }
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.p5(1772955108, i45, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:211)");
                                                        }
                                                        boolean z12 = z11;
                                                        int i46 = i44;
                                                        Function2 function215 = function212;
                                                        Function3 function310 = function38;
                                                        final Function3 function311 = function39;
                                                        final ScaffoldState scaffoldState5 = scaffoldState4;
                                                        ScaffoldKt.t(z12, i46, function215, function310, ComposableLambdaKt.nr(433906483, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.2.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                n(composer5, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void n(Composer composer5, int i47) {
                                                                if (!composer5.HI((i47 & 3) != 2, i47 & 1)) {
                                                                    composer5.wTp();
                                                                    return;
                                                                }
                                                                if (ComposerKt.v()) {
                                                                    ComposerKt.p5(433906483, i47, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:217)");
                                                                }
                                                                function311.invoke(scaffoldState5.getSnackbarHostState(), composer5, 0);
                                                                if (ComposerKt.v()) {
                                                                    ComposerKt.M7();
                                                                }
                                                            }
                                                        }, composer4, 54), function213, mutableWindowInsets3, function214, composer4, 24576);
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.M7();
                                                        }
                                                    }
                                                }, composer3, 54), composer3, 1572864, 50);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54);
                                        if (function36 != null) {
                                            composerKN.eF(651765711);
                                            int i42 = i29 << 9;
                                            Shape shape7 = shape5;
                                            DrawerKt.O(function36, modifier2, scaffoldStateUo.getDrawerState(), z7, shape7, fT, jTy, jRl, jNr, ComposableLambdaKt.nr(-1409196448, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    n(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Composer composer3, int i43) {
                                                    if (!composer3.HI((i43 & 3) != 2, i43 & 1)) {
                                                        composer3.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(-1409196448, i43, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:235)");
                                                    }
                                                    composableLambdaNr.invoke(Modifier.INSTANCE, composer3, 54);
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.M7();
                                                    }
                                                }
                                            }, composerKN, 54), composerKN, ((i41 >> 27) & 14) | com.google.android.exoplayer2.C.ENCODING_PCM_32BIT | (i41 & 112) | (i42 & 7168) | (57344 & i42) | (458752 & i42) | (3670016 & i42) | (29360128 & i42) | (i42 & 234881024), 0);
                                            shape6 = shape7;
                                            composer2 = composerKN;
                                            composer2.Xw();
                                        } else {
                                            shape6 = shape5;
                                            composer2 = composerKN;
                                            composer2.eF(652256007);
                                            composableLambdaNr.invoke(modifier2, composer2, Integer.valueOf(((i41 >> 3) & 14) | 48));
                                            composer2.Xw();
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                        function24 = function211;
                                        scaffoldState2 = scaffoldStateUo;
                                        function26 = function2Nr;
                                        f4 = fT;
                                        j9 = jRl;
                                        j10 = jNr;
                                        j11 = j13;
                                        j12 = jRl2;
                                        shape2 = shape6;
                                        modifier3 = modifier2;
                                        z5 = z7;
                                        boolean z11 = z6;
                                        i24 = i40;
                                        Function2 function212 = function2Rl;
                                        z4 = z11;
                                        long j16 = jTy;
                                        function25 = function212;
                                        function34 = function3T;
                                        function35 = function36;
                                        j7 = j16;
                                    }
                                    scopeUpdateScopeGh = composer2.gh();
                                    if (scopeUpdateScopeGh == null) {
                                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                n(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer3, int i43) {
                                                ScaffoldKt.rl(windowInsets, modifier3, scaffoldState2, function24, function25, function34, function26, i24, z4, function35, z5, shape2, f4, j7, j9, j10, j11, j12, function33, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5), i7);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i22 |= 100663296;
                                if (composerKN.HI((i8 & 306783379) == 306783378 || (i22 & 38347923) != 38347922, i8 & 1)) {
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh == null) {
                                }
                            }
                            if ((i5 & 3072) == 0) {
                            }
                            int i372 = i23;
                            if ((i5 & 24576) == 0) {
                            }
                            if ((i5 & 196608) == 0) {
                            }
                            if ((1572864 & i5) == 0) {
                            }
                            if ((12582912 & i5) == 0) {
                            }
                            if ((262144 & i7) == 0) {
                            }
                            if (composerKN.HI((i8 & 306783379) == 306783378 || (i22 & 38347923) != 38347922, i8 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                            }
                        }
                        i17 = i16;
                        i18 = i7 & 1024;
                        if (i18 == 0) {
                        }
                        if ((i5 & 48) == 0) {
                        }
                        int i362 = i20;
                        i21 = i7 & 4096;
                        if (i21 == 0) {
                        }
                        if ((i5 & 3072) == 0) {
                        }
                        int i3722 = i23;
                        if ((i5 & 24576) == 0) {
                        }
                        if ((i5 & 196608) == 0) {
                        }
                        if ((1572864 & i5) == 0) {
                        }
                        if ((12582912 & i5) == 0) {
                        }
                        if ((262144 & i7) == 0) {
                        }
                        if (composerKN.HI((i8 & 306783379) == 306783378 || (i22 & 38347923) != 38347922, i8 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i15 = i14;
                    i16 = i7 & 512;
                    if (i16 != 0) {
                    }
                    i17 = i16;
                    i18 = i7 & 1024;
                    if (i18 == 0) {
                    }
                    if ((i5 & 48) == 0) {
                    }
                    int i3622 = i20;
                    i21 = i7 & 4096;
                    if (i21 == 0) {
                    }
                    if ((i5 & 3072) == 0) {
                    }
                    int i37222 = i23;
                    if ((i5 & 24576) == 0) {
                    }
                    if ((i5 & 196608) == 0) {
                    }
                    if ((1572864 & i5) == 0) {
                    }
                    if ((12582912 & i5) == 0) {
                    }
                    if ((262144 & i7) == 0) {
                    }
                    if (composerKN.HI((i8 & 306783379) == 306783378 || (i22 & 38347923) != 38347922, i8 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                function2Rl = function22;
                i11 = i7 & 32;
                if (i11 == 0) {
                }
                i12 = i7 & 64;
                if (i12 == 0) {
                }
                i13 = i7 & 128;
                if (i13 == 0) {
                }
                i14 = i7 & 256;
                if (i14 == 0) {
                }
                i15 = i14;
                i16 = i7 & 512;
                if (i16 != 0) {
                }
                i17 = i16;
                i18 = i7 & 1024;
                if (i18 == 0) {
                }
                if ((i5 & 48) == 0) {
                }
                int i36222 = i20;
                i21 = i7 & 4096;
                if (i21 == 0) {
                }
                if ((i5 & 3072) == 0) {
                }
                int i372222 = i23;
                if ((i5 & 24576) == 0) {
                }
                if ((i5 & 196608) == 0) {
                }
                if ((1572864 & i5) == 0) {
                }
                if ((12582912 & i5) == 0) {
                }
                if ((262144 & i7) == 0) {
                }
                if (composerKN.HI((i8 & 306783379) == 306783378 || (i22 & 38347923) != 38347922, i8 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            i10 = i7 & 16;
            int i352 = 8192;
            if (i10 != 0) {
            }
            function2Rl = function22;
            i11 = i7 & 32;
            if (i11 == 0) {
            }
            i12 = i7 & 64;
            if (i12 == 0) {
            }
            i13 = i7 & 128;
            if (i13 == 0) {
            }
            i14 = i7 & 256;
            if (i14 == 0) {
            }
            i15 = i14;
            i16 = i7 & 512;
            if (i16 != 0) {
            }
            i17 = i16;
            i18 = i7 & 1024;
            if (i18 == 0) {
            }
            if ((i5 & 48) == 0) {
            }
            int i362222 = i20;
            i21 = i7 & 4096;
            if (i21 == 0) {
            }
            if ((i5 & 3072) == 0) {
            }
            int i3722222 = i23;
            if ((i5 & 24576) == 0) {
            }
            if ((i5 & 196608) == 0) {
            }
            if ((1572864 & i5) == 0) {
            }
            if ((12582912 & i5) == 0) {
            }
            if ((262144 & i7) == 0) {
            }
            if (composerKN.HI((i8 & 306783379) == 306783378 || (i22 & 38347923) != 38347922, i8 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        i9 = i7 & 8;
        int i342 = 1024;
        if (i9 == 0) {
        }
        i10 = i7 & 16;
        int i3522 = 8192;
        if (i10 != 0) {
        }
        function2Rl = function22;
        i11 = i7 & 32;
        if (i11 == 0) {
        }
        i12 = i7 & 64;
        if (i12 == 0) {
        }
        i13 = i7 & 128;
        if (i13 == 0) {
        }
        i14 = i7 & 256;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i7 & 512;
        if (i16 != 0) {
        }
        i17 = i16;
        i18 = i7 & 1024;
        if (i18 == 0) {
        }
        if ((i5 & 48) == 0) {
        }
        int i3622222 = i20;
        i21 = i7 & 4096;
        if (i21 == 0) {
        }
        if ((i5 & 3072) == 0) {
        }
        int i37222222 = i23;
        if ((i5 & 24576) == 0) {
        }
        if ((i5 & 196608) == 0) {
        }
        if ((1572864 & i5) == 0) {
        }
        if ((12582912 & i5) == 0) {
        }
        if ((262144 & i7) == 0) {
        }
        if (composerKN.HI((i8 & 306783379) == 306783378 || (i22 & 38347923) != 38347922, i8 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public static final ProvidableCompositionLocal J2() {
        return f22608n;
    }

    public static final ScaffoldState Uo(DrawerState drawerState, SnackbarHostState snackbarHostState, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            drawerState = DrawerKt.r(DrawerValue.f21979n, null, composer, 6, 2);
        }
        if ((i3 & 2) != 0) {
            Object objIF = composer.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = new SnackbarHostState();
                composer.o(objIF);
            }
            snackbarHostState = (SnackbarHostState) objIF;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(1569641925, i2, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:73)");
        }
        Object objIF2 = composer.iF();
        if (objIF2 == Composer.INSTANCE.n()) {
            objIF2 = new ScaffoldState(drawerState, snackbarHostState);
            composer.o(objIF2);
        }
        ScaffoldState scaffoldState = (ScaffoldState) objIF2;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return scaffoldState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final boolean z2, final int i2, final Function2 function2, final Function3 function3, final Function2 function22, final Function2 function23, final WindowInsets windowInsets, final Function2 function24, Composer composer, final int i3) {
        int i5;
        Function3 function32;
        Function2 function25;
        int i7;
        Composer composerKN = composer.KN(-468424875);
        if ((i3 & 6) == 0) {
            i5 = (composerKN.n(z2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerKN.t(i2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(function2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            function32 = function3;
            i5 |= composerKN.E2(function32) ? 2048 : 1024;
        } else {
            function32 = function3;
        }
        if ((i3 & 24576) == 0) {
            i5 |= composerKN.E2(function22) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            function25 = function23;
            i5 |= composerKN.E2(function25) ? 131072 : 65536;
        } else {
            function25 = function23;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= composerKN.p5(windowInsets) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= composerKN.E2(function24) ? 8388608 : 4194304;
        }
        if (composerKN.HI((i5 & 4793491) != 4793490, i5 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-468424875, i5, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:378)");
            }
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = new ScaffoldKt$ScaffoldLayout$contentPadding$1$1();
                composerKN.o(objIF);
            }
            final ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1 = (ScaffoldKt$ScaffoldLayout$contentPadding$1$1) objIF;
            boolean z3 = ((i5 & 7168) == 2048) | ((57344 & i5) == 16384) | ((i5 & 896) == 256) | ((3670016 & i5) == 1048576) | ((458752 & i5) == 131072) | ((i5 & 112) == 32) | ((i5 & 14) == 4) | ((29360128 & i5) == 8388608);
            Object objIF2 = composerKN.iF();
            if (z3 || objIF2 == companion.n()) {
                final Function3 function33 = function32;
                final Function2 function26 = function25;
                i7 = 0;
                Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function27 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return n(subcomposeMeasureScope, constraints.getValue());
                    }

                    /* JADX WARN: Removed duplicated region for block: B:93:0x023d  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final MeasureResult n(SubcomposeMeasureScope subcomposeMeasureScope, long j2) {
                        Object obj;
                        Object obj2;
                        final FabPlacement fabPlacement;
                        Object obj3;
                        Integer numValueOf;
                        Integer num;
                        float fKN;
                        int iIntValue;
                        int iHow;
                        int height;
                        Object obj4;
                        Object obj5;
                        int iHow2;
                        int iHow3;
                        int iQie = Constraints.qie(j2);
                        int iGh = Constraints.gh(j2);
                        long jNr = Constraints.nr(j2, 0, 0, 0, 0, 10, null);
                        List listY = subcomposeMeasureScope.Y(ScaffoldLayoutContent.f22693n, function2);
                        final ArrayList arrayList = new ArrayList(listY.size());
                        int size = listY.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            arrayList.add(((Measurable) listY.get(i8)).dR0(jNr));
                        }
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            obj = arrayList.get(0);
                            int height2 = ((Placeable) obj).getHeight();
                            int lastIndex = CollectionsKt.getLastIndex(arrayList);
                            if (1 <= lastIndex) {
                                int i9 = 1;
                                while (true) {
                                    Object obj6 = arrayList.get(i9);
                                    int height3 = ((Placeable) obj6).getHeight();
                                    if (height2 < height3) {
                                        obj = obj6;
                                        height2 = height3;
                                    }
                                    if (i9 == lastIndex) {
                                        break;
                                    }
                                    i9++;
                                }
                            }
                        }
                        Placeable placeable = (Placeable) obj;
                        final int height4 = placeable != null ? placeable.getHeight() : 0;
                        List listY2 = subcomposeMeasureScope.Y(ScaffoldLayoutContent.f22691O, function22);
                        WindowInsets windowInsets2 = windowInsets;
                        final ArrayList arrayList2 = new ArrayList(listY2.size());
                        int size2 = listY2.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            arrayList2.add(((Measurable) listY2.get(i10)).dR0(ConstraintsKt.xMQ(jNr, (-windowInsets2.nr(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets2.rl(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets2.t(subcomposeMeasureScope))));
                            i10++;
                            iQie = iQie;
                        }
                        int i11 = iQie;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            obj2 = arrayList2.get(0);
                            int height5 = ((Placeable) obj2).getHeight();
                            int lastIndex2 = CollectionsKt.getLastIndex(arrayList2);
                            if (1 <= lastIndex2) {
                                Object obj7 = obj2;
                                int i12 = height5;
                                int i13 = 1;
                                while (true) {
                                    Object obj8 = arrayList2.get(i13);
                                    int height6 = ((Placeable) obj8).getHeight();
                                    if (i12 < height6) {
                                        obj7 = obj8;
                                        i12 = height6;
                                    }
                                    if (i13 == lastIndex2) {
                                        break;
                                    }
                                    i13++;
                                }
                                obj2 = obj7;
                            }
                        }
                        Placeable placeable2 = (Placeable) obj2;
                        int height7 = placeable2 != null ? placeable2.getHeight() : 0;
                        List listY3 = subcomposeMeasureScope.Y(ScaffoldLayoutContent.J2, function26);
                        WindowInsets windowInsets3 = windowInsets;
                        final ArrayList arrayList3 = new ArrayList(listY3.size());
                        int size3 = listY3.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            arrayList3.add(((Measurable) listY3.get(i14)).dR0(ConstraintsKt.xMQ(jNr, (-windowInsets3.nr(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets3.rl(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets3.t(subcomposeMeasureScope))));
                            i14++;
                            height7 = height7;
                            iGh = iGh;
                        }
                        int i15 = height7;
                        final int i16 = iGh;
                        if (arrayList3.isEmpty()) {
                            fabPlacement = null;
                        } else {
                            if (arrayList3.isEmpty()) {
                                obj4 = null;
                            } else {
                                obj4 = arrayList3.get(0);
                                int width = ((Placeable) obj4).getWidth();
                                int lastIndex3 = CollectionsKt.getLastIndex(arrayList3);
                                if (1 <= lastIndex3) {
                                    Object obj9 = obj4;
                                    int i17 = width;
                                    int i18 = 1;
                                    while (true) {
                                        Object obj10 = arrayList3.get(i18);
                                        int width2 = ((Placeable) obj10).getWidth();
                                        if (i17 < width2) {
                                            obj9 = obj10;
                                            i17 = width2;
                                        }
                                        if (i18 == lastIndex3) {
                                            break;
                                        }
                                        i18++;
                                    }
                                    obj4 = obj9;
                                }
                            }
                            Placeable placeable3 = (Placeable) obj4;
                            int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                            if (arrayList3.isEmpty()) {
                                obj5 = null;
                            } else {
                                obj5 = arrayList3.get(0);
                                int height8 = ((Placeable) obj5).getHeight();
                                int lastIndex4 = CollectionsKt.getLastIndex(arrayList3);
                                if (1 <= lastIndex4) {
                                    Object obj11 = obj5;
                                    int i19 = height8;
                                    int i20 = 1;
                                    while (true) {
                                        Object obj12 = arrayList3.get(i20);
                                        int height9 = ((Placeable) obj12).getHeight();
                                        if (i19 < height9) {
                                            obj11 = obj12;
                                            i19 = height9;
                                        }
                                        if (i20 == lastIndex4) {
                                            break;
                                        }
                                        i20++;
                                    }
                                    obj5 = obj11;
                                }
                            }
                            Placeable placeable4 = (Placeable) obj5;
                            int height10 = placeable4 != null ? placeable4.getHeight() : 0;
                            if (width3 != 0 && height10 != 0) {
                                int i21 = i2;
                                FabPosition.Companion companion2 = FabPosition.INSTANCE;
                                if (!FabPosition.J2(i21, companion2.t())) {
                                    if (!FabPosition.J2(i21, companion2.rl())) {
                                        iHow2 = (i11 - width3) / 2;
                                    } else if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.f34160n) {
                                        iHow3 = subcomposeMeasureScope.How(ScaffoldKt.rl);
                                        iHow2 = (i11 - iHow3) - width3;
                                    } else {
                                        iHow2 = subcomposeMeasureScope.How(ScaffoldKt.rl);
                                    }
                                    fabPlacement = new FabPlacement(z2, iHow2, width3, height10);
                                } else if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.f34160n) {
                                    iHow2 = subcomposeMeasureScope.How(ScaffoldKt.rl);
                                    fabPlacement = new FabPlacement(z2, iHow2, width3, height10);
                                } else {
                                    iHow3 = subcomposeMeasureScope.How(ScaffoldKt.rl);
                                    iHow2 = (i11 - iHow3) - width3;
                                    fabPlacement = new FabPlacement(z2, iHow2, width3, height10);
                                }
                            }
                        }
                        ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.f22695r;
                        final Function2 function28 = function24;
                        List listY4 = subcomposeMeasureScope.Y(scaffoldLayoutContent, ComposableLambdaKt.rl(424088350, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$bottomBarPlaceables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                                n(composer2, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer2, int i22) {
                                if (!composer2.HI((i22 & 3) != 2, i22 & 1)) {
                                    composer2.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(424088350, i22, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:475)");
                                }
                                CompositionLocalKt.rl(ScaffoldKt.J2().nr(fabPlacement), function28, composer2, ProvidedValue.xMQ);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }));
                        final FabPlacement fabPlacement2 = fabPlacement;
                        final ArrayList arrayList4 = new ArrayList(listY4.size());
                        int size4 = listY4.size();
                        for (int i22 = 0; i22 < size4; i22++) {
                            arrayList4.add(((Measurable) listY4.get(i22)).dR0(jNr));
                        }
                        if (arrayList4.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList4.get(0);
                            int height11 = ((Placeable) obj3).getHeight();
                            int lastIndex5 = CollectionsKt.getLastIndex(arrayList4);
                            if (1 <= lastIndex5) {
                                int i23 = 1;
                                while (true) {
                                    Object obj13 = arrayList4.get(i23);
                                    int height12 = ((Placeable) obj13).getHeight();
                                    if (height11 < height12) {
                                        obj3 = obj13;
                                        height11 = height12;
                                    }
                                    if (i23 == lastIndex5) {
                                        break;
                                    }
                                    i23++;
                                }
                            }
                        }
                        Placeable placeable5 = (Placeable) obj3;
                        Integer numValueOf2 = placeable5 != null ? Integer.valueOf(placeable5.getHeight()) : null;
                        if (fabPlacement2 != null) {
                            WindowInsets windowInsets4 = windowInsets;
                            boolean z4 = z2;
                            if (numValueOf2 == null) {
                                height = fabPlacement2.getHeight() + subcomposeMeasureScope.How(ScaffoldKt.rl) + windowInsets4.t(subcomposeMeasureScope);
                            } else {
                                if (z4) {
                                    iIntValue = numValueOf2.intValue();
                                    iHow = fabPlacement2.getHeight() / 2;
                                } else {
                                    iIntValue = numValueOf2.intValue() + fabPlacement2.getHeight();
                                    iHow = subcomposeMeasureScope.How(ScaffoldKt.rl);
                                }
                                height = iHow + iIntValue;
                            }
                            numValueOf = Integer.valueOf(height);
                        } else {
                            numValueOf = null;
                        }
                        final int iIntValue2 = i15 != 0 ? i15 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : windowInsets.t(subcomposeMeasureScope)) : 0;
                        PaddingValues paddingValuesJ2 = WindowInsetsKt.J2(windowInsets, subcomposeMeasureScope);
                        ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$12 = scaffoldKt$ScaffoldLayout$contentPadding$1$1;
                        if (arrayList.isEmpty()) {
                            num = numValueOf2;
                            fKN = paddingValuesJ2.getTop();
                        } else {
                            num = numValueOf2;
                            fKN = Dp.KN(0);
                        }
                        final Integer num2 = numValueOf;
                        scaffoldKt$ScaffoldLayout$contentPadding$1$12.J2(PaddingKt.nr(PaddingKt.Uo(paddingValuesJ2, subcomposeMeasureScope.getLayoutDirection()), fKN, PaddingKt.J2(paddingValuesJ2, subcomposeMeasureScope.getLayoutDirection()), (arrayList4.isEmpty() || num == null) ? paddingValuesJ2.getBottom() : subcomposeMeasureScope.rV9(num.intValue())));
                        int i24 = i16 - height4;
                        ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.f22696t;
                        final Function3 function34 = function33;
                        final ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$13 = scaffoldKt$ScaffoldLayout$contentPadding$1$1;
                        List listY5 = subcomposeMeasureScope.Y(scaffoldLayoutContent2, ComposableLambdaKt.rl(-570781649, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$bodyContentPlaceables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num3) {
                                n(composer2, num3.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer2, int i25) {
                                if (!composer2.HI((i25 & 3) != 2, i25 & 1)) {
                                    composer2.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-570781649, i25, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:534)");
                                }
                                function34.invoke(scaffoldKt$ScaffoldLayout$contentPadding$1$13, composer2, 6);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }));
                        final ArrayList arrayList5 = new ArrayList(listY5.size());
                        int size5 = listY5.size();
                        for (int i25 = 0; i25 < size5; i25++) {
                            arrayList5.add(((Measurable) listY5.get(i25)).dR0(Constraints.nr(jNr, 0, 0, 0, i24, 7, null)));
                        }
                        final Integer num3 = num;
                        return MeasureScope.ER(subcomposeMeasureScope, i11, i16, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1.1
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
                                List list = arrayList5;
                                int i26 = height4;
                                int size6 = list.size();
                                for (int i27 = 0; i27 < size6; i27++) {
                                    Placeable.PlacementScope.xMQ(placementScope, (Placeable) list.get(i27), 0, i26, 0.0f, 4, null);
                                }
                                List list2 = arrayList;
                                int size7 = list2.size();
                                for (int i28 = 0; i28 < size7; i28++) {
                                    Placeable.PlacementScope.xMQ(placementScope, (Placeable) list2.get(i28), 0, 0, 0.0f, 4, null);
                                }
                                List list3 = arrayList2;
                                int i29 = i16;
                                int i30 = iIntValue2;
                                int size8 = list3.size();
                                for (int i31 = 0; i31 < size8; i31++) {
                                    Placeable.PlacementScope.xMQ(placementScope, (Placeable) list3.get(i31), 0, i29 - i30, 0.0f, 4, null);
                                }
                                List list4 = arrayList4;
                                int i32 = i16;
                                Integer num4 = num3;
                                int size9 = list4.size();
                                for (int i33 = 0; i33 < size9; i33++) {
                                    Placeable.PlacementScope.xMQ(placementScope, (Placeable) list4.get(i33), 0, i32 - (num4 != null ? num4.intValue() : 0), 0.0f, 4, null);
                                }
                                List list5 = arrayList3;
                                FabPlacement fabPlacement3 = fabPlacement2;
                                int i34 = i16;
                                Integer num5 = num2;
                                int size10 = list5.size();
                                for (int i35 = 0; i35 < size10; i35++) {
                                    Placeable.PlacementScope.xMQ(placementScope, (Placeable) list5.get(i35), fabPlacement3 != null ? fabPlacement3.getAndroidx.media3.extractor.text.ttml.TtmlNode.LEFT java.lang.String() : 0, i34 - (num5 != null ? num5.intValue() : 0), 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                composerKN.o(function27);
                objIF2 = function27;
            } else {
                i7 = 0;
            }
            SubcomposeLayoutKt.n(null, (Function2) objIF2, composerKN, i7, 1);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$2
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
                    ScaffoldKt.t(z2, i2, function2, function3, function22, function23, windowInsets, function24, composer2, RecomposeScopeImplKt.n(i3 | 1));
                }
            });
        }
    }
}
