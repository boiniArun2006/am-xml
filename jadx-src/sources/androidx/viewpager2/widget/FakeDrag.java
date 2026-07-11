package androidx.viewpager2.widget;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class FakeDrag {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ViewPager2 f42439n;
    private final ScrollEventAdapter rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final RecyclerView f42440t;

    boolean n() {
        return this.rl.xMQ();
    }

    FakeDrag(ViewPager2 viewPager2, ScrollEventAdapter scrollEventAdapter, RecyclerView recyclerView) {
        this.f42439n = viewPager2;
        this.rl = scrollEventAdapter;
        this.f42440t = recyclerView;
    }
}
