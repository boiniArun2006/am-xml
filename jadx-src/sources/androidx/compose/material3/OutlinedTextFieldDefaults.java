package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Immutable
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u009e\u0002\u0010'\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00120\u0017¢\u0006\u0002\b\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0015\b\u0002\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001e\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010 \u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010!\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020$2\u0013\b\u0002\u0010&\u001a\r\u0012\u0004\u0012\u00020\u00120\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0004\b'\u0010(J8\u0010-\u001a\u00020$2\b\b\u0002\u0010)\u001a\u00020\u000f2\b\b\u0002\u0010*\u001a\u00020\u000f2\b\b\u0002\u0010+\u001a\u00020\u000f2\b\b\u0002\u0010,\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000bH\u0007¢\u0006\u0004\b/\u00100JÂ\u0003\u0010^\u001a\u00020\u000b2\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u0002012\b\b\u0002\u00104\u001a\u0002012\b\b\u0002\u00105\u001a\u0002012\b\b\u0002\u00106\u001a\u0002012\b\b\u0002\u00107\u001a\u0002012\b\b\u0002\u00108\u001a\u0002012\b\b\u0002\u00109\u001a\u0002012\b\b\u0002\u0010:\u001a\u0002012\b\b\u0002\u0010;\u001a\u0002012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\b\b\u0002\u0010>\u001a\u0002012\b\b\u0002\u0010?\u001a\u0002012\b\b\u0002\u0010@\u001a\u0002012\b\b\u0002\u0010A\u001a\u0002012\b\b\u0002\u0010B\u001a\u0002012\b\b\u0002\u0010C\u001a\u0002012\b\b\u0002\u0010D\u001a\u0002012\b\b\u0002\u0010E\u001a\u0002012\b\b\u0002\u0010F\u001a\u0002012\b\b\u0002\u0010G\u001a\u0002012\b\b\u0002\u0010H\u001a\u0002012\b\b\u0002\u0010I\u001a\u0002012\b\b\u0002\u0010J\u001a\u0002012\b\b\u0002\u0010K\u001a\u0002012\b\b\u0002\u0010L\u001a\u0002012\b\b\u0002\u0010M\u001a\u0002012\b\b\u0002\u0010N\u001a\u0002012\b\b\u0002\u0010O\u001a\u0002012\b\b\u0002\u0010P\u001a\u0002012\b\b\u0002\u0010Q\u001a\u0002012\b\b\u0002\u0010R\u001a\u0002012\b\b\u0002\u0010S\u001a\u0002012\b\b\u0002\u0010T\u001a\u0002012\b\b\u0002\u0010U\u001a\u0002012\b\b\u0002\u0010V\u001a\u0002012\b\b\u0002\u0010W\u001a\u0002012\b\b\u0002\u0010X\u001a\u0002012\b\b\u0002\u0010Y\u001a\u0002012\b\b\u0002\u0010Z\u001a\u0002012\b\b\u0002\u0010[\u001a\u0002012\b\b\u0002\u0010\\\u001a\u0002012\b\b\u0002\u0010]\u001a\u000201H\u0007ø\u0001\u0000¢\u0006\u0004\b^\u0010_JR\u0010`\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b`\u0010aR\u001d\u0010e\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b`\u0010b\u001a\u0004\bc\u0010dR\u001d\u0010g\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010b\u001a\u0004\bf\u0010dR\u001d\u0010i\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b/\u0010b\u001a\u0004\bh\u0010dR\u001d\u0010k\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b^\u0010b\u001a\u0004\bj\u0010dR\u0011\u0010\u000e\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0018\u0010q\u001a\u00020\u000b*\u00020n8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bo\u0010p\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006r"}, d2 = {"Landroidx/compose/material3/OutlinedTextFieldDefaults;", "", "<init>", "()V", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/TextFieldColors;", "colors", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/unit/Dp;", "focusedBorderThickness", "unfocusedBorderThickness", "", c.f62177j, "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "", "value", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "innerTextField", "singleLine", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", TtmlNode.RUBY_CONTAINER, "t", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", TtmlNode.START, "top", TtmlNode.END, "bottom", "J2", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "nr", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "selectionColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "O", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "rl", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "F", "mUb", "()F", "MinHeight", "gh", "MinWidth", "az", "UnfocusedBorderThickness", "xMQ", "FocusedBorderThickness", "qie", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/material3/ColorScheme;", "KN", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "defaultOutlinedTextFieldColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/OutlinedTextFieldDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1698:1\n77#2:1699\n1#3:1700\n148#4:1701\n148#4:1702\n148#4:1703\n148#4:1704\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/OutlinedTextFieldDefaults\n*L\n1087#1:1699\n736#1:1701\n742#1:1702\n745#1:1703\n748#1:1704\n*E\n"})
public final class OutlinedTextFieldDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final OutlinedTextFieldDefaults f26813n = new OutlinedTextFieldDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float MinHeight = Dp.KN(56);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float MinWidth = Dp.KN(280);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final float UnfocusedBorderThickness = Dp.KN(1);

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final float FocusedBorderThickness = Dp.KN(2);

    public final TextFieldColors O(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, SelectionColors selectionColors, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, Composer composer, int i2, int i3, int i5, int i7, int i8, int i9, int i10) {
        long j45;
        SelectionColors selectionColors2;
        long jUo = (i9 & 1) != 0 ? Color.INSTANCE.Uo() : j2;
        long jUo2 = (i9 & 2) != 0 ? Color.INSTANCE.Uo() : j3;
        long jUo3 = (i9 & 4) != 0 ? Color.INSTANCE.Uo() : j4;
        long jUo4 = (i9 & 8) != 0 ? Color.INSTANCE.Uo() : j5;
        long jUo5 = (i9 & 16) != 0 ? Color.INSTANCE.Uo() : j6;
        long jUo6 = (i9 & 32) != 0 ? Color.INSTANCE.Uo() : j7;
        long jUo7 = (i9 & 64) != 0 ? Color.INSTANCE.Uo() : j9;
        long j46 = jUo;
        long jUo8 = (i9 & 128) != 0 ? Color.INSTANCE.Uo() : j10;
        long jUo9 = (i9 & 256) != 0 ? Color.INSTANCE.Uo() : j11;
        long jUo10 = (i9 & 512) != 0 ? Color.INSTANCE.Uo() : j12;
        SelectionColors selectionColors3 = (i9 & 1024) != 0 ? null : selectionColors;
        long jUo11 = (i9 & 2048) != 0 ? Color.INSTANCE.Uo() : j13;
        long jUo12 = (i9 & 4096) != 0 ? Color.INSTANCE.Uo() : j14;
        long jUo13 = (i9 & 8192) != 0 ? Color.INSTANCE.Uo() : j15;
        long jUo14 = (i9 & 16384) != 0 ? Color.INSTANCE.Uo() : j16;
        long jUo15 = (32768 & i9) != 0 ? Color.INSTANCE.Uo() : j17;
        long jUo16 = (65536 & i9) != 0 ? Color.INSTANCE.Uo() : j18;
        long jUo17 = (131072 & i9) != 0 ? Color.INSTANCE.Uo() : j19;
        long jUo18 = (262144 & i9) != 0 ? Color.INSTANCE.Uo() : j20;
        long jUo19 = (524288 & i9) != 0 ? Color.INSTANCE.Uo() : j21;
        long jUo20 = (1048576 & i9) != 0 ? Color.INSTANCE.Uo() : j22;
        long jUo21 = (2097152 & i9) != 0 ? Color.INSTANCE.Uo() : j23;
        long jUo22 = (4194304 & i9) != 0 ? Color.INSTANCE.Uo() : j24;
        long jUo23 = (8388608 & i9) != 0 ? Color.INSTANCE.Uo() : j25;
        long jUo24 = (16777216 & i9) != 0 ? Color.INSTANCE.Uo() : j26;
        long jUo25 = (33554432 & i9) != 0 ? Color.INSTANCE.Uo() : j27;
        long jUo26 = (67108864 & i9) != 0 ? Color.INSTANCE.Uo() : j28;
        long jUo27 = (134217728 & i9) != 0 ? Color.INSTANCE.Uo() : j29;
        long jUo28 = (268435456 & i9) != 0 ? Color.INSTANCE.Uo() : j30;
        long jUo29 = (536870912 & i9) != 0 ? Color.INSTANCE.Uo() : j31;
        long jUo30 = (i9 & 1073741824) != 0 ? Color.INSTANCE.Uo() : j32;
        long jUo31 = (i10 & 1) != 0 ? Color.INSTANCE.Uo() : j33;
        long jUo32 = (i10 & 2) != 0 ? Color.INSTANCE.Uo() : j34;
        long jUo33 = (i10 & 4) != 0 ? Color.INSTANCE.Uo() : j35;
        long jUo34 = (i10 & 8) != 0 ? Color.INSTANCE.Uo() : j36;
        long jUo35 = (i10 & 16) != 0 ? Color.INSTANCE.Uo() : j37;
        long jUo36 = (i10 & 32) != 0 ? Color.INSTANCE.Uo() : j38;
        long jUo37 = (i10 & 64) != 0 ? Color.INSTANCE.Uo() : j39;
        long jUo38 = (i10 & 128) != 0 ? Color.INSTANCE.Uo() : j40;
        long jUo39 = (i10 & 256) != 0 ? Color.INSTANCE.Uo() : j41;
        long jUo40 = (i10 & 512) != 0 ? Color.INSTANCE.Uo() : j42;
        long jUo41 = (i10 & 1024) != 0 ? Color.INSTANCE.Uo() : j43;
        long jUo42 = (i10 & 2048) != 0 ? Color.INSTANCE.Uo() : j44;
        if (ComposerKt.v()) {
            j45 = jUo42;
            selectionColors2 = selectionColors3;
            ComposerKt.p5(1767617725, i2, i3, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1023)");
        } else {
            j45 = jUo42;
            selectionColors2 = selectionColors3;
        }
        TextFieldColors textFieldColorsRl = KN(MaterialTheme.f26164n.n(composer, 6), composer, (i8 >> 6) & 112).rl(j46, jUo2, jUo3, jUo4, jUo5, jUo6, jUo7, jUo8, jUo9, jUo10, selectionColors2, jUo11, jUo12, jUo13, jUo14, jUo15, jUo16, jUo17, jUo18, jUo19, jUo20, jUo21, jUo22, jUo23, jUo24, jUo25, jUo26, jUo27, jUo28, jUo29, jUo30, jUo31, jUo32, jUo33, jUo34, jUo35, jUo36, jUo37, jUo38, jUo39, jUo40, jUo41, j45);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return textFieldColorsRl;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(final String str, final Function2 function2, final boolean z2, final boolean z3, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z4, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, Function2 function28, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2 function29, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        int i8;
        boolean z5;
        int i9;
        Function2 function210;
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
        int i20;
        int i21;
        int i22;
        Function2 function211;
        final TextFieldColors textFieldColorsNr;
        PaddingValues paddingValuesUo;
        boolean z6;
        PaddingValues paddingValues2;
        Function2 function212;
        Function2 function2Nr;
        Composer composer2;
        Function2 function213;
        Function2 function214;
        Function2 function215;
        int i23;
        Function2 function216;
        final TextFieldColors textFieldColors2;
        Function2 function217;
        Function2 function218;
        PaddingValues paddingValues3;
        Composer composer3;
        final Function2 function219;
        final boolean z7;
        final Function2 function220;
        final Function2 function221;
        final Function2 function222;
        final Function2 function223;
        final Function2 function224;
        final PaddingValues paddingValues4;
        final Function2 function225;
        final Function2 function226;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-350442135);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.p5(str) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i7 |= composerKN.E2(function2) ? 32 : 16;
            }
            if ((i5 & 4) == 0) {
                i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i7 |= composerKN.n(z2) ? 256 : 128;
            }
            if ((i5 & 8) == 0) {
                i7 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    i7 |= composerKN.n(z3) ? 2048 : 1024;
                }
                int i24 = 8192;
                if ((i5 & 16) != 0) {
                    i7 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        i7 |= composerKN.p5(visualTransformation) ? 16384 : 8192;
                    }
                    if ((i5 & 32) == 0) {
                        i7 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        i7 |= composerKN.p5(interactionSource) ? 131072 : 65536;
                    }
                    i8 = i5 & 64;
                    if (i8 == 0) {
                        i7 |= 1572864;
                        z5 = z4;
                    } else {
                        z5 = z4;
                        if ((i2 & 1572864) == 0) {
                            i7 |= composerKN.n(z5) ? 1048576 : 524288;
                        }
                    }
                    i9 = i5 & 128;
                    if (i9 == 0) {
                        i7 |= 12582912;
                        function210 = function22;
                    } else {
                        function210 = function22;
                        if ((i2 & 12582912) == 0) {
                            i7 |= composerKN.E2(function210) ? 8388608 : 4194304;
                        }
                    }
                    i10 = i5 & 256;
                    if (i10 == 0) {
                        i7 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i7 |= composerKN.E2(function23) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    i11 = i5 & 512;
                    if (i11 == 0) {
                        i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    } else {
                        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i12 = i11;
                            i7 |= composerKN.E2(function24) ? 536870912 : 268435456;
                        }
                        i13 = i5 & 1024;
                        if (i13 != 0) {
                            i15 = i3 | 6;
                            i14 = i13;
                        } else if ((i3 & 6) == 0) {
                            i14 = i13;
                            i15 = i3 | (composerKN.E2(function25) ? 4 : 2);
                        } else {
                            i14 = i13;
                            i15 = i3;
                        }
                        i16 = i5 & 2048;
                        if (i16 != 0) {
                            i15 |= 48;
                            i17 = i16;
                        } else if ((i3 & 48) == 0) {
                            i17 = i16;
                            i15 |= composerKN.E2(function26) ? 32 : 16;
                        } else {
                            i17 = i16;
                        }
                        int i25 = i15;
                        i18 = i5 & 4096;
                        if (i18 != 0) {
                            i19 = i25 | RendererCapabilities.DECODER_SUPPORT_MASK;
                        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                            i19 = i25 | (composerKN.E2(function27) ? 256 : 128);
                        } else {
                            i19 = i25;
                        }
                        i20 = i5 & 8192;
                        if (i20 == 0) {
                            i21 = i19;
                            if ((i3 & 3072) == 0) {
                                i21 |= composerKN.E2(function28) ? 2048 : 1024;
                            }
                            if ((i3 & 24576) == 0) {
                                if ((i5 & 16384) == 0 && composerKN.p5(textFieldColors)) {
                                    i24 = 16384;
                                }
                                i21 |= i24;
                            }
                            if ((i3 & 196608) == 0) {
                                i21 |= ((i5 & 32768) == 0 && composerKN.p5(paddingValues)) ? 131072 : 65536;
                            }
                            i22 = i5 & 65536;
                            if (i22 == 0) {
                                i21 |= 1572864;
                            } else if ((i3 & 1572864) == 0) {
                                i21 |= composerKN.E2(function29) ? 1048576 : 524288;
                            }
                            if ((i5 & 131072) == 0) {
                                i21 |= 12582912;
                            } else if ((i3 & 12582912) == 0) {
                                i21 |= composerKN.p5(this) ? 8388608 : 4194304;
                            }
                            if ((i7 & 306783379) != 306783378 && (i21 & 4793491) == 4793490 && composerKN.xMQ()) {
                                composerKN.wTp();
                                function226 = function23;
                                function221 = function25;
                                function219 = function26;
                                function222 = function27;
                                function225 = function28;
                                textFieldColors2 = textFieldColors;
                                paddingValues4 = paddingValues;
                                function223 = function29;
                                composer3 = composerKN;
                                z7 = z5;
                                function224 = function210;
                                function220 = function24;
                            } else {
                                composerKN.e();
                                if ((i2 & 1) != 0 || composerKN.rV9()) {
                                    final boolean z9 = i8 == 0 ? false : z5;
                                    if (i9 != 0) {
                                        function210 = null;
                                    }
                                    Function2 function227 = i10 == 0 ? null : function23;
                                    Function2 function228 = i12 == 0 ? null : function24;
                                    Function2 function229 = i14 == 0 ? null : function25;
                                    function211 = i17 == 0 ? null : function26;
                                    Function2 function230 = i18 == 0 ? null : function27;
                                    Function2 function231 = i20 == 0 ? function28 : null;
                                    if ((i5 & 16384) == 0) {
                                        textFieldColorsNr = nr(composerKN, (i21 >> 21) & 14);
                                        i21 &= -57345;
                                    } else {
                                        textFieldColorsNr = textFieldColors;
                                    }
                                    if ((i5 & 32768) == 0) {
                                        paddingValuesUo = Uo(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        i21 &= -458753;
                                    } else {
                                        paddingValuesUo = paddingValues;
                                    }
                                    if (i22 == 0) {
                                        paddingValues2 = paddingValuesUo;
                                        z6 = z9;
                                        function212 = function231;
                                        function2Nr = ComposableLambdaKt.nr(-1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                n(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer4, int i26) {
                                                if ((i26 & 3) == 2 && composer4.xMQ()) {
                                                    composer4.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-1448570018, i26, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:873)");
                                                }
                                                OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.f26813n;
                                                outlinedTextFieldDefaults.n(z2, z9, interactionSource, Modifier.INSTANCE, textFieldColorsNr, outlinedTextFieldDefaults.qie(composer4, 6), outlinedTextFieldDefaults.xMQ(), outlinedTextFieldDefaults.az(), composer4, 114822144, 0);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54);
                                    } else {
                                        z6 = z9;
                                        paddingValues2 = paddingValuesUo;
                                        function212 = function231;
                                        function2Nr = function29;
                                    }
                                    composer2 = composerKN;
                                    function213 = function228;
                                    function214 = function210;
                                    function215 = function230;
                                    i23 = i21;
                                    function216 = function212;
                                    textFieldColors2 = textFieldColorsNr;
                                    function217 = function227;
                                    function218 = function229;
                                    paddingValues3 = paddingValues2;
                                } else {
                                    composerKN.wTp();
                                    if ((i5 & 16384) != 0) {
                                        i21 &= -57345;
                                    }
                                    if ((32768 & i5) != 0) {
                                        i21 &= -458753;
                                    }
                                    function217 = function23;
                                    function213 = function24;
                                    function211 = function26;
                                    function215 = function27;
                                    function216 = function28;
                                    textFieldColors2 = textFieldColors;
                                    paddingValues3 = paddingValues;
                                    function2Nr = function29;
                                    composer2 = composerKN;
                                    z6 = z5;
                                    function214 = function210;
                                    i23 = i21;
                                    function218 = function25;
                                }
                                composer2.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-350442135, i7, i23, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:884)");
                                }
                                boolean z10 = z6;
                                Function2 function232 = function2Nr;
                                int i26 = i7 << 3;
                                int i27 = i7 >> 3;
                                int i28 = (i27 & 7168) | (i26 & 896) | (i26 & 112) | 6;
                                int i29 = i7 >> 9;
                                int i30 = i23 << 21;
                                int i31 = ((i23 >> 9) & 14) | ((i7 >> 6) & 112) | (i7 & 896) | (i29 & 7168) | (57344 & i27) | (458752 & i23) | ((i23 << 6) & 3670016) | ((i23 << 3) & 29360128);
                                Function2 function233 = function211;
                                Composer composer4 = composer2;
                                TextFieldImplKt.n(TextFieldType.Outlined, str, function2, visualTransformation, function214, function217, function213, function218, function233, function215, function216, z3, z2, z10, interactionSource, paddingValues3, textFieldColors2, function232, composer4, i28 | (i29 & 57344) | (i29 & 458752) | (i29 & 3670016) | (i30 & 29360128) | (i30 & 234881024) | (i30 & 1879048192), i31, 0);
                                composer3 = composer4;
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                function219 = function233;
                                z7 = z10;
                                function220 = function213;
                                function221 = function218;
                                function222 = function215;
                                function223 = function232;
                                function224 = function214;
                                paddingValues4 = paddingValues3;
                                function225 = function216;
                                function226 = function217;
                            }
                            scopeUpdateScopeGh = composer3.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        n(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer5, int i32) {
                                        this.f26844n.t(str, function2, z2, z3, visualTransformation, interactionSource, z7, function224, function226, function220, function221, function219, function222, function225, textFieldColors2, paddingValues4, function223, composer5, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i21 = i19 | 3072;
                        if ((i3 & 24576) == 0) {
                        }
                        if ((i3 & 196608) == 0) {
                        }
                        i22 = i5 & 65536;
                        if (i22 == 0) {
                        }
                        if ((i5 & 131072) == 0) {
                        }
                        if ((i7 & 306783379) != 306783378) {
                            composerKN.e();
                            if ((i2 & 1) != 0) {
                                if (i8 == 0) {
                                }
                                if (i9 != 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (i18 == 0) {
                                }
                                if (i20 == 0) {
                                }
                                if ((i5 & 16384) == 0) {
                                }
                                if ((i5 & 32768) == 0) {
                                }
                                if (i22 == 0) {
                                }
                                composer2 = composerKN;
                                function213 = function228;
                                function214 = function210;
                                function215 = function230;
                                i23 = i21;
                                function216 = function212;
                                textFieldColors2 = textFieldColorsNr;
                                function217 = function227;
                                function218 = function229;
                                paddingValues3 = paddingValues2;
                                composer2.S();
                                if (ComposerKt.v()) {
                                }
                                boolean z102 = z6;
                                Function2 function2322 = function2Nr;
                                int i262 = i7 << 3;
                                int i272 = i7 >> 3;
                                int i282 = (i272 & 7168) | (i262 & 896) | (i262 & 112) | 6;
                                int i292 = i7 >> 9;
                                int i302 = i23 << 21;
                                int i312 = ((i23 >> 9) & 14) | ((i7 >> 6) & 112) | (i7 & 896) | (i292 & 7168) | (57344 & i272) | (458752 & i23) | ((i23 << 6) & 3670016) | ((i23 << 3) & 29360128);
                                Function2 function2332 = function211;
                                Composer composer42 = composer2;
                                TextFieldImplKt.n(TextFieldType.Outlined, str, function2, visualTransformation, function214, function217, function213, function218, function2332, function215, function216, z3, z2, z102, interactionSource, paddingValues3, textFieldColors2, function2322, composer42, i282 | (i292 & 57344) | (i292 & 458752) | (i292 & 3670016) | (i302 & 29360128) | (i302 & 234881024) | (i302 & 1879048192), i312, 0);
                                composer3 = composer42;
                                if (ComposerKt.v()) {
                                }
                                function219 = function2332;
                                z7 = z102;
                                function220 = function213;
                                function221 = function218;
                                function222 = function215;
                                function223 = function2322;
                                function224 = function214;
                                paddingValues4 = paddingValues3;
                                function225 = function216;
                                function226 = function217;
                            }
                        }
                        scopeUpdateScopeGh = composer3.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i12 = i11;
                    i13 = i5 & 1024;
                    if (i13 != 0) {
                    }
                    i16 = i5 & 2048;
                    if (i16 != 0) {
                    }
                    int i252 = i15;
                    i18 = i5 & 4096;
                    if (i18 != 0) {
                    }
                    i20 = i5 & 8192;
                    if (i20 == 0) {
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    if ((i3 & 196608) == 0) {
                    }
                    i22 = i5 & 65536;
                    if (i22 == 0) {
                    }
                    if ((i5 & 131072) == 0) {
                    }
                    if ((i7 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeGh = composer3.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                if ((i5 & 32) == 0) {
                }
                i8 = i5 & 64;
                if (i8 == 0) {
                }
                i9 = i5 & 128;
                if (i9 == 0) {
                }
                i10 = i5 & 256;
                if (i10 == 0) {
                }
                i11 = i5 & 512;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i5 & 1024;
                if (i13 != 0) {
                }
                i16 = i5 & 2048;
                if (i16 != 0) {
                }
                int i2522 = i15;
                i18 = i5 & 4096;
                if (i18 != 0) {
                }
                i20 = i5 & 8192;
                if (i20 == 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                if ((i3 & 196608) == 0) {
                }
                i22 = i5 & 65536;
                if (i22 == 0) {
                }
                if ((i5 & 131072) == 0) {
                }
                if ((i7 & 306783379) != 306783378) {
                }
                scopeUpdateScopeGh = composer3.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            int i242 = 8192;
            if ((i5 & 16) != 0) {
            }
            if ((i5 & 32) == 0) {
            }
            i8 = i5 & 64;
            if (i8 == 0) {
            }
            i9 = i5 & 128;
            if (i9 == 0) {
            }
            i10 = i5 & 256;
            if (i10 == 0) {
            }
            i11 = i5 & 512;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i5 & 1024;
            if (i13 != 0) {
            }
            i16 = i5 & 2048;
            if (i16 != 0) {
            }
            int i25222 = i15;
            i18 = i5 & 4096;
            if (i18 != 0) {
            }
            i20 = i5 & 8192;
            if (i20 == 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            if ((i3 & 196608) == 0) {
            }
            i22 = i5 & 65536;
            if (i22 == 0) {
            }
            if ((i5 & 131072) == 0) {
            }
            if ((i7 & 306783379) != 306783378) {
            }
            scopeUpdateScopeGh = composer3.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        if ((i5 & 4) == 0) {
        }
        if ((i5 & 8) == 0) {
        }
        int i2422 = 8192;
        if ((i5 & 16) != 0) {
        }
        if ((i5 & 32) == 0) {
        }
        i8 = i5 & 64;
        if (i8 == 0) {
        }
        i9 = i5 & 128;
        if (i9 == 0) {
        }
        i10 = i5 & 256;
        if (i10 == 0) {
        }
        i11 = i5 & 512;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i5 & 1024;
        if (i13 != 0) {
        }
        i16 = i5 & 2048;
        if (i16 != 0) {
        }
        int i252222 = i15;
        i18 = i5 & 4096;
        if (i18 != 0) {
        }
        i20 = i5 & 8192;
        if (i20 == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if ((i3 & 196608) == 0) {
        }
        i22 = i5 & 65536;
        if (i22 == 0) {
        }
        if ((i5 & 131072) == 0) {
        }
        if ((i7 & 306783379) != 306783378) {
        }
        scopeUpdateScopeGh = composer3.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public static /* synthetic */ PaddingValues Uo(OutlinedTextFieldDefaults outlinedTextFieldDefaults, float f3, float f4, float f5, float f6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = TextFieldImplKt.r();
        }
        if ((i2 & 2) != 0) {
            f4 = TextFieldImplKt.r();
        }
        if ((i2 & 4) != 0) {
            f5 = TextFieldImplKt.r();
        }
        if ((i2 & 8) != 0) {
            f6 = TextFieldImplKt.r();
        }
        return outlinedTextFieldDefaults.J2(f3, f4, f5, f6);
    }

    public final TextFieldColors KN(ColorScheme colorScheme, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-292363577, i2, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-defaultOutlinedTextFieldColors> (TextFieldDefaults.kt:1071)");
        }
        TextFieldColors defaultOutlinedTextFieldColorsCached = colorScheme.getDefaultOutlinedTextFieldColorsCached();
        composer.eF(1540400102);
        if (defaultOutlinedTextFieldColorsCached == null) {
            OutlinedTextFieldTokens outlinedTextFieldTokens = OutlinedTextFieldTokens.f29795n;
            long jUo = ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.ck());
            long jUo2 = ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.S());
            long jAz = Color.az(ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.t()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            long jUo3 = ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.mUb());
            Color.Companion companion = Color.INSTANCE;
            TextFieldColors textFieldColors = new TextFieldColors(jUo, jUo2, jAz, jUo3, companion.J2(), companion.J2(), companion.J2(), companion.J2(), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.n()), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.xMQ()), (SelectionColors) composer.ty(TextSelectionColorsKt.rl()), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.o()), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.te()), Color.az(ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.J2()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.az()), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.r()), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.g()), Color.az(ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.O()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.qie()), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.XQ()), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.fD()), Color.az(ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.KN()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.HI()), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.Ik()), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.nY()), Color.az(ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.nr()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.gh()), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.WPU()), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.WPU()), Color.az(ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.t()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.WPU()), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.Z()), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.iF()), Color.az(ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.Uo()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.ty()), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.aYN()), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.aYN()), Color.az(ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.aYN()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.aYN()), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.ViF()), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.ViF()), Color.az(ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.ViF()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, outlinedTextFieldTokens.ViF()), null);
            colorScheme.f(textFieldColors);
            defaultOutlinedTextFieldColorsCached = textFieldColors;
        }
        composer.Xw();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return defaultOutlinedTextFieldColorsCached;
    }

    public final float az() {
        return UnfocusedBorderThickness;
    }

    public final float gh() {
        return MinWidth;
    }

    public final float mUb() {
        return MinHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(final boolean z2, final boolean z3, final InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f3, float f4, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        TextFieldColors textFieldColors2;
        Shape shape2;
        float f5;
        float f6;
        TextFieldColors textFieldColorsNr;
        Shape shapeQie;
        float f7;
        Modifier modifier3;
        int i7;
        TextFieldColors textFieldColors3;
        Shape shape3;
        float f8;
        float f9;
        Composer composer2;
        final float f10;
        final float f11;
        final Shape shape4;
        final TextFieldColors textFieldColors4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1035477640);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.n(z3) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(interactionSource) ? 256 : 128;
        }
        int i8 = i3 & 8;
        if (i8 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 2048 : 1024;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    textFieldColors2 = textFieldColors;
                    int i9 = composerKN.p5(textFieldColors2) ? 16384 : 8192;
                    i5 |= i9;
                } else {
                    textFieldColors2 = textFieldColors;
                }
                i5 |= i9;
            } else {
                textFieldColors2 = textFieldColors;
            }
            if ((196608 & i2) != 0) {
                if ((i3 & 32) == 0) {
                    shape2 = shape;
                    int i10 = composerKN.p5(shape2) ? 131072 : 65536;
                    i5 |= i10;
                } else {
                    shape2 = shape;
                }
                i5 |= i10;
            } else {
                shape2 = shape;
            }
            if ((1572864 & i2) != 0) {
                if ((i3 & 64) == 0) {
                    f5 = f3;
                    int i11 = composerKN.rl(f5) ? 1048576 : 524288;
                    i5 |= i11;
                } else {
                    f5 = f3;
                }
                i5 |= i11;
            } else {
                f5 = f3;
            }
            if ((12582912 & i2) != 0) {
                if ((i3 & 128) == 0) {
                    f6 = f4;
                    int i12 = composerKN.rl(f6) ? 8388608 : 4194304;
                    i5 |= i12;
                } else {
                    f6 = f4;
                }
                i5 |= i12;
            } else {
                f6 = f4;
            }
            if ((i3 & 256) == 0) {
                i5 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                i5 |= composerKN.p5(this) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
            }
            if ((38347923 & i5) == 38347922 || !composerKN.xMQ()) {
                composerKN.e();
                if ((i2 & 1) != 0 || composerKN.rV9()) {
                    Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 16) == 0) {
                        textFieldColorsNr = nr(composerKN, (i5 >> 24) & 14);
                        i5 &= -57345;
                    } else {
                        textFieldColorsNr = textFieldColors2;
                    }
                    if ((i3 & 32) == 0) {
                        shapeQie = f26813n.qie(composerKN, 6);
                        i5 &= -458753;
                    } else {
                        shapeQie = shape2;
                    }
                    if ((i3 & 64) == 0) {
                        f7 = FocusedBorderThickness;
                        i5 &= -3670017;
                    } else {
                        f7 = f5;
                    }
                    if ((i3 & 128) == 0) {
                        shape3 = shapeQie;
                        f9 = UnfocusedBorderThickness;
                        modifier3 = modifier5;
                        i7 = i5 & (-29360129);
                        textFieldColors3 = textFieldColorsNr;
                        f8 = f7;
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1035477640, i7, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.Container (TextFieldDefaults.kt:776)");
                        }
                        int i13 = i7 >> 6;
                        boolean zBooleanValue = ((Boolean) FocusInteractionKt.n(interactionSource, composerKN, i13 & 14).getValue()).booleanValue();
                        State stateKN = TextFieldImplKt.KN(z2, z3, zBooleanValue, textFieldColors3, f8, f9, composerKN, (i13 & 458752) | ((i7 >> 3) & 7168) | (i7 & 126) | (57344 & i13));
                        Modifier modifier6 = modifier3;
                        Shape shape5 = shape3;
                        final State stateN = SingleValueAnimationKt.n(textFieldColors3.n(z2, z3, zBooleanValue), AnimationSpecKt.ty(150, 0, null, 6, null), null, null, composerKN, 48, 12);
                        composer2 = composerKN;
                        BoxKt.n(TextFieldImplKt.XQ(BorderKt.O(modifier6, (BorderStroke) stateKN.getValue(), shape5), new TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(new PropertyReference0Impl(stateN) { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$Container$1
                            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                            public Object get() {
                                return ((State) this.receiver).getValue();
                            }
                        }), shape5), composer2, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        f10 = f8;
                        f11 = f9;
                        shape4 = shape5;
                        textFieldColors4 = textFieldColors3;
                        modifier4 = modifier6;
                    } else {
                        modifier3 = modifier5;
                        i7 = i5;
                        textFieldColors3 = textFieldColorsNr;
                        shape3 = shapeQie;
                        f8 = f7;
                    }
                } else {
                    composerKN.wTp();
                    if ((i3 & 16) != 0) {
                        i5 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        i5 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        i5 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        i5 &= -29360129;
                    }
                    i7 = i5;
                    textFieldColors3 = textFieldColors2;
                    f8 = f5;
                    shape3 = shape2;
                    modifier3 = modifier2;
                }
                f9 = f6;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                int i132 = i7 >> 6;
                boolean zBooleanValue2 = ((Boolean) FocusInteractionKt.n(interactionSource, composerKN, i132 & 14).getValue()).booleanValue();
                State stateKN2 = TextFieldImplKt.KN(z2, z3, zBooleanValue2, textFieldColors3, f8, f9, composerKN, (i132 & 458752) | ((i7 >> 3) & 7168) | (i7 & 126) | (57344 & i132));
                Modifier modifier62 = modifier3;
                Shape shape52 = shape3;
                final Object stateN2 = SingleValueAnimationKt.n(textFieldColors3.n(z2, z3, zBooleanValue2), AnimationSpecKt.ty(150, 0, null, 6, null), null, null, composerKN, 48, 12);
                composer2 = composerKN;
                BoxKt.n(TextFieldImplKt.XQ(BorderKt.O(modifier62, (BorderStroke) stateKN2.getValue(), shape52), new TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(new PropertyReference0Impl(stateN2) { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$Container$1
                    @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                    public Object get() {
                        return ((State) this.receiver).getValue();
                    }
                }), shape52), composer2, 0);
                if (ComposerKt.v()) {
                }
                f10 = f8;
                f11 = f9;
                shape4 = shape52;
                textFieldColors4 = textFieldColors3;
                modifier4 = modifier62;
            } else {
                composerKN.wTp();
                float f12 = f5;
                composer2 = composerKN;
                f10 = f12;
                modifier4 = modifier2;
                textFieldColors4 = textFieldColors2;
                shape4 = shape2;
                f11 = f6;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$Container$2
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
                        this.f26820n.n(z2, z3, interactionSource, modifier4, textFieldColors4, shape4, f10, f11, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 3072;
        modifier2 = modifier;
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        if ((1572864 & i2) != 0) {
        }
        if ((12582912 & i2) != 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if ((38347923 & i5) == 38347922) {
            composerKN.e();
            if ((i2 & 1) != 0) {
                if (i8 == 0) {
                }
                if ((i3 & 16) == 0) {
                }
                if ((i3 & 32) == 0) {
                }
                if ((i3 & 64) == 0) {
                }
                if ((i3 & 128) == 0) {
                }
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void rl(final boolean z2, final boolean z3, final InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f3, float f4, Composer composer, final int i2, final int i3) {
        boolean z4;
        int i5;
        InteractionSource interactionSource2;
        TextFieldColors textFieldColorsNr;
        Shape shapeQie;
        float f5;
        float f6;
        final TextFieldColors textFieldColors2;
        final Shape shape2;
        final float f7;
        final float f8;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1461761386);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            z4 = z2;
        } else if ((i2 & 6) == 0) {
            z4 = z2;
            i5 = (composerKN.n(z4) ? 4 : 2) | i2;
        } else {
            z4 = z2;
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerKN.n(z3) ? 32 : 16;
            }
            if ((i3 & 4) != 0) {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    interactionSource2 = interactionSource;
                    i5 |= composerKN.p5(interactionSource2) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        textFieldColorsNr = textFieldColors;
                        int i7 = composerKN.p5(textFieldColorsNr) ? 2048 : 1024;
                        i5 |= i7;
                    } else {
                        textFieldColorsNr = textFieldColors;
                    }
                    i5 |= i7;
                } else {
                    textFieldColorsNr = textFieldColors;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        shapeQie = shape;
                        int i8 = composerKN.p5(shapeQie) ? 16384 : 8192;
                        i5 |= i8;
                    } else {
                        shapeQie = shape;
                    }
                    i5 |= i8;
                } else {
                    shapeQie = shape;
                }
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        f5 = f3;
                        int i9 = composerKN.rl(f5) ? 131072 : 65536;
                        i5 |= i9;
                    } else {
                        f5 = f3;
                    }
                    i5 |= i9;
                } else {
                    f5 = f3;
                }
                if ((1572864 & i2) == 0) {
                    if ((i3 & 64) == 0) {
                        f6 = f4;
                        int i10 = composerKN.rl(f6) ? 1048576 : 524288;
                        i5 |= i10;
                    } else {
                        f6 = f4;
                    }
                    i5 |= i10;
                } else {
                    f6 = f4;
                }
                if ((i3 & 128) != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i5 |= composerKN.p5(this) ? 8388608 : 4194304;
                }
                if ((4793491 & i5) == 4793490 && composerKN.xMQ()) {
                    composerKN.wTp();
                    textFieldColors2 = textFieldColorsNr;
                    shape2 = shapeQie;
                    f7 = f5;
                    f8 = f6;
                } else {
                    composerKN.e();
                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                        if ((i3 & 8) != 0) {
                            textFieldColorsNr = nr(composerKN, (i5 >> 21) & 14);
                            i5 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            shapeQie = f26813n.qie(composerKN, 6);
                            i5 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            f5 = FocusedBorderThickness;
                            i5 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            f6 = UnfocusedBorderThickness;
                            i5 &= -3670017;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1461761386, i5, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox (TextFieldDefaults.kt:1179)");
                        }
                        int i11 = (i5 & 14) | 3072 | (i5 & 112) | (i5 & 896);
                        int i12 = i5 << 3;
                        int i13 = i11 | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (i12 & 234881024);
                        InteractionSource interactionSource3 = interactionSource2;
                        textFieldColors2 = textFieldColorsNr;
                        shape2 = shapeQie;
                        f7 = f5;
                        f8 = f6;
                        n(z4, z3, interactionSource3, Modifier.INSTANCE, textFieldColors2, shape2, f7, f8, composerKN, i13, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    } else {
                        composerKN.wTp();
                        if ((i3 & 8) != 0) {
                            i5 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i5 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            i5 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            i5 &= -3670017;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        int i112 = (i5 & 14) | 3072 | (i5 & 112) | (i5 & 896);
                        int i122 = i5 << 3;
                        int i132 = i112 | (57344 & i122) | (458752 & i122) | (3670016 & i122) | (29360128 & i122) | (i122 & 234881024);
                        InteractionSource interactionSource32 = interactionSource2;
                        textFieldColors2 = textFieldColorsNr;
                        shape2 = shapeQie;
                        f7 = f5;
                        f8 = f6;
                        n(z4, z3, interactionSource32, Modifier.INSTANCE, textFieldColors2, shape2, f7, f8, composerKN, i132, 0);
                        if (ComposerKt.v()) {
                        }
                    }
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$ContainerBox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            n(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer2, int i14) {
                            this.f26828n.rl(z2, z3, interactionSource, textFieldColors2, shape2, f7, f8, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            interactionSource2 = interactionSource;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            if ((1572864 & i2) == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((4793491 & i5) == 4793490) {
                composerKN.e();
                if ((i2 & 1) != 0) {
                    if ((i3 & 8) != 0) {
                    }
                    if ((i3 & 16) != 0) {
                    }
                    if ((i3 & 32) != 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    int i1122 = (i5 & 14) | 3072 | (i5 & 112) | (i5 & 896);
                    int i1222 = i5 << 3;
                    int i1322 = i1122 | (57344 & i1222) | (458752 & i1222) | (3670016 & i1222) | (29360128 & i1222) | (i1222 & 234881024);
                    InteractionSource interactionSource322 = interactionSource2;
                    textFieldColors2 = textFieldColorsNr;
                    shape2 = shapeQie;
                    f7 = f5;
                    f8 = f6;
                    n(z4, z3, interactionSource322, Modifier.INSTANCE, textFieldColors2, shape2, f7, f8, composerKN, i1322, 0);
                    if (ComposerKt.v()) {
                    }
                }
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        if ((i3 & 4) != 0) {
        }
        interactionSource2 = interactionSource;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((4793491 & i5) == 4793490) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public final float xMQ() {
        return FocusedBorderThickness;
    }

    private OutlinedTextFieldDefaults() {
    }

    public final PaddingValues J2(float start, float top, float end, float bottom) {
        return PaddingKt.nr(start, top, end, bottom);
    }

    public final TextFieldColors nr(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-471651810, i2, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:921)");
        }
        TextFieldColors textFieldColorsKN = KN(MaterialTheme.f26164n.n(composer, 6), composer, (i2 << 3) & 112);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return textFieldColorsKN;
    }

    public final Shape qie(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1066756961, i2, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:729)");
        }
        Shape shapeO = ShapesKt.O(OutlinedTextFieldTokens.f29795n.rl(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }
}
