package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.collection.ExtensionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00000\u000b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/MovableContentState;", "", "Landroidx/compose/runtime/SlotTable;", "slotTable", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/collection/ObjectList;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "Landroidx/collection/ScatterMap;", "t", "(Landroidx/compose/runtime/Applier;Landroidx/collection/ObjectList;)Landroidx/collection/ScatterMap;", c.f62177j, "Landroidx/compose/runtime/SlotTable;", "nr", "()Landroidx/compose/runtime/SlotTable;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InternalComposeApi
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/MovableContentState\n+ 2 Extensions.kt\nandroidx/compose/runtime/collection/ExtensionsKt\n+ 3 ObjectList.kt\nandroidx/collection/ObjectList\n+ 4 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,4891:1\n29#2,8:4892\n37#2:4906\n287#3,6:4900\n287#3,6:4913\n919#4,2:4907\n174#5,4:4909\n179#5,3:4920\n1#6:4919\n4643#7,5:4923\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/MovableContentState\n*L\n422#1:4892,8\n422#1:4906\n422#1:4900,6\n445#1:4913,6\n422#1:4907,2\n426#1:4909,4\n426#1:4920,3\n426#1:4919\n442#1:4923,5\n*E\n"})
public final class MovableContentState {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SlotTable slotTable;

    public final ScatterMap t(Applier applier, ObjectList references) {
        Object[] objArr = references.content;
        int i2 = references._size;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            if (this.slotTable.te(((MovableContentStateReference) objArr[i3]).getAnchor())) {
                i3++;
            } else {
                MutableObjectList mutableObjectList = new MutableObjectList(0, 1, null);
                Object[] objArr2 = references.content;
                int i5 = references._size;
                for (int i7 = 0; i7 < i5; i7++) {
                    Object obj = objArr2[i7];
                    if (this.slotTable.te(((MovableContentStateReference) obj).getAnchor())) {
                        mutableObjectList.ty(obj);
                    }
                }
                references = mutableObjectList;
            }
        }
        ObjectList objectListNr = ExtensionsKt.nr(references, new Function1<MovableContentStateReference, Integer>() { // from class: androidx.compose.runtime.MovableContentState$extractNestedStates$referencesToExtract$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(MovableContentStateReference movableContentStateReference) {
                return Integer.valueOf(this.f30226n.getSlotTable().xMQ(movableContentStateReference.getAnchor()));
            }
        });
        if (objectListNr.Uo()) {
            return ScatterMapKt.n();
        }
        MutableScatterMap mutableScatterMapT = ScatterMapKt.t();
        SlotWriter slotWriterG = this.slotTable.g();
        try {
            Object[] objArr3 = objectListNr.content;
            int i8 = objectListNr._size;
            for (int i9 = 0; i9 < i8; i9++) {
                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr3[i9];
                int iE2 = slotWriterG.E2(movableContentStateReference.getAnchor());
                int iUhV = slotWriterG.UhV(iE2);
                n(slotWriterG, iUhV);
                rl(slotWriterG, iUhV);
                slotWriterG.iF(iE2 - slotWriterG.getCurrentGroup());
                mutableScatterMapT.aYN(movableContentStateReference, ComposerKt.aYN(movableContentStateReference.getComposition(), movableContentStateReference, slotWriterG, applier));
            }
            n(slotWriterG, Integer.MAX_VALUE);
            Unit unit = Unit.INSTANCE;
            slotWriterG.wTp(true);
            return mutableScatterMapT;
        } catch (Throwable th) {
            slotWriterG.wTp(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }

    public MovableContentState(SlotTable slotTable) {
        this.slotTable = slotTable;
    }

    private static final void n(SlotWriter slotWriter, int i2) {
        while (slotWriter.getParent() >= 0 && slotWriter.getCurrentGroupEnd() <= i2) {
            slotWriter.Bu();
            slotWriter.M7();
        }
    }

    private static final void rl(SlotWriter slotWriter, int i2) {
        boolean z2;
        n(slotWriter, i2);
        while (slotWriter.getCurrentGroup() != i2 && !slotWriter.Mx()) {
            if (i2 < ComposerKt.e(slotWriter)) {
                slotWriter.JVN();
            } else {
                slotWriter.T3L();
            }
        }
        if (slotWriter.getCurrentGroup() == i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            ComposerKt.Z("Unexpected slot table structure");
        }
        slotWriter.JVN();
    }
}
