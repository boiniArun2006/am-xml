package dX;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class I28 {
    private boolean J2;
    private Bitmap.Config KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f63507O;
    private boolean Uo;
    private ColorSpace gh;
    private bAP.n mUb;
    private boolean nr;
    private boolean qie;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f63509t;
    private Bitmap.Config xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f63508n = 100;
    private int rl = Integer.MAX_VALUE;

    public NP.j nr() {
        return null;
    }

    public bAP.n J2() {
        return this.mUb;
    }

    public boolean KN() {
        return this.f63509t;
    }

    public ColorSpace O() {
        return this.gh;
    }

    public boolean Uo() {
        return this.J2;
    }

    public boolean az() {
        return this.f63507O;
    }

    public int gh() {
        return this.rl;
    }

    public boolean mUb() {
        return this.Uo;
    }

    public Ml n() {
        return new Ml(this);
    }

    public int qie() {
        return this.f63508n;
    }

    public Bitmap.Config rl() {
        return this.xMQ;
    }

    public Bitmap.Config t() {
        return this.KN;
    }

    public boolean ty() {
        return this.nr;
    }

    public boolean xMQ() {
        return this.qie;
    }

    public I28() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.KN = config;
        this.xMQ = config;
    }
}
