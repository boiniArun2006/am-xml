package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.PlainTooltipTokens;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ao\u0010\u0011\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0093\u0001\u0010\u0018\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001aH\u0010$\u001a\u00020#*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010!H\u0003ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/material3/TooltipScope;", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/DpSize;", "caretSize", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "contentColor", "containerColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "title", FileUploadManager.f61572j, "Landroidx/compose/material3/RichTooltipColors;", "colors", "text", "rl", "(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/RichTooltipColors;FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/material3/CaretType;", "caretType", "Landroidx/compose/ui/unit/Density;", "density", "Landroid/content/res/Configuration;", com.safedk.android.utils.j.f63190c, "Landroidx/compose/ui/layout/LayoutCoordinates;", "anchorLayoutCoordinates", "Landroidx/compose/ui/draw/DrawResult;", "nr", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/material3/CaretType;Landroidx/compose/ui/unit/Density;Landroid/content/res/Configuration;JJLandroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/draw/DrawResult;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTooltip.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.android.kt\nandroidx/compose/material3/Tooltip_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,326:1\n148#2:327\n148#2:328\n482#2:329\n482#2:340\n148#2:349\n77#3:330\n77#3:331\n77#3:338\n77#3:341\n77#3:342\n1223#4,6:332\n1223#4,6:343\n50#5:339\n*S KotlinDebug\n*F\n+ 1 Tooltip.android.kt\nandroidx/compose/material3/Tooltip_androidKt\n*L\n218#1:327\n219#1:328\n76#1:329\n153#1:340\n237#1:349\n77#1:330\n78#1:331\n149#1:338\n154#1:341\n155#1:342\n79#1:332,6\n156#1:343,6\n149#1:339\n*E\n"})
public final class Tooltip_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final TooltipScope tooltipScope, Modifier modifier, long j2, Shape shape, long j3, long j4, float f3, float f4, final Function2 function2, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        Shape shapeT;
        final long jNr;
        long jRl;
        int i7;
        float f5;
        int i8;
        long jN;
        float fKN;
        float f6;
        Shape shape2;
        int i9;
        final long j5;
        long j6;
        Modifier modifierZmq;
        Composer composer2;
        final Modifier modifier3;
        final long j7;
        final Shape shape3;
        final long j9;
        final float f7;
        final float f8;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1407069716);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = ((i2 & 8) == 0 ? composerKN.p5(tooltipScope) : composerKN.E2(tooltipScope) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i10 = i3 & 1;
        if (i10 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= ((i3 & 2) == 0 && composerKN.nr(j2)) ? 256 : 128;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 4) == 0) {
                    shapeT = shape;
                    int i11 = composerKN.p5(shapeT) ? 2048 : 1024;
                    i5 |= i11;
                } else {
                    shapeT = shape;
                }
                i5 |= i11;
            } else {
                shapeT = shape;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 8) == 0) {
                    jNr = j3;
                    int i12 = composerKN.nr(jNr) ? 16384 : 8192;
                    i5 |= i12;
                } else {
                    jNr = j3;
                }
                i5 |= i12;
            } else {
                jNr = j3;
            }
            if ((i2 & 196608) != 0) {
                jRl = j4;
                i5 |= ((i3 & 16) == 0 && composerKN.nr(jRl)) ? 131072 : 65536;
            } else {
                jRl = j4;
            }
            i7 = i3 & 32;
            if (i7 == 0) {
                i5 |= 1572864;
                f5 = f3;
            } else {
                f5 = f3;
                if ((i2 & 1572864) == 0) {
                    i5 |= composerKN.rl(f5) ? 1048576 : 524288;
                }
            }
            i8 = i3 & 64;
            if (i8 == 0) {
                i5 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i5 |= composerKN.rl(f4) ? 8388608 : 4194304;
            }
            if ((i3 & 128) == 0) {
                i5 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                i5 |= composerKN.E2(function2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
            }
            if ((38347923 & i5) == 38347922 || !composerKN.xMQ()) {
                composerKN.e();
                if ((i2 & 1) != 0 || composerKN.rV9()) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 2) == 0) {
                        jN = DpSize.INSTANCE.n();
                        i5 &= -897;
                    } else {
                        jN = j2;
                    }
                    if ((i3 & 4) != 0) {
                        i5 &= -7169;
                        shapeT = TooltipDefaults.f28770n.t(composerKN, 6);
                    }
                    if ((i3 & 8) != 0) {
                        jNr = TooltipDefaults.f28770n.nr(composerKN, 6);
                        i5 &= -57345;
                    }
                    if ((i3 & 16) != 0) {
                        jRl = TooltipDefaults.f28770n.rl(composerKN, 6);
                        i5 &= -458753;
                    }
                    float fKN2 = i7 == 0 ? Dp.KN(0) : f5;
                    if (i8 == 0) {
                        f6 = fKN2;
                        shape2 = shapeT;
                        fKN = Dp.KN(0);
                    } else {
                        fKN = f4;
                        f6 = fKN2;
                        shape2 = shapeT;
                    }
                    i9 = i5;
                    j5 = jN;
                } else {
                    composerKN.wTp();
                    if ((i3 & 2) != 0) {
                        i5 &= -897;
                    }
                    if ((i3 & 4) != 0) {
                        i5 &= -7169;
                    }
                    if ((i3 & 8) != 0) {
                        i5 &= -57345;
                    }
                    if ((i3 & 16) != 0) {
                        i5 &= -458753;
                    }
                    fKN = f4;
                    shape2 = shapeT;
                    f6 = f5;
                    i9 = i5;
                    j5 = j2;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(1407069716, i9, -1, "androidx.compose.material3.PlainTooltip (Tooltip.android.kt:73)");
                }
                composerKN.eF(-333850415);
                if (j5 == 9205357640488583168L) {
                    j6 = jRl;
                    modifierZmq = modifier2;
                } else {
                    final Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                    final Configuration configuration = (Configuration) composerKN.ty(AndroidCompositionLocals_androidKt.J2());
                    Modifier.Companion companion = Modifier.INSTANCE;
                    boolean zP5 = composerKN.p5(density) | composerKN.E2(configuration) | ((((i9 & 458752) ^ 196608) > 131072 && composerKN.nr(jRl)) || (i9 & 196608) == 131072) | ((((i9 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composerKN.nr(j5)) || (i9 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
                    Object objIF = composerKN.iF();
                    if (zP5 || objIF == Composer.INSTANCE.n()) {
                        final long j10 = j5;
                        final long j11 = jRl;
                        objIF = new Function2<CacheDrawScope, LayoutCoordinates, DrawResult>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$drawCaretModifier$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                            public final DrawResult invoke(CacheDrawScope cacheDrawScope, LayoutCoordinates layoutCoordinates) {
                                return Tooltip_androidKt.nr(cacheDrawScope, CaretType.Plain, density, configuration, j11, j10, layoutCoordinates);
                            }
                        };
                        j6 = j11;
                        composerKN.o(objIF);
                    } else {
                        j6 = jRl;
                    }
                    modifierZmq = tooltipScope.n(companion, (Function2) objIF).Zmq(modifier2);
                }
                composerKN.Xw();
                int i13 = i9 >> 6;
                composer2 = composerKN;
                SurfaceKt.n(modifierZmq, shape2, j6, 0L, f6, fKN, null, ComposableLambdaKt.nr(1430116975, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        n(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer3, int i14) {
                        if ((i14 & 3) == 2 && composer3.xMQ()) {
                            composer3.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1430116975, i14, -1, "androidx.compose.material3.PlainTooltip.<anonymous> (Tooltip.android.kt:97)");
                        }
                        Modifier modifierKN = PaddingKt.KN(SizeKt.aYN(Modifier.INSTANCE, TooltipKt.qie(), TooltipKt.gh(), TooltipKt.Uo(), 0.0f, 8, null), TooltipKt.J2());
                        long j12 = jNr;
                        Function2 function22 = function2;
                        MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                        int iN = ComposablesKt.n(composer3, 0);
                        CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                        Modifier modifierO = ComposedModifierKt.O(composer3, modifierKN);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0 function0N = companion2.n();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.t();
                        }
                        composer3.T();
                        if (composer3.getInserting()) {
                            composer3.s7N(function0N);
                        } else {
                            composer3.r();
                        }
                        Composer composerN = Updater.n(composer3);
                        Updater.O(composerN, measurePolicyUo, companion2.t());
                        Updater.O(composerN, compositionLocalMapIk, companion2.O());
                        Function2 function2Rl = companion2.rl();
                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion2.nr());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                        CompositionLocalKt.t(new ProvidedValue[]{ContentColorKt.n().nr(Color.xMQ(j12)), TextKt.J2().nr(TypographyKt.t(PlainTooltipTokens.f29832n.nr(), composer3, 6))}, function22, composer3, ProvidedValue.xMQ);
                        composer3.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composer2, ((i9 >> 9) & 896) | (i13 & 112) | 12582912 | (57344 & i13) | (i13 & 458752), 72);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier2;
                j7 = jNr;
                shape3 = shape2;
                j9 = j6;
                f7 = f6;
                f8 = fKN;
            } else {
                composerKN.wTp();
                j5 = j2;
                composer2 = composerKN;
                modifier3 = modifier2;
                shape3 = shapeT;
                j9 = jRl;
                j7 = jNr;
                f7 = f5;
                f8 = f4;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        n(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer3, int i14) {
                        Tooltip_androidKt.n(tooltipScope, modifier3, j5, shape3, j7, j9, f7, f8, function2, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        modifier2 = modifier;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        if ((i2 & 196608) != 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((38347923 & i5) == 38347922) {
            composerKN.e();
            if ((i2 & 1) != 0) {
                if (i10 != 0) {
                }
                if ((i3 & 2) == 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if ((i3 & 8) != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                i9 = i5;
                j5 = jN;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                composerKN.eF(-333850415);
                if (j5 == 9205357640488583168L) {
                }
                composerKN.Xw();
                int i132 = i9 >> 6;
                composer2 = composerKN;
                SurfaceKt.n(modifierZmq, shape2, j6, 0L, f6, fKN, null, ComposableLambdaKt.nr(1430116975, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        n(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer3, int i14) {
                        if ((i14 & 3) == 2 && composer3.xMQ()) {
                            composer3.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1430116975, i14, -1, "androidx.compose.material3.PlainTooltip.<anonymous> (Tooltip.android.kt:97)");
                        }
                        Modifier modifierKN = PaddingKt.KN(SizeKt.aYN(Modifier.INSTANCE, TooltipKt.qie(), TooltipKt.gh(), TooltipKt.Uo(), 0.0f, 8, null), TooltipKt.J2());
                        long j12 = jNr;
                        Function2 function22 = function2;
                        MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                        int iN = ComposablesKt.n(composer3, 0);
                        CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                        Modifier modifierO = ComposedModifierKt.O(composer3, modifierKN);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0 function0N = companion2.n();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.t();
                        }
                        composer3.T();
                        if (composer3.getInserting()) {
                            composer3.s7N(function0N);
                        } else {
                            composer3.r();
                        }
                        Composer composerN = Updater.n(composer3);
                        Updater.O(composerN, measurePolicyUo, companion2.t());
                        Updater.O(composerN, compositionLocalMapIk, companion2.O());
                        Function2 function2Rl = companion2.rl();
                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion2.nr());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                        CompositionLocalKt.t(new ProvidedValue[]{ContentColorKt.n().nr(Color.xMQ(j12)), TextKt.J2().nr(TypographyKt.t(PlainTooltipTokens.f29832n.nr(), composer3, 6))}, function22, composer3, ProvidedValue.xMQ);
                        composer3.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composer2, ((i9 >> 9) & 896) | (i132 & 112) | 12582912 | (57344 & i132) | (i132 & 458752), 72);
                if (ComposerKt.v()) {
                }
                modifier3 = modifier2;
                j7 = jNr;
                shape3 = shape2;
                j9 = j6;
                f7 = f6;
                f8 = fKN;
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca A[PHI: r15
      0x00ca: PHI (r15v2 long) = (r15v1 long), (r15v4 long) binds: [B:17:0x009c, B:19:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final DrawResult nr(CacheDrawScope cacheDrawScope, CaretType caretType, Density density, Configuration configuration, final long j2, long j3, final LayoutCoordinates layoutCoordinates) {
        long jN;
        final Path pathN = AndroidPath_androidKt.n();
        if (layoutCoordinates != null) {
            int iHow = density.How(DpSize.xMQ(j3));
            int iHow2 = density.How(DpSize.mUb(j3));
            int iHow3 = density.How(Dp.KN(configuration.screenWidthDp));
            int iHow4 = density.How(TooltipKt.mUb());
            Rect rectT = LayoutCoordinatesKt.t(layoutCoordinates);
            float left = rectT.getLeft();
            float f3 = rectT.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String();
            float top = rectT.getTop();
            float f4 = 2;
            float f5 = (f3 + left) / f4;
            float f6 = f3 - left;
            float fGh = Size.gh(cacheDrawScope.t());
            float fXMQ = Size.xMQ(cacheDrawScope.t());
            boolean z2 = (top - fXMQ) - ((float) iHow4) < 0.0f;
            if (z2) {
                fXMQ = 0.0f;
            }
            if (caretType == CaretType.Plain) {
                float f7 = iHow3;
                jN = (fGh / f4) + f5 > f7 ? OffsetKt.n(fGh - (f7 - f5), fXMQ) : OffsetKt.n(f5 - Math.max(left - ((Size.gh(cacheDrawScope.t()) / f4) - (f6 / f4)), 0.0f), fXMQ);
            } else {
                long jN2 = OffsetKt.n(f5 - left, fXMQ);
                float f8 = iHow3;
                if (left + fGh > f8) {
                    float f9 = f3 - fGh;
                    jN2 = OffsetKt.n(f5 - f9, fXMQ);
                    if (f9 < 0.0f) {
                        float f10 = fGh / f4;
                        float f11 = f6 / f4;
                        jN = (left - f10) + f11 <= 0.0f ? OffsetKt.n(f5, fXMQ) : (f3 + f10) - f11 >= f8 ? OffsetKt.n(fGh - (f8 - f5), fXMQ) : OffsetKt.n(f10, fXMQ);
                    } else {
                        jN = jN2;
                    }
                }
            }
            if (z2) {
                pathN.Ik(Offset.az(jN), Offset.ty(jN));
                float f12 = iHow2 / 2;
                pathN.S(Offset.az(jN) + f12, Offset.ty(jN));
                pathN.S(Offset.az(jN), Offset.ty(jN) - iHow);
                pathN.S(Offset.az(jN) - f12, Offset.ty(jN));
                pathN.close();
            } else {
                pathN.Ik(Offset.az(jN), Offset.ty(jN));
                float f13 = iHow2 / 2;
                pathN.S(Offset.az(jN) + f13, Offset.ty(jN));
                pathN.S(Offset.az(jN), Offset.ty(jN) + iHow);
                pathN.S(Offset.az(jN) - f13, Offset.ty(jN));
                pathN.close();
            }
        }
        return cacheDrawScope.r(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$drawCaretWithPath$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                n(contentDrawScope);
                return Unit.INSTANCE;
            }

            public final void n(ContentDrawScope contentDrawScope) {
                if (layoutCoordinates != null) {
                    contentDrawScope.l2();
                    DrawScope.EWS(contentDrawScope, pathN, j2, 0.0f, null, null, 0, 60, null);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final TooltipScope tooltipScope, Modifier modifier, Function2 function2, Function2 function22, long j2, Shape shape, RichTooltipColors richTooltipColors, float f3, float f4, final Function2 function23, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        final Function2 function24;
        int i8;
        final Function2 function25;
        long jN;
        Shape shapeO;
        int i9;
        int i10;
        int i11;
        final RichTooltipColors richTooltipColorsUo;
        float f5;
        int i12;
        float fNr;
        Shape shape2;
        long j3;
        Modifier modifierZmq;
        final RichTooltipColors richTooltipColors2;
        final Modifier modifier3;
        Composer composer2;
        final Function2 function26;
        final Function2 function27;
        final Shape shape3;
        final float f6;
        final float f7;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1867454921);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = ((i2 & 8) == 0 ? composerKN.p5(tooltipScope) : composerKN.E2(tooltipScope) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i13 = i3 & 1;
        if (i13 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i7 = i3 & 2;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    function24 = function2;
                    i5 |= composerKN.E2(function24) ? 256 : 128;
                }
                i8 = i3 & 4;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        function25 = function22;
                        i5 |= composerKN.E2(function25) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        jN = j2;
                        i5 |= ((i3 & 8) == 0 && composerKN.nr(jN)) ? 16384 : 8192;
                    } else {
                        jN = j2;
                    }
                    if ((196608 & i2) != 0) {
                        if ((i3 & 16) == 0) {
                            shapeO = shape;
                            int i14 = composerKN.p5(shapeO) ? 131072 : 65536;
                            i5 |= i14;
                        } else {
                            shapeO = shape;
                        }
                        i5 |= i14;
                    } else {
                        shapeO = shape;
                    }
                    if ((i2 & 1572864) == 0) {
                        i5 |= ((i3 & 32) == 0 && composerKN.p5(richTooltipColors)) ? 1048576 : 524288;
                    }
                    i9 = i3 & 64;
                    if (i9 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i5 |= composerKN.rl(f3) ? 8388608 : 4194304;
                    }
                    i10 = i3 & 128;
                    if (i10 != 0) {
                        if ((i2 & 100663296) == 0) {
                            i11 = i10;
                            i5 |= composerKN.rl(f4) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        if ((i3 & 256) != 0) {
                            i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i5 |= composerKN.E2(function23) ? 536870912 : 268435456;
                        }
                        int i15 = i5;
                        if ((306783379 & i5) == 306783378 && composerKN.xMQ()) {
                            composerKN.wTp();
                            richTooltipColors2 = richTooltipColors;
                            composer2 = composerKN;
                            modifier3 = modifier2;
                            function26 = function24;
                            function27 = function25;
                            shape3 = shapeO;
                            j4 = jN;
                            f6 = f3;
                            f7 = f4;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                if (i13 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i7 != 0) {
                                    function24 = null;
                                }
                                if (i8 != 0) {
                                    function25 = null;
                                }
                                if ((i3 & 8) != 0) {
                                    jN = DpSize.INSTANCE.n();
                                    i15 &= -57345;
                                }
                                if ((i3 & 16) != 0) {
                                    i15 &= -458753;
                                    shapeO = TooltipDefaults.f28770n.O(composerKN, 6);
                                }
                                if ((i3 & 32) == 0) {
                                    richTooltipColorsUo = TooltipDefaults.f28770n.Uo(composerKN, 6);
                                    i15 &= -3670017;
                                } else {
                                    richTooltipColorsUo = richTooltipColors;
                                }
                                float fN = i9 == 0 ? ElevationTokens.f29511n.n() : f3;
                                if (i11 == 0) {
                                    int i16 = i15;
                                    f5 = fN;
                                    i12 = i16;
                                    fNr = RichTooltipTokens.f29849n.nr();
                                } else {
                                    int i17 = i15;
                                    f5 = fN;
                                    i12 = i17;
                                    fNr = f4;
                                }
                            } else {
                                composerKN.wTp();
                                if ((i3 & 8) != 0) {
                                    i15 &= -57345;
                                }
                                if ((i3 & 16) != 0) {
                                    i15 &= -458753;
                                }
                                if ((i3 & 32) != 0) {
                                    i15 &= -3670017;
                                }
                                richTooltipColorsUo = richTooltipColors;
                                fNr = f4;
                                i12 = i15;
                                f5 = f3;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1867454921, i12, -1, "androidx.compose.material3.RichTooltip (Tooltip.android.kt:147)");
                            }
                            final long jN2 = ColorSchemeKt.n(MaterialTheme.f26164n.n(composerKN, 6), richTooltipColorsUo.getContainerColor(), Dp.KN(((Dp) composerKN.ty(SurfaceKt.Uo())).getValue() + f5), composerKN, 0);
                            composerKN.eF(1472746423);
                            if (jN == 9205357640488583168L) {
                                shape2 = shapeO;
                                j3 = jN;
                                modifierZmq = modifier2;
                            } else {
                                final Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                                shape2 = shapeO;
                                final Configuration configuration = (Configuration) composerKN.ty(AndroidCompositionLocals_androidKt.J2());
                                Modifier.Companion companion = Modifier.INSTANCE;
                                boolean zP5 = composerKN.p5(density) | composerKN.E2(configuration) | composerKN.nr(jN2) | ((((i12 & 57344) ^ 24576) > 16384 && composerKN.nr(jN)) || (i12 & 24576) == 16384);
                                Object objIF = composerKN.iF();
                                if (zP5 || objIF == Composer.INSTANCE.n()) {
                                    final long j5 = jN;
                                    objIF = new Function2<CacheDrawScope, LayoutCoordinates, DrawResult>() { // from class: androidx.compose.material3.Tooltip_androidKt$RichTooltip$drawCaretModifier$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                        public final DrawResult invoke(CacheDrawScope cacheDrawScope, LayoutCoordinates layoutCoordinates) {
                                            return Tooltip_androidKt.nr(cacheDrawScope, CaretType.Rich, density, configuration, jN2, j5, layoutCoordinates);
                                        }
                                    };
                                    j3 = j5;
                                    composerKN.o(objIF);
                                } else {
                                    j3 = jN;
                                }
                                modifierZmq = tooltipScope.n(companion, (Function2) objIF).Zmq(modifier2);
                            }
                            composerKN.Xw();
                            int i18 = i12 >> 9;
                            Shape shape4 = shape2;
                            SurfaceKt.n(SizeKt.aYN(modifierZmq, TooltipKt.qie(), TooltipKt.gh(), TooltipKt.xMQ(), 0.0f, 8, null), shape4, richTooltipColorsUo.getContainerColor(), 0L, f5, fNr, null, ComposableLambdaKt.nr(317290958, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$RichTooltip$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i19) {
                                    if ((i19 & 3) == 2 && composer3.xMQ()) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(317290958, i19, -1, "androidx.compose.material3.RichTooltip.<anonymous> (Tooltip.android.kt:179)");
                                    }
                                    RichTooltipTokens richTooltipTokens = RichTooltipTokens.f29849n;
                                    TextStyle textStyleT = TypographyKt.t(richTooltipTokens.rl(), composer3, 6);
                                    TextStyle textStyleT2 = TypographyKt.t(richTooltipTokens.Uo(), composer3, 6);
                                    TextStyle textStyleT3 = TypographyKt.t(richTooltipTokens.xMQ(), composer3, 6);
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    Modifier modifierGh = PaddingKt.gh(companion2, TooltipKt.KN(), 0.0f, 2, null);
                                    Function2 function28 = function24;
                                    Function2 function29 = function25;
                                    RichTooltipColors richTooltipColors3 = richTooltipColorsUo;
                                    Function2 function210 = function23;
                                    Arrangement.Vertical verticalUo = Arrangement.f17400n.Uo();
                                    Alignment.Companion companion3 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion3.gh(), composer3, 0);
                                    int iN = ComposablesKt.n(composer3, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer3, modifierGh);
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0 function0N = companion4.n();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.t();
                                    }
                                    composer3.T();
                                    if (composer3.getInserting()) {
                                        composer3.s7N(function0N);
                                    } else {
                                        composer3.r();
                                    }
                                    Composer composerN = Updater.n(composer3);
                                    Updater.O(composerN, measurePolicyN, companion4.t());
                                    Updater.O(composerN, compositionLocalMapIk, companion4.O());
                                    Function2 function2Rl = companion4.rl();
                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                        composerN.o(Integer.valueOf(iN));
                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                    }
                                    Updater.O(composerN, modifierO, companion4.nr());
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                                    composer3.eF(955016030);
                                    if (function28 != null) {
                                        Modifier modifierKN = AlignmentLineKt.KN(companion2, TooltipKt.O(), 0.0f, 2, null);
                                        MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), false);
                                        int iN2 = ComposablesKt.n(composer3, 0);
                                        CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                                        Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierKN);
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
                                        CompositionLocalKt.t(new ProvidedValue[]{ContentColorKt.n().nr(Color.xMQ(richTooltipColors3.getTitleContentColor())), TextKt.J2().nr(textStyleT2)}, function28, composer3, ProvidedValue.xMQ);
                                        composer3.XQ();
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    composer3.Xw();
                                    Modifier modifierAz = TooltipKt.az(companion2, function28 != null, function29 != null);
                                    MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion3.HI(), false);
                                    int iN3 = ComposablesKt.n(composer3, 0);
                                    CompositionLocalMap compositionLocalMapIk3 = composer3.Ik();
                                    Modifier modifierO3 = ComposedModifierKt.O(composer3, modifierAz);
                                    Function0 function0N3 = companion4.n();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.t();
                                    }
                                    composer3.T();
                                    if (composer3.getInserting()) {
                                        composer3.s7N(function0N3);
                                    } else {
                                        composer3.r();
                                    }
                                    Composer composerN3 = Updater.n(composer3);
                                    Updater.O(composerN3, measurePolicyUo2, companion4.t());
                                    Updater.O(composerN3, compositionLocalMapIk3, companion4.O());
                                    Function2 function2Rl3 = companion4.rl();
                                    if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                                        composerN3.o(Integer.valueOf(iN3));
                                        composerN3.az(Integer.valueOf(iN3), function2Rl3);
                                    }
                                    Updater.O(composerN3, modifierO3, companion4.nr());
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                                    ProvidedValue[] providedValueArr = {ContentColorKt.n().nr(Color.xMQ(richTooltipColors3.getContentColor())), TextKt.J2().nr(textStyleT3)};
                                    int i20 = ProvidedValue.xMQ;
                                    CompositionLocalKt.t(providedValueArr, function210, composer3, i20);
                                    composer3.XQ();
                                    composer3.eF(955039618);
                                    if (function29 != null) {
                                        Modifier modifierAz2 = PaddingKt.az(SizeKt.ty(companion2, TooltipKt.nr(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, TooltipKt.t(), 7, null);
                                        MeasurePolicy measurePolicyUo3 = BoxKt.Uo(companion3.HI(), false);
                                        int iN4 = ComposablesKt.n(composer3, 0);
                                        CompositionLocalMap compositionLocalMapIk4 = composer3.Ik();
                                        Modifier modifierO4 = ComposedModifierKt.O(composer3, modifierAz2);
                                        Function0 function0N4 = companion4.n();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.t();
                                        }
                                        composer3.T();
                                        if (composer3.getInserting()) {
                                            composer3.s7N(function0N4);
                                        } else {
                                            composer3.r();
                                        }
                                        Composer composerN4 = Updater.n(composer3);
                                        Updater.O(composerN4, measurePolicyUo3, companion4.t());
                                        Updater.O(composerN4, compositionLocalMapIk4, companion4.O());
                                        Function2 function2Rl4 = companion4.rl();
                                        if (composerN4.getInserting() || !Intrinsics.areEqual(composerN4.iF(), Integer.valueOf(iN4))) {
                                            composerN4.o(Integer.valueOf(iN4));
                                            composerN4.az(Integer.valueOf(iN4), function2Rl4);
                                        }
                                        Updater.O(composerN4, modifierO4, companion4.nr());
                                        CompositionLocalKt.t(new ProvidedValue[]{ContentColorKt.n().nr(Color.xMQ(richTooltipColors3.getActionContentColor())), TextKt.J2().nr(textStyleT)}, function29, composer3, i20);
                                        composer3.XQ();
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                    composer3.Xw();
                                    composer3.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, ((i12 >> 12) & 112) | 12582912 | (57344 & i18) | (i18 & 458752), 72);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            richTooltipColors2 = richTooltipColorsUo;
                            modifier3 = modifier2;
                            composer2 = composerKN;
                            function26 = function24;
                            function27 = function25;
                            shape3 = shape4;
                            f6 = f5;
                            f7 = fNr;
                            j4 = j3;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$RichTooltip$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i19) {
                                    Tooltip_androidKt.rl(tooltipScope, modifier3, function26, function27, j4, shape3, richTooltipColors2, f6, f7, function23, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 100663296;
                    i11 = i10;
                    if ((i3 & 256) != 0) {
                    }
                    int i152 = i5;
                    if ((306783379 & i5) == 306783378) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if ((i3 & 8) != 0) {
                            }
                            if ((i3 & 16) != 0) {
                            }
                            if ((i3 & 32) == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            final long jN22 = ColorSchemeKt.n(MaterialTheme.f26164n.n(composerKN, 6), richTooltipColorsUo.getContainerColor(), Dp.KN(((Dp) composerKN.ty(SurfaceKt.Uo())).getValue() + f5), composerKN, 0);
                            composerKN.eF(1472746423);
                            if (jN == 9205357640488583168L) {
                            }
                            composerKN.Xw();
                            int i182 = i12 >> 9;
                            Shape shape42 = shape2;
                            SurfaceKt.n(SizeKt.aYN(modifierZmq, TooltipKt.qie(), TooltipKt.gh(), TooltipKt.xMQ(), 0.0f, 8, null), shape42, richTooltipColorsUo.getContainerColor(), 0L, f5, fNr, null, ComposableLambdaKt.nr(317290958, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$RichTooltip$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i19) {
                                    if ((i19 & 3) == 2 && composer3.xMQ()) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(317290958, i19, -1, "androidx.compose.material3.RichTooltip.<anonymous> (Tooltip.android.kt:179)");
                                    }
                                    RichTooltipTokens richTooltipTokens = RichTooltipTokens.f29849n;
                                    TextStyle textStyleT = TypographyKt.t(richTooltipTokens.rl(), composer3, 6);
                                    TextStyle textStyleT2 = TypographyKt.t(richTooltipTokens.Uo(), composer3, 6);
                                    TextStyle textStyleT3 = TypographyKt.t(richTooltipTokens.xMQ(), composer3, 6);
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    Modifier modifierGh = PaddingKt.gh(companion2, TooltipKt.KN(), 0.0f, 2, null);
                                    Function2 function28 = function24;
                                    Function2 function29 = function25;
                                    RichTooltipColors richTooltipColors3 = richTooltipColorsUo;
                                    Function2 function210 = function23;
                                    Arrangement.Vertical verticalUo = Arrangement.f17400n.Uo();
                                    Alignment.Companion companion3 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion3.gh(), composer3, 0);
                                    int iN = ComposablesKt.n(composer3, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer3, modifierGh);
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0 function0N = companion4.n();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.t();
                                    }
                                    composer3.T();
                                    if (composer3.getInserting()) {
                                        composer3.s7N(function0N);
                                    } else {
                                        composer3.r();
                                    }
                                    Composer composerN = Updater.n(composer3);
                                    Updater.O(composerN, measurePolicyN, companion4.t());
                                    Updater.O(composerN, compositionLocalMapIk, companion4.O());
                                    Function2 function2Rl = companion4.rl();
                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                        composerN.o(Integer.valueOf(iN));
                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                    }
                                    Updater.O(composerN, modifierO, companion4.nr());
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                                    composer3.eF(955016030);
                                    if (function28 != null) {
                                        Modifier modifierKN = AlignmentLineKt.KN(companion2, TooltipKt.O(), 0.0f, 2, null);
                                        MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), false);
                                        int iN2 = ComposablesKt.n(composer3, 0);
                                        CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                                        Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierKN);
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
                                        CompositionLocalKt.t(new ProvidedValue[]{ContentColorKt.n().nr(Color.xMQ(richTooltipColors3.getTitleContentColor())), TextKt.J2().nr(textStyleT2)}, function28, composer3, ProvidedValue.xMQ);
                                        composer3.XQ();
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    composer3.Xw();
                                    Modifier modifierAz = TooltipKt.az(companion2, function28 != null, function29 != null);
                                    MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion3.HI(), false);
                                    int iN3 = ComposablesKt.n(composer3, 0);
                                    CompositionLocalMap compositionLocalMapIk3 = composer3.Ik();
                                    Modifier modifierO3 = ComposedModifierKt.O(composer3, modifierAz);
                                    Function0 function0N3 = companion4.n();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.t();
                                    }
                                    composer3.T();
                                    if (composer3.getInserting()) {
                                        composer3.s7N(function0N3);
                                    } else {
                                        composer3.r();
                                    }
                                    Composer composerN3 = Updater.n(composer3);
                                    Updater.O(composerN3, measurePolicyUo2, companion4.t());
                                    Updater.O(composerN3, compositionLocalMapIk3, companion4.O());
                                    Function2 function2Rl3 = companion4.rl();
                                    if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                                        composerN3.o(Integer.valueOf(iN3));
                                        composerN3.az(Integer.valueOf(iN3), function2Rl3);
                                    }
                                    Updater.O(composerN3, modifierO3, companion4.nr());
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                                    ProvidedValue[] providedValueArr = {ContentColorKt.n().nr(Color.xMQ(richTooltipColors3.getContentColor())), TextKt.J2().nr(textStyleT3)};
                                    int i20 = ProvidedValue.xMQ;
                                    CompositionLocalKt.t(providedValueArr, function210, composer3, i20);
                                    composer3.XQ();
                                    composer3.eF(955039618);
                                    if (function29 != null) {
                                        Modifier modifierAz2 = PaddingKt.az(SizeKt.ty(companion2, TooltipKt.nr(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, TooltipKt.t(), 7, null);
                                        MeasurePolicy measurePolicyUo3 = BoxKt.Uo(companion3.HI(), false);
                                        int iN4 = ComposablesKt.n(composer3, 0);
                                        CompositionLocalMap compositionLocalMapIk4 = composer3.Ik();
                                        Modifier modifierO4 = ComposedModifierKt.O(composer3, modifierAz2);
                                        Function0 function0N4 = companion4.n();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.t();
                                        }
                                        composer3.T();
                                        if (composer3.getInserting()) {
                                            composer3.s7N(function0N4);
                                        } else {
                                            composer3.r();
                                        }
                                        Composer composerN4 = Updater.n(composer3);
                                        Updater.O(composerN4, measurePolicyUo3, companion4.t());
                                        Updater.O(composerN4, compositionLocalMapIk4, companion4.O());
                                        Function2 function2Rl4 = companion4.rl();
                                        if (composerN4.getInserting() || !Intrinsics.areEqual(composerN4.iF(), Integer.valueOf(iN4))) {
                                            composerN4.o(Integer.valueOf(iN4));
                                            composerN4.az(Integer.valueOf(iN4), function2Rl4);
                                        }
                                        Updater.O(composerN4, modifierO4, companion4.nr());
                                        CompositionLocalKt.t(new ProvidedValue[]{ContentColorKt.n().nr(Color.xMQ(richTooltipColors3.getActionContentColor())), TextKt.J2().nr(textStyleT)}, function29, composer3, i20);
                                        composer3.XQ();
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                    composer3.Xw();
                                    composer3.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, ((i12 >> 12) & 112) | 12582912 | (57344 & i182) | (i182 & 458752), 72);
                            if (ComposerKt.v()) {
                            }
                            richTooltipColors2 = richTooltipColorsUo;
                            modifier3 = modifier2;
                            composer2 = composerKN;
                            function26 = function24;
                            function27 = function25;
                            shape3 = shape42;
                            f6 = f5;
                            f7 = fNr;
                            j4 = j3;
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function25 = function22;
                if ((i2 & 24576) != 0) {
                }
                if ((196608 & i2) != 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                }
                i11 = i10;
                if ((i3 & 256) != 0) {
                }
                int i1522 = i5;
                if ((306783379 & i5) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            function24 = function2;
            i8 = i3 & 4;
            if (i8 != 0) {
            }
            function25 = function22;
            if ((i2 & 24576) != 0) {
            }
            if ((196608 & i2) != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            i11 = i10;
            if ((i3 & 256) != 0) {
            }
            int i15222 = i5;
            if ((306783379 & i5) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 2;
        if (i7 == 0) {
        }
        function24 = function2;
        i8 = i3 & 4;
        if (i8 != 0) {
        }
        function25 = function22;
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        i11 = i10;
        if ((i3 & 256) != 0) {
        }
        int i152222 = i5;
        if ((306783379 & i5) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }
}
