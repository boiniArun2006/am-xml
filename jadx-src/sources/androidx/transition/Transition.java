package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.core.util.Consumer;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.transition.Transition;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Transition implements Cloneable {
    private ArrayList M7;
    TransitionPropagation Nxk;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private EpicenterCallback f42222Y;
    private TransitionListener[] eF;
    long ijL;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayMap f42227k;
    private ArrayList p5;
    SeekController piY;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    long f42233z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Animator[] f42207m = new Animator[0];
    private static final int[] eTf = {2, 1, 3, 4};
    private static final PathMotion xg = new PathMotion() { // from class: androidx.transition.Transition.1
        @Override // androidx.transition.PathMotion
        public Path n(float f3, float f4, float f5, float f6) {
            Path path = new Path();
            path.moveTo(f3, f4);
            path.lineTo(f5, f6);
            return path;
        }
    };
    private static ThreadLocal pJg = new ThreadLocal();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42228n = getClass().getName();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f42231t = -1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    long f42217O = -1;
    private TimeInterpolator J2 = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ArrayList f42230r = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ArrayList f42229o = new ArrayList();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private ArrayList f42223Z = null;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private ArrayList f42218S = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f42226g = null;
    private ArrayList E2 = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f42225e = null;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private ArrayList f42221X = null;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private ArrayList f42219T = null;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private ArrayList f42216N = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ArrayList f42232v = null;
    private TransitionValuesMaps Xw = new TransitionValuesMaps();
    private TransitionValuesMaps jB = new TransitionValuesMaps();

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    TransitionSet f42220U = null;
    private int[] P5 = eTf;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    boolean f42210E = false;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    ArrayList f42215M = new ArrayList();

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private Animator[] f42211FX = f42207m;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    int f42208B = 0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f42214J = false;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    boolean f42209D = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Transition f42224a = null;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private ArrayList f42213I = null;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    ArrayList f42212GR = new ArrayList();
    private PathMotion dR0 = xg;

    private static class ArrayListManager {
    }

    public static abstract class EpicenterCallback {
        public abstract Rect n(Transition transition);
    }

    @RequiresApi
    private static class Impl26 {
        @DoNotInline
        static void rl(Animator animator, long j2) {
            ((AnimatorSet) animator).setCurrentPlayTime(j2);
        }

        @DoNotInline
        static long n(Animator animator) {
            return animator.getTotalDuration();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface MatchOrder {
    }

    @RequiresApi
    class SeekController extends TransitionListenerAdapter implements TransitionSeekController, DynamicAnimation.OnAnimationUpdateListener {
        private SpringAnimation J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private boolean f42239O;
        private boolean nr;
        private Runnable xMQ;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f42240n = -1;
        private ArrayList rl = null;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private ArrayList f42241t = null;
        private Consumer[] Uo = null;
        private final VelocityTracker1D KN = new VelocityTracker1D();

        public void Ik() {
            this.nr = true;
            ArrayList arrayList = this.rl;
            if (arrayList != null) {
                this.rl = null;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((Consumer) arrayList.get(i2)).accept(this);
                }
            }
            ty();
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void gh(Transition transition) {
            this.f42239O = true;
        }

        SeekController() {
        }

        private void HI() {
            if (this.J2 != null) {
                return;
            }
            this.KN.n(AnimationUtils.currentAnimationTimeMillis(), this.f42240n);
            this.J2 = new SpringAnimation(new FloatValueHolder());
            SpringForce springForce = new SpringForce();
            springForce.nr(1.0f);
            springForce.J2(200.0f);
            this.J2.WPU(springForce);
            this.J2.az(this.f42240n);
            this.J2.t(this);
            this.J2.ty(this.KN.rl());
            this.J2.xMQ(rl() + 1);
            this.J2.mUb(-1.0f);
            this.J2.gh(4.0f);
            this.J2.rl(new DynamicAnimation.OnAnimationEndListener() { // from class: androidx.transition.w6
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
                public final void n(DynamicAnimation dynamicAnimation, boolean z2, float f3, float f4) {
                    Transition.SeekController.az(this.f42288n, dynamicAnimation, z2, f3, f4);
                }
            });
        }

        public static /* synthetic */ void az(SeekController seekController, DynamicAnimation dynamicAnimation, boolean z2, float f3, float f4) {
            if (z2) {
                seekController.getClass();
                return;
            }
            if (f3 >= 1.0f) {
                Transition.this.M(TransitionNotification.rl, false);
                return;
            }
            long jRl = seekController.rl();
            Transition transitionG7 = ((TransitionSet) Transition.this).G7(0);
            Transition transition = transitionG7.f42224a;
            transitionG7.f42224a = null;
            Transition.this.Y(-1L, seekController.f42240n);
            Transition.this.Y(jRl, -1L);
            seekController.f42240n = jRl;
            Runnable runnable = seekController.xMQ;
            if (runnable != null) {
                runnable.run();
            }
            Transition.this.f42212GR.clear();
            if (transition != null) {
                transition.M(TransitionNotification.rl, true);
            }
        }

        private void ty() {
            ArrayList arrayList = this.f42241t;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            int size = this.f42241t.size();
            if (this.Uo == null) {
                this.Uo = new Consumer[size];
            }
            Consumer[] consumerArr = (Consumer[]) this.f42241t.toArray(this.Uo);
            this.Uo = null;
            for (int i2 = 0; i2 < size; i2++) {
                consumerArr[i2].accept(this);
                consumerArr[i2] = null;
            }
            this.Uo = consumerArr;
        }

        @Override // androidx.transition.TransitionSeekController
        public void Uo(long j2) {
            if (this.J2 != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            if (j2 == this.f42240n || !isReady()) {
                return;
            }
            if (!this.f42239O) {
                if (j2 != 0 || this.f42240n <= 0) {
                    long jRl = rl();
                    if (j2 == jRl && this.f42240n < jRl) {
                        j2 = 1 + jRl;
                    }
                } else {
                    j2 = -1;
                }
                long j3 = this.f42240n;
                if (j2 != j3) {
                    Transition.this.Y(j2, j3);
                    this.f42240n = j2;
                }
            }
            ty();
            this.KN.n(AnimationUtils.currentAnimationTimeMillis(), j2);
        }

        @Override // androidx.transition.TransitionSeekController
        public boolean isReady() {
            return this.nr;
        }

        @Override // androidx.transition.TransitionSeekController
        public void mUb(Runnable runnable) {
            this.xMQ = runnable;
            HI();
            this.J2.o(0.0f);
        }

        @Override // androidx.transition.TransitionSeekController
        public long rl() {
            return Transition.this.N();
        }

        void ck() {
            long j2 = 0;
            if (rl() == 0) {
                j2 = 1;
            }
            Transition.this.Y(j2, this.f42240n);
            this.f42240n = j2;
        }

        @Override // androidx.transition.TransitionSeekController
        public void n() {
            HI();
            this.J2.o(rl() + 1);
        }

        @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
        public void t(DynamicAnimation dynamicAnimation, float f3, float f4) {
            long jMax = Math.max(-1L, Math.min(rl() + 1, Math.round(f3)));
            Transition.this.Y(jMax, this.f42240n);
            this.f42240n = jMax;
            ty();
        }
    }

    private void O(ArrayMap arrayMap, ArrayMap arrayMap2) {
        for (int i2 = 0; i2 < arrayMap.getSize(); i2++) {
            TransitionValues transitionValues = (TransitionValues) arrayMap.az(i2);
            if (bzg(transitionValues.rl)) {
                this.M7.add(transitionValues);
                this.p5.add(null);
            }
        }
        for (int i3 = 0; i3 < arrayMap2.getSize(); i3++) {
            TransitionValues transitionValues2 = (TransitionValues) arrayMap2.az(i3);
            if (bzg(transitionValues2.rl)) {
                this.p5.add(transitionValues2);
                this.M7.add(null);
            }
        }
    }

    public Animator ck(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    public String[] nHg() {
        return null;
    }

    public abstract void qie(TransitionValues transitionValues);

    public boolean rV9(TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues != null && transitionValues2 != null) {
            String[] strArrNHg = nHg();
            if (strArrNHg != null) {
                for (String str : strArrNHg) {
                    if (Xw(transitionValues, transitionValues2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = transitionValues.f42259n.keySet().iterator();
                while (it.hasNext()) {
                    if (Xw(transitionValues, transitionValues2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean v() {
        return false;
    }

    public abstract void xMQ(TransitionValues transitionValues);

    private static class AnimationInfo {
        Animator J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Transition f42236O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        View f42237n;
        WindowId nr;
        String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        TransitionValues f42238t;

        AnimationInfo(View view, String str, Transition transition, WindowId windowId, TransitionValues transitionValues, Animator animator) {
            this.f42237n = view;
            this.rl = str;
            this.f42238t = transitionValues;
            this.nr = windowId;
            this.f42236O = transition;
            this.J2 = animator;
        }
    }

    public interface TransitionListener {
        void J2(Transition transition);

        void O(Transition transition);

        void gh(Transition transition);

        void nr(Transition transition);

        void xMQ(Transition transition);

        default void KN(Transition transition, boolean z2) {
            xMQ(transition);
        }

        default void qie(Transition transition, boolean z2) {
            O(transition);
        }
    }

    interface TransitionNotification {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final TransitionNotification f42243n = new TransitionNotification() { // from class: androidx.transition.Ml
            @Override // androidx.transition.Transition.TransitionNotification
            public final void rl(Transition.TransitionListener transitionListener, Transition transition, boolean z2) {
                transitionListener.qie(transition, z2);
            }
        };
        public static final TransitionNotification rl = new TransitionNotification() { // from class: androidx.transition.I28
            @Override // androidx.transition.Transition.TransitionNotification
            public final void rl(Transition.TransitionListener transitionListener, Transition transition, boolean z2) {
                transitionListener.KN(transition, z2);
            }
        };

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final TransitionNotification f42244t = new TransitionNotification() { // from class: androidx.transition.Wre
            @Override // androidx.transition.Transition.TransitionNotification
            public final void rl(Transition.TransitionListener transitionListener, Transition transition, boolean z2) {
                transitionListener.gh(transition);
            }
        };
        public static final TransitionNotification nr = new TransitionNotification() { // from class: androidx.transition.CN3
            @Override // androidx.transition.Transition.TransitionNotification
            public final void rl(Transition.TransitionListener transitionListener, Transition transition, boolean z2) {
                transitionListener.J2(transition);
            }
        };

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final TransitionNotification f42242O = new TransitionNotification() { // from class: androidx.transition.fuX
            @Override // androidx.transition.Transition.TransitionNotification
            public final void rl(Transition.TransitionListener transitionListener, Transition transition, boolean z2) {
                transitionListener.nr(transition);
            }
        };

        void rl(TransitionListener transitionListener, Transition transition, boolean z2);
    }

    private void E(Transition transition, TransitionNotification transitionNotification, boolean z2) {
        Transition transition2 = this.f42224a;
        if (transition2 != null) {
            transition2.E(transition, transitionNotification, z2);
        }
        ArrayList arrayList = this.f42213I;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f42213I.size();
        TransitionListener[] transitionListenerArr = this.eF;
        if (transitionListenerArr == null) {
            transitionListenerArr = new TransitionListener[size];
        }
        this.eF = null;
        TransitionListener[] transitionListenerArr2 = (TransitionListener[]) this.f42213I.toArray(transitionListenerArr);
        for (int i2 = 0; i2 < size; i2++) {
            transitionNotification.rl(transitionListenerArr2[i2], transition, z2);
            transitionListenerArr2[i2] = null;
        }
        this.eF = transitionListenerArr2;
    }

    private void GR(Animator animator, final ArrayMap arrayMap) {
        if (animator != null) {
            animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.transition.Transition.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator2) {
                    arrayMap.remove(animator2);
                    Transition.this.f42215M.remove(animator2);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator2) {
                    Transition.this.f42215M.add(animator2);
                }
            });
            KN(animator);
        }
    }

    private static void J2(TransitionValuesMaps transitionValuesMaps, View view, TransitionValues transitionValues) {
        transitionValuesMaps.f42261n.put(view, transitionValues);
        int id = view.getId();
        if (id >= 0) {
            if (transitionValuesMaps.rl.indexOfKey(id) >= 0) {
                transitionValuesMaps.rl.put(id, null);
            } else {
                transitionValuesMaps.rl.put(id, view);
            }
        }
        String strN = ViewCompat.N(view);
        if (strN != null) {
            if (transitionValuesMaps.nr.containsKey(strN)) {
                transitionValuesMaps.nr.put(strN, null);
            } else {
                transitionValuesMaps.nr.put(strN, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (transitionValuesMaps.f42262t.KN(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    transitionValuesMaps.f42262t.gh(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) transitionValuesMaps.f42262t.O(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    transitionValuesMaps.f42262t.gh(itemIdAtPosition, null);
                }
            }
        }
    }

    private static boolean Xw(TransitionValues transitionValues, TransitionValues transitionValues2, String str) {
        Object obj = transitionValues.f42259n.get(str);
        Object obj2 = transitionValues2.f42259n.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void eF(TransitionValuesMaps transitionValuesMaps, TransitionValuesMaps transitionValuesMaps2) {
        ArrayMap arrayMap = new ArrayMap(transitionValuesMaps.f42261n);
        ArrayMap arrayMap2 = new ArrayMap(transitionValuesMaps2.f42261n);
        int i2 = 0;
        while (true) {
            int[] iArr = this.P5;
            if (i2 >= iArr.length) {
                O(arrayMap, arrayMap2);
                return;
            }
            int i3 = iArr[i2];
            if (i3 == 1) {
                P5(arrayMap, arrayMap2);
            } else if (i3 == 2) {
                p5(arrayMap, arrayMap2, transitionValuesMaps.nr, transitionValuesMaps2.nr);
            } else if (i3 == 3) {
                U(arrayMap, arrayMap2, transitionValuesMaps.rl, transitionValuesMaps2.rl);
            } else if (i3 == 4) {
                M7(arrayMap, arrayMap2, transitionValuesMaps.f42262t, transitionValuesMaps2.f42262t);
            }
            i2++;
        }
    }

    private static ArrayMap iF() {
        ArrayMap arrayMap = (ArrayMap) pJg.get();
        if (arrayMap != null) {
            return arrayMap;
        }
        ArrayMap arrayMap2 = new ArrayMap();
        pJg.set(arrayMap2);
        return arrayMap2;
    }

    private void mUb(View view, boolean z2) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.f42226g;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.E2;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f42225e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (((Class) this.f42225e.get(i2)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    TransitionValues transitionValues = new TransitionValues(view);
                    if (z2) {
                        qie(transitionValues);
                    } else {
                        xMQ(transitionValues);
                    }
                    transitionValues.f42260t.add(this);
                    gh(transitionValues);
                    if (z2) {
                        J2(this.Xw, view, transitionValues);
                    } else {
                        J2(this.jB, view, transitionValues);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f42219T;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.f42216N;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f42232v;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    if (((Class) this.f42232v.get(i3)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                                mUb(viewGroup.getChildAt(i5), z2);
                            }
                        }
                    }
                }
            }
        }
    }

    void B(ViewGroup viewGroup) {
        AnimationInfo animationInfo;
        this.M7 = new ArrayList();
        this.p5 = new ArrayList();
        eF(this.Xw, this.jB);
        ArrayMap arrayMapIF = iF();
        int size = arrayMapIF.getSize();
        WindowId windowId = viewGroup.getWindowId();
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = (Animator) arrayMapIF.xMQ(i2);
            if (animator != null && (animationInfo = (AnimationInfo) arrayMapIF.get(animator)) != null && animationInfo.f42237n != null && windowId.equals(animationInfo.nr)) {
                TransitionValues transitionValues = animationInfo.f42238t;
                View view = animationInfo.f42237n;
                TransitionValues transitionValuesS7N = s7N(view, true);
                TransitionValues transitionValuesAYN = aYN(view, true);
                if (transitionValuesS7N == null && transitionValuesAYN == null) {
                    transitionValuesAYN = (TransitionValues) this.jB.f42261n.get(view);
                }
                if ((transitionValuesS7N != null || transitionValuesAYN != null) && animationInfo.f42236O.rV9(transitionValues, transitionValuesAYN)) {
                    Transition transition = animationInfo.f42236O;
                    if (transition.te().piY != null) {
                        animator.cancel();
                        transition.f42215M.remove(animator);
                        arrayMapIF.remove(animator);
                        if (transition.f42215M.size() == 0) {
                            transition.M(TransitionNotification.f42244t, false);
                            if (!transition.f42209D) {
                                transition.f42209D = true;
                                transition.M(TransitionNotification.rl, false);
                            }
                        }
                    } else if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        arrayMapIF.remove(animator);
                    }
                }
            }
        }
        Ik(viewGroup, this.Xw, this.jB, this.M7, this.p5);
        if (this.piY == null) {
            Nxk();
        } else if (Build.VERSION.SDK_INT >= 34) {
            J();
            this.piY.ck();
            this.piY.Ik();
        }
    }

    public Transition D(TransitionListener transitionListener) {
        Transition transition;
        ArrayList arrayList = this.f42213I;
        if (arrayList != null) {
            if (!arrayList.remove(transitionListener) && (transition = this.f42224a) != null) {
                transition.D(transitionListener);
            }
            if (this.f42213I.size() == 0) {
                this.f42213I = null;
            }
        }
        return this;
    }

    public List E2() {
        return this.f42230r;
    }

    public void FX(View view) {
        if (this.f42209D) {
            return;
        }
        int size = this.f42215M.size();
        Animator[] animatorArr = (Animator[]) this.f42215M.toArray(this.f42211FX);
        this.f42211FX = f42207m;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            animator.pause();
        }
        this.f42211FX = animatorArr;
        M(TransitionNotification.nr, false);
        this.f42214J = true;
    }

    public void I(View view) {
        if (this.f42214J) {
            if (!this.f42209D) {
                int size = this.f42215M.size();
                Animator[] animatorArr = (Animator[]) this.f42215M.toArray(this.f42211FX);
                this.f42211FX = f42207m;
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    Animator animator = animatorArr[i2];
                    animatorArr[i2] = null;
                    animator.resume();
                }
                this.f42211FX = animatorArr;
                M(TransitionNotification.f42242O, false);
            }
            this.f42214J = false;
        }
    }

    void Ik(ViewGroup viewGroup, TransitionValuesMaps transitionValuesMaps, TransitionValuesMaps transitionValuesMaps2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorCk;
        int i2;
        boolean z2;
        int i3;
        View view;
        TransitionValues transitionValues;
        Animator animator;
        Animator animator2;
        TransitionValues transitionValues2;
        ArrayMap arrayMapIF = iF();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z3 = te().piY != null;
        long jMin = Long.MAX_VALUE;
        int i5 = 0;
        while (i5 < size) {
            TransitionValues transitionValues3 = (TransitionValues) arrayList.get(i5);
            TransitionValues transitionValues4 = (TransitionValues) arrayList2.get(i5);
            if (transitionValues3 != null && !transitionValues3.f42260t.contains(this)) {
                transitionValues3 = null;
            }
            if (transitionValues4 != null && !transitionValues4.f42260t.contains(this)) {
                transitionValues4 = null;
            }
            if (!(transitionValues3 == null && transitionValues4 == null) && ((transitionValues3 == null || transitionValues4 == null || rV9(transitionValues3, transitionValues4)) && (animatorCk = ck(viewGroup, transitionValues3, transitionValues4)) != null)) {
                if (transitionValues4 != null) {
                    View view2 = transitionValues4.rl;
                    String[] strArrNHg = nHg();
                    if (strArrNHg != null && strArrNHg.length > 0) {
                        transitionValues2 = new TransitionValues(view2);
                        i2 = size;
                        z2 = z3;
                        TransitionValues transitionValues5 = (TransitionValues) transitionValuesMaps2.f42261n.get(view2);
                        i3 = i5;
                        if (transitionValues5 != null) {
                            int i7 = 0;
                            while (i7 < strArrNHg.length) {
                                Map map = transitionValues2.f42259n;
                                int i8 = i7;
                                String str = strArrNHg[i8];
                                map.put(str, transitionValues5.f42259n.get(str));
                                i7 = i8 + 1;
                                strArrNHg = strArrNHg;
                            }
                        }
                        int size2 = arrayMapIF.getSize();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size2) {
                                view = view2;
                                animator2 = animatorCk;
                                break;
                            }
                            AnimationInfo animationInfo = (AnimationInfo) arrayMapIF.get((Animator) arrayMapIF.xMQ(i9));
                            if (animationInfo.f42238t != null && animationInfo.f42237n == view2) {
                                view = view2;
                                if (animationInfo.rl.equals(ViF()) && animationInfo.f42238t.equals(transitionValues2)) {
                                    animator2 = null;
                                    break;
                                }
                            } else {
                                view = view2;
                            }
                            i9++;
                            view2 = view;
                        }
                    } else {
                        view = view2;
                        i2 = size;
                        z2 = z3;
                        i3 = i5;
                        animator2 = animatorCk;
                        transitionValues2 = null;
                    }
                    TransitionValues transitionValues6 = transitionValues2;
                    animator = animator2;
                    transitionValues = transitionValues6;
                } else {
                    i2 = size;
                    z2 = z3;
                    i3 = i5;
                    view = transitionValues3.rl;
                    transitionValues = null;
                    animator = animatorCk;
                }
                if (animator != null) {
                    TransitionPropagation transitionPropagation = this.Nxk;
                    if (transitionPropagation != null) {
                        long jT2 = transitionPropagation.t(viewGroup, this, transitionValues3, transitionValues4);
                        sparseIntArray.put(this.f42212GR.size(), (int) jT2);
                        jMin = Math.min(jT2, jMin);
                    }
                    long j2 = jMin;
                    AnimationInfo animationInfo2 = new AnimationInfo(view, ViF(), this, viewGroup.getWindowId(), transitionValues, animator);
                    Object obj = animator;
                    if (z2) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(animator);
                        obj = animatorSet;
                    }
                    arrayMapIF.put(obj, animationInfo2);
                    this.f42212GR.add(obj);
                    jMin = j2;
                }
            } else {
                i2 = size;
                z2 = z3;
                i3 = i5;
            }
            i5 = i3 + 1;
            size = i2;
            z3 = z2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i10 = 0; i10 < sparseIntArray.size(); i10++) {
                AnimationInfo animationInfo3 = (AnimationInfo) arrayMapIF.get((Animator) this.f42212GR.get(sparseIntArray.keyAt(i10)));
                animationInfo3.J2.setStartDelay((((long) sparseIntArray.valueAt(i10)) - jMin) + animationInfo3.J2.getStartDelay());
            }
        }
    }

    protected void KN(Animator animator) {
        if (animator == null) {
            o();
            return;
        }
        if (Z() >= 0) {
            animator.setDuration(Z());
        }
        if (fD() >= 0) {
            animator.setStartDelay(fD() + animator.getStartDelay());
        }
        if (WPU() != null) {
            animator.setInterpolator(WPU());
        }
        animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.transition.Transition.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                Transition.this.o();
                animator2.removeListener(this);
            }
        });
        animator.start();
    }

    final long N() {
        return this.f42233z;
    }

    public EpicenterCallback S() {
        return this.f42222Y;
    }

    public List T() {
        return this.f42229o;
    }

    public String ViF() {
        return this.f42228n;
    }

    public TimeInterpolator WPU() {
        return this.J2;
    }

    public List X() {
        return this.f42218S;
    }

    public Rect XQ() {
        EpicenterCallback epicenterCallback = this.f42222Y;
        if (epicenterCallback == null) {
            return null;
        }
        return epicenterCallback.n(this);
    }

    void Y(long j2, long j3) {
        long jN = N();
        int i2 = 0;
        boolean z2 = j2 < j3;
        if ((j3 < 0 && j2 >= 0) || (j3 > jN && j2 <= jN)) {
            this.f42209D = false;
            M(TransitionNotification.f42243n, z2);
        }
        int size = this.f42215M.size();
        Animator[] animatorArr = (Animator[]) this.f42215M.toArray(this.f42211FX);
        this.f42211FX = f42207m;
        while (i2 < size) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            Impl26.rl(animator, Math.min(Math.max(0L, j2), Impl26.n(animator)));
            i2++;
            jN = jN;
        }
        long j4 = jN;
        this.f42211FX = animatorArr;
        if ((j2 <= j4 || j3 > j4) && (j2 >= 0 || j3 < 0)) {
            return;
        }
        if (j2 > j4) {
            this.f42209D = true;
        }
        M(TransitionNotification.rl, z2);
    }

    public long Z() {
        return this.f42217O;
    }

    public Transition a(View view) {
        this.f42229o.remove(view);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.p5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.M7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return (androidx.transition.TransitionValues) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    TransitionValues aYN(View view, boolean z2) {
        TransitionSet transitionSet = this.f42220U;
        if (transitionSet != null) {
            return transitionSet.aYN(view, z2);
        }
        ArrayList arrayList = z2 ? this.M7 : this.p5;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            }
            TransitionValues transitionValues = (TransitionValues) arrayList.get(i2);
            if (transitionValues == null) {
                return null;
            }
            if (transitionValues.rl == view) {
                break;
            }
            i2++;
        }
    }

    protected void cancel() {
        int size = this.f42215M.size();
        Animator[] animatorArr = (Animator[]) this.f42215M.toArray(this.f42211FX);
        this.f42211FX = f42207m;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            animator.cancel();
        }
        this.f42211FX = animatorArr;
        M(TransitionNotification.f42244t, false);
    }

    public void dR0(EpicenterCallback epicenterCallback) {
        this.f42222Y = epicenterCallback;
    }

    public List e() {
        return this.f42223Z;
    }

    protected void eTf() {
        if (this.f42208B == 0) {
            M(TransitionNotification.f42243n, false);
            this.f42209D = false;
        }
        this.f42208B++;
    }

    public long fD() {
        return this.f42231t;
    }

    public TransitionPropagation g() {
        return this.Nxk;
    }

    void gh(TransitionValues transitionValues) {
        String[] strArrRl;
        if (this.Nxk == null || transitionValues.f42259n.isEmpty() || (strArrRl = this.Nxk.rl()) == null) {
            return;
        }
        for (String str : strArrRl) {
            if (!transitionValues.f42259n.containsKey(str)) {
                this.Nxk.n(transitionValues);
                return;
            }
        }
    }

    public void ijL(TransitionPropagation transitionPropagation) {
        this.Nxk = transitionPropagation;
    }

    public Transition k(long j2) {
        this.f42217O = j2;
        return this;
    }

    public Transition m(long j2) {
        this.f42231t = j2;
        return this;
    }

    public PathMotion nY() {
        return this.dR0;
    }

    public Transition nr(View view) {
        this.f42229o.add(view);
        return this;
    }

    protected void o() {
        int i2 = this.f42208B - 1;
        this.f42208B = i2;
        if (i2 == 0) {
            M(TransitionNotification.rl, false);
            for (int i3 = 0; i3 < this.Xw.f42262t.ty(); i3++) {
                View view = (View) this.Xw.f42262t.HI(i3);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i5 = 0; i5 < this.jB.f42262t.ty(); i5++) {
                View view2 = (View) this.jB.f42262t.HI(i5);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f42209D = true;
        }
    }

    public void piY(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.dR0 = xg;
        } else {
            this.dR0 = pathMotion;
        }
    }

    TransitionSeekController r() {
        SeekController seekController = new SeekController();
        this.piY = seekController;
        t(seekController);
        return this.piY;
    }

    public TransitionValues s7N(View view, boolean z2) {
        TransitionSet transitionSet = this.f42220U;
        if (transitionSet != null) {
            return transitionSet.s7N(view, z2);
        }
        return (TransitionValues) (z2 ? this.Xw : this.jB).f42261n.get(view);
    }

    public Transition t(TransitionListener transitionListener) {
        if (this.f42213I == null) {
            this.f42213I = new ArrayList();
        }
        this.f42213I.add(transitionListener);
        return this;
    }

    public final Transition te() {
        TransitionSet transitionSet = this.f42220U;
        return transitionSet != null ? transitionSet.te() : this;
    }

    public String toString() {
        return xg("");
    }

    void ty(boolean z2) {
        if (z2) {
            this.Xw.f42261n.clear();
            this.Xw.rl.clear();
            this.Xw.f42262t.rl();
        } else {
            this.jB.f42261n.clear();
            this.jB.rl.clear();
            this.jB.f42262t.rl();
        }
    }

    boolean wTp() {
        return !this.f42215M.isEmpty();
    }

    String xg(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f42217O != -1) {
            sb.append("dur(");
            sb.append(this.f42217O);
            sb.append(") ");
        }
        if (this.f42231t != -1) {
            sb.append("dly(");
            sb.append(this.f42231t);
            sb.append(") ");
        }
        if (this.J2 != null) {
            sb.append("interp(");
            sb.append(this.J2);
            sb.append(") ");
        }
        if (this.f42230r.size() > 0 || this.f42229o.size() > 0) {
            sb.append("tgts(");
            if (this.f42230r.size() > 0) {
                for (int i2 = 0; i2 < this.f42230r.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f42230r.get(i2));
                }
            }
            if (this.f42229o.size() > 0) {
                for (int i3 = 0; i3 < this.f42229o.size(); i3++) {
                    if (i3 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f42229o.get(i3));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public Transition z(TimeInterpolator timeInterpolator) {
        this.J2 = timeInterpolator;
        return this;
    }

    private void M7(ArrayMap arrayMap, ArrayMap arrayMap2, LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        View view;
        int iTy = longSparseArray.ty();
        for (int i2 = 0; i2 < iTy; i2++) {
            View view2 = (View) longSparseArray.HI(i2);
            if (view2 != null && bzg(view2) && (view = (View) longSparseArray2.O(longSparseArray.mUb(i2))) != null && bzg(view)) {
                TransitionValues transitionValues = (TransitionValues) arrayMap.get(view2);
                TransitionValues transitionValues2 = (TransitionValues) arrayMap2.get(view);
                if (transitionValues != null && transitionValues2 != null) {
                    this.M7.add(transitionValues);
                    this.p5.add(transitionValues2);
                    arrayMap.remove(view2);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    private void P5(ArrayMap arrayMap, ArrayMap arrayMap2) {
        TransitionValues transitionValues;
        for (int size = arrayMap.getSize() - 1; size >= 0; size--) {
            View view = (View) arrayMap.xMQ(size);
            if (view != null && bzg(view) && (transitionValues = (TransitionValues) arrayMap2.remove(view)) != null && bzg(transitionValues.rl)) {
                this.M7.add((TransitionValues) arrayMap.gh(size));
                this.p5.add(transitionValues);
            }
        }
    }

    private void U(ArrayMap arrayMap, ArrayMap arrayMap2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) sparseArray.valueAt(i2);
            if (view2 != null && bzg(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i2))) != null && bzg(view)) {
                TransitionValues transitionValues = (TransitionValues) arrayMap.get(view2);
                TransitionValues transitionValues2 = (TransitionValues) arrayMap2.get(view);
                if (transitionValues != null && transitionValues2 != null) {
                    this.M7.add(transitionValues);
                    this.p5.add(transitionValues2);
                    arrayMap.remove(view2);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    private void p5(ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3, ArrayMap arrayMap4) {
        View view;
        int size = arrayMap3.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) arrayMap3.az(i2);
            if (view2 != null && bzg(view2) && (view = (View) arrayMap4.get(arrayMap3.xMQ(i2))) != null && bzg(view)) {
                TransitionValues transitionValues = (TransitionValues) arrayMap.get(view2);
                TransitionValues transitionValues2 = (TransitionValues) arrayMap2.get(view);
                if (transitionValues != null && transitionValues2 != null) {
                    this.M7.add(transitionValues);
                    this.p5.add(transitionValues2);
                    arrayMap.remove(view2);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    @Override // 
    /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.f42212GR = new ArrayList();
            transition.Xw = new TransitionValuesMaps();
            transition.jB = new TransitionValuesMaps();
            transition.M7 = null;
            transition.p5 = null;
            transition.piY = null;
            transition.f42224a = this;
            transition.f42213I = null;
            return transition;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    void J() {
        ArrayMap arrayMapIF = iF();
        this.f42233z = 0L;
        for (int i2 = 0; i2 < this.f42212GR.size(); i2++) {
            Animator animator = (Animator) this.f42212GR.get(i2);
            AnimationInfo animationInfo = (AnimationInfo) arrayMapIF.get(animator);
            if (animator != null && animationInfo != null) {
                if (Z() >= 0) {
                    animationInfo.J2.setDuration(Z());
                }
                if (fD() >= 0) {
                    animationInfo.J2.setStartDelay(fD() + animationInfo.J2.getStartDelay());
                }
                if (WPU() != null) {
                    animationInfo.J2.setInterpolator(WPU());
                }
                this.f42215M.add(animator);
                this.f42233z = Math.max(this.f42233z, Impl26.n(animator));
            }
        }
        this.f42212GR.clear();
    }

    void M(TransitionNotification transitionNotification, boolean z2) {
        E(this, transitionNotification, z2);
    }

    protected void Nxk() {
        eTf();
        ArrayMap arrayMapIF = iF();
        for (Animator animator : this.f42212GR) {
            if (arrayMapIF.containsKey(animator)) {
                eTf();
                GR(animator, arrayMapIF);
            }
        }
        this.f42212GR.clear();
        o();
    }

    void az(ViewGroup viewGroup, boolean z2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayMap arrayMap;
        ty(z2);
        if ((this.f42230r.size() <= 0 && this.f42229o.size() <= 0) || (((arrayList = this.f42223Z) != null && !arrayList.isEmpty()) || ((arrayList2 = this.f42218S) != null && !arrayList2.isEmpty()))) {
            mUb(viewGroup, z2);
        } else {
            for (int i2 = 0; i2 < this.f42230r.size(); i2++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.f42230r.get(i2)).intValue());
                if (viewFindViewById != null) {
                    TransitionValues transitionValues = new TransitionValues(viewFindViewById);
                    if (z2) {
                        qie(transitionValues);
                    } else {
                        xMQ(transitionValues);
                    }
                    transitionValues.f42260t.add(this);
                    gh(transitionValues);
                    if (z2) {
                        J2(this.Xw, viewFindViewById, transitionValues);
                    } else {
                        J2(this.jB, viewFindViewById, transitionValues);
                    }
                }
            }
            for (int i3 = 0; i3 < this.f42229o.size(); i3++) {
                View view = (View) this.f42229o.get(i3);
                TransitionValues transitionValues2 = new TransitionValues(view);
                if (z2) {
                    qie(transitionValues2);
                } else {
                    xMQ(transitionValues2);
                }
                transitionValues2.f42260t.add(this);
                gh(transitionValues2);
                if (z2) {
                    J2(this.Xw, view, transitionValues2);
                } else {
                    J2(this.jB, view, transitionValues2);
                }
            }
        }
        if (!z2 && (arrayMap = this.f42227k) != null) {
            int size = arrayMap.getSize();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i5 = 0; i5 < size; i5++) {
                arrayList3.add((View) this.Xw.nr.remove((String) this.f42227k.xMQ(i5)));
            }
            for (int i7 = 0; i7 < size; i7++) {
                View view2 = (View) arrayList3.get(i7);
                if (view2 != null) {
                    this.Xw.nr.put((String) this.f42227k.az(i7), view2);
                }
            }
        }
    }

    boolean bzg(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.f42226g;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.E2;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f42225e;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((Class) this.f42225e.get(i2)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f42221X != null && ViewCompat.N(view) != null && this.f42221X.contains(ViewCompat.N(view))) {
            return false;
        }
        if ((this.f42230r.size() == 0 && this.f42229o.size() == 0 && (((arrayList = this.f42218S) == null || arrayList.isEmpty()) && ((arrayList2 = this.f42223Z) == null || arrayList2.isEmpty()))) || this.f42230r.contains(Integer.valueOf(id)) || this.f42229o.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f42223Z;
        if (arrayList6 != null && arrayList6.contains(ViewCompat.N(view))) {
            return true;
        }
        if (this.f42218S != null) {
            for (int i3 = 0; i3 < this.f42218S.size(); i3++) {
                if (((Class) this.f42218S.get(i3)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }
}
