package androidx.compose.foundation.text.input;

import androidx.compose.ui.text.TextRange;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b*\u0018\b\u0000\u0010\u000b\"\b\u0012\u0004\u0012\u00020\n0\t2\b\u0012\u0004\u0012\u00020\n0\t¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "", "maxChars", "", "t", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;I)Ljava/lang/CharSequence;", "rl", c.f62177j, "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;)Ljava/lang/CharSequence;", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "PlacedAnnotation", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextFieldCharSequenceKt {
    public static final CharSequence n(TextFieldCharSequence textFieldCharSequence) {
        return textFieldCharSequence.subSequence(TextRange.qie(textFieldCharSequence.getSelection()), TextRange.gh(textFieldCharSequence.getSelection()));
    }

    public static final CharSequence rl(TextFieldCharSequence textFieldCharSequence, int i2) {
        return textFieldCharSequence.subSequence(TextRange.gh(textFieldCharSequence.getSelection()), Math.min(TextRange.gh(textFieldCharSequence.getSelection()) + i2, textFieldCharSequence.length()));
    }

    public static final CharSequence t(TextFieldCharSequence textFieldCharSequence, int i2) {
        return textFieldCharSequence.subSequence(Math.max(0, TextRange.qie(textFieldCharSequence.getSelection()) - i2), TextRange.qie(textFieldCharSequence.getSelection()));
    }
}
