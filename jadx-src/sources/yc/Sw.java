package yc;

import android.graphics.Canvas;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class Sw extends ItemTouchHelper.Callback {
    private int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f75851O;
    private final rfW nr;

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean Ik() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean r() {
        return true;
    }

    public Sw(rfW adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.nr = adapter;
        this.J2 = -1;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean ViF(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        Intrinsics.checkNotNullParameter(recyclerView, HrvQKfmFZJudBc.xSA);
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(target, "target");
        this.nr.gh(viewHolder.getBindingAdapterPosition(), target.getBindingAdapterPosition());
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void XQ(Canvas c2, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f3, float f4, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.XQ(c2, recyclerView, viewHolder, f3, f4, i2, z2);
        this.f75851O = viewHolder.itemView.getY();
        this.J2 = viewHolder.getBindingAdapterPosition();
    }

    public final float fD() {
        return this.f75851O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void g(RecyclerView.ViewHolder viewHolder, int i2) {
        if (i2 != 0 && (viewHolder instanceof tmw)) {
            ((tmw) viewHolder).rl();
        }
        super.g(viewHolder, i2);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int gh(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        return ItemTouchHelper.Callback.Z(15, 48);
    }

    public final int iF() {
        return this.J2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void t(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.t(recyclerView, viewHolder);
        if (viewHolder instanceof tmw) {
            ((tmw) viewHolder).n();
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void te(RecyclerView.ViewHolder viewHolder, int i2) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.nr.O(viewHolder.getBindingAdapterPosition());
    }
}
