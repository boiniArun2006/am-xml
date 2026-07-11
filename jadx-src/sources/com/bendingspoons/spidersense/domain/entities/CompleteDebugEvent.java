package com.bendingspoons.spidersense.domain.entities;

import ajd.j;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.bendingspoons.spidersense.domain.entities.j;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0015\b\u0081\b\u0018\u0000 82\u00020\u0001:\u00019Bu\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\rHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0090\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0014J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u0014R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\u001bR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b\u000e\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b\u000f\u0010\u001fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b7\u0010\u0017¨\u0006:"}, d2 = {"Lcom/bendingspoons/spidersense/domain/entities/CompleteDebugEvent;", "", "", "id", "severity", "", "categories", "description", "errorCode", "", "info", "", "createdAt", "", "isSpoonerEvent", "isPremiumUserEvent", "userExperiments", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;DZZLjava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "()Ljava/util/Map;", "component7", "()D", "component8", "()Z", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;DZZLjava/util/List;)Lcom/bendingspoons/spidersense/domain/entities/CompleteDebugEvent;", "toString", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getSeverity", "Ljava/util/List;", "getCategories", "getDescription", "getErrorCode", "Ljava/util/Map;", "getInfo", "D", "getCreatedAt", "Z", "getUserExperiments", "Companion", "j", "spidersense_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CompleteDebugEvent {

    @Json(name = "categories")
    private final List<String> categories;

    @Json(name = "created_at")
    private final double createdAt;

    @Json(name = "description")
    private final String description;

    @Json(name = "error_code")
    private final String errorCode;

    @Json(name = "id")
    private final String id;

    @Json(name = "info")
    private final Map<String, Object> info;

    @Json(name = "is_premium_user_event")
    private final boolean isPremiumUserEvent;

    @Json(name = "is_spooner_event")
    private final boolean isSpoonerEvent;

    @Json(name = "severity")
    private final String severity;

    @Json(name = "user_experiments")
    private final List<String> userExperiments;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.bendingspoons.spidersense.domain.entities.CompleteDebugEvent$j, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: com.bendingspoons.spidersense.domain.entities.CompleteDebugEvent$j$j, reason: collision with other inner class name */
        public /* synthetic */ class C0738j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[j.EnumC0481j.values().length];
                try {
                    iArr[j.EnumC0481j.f13104r.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j.EnumC0481j.J2.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[j.EnumC0481j.f13101O.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[j.EnumC0481j.f13105t.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final String t(j.EnumC0481j enumC0481j) {
            int i2 = C0738j.$EnumSwitchMapping$0[enumC0481j.ordinal()];
            if (i2 == 1) {
                return "critical";
            }
            if (i2 == 2) {
                return MRAIDPresenter.ERROR;
            }
            if (i2 == 3) {
                return "warning";
            }
            if (i2 == 4) {
                return "info";
            }
            throw new NoWhenBranchMatchedException();
        }

        public final CompleteDebugEvent n(ajd.j event, j metadata) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            return new CompleteDebugEvent(metadata.nr(), t(event.Uo()), event.t(), event.nr(), event.O(), MapsKt.plus(event.J2().n(), MapsKt.plus(metadata.n(), CompleteDebugEvent.INSTANCE.rl(metadata.t()))), metadata.rl(), metadata.Uo(), metadata.J2(), metadata.O());
        }

        private final Map rl(j.C0739j c0739j) {
            return MapsKt.mapOf(TuplesKt.to("app_version", c0739j.rl()), TuplesKt.to("app_build_number", Long.valueOf(c0739j.n())), TuplesKt.to("device", c0739j.t()), TuplesKt.to("os_version", c0739j.O()), TuplesKt.to("locale", c0739j.nr()), TuplesKt.to(TtmlNode.TAG_REGION, c0739j.J2()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompleteDebugEvent copy$default(CompleteDebugEvent completeDebugEvent, String str, String str2, List list, String str3, String str4, Map map, double d2, boolean z2, boolean z3, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = completeDebugEvent.id;
        }
        if ((i2 & 2) != 0) {
            str2 = completeDebugEvent.severity;
        }
        if ((i2 & 4) != 0) {
            list = completeDebugEvent.categories;
        }
        if ((i2 & 8) != 0) {
            str3 = completeDebugEvent.description;
        }
        if ((i2 & 16) != 0) {
            str4 = completeDebugEvent.errorCode;
        }
        if ((i2 & 32) != 0) {
            map = completeDebugEvent.info;
        }
        if ((i2 & 64) != 0) {
            d2 = completeDebugEvent.createdAt;
        }
        if ((i2 & 128) != 0) {
            z2 = completeDebugEvent.isSpoonerEvent;
        }
        if ((i2 & 256) != 0) {
            z3 = completeDebugEvent.isPremiumUserEvent;
        }
        if ((i2 & 512) != 0) {
            list2 = completeDebugEvent.userExperiments;
        }
        List list3 = list2;
        boolean z4 = z2;
        double d4 = d2;
        String str5 = str4;
        Map map2 = map;
        List list4 = list;
        String str6 = str3;
        return completeDebugEvent.copy(str, str2, list4, str6, str5, map2, d4, z4, z3, list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<String> component10() {
        return this.userExperiments;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSeverity() {
        return this.severity;
    }

    public final List<String> component3() {
        return this.categories;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    public final Map<String, Object> component6() {
        return this.info;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsSpoonerEvent() {
        return this.isSpoonerEvent;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsPremiumUserEvent() {
        return this.isPremiumUserEvent;
    }

    public final CompleteDebugEvent copy(String id, String severity, List<String> categories, String description, String errorCode, Map<String, ? extends Object> info, double createdAt, boolean isSpoonerEvent, boolean isPremiumUserEvent, List<String> userExperiments) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(userExperiments, "userExperiments");
        return new CompleteDebugEvent(id, severity, categories, description, errorCode, info, createdAt, isSpoonerEvent, isPremiumUserEvent, userExperiments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompleteDebugEvent)) {
            return false;
        }
        CompleteDebugEvent completeDebugEvent = (CompleteDebugEvent) other;
        return Intrinsics.areEqual(this.id, completeDebugEvent.id) && Intrinsics.areEqual(this.severity, completeDebugEvent.severity) && Intrinsics.areEqual(this.categories, completeDebugEvent.categories) && Intrinsics.areEqual(this.description, completeDebugEvent.description) && Intrinsics.areEqual(this.errorCode, completeDebugEvent.errorCode) && Intrinsics.areEqual(this.info, completeDebugEvent.info) && Double.compare(this.createdAt, completeDebugEvent.createdAt) == 0 && this.isSpoonerEvent == completeDebugEvent.isSpoonerEvent && this.isPremiumUserEvent == completeDebugEvent.isPremiumUserEvent && Intrinsics.areEqual(this.userExperiments, completeDebugEvent.userExperiments);
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.severity.hashCode()) * 31) + this.categories.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorCode;
        return ((((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.info.hashCode()) * 31) + Double.hashCode(this.createdAt)) * 31) + Boolean.hashCode(this.isSpoonerEvent)) * 31) + Boolean.hashCode(this.isPremiumUserEvent)) * 31) + this.userExperiments.hashCode();
    }

    public String toString() {
        return "CompleteDebugEvent(id=" + this.id + ", severity=" + this.severity + ", categories=" + this.categories + ", description=" + this.description + ", errorCode=" + this.errorCode + ", info=" + this.info + ", createdAt=" + this.createdAt + ", isSpoonerEvent=" + this.isSpoonerEvent + ", isPremiumUserEvent=" + this.isPremiumUserEvent + ", userExperiments=" + this.userExperiments + ")";
    }

    @VisibleForTesting
    public CompleteDebugEvent(String id, String severity, List<String> categories, String str, String str2, Map<String, ? extends Object> info, double d2, boolean z2, boolean z3, List<String> userExperiments) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(userExperiments, "userExperiments");
        this.id = id;
        this.severity = severity;
        this.categories = categories;
        this.description = str;
        this.errorCode = str2;
        this.info = info;
        this.createdAt = d2;
        this.isSpoonerEvent = z2;
        this.isPremiumUserEvent = z3;
        this.userExperiments = userExperiments;
    }

    public final List<String> getCategories() {
        return this.categories;
    }

    public final double getCreatedAt() {
        return this.createdAt;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getId() {
        return this.id;
    }

    public final Map<String, Object> getInfo() {
        return this.info;
    }

    public final String getSeverity() {
        return this.severity;
    }

    public final List<String> getUserExperiments() {
        return this.userExperiments;
    }

    public final boolean isPremiumUserEvent() {
        return this.isPremiumUserEvent;
    }

    public final boolean isSpoonerEvent() {
        return this.isSpoonerEvent;
    }
}
