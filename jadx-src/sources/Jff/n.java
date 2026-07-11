package Jff;

import Hh.C;
import OLt.InterfaceC1421z;
import android.R;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.safedk.android.internal.d;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class n {
    private ColorFilter HI;
    private List Ik;
    private Drawable J2;
    private Drawable KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private InterfaceC1421z f4634O;
    private InterfaceC1421z Uo;
    private Matrix az;
    private Drawable ck;
    private InterfaceC1421z gh;
    private Drawable mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Resources f4635n;
    private Drawable nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private I28 f4636o;
    private InterfaceC1421z qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f4637r;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f4638t;
    private PointF ty;
    private InterfaceC1421z xMQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final InterfaceC1421z f4633Z = InterfaceC1421z.KN;
    public static final InterfaceC1421z XQ = InterfaceC1421z.xMQ;

    private void Z() {
        this.rl = d.f62986a;
        this.f4638t = 0.0f;
        this.nr = null;
        InterfaceC1421z interfaceC1421z = f4633Z;
        this.f4634O = interfaceC1421z;
        this.J2 = null;
        this.Uo = interfaceC1421z;
        this.KN = null;
        this.xMQ = interfaceC1421z;
        this.mUb = null;
        this.gh = interfaceC1421z;
        this.qie = XQ;
        this.az = null;
        this.ty = null;
        this.HI = null;
        this.ck = null;
        this.Ik = null;
        this.f4637r = null;
        this.f4636o = null;
    }

    private void nHg() {
        List list = this.Ik;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C.Uo((Drawable) it.next());
            }
        }
    }

    public n E2(Drawable drawable) {
        this.mUb = drawable;
        return this;
    }

    public InterfaceC1421z HI() {
        return this.gh;
    }

    public Drawable Ik() {
        return this.J2;
    }

    public float J2() {
        return this.f4638t;
    }

    public Drawable KN() {
        return this.KN;
    }

    public n N(I28 i28) {
        this.f4636o = i28;
        return this;
    }

    public Drawable O() {
        return this.ck;
    }

    public n S(Drawable drawable) {
        this.ck = drawable;
        return this;
    }

    public n T(InterfaceC1421z interfaceC1421z) {
        this.Uo = interfaceC1421z;
        return this;
    }

    public int Uo() {
        return this.rl;
    }

    public n ViF(Drawable drawable) {
        this.KN = drawable;
        return this;
    }

    public n WPU(float f3) {
        this.f4638t = f3;
        return this;
    }

    public n X(Drawable drawable) {
        this.J2 = drawable;
        return this;
    }

    public n XQ(InterfaceC1421z interfaceC1421z) {
        this.qie = interfaceC1421z;
        this.az = null;
        return this;
    }

    public n aYN(int i2) {
        this.rl = i2;
        return this;
    }

    public Drawable az() {
        return this.f4637r;
    }

    public Resources ck() {
        return this.f4635n;
    }

    public n e(InterfaceC1421z interfaceC1421z) {
        this.gh = interfaceC1421z;
        return this;
    }

    public n fD(Drawable drawable) {
        if (drawable == null) {
            this.f4637r = null;
            return this;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable);
        this.f4637r = stateListDrawable;
        return this;
    }

    public n g(Drawable drawable) {
        if (drawable == null) {
            this.Ik = null;
            return this;
        }
        this.Ik = Arrays.asList(drawable);
        return this;
    }

    public Drawable gh() {
        return this.nr;
    }

    public n iF(InterfaceC1421z interfaceC1421z) {
        this.f4634O = interfaceC1421z;
        return this;
    }

    public List mUb() {
        return this.Ik;
    }

    public n nY(InterfaceC1421z interfaceC1421z) {
        this.xMQ = interfaceC1421z;
        return this;
    }

    public InterfaceC1421z nr() {
        return this.qie;
    }

    public I28 o() {
        return this.f4636o;
    }

    public InterfaceC1421z qie() {
        return this.f4634O;
    }

    public InterfaceC1421z r() {
        return this.Uo;
    }

    public ColorFilter rl() {
        return this.HI;
    }

    public PointF t() {
        return this.ty;
    }

    public n te(Drawable drawable) {
        this.nr = drawable;
        return this;
    }

    public Drawable ty() {
        return this.mUb;
    }

    public InterfaceC1421z xMQ() {
        return this.xMQ;
    }

    public n(Resources resources) {
        this.f4635n = resources;
        Z();
    }

    public j n() {
        nHg();
        return new j(this);
    }
}
