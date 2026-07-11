package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Constraints extends ViewGroup {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ConstraintSet f36008n;

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public ConstraintSet getConstraintSet() {
        if (this.f36008n == null) {
            this.f36008n = new ConstraintSet();
        }
        this.f36008n.ck(this);
        return this.f36008n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class LayoutParams extends ConstraintLayout.LayoutParams {
        public float EWS;
        public float GD;
        public float HV;
        public boolean Jk;
        public float Org;
        public float Po6;
        public float Rl;
        public float UhV;
        public float hRu;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f36009i;
        public float mYa;
        public float n1;
        public float qm;

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.n1 = 1.0f;
            this.Jk = false;
            this.Rl = 0.0f;
            this.qm = 0.0f;
            this.mYa = 0.0f;
            this.Org = 0.0f;
            this.HV = 1.0f;
            this.GD = 1.0f;
            this.Po6 = 0.0f;
            this.EWS = 0.0f;
            this.hRu = 0.0f;
            this.UhV = 0.0f;
            this.f36009i = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.n1 = 1.0f;
            this.Jk = false;
            this.Rl = 0.0f;
            this.qm = 0.0f;
            this.mYa = 0.0f;
            this.Org = 0.0f;
            this.HV = 1.0f;
            this.GD = 1.0f;
            this.Po6 = 0.0f;
            this.EWS = 0.0f;
            this.hRu = 0.0f;
            this.UhV = 0.0f;
            this.f36009i = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.stS);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.VmZ) {
                    this.n1 = typedArrayObtainStyledAttributes.getFloat(index, this.n1);
                } else if (index == R.styleable.J8e) {
                    this.Rl = typedArrayObtainStyledAttributes.getFloat(index, this.Rl);
                    this.Jk = true;
                } else if (index == R.styleable.JH) {
                    this.mYa = typedArrayObtainStyledAttributes.getFloat(index, this.mYa);
                } else if (index == R.styleable.Pgs) {
                    this.Org = typedArrayObtainStyledAttributes.getFloat(index, this.Org);
                } else if (index == R.styleable.vW5) {
                    this.qm = typedArrayObtainStyledAttributes.getFloat(index, this.qm);
                } else if (index == R.styleable.YnA) {
                    this.HV = typedArrayObtainStyledAttributes.getFloat(index, this.HV);
                } else if (index == R.styleable.hr) {
                    this.GD = typedArrayObtainStyledAttributes.getFloat(index, this.GD);
                } else if (index == R.styleable.Mfw) {
                    this.Po6 = typedArrayObtainStyledAttributes.getFloat(index, this.Po6);
                } else if (index == R.styleable.Tuk) {
                    this.EWS = typedArrayObtainStyledAttributes.getFloat(index, this.EWS);
                } else if (index == R.styleable.lH) {
                    this.hRu = typedArrayObtainStyledAttributes.getFloat(index, this.hRu);
                } else if (index == R.styleable.Pn) {
                    this.UhV = typedArrayObtainStyledAttributes.getFloat(index, this.UhV);
                } else if (index == R.styleable.JF) {
                    this.f36009i = typedArrayObtainStyledAttributes.getFloat(index, this.f36009i);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
