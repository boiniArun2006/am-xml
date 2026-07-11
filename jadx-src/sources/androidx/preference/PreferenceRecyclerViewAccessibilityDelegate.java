package androidx.preference;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@RestrictTo
@Deprecated
public class PreferenceRecyclerViewAccessibilityDelegate extends RecyclerViewAccessibilityDelegate {
    final RecyclerView J2;
    final AccessibilityDelegateCompat KN;
    final AccessibilityDelegateCompat Uo;

    @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate
    public AccessibilityDelegateCompat ty() {
        return this.KN;
    }

    public PreferenceRecyclerViewAccessibilityDelegate(RecyclerView recyclerView) {
        super(recyclerView);
        this.Uo = super.ty();
        this.KN = new AccessibilityDelegateCompat() { // from class: androidx.preference.PreferenceRecyclerViewAccessibilityDelegate.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void Uo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                Preference preferenceHI;
                PreferenceRecyclerViewAccessibilityDelegate.this.Uo.Uo(view, accessibilityNodeInfoCompat);
                int childAdapterPosition = PreferenceRecyclerViewAccessibilityDelegate.this.J2.getChildAdapterPosition(view);
                RecyclerView.Adapter adapter = PreferenceRecyclerViewAccessibilityDelegate.this.J2.getAdapter();
                if ((adapter instanceof PreferenceGroupAdapter) && (preferenceHI = ((PreferenceGroupAdapter) adapter).HI(childAdapterPosition)) != null) {
                    preferenceHI.E(accessibilityNodeInfoCompat);
                }
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public boolean mUb(View view, int i2, Bundle bundle) {
                return PreferenceRecyclerViewAccessibilityDelegate.this.Uo.mUb(view, i2, bundle);
            }
        };
        this.J2 = recyclerView;
    }
}
