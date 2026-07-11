package cO;

import Du.DC;
import Du.Y5;
import Du.g9;
import Du.i;
import Du.iF;
import Du.vd;
import EJn.Wre;
import XA.Ml;
import XA.Xo;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import gi.I28;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: renamed from: cO.w6, reason: from toString */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Xo
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002$\u001bB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010\u001dR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006%"}, d2 = {"LcO/w6;", "", "", "seen0", "delta", "", "lastEventTimestamp", "LDu/i;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;LDu/i;)V", "self", "Lgi/Ml;", "output", "LEJn/Wre;", "serialDesc", "", "t", "(LcO/w6;Lgi/Ml;LEJn/Wre;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", c.f62177j, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "getDelta$annotations", "()V", "rl", "Ljava/lang/String;", "getLastEventTimestamp$annotations", "Companion", "j", "picox_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NetworkResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer delta;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final String lastEventTimestamp;

    /* JADX INFO: renamed from: cO.w6$j */
    public /* synthetic */ class j implements vd {
        private static final Wre descriptor;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f43654n;

        static {
            j jVar = new j();
            f43654n = jVar;
            DC dc = new DC("com.bendingspoons.picox.network.models.NetworkResponse", jVar, 2);
            dc.HI("delta", false);
            dc.HI("last_event_timestamp", false);
            descriptor = dc;
        }

        @Override // Du.vd
        public final Ml[] childSerializers() {
            return new Ml[]{WY.j.Z(iF.f2020n), WY.j.Z(Y5.f2000n)};
        }

        @Override // XA.Ml, XA.eO, XA.w6
        public final Wre getDescriptor() {
            return descriptor;
        }

        @Override // XA.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public final NetworkResponse deserialize(I28 decoder) {
            Integer num;
            String str;
            int i2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            Wre wre = descriptor;
            gi.w6 w6VarRl = decoder.rl(wre);
            i iVar = null;
            if (w6VarRl.HI()) {
                num = (Integer) w6VarRl.e(wre, 0, iF.f2020n, null);
                str = (String) w6VarRl.e(wre, 1, Y5.f2000n, null);
                i2 = 3;
            } else {
                boolean z2 = true;
                int i3 = 0;
                num = null;
                String str2 = null;
                while (z2) {
                    int iNY = w6VarRl.nY(wre);
                    if (iNY == -1) {
                        z2 = false;
                    } else if (iNY == 0) {
                        num = (Integer) w6VarRl.e(wre, 0, iF.f2020n, num);
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
            return new NetworkResponse(i2, num, str, iVar);
        }

        @Override // XA.eO
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final void serialize(gi.Wre encoder, NetworkResponse value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            Wre wre = descriptor;
            gi.Ml mlRl = encoder.rl(wre);
            NetworkResponse.t(value, mlRl, wre);
            mlRl.t(wre);
        }

        private j() {
        }
    }

    /* JADX INFO: renamed from: cO.w6$n, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ml serializer() {
            return j.f43654n;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkResponse)) {
            return false;
        }
        NetworkResponse networkResponse = (NetworkResponse) other;
        return Intrinsics.areEqual(this.delta, networkResponse.delta) && Intrinsics.areEqual(this.lastEventTimestamp, networkResponse.lastEventTimestamp);
    }

    public /* synthetic */ NetworkResponse(int i2, Integer num, String str, i iVar) {
        if (3 != (i2 & 3)) {
            g9.n(i2, 3, j.f43654n.getDescriptor());
        }
        this.delta = num;
        this.lastEventTimestamp = str;
    }

    public static final /* synthetic */ void t(NetworkResponse self, gi.Ml output, Wre serialDesc) {
        output.X(serialDesc, 0, iF.f2020n, self.delta);
        output.X(serialDesc, 1, Y5.f2000n, self.lastEventTimestamp);
    }

    public int hashCode() {
        Integer num = this.delta;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.lastEventTimestamp;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Integer getDelta() {
        return this.delta;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final String getLastEventTimestamp() {
        return this.lastEventTimestamp;
    }

    public String toString() {
        return "NetworkResponse(delta=" + this.delta + ", lastEventTimestamp=" + this.lastEventTimestamp + ")";
    }
}
