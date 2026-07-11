package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SlotWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000f*\f\b\u0000\u0010\u0010\"\u00020\u00052\u00020\u0005¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/Applier;", "", "applier", "", "index", "", "O", "(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Applier;I)V", "t", "(Landroidx/compose/runtime/SlotWriter;)I", "Landroidx/compose/runtime/Anchor;", "anchor", "nr", "(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/Applier;)I", "IntParameter", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/OperationKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1057:1\n4665#2:1058\n4643#2,5:1059\n4665#2:1064\n4643#2,5:1065\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/OperationKt\n*L\n1038#1:1058\n1038#1:1059,5\n1054#1:1064\n1054#1:1065,5\n*E\n"})
public final class OperationKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(SlotWriter slotWriter, Applier applier, int i2) {
        while (!slotWriter.pJg(i2)) {
            slotWriter.Bu();
            if (slotWriter.fcU(slotWriter.getParent())) {
                applier.gh();
            }
            slotWriter.M7();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nr(SlotWriter slotWriter, Anchor anchor, Applier applier) {
        boolean z2;
        int iE2 = slotWriter.E2(anchor);
        boolean z3 = true;
        if (slotWriter.getCurrentGroup() < iE2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            ComposerKt.Z("Check failed");
        }
        O(slotWriter, applier, iE2);
        int iT = t(slotWriter);
        while (slotWriter.getCurrentGroup() < iE2) {
            if (slotWriter.eTf(iE2)) {
                if (slotWriter.G7()) {
                    applier.KN(slotWriter.GD(slotWriter.getCurrentGroup()));
                    iT = 0;
                }
                slotWriter.JVN();
            } else {
                iT += slotWriter.T3L();
            }
        }
        if (slotWriter.getCurrentGroup() != iE2) {
            z3 = false;
        }
        if (!z3) {
            ComposerKt.Z("Check failed");
        }
        return iT;
    }

    private static final int t(SlotWriter slotWriter) {
        int iEWS;
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.fcU(parent)) {
            parent = slotWriter.UhV(parent);
        }
        int iM = parent + 1;
        int i2 = 0;
        while (iM < currentGroup) {
            if (slotWriter.xg(currentGroup, iM)) {
                if (slotWriter.fcU(iM)) {
                    i2 = 0;
                }
                iM++;
            } else {
                if (slotWriter.fcU(iM)) {
                    iEWS = 1;
                } else {
                    iEWS = slotWriter.EWS(iM);
                }
                i2 += iEWS;
                iM += slotWriter.m(iM);
            }
        }
        return i2;
    }
}
