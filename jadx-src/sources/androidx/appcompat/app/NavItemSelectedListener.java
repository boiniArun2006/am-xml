package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.ActionBar;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class NavItemSelectedListener implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ActionBar.OnNavigationListener f13674n;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        ActionBar.OnNavigationListener onNavigationListener = this.f13674n;
        if (onNavigationListener != null) {
            onNavigationListener.n(i2, j2);
        }
    }
}
