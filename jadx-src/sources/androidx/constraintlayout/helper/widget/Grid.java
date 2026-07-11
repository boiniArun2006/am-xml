package androidx.constraintlayout.helper.widget;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.VirtualLayout;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Grid extends VirtualLayout {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f35614B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f35615D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private String f35616E;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private float f35617FX;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    Set f35618GR;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean[][] f35619I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f35620J;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private float f35621M;
    private String M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private View[] f35622N;
    private int[] Nxk;
    private int P5;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f35623U;
    private int Xw;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f35624a;
    private String eF;
    private int jB;
    private String p5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    ConstraintLayout f35625v;

    private boolean X(int[][] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int iE = e(iArr[i2][0]);
            int iE2 = E2(iArr[i2][0]);
            int[] iArr2 = iArr[i2];
            if (!nHg(iE, iE2, iArr2[1], iArr2[2])) {
                return false;
            }
        }
        return true;
    }

    private float[] Xw(int i2, String str) {
        float[] fArr = null;
        if (str != null && !str.trim().isEmpty()) {
            String[] strArrSplit = str.split(",");
            if (strArrSplit.length != i2) {
                return null;
            }
            fArr = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr[i3] = Float.parseFloat(strArrSplit[i3].trim());
            }
        }
        return fArr;
    }

    private int getNextPosition() {
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2 = this.f35620J;
            if (i2 >= this.Xw * this.f35623U) {
                return -1;
            }
            int iE = e(i2);
            int iE2 = E2(this.f35620J);
            boolean[] zArr = this.f35619I[iE];
            if (zArr[iE2]) {
                zArr[iE2] = false;
                z2 = true;
            }
            this.f35620J++;
        }
        return i2;
    }

    private boolean nHg(int i2, int i3, int i5, int i7) {
        for (int i8 = i2; i8 < i2 + i5; i8++) {
            for (int i9 = i3; i9 < i3 + i7; i9++) {
                boolean[][] zArr = this.f35619I;
                if (i8 < zArr.length && i9 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i8];
                    if (zArr2[i9]) {
                        zArr2[i9] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean s7N(CharSequence charSequence) {
        return true;
    }

    private boolean wTp(String str) {
        return true;
    }

    public void setHorizontalGaps(float f3) {
        if (f3 >= 0.0f && this.f35621M != f3) {
            this.f35621M = f3;
            fD(true);
            invalidate();
        }
    }

    public void setOrientation(int i2) {
        if ((i2 == 0 || i2 == 1) && this.f35614B != i2) {
            this.f35614B = i2;
            fD(true);
            invalidate();
        }
    }

    public void setVerticalGaps(float f3) {
        if (f3 >= 0.0f && this.f35617FX != f3) {
            this.f35617FX = f3;
            fD(true);
            invalidate();
        }
    }

    private int E2(int i2) {
        return this.f35614B == 1 ? i2 / this.Xw : i2 % this.f35623U;
    }

    private void N() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.Xw, this.f35623U);
        this.f35619I = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
    }

    private void P5() {
        int i2;
        int i3 = this.jB;
        if (i3 != 0 && (i2 = this.P5) != 0) {
            this.Xw = i3;
            this.f35623U = i2;
            return;
        }
        int i5 = this.P5;
        if (i5 > 0) {
            this.f35623U = i5;
            this.Xw = ((this.f35900t + i5) - 1) / i5;
        } else if (i3 > 0) {
            this.Xw = i3;
            this.f35623U = ((this.f35900t + i3) - 1) / i3;
        } else {
            int iSqrt = (int) (Math.sqrt(this.f35900t) + 1.5d);
            this.Xw = iSqrt;
            this.f35623U = ((this.f35900t + iSqrt) - 1) / iSqrt;
        }
    }

    private boolean T(int[] iArr, int[][] iArr2) {
        View[] viewArrTy = ty(this.f35625v);
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            int iE = e(iArr2[i2][0]);
            int iE2 = E2(iArr2[i2][0]);
            int[] iArr3 = iArr2[i2];
            if (!nHg(iE, iE2, iArr3[1], iArr3[2])) {
                return false;
            }
            View view = viewArrTy[i2];
            int[] iArr4 = iArr2[i2];
            iF(view, iE, iE2, iArr4[1], iArr4[2]);
            this.f35618GR.add(Integer.valueOf(iArr[i2]));
        }
        return true;
    }

    private boolean ViF() {
        View[] viewArrTy = ty(this.f35625v);
        for (int i2 = 0; i2 < this.f35900t; i2++) {
            if (!this.f35618GR.contains(Integer.valueOf(this.f35897n[i2]))) {
                int nextPosition = getNextPosition();
                int iE = e(nextPosition);
                int iE2 = E2(nextPosition);
                if (nextPosition == -1) {
                    return false;
                }
                iF(viewArrTy[i2], iE, iE2, 1, 1);
            }
        }
        return true;
    }

    private int e(int i2) {
        return this.f35614B == 1 ? i2 % this.Xw : i2 / this.f35623U;
    }

    private boolean fD(boolean z2) {
        int[][] iArrBzg;
        int[][] iArrBzg2;
        if (this.f35625v == null || this.Xw < 1 || this.f35623U < 1) {
            return false;
        }
        if (z2) {
            for (int i2 = 0; i2 < this.f35619I.length; i2++) {
                int i3 = 0;
                while (true) {
                    boolean[][] zArr = this.f35619I;
                    if (i3 < zArr[0].length) {
                        zArr[i2][i3] = true;
                        i3++;
                    }
                }
            }
            this.f35618GR.clear();
        }
        this.f35620J = 0;
        nY();
        String str = this.p5;
        boolean zX = (str == null || str.trim().isEmpty() || (iArrBzg2 = bzg(this.p5)) == null) ? true : X(iArrBzg2);
        String str2 = this.M7;
        if (str2 != null && !str2.trim().isEmpty() && (iArrBzg = bzg(this.M7)) != null) {
            zX &= T(this.f35897n, iArrBzg);
        }
        return (zX && ViF()) || !this.f35615D;
    }

    private void nY() {
        int iMax = Math.max(this.Xw, this.f35623U);
        View[] viewArr = this.f35622N;
        int i2 = 0;
        if (viewArr == null) {
            this.f35622N = new View[iMax];
            int i3 = 0;
            while (true) {
                View[] viewArr2 = this.f35622N;
                if (i3 >= viewArr2.length) {
                    break;
                }
                viewArr2[i3] = v();
                i3++;
            }
        } else if (iMax != viewArr.length) {
            View[] viewArr3 = new View[iMax];
            for (int i5 = 0; i5 < iMax; i5++) {
                View[] viewArr4 = this.f35622N;
                if (i5 < viewArr4.length) {
                    viewArr3[i5] = viewArr4[i5];
                } else {
                    viewArr3[i5] = v();
                }
            }
            int i7 = iMax;
            while (true) {
                View[] viewArr5 = this.f35622N;
                if (i7 >= viewArr5.length) {
                    break;
                }
                this.f35625v.removeView(viewArr5[i7]);
                i7++;
            }
            this.f35622N = viewArr3;
        }
        this.Nxk = new int[iMax];
        while (true) {
            View[] viewArr6 = this.f35622N;
            if (i2 >= viewArr6.length) {
                U();
                jB();
                return;
            } else {
                this.Nxk[i2] = viewArr6[i2].getId();
                i2++;
            }
        }
    }

    private View v() {
        View view = new View(getContext());
        view.setId(View.generateViewId());
        view.setVisibility(4);
        this.f35625v.addView(view, new ConstraintLayout.LayoutParams(0, 0));
        return view;
    }

    public String getColumnWeights() {
        return this.f35616E;
    }

    public int getColumns() {
        return this.P5;
    }

    public float getHorizontalGaps() {
        return this.f35621M;
    }

    public int getOrientation() {
        return this.f35614B;
    }

    public String getRowWeights() {
        return this.eF;
    }

    public int getRows() {
        return this.jB;
    }

    public String getSkips() {
        return this.p5;
    }

    public String getSpans() {
        return this.M7;
    }

    public float getVerticalGaps() {
        return this.f35617FX;
    }

    public void setColumns(int i2) {
        if (i2 <= 50 && this.P5 != i2) {
            this.P5 = i2;
            P5();
            N();
            fD(false);
            invalidate();
        }
    }

    public void setRows(int i2) {
        if (i2 <= 50 && this.jB != i2) {
            this.jB = i2;
            P5();
            N();
            fD(false);
            invalidate();
        }
    }

    private void U() {
        int i2;
        int id = getId();
        int iMax = Math.max(this.Xw, this.f35623U);
        float[] fArrXw = Xw(this.Xw, this.eF);
        int i3 = 0;
        if (this.Xw == 1) {
            ConstraintLayout.LayoutParams layoutParamsRV9 = rV9(this.f35622N[0]);
            te(this.f35622N[0]);
            layoutParamsRV9.xMQ = id;
            layoutParamsRV9.qie = id;
            this.f35622N[0].setLayoutParams(layoutParamsRV9);
            return;
        }
        while (true) {
            i2 = this.Xw;
            if (i3 >= i2) {
                break;
            }
            ConstraintLayout.LayoutParams layoutParamsRV92 = rV9(this.f35622N[i3]);
            te(this.f35622N[i3]);
            if (fArrXw != null) {
                layoutParamsRV92.f35947v = fArrXw[i3];
            }
            if (i3 > 0) {
                layoutParamsRV92.mUb = this.Nxk[i3 - 1];
            } else {
                layoutParamsRV92.xMQ = id;
            }
            if (i3 < this.Xw - 1) {
                layoutParamsRV92.gh = this.Nxk[i3 + 1];
            } else {
                layoutParamsRV92.qie = id;
            }
            if (i3 > 0) {
                ((ViewGroup.MarginLayoutParams) layoutParamsRV92).topMargin = (int) this.f35621M;
            }
            this.f35622N[i3].setLayoutParams(layoutParamsRV92);
            i3++;
        }
        while (i2 < iMax) {
            ConstraintLayout.LayoutParams layoutParamsRV93 = rV9(this.f35622N[i2]);
            te(this.f35622N[i2]);
            layoutParamsRV93.xMQ = id;
            layoutParamsRV93.qie = id;
            this.f35622N[i2].setLayoutParams(layoutParamsRV93);
            i2++;
        }
    }

    private int[][] bzg(String str) {
        if (!s7N(str)) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            String[] strArrSplit2 = strArrSplit[i2].trim().split(":");
            String[] strArrSplit3 = strArrSplit2[1].split("x");
            iArr[i2][0] = Integer.parseInt(strArrSplit2[0]);
            iArr[i2][1] = Integer.parseInt(strArrSplit3[0]);
            iArr[i2][2] = Integer.parseInt(strArrSplit3[1]);
        }
        return iArr;
    }

    private void g(View view) {
        ConstraintLayout.LayoutParams layoutParamsRV9 = rV9(view);
        layoutParamsRV9.wTp = -1.0f;
        layoutParamsRV9.J2 = -1;
        layoutParamsRV9.f35931O = -1;
        layoutParamsRV9.Uo = -1;
        layoutParamsRV9.KN = -1;
        ((ViewGroup.MarginLayoutParams) layoutParamsRV9).leftMargin = -1;
        view.setLayoutParams(layoutParamsRV9);
    }

    private void iF(View view, int i2, int i3, int i5, int i7) {
        ConstraintLayout.LayoutParams layoutParamsRV9 = rV9(view);
        int[] iArr = this.Nxk;
        layoutParamsRV9.f35931O = iArr[i3];
        layoutParamsRV9.xMQ = iArr[i2];
        layoutParamsRV9.KN = iArr[(i3 + i7) - 1];
        layoutParamsRV9.qie = iArr[(i2 + i5) - 1];
        view.setLayoutParams(layoutParamsRV9);
    }

    private void jB() {
        int i2;
        int id = getId();
        int iMax = Math.max(this.Xw, this.f35623U);
        float[] fArrXw = Xw(this.f35623U, this.f35616E);
        int i3 = 0;
        ConstraintLayout.LayoutParams layoutParamsRV9 = rV9(this.f35622N[0]);
        if (this.f35623U == 1) {
            g(this.f35622N[0]);
            layoutParamsRV9.f35931O = id;
            layoutParamsRV9.KN = id;
            this.f35622N[0].setLayoutParams(layoutParamsRV9);
            return;
        }
        while (true) {
            i2 = this.f35623U;
            if (i3 >= i2) {
                break;
            }
            ConstraintLayout.LayoutParams layoutParamsRV92 = rV9(this.f35622N[i3]);
            g(this.f35622N[i3]);
            if (fArrXw != null) {
                layoutParamsRV92.wTp = fArrXw[i3];
            }
            if (i3 > 0) {
                layoutParamsRV92.J2 = this.Nxk[i3 - 1];
            } else {
                layoutParamsRV92.f35931O = id;
            }
            if (i3 < this.f35623U - 1) {
                layoutParamsRV92.Uo = this.Nxk[i3 + 1];
            } else {
                layoutParamsRV92.KN = id;
            }
            if (i3 > 0) {
                ((ViewGroup.MarginLayoutParams) layoutParamsRV92).leftMargin = (int) this.f35621M;
            }
            this.f35622N[i3].setLayoutParams(layoutParamsRV92);
            i3++;
        }
        while (i2 < iMax) {
            ConstraintLayout.LayoutParams layoutParamsRV93 = rV9(this.f35622N[i2]);
            g(this.f35622N[i2]);
            layoutParamsRV93.f35931O = id;
            layoutParamsRV93.KN = id;
            this.f35622N[i2].setLayoutParams(layoutParamsRV93);
            i2++;
        }
    }

    private ConstraintLayout.LayoutParams rV9(View view) {
        return (ConstraintLayout.LayoutParams) view.getLayoutParams();
    }

    private void te(View view) {
        ConstraintLayout.LayoutParams layoutParamsRV9 = rV9(view);
        layoutParamsRV9.f35947v = -1.0f;
        layoutParamsRV9.mUb = -1;
        layoutParamsRV9.xMQ = -1;
        layoutParamsRV9.gh = -1;
        layoutParamsRV9.qie = -1;
        ((ViewGroup.MarginLayoutParams) layoutParamsRV9).topMargin = -1;
        view.setLayoutParams(layoutParamsRV9);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void HI(AttributeSet attributeSet) {
        super.HI(attributeSet);
        this.f35899r = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.QZ);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.in7) {
                    this.jB = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == R.styleable.hRk) {
                    this.P5 = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == R.styleable.f36075kd) {
                    this.M7 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == R.styleable.sm) {
                    this.p5 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == R.styleable.f36049V) {
                    this.eF = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == R.styleable.TPh) {
                    this.f35616E = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == R.styleable.ib) {
                    this.f35614B = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.md) {
                    this.f35621M = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == R.styleable.I4) {
                    this.f35617FX = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == R.styleable.CE) {
                    this.f35615D = typedArrayObtainStyledAttributes.getBoolean(index, false);
                } else if (index == R.styleable.h6) {
                    this.f35624a = typedArrayObtainStyledAttributes.getBoolean(index, false);
                }
            }
            P5();
            N();
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35625v = (ConstraintLayout) getParent();
        fD(false);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode()) {
            Paint paint = new Paint();
            paint.setColor(-65536);
            paint.setStyle(Paint.Style.STROKE);
            int top = getTop();
            int left = getLeft();
            int bottom = getBottom();
            int right = getRight();
            for (View view : this.f35622N) {
                int left2 = view.getLeft() - left;
                int top2 = view.getTop() - top;
                int right2 = view.getRight() - left;
                int bottom2 = view.getBottom() - top;
                canvas.drawRect(left2, 0.0f, right2, bottom - top, paint);
                canvas.drawRect(0.0f, top2, right - left, bottom2, paint);
            }
        }
    }

    public void setColumnWeights(String str) {
        if (wTp(str)) {
            String str2 = this.f35616E;
            if (str2 != null && str2.equals(str)) {
                return;
            }
            this.f35616E = str;
            fD(true);
            invalidate();
        }
    }

    public void setRowWeights(String str) {
        if (wTp(str)) {
            String str2 = this.eF;
            if (str2 != null && str2.equals(str)) {
                return;
            }
            this.eF = str;
            fD(true);
            invalidate();
        }
    }

    public void setSkips(String str) {
        if (s7N(str)) {
            String str2 = this.p5;
            if (str2 != null && str2.equals(str)) {
                return;
            }
            this.p5 = str;
            fD(true);
            invalidate();
        }
    }

    public void setSpans(CharSequence charSequence) {
        if (s7N(charSequence)) {
            String str = this.M7;
            if (str != null && str.contentEquals(charSequence)) {
                return;
            }
            this.M7 = charSequence.toString();
            fD(true);
            invalidate();
        }
    }
}
