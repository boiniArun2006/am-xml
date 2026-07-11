package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Deprecated
public abstract class FragmentStatePagerAdapter extends PagerAdapter {
    private ArrayList J2;
    private Fragment KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private FragmentTransaction f38628O;
    private ArrayList Uo;
    private final int nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final FragmentManager f38629t;
    private boolean xMQ;

    public abstract Fragment XQ(int i2);

    @Override // androidx.viewpager.widget.PagerAdapter
    public void az(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.J2.clear();
            this.Uo.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.J2.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith(InneractiveMediationDefs.GENDER_FEMALE)) {
                    int i2 = Integer.parseInt(str.substring(1));
                    Fragment fragmentMYa = this.f38629t.mYa(bundle, str);
                    if (fragmentMYa != null) {
                        while (this.Uo.size() <= i2) {
                            this.Uo.add(null);
                        }
                        fragmentMYa.setMenuVisibility(false);
                        this.Uo.set(i2, fragmentMYa);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void ck(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.KN;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.nr == 1) {
                    if (this.f38628O == null) {
                        this.f38628O = this.f38629t.o();
                    }
                    this.f38628O.aYN(this.KN, Lifecycle.State.J2);
                } else {
                    this.KN.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.nr == 1) {
                if (this.f38628O == null) {
                    this.f38628O = this.f38629t.o();
                }
                this.f38628O.aYN(fragment, Lifecycle.State.f38884r);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.KN = fragment;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean gh(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object mUb(ViewGroup viewGroup, int i2) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.Uo.size() > i2 && (fragment = (Fragment) this.Uo.get(i2)) != null) {
            return fragment;
        }
        if (this.f38628O == null) {
            this.f38628O = this.f38629t.o();
        }
        Fragment fragmentXQ = XQ(i2);
        if (this.J2.size() > i2 && (savedState = (Fragment.SavedState) this.J2.get(i2)) != null) {
            fragmentXQ.setInitialSavedState(savedState);
        }
        while (this.Uo.size() <= i2) {
            this.Uo.add(null);
        }
        fragmentXQ.setMenuVisibility(false);
        if (this.nr == 0) {
            fragmentXQ.setUserVisibleHint(false);
        }
        this.Uo.set(i2, fragmentXQ);
        this.f38628O.rl(viewGroup.getId(), fragmentXQ);
        if (this.nr == 1) {
            this.f38628O.aYN(fragmentXQ, Lifecycle.State.J2);
        }
        return fragmentXQ;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void nr(ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.f38628O;
        if (fragmentTransaction != null) {
            if (!this.xMQ) {
                try {
                    this.xMQ = true;
                    fragmentTransaction.az();
                } finally {
                    this.xMQ = false;
                }
            }
            this.f38628O = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void rl(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f38628O == null) {
            this.f38628O = this.f38629t.o();
        }
        while (this.J2.size() <= i2) {
            this.J2.add(null);
        }
        this.J2.set(i2, fragment.isAdded() ? this.f38629t.lNy(fragment) : null);
        this.Uo.set(i2, null);
        this.f38628O.r(fragment);
        if (fragment.equals(this.KN)) {
            this.KN = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable ty() {
        Bundle bundle;
        if (this.J2.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.J2.size()];
            this.J2.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i2 = 0; i2 < this.Uo.size(); i2++) {
            Fragment fragment = (Fragment) this.Uo.get(i2);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f38629t.v0j(bundle, InneractiveMediationDefs.GENDER_FEMALE + i2, fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void o(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
