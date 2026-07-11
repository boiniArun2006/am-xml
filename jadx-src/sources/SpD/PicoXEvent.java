package SpD;

import Du.DC;
import Du.Y5;
import Du.g9;
import Du.i;
import Du.mz;
import Du.vd;
import XA.Xo;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.QJ;

/* JADX INFO: renamed from: SpD.I28, reason: from toString */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Xo
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<#BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n¢\u0006\u0004\b\f\u0010\rBe\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001cR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u001cR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010*\u0012\u0004\b-\u0010'\u001a\u0004\b+\u0010,R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u0010'\u001a\u0004\b0\u00101R \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010/\u0012\u0004\b5\u0010'\u001a\u0004\b4\u00101R.\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u0010'\u001a\u0004\b8\u00109¨\u0006="}, d2 = {"LSpD/I28;", "", "", "eventId", "eventName", "LBa/Ml;", "eventTimestamp", "Lkotlinx/serialization/json/Dsr;", "payload", "context", "", "identifiers", "<init>", "(Ljava/lang/String;Ljava/lang/String;LBa/Ml;Lkotlinx/serialization/json/Dsr;Lkotlinx/serialization/json/Dsr;Ljava/util/Map;)V", "", "seen0", "LDu/i;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LBa/Ml;Lkotlinx/serialization/json/Dsr;Lkotlinx/serialization/json/Dsr;Ljava/util/Map;LDu/i;)V", "self", "Lgi/Ml;", "output", "LEJn/Wre;", "serialDesc", "", "t", "(LSpD/I28;Lgi/Ml;LEJn/Wre;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", c.f62177j, "Ljava/lang/String;", "rl", "getEventId$annotations", "()V", "getEventName", "getEventName$annotations", "LBa/Ml;", "getEventTimestamp", "()LBa/Ml;", "getEventTimestamp$annotations", "nr", "Lkotlinx/serialization/json/Dsr;", "getPayload", "()Lkotlinx/serialization/json/Dsr;", "getPayload$annotations", "O", "getContext", "getContext$annotations", "J2", "Ljava/util/Map;", "getIdentifiers", "()Ljava/util/Map;", "getIdentifiers$annotations", "Companion", "j", "picox_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PicoXEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final XA.Ml[] Uo;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata and from toString */
    private final Map identifiers;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final kotlinx.serialization.json.Dsr context;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String eventId;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
    private final kotlinx.serialization.json.Dsr payload;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final String eventName;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final Ba.Ml eventTimestamp;

    /* JADX INFO: renamed from: SpD.I28$j */
    public /* synthetic */ class j implements vd {
        private static final EJn.Wre descriptor;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f9947n;

        static {
            j jVar = new j();
            f9947n = jVar;
            DC dc = new DC("com.bendingspoons.picox.models.PicoXEvent", jVar, 6);
            dc.HI("event_id", false);
            dc.HI("event_name", false);
            dc.HI("event_timestamp", false);
            dc.HI("payload", false);
            dc.HI("context", false);
            dc.HI("identifiers", false);
            descriptor = dc;
        }

        @Override // XA.Ml, XA.eO, XA.w6
        public final EJn.Wre getDescriptor() {
            return descriptor;
        }

        @Override // XA.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public final PicoXEvent deserialize(gi.I28 decoder) {
            int i2;
            String str;
            String str2;
            Ba.Ml ml;
            kotlinx.serialization.json.Dsr dsr;
            kotlinx.serialization.json.Dsr dsr2;
            Map map;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            EJn.Wre wre = descriptor;
            gi.w6 w6VarRl = decoder.rl(wre);
            XA.Ml[] mlArr = PicoXEvent.Uo;
            String strIk = null;
            if (w6VarRl.HI()) {
                String strIk2 = w6VarRl.Ik(wre, 0);
                String strIk3 = w6VarRl.Ik(wre, 1);
                Ba.Ml ml2 = (Ba.Ml) w6VarRl.fD(wre, 2, CON.I28.f920n, null);
                QJ qj = QJ.f70267n;
                kotlinx.serialization.json.Dsr dsr3 = (kotlinx.serialization.json.Dsr) w6VarRl.fD(wre, 3, qj, null);
                kotlinx.serialization.json.Dsr dsr4 = (kotlinx.serialization.json.Dsr) w6VarRl.fD(wre, 4, qj, null);
                map = (Map) w6VarRl.fD(wre, 5, mlArr[5], null);
                str = strIk2;
                dsr = dsr3;
                dsr2 = dsr4;
                ml = ml2;
                i2 = 63;
                str2 = strIk3;
            } else {
                boolean z2 = true;
                int i3 = 0;
                String strIk4 = null;
                Ba.Ml ml3 = null;
                kotlinx.serialization.json.Dsr dsr5 = null;
                kotlinx.serialization.json.Dsr dsr6 = null;
                Map map2 = null;
                while (z2) {
                    int iNY = w6VarRl.nY(wre);
                    switch (iNY) {
                        case -1:
                            z2 = false;
                            continue;
                        case 0:
                            strIk = w6VarRl.Ik(wre, 0);
                            i3 |= 1;
                            continue;
                        case 1:
                            strIk4 = w6VarRl.Ik(wre, 1);
                            i3 |= 2;
                            break;
                        case 2:
                            ml3 = (Ba.Ml) w6VarRl.fD(wre, 2, CON.I28.f920n, ml3);
                            i3 |= 4;
                            break;
                        case 3:
                            dsr5 = (kotlinx.serialization.json.Dsr) w6VarRl.fD(wre, 3, QJ.f70267n, dsr5);
                            i3 |= 8;
                            break;
                        case 4:
                            dsr6 = (kotlinx.serialization.json.Dsr) w6VarRl.fD(wre, 4, QJ.f70267n, dsr6);
                            i3 |= 16;
                            break;
                        case 5:
                            map2 = (Map) w6VarRl.fD(wre, 5, mlArr[5], map2);
                            i3 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iNY);
                    }
                }
                i2 = i3;
                str = strIk;
                str2 = strIk4;
                ml = ml3;
                dsr = dsr5;
                dsr2 = dsr6;
                map = map2;
            }
            w6VarRl.t(wre);
            return new PicoXEvent(i2, str, str2, ml, dsr, dsr2, map, null);
        }

        @Override // XA.eO
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final void serialize(gi.Wre encoder, PicoXEvent value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            EJn.Wre wre = descriptor;
            gi.Ml mlRl = encoder.rl(wre);
            PicoXEvent.t(value, mlRl, wre);
            mlRl.t(wre);
        }

        private j() {
        }

        @Override // Du.vd
        public final XA.Ml[] childSerializers() {
            XA.Ml ml = PicoXEvent.Uo[5];
            Y5 y5 = Y5.f2000n;
            QJ qj = QJ.f70267n;
            return new XA.Ml[]{y5, y5, CON.I28.f920n, qj, qj, ml};
        }
    }

    /* JADX INFO: renamed from: SpD.I28$n, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final XA.Ml serializer() {
            return j.f9947n;
        }
    }

    public /* synthetic */ PicoXEvent(int i2, String str, String str2, Ba.Ml ml, kotlinx.serialization.json.Dsr dsr, kotlinx.serialization.json.Dsr dsr2, Map map, i iVar) {
        if (63 != (i2 & 63)) {
            g9.n(i2, 63, j.f9947n.getDescriptor());
        }
        this.eventId = str;
        this.eventName = str2;
        this.eventTimestamp = ml;
        this.payload = dsr;
        this.context = dsr2;
        this.identifiers = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PicoXEvent)) {
            return false;
        }
        PicoXEvent picoXEvent = (PicoXEvent) other;
        return Intrinsics.areEqual(this.eventId, picoXEvent.eventId) && Intrinsics.areEqual(this.eventName, picoXEvent.eventName) && Intrinsics.areEqual(this.eventTimestamp, picoXEvent.eventTimestamp) && Intrinsics.areEqual(this.payload, picoXEvent.payload) && Intrinsics.areEqual(this.context, picoXEvent.context) && Intrinsics.areEqual(this.identifiers, picoXEvent.identifiers);
    }

    static {
        Y5 y5 = Y5.f2000n;
        Uo = new XA.Ml[]{null, null, null, null, null, new mz(y5, WY.j.Z(y5))};
    }

    public PicoXEvent(String eventId, String eventName, Ba.Ml eventTimestamp, kotlinx.serialization.json.Dsr payload, kotlinx.serialization.json.Dsr context, Map identifiers) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventTimestamp, "eventTimestamp");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(identifiers, "identifiers");
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventTimestamp = eventTimestamp;
        this.payload = payload;
        this.context = context;
        this.identifiers = identifiers;
    }

    public static final /* synthetic */ void t(PicoXEvent self, gi.Ml output, EJn.Wre serialDesc) {
        XA.Ml[] mlArr = Uo;
        output.O(serialDesc, 0, self.eventId);
        output.O(serialDesc, 1, self.eventName);
        output.S(serialDesc, 2, CON.I28.f920n, self.eventTimestamp);
        QJ qj = QJ.f70267n;
        output.S(serialDesc, 3, qj, self.payload);
        output.S(serialDesc, 4, qj, self.context);
        output.S(serialDesc, 5, mlArr[5], self.identifiers);
    }

    public int hashCode() {
        return (((((((((this.eventId.hashCode() * 31) + this.eventName.hashCode()) * 31) + this.eventTimestamp.hashCode()) * 31) + this.payload.hashCode()) * 31) + this.context.hashCode()) * 31) + this.identifiers.hashCode();
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    public String toString() {
        return "PicoXEvent(eventId=" + this.eventId + ", eventName=" + this.eventName + ", eventTimestamp=" + this.eventTimestamp + ", payload=" + this.payload + ", context=" + this.context + ", identifiers=" + this.identifiers + ")";
    }
}
