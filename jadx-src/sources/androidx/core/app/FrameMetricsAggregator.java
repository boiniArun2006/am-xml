package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class FrameMetricsAggregator {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FrameMetricsBaseImpl f36224n;

    @RequiresApi
    private static class FrameMetricsApi24Impl extends FrameMetricsBaseImpl {
        private static Handler J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static HandlerThread f36225O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f36226n;
        SparseIntArray[] rl = new SparseIntArray[9];

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final ArrayList f36227t = new ArrayList();
        Window.OnFrameMetricsAvailableListener nr = new Window.OnFrameMetricsAvailableListener() { // from class: androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.1
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i2) {
                FrameMetricsApi24Impl frameMetricsApi24Impl = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl.f36226n & 1) != 0) {
                    frameMetricsApi24Impl.O(frameMetricsApi24Impl.rl[0], frameMetrics.getMetric(8));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl2 = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl2.f36226n & 2) != 0) {
                    frameMetricsApi24Impl2.O(frameMetricsApi24Impl2.rl[1], frameMetrics.getMetric(1));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl3 = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl3.f36226n & 4) != 0) {
                    frameMetricsApi24Impl3.O(frameMetricsApi24Impl3.rl[2], frameMetrics.getMetric(3));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl4 = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl4.f36226n & 8) != 0) {
                    frameMetricsApi24Impl4.O(frameMetricsApi24Impl4.rl[3], frameMetrics.getMetric(4));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl5 = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl5.f36226n & 16) != 0) {
                    frameMetricsApi24Impl5.O(frameMetricsApi24Impl5.rl[4], frameMetrics.getMetric(5));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl6 = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl6.f36226n & 64) != 0) {
                    frameMetricsApi24Impl6.O(frameMetricsApi24Impl6.rl[6], frameMetrics.getMetric(7));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl7 = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl7.f36226n & 32) != 0) {
                    frameMetricsApi24Impl7.O(frameMetricsApi24Impl7.rl[5], frameMetrics.getMetric(6));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl8 = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl8.f36226n & 128) != 0) {
                    frameMetricsApi24Impl8.O(frameMetricsApi24Impl8.rl[7], frameMetrics.getMetric(0));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl9 = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl9.f36226n & 256) != 0) {
                    frameMetricsApi24Impl9.O(frameMetricsApi24Impl9.rl[8], frameMetrics.getMetric(2));
                }
            }
        };

        void O(SparseIntArray sparseIntArray, long j2) {
            if (sparseIntArray != null) {
                int i2 = (int) ((500000 + j2) / 1000000);
                if (j2 >= 0) {
                    sparseIntArray.put(i2, sparseIntArray.get(i2) + 1);
                }
            }
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public void n(Activity activity) {
            if (f36225O == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f36225O = handlerThread;
                handlerThread.start();
                J2 = new Handler(f36225O.getLooper());
            }
            for (int i2 = 0; i2 <= 8; i2++) {
                SparseIntArray[] sparseIntArrayArr = this.rl;
                if (sparseIntArrayArr[i2] == null && (this.f36226n & (1 << i2)) != 0) {
                    sparseIntArrayArr[i2] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.nr, J2);
            this.f36227t.add(new WeakReference(activity));
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public SparseIntArray[] nr() {
            SparseIntArray[] sparseIntArrayArr = this.rl;
            this.rl = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public SparseIntArray[] rl() {
            return this.rl;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public SparseIntArray[] t(Activity activity) {
            Iterator it = this.f36227t.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == activity) {
                    this.f36227t.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.nr);
            return this.rl;
        }

        FrameMetricsApi24Impl(int i2) {
            this.f36226n = i2;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface MetricType {
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    private static class FrameMetricsBaseImpl {
        public void n(Activity activity) {
        }

        public SparseIntArray[] nr() {
            return null;
        }

        public SparseIntArray[] rl() {
            return null;
        }

        public SparseIntArray[] t(Activity activity) {
            return null;
        }

        FrameMetricsBaseImpl() {
        }
    }

    public FrameMetricsAggregator(int i2) {
        this.f36224n = new FrameMetricsApi24Impl(i2);
    }

    public void n(Activity activity) {
        this.f36224n.n(activity);
    }

    public SparseIntArray[] nr() {
        return this.f36224n.nr();
    }

    public SparseIntArray[] rl() {
        return this.f36224n.rl();
    }

    public SparseIntArray[] t(Activity activity) {
        return this.f36224n.t(activity);
    }
}
