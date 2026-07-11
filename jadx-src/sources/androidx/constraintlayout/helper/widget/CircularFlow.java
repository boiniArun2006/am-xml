package androidx.constraintlayout.helper.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class CircularFlow extends VirtualLayout {

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private static float f35607FX;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static int f35608M;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private Integer f35609E;
    private String M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    ConstraintLayout f35610N;
    private int P5;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f35611U;
    private float[] Xw;
    private Float eF;
    private int[] jB;
    private String p5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f35612v;

    private void ViF(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.f35894O == null || (fArr = this.Xw) == null) {
            return;
        }
        if (this.P5 + 1 > fArr.length) {
            this.Xw = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.Xw[this.P5] = Integer.parseInt(str);
        this.P5++;
    }

    private void nY(String str) {
        int[] iArr;
        if (str == null || str.length() == 0 || this.f35894O == null || (iArr = this.jB) == null) {
            return;
        }
        if (this.f35611U + 1 > iArr.length) {
            this.jB = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.jB[this.f35611U] = (int) (Integer.parseInt(str) * this.f35894O.getResources().getDisplayMetrics().density);
        this.f35611U++;
    }

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.P5 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i2);
            if (iIndexOf == -1) {
                ViF(str.substring(i2).trim());
                return;
            } else {
                ViF(str.substring(i2, iIndexOf).trim());
                i2 = iIndexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f35611U = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i2);
            if (iIndexOf == -1) {
                nY(str.substring(i2).trim());
                return;
            } else {
                nY(str.substring(i2, iIndexOf).trim());
                i2 = iIndexOf + 1;
            }
        }
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.Xw, this.P5);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.jB, this.f35611U);
    }

    public void setDefaultAngle(float f3) {
        f35607FX = f3;
    }

    public void setDefaultRadius(int i2) {
        f35608M = i2;
    }

    private void g() {
        this.f35610N = (ConstraintLayout) getParent();
        for (int i2 = 0; i2 < this.f35900t; i2++) {
            View viewIk = this.f35610N.Ik(this.f35897n[i2]);
            if (viewIk != null) {
                int i3 = f35608M;
                float f3 = f35607FX;
                int[] iArr = this.jB;
                if (iArr != null && i2 < iArr.length) {
                    i3 = iArr[i2];
                } else {
                    Integer num = this.f35609E;
                    if (num != null && num.intValue() != -1) {
                        this.f35611U++;
                        if (this.jB == null) {
                            this.jB = new int[1];
                        }
                        int[] radius = getRadius();
                        this.jB = radius;
                        radius[this.f35611U - 1] = i3;
                    } else {
                        Log.e("CircularFlow", "Added radius to view with id: " + ((String) this.E2.get(Integer.valueOf(viewIk.getId()))));
                    }
                }
                float[] fArr = this.Xw;
                if (fArr != null && i2 < fArr.length) {
                    f3 = fArr[i2];
                } else {
                    Float f4 = this.eF;
                    if (f4 != null && f4.floatValue() != -1.0f) {
                        this.P5++;
                        if (this.Xw == null) {
                            this.Xw = new float[1];
                        }
                        float[] angles = getAngles();
                        this.Xw = angles;
                        angles[this.P5 - 1] = f3;
                    } else {
                        Log.e("CircularFlow", "Added angle to view with id: " + ((String) this.E2.get(Integer.valueOf(viewIk.getId()))));
                    }
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewIk.getLayoutParams();
                layoutParams.f35945r = f3;
                layoutParams.ck = this.f35612v;
                layoutParams.Ik = i3;
                viewIk.setLayoutParams(layoutParams);
            }
        }
        KN();
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void HI(AttributeSet attributeSet) {
        super.HI(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.tFV);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.vl) {
                    this.f35612v = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                } else if (index == R.styleable.Vvq) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.M7 = string;
                    setAngles(string);
                } else if (index == R.styleable.nO) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.p5 = string2;
                    setRadius(string2);
                } else if (index == R.styleable.f36091y) {
                    Float fValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, f35607FX));
                    this.eF = fValueOf;
                    setDefaultAngle(fValueOf.floatValue());
                } else if (index == R.styleable.Zn) {
                    Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, f35608M));
                    this.f35609E = numValueOf;
                    setDefaultRadius(numValueOf.intValue());
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.M7;
        if (str != null) {
            this.Xw = new float[1];
            setAngles(str);
        }
        String str2 = this.p5;
        if (str2 != null) {
            this.jB = new int[1];
            setRadius(str2);
        }
        Float f3 = this.eF;
        if (f3 != null) {
            setDefaultAngle(f3.floatValue());
        }
        Integer num = this.f35609E;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        g();
    }
}
