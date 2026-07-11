package androidx.compose.foundation.text;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b7\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u0007j\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8¨\u00069"}, d2 = {"Landroidx/compose/foundation/text/KeyCommand;", "", "", "editsText", "<init>", "(Ljava/lang/String;IZ)V", c.f62177j, "Z", "rl", "()Z", "t", "O", "J2", "r", "o", "S", "g", "E2", "e", "X", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "N", "v", "Xw", "jB", "U", "P5", "M7", "p5", "eF", "E", "M", "FX", "B", "J", "D", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "I", "GR", "Nxk", "Y", "k", "dR0", "z", "piY", "ijL", "m", "eTf", "xg", "pJg", "ofS", "C", "Mx", "G7", "fcU", "eWT", "ul", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class KeyCommand {
    private static final /* synthetic */ EnumEntries Jk;
    private static final /* synthetic */ KeyCommand[] n1;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean editsText;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final KeyCommand f19722t = new KeyCommand("LEFT_CHAR", 0, false);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final KeyCommand f19708O = new KeyCommand("RIGHT_CHAR", 1, false);
    public static final KeyCommand J2 = new KeyCommand("RIGHT_WORD", 2, false);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final KeyCommand f19721r = new KeyCommand("LEFT_WORD", 3, false);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final KeyCommand f19720o = new KeyCommand("NEXT_PARAGRAPH", 4, false);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final KeyCommand f19714Z = new KeyCommand("PREV_PARAGRAPH", 5, false);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final KeyCommand f19709S = new KeyCommand("LINE_START", 6, false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final KeyCommand f19717g = new KeyCommand("LINE_END", 7, false);
    public static final KeyCommand E2 = new KeyCommand("LINE_LEFT", 8, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final KeyCommand f19716e = new KeyCommand("LINE_RIGHT", 9, false);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final KeyCommand f19712X = new KeyCommand("UP", 10, false);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final KeyCommand f19710T = new KeyCommand("DOWN", 11, false);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final KeyCommand f19707N = new KeyCommand("PAGE_UP", 12, false);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final KeyCommand f19723v = new KeyCommand("PAGE_DOWN", 13, false);
    public static final KeyCommand Xw = new KeyCommand("HOME", 14, false);
    public static final KeyCommand jB = new KeyCommand("END", 15, false);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final KeyCommand f19711U = new KeyCommand("COPY", 16, false);
    public static final KeyCommand P5 = new KeyCommand("PASTE", 17, true);
    public static final KeyCommand M7 = new KeyCommand("CUT", 18, true);
    public static final KeyCommand p5 = new KeyCommand("DELETE_PREV_CHAR", 19, true);
    public static final KeyCommand eF = new KeyCommand("DELETE_NEXT_CHAR", 20, true);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final KeyCommand f19700E = new KeyCommand("DELETE_PREV_WORD", 21, true);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final KeyCommand f19706M = new KeyCommand("DELETE_NEXT_WORD", 22, true);

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    public static final KeyCommand f19701FX = new KeyCommand("DELETE_FROM_LINE_START", 23, true);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final KeyCommand f19697B = new KeyCommand("DELETE_TO_LINE_END", 24, true);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final KeyCommand f19705J = new KeyCommand("SELECT_ALL", 25, false);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final KeyCommand f19699D = new KeyCommand("SELECT_LEFT_CHAR", 26, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final KeyCommand f19715a = new KeyCommand("SELECT_RIGHT_CHAR", 27, false);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final KeyCommand f19704I = new KeyCommand("SELECT_UP", 28, false);

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    public static final KeyCommand f19703GR = new KeyCommand("SELECT_DOWN", 29, false);
    public static final KeyCommand Nxk = new KeyCommand("SELECT_PAGE_UP", 30, false);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final KeyCommand f19713Y = new KeyCommand("SELECT_PAGE_DOWN", 31, false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final KeyCommand f19718k = new KeyCommand("SELECT_HOME", 32, false);
    public static final KeyCommand dR0 = new KeyCommand("SELECT_END", 33, false);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final KeyCommand f19724z = new KeyCommand("SELECT_LEFT_WORD", 34, false);
    public static final KeyCommand piY = new KeyCommand("SELECT_RIGHT_WORD", 35, false);
    public static final KeyCommand ijL = new KeyCommand("SELECT_NEXT_PARAGRAPH", 36, false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final KeyCommand f19719m = new KeyCommand("SELECT_PREV_PARAGRAPH", 37, false);
    public static final KeyCommand eTf = new KeyCommand("SELECT_LINE_START", 38, false);
    public static final KeyCommand xg = new KeyCommand("SELECT_LINE_END", 39, false);
    public static final KeyCommand pJg = new KeyCommand("SELECT_LINE_LEFT", 40, false);
    public static final KeyCommand ofS = new KeyCommand("SELECT_LINE_RIGHT", 41, false);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final KeyCommand f19698C = new KeyCommand("DESELECT", 42, false);
    public static final KeyCommand Mx = new KeyCommand("NEW_LINE", 43, true);

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    public static final KeyCommand f19702G7 = new KeyCommand("TAB", 44, true);
    public static final KeyCommand fcU = new KeyCommand("UNDO", 45, true);
    public static final KeyCommand eWT = new KeyCommand("REDO", 46, true);
    public static final KeyCommand ul = new KeyCommand("CHARACTER_PALETTE", 47, true);

    private static final /* synthetic */ KeyCommand[] n() {
        return new KeyCommand[]{f19722t, f19708O, J2, f19721r, f19720o, f19714Z, f19709S, f19717g, E2, f19716e, f19712X, f19710T, f19707N, f19723v, Xw, jB, f19711U, P5, M7, p5, eF, f19700E, f19706M, f19701FX, f19697B, f19705J, f19699D, f19715a, f19704I, f19703GR, Nxk, f19713Y, f19718k, dR0, f19724z, piY, ijL, f19719m, eTf, xg, pJg, ofS, f19698C, Mx, f19702G7, fcU, eWT, ul};
    }

    public static KeyCommand valueOf(String str) {
        return (KeyCommand) Enum.valueOf(KeyCommand.class, str);
    }

    public static KeyCommand[] values() {
        return (KeyCommand[]) n1.clone();
    }

    static {
        KeyCommand[] keyCommandArrN = n();
        n1 = keyCommandArrN;
        Jk = EnumEntriesKt.enumEntries(keyCommandArrN);
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final boolean getEditsText() {
        return this.editsText;
    }

    private KeyCommand(String str, int i2, boolean z2) {
        this.editsText = z2;
    }
}
