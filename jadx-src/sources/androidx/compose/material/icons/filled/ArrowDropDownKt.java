package androidx.compose.material.icons.filled;

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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0006\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", c.f62177j, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_arrowDropDown", "Landroidx/compose/material/icons/Icons$Filled;", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "ArrowDropDown", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nArrowDropDown.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrowDropDown.kt\nandroidx/compose/material/icons/filled/ArrowDropDownKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,41:1\n212#2,12:42\n233#2,18:55\n253#2:92\n174#3:54\n705#4,2:73\n717#4,2:75\n719#4,11:81\n72#5,4:77\n*S KotlinDebug\n*F\n+ 1 ArrowDropDown.kt\nandroidx/compose/material/icons/filled/ArrowDropDownKt\n*L\n29#1:42,12\n30#1:55,18\n30#1:92\n29#1:54\n30#1:73,2\n30#1:75,2\n30#1:81,11\n30#1:77,4\n*E\n"})
public final class ArrowDropDownKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static ImageVector f23871n;

    public static final ImageVector n(Icons.Filled filled) {
        ImageVector imageVector = f23871n;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ArrowDropDown", Dp.KN(24.0f), Dp.KN(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int iN = VectorKt.n();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.n(), null);
        int iN2 = StrokeCap.INSTANCE.n();
        int iN3 = StrokeJoin.INSTANCE.n();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.xMQ(7.0f, 10.0f);
        pathBuilder.KN(5.0f, 5.0f);
        pathBuilder.KN(5.0f, -5.0f);
        pathBuilder.n();
        ImageVector imageVectorJ2 = builder.t(pathBuilder.nr(), (14336 & 2) != 0 ? VectorKt.n() : iN, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? VectorKt.rl() : iN2, (14336 & 512) != 0 ? VectorKt.t() : iN3, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).J2();
        f23871n = imageVectorJ2;
        Intrinsics.checkNotNull(imageVectorJ2);
        return imageVectorJ2;
    }
}
