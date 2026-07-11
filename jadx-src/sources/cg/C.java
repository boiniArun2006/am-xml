package cg;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C implements VisualTransformation {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f43761t = new j(null);
    private final String rl;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public static final class n implements OffsetMapping {
        final /* synthetic */ String rl;

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int rl(int i2) {
            return i2 <= 3 ? i2 + this.rl.length() : i2 <= 6 ? i2 + this.rl.length() + 1 : i2 + this.rl.length() + 2;
        }

        n(String str) {
            this.rl = str;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int n(int i2) {
            if (i2 <= this.rl.length()) {
                return 0;
            }
            return i2 <= this.rl.length() + 3 ? i2 - this.rl.length() : i2 <= this.rl.length() + 6 ? (i2 - this.rl.length()) - 1 : (i2 - this.rl.length()) - 2;
        }
    }

    public C(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.rl = countryCode;
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText n(AnnotatedString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        String str = this.rl + " ";
        int i2 = 0;
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.KN(str);
        int i3 = 0;
        while (i2 < text.length()) {
            char cCharAt = text.charAt(i2);
            int i5 = i3 + 1;
            if (i3 == 3 || i3 == 6) {
                builder.KN(" ");
            }
            builder.append(cCharAt);
            i2++;
            i3 = i5;
        }
        return new TransformedText(builder.ty(), new n(str));
    }
}
