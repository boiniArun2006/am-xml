package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SortedList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class SortedListAdapterCallback<T2> extends SortedList.Callback<T2> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final RecyclerView.Adapter f41202n;

    @Override // androidx.recyclerview.widget.SortedList.Callback
    public void O(int i2, int i3) {
        this.f41202n.notifyItemRangeChanged(i2, i3);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void n(int i2, int i3) {
        this.f41202n.notifyItemRangeInserted(i2, i3);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void nr(int i2, int i3) {
        this.f41202n.notifyItemMoved(i2, i3);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void rl(int i2, int i3) {
        this.f41202n.notifyItemRangeRemoved(i2, i3);
    }

    @Override // androidx.recyclerview.widget.SortedList.Callback, androidx.recyclerview.widget.ListUpdateCallback
    public void t(int i2, int i3, Object obj) {
        this.f41202n.notifyItemRangeChanged(i2, i3, obj);
    }
}
