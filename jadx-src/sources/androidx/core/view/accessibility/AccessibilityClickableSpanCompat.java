package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class AccessibilityClickableSpanCompat extends ClickableSpan {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f36841O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f36842n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AccessibilityNodeInfoCompat f36843t;

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f36842n);
        this.f36843t.GR(this.f36841O, bundle);
    }

    public AccessibilityClickableSpanCompat(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i3) {
        this.f36842n = i2;
        this.f36843t = accessibilityNodeInfoCompat;
        this.f36841O = i3;
    }
}
