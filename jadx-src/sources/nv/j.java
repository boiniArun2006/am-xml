package nv;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class j implements View.OnTouchListener {
    private final int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f71232O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Dialog f71233n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f71234t;

    public j(Dialog dialog, Rect rect) {
        this.f71233n = dialog;
        this.f71234t = rect.left;
        this.f71232O = rect.top;
        this.J2 = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f71234t + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.f71232O + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i2 = this.J2;
            motionEventObtain.setLocation((-i2) - 1, (-i2) - 1);
        }
        view.performClick();
        return this.f71233n.onTouchEvent(motionEventObtain);
    }
}
