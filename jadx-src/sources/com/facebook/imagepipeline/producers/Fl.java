package com.facebook.imagepipeline.producers;

import bA.C1653C;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Fl implements l4Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final R6[] f52469n;

    private class j extends AbstractC1863c {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final dX.CN3 f52470O;
        private final int nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final mz f52471t;

        public j(Pl pl, mz mzVar, int i2) {
            super(pl);
            this.f52471t = mzVar;
            this.nr = i2;
            this.f52470O = mzVar.M().o();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1863c, com.facebook.imagepipeline.producers.w6
        protected void Uo(Throwable th) {
            if (Fl.this.O(this.nr + 1, HI(), this.f52471t)) {
                return;
            }
            HI().onFailure(th);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w6
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public void KN(C1653C c1653c, int i2) {
            if (c1653c != null && (w6.O(i2) || RzR.t(c1653c, this.f52470O))) {
                HI().rl(c1653c, i2);
            } else if (w6.nr(i2)) {
                C1653C.Uo(c1653c);
                if (Fl.this.O(this.nr + 1, HI(), this.f52471t)) {
                    return;
                }
                HI().rl(null, 1);
            }
        }
    }

    private int nr(int i2, dX.CN3 cn3) {
        while (true) {
            R6[] r6Arr = this.f52469n;
            if (i2 >= r6Arr.length) {
                return -1;
            }
            if (r6Arr[i2].rl(cn3)) {
                return i2;
            }
            i2++;
        }
    }

    public Fl(R6... r6Arr) {
        R6[] r6Arr2 = (R6[]) Hh.C.Uo(r6Arr);
        this.f52469n = r6Arr2;
        Hh.C.O(0, r6Arr2.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean O(int i2, Pl pl, mz mzVar) {
        int iNr = nr(i2, mzVar.M().o());
        if (iNr == -1) {
            return false;
        }
        this.f52469n[iNr].n(new j(pl, mzVar, iNr), mzVar);
        return true;
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl pl, mz mzVar) {
        if (mzVar.M().o() == null) {
            pl.rl(null, 1);
        } else if (!O(0, pl, mzVar)) {
            pl.rl(null, 1);
        }
    }
}
