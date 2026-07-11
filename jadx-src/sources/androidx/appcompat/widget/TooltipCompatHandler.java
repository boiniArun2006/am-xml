package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@RestrictTo
class TooltipCompatHandler implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static TooltipCompatHandler f14434X;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static TooltipCompatHandler f14435e;
    private boolean E2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f14436O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private TooltipPopup f14437S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f14438Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f14439g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final View f14440n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f14441o;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CharSequence f14443t;
    private final Runnable J2 = new Runnable() { // from class: androidx.appcompat.widget.g9s
        @Override // java.lang.Runnable
        public final void run() {
            this.f14456n.KN(false);
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Runnable f14442r = new Runnable() { // from class: androidx.appcompat.widget.afx
        @Override // java.lang.Runnable
        public final void run() {
            this.f14455n.nr();
        }
    };

    private void t() {
        this.E2 = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    private static void J2(TooltipCompatHandler tooltipCompatHandler) {
        TooltipCompatHandler tooltipCompatHandler2 = f14435e;
        if (tooltipCompatHandler2 != null) {
            tooltipCompatHandler2.rl();
        }
        f14435e = tooltipCompatHandler;
        if (tooltipCompatHandler != null) {
            tooltipCompatHandler.O();
        }
    }

    private void O() {
        this.f14440n.postDelayed(this.J2, ViewConfiguration.getLongPressTimeout());
    }

    public static void Uo(View view, CharSequence charSequence) {
        TooltipCompatHandler tooltipCompatHandler = f14435e;
        if (tooltipCompatHandler != null && tooltipCompatHandler.f14440n == view) {
            J2(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new TooltipCompatHandler(view, charSequence);
            return;
        }
        TooltipCompatHandler tooltipCompatHandler2 = f14434X;
        if (tooltipCompatHandler2 != null && tooltipCompatHandler2.f14440n == view) {
            tooltipCompatHandler2.nr();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private void rl() {
        this.f14440n.removeCallbacks(this.J2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void KN(boolean z2) {
        long longPressTimeout;
        long j2;
        long j3;
        if (this.f14440n.isAttachedToWindow()) {
            J2(null);
            TooltipCompatHandler tooltipCompatHandler = f14434X;
            if (tooltipCompatHandler != null) {
                tooltipCompatHandler.nr();
            }
            f14434X = this;
            this.f14439g = z2;
            TooltipPopup tooltipPopup = new TooltipPopup(this.f14440n.getContext());
            this.f14437S = tooltipPopup;
            tooltipPopup.O(this.f14440n, this.f14441o, this.f14438Z, this.f14439g, this.f14443t);
            this.f14440n.addOnAttachStateChangeListener(this);
            if (this.f14439g) {
                j3 = 2500;
            } else {
                if ((ViewCompat.wTp(this.f14440n) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 15000;
                }
                j3 = j2 - longPressTimeout;
            }
            this.f14440n.removeCallbacks(this.f14442r);
            this.f14440n.postDelayed(this.f14442r, j3);
        }
    }

    void nr() {
        if (f14434X == this) {
            f14434X = null;
            TooltipPopup tooltipPopup = this.f14437S;
            if (tooltipPopup != null) {
                tooltipPopup.t();
                this.f14437S = null;
                t();
                this.f14440n.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f14435e == this) {
            J2(null);
        }
        this.f14440n.removeCallbacks(this.f14442r);
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f14437S != null && this.f14439g) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f14440n.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                t();
                nr();
            }
        } else if (this.f14440n.isEnabled() && this.f14437S == null && xMQ(motionEvent)) {
            J2(this);
        }
        return false;
    }

    private TooltipCompatHandler(View view, CharSequence charSequence) {
        this.f14440n = view;
        this.f14443t = charSequence;
        this.f14436O = ViewConfigurationCompat.Uo(ViewConfiguration.get(view.getContext()));
        t();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private boolean xMQ(MotionEvent motionEvent) {
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        if (!this.E2 && Math.abs(x2 - this.f14441o) <= this.f14436O && Math.abs(y2 - this.f14438Z) <= this.f14436O) {
            return false;
        }
        this.f14441o = x2;
        this.f14438Z = y2;
        this.E2 = false;
        return true;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f14441o = view.getWidth() / 2;
        this.f14438Z = view.getHeight() / 2;
        KN(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        nr();
    }
}
