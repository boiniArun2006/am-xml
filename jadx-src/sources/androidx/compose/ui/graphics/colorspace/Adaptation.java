package androidx.compose.ui.graphics.colorspace;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\t\b&\u0018\u0000 \b2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Adaptation;", "", "", "transform", "<init>", "([F)V", c.f62177j, "[F", "rl", "()[F", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Adaptation {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Adaptation f31590O;
    private static final Adaptation nr;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Adaptation f31591t;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final float[] transform;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Adaptation$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "Bradford", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", c.f62177j, "()Landroidx/compose/ui/graphics/colorspace/Adaptation;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Adaptation n() {
            return Adaptation.f31591t;
        }
    }

    public /* synthetic */ Adaptation(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    static {
        final float[] fArr = {0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f};
        f31591t = new Adaptation(fArr) { // from class: androidx.compose.ui.graphics.colorspace.Adaptation$Companion$Bradford$1
            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            public String toString() {
                return "Bradford";
            }
        };
        final float[] fArr2 = {0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f};
        nr = new Adaptation(fArr2) { // from class: androidx.compose.ui.graphics.colorspace.Adaptation$Companion$VonKries$1
            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            public String toString() {
                return "VonKries";
            }
        };
        final float[] fArr3 = {0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f};
        f31590O = new Adaptation(fArr3) { // from class: androidx.compose.ui.graphics.colorspace.Adaptation$Companion$Ciecat02$1
            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            public String toString() {
                return "Ciecat02";
            }
        };
    }

    private Adaptation(float[] fArr) {
        this.transform = fArr;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }
}
