package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;
import androidx.media3.database.Kr.FlTC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class EmojiTextViewHelper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final HelperInternal f38406n;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    @RequiresApi
    private static class HelperInternal19 extends HelperInternal {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final TextView f38407n;
        private final EmojiInputFilter rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f38408t = true;

        private InputFilter[] J2(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.rl) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.rl;
            return inputFilterArr2;
        }

        private SparseArray Uo(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                InputFilter inputFilter = inputFilterArr[i2];
                if (inputFilter instanceof EmojiInputFilter) {
                    sparseArray.put(i2, inputFilter);
                }
            }
            return sparseArray;
        }

        private TransformationMethod az(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof EmojiTransformationMethod) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new EmojiTransformationMethod(transformationMethod);
        }

        private void gh() {
            this.f38407n.setFilters(n(this.f38407n.getFilters()));
        }

        private TransformationMethod mUb(TransformationMethod transformationMethod) {
            return transformationMethod instanceof EmojiTransformationMethod ? ((EmojiTransformationMethod) transformationMethod).n() : transformationMethod;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        TransformationMethod O(TransformationMethod transformationMethod) {
            return this.f38408t ? az(transformationMethod) : mUb(transformationMethod);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        InputFilter[] n(InputFilter[] inputFilterArr) {
            return !this.f38408t ? KN(inputFilterArr) : J2(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void nr(boolean z2) {
            this.f38408t = z2;
            qie();
            gh();
        }

        void qie() {
            this.f38407n.setTransformationMethod(O(this.f38407n.getTransformationMethod()));
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public boolean rl() {
            return this.f38408t;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void t(boolean z2) {
            if (z2) {
                qie();
            }
        }

        void xMQ(boolean z2) {
            this.f38408t = z2;
        }

        HelperInternal19(TextView textView) {
            this.f38407n = textView;
            this.rl = new EmojiInputFilter(textView);
        }

        private InputFilter[] KN(InputFilter[] inputFilterArr) {
            SparseArray sparseArrayUo = Uo(inputFilterArr);
            if (sparseArrayUo.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayUo.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArrayUo.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    @RequiresApi
    private static class SkippingHelper19 extends HelperInternal {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final HelperInternal19 f38409n;

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public boolean rl() {
            return this.f38409n.rl();
        }

        SkippingHelper19(TextView textView) {
            this.f38409n = new HelperInternal19(textView);
        }

        private boolean J2() {
            return !EmojiCompat.gh();
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        TransformationMethod O(TransformationMethod transformationMethod) {
            if (J2()) {
                return transformationMethod;
            }
            return this.f38409n.O(transformationMethod);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        InputFilter[] n(InputFilter[] inputFilterArr) {
            if (J2()) {
                return inputFilterArr;
            }
            return this.f38409n.n(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void nr(boolean z2) {
            if (J2()) {
                this.f38409n.xMQ(z2);
            } else {
                this.f38409n.nr(z2);
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void t(boolean z2) {
            if (J2()) {
                return;
            }
            this.f38409n.t(z2);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    static class HelperInternal {
        TransformationMethod O(TransformationMethod transformationMethod) {
            return transformationMethod;
        }

        InputFilter[] n(InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        void nr(boolean z2) {
        }

        public boolean rl() {
            return false;
        }

        void t(boolean z2) {
        }

        HelperInternal() {
        }
    }

    public TransformationMethod O(TransformationMethod transformationMethod) {
        return this.f38406n.O(transformationMethod);
    }

    public InputFilter[] n(InputFilter[] inputFilterArr) {
        return this.f38406n.n(inputFilterArr);
    }

    public void nr(boolean z2) {
        this.f38406n.nr(z2);
    }

    public boolean rl() {
        return this.f38406n.rl();
    }

    public void t(boolean z2) {
        this.f38406n.t(z2);
    }

    public EmojiTextViewHelper(TextView textView, boolean z2) {
        Preconditions.KN(textView, FlTC.ebrdnccg);
        if (!z2) {
            this.f38406n = new SkippingHelper19(textView);
        } else {
            this.f38406n = new HelperInternal19(textView);
        }
    }
}
