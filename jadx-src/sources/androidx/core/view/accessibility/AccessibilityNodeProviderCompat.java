package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class AccessibilityNodeProviderCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f36865n;

    static class AccessibilityNodeProviderApi19 extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final AccessibilityNodeProviderCompat f36866n;

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatRl = this.f36866n.rl(i2);
            if (accessibilityNodeInfoCompatRl == null) {
                return null;
            }
            return accessibilityNodeInfoCompatRl.X4T();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i2) {
            List listT = this.f36866n.t(str, i2);
            if (listT == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listT.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(((AccessibilityNodeInfoCompat) listT.get(i3)).X4T());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i2) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatNr = this.f36866n.nr(i2);
            if (accessibilityNodeInfoCompatNr == null) {
                return null;
            }
            return accessibilityNodeInfoCompatNr.X4T();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i2, int i3, Bundle bundle) {
            return this.f36866n.J2(i2, i3, bundle);
        }

        AccessibilityNodeProviderApi19(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            this.f36866n = accessibilityNodeProviderCompat;
        }
    }

    @RequiresApi
    static class AccessibilityNodeProviderApi26 extends AccessibilityNodeProviderApi19 {
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f36866n.n(i2, AccessibilityNodeInfoCompat.Zmq(accessibilityNodeInfo), str, bundle);
        }

        AccessibilityNodeProviderApi26(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            super(accessibilityNodeProviderCompat);
        }
    }

    public AccessibilityNodeProviderCompat() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f36865n = new AccessibilityNodeProviderApi26(this);
        } else {
            this.f36865n = new AccessibilityNodeProviderApi19(this);
        }
    }

    public boolean J2(int i2, int i3, Bundle bundle) {
        return false;
    }

    public void n(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
    }

    public AccessibilityNodeInfoCompat nr(int i2) {
        return null;
    }

    public AccessibilityNodeInfoCompat rl(int i2) {
        return null;
    }

    public List t(String str, int i2) {
        return null;
    }

    public Object O() {
        return this.f36865n;
    }

    public AccessibilityNodeProviderCompat(Object obj) {
        this.f36865n = obj;
    }
}
