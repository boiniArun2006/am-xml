package androidx.compose.material.icons.automirrored.filled;

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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0006\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", c.f62177j, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_arrowBack", "Landroidx/compose/material/icons/Icons$AutoMirrored$Filled;", "(Landroidx/compose/material/icons/Icons$AutoMirrored$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "ArrowBack", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nArrowBack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrowBack.kt\nandroidx/compose/material/icons/automirrored/filled/ArrowBackKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,48:1\n223#2:49\n216#2,3:50\n219#2,4:54\n233#2,18:58\n253#2:95\n174#3:53\n705#4,2:76\n717#4,2:78\n719#4,11:84\n72#5,4:80\n*S KotlinDebug\n*F\n+ 1 ArrowBack.kt\nandroidx/compose/material/icons/automirrored/filled/ArrowBackKt\n*L\n29#1:49\n29#1:50,3\n29#1:54,4\n30#1:58,18\n30#1:95\n29#1:53\n30#1:76,2\n30#1:78,2\n30#1:84,11\n30#1:80,4\n*E\n"})
public final class ArrowBackKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static ImageVector f23867n;

    public static final ImageVector n(Icons.AutoMirrored.Filled filled) {
        ImageVector imageVector = f23867n;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.ArrowBack", Dp.KN(24.0f), Dp.KN(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int iN = VectorKt.n();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.n(), null);
        int iN2 = StrokeCap.INSTANCE.n();
        int iN3 = StrokeJoin.INSTANCE.n();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.xMQ(20.0f, 11.0f);
        pathBuilder.O(7.83f);
        pathBuilder.KN(5.59f, -5.59f);
        pathBuilder.Uo(12.0f, 4.0f);
        pathBuilder.KN(-8.0f, 8.0f);
        pathBuilder.KN(8.0f, 8.0f);
        pathBuilder.KN(1.41f, -1.41f);
        pathBuilder.Uo(7.83f, 13.0f);
        pathBuilder.O(20.0f);
        pathBuilder.az(-2.0f);
        pathBuilder.n();
        ImageVector imageVectorJ2 = builder.t(pathBuilder.nr(), (14336 & 2) != 0 ? VectorKt.n() : iN, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? VectorKt.rl() : iN2, (14336 & 512) != 0 ? VectorKt.t() : iN3, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).J2();
        f23867n = imageVectorJ2;
        Intrinsics.checkNotNull(imageVectorJ2);
        return imageVectorJ2;
    }
}
