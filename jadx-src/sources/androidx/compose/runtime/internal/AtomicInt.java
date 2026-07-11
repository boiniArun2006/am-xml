package androidx.compose.runtime.internal;

import com.applovin.sdk.AppLovinEventParameters;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/internal/AtomicInt;", "Ljava/util/concurrent/atomic/AtomicInteger;", "", "value", "<init>", "(I)V", AppLovinEventParameters.REVENUE_AMOUNT, c.f62177j, "(I)I", "", "rl", "()B", "", "Uo", "()S", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AtomicInt extends AtomicInteger {
    public AtomicInt(int i2) {
        super(i2);
    }

    public /* bridge */ long J2() {
        return super.longValue();
    }

    public /* bridge */ int O() {
        return super.intValue();
    }

    public short Uo() {
        return (short) intValue();
    }

    @Override // java.lang.Number
    public final /* bridge */ byte byteValue() {
        return rl();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ double doubleValue() {
        return t();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ float floatValue() {
        return nr();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ int intValue() {
        return O();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ long longValue() {
        return J2();
    }

    public final int n(int amount) {
        return addAndGet(amount);
    }

    public /* bridge */ float nr() {
        return super.floatValue();
    }

    public byte rl() {
        return (byte) intValue();
    }

    @Override // java.lang.Number
    public final /* bridge */ short shortValue() {
        return Uo();
    }

    public /* bridge */ double t() {
        return super.doubleValue();
    }
}
