package dQG;

import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLSurface;
import android.view.Surface;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface j {

    public static final class Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f63498n;
        private final int rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ml)) {
                return false;
            }
            Ml ml = (Ml) obj;
            return this.f63498n == ml.f63498n && this.rl == ml.rl;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f63498n) * 31) + Integer.hashCode(this.rl);
        }

        public String toString() {
            return "Version(major=" + this.f63498n + ", minor=" + this.rl + ")";
        }

        public Ml(int i2, int i3) {
            this.f63498n = i2;
            this.rl = i3;
        }
    }

    /* JADX INFO: renamed from: dQG.j$j, reason: collision with other inner class name */
    public static final class C0839j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final EGLSurface f63499n;
        private final EGLSurface rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final EGLContext f63500t;

        public /* synthetic */ C0839j(EGLSurface eGLSurface, EGLSurface eGLSurface2, EGLContext eGLContext, DefaultConstructorMarker defaultConstructorMarker) {
            this(eGLSurface, eGLSurface2, eGLContext);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0839j)) {
                return false;
            }
            C0839j c0839j = (C0839j) obj;
            return dQG.Ml.rl(this.f63499n, c0839j.f63499n) && dQG.Ml.rl(this.rl, c0839j.rl) && dQG.w6.rl(this.f63500t, c0839j.f63500t);
        }

        private C0839j(EGLSurface draw, EGLSurface read, EGLContext context) {
            Intrinsics.checkNotNullParameter(draw, "draw");
            Intrinsics.checkNotNullParameter(read, "read");
            Intrinsics.checkNotNullParameter(context, "context");
            this.f63499n = draw;
            this.rl = read;
            this.f63500t = context;
        }

        public int hashCode() {
            return (((dQG.Ml.t(this.f63499n) * 31) + dQG.Ml.t(this.rl)) * 31) + dQG.w6.t(this.f63500t);
        }

        public final EGLContext n() {
            return this.f63500t;
        }

        public final EGLSurface rl() {
            return this.f63499n;
        }

        public final EGLSurface t() {
            return this.rl;
        }

        public String toString() {
            return "ContextAndSurfaces(draw=" + dQG.Ml.nr(this.f63499n) + ", read=" + dQG.Ml.nr(this.rl) + ", context=" + dQG.w6.nr(this.f63500t) + ")";
        }
    }

    public static final class n {
        public static /* synthetic */ EGLSurface n(j jVar, EGLConfig eGLConfig, Surface surface, Map map, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createWindowSurface-RojgJiY");
            }
            if ((i2 & 4) != 0) {
                map = MapsKt.emptyMap();
            }
            return jVar.nr(eGLConfig, surface, map);
        }
    }

    public interface w6 {

        /* JADX INFO: renamed from: dQG.j$w6$j, reason: collision with other inner class name */
        public static final class C0840j {
            public static /* synthetic */ j n(w6 w6Var, int i2, int i3, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: egl");
                }
                if ((i3 & 1) != 0) {
                    i2 = 0;
                }
                return w6Var.n(i2);
            }
        }

        j n(int i2);
    }

    EGLSurface J2(EGLConfig eGLConfig, Map map);

    void KN(EGLSurface eGLSurface);

    void O(EGLContext eGLContext);

    void Uo(EGLSurface eGLSurface, long j2);

    EGLContext mUb(EGLConfig eGLConfig, EGLContext eGLContext, Map map);

    int n(EGLSurface eGLSurface, int i2);

    EGLSurface nr(EGLConfig eGLConfig, Surface surface, Map map);

    void rl(EGLSurface eGLSurface);

    void t(C0839j c0839j);

    List xMQ(Map map);
}
