package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.StateSet;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class MotionScene {
    private MotionLayout.MotionTracker HI;
    final ViewTransitionController Ik;
    private Transition J2;
    private SparseArray KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private ArrayList f35771O;
    private ArrayList Uo;
    private boolean az;
    private boolean ck;
    private int gh;
    private int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MotionLayout f35772n;
    private boolean nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f35773o;
    private MotionEvent qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    float f35774r;
    StateSet rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Transition f35775t;
    private boolean ty;
    private SparseIntArray xMQ;

    public static class Transition {
        private boolean HI;
        private int Ik;
        private String J2;
        private int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f35777O;
        private int Uo;
        private ArrayList az;
        private int ck;
        private ArrayList gh;
        private final MotionScene mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f35778n;
        private int nr;
        private TouchResponse qie;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f35779r;
        private boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f35780t;
        private int ty;
        private float xMQ;

        public static class TransitionOnClick implements View.OnClickListener {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            int f35781O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Transition f35782n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f35783t;

            public void n(MotionLayout motionLayout, int i2, Transition transition) {
                int i3 = this.f35783t;
                View viewFindViewById = motionLayout;
                if (i3 != -1) {
                    viewFindViewById = motionLayout.findViewById(i3);
                }
                if (viewFindViewById == null) {
                    Log.e("MotionScene", "OnClick could not find id " + this.f35783t);
                    return;
                }
                int i5 = transition.nr;
                int i7 = transition.f35780t;
                if (i5 == -1) {
                    viewFindViewById.setOnClickListener(this);
                    return;
                }
                int i8 = this.f35781O;
                boolean z2 = false;
                boolean z3 = ((i8 & 1) != 0 && i2 == i5) | ((i8 & 1) != 0 && i2 == i5) | ((i8 & 256) != 0 && i2 == i5) | ((i8 & 16) != 0 && i2 == i7);
                if ((i8 & 4096) != 0 && i2 == i7) {
                    z2 = true;
                }
                if (z3 || z2) {
                    viewFindViewById.setOnClickListener(this);
                }
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MotionLayout motionLayout = this.f35782n.mUb.f35772n;
                if (motionLayout.Mx()) {
                    if (this.f35782n.nr == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.EWS(this.f35782n.f35780t);
                            return;
                        }
                        Transition transition = new Transition(this.f35782n.mUb, this.f35782n);
                        transition.nr = currentState;
                        transition.f35780t = this.f35782n.f35780t;
                        motionLayout.setTransition(transition);
                        motionLayout.HV();
                        return;
                    }
                    Transition transition2 = this.f35782n.mUb.f35775t;
                    int i2 = this.f35781O;
                    boolean z2 = false;
                    boolean z3 = ((i2 & 1) == 0 && (i2 & 256) == 0) ? false : true;
                    boolean z4 = ((i2 & 16) == 0 && (i2 & 4096) == 0) ? false : true;
                    if (z3 && z4) {
                        Transition transition3 = this.f35782n.mUb.f35775t;
                        Transition transition4 = this.f35782n;
                        if (transition3 != transition4) {
                            motionLayout.setTransition(transition4);
                        }
                        if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                            z4 = false;
                            z2 = z3;
                        }
                    } else {
                        z2 = z3;
                    }
                    if (rl(transition2, motionLayout)) {
                        if (z2 && (this.f35781O & 1) != 0) {
                            motionLayout.setTransition(this.f35782n);
                            motionLayout.HV();
                            return;
                        }
                        if (z4 && (this.f35781O & 16) != 0) {
                            motionLayout.setTransition(this.f35782n);
                            motionLayout.Po6();
                        } else if (z2 && (this.f35781O & 256) != 0) {
                            motionLayout.setTransition(this.f35782n);
                            motionLayout.setProgress(1.0f);
                        } else {
                            if (!z4 || (this.f35781O & 4096) == 0) {
                                return;
                            }
                            motionLayout.setTransition(this.f35782n);
                            motionLayout.setProgress(0.0f);
                        }
                    }
                }
            }

            boolean rl(Transition transition, MotionLayout motionLayout) {
                Transition transition2 = this.f35782n;
                if (transition2 == transition) {
                    return true;
                }
                int i2 = transition2.f35780t;
                int i3 = this.f35782n.nr;
                if (i3 == -1) {
                    return motionLayout.dR0 != i2;
                }
                int i5 = motionLayout.dR0;
                return i5 == i3 || i5 == i2;
            }

            public void t(MotionLayout motionLayout) {
                int i2 = this.f35783t;
                if (i2 == -1) {
                    return;
                }
                View viewFindViewById = motionLayout.findViewById(i2);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                Log.e("MotionScene", " (*)  could not find id " + this.f35783t);
            }
        }

        Transition(MotionScene motionScene, Transition transition) {
            this.f35778n = -1;
            this.rl = false;
            this.f35780t = -1;
            this.nr = -1;
            this.f35777O = 0;
            this.J2 = null;
            this.Uo = -1;
            this.KN = Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE;
            this.xMQ = 0.0f;
            this.gh = new ArrayList();
            this.qie = null;
            this.az = new ArrayList();
            this.ty = 0;
            this.HI = false;
            this.ck = -1;
            this.Ik = 0;
            this.f35779r = 0;
            this.mUb = motionScene;
            this.KN = motionScene.mUb;
            if (transition != null) {
                this.ck = transition.ck;
                this.f35777O = transition.f35777O;
                this.J2 = transition.J2;
                this.Uo = transition.Uo;
                this.KN = transition.KN;
                this.gh = transition.gh;
                this.xMQ = transition.xMQ;
                this.Ik = transition.Ik;
            }
        }

        public int S() {
            return this.nr;
        }

        public boolean ViF(int i2) {
            return (i2 & this.f35779r) != 0;
        }

        public TouchResponse WPU() {
            return this.qie;
        }

        public int XQ() {
            return this.Ik;
        }

        public int Z() {
            return this.f35780t;
        }

        public boolean aYN() {
            return !this.HI;
        }

        public void fD(int i2) {
            this.ck = i2;
        }

        public void g(boolean z2) {
            this.HI = !z2;
        }

        public void nY(int i2) {
            this.KN = Math.max(i2, 8);
        }

        public int o() {
            return this.ty;
        }

        public void r(KeyFrames keyFrames) {
            this.gh.add(keyFrames);
        }

        public void te(int i2, String str, int i3) {
            this.f35777O = i2;
            this.J2 = str;
            this.Uo = i3;
        }

        public void iF(int i2) {
            TouchResponse touchResponseWPU = WPU();
            if (touchResponseWPU != null) {
                touchResponseWPU.WPU(i2);
            }
        }

        public Transition(int i2, MotionScene motionScene, int i3, int i5) {
            this.f35778n = -1;
            this.rl = false;
            this.f35780t = -1;
            this.nr = -1;
            this.f35777O = 0;
            this.J2 = null;
            this.Uo = -1;
            this.KN = Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE;
            this.xMQ = 0.0f;
            this.gh = new ArrayList();
            this.qie = null;
            this.az = new ArrayList();
            this.ty = 0;
            this.HI = false;
            this.ck = -1;
            this.Ik = 0;
            this.f35779r = 0;
            this.f35778n = i2;
            this.mUb = motionScene;
            this.nr = i3;
            this.f35780t = i5;
            this.KN = motionScene.mUb;
            this.Ik = motionScene.gh;
        }
    }

    ConstraintSet mUb(int i2) {
        return gh(i2, -1, -1);
    }

    void wTp(MotionLayout motionLayout) {
        for (int i2 = 0; i2 < this.KN.size(); i2++) {
            int iKeyAt = this.KN.keyAt(i2);
            if (e(iKeyAt)) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            }
            s7N(iKeyAt, motionLayout);
        }
    }

    private int S(int i2) {
        int iRl;
        StateSet stateSet = this.rl;
        return (stateSet == null || (iRl = stateSet.rl(i2, -1, -1)) == -1) ? i2 : iRl;
    }

    private boolean X() {
        return this.HI != null;
    }

    private boolean e(int i2) {
        int i3 = this.xMQ.get(i2);
        int size = this.xMQ.size();
        while (i3 > 0) {
            if (i3 == i2) {
                return true;
            }
            int i5 = size - 1;
            if (size < 0) {
                return true;
            }
            i3 = this.xMQ.get(i3);
            size = i5;
        }
        return false;
    }

    private void s7N(int i2, MotionLayout motionLayout) {
        ConstraintSet constraintSet = (ConstraintSet) this.KN.get(i2);
        constraintSet.rl = constraintSet.f35963n;
        int i3 = this.xMQ.get(i2);
        if (i3 > 0) {
            s7N(i3, motionLayout);
            ConstraintSet constraintSet2 = (ConstraintSet) this.KN.get(i3);
            if (constraintSet2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + Debug.t(this.f35772n.getContext(), i3));
                return;
            }
            constraintSet.rl += "/" + constraintSet2.rl;
            constraintSet.nHg(constraintSet2);
        } else {
            constraintSet.rl += "  layout";
            constraintSet.N(motionLayout);
        }
        constraintSet.KN(constraintSet);
    }

    int HI() {
        Transition transition = this.f35775t;
        if (transition == null) {
            return -1;
        }
        return transition.f35780t;
    }

    public void Ik(MotionController motionController) {
        Transition transition = this.f35775t;
        if (transition != null) {
            Iterator it = transition.gh.iterator();
            while (it.hasNext()) {
                ((KeyFrames) it.next()).rl(motionController);
            }
        } else {
            Transition transition2 = this.J2;
            if (transition2 != null) {
                Iterator it2 = transition2.gh.iterator();
                while (it2.hasNext()) {
                    ((KeyFrames) it2.next()).rl(motionController);
                }
            }
        }
    }

    public int KN() {
        Transition transition = this.f35775t;
        if (transition != null) {
            return transition.ck;
        }
        return -1;
    }

    public void M7(int i2, View... viewArr) {
        this.Ik.Uo(i2, viewArr);
    }

    void N(float f3, float f4) {
        Transition transition = this.f35775t;
        if (transition == null || transition.qie == null) {
            return;
        }
        this.f35775t.qie.Z(f3, f4);
    }

    public boolean O(int i2, MotionController motionController) {
        return this.Ik.t(i2, motionController);
    }

    boolean P5() {
        Iterator it = this.f35771O.iterator();
        while (it.hasNext()) {
            if (((Transition) it.next()).qie != null) {
                return true;
            }
        }
        Transition transition = this.f35775t;
        return (transition == null || transition.qie == null) ? false : true;
    }

    void T(float f3, float f4) {
        Transition transition = this.f35775t;
        if (transition == null || transition.qie == null) {
            return;
        }
        this.f35775t.qie.o(f3, f4);
    }

    void U() {
        Transition transition = this.f35775t;
        if (transition == null || transition.qie == null) {
            return;
        }
        this.f35775t.qie.ViF();
    }

    public Transition Uo(int i2, float f3, float f4, MotionEvent motionEvent) {
        if (i2 == -1) {
            return this.f35775t;
        }
        List<Transition> listE2 = E2(i2);
        RectF rectF = new RectF();
        float f5 = 0.0f;
        Transition transition = null;
        for (Transition transition2 : listE2) {
            if (!transition2.HI && transition2.qie != null) {
                transition2.qie.S(this.ck);
                RectF rectFTy = transition2.qie.ty(this.f35772n, rectF);
                if (rectFTy == null || motionEvent == null || rectFTy.contains(motionEvent.getX(), motionEvent.getY())) {
                    RectF rectFNr = transition2.qie.nr(this.f35772n, rectF);
                    if (rectFNr == null || motionEvent == null || rectFNr.contains(motionEvent.getX(), motionEvent.getY())) {
                        float fN = transition2.qie.n(f3, f4);
                        if (transition2.qie.qie && motionEvent != null) {
                            fN = ((float) (Math.atan2(f4 + r10, f3 + r9) - Math.atan2(motionEvent.getX() - transition2.qie.xMQ, motionEvent.getY() - transition2.qie.mUb))) * 10.0f;
                        }
                        float f6 = fN * (transition2.f35780t == i2 ? -1.0f : 1.1f);
                        if (f6 > f5) {
                            transition = transition2;
                            f5 = f6;
                        }
                    }
                }
            }
        }
        return transition;
    }

    float ViF() {
        Transition transition = this.f35775t;
        if (transition == null || transition.qie == null) {
            return 0.0f;
        }
        return this.f35775t.qie.gh();
    }

    int WPU() {
        Transition transition = this.f35775t;
        if (transition == null || transition.qie == null) {
            return 0;
        }
        return this.f35775t.qie.xMQ();
    }

    float XQ(float f3, float f4) {
        Transition transition = this.f35775t;
        if (transition == null || transition.qie == null) {
            return 0.0f;
        }
        return this.f35775t.qie.KN(f3, f4);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void Xw(int i2, int i3) {
        int iRl;
        int iRl2;
        Transition transition;
        StateSet stateSet = this.rl;
        if (stateSet != null) {
            iRl = stateSet.rl(i2, -1, -1);
            if (iRl == -1) {
                iRl = i2;
            }
            iRl2 = this.rl.rl(i3, -1, -1);
            if (iRl2 == -1) {
            }
            transition = this.f35775t;
            if (transition == null && transition.f35780t == i3 && this.f35775t.nr == i2) {
                return;
            }
            for (Transition transition2 : this.f35771O) {
                if ((transition2.f35780t == iRl2 && transition2.nr == iRl) || (transition2.f35780t == i3 && transition2.nr == i2)) {
                    this.f35775t = transition2;
                    if (transition2 == null || transition2.qie == null) {
                        return;
                    }
                    this.f35775t.qie.S(this.ck);
                    return;
                }
            }
            Transition transition3 = this.J2;
            for (Transition transition4 : this.Uo) {
                if (transition4.f35780t == i3) {
                    transition3 = transition4;
                }
            }
            Transition transition5 = new Transition(this, transition3);
            transition5.nr = iRl;
            transition5.f35780t = iRl2;
            if (iRl != -1) {
                this.f35771O.add(transition5);
            }
            this.f35775t = transition5;
        }
        iRl = i2;
        iRl2 = i3;
        transition = this.f35775t;
        if (transition == null) {
        }
        while (r3.hasNext()) {
        }
        Transition transition32 = this.J2;
        while (r3.hasNext()) {
        }
        Transition transition52 = new Transition(this, transition32);
        transition52.nr = iRl;
        transition52.f35780t = iRl2;
        if (iRl != -1) {
        }
        this.f35775t = transition52;
    }

    boolean Z() {
        Transition transition = this.f35775t;
        if (transition == null || transition.qie == null) {
            return false;
        }
        return this.f35775t.qie.Uo();
    }

    float aYN() {
        Transition transition = this.f35775t;
        if (transition == null || transition.qie == null) {
            return 0.0f;
        }
        return this.f35775t.qie.mUb();
    }

    public ArrayList az() {
        return this.f35771O;
    }

    public void bzg(boolean z2) {
        this.ck = z2;
        Transition transition = this.f35775t;
        if (transition == null || transition.qie == null) {
            return;
        }
        this.f35775t.qie.S(this.ck);
    }

    public Interpolator ck() {
        int i2 = this.f35775t.f35777O;
        if (i2 == -2) {
            return AnimationUtils.loadInterpolator(this.f35772n.getContext(), this.f35775t.Uo);
        }
        if (i2 == -1) {
            final Easing easingT = Easing.t(this.f35775t.J2);
            return new Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionScene.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f3) {
                    return (float) easingT.n(f3);
                }
            };
        }
        if (i2 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i2 == 1) {
            return new AccelerateInterpolator();
        }
        if (i2 == 2) {
            return new DecelerateInterpolator();
        }
        if (i2 == 4) {
            return new BounceInterpolator();
        }
        if (i2 == 5) {
            return new OvershootInterpolator();
        }
        if (i2 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public Transition fD(int i2) {
        for (Transition transition : this.f35771O) {
            if (transition.f35778n == i2) {
                return transition;
            }
        }
        return null;
    }

    float g() {
        Transition transition = this.f35775t;
        if (transition == null || transition.qie == null) {
            return 0.0f;
        }
        return this.f35775t.qie.az();
    }

    ConstraintSet gh(int i2, int i3, int i5) {
        int iRl;
        StateSet stateSet = this.rl;
        if (stateSet != null && (iRl = stateSet.rl(i2, i3, i5)) != -1) {
            i2 = iRl;
        }
        if (this.KN.get(i2) != null) {
            return (ConstraintSet) this.KN.get(i2);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + Debug.t(this.f35772n.getContext(), i2) + " In MotionScene");
        SparseArray sparseArray = this.KN;
        return (ConstraintSet) sparseArray.get(sparseArray.keyAt(0));
    }

    int iF() {
        Transition transition = this.f35775t;
        if (transition == null) {
            return -1;
        }
        return transition.nr;
    }

    public void jB(Transition transition) {
        this.f35775t = transition;
        if (transition == null || transition.qie == null) {
            return;
        }
        this.f35775t.qie.S(this.ck);
    }

    void nHg(MotionEvent motionEvent, int i2, MotionLayout motionLayout) {
        MotionLayout.MotionTracker motionTracker;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.HI == null) {
            this.HI = this.f35772n.G7();
        }
        this.HI.n(motionEvent);
        if (i2 != -1) {
            int action = motionEvent.getAction();
            boolean z2 = false;
            if (action == 0) {
                this.f35774r = motionEvent.getRawX();
                this.f35773o = motionEvent.getRawY();
                this.qie = motionEvent;
                this.az = false;
                if (this.f35775t.qie != null) {
                    RectF rectFNr = this.f35775t.qie.nr(this.f35772n, rectF);
                    if (rectFNr != null && !rectFNr.contains(this.qie.getX(), this.qie.getY())) {
                        this.qie = null;
                        this.az = true;
                        return;
                    }
                    RectF rectFTy = this.f35775t.qie.ty(this.f35772n, rectF);
                    if (rectFTy == null || rectFTy.contains(this.qie.getX(), this.qie.getY())) {
                        this.ty = false;
                    } else {
                        this.ty = true;
                    }
                    this.f35775t.qie.XQ(this.f35774r, this.f35773o);
                    return;
                }
                return;
            }
            if (action == 2 && !this.az) {
                float rawY = motionEvent.getRawY() - this.f35773o;
                float rawX = motionEvent.getRawX() - this.f35774r;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.qie) == null) {
                    return;
                }
                Transition transitionUo = Uo(i2, rawX, rawY, motionEvent2);
                if (transitionUo != null) {
                    motionLayout.setTransition(transitionUo);
                    RectF rectFTy2 = this.f35775t.qie.ty(this.f35772n, rectF);
                    if (rectFTy2 != null && !rectFTy2.contains(this.qie.getX(), this.qie.getY())) {
                        z2 = true;
                    }
                    this.ty = z2;
                    this.f35775t.qie.aYN(this.f35774r, this.f35773o);
                }
            }
        }
        if (this.az) {
            return;
        }
        Transition transition = this.f35775t;
        if (transition != null && transition.qie != null && !this.ty) {
            this.f35775t.qie.Ik(motionEvent, this.HI, i2, this);
        }
        this.f35774r = motionEvent.getRawX();
        this.f35773o = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (motionTracker = this.HI) == null) {
            return;
        }
        motionTracker.nr();
        this.HI = null;
        int i3 = motionLayout.dR0;
        if (i3 != -1) {
            J2(motionLayout, i3);
        }
    }

    float nY() {
        Transition transition = this.f35775t;
        if (transition == null || transition.qie == null) {
            return 0.0f;
        }
        return this.f35775t.qie.qie();
    }

    public void nr(MotionLayout motionLayout, int i2) {
        for (Transition transition : this.f35771O) {
            if (transition.az.size() > 0) {
                Iterator it = transition.az.iterator();
                while (it.hasNext()) {
                    ((Transition.TransitionOnClick) it.next()).t(motionLayout);
                }
            }
        }
        for (Transition transition2 : this.Uo) {
            if (transition2.az.size() > 0) {
                Iterator it2 = transition2.az.iterator();
                while (it2.hasNext()) {
                    ((Transition.TransitionOnClick) it2.next()).t(motionLayout);
                }
            }
        }
        for (Transition transition3 : this.f35771O) {
            if (transition3.az.size() > 0) {
                Iterator it3 = transition3.az.iterator();
                while (it3.hasNext()) {
                    ((Transition.TransitionOnClick) it3.next()).n(motionLayout, i2, transition3);
                }
            }
        }
        for (Transition transition4 : this.Uo) {
            if (transition4.az.size() > 0) {
                Iterator it4 = transition4.az.iterator();
                while (it4.hasNext()) {
                    ((Transition.TransitionOnClick) it4.next()).n(motionLayout, i2, transition4);
                }
            }
        }
    }

    float o() {
        Transition transition = this.f35775t;
        if (transition == null || transition.qie == null) {
            return 0.0f;
        }
        return this.f35775t.qie.J2();
    }

    public int[] qie() {
        int size = this.KN.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.KN.keyAt(i2);
        }
        return iArr;
    }

    float r() {
        Transition transition = this.f35775t;
        if (transition == null || transition.qie == null) {
            return 0.0f;
        }
        return this.f35775t.qie.O();
    }

    public void rV9(int i2) {
        Transition transition = this.f35775t;
        if (transition != null) {
            transition.nY(i2);
        } else {
            this.mUb = i2;
        }
    }

    public float te() {
        Transition transition = this.f35775t;
        if (transition != null) {
            return transition.xMQ;
        }
        return 0.0f;
    }

    public int ty() {
        Transition transition = this.f35775t;
        return transition != null ? transition.KN : this.mUb;
    }

    public void v(int i2, ConstraintSet constraintSet) {
        this.KN.put(i2, constraintSet);
    }

    int xMQ() {
        Transition transition = this.f35775t;
        if (transition == null || transition.qie == null) {
            return 0;
        }
        return this.f35775t.qie.rl();
    }

    public List E2(int i2) {
        int iS = S(i2);
        ArrayList arrayList = new ArrayList();
        for (Transition transition : this.f35771O) {
            if (transition.nr == iS || transition.f35780t == iS) {
                arrayList.add(transition);
            }
        }
        return arrayList;
    }

    boolean J2(MotionLayout motionLayout, int i2) {
        Transition transition;
        if (X() || this.nr) {
            return false;
        }
        for (Transition transition2 : this.f35771O) {
            if (transition2.ty != 0 && ((transition = this.f35775t) != transition2 || !transition.ViF(2))) {
                if (i2 == transition2.nr && (transition2.ty == 4 || transition2.ty == 2)) {
                    MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(transition2);
                    if (transition2.ty == 4) {
                        motionLayout.HV();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.Y(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState);
                        motionLayout.fcU();
                    }
                    return true;
                }
                if (i2 == transition2.f35780t && (transition2.ty == 3 || transition2.ty == 1)) {
                    MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState2);
                    motionLayout.setTransition(transition2);
                    if (transition2.ty == 3) {
                        motionLayout.Po6();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.Y(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState2);
                        motionLayout.fcU();
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
