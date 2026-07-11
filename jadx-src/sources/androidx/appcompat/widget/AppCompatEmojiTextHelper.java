package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.emoji2.viewsintegration.EmojiTextViewHelper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class AppCompatEmojiTextHelper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TextView f14080n;
    private final EmojiTextViewHelper rl;

    public TransformationMethod J2(TransformationMethod transformationMethod) {
        return this.rl.O(transformationMethod);
    }

    void O(boolean z2) {
        this.rl.nr(z2);
    }

    InputFilter[] n(InputFilter[] inputFilterArr) {
        return this.rl.n(inputFilterArr);
    }

    void nr(boolean z2) {
        this.rl.t(z2);
    }

    public boolean rl() {
        return this.rl.rl();
    }

    void t(AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = this.f14080n.getContext().obtainStyledAttributes(attributeSet, R.styleable.dR0, i2, 0);
        try {
            int i3 = R.styleable.ul;
            boolean z2 = typedArrayObtainStyledAttributes.hasValue(i3) ? typedArrayObtainStyledAttributes.getBoolean(i3, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            O(z2);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    AppCompatEmojiTextHelper(TextView textView) {
        this.f14080n = textView;
        this.rl = new EmojiTextViewHelper(textView, false);
    }
}
