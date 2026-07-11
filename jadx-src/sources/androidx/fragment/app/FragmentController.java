package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class FragmentController {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FragmentHostCallback f38551n;

    public static FragmentController rl(FragmentHostCallback fragmentHostCallback) {
        return new FragmentController((FragmentHostCallback) Preconditions.KN(fragmentHostCallback, "callbacks == null"));
    }

    public void J2() {
        this.f38551n.getFragmentManager().s7N();
    }

    public void KN() {
        this.f38551n.getFragmentManager().M();
    }

    public void O() {
        this.f38551n.getFragmentManager().N();
    }

    public void Uo() {
        this.f38551n.getFragmentManager().M7();
    }

    public void az() {
        this.f38551n.getFragmentManager().HBN();
    }

    public boolean gh() {
        return this.f38551n.getFragmentManager().k(true);
    }

    public void mUb() {
        this.f38551n.getFragmentManager().J();
    }

    public void n(Fragment fragment) {
        FragmentManager fragmentManager = this.f38551n.getFragmentManager();
        FragmentHostCallback fragmentHostCallback = this.f38551n;
        fragmentManager.Ik(fragmentHostCallback, fragmentHostCallback, fragment);
    }

    public boolean nr(MenuItem menuItem) {
        return this.f38551n.getFragmentManager().T(menuItem);
    }

    public FragmentManager qie() {
        return this.f38551n.getFragmentManager();
    }

    public void t() {
        this.f38551n.getFragmentManager().E2();
    }

    public View ty(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f38551n.getFragmentManager().hRu().onCreateView(view, str, context, attributeSet);
    }

    public void xMQ() {
        this.f38551n.getFragmentManager().FX();
    }

    private FragmentController(FragmentHostCallback fragmentHostCallback) {
        this.f38551n = fragmentHostCallback;
    }
}
