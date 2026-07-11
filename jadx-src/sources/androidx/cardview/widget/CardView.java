package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class CardView extends FrameLayout {
    private static final CardViewImpl E2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f14638g = {R.attr.colorBackground};
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f14639O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final CardViewDelegate f14640S;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f14641n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final Rect f14642o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final Rect f14643r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f14644t;

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, androidx.cardview.R.attr.f14630n);
    }

    public void setCardBackgroundColor(@ColorInt int i2) {
        E2.az(this.f14640S, ColorStateList.valueOf(i2));
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i5, int i7) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i2, int i3, int i5, int i7) {
    }

    public CardView(Context context, AttributeSet attributeSet, int i2) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i2);
        Rect rect = new Rect();
        this.f14643r = rect;
        this.f14642o = new Rect();
        CardViewDelegate cardViewDelegate = new CardViewDelegate() { // from class: androidx.cardview.widget.CardView.1

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private Drawable f14645n;

            @Override // androidx.cardview.widget.CardViewDelegate
            public boolean J2() {
                return CardView.this.getPreventCornerOverlap();
            }

            @Override // androidx.cardview.widget.CardViewDelegate
            public void O(int i3, int i5) {
                CardView cardView = CardView.this;
                if (i3 > cardView.f14639O) {
                    CardView.super.setMinimumWidth(i3);
                }
                CardView cardView2 = CardView.this;
                if (i5 > cardView2.J2) {
                    CardView.super.setMinimumHeight(i5);
                }
            }

            @Override // androidx.cardview.widget.CardViewDelegate
            public View Uo() {
                return CardView.this;
            }

            @Override // androidx.cardview.widget.CardViewDelegate
            public void n(Drawable drawable) {
                this.f14645n = drawable;
                CardView.this.setBackgroundDrawable(drawable);
            }

            @Override // androidx.cardview.widget.CardViewDelegate
            public void nr(int i3, int i5, int i7, int i8) {
                CardView.this.f14642o.set(i3, i5, i7, i8);
                CardView cardView = CardView.this;
                Rect rect2 = cardView.f14643r;
                CardView.super.setPadding(i3 + rect2.left, i5 + rect2.top, i7 + rect2.right, i8 + rect2.bottom);
            }

            @Override // androidx.cardview.widget.CardViewDelegate
            public boolean rl() {
                return CardView.this.getUseCompatPadding();
            }

            @Override // androidx.cardview.widget.CardViewDelegate
            public Drawable t() {
                return this.f14645n;
            }
        };
        this.f14640S = cardViewDelegate;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.cardview.R.styleable.f14636n, i2, androidx.cardview.R.style.f14634n);
        int i3 = androidx.cardview.R.styleable.nr;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(i3);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f14638g);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(androidx.cardview.R.color.rl) : getResources().getColor(androidx.cardview.R.color.f14631n));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(androidx.cardview.R.styleable.f14635O, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(androidx.cardview.R.styleable.J2, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(androidx.cardview.R.styleable.Uo, 0.0f);
        this.f14641n = typedArrayObtainStyledAttributes.getBoolean(androidx.cardview.R.styleable.xMQ, false);
        this.f14644t = typedArrayObtainStyledAttributes.getBoolean(androidx.cardview.R.styleable.KN, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.mUb, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.qie, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.ty, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.az, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.gh, dimensionPixelSize);
        float f3 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f14639O = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.rl, 0);
        this.J2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.f14637t, 0);
        typedArrayObtainStyledAttributes.recycle();
        E2.KN(cardViewDelegate, context, colorStateList, dimension, dimension2, f3);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return E2.O(this.f14640S);
    }

    public float getCardElevation() {
        return E2.xMQ(this.f14640S);
    }

    @Px
    public int getContentPaddingBottom() {
        return this.f14643r.bottom;
    }

    @Px
    public int getContentPaddingLeft() {
        return this.f14643r.left;
    }

    @Px
    public int getContentPaddingRight() {
        return this.f14643r.right;
    }

    @Px
    public int getContentPaddingTop() {
        return this.f14643r.top;
    }

    public float getMaxCardElevation() {
        return E2.nr(this.f14640S);
    }

    public boolean getPreventCornerOverlap() {
        return this.f14644t;
    }

    public float getRadius() {
        return E2.rl(this.f14640S);
    }

    public boolean getUseCompatPadding() {
        return this.f14641n;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (E2 instanceof CardViewApi21Impl) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.qie(this.f14640S)), View.MeasureSpec.getSize(i2)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.J2(this.f14640S)), View.MeasureSpec.getSize(i3)), mode2);
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        E2.az(this.f14640S, colorStateList);
    }

    public void setCardElevation(float f3) {
        E2.t(this.f14640S, f3);
    }

    public void setMaxCardElevation(float f3) {
        E2.ty(this.f14640S, f3);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        this.J2 = i2;
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        this.f14639O = i2;
        super.setMinimumWidth(i2);
    }

    public void setPreventCornerOverlap(boolean z2) {
        if (z2 != this.f14644t) {
            this.f14644t = z2;
            E2.Uo(this.f14640S);
        }
    }

    public void setRadius(float f3) {
        E2.n(this.f14640S, f3);
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.f14641n != z2) {
            this.f14641n = z2;
            E2.mUb(this.f14640S);
        }
    }

    static {
        CardViewApi21Impl cardViewApi21Impl = new CardViewApi21Impl();
        E2 = cardViewApi21Impl;
        cardViewApi21Impl.gh();
    }
}
