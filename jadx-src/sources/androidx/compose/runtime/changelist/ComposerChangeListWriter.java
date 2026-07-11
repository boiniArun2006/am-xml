package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.caoccao.javet.exceptions.JavetError;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0002\u009c\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010\nJ\u0015\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0018¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0018¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010\nJ\u0015\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\b2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b0\u0010/J\u0015\u00101\u001a\u00020\b2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b1\u0010/J\u001f\u00103\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u00012\u0006\u00102\u001a\u00020\u0018¢\u0006\u0004\b3\u00104J'\u00105\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u0018¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b9\u0010%J\r\u0010:\u001a\u00020\b¢\u0006\u0004\b:\u0010\nJ\u0017\u0010<\u001a\u00020\b2\b\u0010;\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\b¢\u0006\u0004\b>\u0010\nJ\r\u0010?\u001a\u00020\b¢\u0006\u0004\b?\u0010\nJ\r\u0010@\u001a\u00020\b¢\u0006\u0004\b@\u0010\nJ\r\u0010A\u001a\u00020\b¢\u0006\u0004\bA\u0010\nJ\u001d\u0010C\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020B¢\u0006\u0004\bC\u0010DJ%\u0010G\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020B2\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u00020\b2\u0006\u0010I\u001a\u00020\u0018¢\u0006\u0004\bJ\u0010%J)\u0010O\u001a\u00020\b2\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\b0K2\u0006\u0010N\u001a\u00020L¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\b2\b\u0010Q\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bR\u0010=J@\u0010W\u001a\u00020\b\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010S2\u0006\u0010)\u001a\u00028\u00012\u001d\u0010V\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0T¢\u0006\u0002\bU¢\u0006\u0004\bW\u0010XJ\u001d\u0010Z\u001a\u00020\b2\u0006\u0010Y\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\bZ\u0010\u001cJ%\u0010[\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b[\u0010!J\r\u0010\\\u001a\u00020\b¢\u0006\u0004\b\\\u0010\nJ\r\u0010]\u001a\u00020\b¢\u0006\u0004\b]\u0010\nJ\u001d\u0010_\u001a\u00020\b2\u0006\u0010Y\u001a\u00020\u00182\u0006\u0010^\u001a\u00020\u0018¢\u0006\u0004\b_\u0010\u001cJ\r\u0010`\u001a\u00020\b¢\u0006\u0004\b`\u0010\nJ\u0017\u0010a\u001a\u00020\b2\b\u0010Q\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\ba\u0010=J\u001b\u0010d\u001a\u00020\b2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020\b0b¢\u0006\u0004\bd\u0010eJ\u001d\u0010h\u001a\u00020\b2\u0006\u0010g\u001a\u00020f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\bh\u0010iJ%\u0010m\u001a\u00020\b2\u000e\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010j2\u0006\u0010l\u001a\u00020f¢\u0006\u0004\bm\u0010nJ/\u0010t\u001a\u00020\b2\b\u0010p\u001a\u0004\u0018\u00010o2\u0006\u0010r\u001a\u00020q2\u0006\u0010\u001e\u001a\u00020s2\u0006\u0010\u001d\u001a\u00020s¢\u0006\u0004\bt\u0010uJ%\u0010x\u001a\u00020\b2\u0006\u0010N\u001a\u00020v2\u0006\u0010r\u001a\u00020q2\u0006\u0010w\u001a\u00020s¢\u0006\u0004\bx\u0010yJ\r\u0010z\u001a\u00020\b¢\u0006\u0004\bz\u0010\nJ!\u0010|\u001a\u00020\b2\u0006\u0010{\u001a\u00020\u00042\n\b\u0002\u0010l\u001a\u0004\u0018\u00010f¢\u0006\u0004\b|\u0010}J\r\u0010~\u001a\u00020\b¢\u0006\u0004\b~\u0010\nJ\r\u0010\u007f\u001a\u00020\b¢\u0006\u0004\b\u007f\u0010\nJ\u000f\u0010\u0080\u0001\u001a\u00020\b¢\u0006\u0005\b\u0080\u0001\u0010\nR\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b7\u0010\u0081\u0001R'\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bm\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0017\u0010\u0087\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010|R\u0018\u0010\u008a\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0089\u0001R&\u0010\u008e\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\bh\u0010|\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0005\b\u008d\u0001\u0010\u000fR\u0017\u0010\u008f\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010WR\u0017\u0010\u0090\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010WR'\u0010\u0093\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0091\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\bz\u0010\u0092\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010WR\u0017\u0010\u0094\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010WR\u0017\u0010\u0095\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010WR\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010WR\u0018\u0010\u0099\u0001\u001a\u00030\u0096\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0014\u0010\u009b\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u008c\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009d\u0001"}, d2 = {"Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "", "Landroidx/compose/runtime/ComposerImpl;", "composer", "Landroidx/compose/runtime/changelist/ChangeList;", "changeList", "<init>", "(Landroidx/compose/runtime/ComposerImpl;Landroidx/compose/runtime/changelist/ChangeList;)V", "", "iF", "()V", "E2", "", "useParentSlot", "e", "(Z)V", "ty", "Landroidx/compose/runtime/Anchor;", "anchor", "az", "(Landroidx/compose/runtime/Anchor;)V", "forParent", "nHg", "N", "", "removeFrom", "moveCount", "wTp", "(II)V", "to", "from", JavetError.PARAMETER_COUNT, RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(III)V", "fD", "location", "nY", "(I)V", "g", "v", "Landroidx/compose/runtime/RememberObserverHolder;", "value", "Xw", "(Landroidx/compose/runtime/RememberObserverHolder;)V", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "jB", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "B", "gh", "groupSlotIndex", "GR", "(Ljava/lang/Object;I)V", "D", "(Ljava/lang/Object;Landroidx/compose/runtime/Anchor;I)V", c.f62177j, "(Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)V", "J", "M7", "data", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)V", "qie", "Uo", "FX", "U", "Landroidx/compose/runtime/SlotTable;", "XQ", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;)V", "Landroidx/compose/runtime/changelist/FixupList;", "fixups", "S", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/changelist/FixupList;)V", "offset", "WPU", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", FileUploadManager.f61572j, "composition", "J2", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composition;)V", "node", "Nxk", "V", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "I", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "nodeIndex", "P5", "ViF", "rV9", "xMQ", "group", "mUb", "te", "aYN", "Lkotlin/Function0;", "effect", "M", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/internal/IntRef;", "effectiveNodeIndexOut", "O", "(Landroidx/compose/runtime/internal/IntRef;Landroidx/compose/runtime/Anchor;)V", "", "nodes", "effectiveNodeIndex", "rl", "(Ljava/util/List;Landroidx/compose/runtime/internal/IntRef;)V", "Landroidx/compose/runtime/MovableContentState;", "resolvedState", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/runtime/MovableContentStateReference;", "t", "(Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentStateReference;)V", "Landroidx/compose/runtime/ControlledComposition;", "reference", "bzg", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;)V", "KN", InneractiveMediationNameConsts.OTHER, "Z", "(Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/internal/IntRef;)V", "HI", "p5", "nr", "Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/changelist/ChangeList;", "ck", "()Landroidx/compose/runtime/changelist/ChangeList;", "eF", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "startedGroup", "Landroidx/compose/runtime/IntStack;", "Landroidx/compose/runtime/IntStack;", "startedGroups", "Ik", "()Z", "E", "implicitRootStart", "writersReaderDelta", "pendingUps", "Landroidx/compose/runtime/Stack;", "Ljava/util/ArrayList;", "pendingDownNodes", "moveFrom", "moveTo", "Landroidx/compose/runtime/SlotReader;", "o", "()Landroidx/compose/runtime/SlotReader;", "reader", "r", "pastParent", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposerChangeListWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Stack.kt\nandroidx/compose/runtime/IntStack\n*L\n1#1,466:1\n4643#2,5:467\n4643#2,5:472\n4643#2,5:477\n4643#2,5:483\n82#3:482\n*S KotlinDebug\n*F\n+ 1 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n*L\n162#1:467,5\n251#1:472,5\n309#1:477,5\n448#1:483,5\n448#1:482\n*E\n"})
public final class ComposerChangeListWriter {
    public static final int ty = 8;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int writersReaderDelta;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private int pendingUps;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ComposerImpl composer;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private int moveCount;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private ChangeList changeList;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean startedGroup;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final IntStack startedGroups = new IntStack();

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean implicitRootStart = true;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private ArrayList pendingDownNodes = Stack.t(null, 1, null);

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private int removeFrom = -1;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private int moveFrom = -1;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private int moveTo = -1;

