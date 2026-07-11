package androidx.recyclerview.widget;

import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class ListAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final AsyncListDiffer f41125n;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ListAdapter$1, reason: invalid class name */
    class AnonymousClass1 implements AsyncListDiffer.ListListener<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ListAdapter f41126n;

        @Override // androidx.recyclerview.widget.AsyncListDiffer.ListListener
        public void n(List list, List list2) {
            this.f41126n.qie(list, list2);
        }
    }

    public void qie(List list, List list2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f41125n.n().size();
    }
}
