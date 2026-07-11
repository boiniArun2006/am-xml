package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aª\u0001\u0010\u0011\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0093\u0001\u0010\u0014\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/runtime/Composable;", "confirmButton", "Landroidx/compose/ui/Modifier;", "modifier", "dismissButton", "title", "text", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "Landroidx/compose/ui/window/DialogProperties;", "properties", c.f62177j, "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "buttons", "rl", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidAlertDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAlertDialog.android.kt\nandroidx/compose/material/AndroidAlertDialog_androidKt\n+ 2 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt\n*L\n1#1,78:1\n150#2,19:79\n183#2,11:98\n*S KotlinDebug\n*F\n+ 1 AndroidAlertDialog.android.kt\nandroidx/compose/material/AndroidAlertDialog_androidKt\n*L\n42#1:79,19\n67#1:98,11\n*E\n"})
public final class AndroidAlertDialog_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final Function0 function0, final Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Function2 function24, Shape shape, long j2, long j3, DialogProperties dialogProperties, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Modifier modifier2;
        int i7;
        final Function2 function25;
        int i8;
        Function2 function26;
        int i9;
        Function2 function27;
        Shape medium;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer composer2;
        final Modifier modifier3;
        final Function2 function28;
        final Function2 function29;
        final Function2 function210;
        final Shape shape2;
        final long j4;
        final long j5;
        final DialogProperties dialogProperties2;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i15;
        long jTy;
        long jRl;
        DialogProperties dialogProperties3;
        long j6;
        Function2 function211;
        int i16;
        long j7;
        Modifier modifier4;
        Function2 function212;
        Shape shape3;
        int i17;
        Composer composerKN = composer.KN(-606536823);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function02) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(function2) ? 32 : 16;
        }
        int i18 = i3 & 4;
        if (i18 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    function25 = function22;
                    i5 |= composerKN.E2(function25) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        function26 = function23;
                        i5 |= composerKN.E2(function26) ? 16384 : 8192;
                    }
                    i9 = i3 & 32;
                    if (i9 == 0) {
                        i5 |= 196608;
                    } else {
                        if ((196608 & i2) == 0) {
                            function27 = function24;
                            i5 |= composerKN.E2(function27) ? 131072 : 65536;
                        }
                        if ((1572864 & i2) == 0) {
                            if ((i3 & 64) == 0) {
                                medium = shape;
                                int i19 = composerKN.p5(medium) ? 1048576 : 524288;
                                i5 |= i19;
                            } else {
                                medium = shape;
                            }
                            i5 |= i19;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i3 & 128) == 0) {
                                i17 = i5;
                                i11 = i18;
                                int i20 = composerKN.nr(j2) ? 8388608 : 4194304;
                                i10 = i17 | i20;
                            } else {
                                i17 = i5;
                                i11 = i18;
                            }
                            i10 = i17 | i20;
                        } else {
                            i10 = i5;
                            i11 = i18;
                        }
                        if ((i2 & 100663296) == 0) {
                            i10 |= ((i3 & 256) == 0 && composerKN.nr(j3)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i12 = i10;
                        i13 = i3 & 512;
                        if (i13 == 0) {
                            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i14 = i13;
                                i12 |= composerKN.p5(dialogProperties) ? 536870912 : 268435456;
                            }
                            if (composerKN.HI((i12 & 306783379) == 306783378, i12 & 1)) {
                                composer2 = composerKN;
                                composer2.wTp();
                                modifier3 = modifier2;
                                function28 = function25;
                                function29 = function26;
                                function210 = function27;
                                shape2 = medium;
                                j4 = j2;
                                j5 = j3;
                                dialogProperties2 = dialogProperties;
                            } else {
                                composerKN.e();
                                if ((i2 & 1) == 0 || composerKN.rV9()) {
                                    if (i11 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i7 != 0) {
                                        function25 = null;
                                    }
                                    if (i8 != 0) {
                                        function26 = null;
                                    }
                                    if (i9 != 0) {
                                        function27 = null;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i12 &= -3670017;
                                        medium = MaterialTheme.f22169n.rl(composerKN, 6).getMedium();
                                    }
                                    if ((i3 & 128) != 0) {
                                        i12 &= -29360129;
                                        i15 = -234881025;
                                        jTy = MaterialTheme.f22169n.n(composerKN, 6).ty();
                                    } else {
                                        i15 = -234881025;
                                        jTy = j2;
                                    }
                                    if ((i3 & 256) != 0) {
                                        jRl = ColorsKt.rl(jTy, composerKN, (i12 >> 21) & 14);
                                        i12 &= i15;
                                    } else {
                                        jRl = j3;
                                    }
                                    dialogProperties3 = i14 != 0 ? new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null) : dialogProperties;
                                    j6 = jTy;
                                    function211 = function26;
                                    i16 = i12;
                                    j7 = jRl;
                                    modifier4 = modifier2;
                                    function212 = function27;
                                    shape3 = medium;
                                } else {
                                    composerKN.wTp();
                                    if ((i3 & 64) != 0) {
                                        i12 &= -3670017;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i12 &= -29360129;
                                    }
                                    if ((i3 & 256) != 0) {
                                        i12 &= -234881025;
                                    }
                                    j6 = j2;
                                    j7 = j3;
                                    dialogProperties3 = dialogProperties;
                                    function211 = function26;
                                    function212 = function27;
                                    shape3 = medium;
                                    i16 = i12;
                                    modifier4 = modifier2;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-606536823, i16, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:41)");
                                }
                                int i21 = (2147483646 & i16) >> 3;
                                composer2 = composerKN;
                                rl(function02, ComposableLambdaKt.nr(1167440211, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1
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
                                        if (!composer3.HI((i22 & 3) != 2, i22 & 1)) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(1167440211, i22, -1, "androidx.compose.material.AlertDialogImpl.<anonymous> (AlertDialog.kt:153)");
                                        }
                                        float f3 = 8;
                                        Modifier modifierMUb = PaddingKt.mUb(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), Dp.KN(f3), Dp.KN(2));
                                        final Function2 function213 = function25;
                                        final Function2 function214 = function2;
                                        MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                        int iN = ComposablesKt.n(composer3, 0);
                                        CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                        Modifier modifierO = ComposedModifierKt.O(composer3, modifierMUb);
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0 function0N = companion.n();
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
                                        Updater.O(composerN, measurePolicyUo, companion.t());
                                        Updater.O(composerN, compositionLocalMapIk, companion.O());
                                        Function2 function2Rl = companion.rl();
                                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                            composerN.o(Integer.valueOf(iN));
                                            composerN.az(Integer.valueOf(iN), function2Rl);
                                        }
                                        Updater.O(composerN, modifierO, companion.nr());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                        AlertDialogKt.t(Dp.KN(f3), Dp.KN(12), ComposableLambdaKt.nr(-563890224, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                n(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer4, int i23) {
                                                if (!composer4.HI((i23 & 3) != 2, i23 & 1)) {
                                                    composer4.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-563890224, i23, -1, "androidx.compose.material.AlertDialogImpl.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:155)");
                                                }
                                                Function2 function215 = function213;
                                                if (function215 == null) {
                                                    composer4.eF(-1324738946);
                                                } else {
                                                    composer4.eF(1481287139);
                                                    function215.invoke(composer4, 0);
                                                }
                                                composer4.Xw();
                                                function214.invoke(composer4, 0);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer3, 54), composer3, 438);
                                        composer3.XQ();
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), modifier4, function211, function212, shape3, j6, j7, dialogProperties3, composer2, (i16 & 896) | (i16 & 14) | 48 | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | (29360128 & i21) | (i21 & 234881024), 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                function28 = function25;
                                modifier3 = modifier4;
                                function29 = function211;
                                function210 = function212;
                                shape2 = shape3;
                                j4 = j6;
                                j5 = j7;
                                dialogProperties2 = dialogProperties3;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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
                                        AndroidAlertDialog_androidKt.n(function0, function2, modifier3, function28, function29, function210, shape2, j4, j5, dialogProperties2, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i12 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        i14 = i13;
                        if (composerKN.HI((i12 & 306783379) == 306783378, i12 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    function27 = function24;
                    if ((1572864 & i2) == 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    if ((i2 & 100663296) == 0) {
                    }
                    i12 = i10;
                    i13 = i3 & 512;
                    if (i13 == 0) {
                    }
                    i14 = i13;
                    if (composerKN.HI((i12 & 306783379) == 306783378, i12 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                function26 = function23;
                i9 = i3 & 32;
                if (i9 == 0) {
                }
                function27 = function24;
                if ((1572864 & i2) == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                i12 = i10;
                i13 = i3 & 512;
                if (i13 == 0) {
                }
                i14 = i13;
                if (composerKN.HI((i12 & 306783379) == 306783378, i12 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            function25 = function22;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            function26 = function23;
            i9 = i3 & 32;
            if (i9 == 0) {
            }
            function27 = function24;
            if ((1572864 & i2) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            i12 = i10;
            i13 = i3 & 512;
            if (i13 == 0) {
            }
            i14 = i13;
            if (composerKN.HI((i12 & 306783379) == 306783378, i12 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        function25 = function22;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        function26 = function23;
        i9 = i3 & 32;
        if (i9 == 0) {
        }
        function27 = function24;
        if ((1572864 & i2) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        i12 = i10;
        i13 = i3 & 512;
        if (i13 == 0) {
        }
        i14 = i13;
        if (composerKN.HI((i12 & 306783379) == 306783378, i12 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final Function0 function0, final Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Shape shape, long j2, long j3, DialogProperties dialogProperties, Composer composer, final int i2, final int i3) {
        int i5;
        Function2 function24;
        int i7;
        Modifier modifier2;
        int i8;
        Function2 function25;
        int i9;
        Function2 function26;
        Shape medium;
        long jTy;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer composer2;
        final Modifier modifier3;
        final Function2 function27;
        final Shape shape2;
        final long j4;
        final DialogProperties dialogProperties2;
        ScopeUpdateScope scopeUpdateScopeGh;
        long jRl;
        DialogProperties dialogProperties3;
        Composer composerKN = composer.KN(1035523925);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function0) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function24 = function2;
                i5 |= composerKN.E2(function24) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    modifier2 = modifier;
                    i5 |= composerKN.p5(modifier2) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        function25 = function22;
                        i5 |= composerKN.E2(function25) ? 2048 : 1024;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((i2 & 24576) == 0) {
                            function26 = function23;
                            i5 |= composerKN.E2(function26) ? 16384 : 8192;
                        }
                        if ((196608 & i2) == 0) {
                            if ((i3 & 32) == 0) {
                                medium = shape;
                                int i14 = composerKN.p5(medium) ? 131072 : 65536;
                                i5 |= i14;
                            } else {
                                medium = shape;
                            }
                            i5 |= i14;
                        } else {
                            medium = shape;
                        }
                        if ((1572864 & i2) == 0) {
                            if ((i3 & 64) == 0) {
                                jTy = j2;
                                int i15 = composerKN.nr(jTy) ? 1048576 : 524288;
                                i5 |= i15;
                            } else {
                                jTy = j2;
                            }
                            i5 |= i15;
                        } else {
                            jTy = j2;
                        }
                        if ((i2 & 12582912) == 0) {
                            i10 = i5 | (((i3 & 128) == 0 && composerKN.nr(j3)) ? 8388608 : 4194304);
                        } else {
                            i10 = i5;
                        }
                        int i16 = i10;
                        i11 = i3 & 256;
                        if (i11 != 0) {
                            i13 = i16 | 100663296;
                            i12 = i11;
                        } else if ((i2 & 100663296) == 0) {
                            i12 = i11;
                            i13 = i16 | (composerKN.p5(dialogProperties) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432);
                        } else {
                            i12 = i11;
                            i13 = i16;
                        }
                        if (composerKN.HI((i13 & 38347923) != 38347922, i13 & 1)) {
                            composerKN.e();
                            if ((i2 & 1) == 0 || composerKN.rV9()) {
                                if (i7 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i8 != 0) {
                                    function25 = null;
                                }
                                if (i9 != 0) {
                                    function26 = null;
                                }
                                if ((i3 & 32) != 0) {
                                    i13 &= -458753;
                                    medium = MaterialTheme.f22169n.rl(composerKN, 6).getMedium();
                                }
                                if ((i3 & 64) != 0) {
                                    jTy = MaterialTheme.f22169n.n(composerKN, 6).ty();
                                    i13 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    jRl = ColorsKt.rl(jTy, composerKN, (i13 >> 18) & 14);
                                    i13 &= -29360129;
                                } else {
                                    jRl = j3;
                                }
                                if (i12 != 0) {
                                    dialogProperties3 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                                }
                                int i17 = i13;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1035523925, i17, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:66)");
                                }
                                final Function2 function28 = function24;
                                final Modifier modifier4 = modifier2;
                                final Function2 function29 = function25;
                                final Function2 function210 = function26;
                                final Shape shape3 = medium;
                                final long j5 = jTy;
                                final long j6 = jRl;
                                DialogProperties dialogProperties4 = dialogProperties3;
                                AndroidDialog_androidKt.n(function0, dialogProperties4, ComposableLambdaKt.nr(-66632952, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i18) {
                                        if (!composer3.HI((i18 & 3) != 2, i18 & 1)) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-66632952, i18, -1, "androidx.compose.material.AlertDialogImpl.<anonymous> (AlertDialog.kt:183)");
                                        }
                                        AlertDialogKt.rl(function28, modifier4, function29, function210, shape3, j5, j6, composer3, 0, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composerKN, (i17 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (((268435454 & i17) >> 21) & 112), 0);
                                composer2 = composerKN;
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                modifier3 = modifier2;
                                function27 = function26;
                                shape2 = medium;
                                j4 = jRl;
                                dialogProperties2 = dialogProperties4;
                            } else {
                                composerKN.wTp();
                                if ((i3 & 32) != 0) {
                                    i13 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    i13 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    i13 &= -29360129;
                                }
                                jRl = j3;
                            }
                            dialogProperties3 = dialogProperties;
                            int i172 = i13;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            final Function2 function282 = function24;
                            final Modifier modifier42 = modifier2;
                            final Function2 function292 = function25;
                            final Function2 function2102 = function26;
                            final Shape shape32 = medium;
                            final long j52 = jTy;
                            final long j62 = jRl;
                            DialogProperties dialogProperties42 = dialogProperties3;
                            AndroidDialog_androidKt.n(function0, dialogProperties42, ComposableLambdaKt.nr(-66632952, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i18) {
                                    if (!composer3.HI((i18 & 3) != 2, i18 & 1)) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-66632952, i18, -1, "androidx.compose.material.AlertDialogImpl.<anonymous> (AlertDialog.kt:183)");
                                    }
                                    AlertDialogKt.rl(function282, modifier42, function292, function2102, shape32, j52, j62, composer3, 0, 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, (i172 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (((268435454 & i172) >> 21) & 112), 0);
                            composer2 = composerKN;
                            if (ComposerKt.v()) {
                            }
                            modifier3 = modifier2;
                            function27 = function26;
                            shape2 = medium;
                            j4 = jRl;
                            dialogProperties2 = dialogProperties42;
                        } else {
                            composer2 = composerKN;
                            composer2.wTp();
                            modifier3 = modifier2;
                            function27 = function26;
                            shape2 = medium;
                            j4 = j3;
                            dialogProperties2 = dialogProperties;
                        }
                        final Function2 function211 = function25;
                        final long j7 = jTy;
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i18) {
                                    AndroidAlertDialog_androidKt.rl(function0, function2, modifier3, function211, function27, shape2, j7, j4, dialogProperties2, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 24576;
                    function26 = function23;
                    if ((196608 & i2) == 0) {
                    }
                    if ((1572864 & i2) == 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    int i162 = i10;
                    i11 = i3 & 256;
                    if (i11 != 0) {
                    }
                    if (composerKN.HI((i13 & 38347923) != 38347922, i13 & 1)) {
                    }
                    final Function2 function2112 = function25;
                    final long j72 = jTy;
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function25 = function22;
                i9 = i3 & 16;
                if (i9 != 0) {
                }
                function26 = function23;
                if ((196608 & i2) == 0) {
                }
                if ((1572864 & i2) == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                int i1622 = i10;
                i11 = i3 & 256;
                if (i11 != 0) {
                }
                if (composerKN.HI((i13 & 38347923) != 38347922, i13 & 1)) {
                }
                final Function2 function21122 = function25;
                final long j722 = jTy;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            modifier2 = modifier;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            function25 = function22;
            i9 = i3 & 16;
            if (i9 != 0) {
            }
            function26 = function23;
            if ((196608 & i2) == 0) {
            }
            if ((1572864 & i2) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            int i16222 = i10;
            i11 = i3 & 256;
            if (i11 != 0) {
            }
            if (composerKN.HI((i13 & 38347923) != 38347922, i13 & 1)) {
            }
            final Function2 function211222 = function25;
            final long j7222 = jTy;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        function24 = function2;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        function25 = function22;
        i9 = i3 & 16;
        if (i9 != 0) {
        }
        function26 = function23;
        if ((196608 & i2) == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        int i162222 = i10;
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        if (composerKN.HI((i13 & 38347923) != 38347922, i13 & 1)) {
        }
        final Function2 function2112222 = function25;
        final long j72222 = jTy;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }
}
