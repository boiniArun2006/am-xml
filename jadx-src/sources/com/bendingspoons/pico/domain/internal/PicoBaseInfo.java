package com.bendingspoons.pico.domain.internal;

import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import com.bendingspoons.pico.domain.entities.PicoEvent;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.events.base.StatsEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/bendingspoons/pico/domain/internal/PicoBaseInfo;", "", StatsEvent.f62824A, "", "session", "Lcom/bendingspoons/pico/domain/internal/PicoBaseInfo$Session;", "<init>", "(DLcom/bendingspoons/pico/domain/internal/PicoBaseInfo$Session;)V", "getTimestamp", "()D", "getSession", "()Lcom/bendingspoons/pico/domain/internal/PicoBaseInfo$Session;", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", PicoEvent.SESSION_TYPE, "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PicoBaseInfo {
    private final Session session;
    private final double timestamp;

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B)\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/bendingspoons/pico/domain/internal/PicoBaseInfo$Session;", "", "", "id", "", "containsEvent", "", "durationInSeconds", "<init>", "(Ljava/lang/String;ZLjava/lang/Double;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Ljava/lang/Double;", "copy", "(Ljava/lang/String;ZLjava/lang/Double;)Lcom/bendingspoons/pico/domain/internal/PicoBaseInfo$Session;", "toString", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Z", "getContainsEvent", "Ljava/lang/Double;", "getDurationInSeconds", "Companion", "j", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Session {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean containsEvent;
        private final Double durationInSeconds;
        private final String id;

        /* JADX INFO: renamed from: com.bendingspoons.pico.domain.internal.PicoBaseInfo$Session$j, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Session n(String id, double d2) {
                Intrinsics.checkNotNullParameter(id, "id");
                return new Session(id, true, Double.valueOf(d2));
            }

            public final Session rl(String id) {
                Intrinsics.checkNotNullParameter(id, "id");
                return new Session(id, false, null, 6, null);
            }

            public final Session t() {
                return new Session(null, false, null, 6, null);
            }
        }

        @VisibleForTesting
        public Session(String str, boolean z2, Double d2) {
            this.id = str;
            this.containsEvent = z2;
            this.durationInSeconds = d2;
        }

        public static /* synthetic */ Session copy$default(Session session, String str, boolean z2, Double d2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = session.id;
            }
            if ((i2 & 2) != 0) {
                z2 = session.containsEvent;
            }
            if ((i2 & 4) != 0) {
                d2 = session.durationInSeconds;
            }
            return session.copy(str, z2, d2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getContainsEvent() {
            return this.containsEvent;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Double getDurationInSeconds() {
            return this.durationInSeconds;
        }

        public final Session copy(String id, boolean containsEvent, Double durationInSeconds) {
            return new Session(id, containsEvent, durationInSeconds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Session)) {
                return false;
            }
            Session session = (Session) other;
            return Intrinsics.areEqual(this.id, session.id) && this.containsEvent == session.containsEvent && Intrinsics.areEqual((Object) this.durationInSeconds, (Object) session.durationInSeconds);
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.containsEvent)) * 31;
            Double d2 = this.durationInSeconds;
            return iHashCode + (d2 != null ? d2.hashCode() : 0);
        }

        public String toString() {
            return "Session(id=" + this.id + ", containsEvent=" + this.containsEvent + ", durationInSeconds=" + this.durationInSeconds + ")";
        }

        public final boolean getContainsEvent() {
            return this.containsEvent;
        }

        public final Double getDurationInSeconds() {
            return this.durationInSeconds;
        }

        public final String getId() {
            return this.id;
        }

        public /* synthetic */ Session(String str, boolean z2, Double d2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? null : d2);
        }
    }

    public static /* synthetic */ PicoBaseInfo copy$default(PicoBaseInfo picoBaseInfo, double d2, Session session, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d2 = picoBaseInfo.timestamp;
        }
        if ((i2 & 2) != 0) {
            session = picoBaseInfo.session;
        }
        return picoBaseInfo.copy(d2, session);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Session getSession() {
        return this.session;
    }

    public final PicoBaseInfo copy(double timestamp, Session session) {
        Intrinsics.checkNotNullParameter(session, "session");
        return new PicoBaseInfo(timestamp, session);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PicoBaseInfo)) {
            return false;
        }
        PicoBaseInfo picoBaseInfo = (PicoBaseInfo) other;
        return Double.compare(this.timestamp, picoBaseInfo.timestamp) == 0 && Intrinsics.areEqual(this.session, picoBaseInfo.session);
    }

    public int hashCode() {
        return (Double.hashCode(this.timestamp) * 31) + this.session.hashCode();
    }

    public String toString() {
        return "PicoBaseInfo(timestamp=" + this.timestamp + ", session=" + this.session + ")";
    }

    public PicoBaseInfo(double d2, Session session) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.timestamp = d2;
        this.session = session;
    }

    public final Session getSession() {
        return this.session;
    }

    public final double getTimestamp() {
        return this.timestamp;
    }
}
