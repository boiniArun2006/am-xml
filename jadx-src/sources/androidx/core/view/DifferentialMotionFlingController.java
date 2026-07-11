package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class DifferentialMotionFlingController {
    private float J2;
    private int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private VelocityTracker f36726O;
    private int Uo;
    private final int[] mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f36727n;
    private final DifferentialVelocityProvider nr;
    private final DifferentialMotionFlingTarget rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final FlingVelocityThresholdCalculator f36728t;
    private int xMQ;

    @VisibleForTesting
    interface DifferentialVelocityProvider {
        float n(VelocityTracker velocityTracker, MotionEvent motionEvent, int i2);
    }

    @VisibleForTesting
    interface FlingVelocityThresholdCalculator {
        void n(Context context, int[] iArr, MotionEvent motionEvent, int i2);
    }

    public DifferentialMotionFlingController(Context context, DifferentialMotionFlingTarget differentialMotionFlingTarget) {
        this(context, differentialMotionFlingTarget, new FlingVelocityThresholdCalculator() { // from class: androidx.core.view.aC
            @Override // androidx.core.view.DifferentialMotionFlingController.FlingVelocityThresholdCalculator
            public final void n(Context context2, int[] iArr, MotionEvent motionEvent, int i2) {
                DifferentialMotionFlingController.t(context2, iArr, motionEvent, i2);
            }
        }, new DifferentialVelocityProvider() { // from class: androidx.core.view.C
            @Override // androidx.core.view.DifferentialMotionFlingController.DifferentialVelocityProvider
            public final float n(VelocityTracker velocityTracker, MotionEvent motionEvent, int i2) {
                return DifferentialMotionFlingController.J2(velocityTracker, motionEvent, i2);
            }
        });
    }

    DifferentialMotionFlingController(Context context, DifferentialMotionFlingTarget differentialMotionFlingTarget, FlingVelocityThresholdCalculator flingVelocityThresholdCalculator, DifferentialVelocityProvider differentialVelocityProvider) {
        this.Uo = -1;
        this.KN = -1;
        this.xMQ = -1;
        this.mUb = new int[]{Integer.MAX_VALUE, 0};
        this.f36727n = context;
        this.rl = differentialMotionFlingTarget;
        this.f36728t = flingVelocityThresholdCalculator;
        this.nr = differentialVelocityProvider;
    }

    private float O(MotionEvent motionEvent, int i2) {
        if (this.f36726O == null) {
            this.f36726O = VelocityTracker.obtain();
        }
        return this.nr.n(this.f36726O, motionEvent, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float J2(VelocityTracker velocityTracker, MotionEvent motionEvent, int i2) {
        VelocityTrackerCompat.n(velocityTracker, motionEvent);
        VelocityTrackerCompat.rl(velocityTracker, 1000);
        return VelocityTrackerCompat.nr(velocityTracker, i2);
    }

    private boolean nr(MotionEvent motionEvent, int i2) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.KN == source && this.xMQ == deviceId && this.Uo == i2) {
            return false;
        }
        this.f36728t.n(this.f36727n, this.mUb, motionEvent, i2);
        this.KN = source;
        this.xMQ = deviceId;
        this.Uo = i2;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t(Context context, int[] iArr, MotionEvent motionEvent, int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = ViewConfigurationCompat.xMQ(context, viewConfiguration, motionEvent.getDeviceId(), i2, motionEvent.getSource());
        iArr[1] = ViewConfigurationCompat.KN(context, viewConfiguration, motionEvent.getDeviceId(), i2, motionEvent.getSource());
    }

    public void Uo(MotionEvent motionEvent, int i2) {
        boolean zNr = nr(motionEvent, i2);
        if (this.mUb[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f36726O;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f36726O = null;
                return;
            }
            return;
        }
        float fO = O(motionEvent, i2) * this.rl.rl();
        float fSignum = Math.signum(fO);
        float f3 = 0.0f;
        if (zNr || (fSignum != Math.signum(this.J2) && fSignum != 0.0f)) {
            this.rl.t();
        }
        float fAbs = Math.abs(fO);
        int[] iArr = this.mUb;
        if (fAbs < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r6, Math.min(fO, iArr[1]));
        if (this.rl.n(fMax)) {
            f3 = fMax;
        }
        this.J2 = f3;
    }
}
