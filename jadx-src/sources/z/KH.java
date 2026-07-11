package z;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import com.alightcreative.app.motion.scene.Rectangle;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface KH {

    public static final class j {
        public static /* synthetic */ g9s n(KH kh, int i2, int i3, DC dc, String str, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: blankTexture");
            }
            if ((i5 & 8) != 0) {
                str = "blankTexture";
            }
            return kh.az(i2, i3, dc, str);
        }

        public static /* synthetic */ C2467Dsr rl(KH kh, Bitmap bitmap, EnumC2480t enumC2480t, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: textureForBitmap");
            }
            if ((i3 & 2) != 0) {
                enumC2480t = EnumC2480t.f76339t;
            }
            if ((i3 & 4) != 0) {
                i2 = 33984;
            }
            return kh.nr(bitmap, enumC2480t, i2);
        }

        public static /* synthetic */ ci t(KH kh, SurfaceTexture surfaceTexture, int i2, int i3, int i5, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: textureForSurfaceTexture");
            }
            if ((i7 & 8) != 0) {
                i5 = 0;
            }
            return kh.XQ(surfaceTexture, i2, i3, i5);
        }
    }

    public static final class n {
        private final Rectangle J2;
        private final int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final int f76252O;
        private final SceneElement Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final g9s f76253n;
        private final int nr;
        private final g9s rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final long f76254t;

        public n(g9s g9sVar, g9s g9sVar2, long j2, int i2, int i3, Rectangle cacheViewport, SceneElement sceneElement, int i5) {
            Intrinsics.checkNotNullParameter(cacheViewport, "cacheViewport");
            this.f76253n = g9sVar;
            this.rl = g9sVar2;
            this.f76254t = j2;
            this.nr = i2;
            this.f76252O = i3;
            this.J2 = cacheViewport;
            this.Uo = sceneElement;
            this.KN = i5;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f76253n, nVar.f76253n) && Intrinsics.areEqual(this.rl, nVar.rl) && this.f76254t == nVar.f76254t && this.nr == nVar.nr && this.f76252O == nVar.f76252O && Intrinsics.areEqual(this.J2, nVar.J2) && Intrinsics.areEqual(this.Uo, nVar.Uo) && this.KN == nVar.KN;
        }

        public final int J2() {
            return this.nr;
        }

        public final g9s KN() {
            return this.rl;
        }

        public final long O() {
            return this.f76254t;
        }

        public final Rectangle Uo() {
            return this.J2;
        }

        public int hashCode() {
            g9s g9sVar = this.f76253n;
            int iHashCode = (g9sVar == null ? 0 : g9sVar.hashCode()) * 31;
            g9s g9sVar2 = this.rl;
            int iHashCode2 = (((((((((iHashCode + (g9sVar2 == null ? 0 : g9sVar2.hashCode())) * 31) + Long.hashCode(this.f76254t)) * 31) + Integer.hashCode(this.nr)) * 31) + Integer.hashCode(this.f76252O)) * 31) + this.J2.hashCode()) * 31;
            SceneElement sceneElement = this.Uo;
            return ((iHashCode2 + (sceneElement != null ? sceneElement.hashCode() : 0)) * 31) + Integer.hashCode(this.KN);
        }

        public final g9s n() {
            return this.f76253n;
        }

        public final int nr() {
            return this.KN;
        }

        public final SceneElement rl() {
            return this.Uo;
        }

        public final int t() {
            return this.f76252O;
        }

        public String toString() {
            return "RenderCacheState(backCache=" + this.f76253n + ", frontCache=" + this.rl + ", cacheSelectedItem=" + this.f76254t + ", cacheTime=" + this.nr + ", cacheEditSerial=" + this.f76252O + ", cacheViewport=" + this.J2 + ", cacheCamera=" + this.Uo + ", cacheOrder=" + this.KN + ")";
        }

        public /* synthetic */ n(g9s g9sVar, g9s g9sVar2, long j2, int i2, int i3, Rectangle rectangle, SceneElement sceneElement, int i5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : g9sVar, (i7 & 2) != 0 ? null : g9sVar2, (i7 & 4) != 0 ? -1L : j2, (i7 & 8) != 0 ? -1 : i2, (i7 & 16) != 0 ? -1 : i3, (i7 & 32) != 0 ? Rectangle.INSTANCE.getEMPTY() : rectangle, (i7 & 64) != 0 ? null : sceneElement, (i7 & 128) != 0 ? -1 : i5);
        }
    }

    public static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final float f76256n;
        private final float nr;
        private final float rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final float f76257t;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final j f76255O = new j(null);
        private static final w6 J2 = new w6(0.0f, 0.0f, 0.0f, 0.0f);

        public static final class j {
            public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private j() {
            }

            public final w6 n() {
                return w6.J2;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w6)) {
                return false;
            }
            w6 w6Var = (w6) obj;
            return Float.compare(this.f76256n, w6Var.f76256n) == 0 && Float.compare(this.rl, w6Var.rl) == 0 && Float.compare(this.f76257t, w6Var.f76257t) == 0 && Float.compare(this.nr, w6Var.nr) == 0;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f76256n) * 31) + Float.hashCode(this.rl)) * 31) + Float.hashCode(this.f76257t)) * 31) + Float.hashCode(this.nr);
        }

        public final float nr() {
            return this.f76256n;
        }

        public final float rl() {
            return this.nr;
        }

        public final float t() {
            return this.f76257t;
        }

        public String toString() {
            return "TimeState(time=" + this.f76256n + ", fractionalTime=" + this.rl + ", startTime=" + this.f76257t + ", endTime=" + this.nr + ")";
        }

        public w6(float f3, float f4, float f5, float f6) {
            this.f76256n = f3;
            this.rl = f4;
            this.f76257t = f5;
            this.nr = f6;
        }
    }

    int HI();

    int Ik();

    void J2();

    void KN(n nVar);

    ci O(SurfaceTexture surfaceTexture);

    w6 S();

    Matrix Uo();

    ci XQ(SurfaceTexture surfaceTexture, int i2, int i3, int i5);

    void Z(g9s g9sVar);

    g9s az(int i2, int i3, DC dc, String str);

    WzY.QJ ck();

    g9s gh(Object obj, Function0 function0);

    l3D mUb(KClass kClass);

    void n(w6 w6Var);

    C2467Dsr nr(Bitmap bitmap, EnumC2480t enumC2480t, int i2);

    void o();

    g9s qie(Pmq pmq, String str);

    void r(g9s g9sVar);

    int rl();

    void t(Rectangle rectangle);

    n ty();

    Y5 xMQ(VisualEffect visualEffect, int i2);
}
