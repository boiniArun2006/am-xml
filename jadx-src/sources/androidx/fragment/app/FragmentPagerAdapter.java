package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.view.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Deprecated
public abstract class FragmentPagerAdapter extends PagerAdapter {
    private Fragment J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private FragmentTransaction f38607O;
    private boolean Uo;
    private final int nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final FragmentManager f38608t;

    public FragmentPagerAdapter(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    public long S(int i2) {
        return i2;
    }

    public abstract Fragment XQ(int i2);

    @Override // androidx.viewpager.widget.PagerAdapter
    public void az(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable ty() {
        return null;
    }

    public FragmentPagerAdapter(FragmentManager fragmentManager, int i2) {
        this.f38607O = null;
        this.J2 = null;
        this.f38608t = fragmentManager;
        this.nr = i2;
    }

    private static String WPU(int i2, long j2) {
        return "android:switcher:" + i2 + ":" + j2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void ck(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.J2;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.nr == 1) {
                    if (this.f38607O == null) {
                        this.f38607O = this.f38608t.o();
                    }
                    this.f38607O.aYN(this.J2, Lifecycle.State.J2);
                } else {
                    this.J2.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.nr == 1) {
                if (this.f38607O == null) {
                    this.f38607O = this.f38608t.o();
                }
                this.f38607O.aYN(fragment, Lifecycle.State.f38884r);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.J2 = fragment;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean gh(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object mUb(ViewGroup viewGroup, int i2) {
        if (this.f38607O == null) {
            this.f38607O = this.f38608t.o();
        }
        long jS2 = S(i2);
        Fragment fragmentPJg = this.f38608t.pJg(WPU(viewGroup.getId(), jS2));
        if (fragmentPJg != null) {
            this.f38607O.xMQ(fragmentPJg);
        } else {
            fragmentPJg = XQ(i2);
            this.f38607O.t(viewGroup.getId(), fragmentPJg, WPU(viewGroup.getId(), jS2));
        }
        if (fragmentPJg != this.J2) {
            fragmentPJg.setMenuVisibility(false);
            if (this.nr == 1) {
                this.f38607O.aYN(fragmentPJg, Lifecycle.State.J2);
                return fragmentPJg;
            }
            fragmentPJg.setUserVisibleHint(false);
        }
        return fragmentPJg;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void nr(ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.f38607O;
        if (fragmentTransaction != null) {
            if (!this.Uo) {
                try {
                    this.Uo = true;
                    fragmentTransaction.az();
                } finally {
                    this.Uo = false;
                }
            }
            this.f38607O = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void rl(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f38607O == null) {
            this.f38607O = this.f38608t.o();
        }
        this.f38607O.ty(fragment);
        if (fragment.equals(this.J2)) {
            this.J2 = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void o(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
