package com.bendingspoons.oracle.models;

import Du.DC;
import Du.Y5;
import Du.g9;
import Du.i;
import Du.iF;
import Du.mz;
import Du.vd;
import EJn.Wre;
import XA.Ml;
import XA.Xo;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import gi.I28;
import gi.w6;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B5\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0018\b\u0003\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBE\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J>\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u0018\b\u0003\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\b\b\u0003\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010&\u0012\u0004\b*\u0010+\u001a\u0004\b'\u0010\u0019\"\u0004\b(\u0010)R8\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010,\u0012\u0004\b0\u0010+\u001a\u0004\b-\u0010\u001b\"\u0004\b.\u0010/R(\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010&\u0012\u0004\b3\u0010+\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u0010)¨\u00067"}, d2 = {"Lcom/bendingspoons/oracle/models/Consumable;", "", "", "id", "", "", "Lcom/bendingspoons/oracle/models/ConsumableCredits;", "consumableCredits", "status", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "seen0", "LDu/i;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Ljava/lang/String;LDu/i;)V", "self", "Lgi/Ml;", "output", "LEJn/Wre;", "serialDesc", "", "write$Self$oracle_release", "(Lcom/bendingspoons/oracle/models/Consumable;Lgi/Ml;LEJn/Wre;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/bendingspoons/oracle/models/Consumable;", "toString", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "setId", "(Ljava/lang/String;)V", "getId$annotations", "()V", "Ljava/util/Map;", "getConsumableCredits", "setConsumableCredits", "(Ljava/util/Map;)V", "getConsumableCredits$annotations", "getStatus", "setStatus", "getStatus$annotations", "Companion", "j", c.f62177j, "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Xo
public final /* data */ class Consumable {
    private Map<String, Integer> consumableCredits;
    private String id;
    private String status;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmField
    private static final Ml[] $childSerializers = {null, new mz(Y5.f2000n, iF.f2020n), null};

    public /* synthetic */ class j implements vd {
        private static final Wre descriptor;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f51422n;
        public static final int rl;

        private j() {
        }

        static {
            j jVar = new j();
            f51422n = jVar;
            rl = 8;
            DC dc = new DC("com.bendingspoons.oracle.models.Consumable", jVar, 3);
            dc.HI("product_id", false);
            dc.HI("consumable_credits", true);
            dc.HI("status", true);
            descriptor = dc;
        }

        @Override // XA.Ml, XA.eO, XA.w6
        public final Wre getDescriptor() {
            return descriptor;
        }

        @Override // XA.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public final Consumable deserialize(I28 decoder) {
            int i2;
            String str;
            Map map;
            String strIk;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            Wre wre = descriptor;
            w6 w6VarRl = decoder.rl(wre);
            Ml[] mlArr = Consumable.$childSerializers;
            String strIk2 = null;
            if (w6VarRl.HI()) {
                String strIk3 = w6VarRl.Ik(wre, 0);
                map = (Map) w6VarRl.fD(wre, 1, mlArr[1], null);
                str = strIk3;
                strIk = w6VarRl.Ik(wre, 2);
                i2 = 7;
            } else {
                boolean z2 = true;
                int i3 = 0;
                Map map2 = null;
                String strIk4 = null;
                while (z2) {
                    int iNY = w6VarRl.nY(wre);
                    if (iNY == -1) {
                        z2 = false;
                    } else if (iNY == 0) {
                        strIk2 = w6VarRl.Ik(wre, 0);
                        i3 |= 1;
                    } else if (iNY == 1) {
                        map2 = (Map) w6VarRl.fD(wre, 1, mlArr[1], map2);
                        i3 |= 2;
                    } else {
                        if (iNY != 2) {
                            throw new UnknownFieldException(iNY);
                        }
                        strIk4 = w6VarRl.Ik(wre, 2);
                        i3 |= 4;
                    }
                }
                i2 = i3;
                str = strIk2;
                map = map2;
                strIk = strIk4;
            }
            w6VarRl.t(wre);
            return new Consumable(i2, str, map, strIk, (i) null);
        }

        @Override // XA.eO
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final void serialize(gi.Wre encoder, Consumable value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            Wre wre = descriptor;
            gi.Ml mlRl = encoder.rl(wre);
            Consumable.write$Self$oracle_release(value, mlRl, wre);
            mlRl.t(wre);
        }

        @Override // Du.vd
        public final Ml[] childSerializers() {
            Ml ml = Consumable.$childSerializers[1];
            Y5 y5 = Y5.f2000n;
            return new Ml[]{y5, ml, y5};
        }
    }

    /* JADX INFO: renamed from: com.bendingspoons.oracle.models.Consumable$n, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ml serializer() {
            return j.f51422n;
        }
    }

    public /* synthetic */ Consumable(int i2, String str, Map map, String str2, i iVar) {
        if (1 != (i2 & 1)) {
            g9.n(i2, 1, j.f51422n.getDescriptor());
        }
        this.id = str;
        if ((i2 & 2) == 0) {
            this.consumableCredits = MapsKt.emptyMap();
        } else {
            this.consumableCredits = map;
        }
        if ((i2 & 4) == 0) {
            this.status = "";
        } else {
            this.status = str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Consumable copy$default(Consumable consumable, String str, Map map, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = consumable.id;
        }
        if ((i2 & 2) != 0) {
            map = consumable.consumableCredits;
        }
        if ((i2 & 4) != 0) {
            str2 = consumable.status;
        }
        return consumable.copy(str, map, str2);
    }

    public static /* synthetic */ void getConsumableCredits$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getStatus$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final Map<String, Integer> component2() {
        return this.consumableCredits;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final Consumable copy(@Json(name = "product_id") String id, @Json(name = "consumable_credits") Map<String, Integer> consumableCredits, @Json(name = "status") String status) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(consumableCredits, "consumableCredits");
        Intrinsics.checkNotNullParameter(status, "status");
        return new Consumable(id, consumableCredits, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Consumable)) {
            return false;
        }
        Consumable consumable = (Consumable) other;
        return Intrinsics.areEqual(this.id, consumable.id) && Intrinsics.areEqual(this.consumableCredits, consumable.consumableCredits) && Intrinsics.areEqual(this.status, consumable.status);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.consumableCredits.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "Consumable(id=" + this.id + ", consumableCredits=" + this.consumableCredits + ", status=" + this.status + ")";
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$oracle_release(Consumable self, gi.Ml output, Wre serialDesc) {
        Ml[] mlArr = $childSerializers;
        output.O(serialDesc, 0, self.id);
        if (output.r(serialDesc, 1) || !Intrinsics.areEqual(self.consumableCredits, MapsKt.emptyMap())) {
            output.S(serialDesc, 1, mlArr[1], self.consumableCredits);
        }
        if (!output.r(serialDesc, 2) && Intrinsics.areEqual(self.status, "")) {
            return;
        }
        output.O(serialDesc, 2, self.status);
    }

    public final Map<String, Integer> getConsumableCredits() {
        return this.consumableCredits;
    }

    public final String getId() {
        return this.id;
    }

    public final String getStatus() {
        return this.status;
    }

    public final void setConsumableCredits(Map<String, Integer> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.consumableCredits = map;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setStatus(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.status = str;
    }

    public Consumable(@Json(name = "product_id") String id, @Json(name = "consumable_credits") Map<String, Integer> consumableCredits, @Json(name = "status") String status) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(consumableCredits, "consumableCredits");
        Intrinsics.checkNotNullParameter(status, "status");
        this.id = id;
        this.consumableCredits = consumableCredits;
        this.status = status;
    }

    public /* synthetic */ Consumable(String str, Map map, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? MapsKt.emptyMap() : map, (i2 & 4) != 0 ? "" : str2);
    }
}
