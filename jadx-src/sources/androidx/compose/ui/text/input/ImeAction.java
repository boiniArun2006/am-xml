package androidx.compose.ui.text.input;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/input/ImeAction;", "", "", "value", "gh", "(I)I", "", "HI", "(I)Ljava/lang/String;", "ty", InneractiveMediationNameConsts.OTHER, "", "qie", "(ILjava/lang/Object;)Z", c.f62177j, "I", "rl", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class ImeAction {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f33766t = gh(-1);
    private static final int nr = gh(1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int f33765O = gh(0);
    private static final int J2 = gh(2);
    private static final int Uo = gh(3);
    private static final int KN = gh(4);
    private static final int xMQ = gh(5);
    private static final int mUb = gh(6);
    private static final int gh = gh(7);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR&\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR&\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR&\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR&\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR&\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR&\u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/input/ImeAction$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/ImeAction;", "Unspecified", "I", "xMQ", "()I", "getUnspecified-eUduSuo$annotations", "Default", c.f62177j, "getDefault-eUduSuo$annotations", "None", "O", "getNone-eUduSuo$annotations", "Go", "t", "getGo-eUduSuo$annotations", "Search", "Uo", "getSearch-eUduSuo$annotations", "Send", "KN", "getSend-eUduSuo$annotations", "Previous", "J2", "getPrevious-eUduSuo$annotations", "Next", "nr", "getNext-eUduSuo$annotations", "Done", "rl", "getDone-eUduSuo$annotations", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int J2() {
            return ImeAction.xMQ;
        }

        public final int KN() {
            return ImeAction.KN;
        }

        public final int O() {
            return ImeAction.f33765O;
        }

        public final int Uo() {
            return ImeAction.Uo;
        }

        public final int n() {
            return ImeAction.nr;
        }

        public final int nr() {
            return ImeAction.mUb;
        }

        public final int rl() {
            return ImeAction.gh;
        }

        public final int t() {
            return ImeAction.J2;
        }

        public final int xMQ() {
            return ImeAction.f33766t;
        }
    }

    public static final boolean az(int i2, int i3) {
        return i2 == i3;
    }

    private static int gh(int i2) {
        return i2;
    }

    public static final /* synthetic */ ImeAction mUb(int i2) {
        return new ImeAction(i2);
    }

    public static boolean qie(int i2, Object obj) {
        return (obj instanceof ImeAction) && i2 == ((ImeAction) obj).getValue();
    }

    public static int ty(int i2) {
        return Integer.hashCode(i2);
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return qie(this.value, obj);
    }

    public int hashCode() {
        return ty(this.value);
    }

    public static String HI(int i2) {
        return az(i2, f33766t) ? "Unspecified" : az(i2, f33765O) ? "None" : az(i2, nr) ? "Default" : az(i2, J2) ? "Go" : az(i2, Uo) ? "Search" : az(i2, KN) ? "Send" : az(i2, xMQ) ? "Previous" : az(i2, mUb) ? "Next" : az(i2, gh) ? "Done" : "Invalid";
    }

    public String toString() {
        return HI(this.value);
    }

    private /* synthetic */ ImeAction(int i2) {
        this.value = i2;
    }
}
