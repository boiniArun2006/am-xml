package androidx.constraintlayout.helper.widget;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.KeyAttributes;
import androidx.constraintlayout.motion.widget.KeyPosition;
import androidx.constraintlayout.motion.widget.MotionController;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class MotionEffect extends MotionHelper {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f35638E;
    private int M7;
    private int P5;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f35639U;
    private float Xw;
    private int eF;
    private int jB;
    private boolean p5;

    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    public boolean aYN() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0190, code lost:
    
        if (r14 == 0.0f) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a6, code lost:
    
        if (r14 == 0.0f) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b7, code lost:
    
        if (r15 == 0.0f) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f3  */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void fD(MotionLayout motionLayout, HashMap map) {
        KeyAttributes keyAttributes;
        KeyAttributes keyAttributes2;
        KeyAttributes keyAttributes3;
        int i2;
        int i3;
        int i5;
        HashMap map2 = map;
        View[] viewArrTy = ty((ConstraintLayout) getParent());
        if (viewArrTy == null) {
            Log.v("FadeMove", Debug.n() + " views = null");
            return;
        }
        KeyAttributes keyAttributes4 = new KeyAttributes();
        KeyAttributes keyAttributes5 = new KeyAttributes();
        keyAttributes4.qie("alpha", Float.valueOf(this.Xw));
        keyAttributes5.qie("alpha", Float.valueOf(this.Xw));
        keyAttributes4.J2(this.jB);
        keyAttributes5.J2(this.f35639U);
        KeyPosition keyPosition = new KeyPosition();
        keyPosition.J2(this.jB);
        keyPosition.qie(0);
        keyPosition.az("percentX", 0);
        keyPosition.az("percentY", 0);
        KeyPosition keyPosition2 = new KeyPosition();
        keyPosition2.J2(this.f35639U);
        keyPosition2.qie(0);
        int i7 = 1;
        keyPosition2.az("percentX", 1);
        keyPosition2.az("percentY", 1);
        KeyAttributes keyAttributes6 = null;
        if (this.P5 > 0) {
            keyAttributes = new KeyAttributes();
            keyAttributes2 = new KeyAttributes();
            keyAttributes.qie("translationX", Integer.valueOf(this.P5));
            keyAttributes.J2(this.f35639U);
            keyAttributes2.qie("translationX", 0);
            keyAttributes2.J2(this.f35639U - 1);
        } else {
            keyAttributes = null;
            keyAttributes2 = null;
        }
        if (this.M7 > 0) {
            keyAttributes6 = new KeyAttributes();
            keyAttributes3 = new KeyAttributes();
            keyAttributes6.qie("translationY", Integer.valueOf(this.M7));
            keyAttributes6.J2(this.f35639U);
            keyAttributes3.qie("translationY", 0);
            keyAttributes3.J2(this.f35639U - 1);
        } else {
            keyAttributes3 = null;
        }
        int i8 = this.f35638E;
        if (i8 == -1) {
            int[] iArr = new int[4];
            i2 = 3;
            i3 = 2;
            for (View view : viewArrTy) {
                MotionController motionController = (MotionController) map2.get(view);
                if (motionController != null) {
                    float fTy = motionController.ty() - motionController.Z();
                    float fHI = motionController.HI() - motionController.XQ();
                    if (fHI < 0.0f) {
                        iArr[1] = iArr[1] + 1;
                    }
                    if (fHI > 0.0f) {
                        iArr[0] = iArr[0] + 1;
                    }
                    if (fTy > 0.0f) {
                        iArr[3] = iArr[3] + 1;
                    }
                    if (fTy < 0.0f) {
                        iArr[2] = iArr[2] + 1;
                    }
                }
            }
            int i9 = iArr[0];
            int i10 = 0;
            for (int i11 = 4; i7 < i11; i11 = 4) {
                int i12 = iArr[i7];
                if (i9 < i12) {
                    i10 = i7;
                    i9 = i12;
                }
                i7++;
            }
            i8 = i10;
        } else {
            i2 = 3;
            i3 = 2;
        }
        int i13 = 0;
        while (i13 < viewArrTy.length) {
            MotionController motionController2 = (MotionController) map2.get(viewArrTy[i13]);
            if (motionController2 != null) {
                float fTy2 = motionController2.ty() - motionController2.Z();
                float fHI2 = motionController2.HI() - motionController2.XQ();
                if (i8 == 0) {
                    if (fHI2 > 0.0f) {
                        if (this.p5) {
                        }
                    }
                    i5 = this.eF;
                    if (i5 != -1) {
                        motionController2.n(keyAttributes4);
                        motionController2.n(keyAttributes5);
                        motionController2.n(keyPosition);
                        motionController2.n(keyPosition2);
                        if (this.P5 > 0) {
                            motionController2.n(keyAttributes);
                            motionController2.n(keyAttributes2);
                        }
                        if (this.M7 > 0) {
                            motionController2.n(keyAttributes6);
                            motionController2.n(keyAttributes3);
                        }
                    } else {
                        motionLayout.a(i5, motionController2);
                    }
                } else if (i8 == 1) {
                    if (fHI2 < 0.0f) {
                        if (this.p5) {
                        }
                    }
                    i5 = this.eF;
                    if (i5 != -1) {
                    }
                } else if (i8 == i3) {
                    if (fTy2 < 0.0f) {
                        if (this.p5) {
                        }
                    }
                    i5 = this.eF;
                    if (i5 != -1) {
                    }
                } else if (i8 != i2 || fTy2 <= 0.0f || (this.p5 && fHI2 != 0.0f)) {
                    i5 = this.eF;
                    if (i5 != -1) {
                    }
                }
            }
            i13++;
            map2 = map;
            i2 = 3;
            i3 = 2;
        }
    }
}
