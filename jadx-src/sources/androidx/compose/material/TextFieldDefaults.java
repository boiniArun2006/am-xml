package androidx.compose.material;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
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
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Immutable
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010JP\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J:\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ:\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001eJ:\u0010 \u001a\u00020\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010\u001eJä\u0001\u00107\u001a\u00020\n2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020!2\b\b\u0002\u0010%\u001a\u00020!2\b\b\u0002\u0010&\u001a\u00020!2\b\b\u0002\u0010'\u001a\u00020!2\b\b\u0002\u0010(\u001a\u00020!2\b\b\u0002\u0010)\u001a\u00020!2\b\b\u0002\u0010*\u001a\u00020!2\b\b\u0002\u0010+\u001a\u00020!2\b\b\u0002\u0010,\u001a\u00020!2\b\b\u0002\u0010-\u001a\u00020!2\b\b\u0002\u0010.\u001a\u00020!2\b\b\u0002\u0010/\u001a\u00020!2\b\b\u0002\u00100\u001a\u00020!2\b\b\u0002\u00101\u001a\u00020!2\b\b\u0002\u00102\u001a\u00020!2\b\b\u0002\u00103\u001a\u00020!2\b\b\u0002\u00104\u001a\u00020!2\b\b\u0002\u00105\u001a\u00020!2\b\b\u0002\u00106\u001a\u00020!H\u0007ø\u0001\u0000¢\u0006\u0004\b7\u00108Jä\u0001\u0010=\u001a\u00020\n2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020!2\b\b\u0002\u0010%\u001a\u00020!2\b\b\u0002\u0010&\u001a\u00020!2\b\b\u0002\u00109\u001a\u00020!2\b\b\u0002\u0010:\u001a\u00020!2\b\b\u0002\u0010;\u001a\u00020!2\b\b\u0002\u0010<\u001a\u00020!2\b\b\u0002\u0010+\u001a\u00020!2\b\b\u0002\u0010,\u001a\u00020!2\b\b\u0002\u0010-\u001a\u00020!2\b\b\u0002\u0010.\u001a\u00020!2\b\b\u0002\u0010/\u001a\u00020!2\b\b\u0002\u00100\u001a\u00020!2\b\b\u0002\u00101\u001a\u00020!2\b\b\u0002\u00102\u001a\u00020!2\b\b\u0002\u00103\u001a\u00020!2\b\b\u0002\u00104\u001a\u00020!2\b\b\u0002\u00105\u001a\u00020!2\b\b\u0002\u00106\u001a\u00020!H\u0007ø\u0001\u0000¢\u0006\u0004\b=\u00108JÎ\u0001\u0010K\u001a\u00020\u00152\u0006\u0010?\u001a\u00020>2\u0011\u0010B\u001a\r\u0012\u0004\u0012\u00020\u00150@¢\u0006\u0002\bA2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00052\u0006\u0010E\u001a\u00020D2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0015\b\u0002\u0010F\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010@¢\u0006\u0002\bA2\u0015\b\u0002\u0010G\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010@¢\u0006\u0002\bA2\u0015\b\u0002\u0010H\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010@¢\u0006\u0002\bA2\u0015\b\u0002\u0010I\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010@¢\u0006\u0002\bA2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010J\u001a\u00020\u001cH\u0007¢\u0006\u0004\bK\u0010LJã\u0001\u0010N\u001a\u00020\u00152\u0006\u0010?\u001a\u00020>2\u0011\u0010B\u001a\r\u0012\u0004\u0012\u00020\u00150@¢\u0006\u0002\bA2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00052\u0006\u0010E\u001a\u00020D2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0015\b\u0002\u0010F\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010@¢\u0006\u0002\bA2\u0015\b\u0002\u0010G\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010@¢\u0006\u0002\bA2\u0015\b\u0002\u0010H\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010@¢\u0006\u0002\bA2\u0015\b\u0002\u0010I\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010@¢\u0006\u0002\bA2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010J\u001a\u00020\u001c2\u0013\b\u0002\u0010M\u001a\r\u0012\u0004\u0012\u00020\u00150@¢\u0006\u0002\bAH\u0007¢\u0006\u0004\bN\u0010OJÄ\u0001\u0010P\u001a\u00020\u00152\u0006\u0010?\u001a\u00020>2\u0011\u0010B\u001a\r\u0012\u0004\u0012\u00020\u00150@¢\u0006\u0002\bA2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00052\u0006\u0010E\u001a\u00020D2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0015\b\u0002\u0010F\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010@¢\u0006\u0002\bA2\u0015\b\u0002\u0010G\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010@¢\u0006\u0002\bA2\u0015\b\u0002\u0010H\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010@¢\u0006\u0002\bA2\u0015\b\u0002\u0010I\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010@¢\u0006\u0002\bA2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010J\u001a\u00020\u001cH\u0007¢\u0006\u0004\bP\u0010QJÙ\u0001\u0010R\u001a\u00020\u00152\u0006\u0010?\u001a\u00020>2\u0011\u0010B\u001a\r\u0012\u0004\u0012\u00020\u00150@¢\u0006\u0002\bA2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00052\u0006\u0010E\u001a\u00020D2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0015\b\u0002\u0010F\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010@¢\u0006\u0002\bA2\u0015\b\u0002\u0010G\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010@¢\u0006\u0002\bA2\u0015\b\u0002\u0010H\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010@¢\u0006\u0002\bA2\u0015\b\u0002\u0010I\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010@¢\u0006\u0002\bA2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010J\u001a\u00020\u001c2\u0013\b\u0002\u0010M\u001a\r\u0012\u0004\u0012\u00020\u00150@¢\u0006\u0002\bAH\u0007¢\u0006\u0004\bR\u0010SR\u001d\u0010W\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bR\u0010T\u001a\u0004\bU\u0010VR\u001d\u0010Y\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bN\u0010T\u001a\u0004\bX\u0010VR\u001d\u0010[\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bP\u0010T\u001a\u0004\bZ\u0010VR\u001d\u0010]\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bK\u0010T\u001a\u0004\b\\\u0010VR\u0011\u0010`\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0011\u0010b\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\ba\u0010_\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006c"}, d2 = {"Landroidx/compose/material/TextFieldDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/material/TextFieldColors;", "colors", "Landroidx/compose/ui/unit/Dp;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "mUb", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/Shape;", "shape", "focusedBorderThickness", "unfocusedBorderThickness", "", c.f62177j, "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", TtmlNode.START, TtmlNode.END, "top", "bottom", "Landroidx/compose/foundation/layout/PaddingValues;", "ck", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "r", "az", "Landroidx/compose/ui/graphics/Color;", "textColor", "disabledTextColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "HI", "(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "qie", "", "value", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "innerTextField", "singleLine", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "contentPadding", "O", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", "border", "t", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "nr", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", "rl", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "F", "J2", "()F", "MinHeight", "Uo", "MinWidth", "getUnfocusedBorderThickness-D9Ej5fM", "UnfocusedBorderThickness", "getFocusedBorderThickness-D9Ej5fM", "FocusedBorderThickness", "xMQ", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "TextFieldShape", "KN", "OutlinedTextFieldShape", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaults\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,985:1\n135#2:986\n75#3:987\n75#3:988\n149#4:989\n149#4:990\n149#4:991\n149#4:992\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaults\n*L\n279#1:986\n386#1:987\n440#1:988\n202#1:989\n208#1:990\n234#1:991\n240#1:992\n*E\n"})
public final class TextFieldDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TextFieldDefaults f23471n = new TextFieldDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float MinHeight = Dp.KN(56);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float MinWidth = Dp.KN(280);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final float UnfocusedBorderThickness = Dp.KN(1);

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final float FocusedBorderThickness = Dp.KN(2);

    public final TextFieldColors HI(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, Composer composer, int i2, int i3, int i5, int i7) {
        long j24;
        long jAz;
        long j25;
        long jAz2;
        long j26;
        long jAz3;
        long j27;
        long jAz4;
        long j28;
        long jAz5 = (i7 & 1) != 0 ? Color.az(((Color) composer.ty(ContentColorKt.n())).getValue(), ((Number) composer.ty(ContentAlphaKt.n())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jAz6 = (i7 & 2) != 0 ? Color.az(jAz5, ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jAz7 = (i7 & 4) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long jMUb = (i7 & 8) != 0 ? MaterialTheme.f22169n.n(composer, 6).mUb() : j5;
        long jNr = (i7 & 16) != 0 ? MaterialTheme.f22169n.n(composer, 6).nr() : j6;
        long jAz8 = (i7 & 32) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).mUb(), ContentAlpha.f21745n.t(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long jAz9 = (i7 & 64) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j9;
        if ((i7 & 128) != 0) {
            long j29 = jAz9;
            jAz = Color.az(j29, ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j24 = j29;
        } else {
            j24 = jAz9;
            jAz = j10;
        }
        long jNr2 = (i7 & 256) != 0 ? MaterialTheme.f22169n.n(composer, 6).nr() : j11;
        long jAz10 = (i7 & 512) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if ((i7 & 1024) != 0) {
            long j30 = jAz10;
            jAz2 = Color.az(j30, ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j25 = j30;
        } else {
            j25 = jAz10;
            jAz2 = j13;
        }
        long j31 = (i7 & 2048) != 0 ? j25 : j14;
        long jAz11 = (i7 & 4096) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        if ((i7 & 8192) != 0) {
            long j32 = jAz11;
            jAz3 = Color.az(j32, ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j26 = j32;
        } else {
            j26 = jAz11;
            jAz3 = j16;
        }
        long jNr3 = (i7 & 16384) != 0 ? MaterialTheme.f22169n.n(composer, 6).nr() : j17;
        long jAz12 = (32768 & i7) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).mUb(), ContentAlpha.f21745n.t(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long jAz13 = (65536 & i7) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), ContentAlpha.f21745n.nr(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j19;
        if ((131072 & i7) != 0) {
            long j33 = jAz13;
            jAz4 = Color.az(j33, ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j27 = j33;
        } else {
            j27 = jAz13;
            jAz4 = j20;
        }
        long jNr4 = (262144 & i7) != 0 ? MaterialTheme.f22169n.n(composer, 6).nr() : j21;
        long jAz14 = (524288 & i7) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), ContentAlpha.f21745n.nr(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long jAz15 = (i7 & 1048576) != 0 ? Color.az(jAz14, ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j23;
        if (ComposerKt.v()) {
            j28 = jAz15;
            ComposerKt.p5(231892599, i2, i3, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:408)");
        } else {
            j28 = jAz15;
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(jAz5, jAz6, jMUb, jNr, jAz8, j24, jNr2, jAz, j25, jAz2, j31, j26, jAz3, jNr3, jAz7, jAz12, j27, jAz4, jNr4, jAz14, j28, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return defaultTextFieldColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(final String str, final Function2 function2, final boolean z2, final boolean z3, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z4, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Composer composer, final int i2, final int i3, int i5) {
        int i7;
        int i8;
        final boolean z5;
        int i9;
        Function2 function26;
        int i10;
        Function2 function27;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Composer composer2;
        final Function2 function28;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final Function2 function29;
        final Function2 function210;
        final Function2 function211;
        final PaddingValues paddingValues2;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i17;
        Shape shapeXMQ;
        Shape shape3;
        int i18;
        TextFieldColors textFieldColorsHI;
        PaddingValues paddingValuesO;
        Shape shape4;
        TextFieldColors textFieldColors3;
        boolean z6;
        int i19;
        int i20 = i5;
        Composer composerKN = composer.KN(-1391531252);
        if ((i20 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.p5(str) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        if ((i20 & 2) != 0) {
            i7 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i7 |= composerKN.E2(function2) ? 32 : 16;
            }
            if ((i20 & 4) == 0) {
                i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i7 |= composerKN.n(z2) ? 256 : 128;
                }
                int i21 = 1024;
                if ((i20 & 8) != 0) {
                    i7 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        i7 |= composerKN.n(z3) ? 2048 : 1024;
                    }
                    if ((i20 & 16) == 0) {
                        i7 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            i7 |= composerKN.p5(visualTransformation) ? 16384 : 8192;
                        }
                        if ((i20 & 32) != 0) {
                            i7 |= 196608;
                        } else if ((i2 & 196608) == 0) {
                            i7 |= composerKN.p5(interactionSource) ? 131072 : 65536;
                        }
                        i8 = i20 & 64;
                        if (i8 != 0) {
                            i7 |= 1572864;
                            z5 = z4;
                        } else {
                            z5 = z4;
                            if ((i2 & 1572864) == 0) {
                                i7 |= composerKN.n(z5) ? 1048576 : 524288;
                            }
                        }
                        i9 = i20 & 128;
                        if (i9 != 0) {
                            i7 |= 12582912;
                            function26 = function22;
                        } else {
                            function26 = function22;
                            if ((i2 & 12582912) == 0) {
                                i7 |= composerKN.E2(function26) ? 8388608 : 4194304;
                            }
                        }
                        i10 = i20 & 256;
                        if (i10 != 0) {
                            i7 |= 100663296;
                            function27 = function23;
                        } else {
                            function27 = function23;
                            if ((i2 & 100663296) == 0) {
                                i7 |= composerKN.E2(function27) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                        }
                        i11 = i20 & 512;
                        if (i11 == 0) {
                            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i12 = i11;
                                i7 |= composerKN.E2(function24) ? 536870912 : 268435456;
                            }
                            i13 = i20 & 1024;
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
                            if ((i3 & 48) == 0) {
                                i15 |= ((i20 & 2048) == 0 && composerKN.p5(shape)) ? 32 : 16;
                            }
                            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                i15 |= ((i20 & 4096) == 0 && composerKN.p5(textFieldColors)) ? 256 : 128;
                            }
                            if ((i3 & 3072) == 0) {
                                if ((i20 & 8192) == 0 && composerKN.p5(paddingValues)) {
                                    i21 = 2048;
                                }
                                i15 |= i21;
                            }
                            i16 = i15;
                            if ((i20 & 16384) == 0) {
                                i16 |= 24576;
                            } else if ((i3 & 24576) == 0) {
                                i16 |= composerKN.p5(this) ? 16384 : 8192;
                            }
                            if (composerKN.HI((306783379 & i7) == 306783378 || (i16 & 9363) != 9362, i7 & 1)) {
                                composer2 = composerKN;
                                composer2.wTp();
                                function28 = function24;
                                shape2 = shape;
                                textFieldColors2 = textFieldColors;
                                function29 = function26;
                                function210 = function27;
                                function211 = function25;
                                paddingValues2 = paddingValues;
                            } else {
                                composerKN.e();
                                if ((i2 & 1) == 0 || composerKN.rV9()) {
                                    boolean z7 = i8 != 0 ? false : z5;
                                    Function2 function212 = i9 != 0 ? null : function26;
                                    Function2 function213 = i10 != 0 ? null : function27;
                                    Function2 function214 = i12 != 0 ? null : function24;
                                    Function2 function215 = i14 != 0 ? null : function25;
                                    if ((i20 & 2048) != 0) {
                                        i17 = i16 & (-113);
                                        shapeXMQ = xMQ(composerKN, (i16 >> 12) & 14);
                                    } else {
                                        i17 = i16;
                                        shapeXMQ = shape;
                                    }
                                    if ((i20 & 4096) != 0) {
                                        int i22 = i17;
                                        shape3 = shapeXMQ;
                                        i18 = i7;
                                        textFieldColorsHI = HI(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerKN, 0, 0, (i17 >> 9) & 112, 2097151);
                                        composer2 = composerKN;
                                        i16 = i22 & (-897);
                                    } else {
                                        shape3 = shapeXMQ;
                                        i16 = i17;
                                        composer2 = composerKN;
                                        i18 = i7;
                                        textFieldColorsHI = textFieldColors;
                                    }
                                    i20 = i5;
                                    if ((i20 & 8192) != 0) {
                                        i16 &= -7169;
                                        shape4 = shape3;
                                        paddingValuesO = function212 == null ? o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : Ik(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        paddingValuesO = paddingValues;
                                        shape4 = shape3;
                                    }
                                    textFieldColors3 = textFieldColorsHI;
                                    z6 = z7;
                                    function29 = function212;
                                    function210 = function213;
                                    function28 = function214;
                                    function211 = function215;
                                } else {
                                    composerKN.wTp();
                                    if ((i20 & 2048) != 0) {
                                        i16 &= -113;
                                    }
                                    if ((i20 & 4096) != 0) {
                                        i16 &= -897;
                                    }
                                    if ((i20 & 8192) != 0) {
                                        i16 &= -7169;
                                    }
                                    function28 = function24;
                                    shape4 = shape;
                                    textFieldColors3 = textFieldColors;
                                    paddingValuesO = paddingValues;
                                    composer2 = composerKN;
                                    i18 = i7;
                                    function29 = function26;
                                    function210 = function27;
                                    function211 = function25;
                                    z6 = z5;
                                }
                                composer2.S();
                                if (ComposerKt.v()) {
                                    i19 = i18;
                                    ComposerKt.p5(-1391531252, i19, i16, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:565)");
                                } else {
                                    i19 = i18;
                                }
                                int i23 = i19 << 3;
                                int i24 = i19 >> 9;
                                int i25 = (i23 & 896) | (i23 & 112) | 6 | ((i19 >> 3) & 7168) | (57344 & i24) | (458752 & i24) | (i24 & 3670016) | ((i16 << 21) & 29360128) | ((i19 << 15) & 234881024) | ((i19 << 21) & 1879048192);
                                int i26 = ((i19 >> 18) & 14) | 196608 | ((i19 >> 12) & 112) | ((i16 >> 3) & 896);
                                int i27 = i16 << 6;
                                TextFieldImplKt.n(TextFieldType.f23749n, str, function2, visualTransformation, function29, function210, function28, function211, z3, z2, z6, interactionSource, paddingValuesO, shape4, textFieldColors3, null, composer2, i25, i26 | (i27 & 7168) | (i27 & 57344));
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                z5 = z6;
                                paddingValues2 = paddingValuesO;
                                shape2 = shape4;
                                textFieldColors2 = textFieldColors3;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                final int i28 = i20;
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i29) {
                                        this.f23525n.O(str, function2, z2, z3, visualTransformation, interactionSource, z5, function29, function210, function28, function211, shape2, textFieldColors2, paddingValues2, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i28);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        i12 = i11;
                        i13 = i20 & 1024;
                        if (i13 == 0) {
                        }
                        if ((i3 & 48) == 0) {
                        }
                        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        i16 = i15;
                        if ((i20 & 16384) == 0) {
                        }
                        if (composerKN.HI((306783379 & i7) == 306783378 || (i16 & 9363) != 9362, i7 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    if ((i20 & 32) != 0) {
                    }
                    i8 = i20 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i20 & 128;
                    if (i9 != 0) {
                    }
                    i10 = i20 & 256;
                    if (i10 != 0) {
                    }
                    i11 = i20 & 512;
                    if (i11 == 0) {
                    }
                    i12 = i11;
                    i13 = i20 & 1024;
                    if (i13 == 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    i16 = i15;
                    if ((i20 & 16384) == 0) {
                    }
                    if (composerKN.HI((306783379 & i7) == 306783378 || (i16 & 9363) != 9362, i7 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                if ((i20 & 16) == 0) {
                }
                if ((i20 & 32) != 0) {
                }
                i8 = i20 & 64;
                if (i8 != 0) {
                }
                i9 = i20 & 128;
                if (i9 != 0) {
                }
                i10 = i20 & 256;
                if (i10 != 0) {
                }
                i11 = i20 & 512;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i20 & 1024;
                if (i13 == 0) {
                }
                if ((i3 & 48) == 0) {
                }
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                i16 = i15;
                if ((i20 & 16384) == 0) {
                }
                if (composerKN.HI((306783379 & i7) == 306783378 || (i16 & 9363) != 9362, i7 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            int i212 = 1024;
            if ((i20 & 8) != 0) {
            }
            if ((i20 & 16) == 0) {
            }
            if ((i20 & 32) != 0) {
            }
            i8 = i20 & 64;
            if (i8 != 0) {
            }
            i9 = i20 & 128;
            if (i9 != 0) {
            }
            i10 = i20 & 256;
            if (i10 != 0) {
            }
            i11 = i20 & 512;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i20 & 1024;
            if (i13 == 0) {
            }
            if ((i3 & 48) == 0) {
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            i16 = i15;
            if ((i20 & 16384) == 0) {
            }
            if (composerKN.HI((306783379 & i7) == 306783378 || (i16 & 9363) != 9362, i7 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        if ((i20 & 4) == 0) {
        }
        int i2122 = 1024;
        if ((i20 & 8) != 0) {
        }
        if ((i20 & 16) == 0) {
        }
        if ((i20 & 32) != 0) {
        }
        i8 = i20 & 64;
        if (i8 != 0) {
        }
        i9 = i20 & 128;
        if (i9 != 0) {
        }
        i10 = i20 & 256;
        if (i10 != 0) {
        }
        i11 = i20 & 512;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i20 & 1024;
        if (i13 == 0) {
        }
        if ((i3 & 48) == 0) {
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        i16 = i15;
        if ((i20 & 16384) == 0) {
        }
        if (composerKN.HI((306783379 & i7) == 306783378 || (i16 & 9363) != 9362, i7 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /* JADX WARN: Type update failed for variable: r57v0 'this'  ??, new type: androidx.compose.material.TextFieldDefaults
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 8851. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void nr(final String str, final Function2 function2, final boolean z2, final boolean z3, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z4, Function2 function22, Function2 function23, Function2 function24, Function2 function25, TextFieldColors textFieldColors, PaddingValues paddingValues, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        int i8;
        boolean z5;
        int i9;
        Function2 function26;
        int i10;
        Function2 function27;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        final Function2 function28;
        final TextFieldColors textFieldColors2;
        final Function2 function29;
        final Function2 function210;
        final Function2 function211;
        final PaddingValues paddingValues2;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i17;
        int i18;
        TextFieldColors textFieldColorsHI;
        int i19;
        TextFieldDefaults textFieldDefaults;
        Function2 function212;
        Function2 function213;
        Function2 function214;
        Function2 function215;
        PaddingValues paddingValuesIk;
        int i20;
        Composer composerKN = composer.KN(1171040065);
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
                    i7 |= composerKN.n(z2) ? 256 : 128;
                }
                if ((i5 & 8) != 0) {
                    i7 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        i7 |= composerKN.n(z3) ? 2048 : 1024;
                    }
                    if ((i5 & 16) == 0) {
                        i7 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            i7 |= composerKN.p5(visualTransformation) ? 16384 : 8192;
                        }
                        if ((i5 & 32) != 0) {
                            i7 |= 196608;
                        } else if ((i2 & 196608) == 0) {
                            i7 |= composerKN.p5(interactionSource) ? 131072 : 65536;
                        }
                        i8 = i5 & 64;
                        if (i8 != 0) {
                            i7 |= 1572864;
                            z5 = z4;
                        } else {
                            z5 = z4;
                            if ((i2 & 1572864) == 0) {
                                i7 |= composerKN.n(z5) ? 1048576 : 524288;
                            }
                        }
                        i9 = i5 & 128;
                        if (i9 != 0) {
                            i7 |= 12582912;
                            function26 = function22;
                        } else {
                            function26 = function22;
                            if ((i2 & 12582912) == 0) {
                                i7 |= composerKN.E2(function26) ? 8388608 : 4194304;
                            }
                        }
                        i10 = i5 & 256;
                        if (i10 != 0) {
                            i7 |= 100663296;
                            function27 = function23;
                        } else {
                            function27 = function23;
                            if ((i2 & 100663296) == 0) {
                                i7 |= composerKN.E2(function27) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
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
                            if ((i3 & 48) == 0) {
                                i15 |= ((i5 & 2048) == 0 && composerKN.p5(textFieldColors)) ? 32 : 16;
                            }
                            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                i15 |= ((i5 & 4096) == 0 && composerKN.p5(paddingValues)) ? 256 : 128;
                            }
                            i16 = i15;
                            if ((i5 & 8192) == 0) {
                                i16 |= 3072;
                            } else if ((i3 & 3072) == 0) {
                                i16 |= composerKN.p5(this) ? 2048 : 1024;
                            }
                            if (composerKN.HI((306783379 & i7) == 306783378 || (i16 & 1171) != 1170, i7 & 1)) {
                                composerKN.wTp();
                                function28 = function25;
                                textFieldColors2 = textFieldColors;
                                function29 = function26;
                                function210 = function27;
                                function211 = function24;
                                paddingValues2 = paddingValues;
                            } else {
                                composerKN.e();
                                if ((i2 & 1) == 0 || composerKN.rV9()) {
                                    boolean z6 = i8 != 0 ? false : z5;
                                    Function2 function216 = i9 != 0 ? null : function26;
                                    Function2 function217 = i10 != 0 ? null : function27;
                                    Function2 function218 = i12 != 0 ? null : function24;
                                    Function2 function219 = i14 != 0 ? null : function25;
                                    if ((i5 & 2048) != 0) {
                                        int i21 = (i16 >> 6) & 112;
                                        int i22 = i16;
                                        i18 = i7;
                                        i17 = i5;
                                        textFieldColorsHI = HI(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerKN, 0, 0, i21, 2097151);
                                        composerKN = composerKN;
                                        i19 = i22 & (-113);
                                    } else {
                                        int i23 = i16;
                                        i17 = i5;
                                        i18 = i7;
                                        textFieldColorsHI = textFieldColors;
                                        i19 = i23;
                                    }
                                    if ((i17 & 4096) != 0) {
                                        if (function216 == null) {
                                            paddingValuesIk = o(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                            textFieldDefaults = this;
                                        } else {
                                            paddingValuesIk = Ik(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                            textFieldDefaults = this;
                                        }
                                        i19 &= -897;
                                        textFieldColors2 = textFieldColorsHI;
                                        paddingValues2 = paddingValuesIk;
                                    } else {
                                        textFieldDefaults = this;
                                        paddingValues2 = paddingValues;
                                        textFieldColors2 = textFieldColorsHI;
                                    }
                                    z5 = z6;
                                    function212 = function216;
                                    function213 = function217;
                                    function214 = function218;
                                    function215 = function219;
                                } else {
                                    composerKN.wTp();
                                    if ((i5 & 2048) != 0) {
                                        i16 &= -113;
                                    }
                                    if ((i5 & 4096) != 0) {
                                        i16 &= -897;
                                    }
                                    textFieldDefaults = this;
                                    function214 = function24;
                                    textFieldColors2 = textFieldColors;
                                    i19 = i16;
                                    i18 = i7;
                                    function212 = function26;
                                    function213 = function27;
                                    function215 = function25;
                                    paddingValues2 = paddingValues;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    i20 = i18;
                                    ComposerKt.p5(1171040065, i20, i19, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:708)");
                                } else {
                                    i20 = i18;
                                }
                                int i24 = i19 & 14;
                                int i25 = i19 << 3;
                                textFieldDefaults.O(str, function2, z2, z3, visualTransformation, interactionSource, z5, function212, function213, function214, function215, textFieldDefaults.xMQ(composerKN, (i19 >> 9) & 14), textFieldColors2, paddingValues2, composerKN, i20 & 2147483646, i24 | (i25 & 896) | (i25 & 7168) | (i25 & 57344), 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                function28 = function215;
                                function211 = function214;
                                function210 = function213;
                                function29 = function212;
                            }
                            final boolean z7 = z5;
                            scopeUpdateScopeGh = composerKN.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        n(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer2, int i26) {
                                        this.f23538n.nr(str, function2, z2, z3, visualTransformation, interactionSource, z7, function29, function210, function211, function28, textFieldColors2, paddingValues2, composer2, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
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
                        if ((i3 & 48) == 0) {
                        }
                        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        }
                        i16 = i15;
                        if ((i5 & 8192) == 0) {
                        }
                        if (composerKN.HI((306783379 & i7) == 306783378 || (i16 & 1171) != 1170, i7 & 1)) {
                        }
                        final boolean z72 = z5;
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
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
                    if ((i3 & 48) == 0) {
                    }
                    if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    }
                    i16 = i15;
                    if ((i5 & 8192) == 0) {
                    }
                    if (composerKN.HI((306783379 & i7) == 306783378 || (i16 & 1171) != 1170, i7 & 1)) {
                    }
                    final boolean z722 = z5;
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                if ((i5 & 16) == 0) {
                }
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
                if ((i3 & 48) == 0) {
                }
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                }
                i16 = i15;
                if ((i5 & 8192) == 0) {
                }
                if (composerKN.HI((306783379 & i7) == 306783378 || (i16 & 1171) != 1170, i7 & 1)) {
                }
                final boolean z7222 = z5;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            if ((i5 & 8) != 0) {
            }
            if ((i5 & 16) == 0) {
            }
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
            if ((i3 & 48) == 0) {
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            }
            i16 = i15;
            if ((i5 & 8192) == 0) {
            }
            if (composerKN.HI((306783379 & i7) == 306783378 || (i16 & 1171) != 1170, i7 & 1)) {
            }
            final boolean z72222 = z5;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        if ((i5 & 4) == 0) {
        }
        if ((i5 & 8) != 0) {
        }
        if ((i5 & 16) == 0) {
        }
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
        if ((i3 & 48) == 0) {
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
        }
        i16 = i15;
        if ((i5 & 8192) == 0) {
        }
        if (composerKN.HI((306783379 & i7) == 306783378 || (i16 & 1171) != 1170, i7 & 1)) {
        }
        final boolean z722222 = z5;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public final TextFieldColors qie(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, Composer composer, int i2, int i3, int i5, int i7) {
        long j24;
        long jAz;
        long j25;
        long jAz2;
        long j26;
        long jAz3;
        long j27;
        long jAz4;
        long j28;
        long jAz5 = (i7 & 1) != 0 ? Color.az(((Color) composer.ty(ContentColorKt.n())).getValue(), ((Number) composer.ty(ContentAlphaKt.n())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jAz6 = (i7 & 2) != 0 ? Color.az(jAz5, ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jJ2 = (i7 & 4) != 0 ? Color.INSTANCE.J2() : j4;
        long jMUb = (i7 & 8) != 0 ? MaterialTheme.f22169n.n(composer, 6).mUb() : j5;
        long jNr = (i7 & 16) != 0 ? MaterialTheme.f22169n.n(composer, 6).nr() : j6;
        long jAz7 = (i7 & 32) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).mUb(), ContentAlpha.f21745n.t(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long jAz8 = (i7 & 64) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j9;
        if ((i7 & 128) != 0) {
            long j29 = jAz8;
            jAz = Color.az(j29, ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j24 = j29;
        } else {
            j24 = jAz8;
            jAz = j10;
        }
        long jNr2 = (i7 & 256) != 0 ? MaterialTheme.f22169n.n(composer, 6).nr() : j11;
        long jAz9 = (i7 & 512) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if ((i7 & 1024) != 0) {
            long j30 = jAz9;
            jAz2 = Color.az(j30, ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j25 = j30;
        } else {
            j25 = jAz9;
            jAz2 = j13;
        }
        long j31 = (i7 & 2048) != 0 ? j25 : j14;
        long jAz10 = (i7 & 4096) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        if ((i7 & 8192) != 0) {
            long j32 = jAz10;
            jAz3 = Color.az(j32, ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j26 = j32;
        } else {
            j26 = jAz10;
            jAz3 = j16;
        }
        long jNr3 = (i7 & 16384) != 0 ? MaterialTheme.f22169n.n(composer, 6).nr() : j17;
        long jAz11 = (32768 & i7) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).mUb(), ContentAlpha.f21745n.t(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long jAz12 = (65536 & i7) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), ContentAlpha.f21745n.nr(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j19;
        if ((131072 & i7) != 0) {
            long j33 = jAz12;
            jAz4 = Color.az(j33, ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j27 = j33;
        } else {
            j27 = jAz12;
            jAz4 = j20;
        }
        long jNr4 = (262144 & i7) != 0 ? MaterialTheme.f22169n.n(composer, 6).nr() : j21;
        long jAz13 = (524288 & i7) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), ContentAlpha.f21745n.nr(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long jAz14 = (i7 & 1048576) != 0 ? Color.az(jAz13, ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j23;
        if (ComposerKt.v()) {
            j28 = jAz14;
            ComposerKt.p5(1762667317, i2, i3, "androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:462)");
        } else {
            j28 = jAz14;
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(jAz5, jAz6, jMUb, jNr, jAz7, j24, jNr2, jAz, j25, jAz2, j31, j26, jAz3, jNr3, jJ2, jAz11, j27, jAz4, jNr4, jAz13, j28, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return defaultTextFieldColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void rl(final String str, final Function2 function2, final boolean z2, final boolean z3, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z4, Function2 function22, Function2 function23, Function2 function24, Function2 function25, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2 function26, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        int i8;
        final boolean z5;
        int i9;
        Function2 function27;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Composer composer2;
        final Function2 function28;
        final Function2 function29;
        final Function2 function210;
        final PaddingValues paddingValues2;
        final Function2 function211;
        final boolean z6;
        final Function2 function212;
        final TextFieldColors textFieldColors2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Function2 function213;
        boolean z7;
        int i18;
        Composer composer3;
        int i19;
        int i20;
        final TextFieldColors textFieldColorsQie;
        int i21;
        TextFieldDefaults textFieldDefaults;
        PaddingValues paddingValuesTy;
        final boolean z9;
        Function2 function214;
        Function2 function215;
        Function2 function216;
        int i22;
        Composer composerKN = composer.KN(-1280721485);
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
            int i23 = 128;
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
                        function27 = function22;
                    } else {
                        function27 = function22;
                        if ((i2 & 12582912) == 0) {
                            i7 |= composerKN.E2(function27) ? 8388608 : 4194304;
                        }
                    }
                    i10 = i5 & 256;
                    if (i10 == 0) {
                        i7 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i7 |= composerKN.E2(function23) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    i11 = i5 & 512;
                    if (i11 != 0) {
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
                        if ((i3 & 48) == 0) {
                            i15 |= ((i5 & 2048) == 0 && composerKN.p5(textFieldColors)) ? 32 : 16;
                        }
                        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                            if ((i5 & 4096) == 0 && composerKN.p5(paddingValues)) {
                                i23 = 256;
                            }
                            i15 |= i23;
                        }
                        int i24 = i15;
                        i16 = i5 & 8192;
                        if (i16 != 0) {
                            i17 = i24 | 3072;
                        } else {
                            int i25 = i24;
                            if ((i3 & 3072) == 0) {
                                i25 |= composerKN.E2(function26) ? 2048 : 1024;
                            }
                            i17 = i25;
                        }
                        if ((i5 & 16384) != 0) {
                            i17 |= 24576;
                        } else if ((i3 & 24576) == 0) {
                            i17 |= composerKN.p5(this) ? 16384 : 8192;
                        }
                        if (composerKN.HI(((306783379 & i7) == 306783378 && (i17 & 9363) == 9362) ? false : true, i7 & 1)) {
                            composerKN.e();
                            if ((i2 & 1) == 0 || composerKN.rV9()) {
                                boolean z10 = i8 != 0 ? false : z5;
                                Function2 function217 = i9 != 0 ? null : function27;
                                function213 = i10 != 0 ? null : function23;
                                Function2 function218 = i12 != 0 ? null : function24;
                                Function2 function219 = i14 != 0 ? null : function25;
                                if ((i5 & 2048) != 0) {
                                    int i26 = i17;
                                    i20 = i16;
                                    i18 = i5;
                                    z7 = z10;
                                    i19 = i7;
                                    textFieldColorsQie = qie(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerKN, 0, 0, (i17 >> 9) & 112, 2097151);
                                    composer3 = composerKN;
                                    i21 = i26 & (-113);
                                } else {
                                    z7 = z10;
                                    int i27 = i17;
                                    i18 = i5;
                                    composer3 = composerKN;
                                    i19 = i7;
                                    i20 = i16;
                                    textFieldColorsQie = textFieldColors;
                                    i21 = i27;
                                }
                                if ((i18 & 4096) != 0) {
                                    paddingValuesTy = ty(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    textFieldDefaults = this;
                                    i21 &= -897;
                                } else {
                                    textFieldDefaults = this;
                                    paddingValuesTy = paddingValues;
                                }
                                if (i20 != 0) {
                                    z9 = z2;
                                    z5 = z7;
                                    ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(1261916269, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            n(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer4, int i28) {
                                            if (!composer4.HI((i28 & 3) != 2, i28 & 1)) {
                                                composer4.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(1261916269, i28, -1, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:745)");
                                            }
                                            TextFieldDefaults.f23471n.n(z9, z5, interactionSource, textFieldColorsQie, null, 0.0f, 0.0f, composer4, 12582912, 112);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composer3, 54);
                                    textFieldColors2 = textFieldColorsQie;
                                    i17 = i21;
                                    paddingValues2 = paddingValuesTy;
                                    function211 = composableLambdaNr;
                                } else {
                                    z9 = z2;
                                    z5 = z7;
                                    function211 = function26;
                                    textFieldColors2 = textFieldColorsQie;
                                    i17 = i21;
                                    paddingValues2 = paddingValuesTy;
                                }
                                function214 = function217;
                                function215 = function218;
                                function216 = function219;
                            } else {
                                composerKN.wTp();
                                if ((i5 & 2048) != 0) {
                                    i17 &= -113;
                                }
                                if ((i5 & 4096) != 0) {
                                    i17 &= -897;
                                }
                                function213 = function23;
                                function215 = function24;
                                paddingValues2 = paddingValues;
                                function211 = function26;
                                composer3 = composerKN;
                                i19 = i7;
                                function214 = function27;
                                function216 = function25;
                                textFieldColors2 = textFieldColors;
                                z9 = z2;
                                textFieldDefaults = this;
                            }
                            composer3.S();
                            if (ComposerKt.v()) {
                                i22 = i19;
                                ComposerKt.p5(-1280721485, i22, i17, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:747)");
                            } else {
                                i22 = i19;
                            }
                            int i28 = i17 & 14;
                            int i29 = i17 << 3;
                            int i30 = i28 | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (i29 & 458752);
                            Composer composer4 = composer3;
                            boolean z11 = z9;
                            boolean z12 = z5;
                            Function2 function220 = function213;
                            textFieldDefaults.t(str, function2, z11, z3, visualTransformation, interactionSource, z12, function214, function220, function215, function216, textFieldDefaults.KN(composer3, (i17 >> 12) & 14), textFieldColors2, paddingValues2, function211, composer4, i22 & 2147483646, i30, 0);
                            composer2 = composer4;
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            function210 = function216;
                            function29 = function215;
                            function28 = function220;
                            function212 = function214;
                            z6 = z12;
                        } else {
                            composer2 = composerKN;
                            composer2.wTp();
                            function28 = function23;
                            function29 = function24;
                            function210 = function25;
                            paddingValues2 = paddingValues;
                            function211 = function26;
                            z6 = z5;
                            function212 = function27;
                            textFieldColors2 = textFieldColors;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    n(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer5, int i31) {
                                    this.f23511n.rl(str, function2, z2, z3, visualTransformation, interactionSource, z6, function212, function28, function29, function210, textFieldColors2, paddingValues2, function211, composer5, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    i12 = i11;
                    i13 = i5 & 1024;
                    if (i13 != 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    }
                    int i242 = i15;
                    i16 = i5 & 8192;
                    if (i16 != 0) {
                    }
                    if ((i5 & 16384) != 0) {
                    }
                    if (composerKN.HI(((306783379 & i7) == 306783378 && (i17 & 9363) == 9362) ? false : true, i7 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
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
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i5 & 1024;
                if (i13 != 0) {
                }
                if ((i3 & 48) == 0) {
                }
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                }
                int i2422 = i15;
                i16 = i5 & 8192;
                if (i16 != 0) {
                }
                if ((i5 & 16384) != 0) {
                }
                if (composerKN.HI(((306783379 & i7) == 306783378 && (i17 & 9363) == 9362) ? false : true, i7 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
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
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i5 & 1024;
            if (i13 != 0) {
            }
            if ((i3 & 48) == 0) {
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            }
            int i24222 = i15;
            i16 = i5 & 8192;
            if (i16 != 0) {
            }
            if ((i5 & 16384) != 0) {
            }
            if (composerKN.HI(((306783379 & i7) == 306783378 && (i17 & 9363) == 9362) ? false : true, i7 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        int i232 = 128;
        if ((i5 & 4) == 0) {
        }
        if ((i5 & 8) == 0) {
        }
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
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i5 & 1024;
        if (i13 != 0) {
        }
        if ((i3 & 48) == 0) {
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
        }
        int i242222 = i15;
        i16 = i5 & 8192;
        if (i16 != 0) {
        }
        if ((i5 & 16384) != 0) {
        }
        if (composerKN.HI(((306783379 & i7) == 306783378 && (i17 & 9363) == 9362) ? false : true, i7 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(final String str, final Function2 function2, final boolean z2, final boolean z3, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z4, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2 function26, Composer composer, final int i2, final int i3, int i5) {
        int i7;
        int i8;
        final boolean z5;
        int i9;
        Function2 function27;
        int i10;
        Function2 function28;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Composer composer2;
        final Function2 function29;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final Function2 function210;
        final Function2 function211;
        final Function2 function212;
        final Function2 function213;
        final PaddingValues paddingValues2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Shape shape3;
        boolean z6;
        Composer composer3;
        int i18;
        int i19;
        int i20;
        TextFieldColors textFieldColorsQie;
        PaddingValues paddingValuesTy;
        boolean z7;
        Function2 function2Nr;
        Shape shape4;
        PaddingValues paddingValues3;
        TextFieldColors textFieldColors3;
        boolean z9;
        int i21;
        int i22 = i5;
        Composer composerKN = composer.KN(-920823490);
        if ((i22 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.p5(str) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        if ((i22 & 2) != 0) {
            i7 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i7 |= composerKN.E2(function2) ? 32 : 16;
            }
            if ((i22 & 4) == 0) {
                i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i7 |= composerKN.n(z2) ? 256 : 128;
                }
                int i23 = 1024;
                if ((i22 & 8) != 0) {
                    i7 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        i7 |= composerKN.n(z3) ? 2048 : 1024;
                    }
                    if ((i22 & 16) == 0) {
                        i7 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            i7 |= composerKN.p5(visualTransformation) ? 16384 : 8192;
                        }
                        if ((i22 & 32) != 0) {
                            i7 |= 196608;
                        } else if ((i2 & 196608) == 0) {
                            i7 |= composerKN.p5(interactionSource) ? 131072 : 65536;
                        }
                        i8 = i22 & 64;
                        if (i8 != 0) {
                            i7 |= 1572864;
                            z5 = z4;
                        } else {
                            z5 = z4;
                            if ((i2 & 1572864) == 0) {
                                i7 |= composerKN.n(z5) ? 1048576 : 524288;
                            }
                        }
                        i9 = i22 & 128;
                        if (i9 != 0) {
                            i7 |= 12582912;
                            function27 = function22;
                        } else {
                            function27 = function22;
                            if ((i2 & 12582912) == 0) {
                                i7 |= composerKN.E2(function27) ? 8388608 : 4194304;
                            }
                        }
                        i10 = i22 & 256;
                        if (i10 != 0) {
                            i7 |= 100663296;
                            function28 = function23;
                        } else {
                            function28 = function23;
                            if ((i2 & 100663296) == 0) {
                                i7 |= composerKN.E2(function28) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                        }
                        i11 = i22 & 512;
                        if (i11 != 0) {
                            i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        } else {
                            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i12 = i11;
                                i7 |= composerKN.E2(function24) ? 536870912 : 268435456;
                            }
                            i13 = i22 & 1024;
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
                            if ((i3 & 48) == 0) {
                                i15 |= ((i22 & 2048) == 0 && composerKN.p5(shape)) ? 32 : 16;
                            }
                            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                i15 |= ((i22 & 4096) == 0 && composerKN.p5(textFieldColors)) ? 256 : 128;
                            }
                            if ((i3 & 3072) == 0) {
                                if ((i22 & 8192) == 0 && composerKN.p5(paddingValues)) {
                                    i23 = 2048;
                                }
                                i15 |= i23;
                            }
                            int i24 = i15;
                            i16 = i22 & 16384;
                            if (i16 != 0) {
                                i17 = i24;
                                if ((i3 & 24576) == 0) {
                                    i17 |= composerKN.E2(function26) ? 16384 : 8192;
                                }
                                if ((i22 & 32768) != 0) {
                                    i17 |= 196608;
                                } else if ((i3 & 196608) == 0) {
                                    i17 |= composerKN.p5(this) ? 131072 : 65536;
                                }
                                if (composerKN.HI(((i7 & 306783379) == 306783378 && (i17 & 74899) == 74898) ? false : true, i7 & 1)) {
                                    composerKN.e();
                                    if ((i2 & 1) == 0 || composerKN.rV9()) {
                                        boolean z10 = i8 != 0 ? false : z5;
                                        Function2 function214 = i9 != 0 ? null : function27;
                                        Function2 function215 = i10 != 0 ? null : function28;
                                        Function2 function216 = i12 != 0 ? null : function24;
                                        Function2 function217 = i14 != 0 ? null : function25;
                                        if ((i22 & 2048) != 0) {
                                            Shape shapeKN = KN(composerKN, (i17 >> 15) & 14);
                                            i17 &= -113;
                                            shape3 = shapeKN;
                                        } else {
                                            shape3 = shape;
                                        }
                                        if ((i22 & 4096) != 0) {
                                            i20 = i16;
                                            z6 = z10;
                                            i18 = i7;
                                            textFieldColorsQie = qie(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerKN, 0, 0, (i17 >> 12) & 112, 2097151);
                                            composer3 = composerKN;
                                            i19 = i17 & (-897);
                                        } else {
                                            z6 = z10;
                                            composer3 = composerKN;
                                            i18 = i7;
                                            i19 = i17;
                                            i20 = i16;
                                            textFieldColorsQie = textFieldColors;
                                        }
                                        i22 = i5;
                                        if ((i22 & 8192) != 0) {
                                            paddingValuesTy = ty(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                            i19 &= -7169;
                                        } else {
                                            paddingValuesTy = paddingValues;
                                        }
                                        if (i20 != 0) {
                                            final boolean z11 = z6;
                                            final TextFieldColors textFieldColors4 = textFieldColorsQie;
                                            final Shape shape5 = shape3;
                                            z7 = z11;
                                            shape4 = shape5;
                                            paddingValues3 = paddingValuesTy;
                                            textFieldColors3 = textFieldColors4;
                                            function2Nr = ComposableLambdaKt.nr(2147252344, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    n(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Composer composer4, int i25) {
                                                    if (!composer4.HI((i25 & 3) != 2, i25 & 1)) {
                                                        composer4.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(2147252344, i25, -1, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:659)");
                                                    }
                                                    TextFieldDefaults.f23471n.n(z2, z11, interactionSource, textFieldColors4, shape5, 0.0f, 0.0f, composer4, 12582912, 96);
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.M7();
                                                    }
                                                }
                                            }, composer3, 54);
                                        } else {
                                            z7 = z6;
                                            function2Nr = function26;
                                            shape4 = shape3;
                                            paddingValues3 = paddingValuesTy;
                                            textFieldColors3 = textFieldColorsQie;
                                        }
                                        z9 = z7;
                                        function211 = function214;
                                        function212 = function215;
                                        function29 = function216;
                                        function213 = function217;
                                    } else {
                                        composerKN.wTp();
                                        if ((i22 & 2048) != 0) {
                                            i17 &= -113;
                                        }
                                        i19 = i17;
                                        if ((i22 & 4096) != 0) {
                                            i19 &= -897;
                                        }
                                        if ((i22 & 8192) != 0) {
                                            i19 &= -7169;
                                        }
                                        function29 = function24;
                                        shape4 = shape;
                                        textFieldColors3 = textFieldColors;
                                        paddingValues3 = paddingValues;
                                        function2Nr = function26;
                                        composer3 = composerKN;
                                        i18 = i7;
                                        function211 = function27;
                                        function212 = function28;
                                        function213 = function25;
                                        z9 = z5;
                                    }
                                    composer3.S();
                                    if (ComposerKt.v()) {
                                        i21 = i18;
                                        ComposerKt.p5(-920823490, i21, i19, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:661)");
                                    } else {
                                        i21 = i18;
                                    }
                                    int i25 = i21 << 3;
                                    int i26 = i21 >> 9;
                                    int i27 = i19 << 6;
                                    Composer composer4 = composer3;
                                    TextFieldImplKt.n(TextFieldType.f23750t, str, function2, visualTransformation, function211, function212, function29, function213, z3, z2, z9, interactionSource, paddingValues3, shape4, textFieldColors3, function2Nr, composer4, (i25 & 896) | (i25 & 112) | 6 | ((i21 >> 3) & 7168) | (57344 & i26) | (458752 & i26) | (i26 & 3670016) | ((i19 << 21) & 29360128) | ((i21 << 15) & 234881024) | ((i21 << 21) & 1879048192), ((i21 >> 18) & 14) | ((i21 >> 12) & 112) | ((i19 >> 3) & 896) | (i27 & 7168) | (i27 & 57344) | ((i19 << 3) & 458752));
                                    composer2 = composer4;
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    z5 = z9;
                                    paddingValues2 = paddingValues3;
                                    shape2 = shape4;
                                    textFieldColors2 = textFieldColors3;
                                    function210 = function2Nr;
                                } else {
                                    composer2 = composerKN;
                                    composer2.wTp();
                                    function29 = function24;
                                    shape2 = shape;
                                    textFieldColors2 = textFieldColors;
                                    function210 = function26;
                                    function211 = function27;
                                    function212 = function28;
                                    function213 = function25;
                                    paddingValues2 = paddingValues;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    final int i28 = i22;
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            n(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer5, int i29) {
                                            this.f23494n.t(str, function2, z2, z3, visualTransformation, interactionSource, z5, function211, function212, function29, function213, shape2, textFieldColors2, paddingValues2, function210, composer5, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i28);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i17 = i24 | 24576;
                            if ((i22 & 32768) != 0) {
                            }
                            if (composerKN.HI(((i7 & 306783379) == 306783378 && (i17 & 74899) == 74898) ? false : true, i7 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i12 = i11;
                        i13 = i22 & 1024;
                        if (i13 == 0) {
                        }
                        if ((i3 & 48) == 0) {
                        }
                        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        int i242 = i15;
                        i16 = i22 & 16384;
                        if (i16 != 0) {
                        }
                        if ((i22 & 32768) != 0) {
                        }
                        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i17 & 74899) == 74898) ? false : true, i7 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    if ((i22 & 32) != 0) {
                    }
                    i8 = i22 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i22 & 128;
                    if (i9 != 0) {
                    }
                    i10 = i22 & 256;
                    if (i10 != 0) {
                    }
                    i11 = i22 & 512;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    i13 = i22 & 1024;
                    if (i13 == 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    int i2422 = i15;
                    i16 = i22 & 16384;
                    if (i16 != 0) {
                    }
                    if ((i22 & 32768) != 0) {
                    }
                    if (composerKN.HI(((i7 & 306783379) == 306783378 && (i17 & 74899) == 74898) ? false : true, i7 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                if ((i22 & 16) == 0) {
                }
                if ((i22 & 32) != 0) {
                }
                i8 = i22 & 64;
                if (i8 != 0) {
                }
                i9 = i22 & 128;
                if (i9 != 0) {
                }
                i10 = i22 & 256;
                if (i10 != 0) {
                }
                i11 = i22 & 512;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i22 & 1024;
                if (i13 == 0) {
                }
                if ((i3 & 48) == 0) {
                }
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                int i24222 = i15;
                i16 = i22 & 16384;
                if (i16 != 0) {
                }
                if ((i22 & 32768) != 0) {
                }
                if (composerKN.HI(((i7 & 306783379) == 306783378 && (i17 & 74899) == 74898) ? false : true, i7 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            int i232 = 1024;
            if ((i22 & 8) != 0) {
            }
            if ((i22 & 16) == 0) {
            }
            if ((i22 & 32) != 0) {
            }
            i8 = i22 & 64;
            if (i8 != 0) {
            }
            i9 = i22 & 128;
            if (i9 != 0) {
            }
            i10 = i22 & 256;
            if (i10 != 0) {
            }
            i11 = i22 & 512;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i22 & 1024;
            if (i13 == 0) {
            }
            if ((i3 & 48) == 0) {
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            int i242222 = i15;
            i16 = i22 & 16384;
            if (i16 != 0) {
            }
            if ((i22 & 32768) != 0) {
            }
            if (composerKN.HI(((i7 & 306783379) == 306783378 && (i17 & 74899) == 74898) ? false : true, i7 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        if ((i22 & 4) == 0) {
        }
        int i2322 = 1024;
        if ((i22 & 8) != 0) {
        }
        if ((i22 & 16) == 0) {
        }
        if ((i22 & 32) != 0) {
        }
        i8 = i22 & 64;
        if (i8 != 0) {
        }
        i9 = i22 & 128;
        if (i9 != 0) {
        }
        i10 = i22 & 256;
        if (i10 != 0) {
        }
        i11 = i22 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i22 & 1024;
        if (i13 == 0) {
        }
        if ((i3 & 48) == 0) {
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        int i2422222 = i15;
        i16 = i22 & 16384;
        if (i16 != 0) {
        }
        if ((i22 & 32768) != 0) {
        }
        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i17 & 74899) == 74898) ? false : true, i7 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static /* synthetic */ PaddingValues Ik(TextFieldDefaults textFieldDefaults, float f3, float f4, float f5, float f6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = TextFieldImplKt.J2();
        }
        if ((i2 & 2) != 0) {
            f4 = TextFieldImplKt.J2();
        }
        if ((i2 & 4) != 0) {
            f5 = TextFieldKt.HI();
        }
        if ((i2 & 8) != 0) {
            f6 = TextFieldKt.ck();
        }
        return textFieldDefaults.ck(f3, f4, f5, f6);
    }

    public static /* synthetic */ Modifier gh(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z2, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors, float f3, float f4, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            f3 = FocusedBorderThickness;
        }
        return textFieldDefaults.mUb(modifier, z2, z3, interactionSource, textFieldColors, f3, (i2 & 32) != 0 ? UnfocusedBorderThickness : f4);
    }

    public static /* synthetic */ PaddingValues o(TextFieldDefaults textFieldDefaults, float f3, float f4, float f5, float f6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = TextFieldImplKt.J2();
        }
        if ((i2 & 2) != 0) {
            f4 = TextFieldImplKt.J2();
        }
        if ((i2 & 4) != 0) {
            f5 = TextFieldImplKt.J2();
        }
        if ((i2 & 8) != 0) {
            f6 = TextFieldImplKt.J2();
        }
        return textFieldDefaults.r(f3, f4, f5, f6);
    }

    public static /* synthetic */ PaddingValues ty(TextFieldDefaults textFieldDefaults, float f3, float f4, float f5, float f6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = TextFieldImplKt.J2();
        }
        if ((i2 & 2) != 0) {
            f4 = TextFieldImplKt.J2();
        }
        if ((i2 & 4) != 0) {
            f5 = TextFieldImplKt.J2();
        }
        if ((i2 & 8) != 0) {
            f6 = TextFieldImplKt.J2();
        }
        return textFieldDefaults.az(f3, f4, f5, f6);
    }

    public final float J2() {
        return MinHeight;
    }

    public final float Uo() {
        return MinWidth;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(final boolean z2, final boolean z3, final InteractionSource interactionSource, final TextFieldColors textFieldColors, Shape shape, float f3, float f4, Composer composer, final int i2, final int i3) {
        boolean z4;
        int i5;
        boolean z5;
        InteractionSource interactionSource2;
        TextFieldColors textFieldColors2;
        Shape shapeKN;
        float f5;
        float f6;
        final float f7;
        final float f8;
        Composer composerKN = composer.KN(943754022);
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
                shapeKN = shape;
                int i7 = composerKN.p5(shapeKN) ? 16384 : 8192;
                i5 |= i7;
            } else {
                shapeKN = shape;
            }
            i5 |= i7;
        } else {
            shapeKN = shape;
        }
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                f5 = f3;
                int i8 = composerKN.rl(f5) ? 131072 : 65536;
                i5 |= i8;
            } else {
                f5 = f3;
            }
            i5 |= i8;
        } else {
            f5 = f3;
        }
        if ((1572864 & i2) == 0) {
            if ((i3 & 64) == 0) {
                f6 = f4;
                int i9 = composerKN.rl(f6) ? 1048576 : 524288;
                i5 |= i9;
            } else {
                f6 = f4;
            }
            i5 |= i9;
        } else {
            f6 = f4;
        }
        if ((i3 & 128) != 0) {
            i5 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i5 |= composerKN.p5(this) ? 8388608 : 4194304;
        }
        if (composerKN.HI((4793491 & i5) != 4793490, i5 & 1)) {
            composerKN.e();
            if ((i2 & 1) == 0 || composerKN.rV9()) {
                if ((i3 & 16) != 0) {
                    shapeKN = KN(composerKN, (i5 >> 21) & 14);
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
                float f9 = f5;
                float f10 = f6;
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(943754022, i5, -1, "androidx.compose.material.TextFieldDefaults.BorderBox (TextFieldDefaults.kt:325)");
                }
                int i10 = i5 & 8190;
                int i11 = i5 >> 3;
                BoxKt.n(BorderKt.O(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.rl(z4, z5, interactionSource2, textFieldColors2, f9, f10, composerKN, i10 | (57344 & i11) | (i11 & 458752)).getValue(), shapeKN), composerKN, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                f8 = f9;
                f7 = f10;
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
                float f92 = f5;
                float f102 = f6;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                int i102 = i5 & 8190;
                int i112 = i5 >> 3;
                BoxKt.n(BorderKt.O(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.rl(z4, z5, interactionSource2, textFieldColors2, f92, f102, composerKN, i102 | (57344 & i112) | (i112 & 458752)).getValue(), shapeKN), composerKN, 0);
                if (ComposerKt.v()) {
                }
                f8 = f92;
                f7 = f102;
            }
        } else {
            composerKN.wTp();
            f7 = f6;
            f8 = f5;
        }
        final Shape shape2 = shapeKN;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$BorderBox$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i12) {
                    this.f23477n.n(z2, z3, interactionSource, textFieldColors, shape2, f8, f7, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    private TextFieldDefaults() {
    }

    public final Shape KN(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1899109048, i2, -1, "androidx.compose.material.TextFieldDefaults.<get-OutlinedTextFieldShape> (TextFieldDefaults.kt:227)");
        }
        CornerBasedShape small = MaterialTheme.f22169n.rl(composer, 6).getSmall();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return small;
    }

    public final PaddingValues az(float start, float top, float end, float bottom) {
        return PaddingKt.nr(start, top, end, bottom);
    }

    public final PaddingValues ck(float start, float end, float top, float bottom) {
        return PaddingKt.nr(start, top, end, bottom);
    }

    public final Modifier mUb(Modifier modifier, final boolean z2, final boolean z3, final InteractionSource interactionSource, final TextFieldColors textFieldColors, final float f3, final float f4) {
        Function1<InspectorInfo, Unit> function1N;
        if (InspectableValueKt.rl()) {
            function1N = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
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
        return ComposedModifierKt.rl(modifier, function1N, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return n(modifier2, composer, num.intValue());
            }

            public final Modifier n(Modifier modifier2, Composer composer, int i2) {
                composer.eF(1398930845);
                if (ComposerKt.v()) {
                    ComposerKt.p5(1398930845, i2, -1, "androidx.compose.material.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:288)");
                }
                Modifier modifierTy = TextFieldKt.ty(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.rl(z2, z3, interactionSource, textFieldColors, f3, f4, composer, 0).getValue());
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                return modifierTy;
            }
        });
    }

    public final PaddingValues r(float start, float top, float end, float bottom) {
        return PaddingKt.nr(start, top, end, bottom);
    }

    public final Shape xMQ(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1117199624, i2, -1, "androidx.compose.material.TextFieldDefaults.<get-TextFieldShape> (TextFieldDefaults.kt:220)");
        }
        CornerBasedShape cornerBasedShapeNr = CornerBasedShape.nr(MaterialTheme.f22169n.rl(composer, 6).getSmall(), null, null, CornerSizeKt.t(), CornerSizeKt.t(), 3, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return cornerBasedShapeNr;
    }
}
