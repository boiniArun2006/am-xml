package com.facebook.imagepipeline.request;

import Hh.C;
import Ic.n;
import android.net.Uri;
import com.facebook.imagepipeline.request.j;
import dX.C1954n;
import dX.CN3;
import dX.Ml;
import dX.Wre;
import dX.fuX;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import jl.I28;
import ln.Pl;
import ln.l3D;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class ImageRequestBuilder {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final Set f52628Z = new HashSet();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f52632r;
    private I28 ty;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Uri f52630n = null;
    private j.w6 rl = j.w6.FULL_FETCH;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f52633t = 0;
    private CN3 nr = null;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private fuX f52629O = null;
    private Ml J2 = Ml.n();
    private j.n Uo = j.n.DEFAULT;
    private boolean KN = l3D.N().n();
    private boolean xMQ = false;
    private boolean mUb = false;
    private Wre gh = Wre.J2;
    private n qie = null;
    private Boolean az = null;
    private C1954n HI = null;
    private Boolean ck = null;
    private Pl Ik = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f52631o = null;

    public static class BuilderException extends RuntimeException {
        public BuilderException(String str) {
            super("Invalid request builder: " + str);
        }
    }

    public static ImageRequestBuilder aYN(Uri uri) {
        return new ImageRequestBuilder().jB(uri);
    }

    private ImageRequestBuilder g(int i2) {
        this.f52633t = i2;
        if (this.Uo != j.n.DYNAMIC) {
            this.f52631o = null;
        }
        return this;
    }

    public static boolean o(Uri uri) {
        Set set = f52628Z;
        if (set != null && uri != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(uri.getScheme())) {
                    return true;
                }
            }
        }
        return false;
    }

    public ImageRequestBuilder E2(Ml ml) {
        this.J2 = ml;
        return this;
    }

    public CN3 HI() {
        return this.nr;
    }

    public fuX Ik() {
        return this.f52629O;
    }

    public int J2() {
        return this.f52632r;
    }

    public Pl KN() {
        return this.Ik;
    }

    public ImageRequestBuilder N(n nVar) {
        this.qie = nVar;
        return this;
    }

    public int O() {
        return this.f52633t;
    }

    protected void P5() {
        Uri uri = this.f52630n;
        if (uri == null) {
            throw new BuilderException("Source must be set!");
        }
        if (vn.I28.ty(uri)) {
            if (!this.f52630n.isAbsolute()) {
                throw new BuilderException("Resource URI path must be absolute.");
            }
            if (this.f52630n.getPath().isEmpty()) {
                throw new BuilderException("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.f52630n.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new BuilderException("Resource URI path must be a resource id.");
            }
        }
        if (vn.I28.xMQ(this.f52630n) && !this.f52630n.isAbsolute()) {
            throw new BuilderException("Asset URI path must be absolute.");
        }
    }

    public boolean S() {
        return (this.f52633t & 15) == 0;
    }

    public ImageRequestBuilder T(j.w6 w6Var) {
        this.rl = w6Var;
        return this;
    }

    public Boolean U() {
        return this.az;
    }

    public String Uo() {
        return this.f52631o;
    }

    public ImageRequestBuilder ViF(C1954n c1954n) {
        this.HI = c1954n;
        return this;
    }

    public boolean WPU() {
        return this.KN;
    }

    public ImageRequestBuilder X(boolean z2) {
        this.xMQ = z2;
        return this;
    }

    public boolean XQ() {
        return this.xMQ;
    }

    public ImageRequestBuilder Xw(Boolean bool) {
        this.az = bool;
        return this;
    }

    public boolean Z() {
        if ((this.f52633t & 48) == 0) {
            return vn.I28.HI(this.f52630n) || o(this.f52630n);
        }
        return false;
    }

    public I28 az() {
        return this.ty;
    }

    public ImageRequestBuilder bzg(fuX fux) {
        this.f52629O = fux;
        return this;
    }

    public Boolean ck() {
        return this.ck;
    }

    public ImageRequestBuilder e(boolean z2) {
        this.mUb = z2;
        return this;
    }

    public ImageRequestBuilder fD(Pl pl) {
        this.Ik = pl;
        return this;
    }

    public j.w6 gh() {
        return this.rl;
    }

    public ImageRequestBuilder iF(String str) {
        this.f52631o = str;
        return this;
    }

    public boolean mUb() {
        return this.mUb;
    }

    public ImageRequestBuilder nHg(boolean z2) {
        this.KN = z2;
        return this;
    }

    public ImageRequestBuilder nY(j.n nVar) {
        this.Uo = nVar;
        return this;
    }

    public j.n nr() {
        return this.Uo;
    }

    public n qie() {
        return this.qie;
    }

    public Uri r() {
        return this.f52630n;
    }

    public ImageRequestBuilder rV9(Boolean bool) {
        this.ck = bool;
        return this;
    }

    public ImageRequestBuilder s7N(I28 i28) {
        this.ty = i28;
        return this;
    }

    public C1954n t() {
        return this.HI;
    }

    public ImageRequestBuilder te(int i2) {
        this.f52632r = i2;
        return this;
    }

    public Wre ty() {
        return this.gh;
    }

    public ImageRequestBuilder v(CN3 cn3) {
        this.nr = cn3;
        return this;
    }

    public ImageRequestBuilder wTp(Wre wre) {
        this.gh = wre;
        return this;
    }

    public Ml xMQ() {
        return this.J2;
    }

    private ImageRequestBuilder() {
    }

    public static ImageRequestBuilder rl(j jVar) {
        return aYN(jVar.WPU()).E2(jVar.xMQ()).ViF(jVar.t()).nY(jVar.nr()).X(jVar.gh()).e(jVar.mUb()).T(jVar.qie()).g(jVar.O()).N(jVar.az()).nHg(jVar.Ik()).wTp(jVar.ck()).v(jVar.o()).s7N(jVar.r()).bzg(jVar.XQ()).Xw(jVar.g()).te(jVar.J2()).iF(jVar.Uo()).fD(jVar.KN()).rV9(jVar.Z());
    }

    public ImageRequestBuilder jB(Uri uri) {
        C.Uo(uri);
        this.f52630n = uri;
        return this;
    }

    public j n() {
        P5();
        return new j(this);
    }
}
