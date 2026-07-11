package yc;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class xq extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f76157n;
    private final int nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f76158t;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void Uo(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.Uo(outRect, view, parent, state);
        outRect.set(this.f76157n, this.f76158t, this.rl, this.nr);
    }

    public xq(int i2, int i3, int i5, int i7) {
        this.f76157n = i2;
        this.rl = i3;
        this.f76158t = i5;
        this.nr = i7;
    }
}
