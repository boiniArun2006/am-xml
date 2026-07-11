package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.R;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class AccessibilityDelegateCompat {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final View.AccessibilityDelegate f36711t = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final View.AccessibilityDelegate f36712n;
    private final View.AccessibilityDelegate rl;

    static final class AccessibilityDelegateAdapter extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final AccessibilityDelegateCompat f36713n;

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f36713n.n(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            AccessibilityNodeProviderCompat accessibilityNodeProviderCompatRl = this.f36713n.rl(view);
            if (accessibilityNodeProviderCompatRl != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProviderCompatRl.O();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f36713n.J2(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f36713n.KN(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f36713n.xMQ(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return this.f36713n.mUb(view, i2, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i2) {
            this.f36713n.qie(view, i2);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f36713n.az(view, accessibilityEvent);
        }

        AccessibilityDelegateAdapter(AccessibilityDelegateCompat accessibilityDelegateCompat) {
            this.f36713n = accessibilityDelegateCompat;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatZmq = AccessibilityNodeInfoCompat.Zmq(accessibilityNodeInfo);
            accessibilityNodeInfoCompatZmq.a63(ViewCompat.eF(view));
            accessibilityNodeInfoCompatZmq.HV(ViewCompat.jB(view));
            accessibilityNodeInfoCompatZmq.tUK(ViewCompat.HI(view));
            accessibilityNodeInfoCompatZmq.T3L(ViewCompat.T(view));
            this.f36713n.Uo(view, accessibilityNodeInfoCompatZmq);
            accessibilityNodeInfoCompatZmq.J2(accessibilityNodeInfo.getText(), view);
            List listT = AccessibilityDelegateCompat.t(view);
            for (int i2 = 0; i2 < listT.size(); i2++) {
                accessibilityNodeInfoCompatZmq.rl((AccessibilityNodeInfoCompat.AccessibilityActionCompat) listT.get(i2));
            }
        }
    }

    public AccessibilityDelegateCompat() {
        this(f36711t);
    }

    private boolean O(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrR = AccessibilityNodeInfoCompat.r(view.createAccessibilityNodeInfo().getText());
            for (int i2 = 0; clickableSpanArrR != null && i2 < clickableSpanArrR.length; i2++) {
                if (clickableSpan.equals(clickableSpanArrR[i2])) {
                    return true;
                }
            }
        }
        return false;
    }

    public AccessibilityDelegateCompat(View.AccessibilityDelegate accessibilityDelegate) {
        this.f36712n = accessibilityDelegate;
        this.rl = new AccessibilityDelegateAdapter(this);
    }

    private boolean gh(int i2, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.f36160U);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i2)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!O(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    static List t(View view) {
        List list = (List) view.getTag(R.id.jB);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public void J2(View view, AccessibilityEvent accessibilityEvent) {
        this.f36712n.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void KN(View view, AccessibilityEvent accessibilityEvent) {
        this.f36712n.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void Uo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.f36712n.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.X4T());
    }

    public void az(View view, AccessibilityEvent accessibilityEvent) {
        this.f36712n.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean n(View view, AccessibilityEvent accessibilityEvent) {
        return this.f36712n.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    View.AccessibilityDelegate nr() {
        return this.rl;
    }

    public void qie(View view, int i2) {
        this.f36712n.sendAccessibilityEvent(view, i2);
    }

    public AccessibilityNodeProviderCompat rl(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f36712n.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new AccessibilityNodeProviderCompat(accessibilityNodeProvider);
        }
        return null;
    }

    public boolean xMQ(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f36712n.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean mUb(View view, int i2, Bundle bundle) {
        List listT = t(view);
        boolean zPerformAccessibilityAction = false;
        int i3 = 0;
        while (true) {
            if (i3 >= listT.size()) {
                break;
            }
            AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = (AccessibilityNodeInfoCompat.AccessibilityActionCompat) listT.get(i3);
            if (accessibilityActionCompat.rl() == i2) {
                zPerformAccessibilityAction = accessibilityActionCompat.nr(view, bundle);
                break;
            }
            i3++;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f36712n.performAccessibilityAction(view, i2, bundle);
        }
        if (!zPerformAccessibilityAction && i2 == R.id.f36168n && bundle != null) {
            return gh(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
        }
        return zPerformAccessibilityAction;
    }
}
