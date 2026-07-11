package androidx.compose.ui.autofill;

import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0082\u0001\u0001\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/autofill/ContentDataType;", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Companion", "Landroidx/compose/ui/autofill/AndroidContentDataType;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ContentDataType {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f31158n;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/autofill/ContentDataType$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/autofill/ContentDataType;", "rl", "Landroidx/compose/ui/autofill/ContentDataType;", "getNone", "()Landroidx/compose/ui/autofill/ContentDataType;", "None", "t", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Text", "nr", "getList", "List", "O", "getDate", "Date", "J2", "getToggle", "Toggle", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f31158n = new Companion();

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private static final ContentDataType None = ContentDataType_androidKt.n(0);

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private static final ContentDataType Text = ContentDataType_androidKt.n(1);

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private static final ContentDataType List = ContentDataType_androidKt.n(3);

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private static final ContentDataType Date = ContentDataType_androidKt.n(4);

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private static final ContentDataType Toggle = ContentDataType_androidKt.n(2);

        public final ContentDataType n() {
            return Text;
        }

        private Companion() {
        }
    }
}
