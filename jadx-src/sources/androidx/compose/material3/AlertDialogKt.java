package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DialogTokens;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\u001aD\u0010\t\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001aD\u0010\u000b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\n\u001aÇ\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0013\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00072\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00072\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00072\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a¦\u0001\u0010\u001e\u001a\u00020\u00012\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00072\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00072\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a5\u0010\"\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00182\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0007H\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\"\u001a\u0010'\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&\"\u001a\u0010)\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b(\u0010&\"\u0014\u0010*\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010$\"\u0014\u0010+\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010$\"\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-\"\u0014\u00100\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-\"\u0014\u00102\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010-\"\u0014\u00104\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/window/DialogProperties;", "properties", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, "O", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", c.f62177j, "confirmButton", "dismissButton", "icon", "title", "text", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "iconContentColor", "titleContentColor", "textContentColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "nr", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJJJFLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "buttons", "buttonContentColor", "rl", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JFJJJJLandroidx/compose/runtime/Composer;III)V", "mainAxisSpacing", "crossAxisSpacing", "t", "(FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "F", "az", "()F", "DialogMinWidth", "qie", "DialogMaxWidth", "ButtonsMainAxisSpacing", "ButtonsCrossAxisSpacing", "Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/foundation/layout/PaddingValues;", "DialogPadding", "J2", "IconPadding", "Uo", "TitlePadding", "KN", "TextPadding", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,464:1\n1223#2,6:465\n78#3:471\n76#3,8:472\n85#3,4:489\n89#3,2:499\n93#3:504\n368#4,9:480\n377#4,3:501\n4032#5,6:493\n148#6:505\n148#6:506\n148#6:507\n148#6:508\n148#6:509\n148#6:510\n148#6:511\n148#6:512\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt\n*L\n366#1:465,6\n366#1:471\n366#1:472,8\n366#1:489,4\n366#1:499,2\n366#1:504\n366#1:480,9\n366#1:501,3\n366#1:493,6\n453#1:505\n454#1:506\n456#1:507\n457#1:508\n460#1:509\n461#1:510\n462#1:511\n463#1:512\n*E\n"})
public final class AlertDialogKt {
    private static final PaddingValues J2;
    private static final PaddingValues KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final PaddingValues f24076O;
    private static final PaddingValues Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f24077n = Dp.KN(280);
    private static final float rl = Dp.KN(560);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f24078t = Dp.KN(8);
    private static final float nr = Dp.KN(12);

    public static final void nr(final Function0 function0, final Function2 function2, final Modifier modifier, final Function2 function22, final Function2 function23, final Function2 function24, final Function2 function25, final Shape shape, final long j2, final long j3, final long j4, final long j5, final float f3, final DialogProperties dialogProperties, Composer composer, final int i2, final int i3) {
        int i5;
        Function2 function26;
        Function2 function27;
        Function2 function28;
        int i7;
        float f4;
        Composer composerKN = composer.KN(-919826268);
        if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function0) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            function26 = function2;
            i5 |= composerKN.E2(function26) ? 32 : 16;
        } else {
            function26 = function2;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(modifier) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            function27 = function22;
            i5 |= composerKN.E2(function27) ? 2048 : 1024;
        } else {
            function27 = function22;
        }
        if ((i2 & 24576) == 0) {
            function28 = function23;
            i5 |= composerKN.E2(function28) ? 16384 : 8192;
        } else {
            function28 = function23;
        }
        if ((i2 & 196608) == 0) {
            i5 |= composerKN.E2(function24) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= composerKN.E2(function25) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= composerKN.p5(shape) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= composerKN.nr(j2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            i5 |= composerKN.nr(j3) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i7 = i3 | (composerKN.nr(j4) ? 4 : 2);
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= composerKN.nr(j5) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            f4 = f3;
            i7 |= composerKN.rl(f4) ? 256 : 128;
        } else {
            f4 = f3;
        }
        if ((i3 & 3072) == 0) {
            i7 |= composerKN.p5(dialogProperties) ? 2048 : 1024;
        }
        int i8 = i7;
        if ((i5 & 306783379) == 306783378 && (i8 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-919826268, i5, i8, "androidx.compose.material3.AlertDialogImpl (AlertDialog.kt:247)");
            }
            final Function2 function29 = function26;
            final Function2 function210 = function27;
            final float f5 = f4;
            final Function2 function211 = function28;
            O(function0, modifier, dialogProperties, ComposableLambdaKt.nr(-1852840226, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i9) {
                    if ((i9 & 3) == 2 && composer2.xMQ()) {
                        composer2.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1852840226, i9, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous> (AlertDialog.kt:252)");
                    }
                    final Function2 function212 = function210;
                    final Function2 function213 = function29;
                    AlertDialogKt.rl(ComposableLambdaKt.nr(1163543932, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i10) {
                            if ((i10 & 3) == 2 && composer3.xMQ()) {
                                composer3.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1163543932, i10, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous> (AlertDialog.kt:254)");
                            }
                            float f6 = AlertDialogKt.f24078t;
                            float f7 = AlertDialogKt.nr;
                            final Function2 function214 = function212;
                            final Function2 function215 = function213;
                            AlertDialogKt.t(f6, f7, ComposableLambdaKt.nr(1887135077, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt.AlertDialogImpl.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    n(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer4, int i11) {
                                    if ((i11 & 3) == 2 && composer4.xMQ()) {
                                        composer4.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(1887135077, i11, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:258)");
                                    }
                                    Function2 function216 = function214;
                                    composer4.eF(1497073862);
                                    if (function216 != null) {
                                        function216.invoke(composer4, 0);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    composer4.Xw();
                                    function215.invoke(composer4, 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composer3, 54), composer3, 438);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composer2, 54), null, function211, function24, function25, shape, j2, f5, ColorSchemeKt.xMQ(DialogTokens.f29496n.n(), composer2, 6), j3, j4, j5, composer2, 6, 0, 2);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composerKN, (i5 & 14) | 3072 | ((i5 >> 3) & 112) | ((i8 >> 3) & 896), 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i9) {
                    AlertDialogKt.nr(function0, function2, modifier, function22, function23, function24, function25, shape, j2, j3, j4, j5, f3, dialogProperties, composer2, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3));
                }
            });
        }
    }

    static {
        float f3 = 24;
        f24076O = PaddingKt.n(Dp.KN(f3));
        float f4 = 16;
        J2 = PaddingKt.O(0.0f, 0.0f, 0.0f, Dp.KN(f4), 7, null);
        Uo = PaddingKt.O(0.0f, 0.0f, 0.0f, Dp.KN(f4), 7, null);
        KN = PaddingKt.O(0.0f, 0.0f, 0.0f, Dp.KN(f3), 7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(final Function0 function0, Modifier modifier, DialogProperties dialogProperties, final Function2 function2, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Modifier modifier2;
        int i7;
        DialogProperties dialogProperties2;
        final Modifier modifier3;
        final DialogProperties dialogProperties3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1922902937);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function02 = function0;
        } else if ((i2 & 6) == 0) {
            function02 = function0;
            i5 = (composerKN.E2(function02) ? 4 : 2) | i2;
        } else {
            function02 = function0;
            i5 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 != 0) {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    dialogProperties2 = dialogProperties;
                    i5 |= composerKN.p5(dialogProperties2) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i5 |= composerKN.E2(function2) ? 2048 : 1024;
                }
                if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
                    composerKN.wTp();
                    modifier3 = modifier2;
                    dialogProperties3 = dialogProperties2;
                } else {
                    final Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    DialogProperties dialogProperties4 = i7 == 0 ? new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null) : dialogProperties2;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1922902937, i5, -1, "androidx.compose.material3.BasicAlertDialog (AlertDialog.kt:145)");
                    }
                    AndroidDialog_androidKt.n(function02, dialogProperties4, ComposableLambdaKt.nr(905289008, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            n(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer2, int i9) {
                            if ((i9 & 3) == 2 && composer2.xMQ()) {
                                composer2.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(905289008, i9, -1, "androidx.compose.material3.BasicAlertDialog.<anonymous> (AlertDialog.kt:150)");
                            }
                            Strings.Companion companion = Strings.INSTANCE;
                            final String strN = Strings_androidKt.n(Strings.n(R.string.s7N), composer2, 0);
                            Modifier modifierAYN = SizeKt.aYN(modifier4, AlertDialogKt.az(), 0.0f, AlertDialogKt.qie(), 0.0f, 10, null);
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            boolean zP5 = composer2.p5(strN);
                            Object objIF = composer2.iF();
                            if (zP5 || objIF == Composer.INSTANCE.n()) {
                                objIF = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        n(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.eTf(semanticsPropertyReceiver, strN);
                                    }
                                };
                                composer2.o(objIF);
                            }
                            Modifier modifierZmq = modifierAYN.Zmq(SemanticsModifierKt.nr(companion2, false, (Function1) objIF, 1, null));
                            Function2 function22 = function2;
                            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), true);
                            int iN = ComposablesKt.n(composer2, 0);
                            CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                            Modifier modifierO = ComposedModifierKt.O(composer2, modifierZmq);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0 function0N = companion3.n();
                            if (composer2.getApplier() == null) {
                                ComposablesKt.t();
                            }
                            composer2.T();
                            if (composer2.getInserting()) {
                                composer2.s7N(function0N);
                            } else {
                                composer2.r();
                            }
                            Composer composerN = Updater.n(composer2);
                            Updater.O(composerN, measurePolicyUo, companion3.t());
                            Updater.O(composerN, compositionLocalMapIk, companion3.O());
                            Function2 function2Rl = companion3.rl();
                            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                composerN.o(Integer.valueOf(iN));
                                composerN.az(Integer.valueOf(iN), function2Rl);
                            }
                            Updater.O(composerN, modifierO, companion3.nr());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                            function22.invoke(composer2, 0);
                            composer2.XQ();
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composerKN, 54), composerKN, (i5 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | ((i5 >> 3) & 112), 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier3 = modifier4;
                    dialogProperties3 = dialogProperties4;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            n(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer2, int i9) {
                            AlertDialogKt.O(function0, modifier3, dialogProperties3, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            dialogProperties2 = dialogProperties;
            if ((i3 & 8) != 0) {
            }
            if ((i5 & 1171) == 1170) {
                if (i8 == 0) {
                }
                if (i7 == 0) {
                }
                if (ComposerKt.v()) {
                }
                AndroidDialog_androidKt.n(function02, dialogProperties4, ComposableLambdaKt.nr(905289008, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i9) {
                        if ((i9 & 3) == 2 && composer2.xMQ()) {
                            composer2.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(905289008, i9, -1, "androidx.compose.material3.BasicAlertDialog.<anonymous> (AlertDialog.kt:150)");
                        }
                        Strings.Companion companion = Strings.INSTANCE;
                        final String strN = Strings_androidKt.n(Strings.n(R.string.s7N), composer2, 0);
                        Modifier modifierAYN = SizeKt.aYN(modifier4, AlertDialogKt.az(), 0.0f, AlertDialogKt.qie(), 0.0f, 10, null);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        boolean zP5 = composer2.p5(strN);
                        Object objIF = composer2.iF();
                        if (zP5 || objIF == Composer.INSTANCE.n()) {
                            objIF = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    n(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.eTf(semanticsPropertyReceiver, strN);
                                }
                            };
                            composer2.o(objIF);
                        }
                        Modifier modifierZmq = modifierAYN.Zmq(SemanticsModifierKt.nr(companion2, false, (Function1) objIF, 1, null));
                        Function2 function22 = function2;
                        MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), true);
                        int iN = ComposablesKt.n(composer2, 0);
                        CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                        Modifier modifierO = ComposedModifierKt.O(composer2, modifierZmq);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0 function0N = companion3.n();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.t();
                        }
                        composer2.T();
                        if (composer2.getInserting()) {
                            composer2.s7N(function0N);
                        } else {
                            composer2.r();
                        }
                        Composer composerN = Updater.n(composer2);
                        Updater.O(composerN, measurePolicyUo, companion3.t());
                        Updater.O(composerN, compositionLocalMapIk, companion3.O());
                        Function2 function2Rl = companion3.rl();
                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion3.nr());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                        function22.invoke(composer2, 0);
                        composer2.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composerKN, (i5 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | ((i5 >> 3) & 112), 0);
                if (ComposerKt.v()) {
                }
                modifier3 = modifier4;
                dialogProperties3 = dialogProperties4;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 != 0) {
        }
        dialogProperties2 = dialogProperties;
        if ((i3 & 8) != 0) {
        }
        if ((i5 & 1171) == 1170) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final float az() {
        return f24077n;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final Function0 function0, Modifier modifier, DialogProperties dialogProperties, final Function2 function2, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Modifier modifier2;
        int i7;
        DialogProperties dialogProperties2;
        Function2 function22;
        final Modifier modifier3;
        final DialogProperties dialogProperties3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(325249497);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function02 = function0;
        } else if ((i2 & 6) == 0) {
            function02 = function0;
            i5 = (composerKN.E2(function02) ? 4 : 2) | i2;
        } else {
            function02 = function0;
            i5 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 != 0) {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    dialogProperties2 = dialogProperties;
                    i5 |= composerKN.p5(dialogProperties2) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i5 |= 3072;
                    function22 = function2;
                } else {
                    function22 = function2;
                    if ((i2 & 3072) == 0) {
                        i5 |= composerKN.E2(function22) ? 2048 : 1024;
                    }
                }
                if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
                    composerKN.wTp();
                    modifier3 = modifier2;
                    dialogProperties3 = dialogProperties2;
                } else {
                    Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    DialogProperties dialogProperties4 = i7 == 0 ? new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null) : dialogProperties2;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(325249497, i5, -1, "androidx.compose.material3.AlertDialog (AlertDialog.kt:201)");
                    }
                    Modifier modifier5 = modifier4;
                    O(function02, modifier5, dialogProperties4, function22, composerKN, i5 & 8190, 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier3 = modifier5;
                    dialogProperties3 = dialogProperties4;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            n(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer2, int i9) {
                            AlertDialogKt.n(function0, modifier3, dialogProperties3, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            dialogProperties2 = dialogProperties;
            if ((i3 & 8) != 0) {
            }
            if ((i5 & 1171) == 1170) {
                if (i8 == 0) {
                }
                if (i7 == 0) {
                }
                if (ComposerKt.v()) {
                }
                Modifier modifier52 = modifier4;
                O(function02, modifier52, dialogProperties4, function22, composerKN, i5 & 8190, 0);
                if (ComposerKt.v()) {
                }
                modifier3 = modifier52;
                dialogProperties3 = dialogProperties4;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 != 0) {
        }
        dialogProperties2 = dialogProperties;
        if ((i3 & 8) != 0) {
        }
        if ((i5 & 1171) == 1170) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final float qie() {
        return rl;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final Function2 function2, Modifier modifier, final Function2 function22, final Function2 function23, final Function2 function24, final Shape shape, final long j2, final float f3, final long j3, final long j4, final long j5, final long j6, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        final Function2 function25;
        Function2 function26;
        Function2 function27;
        long j7;
        long j9;
        int i8;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1522575799);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.E2(function2) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        int i9 = i5 & 2;
        if (i9 != 0) {
            i7 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i5 & 4) == 0) {
                i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                function25 = function22;
            } else {
                function25 = function22;
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i7 |= composerKN.E2(function25) ? 256 : 128;
                }
            }
            if ((i5 & 8) == 0) {
                i7 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    function26 = function23;
                    i7 |= composerKN.E2(function26) ? 2048 : 1024;
                }
                if ((i5 & 16) != 0) {
                    i7 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        function27 = function24;
                        i7 |= composerKN.E2(function27) ? 16384 : 8192;
                    }
                    if ((i5 & 32) == 0) {
                        i7 |= 196608;
                    } else {
                        if ((i2 & 196608) == 0) {
                            i7 |= composerKN.p5(shape) ? 131072 : 65536;
                        }
                        if ((i5 & 64) != 0) {
                            i7 |= 1572864;
                            j7 = j2;
                        } else {
                            j7 = j2;
                            if ((i2 & 1572864) == 0) {
                                i7 |= composerKN.nr(j7) ? 1048576 : 524288;
                            }
                        }
                        if ((i5 & 128) != 0) {
                            i7 |= 12582912;
                        } else {
                            if ((i2 & 12582912) == 0) {
                                i7 |= composerKN.rl(f3) ? 8388608 : 4194304;
                            }
                            if ((i5 & 256) == 0) {
                                i7 |= 100663296;
                            } else if ((i2 & 100663296) == 0) {
                                i7 |= composerKN.nr(j3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            if ((i5 & 512) == 0) {
                                i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                            } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i7 |= composerKN.nr(j4) ? 536870912 : 268435456;
                            }
                            if ((i5 & 1024) == 0) {
                                i8 = i3 | 6;
                                j9 = j5;
                            } else {
                                j9 = j5;
                                if ((i3 & 6) == 0) {
                                    i8 = i3 | (composerKN.nr(j9) ? 4 : 2);
                                } else {
                                    i8 = i3;
                                }
                            }
                            if ((i5 & 2048) != 0) {
                                if ((i3 & 48) == 0) {
                                    i8 |= composerKN.nr(j6) ? 32 : 16;
                                }
                                if ((i7 & 306783379) == 306783378 && (i8 & 19) == 18 && composerKN.xMQ()) {
                                    composerKN.wTp();
                                    modifier3 = modifier2;
                                } else {
                                    Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(1522575799, i7, i8, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:293)");
                                    }
                                    final long j10 = j9;
                                    final Function2 function28 = function26;
                                    final Function2 function29 = function27;
                                    int i10 = i7 >> 12;
                                    Modifier modifier5 = modifier4;
                                    SurfaceKt.n(modifier5, shape, j7, 0L, f3, 0.0f, null, ComposableLambdaKt.nr(-2126308228, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            n(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: Type inference failed for: r10v0 */
                                        /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
                                        /* JADX WARN: Type inference failed for: r10v2 */
                                        public final void n(Composer composer2, int i11) {
                                            ?? r10;
                                            boolean z2;
                                            if ((i11 & 3) == 2 && composer2.xMQ()) {
                                                composer2.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-2126308228, i11, -1, "androidx.compose.material3.AlertDialogContent.<anonymous> (AlertDialog.kt:300)");
                                            }
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            Modifier modifierKN = PaddingKt.KN(companion, AlertDialogKt.f24076O);
                                            final Function2 function210 = function25;
                                            final Function2 function211 = function28;
                                            final Function2 function212 = function29;
                                            long j11 = j4;
                                            long j12 = j10;
                                            long j13 = j6;
                                            long j14 = j3;
                                            Function2 function213 = function2;
                                            Arrangement.Vertical verticalUo = Arrangement.f17400n.Uo();
                                            Alignment.Companion companion2 = Alignment.INSTANCE;
                                            MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion2.gh(), composer2, 0);
                                            int iN = ComposablesKt.n(composer2, 0);
                                            CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                            Modifier modifierO = ComposedModifierKt.O(composer2, modifierKN);
                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                            Function0 function0N = companion3.n();
                                            if (composer2.getApplier() == null) {
                                                ComposablesKt.t();
                                            }
                                            composer2.T();
                                            if (composer2.getInserting()) {
                                                composer2.s7N(function0N);
                                            } else {
                                                composer2.r();
                                            }
                                            Composer composerN = Updater.n(composer2);
                                            Updater.O(composerN, measurePolicyN, companion3.t());
                                            Updater.O(composerN, compositionLocalMapIk, companion3.O());
                                            Function2 function2Rl = companion3.rl();
                                            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                composerN.o(Integer.valueOf(iN));
                                                composerN.az(Integer.valueOf(iN), function2Rl);
                                            }
                                            Updater.O(composerN, modifierO, companion3.nr());
                                            final ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                                            composer2.eF(-1924971291);
                                            if (function210 != null) {
                                                CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(j11)), ComposableLambdaKt.nr(934657765, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                        n(composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(Composer composer3, int i12) {
                                                        if ((i12 & 3) == 2 && composer3.xMQ()) {
                                                            composer3.wTp();
                                                            return;
                                                        }
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.p5(934657765, i12, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:303)");
                                                        }
                                                        ColumnScope columnScope = columnScopeInstance;
                                                        Modifier modifierKN2 = PaddingKt.KN(Modifier.INSTANCE, AlertDialogKt.J2);
                                                        Alignment.Companion companion4 = Alignment.INSTANCE;
                                                        Modifier modifierT = columnScope.t(modifierKN2, companion4.Uo());
                                                        Function2 function214 = function210;
                                                        MeasurePolicy measurePolicyUo = BoxKt.Uo(companion4.HI(), false);
                                                        int iN2 = ComposablesKt.n(composer3, 0);
                                                        CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                                                        Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierT);
                                                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                        Function0 function0N2 = companion5.n();
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
                                                        Updater.O(composerN2, measurePolicyUo, companion5.t());
                                                        Updater.O(composerN2, compositionLocalMapIk2, companion5.O());
                                                        Function2 function2Rl2 = companion5.rl();
                                                        if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                                            composerN2.o(Integer.valueOf(iN2));
                                                            composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                                        }
                                                        Updater.O(composerN2, modifierO2, companion5.nr());
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                                        function214.invoke(composer3, 0);
                                                        composer3.XQ();
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.M7();
                                                        }
                                                    }
                                                }, composer2, 54), composer2, ProvidedValue.xMQ | 48);
                                            }
                                            composer2.Xw();
                                            composer2.eF(-1924961479);
                                            if (function211 == null) {
                                                z2 = true;
                                                r10 = 0;
                                            } else {
                                                r10 = 0;
                                                z2 = true;
                                                ProvideContentColorTextStyleKt.n(j12, TypographyKt.t(DialogTokens.f29496n.J2(), composer2, 6), ComposableLambdaKt.nr(434448772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                        n(composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(Composer composer3, int i12) {
                                                        if ((i12 & 3) == 2 && composer3.xMQ()) {
                                                            composer3.wTp();
                                                            return;
                                                        }
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.p5(434448772, i12, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:313)");
                                                        }
                                                        Modifier modifierT = columnScopeInstance.t(PaddingKt.KN(Modifier.INSTANCE, AlertDialogKt.Uo), function210 == null ? Alignment.INSTANCE.gh() : Alignment.INSTANCE.Uo());
                                                        Function2 function214 = function211;
                                                        MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                                        int iN2 = ComposablesKt.n(composer3, 0);
                                                        CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                                                        Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierT);
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
                                                        function214.invoke(composer3, 0);
                                                        composer3.XQ();
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.M7();
                                                        }
                                                    }
                                                }, composer2, 54), composer2, RendererCapabilities.DECODER_SUPPORT_MASK);
                                            }
                                            composer2.Xw();
                                            composer2.eF(-1924936431);
                                            if (function212 != null) {
                                                ProvideContentColorTextStyleKt.n(j13, TypographyKt.t(DialogTokens.f29496n.xMQ(), composer2, 6), ComposableLambdaKt.nr(-796843771, z2, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                        n(composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(Composer composer3, int i12) {
                                                        if ((i12 & 3) == 2 && composer3.xMQ()) {
                                                            composer3.wTp();
                                                            return;
                                                        }
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.p5(-796843771, i12, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:334)");
                                                        }
                                                        ColumnScope columnScope = columnScopeInstance;
                                                        Modifier modifierKN2 = PaddingKt.KN(columnScope.n(Modifier.INSTANCE, 1.0f, false), AlertDialogKt.KN);
                                                        Alignment.Companion companion4 = Alignment.INSTANCE;
                                                        Modifier modifierT = columnScope.t(modifierKN2, companion4.gh());
                                                        Function2 function214 = function212;
                                                        MeasurePolicy measurePolicyUo = BoxKt.Uo(companion4.HI(), false);
                                                        int iN2 = ComposablesKt.n(composer3, 0);
                                                        CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                                                        Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierT);
                                                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                        Function0 function0N2 = companion5.n();
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
                                                        Updater.O(composerN2, measurePolicyUo, companion5.t());
                                                        Updater.O(composerN2, compositionLocalMapIk2, companion5.O());
                                                        Function2 function2Rl2 = companion5.rl();
                                                        if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                                            composerN2.o(Integer.valueOf(iN2));
                                                            composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                                        }
                                                        Updater.O(composerN2, modifierO2, companion5.nr());
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                                        function214.invoke(composer3, 0);
                                                        composer3.XQ();
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.M7();
                                                        }
                                                    }
                                                }, composer2, 54), composer2, RendererCapabilities.DECODER_SUPPORT_MASK);
                                            }
                                            composer2.Xw();
                                            Modifier modifierT = columnScopeInstance.t(companion, companion2.mUb());
                                            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), r10);
                                            int iN2 = ComposablesKt.n(composer2, r10);
                                            CompositionLocalMap compositionLocalMapIk2 = composer2.Ik();
                                            Modifier modifierO2 = ComposedModifierKt.O(composer2, modifierT);
                                            Function0 function0N2 = companion3.n();
                                            if (composer2.getApplier() == null) {
                                                ComposablesKt.t();
                                            }
                                            composer2.T();
                                            if (composer2.getInserting()) {
                                                composer2.s7N(function0N2);
                                            } else {
                                                composer2.r();
                                            }
                                            Composer composerN2 = Updater.n(composer2);
                                            Updater.O(composerN2, measurePolicyUo, companion3.t());
                                            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                                            Function2 function2Rl2 = companion3.rl();
                                            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                                composerN2.o(Integer.valueOf(iN2));
                                                composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                            }
                                            Updater.O(composerN2, modifierO2, companion3.nr());
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                            ProvideContentColorTextStyleKt.n(j14, TypographyKt.t(DialogTokens.f29496n.rl(), composer2, 6), function213, composer2, 0);
                                            composer2.XQ();
                                            composer2.XQ();
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54), composerKN, ((i7 >> 3) & 14) | 12582912 | (i10 & 112) | (i10 & 896) | ((i7 >> 9) & 57344), 104);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    modifier3 = modifier5;
                                }
                                scopeUpdateScopeGh = composerKN.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            n(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer2, int i11) {
                                            AlertDialogKt.rl(function2, modifier3, function22, function23, function24, shape, j2, f3, j3, j4, j5, j6, composer2, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i8 |= 48;
                            if ((i7 & 306783379) == 306783378) {
                                if (i9 == 0) {
                                }
                                if (ComposerKt.v()) {
                                }
                                final long j102 = j9;
                                final Function2 function282 = function26;
                                final Function2 function292 = function27;
                                int i102 = i7 >> 12;
                                Modifier modifier52 = modifier4;
                                SurfaceKt.n(modifier52, shape, j7, 0L, f3, 0.0f, null, ComposableLambdaKt.nr(-2126308228, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        n(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: Type inference failed for: r10v0 */
                                    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
                                    /* JADX WARN: Type inference failed for: r10v2 */
                                    public final void n(Composer composer2, int i11) {
                                        ?? r10;
                                        boolean z2;
                                        if ((i11 & 3) == 2 && composer2.xMQ()) {
                                            composer2.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-2126308228, i11, -1, "androidx.compose.material3.AlertDialogContent.<anonymous> (AlertDialog.kt:300)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        Modifier modifierKN = PaddingKt.KN(companion, AlertDialogKt.f24076O);
                                        final Function2 function210 = function25;
                                        final Function2 function211 = function282;
                                        final Function2 function212 = function292;
                                        long j11 = j4;
                                        long j12 = j102;
                                        long j13 = j6;
                                        long j14 = j3;
                                        Function2 function213 = function2;
                                        Arrangement.Vertical verticalUo = Arrangement.f17400n.Uo();
                                        Alignment.Companion companion2 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion2.gh(), composer2, 0);
                                        int iN = ComposablesKt.n(composer2, 0);
                                        CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                        Modifier modifierO = ComposedModifierKt.O(composer2, modifierKN);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0 function0N = companion3.n();
                                        if (composer2.getApplier() == null) {
                                            ComposablesKt.t();
                                        }
                                        composer2.T();
                                        if (composer2.getInserting()) {
                                            composer2.s7N(function0N);
                                        } else {
                                            composer2.r();
                                        }
                                        Composer composerN = Updater.n(composer2);
                                        Updater.O(composerN, measurePolicyN, companion3.t());
                                        Updater.O(composerN, compositionLocalMapIk, companion3.O());
                                        Function2 function2Rl = companion3.rl();
                                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                            composerN.o(Integer.valueOf(iN));
                                            composerN.az(Integer.valueOf(iN), function2Rl);
                                        }
                                        Updater.O(composerN, modifierO, companion3.nr());
                                        final ColumnScope columnScopeInstance = ColumnScopeInstance.f17468n;
                                        composer2.eF(-1924971291);
                                        if (function210 != null) {
                                            CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(j11)), ComposableLambdaKt.nr(934657765, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    n(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Composer composer3, int i12) {
                                                    if ((i12 & 3) == 2 && composer3.xMQ()) {
                                                        composer3.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(934657765, i12, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:303)");
                                                    }
                                                    ColumnScope columnScope = columnScopeInstance;
                                                    Modifier modifierKN2 = PaddingKt.KN(Modifier.INSTANCE, AlertDialogKt.J2);
                                                    Alignment.Companion companion4 = Alignment.INSTANCE;
                                                    Modifier modifierT = columnScope.t(modifierKN2, companion4.Uo());
                                                    Function2 function214 = function210;
                                                    MeasurePolicy measurePolicyUo = BoxKt.Uo(companion4.HI(), false);
                                                    int iN2 = ComposablesKt.n(composer3, 0);
                                                    CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                                                    Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierT);
                                                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                    Function0 function0N2 = companion5.n();
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
                                                    Updater.O(composerN2, measurePolicyUo, companion5.t());
                                                    Updater.O(composerN2, compositionLocalMapIk2, companion5.O());
                                                    Function2 function2Rl2 = companion5.rl();
                                                    if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                                        composerN2.o(Integer.valueOf(iN2));
                                                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                                    }
                                                    Updater.O(composerN2, modifierO2, companion5.nr());
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                                    function214.invoke(composer3, 0);
                                                    composer3.XQ();
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.M7();
                                                    }
                                                }
                                            }, composer2, 54), composer2, ProvidedValue.xMQ | 48);
                                        }
                                        composer2.Xw();
                                        composer2.eF(-1924961479);
                                        if (function211 == null) {
                                            z2 = true;
                                            r10 = 0;
                                        } else {
                                            r10 = 0;
                                            z2 = true;
                                            ProvideContentColorTextStyleKt.n(j12, TypographyKt.t(DialogTokens.f29496n.J2(), composer2, 6), ComposableLambdaKt.nr(434448772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    n(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Composer composer3, int i12) {
                                                    if ((i12 & 3) == 2 && composer3.xMQ()) {
                                                        composer3.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(434448772, i12, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:313)");
                                                    }
                                                    Modifier modifierT = columnScopeInstance.t(PaddingKt.KN(Modifier.INSTANCE, AlertDialogKt.Uo), function210 == null ? Alignment.INSTANCE.gh() : Alignment.INSTANCE.Uo());
                                                    Function2 function214 = function211;
                                                    MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                                    int iN2 = ComposablesKt.n(composer3, 0);
                                                    CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                                                    Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierT);
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
                                                    function214.invoke(composer3, 0);
                                                    composer3.XQ();
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.M7();
                                                    }
                                                }
                                            }, composer2, 54), composer2, RendererCapabilities.DECODER_SUPPORT_MASK);
                                        }
                                        composer2.Xw();
                                        composer2.eF(-1924936431);
                                        if (function212 != null) {
                                            ProvideContentColorTextStyleKt.n(j13, TypographyKt.t(DialogTokens.f29496n.xMQ(), composer2, 6), ComposableLambdaKt.nr(-796843771, z2, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    n(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Composer composer3, int i12) {
                                                    if ((i12 & 3) == 2 && composer3.xMQ()) {
                                                        composer3.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(-796843771, i12, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:334)");
                                                    }
                                                    ColumnScope columnScope = columnScopeInstance;
                                                    Modifier modifierKN2 = PaddingKt.KN(columnScope.n(Modifier.INSTANCE, 1.0f, false), AlertDialogKt.KN);
                                                    Alignment.Companion companion4 = Alignment.INSTANCE;
                                                    Modifier modifierT = columnScope.t(modifierKN2, companion4.gh());
                                                    Function2 function214 = function212;
                                                    MeasurePolicy measurePolicyUo = BoxKt.Uo(companion4.HI(), false);
                                                    int iN2 = ComposablesKt.n(composer3, 0);
                                                    CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                                                    Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierT);
                                                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                    Function0 function0N2 = companion5.n();
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
                                                    Updater.O(composerN2, measurePolicyUo, companion5.t());
                                                    Updater.O(composerN2, compositionLocalMapIk2, companion5.O());
                                                    Function2 function2Rl2 = companion5.rl();
                                                    if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                                        composerN2.o(Integer.valueOf(iN2));
                                                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                                    }
                                                    Updater.O(composerN2, modifierO2, companion5.nr());
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                                    function214.invoke(composer3, 0);
                                                    composer3.XQ();
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.M7();
                                                    }
                                                }
                                            }, composer2, 54), composer2, RendererCapabilities.DECODER_SUPPORT_MASK);
                                        }
                                        composer2.Xw();
                                        Modifier modifierT = columnScopeInstance.t(companion, companion2.mUb());
                                        MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), r10);
                                        int iN2 = ComposablesKt.n(composer2, r10);
                                        CompositionLocalMap compositionLocalMapIk2 = composer2.Ik();
                                        Modifier modifierO2 = ComposedModifierKt.O(composer2, modifierT);
                                        Function0 function0N2 = companion3.n();
                                        if (composer2.getApplier() == null) {
                                            ComposablesKt.t();
                                        }
                                        composer2.T();
                                        if (composer2.getInserting()) {
                                            composer2.s7N(function0N2);
                                        } else {
                                            composer2.r();
                                        }
                                        Composer composerN2 = Updater.n(composer2);
                                        Updater.O(composerN2, measurePolicyUo, companion3.t());
                                        Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                                        Function2 function2Rl2 = companion3.rl();
                                        if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                            composerN2.o(Integer.valueOf(iN2));
                                            composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                        }
                                        Updater.O(composerN2, modifierO2, companion3.nr());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                        ProvideContentColorTextStyleKt.n(j14, TypographyKt.t(DialogTokens.f29496n.rl(), composer2, 6), function213, composer2, 0);
                                        composer2.XQ();
                                        composer2.XQ();
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composerKN, ((i7 >> 3) & 14) | 12582912 | (i102 & 112) | (i102 & 896) | ((i7 >> 9) & 57344), 104);
                                if (ComposerKt.v()) {
                                }
                                modifier3 = modifier52;
                            }
                            scopeUpdateScopeGh = composerKN.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        if ((i5 & 256) == 0) {
                        }
                        if ((i5 & 512) == 0) {
                        }
                        if ((i5 & 1024) == 0) {
                        }
                        if ((i5 & 2048) != 0) {
                        }
                        if ((i7 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    if ((i5 & 64) != 0) {
                    }
                    if ((i5 & 128) != 0) {
                    }
                    if ((i5 & 256) == 0) {
                    }
                    if ((i5 & 512) == 0) {
                    }
                    if ((i5 & 1024) == 0) {
                    }
                    if ((i5 & 2048) != 0) {
                    }
                    if ((i7 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function27 = function24;
                if ((i5 & 32) == 0) {
                }
                if ((i5 & 64) != 0) {
                }
                if ((i5 & 128) != 0) {
                }
                if ((i5 & 256) == 0) {
                }
                if ((i5 & 512) == 0) {
                }
                if ((i5 & 1024) == 0) {
                }
                if ((i5 & 2048) != 0) {
                }
                if ((i7 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            function26 = function23;
            if ((i5 & 16) != 0) {
            }
            function27 = function24;
            if ((i5 & 32) == 0) {
            }
            if ((i5 & 64) != 0) {
            }
            if ((i5 & 128) != 0) {
            }
            if ((i5 & 256) == 0) {
            }
            if ((i5 & 512) == 0) {
            }
            if ((i5 & 1024) == 0) {
            }
            if ((i5 & 2048) != 0) {
            }
            if ((i7 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((i5 & 4) == 0) {
        }
        if ((i5 & 8) == 0) {
        }
        function26 = function23;
        if ((i5 & 16) != 0) {
        }
        function27 = function24;
        if ((i5 & 32) == 0) {
        }
        if ((i5 & 64) != 0) {
        }
        if ((i5 & 128) != 0) {
        }
        if ((i5 & 256) == 0) {
        }
        if ((i5 & 512) == 0) {
        }
        if ((i5 & 1024) == 0) {
        }
        if ((i5 & 2048) != 0) {
        }
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final void t(final float f3, final float f4, final Function2 function2, Composer composer, final int i2) {
        int i3;
        boolean z2;
        int i5;
        int i7;
        int i8;
        Composer composerKN = composer.KN(586821353);
        if ((i2 & 6) == 0) {
            if (composerKN.rl(f3)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.rl(f4)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.E2(function2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(586821353, i3, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:364)");
            }
            boolean z3 = true;
            if ((i3 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i3 & 112) != 32) {
                z3 = false;
            }
            boolean z4 = z2 | z3;
            Object objIF = composerKN.iF();
            if (z4 || objIF == Composer.INSTANCE.n()) {
                objIF = new MeasurePolicy() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult rl(final MeasureScope measureScope, List list, long j2) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        final ArrayList arrayList3 = new ArrayList();
                        Ref.IntRef intRef = new Ref.IntRef();
                        Ref.IntRef intRef2 = new Ref.IntRef();
                        ArrayList arrayList4 = new ArrayList();
                        Ref.IntRef intRef3 = new Ref.IntRef();
                        Ref.IntRef intRef4 = new Ref.IntRef();
                        float f5 = f3;
                        float f6 = f4;
                        int size = list.size();
                        int i9 = 0;
                        while (i9 < size) {
                            ArrayList arrayList5 = arrayList;
                            Ref.IntRef intRef5 = intRef2;
                            Placeable placeableDR0 = ((Measurable) list.get(i9)).dR0(j2);
                            int i10 = i9;
                            Ref.IntRef intRef6 = intRef3;
                            intRef3 = intRef6;
                            int i11 = size;
                            if (n(arrayList4, intRef6, measureScope, f5, j2, placeableDR0)) {
                                arrayList = arrayList5;
                                intRef2 = intRef5;
                            } else {
                                arrayList = arrayList5;
                                intRef2 = intRef5;
                                t(arrayList, intRef2, measureScope, f6, arrayList4, arrayList2, intRef4, arrayList3, intRef, intRef3);
                            }
                            if (!arrayList4.isEmpty()) {
                                intRef3.element += measureScope.How(f5);
                            }
                            arrayList4.add(placeableDR0);
                            intRef3.element += placeableDR0.getWidth();
                            intRef4.element = Math.max(intRef4.element, placeableDR0.getHeight());
                            i9 = i10 + 1;
                            size = i11;
                        }
                        if (!arrayList4.isEmpty()) {
                            t(arrayList, intRef2, measureScope, f4, arrayList4, arrayList2, intRef4, arrayList3, intRef, intRef3);
                        }
                        final int iMax = Math.max(intRef.element, Constraints.ty(j2));
                        int iMax2 = Math.max(intRef2.element, Constraints.az(j2));
                        final float f7 = f3;
                        final ArrayList arrayList6 = arrayList;
                        return MeasureScope.ER(measureScope, iMax, iMax2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1.2
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
                                MeasureScope measureScope2 = measureScope;
                                float f8 = f7;
                                int i12 = iMax;
                                List list3 = arrayList3;
                                int size2 = list2.size();
                                for (int i13 = 0; i13 < size2; i13++) {
                                    List list4 = (List) list2.get(i13);
                                    int size3 = list4.size();
                                    int[] iArr = new int[size3];
                                    int i14 = 0;
                                    while (i14 < size3) {
                                        iArr[i14] = ((Placeable) list4.get(i14)).getWidth() + (i14 < CollectionsKt.getLastIndex(list4) ? measureScope2.How(f8) : 0);
                                        i14++;
                                    }
                                    Arrangement.Horizontal horizontalT = Arrangement.f17400n.t();
                                    int[] iArr2 = new int[size3];
                                    for (int i15 = 0; i15 < size3; i15++) {
                                        iArr2[i15] = 0;
                                    }
                                    horizontalT.t(measureScope2, i12, iArr, measureScope2.getLayoutDirection(), iArr2);
                                    int size4 = list4.size();
                                    for (int i16 = 0; i16 < size4; i16++) {
                                        Placeable.PlacementScope.xMQ(placementScope, (Placeable) list4.get(i16), iArr2[i16], ((Number) list3.get(i13)).intValue(), 0.0f, 4, null);
                                    }
                                }
                            }
                        }, 4, null);
                    }

                    private static final boolean n(List list, Ref.IntRef intRef, MeasureScope measureScope, float f5, long j2, Placeable placeable) {
                        if (!list.isEmpty() && intRef.element + measureScope.How(f5) + placeable.getWidth() > Constraints.qie(j2)) {
                            return false;
                        }
                        return true;
                    }

                    private static final void t(List list, Ref.IntRef intRef, MeasureScope measureScope, float f5, List list2, List list3, Ref.IntRef intRef2, List list4, Ref.IntRef intRef3, Ref.IntRef intRef4) {
                        if (!list.isEmpty()) {
                            intRef.element += measureScope.How(f5);
                        }
                        list.add(0, CollectionsKt.toList(list2));
                        list3.add(Integer.valueOf(intRef2.element));
                        list4.add(Integer.valueOf(intRef.element));
                        intRef.element += intRef2.element;
                        intRef3.element = Math.max(intRef3.element, intRef4.element);
                        list2.clear();
                        intRef4.element = 0;
                        intRef2.element = 0;
                    }
                };
                composerKN.o(objIF);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objIF;
            int i9 = (i3 >> 6) & 14;
            Modifier.Companion companion = Modifier.INSTANCE;
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
            int i10 = ((i9 << 6) & 896) | 6;
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N);
            } else {
                composerKN.r();
            }
            Composer composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicy, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            function2.invoke(composerKN, Integer.valueOf((i10 >> 6) & 14));
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i11) {
                    AlertDialogKt.t(f3, f4, function2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }
}
