package kotlin.jvm.internal;

import com.caoccao.javet.values.reference.IV8ValueMap;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u0004*\u00028\u0000H$¢\u0006\u0002\u0010\bJ\u0013\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0002\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0004H\u0004J\u001d\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0006R\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000eX\u0082\u0004¢\u0006\n\n\u0002\u0010\u0011\u0012\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "size", "", "<init>", "(I)V", "getSize", "(Ljava/lang/Object;)I", "position", "getPosition", "()I", "setPosition", "spreads", "", "getSpreads$annotations", "()V", "[Ljava/lang/Object;", "addSpread", "", "spreadArgument", "(Ljava/lang/Object;)V", "toArray", IV8ValueMap.FUNCTION_VALUES, "result", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class PrimitiveSpreadBuilder<T> {
    private int position;
    private final int size;
    private final T[] spreads;

    private static /* synthetic */ void getSpreads$annotations() {
    }

    protected abstract int getSize(T t3);

    public final void addSpread(T spreadArgument) {
        Intrinsics.checkNotNullParameter(spreadArgument, "spreadArgument");
        T[] tArr = this.spreads;
        int i2 = this.position;
        this.position = i2 + 1;
        tArr[i2] = spreadArgument;
    }

    protected final int getPosition() {
        return this.position;
    }

    protected final void setPosition(int i2) {
        this.position = i2;
    }

    protected final int size() {
        int i2 = this.size - 1;
        int size = 0;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                T t3 = this.spreads[i3];
                size += t3 != null ? getSize(t3) : 1;
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        return size;
    }

    protected final T toArray(T values, T result) {
        int i2;
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(result, "result");
        int i3 = this.size - 1;
        int i5 = 0;
        if (i3 >= 0) {
            int i7 = 0;
            int i8 = 0;
            i2 = 0;
            while (true) {
                T t3 = this.spreads[i7];
                if (t3 != null) {
                    if (i8 < i7) {
                        int i9 = i7 - i8;
                        System.arraycopy(values, i8, result, i2, i9);
                        i2 += i9;
                    }
                    int size = getSize(t3);
                    System.arraycopy(t3, 0, result, i2, size);
                    i2 += size;
                    i8 = i7 + 1;
                }
                if (i7 == i3) {
                    break;
                }
                i7++;
            }
            i5 = i8;
        } else {
            i2 = 0;
        }
        int i10 = this.size;
        if (i5 < i10) {
            System.arraycopy(values, i5, result, i2, i10 - i5);
        }
        return result;
    }

    public PrimitiveSpreadBuilder(int i2) {
        this.size = i2;
        this.spreads = (T[]) new Object[i2];
    }
}
