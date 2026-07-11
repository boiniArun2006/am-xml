package androidx.compose.ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.text.TextRange;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "Landroid/view/inputmethod/ExtractedText;", c.f62177j, "(Landroidx/compose/ui/text/input/TextFieldValue;)Landroid/view/inputmethod/ExtractedText;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class InputState_androidKt {
    public static final ExtractedText n(TextFieldValue textFieldValue) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.xMQ();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.xMQ().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = TextRange.qie(textFieldValue.getSelection());
        extractedText.selectionEnd = TextRange.gh(textFieldValue.getSelection());
        extractedText.flags = !StringsKt.contains$default((CharSequence) textFieldValue.xMQ(), '\n', false, 2, (Object) null) ? 1 : 0;
        return extractedText;
    }
}
