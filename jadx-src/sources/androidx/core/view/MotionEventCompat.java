package androidx.core.view;

import android.view.MotionEvent;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class MotionEventCompat {
    public static boolean n(MotionEvent motionEvent, int i2) {
        if ((motionEvent.getSource() & i2) == i2) {
            return true;
        }
        return false;
    }
}
