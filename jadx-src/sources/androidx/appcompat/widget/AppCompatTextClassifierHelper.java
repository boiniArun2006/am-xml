package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class AppCompatTextClassifierHelper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TextView f14138n;
    private TextClassifier rl;

    @RequiresApi
    private static final class Api26Impl {
        @NonNull
        @DoNotInline
        static TextClassifier n(@NonNull TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }

    public TextClassifier n() {
        TextClassifier textClassifier = this.rl;
        return textClassifier == null ? Api26Impl.n(this.f14138n) : textClassifier;
    }

    public void rl(TextClassifier textClassifier) {
        this.rl = textClassifier;
    }

    AppCompatTextClassifierHelper(TextView textView) {
        this.f14138n = (TextView) Preconditions.Uo(textView);
    }
}
