package Ba;

import XA.Xo;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import j$.time.DateTimeException;
import j$.time.LocalTime;
import j$.time.format.DateTimeParseException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.DateTimeFormatException;
import qwH.Pl;
import qwH.afx;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Xo(with = CON.CN3.class)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u001d\u0017B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B-\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"LBa/fuX;", "", "j$/time/LocalTime", "value", "<init>", "(Lj$/time/LocalTime;)V", "", "hour", "minute", "second", "nanosecond", "(IIII)V", "rl", "()I", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", c.f62177j, "(LBa/fuX;)I", "Lj$/time/LocalTime;", "getValue$kotlinx_datetime", "()Lj$/time/LocalTime;", "Companion", "j", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class fuX implements Comparable<fuX> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final fuX f500O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final fuX f501t;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LocalTime value;

    /* JADX INFO: renamed from: Ba.fuX$j, reason: from kotlin metadata */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ fuX rl(Companion companion, CharSequence charSequence, Pl pl, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                pl = Dsr.n();
            }
            return companion.n(charSequence, pl);
        }

        public final fuX n(CharSequence input, Pl format) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(format, "format");
            if (format != n.f503n.n()) {
                return (fuX) format.n(input);
            }
            try {
                return new fuX(LocalTime.parse(input));
            } catch (DateTimeParseException e2) {
                throw new DateTimeFormatException(e2);
            }
        }

        public final XA.Ml serializer() {
            return CON.CN3.f916n;
        }
    }

    public fuX(LocalTime value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f503n = new n();

        private n() {
        }

        public final Pl n() {
            return afx.rl();
        }
    }

    static {
        LocalTime MIN = LocalTime.MIN;
        Intrinsics.checkNotNullExpressionValue(MIN, "MIN");
        f501t = new fuX(MIN);
        LocalTime MAX = LocalTime.MAX;
        Intrinsics.checkNotNullExpressionValue(MAX, "MAX");
        f500O = new fuX(MAX);
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof fuX) && Intrinsics.areEqual(this.value, ((fuX) other).value);
        }
        return true;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(fuX other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.value.compareTo(other.value);
    }

    public final int rl() {
        return this.value.toSecondOfDay();
    }

    public String toString() {
        String string = this.value.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public fuX(int i2, int i3, int i5, int i7) {
        try {
            LocalTime localTimeOf = LocalTime.of(i2, i3, i5, i7);
            Intrinsics.checkNotNull(localTimeOf);
            this(localTimeOf);
        } catch (DateTimeException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
