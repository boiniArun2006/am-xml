package androidx.compose.ui.text;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/AnnotationType;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "J2", "r", "o", "Z", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AnnotationType {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final /* synthetic */ AnnotationType[] f33362S;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f33364g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AnnotationType f33365n = new AnnotationType("Paragraph", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AnnotationType f33368t = new AnnotationType("Span", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final AnnotationType f33361O = new AnnotationType("VerbatimTts", 2);
    public static final AnnotationType J2 = new AnnotationType("Url", 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AnnotationType f33367r = new AnnotationType("Link", 4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AnnotationType f33366o = new AnnotationType("Clickable", 5);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final AnnotationType f33363Z = new AnnotationType("String", 6);

    private static final /* synthetic */ AnnotationType[] n() {
        return new AnnotationType[]{f33365n, f33368t, f33361O, J2, f33367r, f33366o, f33363Z};
    }

    public static AnnotationType valueOf(String str) {
        return (AnnotationType) Enum.valueOf(AnnotationType.class, str);
    }

    public static AnnotationType[] values() {
        return (AnnotationType[]) f33362S.clone();
    }

    static {
        AnnotationType[] annotationTypeArrN = n();
        f33362S = annotationTypeArrN;
        f33364g = EnumEntriesKt.enumEntries(annotationTypeArrN);
    }

    private AnnotationType(String str, int i2) {
    }
}
