package Ba;

import XA.Xo;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qwH.Pl;
import qwH.h;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Xo(with = CON.aC.class)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0017"}, d2 = {"LBa/aC;", "", "j$/time/ZoneOffset", "zoneOffset", "<init>", "(Lj$/time/ZoneOffset;)V", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", c.f62177j, "Lj$/time/ZoneOffset;", "getZoneOffset$kotlinx_datetime", "()Lj$/time/ZoneOffset;", "totalSeconds", "Companion", "j", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class aC {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final aC rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ZoneOffset zoneOffset;

    /* JADX INFO: renamed from: Ba.aC$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ aC rl(Companion companion, CharSequence charSequence, Pl pl, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                pl = qz.n();
            }
            return companion.n(charSequence, pl);
        }

        public final aC n(CharSequence input, Pl format) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(format, "format");
            n nVar = n.f499n;
            if (format == nVar.rl()) {
                DateTimeFormatter dateTimeFormatterKN = o.KN();
                Intrinsics.checkNotNullExpressionValue(dateTimeFormatterKN, "access$getIsoFormat(...)");
                return o.xMQ(input, dateTimeFormatterKN);
            }
            if (format == nVar.t()) {
                DateTimeFormatter dateTimeFormatterUo = o.Uo();
                Intrinsics.checkNotNullExpressionValue(dateTimeFormatterUo, "access$getIsoBasicFormat(...)");
                return o.xMQ(input, dateTimeFormatterUo);
            }
            if (format != nVar.n()) {
                return (aC) format.n(input);
            }
            DateTimeFormatter dateTimeFormatterJ2 = o.J2();
            Intrinsics.checkNotNullExpressionValue(dateTimeFormatterJ2, "access$getFourDigitsFormat(...)");
            return o.xMQ(input, dateTimeFormatterJ2);
        }

        public final XA.Ml serializer() {
            return CON.aC.f925n;
        }
    }

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f499n = new n();

        private n() {
        }

        public final Pl n() {
            return h.rl();
        }

        public final Pl rl() {
            return h.t();
        }

        public final Pl t() {
            return h.nr();
        }
    }

    static {
        ZoneOffset UTC = ZoneOffset.UTC;
        Intrinsics.checkNotNullExpressionValue(UTC, "UTC");
        rl = new aC(UTC);
    }

    public aC(ZoneOffset zoneOffset) {
        Intrinsics.checkNotNullParameter(zoneOffset, "zoneOffset");
        this.zoneOffset = zoneOffset;
    }

    public boolean equals(Object other) {
        return (other instanceof aC) && Intrinsics.areEqual(this.zoneOffset, ((aC) other).zoneOffset);
    }

    public int hashCode() {
        return this.zoneOffset.hashCode();
    }

    public final int n() {
        return this.zoneOffset.getTotalSeconds();
    }

    public String toString() {
        String string = this.zoneOffset.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