    private final void E2() {
        s7N(this, false, 1, null);
        v();
    }

    private final void az(Anchor anchor) {
        X(this, false, 1, null);
        this.changeList.r(anchor);
        this.startedGroup = true;
    }

    public final void GR(Object value, int groupSlotIndex) {
        e(true);
        this.changeList.wTp(value, groupSlotIndex);
    }

    public final void a(Object data) {
        X(this, false, 1, null);
        this.changeList.nHg(data);
    }

    public final void nr() {
        X(this, false, 1, null);
        this.changeList.gh();
    }

    public final void p5() {
        this.startedGroup = false;
        this.startedGroups.n();
        this.writersReaderDelta = 0;
    }

    private final void N() {
        int i2 = this.moveCount;
        if (i2 > 0) {
            int i3 = this.removeFrom;
            if (i3 >= 0) {
                wTp(i3, i2);
                this.removeFrom = -1;
            } else {
                T(this.moveTo, this.moveFrom, i2);
                this.moveFrom = -1;
                this.moveTo = -1;
            }
            this.moveCount = 0;
        }
    }

    static /* synthetic */ void X(ComposerChangeListWriter composerChangeListWriter, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        composerChangeListWriter.e(z2);
    }

    private final void fD() {
        int i2 = this.pendingUps;
        if (i2 > 0) {
            this.changeList.v(i2);
            this.pendingUps = 0;
        }
        if (Stack.KN(this.pendingDownNodes)) {
            this.changeList.az(Stack.az(this.pendingDownNodes));
            Stack.n(this.pendingDownNodes);
        }
    }

