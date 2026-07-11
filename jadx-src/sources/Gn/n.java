package Gn;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n implements View.OnTouchListener {
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Float f3742O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function2 f3743n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Float f3744t;

    public n(Function2 onDragCompleted) {
        Intrinsics.checkNotNullParameter(onDragCompleted, "onDragCompleted");
        this.f3743n = onDragCompleted;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent event) {
        n nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 0) {
            this.f3744t = Float.valueOf(event.getRawX());
            this.f3742O = Float.valueOf(event.getRawY());
            this.J2 = false;
            return true;
        }
        Float f3 = this.f3744t;
        if (f3 == null) {
            return false;
        }
        float fFloatValue = f3.floatValue();
        Float f4 = this.f3742O;
        if (f4 == null) {
            return false;
        }
        float fFloatValue2 = f4.floatValue();
        float rawX = event.getRawX();
        float rawY = event.getRawY();
        int action = event.getAction();
        if (action == 1) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (n(context, fFloatValue, fFloatValue2, rawX, rawY)) {
                this.f3743n.invoke(Float.valueOf(rawX), Float.valueOf(rawY));
            } else {
                view.performClick();
            }
            this.f3744t = null;
            this.f3742O = null;
            this.J2 = false;
        } else if (action == 2) {
            if (this.J2) {
                nVar = this;
            } else {
                Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                nVar = this;
                if (!nVar.n(context2, fFloatValue, fFloatValue2, rawX, rawY)) {
                    return true;
                }
            }
            nVar.J2 = true;
            VA.j.t(view, rawX, rawY);
        } else if (action == 3) {
            this.f3744t = null;
            this.f3742O = null;
            this.J2 = false;
        }
        return true;
    }

    private final boolean n(Context context, float f3, float f4, float f5, float f6) {
        float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        if (Math.abs(f3 - f5) <= scaledTouchSlop && Math.abs(f4 - f6) <= scaledTouchSlop) {
            return false;
        }
        return true;
    }
}
