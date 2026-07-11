package UiE;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.s4;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Pl {
    public static final j Uo = new j(null);
    private eO J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Long f10805O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Long f10806n;
    private int nr;
    private Long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private UUID f10807t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final void n() {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(s4.qie()).edit();
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            editorEdit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionId");
            editorEdit.apply();
            eO.f10815t.n();
        }

        public final Pl rl() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(s4.qie());
            long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long j3 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (j2 == 0 || j3 == 0 || string == null) {
                return null;
            }
            Pl pl = new Pl(Long.valueOf(j2), Long.valueOf(j3), null, 4, null);
            pl.nr = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
            pl.qie(eO.f10815t.rl());
            pl.xMQ(Long.valueOf(System.currentTimeMillis()));
            UUID uuidFromString = UUID.fromString(string);
            Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(sessionIDStr)");
            pl.mUb(uuidFromString);
            return pl;
        }
    }

    public Pl(Long l2, Long l5, UUID sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f10806n = l2;
        this.rl = l5;
        this.f10807t = sessionId;
    }

    public final long J2() {
        Long l2;
        if (this.f10806n == null || (l2 = this.rl) == null) {
            return 0L;
        }
        if (l2 != null) {
            return l2.longValue() - this.f10806n.longValue();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void KN() {
        this.nr++;
    }

    public final Long O() {
        return this.rl;
    }

    public final eO Uo() {
        return this.J2;
    }

    public final void gh(Long l2) {
        this.rl = l2;
    }

    public final void mUb(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<set-?>");
        this.f10807t = uuid;
    }

    public final UUID nr() {
        return this.f10807t;
    }

    public final void qie(eO eOVar) {
        this.J2 = eOVar;
    }

    public final Long rl() {
        Long l2 = this.f10805O;
        if (l2 == null) {
            return 0L;
        }
        return l2;
    }

    public final int t() {
        return this.nr;
    }

    public final void xMQ(Long l2) {
        this.f10805O = l2;
    }

    public final void az() {
        long jLongValue;
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(s4.qie()).edit();
        Long l2 = this.f10806n;
        long jLongValue2 = 0;
        if (l2 != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = 0;
        }
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", jLongValue);
        Long l5 = this.rl;
        if (l5 != null) {
            jLongValue2 = l5.longValue();
        }
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", jLongValue2);
        editorEdit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.nr);
        editorEdit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f10807t.toString());
        editorEdit.apply();
        eO eOVar = this.J2;
        if (eOVar != null && eOVar != null) {
            eOVar.n();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Pl(Long l2, Long l5, UUID uuid, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            uuid = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID()");
        }
        this(l2, l5, uuid);
    }
}
