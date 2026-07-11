package androidx.compose.material3.internal;

import WJ.phkN.HFAkacKHsU;
import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.Typography;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a¢\u0002\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00062\u0006\u0010\t\u001a\u00020\b2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a5\u0010#\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0003ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a-\u0010%\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0003ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a#\u0010)\u001a\u00020'*\u00020'2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0002H\u0000¢\u0006\u0004\b)\u0010*\u001a#\u0010/\u001a\u00020'*\u00020'2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0004\b/\u00100\u001a\u0019\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101H\u0000¢\u0006\u0004\b4\u00105\u001a\u0019\u00106\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101H\u0000¢\u0006\u0004\b6\u00105\u001aH\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u000208H\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>\"\u001a\u0010C\u001a\u00020?8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010@\u001a\u0004\bA\u0010B\"\u001a\u0010H\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u001a\u0010K\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010E\u001a\u0004\bJ\u0010G\"\u001a\u0010M\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010E\u001a\u0004\bL\u0010G\"\u001a\u0010O\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010E\u001a\u0004\bN\u0010G\"\u001a\u0010R\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010E\u001a\u0004\bQ\u0010G\"\u001a\u0010U\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010E\u001a\u0004\bT\u0010G\"\u001a\u0010W\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010E\u001a\u0004\bV\u0010G\"\u001a\u0010[\u001a\u00020'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010X\u001a\u0004\bY\u0010Z\"\u001a\u0010`\u001a\u0004\u0018\u00010]*\u00020\\8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006c²\u0006\f\u0010a\u001a\u00020\u00118\nX\u008a\u0084\u0002²\u0006\f\u0010b\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/internal/TextFieldType;", "type", "", "value", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "innerTextField", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "", "singleLine", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/material3/TextFieldColors;", "colors", TtmlNode.RUBY_CONTAINER, c.f62177j, "(Landroidx/compose/material3/internal/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/graphics/Color;", "contentColor", "Landroidx/compose/ui/text/TextStyle;", "textStyle", AppLovinEventTypes.USER_VIEWED_CONTENT, "nr", "(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "O", "(JLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "defaultErrorMessage", "xMQ", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/ColorProducer;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/ui/graphics/Shape;", "shape", "XQ", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/Placeable;", "placeable", "", "S", "(Landroidx/compose/ui/layout/Placeable;)I", "Z", "focused", "Landroidx/compose/ui/unit/Dp;", "focusedBorderThickness", "unfocusedBorderThickness", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", "KN", "(ZZZLandroidx/compose/material3/TextFieldColors;FFLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Constraints;", "J", "o", "()J", "ZeroConstraints", "rl", "F", "r", "()F", "TextFieldPadding", "t", "mUb", "HorizontalIconPadding", "Ik", "SupportingTopPadding", "ck", "PrefixSuffixTextPadding", "J2", "HI", "MinTextLineHeight", "Uo", "az", "MinFocusedLabelLineHeight", "ty", "MinSupportingTextLineHeight", "Landroidx/compose/ui/Modifier;", "gh", "()Landroidx/compose/ui/Modifier;", "IconDefaultSizeModifier", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "qie", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "layoutId", "showPlaceholder", "showPrefixSuffix", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/internal/TextFieldImplKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 5 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,501:1\n346#1,9:512\n357#1,4:525\n352#1:533\n365#1,2:534\n387#1,4:539\n364#1:547\n395#1,2:548\n399#1,4:553\n394#1:561\n407#1,3:562\n411#1,3:567\n406#1:586\n419#1,4:587\n418#1,13:600\n432#1:637\n1223#2,6:502\n1223#2,3:571\n1226#2,3:575\n1223#2,3:592\n1226#2,3:596\n1223#2,6:613\n1223#2,6:619\n1223#2,6:625\n1223#2,6:631\n1223#2,3:665\n1226#2,3:669\n1223#2,3:683\n1226#2,3:687\n708#3:508\n696#3:509\n708#3:510\n696#3:511\n1967#4:521\n1882#4,3:522\n1885#4,4:529\n1882#4,3:536\n1885#4,4:543\n1882#4,3:550\n1885#4,4:557\n1882#4,7:579\n1967#4:638\n1882#4,7:639\n1967#4:646\n1882#4,7:647\n1967#4:654\n1882#4,7:655\n1882#4,7:673\n1882#4,7:691\n68#5,2:565\n70#5:570\n71#5:574\n74#5:578\n70#5:591\n71#5:595\n74#5:599\n68#5,3:662\n71#5:668\n74#5:672\n68#5,3:680\n71#5:686\n74#5:690\n81#6:698\n81#6:699\n148#7:700\n148#7:701\n148#7:702\n148#7:703\n148#7:704\n148#7:705\n148#7:706\n148#7:707\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/internal/TextFieldImplKt\n*L\n122#1:512,9\n122#1:525,4\n122#1:533\n122#1:534,2\n122#1:539,4\n122#1:547\n122#1:548,2\n122#1:553,4\n122#1:561\n122#1:562,3\n122#1:567,3\n122#1:586\n122#1:587,4\n122#1:600,13\n122#1:637\n99#1:502,6\n122#1:571,3\n122#1:575,3\n122#1:592,3\n122#1:596,3\n156#1:613,6\n173#1:619,6\n254#1:625,6\n276#1:631,6\n407#1:665,3\n407#1:669,3\n419#1:683,3\n419#1:687,3\n126#1:508\n126#1:509\n130#1:510\n130#1:511\n122#1:521\n122#1:522,3\n122#1:529,4\n122#1:536,3\n122#1:543,4\n122#1:550,3\n122#1:557,4\n122#1:579,7\n353#1:638\n353#1:639,7\n365#1:646\n365#1:647,7\n395#1:654\n395#1:655,7\n407#1:673,7\n419#1:691,7\n122#1:565,2\n122#1:570\n122#1:574\n122#1:578\n122#1:591\n122#1:595\n122#1:599\n407#1:662,3\n407#1:668\n407#1:672\n419#1:680,3\n419#1:686\n419#1:690\n156#1:698\n173#1:699\n492#1:700\n493#1:701\n494#1:702\n495#1:703\n496#1:704\n497#1:705\n498#1:706\n500#1:707\n*E\n"})
public final class TextFieldImplKt {
    private static final float KN;
    private static final float Uo;
    private static final float rl;
    private static final Modifier xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f29240n = ConstraintsKt.n(0, 0, 0, 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f29241t = Dp.KN(12);
    private static final float nr = Dp.KN(4);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f29239O = Dp.KN(2);
    private static final float J2 = Dp.KN(24);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            try {
                iArr[TextFieldType.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldType.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InputPhase.values().length];
            try {
                iArr2[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        float f3 = 16;
        rl = Dp.KN(f3);
        Uo = Dp.KN(f3);
        KN = Dp.KN(f3);
        float f4 = 48;
        xMQ = SizeKt.n(Modifier.INSTANCE, Dp.KN(f4), Dp.KN(f4));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0979  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0996  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0a3b  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0a96  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0aad  */
    /* JADX WARN: Removed duplicated region for block: B:514:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final TextFieldType textFieldType, final String str, final Function2 function2, final VisualTransformation visualTransformation, final Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, Function2 function28, boolean z2, boolean z3, boolean z4, final InteractionSource interactionSource, final PaddingValues paddingValues, final TextFieldColors textFieldColors, final Function2 function29, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        int i8;
        int i9;
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
        int i23;
        boolean z5;
        Object objIF;
        long jJ2;
        boolean z6;
        long jKN;
        long jKN2;
        FloatCompanionObject floatCompanionObject;
        TwoWayConverter twoWayConverter;
        InputPhase inputPhase;
        int i24;
        float f3;
        int[] iArr;
        InputPhase inputPhase2;
        int i25;
        float f4;
        Transition transition;
        int i26;
        int i27;
        float f5;
        Float f6;
        InputPhase inputPhase3;
        int i28;
        float f7;
        TwoWayConverter twoWayConverter2;
        InputPhase inputPhase4;
        int i29;
        float f8;
        Float f9;
        InputPhase inputPhase5;
        int i30;
        final State stateJ2;
        ColorSpace colorSpaceR;
        boolean zP5;
        Object objIF2;
        State state;
        ColorSpace colorSpaceR2;
        boolean zP52;
        Object objIF3;
        int i31;
        final TextStyle textStyle;
        ComposableLambda composableLambdaNr;
        Object objIF4;
        Composer.Companion companion;
        Function2 function210;
        ComposableLambda composableLambdaNr2;
        Object objIF5;
        Function2 function211;
        State state2;
        Function2 function212;
        ComposableLambda composableLambdaNr3;
        Function2 function213;
        ComposableLambda composableLambdaNr4;
        char c2;
        boolean z7;
        ComposableLambda composableLambdaNr5;
        final Function2 function214;
        ComposableLambda composableLambdaNr6;
        final Function2 function215;
        ComposableLambda composableLambdaNr7;
        int i32;
        Function2 function216;
        Composer composer2;
        boolean z9;
        final Function2 function217;
        final Function2 function218;
        final Function2 function219;
        final Function2 function220;
        final boolean z10;
        final Function2 function221;
        final boolean z11;
        final boolean z12;
        final Function2 function222;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1514469103);
        if ((i5 & 1) != 0) {
            i8 = i2 | 6;
            i7 = 2;
        } else if ((i2 & 6) == 0) {
            i7 = 2;
            i8 = i2 | (composerKN.p5(textFieldType) ? 4 : 2);
        } else {
            i7 = 2;
            i8 = i2;
        }
        if ((i5 & 2) != 0) {
            i8 |= 48;
        } else if ((i2 & 48) == 0) {
            i8 |= composerKN.p5(str) ? 32 : 16;
        }
        int i33 = i8;
        if ((i5 & 4) == 0) {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i33 |= composerKN.E2(function2) ? 256 : 128;
            }
            if ((i5 & 8) == 0) {
                i33 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i33 |= composerKN.p5(visualTransformation) ? 2048 : 1024;
            }
            if ((i5 & 16) == 0) {
                i33 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i33 |= composerKN.E2(function22) ? 16384 : 8192;
            }
            i9 = i5 & 32;
            if (i9 == 0) {
                i33 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i33 |= composerKN.E2(function23) ? 131072 : 65536;
            }
            i10 = i5 & 64;
            if (i10 == 0) {
                i33 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i33 |= composerKN.E2(function24) ? 1048576 : 524288;
            }
            i11 = i5 & 128;
            if (i11 == 0) {
                i33 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i33 |= composerKN.E2(function25) ? 8388608 : 4194304;
            }
            i12 = i5 & 256;
            if (i12 == 0) {
                i33 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                i33 |= composerKN.E2(function26) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
            }
            i13 = i5 & 512;
            if (i13 == 0) {
                i33 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                i14 = i13;
            } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                i14 = i13;
                i33 |= composerKN.E2(function27) ? 536870912 : 268435456;
            } else {
                i14 = i13;
            }
            i15 = i5 & 1024;
            if (i15 == 0) {
                i16 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                i16 = i3 | (composerKN.E2(function28) ? 4 : i7);
            } else {
                i16 = i3;
            }
            i17 = i5 & 2048;
            if (i17 == 0) {
                i16 |= 48;
                i18 = i17;
            } else if ((i3 & 48) == 0) {
                i18 = i17;
                i16 |= composerKN.n(z2) ? 32 : 16;
            } else {
                i18 = i17;
            }
            int i34 = i16;
            i19 = i5 & 4096;
            if (i19 == 0) {
                i21 = i34 | RendererCapabilities.DECODER_SUPPORT_MASK;
                i22 = i19;
                i20 = i9;
            } else {
                int i35 = i34;
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i35 |= composerKN.n(z3) ? 256 : 128;
                }
                i20 = i9;
                i21 = i35;
                i22 = i19;
            }
            i23 = i5 & 8192;
            if (i23 == 0) {
                i21 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i21 |= composerKN.n(z4) ? 2048 : 1024;
            }
            if ((i5 & 16384) == 0) {
                i21 |= 24576;
            } else if ((i3 & 24576) == 0) {
                i21 |= composerKN.p5(interactionSource) ? 16384 : 8192;
            }
            if ((32768 & i5) == 0) {
                i21 |= 196608;
            } else if ((i3 & 196608) == 0) {
                i21 |= composerKN.p5(paddingValues) ? 131072 : 65536;
            }
            if ((i5 & 65536) == 0) {
                i21 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                i21 |= composerKN.p5(textFieldColors) ? 1048576 : 524288;
            }
            if ((i5 & 131072) == 0) {
                i21 |= 12582912;
            } else if ((i3 & 12582912) == 0) {
                i21 |= composerKN.E2(function29) ? 8388608 : 4194304;
            }
            if ((306783379 & i33) != 306783378 && (4793491 & i21) == 4793490 && composerKN.xMQ()) {
                composerKN.wTp();
                function217 = function23;
                function219 = function24;
                function221 = function25;
                function218 = function26;
                function222 = function27;
                function220 = function28;
                z12 = z3;
                z11 = z4;
                composer2 = composerKN;
                z10 = z2;
            } else {
                Function2 function223 = i20 == 0 ? null : function23;
                final Function2 function224 = i10 == 0 ? null : function24;
                Function2 function225 = i11 == 0 ? null : function25;
                Function2 function226 = i12 == 0 ? null : function26;
                Function2 function227 = i14 == 0 ? null : function27;
                Function2 function228 = i15 == 0 ? null : function28;
                final Function2 function229 = function223;
                boolean z13 = i18 == 0 ? false : z2;
                boolean z14 = i22 == 0 ? true : z3;
                boolean z15 = i23 == 0 ? false : z4;
                if (ComposerKt.v()) {
                    ComposerKt.p5(1514469103, i33, i21, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                }
                z5 = ((i33 & 112) != 32) | ((i33 & 7168) != 2048);
                objIF = composerKN.iF();
                if (!z5 || objIF == Composer.INSTANCE.n()) {
                    objIF = visualTransformation.n(new AnnotatedString(str, null, null, 6, null));
                    composerKN.o(objIF);
                }
                String text = ((TransformedText) objIF).getText().getText();
                boolean zBooleanValue = ((Boolean) FocusInteractionKt.n(interactionSource, composerKN, (i21 >> 12) & 14).getValue()).booleanValue();
                InputPhase inputPhase6 = !zBooleanValue ? InputPhase.Focused : text.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
                jJ2 = textFieldColors.J2(z14, z15, zBooleanValue);
                int i36 = i21;
                Typography typographyT = MaterialTheme.f26164n.t(composerKN, 6);
                final TextStyle bodyLarge = typographyT.getBodyLarge();
                final TextStyle bodySmall = typographyT.getBodySmall();
                long jKN3 = bodyLarge.KN();
                Color.Companion companion2 = Color.INSTANCE;
                Function2 function230 = function225;
                Function2 function231 = function228;
                z6 = (Color.HI(jKN3, companion2.Uo()) && !Color.HI(bodySmall.KN(), companion2.Uo())) || (!Color.HI(bodyLarge.KN(), companion2.Uo()) && Color.HI(bodySmall.KN(), companion2.Uo()));
                jKN = bodySmall.KN();
                if (z6 && jKN == 16) {
                    jKN = jJ2;
                }
                jKN2 = bodyLarge.KN();
                if (z6 && jKN2 == 16) {
                    jKN2 = jJ2;
                }
                final boolean z16 = z6;
                boolean z17 = function22 != null;
                long j2 = jKN;
                Transition transitionMUb = TransitionKt.mUb(inputPhase6, "TextFieldInputState", composerKN, 48, 0);
                TextFieldImplKt$TextFieldTransitionScope$labelProgress$1 textFieldImplKt$TextFieldTransitionScope$labelProgress$1 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelProgress$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                        return n(segment, composer3, num.intValue());
                    }

                    public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i37) {
                        composer3.eF(1276209157);
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1276209157, i37, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:354)");
                        }
                        TweenSpec tweenSpecTy = AnimationSpecKt.ty(150, 0, null, 6, null);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        composer3.Xw();
                        return tweenSpecTy;
                    }
                };
                FloatCompanionObject floatCompanionObject2 = FloatCompanionObject.INSTANCE;
                TwoWayConverter twoWayConverterXMQ = VectorConvertersKt.xMQ(floatCompanionObject2);
                InputPhase inputPhase7 = (InputPhase) transitionMUb.xMQ();
                composerKN.eF(-2036730335);
                if (ComposerKt.v()) {
                    floatCompanionObject = floatCompanionObject2;
                    twoWayConverter = twoWayConverterXMQ;
                    inputPhase = inputPhase7;
                    ComposerKt.p5(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                } else {
                    floatCompanionObject = floatCompanionObject2;
                    twoWayConverter = twoWayConverterXMQ;
                    inputPhase = inputPhase7;
                }
                int[] iArr2 = WhenMappings.$EnumSwitchMapping$1;
                i24 = iArr2[inputPhase.ordinal()];
                float f10 = 1.0f;
                if (i24 == 1) {
                    f3 = 1.0f;
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    composerKN.Xw();
                    Float fValueOf = Float.valueOf(f3);
                    InputPhase inputPhase8 = (InputPhase) transitionMUb.Ik();
                    composerKN.eF(-2036730335);
                    if (ComposerKt.v()) {
                        iArr = iArr2;
                        inputPhase2 = inputPhase8;
                        ComposerKt.p5(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                    } else {
                        iArr = iArr2;
                        inputPhase2 = inputPhase8;
                    }
                    i25 = iArr[inputPhase2.ordinal()];
                    if (i25 == 1) {
                        f4 = 1.0f;
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        composerKN.Xw();
                        State stateJ22 = TransitionKt.J2(transitionMUb, fValueOf, Float.valueOf(f4), textFieldImplKt$TextFieldTransitionScope$labelProgress$1.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverter, "LabelProgress", composerKN, 196608);
                        TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                return n(segment, composer3, num.intValue());
                            }

                            public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i37) {
                                FiniteAnimationSpec finiteAnimationSpecAz;
                                composer3.eF(-1154662212);
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1154662212, i37, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:367)");
                                }
                                InputPhase inputPhase9 = InputPhase.Focused;
                                InputPhase inputPhase10 = InputPhase.UnfocusedEmpty;
                                if (segment.t(inputPhase9, inputPhase10)) {
                                    finiteAnimationSpecAz = AnimationSpecKt.ty(67, 0, EasingKt.O(), 2, null);
                                } else if (!segment.t(inputPhase10, inputPhase9) && !segment.t(InputPhase.UnfocusedNotEmpty, inputPhase10)) {
                                    finiteAnimationSpecAz = AnimationSpecKt.qie(0.0f, 0.0f, null, 7, null);
                                } else {
                                    finiteAnimationSpecAz = AnimationSpecKt.az(83, 67, EasingKt.O());
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                composer3.Xw();
                                return finiteAnimationSpecAz;
                            }
                        };
                        TwoWayConverter twoWayConverterXMQ2 = VectorConvertersKt.xMQ(floatCompanionObject);
                        InputPhase inputPhase9 = (InputPhase) transitionMUb.xMQ();
                        composerKN.eF(1435837472);
                        if (ComposerKt.v()) {
                            transition = transitionMUb;
                            i26 = i33;
                            ComposerKt.p5(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                        } else {
                            transition = transitionMUb;
                            i26 = i33;
                        }
                        i27 = iArr[inputPhase9.ordinal()];
                        if (i27 == 1) {
                            f5 = 1.0f;
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            composerKN.Xw();
                            Float fValueOf2 = Float.valueOf(f5);
                            InputPhase inputPhase10 = (InputPhase) transition.Ik();
                            composerKN.eF(1435837472);
                            if (ComposerKt.v()) {
                                f6 = fValueOf2;
                                inputPhase3 = inputPhase10;
                                ComposerKt.p5(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                            } else {
                                f6 = fValueOf2;
                                inputPhase3 = inputPhase10;
                            }
                            i28 = iArr[inputPhase3.ordinal()];
                            if (i28 == 1) {
                                f7 = 1.0f;
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                composerKN.Xw();
                                final State stateJ23 = TransitionKt.J2(transition, f6, Float.valueOf(f7), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.invoke(transition.HI(), composerKN, 0), twoWayConverterXMQ2, "PlaceholderOpacity", composerKN, 196608);
                                TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                        return n(segment, composer3, num.intValue());
                                    }

                                    public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i37) {
                                        composer3.eF(-1868044898);
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-1868044898, i37, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:396)");
                                        }
                                        TweenSpec tweenSpecTy = AnimationSpecKt.ty(150, 0, null, 6, null);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                        composer3.Xw();
                                        return tweenSpecTy;
                                    }
                                };
                                TwoWayConverter twoWayConverterXMQ3 = VectorConvertersKt.xMQ(floatCompanionObject);
                                InputPhase inputPhase11 = (InputPhase) transition.xMQ();
                                composerKN.eF(1128033978);
                                if (ComposerKt.v()) {
                                    twoWayConverter2 = twoWayConverterXMQ3;
                                    inputPhase4 = inputPhase11;
                                    ComposerKt.p5(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                                } else {
                                    twoWayConverter2 = twoWayConverterXMQ3;
                                    inputPhase4 = inputPhase11;
                                }
                                i29 = iArr[inputPhase4.ordinal()];
                                if (i29 == 1) {
                                    f8 = 1.0f;
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    composerKN.Xw();
                                    Float fValueOf3 = Float.valueOf(f8);
                                    InputPhase inputPhase12 = (InputPhase) transition.Ik();
                                    composerKN.eF(1128033978);
                                    if (ComposerKt.v()) {
                                        f9 = fValueOf3;
                                        inputPhase5 = inputPhase12;
                                        ComposerKt.p5(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                                    } else {
                                        f9 = fValueOf3;
                                        inputPhase5 = inputPhase12;
                                    }
                                    i30 = iArr[inputPhase5.ordinal()];
                                    if (i30 != 1) {
                                        if (i30 != 2) {
                                            if (i30 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                        } else if (z17) {
                                            f10 = 0.0f;
                                        }
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    composerKN.Xw();
                                    stateJ2 = TransitionKt.J2(transition, f9, Float.valueOf(f10), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.invoke(transition.HI(), composerKN, 0), twoWayConverter2, "PrefixSuffixOpacity", composerKN, 196608);
                                    TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                            return n(segment, composer3, num.intValue());
                                        }

                                        public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i37) {
                                            composer3.eF(1528582156);
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(1528582156, i37, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:407)");
                                            }
                                            TweenSpec tweenSpecTy = AnimationSpecKt.ty(150, 0, null, 6, null);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                            composer3.Xw();
                                            return tweenSpecTy;
                                        }
                                    };
                                    InputPhase inputPhase13 = (InputPhase) transition.Ik();
                                    composerKN.eF(-107432127);
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                                    }
                                    long j3 = iArr[inputPhase13.ordinal()] == 1 ? j2 : jKN2;
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    composerKN.Xw();
                                    colorSpaceR = Color.r(j3);
                                    zP5 = composerKN.p5(colorSpaceR);
                                    objIF2 = composerKN.iF();
                                    if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                                        objIF2 = (TwoWayConverter) ColorVectorConverterKt.n(companion2).invoke(colorSpaceR);
                                        composerKN.o(objIF2);
                                    }
                                    TwoWayConverter twoWayConverter3 = (TwoWayConverter) objIF2;
                                    InputPhase inputPhase14 = (InputPhase) transition.xMQ();
                                    composerKN.eF(-107432127);
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                                    }
                                    long j4 = iArr[inputPhase14.ordinal()] != 1 ? j2 : jKN2;
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    composerKN.Xw();
                                    Color colorXMQ = Color.xMQ(j4);
                                    InputPhase inputPhase15 = (InputPhase) transition.Ik();
                                    composerKN.eF(-107432127);
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                                    }
                                    long j5 = iArr[inputPhase15.ordinal()] != 1 ? j2 : jKN2;
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    composerKN.Xw();
                                    State stateJ24 = TransitionKt.J2(transition, colorXMQ, Color.xMQ(j5), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.invoke(transition.HI(), composerKN, 0), twoWayConverter3, "LabelTextStyleColor", composerKN, 196608);
                                    Transition transition2 = transition;
                                    TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$1 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                            return n(segment, composer3, num.intValue());
                                        }

                                        public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i37) {
                                            composer3.eF(-543659263);
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-543659263, i37, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:419)");
                                            }
                                            TweenSpec tweenSpecTy = AnimationSpecKt.ty(150, 0, null, 6, null);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                            composer3.Xw();
                                            return tweenSpecTy;
                                        }
                                    };
                                    composerKN.eF(1023351670);
                                    if (ComposerKt.v()) {
                                        state = stateJ24;
                                    } else {
                                        state = stateJ24;
                                        ComposerKt.p5(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    composerKN.Xw();
                                    colorSpaceR2 = Color.r(jJ2);
                                    zP52 = composerKN.p5(colorSpaceR2);
                                    objIF3 = composerKN.iF();
                                    if (!zP52 || objIF3 == Composer.INSTANCE.n()) {
                                        objIF3 = (TwoWayConverter) ColorVectorConverterKt.n(companion2).invoke(colorSpaceR2);
                                        composerKN.o(objIF3);
                                    }
                                    TwoWayConverter twoWayConverter4 = (TwoWayConverter) objIF3;
                                    composerKN.eF(1023351670);
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    composerKN.Xw();
                                    Color colorXMQ2 = Color.xMQ(jJ2);
                                    composerKN.eF(1023351670);
                                    if (ComposerKt.v()) {
                                        i31 = 0;
                                    } else {
                                        i31 = 0;
                                        ComposerKt.p5(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    composerKN.Xw();
                                    final State stateJ25 = TransitionKt.J2(transition2, colorXMQ2, Color.xMQ(jJ2), textFieldImplKt$TextFieldTransitionScope$labelContentColor$1.invoke(transition2.HI(), composerKN, Integer.valueOf(i31)), twoWayConverter4, "LabelContentColor", composerKN, 196608);
                                    final float fFloatValue = ((Number) stateJ22.getValue()).floatValue();
                                    composerKN.eF(-156998101);
                                    if (function22 != null) {
                                        textStyle = bodySmall;
                                        composableLambdaNr = null;
                                    } else {
                                        final State state3 = state;
                                        Function2<Composer, Integer, Unit> function232 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                n(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer3, int i37) {
                                                if ((i37 & 3) == 2 && composer3.xMQ()) {
                                                    composer3.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-1236585568, i37, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:139)");
                                                }
                                                TextStyle textStyleT = TextStyleKt.t(bodyLarge, bodySmall, fFloatValue);
                                                boolean z18 = z16;
                                                State state4 = state3;
                                                if (z18) {
                                                    textStyleT = TextStyle.t(textStyleT, ((Color) state4.getValue()).getValue(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                                                }
                                                TextFieldImplKt.nr(((Color) stateJ25.getValue()).getValue(), textStyleT, function22, composer3, 0);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        };
                                        textStyle = bodySmall;
                                        composableLambdaNr = ComposableLambdaKt.nr(-1236585568, true, function232, composerKN, 54);
                                    }
                                    composerKN.Xw();
                                    final long jKN4 = textFieldColors.KN(z14, z15, zBooleanValue);
                                    objIF4 = composerKN.iF();
                                    companion = Composer.INSTANCE;
                                    if (objIF4 == companion.n()) {
                                        objIF4 = SnapshotStateKt.nr(SnapshotStateKt.r(), new Function0<Boolean>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$showPlaceholder$2$1
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke() {
                                                return Boolean.valueOf(((Number) stateJ23.getValue()).floatValue() > 0.0f);
                                            }
                                        });
                                        composerKN.o(objIF4);
                                    }
                                    State state4 = (State) objIF4;
                                    composerKN.eF(-156965270);
                                    if (function229 == null && text.length() == 0 && rl(state4)) {
                                        Function3<Modifier, Composer, Integer, Unit> function3 = new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer3, Integer num) {
                                                n(modifier, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Modifier modifier, Composer composer3, int i37) {
                                                if ((i37 & 6) == 0) {
                                                    i37 |= composer3.p5(modifier) ? 4 : 2;
                                                }
                                                if ((i37 & 19) == 18 && composer3.xMQ()) {
                                                    composer3.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-660524084, i37, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:161)");
                                                }
                                                boolean zP53 = composer3.p5(stateJ23);
                                                final State state5 = stateJ23;
                                                Object objIF6 = composer3.iF();
                                                if (zP53 || objIF6 == Composer.INSTANCE.n()) {
                                                    objIF6 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1$1$1
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                            n(graphicsLayerScope);
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void n(GraphicsLayerScope graphicsLayerScope) {
                                                            graphicsLayerScope.rl(((Number) state5.getValue()).floatValue());
                                                        }
                                                    };
                                                    composer3.o(objIF6);
                                                }
                                                Modifier modifierN = GraphicsLayerModifierKt.n(modifier, (Function1) objIF6);
                                                long j6 = jKN4;
                                                TextStyle textStyle2 = bodyLarge;
                                                Function2 function233 = function229;
                                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                                int iN = ComposablesKt.n(composer3, 0);
                                                CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                                Modifier modifierO = ComposedModifierKt.O(composer3, modifierN);
                                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                Function0 function0N = companion3.n();
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
                                                Updater.O(composerN, measurePolicyUo, companion3.t());
                                                Updater.O(composerN, compositionLocalMapIk, companion3.O());
                                                Function2 function2Rl = companion3.rl();
                                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                    composerN.o(Integer.valueOf(iN));
                                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                                }
                                                Updater.O(composerN, modifierO, companion3.nr());
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                                TextFieldImplKt.nr(j6, textStyle2, function233, composer3, 0);
                                                composer3.XQ();
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        };
                                        function210 = function229;
                                        composableLambdaNr2 = ComposableLambdaKt.nr(-660524084, true, function3, composerKN, 54);
                                    } else {
                                        function210 = function229;
                                        composableLambdaNr2 = null;
                                    }
                                    composerKN.Xw();
                                    final long jXMQ = textFieldColors.xMQ(z14, z15, zBooleanValue);
                                    objIF5 = composerKN.iF();
                                    if (objIF5 == companion.n()) {
                                        objIF5 = SnapshotStateKt.nr(SnapshotStateKt.r(), new Function0<Boolean>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$showPrefixSuffix$2$1
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke() {
                                                return Boolean.valueOf(((Number) stateJ2.getValue()).floatValue() > 0.0f);
                                            }
                                        });
                                        composerKN.o(objIF5);
                                    }
                                    State state5 = (State) objIF5;
                                    composerKN.eF(-156940524);
                                    if (function226 == null && t(state5)) {
                                        final Function2 function233 = function226;
                                        Function2<Composer, Integer, Unit> function234 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                n(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer3, int i37) {
                                                if ((i37 & 3) == 2 && composer3.xMQ()) {
                                                    composer3.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(274398694, i37, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:178)");
                                                }
                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                boolean zP53 = composer3.p5(stateJ2);
                                                final State state6 = stateJ2;
                                                Object objIF6 = composer3.iF();
                                                if (zP53 || objIF6 == Composer.INSTANCE.n()) {
                                                    objIF6 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1$1$1
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                            n(graphicsLayerScope);
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void n(GraphicsLayerScope graphicsLayerScope) {
                                                            graphicsLayerScope.rl(((Number) state6.getValue()).floatValue());
                                                        }
                                                    };
                                                    composer3.o(objIF6);
                                                }
                                                Modifier modifierN = GraphicsLayerModifierKt.n(companion3, (Function1) objIF6);
                                                long j6 = jXMQ;
                                                TextStyle textStyle2 = bodyLarge;
                                                Function2 function235 = function233;
                                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                                int iN = ComposablesKt.n(composer3, 0);
                                                CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                                Modifier modifierO = ComposedModifierKt.O(composer3, modifierN);
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
                                                Updater.O(composerN, measurePolicyUo, companion4.t());
                                                Updater.O(composerN, compositionLocalMapIk, companion4.O());
                                                Function2 function2Rl = companion4.rl();
                                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                    composerN.o(Integer.valueOf(iN));
                                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                                }
                                                Updater.O(composerN, modifierO, companion4.nr());
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                                TextFieldImplKt.nr(j6, textStyle2, function235, composer3, 0);
                                                composer3.XQ();
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        };
                                        state2 = stateJ2;
                                        function211 = function210;
                                        function212 = function233;
                                        composableLambdaNr3 = ComposableLambdaKt.nr(274398694, true, function234, composerKN, 54);
                                    } else {
                                        function211 = function210;
                                        state2 = stateJ2;
                                        function212 = function226;
                                        composableLambdaNr3 = null;
                                    }
                                    composerKN.Xw();
                                    final long jMUb = textFieldColors.mUb(z14, z15, zBooleanValue);
                                    composerKN.eF(-156921964);
                                    if (function227 == null && t(state5)) {
                                        final State state6 = state2;
                                        final Function2 function235 = function227;
                                        function213 = function235;
                                        composableLambdaNr4 = ComposableLambdaKt.nr(-1526229403, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                n(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer3, int i37) {
                                                if ((i37 & 3) == 2 && composer3.xMQ()) {
                                                    composer3.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-1526229403, i37, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:192)");
                                                }
                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                boolean zP53 = composer3.p5(state6);
                                                final State state7 = state6;
                                                Object objIF6 = composer3.iF();
                                                if (zP53 || objIF6 == Composer.INSTANCE.n()) {
                                                    objIF6 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1$1$1
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                            n(graphicsLayerScope);
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void n(GraphicsLayerScope graphicsLayerScope) {
                                                            graphicsLayerScope.rl(((Number) state7.getValue()).floatValue());
                                                        }
                                                    };
                                                    composer3.o(objIF6);
                                                }
                                                Modifier modifierN = GraphicsLayerModifierKt.n(companion3, (Function1) objIF6);
                                                long j6 = jMUb;
                                                TextStyle textStyle2 = bodyLarge;
                                                Function2 function236 = function235;
                                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                                int iN = ComposablesKt.n(composer3, 0);
                                                CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                                Modifier modifierO = ComposedModifierKt.O(composer3, modifierN);
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
                                                Updater.O(composerN, measurePolicyUo, companion4.t());
                                                Updater.O(composerN, compositionLocalMapIk, companion4.O());
                                                Function2 function2Rl = companion4.rl();
                                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                    composerN.o(Integer.valueOf(iN));
                                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                                }
                                                Updater.O(composerN, modifierO, companion4.nr());
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                                TextFieldImplKt.nr(j6, textStyle2, function236, composer3, 0);
                                                composer3.XQ();
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54);
                                    } else {
                                        function213 = function227;
                                        composableLambdaNr4 = null;
                                    }
                                    composerKN.Xw();
                                    final long jUo = textFieldColors.Uo(z14, z15, zBooleanValue);
                                    composerKN.eF(-156902962);
                                    if (function224 != null) {
                                        composableLambdaNr5 = null;
                                        c2 = '6';
                                        z7 = true;
                                    } else {
                                        c2 = '6';
                                        z7 = true;
                                        composableLambdaNr5 = ComposableLambdaKt.nr(-130107406, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                n(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer3, int i37) {
                                                if ((i37 & 3) == 2 && composer3.xMQ()) {
                                                    composer3.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-130107406, i37, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:205)");
                                                }
                                                TextFieldImplKt.O(jUo, function224, composer3, 0);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54);
                                    }
                                    composerKN.Xw();
                                    ComposableLambda composableLambda = composableLambdaNr5;
                                    final long jTy = textFieldColors.ty(z14, z15, zBooleanValue);
                                    composerKN.eF(-156893937);
                                    if (function230 != null) {
                                        function214 = function230;
                                        composableLambdaNr6 = null;
                                    } else {
                                        function214 = function230;
                                        composableLambdaNr6 = ComposableLambdaKt.nr(2079816678, z7, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                n(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer3, int i37) {
                                                if ((i37 & 3) == 2 && composer3.xMQ()) {
                                                    composer3.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(2079816678, i37, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:211)");
                                                }
                                                TextFieldImplKt.O(jTy, function214, composer3, 0);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54);
                                    }
                                    composerKN.Xw();
                                    Function2 function236 = function214;
                                    final long jGh = textFieldColors.gh(z14, z15, zBooleanValue);
                                    composerKN.eF(-156884470);
                                    if (function231 != null) {
                                        function215 = function231;
                                        composableLambdaNr7 = null;
                                    } else {
                                        function215 = function231;
                                        composableLambdaNr7 = ComposableLambdaKt.nr(1263707005, z7, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                n(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer3, int i37) {
                                                if ((i37 & 3) == 2 && composer3.xMQ()) {
                                                    composer3.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(1263707005, i37, -1, HFAkacKHsU.DUdjNtSmGlHn);
                                                }
                                                TextFieldImplKt.nr(jGh, textStyle, function215, composer3, 0);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54);
                                    }
                                    composerKN.Xw();
                                    i32 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                    if (i32 != z7) {
                                        function216 = function213;
                                        composer2 = composerKN;
                                        composer2.eF(-568105095);
                                        z9 = z13;
                                        TextFieldKt.t(Modifier.INSTANCE, function2, composableLambdaNr, composableLambdaNr2, composableLambda, composableLambdaNr6, composableLambdaNr3, composableLambdaNr4, z9, fFloatValue, ComposableLambdaKt.nr(1750327932, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                n(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer3, int i37) {
                                                if ((i37 & 3) == 2 && composer3.xMQ()) {
                                                    composer3.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(1750327932, i37, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:229)");
                                                }
                                                Modifier modifierRl = LayoutIdKt.rl(Modifier.INSTANCE, "Container");
                                                Function2 function237 = function29;
                                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), true);
                                                int iN = ComposablesKt.n(composer3, 0);
                                                CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                                Modifier modifierO = ComposedModifierKt.O(composer3, modifierRl);
                                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                Function0 function0N = companion3.n();
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
                                                Updater.O(composerN, measurePolicyUo, companion3.t());
                                                Updater.O(composerN, compositionLocalMapIk, companion3.O());
                                                Function2 function2Rl = companion3.rl();
                                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                    composerN.o(Integer.valueOf(iN));
                                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                                }
                                                Updater.O(composerN, modifierO, companion3.nr());
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                                function237.invoke(composer3, 0);
                                                composer3.XQ();
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer2, 54), composableLambdaNr7, paddingValues, composer2, ((i26 >> 3) & 112) | 6 | ((i36 << 21) & 234881024), ((i36 >> 9) & 896) | 6);
                                        composer2.Xw();
                                        Unit unit = Unit.INSTANCE;
                                    } else if (i32 != 2) {
                                        composerKN.eF(-565271199);
                                        composerKN.Xw();
                                        Unit unit2 = Unit.INSTANCE;
                                        function216 = function213;
                                        composer2 = composerKN;
                                        z9 = z13;
                                    } else {
                                        composerKN.eF(-567018607);
                                        Object objIF6 = composerKN.iF();
                                        if (objIF6 == companion.n()) {
                                            objIF6 = SnapshotStateKt__SnapshotStateKt.O(Size.t(Size.INSTANCE.rl()), null, 2, null);
                                            composerKN.o(objIF6);
                                        }
                                        final MutableState mutableState = (MutableState) objIF6;
                                        function216 = function213;
                                        ComposableLambda composableLambdaNr8 = ComposableLambdaKt.nr(157291737, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                n(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer3, int i37) {
                                                if ((i37 & 3) == 2 && composer3.xMQ()) {
                                                    composer3.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(157291737, i37, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:255)");
                                                }
                                                Modifier modifierQie = OutlinedTextFieldKt.qie(LayoutIdKt.rl(Modifier.INSTANCE, "Container"), new MutablePropertyReference0Impl(mutableState) { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1.1
                                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                                    public Object get() {
                                                        return ((MutableState) this.receiver).getValue();
                                                    }

                                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                                    public void set(Object obj) {
                                                        ((MutableState) this.receiver).setValue(obj);
                                                    }
                                                }, paddingValues);
                                                Function2 function237 = function29;
                                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), true);
                                                int iN = ComposablesKt.n(composer3, 0);
                                                CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                                Modifier modifierO = ComposedModifierKt.O(composer3, modifierQie);
                                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                Function0 function0N = companion3.n();
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
                                                Updater.O(composerN, measurePolicyUo, companion3.t());
                                                Updater.O(composerN, compositionLocalMapIk, companion3.O());
                                                Function2 function2Rl = companion3.rl();
                                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                    composerN.o(Integer.valueOf(iN));
                                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                                }
                                                Updater.O(composerN, modifierO, companion3.nr());
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                                function237.invoke(composer3, 0);
                                                composer3.XQ();
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54);
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        boolean zRl = composerKN.rl(fFloatValue);
                                        Object objIF7 = composerKN.iF();
                                        if (zRl || objIF7 == companion.n()) {
                                            objIF7 = new Function1<Size, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Size size) {
                                                    n(size.getPackedValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(long j6) {
                                                    float fGh = Size.gh(j6) * fFloatValue;
                                                    float fXMQ = Size.xMQ(j6) * fFloatValue;
                                                    if (Size.gh(((Size) mutableState.getValue()).getPackedValue()) == fGh && Size.xMQ(((Size) mutableState.getValue()).getPackedValue()) == fXMQ) {
                                                        return;
                                                    }
                                                    mutableState.setValue(Size.t(androidx.compose.ui.geometry.SizeKt.n(fGh, fXMQ)));
                                                }
                                            };
                                            composerKN.o(objIF7);
                                        }
                                        z9 = z13;
                                        OutlinedTextFieldKt.t(companion3, function2, composableLambdaNr2, composableLambdaNr, composableLambda, composableLambdaNr6, composableLambdaNr3, composableLambdaNr4, z9, fFloatValue, (Function1) objIF7, composableLambdaNr8, composableLambdaNr7, paddingValues, composerKN, ((i26 >> 3) & 112) | 6 | ((i36 << 21) & 234881024), ((i36 >> 6) & 7168) | 48);
                                        composer2 = composerKN;
                                        composer2.Xw();
                                        Unit unit3 = Unit.INSTANCE;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    function217 = function211;
                                    function218 = function212;
                                    function219 = function224;
                                    function220 = function215;
                                    z10 = z9;
                                    function221 = function236;
                                    z11 = z15;
                                    z12 = z14;
                                    function222 = function216;
                                } else {
                                    if (i29 == 2) {
                                        if (z17) {
                                            f8 = 0.0f;
                                        }
                                        if (ComposerKt.v()) {
                                        }
                                        composerKN.Xw();
                                        Float fValueOf32 = Float.valueOf(f8);
                                        InputPhase inputPhase122 = (InputPhase) transition.Ik();
                                        composerKN.eF(1128033978);
                                        if (ComposerKt.v()) {
                                        }
                                        i30 = iArr[inputPhase5.ordinal()];
                                        if (i30 != 1) {
                                        }
                                        if (ComposerKt.v()) {
                                        }
                                        composerKN.Xw();
                                        stateJ2 = TransitionKt.J2(transition, f9, Float.valueOf(f10), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.invoke(transition.HI(), composerKN, 0), twoWayConverter2, "PrefixSuffixOpacity", composerKN, 196608);
                                        TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                                return n(segment, composer3, num.intValue());
                                            }

                                            public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i37) {
                                                composer3.eF(1528582156);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(1528582156, i37, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:407)");
                                                }
                                                TweenSpec tweenSpecTy = AnimationSpecKt.ty(150, 0, null, 6, null);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                                composer3.Xw();
                                                return tweenSpecTy;
                                            }
                                        };
                                        InputPhase inputPhase132 = (InputPhase) transition.Ik();
                                        composerKN.eF(-107432127);
                                        if (ComposerKt.v()) {
                                        }
                                        if (iArr[inputPhase132.ordinal()] == 1) {
                                        }
                                        if (ComposerKt.v()) {
                                        }
                                        composerKN.Xw();
                                        colorSpaceR = Color.r(j3);
                                        zP5 = composerKN.p5(colorSpaceR);
                                        objIF2 = composerKN.iF();
                                        if (zP5) {
                                            objIF2 = (TwoWayConverter) ColorVectorConverterKt.n(companion2).invoke(colorSpaceR);
                                            composerKN.o(objIF2);
                                            TwoWayConverter twoWayConverter32 = (TwoWayConverter) objIF2;
                                            InputPhase inputPhase142 = (InputPhase) transition.xMQ();
                                            composerKN.eF(-107432127);
                                            if (ComposerKt.v()) {
                                            }
                                            if (iArr[inputPhase142.ordinal()] != 1) {
                                            }
                                            if (ComposerKt.v()) {
                                            }
                                            composerKN.Xw();
                                            Color colorXMQ3 = Color.xMQ(j4);
                                            InputPhase inputPhase152 = (InputPhase) transition.Ik();
                                            composerKN.eF(-107432127);
                                            if (ComposerKt.v()) {
                                            }
                                            if (iArr[inputPhase152.ordinal()] != 1) {
                                            }
                                            if (ComposerKt.v()) {
                                            }
                                            composerKN.Xw();
                                            State stateJ242 = TransitionKt.J2(transition, colorXMQ3, Color.xMQ(j5), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12.invoke(transition.HI(), composerKN, 0), twoWayConverter32, "LabelTextStyleColor", composerKN, 196608);
                                            Transition transition22 = transition;
                                            TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$12 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                                    return n(segment, composer3, num.intValue());
                                                }

                                                public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i37) {
                                                    composer3.eF(-543659263);
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(-543659263, i37, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:419)");
                                                    }
                                                    TweenSpec tweenSpecTy = AnimationSpecKt.ty(150, 0, null, 6, null);
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.M7();
                                                    }
                                                    composer3.Xw();
                                                    return tweenSpecTy;
                                                }
                                            };
                                            composerKN.eF(1023351670);
                                            if (ComposerKt.v()) {
                                            }
                                            if (ComposerKt.v()) {
                                            }
                                            composerKN.Xw();
                                            colorSpaceR2 = Color.r(jJ2);
                                            zP52 = composerKN.p5(colorSpaceR2);
                                            objIF3 = composerKN.iF();
                                            if (!zP52) {
                                                objIF3 = (TwoWayConverter) ColorVectorConverterKt.n(companion2).invoke(colorSpaceR2);
                                                composerKN.o(objIF3);
                                                TwoWayConverter twoWayConverter42 = (TwoWayConverter) objIF3;
                                                composerKN.eF(1023351670);
                                                if (ComposerKt.v()) {
                                                }
                                                if (ComposerKt.v()) {
                                                }
                                                composerKN.Xw();
                                                Color colorXMQ22 = Color.xMQ(jJ2);
                                                composerKN.eF(1023351670);
                                                if (ComposerKt.v()) {
                                                }
                                                if (ComposerKt.v()) {
                                                }
                                                composerKN.Xw();
                                                final State stateJ252 = TransitionKt.J2(transition22, colorXMQ22, Color.xMQ(jJ2), textFieldImplKt$TextFieldTransitionScope$labelContentColor$12.invoke(transition22.HI(), composerKN, Integer.valueOf(i31)), twoWayConverter42, "LabelContentColor", composerKN, 196608);
                                                final float fFloatValue2 = ((Number) stateJ22.getValue()).floatValue();
                                                composerKN.eF(-156998101);
                                                if (function22 != null) {
                                                }
                                                composerKN.Xw();
                                                final long jKN42 = textFieldColors.KN(z14, z15, zBooleanValue);
                                                objIF4 = composerKN.iF();
                                                companion = Composer.INSTANCE;
                                                if (objIF4 == companion.n()) {
                                                }
                                                State state42 = (State) objIF4;
                                                composerKN.eF(-156965270);
                                                if (function229 == null) {
                                                    function210 = function229;
                                                    composableLambdaNr2 = null;
                                                    composerKN.Xw();
                                                    final long jXMQ2 = textFieldColors.xMQ(z14, z15, zBooleanValue);
                                                    objIF5 = composerKN.iF();
                                                    if (objIF5 == companion.n()) {
                                                    }
                                                    State state52 = (State) objIF5;
                                                    composerKN.eF(-156940524);
                                                    if (function226 == null) {
                                                        function211 = function210;
                                                        state2 = stateJ2;
                                                        function212 = function226;
                                                        composableLambdaNr3 = null;
                                                        composerKN.Xw();
                                                        final long jMUb2 = textFieldColors.mUb(z14, z15, zBooleanValue);
                                                        composerKN.eF(-156921964);
                                                        if (function227 == null) {
                                                            function213 = function227;
                                                            composableLambdaNr4 = null;
                                                            composerKN.Xw();
                                                            final long jUo2 = textFieldColors.Uo(z14, z15, zBooleanValue);
                                                            composerKN.eF(-156902962);
                                                            if (function224 != null) {
                                                            }
                                                            composerKN.Xw();
                                                            ComposableLambda composableLambda2 = composableLambdaNr5;
                                                            final long jTy2 = textFieldColors.ty(z14, z15, zBooleanValue);
                                                            composerKN.eF(-156893937);
                                                            if (function230 != null) {
                                                            }
                                                            composerKN.Xw();
                                                            Function2 function2362 = function214;
                                                            final long jGh2 = textFieldColors.gh(z14, z15, zBooleanValue);
                                                            composerKN.eF(-156884470);
                                                            if (function231 != null) {
                                                            }
                                                            composerKN.Xw();
                                                            i32 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                                            if (i32 != z7) {
                                                            }
                                                            if (ComposerKt.v()) {
                                                            }
                                                            function217 = function211;
                                                            function218 = function212;
                                                            function219 = function224;
                                                            function220 = function215;
                                                            z10 = z9;
                                                            function221 = function2362;
                                                            z11 = z15;
                                                            z12 = z14;
                                                            function222 = function216;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else if (i29 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    f8 = 1.0f;
                                    if (ComposerKt.v()) {
                                    }
                                    composerKN.Xw();
                                    Float fValueOf322 = Float.valueOf(f8);
                                    InputPhase inputPhase1222 = (InputPhase) transition.Ik();
                                    composerKN.eF(1128033978);
                                    if (ComposerKt.v()) {
                                    }
                                    i30 = iArr[inputPhase5.ordinal()];
                                    if (i30 != 1) {
                                    }
                                    if (ComposerKt.v()) {
                                    }
                                    composerKN.Xw();
                                    stateJ2 = TransitionKt.J2(transition, f9, Float.valueOf(f10), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.invoke(transition.HI(), composerKN, 0), twoWayConverter2, "PrefixSuffixOpacity", composerKN, 196608);
                                    TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                            return n(segment, composer3, num.intValue());
                                        }

                                        public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i37) {
                                            composer3.eF(1528582156);
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(1528582156, i37, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:407)");
                                            }
                                            TweenSpec tweenSpecTy = AnimationSpecKt.ty(150, 0, null, 6, null);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                            composer3.Xw();
                                            return tweenSpecTy;
                                        }
                                    };
                                    InputPhase inputPhase1322 = (InputPhase) transition.Ik();
                                    composerKN.eF(-107432127);
                                    if (ComposerKt.v()) {
                                    }
                                    if (iArr[inputPhase1322.ordinal()] == 1) {
                                    }
                                    if (ComposerKt.v()) {
                                    }
                                    composerKN.Xw();
                                    colorSpaceR = Color.r(j3);
                                    zP5 = composerKN.p5(colorSpaceR);
                                    objIF2 = composerKN.iF();
                                    if (zP5) {
                                    }
                                }
                            } else {
                                if (i28 == 2) {
                                    if (z17) {
                                    }
                                    if (ComposerKt.v()) {
                                    }
                                    composerKN.Xw();
                                    final State stateJ232 = TransitionKt.J2(transition, f6, Float.valueOf(f7), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.invoke(transition.HI(), composerKN, 0), twoWayConverterXMQ2, "PlaceholderOpacity", composerKN, 196608);
                                    TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                            return n(segment, composer3, num.intValue());
                                        }

                                        public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i37) {
                                            composer3.eF(-1868044898);
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-1868044898, i37, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:396)");
                                            }
                                            TweenSpec tweenSpecTy = AnimationSpecKt.ty(150, 0, null, 6, null);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                            composer3.Xw();
                                            return tweenSpecTy;
                                        }
                                    };
                                    TwoWayConverter twoWayConverterXMQ32 = VectorConvertersKt.xMQ(floatCompanionObject);
                                    InputPhase inputPhase112 = (InputPhase) transition.xMQ();
                                    composerKN.eF(1128033978);
                                    if (ComposerKt.v()) {
                                    }
                                    i29 = iArr[inputPhase4.ordinal()];
                                    if (i29 == 1) {
                                    }
                                } else if (i28 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f7 = 0.0f;
                                if (ComposerKt.v()) {
                                }
                                composerKN.Xw();
                                final State stateJ2322 = TransitionKt.J2(transition, f6, Float.valueOf(f7), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.invoke(transition.HI(), composerKN, 0), twoWayConverterXMQ2, "PlaceholderOpacity", composerKN, 196608);
                                TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$122 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                        return n(segment, composer3, num.intValue());
                                    }

                                    public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i37) {
                                        composer3.eF(-1868044898);
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-1868044898, i37, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:396)");
                                        }
                                        TweenSpec tweenSpecTy = AnimationSpecKt.ty(150, 0, null, 6, null);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                        composer3.Xw();
                                        return tweenSpecTy;
                                    }
                                };
                                TwoWayConverter twoWayConverterXMQ322 = VectorConvertersKt.xMQ(floatCompanionObject);
                                InputPhase inputPhase1122 = (InputPhase) transition.xMQ();
                                composerKN.eF(1128033978);
                                if (ComposerKt.v()) {
                                }
                                i29 = iArr[inputPhase4.ordinal()];
                                if (i29 == 1) {
                                }
                            }
                        } else {
                            if (i27 == 2) {
                                if (z17) {
                                }
                                if (ComposerKt.v()) {
                                }
                                composerKN.Xw();
                                Float fValueOf22 = Float.valueOf(f5);
                                InputPhase inputPhase102 = (InputPhase) transition.Ik();
                                composerKN.eF(1435837472);
                                if (ComposerKt.v()) {
                                }
                                i28 = iArr[inputPhase3.ordinal()];
                                if (i28 == 1) {
                                }
                            } else if (i27 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f5 = 0.0f;
                            if (ComposerKt.v()) {
                            }
                            composerKN.Xw();
                            Float fValueOf222 = Float.valueOf(f5);
                            InputPhase inputPhase1022 = (InputPhase) transition.Ik();
                            composerKN.eF(1435837472);
                            if (ComposerKt.v()) {
                            }
                            i28 = iArr[inputPhase3.ordinal()];
                            if (i28 == 1) {
                            }
                        }
                    } else if (i25 != 2) {
                        if (i25 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f4 = 1.0f;
                        if (ComposerKt.v()) {
                        }
                        composerKN.Xw();
                        State stateJ222 = TransitionKt.J2(transitionMUb, fValueOf, Float.valueOf(f4), textFieldImplKt$TextFieldTransitionScope$labelProgress$1.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverter, "LabelProgress", composerKN, 196608);
                        TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$12 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                return n(segment, composer3, num.intValue());
                            }

                            public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i37) {
                                FiniteAnimationSpec finiteAnimationSpecAz;
                                composer3.eF(-1154662212);
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1154662212, i37, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:367)");
                                }
                                InputPhase inputPhase92 = InputPhase.Focused;
                                InputPhase inputPhase103 = InputPhase.UnfocusedEmpty;
                                if (segment.t(inputPhase92, inputPhase103)) {
                                    finiteAnimationSpecAz = AnimationSpecKt.ty(67, 0, EasingKt.O(), 2, null);
                                } else if (!segment.t(inputPhase103, inputPhase92) && !segment.t(InputPhase.UnfocusedNotEmpty, inputPhase103)) {
                                    finiteAnimationSpecAz = AnimationSpecKt.qie(0.0f, 0.0f, null, 7, null);
                                } else {
                                    finiteAnimationSpecAz = AnimationSpecKt.az(83, 67, EasingKt.O());
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                composer3.Xw();
                                return finiteAnimationSpecAz;
                            }
                        };
                        TwoWayConverter twoWayConverterXMQ22 = VectorConvertersKt.xMQ(floatCompanionObject);
                        InputPhase inputPhase92 = (InputPhase) transitionMUb.xMQ();
                        composerKN.eF(1435837472);
                        if (ComposerKt.v()) {
                        }
                        i27 = iArr[inputPhase92.ordinal()];
                        if (i27 == 1) {
                        }
                    } else {
                        f4 = 0.0f;
                        if (ComposerKt.v()) {
                        }
                        composerKN.Xw();
                        State stateJ2222 = TransitionKt.J2(transitionMUb, fValueOf, Float.valueOf(f4), textFieldImplKt$TextFieldTransitionScope$labelProgress$1.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverter, "LabelProgress", composerKN, 196608);
                        TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$122 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                return n(segment, composer3, num.intValue());
                            }

                            public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i37) {
                                FiniteAnimationSpec finiteAnimationSpecAz;
                                composer3.eF(-1154662212);
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1154662212, i37, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:367)");
                                }
                                InputPhase inputPhase922 = InputPhase.Focused;
                                InputPhase inputPhase103 = InputPhase.UnfocusedEmpty;
                                if (segment.t(inputPhase922, inputPhase103)) {
                                    finiteAnimationSpecAz = AnimationSpecKt.ty(67, 0, EasingKt.O(), 2, null);
                                } else if (!segment.t(inputPhase103, inputPhase922) && !segment.t(InputPhase.UnfocusedNotEmpty, inputPhase103)) {
                                    finiteAnimationSpecAz = AnimationSpecKt.qie(0.0f, 0.0f, null, 7, null);
                                } else {
                                    finiteAnimationSpecAz = AnimationSpecKt.az(83, 67, EasingKt.O());
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                composer3.Xw();
                                return finiteAnimationSpecAz;
                            }
                        };
                        TwoWayConverter twoWayConverterXMQ222 = VectorConvertersKt.xMQ(floatCompanionObject);
                        InputPhase inputPhase922 = (InputPhase) transitionMUb.xMQ();
                        composerKN.eF(1435837472);
                        if (ComposerKt.v()) {
                        }
                        i27 = iArr[inputPhase922.ordinal()];
                        if (i27 == 1) {
                        }
                    }
                } else if (i24 != i7) {
                    if (i24 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f3 = 1.0f;
                    if (ComposerKt.v()) {
                    }
                    composerKN.Xw();
                    Float fValueOf4 = Float.valueOf(f3);
                    InputPhase inputPhase82 = (InputPhase) transitionMUb.Ik();
                    composerKN.eF(-2036730335);
                    if (ComposerKt.v()) {
                    }
                    i25 = iArr[inputPhase2.ordinal()];
                    if (i25 == 1) {
                    }
                } else {
                    f3 = 0.0f;
                    if (ComposerKt.v()) {
                    }
                    composerKN.Xw();
                    Float fValueOf42 = Float.valueOf(f3);
                    InputPhase inputPhase822 = (InputPhase) transitionMUb.Ik();
                    composerKN.eF(-2036730335);
                    if (ComposerKt.v()) {
                    }
                    i25 = iArr[inputPhase2.ordinal()];
                    if (i25 == 1) {
                    }
                }
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        n(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer3, int i37) {
                        TextFieldImplKt.n(textFieldType, str, function2, visualTransformation, function22, function217, function219, function221, function218, function222, function220, z10, z12, z11, interactionSource, paddingValues, textFieldColors, function29, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                    }
                });
                return;
            }
            return;
        }
        i33 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        if ((i5 & 8) == 0) {
        }
        if ((i5 & 16) == 0) {
        }
        i9 = i5 & 32;
        if (i9 == 0) {
        }
        i10 = i5 & 64;
        if (i10 == 0) {
        }
        i11 = i5 & 128;
        if (i11 == 0) {
        }
        i12 = i5 & 256;
        if (i12 == 0) {
        }
        i13 = i5 & 512;
        if (i13 == 0) {
        }
        i15 = i5 & 1024;
        if (i15 == 0) {
        }
        i17 = i5 & 2048;
        if (i17 == 0) {
        }
        int i342 = i16;
        i19 = i5 & 4096;
        if (i19 == 0) {
        }
        i23 = i5 & 8192;
        if (i23 == 0) {
        }
        if ((i5 & 16384) == 0) {
        }
        if ((32768 & i5) == 0) {
        }
        if ((i5 & 65536) == 0) {
        }
        if ((i5 & 131072) == 0) {
        }
        if ((306783379 & i33) != 306783378) {
            if (i20 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            final Function2 function2292 = function223;
            if (i18 == 0) {
            }
            if (i22 == 0) {
            }
            if (i23 == 0) {
            }
            if (ComposerKt.v()) {
            }
            z5 = ((i33 & 112) != 32) | ((i33 & 7168) != 2048);
            objIF = composerKN.iF();
            if (!z5) {
                objIF = visualTransformation.n(new AnnotatedString(str, null, null, 6, null));
                composerKN.o(objIF);
                String text2 = ((TransformedText) objIF).getText().getText();
                boolean zBooleanValue2 = ((Boolean) FocusInteractionKt.n(interactionSource, composerKN, (i21 >> 12) & 14).getValue()).booleanValue();
                InputPhase inputPhase62 = !zBooleanValue2 ? InputPhase.Focused : text2.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
                jJ2 = textFieldColors.J2(z14, z15, zBooleanValue2);
                int i362 = i21;
                Typography typographyT2 = MaterialTheme.f26164n.t(composerKN, 6);
                final TextStyle bodyLarge2 = typographyT2.getBodyLarge();
                final TextStyle bodySmall2 = typographyT2.getBodySmall();
                long jKN32 = bodyLarge2.KN();
                Color.Companion companion22 = Color.INSTANCE;
                Function2 function2302 = function225;
                Function2 function2312 = function228;
                if (Color.HI(jKN32, companion22.Uo())) {
                    jKN = bodySmall2.KN();
                    if (z6) {
                    }
                    jKN2 = bodyLarge2.KN();
                    if (z6) {
                    }
                    final boolean z162 = z6;
                    boolean z172 = function22 != null;
                    long j22 = jKN;
                    Transition transitionMUb2 = TransitionKt.mUb(inputPhase62, "TextFieldInputState", composerKN, 48, 0);
                    TextFieldImplKt$TextFieldTransitionScope$labelProgress$1 textFieldImplKt$TextFieldTransitionScope$labelProgress$12 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelProgress$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                            return n(segment, composer3, num.intValue());
                        }

                        public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i37) {
                            composer3.eF(1276209157);
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1276209157, i37, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:354)");
                            }
                            TweenSpec tweenSpecTy = AnimationSpecKt.ty(150, 0, null, 6, null);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            composer3.Xw();
                            return tweenSpecTy;
                        }
                    };
                    FloatCompanionObject floatCompanionObject22 = FloatCompanionObject.INSTANCE;
                    TwoWayConverter twoWayConverterXMQ4 = VectorConvertersKt.xMQ(floatCompanionObject22);
                    InputPhase inputPhase72 = (InputPhase) transitionMUb2.xMQ();
                    composerKN.eF(-2036730335);
                    if (ComposerKt.v()) {
                    }
                    int[] iArr22 = WhenMappings.$EnumSwitchMapping$1;
                    i24 = iArr22[inputPhase.ordinal()];
                    float f102 = 1.0f;
                    if (i24 == 1) {
                    }
                } else {
                    jKN = bodySmall2.KN();
                    if (z6) {
                        jKN = jJ2;
                    }
                    jKN2 = bodyLarge2.KN();
                    if (z6) {
                        jKN2 = jJ2;
                    }
                    final boolean z1622 = z6;
                    boolean z1722 = function22 != null;
                    long j222 = jKN;
                    Transition transitionMUb22 = TransitionKt.mUb(inputPhase62, "TextFieldInputState", composerKN, 48, 0);
                    TextFieldImplKt$TextFieldTransitionScope$labelProgress$1 textFieldImplKt$TextFieldTransitionScope$labelProgress$122 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelProgress$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                            return n(segment, composer3, num.intValue());
                        }

                        public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i37) {
                            composer3.eF(1276209157);
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1276209157, i37, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:354)");
                            }
                            TweenSpec tweenSpecTy = AnimationSpecKt.ty(150, 0, null, 6, null);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            composer3.Xw();
                            return tweenSpecTy;
                        }
                    };
                    FloatCompanionObject floatCompanionObject222 = FloatCompanionObject.INSTANCE;
                    TwoWayConverter twoWayConverterXMQ42 = VectorConvertersKt.xMQ(floatCompanionObject222);
                    InputPhase inputPhase722 = (InputPhase) transitionMUb22.xMQ();
                    composerKN.eF(-2036730335);
                    if (ComposerKt.v()) {
                    }
                    int[] iArr222 = WhenMappings.$EnumSwitchMapping$1;
                    i24 = iArr222[inputPhase.ordinal()];
                    float f1022 = 1.0f;
                    if (i24 == 1) {
                    }
                }
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public static final float HI() {
        return J2;
    }

    public static final float Ik() {
        return nr;
    }

    public static final State KN(boolean z2, boolean z3, boolean z4, TextFieldColors textFieldColors, float f3, float f4, Composer composer, int i2) {
        State stateCk;
        State stateCk2;
        Composer composer2 = composer;
        if (ComposerKt.v()) {
            ComposerKt.p5(2047013045, i2, -1, "androidx.compose.material3.internal.animateBorderStrokeAsState (TextFieldImpl.kt:441)");
        }
        long jO = textFieldColors.O(z2, z3, z4);
        if (z2) {
            composer2.eF(1023053998);
            stateCk = SingleValueAnimationKt.n(jO, AnimationSpecKt.ty(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer2 = composer;
            composer2.Xw();
        } else {
            composer2.eF(1023165505);
            stateCk = SnapshotStateKt.ck(Color.xMQ(jO), composer2, 0);
            composer2.Xw();
        }
        State state = stateCk;
        if (z2) {
            composer2.eF(1023269417);
            stateCk2 = AnimateAsStateKt.t(z4 ? f3 : f4, AnimationSpecKt.ty(150, 0, null, 6, null), null, null, composer2, 48, 12);
            composer2.Xw();
        } else {
            composer2.eF(1023478388);
            stateCk2 = SnapshotStateKt.ck(Dp.nr(f4), composer2, (i2 >> 15) & 14);
            composer2.Xw();
        }
        State stateCk3 = SnapshotStateKt.ck(BorderStrokeKt.n(((Dp) stateCk2.getValue()).getValue(), ((Color) state.getValue()).getValue()), composer2, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateCk3;
    }

    public static final int S(Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }

    public static final Modifier XQ(Modifier modifier, final ColorProducer colorProducer, final Shape shape) {
        return DrawModifierKt.t(modifier, new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$textFieldBackground$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                final Outline outlineN = shape.n(cacheDrawScope.t(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                final ColorProducer colorProducer2 = colorProducer;
                return cacheDrawScope.HI(new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$textFieldBackground$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        n(drawScope);
                        return Unit.INSTANCE;
                    }

                    public final void n(DrawScope drawScope) {
                        OutlineKt.O(drawScope, outlineN, colorProducer2.n(), 0.0f, null, null, 0, 60, null);
                    }
                });
            }
        });
    }

    public static final int Z(Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final float az() {
        return Uo;
    }

    public static final float ck() {
        return f29239O;
    }

    public static final Modifier gh() {
        return xMQ;
    }

    public static final float mUb() {
        return f29241t;
    }

    public static final long o() {
        return f29240n;
    }

    public static final float r() {
        return rl;
    }

    public static final float ty() {
        return KN;
    }

    public static final Modifier xMQ(Modifier modifier, boolean z2, final String str) {
        return z2 ? SemanticsModifierKt.nr(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$defaultErrorSemantics$1
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
                SemanticsPropertiesKt.HI(semanticsPropertyReceiver, str);
            }
        }, 1, null) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(final long j2, final Function2 function2, Composer composer, final int i2) {
        int i3;
        int i5;
        int i7;
        Composer composerKN = composer.KN(660142980);
        if ((i2 & 6) == 0) {
            if (composerKN.nr(j2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.E2(function2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(660142980, i3, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:303)");
            }
            CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(j2)), function2, composerKN, (i3 & 112) | ProvidedValue.xMQ);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$Decoration$2
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
                    TextFieldImplKt.O(j2, function2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(long j2, TextStyle textStyle, Function2 function2, Composer composer, final int i2) {
        int i3;
        final long j3;
        final TextStyle textStyle2;
        final Function2 function22;
        int i5;
        int i7;
        int i8;
        Composer composerKN = composer.KN(1208685580);
        if ((i2 & 6) == 0) {
            if (composerKN.nr(j2)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.p5(textStyle)) {
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
            function22 = function2;
            textStyle2 = textStyle;
            j3 = j2;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1208685580, i3, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:298)");
            }
            ProvideContentColorTextStyleKt.n(j2, textStyle, function2, composerKN, i3 & 1022);
            j3 = j2;
            textStyle2 = textStyle;
            function22 = function2;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$Decoration$1
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
                    TextFieldImplKt.nr(j3, textStyle2, function22, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final Object qie(IntrinsicMeasurable intrinsicMeasurable) {
        LayoutIdParentData layoutIdParentData;
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof LayoutIdParentData) {
            layoutIdParentData = (LayoutIdParentData) parentData;
        } else {
            layoutIdParentData = null;
        }
        if (layoutIdParentData == null) {
            return null;
        }
        return layoutIdParentData.getLayoutId();
    }

    private static final boolean rl(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final boolean t(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }
}
