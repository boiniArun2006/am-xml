package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bl\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\u0012\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f¢\u0006\u0002\b\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R-\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f¢\u0006\u0002\b\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b\u001a\u0010#R\u001a\u0010\u0010\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b$\u0010%R\u0016\u0010(\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068G@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u0015\u0010%R\u0017\u0010\u0005\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b,\u0010-\u001a\u0004\b&\u0010+R\u001a\u0010/\u001a\u00028\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b.\u0010-\u001a\u0004\b\u001e\u0010+R\u0014\u00101\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u0010%¨\u00062"}, d2 = {"Landroidx/compose/runtime/ProvidedValue;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/compose/runtime/CompositionLocal;", "compositionLocal", "value", "", "explicitNull", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "mutationPolicy", "Landroidx/compose/runtime/MutableState;", "state", "Lkotlin/Function1;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "Lkotlin/ExtensionFunctionType;", "compute", "isDynamic", "<init>", "(Landroidx/compose/runtime/CompositionLocal;Ljava/lang/Object;ZLandroidx/compose/runtime/SnapshotMutationPolicy;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Z)V", "KN", "()Landroidx/compose/runtime/ProvidedValue;", c.f62177j, "Landroidx/compose/runtime/CompositionLocal;", "rl", "()Landroidx/compose/runtime/CompositionLocal;", "Z", "t", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "O", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "nr", "Landroidx/compose/runtime/MutableState;", "J2", "()Landroidx/compose/runtime/MutableState;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "xMQ", "()Z", "Uo", "Ljava/lang/Object;", "providedValue", "<set-?>", "canOverride", "()Ljava/lang/Object;", "getValue$annotations", "()V", "getEffectiveValue$runtime_release$annotations", "effectiveValue", "mUb", "isStatic", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ProvidedValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4891:1\n1#2:4892\n*E\n"})
public final class ProvidedValue<T> {
    public static final int xMQ = 8;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final boolean isDynamic;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private boolean canOverride = true;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Function1 compute;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final Object providedValue;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final CompositionLocal compositionLocal;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MutableState state;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final boolean explicitNull;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final SnapshotMutationPolicy mutationPolicy;

    public final ProvidedValue KN() {
        this.canOverride = false;
        return this;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final MutableState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final SnapshotMutationPolicy getMutationPolicy() {
        return this.mutationPolicy;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final Object getProvidedValue() {
        return this.providedValue;
    }

    public final boolean mUb() {
        return (this.explicitNull || getProvidedValue() != null) && !this.isDynamic;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getCanOverride() {
        return this.canOverride;
    }

    public final Object nr() {
        if (this.explicitNull) {
            return null;
        }
        MutableState mutableState = this.state;
        if (mutableState != null) {
            return mutableState.getValue();
        }
        Object obj = this.providedValue;
        if (obj != null) {
            return obj;
        }
        ComposerKt.XQ("Unexpected form of a provided value");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final CompositionLocal getCompositionLocal() {
        return this.compositionLocal;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Function1 getCompute() {
        return this.compute;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final boolean getIsDynamic() {
        return this.isDynamic;
    }

    public ProvidedValue(CompositionLocal compositionLocal, Object obj, boolean z2, SnapshotMutationPolicy snapshotMutationPolicy, MutableState mutableState, Function1 function1, boolean z3) {
        this.compositionLocal = compositionLocal;
        this.explicitNull = z2;
        this.mutationPolicy = snapshotMutationPolicy;
        this.state = mutableState;
        this.compute = function1;
        this.isDynamic = z3;
        this.providedValue = obj;
    }
}
