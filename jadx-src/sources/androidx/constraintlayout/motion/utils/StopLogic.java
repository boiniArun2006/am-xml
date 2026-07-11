package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.core.motion.utils.SpringStopEngine;
import androidx.constraintlayout.core.motion.utils.StopEngine;
import androidx.constraintlayout.core.motion.utils.StopLogicEngine;
import androidx.constraintlayout.motion.widget.MotionInterpolator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class StopLogic extends MotionInterpolator {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private StopLogicEngine f35643n;
    private SpringStopEngine rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private StopEngine f35644t;

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f3) {
        return this.f35644t.getInterpolation(f3);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
    public float n() {
        return this.f35644t.n();
    }

    public void nr(float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i2) {
        if (this.rl == null) {
            this.rl = new SpringStopEngine();
        }
        SpringStopEngine springStopEngine = this.rl;
        this.f35644t = springStopEngine;
        springStopEngine.nr(f3, f4, f5, f6, f7, f8, f9, i2);
    }

    public void rl(float f3, float f4, float f5, float f6, float f7, float f8) {
        StopLogicEngine stopLogicEngine = this.f35643n;
        this.f35644t = stopLogicEngine;
        stopLogicEngine.nr(f3, f4, f5, f6, f7, f8);
    }

    public boolean t() {
        return this.f35644t.rl();
    }
}
