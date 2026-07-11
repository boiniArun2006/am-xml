package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.Bullet;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.style.CustomBulletSpan;
import androidx.compose.ui.text.platform.style.DrawStyleSpan;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aC\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00120\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a*\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a6\u0010\u001e\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a.\u0010 \u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a*\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u001a\u001a\u0017\u0010$\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010%\u001aa\u0010/\u001a\u00020\u0006*\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u000e\u001a\u00020\r2&\u0010.\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0(H\u0000¢\u0006\u0004\b/\u00100\u001a3\u00103\u001a\u00020\u0006*\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b3\u00104\u001aY\u00105\u001a\u00020\u0006*\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00120\u00112&\u0010.\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0(H\u0002¢\u0006\u0004\b5\u00106\u001aM\u0010;\u001a\u00020\u00062\b\u00107\u001a\u0004\u0018\u0001012\u0012\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u00120\u00112\u001e\u0010:\u001a\u001a\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000609H\u0000¢\u0006\u0004\b;\u0010<\u001a$\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010=\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a-\u0010C\u001a\u00020\u0006*\u00020\u00002\b\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bC\u0010D\u001a-\u0010G\u001a\u00020\u0006*\u00020\u00002\b\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bG\u0010H\u001a.\u0010K\u001a\u00020\u0006*\u00020\u00002\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\bK\u0010L\u001a-\u0010O\u001a\u00020\u0006*\u00020\u00002\b\u0010N\u001a\u0004\u0018\u00010M2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bO\u0010P\u001a-\u0010S\u001a\u00020\u0006*\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bS\u0010T\u001a-\u0010W\u001a\u00020\u0006*\u00020\u00002\b\u0010V\u001a\u0004\u0018\u00010U2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bW\u0010X\u001a6\u0010Z\u001a\u00020\u0006*\u00020\u00002\u0006\u0010Y\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\bZ\u0010[\u001a-\u0010^\u001a\u00020\u0006*\u00020\u00002\b\u0010]\u001a\u0004\u0018\u00010\\2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b^\u0010_\u001a.\u0010`\u001a\u00020\u0006*\u00020\u00002\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b`\u0010L\u001a0\u0010c\u001a\u00020\u0006*\u00020\u00002\b\u0010b\u001a\u0004\u0018\u00010a2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\bc\u0010d\u001a5\u0010h\u001a\u00020\u0006*\u00020\u00002\b\u0010f\u001a\u0004\u0018\u00010e2\u0006\u0010g\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bh\u0010i\u001a\u0013\u0010j\u001a\u00020#*\u00020&H\u0002¢\u0006\u0004\bj\u0010k\u001a\u001d\u0010m\u001a\u000201*\u0004\u0018\u0001012\u0006\u0010l\u001a\u000201H\u0002¢\u0006\u0004\bm\u0010n\"\u0018\u0010q\u001a\u00020#*\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010p\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006r"}, d2 = {"Landroid/text/Spannable;", "", TtmlNode.TAG_SPAN, "", TtmlNode.START, TtmlNode.END, "", "WPU", "(Landroid/text/Spannable;Ljava/lang/Object;II)V", "Landroidx/compose/ui/text/style/TextIndent;", "textIndent", "", "contextFontSize", "Landroidx/compose/ui/unit/Density;", "density", "g", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/TextIndent;FLandroidx/compose/ui/unit/Density;)V", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "annotations", "qie", "(Landroid/text/Spannable;Ljava/util/List;FLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/style/TextIndent;)V", "Landroidx/compose/ui/unit/TextUnit;", "size", "Uo", "(JFLandroidx/compose/ui/unit/Density;)F", "lineHeight", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineHeightStyle", "o", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/style/LineHeightStyle;)V", "Z", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;)V", "KN", "", "O", "(Landroidx/compose/ui/unit/Density;)Z", "Landroidx/compose/ui/text/TextStyle;", "contextTextStyle", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "resolveTypeface", "ViF", "(Landroid/text/Spannable;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function4;)V", "Landroidx/compose/ui/text/SpanStyle;", "style", "aYN", "(Landroid/text/Spannable;Landroidx/compose/ui/text/SpanStyle;IILandroidx/compose/ui/unit/Density;)V", "HI", "(Landroid/text/Spannable;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Lkotlin/jvm/functions/Function4;)V", "contextFontSpanStyle", "spanStyles", "Lkotlin/Function3;", "block", "rl", "(Landroidx/compose/ui/text/SpanStyle;Ljava/util/List;Lkotlin/jvm/functions/Function3;)V", "letterSpacing", "Landroid/text/style/MetricAffectingSpan;", c.f62177j, "(JLandroidx/compose/ui/unit/Density;)Landroid/text/style/MetricAffectingSpan;", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "S", "(Landroid/text/Spannable;Landroidx/compose/ui/graphics/Shadow;II)V", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "ty", "(Landroid/text/Spannable;Landroidx/compose/ui/graphics/drawscope/DrawStyle;II)V", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "xMQ", "(Landroid/text/Spannable;JII)V", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "XQ", "(Landroid/text/Spannable;Landroidx/compose/ui/text/intl/LocaleList;II)V", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "r", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/TextGeometricTransform;II)V", "", "fontFeatureSettings", "ck", "(Landroid/text/Spannable;Ljava/lang/String;II)V", TtmlNode.ATTR_TTS_FONT_SIZE, "Ik", "(Landroid/text/Spannable;JLandroidx/compose/ui/unit/Density;II)V", "Landroidx/compose/ui/text/style/TextDecoration;", TtmlNode.ATTR_TTS_TEXT_DECORATION, "nY", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/TextDecoration;II)V", "az", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "mUb", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/BaselineShift;II)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "alpha", "gh", "(Landroid/text/Spannable;Landroidx/compose/ui/graphics/Brush;FII)V", "nr", "(Landroidx/compose/ui/text/TextStyle;)Z", "spanStyle", "J2", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;)Landroidx/compose/ui/text/SpanStyle;", "t", "(Landroidx/compose/ui/text/SpanStyle;)Z", "needsLetterSpacingSpan", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSpannableExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,603:1\n247#2:604\n34#3,6:605\n247#3,6:612\n34#3,6:618\n253#3:624\n70#3,6:625\n34#3,6:631\n1#4:611\n65#5:637\n69#5:640\n60#6:638\n70#6:641\n22#7:639\n22#7:642\n635#8:643\n635#8:644\n*S KotlinDebug\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n*L\n92#1:604\n139#1:605,6\n346#1:612,6\n346#1:618,6\n346#1:624\n415#1:625,6\n435#1:631,6\n482#1:637\n483#1:640\n482#1:638\n483#1:641\n482#1:639\n483#1:642\n498#1:643\n566#1:644\n*E\n"})
public final class SpannableExtensions_androidKt {
    private static final void HI(final Spannable spannable, TextStyle textStyle, List list, final Function4 function4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range range = (AnnotatedString.Range) list.get(i2);
            if ((range.getItem() instanceof SpanStyle) && (TextPaintExtensions_androidKt.nr((SpanStyle) range.getItem()) || ((SpanStyle) range.getItem()).getFontSynthesis() != null)) {
                Intrinsics.checkNotNull(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                arrayList.add(range);
            }
        }
        rl(nr(textStyle) ? new SpanStyle(0L, 0L, textStyle.HI(), textStyle.az(), textStyle.ty(), textStyle.mUb(), null, 0L, null, null, null, 0L, null, null, null, null, 65475, null) : null, arrayList, new Function3<SpanStyle, Integer, Integer, Unit>() { // from class: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt$setFontAttributes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(SpanStyle spanStyle, Integer num, Integer num2) {
                n(spanStyle, num.intValue(), num2.intValue());
                return Unit.INSTANCE;
            }

            public final void n(SpanStyle spanStyle, int i3, int i5) {
                Spannable spannable2 = spannable;
                Function4 function42 = function4;
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontWeight fontWeight = spanStyle.getFontWeight();
                if (fontWeight == null) {
                    fontWeight = FontWeight.INSTANCE.O();
                }
                FontStyle fontStyle = spanStyle.getFontStyle();
                FontStyle fontStyleT = FontStyle.t(fontStyle != null ? fontStyle.getValue() : FontStyle.INSTANCE.rl());
                FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
                spannable2.setSpan(new TypefaceSpan((Typeface) function42.invoke(fontFamily, fontWeight, fontStyleT, FontSynthesis.O(fontSynthesis != null ? fontSynthesis.getValue() : FontSynthesis.INSTANCE.n()))), i3, i5, 33);
            }
        });
    }

    private static final SpanStyle J2(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.ViF(spanStyle2);
    }

    private static final void S(Spannable spannable, Shadow shadow, int i2, int i3) {
        if (shadow != null) {
            WPU(spannable, new ShadowSpan(ColorKt.mUb(shadow.getColor()), Float.intBitsToFloat((int) (shadow.getOffset() >> 32)), Float.intBitsToFloat((int) (shadow.getOffset() & 4294967295L)), TextPaintExtensions_androidKt.rl(shadow.getBlurRadius())), i2, i3);
        }
    }

    private static final float Uo(long j2, float f3, Density density) {
        if (TextUnit.O(j2, TextUnit.INSTANCE.n())) {
            return f3;
        }
        long jUo = TextUnit.Uo(j2);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.Uo(jUo, companion.rl())) {
            return density.tFV(j2);
        }
        if (TextUnitType.Uo(jUo, companion.n())) {
            return TextUnit.KN(j2) * f3;
        }
        return Float.NaN;
    }

    public static final void WPU(Spannable spannable, Object obj, int i2, int i3) {
        spannable.setSpan(obj, i2, i3, 33);
    }

    public static final void XQ(Spannable spannable, LocaleList localeList, int i2, int i3) {
        if (localeList != null) {
            WPU(spannable, LocaleListHelperMethods.f33860n.n(localeList), i2, i3);
        }
    }

    public static final void az(Spannable spannable, long j2, int i2, int i3) {
        if (j2 != 16) {
            WPU(spannable, new ForegroundColorSpan(ColorKt.mUb(j2)), i2, i3);
        }
    }

    private static final void ck(Spannable spannable, String str, int i2, int i3) {
        if (str != null) {
            WPU(spannable, new FontFeatureSpan(str), i2, i3);
        }
    }

    public static final void g(Spannable spannable, TextIndent textIndent, float f3, Density density) {
        if (textIndent != null) {
            if ((TextUnit.O(textIndent.getFirstLine(), TextUnitKt.KN(0)) && TextUnit.O(textIndent.getRestLine(), TextUnitKt.KN(0))) || TextUnit.J2(textIndent.getFirstLine()) == 0 || TextUnit.J2(textIndent.getRestLine()) == 0) {
                return;
            }
            long jUo = TextUnit.Uo(textIndent.getFirstLine());
            TextUnitType.Companion companion = TextUnitType.INSTANCE;
            float fKN = 0.0f;
            float fTFV = TextUnitType.Uo(jUo, companion.rl()) ? density.tFV(textIndent.getFirstLine()) : TextUnitType.Uo(jUo, companion.n()) ? TextUnit.KN(textIndent.getFirstLine()) * f3 : 0.0f;
            long jUo2 = TextUnit.Uo(textIndent.getRestLine());
            if (TextUnitType.Uo(jUo2, companion.rl())) {
                fKN = density.tFV(textIndent.getRestLine());
            } else if (TextUnitType.Uo(jUo2, companion.n())) {
                fKN = TextUnit.KN(textIndent.getRestLine()) * f3;
            }
            WPU(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fTFV), (int) Math.ceil(fKN)), 0, spannable.length());
        }
    }

    private static final void gh(Spannable spannable, Brush brush, float f3, int i2, int i3) {
        if (brush != null) {
            if (brush instanceof SolidColor) {
                az(spannable, ((SolidColor) brush).getValue(), i2, i3);
            } else if (brush instanceof ShaderBrush) {
                WPU(spannable, new ShaderBrushSpan((ShaderBrush) brush, f3), i2, i3);
            }
        }
    }

    private static final void mUb(Spannable spannable, BaselineShift baselineShift, int i2, int i3) {
        if (baselineShift != null) {
            WPU(spannable, new BaselineShiftSpan(baselineShift.getMultiplier()), i2, i3);
        }
    }

    public static final void nY(Spannable spannable, TextDecoration textDecoration, int i2, int i3) {
        if (textDecoration != null) {
            TextDecoration.Companion companion = TextDecoration.INSTANCE;
            WPU(spannable, new TextDecorationSpan(textDecoration.nr(companion.nr()), textDecoration.nr(companion.rl())), i2, i3);
        }
    }

    public static final void qie(Spannable spannable, List list, float f3, Density density, TextIndent textIndent) {
        Density density2 = density;
        float fKN = 0.0f;
        if (textIndent != null) {
            long jUo = TextUnit.Uo(textIndent.getFirstLine());
            TextUnitType.Companion companion = TextUnitType.INSTANCE;
            if (TextUnitType.Uo(jUo, companion.rl())) {
                fKN = density2.tFV(textIndent.getFirstLine());
            } else if (TextUnitType.Uo(jUo, companion.n())) {
                fKN = TextUnit.KN(textIndent.getFirstLine()) * f3;
            }
        }
        float f4 = fKN;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            AnnotatedString.Range range = (AnnotatedString.Range) list.get(i2);
            Object item = range.getItem();
            Bullet bullet = item instanceof Bullet ? (Bullet) item : null;
            if (bullet != null) {
                float fUo = Uo(bullet.getSize(), f3, density2);
                float fUo2 = Uo(bullet.getPadding(), f3, density2);
                if (!Float.isNaN(fUo) && !Float.isNaN(fUo2)) {
                    WPU(spannable, new CustomBulletSpan(bullet.getShape(), fUo, fUo, fUo2, bullet.getBrush(), bullet.getAlpha(), bullet.getDrawStyle(), density2, f4), range.getStart(), range.getEnd());
                }
            }
            i2++;
            density2 = density;
        }
    }

    private static final void r(Spannable spannable, TextGeometricTransform textGeometricTransform, int i2, int i3) {
        if (textGeometricTransform != null) {
            WPU(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i2, i3);
            WPU(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i2, i3);
        }
    }

    private static final void ty(Spannable spannable, DrawStyle drawStyle, int i2, int i3) {
        if (drawStyle != null) {
            WPU(spannable, new DrawStyleSpan(drawStyle), i2, i3);
        }
    }

    public static final void xMQ(Spannable spannable, long j2, int i2, int i3) {
        if (j2 != 16) {
            WPU(spannable, new BackgroundColorSpan(ColorKt.mUb(j2)), i2, i3);
        }
    }

    public static final void Ik(Spannable spannable, long j2, Density density, int i2, int i3) {
        long jUo = TextUnit.Uo(j2);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.Uo(jUo, companion.rl())) {
            WPU(spannable, new AbsoluteSizeSpan(MathKt.roundToInt(density.tFV(j2)), false), i2, i3);
        } else if (TextUnitType.Uo(jUo, companion.n())) {
            WPU(spannable, new RelativeSizeSpan(TextUnit.KN(j2)), i2, i3);
        }
    }

    private static final float KN(long j2, float f3, Density density) {
        float fKN;
        long jUo = TextUnit.Uo(j2);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.Uo(jUo, companion.rl())) {
            if (!O(density)) {
                return density.tFV(j2);
            }
            fKN = TextUnit.KN(j2) / TextUnit.KN(density.ViF(f3));
        } else if (TextUnitType.Uo(jUo, companion.n())) {
            fKN = TextUnit.KN(j2);
        } else {
            return Float.NaN;
        }
        return fKN * f3;
    }

    private static final boolean O(Density density) {
        if (density.getFontScale() > 1.05d) {
            return true;
        }
        return false;
    }

    public static final void ViF(Spannable spannable, TextStyle textStyle, List list, Density density, Function4 function4) {
        MetricAffectingSpan metricAffectingSpanN;
        HI(spannable, textStyle, list, function4);
        int size = list.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range range = (AnnotatedString.Range) list.get(i2);
            if (range.getItem() instanceof SpanStyle) {
                int start = range.getStart();
                int end = range.getEnd();
                if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                    aYN(spannable, (SpanStyle) range.getItem(), start, end, density);
                    if (t((SpanStyle) range.getItem())) {
                        z2 = true;
                    }
                }
            }
        }
        if (z2) {
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AnnotatedString.Range range2 = (AnnotatedString.Range) list.get(i3);
                AnnotatedString.Annotation annotation = (AnnotatedString.Annotation) range2.getItem();
                if (annotation instanceof SpanStyle) {
                    int start2 = range2.getStart();
                    int end2 = range2.getEnd();
                    if (start2 >= 0 && start2 < spannable.length() && end2 > start2 && end2 <= spannable.length() && (metricAffectingSpanN = n(((SpanStyle) annotation).getLetterSpacing(), density)) != null) {
                        WPU(spannable, metricAffectingSpanN, start2, end2);
                    }
                }
            }
        }
    }

    public static final void Z(Spannable spannable, long j2, float f3, Density density) {
        float fKN = KN(j2, f3, density);
        if (!Float.isNaN(fKN)) {
            WPU(spannable, new LineHeightSpan(fKN), 0, spannable.length());
        }
    }

    private static final void aYN(Spannable spannable, SpanStyle spanStyle, int i2, int i3, Density density) {
        mUb(spannable, spanStyle.getBaselineShift(), i2, i3);
        az(spannable, spanStyle.Uo(), i2, i3);
        gh(spannable, spanStyle.J2(), spanStyle.t(), i2, i3);
        nY(spannable, spanStyle.getTextDecoration(), i2, i3);
        Ik(spannable, spanStyle.getFontSize(), density, i2, i3);
        ck(spannable, spanStyle.getFontFeatureSettings(), i2, i3);
        r(spannable, spanStyle.getTextGeometricTransform(), i2, i3);
        XQ(spannable, spanStyle.getLocaleList(), i2, i3);
        xMQ(spannable, spanStyle.getBackground(), i2, i3);
        S(spannable, spanStyle.getShadow(), i2, i3);
        ty(spannable, spanStyle.getDrawStyle(), i2, i3);
    }

    private static final MetricAffectingSpan n(long j2, Density density) {
        long jUo = TextUnit.Uo(j2);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.Uo(jUo, companion.rl())) {
            return new LetterSpacingSpanPx(density.tFV(j2));
        }
        if (TextUnitType.Uo(jUo, companion.n())) {
            return new LetterSpacingSpanEm(TextUnit.KN(j2));
        }
        return null;
    }

    private static final boolean nr(TextStyle textStyle) {
        if (!TextPaintExtensions_androidKt.nr(textStyle.rV9()) && textStyle.ty() == null) {
            return false;
        }
        return true;
    }

    public static final void o(Spannable spannable, long j2, float f3, Density density, LineHeightStyle lineHeightStyle) {
        int length;
        float fKN = KN(j2, f3, density);
        if (!Float.isNaN(fKN)) {
            if (spannable.length() == 0 || StringsKt.last(spannable) == '\n') {
                length = spannable.length() + 1;
            } else {
                length = spannable.length();
            }
            WPU(spannable, new LineHeightStyleSpan(fKN, 0, length, LineHeightStyle.Trim.KN(lineHeightStyle.getTrim()), LineHeightStyle.Trim.xMQ(lineHeightStyle.getTrim()), lineHeightStyle.getAlignment(), LineHeightStyle.Mode.J2(lineHeightStyle.getMode(), LineHeightStyle.Mode.INSTANCE.rl())), 0, spannable.length());
        }
    }

    public static final void rl(SpanStyle spanStyle, List list, Function3 function3) {
        if (list.size() <= 1) {
            if (!list.isEmpty()) {
                function3.invoke(J2(spanStyle, (SpanStyle) ((AnnotatedString.Range) list.get(0)).getItem()), Integer.valueOf(((AnnotatedString.Range) list.get(0)).getStart()), Integer.valueOf(((AnnotatedString.Range) list.get(0)).getEnd()));
                return;
            }
            return;
        }
        int size = list.size();
        int i2 = size * 2;
        int[] iArr = new int[i2];
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AnnotatedString.Range range = (AnnotatedString.Range) list.get(i3);
            iArr[i3] = range.getStart();
            iArr[i3 + size] = range.getEnd();
        }
        ArraysKt.sort(iArr);
        int iFirst = ArraysKt.first(iArr);
        for (int i5 = 0; i5 < i2; i5++) {
            int i7 = iArr[i5];
            if (i7 != iFirst) {
                int size3 = list.size();
                SpanStyle spanStyleJ2 = spanStyle;
                for (int i8 = 0; i8 < size3; i8++) {
                    AnnotatedString.Range range2 = (AnnotatedString.Range) list.get(i8);
                    if (range2.getStart() != range2.getEnd() && AnnotatedStringKt.xMQ(iFirst, i7, range2.getStart(), range2.getEnd())) {
                        spanStyleJ2 = J2(spanStyleJ2, (SpanStyle) range2.getItem());
                    }
                }
                if (spanStyleJ2 != null) {
                    function3.invoke(spanStyleJ2, Integer.valueOf(iFirst), Integer.valueOf(i7));
                }
                iFirst = i7;
            }
        }
    }

    private static final boolean t(SpanStyle spanStyle) {
        long jUo = TextUnit.Uo(spanStyle.getLetterSpacing());
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (!TextUnitType.Uo(jUo, companion.rl()) && !TextUnitType.Uo(TextUnit.Uo(spanStyle.getLetterSpacing()), companion.n())) {
            return false;
        }
        return true;
    }
}
