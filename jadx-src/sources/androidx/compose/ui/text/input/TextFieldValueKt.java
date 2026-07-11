package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", "maxChars", "Landroidx/compose/ui/text/AnnotatedString;", "t", "(Landroidx/compose/ui/text/input/TextFieldValue;I)Landroidx/compose/ui/text/AnnotatedString;", "rl", c.f62177j, "(Landroidx/compose/ui/text/input/TextFieldValue;)Landroidx/compose/ui/text/AnnotatedString;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextFieldValueKt {
    public static final AnnotatedString n(TextFieldValue textFieldValue) {
        return textFieldValue.getText().o(textFieldValue.getSelection());
    }

    public static final AnnotatedString rl(TextFieldValue textFieldValue, int i2) {
        return textFieldValue.getText().subSequence(TextRange.gh(textFieldValue.getSelection()), Math.min(TextRange.gh(textFieldValue.getSelection()) + i2, textFieldValue.xMQ().length()));
    }

    public static final AnnotatedString t(TextFieldValue textFieldValue, int i2) {
        return textFieldValue.getText().subSequence(Math.max(0, TextRange.qie(textFieldValue.getSelection()) - i2), TextRange.qie(textFieldValue.getSelection()));
    }
}
