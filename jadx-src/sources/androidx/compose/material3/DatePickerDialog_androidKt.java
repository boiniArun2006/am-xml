package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.DialogTokens;
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
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u009a\u0001\u0010\u0014\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017\"\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/runtime/Composable;", "confirmButton", "Landroidx/compose/ui/Modifier;", "modifier", "dismissButton", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "Landroidx/compose/material3/DatePickerColors;", "colors", "Landroidx/compose/ui/window/DialogProperties;", "properties", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;FLandroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/foundation/layout/PaddingValues;", "DialogButtonsPadding", "rl", "F", "DialogButtonsMainAxisSpacing", "t", "DialogButtonsCrossAxisSpacing", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDatePickerDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePickerDialog.android.kt\nandroidx/compose/material3/DatePickerDialog_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,121:1\n148#2:122\n148#2:123\n148#2:124\n*S KotlinDebug\n*F\n+ 1 DatePickerDialog.android.kt\nandroidx/compose/material3/DatePickerDialog_androidKt\n*L\n118#1:122\n119#1:123\n120#1:124\n*E\n"})
public final class DatePickerDialog_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final PaddingValues f25191n;
    private static final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f25192t = Dp.KN(12);

    static {
        float f3 = 8;
        f25191n = PaddingKt.O(0.0f, 0.0f, Dp.KN(6), Dp.KN(f3), 3, null);
        rl = Dp.KN(f3);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final Function0 function0, final Function2 function2, Modifier modifier, Function2 function22, Shape shape, float f3, DatePickerColors datePickerColors, DialogProperties dialogProperties, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        Modifier modifier2;
        int i8;
        Function2 function23;
        Shape shapeUo;
        int i9;
        float fKN;
        final DatePickerColors datePickerColorsT;
        int i10;
        DialogProperties dialogProperties2;
        final DialogProperties dialogProperties3;
        final float f4;
        final Function2 function24;
        final Modifier modifier3;
        Composer composer2;
        final Shape shape2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-36517340);
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
                i5 |= composerKN.E2(function2) ? 32 : 16;
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
                        function23 = function22;
                        i5 |= composerKN.E2(function23) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16) == 0) {
                            shapeUo = shape;
                            int i11 = composerKN.p5(shapeUo) ? 16384 : 8192;
                            i5 |= i11;
                        } else {
                            shapeUo = shape;
                        }
                        i5 |= i11;
                    } else {
                        shapeUo = shape;
                    }
                    i9 = i3 & 32;
                    if (i9 == 0) {
                        i5 |= 196608;
                    } else {
                        if ((196608 & i2) == 0) {
                            fKN = f3;
                            i5 |= composerKN.rl(fKN) ? 131072 : 65536;
                        }
                        if ((1572864 & i2) == 0) {
                            if ((i3 & 64) == 0) {
                                datePickerColorsT = datePickerColors;
                                int i12 = composerKN.p5(datePickerColorsT) ? 1048576 : 524288;
                                i5 |= i12;
                            } else {
                                datePickerColorsT = datePickerColors;
                            }
                            i5 |= i12;
                        } else {
                            datePickerColorsT = datePickerColors;
                        }
                        i10 = i3 & 128;
                        if (i10 != 0) {
                            i5 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i5 |= composerKN.p5(dialogProperties) ? 8388608 : 4194304;
                        }
                        if ((i3 & 256) == 0) {
                            if ((i2 & 100663296) == 0) {
                                i5 |= composerKN.E2(function3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            if ((i5 & 38347923) == 38347922 || !composerKN.xMQ()) {
                                composerKN.e();
                                if ((i2 & 1) != 0 || composerKN.rV9()) {
                                    if (i7 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i8 != 0) {
                                        function23 = null;
                                    }
                                    if ((i3 & 16) != 0) {
                                        i5 &= -57345;
                                        shapeUo = DatePickerDefaults.f25177n.Uo(composerKN, 6);
                                    }
                                    if (i9 != 0) {
                                        fKN = DatePickerDefaults.f25177n.KN();
                                    }
                                    if ((i3 & 64) != 0) {
                                        i5 &= -3670017;
                                        datePickerColorsT = DatePickerDefaults.f25177n.t(composerKN, 6);
                                    }
                                    if (i10 == 0) {
                                        dialogProperties2 = new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null);
                                    }
                                    Modifier modifier4 = modifier2;
                                    final Function2 function25 = function23;
                                    final float f5 = fKN;
                                    final Shape shape3 = shapeUo;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-36517340, i5, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:76)");
                                    }
                                    AlertDialogKt.O(function0, SizeKt.iF(modifier4, null, false, 3, null), dialogProperties2, ComposableLambdaKt.nr(-10625622, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i13) {
                                            if ((i13 & 3) == 2 && composer3.xMQ()) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-10625622, i13, -1, "androidx.compose.material3.DatePickerDialog.<anonymous> (DatePickerDialog.android.kt:82)");
                                            }
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.f29490n;
                                            Modifier modifierGh = SizeKt.gh(SizeKt.o(companion, datePickerModalTokens.nr()), 0.0f, datePickerModalTokens.rl(), 1, null);
                                            Shape shape4 = shape3;
                                            long containerColor = datePickerColorsT.getContainerColor();
                                            float f6 = f5;
                                            final Function3 function32 = function3;
                                            final Function2 function26 = function25;
                                            final Function2 function27 = function2;
                                            SurfaceKt.n(modifierGh, shape4, containerColor, 0L, f6, 0.0f, null, ComposableLambdaKt.nr(-1706202235, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    n(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Composer composer4, int i14) {
                                                    if ((i14 & 3) == 2 && composer4.xMQ()) {
                                                        composer4.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(-1706202235, i14, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous> (DatePickerDialog.android.kt:90)");
                                                    }
                                                    Arrangement.HorizontalOrVertical horizontalOrVerticalNr = Arrangement.f17400n.nr();
                                                    Function3 function33 = function32;
                                                    final Function2 function28 = function26;
                                                    final Function2 function29 = function27;
                                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                                    Alignment.Companion companion3 = Alignment.INSTANCE;
                                                    MeasurePolicy measurePolicyN = ColumnKt.n(horizontalOrVerticalNr, companion3.gh(), composer4, 6);
                                                    int iN = ComposablesKt.n(composer4, 0);
                                                    CompositionLocalMap compositionLocalMapIk = composer4.Ik();
                                                    Modifier modifierO = ComposedModifierKt.O(composer4, companion2);
                                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                    Function0 function0N = companion4.n();
                                                    if (composer4.getApplier() == null) {
                                                        ComposablesKt.t();
                                                    }
                                                    composer4.T();
                                                    if (composer4.getInserting()) {
                                                        composer4.s7N(function0N);
                                                    } else {
                                                        composer4.r();
                                                    }
                                                    Composer composerN = Updater.n(composer4);
                                                    Updater.O(composerN, measurePolicyN, companion4.t());
                                                    Updater.O(composerN, compositionLocalMapIk, companion4.O());
                                                    Function2 function2Rl = companion4.rl();
                                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                        composerN.o(Integer.valueOf(iN));
                                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                                    }
                                                    Updater.O(composerN, modifierO, companion4.nr());
                                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                                                    Modifier modifierN = columnScopeInstance.n(companion2, 1.0f, false);
                                                    MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), false);
                                                    int iN2 = ComposablesKt.n(composer4, 0);
                                                    CompositionLocalMap compositionLocalMapIk2 = composer4.Ik();
                                                    Modifier modifierO2 = ComposedModifierKt.O(composer4, modifierN);
                                                    Function0 function0N2 = companion4.n();
                                                    if (composer4.getApplier() == null) {
                                                        ComposablesKt.t();
                                                    }
                                                    composer4.T();
                                                    if (composer4.getInserting()) {
                                                        composer4.s7N(function0N2);
                                                    } else {
                                                        composer4.r();
                                                    }
                                                    Composer composerN2 = Updater.n(composer4);
                                                    Updater.O(composerN2, measurePolicyUo, companion4.t());
                                                    Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
                                                    Function2 function2Rl2 = companion4.rl();
                                                    if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                                        composerN2.o(Integer.valueOf(iN2));
                                                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                                    }
                                                    Updater.O(composerN2, modifierO2, companion4.nr());
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                                    function33.invoke(columnScopeInstance, composer4, 6);
                                                    composer4.XQ();
                                                    Modifier modifierKN = PaddingKt.KN(columnScopeInstance.t(companion2, companion3.mUb()), DatePickerDialog_androidKt.f25191n);
                                                    MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion3.HI(), false);
                                                    int iN3 = ComposablesKt.n(composer4, 0);
                                                    CompositionLocalMap compositionLocalMapIk3 = composer4.Ik();
                                                    Modifier modifierO3 = ComposedModifierKt.O(composer4, modifierKN);
                                                    Function0 function0N3 = companion4.n();
                                                    if (composer4.getApplier() == null) {
                                                        ComposablesKt.t();
                                                    }
                                                    composer4.T();
                                                    if (composer4.getInserting()) {
                                                        composer4.s7N(function0N3);
                                                    } else {
                                                        composer4.r();
                                                    }
                                                    Composer composerN3 = Updater.n(composer4);
                                                    Updater.O(composerN3, measurePolicyUo2, companion4.t());
                                                    Updater.O(composerN3, compositionLocalMapIk3, companion4.O());
                                                    Function2 function2Rl3 = companion4.rl();
                                                    if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                                                        composerN3.o(Integer.valueOf(iN3));
                                                        composerN3.az(Integer.valueOf(iN3), function2Rl3);
                                                    }
                                                    Updater.O(composerN3, modifierO3, companion4.nr());
                                                    DialogTokens dialogTokens = DialogTokens.f29496n;
                                                    ProvideContentColorTextStyleKt.n(ColorSchemeKt.xMQ(dialogTokens.n(), composer4, 6), TypographyKt.t(dialogTokens.rl(), composer4, 6), ComposableLambdaKt.nr(642347978, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                            n(composer5, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void n(Composer composer5, int i15) {
                                                            if ((i15 & 3) == 2 && composer5.xMQ()) {
                                                                composer5.wTp();
                                                                return;
                                                            }
                                                            if (ComposerKt.v()) {
                                                                ComposerKt.p5(642347978, i15, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:103)");
                                                            }
                                                            float f7 = DatePickerDialog_androidKt.rl;
                                                            float f8 = DatePickerDialog_androidKt.f25192t;
                                                            final Function2 function210 = function28;
                                                            final Function2 function211 = function29;
                                                            AlertDialogKt.t(f7, f8, ComposableLambdaKt.nr(1241707635, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1.1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(2);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                                    n(composer6, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                public final void n(Composer composer6, int i16) {
                                                                    if ((i16 & 3) == 2 && composer6.xMQ()) {
                                                                        composer6.wTp();
                                                                        return;
                                                                    }
                                                                    if (ComposerKt.v()) {
                                                                        ComposerKt.p5(1241707635, i16, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:107)");
                                                                    }
                                                                    Function2 function212 = function210;
                                                                    composer6.eF(-779485335);
                                                                    if (function212 != null) {
                                                                        function212.invoke(composer6, 0);
                                                                        Unit unit = Unit.INSTANCE;
                                                                    }
                                                                    composer6.Xw();
                                                                    function211.invoke(composer6, 0);
                                                                    if (ComposerKt.v()) {
                                                                        ComposerKt.M7();
                                                                    }
                                                                }
                                                            }, composer5, 54), composer5, 438);
                                                            if (ComposerKt.v()) {
                                                                ComposerKt.M7();
                                                            }
                                                        }
                                                    }, composer4, 54), composer4, RendererCapabilities.DECODER_SUPPORT_MASK);
                                                    composer4.XQ();
                                                    composer4.XQ();
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.M7();
                                                    }
                                                }
                                            }, composer3, 54), composer3, 12582918, 104);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54), composerKN, (i5 & 14) | 3072 | ((i5 >> 15) & 896), 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    dialogProperties3 = dialogProperties2;
                                    f4 = f5;
                                    function24 = function25;
                                    modifier3 = modifier4;
                                    composer2 = composerKN;
                                    shape2 = shape3;
                                } else {
                                    composerKN.wTp();
                                    if ((i3 & 16) != 0) {
                                        i5 &= -57345;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i5 &= -3670017;
                                    }
                                }
                                dialogProperties2 = dialogProperties;
                                Modifier modifier42 = modifier2;
                                final Function2 function252 = function23;
                                final float f53 = fKN;
                                final Shape shape32 = shapeUo;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                AlertDialogKt.O(function0, SizeKt.iF(modifier42, null, false, 3, null), dialogProperties2, ComposableLambdaKt.nr(-10625622, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i13) {
                                        if ((i13 & 3) == 2 && composer3.xMQ()) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-10625622, i13, -1, "androidx.compose.material3.DatePickerDialog.<anonymous> (DatePickerDialog.android.kt:82)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.f29490n;
                                        Modifier modifierGh = SizeKt.gh(SizeKt.o(companion, datePickerModalTokens.nr()), 0.0f, datePickerModalTokens.rl(), 1, null);
                                        Shape shape4 = shape32;
                                        long containerColor = datePickerColorsT.getContainerColor();
                                        float f6 = f53;
                                        final Function3 function32 = function3;
                                        final Function2 function26 = function252;
                                        final Function2 function27 = function2;
                                        SurfaceKt.n(modifierGh, shape4, containerColor, 0L, f6, 0.0f, null, ComposableLambdaKt.nr(-1706202235, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                n(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer4, int i14) {
                                                if ((i14 & 3) == 2 && composer4.xMQ()) {
                                                    composer4.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-1706202235, i14, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous> (DatePickerDialog.android.kt:90)");
                                                }
                                                Arrangement.HorizontalOrVertical horizontalOrVerticalNr = Arrangement.f17400n.nr();
                                                Function3 function33 = function32;
                                                final Function2 function28 = function26;
                                                final Function2 function29 = function27;
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                                MeasurePolicy measurePolicyN = ColumnKt.n(horizontalOrVerticalNr, companion3.gh(), composer4, 6);
                                                int iN = ComposablesKt.n(composer4, 0);
                                                CompositionLocalMap compositionLocalMapIk = composer4.Ik();
                                                Modifier modifierO = ComposedModifierKt.O(composer4, companion2);
                                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                Function0 function0N = companion4.n();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.t();
                                                }
                                                composer4.T();
                                                if (composer4.getInserting()) {
                                                    composer4.s7N(function0N);
                                                } else {
                                                    composer4.r();
                                                }
                                                Composer composerN = Updater.n(composer4);
                                                Updater.O(composerN, measurePolicyN, companion4.t());
                                                Updater.O(composerN, compositionLocalMapIk, companion4.O());
                                                Function2 function2Rl = companion4.rl();
                                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                    composerN.o(Integer.valueOf(iN));
                                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                                }
                                                Updater.O(composerN, modifierO, companion4.nr());
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                                                Modifier modifierN = columnScopeInstance.n(companion2, 1.0f, false);
                                                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), false);
                                                int iN2 = ComposablesKt.n(composer4, 0);
                                                CompositionLocalMap compositionLocalMapIk2 = composer4.Ik();
                                                Modifier modifierO2 = ComposedModifierKt.O(composer4, modifierN);
                                                Function0 function0N2 = companion4.n();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.t();
                                                }
                                                composer4.T();
                                                if (composer4.getInserting()) {
                                                    composer4.s7N(function0N2);
                                                } else {
                                                    composer4.r();
                                                }
                                                Composer composerN2 = Updater.n(composer4);
                                                Updater.O(composerN2, measurePolicyUo, companion4.t());
                                                Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
                                                Function2 function2Rl2 = companion4.rl();
                                                if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                                    composerN2.o(Integer.valueOf(iN2));
                                                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                                }
                                                Updater.O(composerN2, modifierO2, companion4.nr());
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                                function33.invoke(columnScopeInstance, composer4, 6);
                                                composer4.XQ();
                                                Modifier modifierKN = PaddingKt.KN(columnScopeInstance.t(companion2, companion3.mUb()), DatePickerDialog_androidKt.f25191n);
                                                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion3.HI(), false);
                                                int iN3 = ComposablesKt.n(composer4, 0);
                                                CompositionLocalMap compositionLocalMapIk3 = composer4.Ik();
                                                Modifier modifierO3 = ComposedModifierKt.O(composer4, modifierKN);
                                                Function0 function0N3 = companion4.n();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.t();
                                                }
                                                composer4.T();
                                                if (composer4.getInserting()) {
                                                    composer4.s7N(function0N3);
                                                } else {
                                                    composer4.r();
                                                }
                                                Composer composerN3 = Updater.n(composer4);
                                                Updater.O(composerN3, measurePolicyUo2, companion4.t());
                                                Updater.O(composerN3, compositionLocalMapIk3, companion4.O());
                                                Function2 function2Rl3 = companion4.rl();
                                                if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                                                    composerN3.o(Integer.valueOf(iN3));
                                                    composerN3.az(Integer.valueOf(iN3), function2Rl3);
                                                }
                                                Updater.O(composerN3, modifierO3, companion4.nr());
                                                DialogTokens dialogTokens = DialogTokens.f29496n;
                                                ProvideContentColorTextStyleKt.n(ColorSchemeKt.xMQ(dialogTokens.n(), composer4, 6), TypographyKt.t(dialogTokens.rl(), composer4, 6), ComposableLambdaKt.nr(642347978, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                        n(composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(Composer composer5, int i15) {
                                                        if ((i15 & 3) == 2 && composer5.xMQ()) {
                                                            composer5.wTp();
                                                            return;
                                                        }
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.p5(642347978, i15, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:103)");
                                                        }
                                                        float f7 = DatePickerDialog_androidKt.rl;
                                                        float f8 = DatePickerDialog_androidKt.f25192t;
                                                        final Function2 function210 = function28;
                                                        final Function2 function211 = function29;
                                                        AlertDialogKt.t(f7, f8, ComposableLambdaKt.nr(1241707635, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                                n(composer6, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void n(Composer composer6, int i16) {
                                                                if ((i16 & 3) == 2 && composer6.xMQ()) {
                                                                    composer6.wTp();
                                                                    return;
                                                                }
                                                                if (ComposerKt.v()) {
                                                                    ComposerKt.p5(1241707635, i16, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:107)");
                                                                }
                                                                Function2 function212 = function210;
                                                                composer6.eF(-779485335);
                                                                if (function212 != null) {
                                                                    function212.invoke(composer6, 0);
                                                                    Unit unit = Unit.INSTANCE;
                                                                }
                                                                composer6.Xw();
                                                                function211.invoke(composer6, 0);
                                                                if (ComposerKt.v()) {
                                                                    ComposerKt.M7();
                                                                }
                                                            }
                                                        }, composer5, 54), composer5, 438);
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.M7();
                                                        }
                                                    }
                                                }, composer4, 54), composer4, RendererCapabilities.DECODER_SUPPORT_MASK);
                                                composer4.XQ();
                                                composer4.XQ();
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer3, 54), composer3, 12582918, 104);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composerKN, (i5 & 14) | 3072 | ((i5 >> 15) & 896), 0);
                                if (ComposerKt.v()) {
                                }
                                dialogProperties3 = dialogProperties2;
                                f4 = f53;
                                function24 = function252;
                                modifier3 = modifier42;
                                composer2 = composerKN;
                                shape2 = shape32;
                            } else {
                                composerKN.wTp();
                                composer2 = composerKN;
                                modifier3 = modifier2;
                                function24 = function23;
                                shape2 = shapeUo;
                                f4 = fKN;
                                dialogProperties3 = dialogProperties;
                            }
                            final DatePickerColors datePickerColors2 = datePickerColorsT;
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i13) {
                                        DatePickerDialog_androidKt.n(function0, function2, modifier3, function24, shape2, f4, datePickerColors2, dialogProperties3, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= 100663296;
                        if ((i5 & 38347923) == 38347922) {
                            composerKN.e();
                            if ((i2 & 1) != 0) {
                                if (i7 != 0) {
                                }
                                if (i8 != 0) {
                                }
                                if ((i3 & 16) != 0) {
                                }
                                if (i9 != 0) {
                                }
                                if ((i3 & 64) != 0) {
                                }
                                if (i10 == 0) {
                                    dialogProperties2 = dialogProperties;
                                }
                                Modifier modifier422 = modifier2;
                                final Function2 function2522 = function23;
                                final float f532 = fKN;
                                final Shape shape322 = shapeUo;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                AlertDialogKt.O(function0, SizeKt.iF(modifier422, null, false, 3, null), dialogProperties2, ComposableLambdaKt.nr(-10625622, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i13) {
                                        if ((i13 & 3) == 2 && composer3.xMQ()) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-10625622, i13, -1, "androidx.compose.material3.DatePickerDialog.<anonymous> (DatePickerDialog.android.kt:82)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.f29490n;
                                        Modifier modifierGh = SizeKt.gh(SizeKt.o(companion, datePickerModalTokens.nr()), 0.0f, datePickerModalTokens.rl(), 1, null);
                                        Shape shape4 = shape322;
                                        long containerColor = datePickerColorsT.getContainerColor();
                                        float f6 = f532;
                                        final Function3 function32 = function3;
                                        final Function2 function26 = function2522;
                                        final Function2 function27 = function2;
                                        SurfaceKt.n(modifierGh, shape4, containerColor, 0L, f6, 0.0f, null, ComposableLambdaKt.nr(-1706202235, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                n(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer4, int i14) {
                                                if ((i14 & 3) == 2 && composer4.xMQ()) {
                                                    composer4.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-1706202235, i14, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous> (DatePickerDialog.android.kt:90)");
                                                }
                                                Arrangement.HorizontalOrVertical horizontalOrVerticalNr = Arrangement.f17400n.nr();
                                                Function3 function33 = function32;
                                                final Function2 function28 = function26;
                                                final Function2 function29 = function27;
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                                MeasurePolicy measurePolicyN = ColumnKt.n(horizontalOrVerticalNr, companion3.gh(), composer4, 6);
                                                int iN = ComposablesKt.n(composer4, 0);
                                                CompositionLocalMap compositionLocalMapIk = composer4.Ik();
                                                Modifier modifierO = ComposedModifierKt.O(composer4, companion2);
                                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                Function0 function0N = companion4.n();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.t();
                                                }
                                                composer4.T();
                                                if (composer4.getInserting()) {
                                                    composer4.s7N(function0N);
                                                } else {
                                                    composer4.r();
                                                }
                                                Composer composerN = Updater.n(composer4);
                                                Updater.O(composerN, measurePolicyN, companion4.t());
                                                Updater.O(composerN, compositionLocalMapIk, companion4.O());
                                                Function2 function2Rl = companion4.rl();
                                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                    composerN.o(Integer.valueOf(iN));
                                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                                }
                                                Updater.O(composerN, modifierO, companion4.nr());
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                                                Modifier modifierN = columnScopeInstance.n(companion2, 1.0f, false);
                                                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), false);
                                                int iN2 = ComposablesKt.n(composer4, 0);
                                                CompositionLocalMap compositionLocalMapIk2 = composer4.Ik();
                                                Modifier modifierO2 = ComposedModifierKt.O(composer4, modifierN);
                                                Function0 function0N2 = companion4.n();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.t();
                                                }
                                                composer4.T();
                                                if (composer4.getInserting()) {
                                                    composer4.s7N(function0N2);
                                                } else {
                                                    composer4.r();
                                                }
                                                Composer composerN2 = Updater.n(composer4);
                                                Updater.O(composerN2, measurePolicyUo, companion4.t());
                                                Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
                                                Function2 function2Rl2 = companion4.rl();
                                                if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                                    composerN2.o(Integer.valueOf(iN2));
                                                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                                }
                                                Updater.O(composerN2, modifierO2, companion4.nr());
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                                function33.invoke(columnScopeInstance, composer4, 6);
                                                composer4.XQ();
                                                Modifier modifierKN = PaddingKt.KN(columnScopeInstance.t(companion2, companion3.mUb()), DatePickerDialog_androidKt.f25191n);
                                                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion3.HI(), false);
                                                int iN3 = ComposablesKt.n(composer4, 0);
                                                CompositionLocalMap compositionLocalMapIk3 = composer4.Ik();
                                                Modifier modifierO3 = ComposedModifierKt.O(composer4, modifierKN);
                                                Function0 function0N3 = companion4.n();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.t();
                                                }
                                                composer4.T();
                                                if (composer4.getInserting()) {
                                                    composer4.s7N(function0N3);
                                                } else {
                                                    composer4.r();
                                                }
                                                Composer composerN3 = Updater.n(composer4);
                                                Updater.O(composerN3, measurePolicyUo2, companion4.t());
                                                Updater.O(composerN3, compositionLocalMapIk3, companion4.O());
                                                Function2 function2Rl3 = companion4.rl();
                                                if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                                                    composerN3.o(Integer.valueOf(iN3));
                                                    composerN3.az(Integer.valueOf(iN3), function2Rl3);
                                                }
                                                Updater.O(composerN3, modifierO3, companion4.nr());
                                                DialogTokens dialogTokens = DialogTokens.f29496n;
                                                ProvideContentColorTextStyleKt.n(ColorSchemeKt.xMQ(dialogTokens.n(), composer4, 6), TypographyKt.t(dialogTokens.rl(), composer4, 6), ComposableLambdaKt.nr(642347978, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                        n(composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(Composer composer5, int i15) {
                                                        if ((i15 & 3) == 2 && composer5.xMQ()) {
                                                            composer5.wTp();
                                                            return;
                                                        }
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.p5(642347978, i15, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:103)");
                                                        }
                                                        float f7 = DatePickerDialog_androidKt.rl;
                                                        float f8 = DatePickerDialog_androidKt.f25192t;
                                                        final Function2 function210 = function28;
                                                        final Function2 function211 = function29;
                                                        AlertDialogKt.t(f7, f8, ComposableLambdaKt.nr(1241707635, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                                n(composer6, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void n(Composer composer6, int i16) {
                                                                if ((i16 & 3) == 2 && composer6.xMQ()) {
                                                                    composer6.wTp();
                                                                    return;
                                                                }
                                                                if (ComposerKt.v()) {
                                                                    ComposerKt.p5(1241707635, i16, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:107)");
                                                                }
                                                                Function2 function212 = function210;
                                                                composer6.eF(-779485335);
                                                                if (function212 != null) {
                                                                    function212.invoke(composer6, 0);
                                                                    Unit unit = Unit.INSTANCE;
                                                                }
                                                                composer6.Xw();
                                                                function211.invoke(composer6, 0);
                                                                if (ComposerKt.v()) {
                                                                    ComposerKt.M7();
                                                                }
                                                            }
                                                        }, composer5, 54), composer5, 438);
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.M7();
                                                        }
                                                    }
                                                }, composer4, 54), composer4, RendererCapabilities.DECODER_SUPPORT_MASK);
                                                composer4.XQ();
                                                composer4.XQ();
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer3, 54), composer3, 12582918, 104);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composerKN, (i5 & 14) | 3072 | ((i5 >> 15) & 896), 0);
                                if (ComposerKt.v()) {
                                }
                                dialogProperties3 = dialogProperties2;
                                f4 = f532;
                                function24 = function2522;
                                modifier3 = modifier422;
                                composer2 = composerKN;
                                shape2 = shape322;
                            }
                        }
                        final DatePickerColors datePickerColors22 = datePickerColorsT;
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    fKN = f3;
                    if ((1572864 & i2) == 0) {
                    }
                    i10 = i3 & 128;
                    if (i10 != 0) {
                    }
                    if ((i3 & 256) == 0) {
                    }
                    if ((i5 & 38347923) == 38347922) {
                    }
                    final DatePickerColors datePickerColors222 = datePickerColorsT;
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                function23 = function22;
                if ((i2 & 24576) != 0) {
                }
                i9 = i3 & 32;
                if (i9 == 0) {
                }
                fKN = f3;
                if ((1572864 & i2) == 0) {
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                }
                if ((i3 & 256) == 0) {
                }
                if ((i5 & 38347923) == 38347922) {
                }
                final DatePickerColors datePickerColors2222 = datePickerColorsT;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            modifier2 = modifier;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            function23 = function22;
            if ((i2 & 24576) != 0) {
            }
            i9 = i3 & 32;
            if (i9 == 0) {
            }
            fKN = f3;
            if ((1572864 & i2) == 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            if ((i3 & 256) == 0) {
            }
            if ((i5 & 38347923) == 38347922) {
            }
            final DatePickerColors datePickerColors22222 = datePickerColorsT;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        function23 = function22;
        if ((i2 & 24576) != 0) {
        }
        i9 = i3 & 32;
        if (i9 == 0) {
        }
        fKN = f3;
        if ((1572864 & i2) == 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if ((i5 & 38347923) == 38347922) {
        }
        final DatePickerColors datePickerColors222222 = datePickerColorsT;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
