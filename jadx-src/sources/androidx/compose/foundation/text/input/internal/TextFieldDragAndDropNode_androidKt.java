package androidx.compose.foundation.text.input.internal;

import android.content.ClipDescription;
import android.view.DragEvent;
import androidx.compose.foundation.content.MediaType;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.events.a;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aÙ\u0002\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u000026\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2%\b\u0002\u0010\u0012\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2%\b\u0002\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2%\b\u0002\u0010\u0017\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2%\b\u0002\u0010\u0019\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH\u0000¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/foundation/content/MediaType;", "hintMediaTypes", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/ClipEntry;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "clipEntry", "Landroidx/compose/ui/platform/ClipMetadata;", "clipMetadata", "", "onDrop", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "", "dragAndDropRequestPermission", a.f62811a, "onStarted", "onEntered", "Landroidx/compose/ui/geometry/Offset;", "position", "onMoved", "onChanged", "onExited", "onEnded", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextFieldDragAndDropNode_androidKt {
    public static final DragAndDropTargetModifierNode n(final Function0 function0, final Function2 function2, final Function1 function1, final Function1 function12, final Function1 function13, final Function1 function14, final Function1 function15, final Function1 function16, final Function1 function17) {
        return DragAndDropNodeKt.t(new Function1<DragAndDropEvent, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(DragAndDropEvent dragAndDropEvent) {
                ClipDescription clipDescription = DragAndDrop_androidKt.rl(dragAndDropEvent).getClipDescription();
                Iterable<MediaType> iterable = (Iterable) function0.invoke();
                boolean z2 = false;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (MediaType mediaType : iterable) {
                        if (Intrinsics.areEqual(mediaType, MediaType.INSTANCE.n()) || clipDescription.hasMimeType(mediaType.getRepresentation())) {
                            z2 = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            }
        }, new DragAndDropTarget() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$2
            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void I(DragAndDropEvent event) {
                Function1 function18 = function12;
                if (function18 != null) {
                    function18.invoke(event);
                    Unit unit = Unit.INSTANCE;
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void Om(DragAndDropEvent event) {
                Function1 function18 = function17;
                if (function18 != null) {
                    function18.invoke(event);
                    Unit unit = Unit.INSTANCE;
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public boolean f(DragAndDropEvent event) {
                function1.invoke(event);
                return ((Boolean) function2.invoke(AndroidClipboardManager_androidKt.n(DragAndDrop_androidKt.rl(event).getClipData()), AndroidClipboardManager_androidKt.rl(DragAndDrop_androidKt.rl(event).getClipDescription()))).booleanValue();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void i(DragAndDropEvent event) {
                Function1 function18 = function13;
                if (function18 != null) {
                    function18.invoke(event);
                    Unit unit = Unit.INSTANCE;
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void xg(DragAndDropEvent event) {
                Function1 function18 = function16;
                if (function18 != null) {
                    function18.invoke(event);
                    Unit unit = Unit.INSTANCE;
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void GR(DragAndDropEvent event) {
                DragEvent dragEventRl = DragAndDrop_androidKt.rl(event);
                Function1 function18 = function14;
                if (function18 != null) {
                    float x2 = dragEventRl.getX();
                    float y2 = dragEventRl.getY();
                    function18.invoke(Offset.nr(Offset.O((((long) Float.floatToRawIntBits(x2)) << 32) | (((long) Float.floatToRawIntBits(y2)) & 4294967295L))));
                    Unit unit = Unit.INSTANCE;
                }
            }
        });
    }

    public static /* synthetic */ DragAndDropTargetModifierNode rl(Function0 function0, Function2 function2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            function12 = null;
        }
        if ((i2 & 16) != 0) {
            function13 = null;
        }
        if ((i2 & 32) != 0) {
            function14 = null;
        }
        if ((i2 & 64) != 0) {
            function15 = null;
        }
        if ((i2 & 128) != 0) {
            function16 = null;
        }
        if ((i2 & 256) != 0) {
            function17 = null;
        }
        return n(function0, function2, function1, function12, function13, function14, function15, function16, function17);
    }
}
