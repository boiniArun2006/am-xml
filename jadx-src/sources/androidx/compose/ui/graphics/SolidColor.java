package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Immutable
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/graphics/SolidColor;", "Landroidx/compose/ui/graphics/Brush;", "Landroidx/compose/ui/graphics/Color;", "value", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/graphics/Paint;", TtmlNode.TAG_P, "", "alpha", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(JLandroidx/compose/ui/graphics/Paint;F)V", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "t", "J", "()J", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SolidColor extends Brush {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final long value;

    public /* synthetic */ SolidColor(long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SolidColor) && Color.HI(this.value, ((SolidColor) other).value);
    }

    private SolidColor(long j2) {
        super(null);
        this.value = j2;
    }

    public int hashCode() {
        return Color.XQ(this.value);
    }

    @Override // androidx.compose.ui.graphics.Brush
    public void n(long size, Paint p2, float alpha) {
        long jAz;
        p2.rl(1.0f);
        if (alpha == 1.0f) {
            jAz = this.value;
        } else {
            long j2 = this.value;
            jAz = Color.az(j2, Color.ck(j2) * alpha, 0.0f, 0.0f, 0.0f, 14, null);
        }
        p2.WPU(jAz);
        if (p2.iF() != null) {
            p2.te(null);
        }
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) Color.S(this.value)) + ')';
    }
}
