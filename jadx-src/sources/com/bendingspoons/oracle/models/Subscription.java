package com.bendingspoons.oracle.models;

import Du.C1340p;
import Du.DC;
import Du.Wre;
import Du.Y5;
import Du.g9;
import Du.i;
import Du.vd;
import XA.Ml;
import XA.Xo;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bendingspoons.oracle.models.SecondaryApp;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import gi.I28;
import gi.w6;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CDBG\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBY\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJP\u0010#\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0003\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010,\u0012\u0004\b0\u00101\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010/R.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u00102\u0012\u0004\b6\u00101\u001a\u0004\b3\u0010\u001e\"\u0004\b4\u00105R*\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010,\u0012\u0004\b9\u00101\u001a\u0004\b7\u0010\u001c\"\u0004\b8\u0010/R.\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010:\u0012\u0004\b>\u00101\u001a\u0004\b;\u0010!\"\u0004\b<\u0010=R(\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010,\u0012\u0004\bA\u00101\u001a\u0004\b?\u0010\u001c\"\u0004\b@\u0010/¨\u0006E"}, d2 = {"Lcom/bendingspoons/oracle/models/Subscription;", "", "", "id", "", "features", "planId", "", "Lcom/bendingspoons/oracle/models/SecondaryApp;", "secondaryApps", "status", "<init>", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "LDu/i;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;LDu/i;)V", "self", "Lgi/Ml;", "output", "LEJn/Wre;", "serialDesc", "", "write$Self$oracle_release", "(Lcom/bendingspoons/oracle/models/Subscription;Lgi/Ml;LEJn/Wre;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Set;", "component3", "component4", "()Ljava/util/List;", "component5", "copy", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/bendingspoons/oracle/models/Subscription;", "toString", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "setId", "(Ljava/lang/String;)V", "getId$annotations", "()V", "Ljava/util/Set;", "getFeatures", "setFeatures", "(Ljava/util/Set;)V", "getFeatures$annotations", "getPlanId", "setPlanId", "getPlanId$annotations", "Ljava/util/List;", "getSecondaryApps", "setSecondaryApps", "(Ljava/util/List;)V", "getSecondaryApps$annotations", "getStatus", "setStatus", "getStatus$annotations", "Companion", "j", c.f62177j, "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Xo
public final /* data */ class Subscription {
    private Set<String> features;
    private String id;
    private String planId;
    private List<SecondaryApp> secondaryApps;
    private String status;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmField
    private static final Ml[] $childSerializers = {null, new C1340p(Y5.f2000n), null, new Wre(SecondaryApp.j.f51430n), null};

    public /* synthetic */ class j implements vd {
        private static final EJn.Wre descriptor;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f51432n;
        public static final int rl;

        private j() {
        }

        static {
            j jVar = new j();
            f51432n = jVar;
            rl = 8;
            DC dc = new DC("com.bendingspoons.oracle.models.Subscription", jVar, 5);
            dc.HI("product_id", false);
            dc.HI("features", true);
            dc.HI("plan_id", true);
            dc.HI("secondary_apps", true);
            dc.HI("status", true);
            descriptor = dc;
        }

        @Override // XA.Ml, XA.eO, XA.w6
        public final EJn.Wre getDescriptor() {
            return descriptor;
        }

        @Override // XA.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public final Subscription deserialize(I28 decoder) {
            int i2;
            String str;
            Set set;
            String str2;
            List list;
            String strIk;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            EJn.Wre wre = descriptor;
            w6 w6VarRl = decoder.rl(wre);
            Ml[] mlArr = Subscription.$childSerializers;
            String strIk2 = null;
            if (w6VarRl.HI()) {
                String strIk3 = w6VarRl.Ik(wre, 0);
                Set set2 = (Set) w6VarRl.fD(wre, 1, mlArr[1], null);
                String str3 = (String) w6VarRl.e(wre, 2, Y5.f2000n, null);
                list = (List) w6VarRl.fD(wre, 3, mlArr[3], null);
                str = strIk3;
                strIk = w6VarRl.Ik(wre, 4);
                str2 = str3;
                i2 = 31;
                set = set2;
            } else {
                boolean z2 = true;
                int i3 = 0;
                Set set3 = null;
                String str4 = null;
                List list2 = null;
                String strIk4 = null;
                while (z2) {
                    int iNY = w6VarRl.nY(wre);
                    if (iNY == -1) {
                        z2 = false;
                    } else if (iNY == 0) {
                        strIk2 = w6VarRl.Ik(wre, 0);
                        i3 |= 1;
                    } else if (iNY == 1) {
                        set3 = (Set) w6VarRl.fD(wre, 1, mlArr[1], set3);
                        i3 |= 2;
                    } else if (iNY == 2) {
                        str4 = (String) w6VarRl.e(wre, 2, Y5.f2000n, str4);
                        i3 |= 4;
                    } else if (iNY == 3) {
                        list2 = (List) w6VarRl.fD(wre, 3, mlArr[3], list2);
                        i3 |= 8;
                    } else {
                        if (iNY != 4) {
                            throw new UnknownFieldException(iNY);
                        }
                        strIk4 = w6VarRl.Ik(wre, 4);
                        i3 |= 16;
                    }
                }
                i2 = i3;
                str = strIk2;
                set = set3;
                str2 = str4;
                list = list2;
                strIk = strIk4;
            }
            w6VarRl.t(wre);
            return new Subscription(i2, str, set, str2, list, strIk, (i) null);
        }

        @Override // XA.eO
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final void serialize(gi.Wre encoder, Subscription value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            EJn.Wre wre = descriptor;
            gi.Ml mlRl = encoder.rl(wre);
            Subscription.write$Self$oracle_release(value, mlRl, wre);
            mlRl.t(wre);
        }

        @Override // Du.vd
        public final Ml[] childSerializers() {
            Ml[] mlArr = Subscription.$childSerializers;
            Y5 y5 = Y5.f2000n;
            return new Ml[]{y5, mlArr[1], WY.j.Z(y5), mlArr[3], y5};
        }
    }

    /* JADX INFO: renamed from: com.bendingspoons.oracle.models.Subscription$n, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ml serializer() {
            return j.f51432n;
        }
    }

    public /* synthetic */ Subscription(int i2, String str, Set set, String str2, List list, String str3, i iVar) {
        if (1 != (i2 & 1)) {
            g9.n(i2, 1, j.f51432n.getDescriptor());
        }
        this.id = str;
        if ((i2 & 2) == 0) {
            this.features = SetsKt.emptySet();
        } else {
            this.features = set;
        }
        if ((i2 & 4) == 0) {
            this.planId = null;
        } else {
            this.planId = str2;
        }
        if ((i2 & 8) == 0) {
            this.secondaryApps = CollectionsKt.emptyList();
        } else {
            this.secondaryApps = list;
        }
        if ((i2 & 16) == 0) {
            this.status = "";
        } else {
            this.status = str3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Subscription copy$default(Subscription subscription, String str, Set set, String str2, List list, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = subscription.id;
        }
        if ((i2 & 2) != 0) {
            set = subscription.features;
        }
        if ((i2 & 4) != 0) {
            str2 = subscription.planId;
        }
        if ((i2 & 8) != 0) {
            list = subscription.secondaryApps;
        }
        if ((i2 & 16) != 0) {
            str3 = subscription.status;
        }
        String str4 = str3;
        String str5 = str2;
        return subscription.copy(str, set, str5, list, str4);
    }

    public static /* synthetic */ void getFeatures$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getPlanId$annotations() {
    }

    public static /* synthetic */ void getSecondaryApps$annotations() {
    }

    public static /* synthetic */ void getStatus$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final Set<String> component2() {
        return this.features;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    public final List<SecondaryApp> component4() {
        return this.secondaryApps;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final Subscription copy(@Json(name = "product_id") String id, @Json(name = "features") Set<String> features, @Json(name = "plan_id") String planId, @Json(name = "secondary_apps") List<SecondaryApp> secondaryApps, @Json(name = "status") String status) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(secondaryApps, "secondaryApps");
        Intrinsics.checkNotNullParameter(status, "status");
        return new Subscription(id, features, planId, secondaryApps, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) other;
        return Intrinsics.areEqual(this.id, subscription.id) && Intrinsics.areEqual(this.features, subscription.features) && Intrinsics.areEqual(this.planId, subscription.planId) && Intrinsics.areEqual(this.secondaryApps, subscription.secondaryApps) && Intrinsics.areEqual(this.status, subscription.status);
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.features.hashCode()) * 31;
        String str = this.planId;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.secondaryApps.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "Subscription(id=" + this.id + ", features=" + this.features + ", planId=" + this.planId + ", secondaryApps=" + this.secondaryApps + ", status=" + this.status + ")";
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$oracle_release(Subscription self, gi.Ml output, EJn.Wre serialDesc) {
        Ml[] mlArr = $childSerializers;
        output.O(serialDesc, 0, self.id);
        if (output.r(serialDesc, 1) || !Intrinsics.areEqual(self.features, SetsKt.emptySet())) {
            output.S(serialDesc, 1, mlArr[1], self.features);
        }
        if (output.r(serialDesc, 2) || self.planId != null) {
            output.X(serialDesc, 2, Y5.f2000n, self.planId);
        }
        if (output.r(serialDesc, 3) || !Intrinsics.areEqual(self.secondaryApps, CollectionsKt.emptyList())) {
            output.S(serialDesc, 3, mlArr[3], self.secondaryApps);
        }
        if (!output.r(serialDesc, 4) && Intrinsics.areEqual(self.status, "")) {
            return;
        }
        output.O(serialDesc, 4, self.status);
    }

    public final Set<String> getFeatures() {
        return this.features;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPlanId() {
        return this.planId;
    }

    public final List<SecondaryApp> getSecondaryApps() {
        return this.secondaryApps;
    }

    public final String getStatus() {
        return this.status;
    }

    public final void setFeatures(Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.features = set;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setPlanId(String str) {
        this.planId = str;
    }

    public final void setSecondaryApps(List<SecondaryApp> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.secondaryApps = list;
    }

    public final void setStatus(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.status = str;
    }

    public Subscription(@Json(name = "product_id") String id, @Json(name = "features") Set<String> features, @Json(name = "plan_id") String str, @Json(name = "secondary_apps") List<SecondaryApp> secondaryApps, @Json(name = "status") String status) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(secondaryApps, "secondaryApps");
        Intrinsics.checkNotNullParameter(status, "status");
        this.id = id;
        this.features = features;
        this.planId = str;
        this.secondaryApps = secondaryApps;
        this.status = status;
    }

    public /* synthetic */ Subscription(String str, Set set, String str2, List list, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? SetsKt.emptySet() : set, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list, (i2 & 16) != 0 ? "" : str3);
    }
}
