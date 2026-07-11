package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.LocaleList;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.RequiresApi;
import androidx.core.os.LocaleListCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class AccessibilityWindowInfoCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f36869n;

    @RequiresApi
    private static class Api24Impl {
    }

    @RequiresApi
    private static class Api26Impl {
    }

    @RequiresApi
    private static class Api30Impl {
    }

    @RequiresApi
    private static class Api33Impl {
    }

    private static String gh(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityWindowInfoCompat)) {
            return false;
        }
        AccessibilityWindowInfoCompat accessibilityWindowInfoCompat = (AccessibilityWindowInfoCompat) obj;
        Object obj2 = this.f36869n;
        return obj2 == null ? accessibilityWindowInfoCompat.f36869n == null : obj2.equals(accessibilityWindowInfoCompat.f36869n);
    }

    @RequiresApi
    private static class Api21Impl {
        static int J2(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        static boolean KN(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        static AccessibilityWindowInfo O(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        static boolean Uo(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        static void n(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        static int nr(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        static int rl(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        static int t(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }
    }

    @RequiresApi
    private static class Api34Impl {
        static LocaleList n(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLocales();
        }

        public static long rl(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTransitionTimeMillis();
        }
    }

    static AccessibilityWindowInfoCompat qie(Object obj) {
        if (obj != null) {
            return new AccessibilityWindowInfoCompat(obj);
        }
        return null;
    }

    public AccessibilityWindowInfoCompat J2() {
        return qie(Api21Impl.O((AccessibilityWindowInfo) this.f36869n));
    }

    public int KN() {
        return Api21Impl.J2((AccessibilityWindowInfo) this.f36869n);
    }

    public LocaleListCompat O() {
        return Build.VERSION.SDK_INT >= 34 ? LocaleListCompat.gh(Api34Impl.n((AccessibilityWindowInfo) this.f36869n)) : LocaleListCompat.O();
    }

    public long Uo() {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.rl((AccessibilityWindowInfo) this.f36869n);
        }
        return 0L;
    }

    public int hashCode() {
        Object obj = this.f36869n;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean mUb() {
        return Api21Impl.KN((AccessibilityWindowInfo) this.f36869n);
    }

    public void n(Rect rect) {
        Api21Impl.n((AccessibilityWindowInfo) this.f36869n, rect);
    }

    public int nr() {
        return Api21Impl.nr((AccessibilityWindowInfo) this.f36869n);
    }

    public int rl() {
        return Api21Impl.rl((AccessibilityWindowInfo) this.f36869n);
    }

    public int t() {
        return Api21Impl.t((AccessibilityWindowInfo) this.f36869n);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Rect rect = new Rect();
        n(rect);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=");
        sb.append(t());
        sb.append(", type=");
        sb.append(gh(KN()));
        sb.append(", layer=");
        sb.append(nr());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(mUb());
        sb.append(", active=");
        sb.append(xMQ());
        sb.append(", hasParent=");
        sb.append(J2() != null);
        sb.append(", hasChildren=");
        sb.append(rl() > 0);
        sb.append(", transitionTime=");
        sb.append(Uo());
        sb.append(", locales=");
        sb.append(O());
        sb.append(']');
        return sb.toString();
    }

    public boolean xMQ() {
        return Api21Impl.Uo((AccessibilityWindowInfo) this.f36869n);
    }

    private AccessibilityWindowInfoCompat(Object obj) {
        this.f36869n = obj;
    }
}
