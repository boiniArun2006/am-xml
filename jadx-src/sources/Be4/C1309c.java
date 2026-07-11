package Be4;

import Be4.aC;
import GJW.qYU;
import android.graphics.Bitmap;
import android.graphics.Movie;
import kotlin.coroutines.Continuation;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.BufferedSource;
import okio.Okio;

/* JADX INFO: renamed from: Be4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C1309c implements aC {
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final psW f540n;
    private final FjR.C rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f541t;

    /* JADX INFO: renamed from: Be4.c$j */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    /* JADX INFO: renamed from: Be4.c$n */
    public static final class n implements aC.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f542n;

        public n(boolean z2) {
            this.f542n = z2;
        }

        public boolean equals(Object obj) {
            return obj instanceof n;
        }

        public int hashCode() {
            return n.class.hashCode();
        }

        @Override // Be4.aC.j
        public aC n(Lf.qz qzVar, FjR.C c2, eQ.fuX fux) {
            if (QJ.t(Dsr.f521n, qzVar.t().Z())) {
                return new C1309c(qzVar.t(), c2, this.f542n);
            }
            return null;
        }

        public /* synthetic */ n(boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? true : z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fuX t(C1309c c1309c) {
        BufferedSource bufferedSourceBuffer = c1309c.f541t ? Okio.buffer(new C1311z(c1309c.f540n.Z())) : c1309c.f540n.Z();
        try {
            Movie movieDecodeStream = Movie.decodeStream(bufferedSourceBuffer.inputStream());
            CloseableKt.closeFinally(bufferedSourceBuffer, null);
            if (movieDecodeStream == null || movieDecodeStream.width() <= 0 || movieDecodeStream.height() <= 0) {
                throw new IllegalStateException("Failed to decode GIF.");
            }
            AL.w6 w6Var = new AL.w6(movieDecodeStream, (movieDecodeStream.isOpaque() && c1309c.rl.nr()) ? Bitmap.Config.RGB_565 : kYF.Wre.t(c1309c.rl.J2()) ? Bitmap.Config.ARGB_8888 : c1309c.rl.J2(), c1309c.rl.ty());
            Integer numNr = FjR.Wre.nr(c1309c.rl.qie());
            w6Var.O(numNr != null ? numNr.intValue() : -1);
            Function0 function0T = FjR.Wre.t(c1309c.rl.qie());
            Function0 function0Rl = FjR.Wre.rl(c1309c.rl.qie());
            if (function0T != null || function0Rl != null) {
                w6Var.t(kYF.Wre.rl(function0T, function0Rl));
            }
            FjR.Wre.n(c1309c.rl.qie());
            w6Var.nr(null);
            return new fuX(w6Var, false);
        } finally {
        }
    }

    @Override // Be4.aC
    public Object n(Continuation continuation) {
        return qYU.t(null, new Function0() { // from class: Be4.l3D
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C1309c.t(this.f555n);
            }
        }, continuation, 1, null);
    }

    public C1309c(psW psw, FjR.C c2, boolean z2) {
        this.f540n = psw;
        this.rl = c2;
        this.f541t = z2;
    }
}
