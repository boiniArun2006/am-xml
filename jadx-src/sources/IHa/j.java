package IHa;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Integer f4144n;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void Uo(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int dimensionPixelSize;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = parent.getAdapter();
        if (childAdapterPosition == -1 || adapter == null) {
            return;
        }
        Integer num = this.f4144n;
        if (num != null) {
            dimensionPixelSize = parent.getContext().getResources().getDimensionPixelSize(num.intValue());
        } else {
            dimensionPixelSize = 0;
        }
        int i2 = dimensionPixelSize / 2;
        if (childAdapterPosition == 0) {
            outRect.set(qie(parent, view), 0, i2, 0);
        } else if (childAdapterPosition == adapter.getItemCount() - 1) {
            outRect.set(i2, 0, qie(parent, view), 0);
        } else {
            outRect.set(i2, 0, i2, 0);
        }
    }

    public j(Integer num) {
        this.f4144n = num;
    }

    private final int qie(RecyclerView recyclerView, View view) {
        return (OrientationHelper.n(recyclerView.getLayoutManager()).ty() - view.getLayoutParams().width) / 2;
    }
}
