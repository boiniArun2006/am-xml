package androidx.recyclerview.widget;

import android.R;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class DividerItemDecoration extends RecyclerView.ItemDecoration {
    private static final int[] nr = {R.attr.listDivider};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Drawable f41049n;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rect f41050t;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void Uo(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Drawable drawable = this.f41049n;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.rl == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    private void az(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.f41050t);
            int iRound = this.f41050t.bottom + Math.round(childAt.getTranslationY());
            this.f41049n.setBounds(paddingLeft, iRound - this.f41049n.getIntrinsicHeight(), width, iRound);
            this.f41049n.draw(canvas);
        }
        canvas.restore();
    }

    private void qie(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.getLayoutManager().I(childAt, this.f41050t);
            int iRound = this.f41050t.right + Math.round(childAt.getTranslationX());
            this.f41049n.setBounds(iRound - this.f41049n.getIntrinsicWidth(), paddingTop, iRound, height);
            this.f41049n.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void xMQ(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (recyclerView.getLayoutManager() != null && this.f41049n != null) {
            if (this.rl == 1) {
                az(canvas, recyclerView);
            } else {
                qie(canvas, recyclerView);
            }
        }
    }
}
