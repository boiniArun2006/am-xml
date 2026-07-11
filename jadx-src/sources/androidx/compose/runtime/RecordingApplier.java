package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001c*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001*J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\bJ\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J:\u0010\u001c\u001a\u00020\u00042\u001f\u0010\u001a\u001a\u001b\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00040\u0017¢\u0006\u0002\b\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\bR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010)\u001a\u00028\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010&\u001a\u0004\b#\u0010'\"\u0004\b(\u0010\u0006¨\u0006+"}, d2 = {"Landroidx/compose/runtime/RecordingApplier;", "N", "Landroidx/compose/runtime/Applier;", "node", "", "KN", "(Ljava/lang/Object;)V", "gh", "()V", "", "index", JavetError.PARAMETER_COUNT, c.f62177j, "(II)V", "from", "to", "t", "(III)V", "clear", "instance", "Uo", "(ILjava/lang/Object;)V", "O", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "block", "value", "nr", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)V", "xMQ", "Landroidx/collection/MutableIntList;", "Landroidx/collection/MutableIntList;", "operations", "Landroidx/collection/MutableObjectList;", "rl", "Landroidx/collection/MutableObjectList;", "instances", "Ljava/lang/Object;", "()Ljava/lang/Object;", "setCurrent", "current", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPausableComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PausableComposition.kt\nandroidx/compose/runtime/RecordingApplier\n+ 2 IntList.kt\nandroidx/collection/IntListKt\n+ 3 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 4 IntList.kt\nandroidx/collection/IntList\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,392:1\n905#2:393\n1516#3:394\n65#4:395\n4643#5,5:396\n*S KotlinDebug\n*F\n+ 1 PausableComposition.kt\nandroidx/compose/runtime/RecordingApplier\n*L\n262#1:393\n263#1:394\n319#1:395\n370#1:396,5\n*E\n"})
public final class RecordingApplier<N> implements Applier<N> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableIntList operations;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableObjectList instances;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Object current;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f30360O = 8;

    @Override // androidx.compose.runtime.Applier
    public void KN(Object node) {
        this.operations.qie(1);
        this.instances.ty(node);
    }

    @Override // androidx.compose.runtime.Applier
    public void O(int index, Object instance) {
        this.operations.qie(6);
        this.operations.qie(index);
        this.instances.ty(instance);
    }

    @Override // androidx.compose.runtime.Applier
    public void Uo(int index, Object instance) {
        this.operations.qie(5);
        this.operations.qie(index);
        this.instances.ty(instance);
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        this.operations.qie(4);
    }

    @Override // androidx.compose.runtime.Applier
    public void gh() {
        this.operations.qie(0);
    }

    @Override // androidx.compose.runtime.Applier
    public void n(int index, int count) {
        this.operations.qie(2);
        this.operations.qie(index);
        this.operations.qie(count);
    }

    @Override // androidx.compose.runtime.Applier
    public void nr(Function2 block, Object value) {
        this.operations.qie(7);
        this.instances.ty(block);
        this.instances.ty(value);
    }

    @Override // androidx.compose.runtime.Applier
    /* JADX INFO: renamed from: rl, reason: from getter */
    public Object getCurrent() {
        return this.current;
    }

    @Override // androidx.compose.runtime.Applier
    public void t(int from, int to, int count) {
        this.operations.qie(3);
        this.operations.qie(from);
        this.operations.qie(to);
        this.operations.qie(count);
    }

    @Override // androidx.compose.runtime.Applier
    public void xMQ() {
        this.operations.qie(8);
    }
}
