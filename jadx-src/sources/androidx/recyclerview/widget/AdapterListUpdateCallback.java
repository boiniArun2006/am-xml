package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class AdapterListUpdateCallback implements ListUpdateCallback {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RecyclerView.Adapter f40970n;

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void n(int i2, int i3) {
        this.f40970n.notifyItemRangeInserted(i2, i3);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void nr(int i2, int i3) {
        this.f40970n.notifyItemMoved(i2, i3);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void rl(int i2, int i3) {
        this.f40970n.notifyItemRangeRemoved(i2, i3);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void t(int i2, int i3, Object obj) {
        this.f40970n.notifyItemRangeChanged(i2, i3, obj);
    }

    public AdapterListUpdateCallback(RecyclerView.Adapter adapter) {
        this.f40970n = adapter;
    }
}
