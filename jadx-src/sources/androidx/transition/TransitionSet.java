package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class TransitionSet extends Transition {
    int Mx;
    ArrayList ofS = new ArrayList();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f42251C = true;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    boolean f42252G7 = false;
    private int fcU = 0;

    static class TransitionSetListener extends TransitionListenerAdapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        TransitionSet f42255n;

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void O(Transition transition) {
            TransitionSet transitionSet = this.f42255n;
            if (transitionSet.f42252G7) {
                return;
            }
            transitionSet.eTf();
            this.f42255n.f42252G7 = true;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void xMQ(Transition transition) {
            TransitionSet transitionSet = this.f42255n;
            int i2 = transitionSet.Mx - 1;
            transitionSet.Mx = i2;
            if (i2 == 0) {
                transitionSet.f42252G7 = false;
                transitionSet.o();
            }
            transition.D(this);
        }

        TransitionSetListener(TransitionSet transitionSet) {
            this.f42255n = transitionSet;
        }
    }

    private int eWT(long j2) {
        for (int i2 = 1; i2 < this.ofS.size(); i2++) {
            if (((Transition) this.ofS.get(i2)).ijL > j2) {
                return i2 - 1;
            }
        }
        return this.ofS.size() - 1;
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public TransitionSet a(View view) {
        for (int i2 = 0; i2 < this.ofS.size(); i2++) {
            ((Transition) this.ofS.get(i2)).a(view);
        }
        return (TransitionSet) super.a(view);
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: ofS, reason: merged with bridge method [inline-methods] */
    public TransitionSet nr(View view) {
        for (int i2 = 0; i2 < this.ofS.size(); i2++) {
            ((Transition) this.ofS.get(i2)).nr(view);
        }
        return (TransitionSet) super.nr(view);
    }

    public TransitionSet qm(int i2) {
        if (i2 == 0) {
            this.f42251C = true;
            return this;
        }
        if (i2 == 1) {
            this.f42251C = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i2);
    }

    @Override // androidx.transition.Transition
    boolean wTp() {
        for (int i2 = 0; i2 < this.ofS.size(); i2++) {
            if (((Transition) this.ofS.get(i2)).wTp()) {
                return true;
            }
        }
        return false;
    }

    private void Mx(Transition transition) {
        this.ofS.add(transition);
        transition.f42220U = this;
    }

    private void Org() {
        TransitionSetListener transitionSetListener = new TransitionSetListener(this);
        Iterator it = this.ofS.iterator();
        while (it.hasNext()) {
            ((Transition) it.next()).t(transitionSetListener);
        }
        this.Mx = this.ofS.size();
    }

    public Transition G7(int i2) {
        if (i2 < 0 || i2 >= this.ofS.size()) {
            return null;
        }
        return (Transition) this.ofS.get(i2);
    }

    @Override // androidx.transition.Transition
    void J() {
        this.f42233z = 0L;
        TransitionListenerAdapter transitionListenerAdapter = new TransitionListenerAdapter() { // from class: androidx.transition.TransitionSet.2
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void gh(Transition transition) {
                TransitionSet.this.ofS.remove(transition);
                if (TransitionSet.this.wTp()) {
                    return;
                }
                TransitionSet.this.M(Transition.TransitionNotification.f42244t, false);
                TransitionSet transitionSet = TransitionSet.this;
                transitionSet.f42209D = true;
                transitionSet.M(Transition.TransitionNotification.rl, false);
            }
        };
        for (int i2 = 0; i2 < this.ofS.size(); i2++) {
            Transition transition = (Transition) this.ofS.get(i2);
            transition.t(transitionListenerAdapter);
            transition.J();
            long jN = transition.N();
            if (this.f42251C) {
                this.f42233z = Math.max(this.f42233z, jN);
            } else {
                long j2 = this.f42233z;
                transition.ijL = j2;
                this.f42233z = j2 + jN;
            }
        }
    }

    @Override // androidx.transition.Transition
    protected void Nxk() {
        if (this.ofS.isEmpty()) {
            eTf();
            o();
            return;
        }
        Org();
        if (this.f42251C) {
            Iterator it = this.ofS.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).Nxk();
            }
            return;
        }
        for (int i2 = 1; i2 < this.ofS.size(); i2++) {
            Transition transition = (Transition) this.ofS.get(i2 - 1);
            final Transition transition2 = (Transition) this.ofS.get(i2);
            transition.t(new TransitionListenerAdapter() { // from class: androidx.transition.TransitionSet.1
                @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                public void xMQ(Transition transition3) {
                    transition2.Nxk();
                    transition3.D(this);
                }
            });
        }
        Transition transition3 = (Transition) this.ofS.get(0);
        if (transition3 != null) {
            transition3.Nxk();
        }
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: Rl, reason: merged with bridge method [inline-methods] */
    public TransitionSet z(TimeInterpolator timeInterpolator) {
        this.fcU |= 1;
        ArrayList arrayList = this.ofS;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((Transition) this.ofS.get(i2)).z(timeInterpolator);
            }
        }
        return (TransitionSet) super.z(timeInterpolator);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void Y(long j2, long j3) {
        long j4;
        long jN = N();
        long j5 = 0;
        if (this.f42220U != null) {
            if (j2 < 0 && j3 < 0) {
                return;
            }
            if (j2 > jN && j3 > jN) {
                return;
            }
        }
        boolean z2 = j2 < j3;
        if ((j2 >= 0 && j3 < 0) || (j2 <= jN && j3 > jN)) {
            this.f42209D = false;
            M(Transition.TransitionNotification.f42243n, z2);
        }
        if (!this.f42251C) {
            int iEWT = eWT(j3);
            if (j2 >= j3) {
                while (iEWT < this.ofS.size()) {
                    Transition transition = (Transition) this.ofS.get(iEWT);
                    long j6 = transition.ijL;
                    j4 = j5;
                    long j7 = j2 - j6;
                    if (j7 < j4) {
                        break;
                    }
                    transition.Y(j7, j3 - j6);
                    iEWT++;
                    j5 = j4;
                }
            } else {
                j4 = 0;
                while (iEWT >= 0) {
                    Transition transition2 = (Transition) this.ofS.get(iEWT);
                    long j9 = transition2.ijL;
                    long j10 = j2 - j9;
                    transition2.Y(j10, j3 - j9);
                    if (j10 >= 0) {
                        break;
                    } else {
                        iEWT--;
                    }
                }
            }
            if (this.f42220U == null) {
                if ((j2 <= jN || j3 > jN) && (j2 >= 0 || j3 < j4)) {
                    return;
                }
                if (j2 > jN) {
                    this.f42209D = true;
                }
                M(Transition.TransitionNotification.rl, z2);
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < this.ofS.size(); i2++) {
            ((Transition) this.ofS.get(i2)).Y(j2, j3);
        }
        j4 = j5;
        if (this.f42220U == null) {
        }
    }

    public int fcU() {
        return this.ofS.size();
    }

    @Override // androidx.transition.Transition
    public void qie(TransitionValues transitionValues) {
        if (bzg(transitionValues.rl)) {
            for (Transition transition : this.ofS) {
                if (transition.bzg(transitionValues.rl)) {
                    transition.qie(transitionValues);
                    transitionValues.f42260t.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public boolean v() {
        int size = this.ofS.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!((Transition) this.ofS.get(i2)).v()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.transition.Transition
    public void xMQ(TransitionValues transitionValues) {
        if (bzg(transitionValues.rl)) {
            for (Transition transition : this.ofS) {
                if (transition.bzg(transitionValues.rl)) {
                    transition.xMQ(transitionValues);
                    transitionValues.f42260t.add(transition);
                }
            }
        }
    }

    public TransitionSet C(Transition transition) {
        Mx(transition);
        long j2 = this.f42217O;
        if (j2 >= 0) {
            transition.k(j2);
        }
        if ((this.fcU & 1) != 0) {
            transition.z(WPU());
        }
        if ((this.fcU & 2) != 0) {
            transition.ijL(g());
        }
        if ((this.fcU & 4) != 0) {
            transition.piY(nY());
        }
        if ((this.fcU & 8) != 0) {
            transition.dR0(S());
        }
        return this;
    }

    @Override // androidx.transition.Transition
    public void FX(View view) {
        super.FX(view);
        int size = this.ofS.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) this.ofS.get(i2)).FX(view);
        }
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: HI */
    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.ofS = new ArrayList();
        int size = this.ofS.size();
        for (int i2 = 0; i2 < size; i2++) {
            transitionSet.Mx(((Transition) this.ofS.get(i2)).clone());
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    public void I(View view) {
        super.I(view);
        int size = this.ofS.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) this.ofS.get(i2)).I(view);
        }
    }

    @Override // androidx.transition.Transition
    void Ik(ViewGroup viewGroup, TransitionValuesMaps transitionValuesMaps, TransitionValuesMaps transitionValuesMaps2, ArrayList arrayList, ArrayList arrayList2) {
        long jFD = fD();
        int size = this.ofS.size();
        for (int i2 = 0; i2 < size; i2++) {
            Transition transition = (Transition) this.ofS.get(i2);
            if (jFD > 0 && (this.f42251C || i2 == 0)) {
                long jFD2 = transition.fD();
                if (jFD2 > 0) {
                    transition.m(jFD2 + jFD);
                } else {
                    transition.m(jFD);
                }
            }
            transition.Ik(viewGroup, transitionValuesMaps, transitionValuesMaps2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: Jk, reason: merged with bridge method [inline-methods] */
    public TransitionSet k(long j2) {
        ArrayList arrayList;
        super.k(j2);
        if (this.f42217O >= 0 && (arrayList = this.ofS) != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((Transition) this.ofS.get(i2)).k(j2);
            }
        }
        return this;
    }

    @Override // androidx.transition.Transition
    protected void cancel() {
        super.cancel();
        int size = this.ofS.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) this.ofS.get(i2)).cancel();
        }
    }

    @Override // androidx.transition.Transition
    public void dR0(Transition.EpicenterCallback epicenterCallback) {
        super.dR0(epicenterCallback);
        this.fcU |= 8;
        int size = this.ofS.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) this.ofS.get(i2)).dR0(epicenterCallback);
        }
    }

    @Override // androidx.transition.Transition
    void gh(TransitionValues transitionValues) {
        super.gh(transitionValues);
        int size = this.ofS.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) this.ofS.get(i2)).gh(transitionValues);
        }
    }

    @Override // androidx.transition.Transition
    public void ijL(TransitionPropagation transitionPropagation) {
        super.ijL(transitionPropagation);
        this.fcU |= 2;
        int size = this.ofS.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) this.ofS.get(i2)).ijL(transitionPropagation);
        }
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: mYa, reason: merged with bridge method [inline-methods] */
    public TransitionSet m(long j2) {
        return (TransitionSet) super.m(j2);
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: pJg, reason: merged with bridge method [inline-methods] */
    public TransitionSet t(Transition.TransitionListener transitionListener) {
        return (TransitionSet) super.t(transitionListener);
    }

    @Override // androidx.transition.Transition
    public void piY(PathMotion pathMotion) {
        super.piY(pathMotion);
        this.fcU |= 4;
        if (this.ofS != null) {
            for (int i2 = 0; i2 < this.ofS.size(); i2++) {
                ((Transition) this.ofS.get(i2)).piY(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: ul, reason: merged with bridge method [inline-methods] */
    public TransitionSet D(Transition.TransitionListener transitionListener) {
        return (TransitionSet) super.D(transitionListener);
    }

    @Override // androidx.transition.Transition
    String xg(String str) {
        String strXg = super.xg(str);
        for (int i2 = 0; i2 < this.ofS.size(); i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strXg);
            sb.append("\n");
            sb.append(((Transition) this.ofS.get(i2)).xg(str + "  "));
            strXg = sb.toString();
        }
        return strXg;
    }
}
