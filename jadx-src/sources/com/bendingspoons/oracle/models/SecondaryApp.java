package com.bendingspoons.oracle.models;

import Du.DC;
import Du.Y5;
import Du.i;
import Du.vd;
import EJn.Wre;
import XA.Ml;
import XA.Xo;
import YgZ.uQga.IYJfqUyym;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import gi.I28;
import gi.w6;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001d\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J&\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010!\u0012\u0004\b%\u0010&\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010$R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010!\u0012\u0004\b)\u0010&\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010$¨\u0006-"}, d2 = {"Lcom/bendingspoons/oracle/models/SecondaryApp;", "", "", "bspId", "planId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LDu/i;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LDu/i;)V", "self", "Lgi/Ml;", "output", "LEJn/Wre;", "serialDesc", "", "write$Self$oracle_release", "(Lcom/bendingspoons/oracle/models/SecondaryApp;Lgi/Ml;LEJn/Wre;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bendingspoons/oracle/models/SecondaryApp;", "toString", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBspId", "setBspId", "(Ljava/lang/String;)V", "getBspId$annotations", "()V", "getPlanId", "setPlanId", "getPlanId$annotations", "Companion", "j", c.f62177j, "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Xo
public final /* data */ class SecondaryApp {
    private String bspId;
    private String planId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public /* synthetic */ class j implements vd {
        private static final Wre descriptor;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f51430n;
        public static final int rl;

        private j() {
        }

        static {
            j jVar = new j();
            f51430n = jVar;
            rl = 8;
            DC dc = new DC("com.bendingspoons.oracle.models.SecondaryApp", jVar, 2);
            dc.HI(IYJfqUyym.SYMlgecKT, true);
            dc.HI("plan_id", true);
            descriptor = dc;
        }

        @Override // Du.vd
        public final Ml[] childSerializers() {
            Y5 y5 = Y5.f2000n;
            return new Ml[]{y5, WY.j.Z(y5)};
        }

        @Override // XA.Ml, XA.eO, XA.w6
        public final Wre getDescriptor() {
            return descriptor;
        }

        @Override // XA.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public final SecondaryApp deserialize(I28 decoder) {
            String strIk;
            String str;
            int i2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            Wre wre = descriptor;
            w6 w6VarRl = decoder.rl(wre);
            i iVar = null;
            if (w6VarRl.HI()) {
                strIk = w6VarRl.Ik(wre, 0);
                str = (String) w6VarRl.e(wre, 1, Y5.f2000n, null);
                i2 = 3;
            } else {
                boolean z2 = true;
                int i3 = 0;
                strIk = null;
                String str2 = null;
                while (z2) {
                    int iNY = w6VarRl.nY(wre);
                    if (iNY == -1) {
                        z2 = false;
                    } else if (iNY == 0) {
                        strIk = w6VarRl.Ik(wre, 0);
                        i3 |= 1;
                    } else {
                        if (iNY != 1) {
                            throw new UnknownFieldException(iNY);
                        }
                        str2 = (String) w6VarRl.e(wre, 1, Y5.f2000n, str2);
                        i3 |= 2;
                    }
                }
                str = str2;
                i2 = i3;
            }
            w6VarRl.t(wre);
            return new SecondaryApp(i2, strIk, str, iVar);
        }

        @Override // XA.eO
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final void serialize(gi.Wre encoder, SecondaryApp value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            Wre wre = descriptor;
            gi.Ml mlRl = encoder.rl(wre);
            SecondaryApp.write$Self$oracle_release(value, mlRl, wre);
            mlRl.t(wre);
        }
    }

    /* JADX INFO: renamed from: com.bendingspoons.oracle.models.SecondaryApp$n, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ml serializer() {
            return j.f51430n;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SecondaryApp() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ SecondaryApp copy$default(SecondaryApp secondaryApp, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = secondaryApp.bspId;
        }
        if ((i2 & 2) != 0) {
            str2 = secondaryApp.planId;
        }
        return secondaryApp.copy(str, str2);
    }

    public static /* synthetic */ void getBspId$annotations() {
    }

    public static /* synthetic */ void getPlanId$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$oracle_release(SecondaryApp self, gi.Ml output, Wre serialDesc) {
        if (output.r(serialDesc, 0) || !Intrinsics.areEqual(self.bspId, "")) {
            output.O(serialDesc, 0, self.bspId);
        }
        if (!output.r(serialDesc, 1) && self.planId == null) {
            return;
        }
        output.X(serialDesc, 1, Y5.f2000n, self.planId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBspId() {
        return this.bspId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    public final SecondaryApp copy(@Json(name = "bsp_id") String bspId, @Json(name = "plan_id") String planId) {
        Intrinsics.checkNotNullParameter(bspId, "bspId");
        return new SecondaryApp(bspId, planId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecondaryApp)) {
            return false;
        }
        SecondaryApp secondaryApp = (SecondaryApp) other;
        return Intrinsics.areEqual(this.bspId, secondaryApp.bspId) && Intrinsics.areEqual(this.planId, secondaryApp.planId);
    }

    public int hashCode() {
        int iHashCode = this.bspId.hashCode() * 31;
        String str = this.planId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SecondaryApp(bspId=" + this.bspId + ", planId=" + this.planId + ")";
    }

    public /* synthetic */ SecondaryApp(int i2, String str, String str2, i iVar) {
        this.bspId = (i2 & 1) == 0 ? "" : str;
        if ((i2 & 2) == 0) {
            this.planId = null;
        } else {
            this.planId = str2;
        }
    }

    public final String getBspId() {
        return this.bspId;
    }

    public final String getPlanId() {
        return this.planId;
    }

    public final void setBspId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bspId = str;
    }

    public final void setPlanId(String str) {
        this.planId = str;
    }

    public SecondaryApp(@Json(name = "bsp_id") String bspId, @Json(name = "plan_id") String str) {
        Intrinsics.checkNotNullParameter(bspId, "bspId");
        this.bspId = bspId;
        this.planId = str;
    }

    public /* synthetic */ SecondaryApp(String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : str2);
    }
}
