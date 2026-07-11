package com.bendingspoons.experiments.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002#$BC\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JJ\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0005\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lcom/bendingspoons/experiments/network/OracleExperiment;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "description", "isCompatible", "", "state", "Lcom/bendingspoons/experiments/network/OracleExperiment$State;", "segments", "", "Lcom/bendingspoons/experiments/network/OracleExperiment$Segment;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/bendingspoons/experiments/network/OracleExperiment$State;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getDescription", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getState", "()Lcom/bendingspoons/experiments/network/OracleExperiment$State;", "getSegments", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/bendingspoons/experiments/network/OracleExperiment$State;Ljava/util/List;)Lcom/bendingspoons/experiments/network/OracleExperiment;", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "State", "Segment", "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OracleExperiment {
    public static final int $stable = 8;
    private final String description;
    private final Boolean isCompatible;
    private final String name;
    private final List<Segment> segments;
    private final State state;

    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/bendingspoons/experiments/network/OracleExperiment$Segment;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "weight", "", "<init>", "(Ljava/lang/String;D)V", "getName", "()Ljava/lang/String;", "getWeight", "()D", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Segment {
        public static final int $stable = 0;
        private final String name;
        private final double weight;

        public static /* synthetic */ Segment copy$default(Segment segment, String str, double d2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = segment.name;
            }
            if ((i2 & 2) != 0) {
                d2 = segment.weight;
            }
            return segment.copy(str, d2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final double getWeight() {
            return this.weight;
        }

        public final Segment copy(@Json(name = AppMeasurementSdk.ConditionalUserProperty.NAME) String name, @Json(name = "weight") double weight) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Segment(name, weight);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Segment)) {
                return false;
            }
            Segment segment = (Segment) other;
            return Intrinsics.areEqual(this.name, segment.name) && Double.compare(this.weight, segment.weight) == 0;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Double.hashCode(this.weight);
        }

        public String toString() {
            return "Segment(name=" + this.name + ", weight=" + this.weight + ")";
        }

        public Segment(@Json(name = AppMeasurementSdk.ConditionalUserProperty.NAME) String name, @Json(name = "weight") double d2) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.weight = d2;
        }

        public final String getName() {
            return this.name;
        }

        public final double getWeight() {
            return this.weight;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @JsonClass(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bendingspoons/experiments/network/OracleExperiment$State;", "", "<init>", "(Ljava/lang/String;I)V", "DRAFT", "RUNNING", "OBSERVING", "COMPLETED", "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;

        @Json(name = "draft")
        public static final State DRAFT = new State("DRAFT", 0);

        @Json(name = "running")
        public static final State RUNNING = new State("RUNNING", 1);

        @Json(name = "observing")
        public static final State OBSERVING = new State("OBSERVING", 2);

        @Json(name = "completed")
        public static final State COMPLETED = new State("COMPLETED", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{DRAFT, RUNNING, OBSERVING, COMPLETED};
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(stateArr$values);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        private State(String str, int i2) {
        }
    }

    public OracleExperiment(@Json(name = AppMeasurementSdk.ConditionalUserProperty.NAME) String name, @Json(name = "description") String description, @Json(name = "is_compatible") Boolean bool, @Json(name = "state") State state, @Json(name = "segments") List<Segment> segments) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.name = name;
        this.description = description;
        this.isCompatible = bool;
        this.state = state;
        this.segments = segments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OracleExperiment copy$default(OracleExperiment oracleExperiment, String str, String str2, Boolean bool, State state, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = oracleExperiment.name;
        }
        if ((i2 & 2) != 0) {
            str2 = oracleExperiment.description;
        }
        if ((i2 & 4) != 0) {
            bool = oracleExperiment.isCompatible;
        }
        if ((i2 & 8) != 0) {
            state = oracleExperiment.state;
        }
        if ((i2 & 16) != 0) {
            list = oracleExperiment.segments;
        }
        List list2 = list;
        Boolean bool2 = bool;
        return oracleExperiment.copy(str, str2, bool2, state, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsCompatible() {
        return this.isCompatible;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final State getState() {
        return this.state;
    }

    public final List<Segment> component5() {
        return this.segments;
    }

    public final OracleExperiment copy(@Json(name = AppMeasurementSdk.ConditionalUserProperty.NAME) String name, @Json(name = "description") String description, @Json(name = "is_compatible") Boolean isCompatible, @Json(name = "state") State state, @Json(name = "segments") List<Segment> segments) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(segments, "segments");
        return new OracleExperiment(name, description, isCompatible, state, segments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OracleExperiment)) {
            return false;
        }
        OracleExperiment oracleExperiment = (OracleExperiment) other;
        return Intrinsics.areEqual(this.name, oracleExperiment.name) && Intrinsics.areEqual(this.description, oracleExperiment.description) && Intrinsics.areEqual(this.isCompatible, oracleExperiment.isCompatible) && this.state == oracleExperiment.state && Intrinsics.areEqual(this.segments, oracleExperiment.segments);
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.description.hashCode()) * 31;
        Boolean bool = this.isCompatible;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        State state = this.state;
        return ((iHashCode2 + (state != null ? state.hashCode() : 0)) * 31) + this.segments.hashCode();
    }

    public String toString() {
        return "OracleExperiment(name=" + this.name + ", description=" + this.description + ", isCompatible=" + this.isCompatible + ", state=" + this.state + ", segments=" + this.segments + ")";
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final List<Segment> getSegments() {
        return this.segments;
    }

    public final State getState() {
        return this.state;
    }

    public final Boolean isCompatible() {
        return this.isCompatible;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OracleExperiment(String str, String str2, Boolean bool, State state, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        List list2;
        State state2;
        bool = (i2 & 4) != 0 ? null : bool;
        if ((i2 & 8) != 0) {
            list2 = list;
            state2 = null;
        } else {
            list2 = list;
            state2 = state;
        }
        this(str, str2, bool, state2, list2);
    }
}
