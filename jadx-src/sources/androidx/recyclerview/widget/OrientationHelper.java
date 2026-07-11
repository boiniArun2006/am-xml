package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class OrientationHelper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final RecyclerView.LayoutManager f41143n;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Rect f41144t;

    public abstract int Ik(View view);

    public abstract int J2(View view);

    public abstract int KN();

    public abstract int O(View view);

    public abstract int Uo(View view);

    public abstract int az();

    public abstract int ck(View view);

    public abstract int gh();

    public abstract int mUb();

    public abstract int nr(View view);

    public abstract int qie();

    public abstract void r(int i2);

    public abstract int ty();

    public abstract int xMQ();

    private OrientationHelper(RecyclerView.LayoutManager layoutManager) {
        this.rl = Integer.MIN_VALUE;
        this.f41144t = new Rect();
        this.f41143n = layoutManager;
    }

    public static OrientationHelper n(RecyclerView.LayoutManager layoutManager) {
        return new OrientationHelper(layoutManager) { // from class: androidx.recyclerview.widget.OrientationHelper.1
            @Override // androidx.recyclerview.widget.OrientationHelper
            public int Ik(View view) {
                this.f41143n.qm(view, true, this.f41144t);
                return this.f41144t.left;
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int KN() {
                return this.f41143n.mYa();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int az() {
                return this.f41143n.C();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int ck(View view) {
                this.f41143n.qm(view, true, this.f41144t);
                return this.f41144t.right;
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int gh() {
                return this.f41143n.Org();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int mUb() {
                return this.f41143n.Mx();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int qie() {
                return this.f41143n.ijL();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public void r(int i2) {
                this.f41143n.a63(i2);
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int ty() {
                return (this.f41143n.mYa() - this.f41143n.C()) - this.f41143n.Mx();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int xMQ() {
                return this.f41143n.mYa() - this.f41143n.Mx();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int J2(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.f41143n.Nxk(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int O(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.f41143n.Y(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int Uo(View view) {
                return this.f41143n.GR(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int nr(View view) {
                return this.f41143n.k(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
            }
        };
    }

    public static OrientationHelper rl(RecyclerView.LayoutManager layoutManager, int i2) {
        if (i2 == 0) {
            return n(layoutManager);
        }
        if (i2 == 1) {
            return t(layoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static OrientationHelper t(RecyclerView.LayoutManager layoutManager) {
        return new OrientationHelper(layoutManager) { // from class: androidx.recyclerview.widget.OrientationHelper.2
            @Override // androidx.recyclerview.widget.OrientationHelper
            public int Ik(View view) {
                this.f41143n.qm(view, true, this.f41144t);
                return this.f41144t.top;
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int KN() {
                return this.f41143n.piY();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int az() {
                return this.f41143n.G7();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int ck(View view) {
                this.f41143n.qm(view, true, this.f41144t);
                return this.f41144t.bottom;
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int gh() {
                return this.f41143n.ijL();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int mUb() {
                return this.f41143n.ofS();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int qie() {
                return this.f41143n.Org();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public void r(int i2) {
                this.f41143n.F(i2);
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int ty() {
                return (this.f41143n.piY() - this.f41143n.G7()) - this.f41143n.ofS();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int xMQ() {
                return this.f41143n.piY() - this.f41143n.ofS();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int J2(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.f41143n.Y(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int O(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.f41143n.Nxk(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int Uo(View view) {
                return this.f41143n.dR0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int nr(View view) {
                return this.f41143n.a(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
            }
        };
    }

    public int HI() {
        if (Integer.MIN_VALUE == this.rl) {
            return 0;
        }
        return ty() - this.rl;
    }

    public void o() {
        this.rl = ty();
    }
}
