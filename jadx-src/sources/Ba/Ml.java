package Ba;

import ScC.FuwU.XIvb;
import XA.Xo;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.DateTimeFormatException;
import qwH.Pl;
import qwH.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001cB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"LBa/Ml;", "", "j$/time/Instant", "value", "<init>", "(Lj$/time/Instant;)V", InneractiveMediationNameConsts.OTHER, "", "t", "(LBa/Ml;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", c.f62177j, "Lj$/time/Instant;", "getValue$kotlinx_datetime", "()Lj$/time/Instant;", "", "nr", "()J", "epochSeconds", "Companion", "j", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Xo(with = CON.I28.class)
@SourceDebugExtension({"SMAP\nInstant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Instant.kt\nkotlinx/datetime/Instant\n+ 2 Duration.kt\nkotlin/time/Duration\n*L\n1#1,186:1\n731#2,2:187\n*S KotlinDebug\n*F\n+ 1 Instant.kt\nkotlinx/datetime/Instant\n*L\n36#1:187,2\n*E\n"})
public final class Ml implements Comparable<Ml> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Ml J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Ml f493O;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Ml f494r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Ml f495t;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Instant value;

    /* JADX INFO: renamed from: Ba.Ml$j, reason: from kotlin metadata */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ml n(long j2, int i2) {
            return rl(j2, i2);
        }

        private Companion() {
        }

        public static /* synthetic */ Ml Uo(Companion companion, CharSequence charSequence, Pl pl, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                pl = aC.n.f72548n.n();
            }
            return companion.J2(charSequence, pl);
        }

        public final Ml J2(CharSequence input, Pl format) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(format, "format");
            try {
                return ((qwH.aC) format.n(input)).t();
            } catch (IllegalArgumentException e2) {
                throw new DateTimeFormatException("Failed to parse an instant from '" + ((Object) input) + '\'', e2);
            }
        }

        public final Ml O() {
            Instant instant = Clock.systemUTC().instant();
            Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
            return new Ml(instant);
        }

        public final Ml rl(long j2, long j3) throws Exception {
            try {
                Instant instantOfEpochSecond = Instant.ofEpochSecond(j2, j3);
                Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, XIvb.urRaILofNzBLCA);
                return new Ml(instantOfEpochSecond);
            } catch (Exception e2) {
                if ((e2 instanceof ArithmeticException) || (e2 instanceof DateTimeException)) {
                    return j2 > 0 ? t() : nr();
                }
                throw e2;
            }
        }

        public final XA.Ml serializer() {
            return CON.I28.f920n;
        }

        public final Ml nr() {
            return Ml.J2;
        }

        public final Ml t() {
            return Ml.f494r;
        }
    }

    static {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(-3217862419201L, 999999999L);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
        f495t = new Ml(instantOfEpochSecond);
        Instant instantOfEpochSecond2 = Instant.ofEpochSecond(3093527980800L, 0L);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond2, "ofEpochSecond(...)");
        f493O = new Ml(instantOfEpochSecond2);
        Instant MIN = Instant.MIN;
        Intrinsics.checkNotNullExpressionValue(MIN, "MIN");
        J2 = new Ml(MIN);
        Instant MAX = Instant.MAX;
        Intrinsics.checkNotNullExpressionValue(MAX, "MAX");
        f494r = new Ml(MAX);
    }

    public Ml(Instant value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof Ml) && Intrinsics.areEqual(this.value, ((Ml) other).value);
        }
        return true;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public final long nr() {
        return this.value.getEpochSecond();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public int compareTo(Ml other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.value.compareTo(other.value);
    }

    public String toString() {
        String string = this.value.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
