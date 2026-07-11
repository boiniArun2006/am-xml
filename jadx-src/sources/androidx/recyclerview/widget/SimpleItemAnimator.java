package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class SimpleItemAnimator extends RecyclerView.ItemAnimator {
    boolean Uo = true;

    public abstract boolean ViF(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i5, int i7);

    public void Xw(RecyclerView.ViewHolder viewHolder) {
    }

    public abstract boolean aYN(RecyclerView.ViewHolder viewHolder);

    public void bzg(RecyclerView.ViewHolder viewHolder) {
    }

    public abstract boolean g(RecyclerView.ViewHolder viewHolder);

    public void jB(RecyclerView.ViewHolder viewHolder) {
    }

    public void nHg(RecyclerView.ViewHolder viewHolder) {
    }

    public abstract boolean nY(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i5, int i7);

    public void rV9(RecyclerView.ViewHolder viewHolder) {
    }

    public void s7N(RecyclerView.ViewHolder viewHolder) {
    }

    public void v(RecyclerView.ViewHolder viewHolder, boolean z2) {
    }

    public void wTp(RecyclerView.ViewHolder viewHolder, boolean z2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean J2(RecyclerView.ViewHolder viewHolder) {
        return !this.Uo || viewHolder.isInvalid();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean n(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i2;
        int i3;
        return (itemHolderInfo == null || ((i2 = itemHolderInfo.f41158n) == (i3 = itemHolderInfo2.f41158n) && itemHolderInfo.rl == itemHolderInfo2.rl)) ? aYN(viewHolder) : nY(viewHolder, i2, itemHolderInfo.rl, i3, itemHolderInfo2.rl);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean nr(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i2 = itemHolderInfo.f41158n;
        int i3 = itemHolderInfo2.f41158n;
        if (i2 != i3 || itemHolderInfo.rl != itemHolderInfo2.rl) {
            return nY(viewHolder, i2, itemHolderInfo.rl, i3, itemHolderInfo2.rl);
        }
        e(viewHolder);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean rl(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i2;
        int i3;
        int i5 = itemHolderInfo.f41158n;
        int i7 = itemHolderInfo.rl;
        if (viewHolder2.shouldIgnore()) {
            int i8 = itemHolderInfo.f41158n;
            i3 = itemHolderInfo.rl;
            i2 = i8;
        } else {
            i2 = itemHolderInfo2.f41158n;
            i3 = itemHolderInfo2.rl;
        }
        return ViF(viewHolder, viewHolder2, i5, i7, i2, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean t(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i2 = itemHolderInfo.f41158n;
        int i3 = itemHolderInfo.rl;
        View view = viewHolder.itemView;
        int left = itemHolderInfo2 == null ? view.getLeft() : itemHolderInfo2.f41158n;
        int top = itemHolderInfo2 == null ? view.getTop() : itemHolderInfo2.rl;
        if (viewHolder.isRemoved() || (i2 == left && i3 == top)) {
            return g(viewHolder);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return nY(viewHolder, i2, i3, left, top);
    }

    public final void E2(RecyclerView.ViewHolder viewHolder, boolean z2) {
        v(viewHolder, z2);
    }

    public final void N(RecyclerView.ViewHolder viewHolder) {
        jB(viewHolder);
    }

    public final void T(RecyclerView.ViewHolder viewHolder) {
        Xw(viewHolder);
        KN(viewHolder);
    }

    public final void X(RecyclerView.ViewHolder viewHolder) {
        bzg(viewHolder);
    }

    public final void e(RecyclerView.ViewHolder viewHolder) {
        rV9(viewHolder);
        KN(viewHolder);
    }

    public final void fD(RecyclerView.ViewHolder viewHolder, boolean z2) {
        wTp(viewHolder, z2);
        KN(viewHolder);
    }

    public final void iF(RecyclerView.ViewHolder viewHolder) {
        s7N(viewHolder);
    }

    public final void te(RecyclerView.ViewHolder viewHolder) {
        nHg(viewHolder);
        KN(viewHolder);
    }
}
