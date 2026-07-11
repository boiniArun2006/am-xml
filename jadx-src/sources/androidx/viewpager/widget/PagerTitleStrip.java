package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@ViewPager.DecorView
public class PagerTitleStrip extends ViewGroup {
    private boolean E2;
    TextView J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private WeakReference f42362N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    TextView f42363O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f42364S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final PageListener f42365T;
    int Xw;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f42366e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f42367g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ViewPager f42368n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f42369o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f42370r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    TextView f42371t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f42372v;
    private static final int[] jB = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final int[] f42361U = {R.attr.textAllCaps};

    private class PageListener extends DataSetObserver implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f42373n;
        final /* synthetic */ PagerTitleStrip rl;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void n(int i2, float f3, int i3) {
            if (f3 > 0.5f) {
                i2++;
            }
            this.rl.t(i2, f3, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void nr(int i2) {
            if (this.f42373n == 0) {
                PagerTitleStrip pagerTitleStrip = this.rl;
                pagerTitleStrip.rl(pagerTitleStrip.f42368n.getCurrentItem(), this.rl.f42368n.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = this.rl;
                float f3 = pagerTitleStrip2.f42369o;
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                pagerTitleStrip2.t(pagerTitleStrip2.f42368n.getCurrentItem(), f3, true);
            }
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = this.rl;
            pagerTitleStrip.rl(pagerTitleStrip.f42368n.getCurrentItem(), this.rl.f42368n.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = this.rl;
            float f3 = pagerTitleStrip2.f42369o;
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            pagerTitleStrip2.t(pagerTitleStrip2.f42368n.getCurrentItem(), f3, true);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void rl(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            this.rl.n(pagerAdapter, pagerAdapter2);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void t(int i2) {
            this.f42373n = i2;
        }
    }

    void rl(int i2, PagerAdapter pagerAdapter) {
        int iO = pagerAdapter != null ? pagerAdapter.O() : 0;
        this.E2 = true;
        CharSequence charSequenceUo = null;
        this.f42371t.setText((i2 < 1 || pagerAdapter == null) ? null : pagerAdapter.Uo(i2 - 1));
        this.f42363O.setText((pagerAdapter == null || i2 >= iO) ? null : pagerAdapter.Uo(i2));
        int i3 = i2 + 1;
        if (i3 < iO && pagerAdapter != null) {
            charSequenceUo = pagerAdapter.Uo(i3);
        }
        this.J2.setText(charSequenceUo);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f42371t.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f42363O.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.J2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f42370r = i2;
        if (!this.f42366e) {
            t(i2, this.f42369o, false);
        }
        this.E2 = false;
    }

    private static class SingleLineAllCapsTransform extends SingleLineTransformationMethod {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Locale f42374n;

        SingleLineAllCapsTransform(Context context) {
            this.f42374n = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f42374n);
            }
            return null;
        }
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new SingleLineAllCapsTransform(textView.getContext()));
    }

    public int getTextSpacing() {
        return this.f42364S;
    }

    void n(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (pagerAdapter != null) {
            pagerAdapter.Z(this.f42365T);
            this.f42362N = null;
        }
        if (pagerAdapter2 != null) {
            pagerAdapter2.qie(this.f42365T);
            this.f42362N = new WeakReference(pagerAdapter2);
        }
        ViewPager viewPager = this.f42368n;
        if (viewPager != null) {
            this.f42370r = -1;
            this.f42369o = -1.0f;
            rl(viewPager.getCurrentItem(), pagerAdapter2);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        if (this.f42368n != null) {
            float f3 = this.f42369o;
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            t(this.f42370r, f3, true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.E2) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i2) {
        this.f42367g = i2;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@FloatRange float f3) {
        int i2 = ((int) (f3 * 255.0f)) & 255;
        this.f42372v = i2;
        int i3 = (i2 << 24) | (this.Xw & 16777215);
        this.f42371t.setTextColor(i3);
        this.J2.setTextColor(i3);
    }

    public void setTextColor(@ColorInt int i2) {
        this.Xw = i2;
        this.f42363O.setTextColor(i2);
        int i3 = (this.f42372v << 24) | (this.Xw & 16777215);
        this.f42371t.setTextColor(i3);
        this.J2.setTextColor(i3);
    }

    public void setTextSpacing(int i2) {
        this.f42364S = i2;
        requestLayout();
    }

    void t(int i2, float f3, boolean z2) {
        int i3;
        int i5;
        int i7;
        int i8;
        if (i2 != this.f42370r) {
            rl(i2, this.f42368n.getAdapter());
        } else if (!z2 && f3 == this.f42369o) {
            return;
        }
        this.f42366e = true;
        int measuredWidth = this.f42371t.getMeasuredWidth();
        int measuredWidth2 = this.f42363O.getMeasuredWidth();
        int measuredWidth3 = this.J2.getMeasuredWidth();
        int i9 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i10 = paddingRight + i9;
        int i11 = (width - (paddingLeft + i9)) - i10;
        float f4 = 0.5f + f3;
        if (f4 > 1.0f) {
            f4 -= 1.0f;
        }
        int i12 = ((width - i10) - ((int) (i11 * f4))) - i9;
        int i13 = measuredWidth2 + i12;
        int baseline = this.f42371t.getBaseline();
        int baseline2 = this.f42363O.getBaseline();
        int baseline3 = this.J2.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i14 = iMax - baseline;
        int i15 = iMax - baseline2;
        int i16 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(this.f42371t.getMeasuredHeight() + i14, this.f42363O.getMeasuredHeight() + i15), this.J2.getMeasuredHeight() + i16);
        int i17 = this.f42367g & 112;
        if (i17 == 16) {
            i3 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        } else {
            if (i17 != 80) {
                i5 = i14 + paddingTop;
                i7 = i15 + paddingTop;
                i8 = paddingTop + i16;
                TextView textView = this.f42363O;
                textView.layout(i12, i7, i13, textView.getMeasuredHeight() + i7);
                int iMin = Math.min(paddingLeft, (i12 - this.f42364S) - measuredWidth);
                TextView textView2 = this.f42371t;
                textView2.layout(iMin, i5, iMin + measuredWidth, textView2.getMeasuredHeight() + i5);
                int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i13 + this.f42364S);
                TextView textView3 = this.J2;
                textView3.layout(iMax3, i8, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i8);
                this.f42369o = f3;
                this.f42366e = false;
            }
            i3 = (height - paddingBottom) - iMax2;
        }
        i5 = i14 + i3;
        i7 = i15 + i3;
        i8 = i3 + i16;
        TextView textView4 = this.f42363O;
        textView4.layout(i12, i7, i13, textView4.getMeasuredHeight() + i7);
        int iMin2 = Math.min(paddingLeft, (i12 - this.f42364S) - measuredWidth);
        TextView textView22 = this.f42371t;
        textView22.layout(iMin2, i5, iMin2 + measuredWidth, textView22.getMeasuredHeight() + i5);
        int iMax32 = Math.max((width - paddingRight) - measuredWidth3, i13 + this.f42364S);
        TextView textView32 = this.J2;
        textView32.layout(iMax32, i8, iMax32 + measuredWidth3, textView32.getMeasuredHeight() + i8);
        this.f42369o = f3;
        this.f42366e = false;
    }

    int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        PagerAdapter pagerAdapter;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            PagerAdapter adapter = viewPager.getAdapter();
            viewPager.jB(this.f42365T);
            viewPager.rl(this.f42365T);
            this.f42368n = viewPager;
            WeakReference weakReference = this.f42362N;
            if (weakReference != null) {
                pagerAdapter = (PagerAdapter) weakReference.get();
            } else {
                pagerAdapter = null;
            }
            n(pagerAdapter, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f42368n;
        if (viewPager != null) {
            n(viewPager.getAdapter(), null);
            this.f42368n.jB(null);
            this.f42368n.N(this.f42365T);
            this.f42368n = null;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int iMax;
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingTop, -2);
            int size = View.MeasureSpec.getSize(i2);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, (int) (size * 0.2f), -2);
            this.f42371t.measure(childMeasureSpec2, childMeasureSpec);
            this.f42363O.measure(childMeasureSpec2, childMeasureSpec);
            this.J2.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i3) == 1073741824) {
                iMax = View.MeasureSpec.getSize(i3);
            } else {
                iMax = Math.max(getMinHeight(), this.f42363O.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(iMax, i3, this.f42363O.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }
}
