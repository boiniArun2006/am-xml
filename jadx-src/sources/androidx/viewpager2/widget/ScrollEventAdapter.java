package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class ScrollEventAdapter extends RecyclerView.OnScrollListener {
    private int J2;
    private int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f42443O;
    private ScrollEventValues Uo;
    private boolean az;
    private boolean gh;
    private boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ViewPager2.OnPageChangeCallback f42444n;
    private final LinearLayoutManager nr;
    private boolean qie;
    private final ViewPager2 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final RecyclerView f42445t;
    private int xMQ;

    private void ty() {
        this.f42443O = 0;
        this.J2 = 0;
        this.Uo.n();
        this.KN = -1;
        this.xMQ = -1;
        this.mUb = false;
        this.gh = false;
        this.az = false;
        this.qie = false;
    }

    void az(int i2, boolean z2) {
        this.f42443O = z2 ? 2 : 3;
        this.az = false;
        boolean z3 = this.xMQ != i2;
        this.xMQ = i2;
        O(2);
        if (z3) {
            nr(i2);
        }
    }

    void qie() {
        this.qie = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void rl(RecyclerView recyclerView, int i2, int i3) {
        int i5;
        this.gh = true;
        Ik();
        if (this.mUb) {
            this.mUb = false;
            if (i3 > 0) {
                ScrollEventValues scrollEventValues = this.Uo;
                i5 = scrollEventValues.f42447t != 0 ? scrollEventValues.f42446n + 1 : this.Uo.f42446n;
                this.xMQ = i5;
                if (this.KN != i5) {
                    nr(i5);
                }
            } else {
                if (i3 == 0) {
                    if ((i2 < 0) == this.rl.nr()) {
                    }
                }
                this.xMQ = i5;
                if (this.KN != i5) {
                }
            }
        } else if (this.f42443O == 0) {
            int i7 = this.Uo.f42446n;
            if (i7 == -1) {
                i7 = 0;
            }
            nr(i7);
        }
        ScrollEventValues scrollEventValues2 = this.Uo;
        int i8 = scrollEventValues2.f42446n;
        if (i8 == -1) {
            i8 = 0;
        }
        t(i8, scrollEventValues2.rl, scrollEventValues2.f42447t);
        ScrollEventValues scrollEventValues3 = this.Uo;
        int i9 = scrollEventValues3.f42446n;
        int i10 = this.xMQ;
        if ((i9 == i10 || i10 == -1) && scrollEventValues3.f42447t == 0 && this.J2 != 1) {
            O(0);
            ty();
        }
    }

    private static final class ScrollEventValues {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f42446n;
        float rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f42447t;

        void n() {
            this.f42446n = -1;
            this.rl = 0.0f;
            this.f42447t = 0;
        }

        ScrollEventValues() {
        }
    }

    private void Ik() {
        int top;
        ScrollEventValues scrollEventValues = this.Uo;
        int iLu = this.nr.Lu();
        scrollEventValues.f42446n = iLu;
        if (iLu == -1) {
            scrollEventValues.n();
            return;
        }
        View viewJB = this.nr.jB(iLu);
        if (viewJB == null) {
            scrollEventValues.n();
            return;
        }
        int iETf = this.nr.eTf(viewJB);
        int iUl = this.nr.ul(viewJB);
        int iRl = this.nr.Rl(viewJB);
        int iEF = this.nr.eF(viewJB);
        ViewGroup.LayoutParams layoutParams = viewJB.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            iETf += marginLayoutParams.leftMargin;
            iUl += marginLayoutParams.rightMargin;
            iRl += marginLayoutParams.topMargin;
            iEF += marginLayoutParams.bottomMargin;
        }
        int height = viewJB.getHeight() + iRl + iEF;
        int width = viewJB.getWidth() + iETf + iUl;
        if (this.nr.C7B() == 0) {
            top = (viewJB.getLeft() - iETf) - this.f42445t.getPaddingLeft();
            if (this.rl.nr()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewJB.getTop() - iRl) - this.f42445t.getPaddingTop();
        }
        int i2 = -top;
        scrollEventValues.f42447t = i2;
        if (i2 >= 0) {
            scrollEventValues.rl = height == 0 ? 0.0f : i2 / height;
        } else {
            if (!new AnimateLayoutChangeDetector(this.nr).nr()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(scrollEventValues.f42447t)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    private int J2() {
        return this.nr.Lu();
    }

    private void O(int i2) {
        if ((this.f42443O == 3 && this.J2 == 0) || this.J2 == i2) {
            return;
        }
        this.J2 = i2;
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.f42444n;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.n(i2);
        }
    }

    private void ck(boolean z2) {
        this.az = z2;
        this.f42443O = z2 ? 4 : 1;
        int i2 = this.xMQ;
        if (i2 != -1) {
            this.KN = i2;
            this.xMQ = -1;
        } else if (this.KN == -1) {
            this.KN = J2();
        }
        O(1);
    }

    private boolean gh() {
        int i2 = this.f42443O;
        return i2 == 1 || i2 == 4;
    }

    private void nr(int i2) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.f42444n;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.t(i2);
        }
    }

    private void t(int i2, float f3, int i3) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.f42444n;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.rl(i2, f3, i3);
        }
    }

    void HI(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.f42444n = onPageChangeCallback;
    }

    int KN() {
        return this.J2;
    }

    boolean mUb() {
        return this.J2 == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void n(RecyclerView recyclerView, int i2) {
        if (!(this.f42443O == 1 && this.J2 == 1) && i2 == 1) {
            ck(false);
            return;
        }
        if (gh() && i2 == 2) {
            if (this.gh) {
                O(2);
                this.mUb = true;
                return;
            }
            return;
        }
        if (gh() && i2 == 0) {
            Ik();
            if (this.gh) {
                ScrollEventValues scrollEventValues = this.Uo;
                if (scrollEventValues.f42447t == 0) {
                    int i3 = this.KN;
                    int i5 = scrollEventValues.f42446n;
                    if (i3 != i5) {
                        nr(i5);
                    }
                }
            } else {
                int i7 = this.Uo.f42446n;
                if (i7 != -1) {
                    t(i7, 0.0f, 0);
                }
            }
            O(0);
            ty();
        }
        if (this.f42443O == 2 && i2 == 0 && this.qie) {
            Ik();
            ScrollEventValues scrollEventValues2 = this.Uo;
            if (scrollEventValues2.f42447t == 0) {
                int i8 = this.xMQ;
                int i9 = scrollEventValues2.f42446n;
                if (i8 != i9) {
                    if (i9 == -1) {
                        i9 = 0;
                    }
                    nr(i9);
                }
                O(0);
                ty();
            }
        }
    }

    boolean xMQ() {
        return this.az;
    }

    ScrollEventAdapter(ViewPager2 viewPager2) {
        this.rl = viewPager2;
        RecyclerView recyclerView = viewPager2.f42454e;
        this.f42445t = recyclerView;
        this.nr = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.Uo = new ScrollEventValues();
        ty();
    }

    double Uo() {
        Ik();
        ScrollEventValues scrollEventValues = this.Uo;
        return ((double) scrollEventValues.f42446n) + ((double) scrollEventValues.rl);
    }
}
