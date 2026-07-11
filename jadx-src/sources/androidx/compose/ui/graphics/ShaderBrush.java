package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Immutable
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u001c\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/Brush;", "<init>", "()V", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "t", "(J)Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Paint;", TtmlNode.TAG_P, "", "alpha", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(JLandroidx/compose/ui/graphics/Paint;F)V", "Landroid/graphics/Shader;", "internalShader", "nr", "J", "createdSize", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/ShaderBrush\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,658:1\n1#2:659\n*E\n"})
public abstract class ShaderBrush extends Brush {

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private long createdSize;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Shader internalShader;

    public ShaderBrush() {
        super(null);
        this.createdSize = Size.INSTANCE.n();
    }

    public abstract Shader t(long size);

    @Override // androidx.compose.ui.graphics.Brush
    public final void n(long size, Paint p2, float alpha) {
        Shader shaderT = this.internalShader;
        if (shaderT == null || !Size.KN(this.createdSize, size)) {
            if (Size.az(size)) {
                shaderT = null;
                this.internalShader = null;
                this.createdSize = Size.INSTANCE.n();
            } else {
                shaderT = t(size);
                this.internalShader = shaderT;
                this.createdSize = size;
            }
        }
        long jT2 = p2.t();
        Color.Companion companion = Color.INSTANCE;
        if (!Color.HI(jT2, companion.n())) {
            p2.WPU(companion.n());
        }
        if (!Intrinsics.areEqual(p2.iF(), shaderT)) {
            p2.te(shaderT);
        }
        if (p2.n() == alpha) {
            return;
        }
        p2.rl(alpha);
    }
}
