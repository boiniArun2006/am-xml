package androidx.window.core;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001$B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0018\u0010!¨\u0006%"}, d2 = {"Landroidx/window/core/Version;", "", "", "major", "minor", "patch", "", "description", "<init>", "(IIILjava/lang/String;)V", "toString", "()Ljava/lang/String;", InneractiveMediationNameConsts.OTHER, "rl", "(Landroidx/window/core/Version;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", c.f62177j, "I", "nr", "t", "J2", "O", "Uo", "Ljava/lang/String;", "getDescription", "Ljava/math/BigInteger;", "r", "Lkotlin/Lazy;", "()Ljava/math/BigInteger;", "bigInteger", "o", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Version implements Comparable<Version> {
    private static final Version E2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Version f42593g;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int patch;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int major;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Lazy bigInteger;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int minor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final Version f42592Z = new Version(0, 0, 0, "");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final Version f42591S = new Version(0, 1, 0, "");

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/window/core/Version$Companion;", "", "<init>", "()V", "", "versionString", "Landroidx/window/core/Version;", "rl", "(Ljava/lang/String;)Landroidx/window/core/Version;", "VERSION_0_1", "Landroidx/window/core/Version;", c.f62177j, "()Landroidx/window/core/Version;", "VERSION_PATTERN_STRING", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Version rl(String versionString) {
            if (versionString == null || StringsKt.isBlank(versionString)) {
                return null;
            }
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(versionString);
            if (!matcher.matches()) {
                return null;
            }
            String strGroup = matcher.group(1);
            Integer numValueOf = strGroup == null ? null : Integer.valueOf(Integer.parseInt(strGroup));
            if (numValueOf == null) {
                return null;
            }
            int iIntValue = numValueOf.intValue();
            String strGroup2 = matcher.group(2);
            Integer numValueOf2 = strGroup2 == null ? null : Integer.valueOf(Integer.parseInt(strGroup2));
            if (numValueOf2 == null) {
                return null;
            }
            int iIntValue2 = numValueOf2.intValue();
            String strGroup3 = matcher.group(3);
            Integer numValueOf3 = strGroup3 == null ? null : Integer.valueOf(Integer.parseInt(strGroup3));
            if (numValueOf3 == null) {
                return null;
            }
            int iIntValue3 = numValueOf3.intValue();
            String description = matcher.group(4) != null ? matcher.group(4) : "";
            Intrinsics.checkNotNullExpressionValue(description, "description");
            return new Version(iIntValue, iIntValue2, iIntValue3, description, null);
        }

        private Companion() {
        }

        public final Version n() {
            return Version.f42591S;
        }
    }

    public /* synthetic */ Version(int i2, int i3, int i5, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i5, str);
    }

    static {
        Version version = new Version(1, 0, 0, "");
        f42593g = version;
        E2 = version;
    }

    private Version(int i2, int i3, int i5, String str) {
        this.major = i2;
        this.minor = i3;
        this.patch = i5;
        this.description = str;
        this.bigInteger = LazyKt.lazy(new Function0<BigInteger>() { // from class: androidx.window.core.Version$bigInteger$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final BigInteger invoke() {
                return BigInteger.valueOf(this.f42599n.getMajor()).shiftLeft(32).or(BigInteger.valueOf(this.f42599n.getMinor())).shiftLeft(32).or(BigInteger.valueOf(this.f42599n.getPatch()));
            }
        });
    }

    private final BigInteger t() {
        Object value = this.bigInteger.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final int getMinor() {
        return this.minor;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final int getPatch() {
        return this.patch;
    }

    public boolean equals(Object other) {
        if (!(other instanceof Version)) {
            return false;
        }
        Version version = (Version) other;
        return this.major == version.major && this.minor == version.minor && this.patch == version.patch;
    }

    public int hashCode() {
        return ((((527 + this.major) * 31) + this.minor) * 31) + this.patch;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final int getMajor() {
        return this.major;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public int compareTo(Version other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return t().compareTo(other.t());
    }

    public String toString() {
        return this.major + '.' + this.minor + '.' + this.patch + (!StringsKt.isBlank(this.description) ? Intrinsics.stringPlus("-", this.description) : "");
    }
}
