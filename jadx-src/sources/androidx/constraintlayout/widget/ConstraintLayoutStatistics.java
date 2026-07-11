package androidx.constraintlayout.widget;

import androidx.constraintlayout.core.Metrics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class ConstraintLayoutStatistics {
    private static final String rl = new String(new char[25]).replace((char) 0, ' ');

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Metrics f35961n;

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ConstraintLayoutStatistics clone() {
        return new ConstraintLayoutStatistics(this);
    }

    public ConstraintLayoutStatistics(ConstraintLayoutStatistics constraintLayoutStatistics) {
        Metrics metrics = new Metrics();
        this.f35961n = metrics;
        metrics.n(constraintLayoutStatistics.f35961n);
    }
}
