package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;
import androidx.media3.database.Kr.FlTC;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
class AppCompatTextViewAutoSizeHelper {
    private TextPaint KN;
    private final Impl gh;
    private final Context mUb;
    private final TextView xMQ;
    private static final RectF qie = new RectF();
    private static ConcurrentHashMap az = new ConcurrentHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f14160n = 0;
    private boolean rl = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f14161t = -1.0f;
    private float nr = -1.0f;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f14159O = -1.0f;
    private int[] J2 = new int[0];
    private boolean Uo = false;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    private static class Impl {
        void n(StaticLayout.Builder builder, TextView textView) {
        }

        boolean rl(TextView textView) {
            return ((Boolean) AppCompatTextViewAutoSizeHelper.az(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }

        Impl() {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    @RequiresApi
    private static class Impl23 extends Impl {
        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        void n(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) AppCompatTextViewAutoSizeHelper.az(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }

        Impl23() {
        }
    }

    private void nY(float f3, float f4, float f5) {
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f3 + "px) is less or equal to (0px)");
        }
        if (f4 <= f3) {
            throw new IllegalArgumentException(HrvQKfmFZJudBc.gtqPXCmOvvjx + f4 + "px) is less or equal to minimum auto-size text size (" + f3 + "px)");
        }
        if (f5 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f5 + "px) is less or equal to (0px)");
        }
        this.f14160n = 1;
        this.nr = f3;
        this.f14159O = f4;
        this.f14161t = f5;
        this.Uo = false;
    }

    private int[] rl(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i2 : iArr) {
                if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    private void t() {
        this.f14160n = 0;
        this.nr = -1.0f;
        this.f14159O = -1.0f;
        this.f14161t = -1.0f;
        this.J2 = new int[0];
        this.rl = false;
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    @RequiresApi
    private static final class Api23Impl {
        @NonNull
        @DoNotInline
        static StaticLayout n(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i2, int i3, @NonNull TextView textView, @NonNull TextPaint textPaint, @NonNull Impl impl) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i2);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i3 == -1) {
                i3 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i3);
            try {
                impl.n(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w(FlTC.OmfWPrtsIvql, "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    @RequiresApi
    private static class Impl29 extends Impl23 {
        Impl29() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl23, androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        void n(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        boolean rl(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    private int O(RectF rectF) {
        int length = this.J2.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i2 = 1;
        int i3 = length - 1;
        int i5 = 0;
        while (i2 <= i3) {
            int i7 = (i2 + i3) / 2;
            if (aYN(this.J2[i7], rectF)) {
                int i8 = i7 + 1;
                i5 = i2;
                i2 = i8;
            } else {
                i5 = i7 - 1;
                i3 = i5;
            }
        }
        return this.J2[i5];
    }

    private boolean ViF() {
        return !(this.xMQ instanceof AppCompatEditText);
    }

    private boolean WPU() {
        boolean z2 = this.J2.length > 0;
        this.Uo = z2;
        if (z2) {
            this.f14160n = 1;
            this.nr = r0[0];
            this.f14159O = r0[r1 - 1];
            this.f14161t = -1.0f;
        }
        return z2;
    }

    private boolean aYN(int i2, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.xMQ.getText();
        TransformationMethod transformationMethod = this.xMQ.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.xMQ)) != null) {
            text = transformation;
        }
        int maxLines = this.xMQ.getMaxLines();
        qie(i2);
        StaticLayout staticLayoutNr = nr(text, (Layout.Alignment) az(this.xMQ, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutNr.getLineCount() <= maxLines && staticLayoutNr.getLineEnd(staticLayoutNr.getLineCount() - 1) == text.length())) && ((float) staticLayoutNr.getHeight()) <= rectF.bottom;
    }

    private static Method gh(String str) {
        try {
            Method declaredMethod = (Method) az.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            az.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    private void o(float f3) {
        if (f3 != this.xMQ.getPaint().getTextSize()) {
            this.xMQ.getPaint().setTextSize(f3);
            boolean zIsInLayout = this.xMQ.isInLayout();
            if (this.xMQ.getLayout() != null) {
                this.rl = false;
                try {
                    Method methodGh = gh("nullLayouts");
                    if (methodGh != null) {
                        methodGh.invoke(this.xMQ, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (zIsInLayout) {
                    this.xMQ.forceLayout();
                } else {
                    this.xMQ.requestLayout();
                }
                this.xMQ.invalidate();
            }
        }
    }

    void HI(AttributeSet attributeSet, int i2) {
        int resourceId;
        Context context = this.mUb;
        int[] iArr = R.styleable.dR0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        TextView textView = this.xMQ;
        ViewCompat.ijL(textView, textView.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        int i3 = R.styleable.eTf;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            this.f14160n = typedArrayObtainStyledAttributes.getInt(i3, 0);
        }
        int i5 = R.styleable.f13530m;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i5) ? typedArrayObtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i7 = R.styleable.piY;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i7) ? typedArrayObtainStyledAttributes.getDimension(i7, -1.0f) : -1.0f;
        int i8 = R.styleable.f13540z;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i8) ? typedArrayObtainStyledAttributes.getDimension(i8, -1.0f) : -1.0f;
        int i9 = R.styleable.ijL;
        if (typedArrayObtainStyledAttributes.hasValue(i9) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i9, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            S(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!ViF()) {
            this.f14160n = 0;
            return;
        }
        if (this.f14160n == 1) {
            if (!this.Uo) {
                DisplayMetrics displayMetrics = this.mUb.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                nY(dimension2, dimension3, dimension);
            }
            XQ();
        }
    }

    int J2() {
        return Math.round(this.f14159O);
    }

    int KN() {
        return Math.round(this.f14161t);
    }

    int Uo() {
        return Math.round(this.nr);
    }

    void Z(int i2, float f3) {
        Context context = this.mUb;
        o(TypedValue.applyDimension(i2, f3, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    int mUb() {
        return this.f14160n;
    }

    StaticLayout nr(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        return Api23Impl.n(charSequence, alignment, i2, i3, this.xMQ, this.KN, this.gh);
    }

    void qie(int i2) {
        TextPaint textPaint = this.KN;
        if (textPaint == null) {
            this.KN = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.KN.set(this.xMQ.getPaint());
        this.KN.setTextSize(i2);
    }

    int[] xMQ() {
        return this.J2;
    }

    AppCompatTextViewAutoSizeHelper(TextView textView) {
        this.xMQ = textView;
        this.mUb = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.gh = new Impl29();
        } else {
            this.gh = new Impl23();
        }
    }

    private void S(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = typedArray.getDimensionPixelSize(i2, -1);
            }
            this.J2 = rl(iArr);
            WPU();
        }
    }

    private boolean XQ() {
        if (ViF() && this.f14160n == 1) {
            if (!this.Uo || this.J2.length == 0) {
                int iFloor = ((int) Math.floor((this.f14159O - this.nr) / this.f14161t)) + 1;
                int[] iArr = new int[iFloor];
                for (int i2 = 0; i2 < iFloor; i2++) {
                    iArr[i2] = Math.round(this.nr + (i2 * this.f14161t));
                }
                this.J2 = rl(iArr);
            }
            this.rl = true;
        } else {
            this.rl = false;
        }
        return this.rl;
    }

    static Object az(Object obj, String str, Object obj2) {
        try {
            return gh(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return obj2;
        }
    }

    void Ik(int[] iArr, int i2) {
        if (ViF()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i2 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.mUb.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArrCopyOf[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                this.J2 = rl(iArrCopyOf);
                if (!WPU()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.Uo = false;
            }
            if (XQ()) {
                n();
            }
        }
    }

    void ck(int i2, int i3, int i5, int i7) {
        if (ViF()) {
            DisplayMetrics displayMetrics = this.mUb.getResources().getDisplayMetrics();
            nY(TypedValue.applyDimension(i7, i2, displayMetrics), TypedValue.applyDimension(i7, i3, displayMetrics), TypedValue.applyDimension(i7, i5, displayMetrics));
            if (XQ()) {
                n();
            }
        }
    }

    void n() {
        int measuredWidth;
        if (ty()) {
            if (this.rl) {
                if (this.xMQ.getMeasuredHeight() > 0 && this.xMQ.getMeasuredWidth() > 0) {
                    if (this.gh.rl(this.xMQ)) {
                        measuredWidth = 1048576;
                    } else {
                        measuredWidth = (this.xMQ.getMeasuredWidth() - this.xMQ.getTotalPaddingLeft()) - this.xMQ.getTotalPaddingRight();
                    }
                    int height = (this.xMQ.getHeight() - this.xMQ.getCompoundPaddingBottom()) - this.xMQ.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = qie;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = measuredWidth;
                                rectF.bottom = height;
                                float fO = O(rectF);
                                if (fO != this.xMQ.getTextSize()) {
                                    Z(0, fO);
                                }
                            } finally {
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.rl = true;
        }
    }

    void r(int i2) {
        if (ViF()) {
            if (i2 != 0) {
                if (i2 == 1) {
                    DisplayMetrics displayMetrics = this.mUb.getResources().getDisplayMetrics();
                    nY(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (XQ()) {
                        n();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
            }
            t();
        }
    }

    boolean ty() {
        if (ViF() && this.f14160n != 0) {
            return true;
        }
        return false;
    }
}
