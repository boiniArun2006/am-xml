package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class DefaultItemAnimator extends SimpleItemAnimator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static TimeInterpolator f41010o;
    private ArrayList KN = new ArrayList();
    private ArrayList xMQ = new ArrayList();
    private ArrayList mUb = new ArrayList();
    private ArrayList gh = new ArrayList();
    ArrayList qie = new ArrayList();
    ArrayList az = new ArrayList();
    ArrayList ty = new ArrayList();
    ArrayList HI = new ArrayList();
    ArrayList ck = new ArrayList();
    ArrayList Ik = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ArrayList f41011r = new ArrayList();

    private static class ChangeInfo {
        public int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f41029O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public RecyclerView.ViewHolder f41030n;
        public int nr;
        public RecyclerView.ViewHolder rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f41031t;

        private ChangeInfo(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            this.f41030n = viewHolder;
            this.rl = viewHolder2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f41030n + ", newHolder=" + this.rl + ", fromX=" + this.f41031t + ", fromY=" + this.nr + ", toX=" + this.f41029O + ", toY=" + this.J2 + '}';
        }

        ChangeInfo(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i5, int i7) {
            this(viewHolder, viewHolder2);
            this.f41031t = i2;
            this.nr = i3;
            this.f41029O = i5;
            this.J2 = i7;
        }
    }

    private static class MoveInfo {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f41032O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public RecyclerView.ViewHolder f41033n;
        public int nr;
        public int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f41034t;

        MoveInfo(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i5, int i7) {
            this.f41033n = viewHolder;
            this.rl = i2;
            this.f41034t = i3;
            this.nr = i5;
            this.f41032O = i7;
        }
    }

    private boolean B(ChangeInfo changeInfo, RecyclerView.ViewHolder viewHolder) {
        boolean z2 = false;
        if (changeInfo.rl == viewHolder) {
            changeInfo.rl = null;
        } else {
            if (changeInfo.f41030n != viewHolder) {
                return false;
            }
            changeInfo.f41030n = null;
            z2 = true;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        fD(viewHolder, z2);
        return true;
    }

    private void FX(ChangeInfo changeInfo) {
        RecyclerView.ViewHolder viewHolder = changeInfo.f41030n;
        if (viewHolder != null) {
            B(changeInfo, viewHolder);
        }
        RecyclerView.ViewHolder viewHolder2 = changeInfo.rl;
        if (viewHolder2 != null) {
            B(changeInfo, viewHolder2);
        }
    }

    private void J(RecyclerView.ViewHolder viewHolder) {
        if (f41010o == null) {
            f41010o = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(f41010o);
        mUb(viewHolder);
    }

    private void p5(final RecyclerView.ViewHolder viewHolder) {
        final View view = viewHolder.itemView;
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.Ik.add(viewHolder);
        viewPropertyAnimatorAnimate.setDuration(HI()).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                view.setAlpha(1.0f);
                DefaultItemAnimator.this.T(viewHolder);
                DefaultItemAnimator.this.Ik.remove(viewHolder);
                DefaultItemAnimator.this.E();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                DefaultItemAnimator.this.N(viewHolder);
            }
        }).start();
    }

    void M7(final RecyclerView.ViewHolder viewHolder, int i2, int i3, int i5, int i7) {
        final View view = viewHolder.itemView;
        final int i8 = i5 - i2;
        final int i9 = i7 - i3;
        if (i8 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i9 != 0) {
            view.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.ck.add(viewHolder);
        viewPropertyAnimatorAnimate.setDuration(ty()).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                if (i8 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (i9 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                DefaultItemAnimator.this.e(viewHolder);
                DefaultItemAnimator.this.ck.remove(viewHolder);
                DefaultItemAnimator.this.E();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                DefaultItemAnimator.this.X(viewHolder);
            }
        }).start();
    }

    void P5(final ChangeInfo changeInfo) {
        RecyclerView.ViewHolder viewHolder = changeInfo.f41030n;
        final View view = viewHolder == null ? null : viewHolder.itemView;
        RecyclerView.ViewHolder viewHolder2 = changeInfo.rl;
        final View view2 = viewHolder2 != null ? viewHolder2.itemView : null;
        if (view != null) {
            final ViewPropertyAnimator duration = view.animate().setDuration(az());
            this.f41011r.add(changeInfo.f41030n);
            duration.translationX(changeInfo.f41029O - changeInfo.f41031t);
            duration.translationY(changeInfo.J2 - changeInfo.nr);
            duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.7
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    duration.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    DefaultItemAnimator.this.fD(changeInfo.f41030n, true);
                    DefaultItemAnimator.this.f41011r.remove(changeInfo.f41030n);
                    DefaultItemAnimator.this.E();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    DefaultItemAnimator.this.E2(changeInfo.f41030n, true);
                }
            }).start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f41011r.add(changeInfo.rl);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(az()).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.8
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    viewPropertyAnimatorAnimate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    DefaultItemAnimator.this.fD(changeInfo.rl, false);
                    DefaultItemAnimator.this.f41011r.remove(changeInfo.rl);
                    DefaultItemAnimator.this.E();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    DefaultItemAnimator.this.E2(changeInfo.rl, false);
                }
            }).start();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void S() {
        boolean zIsEmpty = this.KN.isEmpty();
        boolean zIsEmpty2 = this.mUb.isEmpty();
        boolean zIsEmpty3 = this.gh.isEmpty();
        boolean zIsEmpty4 = this.xMQ.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator it = this.KN.iterator();
        while (it.hasNext()) {
            p5((RecyclerView.ViewHolder) it.next());
        }
        this.KN.clear();
        if (!zIsEmpty2) {
            final ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.mUb);
            this.az.add(arrayList);
            this.mUb.clear();
            Runnable runnable = new Runnable() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.1
                @Override // java.lang.Runnable
                public void run() {
                    for (MoveInfo moveInfo : arrayList) {
                        DefaultItemAnimator.this.M7(moveInfo.f41033n, moveInfo.rl, moveInfo.f41034t, moveInfo.nr, moveInfo.f41032O);
                    }
                    arrayList.clear();
                    DefaultItemAnimator.this.az.remove(arrayList);
                }
            };
            if (zIsEmpty) {
                runnable.run();
            } else {
                ViewCompat.Y(((MoveInfo) arrayList.get(0)).f41033n.itemView, runnable, HI());
            }
        }
        if (!zIsEmpty3) {
            final ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.gh);
            this.ty.add(arrayList2);
            this.gh.clear();
            Runnable runnable2 = new Runnable() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.2
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        DefaultItemAnimator.this.P5((ChangeInfo) it2.next());
                    }
                    arrayList2.clear();
                    DefaultItemAnimator.this.ty.remove(arrayList2);
                }
            };
            if (zIsEmpty) {
                runnable2.run();
            } else {
                ViewCompat.Y(((ChangeInfo) arrayList2.get(0)).f41030n.itemView, runnable2, HI());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        final ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.xMQ);
        this.qie.add(arrayList3);
        this.xMQ.clear();
        Runnable runnable3 = new Runnable() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.3
            @Override // java.lang.Runnable
            public void run() {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    DefaultItemAnimator.this.U((RecyclerView.ViewHolder) it2.next());
                }
                arrayList3.clear();
                DefaultItemAnimator.this.qie.remove(arrayList3);
            }
        };
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            runnable3.run();
        } else {
            ViewCompat.Y(((RecyclerView.ViewHolder) arrayList3.get(0)).itemView, runnable3, (!zIsEmpty ? HI() : 0L) + Math.max(!zIsEmpty2 ? ty() : 0L, zIsEmpty3 ? 0L : az()));
        }
    }

    void U(final RecyclerView.ViewHolder viewHolder) {
        final View view = viewHolder.itemView;
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.HI.add(viewHolder);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(qie()).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                DefaultItemAnimator.this.te(viewHolder);
                DefaultItemAnimator.this.HI.remove(viewHolder);
                DefaultItemAnimator.this.E();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                DefaultItemAnimator.this.iF(viewHolder);
            }
        }).start();
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean ViF(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i5, int i7) {
        if (viewHolder == viewHolder2) {
            return nY(viewHolder, i2, i3, i5, i7);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        J(viewHolder);
        int i8 = (int) ((i5 - i2) - translationX);
        int i9 = (int) ((i7 - i3) - translationY);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            J(viewHolder2);
            viewHolder2.itemView.setTranslationX(-i8);
            viewHolder2.itemView.setTranslationY(-i9);
            viewHolder2.itemView.setAlpha(0.0f);
        }
        this.gh.add(new ChangeInfo(viewHolder, viewHolder2, i2, i3, i5, i7));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean ck() {
        return (this.xMQ.isEmpty() && this.gh.isEmpty() && this.mUb.isEmpty() && this.KN.isEmpty() && this.ck.isEmpty() && this.Ik.isEmpty() && this.HI.isEmpty() && this.f41011r.isEmpty() && this.az.isEmpty() && this.qie.isEmpty() && this.ty.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void gh() {
        int size = this.mUb.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            MoveInfo moveInfo = (MoveInfo) this.mUb.get(size);
            View view = moveInfo.f41033n.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            e(moveInfo.f41033n);
            this.mUb.remove(size);
        }
        for (int size2 = this.KN.size() - 1; size2 >= 0; size2--) {
            T((RecyclerView.ViewHolder) this.KN.get(size2));
            this.KN.remove(size2);
        }
        int size3 = this.xMQ.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) this.xMQ.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            te(viewHolder);
            this.xMQ.remove(size3);
        }
        for (int size4 = this.gh.size() - 1; size4 >= 0; size4--) {
            FX((ChangeInfo) this.gh.get(size4));
        }
        this.gh.clear();
        if (ck()) {
            for (int size5 = this.az.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.az.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    MoveInfo moveInfo2 = (MoveInfo) arrayList.get(size6);
                    View view2 = moveInfo2.f41033n.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    e(moveInfo2.f41033n);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.az.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.qie.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.qie.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) arrayList2.get(size8);
                    viewHolder2.itemView.setAlpha(1.0f);
                    te(viewHolder2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.qie.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.ty.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.ty.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    FX((ChangeInfo) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.ty.remove(arrayList3);
                    }
                }
            }
            eF(this.Ik);
            eF(this.ck);
            eF(this.HI);
            eF(this.f41011r);
            xMQ();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void mUb(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        int size = this.mUb.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((MoveInfo) this.mUb.get(size)).f41033n == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                e(viewHolder);
                this.mUb.remove(size);
            }
        }
        M(this.gh, viewHolder);
        if (this.KN.remove(viewHolder)) {
            view.setAlpha(1.0f);
            T(viewHolder);
        }
        if (this.xMQ.remove(viewHolder)) {
            view.setAlpha(1.0f);
            te(viewHolder);
        }
        for (int size2 = this.ty.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.ty.get(size2);
            M(arrayList, viewHolder);
            if (arrayList.isEmpty()) {
                this.ty.remove(size2);
            }
        }
        for (int size3 = this.az.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.az.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((MoveInfo) arrayList2.get(size4)).f41033n == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    e(viewHolder);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.az.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.qie.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.qie.get(size5);
            if (arrayList3.remove(viewHolder)) {
                view.setAlpha(1.0f);
                te(viewHolder);
                if (arrayList3.isEmpty()) {
                    this.qie.remove(size5);
                }
            }
        }
        this.Ik.remove(viewHolder);
        this.HI.remove(viewHolder);
        this.f41011r.remove(viewHolder);
        this.ck.remove(viewHolder);
        E();
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean nY(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i5, int i7) {
        View view = viewHolder.itemView;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) viewHolder.itemView.getTranslationY());
        J(viewHolder);
        int i8 = i5 - translationX;
        int i9 = i7 - translationY;
        if (i8 == 0 && i9 == 0) {
            e(viewHolder);
            return false;
        }
        if (i8 != 0) {
            view.setTranslationX(-i8);
        }
        if (i9 != 0) {
            view.setTranslationY(-i9);
        }
        this.mUb.add(new MoveInfo(viewHolder, translationX, translationY, i5, i7));
        return true;
    }

    private void M(List list, RecyclerView.ViewHolder viewHolder) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ChangeInfo changeInfo = (ChangeInfo) list.get(size);
            if (B(changeInfo, viewHolder) && changeInfo.f41030n == null && changeInfo.rl == null) {
                list.remove(changeInfo);
            }
        }
    }

    void E() {
        if (!ck()) {
            xMQ();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean Uo(RecyclerView.ViewHolder viewHolder, List list) {
        if (list.isEmpty() && !super.Uo(viewHolder, list)) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean aYN(RecyclerView.ViewHolder viewHolder) {
        J(viewHolder);
        viewHolder.itemView.setAlpha(0.0f);
        this.xMQ.add(viewHolder);
        return true;
    }

    void eF(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.ViewHolder) list.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean g(RecyclerView.ViewHolder viewHolder) {
        J(viewHolder);
        this.KN.add(viewHolder);
        return true;
    }
}
