package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.NestedAdapterWrapper;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class ConcatAdapterController implements NestedAdapterWrapper.Callback {
    private WrapperAndLocalPosition J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private List f41005O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConcatAdapter f41006n;
    private final IdentityHashMap nr;
    private final ViewTypeStorage rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f41007t;

    private void ViF(WrapperAndLocalPosition wrapperAndLocalPosition) {
        wrapperAndLocalPosition.f41009t = false;
        wrapperAndLocalPosition.f41008n = null;
        wrapperAndLocalPosition.rl = -1;
        this.J2 = wrapperAndLocalPosition;
    }

    static class WrapperAndLocalPosition {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        NestedAdapterWrapper f41008n;
        int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f41009t;

        WrapperAndLocalPosition() {
        }
    }

    private NestedAdapterWrapper HI(RecyclerView.ViewHolder viewHolder) {
        NestedAdapterWrapper nestedAdapterWrapper = (NestedAdapterWrapper) this.nr.get(viewHolder);
        if (nestedAdapterWrapper != null) {
            return nestedAdapterWrapper;
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + this);
    }

    private RecyclerView.Adapter.StateRestorationPolicy KN() {
        for (NestedAdapterWrapper nestedAdapterWrapper : this.f41005O) {
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy = nestedAdapterWrapper.f41140t.getStateRestorationPolicy();
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy2 = RecyclerView.Adapter.StateRestorationPolicy.PREVENT;
            if (stateRestorationPolicy == stateRestorationPolicy2 || (stateRestorationPolicy == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY && nestedAdapterWrapper.n() == 0)) {
                return stateRestorationPolicy2;
            }
        }
        return RecyclerView.Adapter.StateRestorationPolicy.ALLOW;
    }

    private boolean ck(RecyclerView recyclerView) {
        Iterator it = this.f41007t.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return true;
            }
        }
        return false;
    }

    private WrapperAndLocalPosition mUb(int i2) {
        WrapperAndLocalPosition wrapperAndLocalPosition = this.J2;
        if (wrapperAndLocalPosition.f41009t) {
            wrapperAndLocalPosition = new WrapperAndLocalPosition();
        } else {
            wrapperAndLocalPosition.f41009t = true;
        }
        Iterator it = this.f41005O.iterator();
        int iN = i2;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            NestedAdapterWrapper nestedAdapterWrapper = (NestedAdapterWrapper) it.next();
            if (nestedAdapterWrapper.n() > iN) {
                wrapperAndLocalPosition.f41008n = nestedAdapterWrapper;
                wrapperAndLocalPosition.rl = iN;
                break;
            }
            iN -= nestedAdapterWrapper.n();
        }
        if (wrapperAndLocalPosition.f41008n != null) {
            return wrapperAndLocalPosition;
        }
        throw new IllegalArgumentException("Cannot find wrapper for " + i2);
    }

    private int xMQ(NestedAdapterWrapper nestedAdapterWrapper) {
        NestedAdapterWrapper nestedAdapterWrapper2;
        Iterator it = this.f41005O.iterator();
        int iN = 0;
        while (it.hasNext() && (nestedAdapterWrapper2 = (NestedAdapterWrapper) it.next()) != nestedAdapterWrapper) {
            iN += nestedAdapterWrapper2.n();
        }
        return iN;
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void O(NestedAdapterWrapper nestedAdapterWrapper) {
        this.f41006n.notifyDataSetChanged();
        Uo();
    }

    public boolean XQ(RecyclerView.ViewHolder viewHolder) {
        NestedAdapterWrapper nestedAdapterWrapper = (NestedAdapterWrapper) this.nr.get(viewHolder);
        if (nestedAdapterWrapper != null) {
            boolean zOnFailedToRecycleView = nestedAdapterWrapper.f41140t.onFailedToRecycleView(viewHolder);
            this.nr.remove(viewHolder);
            return zOnFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + this);
    }

    public void Z(RecyclerView recyclerView) {
        int size = this.f41007t.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference weakReference = (WeakReference) this.f41007t.get(size);
            if (weakReference.get() == null) {
                this.f41007t.remove(size);
            } else if (weakReference.get() == recyclerView) {
                this.f41007t.remove(size);
                break;
            }
            size--;
        }
        Iterator it = this.f41005O.iterator();
        while (it.hasNext()) {
            ((NestedAdapterWrapper) it.next()).f41140t.onDetachedFromRecyclerView(recyclerView);
        }
    }

    public void aYN(RecyclerView.ViewHolder viewHolder) {
        NestedAdapterWrapper nestedAdapterWrapper = (NestedAdapterWrapper) this.nr.get(viewHolder);
        if (nestedAdapterWrapper != null) {
            nestedAdapterWrapper.f41140t.onViewRecycled(viewHolder);
            this.nr.remove(viewHolder);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + this);
    }

    public int az(RecyclerView.Adapter adapter, RecyclerView.ViewHolder viewHolder, int i2) {
        NestedAdapterWrapper nestedAdapterWrapper = (NestedAdapterWrapper) this.nr.get(viewHolder);
        if (nestedAdapterWrapper == null) {
            return -1;
        }
        int iXMQ = i2 - xMQ(nestedAdapterWrapper);
        int itemCount = nestedAdapterWrapper.f41140t.getItemCount();
        if (iXMQ >= 0 && iXMQ < itemCount) {
            return nestedAdapterWrapper.f41140t.findRelativeAdapterPositionIn(adapter, viewHolder, iXMQ);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + iXMQ + " which is out of bounds for the adapter with size " + itemCount + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + viewHolder + "adapter:" + adapter);
    }

    public RecyclerView.ViewHolder o(ViewGroup viewGroup, int i2) {
        return this.rl.n(i2).O(viewGroup, i2);
    }

    public int ty() {
        Iterator it = this.f41005O.iterator();
        int iN = 0;
        while (it.hasNext()) {
            iN += ((NestedAdapterWrapper) it.next()).n();
        }
        return iN;
    }

    private void Uo() {
        RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicyKN = KN();
        if (stateRestorationPolicyKN != this.f41006n.getStateRestorationPolicy()) {
            this.f41006n.qie(stateRestorationPolicyKN);
        }
    }

    public void Ik(RecyclerView recyclerView) {
        if (!ck(recyclerView)) {
            this.f41007t.add(new WeakReference(recyclerView));
            Iterator it = this.f41005O.iterator();
            while (it.hasNext()) {
                ((NestedAdapterWrapper) it.next()).f41140t.onAttachedToRecyclerView(recyclerView);
            }
        }
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void J2(NestedAdapterWrapper nestedAdapterWrapper, int i2, int i3) {
        this.f41006n.notifyItemRangeRemoved(i2 + xMQ(nestedAdapterWrapper), i3);
    }

    public void S(RecyclerView.ViewHolder viewHolder) {
        HI(viewHolder).f41140t.onViewAttachedToWindow(viewHolder);
    }

    public void WPU(RecyclerView.ViewHolder viewHolder) {
        HI(viewHolder).f41140t.onViewDetachedFromWindow(viewHolder);
    }

    public long gh(int i2) {
        WrapperAndLocalPosition wrapperAndLocalPositionMUb = mUb(i2);
        long jRl = wrapperAndLocalPositionMUb.f41008n.rl(wrapperAndLocalPositionMUb.rl);
        ViF(wrapperAndLocalPositionMUb);
        return jRl;
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void n(NestedAdapterWrapper nestedAdapterWrapper, int i2, int i3, Object obj) {
        this.f41006n.notifyItemRangeChanged(i2 + xMQ(nestedAdapterWrapper), i3, obj);
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void nr(NestedAdapterWrapper nestedAdapterWrapper) {
        Uo();
    }

    public int qie(int i2) {
        WrapperAndLocalPosition wrapperAndLocalPositionMUb = mUb(i2);
        int iT = wrapperAndLocalPositionMUb.f41008n.t(wrapperAndLocalPositionMUb.rl);
        ViF(wrapperAndLocalPositionMUb);
        return iT;
    }

    public void r(RecyclerView.ViewHolder viewHolder, int i2) {
        WrapperAndLocalPosition wrapperAndLocalPositionMUb = mUb(i2);
        this.nr.put(viewHolder, wrapperAndLocalPositionMUb.f41008n);
        wrapperAndLocalPositionMUb.f41008n.nr(viewHolder, wrapperAndLocalPositionMUb.rl);
        ViF(wrapperAndLocalPositionMUb);
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void rl(NestedAdapterWrapper nestedAdapterWrapper, int i2, int i3) {
        this.f41006n.notifyItemRangeInserted(i2 + xMQ(nestedAdapterWrapper), i3);
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void t(NestedAdapterWrapper nestedAdapterWrapper, int i2, int i3) {
        int iXMQ = xMQ(nestedAdapterWrapper);
        this.f41006n.notifyItemMoved(i2 + iXMQ, i3 + iXMQ);
    }
}
