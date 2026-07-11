package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class KeyTrigger extends Key {
    private String HI;
    private String Ik;
    int KN;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f35673S;
    float Uo = 0.1f;
    private float ViF;
    private boolean WPU;
    private View XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f35674Z;
    private boolean aYN;
    HashMap az;
    private int ck;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f35675g;
    RectF gh;
    int mUb;
    private float nY;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f35676o;
    RectF qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f35677r;
    private int ty;
    int xMQ;

    private static class Loader {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static SparseIntArray f35678n;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f35678n = sparseIntArray;
            sparseIntArray.append(R.styleable.utY, 8);
            f35678n.append(R.styleable.KWB, 4);
            f35678n.append(R.styleable.Nz, 1);
            f35678n.append(R.styleable.j3I, 2);
            f35678n.append(R.styleable.a9, 7);
            f35678n.append(R.styleable.Oe4, 6);
            f35678n.append(R.styleable.obf, 5);
            f35678n.append(R.styleable.f36052Wc, 9);
            f35678n.append(R.styleable.rmO, 10);
            f35678n.append(R.styleable.UpJ, 11);
            f35678n.append(R.styleable.dSC, 12);
            f35678n.append(R.styleable.f36059bAP, 13);
            f35678n.append(R.styleable.GA, 14);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void n(HashMap map) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void nr(HashSet hashSet) {
    }

    private void az(String str, View view) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            ty(str, view);
            return;
        }
        if (this.az.containsKey(str)) {
            method = (Method) this.az.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = view.getClass().getMethod(str, new Class[0]);
                this.az.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.az.put(str, null);
                Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + Debug.nr(view));
                return;
            }
        }
        try {
            method.invoke(view, new Object[0]);
        } catch (Exception unused2) {
            Log.e("KeyTrigger", "Exception in call \"" + this.HI + "\"on class " + view.getClass().getSimpleName() + " " + Debug.nr(view));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void qie(float f3, View view) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = true;
        boolean z7 = false;
        if (this.f35674Z != Key.J2) {
            if (this.XQ == null) {
                this.XQ = ((ViewGroup) view.getParent()).findViewById(this.f35674Z);
            }
            HI(this.gh, this.XQ, this.f35675g);
            HI(this.qie, view, this.f35675g);
            if (this.gh.intersect(this.qie)) {
                if (this.f35673S) {
                    this.f35673S = false;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.aYN) {
                    this.aYN = false;
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.WPU = true;
            } else {
                if (this.f35673S) {
                    z2 = false;
                } else {
                    this.f35673S = true;
                    z2 = true;
                }
                if (this.WPU) {
                    this.WPU = false;
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.aYN = true;
                z7 = z5;
                z4 = false;
            }
        } else {
            if (this.f35673S) {
                float f4 = this.ViF;
                if ((f3 - f4) * (this.nY - f4) < 0.0f) {
                    this.f35673S = false;
                    z2 = true;
                }
                if (!this.WPU) {
                    float f5 = this.ViF;
                    float f6 = f3 - f5;
                    if ((this.nY - f5) * f6 < 0.0f && f6 < 0.0f) {
                        this.WPU = false;
                        z3 = true;
                    }
                    if (this.aYN) {
                        float f7 = this.ViF;
                        float f8 = f3 - f7;
                        if ((this.nY - f7) * f8 >= 0.0f || f8 <= 0.0f) {
                            z6 = false;
                        } else {
                            this.aYN = false;
                        }
                        z4 = z6;
                    } else {
                        if (Math.abs(f3 - this.ViF) > this.Uo) {
                            this.aYN = true;
                        }
                        z4 = false;
                    }
                    z7 = z3;
                } else if (Math.abs(f3 - this.ViF) > this.Uo) {
                    this.WPU = true;
                }
                z3 = false;
                if (this.aYN) {
                }
                z7 = z3;
            } else if (Math.abs(f3 - this.ViF) > this.Uo) {
                this.f35673S = true;
            }
            z2 = false;
            if (!this.WPU) {
            }
            z3 = false;
            if (this.aYN) {
            }
            z7 = z3;
        }
        this.nY = f3;
        if (z7 || z2 || z4) {
            ((MotionLayout) view.getParent()).ijL(this.f35676o, z4, f3);
        }
        View viewFindViewById = this.ck == Key.J2 ? view : ((MotionLayout) view.getParent()).findViewById(this.ck);
        if (z7) {
            String str = this.Ik;
            if (str != null) {
                az(str, viewFindViewById);
            }
            if (this.KN != Key.J2) {
                ((MotionLayout) view.getParent()).tUK(this.KN, viewFindViewById);
            }
        }
        if (z4) {
            String str2 = this.f35677r;
            if (str2 != null) {
                az(str2, viewFindViewById);
            }
            if (this.xMQ != Key.J2) {
                ((MotionLayout) view.getParent()).tUK(this.xMQ, viewFindViewById);
            }
        }
        if (z2) {
            String str3 = this.HI;
            if (str3 != null) {
                az(str3, viewFindViewById);
            }
            if (this.mUb != Key.J2) {
                ((MotionLayout) view.getParent()).tUK(this.mUb, viewFindViewById);
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* JADX INFO: renamed from: rl */
    public Key clone() {
        return new KeyTrigger().t(this);
    }

    public KeyTrigger() {
        int i2 = Key.J2;
        this.KN = i2;
        this.xMQ = i2;
        this.mUb = i2;
        this.gh = new RectF();
        this.qie = new RectF();
        this.az = new HashMap();
        this.ty = -1;
        this.HI = null;
        int i3 = Key.J2;
        this.ck = i3;
        this.Ik = null;
        this.f35677r = null;
        this.f35676o = i3;
        this.f35674Z = i3;
        this.XQ = null;
        this.f35673S = true;
        this.WPU = true;
        this.aYN = true;
        this.ViF = Float.NaN;
        this.f35675g = false;
        this.nr = 5;
        this.f35651O = new HashMap();
    }

    private void HI(RectF rectF, View view, boolean z2) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z2) {
            view.getMatrix().mapRect(rectF);
        }
    }

    private void ty(String str, View view) {
        boolean z2;
        if (str.length() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f35651O.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z2 || lowerCase.matches(str)) {
                ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.f35651O.get(str2);
                if (constraintAttribute != null) {
                    constraintAttribute.n(view);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key t(Key key) {
        super.t(key);
        KeyTrigger keyTrigger = (KeyTrigger) key;
        this.ty = keyTrigger.ty;
        this.HI = keyTrigger.HI;
        this.ck = keyTrigger.ck;
        this.Ik = keyTrigger.Ik;
        this.f35677r = keyTrigger.f35677r;
        this.f35676o = keyTrigger.f35676o;
        this.f35674Z = keyTrigger.f35674Z;
        this.XQ = keyTrigger.XQ;
        this.Uo = keyTrigger.Uo;
        this.f35673S = keyTrigger.f35673S;
        this.WPU = keyTrigger.WPU;
        this.aYN = keyTrigger.aYN;
        this.ViF = keyTrigger.ViF;
        this.nY = keyTrigger.nY;
        this.f35675g = keyTrigger.f35675g;
        this.gh = keyTrigger.gh;
        this.qie = keyTrigger.qie;
        this.az = keyTrigger.az;
        return this;
    }
}