    private final void nHg(boolean forParent) {
        int parent = forParent ? o().getParent() : o().getCurrent();
        int i2 = parent - this.writersReaderDelta;
        if (!(i2 >= 0)) {
            ComposerKt.Z("Tried to seek backward");
        }
        if (i2 > 0) {
            this.changeList.Uo(i2);
            this.writersReaderDelta = parent;
        }
    }

    private final SlotReader o() {
        return this.composer.getReader();
    }

    static /* synthetic */ void s7N(ComposerChangeListWriter composerChangeListWriter, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        composerChangeListWriter.nHg(z2);
    }

    private final void ty() {
        if (this.startedGroup || !this.implicitRootStart) {
            return;
        }
        X(this, false, 1, null);
        this.changeList.o();
        this.startedGroup = true;
    }

    public final void B(RecomposeScopeImpl scope) {
        this.changeList.X(scope);
    }

    public final void D(Object value, Anchor anchor, int groupSlotIndex) {
        this.changeList.N(value, anchor, groupSlotIndex);
    }

    public final void E(boolean z2) {
        this.implicitRootStart = z2;
    }

    public final void FX() {
        this.changeList.e();
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final void J(int count) {
        if (count > 0) {
            E2();
            this.changeList.T(count);
        }
    }

    public final void J2(Function1 action, Composition composition) {
        this.changeList.ty(action, composition);
    }

    public final void KN() {
        this.changeList.ck();
        this.writersReaderDelta = 0;
    }

    public final void M(Function0 effect) {
        this.changeList.E2(effect);
    }

    public final void M7() {
        this.changeList.fD();
    }

    public final void P5(int nodeIndex, int count) {
        if (count > 0) {
            if (!(nodeIndex >= 0)) {
                ComposerKt.Z("Invalid remove index " + nodeIndex);
            }
            if (this.removeFrom == nodeIndex) {
                this.moveCount += count;
                return;
            }
            N();
            this.removeFrom = nodeIndex;
            this.moveCount = count;
        }
    }

    public final void ViF(int from, int to, int count) {
        if (count > 0) {
            int i2 = this.moveCount;
            if (i2 > 0 && this.moveFrom == from - i2 && this.moveTo == to - i2) {
                this.moveCount = i2 + count;
                return;
            }
            N();
            this.moveFrom = from;
            this.moveTo = to;
            this.moveCount = count;
        }
    }

    public final void Xw(RememberObserverHolder value) {
        this.changeList.nY(value);
    }

    public final void Z(ChangeList other, IntRef effectiveNodeIndex) {
        this.changeList.Z(other, effectiveNodeIndex);
    }

    public final void bzg(ControlledComposition composition, CompositionContext parentContext, MovableContentStateReference reference) {
        this.changeList.ViF(composition, parentContext, reference);
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final ChangeList getChangeList() {
        return this.changeList;
    }

    public final void eF(ChangeList changeList) {
        this.changeList = changeList;
    }

    public final void g(int location) {
        this.writersReaderDelta = location;
    }

    public final void gh(RecomposeScopeImpl scope) {
        this.changeList.Ik(scope);
    }

    public final void jB(RecomposeScopeImpl scope) {
        this.changeList.g(scope);
    }

    public final void n(Anchor anchor, Object value) {
        this.changeList.KN(anchor, value);
    }

    public final void nY(int location) {
        this.writersReaderDelta += location - o().getCurrent();
    }

    public final void qie() {
        if (this.startedGroup) {
            X(this, false, 1, null);
            X(this, false, 1, null);
            this.changeList.HI();
            this.startedGroup = false;
        }
    }

    public final void rl(List nodes, IntRef effectiveNodeIndex) {
        this.changeList.xMQ(nodes, effectiveNodeIndex);
    }

    public final void t(MovableContentState resolvedState, CompositionContext parentContext, MovableContentStateReference from, MovableContentStateReference to) {
        this.changeList.mUb(resolvedState, parentContext, from, to);
    }

    public ComposerChangeListWriter(ComposerImpl composerImpl, ChangeList changeList) {
        this.composer = composerImpl;
        this.changeList = changeList;
    }

    private final void T(int to, int from, int count) {
        iF();
        this.changeList.aYN(to, from, count);
    }

    private final void e(boolean useParentSlot) {
        nHg(useParentSlot);
    }

    private final void iF() {
        fD();
    }

    private final void wTp(int removeFrom, int moveCount) {
        iF();
        this.changeList.iF(removeFrom, moveCount);
    }

    public final void HI() {
        boolean z2;
        fD();
        if (this.startedGroups.tos == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            ComposerKt.Z("Missed recording an endGroup()");
        }
    }

    public final void I(Object value, Function2 block) {
        iF();
        this.changeList.s7N(value, block);
    }

    public final void Nxk(Object node) {
        iF();
        this.changeList.rV9(node);
    }

    public final void O(IntRef effectiveNodeIndexOut, Anchor anchor) {
        fD();
        this.changeList.qie(effectiveNodeIndexOut, anchor);
    }

    public final void S(Anchor anchor, SlotTable from, FixupList fixups) {
        fD();
        E2();
        N();
        this.changeList.S(anchor, from, fixups);
    }

    public final void U() {
        E2();
        this.changeList.te();
        this.writersReaderDelta += o().ck();
    }

    public final void Uo() {
        boolean z2;
        int parent = o().getParent();
        if (this.startedGroups.J2(-1) <= parent) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            ComposerKt.Z("Missed recording an endGroup");
        }
        if (this.startedGroups.J2(-1) == parent) {
            X(this, false, 1, null);
            this.startedGroups.Uo();
            this.changeList.HI();
        }
    }

    public final void WPU(int offset) {
        E2();
        this.changeList.WPU(offset);
    }

    public final void XQ(Anchor anchor, SlotTable from) {
        fD();
        E2();
        N();
        this.changeList.XQ(anchor, from);
    }

    public final void aYN(Object node) {
        N();
        Stack.qie(this.pendingDownNodes, node);
    }

    public final void mUb(int nodeIndex, int group) {
        int iRV9;
        xMQ();
        fD();
        if (o().nHg(group)) {
            iRV9 = 1;
        } else {
            iRV9 = o().rV9(group);
        }
        if (iRV9 > 0) {
            P5(nodeIndex, iRV9);
        }
    }

    public final boolean r() {
        if (o().getParent() - this.writersReaderDelta < 0) {
            return true;
        }
        return false;
    }

    public final void rV9() {
        fD();
        if (this.startedGroup) {
            FX();
            qie();
        }
    }

    public final void te() {
        N();
        if (Stack.KN(this.pendingDownNodes)) {
            Stack.gh(this.pendingDownNodes);
        } else {
            this.pendingUps++;
        }
    }

    public final void v() {
        SlotReader slotReaderO;
        int parent;
        if (o().getGroupsSize() > 0 && this.startedGroups.J2(-2) != (parent = (slotReaderO = o()).getParent())) {
            ty();
            if (parent > 0) {
                Anchor anchorN = slotReaderO.n(parent);
                this.startedGroups.KN(parent);
                az(anchorN);
            }
        }
    }

    public final void xMQ() {
        N();
    }
}
