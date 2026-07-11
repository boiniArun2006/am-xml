package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.R;
import androidx.core.widget.PopupWindowCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class AppCompatPopupWindow extends PopupWindow {
    private static final boolean rl = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f14102n;

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3) {
        if (rl && this.f14102n) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3);
    }

    private void n(Context context, AttributeSet attributeSet, int i2, int i3) {
        TintTypedArray tintTypedArrayS = TintTypedArray.S(context, attributeSet, R.styleable.uQ, i2, i3);
        int i5 = R.styleable.mx;
        if (tintTypedArrayS.o(i5)) {
            rl(tintTypedArrayS.n(i5, false));
        }
        setBackgroundDrawable(tintTypedArrayS.Uo(R.styleable.wKY));
        tintTypedArrayS.aYN();
    }

    private void rl(boolean z2) {
        if (rl) {
            this.f14102n = z2;
        } else {
            PopupWindowCompat.n(this, z2);
        }
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i2, int i3, int i5, int i7) {
        if (rl && this.f14102n) {
            i3 -= view.getHeight();
        }
        super.update(view, i2, i3, i5, i7);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        n(context, attributeSet, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3, int i5) {
        if (rl && this.f14102n) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3, i5);
    }
}
