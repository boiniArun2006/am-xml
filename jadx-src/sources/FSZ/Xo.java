package FSZ;

import android.net.Uri;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Xo implements aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Xo f2607n;
    private static boolean rl;

    protected Uri O(Uri uri) {
        return uri;
    }

    public static synchronized Xo J2() {
        try {
            if (f2607n == null) {
                f2607n = new Xo();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2607n;
    }

    @Override // FSZ.aC
    public lN.Ml n(com.facebook.imagepipeline.request.j jVar, Object obj) {
        n nVar = new n(O(jVar.WPU()).toString(), jVar.o(), jVar.XQ(), jVar.xMQ(), null, null);
        if (rl) {
            nVar.t(null);
            return nVar;
        }
        nVar.t(obj);
        return nVar;
    }

    @Override // FSZ.aC
    public lN.Ml rl(com.facebook.imagepipeline.request.j jVar, Uri uri, Object obj) {
        return new lN.fuX(O(uri).toString());
    }

    protected Xo() {
    }

    @Override // FSZ.aC
    public lN.Ml nr(com.facebook.imagepipeline.request.j jVar, Object obj) {
        return rl(jVar, jVar.WPU(), obj);
    }

    @Override // FSZ.aC
    public lN.Ml t(com.facebook.imagepipeline.request.j jVar, Object obj) {
        lN.Ml ml;
        String name;
        Ic.n nVarAz = jVar.az();
        if (nVarAz != null) {
            lN.Ml mlN = nVarAz.n();
            name = nVarAz.getClass().getName();
            ml = mlN;
        } else {
            ml = null;
            name = null;
        }
        n nVar = new n(O(jVar.WPU()).toString(), jVar.o(), jVar.XQ(), jVar.xMQ(), ml, name);
        if (rl) {
            nVar.t(null);
            return nVar;
        }
        nVar.t(obj);
        return nVar;
    }
}
