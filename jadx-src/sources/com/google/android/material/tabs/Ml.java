package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Ml {
    private RecyclerView.Adapter J2;
    private w6 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final n f59208O;
    private boolean Uo;
    private RecyclerView.AdapterDataObserver mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TabLayout f59209n;
    private final boolean nr;
    private final ViewPager2 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f59210t;
    private TabLayout.Ml xMQ;

    /* JADX INFO: renamed from: com.google.android.material.tabs.Ml$Ml, reason: collision with other inner class name */
    private static class C0791Ml implements TabLayout.Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ViewPager2 f59211n;
        private final boolean rl;

        @Override // com.google.android.material.tabs.TabLayout.w6
        public void rl(TabLayout.CN3 cn3) {
        }

        @Override // com.google.android.material.tabs.TabLayout.w6
        public void t(TabLayout.CN3 cn3) {
        }

        @Override // com.google.android.material.tabs.TabLayout.w6
        public void n(TabLayout.CN3 cn3) {
            this.f59211n.mUb(cn3.Uo(), this.rl);
        }

        C0791Ml(ViewPager2 viewPager2, boolean z2) {
            this.f59211n = viewPager2;
            this.rl = z2;
        }
    }

    private class j extends RecyclerView.AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i2, int i3) {
            Ml.this.rl();
        }

        j() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            Ml.this.rl();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i2, int i3, Object obj) {
            Ml.this.rl();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i2, int i3) {
            Ml.this.rl();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i2, int i3, int i5) {
            Ml.this.rl();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i2, int i3) {
            Ml.this.rl();
        }
    }

    public interface n {
        void n(TabLayout.CN3 cn3, int i2);
    }

    private static class w6 extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final WeakReference f59213n;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f59214t;

        void nr() {
            this.f59214t = 0;
            this.rl = 0;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void n(int i2) {
            this.rl = this.f59214t;
            this.f59214t = i2;
            TabLayout tabLayout = (TabLayout) this.f59213n.get();
            if (tabLayout != null) {
                tabLayout.M7(this.f59214t);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void rl(int i2, float f3, int i3) {
            boolean z2;
            TabLayout tabLayout = (TabLayout) this.f59213n.get();
            if (tabLayout != null) {
                int i5 = this.f59214t;
                boolean z3 = true;
                if (i5 != 2 || this.rl == 1) {
                    z2 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i5 == 2 && this.rl == 0) {
                    z2 = false;
                }
                tabLayout.rV9(i2, f3, z3, z2, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void t(int i2) {
            TabLayout tabLayout = (TabLayout) this.f59213n.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i2 || i2 >= tabLayout.getTabCount()) {
                return;
            }
            int i3 = this.f59214t;
            tabLayout.nHg(tabLayout.nY(i2), i3 == 0 || (i3 == 2 && this.rl == 0));
        }

        w6(TabLayout tabLayout) {
            this.f59213n = new WeakReference(tabLayout);
            nr();
        }
    }

    public Ml(TabLayout tabLayout, ViewPager2 viewPager2, n nVar) {
        this(tabLayout, viewPager2, true, nVar);
    }

    public Ml(TabLayout tabLayout, ViewPager2 viewPager2, boolean z2, n nVar) {
        this(tabLayout, viewPager2, z2, true, nVar);
    }

    public void n() {
        if (this.Uo) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        RecyclerView.Adapter adapter = this.rl.getAdapter();
        this.J2 = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.Uo = true;
        w6 w6Var = new w6(this.f59209n);
        this.KN = w6Var;
        this.rl.Uo(w6Var);
        C0791Ml c0791Ml = new C0791Ml(this.rl, this.nr);
        this.xMQ = c0791Ml;
        this.f59209n.KN(c0791Ml);
        if (this.f59210t) {
            j jVar = new j();
            this.mUb = jVar;
            this.J2.registerAdapterDataObserver(jVar);
        }
        rl();
        this.f59209n.wTp(this.rl.getCurrentItem(), 0.0f, true);
    }

    void rl() {
        this.f59209n.e();
        RecyclerView.Adapter adapter = this.J2;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i2 = 0; i2 < itemCount; i2++) {
                TabLayout.CN3 cn3IF = this.f59209n.iF();
                this.f59208O.n(cn3IF, i2);
                this.f59209n.mUb(cn3IF, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.rl.getCurrentItem(), this.f59209n.getTabCount() - 1);
                if (iMin != this.f59209n.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f59209n;
                    tabLayout.N(tabLayout.nY(iMin));
                }
            }
        }
    }

    public Ml(TabLayout tabLayout, ViewPager2 viewPager2, boolean z2, boolean z3, n nVar) {
        this.f59209n = tabLayout;
        this.rl = viewPager2;
        this.f59210t = z2;
        this.nr = z3;
        this.f59208O = nVar;
    }
}
