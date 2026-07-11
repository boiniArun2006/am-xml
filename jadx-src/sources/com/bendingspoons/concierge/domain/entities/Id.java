package com.bendingspoons.concierge.domain.entities;

import androidx.annotation.Keep;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Keep
@JsonClass(generateAdapter = false)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\r\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/bendingspoons/concierge/domain/entities/Id;", "", "Lcom/bendingspoons/concierge/domain/entities/Id$j;", "type", "", "value", "<init>", "(Lcom/bendingspoons/concierge/domain/entities/Id$j;Ljava/lang/String;)V", "Lcom/bendingspoons/concierge/domain/entities/Id$j;", "getType", "()Lcom/bendingspoons/concierge/domain/entities/Id$j;", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "getName", AppMeasurementSdk.ConditionalUserProperty.NAME, "j", "Predefined", "CustomId", "Lcom/bendingspoons/concierge/domain/entities/Id$CustomId;", "Lcom/bendingspoons/concierge/domain/entities/Id$Predefined;", "concierge_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Id {
    private final j type;
    private final String value;

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/bendingspoons/concierge/domain/entities/Id$CustomId;", "Lcom/bendingspoons/concierge/domain/entities/Id;", "", "identifier", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bendingspoons/concierge/domain/entities/Id$CustomId;", "toString", "", "hashCode", "()I", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdentifier", "getValue", "j", "concierge_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomId extends Id {
        private final String identifier;
        private final String value;

        private static final class j implements j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final String f51211n;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && Intrinsics.areEqual(this.f51211n, ((j) obj).f51211n);
            }

            public int hashCode() {
                return this.f51211n.hashCode();
            }

            public String toString() {
                return "Type(identifier=" + this.f51211n + ")";
            }

            public j(String identifier) {
                Intrinsics.checkNotNullParameter(identifier, "identifier");
                this.f51211n = identifier;
            }

            @Override // com.bendingspoons.concierge.domain.entities.Id.j
            public String n() {
                return this.f51211n;
            }
        }

        public static /* synthetic */ CustomId copy$default(CustomId customId, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = customId.identifier;
            }
            if ((i2 & 2) != 0) {
                str2 = customId.value;
            }
            return customId.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final CustomId copy(String identifier, String value) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(value, "value");
            return new CustomId(identifier, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomId)) {
                return false;
            }
            CustomId customId = (CustomId) other;
            return Intrinsics.areEqual(this.identifier, customId.identifier) && Intrinsics.areEqual(this.value, customId.value);
        }

        public int hashCode() {
            return (this.identifier.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() {
            return "CustomId(identifier=" + this.identifier + ", value=" + this.value + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomId(String identifier, String value) {
            super(new j(identifier), value, null);
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(value, "value");
            this.identifier = identifier;
            this.value = value;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        @Override // com.bendingspoons.concierge.domain.entities.Id
        public String getValue() {
            return this.value;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/bendingspoons/concierge/domain/entities/Id$Predefined;", "Lcom/bendingspoons/concierge/domain/entities/Id;", "Lcom/bendingspoons/concierge/domain/entities/Id$j;", "type", "", "value", "<init>", "(Lcom/bendingspoons/concierge/domain/entities/Id$j;Ljava/lang/String;)V", "External", "Internal", "Lcom/bendingspoons/concierge/domain/entities/Id$Predefined$External;", "Lcom/bendingspoons/concierge/domain/entities/Id$Predefined$Internal;", "concierge_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Predefined extends Id {

        @Keep
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/bendingspoons/concierge/domain/entities/Id$Predefined$External;", "Lcom/bendingspoons/concierge/domain/entities/Id$Predefined;", "Lcom/bendingspoons/concierge/domain/entities/Id$j;", "type", "", "value", "", "expirationTimestamp", "<init>", "(Lcom/bendingspoons/concierge/domain/entities/Id$j;Ljava/lang/String;J)V", "J", "getExpirationTimestamp$concierge_release", "()J", "j", "AAID", "AppSetId", "Lcom/bendingspoons/concierge/domain/entities/Id$Predefined$External$AAID;", "Lcom/bendingspoons/concierge/domain/entities/Id$Predefined$External$AppSetId;", "concierge_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class External extends Predefined {
            private final long expirationTimestamp;

            @Keep
            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/bendingspoons/concierge/domain/entities/Id$Predefined$External$AAID;", "Lcom/bendingspoons/concierge/domain/entities/Id$Predefined$External;", "", "value", "", "expirationTimestamp", "<init>", "(Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2$concierge_release", "()J", "component2", "copy", "(Ljava/lang/String;J)Lcom/bendingspoons/concierge/domain/entities/Id$Predefined$External$AAID;", "toString", "", "hashCode", "()I", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "J", "getExpirationTimestamp$concierge_release", "Companion", "j", "concierge_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class AAID extends External {
                public static final String LIMIT_AD_TRACKING_VALUE = "00000000-0000-0000-0000-000000000000";
                private final long expirationTimestamp;
                private final String value;

                public static /* synthetic */ AAID copy$default(AAID aaid, String str, long j2, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        str = aaid.value;
                    }
                    if ((i2 & 2) != 0) {
                        j2 = aaid.expirationTimestamp;
                    }
                    return aaid.copy(str, j2);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                /* JADX INFO: renamed from: component2$concierge_release, reason: from getter */
                public final long getExpirationTimestamp() {
                    return this.expirationTimestamp;
                }

                public final AAID copy(String value, long expirationTimestamp) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return new AAID(value, expirationTimestamp);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof AAID)) {
                        return false;
                    }
                    AAID aaid = (AAID) other;
                    return Intrinsics.areEqual(this.value, aaid.value) && this.expirationTimestamp == aaid.expirationTimestamp;
                }

                public int hashCode() {
                    return (this.value.hashCode() * 31) + Long.hashCode(this.expirationTimestamp);
                }

                public String toString() {
                    return "AAID(value=" + this.value + ", expirationTimestamp=" + this.expirationTimestamp + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AAID(String value, long j2) {
                    super(j.f51212O, value, j2, null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                    this.expirationTimestamp = j2;
                }

                @Override // com.bendingspoons.concierge.domain.entities.Id.Predefined.External
                /* JADX INFO: renamed from: getExpirationTimestamp$concierge_release */
                public long getExpirationTimestamp() {
                    return this.expirationTimestamp;
                }

                @Override // com.bendingspoons.concierge.domain.entities.Id
                public String getValue() {
                    return this.value;
                }
            }

            @Keep
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u0015\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0016J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/bendingspoons/concierge/domain/entities/Id$Predefined$External$AppSetId;", "Lcom/bendingspoons/concierge/domain/entities/Id$Predefined$External;", "value", "", "expirationTimestamp", "", "scope", "", "<init>", "(Ljava/lang/String;JI)V", "getValue", "()Ljava/lang/String;", "getExpirationTimestamp$concierge_release", "()J", "getScope", "()I", "hasDeveloperScope", "", "getHasDeveloperScope", "()Z", "component1", "component2", "component2$concierge_release", "component3", "copy", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "toString", "concierge_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class AppSetId extends External {
                private final long expirationTimestamp;
                private final int scope;
                private final String value;

                public static /* synthetic */ AppSetId copy$default(AppSetId appSetId, String str, long j2, int i2, int i3, Object obj) {
                    if ((i3 & 1) != 0) {
                        str = appSetId.value;
                    }
                    if ((i3 & 2) != 0) {
                        j2 = appSetId.expirationTimestamp;
                    }
                    if ((i3 & 4) != 0) {
                        i2 = appSetId.scope;
                    }
                    return appSetId.copy(str, j2, i2);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                /* JADX INFO: renamed from: component2$concierge_release, reason: from getter */
                public final long getExpirationTimestamp() {
                    return this.expirationTimestamp;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final int getScope() {
                    return this.scope;
                }

                public final AppSetId copy(String value, long expirationTimestamp, int scope) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return new AppSetId(value, expirationTimestamp, scope);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof AppSetId)) {
                        return false;
                    }
                    AppSetId appSetId = (AppSetId) other;
                    return Intrinsics.areEqual(this.value, appSetId.value) && this.expirationTimestamp == appSetId.expirationTimestamp && this.scope == appSetId.scope;
                }

                public int hashCode() {
                    return (((this.value.hashCode() * 31) + Long.hashCode(this.expirationTimestamp)) * 31) + Integer.hashCode(this.scope);
                }

                public String toString() {
                    return "AppSetId(value=" + this.value + ", expirationTimestamp=" + this.expirationTimestamp + ", scope=" + this.scope + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AppSetId(String value, long j2, int i2) {
                    super(j.J2, value, j2, null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                    this.expirationTimestamp = j2;
                    this.scope = i2;
                }

                @Override // com.bendingspoons.concierge.domain.entities.Id.Predefined.External
                /* JADX INFO: renamed from: getExpirationTimestamp$concierge_release */
                public long getExpirationTimestamp() {
                    return this.expirationTimestamp;
                }

                public final boolean getHasDeveloperScope() {
                    return this.scope == 2;
                }

                public final int getScope() {
                    return this.scope;
                }

                @Override // com.bendingspoons.concierge.domain.entities.Id
                public String getValue() {
                    return this.value;
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class j implements j {

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private static final /* synthetic */ EnumEntries f51213o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                private static final /* synthetic */ j[] f51214r;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private final String f51215n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private final boolean f51216t;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public static final j f51212O = new j("AAID", 0, "aaid", false);
                public static final j J2 = new j("APP_SET_ID", 1, "app_set_id", false, 2, null);

                private j(String str, int i2, String str2, boolean z2) {
                    this.f51215n = str2;
                    this.f51216t = z2;
                }

                public static EnumEntries nr() {
                    return f51213o;
                }

                private static final /* synthetic */ j[] rl() {
                    return new j[]{f51212O, J2};
                }

                static {
                    j[] jVarArrRl = rl();
                    f51214r = jVarArrRl;
                    f51213o = EnumEntriesKt.enumEntries(jVarArrRl);
                }

                public static j valueOf(String str) {
                    return (j) Enum.valueOf(j.class, str);
                }

                public static j[] values() {
                    return (j[]) f51214r.clone();
                }

                @Override // com.bendingspoons.concierge.domain.entities.Id.j
                public String n() {
                    return this.f51215n;
                }

                public final boolean t() {
                    return this.f51216t;
                }

                /* synthetic */ j(String str, int i2, String str2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, i2, str2, (i3 & 2) != 0 ? true : z2);
                }
            }

            public /* synthetic */ External(j jVar, String str, long j2, DefaultConstructorMarker defaultConstructorMarker) {
                this(jVar, str, j2);
            }

            private External(j jVar, String str, long j2) {
                super(jVar, str, null);
                this.expirationTimestamp = j2;
            }

            /* JADX INFO: renamed from: getExpirationTimestamp$concierge_release, reason: from getter */
            public long getExpirationTimestamp() {
                return this.expirationTimestamp;
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/bendingspoons/concierge/domain/entities/Id$Predefined$Internal;", "Lcom/bendingspoons/concierge/domain/entities/Id$Predefined;", "Lcom/bendingspoons/concierge/domain/entities/Id$j;", "type", "", "value", "<init>", "(Lcom/bendingspoons/concierge/domain/entities/Id$j;Ljava/lang/String;)V", "j", "AndroidId", "BackupPersistentId", "NonBackupPersistentId", "Lcom/bendingspoons/concierge/domain/entities/Id$Predefined$Internal$AndroidId;", "Lcom/bendingspoons/concierge/domain/entities/Id$Predefined$Internal$BackupPersistentId;", "Lcom/bendingspoons/concierge/domain/entities/Id$Predefined$Internal$NonBackupPersistentId;", "concierge_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class Internal extends Predefined {

            @Keep
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/bendingspoons/concierge/domain/entities/Id$Predefined$Internal$AndroidId;", "Lcom/bendingspoons/concierge/domain/entities/Id$Predefined$Internal;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "concierge_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class AndroidId extends Internal {
                private final String value;

                public static /* synthetic */ AndroidId copy$default(AndroidId androidId, String str, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        str = androidId.value;
                    }
                    return androidId.copy(str);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                public final AndroidId copy(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return new AndroidId(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof AndroidId) && Intrinsics.areEqual(this.value, ((AndroidId) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "AndroidId(value=" + this.value + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AndroidId(String value) {
                    super(j.f51220t, value, null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }

                @Override // com.bendingspoons.concierge.domain.entities.Id
                public String getValue() {
                    return this.value;
                }
            }

            @Keep
            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/bendingspoons/concierge/domain/entities/Id$Predefined$Internal$BackupPersistentId;", "Lcom/bendingspoons/concierge/domain/entities/Id$Predefined$Internal;", "value", "", "creationType", "Lcom/bendingspoons/concierge/domain/entities/CreationType;", "<init>", "(Ljava/lang/String;Lcom/bendingspoons/concierge/domain/entities/CreationType;)V", "getValue", "()Ljava/lang/String;", "getCreationType", "()Lcom/bendingspoons/concierge/domain/entities/CreationType;", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "concierge_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class BackupPersistentId extends Internal {
                private final CreationType creationType;
                private final String value;

                public static /* synthetic */ BackupPersistentId copy$default(BackupPersistentId backupPersistentId, String str, CreationType creationType, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        str = backupPersistentId.value;
                    }
                    if ((i2 & 2) != 0) {
                        creationType = backupPersistentId.creationType;
                    }
                    return backupPersistentId.copy(str, creationType);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final CreationType getCreationType() {
                    return this.creationType;
                }

                public final BackupPersistentId copy(String value, CreationType creationType) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Intrinsics.checkNotNullParameter(creationType, "creationType");
                    return new BackupPersistentId(value, creationType);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof BackupPersistentId)) {
                        return false;
                    }
                    BackupPersistentId backupPersistentId = (BackupPersistentId) other;
                    return Intrinsics.areEqual(this.value, backupPersistentId.value) && this.creationType == backupPersistentId.creationType;
                }

                public int hashCode() {
                    return (this.value.hashCode() * 31) + this.creationType.hashCode();
                }

                public String toString() {
                    return "BackupPersistentId(value=" + this.value + ", creationType=" + this.creationType + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public BackupPersistentId(String value, CreationType creationType) {
                    super(j.f51217O, value, null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    Intrinsics.checkNotNullParameter(creationType, "creationType");
                    this.value = value;
                    this.creationType = creationType;
                }

                public final CreationType getCreationType() {
                    return this.creationType;
                }

                @Override // com.bendingspoons.concierge.domain.entities.Id
                public String getValue() {
                    return this.value;
                }
            }

            @Keep
            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/bendingspoons/concierge/domain/entities/Id$Predefined$Internal$NonBackupPersistentId;", "Lcom/bendingspoons/concierge/domain/entities/Id$Predefined$Internal;", "value", "", "creationType", "Lcom/bendingspoons/concierge/domain/entities/CreationType;", "<init>", "(Ljava/lang/String;Lcom/bendingspoons/concierge/domain/entities/CreationType;)V", "getValue", "()Ljava/lang/String;", "getCreationType", "()Lcom/bendingspoons/concierge/domain/entities/CreationType;", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "concierge_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class NonBackupPersistentId extends Internal {
                private final CreationType creationType;
                private final String value;

                public static /* synthetic */ NonBackupPersistentId copy$default(NonBackupPersistentId nonBackupPersistentId, String str, CreationType creationType, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        str = nonBackupPersistentId.value;
                    }
                    if ((i2 & 2) != 0) {
                        creationType = nonBackupPersistentId.creationType;
                    }
                    return nonBackupPersistentId.copy(str, creationType);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final CreationType getCreationType() {
                    return this.creationType;
                }

                public final NonBackupPersistentId copy(String value, CreationType creationType) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Intrinsics.checkNotNullParameter(creationType, "creationType");
                    return new NonBackupPersistentId(value, creationType);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof NonBackupPersistentId)) {
                        return false;
                    }
                    NonBackupPersistentId nonBackupPersistentId = (NonBackupPersistentId) other;
                    return Intrinsics.areEqual(this.value, nonBackupPersistentId.value) && this.creationType == nonBackupPersistentId.creationType;
                }

                public int hashCode() {
                    return (this.value.hashCode() * 31) + this.creationType.hashCode();
                }

                public String toString() {
                    return "NonBackupPersistentId(value=" + this.value + ", creationType=" + this.creationType + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public NonBackupPersistentId(String value, CreationType creationType) {
                    super(j.J2, value, null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    Intrinsics.checkNotNullParameter(creationType, "creationType");
                    this.value = value;
                    this.creationType = creationType;
                }

                public final CreationType getCreationType() {
                    return this.creationType;
                }

                @Override // com.bendingspoons.concierge.domain.entities.Id
                public String getValue() {
                    return this.value;
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class j implements j {

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private static final /* synthetic */ EnumEntries f51218o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                private static final /* synthetic */ j[] f51219r;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private final String f51221n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public static final j f51220t = new j("ANDROID_ID", 0, "android_id");

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public static final j f51217O = new j("BACKUP_PERSISTENT_ID", 1, "backup_persistent_id");
                public static final j J2 = new j("NON_BACKUP_PERSISTENT_ID", 2, "non_backup_persistent_id");

                private static final /* synthetic */ j[] rl() {
                    return new j[]{f51220t, f51217O, J2};
                }

                public static EnumEntries t() {
                    return f51218o;
                }

                static {
                    j[] jVarArrRl = rl();
                    f51219r = jVarArrRl;
                    f51218o = EnumEntriesKt.enumEntries(jVarArrRl);
                }

                public static j valueOf(String str) {
                    return (j) Enum.valueOf(j.class, str);
                }

                public static j[] values() {
                    return (j[]) f51219r.clone();
                }

                @Override // com.bendingspoons.concierge.domain.entities.Id.j
                public String n() {
                    return this.f51221n;
                }

                private j(String str, int i2, String str2) {
                    this.f51221n = str2;
                }
            }

            public /* synthetic */ Internal(j jVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(jVar, str);
            }

            private Internal(j jVar, String str) {
                super(jVar, str, null);
            }
        }

        public /* synthetic */ Predefined(j jVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(jVar, str);
        }

        private Predefined(j jVar, String str) {
            super(jVar, str, null);
        }
    }

    public interface j {
        String n();
    }

    public /* synthetic */ Id(j jVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, str);
    }

    private Id(j jVar, String str) {
        this.type = jVar;
        this.value = str;
    }

    public j getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public final String getName() {
        return getType().n();
    }
}
