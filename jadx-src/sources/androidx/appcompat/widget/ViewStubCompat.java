package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@RestrictTo
public final class ViewStubCompat extends View {
    private LayoutInflater J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private WeakReference f14449O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f14450n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private OnInflateListener f14451r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f14452t;

    public interface OnInflateListener {
        void n(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f14450n = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.kR, i2, 0);
        this.f14452t = typedArrayObtainStyledAttributes.getResourceId(R.styleable.H6M, -1);
        this.f14450n = typedArrayObtainStyledAttributes.getResourceId(R.styleable.Bha, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(R.styleable.yUZ, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public int getInflatedId() {
        return this.f14452t;
    }

    public LayoutInflater getLayoutInflater() {
        return this.J2;
    }

    public int getLayoutResource() {
        return this.f14450n;
    }

    public void setInflatedId(int i2) {
        this.f14452t = i2;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.J2 = layoutInflater;
    }

    public void setLayoutResource(int i2) {
        this.f14450n = i2;
    }

    public void setOnInflateListener(OnInflateListener onInflateListener) {
        this.f14451r = onInflateListener;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        WeakReference weakReference = this.f14449O;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i2);
            return;
        }
        super.setVisibility(i2);
        if (i2 == 0 || i2 == 4) {
            n();
        }
    }

    public View n() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f14450n != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflaterFrom = this.J2;
                if (layoutInflaterFrom == null) {
                    layoutInflaterFrom = LayoutInflater.from(getContext());
                }
                View viewInflate = layoutInflaterFrom.inflate(this.f14450n, viewGroup, false);
                int i2 = this.f14452t;
                if (i2 != -1) {
                    viewInflate.setId(i2);
                }
                int iIndexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
                } else {
                    viewGroup.addView(viewInflate, iIndexOfChild);
                }
                this.f14449O = new WeakReference(viewInflate);
                OnInflateListener onInflateListener = this.f14451r;
                if (onInflateListener != null) {
                    onInflateListener.n(this, viewInflate);
                }
                return viewInflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }
}
