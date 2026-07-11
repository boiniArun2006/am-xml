package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Stable
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\bJ\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/ContentScale;", "", "Landroidx/compose/ui/geometry/Size;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/ScaleFactor;", c.f62177j, "(JJ)J", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ContentScale {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f32220n;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\f\u0010\bR \u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u000f\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u001c\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0018\u0010\u001aR \u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u0005\u0010\b¨\u0006 "}, d2 = {"Landroidx/compose/ui/layout/ContentScale$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/layout/ContentScale;", "rl", "Landroidx/compose/ui/layout/ContentScale;", c.f62177j, "()Landroidx/compose/ui/layout/ContentScale;", "getCrop$annotations", "Crop", "t", "O", "getFit$annotations", "Fit", "nr", "getFillHeight$annotations", "FillHeight", "getFillWidth$annotations", "FillWidth", "J2", "getInside$annotations", "Inside", "Landroidx/compose/ui/layout/FixedScale;", "Uo", "Landroidx/compose/ui/layout/FixedScale;", "()Landroidx/compose/ui/layout/FixedScale;", "getNone$annotations", "None", "KN", "getFillBounds$annotations", "FillBounds", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f32220n = new Companion();

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private static final ContentScale Crop = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Crop$1
            @Override // androidx.compose.ui.layout.ContentScale
            public long n(long srcSize, long dstSize) {
                float fT = ContentScaleKt.t(srcSize, dstSize);
                return ScaleFactor.n((((long) Float.floatToRawIntBits(fT)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fT))));
            }
        };

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private static final ContentScale Fit = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Fit$1
            @Override // androidx.compose.ui.layout.ContentScale
            public long n(long srcSize, long dstSize) {
                float fNr = ContentScaleKt.nr(srcSize, dstSize);
                return ScaleFactor.n((((long) Float.floatToRawIntBits(fNr)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fNr))));
            }
        };

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private static final ContentScale FillHeight = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillHeight$1
            @Override // androidx.compose.ui.layout.ContentScale
            public long n(long srcSize, long dstSize) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dstSize & 4294967295L)) / Float.intBitsToFloat((int) (srcSize & 4294967295L));
                return ScaleFactor.n((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L));
            }
        };

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private static final ContentScale FillWidth = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillWidth$1
            @Override // androidx.compose.ui.layout.ContentScale
            public long n(long srcSize, long dstSize) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dstSize >> 32)) / Float.intBitsToFloat((int) (srcSize >> 32));
                return ScaleFactor.n((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L));
            }
        };

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private static final ContentScale Inside = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Inside$1
            @Override // androidx.compose.ui.layout.ContentScale
            public long n(long srcSize, long dstSize) {
                if (Float.intBitsToFloat((int) (srcSize >> 32)) <= Float.intBitsToFloat((int) (dstSize >> 32)) && Float.intBitsToFloat((int) (srcSize & 4294967295L)) <= Float.intBitsToFloat((int) (dstSize & 4294967295L))) {
                    return ScaleFactor.n((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L));
                }
                float fNr = ContentScaleKt.nr(srcSize, dstSize);
                return ScaleFactor.n((((long) Float.floatToRawIntBits(fNr)) << 32) | (((long) Float.floatToRawIntBits(fNr)) & 4294967295L));
            }
        };

        /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
        private static final FixedScale None = new FixedScale(1.0f);

        /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
        private static final ContentScale FillBounds = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillBounds$1
            @Override // androidx.compose.ui.layout.ContentScale
            public long n(long srcSize, long dstSize) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dstSize >> 32)) / Float.intBitsToFloat((int) (srcSize >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dstSize & 4294967295L)) / Float.intBitsToFloat((int) (srcSize & 4294967295L));
                return ScaleFactor.n((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
            }
        };

        public final ContentScale J2() {
            return Inside;
        }

        public final ContentScale O() {
            return Fit;
        }

        public final FixedScale Uo() {
            return None;
        }

        public final ContentScale n() {
            return Crop;
        }

        public final ContentScale nr() {
            return FillWidth;
        }

        public final ContentScale rl() {
            return FillBounds;
        }

        public final ContentScale t() {
            return FillHeight;
        }

        private Companion() {
        }
    }

    long n(long srcSize, long dstSize);
}
