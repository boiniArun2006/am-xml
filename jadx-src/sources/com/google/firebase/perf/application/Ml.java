package com.google.firebase.perf.application;

import O2.CN3;
import R0.Wre;
import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Ml {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final yMa.j f60568O = yMa.j.O();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Activity f60569n;
    private boolean nr;
    private final FrameMetricsAggregator rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f60570t;

    public Ml(Activity activity) {
        this(activity, new FrameMetricsAggregator(), new HashMap());
    }

    static boolean n() {
        return true;
    }

    Ml(Activity activity, FrameMetricsAggregator frameMetricsAggregator, Map map) {
        this.nr = false;
        this.f60569n = activity;
        this.rl = frameMetricsAggregator;
        this.f60570t = map;
    }

    private CN3 rl() {
        if (!this.nr) {
            f60568O.n("No recording has been started.");
            return CN3.n();
        }
        SparseIntArray[] sparseIntArrayArrRl = this.rl.rl();
        if (sparseIntArrayArrRl == null) {
            f60568O.n("FrameMetricsAggregator.mMetrics is uninitialized.");
            return CN3.n();
        }
        if (sparseIntArrayArrRl[0] != null) {
            return CN3.O(Wre.n(sparseIntArrayArrRl));
        }
        f60568O.n("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
        return CN3.n();
    }

    public CN3 J2(Fragment fragment) {
        if (!this.nr) {
            f60568O.n("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return CN3.n();
        }
        if (!this.f60570t.containsKey(fragment)) {
            f60568O.rl("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return CN3.n();
        }
        Wre.j jVar = (Wre.j) this.f60570t.remove(fragment);
        CN3 cn3Rl = rl();
        if (cn3Rl.nr()) {
            return CN3.O(((Wre.j) cn3Rl.t()).n(jVar));
        }
        f60568O.rl("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        return CN3.n();
    }

    public CN3 O() {
        if (!this.nr) {
            f60568O.n("Cannot stop because no recording was started");
            return CN3.n();
        }
        if (!this.f60570t.isEmpty()) {
            f60568O.n("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.f60570t.clear();
        }
        CN3 cn3Rl = rl();
        try {
            this.rl.t(this.f60569n);
        } catch (IllegalArgumentException | NullPointerException e2) {
            if ((e2 instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                throw e2;
            }
            f60568O.gh("View not hardware accelerated. Unable to collect FrameMetrics. %s", e2.toString());
            cn3Rl = CN3.n();
        }
        this.rl.nr();
        this.nr = false;
        return cn3Rl;
    }

    public void nr(Fragment fragment) {
        if (!this.nr) {
            f60568O.n("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (this.f60570t.containsKey(fragment)) {
            f60568O.rl("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        CN3 cn3Rl = rl();
        if (cn3Rl.nr()) {
            this.f60570t.put(fragment, (Wre.j) cn3Rl.t());
        } else {
            f60568O.rl("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }

    public void t() {
        if (this.nr) {
            f60568O.rl("FrameMetricsAggregator is already recording %s", this.f60569n.getClass().getSimpleName());
        } else {
            this.rl.n(this.f60569n);
            this.nr = true;
        }
    }
}
