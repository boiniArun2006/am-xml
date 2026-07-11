package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class RecyclerViewAccessibilityDelegate extends AccessibilityDelegateCompat {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final ItemDelegate f41195O;
    final RecyclerView nr;

    public static class ItemDelegate extends AccessibilityDelegateCompat {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Map f41196O = new WeakHashMap();
        final RecyclerViewAccessibilityDelegate nr;

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void J2(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f41196O.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.J2(view, accessibilityEvent);
            } else {
                super.J2(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void KN(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f41196O.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.KN(view, accessibilityEvent);
            } else {
                super.KN(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void Uo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.nr.HI() || this.nr.nr.getLayoutManager() == null) {
                super.Uo(view, accessibilityNodeInfoCompat);
                return;
            }
            this.nr.nr.getLayoutManager().Qu(view, accessibilityNodeInfoCompat);
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f41196O.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.Uo(view, accessibilityNodeInfoCompat);
            } else {
                super.Uo(view, accessibilityNodeInfoCompat);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void az(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f41196O.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.az(view, accessibilityEvent);
            } else {
                super.az(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean mUb(View view, int i2, Bundle bundle) {
            if (this.nr.HI() || this.nr.nr.getLayoutManager() == null) {
                return super.mUb(view, i2, bundle);
            }
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f41196O.get(view);
            if (accessibilityDelegateCompat != null) {
                if (accessibilityDelegateCompat.mUb(view, i2, bundle)) {
                    return true;
                }
            } else if (super.mUb(view, i2, bundle)) {
                return true;
            }
            return this.nr.nr.getLayoutManager().g6(view, i2, bundle);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean n(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f41196O.get(view);
            return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.n(view, accessibilityEvent) : super.n(view, accessibilityEvent);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void qie(View view, int i2) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f41196O.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.qie(view, i2);
            } else {
                super.qie(view, i2);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public AccessibilityNodeProviderCompat rl(View view) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f41196O.get(view);
            return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.rl(view) : super.rl(view);
        }

        AccessibilityDelegateCompat ty(View view) {
            return (AccessibilityDelegateCompat) this.f41196O.remove(view);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean xMQ(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f41196O.get(viewGroup);
            return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.xMQ(viewGroup, view, accessibilityEvent) : super.xMQ(viewGroup, view, accessibilityEvent);
        }

        public ItemDelegate(RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
            this.nr = recyclerViewAccessibilityDelegate;
        }

        void HI(View view) {
            AccessibilityDelegateCompat accessibilityDelegateCompatQie = ViewCompat.qie(view);
            if (accessibilityDelegateCompatQie != null && accessibilityDelegateCompatQie != this) {
                this.f41196O.put(view, accessibilityDelegateCompatQie);
            }
        }
    }

    boolean HI() {
        return this.nr.hasPendingAdapterUpdates();
    }

    public AccessibilityDelegateCompat ty() {
        return this.f41195O;
    }

    public RecyclerViewAccessibilityDelegate(RecyclerView recyclerView) {
        this.nr = recyclerView;
        AccessibilityDelegateCompat accessibilityDelegateCompatTy = ty();
        if (accessibilityDelegateCompatTy != null && (accessibilityDelegateCompatTy instanceof ItemDelegate)) {
            this.f41195O = (ItemDelegate) accessibilityDelegateCompatTy;
        } else {
            this.f41195O = new ItemDelegate(this);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void J2(View view, AccessibilityEvent accessibilityEvent) {
        super.J2(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !HI()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().p0N(accessibilityEvent);
            }
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void Uo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.Uo(view, accessibilityNodeInfoCompat);
        if (!HI() && this.nr.getLayoutManager() != null) {
            this.nr.getLayoutManager().f(accessibilityNodeInfoCompat);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public boolean mUb(View view, int i2, Bundle bundle) {
        if (super.mUb(view, i2, bundle)) {
            return true;
        }
        if (!HI() && this.nr.getLayoutManager() != null) {
            return this.nr.getLayoutManager().s(i2, bundle);
        }
        return false;
    }
}
