package androidx.compose.ui.input.nestedscroll;

import GJW.vd;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.unit.Velocity;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\"\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u000eJ!\u0010 \u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b \u0010\bR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R$\u00100\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00106\u001a\u0002018\u0016X\u0096D¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0016\u00108\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u0010$R\u0014\u0010<\u001a\u0002098BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0016\u0010>\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/Modifier$Node;", "connection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "<init>", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "newDispatcher", "", "W1c", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", CmcdConfiguration.KEY_PLAYBACK_RATE, "()V", "poH", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "tEO", "(JI)J", "consumed", "F", "(JJI)J", "Landroidx/compose/ui/unit/Velocity;", "lS", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "z", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "Sax", "ni", "v", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setConnection", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "Xw", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "resolvedDispatcher", "jB", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "getLastKnownParentNode$ui_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "setLastKnownParentNode$ui_release", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;)V", "lastKnownParentNode", "", "U", "Ljava/lang/Object;", "Nxk", "()Ljava/lang/Object;", "traverseKey", "NC9", "parentConnection", "LGJW/vd;", "W5k", "()LGJW/vd;", "nestedCoroutineScope", "ex", "parentNestedScrollNode", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NestedScrollNode extends Modifier.Node implements TraversableNode, NestedScrollConnection {

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final Object traverseKey;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private NestedScrollDispatcher resolvedDispatcher;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private NestedScrollNode lastKnownParentNode;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private NestedScrollConnection connection;

    private final void poH() {
        if (this.resolvedDispatcher.getNestedScrollNode() == this) {
            this.resolvedDispatcher.gh(null);
        }
    }

    private final void pr() {
        this.resolvedDispatcher.gh(this);
        if (ComposeUiFlags.NewNestedScrollFlingDispatchingEnabled) {
            this.resolvedDispatcher.mUb(null);
            this.lastKnownParentNode = null;
        }
        this.resolvedDispatcher.xMQ(new Function0<vd>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNode$updateDispatcherFields$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final vd invoke() {
                return this.f32045n.W5k();
            }
        });
        this.resolvedDispatcher.qie(Xli());
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long F(long consumed, long available, int source) {
        long jF = this.connection.F(consumed, available, source);
        NestedScrollConnection nestedScrollConnectionNC9 = NC9();
        return Offset.Ik(jF, nestedScrollConnectionNC9 != null ? nestedScrollConnectionNC9.F(Offset.Ik(consumed, jF), Offset.ck(available, jF), source) : Offset.INSTANCE.t());
    }

    @Override // androidx.compose.ui.node.TraversableNode
    /* JADX INFO: renamed from: Nxk, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void Sax() {
        if (ComposeUiFlags.NewNestedScrollFlingDispatchingEnabled) {
            NestedScrollNode nestedScrollNode = (NestedScrollNode) NestedScrollNodeKt.rl(this);
            this.lastKnownParentNode = nestedScrollNode;
            this.resolvedDispatcher.mUb(nestedScrollNode);
        }
        poH();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r11 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object lS(long j2, Continuation continuation) {
        NestedScrollNode$onPreFling$1 nestedScrollNode$onPreFling$1;
        long jN;
        NestedScrollNode nestedScrollNode;
        long j3;
        if (continuation instanceof NestedScrollNode$onPreFling$1) {
            nestedScrollNode$onPreFling$1 = (NestedScrollNode$onPreFling$1) continuation;
            int i2 = nestedScrollNode$onPreFling$1.f32043r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nestedScrollNode$onPreFling$1.f32043r = i2 - Integer.MIN_VALUE;
            } else {
                nestedScrollNode$onPreFling$1 = new NestedScrollNode$onPreFling$1(this, continuation);
            }
        }
        Object objLS = nestedScrollNode$onPreFling$1.f32041O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nestedScrollNode$onPreFling$1.f32043r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objLS);
            NestedScrollConnection nestedScrollConnectionNC9 = NC9();
            if (nestedScrollConnectionNC9 != null) {
                nestedScrollNode$onPreFling$1.f32042n = this;
                nestedScrollNode$onPreFling$1.f32044t = j2;
                nestedScrollNode$onPreFling$1.f32043r = 1;
                objLS = nestedScrollConnectionNC9.lS(j2, nestedScrollNode$onPreFling$1);
                if (objLS != coroutine_suspended) {
                    nestedScrollNode = this;
                }
                return coroutine_suspended;
            }
            jN = Velocity.INSTANCE.n();
            nestedScrollNode = this;
            long j4 = jN;
            long j5 = j2;
            j3 = j4;
            NestedScrollConnection nestedScrollConnection = nestedScrollNode.connection;
            long jGh = Velocity.gh(j5, j3);
            nestedScrollNode$onPreFling$1.f32042n = null;
            nestedScrollNode$onPreFling$1.f32044t = j3;
            nestedScrollNode$onPreFling$1.f32043r = 2;
            objLS = nestedScrollConnection.lS(jGh, nestedScrollNode$onPreFling$1);
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = nestedScrollNode$onPreFling$1.f32044t;
                ResultKt.throwOnFailure(objLS);
                return Velocity.rl(Velocity.qie(j3, ((Velocity) objLS).getPackedValue()));
            }
            j2 = nestedScrollNode$onPreFling$1.f32044t;
            nestedScrollNode = (NestedScrollNode) nestedScrollNode$onPreFling$1.f32042n;
            ResultKt.throwOnFailure(objLS);
        }
        jN = ((Velocity) objLS).getPackedValue();
        long j42 = jN;
        long j52 = j2;
        j3 = j42;
        NestedScrollConnection nestedScrollConnection2 = nestedScrollNode.connection;
        long jGh2 = Velocity.gh(j52, j3);
        nestedScrollNode$onPreFling$1.f32042n = null;
        nestedScrollNode$onPreFling$1.f32044t = j3;
        nestedScrollNode$onPreFling$1.f32043r = 2;
        objLS = nestedScrollConnection2.lS(jGh2, nestedScrollNode$onPreFling$1);
    }

    public final void ni(NestedScrollConnection connection, NestedScrollDispatcher dispatcher) {
        this.connection = connection;
        W1c(dispatcher);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z(long j2, long j3, Continuation continuation) {
        NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$1;
        NestedScrollNode nestedScrollNode;
        long j4;
        long j5;
        long packedValue;
        long jN;
        long j6;
        if (continuation instanceof NestedScrollNode$onPostFling$1) {
            nestedScrollNode$onPostFling$1 = (NestedScrollNode$onPostFling$1) continuation;
            int i2 = nestedScrollNode$onPostFling$1.f32038o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nestedScrollNode$onPostFling$1.f32038o = i2 - Integer.MIN_VALUE;
            } else {
                nestedScrollNode$onPostFling$1 = new NestedScrollNode$onPostFling$1(this, continuation);
            }
        }
        NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$12 = nestedScrollNode$onPostFling$1;
        Object objZ = nestedScrollNode$onPostFling$12.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nestedScrollNode$onPostFling$12.f32038o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objZ);
            NestedScrollConnection nestedScrollConnection = this.connection;
            nestedScrollNode$onPostFling$12.f32037n = this;
            nestedScrollNode$onPostFling$12.f32040t = j2;
            nestedScrollNode$onPostFling$12.f32036O = j3;
            nestedScrollNode$onPostFling$12.f32038o = 1;
            objZ = nestedScrollConnection.z(j2, j3, nestedScrollNode$onPostFling$12);
            if (objZ != coroutine_suspended) {
                nestedScrollNode = this;
                j4 = j2;
                j5 = j3;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j6 = nestedScrollNode$onPostFling$12.f32040t;
            ResultKt.throwOnFailure(objZ);
            jN = ((Velocity) objZ).getPackedValue();
            packedValue = j6;
            return Velocity.rl(Velocity.qie(packedValue, jN));
        }
        j5 = nestedScrollNode$onPostFling$12.f32036O;
        j4 = nestedScrollNode$onPostFling$12.f32040t;
        nestedScrollNode = (NestedScrollNode) nestedScrollNode$onPostFling$12.f32037n;
        ResultKt.throwOnFailure(objZ);
        packedValue = ((Velocity) objZ).getPackedValue();
        NestedScrollConnection nestedScrollConnectionNC9 = (!ComposeUiFlags.NewNestedScrollFlingDispatchingEnabled || nestedScrollNode.getIsAttached()) ? nestedScrollNode.NC9() : nestedScrollNode.lastKnownParentNode;
        NestedScrollConnection nestedScrollConnection2 = nestedScrollConnectionNC9;
        if (nestedScrollConnection2 == null) {
            jN = Velocity.INSTANCE.n();
            return Velocity.rl(Velocity.qie(packedValue, jN));
        }
        long jQie = Velocity.qie(j4, packedValue);
        long jGh = Velocity.gh(j5, packedValue);
        nestedScrollNode$onPostFling$12.f32037n = null;
        nestedScrollNode$onPostFling$12.f32040t = packedValue;
        nestedScrollNode$onPostFling$12.f32038o = 2;
        objZ = nestedScrollConnection2.z(jQie, jGh, nestedScrollNode$onPostFling$12);
        if (objZ != coroutine_suspended) {
            j6 = packedValue;
            jN = ((Velocity) objZ).getPackedValue();
            packedValue = j6;
            return Velocity.rl(Velocity.qie(packedValue, jN));
        }
        return coroutine_suspended;
    }

    public NestedScrollNode(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        this.resolvedDispatcher = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.traverseKey = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    private final NestedScrollConnection NC9() {
        if (getIsAttached()) {
            return ex();
        }
        return null;
    }

    private final void W1c(NestedScrollDispatcher newDispatcher) {
        poH();
        if (newDispatcher == null) {
            this.resolvedDispatcher = new NestedScrollDispatcher();
        } else if (!Intrinsics.areEqual(newDispatcher, this.resolvedDispatcher)) {
            this.resolvedDispatcher = newDispatcher;
        }
        if (getIsAttached()) {
            pr();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vd W5k() {
        vd vdVarW5k;
        NestedScrollNode nestedScrollNodeEx = ex();
        if (nestedScrollNodeEx != null && (vdVarW5k = nestedScrollNodeEx.W5k()) != null) {
            return vdVarW5k;
        }
        vd vdVarKN = this.resolvedDispatcher.getScope();
        if (vdVarKN != null) {
            return vdVarKN;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void c() {
        pr();
    }

    public final NestedScrollNode ex() {
        if (getIsAttached()) {
            return (NestedScrollNode) TraversableNodeKt.rl(this);
        }
        return null;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long tEO(long available, int source) {
        long jT2;
        NestedScrollConnection nestedScrollConnectionNC9 = NC9();
        if (nestedScrollConnectionNC9 != null) {
            jT2 = nestedScrollConnectionNC9.tEO(available, source);
        } else {
            jT2 = Offset.INSTANCE.t();
        }
        return Offset.Ik(jT2, this.connection.tEO(Offset.ck(available, jT2), source));
    }
}
