package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003J)\u0010\u000f\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0018\u001a\u00020\u00072\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u0003J@\u0010!\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u001b\"\u0004\b\u0001\u0010\u001c2\u0006\u0010\u001d\u001a\u00028\u00002\u001d\u0010 \u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u001e¢\u0006\u0002\b\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010(R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0011\u0010-\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Landroidx/compose/runtime/changelist/FixupList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "<init>", "()V", "", "Uo", "()Z", "", "rl", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "O", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "Lkotlin/Function0;", "", "factory", "", "insertIndex", "Landroidx/compose/runtime/Anchor;", "groupAnchor", "t", "(Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Anchor;)V", "nr", "V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "value", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "KN", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "", "linePrefix", c.f62177j, "(Ljava/lang/String;)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/Operations;", "Landroidx/compose/runtime/changelist/Operations;", "operations", "pendingOperations", "J2", "()I", "size", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFixupList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FixupList.kt\nandroidx/compose/runtime/changelist/FixupList\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 4 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n+ 5 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n+ 6 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n+ 7 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n1#1,90:1\n4643#2,5:91\n4643#2,5:137\n202#3,4:96\n359#3:111\n356#3:112\n207#3,2:115\n202#3,4:117\n359#3:131\n356#3:132\n207#3,2:135\n202#3,4:142\n207#3,2:148\n679#4:100\n682#4:101\n685#4:114\n370#5,9:102\n379#5:113\n370#5,9:122\n379#5:133\n718#6:121\n721#6:134\n532#7:146\n535#7:147\n*S KotlinDebug\n*F\n+ 1 FixupList.kt\nandroidx/compose/runtime/changelist/FixupList\n*L\n49#1:91,5\n70#1:137,5\n57#1:96,4\n59#1:111\n59#1:112\n57#1:115,2\n63#1:117,4\n64#1:131\n64#1:132\n63#1:135,2\n77#1:142,4\n77#1:148,2\n58#1:100\n59#1:101\n60#1:114\n59#1:102,9\n59#1:113\n64#1:122,9\n64#1:133\n64#1:121\n65#1:134\n78#1:146\n79#1:147\n*E\n"})
public final class FixupList extends OperationsDebugStringFormattable {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Operations operations = new Operations();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Operations pendingOperations = new Operations();

    public final int J2() {
        return this.operations.getOpCodesSize();
    }

    public final void KN(Object value, Function2 block) {
        Operations operations = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.f30517t;
        operations.HI(updateNode);
        Operations operationsN = Operations.WriteScope.n(operations);
        Operations.WriteScope.nr(operationsN, Operation.ObjectParameter.n(0), value);
        int iN = Operation.ObjectParameter.n(1);
        Intrinsics.checkNotNull(block, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Operations.WriteScope.nr(operationsN, iN, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(block, 2));
        operations.J2(updateNode);
    }

    public final void O(Applier applier, SlotWriter slots, RememberManager rememberManager) {
        if (!this.pendingOperations.gh()) {
            ComposerKt.Z("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.operations.Uo(applier, slots, rememberManager);
    }

    public final boolean Uo() {
        return this.operations.gh();
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public String n(String linePrefix) {
        StringBuilder sb = new StringBuilder();
        sb.append("FixupList instance containing " + J2() + " operations");
        if (sb.length() > 0) {
            sb.append(":\n" + this.operations.n(linePrefix));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void nr() {
        if (!this.pendingOperations.qie()) {
            ComposerKt.Z("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.pendingOperations.az(this.operations);
    }

    public final void rl() {
        this.pendingOperations.t();
        this.operations.t();
    }

    public final void t(Function0 factory, int insertIndex, Anchor groupAnchor) {
        Operations operations = this.operations;
        Operation.InsertNodeFixup insertNodeFixup = Operation.InsertNodeFixup.f30496t;
        operations.HI(insertNodeFixup);
        Operations operationsN = Operations.WriteScope.n(operations);
        Operations.WriteScope.nr(operationsN, Operation.ObjectParameter.n(0), factory);
        operationsN.intArgs[operationsN.intArgsSize - operationsN.opCodes[operationsN.opCodesSize - 1].getInts()] = insertIndex;
        Operations.WriteScope.nr(operationsN, Operation.ObjectParameter.n(1), groupAnchor);
        operations.J2(insertNodeFixup);
        Operations operations2 = this.pendingOperations;
        Operation.PostInsertNodeFixup postInsertNodeFixup = Operation.PostInsertNodeFixup.f30502t;
        operations2.HI(postInsertNodeFixup);
        Operations operationsN2 = Operations.WriteScope.n(operations2);
        operationsN2.intArgs[operationsN2.intArgsSize - operationsN2.opCodes[operationsN2.opCodesSize - 1].getInts()] = insertIndex;
        Operations.WriteScope.nr(operationsN2, Operation.ObjectParameter.n(0), groupAnchor);
        operations2.J2(postInsertNodeFixup);
    }
}
