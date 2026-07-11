package D5a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class fg implements RecyclerView.OnItemTouchListener {
    private float J2;
    private final int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f1346O;
    private float Uo;
    private float gh;
    private float mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private M5 f1347n;
    private boolean nr;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1348t;
    private final int xMQ;

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void O(boolean z2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void n(RecyclerView rv, MotionEvent e2) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        Intrinsics.checkNotNullParameter(e2, "e");
    }

    public fg(Context context, M5 listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f1347n = listener;
        this.f1348t = context.getResources().getDimensionPixelOffset(2131166407);
        this.rl = ViewConfiguration.get(context).getScaledTouchSlop();
        this.KN = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.xMQ = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private final boolean rl(RecyclerView recyclerView) {
        float f3 = this.f1348t;
        float f4 = this.mUb;
        return (0.0f <= f4 && f4 <= f3) || recyclerView.computeVerticalScrollOffset() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean t(RecyclerView rv, MotionEvent e2) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        Intrinsics.checkNotNullParameter(e2, "e");
        int actionMasked = e2.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                if (this.nr) {
                    int i2 = this.KN;
                    int i3 = this.xMQ;
                    int i5 = (int) this.Uo;
                    if (i2 > i5 || i5 > i3) {
                        this.f1347n.o(-1.0f, true, this.f1346O, false);
                    } else {
                        this.f1347n.o(-1.0f, true, this.f1346O, true);
                    }
                }
                this.nr = false;
                this.f1346O = false;
            } else if (actionMasked == 2) {
                float rawY = e2.getRawY() - this.J2;
                this.J2 = e2.getRawY();
                float rawY2 = e2.getRawY() - this.gh;
                this.Uo = rawY2;
                if ((Math.abs(rawY2) > this.rl || this.nr) && rl(rv)) {
                    if (!this.nr) {
                        this.nr = true;
                    }
                    if (!this.f1346O) {
                        this.f1346O = rawY > 0.0f;
                    }
                    this.f1347n.o(rawY, false, this.f1346O, false);
                }
            }
        } else {
            this.nr = false;
            this.f1346O = false;
            this.J2 = e2.getRawY();
            this.mUb = e2.getY();
            this.gh = e2.getRawY();
            this.Uo = 0.0f;
        }
        return false;
    }
}
