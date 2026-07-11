package androidx.compose.ui.text.platform;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.platform.extensions.PlaceholderExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.emoji2.text.EmojiCompat;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000[\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u001c\u001a\u0089\u0001\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00062\u0006\u0010\r\u001a\u00020\f2&\u0010\u0014\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001a\u001a\u00020\u0015*\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001d¨\u0006\u001f"}, d2 = {"", "text", "", "contextFontSize", "Landroidx/compose/ui/text/TextStyle;", "contextTextStyle", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "annotations", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "resolveTypeface", "", "useEmojiCompat", "", c.f62177j, "(Ljava/lang/String;FLandroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function4;Z)Ljava/lang/CharSequence;", "rl", "(Landroidx/compose/ui/text/TextStyle;)Z", "androidx/compose/ui/text/platform/AndroidParagraphHelper_androidKt$NoopSpan$1", "Landroidx/compose/ui/text/platform/AndroidParagraphHelper_androidKt$NoopSpan$1;", "NoopSpan", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidParagraphHelper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidParagraphHelper.android.kt\nandroidx/compose/ui/text/platform/AndroidParagraphHelper_androidKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,145:1\n247#2:146\n*S KotlinDebug\n*F\n+ 1 AndroidParagraphHelper.android.kt\nandroidx/compose/ui/text/platform/AndroidParagraphHelper_androidKt\n*L\n79#1:146\n*E\n"})
public final class AndroidParagraphHelper_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final AndroidParagraphHelper_androidKt$NoopSpan$1 f33832n = new CharacterStyle() { // from class: androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt$NoopSpan$1
        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint p0) {
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.emoji2.text.EmojiCompat] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static final CharSequence n(String str, float f3, TextStyle textStyle, List list, List list2, Density density, Function4 function4, boolean z2) {
        String str2;
        CharSequence charSequenceXQ;
        float f4;
        Density density2;
        PlatformParagraphStyle paragraphSyle;
        if (z2 && EmojiCompat.gh()) {
            PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
            EmojiSupportMatch emojiSupportMatchNr = (platformStyle == null || (paragraphSyle = platformStyle.getParagraphSyle()) == null) ? null : EmojiSupportMatch.nr(paragraphSyle.getEmojiSupportMatch());
            str2 = str;
            charSequenceXQ = EmojiCompat.t().XQ(str2, 0, str.length(), Integer.MAX_VALUE, emojiSupportMatchNr == null ? 0 : EmojiSupportMatch.Uo(emojiSupportMatchNr.getValue(), EmojiSupportMatch.INSTANCE.n()));
            Intrinsics.checkNotNull(charSequenceXQ);
        } else {
            str2 = str;
            charSequenceXQ = str2;
        }
        if (list.isEmpty() && list2.isEmpty() && Intrinsics.areEqual(textStyle.fD(), TextIndent.INSTANCE.n()) && TextUnit.J2(textStyle.o()) == 0) {
            return charSequenceXQ;
        }
        Spannable spannableString = charSequenceXQ instanceof Spannable ? (Spannable) charSequenceXQ : new SpannableString(charSequenceXQ);
        if (Intrinsics.areEqual(textStyle.g(), TextDecoration.INSTANCE.nr())) {
            SpannableExtensions_androidKt.WPU(spannableString, f33832n, 0, str2.length());
        }
        if (rl(textStyle) && textStyle.Z() == null) {
            SpannableExtensions_androidKt.Z(spannableString, textStyle.o(), f3, density);
            f4 = f3;
            density2 = density;
        } else {
            LineHeightStyle lineHeightStyleZ = textStyle.Z();
            if (lineHeightStyleZ == null) {
                lineHeightStyleZ = LineHeightStyle.INSTANCE.n();
            }
            f4 = f3;
            density2 = density;
            SpannableExtensions_androidKt.o(spannableString, textStyle.o(), f4, density2, lineHeightStyleZ);
        }
        SpannableExtensions_androidKt.g(spannableString, textStyle.fD(), f4, density2);
        SpannableExtensions_androidKt.ViF(spannableString, textStyle, list, density2, function4);
        SpannableExtensions_androidKt.qie(spannableString, list, f4, density2, textStyle.fD());
        PlaceholderExtensions_androidKt.nr(spannableString, list2, density2);
        return spannableString;
    }

    public static final boolean rl(TextStyle textStyle) {
        PlatformParagraphStyle paragraphSyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        if (platformStyle != null && (paragraphSyle = platformStyle.getParagraphSyle()) != null) {
            return paragraphSyle.getIncludeFontPadding();
        }
        return false;
    }
}
