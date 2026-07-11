package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.graphics.drawable.DrawableContainerCompat;
import androidx.appcompat.graphics.drawable.StateListDrawableCompat;
import androidx.appcompat.resources.Compatibility;
import androidx.appcompat.resources.R;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class AnimatedStateListDrawableCompat extends StateListDrawableCompat implements TintAwareDrawable {
    private boolean P5;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f13716U;
    private Transition Xw;
    private int jB;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private AnimatedStateListState f13717v;

    private static class AnimatableTransition extends Transition {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Animatable f13718n;

        AnimatableTransition(Animatable animatable) {
            super();
            this.f13718n = animatable;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void nr() {
            this.f13718n.stop();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void t() {
            this.f13718n.start();
        }
    }

    static class AnimatedStateListState extends StateListDrawableCompat.StateListState {
        LongSparseArray s7N;
        SparseArrayCompat wTp;

        private static long E2(int i2, int i3) {
            return ((long) i3) | (((long) i2) << 32);
        }

        int e(int i2) {
            if (i2 < 0) {
                return 0;
            }
            return ((Integer) this.wTp.J2(i2, 0)).intValue();
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new AnimatedStateListDrawableCompat(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new AnimatedStateListDrawableCompat(this, resources);
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        void o() {
            this.s7N = this.s7N.clone();
            this.wTp = this.wTp.clone();
        }

        AnimatedStateListState(AnimatedStateListState animatedStateListState, AnimatedStateListDrawableCompat animatedStateListDrawableCompat, Resources resources) {
            super(animatedStateListState, animatedStateListDrawableCompat, resources);
            if (animatedStateListState != null) {
                this.s7N = animatedStateListState.s7N;
                this.wTp = animatedStateListState.wTp;
            } else {
                this.s7N = new LongSparseArray();
                this.wTp = new SparseArrayCompat();
            }
        }

        boolean N(int i2, int i3) {
            if ((((Long) this.s7N.J2(E2(i2, i3), -1L)).longValue() & 4294967296L) != 0) {
                return true;
            }
            return false;
        }

        int T(int i2, int i3) {
            return (int) ((Long) this.s7N.J2(E2(i2, i3), -1L)).longValue();
        }

        int X(int[] iArr) {
            int iTe = super.te(iArr);
            if (iTe >= 0) {
                return iTe;
            }
            return super.te(StateSet.WILD_CARD);
        }

        int fD(int i2, int i3, Drawable drawable, boolean z2) {
            long j2;
            int iN = super.n(drawable);
            long jE2 = E2(i2, i3);
            if (z2) {
                j2 = 8589934592L;
            } else {
                j2 = 0;
            }
            long j3 = iN;
            this.s7N.n(jE2, Long.valueOf(j3 | j2));
            if (z2) {
                this.s7N.n(E2(i3, i2), Long.valueOf(4294967296L | j3 | j2));
            }
            return iN;
        }

        int iF(int[] iArr, Drawable drawable, int i2) {
            int iG = super.g(iArr, drawable);
            this.wTp.az(iG, Integer.valueOf(i2));
            return iG;
        }

        boolean nHg(int i2, int i3) {
            if ((((Long) this.s7N.J2(E2(i2, i3), -1L)).longValue() & 8589934592L) != 0) {
                return true;
            }
            return false;
        }
    }

    private static class AnimatedVectorDrawableTransition extends Transition {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final AnimatedVectorDrawableCompat f13719n;

        AnimatedVectorDrawableTransition(AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
            super();
            this.f13719n = animatedVectorDrawableCompat;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void nr() {
            this.f13719n.stop();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void t() {
            this.f13719n.start();
        }
    }

    private static class AnimationDrawableTransition extends Transition {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ObjectAnimator f13720n;
        private final boolean rl;

        AnimationDrawableTransition(AnimationDrawable animationDrawable, boolean z2, boolean z3) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i2 = z2 ? numberOfFrames - 1 : 0;
            int i3 = z2 ? 0 : numberOfFrames - 1;
            FrameInterpolator frameInterpolator = new FrameInterpolator(animationDrawable, z2);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i2, i3);
            objectAnimatorOfInt.setAutoCancel(true);
            objectAnimatorOfInt.setDuration(frameInterpolator.n());
            objectAnimatorOfInt.setInterpolator(frameInterpolator);
            this.rl = z3;
            this.f13720n = objectAnimatorOfInt;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public boolean n() {
            return this.rl;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void nr() {
            this.f13720n.cancel();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void rl() {
            this.f13720n.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void t() {
            this.f13720n.start();
        }
    }

    private static class FrameInterpolator implements TimeInterpolator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int[] f13721n;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f13722t;

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f3) {
            int i2 = (int) ((f3 * this.f13722t) + 0.5f);
            int i3 = this.rl;
            int[] iArr = this.f13721n;
            int i5 = 0;
            while (i5 < i3) {
                int i7 = iArr[i5];
                if (i2 < i7) {
                    break;
                }
                i2 -= i7;
                i5++;
            }
            return (i5 / i3) + (i5 < i3 ? i2 / this.f13722t : 0.0f);
        }

        int n() {
            return this.f13722t;
        }

        FrameInterpolator(AnimationDrawable animationDrawable, boolean z2) {
            rl(animationDrawable, z2);
        }

        int rl(AnimationDrawable animationDrawable, boolean z2) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.rl = numberOfFrames;
            int[] iArr = this.f13721n;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f13721n = new int[numberOfFrames];
            }
            int[] iArr2 = this.f13721n;
            int i2 = 0;
            for (int i3 = 0; i3 < numberOfFrames; i3++) {
                int duration = animationDrawable.getDuration(z2 ? (numberOfFrames - i3) - 1 : i3);
                iArr2[i3] = duration;
                i2 += duration;
            }
            this.f13722t = i2;
            return i2;
        }
    }

    private static abstract class Transition {
        private Transition() {
        }

        public boolean n() {
            return false;
        }

        public abstract void nr();

        public void rl() {
        }

        public abstract void t();
    }

    public AnimatedStateListDrawableCompat() {
        this(null, null);
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    AnimatedStateListDrawableCompat(AnimatedStateListState animatedStateListState, Resources resources) {
        super(null);
        this.jB = -1;
        this.f13716U = -1;
        KN(new AnimatedStateListState(animatedStateListState, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    private int Ik(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayIk = TypedArrayUtils.Ik(resources, theme, attributeSet, R.styleable.KN);
        int resourceId = typedArrayIk.getResourceId(R.styleable.xMQ, 0);
        int resourceId2 = typedArrayIk.getResourceId(R.styleable.mUb, -1);
        Drawable drawableXMQ = resourceId2 > 0 ? ResourceManagerInternal.Uo().xMQ(context, resourceId2) : null;
        typedArrayIk.recycle();
        int[] iArrGh = gh(attributeSet);
        if (drawableXMQ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableXMQ = xmlPullParser.getName().equals("vector") ? VectorDrawableCompat.t(resources, xmlPullParser, attributeSet, theme) : Compatibility.Api21Impl.n(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableXMQ != null) {
            return this.f13717v.iF(iArrGh, drawableXMQ, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private void Z(TypedArray typedArray) {
        AnimatedStateListState animatedStateListState = this.f13717v;
        animatedStateListState.nr |= Compatibility.Api21Impl.rl(typedArray);
        animatedStateListState.ViF(typedArray.getBoolean(R.styleable.nr, animatedStateListState.xMQ));
        animatedStateListState.XQ(typedArray.getBoolean(R.styleable.f13754O, animatedStateListState.qie));
        animatedStateListState.S(typedArray.getInt(R.styleable.J2, animatedStateListState.f13742g));
        animatedStateListState.WPU(typedArray.getInt(R.styleable.Uo, animatedStateListState.te));
        setDither(typedArray.getBoolean(R.styleable.rl, animatedStateListState.aYN));
    }

    private boolean o(int i2) {
        int iT;
        int iT2;
        Transition animatableTransition;
        Transition transition = this.Xw;
        if (transition == null) {
            iT = t();
        } else {
            if (i2 == this.jB) {
                return true;
            }
            if (i2 == this.f13716U && transition.n()) {
                transition.rl();
                this.jB = this.f13716U;
                this.f13716U = i2;
                return true;
            }
            iT = this.jB;
            transition.nr();
        }
        this.Xw = null;
        this.f13716U = -1;
        this.jB = -1;
        AnimatedStateListState animatedStateListState = this.f13717v;
        int iE = animatedStateListState.e(iT);
        int iE2 = animatedStateListState.e(i2);
        if (iE2 == 0 || iE == 0 || (iT2 = animatedStateListState.T(iE, iE2)) < 0) {
            return false;
        }
        boolean zNHg = animatedStateListState.nHg(iE, iE2);
        Uo(iT2);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            animatableTransition = new AnimationDrawableTransition((AnimationDrawable) current, animatedStateListState.N(iE, iE2), zNHg);
        } else {
            if (!(current instanceof AnimatedVectorDrawableCompat)) {
                if (current instanceof Animatable) {
                    animatableTransition = new AnimatableTransition((Animatable) current);
                }
                return false;
            }
            animatableTransition = new AnimatedVectorDrawableTransition((AnimatedVectorDrawableCompat) current);
        }
        animatableTransition.t();
        this.Xw = animatableTransition;
        this.f13716U = iT;
        this.jB = i2;
        return true;
    }

    private int r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayIk = TypedArrayUtils.Ik(resources, theme, attributeSet, R.styleable.gh);
        int resourceId = typedArrayIk.getResourceId(R.styleable.ty, -1);
        int resourceId2 = typedArrayIk.getResourceId(R.styleable.az, -1);
        int resourceId3 = typedArrayIk.getResourceId(R.styleable.qie, -1);
        Drawable drawableXMQ = resourceId3 > 0 ? ResourceManagerInternal.Uo().xMQ(context, resourceId3) : null;
        boolean z2 = typedArrayIk.getBoolean(R.styleable.HI, false);
        typedArrayIk.recycle();
        if (drawableXMQ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableXMQ = xmlPullParser.getName().equals("animated-vector") ? AnimatedVectorDrawableCompat.rl(context, resources, xmlPullParser, attributeSet, theme) : Compatibility.Api21Impl.n(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableXMQ == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.f13717v.fD(resourceId, resourceId2, drawableXMQ, z2);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.P5 && super.mutate() == this) {
            this.f13717v.o();
            this.P5 = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int iX = this.f13717v.X(iArr);
        boolean z2 = iX != t() && (o(iX) || Uo(iX));
        Drawable current = getCurrent();
        return current != null ? current.setState(iArr) | z2 : z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public AnimatedStateListState rl() {
        return new AnimatedStateListState(this.f13717v, this, null);
    }

    public void ty(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayIk = TypedArrayUtils.Ik(resources, theme, attributeSet, R.styleable.f13755n);
        setVisible(typedArrayIk.getBoolean(R.styleable.f13756t, true), true);
        Z(typedArrayIk);
        xMQ(resources);
        typedArrayIk.recycle();
        HI(context, resources, xmlPullParser, attributeSet, theme);
        ck();
    }

    private void HI(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth) {
                        if (xmlPullParser.getName().equals("item")) {
                            Ik(context, resources, xmlPullParser, attributeSet, theme);
                        } else if (xmlPullParser.getName().equals("transition")) {
                            r(context, resources, xmlPullParser, attributeSet, theme);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public static AnimatedStateListDrawableCompat az(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            AnimatedStateListDrawableCompat animatedStateListDrawableCompat = new AnimatedStateListDrawableCompat();
            animatedStateListDrawableCompat.ty(context, resources, xmlPullParser, attributeSet, theme);
            return animatedStateListDrawableCompat;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void ck() {
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    void KN(DrawableContainerCompat.DrawableContainerState drawableContainerState) {
        super.KN(drawableContainerState);
        if (drawableContainerState instanceof AnimatedStateListState) {
            this.f13717v = (AnimatedStateListState) drawableContainerState;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        Transition transition = this.Xw;
        if (transition != null) {
            transition.nr();
            this.Xw = null;
            Uo(this.jB);
            this.jB = -1;
            this.f13716U = -1;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Transition transition = this.Xw;
        if (transition != null && (visible || z3)) {
            if (z2) {
                transition.t();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }
}
