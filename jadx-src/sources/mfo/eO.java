package mfo;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class eO extends Xo {
    private boolean J2 = false;
    private float Uo = 0.0f;

    class j extends ViewOutlineProvider {
        j() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            eO eOVar = eO.this;
            if (eOVar.f70928t == null || eOVar.nr.isEmpty()) {
                return;
            }
            eO eOVar2 = eO.this;
            RectF rectF = eOVar2.nr;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, eOVar2.Uo);
        }
    }

    private boolean HI() {
        C c2;
        if (!this.nr.isEmpty() && (c2 = this.f70928t) != null && this.rl && !c2.XQ(this.nr) && ck(this.f70928t)) {
            float fN = this.f70928t.r().n(this.nr);
            float fN2 = this.f70928t.Z().n(this.nr);
            float fN3 = this.f70928t.mUb().n(this.nr);
            float fN4 = this.f70928t.qie().n(this.nr);
            if (fN == 0.0f && fN3 == 0.0f && fN2 == fN4) {
                RectF rectF = this.nr;
                rectF.set(rectF.left - fN2, rectF.top, rectF.right, rectF.bottom);
                this.Uo = fN2;
                return true;
            }
            if (fN == 0.0f && fN2 == 0.0f && fN3 == fN4) {
                RectF rectF2 = this.nr;
                rectF2.set(rectF2.left, rectF2.top - fN3, rectF2.right, rectF2.bottom);
                this.Uo = fN3;
                return true;
            }
            if (fN2 == 0.0f && fN4 == 0.0f && fN == fN3) {
                RectF rectF3 = this.nr;
                rectF3.set(rectF3.left, rectF3.top, rectF3.right + fN, rectF3.bottom);
                this.Uo = fN;
                return true;
            }
            if (fN3 == 0.0f && fN4 == 0.0f && fN == fN2) {
                RectF rectF4 = this.nr;
                rectF4.set(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom + fN);
                this.Uo = fN;
                return true;
            }
        }
        return false;
    }

    @DoNotInline
    private void az(View view) {
        view.setOutlineProvider(new j());
    }

    private float qie() {
        RectF rectF;
        C c2 = this.f70928t;
        if (c2 == null || (rectF = this.nr) == null) {
            return 0.0f;
        }
        return c2.J2.n(rectF);
    }

    private boolean ty() {
        C c2;
        if (this.nr.isEmpty() || (c2 = this.f70928t) == null) {
            return false;
        }
        return c2.XQ(this.nr);
    }

    @Override // mfo.Xo
    boolean xMQ() {
        return !this.J2 || this.f70927n;
    }

    eO(View view) {
        az(view);
    }

    private static boolean ck(C c2) {
        if ((c2.Ik() instanceof aC) && (c2.o() instanceof aC) && (c2.xMQ() instanceof aC) && (c2.gh() instanceof aC)) {
            return true;
        }
        return false;
    }

    @Override // mfo.Xo
    void rl(View view) {
        boolean z2;
        this.Uo = qie();
        if (!ty() && !HI()) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.J2 = z2;
        view.setClipToOutline(!xMQ());
        if (xMQ()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }
}
