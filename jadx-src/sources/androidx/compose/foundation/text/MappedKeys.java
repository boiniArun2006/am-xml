package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.key.Key_androidKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b5\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\u000e\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\r\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0014\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\bR\u001d\u0010\u0017\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u001a\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u001d\u0010\u001c\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001d\u0010\u001e\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001b\u0010\bR\u001d\u0010 \u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u001d\u0010\"\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u001d\u0010#\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001d\u0010&\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\bR\u001d\u0010)\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u001d\u0010+\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b*\u0010\bR\u001d\u0010-\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\b'\u0010\bR\u001d\u0010.\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b$\u0010\bR\u001d\u0010/\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b!\u0010\bR\u001d\u00100\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b,\u0010\bR\u001d\u00102\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u00103\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0015\u0010\bR\u001d\u00104\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001d\u00105\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u00106\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u000f\u0010\bR\u001d\u00108\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b1\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/foundation/text/MappedKeys;", "", "<init>", "()V", "Landroidx/compose/ui/input/key/Key;", "rl", "J", c.f62177j, "()J", "A", "t", "nr", "C", "az", "H", "O", "S", "V", "J2", "aYN", "Y", "Uo", "WPU", "X", "KN", "ViF", "Z", "xMQ", "Backslash", "mUb", "DirectionLeft", "gh", "DirectionRight", "qie", "DirectionUp", "DirectionDown", "ty", "o", "PageUp", "HI", "r", "PageDown", "ck", "MoveHome", "Ik", "MoveEnd", "Insert", "Enter", "NumPadEnter", "XQ", "Backspace", "Delete", "Paste", "Cut", "Copy", "nY", "Tab", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MappedKeys {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final MappedKeys f19781n = new MappedKeys();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final long A = Key_androidKt.n(29);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final long C = Key_androidKt.n(31);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final long H = Key_androidKt.n(36);

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final long V = Key_androidKt.n(50);

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final long Y = Key_androidKt.n(53);

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private static final long X = Key_androidKt.n(52);

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private static final long Z = Key_androidKt.n(54);

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private static final long Backslash = Key_androidKt.n(73);

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private static final long DirectionLeft = Key_androidKt.n(21);

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private static final long DirectionRight = Key_androidKt.n(22);

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private static final long DirectionUp = Key_androidKt.n(19);

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private static final long DirectionDown = Key_androidKt.n(20);

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private static final long PageUp = Key_androidKt.n(92);

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private static final long PageDown = Key_androidKt.n(93);

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private static final long MoveHome = Key_androidKt.n(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private static final long MoveEnd = Key_androidKt.n(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final long Insert = Key_androidKt.n(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final long Enter = Key_androidKt.n(66);

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private static final long NumPadEnter = Key_androidKt.n(160);

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private static final long Backspace = Key_androidKt.n(67);

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private static final long Delete = Key_androidKt.n(112);

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private static final long Paste = Key_androidKt.n(279);

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private static final long Cut = Key_androidKt.n(277);

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private static final long Copy = Key_androidKt.n(278);

    /* JADX INFO: renamed from: nY, reason: from kotlin metadata */
    private static final long Tab = Key_androidKt.n(61);

    public final long HI() {
        return MoveEnd;
    }

    public final long Ik() {
        return NumPadEnter;
    }

    public final long J2() {
        return Cut;
    }

    public final long KN() {
        return DirectionDown;
    }

    public final long O() {
        return Copy;
    }

    public final long S() {
        return V;
    }

    public final long Uo() {
        return Delete;
    }

    public final long ViF() {
        return Z;
    }

    public final long WPU() {
        return X;
    }

    public final long XQ() {
        return Tab;
    }

    public final long Z() {
        return Paste;
    }

    public final long aYN() {
        return Y;
    }

    public final long az() {
        return H;
    }

    public final long ck() {
        return MoveHome;
    }

    public final long gh() {
        return DirectionUp;
    }

    public final long mUb() {
        return DirectionRight;
    }

    public final long n() {
        return A;
    }

    public final long nr() {
        return C;
    }

    public final long o() {
        return PageUp;
    }

    public final long qie() {
        return Enter;
    }

    public final long r() {
        return PageDown;
    }

    public final long rl() {
        return Backslash;
    }

    public final long t() {
        return Backspace;
    }

    public final long ty() {
        return Insert;
    }

    public final long xMQ() {
        return DirectionLeft;
    }

    private MappedKeys() {
    }
}
