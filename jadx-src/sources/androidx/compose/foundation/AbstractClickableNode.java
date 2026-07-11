package androidx.compose.foundation;

import GJW.C;
import GJW.Lu;
import android.view.KeyEvent;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.Focusability;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.events.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\t\b \u0018\u0000 z2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001{BE\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u001bJ\u0014\u0010 \u001a\u00020\u0011*\u00020\u001fH¦@¢\u0006\u0004\b \u0010!J\u0013\u0010#\u001a\u00020\u0011*\u00020\"H\u0016¢\u0006\u0004\b#\u0010$JP\u0010%\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0004ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0011¢\u0006\u0004\b'\u0010\u001bJ\r\u0010(\u001a\u00020\u0011¢\u0006\u0004\b(\u0010\u001bJ\u000f\u0010)\u001a\u00020\u0011H\u0004¢\u0006\u0004\b)\u0010\u001bJ(\u00100\u001a\u00020\u00112\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.ø\u0001\u0000¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0011¢\u0006\u0004\b2\u0010\u001bJ\u0018\u00105\u001a\u00020\n2\u0006\u00104\u001a\u000203ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u001a\u00107\u001a\u00020\n2\u0006\u00104\u001a\u000203H$ø\u0001\u0000¢\u0006\u0004\b7\u00106J\u001a\u00108\u001a\u00020\n2\u0006\u00104\u001a\u000203H$ø\u0001\u0000¢\u0006\u0004\b8\u00106J\u000f\u00109\u001a\u00020\u0011H\u0014¢\u0006\u0004\b9\u0010\u001bJ\u0018\u0010:\u001a\u00020\n2\u0006\u00104\u001a\u000203ø\u0001\u0000¢\u0006\u0004\b:\u00106J\u0011\u0010;\u001a\u00020\u0011*\u00020\"¢\u0006\u0004\b;\u0010$J\u0011\u0010<\u001a\u0004\u0018\u00010\u0011H\u0004¢\u0006\u0004\b<\u0010=J\u001f\u0010A\u001a\u00020\u0011*\u00020>2\u0006\u0010@\u001a\u00020?H\u0084@ø\u0001\u0000¢\u0006\u0004\bA\u0010BR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bI\u0010JR$\u0010\u000b\u001a\u00020\n2\u0006\u0010K\u001a\u00020\n8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010\u0016R0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010U\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\bS\u0010M\u001a\u0004\bT\u0010\u0016R\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010\\\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010[R\u0018\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010d\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010h\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020a0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u001c\u0010n\u001a\u00020?8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bm\u0010bR\u0018\u0010p\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010DR\u0016\u0010r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010MR\u001a\u0010w\u001a\u00020s8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bq\u0010vR\u0011\u0010y\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bx\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006|"}, d2 = {"Landroidx/compose/foundation/AbstractClickableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/IndicationNodeFactory;", "indicationNodeFactory", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "", "onClick", "<init>", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "hu", "()Z", "isFocused", "H6M", "(Z)V", "cAB", "()V", "eOa", "VK2", "R3E", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "kC", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "jE", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "ENe", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)V", "c", "Sax", "i7", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "C", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "lNy", "Landroidx/compose/ui/input/key/KeyEvent;", a.f62811a, "jO", "(Landroid/view/KeyEvent;)Z", "yUZ", "Bha", "kR", "ub", "FX", "YE", "()Lkotlin/Unit;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", "offset", "f11", "(Landroidx/compose/foundation/gestures/PressGestureScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jB", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "U", "Landroidx/compose/foundation/IndicationNodeFactory;", "P5", "Ljava/lang/String;", "M7", "Landroidx/compose/ui/semantics/Role;", "<set-?>", "p5", "Z", "Yq", "eF", "Lkotlin/jvm/functions/Function0;", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "()Lkotlin/jvm/functions/Function0;", "E", "lRt", "shouldAutoInvalidate", "Landroidx/compose/foundation/FocusableNode;", "M", "Landroidx/compose/foundation/FocusableNode;", "focusableNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "pointerInputNode", "Landroidx/compose/ui/node/DelegatableNode;", "B", "Landroidx/compose/ui/node/DelegatableNode;", "indicationNode", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "J", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "pressInteraction", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "D", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "hoverInteraction", "Landroidx/collection/MutableLongObjectMap;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "Landroidx/collection/MutableLongObjectMap;", "currentKeyPressInteractions", "I", "centerOffset", "GR", "userProvidedInteractionSource", "Nxk", "lazilyCreateIndication", "", "Y", "Ljava/lang/Object;", "()Ljava/lang/Object;", "traverseKey", "L", "shouldMergeDescendantSemantics", "k", "TraverseKey", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/AbstractClickableNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LongObjectMap.kt\nandroidx/collection/LongObjectMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1327:1\n1#2:1328\n397#3,3:1329\n354#3,6:1332\n364#3,3:1339\n367#3,9:1343\n400#3:1352\n397#3,3:1353\n354#3,6:1356\n364#3,3:1363\n367#3,9:1367\n400#3:1376\n1399#4:1338\n1270#4:1342\n1399#4:1362\n1270#4:1366\n159#5:1377\n30#6:1378\n53#7,3:1379\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/AbstractClickableNode\n*L\n1102#1:1329,3\n1102#1:1332,6\n1102#1:1339,3\n1102#1:1343,9\n1102#1:1352\n1118#1:1353,3\n1118#1:1356,6\n1118#1:1363,3\n1118#1:1367,9\n1118#1:1376\n1102#1:1338\n1102#1:1342\n1118#1:1362\n1118#1:1366\n1146#1:1377\n1146#1:1378\n1146#1:1379,3\n*E\n"})
public abstract class AbstractClickableNode extends DelegatingNode implements PointerInputModifierNode, KeyInputModifierNode, SemanticsModifierNode, TraversableNode {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private DelegatableNode indicationNode;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private HoverInteraction.Enter hoverInteraction;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private SuspendingPointerInputModifierNode pointerInputNode;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private MutableInteractionSource userProvidedInteractionSource;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private long centerOffset;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private PressInteraction.Press pressInteraction;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final FocusableNode focusableNode;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private Role role;

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    private boolean lazilyCreateIndication;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private String onClickLabel;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private IndicationNodeFactory indicationNodeFactory;

    /* JADX INFO: renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private final Object traverseKey;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final MutableLongObjectMap currentKeyPressInteractions;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private Function0 onClick;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private MutableInteractionSource interactionSource;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int dR0 = 8;

    /* JADX INFO: renamed from: androidx.compose.foundation.AbstractClickableNode$TraverseKey, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/AbstractClickableNode$TraverseKey;", "", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ AbstractClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, String str, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, indicationNodeFactory, z2, str, role, function0);
    }

    protected abstract boolean Bha(KeyEvent event);

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* JADX INFO: renamed from: L */
    public final boolean getMergeDescendants() {
        return true;
    }

    public void jE(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    public abstract Object kC(PointerInputScope pointerInputScope, Continuation continuation);

    protected void kR() {
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    public final boolean ub(KeyEvent event) {
        return false;
    }

    protected abstract boolean yUZ(KeyEvent event);

    private AbstractClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, String str, Role role, Function0 function0) {
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.onClickLabel = str;
        this.role = role;
        this.enabled = z2;
        this.onClick = function0;
        this.focusableNode = new FocusableNode(this.interactionSource, Focusability.INSTANCE.t(), new AbstractClickableNode$focusableNode$1(this), null);
        this.currentKeyPressInteractions = LongObjectMapKt.t();
        this.centerOffset = Offset.INSTANCE.t();
        this.userProvidedInteractionSource = this.interactionSource;
        this.lazilyCreateIndication = hu();
        this.traverseKey = INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H6M(boolean isFocused) {
        if (isFocused) {
            cAB();
            return;
        }
        if (this.interactionSource != null) {
            MutableLongObjectMap mutableLongObjectMap = this.currentKeyPressInteractions;
            Object[] objArr = mutableLongObjectMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
            long[] jArr = mutableLongObjectMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i5 = 0; i5 < i3; i5++) {
                            if ((255 & j2) < 128) {
                                C.nr(Xli(), null, null, new AbstractClickableNode$onFocusChange$1$1(this, (PressInteraction.Press) objArr[(i2 << 3) + i5], null), 3, null);
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        this.currentKeyPressInteractions.Uo();
        kR();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R3E() {
        HoverInteraction.Enter enter = this.hoverInteraction;
        if (enter != null) {
            HoverInteraction.Exit exit = new HoverInteraction.Exit(enter);
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                C.nr(Xli(), null, null, new AbstractClickableNode$emitHoverExit$1$1$1(mutableInteractionSource, exit, null), 3, null);
            }
            this.hoverInteraction = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void VK2() {
        if (this.hoverInteraction == null) {
            HoverInteraction.Enter enter = new HoverInteraction.Enter();
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                C.nr(Xli(), null, null, new AbstractClickableNode$emitHoverEnter$1$1(mutableInteractionSource, enter, null), 3, null);
            }
            this.hoverInteraction = enter;
        }
    }

    private final void cAB() {
        IndicationNodeFactory indicationNodeFactory;
        if (this.indicationNode == null && (indicationNodeFactory = this.indicationNodeFactory) != null) {
            if (this.interactionSource == null) {
                this.interactionSource = InteractionSourceKt.n();
            }
            this.focusableNode.eOa(this.interactionSource);
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            Intrinsics.checkNotNull(mutableInteractionSource);
            DelegatableNode delegatableNodeRl = indicationNodeFactory.rl(mutableInteractionSource);
            UR(delegatableNodeRl);
            this.indicationNode = delegatableNodeRl;
        }
    }

    private final boolean hu() {
        return this.userProvidedInteractionSource == null && this.indicationNodeFactory != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void ENe(MutableInteractionSource interactionSource, IndicationNodeFactory indicationNodeFactory, boolean enabled, String onClickLabel, Role role, Function0 onClick) {
        boolean z2;
        boolean z3;
        DelegatableNode delegatableNode;
        if (Intrinsics.areEqual(this.userProvidedInteractionSource, interactionSource)) {
            z2 = false;
        } else {
            i7();
            this.userProvidedInteractionSource = interactionSource;
            this.interactionSource = interactionSource;
            z2 = true;
        }
        if (!Intrinsics.areEqual(this.indicationNodeFactory, indicationNodeFactory)) {
            this.indicationNodeFactory = indicationNodeFactory;
            z2 = true;
        }
        if (this.enabled != enabled) {
            if (enabled) {
                UR(this.focusableNode);
            } else {
                ex(this.focusableNode);
                i7();
            }
            SemanticsModifierNodeKt.rl(this);
            this.enabled = enabled;
        }
        if (!Intrinsics.areEqual(this.onClickLabel, onClickLabel)) {
            this.onClickLabel = onClickLabel;
            SemanticsModifierNodeKt.rl(this);
        }
        if (!Intrinsics.areEqual(this.role, role)) {
            this.role = role;
            SemanticsModifierNodeKt.rl(this);
        }
        this.onClick = onClick;
        if (this.lazilyCreateIndication != hu()) {
            boolean zHu = hu();
            this.lazilyCreateIndication = zHu;
            z3 = (zHu || this.indicationNode != null) ? z2 : true;
        }
        if (z3 && ((delegatableNode = this.indicationNode) != null || !this.lazilyCreateIndication)) {
            if (delegatableNode != null) {
                ex(delegatableNode);
            }
            this.indicationNode = null;
            cAB();
        }
        this.focusableNode.eOa(this.interactionSource);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void FX(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Role role = this.role;
        if (role != null) {
            Intrinsics.checkNotNull(role);
            SemanticsPropertiesKt.C(semanticsPropertyReceiver, role.getValue());
        }
        SemanticsPropertiesKt.g(semanticsPropertyReceiver, this.onClickLabel, new Function0<Boolean>() { // from class: androidx.compose.foundation.AbstractClickableNode$applySemantics$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.f15792n.getOnClick().invoke();
                return Boolean.TRUE;
            }
        });
        if (this.enabled) {
            this.focusableNode.FX(semanticsPropertyReceiver);
        } else {
            SemanticsPropertiesKt.qie(semanticsPropertyReceiver);
        }
        jE(semanticsPropertyReceiver);
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    protected final Function0 getOnClick() {
        return this.onClick;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    /* JADX INFO: renamed from: Nxk, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    protected final Unit YE() {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode == null) {
            return null;
        }
        suspendingPointerInputModifierNode.p0N();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Yq, reason: from getter */
    protected final boolean getEnabled() {
        return this.enabled;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void c() {
        if (!this.lazilyCreateIndication) {
            cAB();
        }
        if (this.enabled) {
            UR(this.focusableNode);
        }
    }

    protected final Object f11(PressGestureScope pressGestureScope, long j2, Continuation continuation) {
        Object objJ2;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        return (mutableInteractionSource == null || (objJ2 = Lu.J2(new AbstractClickableNode$handlePressInteraction$2$1(pressGestureScope, j2, mutableInteractionSource, this, null), continuation)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : objJ2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void i7() {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            PressInteraction.Press press = this.pressInteraction;
            if (press != null) {
                mutableInteractionSource.rl(new PressInteraction.Cancel(press));
            }
            HoverInteraction.Enter enter = this.hoverInteraction;
            if (enter != null) {
                mutableInteractionSource.rl(new HoverInteraction.Exit(enter));
            }
            MutableLongObjectMap mutableLongObjectMap = this.currentKeyPressInteractions;
            Object[] objArr = mutableLongObjectMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
            long[] jArr = mutableLongObjectMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i5 = 0; i5 < i3; i5++) {
                            if ((255 & j2) < 128) {
                                mutableInteractionSource.rl(new PressInteraction.Cancel((PressInteraction.Press) objArr[(i2 << 3) + i5]));
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        this.pressInteraction = null;
        this.hoverInteraction = null;
        this.currentKeyPressInteractions.Uo();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void lNy() {
        HoverInteraction.Enter enter;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null && (enter = this.hoverInteraction) != null) {
            mutableInteractionSource.rl(new HoverInteraction.Exit(enter));
        }
        this.hoverInteraction = null;
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.lNy();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: lRt, reason: from getter */
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean eOa() {
        if (!ClickableKt.gh(this) && !Clickable_androidKt.rl(this)) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void C(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        long jRl = IntSizeKt.rl(bounds);
        this.centerOffset = Offset.O((((long) Float.floatToRawIntBits(IntOffset.gh(jRl))) << 32) | (((long) Float.floatToRawIntBits(IntOffset.qie(jRl))) & 4294967295L));
        cAB();
        if (this.enabled && pass == PointerEventPass.f32080t) {
            int type = pointerEvent.getType();
            PointerEventType.Companion companion = PointerEventType.INSTANCE;
            if (PointerEventType.mUb(type, companion.n())) {
                C.nr(Xli(), null, null, new AbstractClickableNode$onPointerEvent$1(this, null), 3, null);
            } else if (PointerEventType.mUb(type, companion.rl())) {
                C.nr(Xli(), null, null, new AbstractClickableNode$onPointerEvent$2(this, null), 3, null);
            }
        }
        if (this.pointerInputNode == null) {
            this.pointerInputNode = (SuspendingPointerInputModifierNode) UR(SuspendingPointerInputFilterKt.n(new PointerInputEventHandler() { // from class: androidx.compose.foundation.AbstractClickableNode$onPointerEvent$3
                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                    Object objKC = this.f15822n.kC(pointerInputScope, continuation);
                    return objKC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objKC : Unit.INSTANCE;
                }
            }));
        }
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.C(pointerEvent, pass, bounds);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void Sax() {
        i7();
        if (this.userProvidedInteractionSource == null) {
            this.interactionSource = null;
        }
        DelegatableNode delegatableNode = this.indicationNode;
        if (delegatableNode != null) {
            ex(delegatableNode);
        }
        this.indicationNode = null;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    public final boolean jO(KeyEvent event) {
        boolean z2;
        cAB();
        long jN = KeyEvent_androidKt.n(event);
        if (this.enabled && ClickableKt.ty(event)) {
            if (!this.currentKeyPressInteractions.n(jN)) {
                PressInteraction.Press press = new PressInteraction.Press(this.centerOffset, null);
                this.currentKeyPressInteractions.r(jN, press);
                if (this.interactionSource != null) {
                    C.nr(Xli(), null, null, new AbstractClickableNode$onKeyEvent$1(this, press, null), 3, null);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            if (yUZ(event) || z2) {
                return true;
            }
            return false;
        }
        if (this.enabled && ClickableKt.qie(event)) {
            PressInteraction.Press press2 = (PressInteraction.Press) this.currentKeyPressInteractions.HI(jN);
            if (press2 != null) {
                if (this.interactionSource != null) {
                    C.nr(Xli(), null, null, new AbstractClickableNode$onKeyEvent$2(this, press2, null), 3, null);
                }
                Bha(event);
            }
            if (press2 != null) {
                return true;
            }
        }
        return false;
    }
}
