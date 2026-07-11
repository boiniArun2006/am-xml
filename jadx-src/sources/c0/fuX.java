package c0;

import FjR.fuX;
import Z.w6;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.InspectionModeKt;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final j f43498n = new j();

    public static final class j implements VyM.Ml {
        @Override // VyM.Ml
        public Drawable n() {
            return null;
        }

        j() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Z.fuX J2(long j2) {
        if (j2 == Size.INSTANCE.n()) {
            return Z.fuX.nr;
        }
        if (!AbstractC1676c.xMQ(j2)) {
            return null;
        }
        float fGh = Size.gh(j2);
        Z.w6 w6VarN = (Float.isInfinite(fGh) || Float.isNaN(fGh)) ? w6.n.f12274n : Z.j.n(MathKt.roundToInt(Size.gh(j2)));
        float fXMQ = Size.xMQ(j2);
        return new Z.fuX(w6VarN, (Float.isInfinite(fXMQ) || Float.isNaN(fXMQ)) ? w6.n.f12274n : Z.j.n(MathKt.roundToInt(Size.xMQ(j2))));
    }

    static /* synthetic */ Void KN(String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = "If you wish to display this " + str + ", use androidx.compose.foundation.Image.";
        }
        return Uo(str, str2);
    }

    private static final Void Uo(String str, String str2) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    public static final Wre nr(Object obj, eQ.fuX fux, Painter painter, Painter painter2, Painter painter3, Function1 function1, Function1 function12, Function1 function13, ContentScale contentScale, int i2, Xo xo, Composer composer, int i3, int i5, int i7) {
        composer.te(-79978785);
        if ((i7 & 4) != 0) {
            painter = null;
        }
        if ((i7 & 8) != 0) {
            painter2 = null;
        }
        if ((i7 & 16) != 0) {
            painter3 = painter2;
        }
        Wre wreO = O(new Dsr(obj, (i7 & 1024) != 0 ? eO.n() : xo, fux), AbstractC1676c.Ik(painter, painter2, painter3), AbstractC1676c.mUb((i7 & 32) != 0 ? null : function1, (i7 & 64) != 0 ? null : function12, (i7 & 128) == 0 ? function13 : null), (i7 & 256) != 0 ? ContentScale.INSTANCE.O() : contentScale, (i7 & 512) != 0 ? DrawScope.INSTANCE.rl() : i2, composer, (i3 >> 15) & 64512);
        composer.M7();
        return wreO;
    }

    private static final Wre O(Dsr dsr, Function1 function1, Function1 function12, ContentScale contentScale, int i2, Composer composer, int i3) {
        composer.te(952940650);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            FjR.fuX fuxQie = AbstractC1676c.qie(dsr.rl(), composer, 8);
            xMQ(fuxQie);
            composer.te(1094691773);
            Object objIF = composer.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = new Wre(fuxQie, dsr.n());
                composer.o(objIF);
            }
            Wre wre = (Wre) objIF;
            composer.M7();
            wre.rV9(function1);
            wre.N(function12);
            wre.e(contentScale);
            wre.X(i2);
            wre.s7N(((Boolean) composer.ty(InspectionModeKt.n())).booleanValue());
            wre.T(dsr.n());
            wre.wTp(fuxQie);
            wre.t();
            composer.M7();
            return wre;
        } finally {
            Trace.endSection();
        }
    }

    public static final Wre t(Object obj, eQ.fuX fux, Function1 function1, Function1 function12, ContentScale contentScale, int i2, Xo xo, Composer composer, int i3, int i5) {
        composer.te(1645646697);
        if ((i5 & 4) != 0) {
            function1 = Wre.eF.n();
        }
        if ((i5 & 8) != 0) {
            function12 = null;
        }
        if ((i5 & 16) != 0) {
            contentScale = ContentScale.INSTANCE.O();
        }
        if ((i5 & 32) != 0) {
            i2 = DrawScope.INSTANCE.rl();
        }
        if ((i5 & 64) != 0) {
            xo = eO.n();
        }
        int i7 = i2;
        ContentScale contentScale2 = contentScale;
        Function1 function13 = function1;
        Wre wreO = O(new Dsr(obj, xo, fux), function13, function12, contentScale2, i7, composer, (i3 >> 3) & 65520);
        composer.M7();
        return wreO;
    }

    private static final void xMQ(FjR.fuX fux) {
        Object objAz = fux.az();
        if (!(objAz instanceof fuX.j)) {
            if (!(objAz instanceof ImageBitmap)) {
                if (!(objAz instanceof ImageVector)) {
                    if (!(objAz instanceof Painter)) {
                        if (fux.v() == null) {
                            return;
                        } else {
                            throw new IllegalArgumentException("request.target must be null.");
                        }
                    } else {
                        KN("Painter", null, 2, null);
                        throw new KotlinNothingValueException();
                    }
                }
                KN("ImageVector", null, 2, null);
                throw new KotlinNothingValueException();
            }
            KN("ImageBitmap", null, 2, null);
            throw new KotlinNothingValueException();
        }
        Uo("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
        throw new KotlinNothingValueException();
    }
}
