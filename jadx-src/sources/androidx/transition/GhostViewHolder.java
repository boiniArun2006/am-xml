package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class GhostViewHolder extends FrameLayout {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ViewGroup f42177n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f42178t;

    @RequiresApi
    static class Api21Impl {
        @DoNotInline
        static float n(View view) {
            return view.getZ();
        }
    }

    static GhostViewHolder rl(ViewGroup viewGroup) {
        return (GhostViewHolder) viewGroup.getTag(R.id.rl);
    }

    private int t(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i2 = 0;
        while (i2 <= childCount) {
            int i3 = (i2 + childCount) / 2;
            nr(((GhostViewPort) getChildAt(i3)).f42185O, arrayList2);
            if (J2(arrayList, arrayList2)) {
                i2 = i3 + 1;
            } else {
                childCount = i3 - 1;
            }
            arrayList2.clear();
        }
        return i2;
    }

    void Uo() {
        if (!this.f42178t) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        this.f42177n.getOverlay().remove(this);
        this.f42177n.getOverlay().add(this);
    }

    void n(GhostViewPort ghostViewPort) {
        ArrayList arrayList = new ArrayList();
        nr(ghostViewPort.f42185O, arrayList);
        int iT = t(arrayList);
        if (iT < 0 || iT >= getChildCount()) {
            addView(ghostViewPort);
        } else {
            addView(ghostViewPort, iT);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (!this.f42178t) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    GhostViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f42177n = viewGroup;
        viewGroup.setTag(R.id.rl, this);
        this.f42177n.getOverlay().add(this);
        this.f42178t = true;
    }

    private static boolean J2(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        for (int i2 = 1; i2 < iMin; i2++) {
            View view = (View) arrayList.get(i2);
            View view2 = (View) arrayList2.get(i2);
            if (view != view2) {
                return O(view, view2);
            }
        }
        if (arrayList2.size() == iMin) {
            return true;
        }
        return false;
    }

    private static boolean O(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (Api21Impl.n(view) != Api21Impl.n(view2)) {
            if (Api21Impl.n(view) <= Api21Impl.n(view2)) {
                return false;
            }
            return true;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(ViewGroupUtils.n(viewGroup, i2));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                return true;
            }
        }
        return true;
    }

    private static void nr(View view, ArrayList arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            nr((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f42177n.setTag(R.id.rl, null);
            this.f42177n.getOverlay().remove(this);
            this.f42178t = false;
        }
    }
}
