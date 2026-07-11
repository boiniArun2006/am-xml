package Hwc;

import FSZ.aC;
import SY6.n;
import android.content.Context;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.j;
import dX.fuX;
import java.util.Set;
import ln.QJ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class I28 extends SY6.n {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Hh.Wre f3986S;
    private final CN3 XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final QJ f3987Z;

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f3988n;

        static {
            int[] iArr = new int[n.w6.values().length];
            f3988n = iArr;
            try {
                iArr[n.w6.FULL_FETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3988n[n.w6.DISK_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3988n[n.w6.BITMAP_MEMORY_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static j.w6 E2(n.w6 w6Var) {
        int i2 = j.f3988n[w6Var.ordinal()];
        if (i2 == 1) {
            return j.w6.FULL_FETCH;
        }
        if (i2 == 2) {
            return j.w6.DISK_CACHE;
        }
        if (i2 == 3) {
            return j.w6.BITMAP_MEMORY_CACHE;
        }
        throw new RuntimeException("Cache level" + w6Var + "is not supported. ");
    }

    protected jl.I28 T(htt.j jVar) {
        if (jVar instanceof Ml) {
            return ((Ml) jVar).xg();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // SY6.n
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public com.facebook.datasource.w6 xMQ(htt.j jVar, String str, com.facebook.imagepipeline.request.j jVar2, Object obj, n.w6 w6Var) {
        return this.f3987Z.n(jVar2, obj, E2(w6Var), T(jVar), str);
    }

    @Override // htt.Ml
    /* JADX INFO: renamed from: s7N, reason: merged with bridge method [inline-methods] */
    public I28 rl(Uri uri) {
        return uri == null ? (I28) super.te(null) : (I28) super.te(ImageRequestBuilder.aYN(uri).bzg(fuX.nr()).n());
    }

    public I28 wTp(String str) {
        return (str == null || str.isEmpty()) ? (I28) super.te(com.facebook.imagepipeline.request.j.rl(str)) : rl(Uri.parse(str));
    }

    public I28(Context context, CN3 cn3, QJ qj, Set set, Set set2) {
        super(context, set, set2);
        this.f3987Z = qj;
        this.XQ = cn3;
    }

    private lN.Ml e() {
        com.facebook.imagepipeline.request.j jVar = (com.facebook.imagepipeline.request.j) ty();
        aC aCVarNr = this.f3987Z.nr();
        if (aCVarNr != null && jVar != null) {
            if (jVar.az() != null) {
                return aCVarNr.t(jVar, J2());
            }
            return aCVarNr.n(jVar, J2());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // SY6.n
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public Ml aYN() {
        Ml mlT;
        if (T5.n.nr()) {
            T5.n.n("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            htt.j jVarCk = ck();
            String strO = SY6.n.O();
            if (jVarCk instanceof Ml) {
                mlT = (Ml) jVarCk;
            } else {
                mlT = this.XQ.t();
            }
            Ml ml = mlT;
            ml.ofS(ViF(ml, strO), strO, e(), J2(), this.f3986S);
            ml.C(null, this);
            if (T5.n.nr()) {
                T5.n.rl();
            }
            return ml;
        } catch (Throwable th) {
            if (T5.n.nr()) {
                T5.n.rl();
            }
            throw th;
        }
    }

    public I28 nHg(QVk.CN3 cn3) {
        return (I28) r();
    }
}
