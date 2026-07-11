package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.RequiresOptIn;
import androidx.collection.ArraySet;
import androidx.collection.LongSparseArray;
import androidx.core.util.Preconditions;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.Lifecycle;
import androidx.view.LifecycleEventObserver;
import androidx.view.LifecycleOwner;
import androidx.viewpager2.widget.ViewPager2;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class FragmentStateAdapter extends RecyclerView.Adapter<FragmentViewHolder> implements StatefulAdapter {
    private FragmentMaxLifecycleEnforcer J2;
    boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final LongSparseArray f42416O;
    FragmentEventDispatcher Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Lifecycle f42417n;
    private final LongSparseArray nr;
    final FragmentManager rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final LongSparseArray f42418t;
    private boolean xMQ;

    private static abstract class DataSetChangeObserver extends RecyclerView.AdapterDataObserver {
        private DataSetChangeObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i2, int i3, Object obj) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i2, int i3, int i5) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i2, int i3) {
            onChanged();
        }
    }

    @RequiresOptIn
    public @interface ExperimentalFragmentStateAdapterApi {
    }

    static class FragmentEventDispatcher {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List f42427n = new CopyOnWriteArrayList();

        public List O(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f42427n.iterator();
            while (it.hasNext()) {
                arrayList.add(((FragmentTransactionCallback) it.next()).nr(fragment));
            }
            return arrayList;
        }

        public List n(Fragment fragment, Lifecycle.State state) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f42427n.iterator();
            while (it.hasNext()) {
                arrayList.add(((FragmentTransactionCallback) it.next()).n(fragment, state));
            }
            return arrayList;
        }

        public List nr(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f42427n.iterator();
            while (it.hasNext()) {
                arrayList.add(((FragmentTransactionCallback) it.next()).t(fragment));
            }
            return arrayList;
        }

        public List t(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f42427n.iterator();
            while (it.hasNext()) {
                arrayList.add(((FragmentTransactionCallback) it.next()).rl(fragment));
            }
            return arrayList;
        }

        FragmentEventDispatcher() {
        }

        public void rl(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((FragmentTransactionCallback.OnPostEventListener) it.next()).n();
            }
        }
    }

    class FragmentMaxLifecycleEnforcer {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private long f42428O = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ViewPager2.OnPageChangeCallback f42429n;
        private ViewPager2 nr;
        private RecyclerView.AdapterDataObserver rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private LifecycleEventObserver f42430t;

        FragmentMaxLifecycleEnforcer() {
        }

        void nr(boolean z2) {
            int currentItem;
            Fragment fragment;
            if (FragmentStateAdapter.this.E2() || this.nr.getScrollState() != 0 || FragmentStateAdapter.this.f42418t.xMQ() || FragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.nr.getCurrentItem()) >= FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            long itemId = FragmentStateAdapter.this.getItemId(currentItem);
            if ((itemId != this.f42428O || z2) && (fragment = (Fragment) FragmentStateAdapter.this.f42418t.O(itemId)) != null && fragment.isAdded()) {
                this.f42428O = itemId;
                FragmentTransaction fragmentTransactionO = FragmentStateAdapter.this.rl.o();
                ArrayList arrayList = new ArrayList();
                Fragment fragment2 = null;
                for (int i2 = 0; i2 < FragmentStateAdapter.this.f42418t.ty(); i2++) {
                    long jMUb = FragmentStateAdapter.this.f42418t.mUb(i2);
                    Fragment fragment3 = (Fragment) FragmentStateAdapter.this.f42418t.HI(i2);
                    if (fragment3.isAdded()) {
                        if (jMUb != this.f42428O) {
                            Lifecycle.State state = Lifecycle.State.J2;
                            fragmentTransactionO.aYN(fragment3, state);
                            arrayList.add(FragmentStateAdapter.this.Uo.n(fragment3, state));
                        } else {
                            fragment2 = fragment3;
                        }
                        fragment3.setMenuVisibility(jMUb == this.f42428O);
                    }
                }
                if (fragment2 != null) {
                    Lifecycle.State state2 = Lifecycle.State.f38884r;
                    fragmentTransactionO.aYN(fragment2, state2);
                    arrayList.add(FragmentStateAdapter.this.Uo.n(fragment2, state2));
                }
                if (fragmentTransactionO.Ik()) {
                    return;
                }
                fragmentTransactionO.qie();
                Collections.reverse(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    FragmentStateAdapter.this.Uo.rl((List) it.next());
                }
            }
        }

        private ViewPager2 n(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        void rl(RecyclerView recyclerView) {
            this.nr = n(recyclerView);
            ViewPager2.OnPageChangeCallback onPageChangeCallback = new ViewPager2.OnPageChangeCallback() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.1
                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void n(int i2) {
                    FragmentMaxLifecycleEnforcer.this.nr(false);
                }

                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void t(int i2) {
                    FragmentMaxLifecycleEnforcer.this.nr(false);
                }
            };
            this.f42429n = onPageChangeCallback;
            this.nr.Uo(onPageChangeCallback);
            DataSetChangeObserver dataSetChangeObserver = new DataSetChangeObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.2
                @Override // androidx.viewpager2.adapter.FragmentStateAdapter.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onChanged() {
                    FragmentMaxLifecycleEnforcer.this.nr(true);
                }
            };
            this.rl = dataSetChangeObserver;
            FragmentStateAdapter.this.registerAdapterDataObserver(dataSetChangeObserver);
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // androidx.view.LifecycleEventObserver
                public void Z(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    FragmentMaxLifecycleEnforcer.this.nr(false);
                }
            };
            this.f42430t = lifecycleEventObserver;
            FragmentStateAdapter.this.f42417n.n(lifecycleEventObserver);
        }

        void t(RecyclerView recyclerView) {
            n(recyclerView).ty(this.f42429n);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.rl);
            FragmentStateAdapter.this.f42417n.nr(this.f42430t);
            this.nr = null;
        }
    }

    public static abstract class FragmentTransactionCallback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final OnPostEventListener f42434n = new OnPostEventListener() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.1
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener
            public void n() {
            }
        };

        public interface OnPostEventListener {
            void n();
        }

        public OnPostEventListener n(Fragment fragment, Lifecycle.State state) {
            return f42434n;
        }

        public OnPostEventListener nr(Fragment fragment) {
            return f42434n;
        }

        public OnPostEventListener rl(Fragment fragment) {
            return f42434n;
        }

        public OnPostEventListener t(Fragment fragment) {
            return f42434n;
        }
    }

    public FragmentStateAdapter(Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycleRegistry());
    }

    private Long Z(int i2) {
        Long lValueOf = null;
        for (int i3 = 0; i3 < this.f42416O.ty(); i3++) {
            if (((Integer) this.f42416O.HI(i3)).intValue() == i2) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.f42416O.mUb(i3));
            }
        }
        return lValueOf;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: WPU, reason: merged with bridge method [inline-methods] */
    public final boolean onFailedToRecycleView(FragmentViewHolder fragmentViewHolder) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    public abstract Fragment ty(int i2);

    public FragmentStateAdapter(FragmentManager fragmentManager, Lifecycle lifecycle) {
        this.f42418t = new LongSparseArray();
        this.nr = new LongSparseArray();
        this.f42416O = new LongSparseArray();
        this.Uo = new FragmentEventDispatcher();
        this.KN = false;
        this.xMQ = false;
        this.rl = fragmentManager;
        this.f42417n = lifecycle;
        super.setHasStableIds(true);
    }

    private static String HI(String str, long j2) {
        return str + j2;
    }

    private void fD(final Fragment fragment, final FrameLayout frameLayout) {
        this.rl.o9(new FragmentManager.FragmentLifecycleCallbacks() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
            @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
            public void az(FragmentManager fragmentManager, Fragment fragment2, View view, Bundle bundle) {
                if (fragment2 == fragment) {
                    fragmentManager.Ro(this);
                    FragmentStateAdapter.this.qie(view, frameLayout);
                }
            }
        }, false);
    }

    private void iF() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final Runnable runnable = new Runnable() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.3
            @Override // java.lang.Runnable
            public void run() {
                FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
                fragmentStateAdapter.KN = false;
                fragmentStateAdapter.Ik();
            }
        };
        this.f42417n.n(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.4
            @Override // androidx.view.LifecycleEventObserver
            public void Z(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    handler.removeCallbacks(runnable);
                    lifecycleOwner.getLifecycleRegistry().nr(this);
                }
            }
        });
        handler.postDelayed(runnable, 10000L);
    }

    private boolean r(long j2) {
        View view;
        if (this.f42416O.nr(j2)) {
            return true;
        }
        Fragment fragment = (Fragment) this.f42418t.O(j2);
        return (fragment == null || (view = fragment.getView()) == null || view.getParent() == null) ? false : true;
    }

    private void te(long j2) {
        ViewParent parent;
        Fragment fragment = (Fragment) this.f42418t.O(j2);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!az(j2)) {
            this.nr.qie(j2);
        }
        if (!fragment.isAdded()) {
            this.f42418t.qie(j2);
            return;
        }
        if (E2()) {
            this.xMQ = true;
            return;
        }
        if (fragment.isAdded() && az(j2)) {
            List listO = this.Uo.O(fragment);
            Fragment.SavedState savedStateLNy = this.rl.lNy(fragment);
            this.Uo.rl(listO);
            this.nr.gh(j2, savedStateLNy);
        }
        List listNr = this.Uo.nr(fragment);
        try {
            this.rl.o().r(fragment).qie();
            this.f42418t.qie(j2);
        } finally {
            this.Uo.rl(listNr);
        }
    }

    boolean E2() {
        return this.rl.p0N();
    }

    void Ik() {
        if (!this.xMQ || E2()) {
            return;
        }
        ArraySet arraySet = new ArraySet();
        for (int i2 = 0; i2 < this.f42418t.ty(); i2++) {
            long jMUb = this.f42418t.mUb(i2);
            if (!az(jMUb)) {
                arraySet.add(Long.valueOf(jMUb));
                this.f42416O.qie(jMUb);
            }
        }
        if (!this.KN) {
            this.xMQ = false;
            for (int i3 = 0; i3 < this.f42418t.ty(); i3++) {
                long jMUb2 = this.f42418t.mUb(i3);
                if (!r(jMUb2)) {
                    arraySet.add(Long.valueOf(jMUb2));
                }
            }
        }
        Iterator<E> it = arraySet.iterator();
        while (it.hasNext()) {
            te(((Long) it.next()).longValue());
        }
    }

    public boolean az(long j2) {
        return j2 >= 0 && j2 < ((long) getItemCount());
    }

    void g(final FragmentViewHolder fragmentViewHolder) {
        Fragment fragment = (Fragment) this.f42418t.O(fragmentViewHolder.getItemId());
        if (fragment == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayoutO = fragmentViewHolder.O();
        View view = fragment.getView();
        if (!fragment.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (fragment.isAdded() && view == null) {
            fD(fragment, frameLayoutO);
            return;
        }
        if (fragment.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayoutO) {
                qie(view, frameLayoutO);
                return;
            }
            return;
        }
        if (fragment.isAdded()) {
            qie(view, frameLayoutO);
            return;
        }
        if (E2()) {
            if (this.rl.a63()) {
                return;
            }
            this.f42417n.n(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.1
                @Override // androidx.view.LifecycleEventObserver
                public void Z(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (FragmentStateAdapter.this.E2()) {
                        return;
                    }
                    lifecycleOwner.getLifecycleRegistry().nr(this);
                    if (fragmentViewHolder.O().isAttachedToWindow()) {
                        FragmentStateAdapter.this.g(fragmentViewHolder);
                    }
                }
            });
            return;
        }
        fD(fragment, frameLayoutO);
        List listT = this.Uo.t(fragment);
        try {
            fragment.setMenuVisibility(false);
            this.rl.o().O(fragment, InneractiveMediationDefs.GENDER_FEMALE + fragmentViewHolder.getItemId()).aYN(fragment, Lifecycle.State.J2).qie();
            this.J2.nr(false);
        } finally {
            this.Uo.rl(listT);
        }
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final Parcelable n() {
        Bundle bundle = new Bundle(this.f42418t.ty() + this.nr.ty());
        for (int i2 = 0; i2 < this.f42418t.ty(); i2++) {
            long jMUb = this.f42418t.mUb(i2);
            Fragment fragment = (Fragment) this.f42418t.O(jMUb);
            if (fragment != null && fragment.isAdded()) {
                this.rl.v0j(bundle, HI("f#", jMUb), fragment);
            }
        }
        for (int i3 = 0; i3 < this.nr.ty(); i3++) {
            long jMUb2 = this.nr.mUb(i3);
            if (az(jMUb2)) {
                bundle.putParcelable(HI("s#", jMUb2), (Parcelable) this.nr.O(jMUb2));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Preconditions.n(this.J2 == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.J2 = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.rl(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.J2.t(recyclerView);
        this.J2 = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z2) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final void xMQ(Parcelable parcelable) {
        if (!this.nr.xMQ() || !this.f42418t.xMQ()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (o(str, "f#")) {
                this.f42418t.gh(nY(str, "f#"), this.rl.mYa(bundle, str));
            } else {
                if (!o(str, "s#")) {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
                long jNY = nY(str, "s#");
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                if (az(jNY)) {
                    this.nr.gh(jNY, savedState);
                }
            }
        }
        if (this.f42418t.xMQ()) {
            return;
        }
        this.xMQ = true;
        this.KN = true;
        Ik();
        iF();
    }

    private void ck(int i2) {
        long itemId = getItemId(i2);
        if (!this.f42418t.nr(itemId)) {
            Fragment fragmentTy = ty(i2);
            fragmentTy.setInitialSavedState((Fragment.SavedState) this.nr.O(itemId));
            this.f42418t.gh(itemId, fragmentTy);
        }
    }

    private static long nY(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private static boolean o(String str, String str2) {
        if (str.startsWith(str2) && str.length() > str2.length()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final FragmentViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return FragmentViewHolder.nr(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: ViF, reason: merged with bridge method [inline-methods] */
    public final void onViewRecycled(FragmentViewHolder fragmentViewHolder) {
        Long lZ = Z(fragmentViewHolder.O().getId());
        if (lZ != null) {
            te(lZ.longValue());
            this.f42416O.qie(lZ.longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: XQ, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(FragmentViewHolder fragmentViewHolder, int i2) {
        long itemId = fragmentViewHolder.getItemId();
        int id = fragmentViewHolder.O().getId();
        Long lZ = Z(id);
        if (lZ != null && lZ.longValue() != itemId) {
            te(lZ.longValue());
            this.f42416O.qie(lZ.longValue());
        }
        this.f42416O.gh(itemId, Integer.valueOf(id));
        ck(i2);
        if (fragmentViewHolder.O().isAttachedToWindow()) {
            g(fragmentViewHolder);
        }
        Ik();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: aYN, reason: merged with bridge method [inline-methods] */
    public final void onViewAttachedToWindow(FragmentViewHolder fragmentViewHolder) {
        g(fragmentViewHolder);
        Ik();
    }

    void qie(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }
}
