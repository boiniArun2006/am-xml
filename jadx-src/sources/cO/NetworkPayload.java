package cO;

import Du.DC;
import Du.Wre;
import Du.Y5;
import Du.g9;
import Du.i;
import Du.iF;
import Du.vd;
import SpD.PicoXEvent;
import XA.Ml;
import XA.Xo;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.events.CrashEvent;
import gi.I28;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: renamed from: cO.n, reason: from toString */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Xo
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u0000 32\u00020\u0001:\u00024!B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b-\u0010&\u001a\u0004\b,\u0010\u001aR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u0010&\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"LcO/n;", "", "", "LSpD/I28;", CrashEvent.f62787f, "", "delta", "", "lastEventTimestamp", "LBa/Ml;", "requestTimestamp", "<init>", "(Ljava/util/List;ILjava/lang/String;LBa/Ml;)V", "seen0", "LDu/i;", "serializationConstructorMarker", "(ILjava/util/List;ILjava/lang/String;LBa/Ml;LDu/i;)V", "self", "Lgi/Ml;", "output", "LEJn/Wre;", "serialDesc", "", "rl", "(LcO/n;Lgi/Ml;LEJn/Wre;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", c.f62177j, "Ljava/util/List;", "getEvents", "()Ljava/util/List;", "getEvents$annotations", "()V", "I", "getDelta", "getDelta$annotations", "t", "Ljava/lang/String;", "getLastEventTimestamp", "getLastEventTimestamp$annotations", "nr", "LBa/Ml;", "getRequestTimestamp", "()LBa/Ml;", "getRequestTimestamp$annotations", "Companion", "j", "picox_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NetworkPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Ml[] f43649O = {new Wre(PicoXEvent.j.f9947n), null, null, null};

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final List events;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
    private final Ba.Ml requestTimestamp;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final int delta;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastEventTimestamp;

    /* JADX INFO: renamed from: cO.n$j */
    public /* synthetic */ class j implements vd {
        private static final EJn.Wre descriptor;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f43652n;

        static {
            j jVar = new j();
            f43652n = jVar;
            DC dc = new DC("com.bendingspoons.picox.network.models.NetworkPayload", jVar, 4);
            dc.HI(CrashEvent.f62787f, false);
            dc.HI("delta", false);
            dc.HI("last_event_timestamp", false);
            dc.HI("request_timestamp", false);
            descriptor = dc;
        }

        @Override // XA.Ml, XA.eO, XA.w6
        public final EJn.Wre getDescriptor() {
            return descriptor;
        }

        @Override // XA.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public final NetworkPayload deserialize(I28 decoder) {
            int iXQ;
            int i2;
            List list;
            String str;
            Ba.Ml ml;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            EJn.Wre wre = descriptor;
            gi.w6 w6VarRl = decoder.rl(wre);
            Ml[] mlArr = NetworkPayload.f43649O;
            if (w6VarRl.HI()) {
                List list2 = (List) w6VarRl.fD(wre, 0, mlArr[0], null);
                iXQ = w6VarRl.XQ(wre, 1);
                String str2 = (String) w6VarRl.e(wre, 2, Y5.f2000n, null);
                list = list2;
                ml = (Ba.Ml) w6VarRl.fD(wre, 3, CON.I28.f920n, null);
                str = str2;
                i2 = 15;
            } else {
                boolean z2 = true;
                iXQ = 0;
                List list3 = null;
                String str3 = null;
                Ba.Ml ml2 = null;
                int i3 = 0;
                while (z2) {
                    int iNY = w6VarRl.nY(wre);
                    if (iNY == -1) {
                        z2 = false;
                    } else if (iNY == 0) {
                        list3 = (List) w6VarRl.fD(wre, 0, mlArr[0], list3);
                        i3 |= 1;
                    } else if (iNY == 1) {
                        iXQ = w6VarRl.XQ(wre, 1);
                        i3 |= 2;
                    } else if (iNY == 2) {
                        str3 = (String) w6VarRl.e(wre, 2, Y5.f2000n, str3);
                        i3 |= 4;
                    } else {
                        if (iNY != 3) {
                            throw new UnknownFieldException(iNY);
                        }
                        ml2 = (Ba.Ml) w6VarRl.fD(wre, 3, CON.I28.f920n, ml2);
                        i3 |= 8;
                    }
                }
                i2 = i3;
                list = list3;
                str = str3;
                ml = ml2;
            }
            int i5 = iXQ;
            w6VarRl.t(wre);
            return new NetworkPayload(i2, list, i5, str, ml, null);
        }

        @Override // XA.eO
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final void serialize(gi.Wre encoder, NetworkPayload value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            EJn.Wre wre = descriptor;
            gi.Ml mlRl = encoder.rl(wre);
            NetworkPayload.rl(value, mlRl, wre);
            mlRl.t(wre);
        }

        private j() {
        }

        @Override // Du.vd
        public final Ml[] childSerializers() {
            return new Ml[]{NetworkPayload.f43649O[0], iF.f2020n, WY.j.Z(Y5.f2000n), CON.I28.f920n};
        }
    }

    /* JADX INFO: renamed from: cO.n$n, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ml serializer() {
            return j.f43652n;
        }
    }

    public /* synthetic */ NetworkPayload(int i2, List list, int i3, String str, Ba.Ml ml, i iVar) {
        if (15 != (i2 & 15)) {
            g9.n(i2, 15, j.f43652n.getDescriptor());
        }
        this.events = list;
        this.delta = i3;
        this.lastEventTimestamp = str;
        this.requestTimestamp = ml;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkPayload)) {
            return false;
        }
        NetworkPayload networkPayload = (NetworkPayload) other;
        return Intrinsics.areEqual(this.events, networkPayload.events) && this.delta == networkPayload.delta && Intrinsics.areEqual(this.lastEventTimestamp, networkPayload.lastEventTimestamp) && Intrinsics.areEqual(this.requestTimestamp, networkPayload.requestTimestamp);
    }

    public NetworkPayload(List events, int i2, String str, Ba.Ml requestTimestamp) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(requestTimestamp, "requestTimestamp");
        this.events = events;
        this.delta = i2;
        this.lastEventTimestamp = str;
        this.requestTimestamp = requestTimestamp;
    }

    public static final /* synthetic */ void rl(NetworkPayload self, gi.Ml output, EJn.Wre serialDesc) {
        output.S(serialDesc, 0, f43649O[0], self.events);
        output.fD(serialDesc, 1, self.delta);
        output.X(serialDesc, 2, Y5.f2000n, self.lastEventTimestamp);
        output.S(serialDesc, 3, CON.I28.f920n, self.requestTimestamp);
    }

    public int hashCode() {
        int iHashCode = ((this.events.hashCode() * 31) + Integer.hashCode(this.delta)) * 31;
        String str = this.lastEventTimestamp;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.requestTimestamp.hashCode();
    }

    public String toString() {
        return "NetworkPayload(events=" + this.events + ", delta=" + this.delta + ", lastEventTimestamp=" + this.lastEventTimestamp + ", requestTimestamp=" + this.requestTimestamp + ")";
    }
}
