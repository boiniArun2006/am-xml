package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class ConstraintController<T> implements ConstraintListener<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f42891n = new ArrayList();
    private OnConstraintUpdatedCallback nr;
    private Object rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ConstraintTracker f42892t;

    public interface OnConstraintUpdatedCallback {
        void n(List list);

        void rl(List list);
    }

    abstract boolean rl(WorkSpec workSpec);

    abstract boolean t(Object obj);

    private void KN(OnConstraintUpdatedCallback onConstraintUpdatedCallback, Object obj) {
        if (this.f42891n.isEmpty() || onConstraintUpdatedCallback == null) {
            return;
        }
        if (obj == null || t(obj)) {
            onConstraintUpdatedCallback.rl(this.f42891n);
        } else {
            onConstraintUpdatedCallback.n(this.f42891n);
        }
    }

    public void J2() {
        if (this.f42891n.isEmpty()) {
            return;
        }
        this.f42891n.clear();
        this.f42892t.t(this);
    }

    public void O(Iterable iterable) {
        this.f42891n.clear();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            WorkSpec workSpec = (WorkSpec) it.next();
            if (rl(workSpec)) {
                this.f42891n.add(workSpec.f42950n);
            }
        }
        if (this.f42891n.isEmpty()) {
            this.f42892t.t(this);
        } else {
            this.f42892t.n(this);
        }
        KN(this.nr, this.rl);
    }

    public void Uo(OnConstraintUpdatedCallback onConstraintUpdatedCallback) {
        if (this.nr != onConstraintUpdatedCallback) {
            this.nr = onConstraintUpdatedCallback;
            KN(onConstraintUpdatedCallback, this.rl);
        }
    }

    @Override // androidx.work.impl.constraints.ConstraintListener
    public void n(Object obj) {
        this.rl = obj;
        KN(this.nr, obj);
    }

    public boolean nr(String str) {
        Object obj = this.rl;
        return obj != null && t(obj) && this.f42891n.contains(str);
    }

    ConstraintController(ConstraintTracker constraintTracker) {
        this.f42892t = constraintTracker;
    }
}
