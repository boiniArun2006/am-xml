package androidx.compose.material.icons.outlined;

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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0006\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", c.f62177j, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_info", "Landroidx/compose/material/icons/Icons$Outlined;", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Info", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Info.kt\nandroidx/compose/material/icons/outlined/InfoKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,59:1\n212#2,12:60\n233#2,18:73\n253#2:110\n174#3:72\n705#4,2:91\n717#4,2:93\n719#4,11:99\n72#5,4:95\n*S KotlinDebug\n*F\n+ 1 Info.kt\nandroidx/compose/material/icons/outlined/InfoKt\n*L\n29#1:60,12\n30#1:73,18\n30#1:110\n29#1:72\n30#1:91,2\n30#1:93,2\n30#1:99,11\n30#1:95,4\n*E\n"})
public final class InfoKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static ImageVector f23881n;

    public static final ImageVector n(Icons.Outlined outlined) {
        ImageVector imageVector = f23881n;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Info", Dp.KN(24.0f), Dp.KN(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int iN = VectorKt.n();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.n(), null);
        int iN2 = StrokeCap.INSTANCE.n();
        int iN3 = StrokeJoin.INSTANCE.n();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.xMQ(11.0f, 7.0f);
        pathBuilder.J2(2.0f);
        pathBuilder.az(2.0f);
        pathBuilder.J2(-2.0f);
        pathBuilder.n();
        pathBuilder.xMQ(11.0f, 11.0f);
        pathBuilder.J2(2.0f);
        pathBuilder.az(6.0f);
        pathBuilder.J2(-2.0f);
        pathBuilder.n();
        pathBuilder.xMQ(12.0f, 2.0f);
        pathBuilder.rl(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.gh(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.gh(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.mUb(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.n();
        pathBuilder.xMQ(12.0f, 20.0f);
        pathBuilder.t(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder.gh(3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilder.gh(8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder.gh(-3.59f, 8.0f, -8.0f, 8.0f);
        pathBuilder.n();
        ImageVector imageVectorJ2 = builder.t(pathBuilder.nr(), (14336 & 2) != 0 ? VectorKt.n() : iN, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? VectorKt.rl() : iN2, (14336 & 512) != 0 ? VectorKt.t() : iN3, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).J2();
        f23881n = imageVectorJ2;
        Intrinsics.checkNotNull(imageVectorJ2);
        return imageVectorJ2;
    }
}
