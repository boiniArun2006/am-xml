package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Immutable
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014JJ\u0010\u0015\u001a\u00020\t*\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J¨\u0002\u0010)\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00120\u0019¢\u0006\u0002\b\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0015\b\u0002\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0015\b\u0002\u0010 \u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0015\b\u0002\u0010!\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0015\b\u0002\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0015\b\u0002\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0015\b\u0002\u0010$\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020&2\u0013\b\u0002\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00120\u0019¢\u0006\u0002\b\u001aH\u0007¢\u0006\u0004\b)\u0010*J8\u0010/\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020\u000f2\b\b\u0002\u0010,\u001a\u00020\u000f2\b\b\u0002\u0010-\u001a\u00020\u000f2\b\b\u0002\u0010.\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b/\u00100J8\u00101\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020\u000f2\b\b\u0002\u0010-\u001a\u00020\u000f2\b\b\u0002\u0010,\u001a\u00020\u000f2\b\b\u0002\u0010.\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b1\u00100J:\u00102\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020\u000f2\b\b\u0002\u0010-\u001a\u00020\u000f2\b\b\u0002\u0010,\u001a\u00020\u000f2\b\b\u0002\u0010.\u001a\u00020\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b2\u00100J\u000f\u00103\u001a\u00020\u000bH\u0007¢\u0006\u0004\b3\u00104JÂ\u0003\u0010b\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u0002052\b\b\u0002\u00107\u001a\u0002052\b\b\u0002\u00108\u001a\u0002052\b\b\u0002\u00109\u001a\u0002052\b\b\u0002\u0010:\u001a\u0002052\b\b\u0002\u0010;\u001a\u0002052\b\b\u0002\u0010<\u001a\u0002052\b\b\u0002\u0010=\u001a\u0002052\b\b\u0002\u0010>\u001a\u0002052\b\b\u0002\u0010?\u001a\u0002052\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@2\b\b\u0002\u0010B\u001a\u0002052\b\b\u0002\u0010C\u001a\u0002052\b\b\u0002\u0010D\u001a\u0002052\b\b\u0002\u0010E\u001a\u0002052\b\b\u0002\u0010F\u001a\u0002052\b\b\u0002\u0010G\u001a\u0002052\b\b\u0002\u0010H\u001a\u0002052\b\b\u0002\u0010I\u001a\u0002052\b\b\u0002\u0010J\u001a\u0002052\b\b\u0002\u0010K\u001a\u0002052\b\b\u0002\u0010L\u001a\u0002052\b\b\u0002\u0010M\u001a\u0002052\b\b\u0002\u0010N\u001a\u0002052\b\b\u0002\u0010O\u001a\u0002052\b\b\u0002\u0010P\u001a\u0002052\b\b\u0002\u0010Q\u001a\u0002052\b\b\u0002\u0010R\u001a\u0002052\b\b\u0002\u0010S\u001a\u0002052\b\b\u0002\u0010T\u001a\u0002052\b\b\u0002\u0010U\u001a\u0002052\b\b\u0002\u0010V\u001a\u0002052\b\b\u0002\u0010W\u001a\u0002052\b\b\u0002\u0010X\u001a\u0002052\b\b\u0002\u0010Y\u001a\u0002052\b\b\u0002\u0010Z\u001a\u0002052\b\b\u0002\u0010[\u001a\u0002052\b\b\u0002\u0010\\\u001a\u0002052\b\b\u0002\u0010]\u001a\u0002052\b\b\u0002\u0010^\u001a\u0002052\b\b\u0002\u0010_\u001a\u0002052\b\b\u0002\u0010`\u001a\u0002052\b\b\u0002\u0010a\u001a\u000205H\u0007ø\u0001\u0000¢\u0006\u0004\bb\u0010cJ9\u0010d\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\bd\u0010eR\u001d\u0010i\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bd\u0010f\u001a\u0004\bg\u0010hR\u001d\u0010k\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b)\u0010f\u001a\u0004\bj\u0010hR\u001d\u0010m\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b3\u0010f\u001a\u0004\bl\u0010hR\u001d\u0010o\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bb\u0010f\u001a\u0004\bn\u0010hR&\u0010r\u001a\u00020\u000f8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b/\u0010f\u0012\u0004\bq\u0010\u0003\u001a\u0004\bp\u0010hR&\u0010v\u001a\u00020\u000f8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bs\u0010f\u0012\u0004\bu\u0010\u0003\u001a\u0004\bt\u0010hR\u0011\u0010\u000e\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0018\u0010|\u001a\u00020\u000b*\u00020y8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006}"}, d2 = {"Landroidx/compose/material3/TextFieldDefaults;", "", "<init>", "()V", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/TextFieldColors;", "colors", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/unit/Dp;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "", c.f62177j, "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "ck", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "", "value", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "innerTextField", "singleLine", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", TtmlNode.RUBY_CONTAINER, "t", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", TtmlNode.START, TtmlNode.END, "top", "bottom", "J2", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "KN", "Ik", "nr", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "selectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "O", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "rl", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "F", "qie", "()F", "MinHeight", "az", "MinWidth", "HI", "UnfocusedIndicatorThickness", "gh", "FocusedIndicatorThickness", "getUnfocusedBorderThickness-D9Ej5fM", "getUnfocusedBorderThickness-D9Ej5fM$annotations", "UnfocusedBorderThickness", "Uo", "getFocusedBorderThickness-D9Ej5fM", "getFocusedBorderThickness-D9Ej5fM$annotations", "FocusedBorderThickness", "ty", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/material3/ColorScheme;", "mUb", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "defaultTextFieldColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldDefaults\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1698:1\n135#2:1699\n148#3:1700\n148#3:1703\n148#3:1704\n148#3:1705\n148#3:1706\n77#4:1701\n1#5:1702\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldDefaults\n*L\n160#1:1699\n330#1:1700\n67#1:1703\n73#1:1704\n76#1:1705\n79#1:1706\n502#1:1701\n*E\n"})
public final class TextFieldDefaults {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final float UnfocusedBorderThickness;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final float FocusedIndicatorThickness;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private static final float FocusedBorderThickness;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final float UnfocusedIndicatorThickness;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TextFieldDefaults f28299n = new TextFieldDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float MinHeight = Dp.KN(56);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float MinWidth = Dp.KN(280);

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
            ComposerKt.p5(1513344955, i2, i3, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:438)");
        } else {
            j45 = jUo42;
            selectionColors2 = selectionColors3;
        }
        TextFieldColors textFieldColorsRl = mUb(MaterialTheme.f26164n.n(composer, 6), composer, (i8 >> 6) & 112).rl(j46, jUo2, jUo3, jUo4, jUo5, jUo6, jUo7, jUo8, jUo9, jUo10, selectionColors2, jUo11, jUo12, jUo13, jUo14, jUo15, jUo16, jUo17, jUo18, jUo19, jUo20, jUo21, jUo22, jUo23, jUo24, jUo25, jUo26, jUo27, jUo28, jUo29, jUo30, jUo31, jUo32, jUo33, jUo34, jUo35, jUo36, jUo37, jUo38, jUo39, jUo40, jUo41, j45);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return textFieldColorsRl;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(final String str, final Function2 function2, final boolean z2, final boolean z3, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z4, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, Function2 function28, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2 function29, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        boolean z5;
        VisualTransformation visualTransformation2;
        InteractionSource interactionSource2;
        int i8;
        boolean z6;
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
        Shape shapeTy;
        TextFieldColors textFieldColorsNr;
        PaddingValues paddingValuesXMQ;
        PaddingValues paddingValues2;
        boolean z7;
        final Function2 function211;
        final Function2 function212;
        final Function2 function213;
        final Function2 function214;
        Function2 function2Nr;
        TextFieldColors textFieldColors2;
        Shape shape2;
        final Function2 function215;
        int i23;
        final Function2 function216;
        final Function2 function217;
        PaddingValues paddingValues3;
        Composer composer2;
        final Shape shape3;
        final boolean z9;
        final PaddingValues paddingValues4;
        final TextFieldColors textFieldColors3;
        final Function2 function218;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(289640444);
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
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    z5 = z2;
                    i7 |= composerKN.n(z5) ? 256 : 128;
                }
                if ((i5 & 8) != 0) {
                    i7 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        i7 |= composerKN.n(z3) ? 2048 : 1024;
                    }
                    int i24 = 8192;
                    if ((i5 & 16) == 0) {
                        i7 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            visualTransformation2 = visualTransformation;
                            i7 |= composerKN.p5(visualTransformation2) ? 16384 : 8192;
                        }
                        if ((i5 & 32) != 0) {
                            i7 |= 196608;
                            interactionSource2 = interactionSource;
                        } else {
                            interactionSource2 = interactionSource;
                            if ((i2 & 196608) == 0) {
                                i7 |= composerKN.p5(interactionSource2) ? 131072 : 65536;
                            }
                        }
                        i8 = i5 & 64;
                        if (i8 != 0) {
                            i7 |= 1572864;
                            z6 = z4;
                        } else {
                            z6 = z4;
                            if ((i2 & 1572864) == 0) {
                                i7 |= composerKN.n(z6) ? 1048576 : 524288;
                            }
                        }
                        i9 = i5 & 128;
                        if (i9 != 0) {
                            i7 |= 12582912;
                            function210 = function22;
                        } else {
                            function210 = function22;
                            if ((i2 & 12582912) == 0) {
                                i7 |= composerKN.E2(function210) ? 8388608 : 4194304;
                            }
                        }
                        i10 = i5 & 256;
                        if (i10 != 0) {
                            i7 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i7 |= composerKN.E2(function23) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i11 = i5 & 512;
                        if (i11 == 0) {
                            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i12 = i11;
                                i7 |= composerKN.E2(function24) ? 536870912 : 268435456;
                            }
                            i13 = i5 & 1024;
                            if (i13 == 0) {
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
                            if (i16 == 0) {
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
                            if (i18 == 0) {
                                i19 = i25 | RendererCapabilities.DECODER_SUPPORT_MASK;
                            } else {
                                int i26 = i25;
                                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                    i26 |= composerKN.E2(function27) ? 256 : 128;
                                }
                                i19 = i26;
                            }
                            i20 = i5 & 8192;
                            if (i20 == 0) {
                                i21 = i19 | 3072;
                            } else {
                                int i27 = i19;
                                if ((i3 & 3072) == 0) {
                                    i21 = i27 | (composerKN.E2(function28) ? 2048 : 1024);
                                } else {
                                    i21 = i27;
                                }
                            }
                            if ((i3 & 24576) == 0) {
                                if ((i5 & 16384) == 0 && composerKN.p5(shape)) {
                                    i24 = 16384;
                                }
                                i21 |= i24;
                            }
                            if ((i3 & 196608) == 0) {
                                i21 |= ((i5 & 32768) == 0 && composerKN.p5(textFieldColors)) ? 131072 : 65536;
                            }
                            if ((i3 & 1572864) == 0) {
                                i21 |= ((i5 & 65536) == 0 && composerKN.p5(paddingValues)) ? 1048576 : 524288;
                            }
                            i22 = i5 & 131072;
                            if (i22 == 0) {
                                i21 |= 12582912;
                            } else if ((i3 & 12582912) == 0) {
                                i21 |= composerKN.E2(function29) ? 8388608 : 4194304;
                            }
                            if ((i5 & 262144) == 0) {
                                i21 |= 100663296;
                            } else if ((i3 & 100663296) == 0) {
                                i21 |= composerKN.p5(this) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            if ((i7 & 306783379) != 306783378 && (i21 & 38347923) == 38347922 && composerKN.xMQ()) {
                                composerKN.wTp();
                                function212 = function24;
                                function216 = function25;
                                function213 = function27;
                                function214 = function28;
                                shape3 = shape;
                                textFieldColors3 = textFieldColors;
                                paddingValues4 = paddingValues;
                                function218 = function29;
                                composer2 = composerKN;
                                z9 = z6;
                                function215 = function210;
                                function211 = function23;
                                function217 = function26;
                            } else {
                                composerKN.e();
                                if ((i2 & 1) != 0 || composerKN.rV9()) {
                                    if (i8 != 0) {
                                        z6 = false;
                                    }
                                    if (i9 != 0) {
                                        function210 = null;
                                    }
                                    Function2 function219 = i10 == 0 ? null : function23;
                                    Function2 function220 = i12 == 0 ? null : function24;
                                    Function2 function221 = i14 == 0 ? null : function25;
                                    Function2 function222 = i17 == 0 ? null : function26;
                                    Function2 function223 = i18 == 0 ? null : function27;
                                    Function2 function224 = i20 == 0 ? function28 : null;
                                    if ((i5 & 16384) == 0) {
                                        shapeTy = f28299n.ty(composerKN, 6);
                                        i21 &= -57345;
                                    } else {
                                        shapeTy = shape;
                                    }
                                    if ((i5 & 32768) == 0) {
                                        textFieldColorsNr = nr(composerKN, (i21 >> 24) & 14);
                                        i21 &= -458753;
                                    } else {
                                        textFieldColorsNr = textFieldColors;
                                    }
                                    if ((i5 & 65536) == 0) {
                                        paddingValuesXMQ = function210 == null ? xMQ(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : Uo(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        i21 &= -3670017;
                                    } else {
                                        paddingValuesXMQ = paddingValues;
                                    }
                                    if (i22 == 0) {
                                        final TextFieldColors textFieldColors4 = textFieldColorsNr;
                                        final Shape shape4 = shapeTy;
                                        final InteractionSource interactionSource3 = interactionSource2;
                                        final boolean z10 = z6;
                                        final boolean z11 = z5;
                                        Function2<Composer, Integer, Unit> function225 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults$DecorationBox$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                n(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer3, int i28) {
                                                if ((i28 & 3) == 2 && composer3.xMQ()) {
                                                    composer3.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-435523791, i28, -1, "androidx.compose.material3.TextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:265)");
                                                }
                                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f28299n;
                                                textFieldDefaults.n(z11, z10, interactionSource3, Modifier.INSTANCE, textFieldColors4, shape4, textFieldDefaults.gh(), textFieldDefaults.HI(), composer3, 114822144, 0);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        };
                                        paddingValues2 = paddingValuesXMQ;
                                        Function2 function226 = function223;
                                        z7 = z6;
                                        function211 = function219;
                                        function212 = function220;
                                        function213 = function226;
                                        function214 = function224;
                                        function2Nr = ComposableLambdaKt.nr(-435523791, true, function225, composerKN, 54);
                                    } else {
                                        Function2 function227 = function224;
                                        paddingValues2 = paddingValuesXMQ;
                                        Function2 function228 = function223;
                                        z7 = z6;
                                        function211 = function219;
                                        function212 = function220;
                                        function213 = function228;
                                        function214 = function227;
                                        function2Nr = function29;
                                    }
                                    textFieldColors2 = textFieldColorsNr;
                                    shape2 = shapeTy;
                                    function215 = function210;
                                    i23 = i21;
                                    function216 = function221;
                                    function217 = function222;
                                    paddingValues3 = paddingValues2;
                                } else {
                                    composerKN.wTp();
                                    if ((i5 & 16384) != 0) {
                                        i21 &= -57345;
                                    }
                                    if ((32768 & i5) != 0) {
                                        i21 &= -458753;
                                    }
                                    if ((i5 & 65536) != 0) {
                                        i21 &= -3670017;
                                    }
                                    function212 = function24;
                                    function216 = function25;
                                    function213 = function27;
                                    function214 = function28;
                                    shape2 = shape;
                                    textFieldColors2 = textFieldColors;
                                    paddingValues3 = paddingValues;
                                    function2Nr = function29;
                                    z7 = z6;
                                    function215 = function210;
                                    i23 = i21;
                                    function211 = function23;
                                    function217 = function26;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(289640444, i7, i23, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:276)");
                                }
                                int i28 = i7 << 3;
                                int i29 = i7 >> 3;
                                Shape shape5 = shape2;
                                int i30 = (i29 & 7168) | (i28 & 896) | (i28 & 112) | 6;
                                int i31 = i7 >> 9;
                                int i32 = i23 << 21;
                                composer2 = composerKN;
                                TextFieldImplKt.n(TextFieldType.Filled, str, function2, visualTransformation2, function215, function211, function212, function216, function217, function213, function214, z3, z2, z7, interactionSource, paddingValues3, textFieldColors2, function2Nr, composer2, i30 | (i31 & 57344) | (i31 & 458752) | (i31 & 3670016) | (i32 & 29360128) | (i32 & 234881024) | (i32 & 1879048192), ((i23 >> 9) & 14) | ((i7 >> 6) & 112) | (i7 & 896) | (i31 & 7168) | (57344 & i29) | ((i23 >> 3) & 458752) | (3670016 & (i23 << 3)) | (i23 & 29360128), 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                shape3 = shape5;
                                z9 = z7;
                                paddingValues4 = paddingValues3;
                                textFieldColors3 = textFieldColors2;
                                function218 = function2Nr;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults$DecorationBox$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i33) {
                                        this.f28330n.t(str, function2, z2, z3, visualTransformation, interactionSource, z9, function215, function211, function212, function216, function217, function213, function214, shape3, textFieldColors3, paddingValues4, function218, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        i12 = i11;
                        i13 = i5 & 1024;
                        if (i13 == 0) {
                        }
                        i16 = i5 & 2048;
                        if (i16 == 0) {
                        }
                        int i252 = i15;
                        i18 = i5 & 4096;
                        if (i18 == 0) {
                        }
                        i20 = i5 & 8192;
                        if (i20 == 0) {
                        }
                        if ((i3 & 24576) == 0) {
                        }
                        if ((i3 & 196608) == 0) {
                        }
                        if ((i3 & 1572864) == 0) {
                        }
                        i22 = i5 & 131072;
                        if (i22 == 0) {
                        }
                        if ((i5 & 262144) == 0) {
                        }
                        if ((i7 & 306783379) != 306783378) {
                            composerKN.e();
                            if ((i2 & 1) != 0) {
                                if (i8 != 0) {
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
                                if ((i5 & 65536) == 0) {
                                }
                                if (i22 == 0) {
                                }
                                textFieldColors2 = textFieldColorsNr;
                                shape2 = shapeTy;
                                function215 = function210;
                                i23 = i21;
                                function216 = function221;
                                function217 = function222;
                                paddingValues3 = paddingValues2;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                int i282 = i7 << 3;
                                int i292 = i7 >> 3;
                                Shape shape52 = shape2;
                                int i302 = (i292 & 7168) | (i282 & 896) | (i282 & 112) | 6;
                                int i312 = i7 >> 9;
                                int i322 = i23 << 21;
                                composer2 = composerKN;
                                TextFieldImplKt.n(TextFieldType.Filled, str, function2, visualTransformation2, function215, function211, function212, function216, function217, function213, function214, z3, z2, z7, interactionSource, paddingValues3, textFieldColors2, function2Nr, composer2, i302 | (i312 & 57344) | (i312 & 458752) | (i312 & 3670016) | (i322 & 29360128) | (i322 & 234881024) | (i322 & 1879048192), ((i23 >> 9) & 14) | ((i7 >> 6) & 112) | (i7 & 896) | (i312 & 7168) | (57344 & i292) | ((i23 >> 3) & 458752) | (3670016 & (i23 << 3)) | (i23 & 29360128), 0);
                                if (ComposerKt.v()) {
                                }
                                shape3 = shape52;
                                z9 = z7;
                                paddingValues4 = paddingValues3;
                                textFieldColors3 = textFieldColors2;
                                function218 = function2Nr;
                            }
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    visualTransformation2 = visualTransformation;
                    if ((i5 & 32) != 0) {
                    }
                    i8 = i5 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i5 & 128;
                    if (i9 != 0) {
                    }
                    i10 = i5 & 256;
                    if (i10 != 0) {
                    }
                    i11 = i5 & 512;
                    if (i11 == 0) {
                    }
                    i12 = i11;
                    i13 = i5 & 1024;
                    if (i13 == 0) {
                    }
                    i16 = i5 & 2048;
                    if (i16 == 0) {
                    }
                    int i2522 = i15;
                    i18 = i5 & 4096;
                    if (i18 == 0) {
                    }
                    i20 = i5 & 8192;
                    if (i20 == 0) {
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    if ((i3 & 196608) == 0) {
                    }
                    if ((i3 & 1572864) == 0) {
                    }
                    i22 = i5 & 131072;
                    if (i22 == 0) {
                    }
                    if ((i5 & 262144) == 0) {
                    }
                    if ((i7 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                int i242 = 8192;
                if ((i5 & 16) == 0) {
                }
                visualTransformation2 = visualTransformation;
                if ((i5 & 32) != 0) {
                }
                i8 = i5 & 64;
                if (i8 != 0) {
                }
                i9 = i5 & 128;
                if (i9 != 0) {
                }
                i10 = i5 & 256;
                if (i10 != 0) {
                }
                i11 = i5 & 512;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i5 & 1024;
                if (i13 == 0) {
                }
                i16 = i5 & 2048;
                if (i16 == 0) {
                }
                int i25222 = i15;
                i18 = i5 & 4096;
                if (i18 == 0) {
                }
                i20 = i5 & 8192;
                if (i20 == 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                if ((i3 & 196608) == 0) {
                }
                if ((i3 & 1572864) == 0) {
                }
                i22 = i5 & 131072;
                if (i22 == 0) {
                }
                if ((i5 & 262144) == 0) {
                }
                if ((i7 & 306783379) != 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z5 = z2;
            if ((i5 & 8) != 0) {
            }
            int i2422 = 8192;
            if ((i5 & 16) == 0) {
            }
            visualTransformation2 = visualTransformation;
            if ((i5 & 32) != 0) {
            }
            i8 = i5 & 64;
            if (i8 != 0) {
            }
            i9 = i5 & 128;
            if (i9 != 0) {
            }
            i10 = i5 & 256;
            if (i10 != 0) {
            }
            i11 = i5 & 512;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i5 & 1024;
            if (i13 == 0) {
            }
            i16 = i5 & 2048;
            if (i16 == 0) {
            }
            int i252222 = i15;
            i18 = i5 & 4096;
            if (i18 == 0) {
            }
            i20 = i5 & 8192;
            if (i20 == 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            if ((i3 & 196608) == 0) {
            }
            if ((i3 & 1572864) == 0) {
            }
            i22 = i5 & 131072;
            if (i22 == 0) {
            }
            if ((i5 & 262144) == 0) {
            }
            if ((i7 & 306783379) != 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        if ((i5 & 4) == 0) {
        }
        z5 = z2;
        if ((i5 & 8) != 0) {
        }
        int i24222 = 8192;
        if ((i5 & 16) == 0) {
        }
        visualTransformation2 = visualTransformation;
        if ((i5 & 32) != 0) {
        }
        i8 = i5 & 64;
        if (i8 != 0) {
        }
        i9 = i5 & 128;
        if (i9 != 0) {
        }
        i10 = i5 & 256;
        if (i10 != 0) {
        }
        i11 = i5 & 512;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i5 & 1024;
        if (i13 == 0) {
        }
        i16 = i5 & 2048;
        if (i16 == 0) {
        }
        int i2522222 = i15;
        i18 = i5 & 4096;
        if (i18 == 0) {
        }
        i20 = i5 & 8192;
        if (i20 == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if ((i3 & 196608) == 0) {
        }
        if ((i3 & 1572864) == 0) {
        }
        i22 = i5 & 131072;
        if (i22 == 0) {
        }
        if ((i5 & 262144) == 0) {
        }
        if ((i7 & 306783379) != 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    static {
        float fKN = Dp.KN(1);
        UnfocusedIndicatorThickness = fKN;
        float fKN2 = Dp.KN(2);
        FocusedIndicatorThickness = fKN2;
        UnfocusedBorderThickness = fKN;
        FocusedBorderThickness = fKN2;
    }

    public static /* synthetic */ PaddingValues Uo(TextFieldDefaults textFieldDefaults, float f3, float f4, float f5, float f6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = TextFieldImplKt.r();
        }
        if ((i2 & 2) != 0) {
            f4 = TextFieldImplKt.r();
        }
        if ((i2 & 4) != 0) {
            f5 = TextFieldKt.qie();
        }
        if ((i2 & 8) != 0) {
            f6 = TextFieldKt.qie();
        }
        return textFieldDefaults.J2(f3, f4, f5, f6);
    }

    public static /* synthetic */ PaddingValues r(TextFieldDefaults textFieldDefaults, float f3, float f4, float f5, float f6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = TextFieldImplKt.r();
        }
        if ((i2 & 2) != 0) {
            f4 = TextFieldImplKt.Ik();
        }
        if ((i2 & 4) != 0) {
            f5 = TextFieldImplKt.r();
        }
        if ((i2 & 8) != 0) {
            f6 = Dp.KN(0);
        }
        return textFieldDefaults.Ik(f3, f4, f5, f6);
    }

    public static /* synthetic */ PaddingValues xMQ(TextFieldDefaults textFieldDefaults, float f3, float f4, float f5, float f6, int i2, Object obj) {
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
        return textFieldDefaults.KN(f3, f4, f5, f6);
    }

    public final float HI() {
        return UnfocusedIndicatorThickness;
    }

    public final float az() {
        return MinWidth;
    }

    public final float gh() {
        return FocusedIndicatorThickness;
    }

    public final TextFieldColors mUb(ColorScheme colorScheme, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1341970309, i2, -1, "androidx.compose.material3.TextFieldDefaults.<get-defaultTextFieldColors> (TextFieldDefaults.kt:486)");
        }
        TextFieldColors defaultTextFieldColorsCached = colorScheme.getDefaultTextFieldColorsCached();
        composer.eF(27085453);
        if (defaultTextFieldColorsCached == null) {
            FilledTextFieldTokens filledTextFieldTokens = FilledTextFieldTokens.f29601n;
            TextFieldColors textFieldColors = new TextFieldColors(ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.ViF()), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.fD()), Color.az(ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.Uo()), filledTextFieldTokens.KN(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.o()), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.t()), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.t()), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.t()), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.t()), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.rl()), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.r()), (SelectionColors) composer.ty(TextSelectionColorsKt.rl()), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.aYN()), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.n()), Color.az(ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.O()), filledTextFieldTokens.J2(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.Ik()), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.g()), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.N()), Color.az(ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.gh()), filledTextFieldTokens.qie(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.XQ()), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.iF()), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.s7N()), Color.az(ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.HI()), filledTextFieldTokens.ck(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.WPU()), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.nY()), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.T()), Color.az(ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.xMQ()), filledTextFieldTokens.mUb(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.Z()), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.E2()), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.E2()), Color.az(ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.Uo()), filledTextFieldTokens.KN(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.E2()), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.te()), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.nHg()), Color.az(ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.az()), filledTextFieldTokens.ty(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.S()), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.e()), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.e()), Color.az(ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.e()), filledTextFieldTokens.KN(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.e()), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.X()), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.X()), Color.az(ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.X()), filledTextFieldTokens.KN(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, filledTextFieldTokens.X()), null);
            colorScheme.xVH(textFieldColors);
            defaultTextFieldColorsCached = textFieldColors;
        }
        composer.Xw();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return defaultTextFieldColorsCached;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
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
        Shape shapeTy;
        float f5;
        float f6;
        float f7;
        Shape shape2;
        int i7;
        Composer composer2;
        final TextFieldColors textFieldColors3;
        final Modifier modifier3;
        final float f8;
        final float f9;
        final Shape shape3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-818661242);
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
                    shapeTy = shape;
                    int i10 = composerKN.p5(shapeTy) ? 131072 : 65536;
                    i5 |= i10;
                } else {
                    shapeTy = shape;
                }
                i5 |= i10;
            } else {
                shapeTy = shape;
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
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 16) != 0) {
                        TextFieldColors textFieldColorsNr = nr(composerKN, (i5 >> 24) & 14);
                        i5 &= -57345;
                        textFieldColors2 = textFieldColorsNr;
                    }
                    if ((i3 & 32) != 0) {
                        i5 &= -458753;
                        shapeTy = f28299n.ty(composerKN, 6);
                    }
                    if ((i3 & 64) != 0) {
                        i5 &= -3670017;
                        f5 = FocusedIndicatorThickness;
                    }
                    if ((i3 & 128) == 0) {
                        i5 &= -29360129;
                        f7 = UnfocusedIndicatorThickness;
                        shape2 = shapeTy;
                    }
                    int i13 = i5;
                    float f10 = f5;
                    composerKN.S();
                    if (ComposerKt.v()) {
                        i7 = 6;
                        ComposerKt.p5(-818661242, i13, -1, "androidx.compose.material3.TextFieldDefaults.Container (TextFieldDefaults.kt:109)");
                    } else {
                        i7 = 6;
                    }
                    final State stateN = SingleValueAnimationKt.n(textFieldColors2.n(z2, z3, ((Boolean) FocusInteractionKt.n(interactionSource, composerKN, (i13 >> 6) & 14).getValue()).booleanValue()), AnimationSpecKt.ty(150, 0, null, i7, null), null, null, composerKN, 48, 12);
                    composer2 = composerKN;
                    TextFieldColors textFieldColors4 = textFieldColors2;
                    Shape shape4 = shape2;
                    BoxKt.n(ck(TextFieldImplKt.XQ(modifier2, new TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(new PropertyReference0Impl(stateN) { // from class: androidx.compose.material3.TextFieldDefaults$Container$1
                        @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                        public Object get() {
                            return ((State) this.receiver).getValue();
                        }
                    }), shape2), z2, z3, interactionSource, textFieldColors4, f10, f7), composer2, 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    textFieldColors3 = textFieldColors4;
                    modifier3 = modifier2;
                    f8 = f10;
                    f9 = f7;
                    shape3 = shape4;
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
                }
                shape2 = shapeTy;
                f7 = f6;
                int i132 = i5;
                float f102 = f5;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                final Object stateN2 = SingleValueAnimationKt.n(textFieldColors2.n(z2, z3, ((Boolean) FocusInteractionKt.n(interactionSource, composerKN, (i132 >> 6) & 14).getValue()).booleanValue()), AnimationSpecKt.ty(150, 0, null, i7, null), null, null, composerKN, 48, 12);
                composer2 = composerKN;
                TextFieldColors textFieldColors42 = textFieldColors2;
                Shape shape42 = shape2;
                BoxKt.n(ck(TextFieldImplKt.XQ(modifier2, new TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(new PropertyReference0Impl(stateN2) { // from class: androidx.compose.material3.TextFieldDefaults$Container$1
                    @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                    public Object get() {
                        return ((State) this.receiver).getValue();
                    }
                }), shape2), z2, z3, interactionSource, textFieldColors42, f102, f7), composer2, 0);
                if (ComposerKt.v()) {
                }
                textFieldColors3 = textFieldColors42;
                modifier3 = modifier2;
                f8 = f102;
                f9 = f7;
                shape3 = shape42;
            } else {
                composerKN.wTp();
                textFieldColors3 = textFieldColors2;
                shape3 = shapeTy;
                f9 = f6;
                composer2 = composerKN;
                modifier3 = modifier2;
                f8 = f5;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults$Container$2
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
                        this.f28306n.n(z2, z3, interactionSource, modifier3, textFieldColors3, shape3, f8, f9, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
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
                if (i8 != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if ((i3 & 128) == 0) {
                    shape2 = shapeTy;
                    f7 = f6;
                }
                int i1322 = i5;
                float f1022 = f5;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                final Object stateN22 = SingleValueAnimationKt.n(textFieldColors2.n(z2, z3, ((Boolean) FocusInteractionKt.n(interactionSource, composerKN, (i1322 >> 6) & 14).getValue()).booleanValue()), AnimationSpecKt.ty(150, 0, null, i7, null), null, null, composerKN, 48, 12);
                composer2 = composerKN;
                TextFieldColors textFieldColors422 = textFieldColors2;
                Shape shape422 = shape2;
                BoxKt.n(ck(TextFieldImplKt.XQ(modifier2, new TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(new PropertyReference0Impl(stateN22) { // from class: androidx.compose.material3.TextFieldDefaults$Container$1
                    @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                    public Object get() {
                        return ((State) this.receiver).getValue();
                    }
                }), shape2), z2, z3, interactionSource, textFieldColors422, f1022, f7), composer2, 0);
                if (ComposerKt.v()) {
                }
                textFieldColors3 = textFieldColors422;
                modifier3 = modifier2;
                f8 = f1022;
                f9 = f7;
                shape3 = shape422;
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public final float qie() {
        return MinHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void rl(final boolean z2, final boolean z3, final InteractionSource interactionSource, final TextFieldColors textFieldColors, Shape shape, Composer composer, final int i2, final int i3) {
        boolean z4;
        int i5;
        boolean z5;
        InteractionSource interactionSource2;
        TextFieldColors textFieldColors2;
        Shape shapeTy;
        TextFieldDefaults textFieldDefaults;
        Composer composer2;
        final Shape shape2;
        Composer composerKN = composer.KN(918564008);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.n(z4) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            z5 = z3;
        } else {
            z5 = z3;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.n(z5) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            interactionSource2 = interactionSource;
        } else {
            interactionSource2 = interactionSource;
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.p5(interactionSource2) ? 256 : 128;
            }
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
            textFieldColors2 = textFieldColors;
        } else {
            textFieldColors2 = textFieldColors;
            if ((i2 & 3072) == 0) {
                i5 |= composerKN.p5(textFieldColors2) ? 2048 : 1024;
            }
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                shapeTy = shape;
                int i7 = composerKN.p5(shapeTy) ? 16384 : 8192;
                i5 |= i7;
            } else {
                shapeTy = shape;
            }
            i5 |= i7;
        } else {
            shapeTy = shape;
        }
        if ((i3 & 32) != 0) {
            i5 |= 196608;
            textFieldDefaults = this;
        } else {
            textFieldDefaults = this;
            if ((i2 & 196608) == 0) {
                i5 |= composerKN.p5(textFieldDefaults) ? 131072 : 65536;
            }
        }
        if ((74899 & i5) == 74898 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
            shape2 = shapeTy;
        } else {
            composerKN.e();
            if ((i2 & 1) == 0 || composerKN.rV9()) {
                if ((i3 & 16) != 0) {
                    shapeTy = f28299n.ty(composerKN, 6);
                    i5 &= -57345;
                }
                Shape shape3 = shapeTy;
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(918564008, i5, -1, "androidx.compose.material3.TextFieldDefaults.ContainerBox (TextFieldDefaults.kt:592)");
                }
                int i8 = i5 << 3;
                composer2 = composerKN;
                textFieldDefaults.n(z4, z5, interactionSource2, Modifier.INSTANCE, textFieldColors2, shape3, FocusedIndicatorThickness, UnfocusedIndicatorThickness, composer2, (i5 & 14) | 3072 | (i5 & 112) | (i5 & 896) | (57344 & i8) | (i8 & 458752) | ((i5 << 9) & 234881024), 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                shape2 = shape3;
            } else {
                composerKN.wTp();
                if ((i3 & 16) != 0) {
                    i5 &= -57345;
                }
                Shape shape32 = shapeTy;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                int i82 = i5 << 3;
                composer2 = composerKN;
                textFieldDefaults.n(z4, z5, interactionSource2, Modifier.INSTANCE, textFieldColors2, shape32, FocusedIndicatorThickness, UnfocusedIndicatorThickness, composer2, (i5 & 14) | 3072 | (i5 & 112) | (i5 & 896) | (57344 & i82) | (i82 & 458752) | ((i5 << 9) & 234881024), 0);
                if (ComposerKt.v()) {
                }
                shape2 = shape32;
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults$ContainerBox$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer3, int i9) {
                    this.f28313n.rl(z2, z3, interactionSource, textFieldColors, shape2, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    private TextFieldDefaults() {
    }

    public final PaddingValues Ik(float start, float top, float end, float bottom) {
        return PaddingKt.nr(start, top, end, bottom);
    }

    public final PaddingValues J2(float start, float end, float top, float bottom) {
        return PaddingKt.nr(start, top, end, bottom);
    }

    public final PaddingValues KN(float start, float top, float end, float bottom) {
        return PaddingKt.nr(start, top, end, bottom);
    }

    public final Modifier ck(Modifier modifier, final boolean z2, final boolean z3, final InteractionSource interactionSource, final TextFieldColors textFieldColors, final float f3, final float f4) {
        Function1<InspectorInfo, Unit> function1N;
        if (InspectableValueKt.rl()) {
            function1N = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                    n(inspectorInfo);
                    return Unit.INSTANCE;
                }

                public final void n(InspectorInfo inspectorInfo) {
                    inspectorInfo.rl("indicatorLine");
                    inspectorInfo.getProperties().n("enabled", Boolean.valueOf(z2));
                    inspectorInfo.getProperties().n("isError", Boolean.valueOf(z3));
                    inspectorInfo.getProperties().n("interactionSource", interactionSource);
                    inspectorInfo.getProperties().n("colors", textFieldColors);
                    inspectorInfo.getProperties().n("focusedIndicatorLineThickness", Dp.nr(f3));
                    inspectorInfo.getProperties().n("unfocusedIndicatorLineThickness", Dp.nr(f4));
                }
            };
        } else {
            function1N = InspectableValueKt.n();
        }
        return ComposedModifierKt.rl(modifier, function1N, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return n(modifier2, composer, num.intValue());
            }

            public final Modifier n(Modifier modifier2, Composer composer, int i2) {
                composer.eF(-891038934);
                if (ComposerKt.v()) {
                    ComposerKt.p5(-891038934, i2, -1, "androidx.compose.material3.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:169)");
                }
                Modifier modifierGh = TextFieldKt.gh(Modifier.INSTANCE, TextFieldImplKt.KN(z2, z3, ((Boolean) FocusInteractionKt.n(interactionSource, composer, 0).getValue()).booleanValue(), textFieldColors, f3, f4, composer, 0));
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                return modifierGh;
            }
        });
    }

    public final TextFieldColors nr(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(831731228, i2, -1, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:336)");
        }
        TextFieldColors textFieldColorsMUb = mUb(MaterialTheme.f26164n.n(composer, 6), composer, (i2 << 3) & 112);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return textFieldColorsMUb;
    }

    public final Shape ty(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1941327459, i2, -1, "androidx.compose.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:60)");
        }
        Shape shapeO = ShapesKt.O(FilledTextFieldTokens.f29601n.nr(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }
}
