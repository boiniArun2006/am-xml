package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import android.view.View;
import androidx.collection.ArraySet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.node.ModifierNodeElement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.events.a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Be\u0012\\\u0010\u0010\u001aX\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$Rj\u0010\u0010\u001aX\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001f0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00102\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b+\u00101R\u0014\u00105\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;", "Landroid/view/View$OnDragListener;", "Landroidx/compose/ui/draganddrop/DragAndDropManager;", "Lkotlin/Function3;", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "transferData", "Landroidx/compose/ui/geometry/Size;", "decorationSize", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "drawDragDecoration", "", "startDrag", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "Landroidx/compose/ui/draganddrop/DragAndDropNode;", "node", "Landroidx/compose/ui/geometry/Offset;", "offset", "iF", "(Landroidx/compose/ui/draganddrop/DragAndDropNode;J)V", "Landroid/view/View;", "view", "Landroid/view/DragEvent;", a.f62811a, "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "target", "E2", "(Landroidx/compose/ui/draganddrop/DragAndDropTarget;)V", "fD", "(Landroidx/compose/ui/draganddrop/DragAndDropTarget;)Z", c.f62177j, "Lkotlin/jvm/functions/Function3;", "rl", "Landroidx/compose/ui/draganddrop/DragAndDropNode;", "rootDragAndDropNode", "Landroidx/collection/ArraySet;", "t", "Landroidx/collection/ArraySet;", "interestedTargets", "Landroidx/compose/ui/Modifier;", "nr", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "modifier", "te", "()Z", "isRequestDragAndDropTransferRequired", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidDragAndDropManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDragAndDropManager.android.kt\nandroidx/compose/ui/draganddrop/AndroidDragAndDropManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,126:1\n1#2:127\n1855#3,2:128\n*S KotlinDebug\n*F\n+ 1 AndroidDragAndDropManager.android.kt\nandroidx/compose/ui/draganddrop/AndroidDragAndDropManager\n*L\n91#1:128,2\n*E\n"})
public final class AndroidDragAndDropManager implements View.OnDragListener, DragAndDropManager {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function3 startDrag;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final DragAndDropNode rootDragAndDropNode = new DragAndDropNode(null, null, 3, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ArraySet interestedTargets = new ArraySet(0, 1, null);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Modifier modifier = new ModifierNodeElement<DragAndDropNode>() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
        @Override // androidx.compose.ui.node.ModifierNodeElement
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public void rl(DragAndDropNode node) {
        }

        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return this.f31211n.rootDragAndDropNode.hashCode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public DragAndDropNode n() {
            return this.f31211n.rootDragAndDropNode;
        }
    };

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public boolean te() {
        return true;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public void E2(DragAndDropTarget target) {
        this.interestedTargets.add(target);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public boolean fD(DragAndDropTarget target) {
        return this.interestedTargets.contains(target);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public void iF(DragAndDropNode node, long offset) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        node.Vd(new DragAndDropStartTransferScope() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$requestDragAndDropTransfer$dragAndDropSourceScope$1
            @Override // androidx.compose.ui.draganddrop.DragAndDropStartTransferScope
            public boolean n(DragAndDropTransferData transferData, long decorationSize, Function1 drawDragDecoration) {
                booleanRef.element = ((Boolean) this.startDrag.invoke(transferData, Size.t(decorationSize), drawDragDecoration)).booleanValue();
                return booleanRef.element;
            }
        }, offset, new Function0<Boolean>() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$requestDragAndDropTransfer$1$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(booleanRef.element);
            }
        });
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(View view, DragEvent event) {
        DragAndDropEvent dragAndDropEvent = new DragAndDropEvent(event);
        switch (event.getAction()) {
            case 1:
                boolean zUR = this.rootDragAndDropNode.UR(dragAndDropEvent);
                Iterator<E> it = this.interestedTargets.iterator();
                while (it.hasNext()) {
                    ((DragAndDropTarget) it.next()).I(dragAndDropEvent);
                }
                break;
            case 2:
                this.rootDragAndDropNode.GR(dragAndDropEvent);
                break;
            case 4:
                this.rootDragAndDropNode.Om(dragAndDropEvent);
                this.interestedTargets.clear();
                break;
            case 5:
                this.rootDragAndDropNode.i(dragAndDropEvent);
                break;
            case 6:
                this.rootDragAndDropNode.xg(dragAndDropEvent);
                break;
        }
        return false;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public Modifier getModifier() {
        return this.modifier;
    }

    public AndroidDragAndDropManager(Function3 function3) {
        this.startDrag = function3;
    }
}
