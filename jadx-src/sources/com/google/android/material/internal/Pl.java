package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Pl {
    private X4.Ml Uo;
    private float nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f59012t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TextPaint f59011n = new TextPaint(1);
    private final X4.Wre rl = new j();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f59010O = true;
    private WeakReference J2 = new WeakReference(null);

    class j extends X4.Wre {
        j() {
        }

        @Override // X4.Wre
        public void n(int i2) {
            Pl.this.f59010O = true;
            n nVar = (n) Pl.this.J2.get();
            if (nVar != null) {
                nVar.n();
            }
        }

        @Override // X4.Wre
        public void rl(Typeface typeface, boolean z2) {
            if (z2) {
                return;
            }
            Pl.this.f59010O = true;
            n nVar = (n) Pl.this.J2.get();
            if (nVar != null) {
                nVar.n();
            }
        }
    }

    public interface n {
        int[] getState();

        void n();

        boolean onStateChange(int[] iArr);
    }

    private float nr(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f59011n.measureText(charSequence, 0, charSequence.length());
    }

    private float t(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f59011n.getFontMetrics().ascent);
    }

    public float J2(String str) {
        if (!this.f59010O) {
            return this.nr;
        }
        xMQ(str);
        return this.nr;
    }

    public float KN(String str) {
        if (!this.f59010O) {
            return this.f59012t;
        }
        xMQ(str);
        return this.f59012t;
    }

    public X4.Ml O() {
        return this.Uo;
    }

    public TextPaint Uo() {
        return this.f59011n;
    }

    public void az(boolean z2) {
        this.f59010O = z2;
    }

    public void gh(X4.Ml ml, Context context) {
        if (this.Uo != ml) {
            this.Uo = ml;
            if (ml != null) {
                ml.HI(context, this.f59011n, this.rl);
                n nVar = (n) this.J2.get();
                if (nVar != null) {
                    this.f59011n.drawableState = nVar.getState();
                }
                ml.ty(context, this.f59011n, this.rl);
                this.f59010O = true;
            }
            n nVar2 = (n) this.J2.get();
            if (nVar2 != null) {
                nVar2.n();
                nVar2.onStateChange(nVar2.getState());
            }
        }
    }

    public void mUb(n nVar) {
        this.J2 = new WeakReference(nVar);
    }

    public void qie(boolean z2) {
        this.f59010O = z2;
    }

    public void ty(Context context) {
        this.Uo.ty(context, this.f59011n, this.rl);
    }

    public Pl(n nVar) {
        mUb(nVar);
    }

    private void xMQ(String str) {
        this.f59012t = nr(str);
        this.nr = t(str);
        this.f59010O = false;
    }
}
