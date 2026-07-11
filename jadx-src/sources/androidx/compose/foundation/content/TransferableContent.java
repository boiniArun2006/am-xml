package androidx.compose.foundation.content;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB-\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/content/TransferableContent;", "", "Landroidx/compose/ui/platform/ClipEntry;", "clipEntry", "Landroidx/compose/ui/platform/ClipMetadata;", "clipMetadata", "Landroidx/compose/foundation/content/TransferableContent$Source;", "source", "Landroidx/compose/foundation/content/PlatformTransferableContent;", "platformTransferableContent", "<init>", "(Landroidx/compose/ui/platform/ClipEntry;Landroidx/compose/ui/platform/ClipMetadata;ILandroidx/compose/foundation/content/PlatformTransferableContent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", c.f62177j, "Landroidx/compose/ui/platform/ClipEntry;", "()Landroidx/compose/ui/platform/ClipEntry;", "rl", "Landroidx/compose/ui/platform/ClipMetadata;", "getClipMetadata", "()Landroidx/compose/ui/platform/ClipMetadata;", "t", "I", "getSource-kB6V9T0", "()I", "nr", "Landroidx/compose/foundation/content/PlatformTransferableContent;", "getPlatformTransferableContent", "()Landroidx/compose/foundation/content/PlatformTransferableContent;", "Source", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TransferableContent {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ClipEntry clipEntry;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final PlatformTransferableContent platformTransferableContent;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final ClipMetadata clipMetadata;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int source;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/content/TransferableContent$Source;", "", "", "value", "nr", "(I)I", "", "KN", "(I)Ljava/lang/String;", "Uo", InneractiveMediationNameConsts.OTHER, "", "O", "(ILjava/lang/Object;)Z", c.f62177j, "I", "rl", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ExperimentalFoundationApi
    @JvmInline
    public static final class Source {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final int f16321t = nr(0);
        private static final int nr = nr(1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final int f16320O = nr(2);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/content/TransferableContent$Source$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/content/TransferableContent$Source;", "Keyboard", "I", "t", "()I", "DragAndDrop", "rl", "Clipboard", c.f62177j, "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final int n() {
                return Source.f16320O;
            }

            public final int rl() {
                return Source.nr;
            }

            public final int t() {
                return Source.f16321t;
            }
        }

        public static final boolean J2(int i2, int i3) {
            return i2 == i3;
        }

        public static boolean O(int i2, Object obj) {
            return (obj instanceof Source) && i2 == ((Source) obj).getValue();
        }

        public static int Uo(int i2) {
            return Integer.hashCode(i2);
        }

        public static int nr(int i2) {
            return i2;
        }

        public boolean equals(Object obj) {
            return O(this.value, obj);
        }

        public int hashCode() {
            return Uo(this.value);
        }

        /* JADX INFO: renamed from: xMQ, reason: from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        public static String KN(int i2) {
            if (J2(i2, f16321t)) {
                return "Source.Keyboard";
            }
            if (J2(i2, nr)) {
                return "Source.DragAndDrop";
            }
            if (J2(i2, f16320O)) {
                return "Source.Clipboard";
            }
            return "Invalid (" + i2 + ')';
        }

        public String toString() {
            return KN(this.value);
        }
    }

    public /* synthetic */ TransferableContent(ClipEntry clipEntry, ClipMetadata clipMetadata, int i2, PlatformTransferableContent platformTransferableContent, DefaultConstructorMarker defaultConstructorMarker) {
        this(clipEntry, clipMetadata, i2, platformTransferableContent);
    }

    private TransferableContent(ClipEntry clipEntry, ClipMetadata clipMetadata, int i2, PlatformTransferableContent platformTransferableContent) {
        this.clipEntry = clipEntry;
        this.clipMetadata = clipMetadata;
        this.source = i2;
        this.platformTransferableContent = platformTransferableContent;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final ClipEntry getClipEntry() {
        return this.clipEntry;
    }

    public /* synthetic */ TransferableContent(ClipEntry clipEntry, ClipMetadata clipMetadata, int i2, PlatformTransferableContent platformTransferableContent, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(clipEntry, clipMetadata, i2, (i3 & 8) != 0 ? null : platformTransferableContent, null);
    }
}
