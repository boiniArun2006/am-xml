package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Stable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H ¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u000e\u0010\rJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u000f\u0010\rJ3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH\u0010¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/CompositionLocal;", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/ProvidedValue;", "value", "Landroidx/compose/runtime/ValueHolder;", "J2", "(Landroidx/compose/runtime/ProvidedValue;)Landroidx/compose/runtime/ValueHolder;", "t", "(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;", "nr", "O", "previous", "rl", "(Landroidx/compose/runtime/ProvidedValue;Landroidx/compose/runtime/ValueHolder;)Landroidx/compose/runtime/ValueHolder;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ProvidableCompositionLocal<T> extends CompositionLocal<T> {
    public ProvidableCompositionLocal(Function0 function0) {
        super(function0, null);
    }

    public abstract ProvidedValue t(Object value);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[PHI: r5
      0x0034: PHI (r5v2 androidx.compose.runtime.ValueHolder) = (r5v5 androidx.compose.runtime.ValueHolder), (r5v6 androidx.compose.runtime.ValueHolder) binds: [B:17:0x0044, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.runtime.CompositionLocal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ValueHolder rl(ProvidedValue value, ValueHolder previous) {
        ValueHolder valueHolder;
        ValueHolder valueHolder2 = null;
        valueHolder2 = null;
        valueHolder2 = null;
        valueHolder2 = null;
        valueHolder2 = null;
        if (previous instanceof DynamicValueHolder) {
            if (value.getIsDynamic()) {
                DynamicValueHolder dynamicValueHolder = (DynamicValueHolder) previous;
                dynamicValueHolder.getState().setValue(value.nr());
                valueHolder2 = dynamicValueHolder;
            }
        } else if (previous instanceof StaticValueHolder) {
            if (value.mUb()) {
                StaticValueHolder staticValueHolder = (StaticValueHolder) previous;
                boolean zAreEqual = Intrinsics.areEqual(value.nr(), staticValueHolder.getValue());
                valueHolder = staticValueHolder;
                if (zAreEqual) {
                    valueHolder2 = valueHolder;
                }
            }
        } else if (previous instanceof ComputedValueHolder) {
            Function1 compute = value.getCompute();
            ComputedValueHolder computedValueHolder = (ComputedValueHolder) previous;
            Function1 function1T = computedValueHolder.getCompute();
            valueHolder = computedValueHolder;
            if (compute == function1T) {
            }
        }
        return valueHolder2 == null ? J2(value) : valueHolder2;
    }

    private final ValueHolder J2(ProvidedValue value) {
        if (value.getIsDynamic()) {
            MutableState state = value.getState();
            if (state == null) {
                Object providedValue = value.getProvidedValue();
                SnapshotMutationPolicy mutationPolicy = value.getMutationPolicy();
                if (mutationPolicy == null) {
                    mutationPolicy = SnapshotStateKt.r();
                }
                state = SnapshotStateKt.xMQ(providedValue, mutationPolicy);
            }
            return new DynamicValueHolder(state);
        }
        if (value.getCompute() != null) {
            return new ComputedValueHolder(value.getCompute());
        }
        if (value.getState() != null) {
            return new DynamicValueHolder(value.getState());
        }
        return new StaticValueHolder(value.nr());
    }

    public final ProvidedValue O(Object value) {
        return t(value).KN();
    }

    public final ProvidedValue nr(Object value) {
        return t(value);
    }
}
