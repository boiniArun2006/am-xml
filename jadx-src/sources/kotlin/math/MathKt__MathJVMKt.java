package kotlin.math;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.l;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0006\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\b\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0019\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0018\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0010\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010#\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010$\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010%\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010%\u001a\u00020\u0001*\u00020\u00012\u0006\u0010&\u001a\u00020'H\u0087\b\u001a\u0015\u0010(\u001a\u00020\u0001*\u00020\u00012\u0006\u0010)\u001a\u00020\u0001H\u0087\b\u001a\u0015\u00101\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0001H\u0087\b\u001a\u0015\u00101\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001f\u001a\u00020'H\u0087\b\u001a\r\u00105\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u00106\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\u0015\u00107\u001a\u00020\u0001*\u00020\u00012\u0006\u00108\u001a\u00020\u0001H\u0087\b\u001a\f\u00109\u001a\u00020'*\u00020\u0001H\u0007\u001a\f\u0010:\u001a\u00020;*\u00020\u0001H\u0007\u001a\u0011\u0010\u0000\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0003\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0004\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0005\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0006\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0019\u0010\b\u001a\u00020<2\u0006\u0010\t\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\n\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u000b\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\f\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\r\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u000e\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u000f\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0019\u0010\u0010\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<2\u0006\u0010\t\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0011\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0012\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0013\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0018\u0010\u0014\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<2\u0006\u0010\u0015\u001a\u00020<H\u0007\u001a\u0011\u0010\u0016\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0017\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0010\u0010\u0018\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0007\u001a\u0011\u0010\u0019\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u001a\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0010\u0010\u001c\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0007\u001a\u0011\u0010\u001d\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u001e\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u001f\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0019\u0010 \u001a\u00020<2\u0006\u0010!\u001a\u00020<2\u0006\u0010\"\u001a\u00020<H\u0087\b\u001a\u0019\u0010#\u001a\u00020<2\u0006\u0010!\u001a\u00020<2\u0006\u0010\"\u001a\u00020<H\u0087\b\u001a\u0011\u0010$\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0015\u0010%\u001a\u00020<*\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0015\u0010%\u001a\u00020<*\u00020<2\u0006\u0010&\u001a\u00020'H\u0087\b\u001a\u0015\u0010(\u001a\u00020<*\u00020<2\u0006\u0010)\u001a\u00020<H\u0087\b\u001a\u0015\u00101\u001a\u00020<*\u00020<2\u0006\u0010\u001f\u001a\u00020<H\u0087\b\u001a\u0015\u00101\u001a\u00020<*\u00020<2\u0006\u0010\u001f\u001a\u00020'H\u0087\b\u001a\r\u00105\u001a\u00020<*\u00020<H\u0087\b\u001a\r\u00106\u001a\u00020<*\u00020<H\u0087\b\u001a\u0015\u00107\u001a\u00020<*\u00020<2\u0006\u00108\u001a\u00020<H\u0087\b\u001a\f\u00109\u001a\u00020'*\u00020<H\u0007\u001a\f\u0010:\u001a\u00020;*\u00020<H\u0007\u001a\u0011\u0010\u001e\u001a\u00020'2\u0006\u0010&\u001a\u00020'H\u0087\b\u001a\u0019\u0010 \u001a\u00020'2\u0006\u0010!\u001a\u00020'2\u0006\u0010\"\u001a\u00020'H\u0087\b\u001a\u0019\u0010#\u001a\u00020'2\u0006\u0010!\u001a\u00020'2\u0006\u0010\"\u001a\u00020'H\u0087\b\u001a\u0011\u0010\u001e\u001a\u00020;2\u0006\u0010&\u001a\u00020;H\u0087\b\u001a\u0019\u0010 \u001a\u00020;2\u0006\u0010!\u001a\u00020;2\u0006\u0010\"\u001a\u00020;H\u0087\b\u001a\u0019\u0010#\u001a\u00020;2\u0006\u0010!\u001a\u00020;2\u0006\u0010\"\u001a\u00020;H\u0087\b\"\u001f\u0010*\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u001f\u0010\u001f\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010,\u001a\u0004\b0\u0010.\"\u001f\u00102\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010,\u001a\u0004\b4\u0010.\"\u001f\u0010*\u001a\u00020<*\u00020<8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010=\u001a\u0004\b-\u0010>\"\u001f\u0010\u001f\u001a\u00020<*\u00020<8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010=\u001a\u0004\b0\u0010>\"\u001f\u00102\u001a\u00020<*\u00020<8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010=\u001a\u0004\b4\u0010>\"\u001f\u0010*\u001a\u00020'*\u00020'8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010?\u001a\u0004\b-\u0010@\"\u001e\u0010\u001f\u001a\u00020'*\u00020'8FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010?\u001a\u0004\b0\u0010@\"\u001f\u0010*\u001a\u00020;*\u00020;8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010A\u001a\u0004\b-\u0010B\"\u001e\u0010\u001f\u001a\u00020'*\u00020;8FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010A\u001a\u0004\b0\u0010C¨\u0006D"}, d2 = {"sin", "", "x", "cos", "tan", "asin", "acos", "atan", "atan2", "y", "sinh", "cosh", "tanh", "asinh", "acosh", "atanh", "hypot", "sqrt", l.f62670y, "expm1", CreativeInfo.f62442f, TtmlNode.RUBY_BASE, "ln", "log10", "log2", "ln1p", "ceil", "floor", "truncate", "round", "abs", "sign", "min", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "max", "cbrt", "pow", c.f62177j, "", "IEEErem", "divisor", "absoluteValue", "getAbsoluteValue$annotations", "(D)V", "getAbsoluteValue", "(D)D", "getSign$annotations", "getSign", "withSign", "ulp", "getUlp$annotations", "getUlp", "nextUp", "nextDown", "nextTowards", "to", "roundToInt", "roundToLong", "", "", "(F)V", "(F)F", "(I)V", "(I)I", "(J)V", "(J)J", "(J)I", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/math/MathKt")
public class MathKt__MathJVMKt extends MathKt__MathHKt {
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double IEEErem(double d2, double d4) {
        return Math.IEEEremainder(d2, d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double abs(double d2) {
        return Math.abs(d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double acos(double d2) {
        return Math.acos(d2);
    }

    @SinceKotlin(version = "1.2")
    public static final double acosh(double d2) {
        if (d2 < 1.0d) {
            return Double.NaN;
        }
        if (d2 > Constants.upper_taylor_2_bound) {
            return Math.log(d2) + Constants.LN2;
        }
        double d4 = 1;
        double d5 = d2 - d4;
        if (d5 >= Constants.taylor_n_bound) {
            return Math.log(d2 + Math.sqrt((d2 * d2) - d4));
        }
        double dSqrt = Math.sqrt(d5);
        if (dSqrt >= Constants.taylor_2_bound) {
            dSqrt -= ((dSqrt * dSqrt) * dSqrt) / ((double) 12);
        }
        return Math.sqrt(2.0d) * dSqrt;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double asin(double d2) {
        return Math.asin(d2);
    }

    @SinceKotlin(version = "1.2")
    public static final double asinh(double d2) {
        double d4 = Constants.taylor_n_bound;
        if (d2 < d4) {
            return d2 <= (-d4) ? -asinh(-d2) : Math.abs(d2) >= Constants.taylor_2_bound ? d2 - (((d2 * d2) * d2) / ((double) 6)) : d2;
        }
        if (d2 <= Constants.upper_taylor_n_bound) {
            return Math.log(d2 + Math.sqrt((d2 * d2) + ((double) 1)));
        }
        if (d2 > Constants.upper_taylor_2_bound) {
            return Math.log(d2) + Constants.LN2;
        }
        double d5 = d2 * ((double) 2);
        return Math.log(d5 + (((double) 1) / d5));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double atan(double d2) {
        return Math.atan(d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double atan2(double d2, double d4) {
        return Math.atan2(d2, d4);
    }

    @SinceKotlin(version = "1.2")
    public static final double atanh(double d2) {
        if (Math.abs(d2) < Constants.taylor_n_bound) {
            return Math.abs(d2) > Constants.taylor_2_bound ? d2 + (((d2 * d2) * d2) / ((double) 3)) : d2;
        }
        double d4 = 1;
        return Math.log((d4 + d2) / (d4 - d2)) / ((double) 2);
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final double cbrt(double d2) {
        return Math.cbrt(d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double ceil(double d2) {
        return Math.ceil(d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double cos(double d2) {
        return Math.cos(d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double cosh(double d2) {
        return Math.cosh(d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double exp(double d2) {
        return Math.exp(d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double expm1(double d2) {
        return Math.expm1(d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double floor(double d2) {
        return Math.floor(d2);
    }

    private static final double getAbsoluteValue(double d2) {
        return Math.abs(d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(double d2) {
    }

    private static final double getSign(double d2) {
        return Math.signum(d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getSign$annotations(double d2) {
    }

    private static final double getUlp(double d2) {
        return Math.ulp(d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getUlp$annotations(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double hypot(double d2, double d4) {
        return Math.hypot(d2, d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double ln(double d2) {
        return Math.log(d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double ln1p(double d2) {
        return Math.log1p(d2);
    }

    @SinceKotlin(version = "1.2")
    public static final double log(double d2, double d4) {
        if (d4 <= 0.0d || d4 == 1.0d) {
            return Double.NaN;
        }
        return Math.log(d2) / Math.log(d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double log10(double d2) {
        return Math.log10(d2);
    }

    @SinceKotlin(version = "1.2")
    public static final double log2(double d2) {
        return Math.log(d2) / Constants.LN2;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double max(double d2, double d4) {
        return Math.max(d2, d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double min(double d2, double d4) {
        return Math.min(d2, d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double nextDown(double d2) {
        return Math.nextAfter(d2, Double.NEGATIVE_INFINITY);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double nextTowards(double d2, double d4) {
        return Math.nextAfter(d2, d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double nextUp(double d2) {
        return Math.nextUp(d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double pow(double d2, double d4) {
        return Math.pow(d2, d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double round(double d2) {
        return Math.rint(d2);
    }

    @SinceKotlin(version = "1.2")
    public static int roundToInt(double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d2 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d2);
    }

    @SinceKotlin(version = "1.2")
    public static long roundToLong(double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sign(double d2) {
        return Math.signum(d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sin(double d2) {
        return Math.sin(d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sinh(double d2) {
        return Math.sinh(d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sqrt(double d2) {
        return Math.sqrt(d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double tan(double d2) {
        return Math.tan(d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double tanh(double d2) {
        return Math.tanh(d2);
    }

    @SinceKotlin(version = "1.2")
    public static final double truncate(double d2) {
        return (Double.isNaN(d2) || Double.isInfinite(d2)) ? d2 : d2 > 0.0d ? Math.floor(d2) : Math.ceil(d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double withSign(double d2, double d4) {
        return Math.copySign(d2, d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float IEEErem(float f3, float f4) {
        return (float) Math.IEEEremainder(f3, f4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float abs(float f3) {
        return Math.abs(f3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float acos(float f3) {
        return (float) Math.acos(f3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float asin(float f3) {
        return (float) Math.asin(f3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float atan(float f3) {
        return (float) Math.atan(f3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float atan2(float f3, float f4) {
        return (float) Math.atan2(f3, f4);
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final float cbrt(float f3) {
        return (float) Math.cbrt(f3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float ceil(float f3) {
        return (float) Math.ceil(f3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float cos(float f3) {
        return (float) Math.cos(f3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float cosh(float f3) {
        return (float) Math.cosh(f3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float exp(float f3) {
        return (float) Math.exp(f3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float expm1(float f3) {
        return (float) Math.expm1(f3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float floor(float f3) {
        return (float) Math.floor(f3);
    }

    private static final float getAbsoluteValue(float f3) {
        return Math.abs(f3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(float f3) {
    }

    private static final float getSign(float f3) {
        return Math.signum(f3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getSign$annotations(float f3) {
    }

    private static final float getUlp(float f3) {
        return Math.ulp(f3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getUlp$annotations(float f3) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float hypot(float f3, float f4) {
        return (float) Math.hypot(f3, f4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float ln(float f3) {
        return (float) Math.log(f3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float ln1p(float f3) {
        return (float) Math.log1p(f3);
    }

    @SinceKotlin(version = "1.2")
    public static final float log(float f3, float f4) {
        if (f4 <= 0.0f || f4 == 1.0f) {
            return Float.NaN;
        }
        return (float) (Math.log(f3) / Math.log(f4));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float log10(float f3) {
        return (float) Math.log10(f3);
    }

    @SinceKotlin(version = "1.2")
    public static final float log2(float f3) {
        return (float) (Math.log(f3) / Constants.LN2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float max(float f3, float f4) {
        return Math.max(f3, f4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float min(float f3, float f4) {
        return Math.min(f3, f4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float nextDown(float f3) {
        return Math.nextAfter(f3, Double.NEGATIVE_INFINITY);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float nextTowards(float f3, float f4) {
        return Math.nextAfter(f3, f4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float nextUp(float f3) {
        return Math.nextUp(f3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double pow(double d2, int i2) {
        return Math.pow(d2, i2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float round(float f3) {
        return (float) Math.rint(f3);
    }

    @SinceKotlin(version = "1.2")
    public static long roundToLong(float f3) {
        return roundToLong(f3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sign(float f3) {
        return Math.signum(f3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sin(float f3) {
        return (float) Math.sin(f3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sinh(float f3) {
        return (float) Math.sinh(f3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sqrt(float f3) {
        return (float) Math.sqrt(f3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float tan(float f3) {
        return (float) Math.tan(f3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float tanh(float f3) {
        return (float) Math.tanh(f3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double withSign(double d2, int i2) {
        return Math.copySign(d2, i2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int abs(int i2) {
        return Math.abs(i2);
    }

    private static final int getAbsoluteValue(int i2) {
        return Math.abs(i2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(int i2) {
    }

    public static int getSign(int i2) {
        return Integer.signum(i2);
    }

    @SinceKotlin(version = "1.2")
    public static /* synthetic */ void getSign$annotations(int i2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int max(int i2, int i3) {
        return Math.max(i2, i3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int min(int i2, int i3) {
        return Math.min(i2, i3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float pow(float f3, float f4) {
        return (float) Math.pow(f3, f4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float withSign(float f3, float f4) {
        return Math.copySign(f3, f4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long abs(long j2) {
        return Math.abs(j2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float atanh(float f3) {
        return (float) atanh(f3);
    }

    private static final long getAbsoluteValue(long j2) {
        return Math.abs(j2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(long j2) {
    }

    public static int getSign(long j2) {
        return Long.signum(j2);
    }

    @SinceKotlin(version = "1.2")
    public static /* synthetic */ void getSign$annotations(long j2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long max(long j2, long j3) {
        return Math.max(j2, j3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long min(long j2, long j3) {
        return Math.min(j2, j3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float pow(float f3, int i2) {
        return (float) Math.pow(f3, i2);
    }

    @SinceKotlin(version = "1.2")
    public static int roundToInt(float f3) {
        if (Float.isNaN(f3)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f3);
    }

    @SinceKotlin(version = "1.2")
    public static float truncate(float f3) {
        double dCeil;
        if (Float.isNaN(f3) || Float.isInfinite(f3)) {
            return f3;
        }
        if (f3 > 0.0f) {
            dCeil = Math.floor(f3);
        } else {
            dCeil = Math.ceil(f3);
        }
        return (float) dCeil;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float withSign(float f3, int i2) {
        return Math.copySign(f3, i2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float acosh(float f3) {
        return (float) acosh(f3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float asinh(float f3) {
        return (float) asinh(f3);
    }
}
