package androidx.compose.ui.graphics;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bJ\u0010\u0010\u0004\u001a\u00020\u0003H¦\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/PathIterator;", "", "Landroidx/compose/ui/graphics/PathSegment;", "", "hasNext", "()Z", "next", "()Landroidx/compose/ui/graphics/PathSegment;", "ConicEvaluation", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PathIterator extends Iterator<PathSegment>, KMappedMarker {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "", "<init>", "(Ljava/lang/String;I)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "t", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ConicEvaluation {
        private static final /* synthetic */ EnumEntries J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ ConicEvaluation[] f31512O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final ConicEvaluation f31513n = new ConicEvaluation("AsConic", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final ConicEvaluation f31514t = new ConicEvaluation("AsQuadratics", 1);

        private static final /* synthetic */ ConicEvaluation[] n() {
            return new ConicEvaluation[]{f31513n, f31514t};
        }

        public static ConicEvaluation valueOf(String str) {
            return (ConicEvaluation) Enum.valueOf(ConicEvaluation.class, str);
        }

        public static ConicEvaluation[] values() {
            return (ConicEvaluation[]) f31512O.clone();
        }

        static {
            ConicEvaluation[] conicEvaluationArrN = n();
            f31512O = conicEvaluationArrN;
            J2 = EnumEntriesKt.enumEntries(conicEvaluationArrN);
        }

        private ConicEvaluation(String str, int i2) {
        }
    }

    @Override // java.util.Iterator
    boolean hasNext();

    @Override // java.util.Iterator
    PathSegment next();
}
