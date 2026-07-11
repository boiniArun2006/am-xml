package eVj;

import android.R;
import android.content.res.ColorStateList;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class aC {
    public static final void J2(View view, long j2, final Function0 function0) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.clearAnimation();
        view.setVisibility(0);
        view.animate().alpha(1.0f).setListener(null).setDuration(j2).withEndAction(new Runnable() { // from class: eVj.fuX
            @Override // java.lang.Runnable
            public final void run() {
                aC.KN(function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(View view, Function0 function0) {
        view.setVisibility(8);
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static /* synthetic */ void Uo(View view, long j2, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = 500;
        }
        if ((i2 & 2) != 0) {
            function0 = null;
        }
        J2(view, j2, function0);
    }

    public static /* synthetic */ void mUb(View view, int i2, int i3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = i2;
        }
        xMQ(view, i2, i3);
    }

    public static /* synthetic */ void nr(View view, long j2, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = 500;
        }
        if ((i2 & 2) != 0) {
            function0 = null;
        }
        t(view, j2, function0);
    }

    public static final void t(final View view, long j2, final Function0 function0) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.clearAnimation();
        view.animate().alpha(0.0f).setListener(null).setDuration(j2).withEndAction(new Runnable() { // from class: eVj.Dsr
            @Override // java.lang.Runnable
            public final void run() {
                aC.O(view, function0);
            }
        });
    }

    public static final void xMQ(View view, int i2, int i3) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        boolean zIsEnabled = view.isEnabled();
        boolean zIsActivated = view.isActivated();
        view.setBackgroundTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[]{-16842910}, new int[]{R.attr.state_enabled}}, new int[]{i3, i2, i2}));
        view.setActivated(!zIsActivated);
        view.setActivated(zIsActivated);
        view.setEnabled(!zIsEnabled);
        view.setEnabled(zIsEnabled);
    }
}
