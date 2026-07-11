package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aß\u0001\u0010\u0016\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/runtime/Composable;", "confirmButton", "Landroidx/compose/ui/Modifier;", "modifier", "dismissButton", "icon", "title", "text", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "iconContentColor", "titleContentColor", "textContentColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "Landroidx/compose/ui/window/DialogProperties;", "properties", c.f62177j, "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJJJFLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;III)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidAlertDialog_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final Function0 function0, final Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Shape shape, long j2, long j3, long j4, long j5, float f3, DialogProperties dialogProperties, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        int i8;
        Modifier modifier2;
        int i9;
        int i10;
        Function2 function26;
        int i11;
        Function2 function27;
        int i12;
        Function2 function28;
        Shape shapeT;
        int i13;
        long j6;
        int i14;
        int i15;
        int i16;
        long jN;
        long jRl;
        long jO;
        long jNr;
        DialogProperties dialogProperties2;
        float f4;
        Function2 function29;
        Function2 function210;
        Shape shape2;
        Modifier modifier3;
        int i17;
        Function2 function211;
        Function2 function212;
        long j7;
        long j9;
        int i18;
        int i19;
        long j10;
        long j11;
        Composer composer2;
        final Modifier modifier4;
        final Function2 function213;
        final Function2 function214;
        final Function2 function215;
        final Function2 function216;
        final Shape shape3;
        final long j12;
        final long j13;
        final long j14;
        final long j15;
        final float f5;
        final DialogProperties dialogProperties3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-2081346864);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.E2(function0) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i7 |= composerKN.E2(function2) ? 32 : 16;
            }
            i8 = i5 & 4;
            if (i8 == 0) {
                i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    modifier2 = modifier;
                    i7 |= composerKN.p5(modifier2) ? 256 : 128;
                }
                i9 = i5 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        i7 |= composerKN.E2(function22) ? 2048 : 1024;
                    }
                    i10 = i5 & 16;
                    if (i10 == 0) {
                        i7 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            function26 = function23;
                            i7 |= composerKN.E2(function26) ? 16384 : 8192;
                        }
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i7 |= 196608;
                            function27 = function24;
                        } else {
                            function27 = function24;
                            if ((i2 & 196608) == 0) {
                                i7 |= composerKN.E2(function27) ? 131072 : 65536;
                            }
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i7 |= 1572864;
                            function28 = function25;
                        } else {
                            function28 = function25;
                            if ((i2 & 1572864) == 0) {
                                i7 |= composerKN.E2(function28) ? 1048576 : 524288;
                            }
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i5 & 128) == 0) {
                                shapeT = shape;
                                int i20 = composerKN.p5(shapeT) ? 8388608 : 4194304;
                                i7 |= i20;
                            } else {
                                shapeT = shape;
                            }
                            i7 |= i20;
                        } else {
                            shapeT = shape;
                        }
                        if ((i2 & 100663296) == 0) {
                            i7 |= ((i5 & 256) == 0 && composerKN.nr(j2)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        if ((805306368 & i2) == 0) {
                            i7 |= ((i5 & 512) == 0 && composerKN.nr(j3)) ? 536870912 : 268435456;
                        }
                        if ((i3 & 6) == 0) {
                            i13 = i3 | (((i5 & 1024) == 0 && composerKN.nr(j4)) ? 4 : 2);
                        } else {
                            i13 = i3;
                        }
                        if ((i3 & 48) == 0) {
                            j6 = j5;
                            i13 |= ((i5 & 2048) == 0 && composerKN.nr(j6)) ? 32 : 16;
                        } else {
                            j6 = j5;
                        }
                        i14 = i5 & 4096;
                        if (i14 != 0) {
                            i13 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                        } else {
                            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                i13 |= composerKN.rl(f3) ? 256 : 128;
                            }
                            i15 = i5 & 8192;
                            if (i15 != 0) {
                                i16 = i15;
                                if ((i3 & 3072) == 0) {
                                    i13 |= composerKN.p5(dialogProperties) ? 2048 : 1024;
                                }
                                if ((i7 & 306783379) == 306783378 && (i13 & 1171) == 1170 && composerKN.xMQ()) {
                                    composerKN.wTp();
                                    f5 = f3;
                                    dialogProperties3 = dialogProperties;
                                    composer2 = composerKN;
                                    shape3 = shapeT;
                                    modifier4 = modifier2;
                                    function213 = function22;
                                    j14 = j4;
                                    j15 = j6;
                                    function214 = function26;
                                    function215 = function27;
                                    function216 = function28;
                                    j12 = j2;
                                    j13 = j3;
                                } else {
                                    composerKN.e();
                                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                                        if (i8 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        Function2 function217 = i9 == 0 ? null : function22;
                                        if (i10 != 0) {
                                            function26 = null;
                                        }
                                        if (i11 != 0) {
                                            function27 = null;
                                        }
                                        if (i12 != 0) {
                                            function28 = null;
                                        }
                                        if ((i5 & 128) != 0) {
                                            i7 &= -29360129;
                                            shapeT = AlertDialogDefaults.f24075n.t(composerKN, 6);
                                        }
                                        if ((i5 & 256) == 0) {
                                            jN = AlertDialogDefaults.f24075n.n(composerKN, 6);
                                            i7 &= -234881025;
                                        } else {
                                            jN = j2;
                                        }
                                        if ((i5 & 512) == 0) {
                                            jRl = AlertDialogDefaults.f24075n.rl(composerKN, 6);
                                            i7 = (-1879048193) & i7;
                                        } else {
                                            jRl = j3;
                                        }
                                        if ((i5 & 1024) == 0) {
                                            jO = AlertDialogDefaults.f24075n.O(composerKN, 6);
                                            i13 &= -15;
                                        } else {
                                            jO = j4;
                                        }
                                        if ((i5 & 2048) == 0) {
                                            jNr = AlertDialogDefaults.f24075n.nr(composerKN, 6);
                                            i13 &= -113;
                                        } else {
                                            jNr = j6;
                                        }
                                        float fJ2 = i14 == 0 ? AlertDialogDefaults.f24075n.J2() : f3;
                                        if (i16 == 0) {
                                            f4 = fJ2;
                                            dialogProperties2 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                                        } else {
                                            dialogProperties2 = dialogProperties;
                                            f4 = fJ2;
                                        }
                                        function29 = function27;
                                        function210 = function28;
                                        shape2 = shapeT;
                                        modifier3 = modifier2;
                                        i17 = -2081346864;
                                        int i21 = i7;
                                        function211 = function26;
                                        function212 = function217;
                                        j7 = jN;
                                        j9 = jO;
                                        long j16 = jNr;
                                        i18 = i21;
                                        i19 = i13;
                                        j10 = jRl;
                                        j11 = j16;
                                    } else {
                                        composerKN.wTp();
                                        if ((i5 & 128) != 0) {
                                            i7 &= -29360129;
                                        }
                                        if ((i5 & 256) != 0) {
                                            i7 &= -234881025;
                                        }
                                        if ((i5 & 512) != 0) {
                                            i7 &= -1879048193;
                                        }
                                        if ((i5 & 1024) != 0) {
                                            i13 &= -15;
                                        }
                                        if ((i5 & 2048) != 0) {
                                            i13 &= -113;
                                        }
                                        j9 = j4;
                                        f4 = f3;
                                        dialogProperties2 = dialogProperties;
                                        j11 = j6;
                                        i18 = i7;
                                        function29 = function27;
                                        function210 = function28;
                                        shape2 = shapeT;
                                        i19 = i13;
                                        modifier3 = modifier2;
                                        i17 = -2081346864;
                                        j7 = j2;
                                        j10 = j3;
                                        function211 = function26;
                                        function212 = function22;
                                    }
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(i17, i18, i19, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:46)");
                                    }
                                    composer2 = composerKN;
                                    AlertDialogKt.nr(function0, function2, modifier3, function212, function211, function29, function210, shape2, j7, j10, j9, j11, f4, dialogProperties2, composer2, i18 & 2147483646, i19 & 8190);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    modifier4 = modifier3;
                                    function213 = function212;
                                    function214 = function211;
                                    function215 = function29;
                                    function216 = function210;
                                    shape3 = shape2;
                                    j12 = j7;
                                    j13 = j10;
                                    j14 = j9;
                                    j15 = j11;
                                    f5 = f4;
                                    dialogProperties3 = dialogProperties2;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i22) {
                                            AndroidAlertDialog_androidKt.n(function0, function2, modifier4, function213, function214, function215, function216, shape3, j12, j13, j14, j15, f5, dialogProperties3, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i13 |= 3072;
                            i16 = i15;
                            if ((i7 & 306783379) == 306783378) {
                                composerKN.e();
                                if ((i2 & 1) != 0) {
                                    if (i8 != 0) {
                                    }
                                    if (i9 == 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if (i11 != 0) {
                                    }
                                    if (i12 != 0) {
                                    }
                                    if ((i5 & 128) != 0) {
                                    }
                                    if ((i5 & 256) == 0) {
                                    }
                                    if ((i5 & 512) == 0) {
                                    }
                                    if ((i5 & 1024) == 0) {
                                    }
                                    if ((i5 & 2048) == 0) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    function29 = function27;
                                    function210 = function28;
                                    shape2 = shapeT;
                                    modifier3 = modifier2;
                                    i17 = -2081346864;
                                    int i212 = i7;
                                    function211 = function26;
                                    function212 = function217;
                                    j7 = jN;
                                    j9 = jO;
                                    long j162 = jNr;
                                    i18 = i212;
                                    i19 = i13;
                                    j10 = jRl;
                                    j11 = j162;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                    }
                                    composer2 = composerKN;
                                    AlertDialogKt.nr(function0, function2, modifier3, function212, function211, function29, function210, shape2, j7, j10, j9, j11, f4, dialogProperties2, composer2, i18 & 2147483646, i19 & 8190);
                                    if (ComposerKt.v()) {
                                    }
                                    modifier4 = modifier3;
                                    function213 = function212;
                                    function214 = function211;
                                    function215 = function29;
                                    function216 = function210;
                                    shape3 = shape2;
                                    j12 = j7;
                                    j13 = j10;
                                    j14 = j9;
                                    j15 = j11;
                                    f5 = f4;
                                    dialogProperties3 = dialogProperties2;
                                }
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i15 = i5 & 8192;
                        if (i15 != 0) {
                        }
                        if ((i7 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    function26 = function23;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    if ((i2 & 100663296) == 0) {
                    }
                    if ((805306368 & i2) == 0) {
                    }
                    if ((i3 & 6) == 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    i14 = i5 & 4096;
                    if (i14 != 0) {
                    }
                    i15 = i5 & 8192;
                    if (i15 != 0) {
                    }
                    if ((i7 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i10 = i5 & 16;
                if (i10 == 0) {
                }
                function26 = function23;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if ((805306368 & i2) == 0) {
                }
                if ((i3 & 6) == 0) {
                }
                if ((i3 & 48) == 0) {
                }
                i14 = i5 & 4096;
                if (i14 != 0) {
                }
                i15 = i5 & 8192;
                if (i15 != 0) {
                }
                if ((i7 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            modifier2 = modifier;
            i9 = i5 & 8;
            if (i9 != 0) {
            }
            i10 = i5 & 16;
            if (i10 == 0) {
            }
            function26 = function23;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if ((805306368 & i2) == 0) {
            }
            if ((i3 & 6) == 0) {
            }
            if ((i3 & 48) == 0) {
            }
            i14 = i5 & 4096;
            if (i14 != 0) {
            }
            i15 = i5 & 8192;
            if (i15 != 0) {
            }
            if ((i7 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        i8 = i5 & 4;
        if (i8 == 0) {
        }
        modifier2 = modifier;
        i9 = i5 & 8;
        if (i9 != 0) {
        }
        i10 = i5 & 16;
        if (i10 == 0) {
        }
        function26 = function23;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((805306368 & i2) == 0) {
        }
        if ((i3 & 6) == 0) {
        }
        if ((i3 & 48) == 0) {
        }
        i14 = i5 & 4096;
        if (i14 != 0) {
        }
        i15 = i5 & 8192;
        if (i15 != 0) {
        }
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }
}
