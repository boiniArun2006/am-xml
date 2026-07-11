package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Immutable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001 B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R&\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u0017R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u001d\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/Shadow;", "", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/ui/geometry/Offset;", "offset", "", "blurRadius", "<init>", "(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "J", "t", "()J", "getColor-0d7_KjU$annotations", "()V", "rl", "nr", "getOffset-F1C5BW0$annotations", "F", "()F", "getBlurRadius$annotations", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Shadow {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final long color;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final long offset;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final float blurRadius;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Shadow f31552O = new Shadow(0, 0, 0.0f, 7, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/Shadow$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Shadow;", "None", "Landroidx/compose/ui/graphics/Shadow;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "()Landroidx/compose/ui/graphics/Shadow;", "getNone$annotations", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Shadow n() {
            return Shadow.f31552O;
        }
    }

    public /* synthetic */ Shadow(long j2, long j3, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, f3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) other;
        return Color.HI(this.color, shadow.color) && Offset.mUb(this.offset, shadow.offset) && this.blurRadius == shadow.blurRadius;
    }

    private Shadow(long j2, long j3, float f3) {
        this.color = j2;
        this.offset = j3;
        this.blurRadius = f3;
    }

    public int hashCode() {
        return (((Color.XQ(this.color) * 31) + Offset.HI(this.offset)) * 31) + Float.hashCode(this.blurRadius);
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final float getBlurRadius() {
        return this.blurRadius;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    public String toString() {
        return "Shadow(color=" + ((Object) Color.S(this.color)) + ", offset=" + ((Object) Offset.o(this.offset)) + ", blurRadius=" + this.blurRadius + ')';
    }

    public /* synthetic */ Shadow(long j2, long j3, float f3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? ColorKt.nr(4278190080L) : j2, (i2 & 2) != 0 ? Offset.INSTANCE.t() : j3, (i2 & 4) != 0 ? 0.0f : f3, null);
    }
}
