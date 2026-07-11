package yU;

import HI0.o7q;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatImageButton;
import com.alightcreative.app.motion.activities.EditActivity;
import com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.safedk.android.analytics.AppLovinBridge;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yc.C2462u;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Ml extends PopupWindow implements View.OnTouchListener {
    private SurfaceView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final ColorPickerWidget f75614O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f75615n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final SJ0.l4Z f75616r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f75617t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ml(Context context, int i2) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f75615n = context;
        this.f75617t = i2;
        setWidth(-2);
        setHeight(-2);
        setOutsideTouchable(true);
        setTouchable(true);
        setAnimationStyle(0);
        SJ0.l4Z l4zT = SJ0.l4Z.t(LayoutInflater.from(context));
        this.f75616r = l4zT;
        setContentView(l4zT.getRoot());
        ColorPickerWidget colorPickerWidget = l4zT.rl;
        this.f75614O = colorPickerWidget;
        colorPickerWidget.setColor(this.f75617t);
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        setTouchInterceptor(this);
        if (context instanceof EditActivity) {
            View viewFindViewById = ((EditActivity) context).findViewById(2131363442);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.J2 = (SurfaceView) viewFindViewById;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String J2() {
        return "[ColorPickerPopup] touched inside the popup";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Uo() {
        return "[ColorPickerPopup] touched outside the popup";
    }

    public final void KN(View anchor) {
        Point point;
        boolean z2;
        int i2;
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        Pair pairJ2 = o7q.J2(anchor);
        int iIntValue = ((Number) pairJ2.component1()).intValue();
        int iIntValue2 = ((Number) pairJ2.component2()).intValue();
        int dimensionPixelOffset = this.f75615n.getResources().getDimensionPixelOffset(2131165318);
        int dimensionPixelOffset2 = this.f75615n.getResources().getDimensionPixelOffset(2131166268);
        int dimensionPixelOffset3 = this.f75615n.getResources().getDimensionPixelOffset(2131165295);
        int dimensionPixelOffset4 = this.f75615n.getResources().getDimensionPixelOffset(2131165294);
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = HI0.afx.ck(this.f75615n).getCurrentWindowMetrics().getBounds();
            point = new Point(bounds.width(), bounds.height());
        } else {
            point = new Point();
            HI0.afx.ck(this.f75615n).getDefaultDisplay().getRealSize(point);
        }
        int identifier = this.f75615n.getResources().getIdentifier("navigation_bar_height", "dimen", AppLovinBridge.f61290h);
        boolean z3 = false;
        int dimensionPixelSize = identifier > 0 ? this.f75615n.getResources().getDimensionPixelSize(identifier) : 0;
        int height = dimensionPixelOffset2 - anchor.getHeight();
        if ((((point.y - iIntValue2) - anchor.getHeight()) - dimensionPixelOffset4) - dimensionPixelSize < dimensionPixelOffset) {
            height = ((-dimensionPixelOffset) - anchor.getHeight()) - dimensionPixelOffset2;
            z2 = false;
        } else {
            z2 = true;
        }
        if (point.x / 2 > iIntValue) {
            i2 = -dimensionPixelOffset3;
            z3 = true;
        } else {
            i2 = dimensionPixelOffset3;
        }
        getContentView().setBackground(new C2462u(z2 & z3 ? C2462u.j.f76145n : (z2 ^ true) & z3 ? C2462u.j.f76144O : (true ^ z3) & z2 ? C2462u.j.f76148t : C2462u.j.J2, this.f75615n, anchor.getWidth() + dimensionPixelOffset3));
        showAsDropDown(anchor, i2, height);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        SceneHolder sceneHolder;
        if (this.f75614O.onBackPressed()) {
            return;
        }
        SceneHolder sceneHolder2 = this.f75614O.getSceneHolder();
        if ((sceneHolder2 != null && sceneHolder2.getEditMode() == 2131362629) || ((sceneHolder = this.f75614O.getSceneHolder()) != null && sceneHolder.getEditMode() == 2131362630)) {
            ((AppCompatImageButton) this.f75614O.findViewById(2131362401)).callOnClick();
        }
        super.dismiss();
    }

    public final ColorPickerWidget nr() {
        return this.f75614O;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v2, MotionEvent event) {
        SurfaceView surfaceView;
        Intrinsics.checkNotNullParameter(v2, "v");
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        if (action == 0 || action == 1 || action == 2) {
            final float x2 = event.getX();
            final float y2 = event.getY();
            final int rawX = (int) event.getRawX();
            final int rawY = (int) event.getRawY();
            XoT.C.Uo(this, new Function0() { // from class: yU.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Ml.O(x2, y2, rawX, rawY, this);
                }
            });
            if (x2 > 0.0f && x2 < getContentView().getWidth() && y2 > 0.0f && y2 < getContentView().getHeight()) {
                XoT.C.Uo(this, new Function0() { // from class: yU.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Ml.J2();
                    }
                });
                return false;
            }
            XoT.C.Uo(this, new Function0() { // from class: yU.w6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Ml.Uo();
                }
            });
            SceneHolder sceneHolder = this.f75614O.getSceneHolder();
            if (sceneHolder != null && ((sceneHolder.getEditMode() == 2131362629 || sceneHolder.getEditMode() == 2131362630) && (surfaceView = this.J2) != null)) {
                Rect rect = new Rect();
                surfaceView.getGlobalVisibleRect(rect);
                if (rect.contains(rawX, rawY)) {
                    SceneHolder sceneHolder2 = this.f75614O.getSceneHolder();
                    if (sceneHolder2 != null) {
                        sceneHolder2.getScene();
                    }
                    if (this.f75614O.getSceneHolder() != null) {
                        return this.f75614O.n(event, event.getX(), event.getY(), surfaceView.getWidth(), surfaceView.getHeight());
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O(float f3, float f4, int i2, int i3, Ml ml) {
        return "[ColorPickerPopup] " + f3 + " " + f4 + " " + i2 + " " + i3 + " " + ml.getContentView().getWidth() + " " + ml.getContentView().getHeight();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Ml(View view, int i2) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context contextN = HW.qz.n(view);
        contextN = contextN == null ? view.getContext() : contextN;
        Intrinsics.checkNotNull(contextN);
        this(contextN, i2);
    }
}
