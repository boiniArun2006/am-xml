package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class NestedScrollingParentHelper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f36744n;
    private int rl;

    public void O(View view, int i2) {
        if (i2 == 1) {
            this.rl = 0;
        } else {
            this.f36744n = 0;
        }
    }

    public void nr(View view) {
        O(view, 0);
    }

    public void rl(View view, View view2, int i2) {
        t(view, view2, i2, 0);
    }

    public void t(View view, View view2, int i2, int i3) {
        if (i3 == 1) {
            this.rl = i2;
        } else {
            this.f36744n = i2;
        }
    }

    public int n() {
        return this.f36744n | this.rl;
    }

    public NestedScrollingParentHelper(ViewGroup viewGroup) {
    }
}
