package androidx.compose.foundation.layout;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/layout/LazyImpl;", "Lkotlin/Lazy;", "", "Lkotlin/Function0;", "initializer", "", "errorMessage", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "", "isInitialized", "()Z", "toString", "()Ljava/lang/String;", c.f62177j, "Lkotlin/jvm/functions/Function0;", "getInitializer", "()Lkotlin/jvm/functions/Function0;", "t", "Ljava/lang/String;", "getErrorMessage", "O", "I", "_value", "()Ljava/lang/Integer;", "value", "J2", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class LazyImpl implements Lazy<Integer> {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int _value = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function0 initializer;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final String errorMessage;

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this._value != -1;
    }

    @Override // kotlin.Lazy
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        if (this._value == -1) {
            this._value = ((Number) this.initializer.invoke()).intValue();
        }
        int i2 = this._value;
        if (i2 != -1) {
            return Integer.valueOf(i2);
        }
        throw new IllegalStateException(this.errorMessage);
    }

    public LazyImpl(Function0 function0, String str) {
        this.initializer = function0;
        this.errorMessage = str;
    }

    public String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue().intValue());
        }
        return this.errorMessage;
    }
}
