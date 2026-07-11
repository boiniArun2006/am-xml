package androidx.compose.ui.contentcapture;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/contentcapture/ContentCaptureEventType;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ContentCaptureEventType {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ ContentCaptureEventType[] f31204O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ContentCaptureEventType f31205n = new ContentCaptureEventType("VIEW_APPEAR", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ContentCaptureEventType f31206t = new ContentCaptureEventType("VIEW_DISAPPEAR", 1);

    private static final /* synthetic */ ContentCaptureEventType[] n() {
        return new ContentCaptureEventType[]{f31205n, f31206t};
    }

    public static ContentCaptureEventType valueOf(String str) {
        return (ContentCaptureEventType) Enum.valueOf(ContentCaptureEventType.class, str);
    }

    public static ContentCaptureEventType[] values() {
        return (ContentCaptureEventType[]) f31204O.clone();
    }

    static {
        ContentCaptureEventType[] contentCaptureEventTypeArrN = n();
        f31204O = contentCaptureEventTypeArrN;
        J2 = EnumEntriesKt.enumEntries(contentCaptureEventTypeArrN);
    }

    private ContentCaptureEventType(String str, int i2) {
    }
}
