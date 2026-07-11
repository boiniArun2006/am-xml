package F;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class eO implements VisualTransformation {

    public static final class j implements OffsetMapping {
        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int n(int i2) {
            return i2 - 1;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int rl(int i2) {
            return i2 + 1;
        }

        j() {
        }
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText n(AnnotatedString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.KN("@");
        builder.J2(text);
        return new TransformedText(builder.ty(), new j());
    }
}
