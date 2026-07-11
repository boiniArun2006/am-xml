package androidx.compose.material.icons.automirrored.rounded;

import ScC.FuwU.XIvb;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0006\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", c.f62177j, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_keyboardArrowRight", "Landroidx/compose/material/icons/Icons$AutoMirrored$Rounded;", "(Landroidx/compose/material/icons/Icons$AutoMirrored$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "KeyboardArrowRight", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKeyboardArrowRight.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyboardArrowRight.kt\nandroidx/compose/material/icons/automirrored/rounded/KeyboardArrowRightKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,49:1\n223#2:50\n216#2,3:51\n219#2,4:55\n233#2,18:59\n253#2:96\n174#3:54\n705#4,2:77\n717#4,2:79\n719#4,11:85\n72#5,4:81\n*S KotlinDebug\n*F\n+ 1 KeyboardArrowRight.kt\nandroidx/compose/material/icons/automirrored/rounded/KeyboardArrowRightKt\n*L\n29#1:50\n29#1:51,3\n29#1:55,4\n31#1:59,18\n31#1:96\n29#1:54\n31#1:77,2\n31#1:79,2\n31#1:85,11\n31#1:81,4\n*E\n"})
public final class KeyboardArrowRightKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static ImageVector f23870n;

    public static final ImageVector n(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = f23870n;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.KeyboardArrowRight", Dp.KN(24.0f), Dp.KN(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int iN = VectorKt.n();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.n(), null);
        int iN2 = StrokeCap.INSTANCE.n();
        int iN3 = StrokeJoin.INSTANCE.n();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.xMQ(9.29f, 15.88f);
        pathBuilder.Uo(13.17f, 12.0f);
        pathBuilder.Uo(9.29f, 8.12f);
        pathBuilder.t(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.t(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.KN(4.59f, 4.59f);
        pathBuilder.t(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.Uo(10.7f, 17.3f);
        pathBuilder.t(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilder.t(-0.38f, -0.39f, -0.39f, -1.03f, 0.0f, -1.42f);
        pathBuilder.n();
        ImageVector imageVectorJ2 = builder.t(pathBuilder.nr(), (14336 & 2) != 0 ? VectorKt.n() : iN, (14336 & 4) != 0 ? "" : XIvb.TxRSafe, (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? VectorKt.rl() : iN2, (14336 & 512) != 0 ? VectorKt.t() : iN3, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).J2();
        f23870n = imageVectorJ2;
        Intrinsics.checkNotNull(imageVectorJ2);
        return imageVectorJ2;
    }
}
