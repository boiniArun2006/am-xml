package androidx.compose.foundation.text.input.internal;

import android.content.ClipData;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.inputmethod.ExtractedText;
import androidx.compose.foundation.content.PlatformTransferableContent;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000f\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000e\u0018\u00010\u000b*\u00020\nH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0012\u001a\u0004\u0018\u00010\r*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0019\u001a\u00020\u0015*\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "Landroid/view/inputmethod/ExtractedText;", "O", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;)Landroid/view/inputmethod/ExtractedText;", "Landroidx/core/view/inputmethod/InputContentInfoCompat;", "Landroid/os/Bundle;", "extras", "Landroidx/compose/foundation/content/TransferableContent;", "KN", "(Landroidx/core/view/inputmethod/InputContentInfoCompat;Landroid/os/Bundle;)Landroidx/compose/foundation/content/TransferableContent;", "Landroid/text/Spanned;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "nr", "(Landroid/text/Spanned;)Ljava/util/List;", "", "t", "(Ljava/lang/Object;)Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroid/text/style/StyleSpan;", "Landroidx/compose/ui/text/SpanStyle;", "J2", "(Landroid/text/style/StyleSpan;)Landroidx/compose/ui/text/SpanStyle;", "Landroid/text/style/TypefaceSpan;", "Uo", "(Landroid/text/style/TypefaceSpan;)Landroidx/compose/ui/text/SpanStyle;", "", "familyName", "Landroidx/compose/ui/text/font/FontFamily;", "rl", "(Ljava/lang/String;)Landroidx/compose/ui/text/font/FontFamily;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStatelessInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/StatelessInputConnection_androidKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,660:1\n13309#2,2:661\n1#3:663\n*S KotlinDebug\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/StatelessInputConnection_androidKt\n*L\n570#1:661,2\n*E\n"})
public final class StatelessInputConnection_androidKt {
    private static final FontFamily rl(String str) {
        if (str != null && str.length() != 0) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typeface = Typeface.DEFAULT;
            if (Intrinsics.areEqual(typefaceCreate, typeface) || Intrinsics.areEqual(typefaceCreate, Typeface.create(typeface, 0))) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null) {
                return AndroidTypeface_androidKt.n(typefaceCreate);
            }
        }
        return null;
    }

    public static final TransferableContent KN(InputContentInfoCompat inputContentInfoCompat, Bundle bundle) {
        ClipEntry clipEntryN = AndroidClipboardManager_androidKt.n(new ClipData(inputContentInfoCompat.rl(), new ClipData.Item(inputContentInfoCompat.n())));
        int iT = TransferableContent.Source.INSTANCE.t();
        ClipMetadata clipMetadataRl = AndroidClipboardManager_androidKt.rl(inputContentInfoCompat.rl());
        Uri uriT = inputContentInfoCompat.t();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        return new TransferableContent(clipEntryN, clipMetadataRl, iT, new PlatformTransferableContent(uriT, bundle), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExtractedText O(TextFieldCharSequence textFieldCharSequence) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldCharSequence;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldCharSequence.length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = TextRange.qie(textFieldCharSequence.getSelection());
        extractedText.selectionEnd = TextRange.gh(textFieldCharSequence.getSelection());
        extractedText.flags = !StringsKt.contains$default((CharSequence) textFieldCharSequence, '\n', false, 2, (Object) null) ? 1 : 0;
        return extractedText;
    }

    private static final AnnotatedString.Annotation t(Object obj) {
        if (obj instanceof BackgroundColorSpan) {
            return new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, ColorKt.rl(((BackgroundColorSpan) obj).getBackgroundColor()), null, null, null, null, 63487, null);
        }
        if (obj instanceof ForegroundColorSpan) {
            return new SpanStyle(ColorKt.rl(((ForegroundColorSpan) obj).getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null);
        }
        if (obj instanceof StrikethroughSpan) {
            return new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.INSTANCE.rl(), null, null, null, 61439, null);
        }
        if (obj instanceof StyleSpan) {
            return J2((StyleSpan) obj);
        }
        if (obj instanceof TypefaceSpan) {
            return Uo((TypefaceSpan) obj);
        }
        if (obj instanceof UnderlineSpan) {
            return new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.INSTANCE.nr(), null, null, null, 61439, null);
        }
        return null;
    }

    private static final SpanStyle J2(StyleSpan styleSpan) {
        int style = styleSpan.getStyle();
        if (style != 1) {
            if (style != 2) {
                if (style != 3) {
                    return null;
                }
                return new SpanStyle(0L, 0L, FontWeight.INSTANCE.n(), FontStyle.t(FontStyle.INSTANCE.n()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65523, null);
            }
            return new SpanStyle(0L, 0L, null, FontStyle.t(FontStyle.INSTANCE.n()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65527, null);
        }
        return new SpanStyle(0L, 0L, FontWeight.INSTANCE.n(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65531, null);
    }

    private static final SpanStyle Uo(TypefaceSpan typefaceSpan) {
        FontFamily fontFamilyRl;
        String family = typefaceSpan.getFamily();
        FontFamily.Companion companion = FontFamily.INSTANCE;
        if (Intrinsics.areEqual(family, companion.n().getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String())) {
            fontFamilyRl = companion.n();
        } else if (Intrinsics.areEqual(family, companion.t().getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String())) {
            fontFamilyRl = companion.t();
        } else if (Intrinsics.areEqual(family, companion.nr().getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String())) {
            fontFamilyRl = companion.nr();
        } else if (Intrinsics.areEqual(family, companion.O().getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String())) {
            fontFamilyRl = companion.O();
        } else {
            fontFamilyRl = rl(typefaceSpan.getFamily());
        }
        return new SpanStyle(0L, 0L, null, null, null, fontFamilyRl, null, 0L, null, null, null, 0L, null, null, null, null, 65503, null);
    }

    public static final List nr(Spanned spanned) {
        ArrayList arrayList = null;
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            AnnotatedString.Annotation annotationT = t(obj);
            if (annotationT != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(new AnnotatedString.Range(annotationT, spanned.getSpanStart(obj), spanned.getSpanEnd(obj)));
            }
        }
        return arrayList;
    }
}
