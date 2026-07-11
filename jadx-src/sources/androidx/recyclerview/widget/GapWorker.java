package androidx.recyclerview.widget;

import android.os.Trace;
import androidx.core.os.TraceCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class GapWorker implements Runnable {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    long f41065O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    long f41067t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final ThreadLocal f41064r = new ThreadLocal();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static Comparator f41063o = new Comparator<Task>() { // from class: androidx.recyclerview.widget.GapWorker.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compare(Task task, Task task2) {
            RecyclerView recyclerView = task.nr;
            if ((recyclerView == null) != (task2.nr == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z2 = task.f41071n;
            if (z2 != task2.f41071n) {
                return z2 ? -1 : 1;
            }
            int i2 = task2.rl - task.rl;
            if (i2 != 0) {
                return i2;
            }
            int i3 = task.f41072t - task2.f41072t;
            if (i3 != 0) {
                return i3;
            }
            return 0;
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ArrayList f41066n = new ArrayList();
    private final ArrayList J2 = new ArrayList();

    static class LayoutPrefetchRegistryImpl implements RecyclerView.LayoutManager.LayoutPrefetchRegistry {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f41068n;
        int nr;
        int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int[] f41069t;

        void t(RecyclerView recyclerView, boolean z2) {
            this.nr = 0;
            int[] iArr = this.f41069t;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || layoutManager == null || !layoutManager.hRu()) {
                return;
            }
            if (z2) {
                if (!recyclerView.mAdapterHelper.ck()) {
                    layoutManager.fD(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                layoutManager.iF(this.f41068n, this.rl, recyclerView.mState, this);
            }
            int i2 = this.nr;
            if (i2 > layoutManager.az) {
                layoutManager.az = i2;
                layoutManager.ty = z2;
                recyclerView.mRecycler.Xw();
            }
        }

        void O(int i2, int i3) {
            this.f41068n = i2;
            this.rl = i3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry
        public void n(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i3 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i5 = this.nr;
            int i7 = i5 * 2;
            int[] iArr = this.f41069t;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f41069t = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i7 >= iArr.length) {
                int[] iArr3 = new int[i5 * 4];
                this.f41069t = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f41069t;
            iArr4[i7] = i2;
            iArr4[i7 + 1] = i3;
            this.nr++;
        }

        boolean nr(int i2) {
            if (this.f41069t != null) {
                int i3 = this.nr * 2;
                for (int i5 = 0; i5 < i3; i5 += 2) {
                    if (this.f41069t[i5] == i2) {
                        return true;
                    }
                }
            }
            return false;
        }

        void rl() {
            int[] iArr = this.f41069t;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.nr = 0;
        }

        LayoutPrefetchRegistryImpl() {
        }
    }

    private void nr(long j2) {
        for (int i2 = 0; i2 < this.J2.size(); i2++) {
            Task task = (Task) this.J2.get(i2);
            if (task.nr == null) {
                return;
            }
            t(task, j2);
            task.n();
        }
    }

    static class Task {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f41070O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f41071n;
        public RecyclerView nr;
        public int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f41072t;

        public void n() {
            this.f41071n = false;
            this.rl = 0;
            this.f41072t = 0;
            this.nr = null;
            this.f41070O = 0;
        }

        Task() {
        }
    }

    private void KN(RecyclerView recyclerView, long j2) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.mUb() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView.mPrefetchRegistry;
        layoutPrefetchRegistryImpl.t(recyclerView, true);
        if (layoutPrefetchRegistryImpl.nr != 0) {
            try {
                Trace.beginSection(j2 == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                recyclerView.mState.J2(recyclerView.mAdapter);
                for (int i2 = 0; i2 < layoutPrefetchRegistryImpl.nr * 2; i2 += 2) {
                    xMQ(recyclerView, layoutPrefetchRegistryImpl.f41069t[i2], j2);
                }
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    static boolean O(RecyclerView recyclerView, int i2) {
        int iMUb = recyclerView.mChildHelper.mUb();
        for (int i3 = 0; i3 < iMUb; i3++) {
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.xMQ(i3));
            if (childViewHolderInt.mPosition == i2 && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private void rl() {
        Task task;
        int size = this.f41066n.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView = (RecyclerView) this.f41066n.get(i3);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.t(recyclerView, false);
                i2 += recyclerView.mPrefetchRegistry.nr;
            }
        }
        this.J2.ensureCapacity(i2);
        int i5 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f41066n.get(i7);
            if (recyclerView2.getWindowVisibility() == 0) {
                LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView2.mPrefetchRegistry;
                int iAbs = Math.abs(layoutPrefetchRegistryImpl.f41068n) + Math.abs(layoutPrefetchRegistryImpl.rl);
                for (int i8 = 0; i8 < layoutPrefetchRegistryImpl.nr * 2; i8 += 2) {
                    if (i5 >= this.J2.size()) {
                        task = new Task();
                        this.J2.add(task);
                    } else {
                        task = (Task) this.J2.get(i5);
                    }
                    int[] iArr = layoutPrefetchRegistryImpl.f41069t;
                    int i9 = iArr[i8 + 1];
                    task.f41071n = i9 <= iAbs;
                    task.rl = iAbs;
                    task.f41072t = i9;
                    task.nr = recyclerView2;
                    task.f41070O = iArr[i8];
                    i5++;
                }
            }
        }
        Collections.sort(this.J2, f41063o);
    }

    private void t(Task task, long j2) {
        RecyclerView.ViewHolder viewHolderXMQ = xMQ(task.nr, task.f41070O, task.f41071n ? Long.MAX_VALUE : j2);
        if (viewHolderXMQ == null || viewHolderXMQ.mNestedRecyclerView == null || !viewHolderXMQ.isBound() || viewHolderXMQ.isInvalid()) {
            return;
        }
        KN(viewHolderXMQ.mNestedRecyclerView.get(), j2);
    }

    public void mUb(RecyclerView recyclerView) {
        boolean zRemove = this.f41066n.remove(recyclerView);
        if (RecyclerView.sDebugAssertionsEnabled && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    public void n(RecyclerView recyclerView) {
        if (RecyclerView.sDebugAssertionsEnabled && this.f41066n.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f41066n.add(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Trace.beginSection("RV Prefetch");
            if (!this.f41066n.isEmpty()) {
                int size = this.f41066n.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) this.f41066n.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    Uo(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f41065O);
                }
            }
        } finally {
            this.f41067t = 0L;
            Trace.endSection();
        }
    }

    GapWorker() {
    }

    private RecyclerView.ViewHolder xMQ(RecyclerView recyclerView, int i2, long j2) {
        if (O(recyclerView, i2)) {
            return null;
        }
        RecyclerView.Recycler recycler = recyclerView.mRecycler;
        if (j2 == Long.MAX_VALUE) {
            try {
                if (TraceCompat.t()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th) {
                recyclerView.onExitLayoutOrScroll(false);
                Trace.endSection();
                throw th;
            }
        }
        recyclerView.onEnterLayoutOrScroll();
        RecyclerView.ViewHolder viewHolderRV9 = recycler.rV9(i2, false, j2);
        if (viewHolderRV9 != null) {
            if (viewHolderRV9.isBound() && !viewHolderRV9.isInvalid()) {
                recycler.X(viewHolderRV9.itemView);
            } else {
                recycler.n(viewHolderRV9, false);
            }
        }
        recyclerView.onExitLayoutOrScroll(false);
        Trace.endSection();
        return viewHolderRV9;
    }

    void J2(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.f41066n.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f41067t == 0) {
                this.f41067t = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.mPrefetchRegistry.O(i2, i3);
    }

    void Uo(long j2) {
        rl();
        nr(j2);
    }
}
