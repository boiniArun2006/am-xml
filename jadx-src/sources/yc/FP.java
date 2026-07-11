package yc;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class FP implements RecyclerView.OnItemTouchListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private j f75734n;
    private final GestureDetector rl;

    public interface j {
        void n(View view, int i2);

        void rl(View view, int i2);
    }

    public static final class n extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ RecyclerView f75735n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ FP f75736t;

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e2) {
            Intrinsics.checkNotNullParameter(e2, "e");
            return true;
        }

        n(RecyclerView recyclerView, FP fp) {
            this.f75735n = recyclerView;
            this.f75736t = fp;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent e2) {
            Intrinsics.checkNotNullParameter(e2, "e");
            View viewFindChildViewUnder = this.f75735n.findChildViewUnder(e2.getX(), e2.getY());
            if (viewFindChildViewUnder != null) {
                this.f75736t.rl().rl(viewFindChildViewUnder, this.f75735n.getChildAdapterPosition(viewFindChildViewUnder));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void O(boolean z2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void n(RecyclerView view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
    }

    public FP(Context context, RecyclerView recyclerView, j listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f75734n = listener;
        this.rl = new GestureDetector(context, new n(recyclerView, this));
    }

    public final j rl() {
        return this.f75734n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean t(RecyclerView view, MotionEvent e2) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(e2, "e");
        View viewFindChildViewUnder = view.findChildViewUnder(e2.getX(), e2.getY());
        if (viewFindChildViewUnder == null || !this.rl.onTouchEvent(e2)) {
            return false;
        }
        this.f75734n.n(viewFindChildViewUnder, view.getChildAdapterPosition(viewFindChildViewUnder));
        return true;
    }
}
