package androidx.compose.material.internal;

import androidx.compose.runtime.internal.StabilityInferred;
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
@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/internal/Icons;", "", "()V", "Filled", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Icons {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Icons f23911n = new Icons();

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/material/internal/Icons$Filled;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/vector/ImageVector;", "rl", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_arrowDropDown", c.f62177j, "()Landroidx/compose/ui/graphics/vector/ImageVector;", "ArrowDropDown", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nIcons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icons.kt\nandroidx/compose/material/internal/Icons$Filled\n+ 2 Icons.kt\nandroidx/compose/material/internal/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n64#2:88\n57#2,3:89\n60#2,3:93\n67#2,15:96\n84#2:130\n65#2:131\n169#3:92\n710#4,2:111\n722#4,2:113\n724#4,11:119\n72#5,4:115\n*S KotlinDebug\n*F\n+ 1 Icons.kt\nandroidx/compose/material/internal/Icons$Filled\n*L\n38#1:88\n38#1:89,3\n38#1:93,3\n39#1:96,15\n39#1:130\n38#1:131\n38#1:92\n39#1:111,2\n39#1:113,2\n39#1:119,11\n39#1:115,4\n*E\n"})
    public static final class Filled {

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private static ImageVector _arrowDropDown;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Filled f23912n = new Filled();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f23913t = 8;

        public final ImageVector n() {
            ImageVector imageVector = _arrowDropDown;
            if (imageVector != null) {
                Intrinsics.checkNotNull(imageVector);
                return imageVector;
            }
            ImageVector.Builder builder = new ImageVector.Builder("Filled.ArrowDropDown", Dp.KN(24.0f), Dp.KN(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
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
            _arrowDropDown = imageVectorJ2;
            Intrinsics.checkNotNull(imageVectorJ2);
            return imageVectorJ2;
        }

        private Filled() {
        }
    }

    private Icons() {
    }
}
