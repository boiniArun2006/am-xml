package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.core.util.Preconditions;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StableIdStorage;
import androidx.recyclerview.widget.ViewTypeStorage;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class NestedAdapterWrapper {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f41138O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ViewTypeStorage.ViewTypeLookup f41139n;
    final Callback nr;
    private final StableIdStorage.StableIdLookup rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RecyclerView.Adapter f41140t;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.NestedAdapterWrapper$1, reason: invalid class name */
    class AnonymousClass1 extends RecyclerView.AdapterDataObserver {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ NestedAdapterWrapper f41141n;

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i2, int i3) {
            NestedAdapterWrapper nestedAdapterWrapper = this.f41141n;
            nestedAdapterWrapper.nr.n(nestedAdapterWrapper, i2, i3, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i2, int i3, int i5) {
            Preconditions.rl(i5 == 1, "moving more than 1 item is not supported in RecyclerView");
            NestedAdapterWrapper nestedAdapterWrapper = this.f41141n;
            nestedAdapterWrapper.nr.t(nestedAdapterWrapper, i2, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            NestedAdapterWrapper nestedAdapterWrapper = this.f41141n;
            nestedAdapterWrapper.f41138O = nestedAdapterWrapper.f41140t.getItemCount();
            NestedAdapterWrapper nestedAdapterWrapper2 = this.f41141n;
            nestedAdapterWrapper2.nr.O(nestedAdapterWrapper2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i2, int i3, Object obj) {
            NestedAdapterWrapper nestedAdapterWrapper = this.f41141n;
            nestedAdapterWrapper.nr.n(nestedAdapterWrapper, i2, i3, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i2, int i3) {
            NestedAdapterWrapper nestedAdapterWrapper = this.f41141n;
            nestedAdapterWrapper.f41138O += i3;
            nestedAdapterWrapper.nr.rl(nestedAdapterWrapper, i2, i3);
            NestedAdapterWrapper nestedAdapterWrapper2 = this.f41141n;
            if (nestedAdapterWrapper2.f41138O <= 0 || nestedAdapterWrapper2.f41140t.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            NestedAdapterWrapper nestedAdapterWrapper3 = this.f41141n;
            nestedAdapterWrapper3.nr.nr(nestedAdapterWrapper3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i2, int i3) {
            NestedAdapterWrapper nestedAdapterWrapper = this.f41141n;
            nestedAdapterWrapper.f41138O -= i3;
            nestedAdapterWrapper.nr.J2(nestedAdapterWrapper, i2, i3);
            NestedAdapterWrapper nestedAdapterWrapper2 = this.f41141n;
            if (nestedAdapterWrapper2.f41138O >= 1 || nestedAdapterWrapper2.f41140t.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            NestedAdapterWrapper nestedAdapterWrapper3 = this.f41141n;
            nestedAdapterWrapper3.nr.nr(nestedAdapterWrapper3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onStateRestorationPolicyChanged() {
            NestedAdapterWrapper nestedAdapterWrapper = this.f41141n;
            nestedAdapterWrapper.nr.nr(nestedAdapterWrapper);
        }
    }

    interface Callback {
        void J2(NestedAdapterWrapper nestedAdapterWrapper, int i2, int i3);

        void O(NestedAdapterWrapper nestedAdapterWrapper);

        void n(NestedAdapterWrapper nestedAdapterWrapper, int i2, int i3, Object obj);

        void nr(NestedAdapterWrapper nestedAdapterWrapper);

        void rl(NestedAdapterWrapper nestedAdapterWrapper, int i2, int i3);

        void t(NestedAdapterWrapper nestedAdapterWrapper, int i2, int i3);
    }

    RecyclerView.ViewHolder O(ViewGroup viewGroup, int i2) {
        return this.f41140t.onCreateViewHolder(viewGroup, this.f41139n.n(i2));
    }

    int n() {
        return this.f41138O;
    }

    void nr(RecyclerView.ViewHolder viewHolder, int i2) {
        this.f41140t.bindViewHolder(viewHolder, i2);
    }

    public long rl(int i2) {
        return this.rl.n(this.f41140t.getItemId(i2));
    }

    int t(int i2) {
        return this.f41139n.rl(this.f41140t.getItemViewType(i2));
    }
}
