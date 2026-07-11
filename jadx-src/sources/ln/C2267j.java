package ln;

import Pj0.j;
import android.util.Log;
import com.facebook.common.references.SharedReference;
import java.io.Closeable;

/* JADX INFO: renamed from: ln.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class C2267j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j.w6 f70502n;

    /* JADX INFO: renamed from: ln.j$j, reason: collision with other inner class name */
    class C1049j implements j.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ xf.j f70503n;

        C1049j(xf.j jVar) {
            this.f70503n = jVar;
        }

        @Override // Pj0.j.w6
        public void n(SharedReference sharedReference, Throwable th) {
            this.f70503n.n(sharedReference, th);
            Object objJ2 = sharedReference.J2();
            Dzy.j.ViF("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(sharedReference)), objJ2 != null ? objJ2.getClass().getName() : "<value is null>", C2267j.nr(th));
        }

        @Override // Pj0.j.w6
        public boolean rl() {
            return this.f70503n.rl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String nr(Throwable th) {
        return th == null ? "" : Log.getStackTraceString(th);
    }

    public Pj0.j rl(Closeable closeable) {
        return Pj0.j.z(closeable, this.f70502n);
    }

    public Pj0.j t(Object obj, Pj0.fuX fux) {
        return Pj0.j.fcU(obj, fux, this.f70502n);
    }

    public C2267j(xf.j jVar) {
        this.f70502n = new C1049j(jVar);
    }
}
