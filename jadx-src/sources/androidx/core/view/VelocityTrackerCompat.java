package androidx.core.view;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class VelocityTrackerCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Map f36761n = Collections.synchronizedMap(new WeakHashMap());

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface VelocityTrackableMotionEventAxis {
    }

    @RequiresApi
    private static class Api34Impl {
        static float n(VelocityTracker velocityTracker, int i2) {
            return velocityTracker.getAxisVelocity(i2);
        }
    }

    private static VelocityTrackerFallback O(VelocityTracker velocityTracker) {
        return (VelocityTrackerFallback) f36761n.get(velocityTracker);
    }

    public static float nr(VelocityTracker velocityTracker, int i2) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.n(velocityTracker, i2);
        }
        if (i2 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i2 == 1) {
            return velocityTracker.getYVelocity();
        }
        VelocityTrackerFallback velocityTrackerFallbackO = O(velocityTracker);
        if (velocityTrackerFallbackO != null) {
            return velocityTrackerFallbackO.nr(i2);
        }
        return 0.0f;
    }

    public static void n(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f36761n.containsKey(velocityTracker)) {
                f36761n.put(velocityTracker, new VelocityTrackerFallback());
            }
            ((VelocityTrackerFallback) f36761n.get(velocityTracker)).n(motionEvent);
        }
    }

    public static void rl(VelocityTracker velocityTracker, int i2) {
        t(velocityTracker, i2, Float.MAX_VALUE);
    }

    public static void t(VelocityTracker velocityTracker, int i2, float f3) {
        velocityTracker.computeCurrentVelocity(i2, f3);
        VelocityTrackerFallback velocityTrackerFallbackO = O(velocityTracker);
        if (velocityTrackerFallbackO != null) {
            velocityTrackerFallbackO.t(i2, f3);
        }
    }
}
