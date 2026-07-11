package androidx.viewpager.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class PagerTabStrip extends PagerTitleStrip {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final Rect f42349B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f42350D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f42351E;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private final Paint f42352FX;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private boolean f42353GR;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f42354I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f42355J;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f42356M;
    private int M7;
    private float Nxk;
    private int P5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f42357a;
    private int dR0;
    private int eF;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f42358k;
    private int p5;

    /* JADX INFO: renamed from: androidx.viewpager.widget.PagerTabStrip$1, reason: invalid class name */
    class AnonymousClass1 implements View.OnClickListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ PagerTabStrip f42359n;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f42359n.f42368n.setCurrentItem(r2.getCurrentItem() - 1);
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.PagerTabStrip$2, reason: invalid class name */
    class AnonymousClass2 implements View.OnClickListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ PagerTabStrip f42360n;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = this.f42360n.f42368n;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public boolean getDrawFullUnderline() {
        return this.f42350D;
    }

    @ColorInt
    public int getTabIndicatorColor() {
        return this.P5;
    }

    public void setDrawFullUnderline(boolean z2) {
        this.f42350D = z2;
        this.f42357a = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i5, int i7) {
        int i8 = this.p5;
        if (i7 < i8) {
            i7 = i8;
        }
        super.setPadding(i2, i3, i5, i7);
    }

    public void setTabIndicatorColor(@ColorInt int i2) {
        this.P5 = i2;
        this.f42352FX.setColor(i2);
        invalidate();
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i2) {
        int i3 = this.eF;
        if (i2 < i3) {
            i2 = i3;
        }
        super.setTextSpacing(i2);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    void t(int i2, float f3, boolean z2) {
        Rect rect = this.f42349B;
        int height = getHeight();
        int left = this.f42363O.getLeft() - this.f42356M;
        int right = this.f42363O.getRight() + this.f42356M;
        int i3 = height - this.M7;
        rect.set(left, i3, right, height);
        super.t(i2, f3, z2);
        this.f42355J = (int) (Math.abs(f3 - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f42363O.getLeft() - this.f42356M, i3, this.f42363O.getRight() + this.f42356M, height);
        invalidate(rect);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f42351E);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f42363O.getLeft() - this.f42356M;
        int right = this.f42363O.getRight() + this.f42356M;
        int i2 = height - this.M7;
        this.f42352FX.setColor((this.f42355J << 24) | (this.P5 & 16777215));
        float f3 = height;
        canvas.drawRect(left, i2, right, f3, this.f42352FX);
        if (this.f42350D) {
            this.f42352FX.setColor((this.P5 & 16777215) | (-16777216));
            canvas.drawRect(getPaddingLeft(), height - this.f42354I, getWidth() - getPaddingRight(), f3, this.f42352FX);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f42353GR) {
            return false;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && (Math.abs(x2 - this.Nxk) > this.dR0 || Math.abs(y2 - this.f42358k) > this.dR0)) {
                    this.f42353GR = true;
                }
            } else if (x2 < this.f42363O.getLeft() - this.f42356M) {
                ViewPager viewPager = this.f42368n;
                viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
            } else if (x2 > this.f42363O.getRight() + this.f42356M) {
                ViewPager viewPager2 = this.f42368n;
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
            }
        } else {
            this.Nxk = x2;
            this.f42358k = y2;
            this.f42353GR = false;
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i2) {
        boolean z2;
        super.setBackgroundColor(i2);
        if (!this.f42357a) {
            if ((i2 & (-16777216)) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f42350D = z2;
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        boolean z2;
        super.setBackgroundDrawable(drawable);
        if (!this.f42357a) {
            if (drawable == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f42350D = z2;
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
        boolean z2;
        super.setBackgroundResource(i2);
        if (!this.f42357a) {
            if (i2 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f42350D = z2;
        }
    }

    public void setTabIndicatorColorResource(@ColorRes int i2) {
        setTabIndicatorColor(ContextCompat.getColor(getContext(), i2));
    }
}
