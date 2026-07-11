package Ba;

import XA.Xo;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.Month;
import j$.time.chrono.ChronoLocalDate;
import j$.time.format.DateTimeParseException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.DateTimeFormatException;
import qwH.Pl;
import qwH.ci;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Xo(with = CON.Wre.class)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002)\u0015B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u0015\u0010!\u001a\u00060\u001dj\u0002`\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011R\u0015\u0010'\u001a\u00060#j\u0002`$8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"LBa/I28;", "", "j$/time/LocalDate", "value", "<init>", "(Lj$/time/LocalDate;)V", "", "year", "monthNumber", "dayOfMonth", "(III)V", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", c.f62177j, "(LBa/I28;)I", "xMQ", "Lj$/time/LocalDate;", "Uo", "()Lj$/time/LocalDate;", "KN", "J2", "j$/time/Month", "Lkotlinx/datetime/Month;", "nr", "()Lj$/time/Month;", "month", "rl", "j$/time/DayOfWeek", "Lkotlinx/datetime/DayOfWeek;", "t", "()Lj$/time/DayOfWeek;", "dayOfWeek", "Companion", "j", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class I28 implements Comparable<I28> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final I28 f489O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final I28 f490t;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LocalDate value;

    /* JADX INFO: renamed from: Ba.I28$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ I28 rl(Companion companion, CharSequence charSequence, Pl pl, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                pl = CN3.n();
            }
            return companion.n(charSequence, pl);
        }

        public final I28 n(CharSequence input, Pl format) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(format, "format");
            if (format != n.f492n.n()) {
                return (I28) format.n(input);
            }
            try {
                return new I28(LocalDate.parse(fm.Ml.nr(input.toString())));
            } catch (DateTimeParseException e2) {
                throw new DateTimeFormatException(e2);
            }
        }

        public final XA.Ml serializer() {
            return CON.Wre.f924n;
        }
    }

    public I28(LocalDate value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f492n = new n();
        private static final Pl rl = ci.t();

        private n() {
        }

        public final Pl n() {
            return ci.rl();
        }
    }

    static {
        LocalDate MIN = LocalDate.MIN;
        Intrinsics.checkNotNullExpressionValue(MIN, "MIN");
        f490t = new I28(MIN);
        LocalDate MAX = LocalDate.MAX;
        Intrinsics.checkNotNullExpressionValue(MAX, "MAX");
        f489O = new I28(MAX);
    }

    public final int J2() {
        return this.value.getMonthValue();
    }

    public final int KN() {
        return this.value.getYear();
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final LocalDate getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof I28) && Intrinsics.areEqual(this.value, ((I28) other).value);
        }
        return true;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(I28 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.value.compareTo((ChronoLocalDate) other.value);
    }

    public final Month nr() {
        Month month = this.value.getMonth();
        Intrinsics.checkNotNullExpressionValue(month, "getMonth(...)");
        return month;
    }

    public final int rl() {
        return this.value.getDayOfMonth();
    }

    public final DayOfWeek t() {
        DayOfWeek dayOfWeek = this.value.getDayOfWeek();
        Intrinsics.checkNotNullExpressionValue(dayOfWeek, "getDayOfWeek(...)");
        return dayOfWeek;
    }

    public String toString() {
        String string = this.value.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final int xMQ() {
        return fm.w6.n(this.value.toEpochDay());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public I28(int i2, int i3, int i5) {
        try {
            LocalDate localDateOf = LocalDate.of(i2, i3, i5);
            Intrinsics.checkNotNull(localDateOf);
            this(localDateOf);
        } catch (DateTimeException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
