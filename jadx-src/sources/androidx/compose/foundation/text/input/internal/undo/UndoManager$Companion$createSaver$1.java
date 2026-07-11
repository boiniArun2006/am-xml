package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001J!\u0010\u0006\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/compose/foundation/text/input/internal/undo/UndoManager$Companion$createSaver$1", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/input/internal/undo/UndoManager;", "", "Landroidx/compose/runtime/saveable/SaverScope;", "value", "nr", "(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/compose/foundation/text/input/internal/undo/UndoManager;)Ljava/lang/Object;", "t", "(Ljava/lang/Object;)Landroidx/compose/foundation/text/input/internal/undo/UndoManager;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion$createSaver$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,162:1\n34#2,4:163\n39#2:168\n34#2,6:169\n1#3:167\n*S KotlinDebug\n*F\n+ 1 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion$createSaver$1\n*L\n136#1:163,4\n136#1:168\n137#1:169,6\n*E\n"})
public final class UndoManager$Companion$createSaver$1 implements Saver<UndoManager<Object>, Object> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Saver f20595n;

    @Override // androidx.compose.runtime.saveable.Saver
    /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
    public Object n(SaverScope saverScope, UndoManager undoManager) {
        Saver saver = this.f20595n;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(Integer.valueOf(undoManager.capacity));
        listCreateListBuilder.add(Integer.valueOf(undoManager.undoStack.size()));
        listCreateListBuilder.add(Integer.valueOf(undoManager.redoStack.size()));
        SnapshotStateList snapshotStateList = undoManager.undoStack;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            listCreateListBuilder.add(saver.n(saverScope, snapshotStateList.get(i2)));
        }
        SnapshotStateList snapshotStateList2 = undoManager.redoStack;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            listCreateListBuilder.add(saver.n(saverScope, snapshotStateList2.get(i3)));
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    @Override // androidx.compose.runtime.saveable.Saver
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public UndoManager rl(Object value) {
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) value;
        int iIntValue = ((Number) list.get(0)).intValue();
        int iIntValue2 = ((Number) list.get(1)).intValue();
        int iIntValue3 = ((Number) list.get(2)).intValue();
        Saver saver = this.f20595n;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        int i2 = 3;
        while (i2 < iIntValue2 + 3) {
            Object objRl = saver.rl(list.get(i2));
            Intrinsics.checkNotNull(objRl);
            listCreateListBuilder.add(objRl);
            i2++;
        }
        List listBuild = CollectionsKt.build(listCreateListBuilder);
        Saver saver2 = this.f20595n;
        List listCreateListBuilder2 = CollectionsKt.createListBuilder();
        while (i2 < iIntValue2 + iIntValue3 + 3) {
            Object objRl2 = saver2.rl(list.get(i2));
            Intrinsics.checkNotNull(objRl2);
            listCreateListBuilder2.add(objRl2);
            i2++;
        }
        return new UndoManager(listBuild, CollectionsKt.build(listCreateListBuilder2), iIntValue);
    }
}
